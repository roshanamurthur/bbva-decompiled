package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.ServiceProvider;

/* JADX INFO: loaded from: classes2.dex */
class AndroidPlatformServices implements PlatformServices {
    private AndroidJsonUtility jsonUtilityService = new AndroidJsonUtility();
    private AndroidSystemInfoService systemInfoService = new AndroidSystemInfoService();
    private AndroidNetworkService networkService = new AndroidNetworkService(ServiceProvider.getInstance().getNetworkService());
    private AndroidLoggingService loggingService = new AndroidLoggingService();
    private AndroidDatabaseService databaseService = new AndroidDatabaseService(this.systemInfoService);
    private AndroidUIService uiService = new AndroidUIService();
    private AndroidLocalStorageService localStorageService = new AndroidLocalStorageService();
    private DeepLinkService deepLinkService = new AndroidDeepLinkService();
    private EncodingService encodingService = new AndroidEncodingService();
    private CompressedFileService compressedFileService = new AndroidCompressedFileService();

    @Override // com.adobe.marketing.mobile.PlatformServices
    public CompressedFileService getCompressedFileService() {
        return this.compressedFileService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public DatabaseService getDatabaseService() {
        return this.databaseService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public DeepLinkService getDeepLinkService() {
        return this.deepLinkService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public EncodingService getEncodingService() {
        return this.encodingService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public JsonUtilityService getJsonUtilityService() {
        return this.jsonUtilityService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public LocalStorageService getLocalStorageService() {
        return this.localStorageService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public LoggingService getLoggingService() {
        return this.loggingService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public NetworkService getNetworkService() {
        return this.networkService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public SystemInfoService getSystemInfoService() {
        return this.systemInfoService;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public SystemNotificationService getSystemNotificationService() {
        return null;
    }

    @Override // com.adobe.marketing.mobile.PlatformServices
    public UIService getUIService() {
        return this.uiService;
    }
}
