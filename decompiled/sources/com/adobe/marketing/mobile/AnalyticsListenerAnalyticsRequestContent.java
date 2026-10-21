package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsListenerAnalyticsRequestContent extends ModuleEventListener<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsListenerAnalyticsRequestContent";

    public AnalyticsListenerAnalyticsRequestContent(AnalyticsExtension analyticsExtension, EventType eventType, EventSource eventSource) {
        super(analyticsExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        if (event.getData() == null || event.getData().isEmpty()) {
            Log.warning(LOG_TAG, "hear - Ignoring Analytics request content event as eventData is invalid", new Object[0]);
        } else {
            Log.trace(LOG_TAG, "hear - Submitting Analytics request content event for processing.", new Object[0]);
            ((AnalyticsExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsListenerAnalyticsRequestContent.1
                @Override // java.lang.Runnable
                public void run() {
                    ((AnalyticsExtension) AnalyticsListenerAnalyticsRequestContent.this.parentModule).handleAnalyticsRequestEvent(event);
                }
            });
        }
    }
}
