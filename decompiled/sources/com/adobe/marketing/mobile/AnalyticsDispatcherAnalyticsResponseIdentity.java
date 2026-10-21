package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsDispatcherAnalyticsResponseIdentity extends ModuleEventDispatcher<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsDispatcherAnalyticsResponseIdentity";

    public AnalyticsDispatcherAnalyticsResponseIdentity(EventHub eventHub, AnalyticsExtension analyticsExtension) {
        super(eventHub, analyticsExtension);
    }

    public void dispatch(String str, String str2, String str3) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Analytics.ANALYTICS_ID, str);
        eventData.putString(EventDataKeys.Identity.USER_IDENTIFIER, str2);
        if (!StringUtils.isNullOrEmpty(str3)) {
            super.dispatch(new Event.Builder("TrackingIdentifierValue", EventType.ANALYTICS, EventSource.RESPONSE_IDENTITY).setPairID(str3).setData(eventData).build());
            Log.trace(LOG_TAG, "dispatchAnalyticsHitResponseIdentity - Dispatching Analytics paired response identity event with eventdata: %s.", eventData);
        }
        super.dispatch(new Event.Builder("TrackingIdentifierValue", EventType.ANALYTICS, EventSource.RESPONSE_IDENTITY).setData(eventData).build());
        Log.trace(LOG_TAG, "dispatchAnalyticsHitResponseIdentity - Dispatching Analytics unpaired response identity event with eventdata: %s.", eventData);
    }
}
