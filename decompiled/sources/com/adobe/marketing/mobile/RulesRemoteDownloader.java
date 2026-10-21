package com.adobe.marketing.mobile;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class RulesRemoteDownloader extends RemoteDownloader {
    private static final String LOG_TAG = RulesBundleNetworkProtocolHandler.class.getSimpleName();
    private RulesBundleNetworkProtocolHandler protocolHandler;

    public interface Metadata {
        long getLastModifiedDate();

        long getSize();
    }

    public interface RulesBundleNetworkProtocolHandler {
        Metadata getMetadata(File file);

        boolean processDownloadedBundle(File file, String str, long j10);
    }

    public RulesRemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, CompressedFileService compressedFileService, String str, String str2) throws MissingPlatformServicesException {
        super(networkService, systemInfoService, str, str2);
        try {
            this.protocolHandler = new ZipBundleHandler(compressedFileService);
        } catch (MissingPlatformServicesException e5) {
            Log.trace(LOG_TAG, "Will not be using Zip Protocol to download rules (%s)", e5);
        }
    }

    public File getCachedRulesFile() {
        return this.cacheManager.getFileForCachedURL(this.url, this.directory, false);
    }

    @Override // com.adobe.marketing.mobile.RemoteDownloader
    public HashMap<String, String> getRequestParameters(File file) {
        RulesBundleNetworkProtocolHandler rulesBundleNetworkProtocolHandler;
        Metadata metadata;
        HashMap<String, String> map = new HashMap<>();
        if (file != null && (rulesBundleNetworkProtocolHandler = this.protocolHandler) != null && (metadata = rulesBundleNetworkProtocolHandler.getMetadata(file)) != null) {
            Long lValueOf = Long.valueOf(metadata.getLastModifiedDate());
            if (lValueOf.longValue() != 0) {
                String str = createRFC2822Formatter().format(lValueOf);
                map.put("If-Modified-Since", str);
                map.put("If-Range", str);
            }
            map.put("Range", String.format(Locale.US, "bytes=%d-", Long.valueOf(metadata.getSize())));
        }
        return map;
    }

    public File processBundle(File file) {
        Log.trace(ConfigurationExtension.LOG_SOURCE, "Processing downloaded rules bundle", new Object[0]);
        if (file == null) {
            return null;
        }
        if (file.isDirectory()) {
            return file;
        }
        CacheManager cacheManager = this.cacheManager;
        Long lValueOf = Long.valueOf(cacheManager != null ? cacheManager.getLastModifiedOfFile(file.getPath()) : 0L);
        CacheManager cacheManager2 = this.cacheManager;
        String baseFilePath = cacheManager2 != null ? cacheManager2.getBaseFilePath(this.url, this.directory) : null;
        if (baseFilePath == null || !this.protocolHandler.processDownloadedBundle(file, baseFilePath, lValueOf.longValue())) {
            return null;
        }
        return new File(baseFilePath);
    }

    public void setRulesBundleProtocolHandler(RulesBundleNetworkProtocolHandler rulesBundleNetworkProtocolHandler) {
        this.protocolHandler = rulesBundleNetworkProtocolHandler;
    }

    @Override // com.adobe.marketing.mobile.RemoteDownloader
    public File startDownloadSync() {
        Log.trace(ConfigurationExtension.LOG_SOURCE, "Start download of rules bundle file", new Object[0]);
        File fileStartDownloadSync = super.startDownloadSync();
        File fileProcessBundle = (fileStartDownloadSync == null || this.protocolHandler == null) ? null : processBundle(fileStartDownloadSync);
        if (fileProcessBundle == null) {
            this.cacheManager.deleteCachedDataForURL(this.url, this.directory);
        }
        return fileProcessBundle;
    }

    public RulesRemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, CacheManager cacheManager) throws MissingPlatformServicesException {
        super(networkService, systemInfoService, str, cacheManager);
    }
}
