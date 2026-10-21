package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationListenerRequestContent extends ModuleEventListener<ConfigurationExtension> {
    public ConfigurationListenerRequestContent(ConfigurationExtension configurationExtension, EventType eventType, EventSource eventSource) {
        super(configurationExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        ((ConfigurationExtension) this.parentModule).handleEvent(event);
    }
}
