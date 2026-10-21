package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsVersionProvider {
    private static final String FALLBACK_VERSION = "unknown";
    private static String analyticsVersion;

    private AnalyticsVersionProvider() {
    }

    public static String getVersion() {
        return !StringUtils.isNullOrEmpty(analyticsVersion) ? analyticsVersion : "unknown";
    }

    public static void setVersion(String str) {
        analyticsVersion = str;
    }
}
