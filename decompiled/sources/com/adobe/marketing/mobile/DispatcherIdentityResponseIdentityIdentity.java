package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class DispatcherIdentityResponseIdentityIdentity extends ModuleEventDispatcher<IdentityExtension> {
    public DispatcherIdentityResponseIdentityIdentity(EventHub eventHub, IdentityExtension identityExtension) {
        super(eventHub, identityExtension);
    }

    public void dispatchResponse(String str, EventData eventData, String str2) {
        Event eventBuild = new Event.Builder(str, EventType.IDENTITY, EventSource.RESPONSE_IDENTITY).setData(eventData).setPairID(str2).build();
        dispatch(eventBuild);
        Log.trace("IdentityExtension", "dispatchResponse : Identity Response event has been added to event hub : %s", eventBuild);
    }
}
