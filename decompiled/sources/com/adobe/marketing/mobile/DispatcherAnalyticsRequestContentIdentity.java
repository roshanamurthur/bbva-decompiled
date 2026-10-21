package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class DispatcherAnalyticsRequestContentIdentity extends ModuleEventDispatcher<IdentityExtension> {
    private static final String ANALYTICS_FOR_IDENTITY_REQUEST_EVENT_NAME = "AnalyticsForIdentityRequest";

    public DispatcherAnalyticsRequestContentIdentity(EventHub eventHub, IdentityExtension identityExtension) {
        super(eventHub, identityExtension);
    }

    public void dispatchAnalyticsHit(EventData eventData) {
        if (eventData == null) {
            Log.debug("IdentityExtension", "dispatchAnalyticsHit : Unable to dispatch the analytics event without any analytics data.", new Object[0]);
            return;
        }
        eventData.putBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, true);
        Event eventBuild = new Event.Builder(ANALYTICS_FOR_IDENTITY_REQUEST_EVENT_NAME, EventType.ANALYTICS, EventSource.REQUEST_CONTENT).setData(eventData).build();
        dispatch(eventBuild);
        Log.trace("IdentityExtension", "dispatchAnalyticsHit : Analytics event has been added to event hub : (%s)", eventBuild);
    }
}
