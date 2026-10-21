# BBVA México Android recovery

Recovered code and resources from `com.bancomer.mbanking` version **25.50.19**
(version code `374943640`). This is an older app snapshot, not the current release.
It is not a buildable copy of BBVA's original project.

## Files

- `decompiled/sources/`: 37,967 Java source files produced by JADX 1.5.6.
- `decompiled/resources/`: decoded base APK resources and bundled web assets.
- `endpoint-inventory.json`: 3,195 static entries across 159 hosts: 2,493 URL
  literals, 27 Retrofit paths, and 675 relative path candidates with their source
  locations. URLs include assets and third-party SDKs;
  their presence does not prove a reachable banking API.
- `evidence/package.json`: REA's package and manifest inspection.
- `evidence/provenance.json`: download, app metadata, hashes, tools and native-library inventory.
- `evidence/apk-signatures.json`: Google apksigner results for the base and ten split APKs.
- `evidence/jadx.log`: decompiler output. JADX exited with status 3 and reported
  1,038 errors. `evidence/incomplete-source-files.txt` identifies files containing
  failed-method or JADX error markers.
- `evidence/login-map.json`: login evidence and the remaining unknowns.

The download is an APKM ZIP bundle despite its server's `.apk` filename. Its SHA-256 is
`0b6a9f632da459adbf6257d1e9c7f0c99165c020f0f6fb84b8a339b32f9d0143`.
All eleven APKs pass signature verification and share certificate SHA-256
`0cf408f2b3893419b8f57fb78ed5f2338a91b58227e3f80685a5a6cbd1b9c0a0`.
The source URL is recorded in provenance. Native library implementations have not
been decompiled. Split APK hashes and their 64 native-library hashes are recorded.

## Run locally

Python 3.9+ runs the inventory and its tests:

```sh
python3 scripts/extract_endpoints.py decompiled -o endpoint-inventory.json
python3 -m unittest discover -s tests -v
```

REA is pinned in the npm lockfile. It needs Node 22.19+, 24.11+, or 26+ and a full JDK 17+:

```sh
npm ci --ignore-scripts
bash scripts/inspect.sh /absolute/path/to/base.apk
bash scripts/decompile.sh /absolute/path/to/base.apk
```

The current local checkout keeps the downloaded bundle, extracted APK set, and
portable tools in ignored `.local/`. A fresh clone needs its own APK and tools.
Set `JAVA_HOME`, `JADX_BIN`, and `REA_JADX_MCP_JAR` to those paths. The default
paths use the task's portable JDK, JADX 1.5.6, and REA's pinned JADX headless MCP
0.7.1 engine. Decompilation preserves a nonzero exit status when recovery fails.

## Login findings

The bundled production configuration declares
`https://glomo.bancomermovil.com` and
`/QSRV_A02/TechArchitecture/mx/grantingTicket/V02`.
Native code sends a POST with a granting-ticket JSON body, and uses the `tsec`
response header for subsequent session requests. The app wires Akamai sensor
data into the granting-ticket request; the sensor value comes from its runtime.

The credential mapper contains a failed-method reconstruction. Runtime sensor
data, account state, challenges, and device enrollment have not been observed.
No login request was sent and no account credentials were collected. This static
snapshot does not establish a working standalone login client or current API behavior.

Recovered application code retains its original ownership; this repository does
not grant a license to BBVA's code or assets.
