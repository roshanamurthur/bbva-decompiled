package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsListenerHubSharedState extends ModuleEventListener<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsListenerHubSharedState";

    public AnalyticsListenerHubSharedState(AnalyticsExtension analyticsExtension, EventType eventType, EventSource eventSource) {
        super(analyticsExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        EventData data = event.getData();
        if (data == null || data.isEmpty()) {
            Log.warning(LOG_TAG, "hear - Ignoring Shared State update event as eventData is invalid", new Object[0]);
            return;
        }
        final String strOptString = data.optString(EventDataKeys.EVENT_STATE_OWNER, null);
        if (StringUtils.isNullOrEmpty(strOptString)) {
            return;
        }
        Log.trace(LOG_TAG, "hear - Submitting Shared State update event for processing.", new Object[0]);
        ((AnalyticsExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsListenerHubSharedState.1
            @Override // java.lang.Runnable
            public void run() {
                ((AnalyticsExtension) AnalyticsListenerHubSharedState.this.parentModule).handleSharedStateUpdateEvent(strOptString);
            }
        });
    }
}
