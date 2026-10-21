package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AndroidLoggingService implements LoggingService {
    private static final String TAG = "AdobeExperienceSDK";

    @Override // com.adobe.marketing.mobile.LoggingService
    public void warning(String str, String str2) {
        android.util.Log.w(TAG, str + " - " + str2);
    }

    @Override // com.adobe.marketing.mobile.LoggingService
    public void debug(String str, String str2) {
    }

    @Override // com.adobe.marketing.mobile.LoggingService
    public void error(String str, String str2) {
    }

    @Override // com.adobe.marketing.mobile.LoggingService
    public void trace(String str, String str2) {
    }
}
