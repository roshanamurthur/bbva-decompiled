package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationListenerBootEvent extends ModuleEventListener<ConfigurationExtension> {
    public ConfigurationListenerBootEvent(ConfigurationExtension configurationExtension, EventType eventType, EventSource eventSource) {
        super(configurationExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        ((ConfigurationExtension) this.parentModule).handleBootEvent(event);
    }
}
