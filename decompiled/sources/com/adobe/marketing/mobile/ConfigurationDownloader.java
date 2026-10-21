package com.adobe.marketing.mobile;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationDownloader extends RemoteDownloader {
    private String url;

    public ConfigurationDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str) throws MissingPlatformServicesException {
        super(networkService, systemInfoService, str, (String) null);
        this.url = str;
    }

    public String downloadConfig() {
        File fileStartDownloadSync = super.startDownloadSync();
        if (fileStartDownloadSync != null) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Downloaded config file", new Object[0]);
            return FileUtil.readStringFromFile(fileStartDownloadSync);
        }
        Log.debug(ConfigurationExtension.LOG_SOURCE, "Problem while downloading config.", new Object[0]);
        return null;
    }

    public String loadCachedConfig() {
        File fileForCachedURL = this.cacheManager.getFileForCachedURL(this.url, null, false);
        if (fileForCachedURL != null) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Loaded cached config file", new Object[0]);
            return FileUtil.readStringFromFile(fileForCachedURL);
        }
        Log.debug(ConfigurationExtension.LOG_SOURCE, "Either there was no cached config, or there was a problem loading the cached config.", new Object[0]);
        return null;
    }
}
