package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsListenerGenericTrackRequestContent extends ModuleEventListener<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsListenerGenericTrackRequestContent";

    public AnalyticsListenerGenericTrackRequestContent(AnalyticsExtension analyticsExtension, EventType eventType, EventSource eventSource) {
        super(analyticsExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        if (event.getData() == null || event.getData().isEmpty()) {
            Log.warning(LOG_TAG, "hear - Ignoring Generic Track request event as eventData is invalid", new Object[0]);
        } else {
            Log.trace(LOG_TAG, "hear - Submitting Generic Track request content event for processing.", new Object[0]);
            ((AnalyticsExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsListenerGenericTrackRequestContent.1
                @Override // java.lang.Runnable
                public void run() {
                    ((AnalyticsExtension) AnalyticsListenerGenericTrackRequestContent.this.parentModule).handleAnalyticsRequestEvent(event);
                }
            });
        }
    }
}
