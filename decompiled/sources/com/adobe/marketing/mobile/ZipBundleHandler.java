package com.adobe.marketing.mobile;

import androidx.collection.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class ZipBundleHandler implements RulesRemoteDownloader.RulesBundleNetworkProtocolHandler {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static final String LOG_TAG = "ZipBundleHandler";
    private static final String META_FILE_NAME = "meta.txt";
    private CompressedFileService compressedFileService;

    public static class ZipMetadata implements RulesRemoteDownloader.Metadata {
        private static final String REGEX = "\\|";
        private static final String SEPARATOR = "|";
        private long lastModifiedDate;
        private long size;

        public static ZipMetadata getMetadataFromString(String str) {
            ZipMetadata zipMetadata = null;
            if (str == null) {
                return null;
            }
            String[] strArrSplit = str.split(REGEX);
            try {
                if (strArrSplit.length >= 2) {
                    ZipMetadata zipMetadata2 = new ZipMetadata();
                    zipMetadata2.setLastModifiedDate(Long.parseLong(strArrSplit[0]));
                    zipMetadata2.setSize(Long.parseLong(strArrSplit[1]));
                    zipMetadata = zipMetadata2;
                } else {
                    Log.trace(ZipBundleHandler.LOG_TAG, "Could not de-serialize metadata!", new Object[0]);
                }
            } catch (NumberFormatException e5) {
                Log.warning(ZipBundleHandler.LOG_TAG, "Could not read metadata for rules json (%s)", e5);
            }
            return zipMetadata;
        }

        @Override // com.adobe.marketing.mobile.RulesRemoteDownloader.Metadata
        public long getLastModifiedDate() {
            return this.lastModifiedDate;
        }

        @Override // com.adobe.marketing.mobile.RulesRemoteDownloader.Metadata
        public long getSize() {
            return this.size;
        }

        public void setLastModifiedDate(long j10) {
            this.lastModifiedDate = j10;
        }

        public void setSize(long j10) {
            this.size = j10;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.lastModifiedDate);
            sb2.append("|");
            return h.d(sb2, this.size, "|");
        }
    }

    public ZipBundleHandler(CompressedFileService compressedFileService) throws MissingPlatformServicesException {
        if (compressedFileService == null) {
            throw new MissingPlatformServicesException("Rules Engine needs zip support for downloading rules!");
        }
        this.compressedFileService = compressedFileService;
    }

    private void createMetadata(String str, long j10, long j11) throws Throwable {
        File file = new File(str, META_FILE_NAME);
        ZipMetadata zipMetadata = new ZipMetadata();
        zipMetadata.setSize(j10);
        zipMetadata.setLastModifiedDate(j11);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(zipMetadata.toString().getBytes("UTF-8"));
                try {
                    fileOutputStream2.close();
                } catch (Exception unused) {
                    Log.trace(LOG_TAG, "Failed to close the stream for %s", file);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused2) {
                        Log.trace(LOG_TAG, "Failed to close the stream for %s", file);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.adobe.marketing.mobile.RulesRemoteDownloader.RulesBundleNetworkProtocolHandler
    public RulesRemoteDownloader.Metadata getMetadata(File file) {
        return ZipMetadata.getMetadataFromString(FileUtil.readStringFromFile(new File(file, META_FILE_NAME)));
    }

    @Override // com.adobe.marketing.mobile.RulesRemoteDownloader.RulesBundleNetworkProtocolHandler
    public boolean processDownloadedBundle(File file, String str, long j10) throws Throwable {
        if (file == null || str == null) {
            return false;
        }
        boolean zExtract = this.compressedFileService.extract(file, CompressedFileService.FileType.ZIP, str);
        if (zExtract) {
            try {
                createMetadata(str, file.length(), j10);
            } catch (IOException e5) {
                Log.trace(LOG_TAG, "Could not create metadata for the downloaded rules [%s]", e5);
            }
        }
        if (!file.delete()) {
            Log.debug(LOG_TAG, "Unable to delete the zip bundle : %s", file.getName());
        }
        return zExtract;
    }
}
