package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ConfigurationModuleDetails implements ModuleDetails {
    private final String version;

    public ConfigurationModuleDetails(String str) {
        this.version = str;
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public Map<String, String> getAdditionalInfo() {
        return new HashMap();
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getName() {
        return "Configuration";
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getVersion() {
        return this.version;
    }
}
