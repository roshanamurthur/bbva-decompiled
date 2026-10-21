import importlib.util
import json
import subprocess
import sys
import tempfile
import unittest
from pathlib import Path


SCRIPT = Path(__file__).resolve().parents[1] / "scripts" / "extract_endpoints.py"
SPEC = importlib.util.spec_from_file_location("extract_endpoints", SCRIPT)
MODULE = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(MODULE)


class EndpointInventoryTest(unittest.TestCase):
    def test_evidence_methods_and_uncertainty(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root / "Api.java").write_text('''import retrofit2.http.GET;
import retrofit2.http.HTTP;
class Api {
  @GET("v1/accounts/{id}") Object accounts();
  @HTTP(method = "DELETE", path = "/v1/session") Object logout();
  String baseUrl = "https://api.example.invalid/";
  String duplicate = "https://api.example.invalid/";
  String apiPath = BASE + "/v1/login";
  String image = "/images/logo.png";
  String unrelated = "/something";
  // @GET("/comment") https://comment.invalid/
  String fake = "@GET(\\"/not-an-annotation\\")";
}
''', encoding="utf-8")
            (root / "client.js").write_text('''fetch("/v2/accounts");
const config = {"url": "auth/session"};
const ignored = "/unrelated";
const encoded = "https:\\/\\/api.example.invalid/v2";
''', encoding="utf-8")
            (root / "strings.xml").write_text('<resources><string name="api">https://xml.example.invalid/?a=1&amp;b=2</string></resources>', encoding="utf-8")
            inventory = MODULE.extract_directory(root)
            entries = {(entry["kind"], entry["value"]): entry for entry in inventory["endpoints"]}
            self.assertEqual(entries[("retrofit_path", "v1/accounts/{id}")]["method"], "GET")
            self.assertEqual(entries[("retrofit_path", "/v1/session")]["method"], "DELETE")
            self.assertEqual(entries[("relative_path_candidate", "/v1/login")]["method"], None)
            self.assertIn(("relative_path_candidate", "/v2/accounts"), entries)
            self.assertIn(("relative_path_candidate", "auth/session"), entries)
            absolute = entries[("absolute_url", "https://api.example.invalid/")]
            self.assertEqual(absolute["host"], "api.example.invalid")
            self.assertEqual([evidence["line"] for evidence in absolute["evidence"]], [6, 7])
            self.assertIn(("absolute_url", "https://api.example.invalid/v2"), entries)
            self.assertIn(("absolute_url", "https://xml.example.invalid/?a=1&b=2"), entries)
            values = {entry["value"] for entry in inventory["endpoints"]}
            self.assertTrue(values.isdisjoint({"/images/logo.png", "/something", "/unrelated", "/comment", "/not-an-annotation", "https://comment.invalid/"}))
            self.assertNotIn("https://api.example.invalid/v1/login", values)
            self.assertEqual(inventory, MODULE.extract_directory(root))

    def test_annotation_requires_retrofit_import_and_literal_expression(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root / "Other.java").write_text('@GET("/unproven") Object x();\n@retrofit2.http.POST("/actual") Object y();\n@retrofit2.http.GET("/part" + suffix) Object z();', encoding="utf-8")
            routes = [entry for entry in MODULE.extract_directory(root)["endpoints"] if entry["kind"] == "retrofit_path"]
            self.assertEqual([(route["method"], route["value"]) for route in routes], [("POST", "/actual")])

    def test_repeated_urls_in_one_literal_keep_both_occurrences(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root / "strings.xml").write_text('<string name="message">"https://same.invalid/ and https://same.invalid/"</string>', encoding="utf-8")
            entries = MODULE.extract_directory(root)["endpoints"]
            self.assertEqual(len(entries), 1)
            evidence = entries[0]["evidence"]
            self.assertEqual(len(evidence), 2)
            self.assertLess(evidence[0]["column"], evidence[1]["column"])

    def test_nested_json_path_maps_preserve_pointer_and_occurrence(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root / "global.json").write_text('''{
  "api": {
    "host": {"default": "https://api.example.invalid"},
    "paths": {"default": {"login": "/QSRV_A02/TechArchitecture/mx/grantingTicket/V02"}},
    "path": {"first": "/reused", "nested": [{"a/b~c": "/reused"}]}
  },
  "unrelated": "/reused"
}''', encoding="utf-8")
            inventory = MODULE.extract_directory(root)
            entries = {(entry["kind"], entry["value"]): entry for entry in inventory["endpoints"]}
            login = entries[("relative_path_candidate", "/QSRV_A02/TechArchitecture/mx/grantingTicket/V02")]
            self.assertIsNone(login["method"])
            self.assertEqual(login["evidence"], [{"file": "global.json", "line": 4, "column": 36, "discovery": "json_path_configuration", "json_pointer": "/api/paths/default/login"}])
            repeated = entries[("relative_path_candidate", "/reused")]["evidence"]
            self.assertEqual([item["json_pointer"] for item in repeated], ["/api/path/first", "/api/path/nested/0/a~1b~0c"])
            self.assertLess(repeated[0]["column"], repeated[1]["column"])
            self.assertIn(("absolute_url", "https://api.example.invalid"), entries)
            self.assertNotIn(("absolute_url", "https://api.example.invalid/QSRV_A02/TechArchitecture/mx/grantingTicket/V02"), entries)

    def test_cli_writes_json_and_missing_input_fails(self):
        with tempfile.TemporaryDirectory() as directory:
            root = Path(directory)
            (root / "app.properties").write_text("api=https://config.example.invalid/v1", encoding="utf-8")
            output = root / "inventory.json"
            result = subprocess.run([sys.executable, str(SCRIPT), str(root), "-o", str(output)], capture_output=True, text=True)
            self.assertEqual(result.returncode, 0, result.stderr)
            self.assertEqual(json.loads(output.read_text())["hosts"][0]["host"], "config.example.invalid")
            failure = subprocess.run([sys.executable, str(SCRIPT), str(root / "missing")], capture_output=True, text=True)
            self.assertNotEqual(failure.returncode, 0)
            self.assertIn("Not a directory", failure.stderr)


if __name__ == "__main__":
    unittest.main()
