#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."
export JAVA_HOME="${JAVA_HOME:-$PWD/.local/tooling/jdk-21.0.12.1+1/Contents/Home}"
export JADX_CONFIG_DIR="$PWD/.local/jadx-config"
export JADX_CACHE_DIR="$PWD/.local/jadx-cache"
export REA_JADX_MCP_JAR="${REA_JADX_MCP_JAR:-$PWD/.local/tooling/jadx-headless-mcp-0.7.1-all.jar}"
export REA_DARWIN_MODULE_CACHE_PATH="$PWD/.local/swift-module-cache"
rea_bin="${REA_BIN:-$PWD/node_modules/.bin/rea}"
apk="${1:-$PWD/.local/artifacts/bbva-mexico-25.50.19/base.apk}"
mkdir -p evidence
"$rea_bin" inspect-android-package "$apk" --format json > evidence/package.json
