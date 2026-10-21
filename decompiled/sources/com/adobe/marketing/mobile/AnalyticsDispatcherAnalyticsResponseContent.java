package com.adobe.marketing.mobile;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsDispatcherAnalyticsResponseContent extends ModuleEventDispatcher<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsDispatcherAnalyticsResponseContent";

    public AnalyticsDispatcherAnalyticsResponseContent(EventHub eventHub, AnalyticsExtension analyticsExtension) {
        super(eventHub, analyticsExtension);
    }

    public void dispatchAnalyticsHitResponse(String str, HashMap<String, String> map, String str2, String str3, String str4) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Analytics.ANALYTICS_SERVER_RESPONSE_KEY, str);
        eventData.putStringMap("headers", map);
        eventData.putString("hitHost", str3);
        eventData.putString("hitUrl", str4);
        if (str2 != null) {
            eventData.putString("requestEventIdentifier", str2);
        }
        super.dispatch(new Event.Builder("AnalyticsResponse", EventType.ANALYTICS, EventSource.RESPONSE_CONTENT).setData(eventData).build());
        Log.trace(LOG_TAG, "dispatchAnalyticsHitResponse - Dispatching Analytics hit response event with eventdata: %s", eventData);
    }

    public void dispatchQueueSize(long j10, String str) {
        EventData eventData = new EventData();
        eventData.putLong(EventDataKeys.Analytics.QUEUE_SIZE, j10);
        super.dispatch(new Event.Builder("QueueSizeValue", EventType.ANALYTICS, EventSource.RESPONSE_CONTENT).setPairID(str).setData(eventData).build());
        Log.trace(LOG_TAG, "dispatchQueueSize - Dispatching Analytics hit queue size response event with eventdata: %s", eventData);
    }
}
