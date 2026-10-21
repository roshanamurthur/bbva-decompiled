#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."
export JAVA_HOME="${JAVA_HOME:-$PWD/.local/tooling/jdk-21.0.12.1+1/Contents/Home}"
export JADX_CONFIG_DIR="$PWD/.local/jadx-config"
export JADX_CACHE_DIR="$PWD/.local/jadx-cache"
export JADX_OPTS="${JADX_OPTS:--Xmx6g}"
jadx_bin="${JADX_BIN:-$PWD/.local/tooling/jadx-1.5.6/bin/jadx}"
apk="${1:-$PWD/.local/artifacts/bbva-mexico-25.50.19/base.apk}"
mkdir -p evidence
set +e
"$jadx_bin" -j 4 -d decompiled "$apk" > evidence/jadx.log 2>&1
status=$?
set -e
printf '%s\n' "$status" > evidence/jadx-exit-code.txt
exit "$status"
