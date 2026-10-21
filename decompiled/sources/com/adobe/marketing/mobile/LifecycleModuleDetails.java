package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleModuleDetails implements ModuleDetails {
    private final String FRIENDLY_NAME = "Lifecycle";

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public Map<String, String> getAdditionalInfo() {
        return new HashMap();
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getName() {
        return "Lifecycle";
    }

    @Override // com.adobe.marketing.mobile.ModuleDetails
    public String getVersion() {
        return Lifecycle.extensionVersion();
    }
}
