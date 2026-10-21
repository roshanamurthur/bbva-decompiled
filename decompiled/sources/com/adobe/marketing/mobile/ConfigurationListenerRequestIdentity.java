package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationListenerRequestIdentity extends ModuleEventListener<ConfigurationExtension> {
    public ConfigurationListenerRequestIdentity(ConfigurationExtension configurationExtension, EventType eventType, EventSource eventSource) {
        super(configurationExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        ((ConfigurationExtension) this.parentModule).handleGetSdkIdentitiesEvent(event);
    }

    @Override // com.adobe.marketing.mobile.ModuleEventListener, com.adobe.marketing.mobile.EventListener
    public /* bridge */ /* synthetic */ void onUnregistered() {
        super.onUnregistered();
    }
}
