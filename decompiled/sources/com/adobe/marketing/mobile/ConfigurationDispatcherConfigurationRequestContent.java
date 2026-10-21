package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationDispatcherConfigurationRequestContent extends ModuleEventDispatcher<ConfigurationExtension> {
    public ConfigurationDispatcherConfigurationRequestContent(EventHub eventHub, ConfigurationExtension configurationExtension) {
        super(eventHub, configurationExtension);
    }

    public void dispatchInternalConfigureWithAppIdEvent(String str) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID, str);
        eventData.putBoolean("config.isinternalevent", true);
        super.dispatch(new Event.Builder("Configure with AppID Internal", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }
}
