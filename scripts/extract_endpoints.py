#!/usr/bin/env python3
"""Inventory URL literals and evidenced API path candidates without contacting them."""

import argparse
import bisect
import html
import json
import re
from pathlib import Path
from urllib.parse import urlsplit


SOURCE_SUFFIXES = {
    ".java", ".kt", ".kts", ".smali", ".xml", ".json", ".js", ".jsx",
    ".ts", ".tsx", ".html", ".htm", ".properties", ".txt", ".yaml", ".yml",
}
CODE_SUFFIXES = {".java", ".kt", ".kts", ".js", ".jsx", ".ts", ".tsx"}
STRING = r'"(?:\\.|[^"\\])*"|\'(?:\\.|[^\'\\])*\''
URL = re.compile(r"https?://[^\s\"'<>\\`]+", re.IGNORECASE)
ANNOTATION = re.compile(r"@(?P<prefix>retrofit2\.http\.)?(?P<verb>GET|POST|PUT|PATCH|DELETE|HEAD|OPTIONS|HTTP)\s*\(")
ASSET = re.compile(r"\.(?:png|jpe?g|gif|webp|svg|css|js|html?|woff2?|ttf|mp[34]|wav|pdf)(?:[?#]|$)", re.IGNORECASE)


def decode_literal(raw):
    escapes = {"n": "\n", "r": "\r", "t": "\t", "b": "\b", "f": "\f", '"': '"', "'": "'", "\\": "\\", "/": "/"}

    def replace(match):
        value = match.group(1)
        if value.startswith(("u", "x")):
            return chr(int(value[1:], 16))
        return escapes[value]

    return re.sub(r"\\(u[0-9a-fA-F]{4}|x[0-9a-fA-F]{2}|[nrtbf\"'\\/])", replace, raw[1:-1])


def tokenize(text, suffix):
    comments = r"<!--[\s\S]*?-->"
    if suffix in CODE_SUFFIXES:
        comments += r"|//[^\n]*|/\*[\s\S]*?\*/"
    if suffix == ".smali":
        comments += r"|\#[^\n]*"
    pattern = re.compile(f"{STRING}|{comments}")
    structure = list(text)
    literals = []
    for match in pattern.finditer(text):
        raw = match.group()
        if raw.startswith(('"', "'")):
            literals.append((match.start(), match.end(), decode_literal(raw)))
        for index in range(match.start(), match.end()):
            if text[index] != "\n":
                structure[index] = " "
    return "".join(structure), literals


def relative_candidate(value):
    return bool(
        value
        and not re.search(r"\s|\\", value)
        and not re.match(r"[a-zA-Z][a-zA-Z0-9+.-]*:", value)
        and not value.startswith(("//", "../", "/data/", "/storage/", "/sdcard/", "/system/", "/proc/", "/dev/", "/res/", "/assets/"))
        and re.fullmatch(r"[A-Za-z0-9_~!$&()*+,;=:@%./?{}\[\]-]+", value)
        and not ASSET.search(value)
    )


def named_endpoint(name):
    compact = name.lower().replace("_", "")
    return compact.endswith(("url", "uri")) or any(part in compact for part in ("endpoint", "apipath", "apiroute"))


class JsonObject(list):
    """Retain JSON object members in source order, including duplicate keys."""


def json_path_values(text, literals):
    try:
        document = json.loads(text, object_pairs_hook=JsonObject)
    except json.JSONDecodeError:
        return []
    tokens = iter(literals)
    paths = []

    def walk(value, pointer, under_paths):
        if isinstance(value, JsonObject):
            for key, child in value:
                next(tokens)
                member = key.replace("~", "~0").replace("/", "~1")
                walk(child, f"{pointer}/{member}", under_paths or key.lower() in {"path", "paths"})
        elif isinstance(value, list):
            for index, child in enumerate(value):
                walk(child, f"{pointer}/{index}", under_paths)
        elif isinstance(value, str):
            token = next(tokens)
            if under_paths and relative_candidate(value):
                paths.append((value, token[0], pointer))

    walk(document, "", False)
    return paths


