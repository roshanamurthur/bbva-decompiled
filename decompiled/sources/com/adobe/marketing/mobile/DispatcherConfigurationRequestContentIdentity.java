package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class DispatcherConfigurationRequestContentIdentity extends ModuleEventDispatcher<IdentityExtension> {
    public DispatcherConfigurationRequestContentIdentity(EventHub eventHub, IdentityExtension identityExtension) {
        super(eventHub, identityExtension);
    }

    public void dispatchConfigUpdateRequest(EventData eventData) {
        Event eventBuild = new Event.Builder("Configuration Update From IdentityExtension", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build();
        dispatch(eventBuild);
        Log.trace("IdentityExtension", "dispatchConfigUpdateRequest : Configuration Update event has been added to event hub : %s", eventBuild);
    }
}
