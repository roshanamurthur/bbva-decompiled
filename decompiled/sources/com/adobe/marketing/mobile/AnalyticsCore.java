package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsCore {
    private static final String LOG_TAG = "AnalyticsCore";
    EventHub eventHub;

    public AnalyticsCore(EventHub eventHub, ModuleDetails moduleDetails, String str) {
        this(eventHub, moduleDetails, true, str);
    }

    public void clearQueue() {
        this.eventHub.dispatch(new Event.Builder("ClearHitsQueue", EventType.ANALYTICS, EventSource.REQUEST_CONTENT).setData(new EventData().putBoolean(EventDataKeys.Analytics.CLEAR_HITS_QUEUE, true)).build());
        Log.debug(LOG_TAG, "clearQueue - Clear hits queue event was sent", new Object[0]);
    }

    public void getQueueSize(final AdobeCallback<Long> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null;
        Event eventBuild = new Event.Builder("GetQueueSize", EventType.ANALYTICS, EventSource.REQUEST_CONTENT).setData(new EventData().putBoolean(EventDataKeys.Analytics.GET_QUEUE_SIZE, true)).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.AnalyticsCore.2
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                EventData data = event.getData();
                adobeCallback.call(Long.valueOf(data != null ? data.optLong(EventDataKeys.Analytics.QUEUE_SIZE, 0L) : 0L));
            }
        }, adobeCallbackWithError);
        this.eventHub.dispatch(eventBuild);
        Log.debug(LOG_TAG, "getQueueSize - Get hits queue size request event was sent", new Object[0]);
    }

    public void getTrackingIdentifier(final AdobeCallback<String> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null;
        Event eventBuild = new Event.Builder("GetTrackingIdentifier", EventType.ANALYTICS, EventSource.REQUEST_IDENTITY).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.AnalyticsCore.1
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                EventData data = event.getData();
                adobeCallback.call(data != null ? data.optString(EventDataKeys.Analytics.ANALYTICS_ID, null) : null);
            }
        }, adobeCallbackWithError);
        this.eventHub.dispatch(eventBuild);
        Log.debug(LOG_TAG, "getTrackingIdentifier - Get tracking identifier request event was sent", new Object[0]);
    }

    public void getVisitorIdentifier(final AdobeCallback<String> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        Event eventBuild = new Event.Builder("GetVisitorIdentifier", EventType.ANALYTICS, EventSource.REQUEST_IDENTITY).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.AnalyticsCore.3
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                EventData data = event.getData();
                adobeCallback.call(data != null ? data.optString(EventDataKeys.Identity.USER_IDENTIFIER, null) : null);
            }
        }, adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null);
        this.eventHub.dispatch(eventBuild);
    }

    public void sendQueuedHits() {
        this.eventHub.dispatch(new Event.Builder("ForceKickHits", EventType.ANALYTICS, EventSource.REQUEST_CONTENT).setData(new EventData().putBoolean(EventDataKeys.Analytics.FORCE_KICK_HITS, true)).build());
        Log.debug(LOG_TAG, "sendQueuedHits - Kick all hits event was sent", new Object[0]);
    }

    public void updateVisitorIdentifier(String str) {
        this.eventHub.dispatch(new Event.Builder("UpdateVisitorIdentifier", EventType.ANALYTICS, EventSource.REQUEST_IDENTITY).setData(new EventData().putString(EventDataKeys.Identity.USER_IDENTIFIER, str)).build());
    }

    public AnalyticsCore(EventHub eventHub, ModuleDetails moduleDetails, boolean z10, String str) {
        if (eventHub == null) {
            Log.error(LOG_TAG, "AnalyticsCore - Core initialization was unsuccessful (No EventHub instance found!)", new Object[0]);
            return;
        }
        this.eventHub = eventHub;
        if (z10) {
            try {
                eventHub.registerModule(AnalyticsExtension.class, moduleDetails);
                Log.debug(LOG_TAG, "Registered %s extension", "AnalyticsExtension");
            } catch (InvalidModuleException e5) {
                Log.debug(LOG_TAG, "AnalyticsCore - Failed to register %s module (%s)", "AnalyticsExtension", e5);
            }
        }
        Log.debug(LOG_TAG, "Core initialization was successful", new Object[0]);
        AnalyticsVersionProvider.setVersion(str);
    }
}
