package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationDispatcherConfigurationResponseContent extends ModuleEventDispatcher<ConfigurationExtension> {
    public ConfigurationDispatcherConfigurationResponseContent(EventHub eventHub, ConfigurationExtension configurationExtension) {
        super(eventHub, configurationExtension);
    }

    public void dispatchConfigResponseWithEventData(EventData eventData, String str) {
        super.dispatch(new Event.Builder("Configuration Response Event", EventType.CONFIGURATION, EventSource.RESPONSE_CONTENT).setData(eventData).setPairID(str).build());
    }
}
