package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class AnalyticsModuleDetails implements ModuleDetails {
    private final String FRIENDLY_NAME = "Analytics";

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public Map<String, String> getAdditionalInfo() {
        return new HashMap();
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getName() {
        return "Analytics";
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getVersion() {
        return Analytics.extensionVersion();
    }
}
