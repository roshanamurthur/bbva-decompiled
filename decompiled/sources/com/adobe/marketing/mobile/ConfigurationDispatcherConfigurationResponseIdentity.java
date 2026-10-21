package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationDispatcherConfigurationResponseIdentity extends ModuleEventDispatcher<ConfigurationExtension> {
    public ConfigurationDispatcherConfigurationResponseIdentity(EventHub eventHub, ConfigurationExtension configurationExtension) {
        super(eventHub, configurationExtension);
    }

    public void dispatchAllIdentities(String str, String str2) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Configuration.CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS, str);
        super.dispatch(new Event.Builder("Configuration Response Identity", EventType.CONFIGURATION, EventSource.RESPONSE_IDENTITY).setData(eventData).setPairID(str2).build());
    }
}