def extract_directory(root):
    root = Path(root)
    if not root.is_dir():
        raise ValueError(f"Not a directory: {root}")
    found = {}
    skipped = []
    scanned = 0

    for path in sorted(root.rglob("*")):
        if not path.is_file() or path.suffix.lower() not in SOURCE_SUFFIXES:
            continue
        relative = path.relative_to(root).as_posix()
        data = path.read_bytes()
        try:
            text = data.decode("utf-8-sig")
        except UnicodeDecodeError:
            skipped.append({"file": relative, "reason": "not_utf8"})
            continue
        if "\x00" in text:
            skipped.append({"file": relative, "reason": "binary_content"})
            continue
        scanned += 1
        newlines = [index for index, char in enumerate(text) if char == "\n"]
        structure, literals = tokenize(text, path.suffix.lower())

        def add(kind, value, offset, discovery, method=None, literal_offset=None, json_pointer=None):
            key = (kind, value, method or "")
            entry = found.setdefault(key, {"kind": kind, "value": value, "method": method, "evidence": []})
            if kind == "absolute_url":
                try:
                    entry["host"] = urlsplit(value).hostname
                except ValueError:
                    entry["host"] = None
            line_index = bisect.bisect_left(newlines, offset)
            line_start = newlines[line_index - 1] + 1 if line_index else 0
            evidence = {"file": relative, "line": line_index + 1, "column": offset - line_start + 1, "discovery": discovery}
            if literal_offset is not None:
                evidence["decoded_literal_offset"] = literal_offset
            if json_pointer is not None:
                evidence["json_pointer"] = json_pointer
            if evidence not in entry["evidence"]:
                entry["evidence"].append(evidence)

        if path.suffix.lower() == ".json":
            for value, offset, pointer in json_path_values(text, literals):
                add("relative_path_candidate", value, offset, "json_path_configuration", json_pointer=pointer)

        imports = set(re.findall(r"\bimport\s+retrofit2\.http\.(\*|\w+)", structure))
        annotated = set()
        for match in ANNOTATION.finditer(structure):
            verb = match.group("verb")
            if not match.group("prefix") and verb not in imports and "*" not in imports:
                continue
            end = structure.find(")", match.end())
            if end < 0:
                continue
            arguments = [token for token in literals if match.end() <= token[0] < end]
            if verb != "HTTP":
                if len(arguments) != 1 or not re.fullmatch(r"\s*(?:value\s*=\s*)?", structure[match.end():end]):
                    continue
                token = arguments[0]
                add("retrofit_path", token[2], token[0], "retrofit_annotation", verb)
                annotated.add(token[0])
            else:
                fields = {}
                for token in arguments:
                    prefix = structure[match.end():token[0]].rsplit(",", 1)[-1]
                    field = re.fullmatch(r"\s*(method|path)\s*=\s*", prefix)
                    suffix = structure[token[1]:end].split(",", 1)[0]
                    if field and not suffix.strip():
                        fields[field.group(1)] = token
                if "method" in fields and "path" in fields:
                    token = fields["path"]
                    add("retrofit_path", token[2], token[0], "retrofit_http_annotation", fields["method"][2])
                    annotated.add(token[0])

        for index, token in enumerate(literals):
            start, end, value = token
            raw_cursor = start + 1
            for match in URL.finditer(value):
                raw_offset = text.find(match.group(), raw_cursor, end)
                if raw_offset >= 0:
                    raw_cursor = raw_offset + len(match.group())
                add("absolute_url", html.unescape(match.group()), raw_offset if raw_offset >= 0 else start, "string_literal", literal_offset=match.start())
            if start in annotated or not relative_candidate(value):
                continue
            prefix = text[max(0, start - 180):start]
            assignment = re.search(r"([\w$]+)\s*(?:=|:)\s*(?:[\w$.]+\s*\+\s*)?$", prefix)
            property_name = None
            if index:
                previous = literals[index - 1]
                if re.fullmatch(r"\s*:\s*", text[previous[1]:start]):
                    property_name = previous[2]
            if (assignment and named_endpoint(assignment.group(1))) or (property_name and named_endpoint(property_name)):
                add("relative_path_candidate", value, start, "endpoint_named_value")
            elif re.search(r"(?:\bfetch|\baxios(?:\.(?:get|post|put|patch|delete|head|options|request))?|\b(?:http|https|httpClient|apiClient|client)\.(?:get|post|put|patch|delete|head|options|request))\s*\(\s*$", prefix, re.IGNORECASE):
                add("relative_path_candidate", value, start, "request_call_argument")
        for match in URL.finditer(structure):
            add("absolute_url", html.unescape(match.group()), match.start(), "unquoted_text")

    endpoints = [found[key] for key in sorted(found)]
    hosts = {}
    for entry in endpoints:
        entry["evidence"].sort(key=lambda item: (item["file"], item["line"], item["column"], item["discovery"]))
        host = entry.get("host")
        if host:
            hosts.setdefault(host, []).append(entry["value"])
    return {
        "schema_version": 1,
        "coverage": {
            "basis": "Static text only; URLs may be assets, telemetry or unused code. Relative paths are candidates, not verified endpoints.",
            "limitations": "No requests sent, execution, base URL joins, dynamic string reconstruction, or proof of route reachability. Obfuscated annotations and computed paths may be missed.",
            "json_path_candidates": "Strings under JSON path/paths ancestors are configuration-declared candidates. They may be local routes, templates, or unused paths; HTTP methods and matching hosts are unknown.",
            "suffixes": sorted(SOURCE_SUFFIXES),
            "files_scanned": scanned,
            "skipped_files": skipped,
        },
        "hosts": [{"host": host, "urls": sorted(set(hosts[host]))} for host in sorted(hosts)],
        "endpoints": endpoints,
    }


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("source_directory", type=Path)
    parser.add_argument("--output", "-o", type=Path, help="Write JSON here; default is stdout")
    args = parser.parse_args()
    try:
        inventory = extract_directory(args.source_directory)
        output = json.dumps(inventory, ensure_ascii=True, indent=2) + "\n"
        if args.output:
            args.output.write_text(output, encoding="utf-8")
        else:
            print(output, end="")
    except (OSError, ValueError) as error:
        parser.exit(1, f"error: {error}\n")


if __name__ == "__main__":
    main()
