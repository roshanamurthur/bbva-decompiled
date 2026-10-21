package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class IdentityCore {
    private static final String LOG_TAG = "IdentityCore";
    private static final int PUBLIC_API_TIME_OUT_MILLISECOND = 500;
    private static final String REQUEST_IDENTITY_EVENT_NAME = "IdentityRequestIdentity";
    private EventHub eventHub;

    public IdentityCore(EventHub eventHub, ModuleDetails moduleDetails) {
        if (eventHub == null) {
            Log.error(LOG_TAG, "IdentityCore : Unable to initialize the Identity Core because there is no EventHub instance found.", new Object[0]);
            return;
        }
        this.eventHub = eventHub;
        try {
            eventHub.registerModule(IdentityExtension.class, moduleDetails);
        } catch (InvalidModuleException e5) {
            Log.error(LOG_TAG, "IdentityCore : Unable to register Identity Core due to: (%s). ", e5);
        }
        Log.trace(LOG_TAG, "IdentityCore : Identity Core has been initialized and registered successfully.", new Object[0]);
    }

    private <T> void createIdentityRequestWithOneTimeCallbackWithCallbackParam(final String str, EventData eventData, final AdobeCallback<T> adobeCallback, final VariantSerializer<T> variantSerializer) {
        if (adobeCallback == null) {
            return;
        }
        Event eventBuild = eventData == null ? new Event.Builder(REQUEST_IDENTITY_EVENT_NAME, EventType.IDENTITY, EventSource.REQUEST_IDENTITY).build() : new Event.Builder(REQUEST_IDENTITY_EVENT_NAME, EventType.IDENTITY, EventSource.REQUEST_IDENTITY).setData(eventData).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.IdentityCore.1
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                adobeCallback.call(event.getData().optTypedObject(str, null, variantSerializer));
            }
        }, adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null, 500);
        this.eventHub.dispatch(eventBuild);
        Log.trace(LOG_TAG, "createIdentityRequestWithOneTimeCallbackWithCallbackParam : Identity request event has been added to the event hub : %s", eventBuild);
    }

    private void dispatchIDSyncEvent(Map<String, String> map, VisitorID.AuthenticationState authenticationState) {
        EventData eventData = new EventData();
        eventData.putStringMap(EventDataKeys.Identity.IDENTIFIERS, map);
        eventData.putInteger(EventDataKeys.Identity.AUTHENTICATION_STATE, authenticationState.getValue());
        eventData.putBoolean(EventDataKeys.Identity.FORCE_SYNC, false);
        eventData.putBoolean(EventDataKeys.Identity.IS_SYNC_EVENT, true);
        Event eventBuild = new Event.Builder(REQUEST_IDENTITY_EVENT_NAME, EventType.IDENTITY, EventSource.REQUEST_IDENTITY).setData(eventData).build();
        this.eventHub.dispatch(eventBuild);
        Log.trace(LOG_TAG, "dispatchIDSyncEvent : Identity Sync event has been added to event hub : %s", eventBuild);
    }

    public void appendToURL(String str, AdobeCallback<String> adobeCallback) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Identity.BASE_URL, str);
        createIdentityRequestWithOneTimeCallbackWithCallbackParam(EventDataKeys.Identity.UPDATED_URL, eventData, adobeCallback, new StringVariantSerializer());
    }

    public void getAdvertisingIdentifier(AdobeCallback<String> adobeCallback) {
        createIdentityRequestWithOneTimeCallbackWithCallbackParam(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, null, adobeCallback, new StringVariantSerializer());
    }

    public void getExperienceCloudId(AdobeCallback<String> adobeCallback) {
        createIdentityRequestWithOneTimeCallbackWithCallbackParam(EventDataKeys.Identity.VISITOR_ID_MID, null, adobeCallback, new StringVariantSerializer());
    }

    public void getIdentifiers(AdobeCallback<List<VisitorID>> adobeCallback) {
        createIdentityRequestWithOneTimeCallbackWithCallbackParam(EventDataKeys.Identity.VISITOR_IDS_LIST, null, adobeCallback, VisitorID.LIST_VARIANT_SERIALIZER);
    }

    public void getPushIdentifier(AdobeCallback<String> adobeCallback) {
        createIdentityRequestWithOneTimeCallbackWithCallbackParam(EventDataKeys.Identity.PUSH_IDENTIFIER, null, adobeCallback, new StringVariantSerializer());
    }

    public void getUrlVariables(AdobeCallback<String> adobeCallback) {
        EventData eventData = new EventData();
        eventData.putBoolean("urlvariables", true);
        createIdentityRequestWithOneTimeCallbackWithCallbackParam("urlvariables", eventData, adobeCallback, new StringVariantSerializer());
    }

    public void syncIdentifier(String str, String str2, VisitorID.AuthenticationState authenticationState) {
        if (StringUtils.isNullOrEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        map.put(str, str2);
        dispatchIDSyncEvent(map, authenticationState);
    }

    public void syncIdentifiers(Map<String, String> map) {
        dispatchIDSyncEvent(map, VisitorID.AuthenticationState.UNKNOWN);
    }

    public void syncIdentifiers(Map<String, String> map, VisitorID.AuthenticationState authenticationState) {
        dispatchIDSyncEvent(map, authenticationState);
    }
}
