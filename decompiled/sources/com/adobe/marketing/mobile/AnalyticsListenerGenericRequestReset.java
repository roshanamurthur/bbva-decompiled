package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsListenerGenericRequestReset extends ModuleEventListener<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsListenerGenericRequestReset";

    public AnalyticsListenerGenericRequestReset(AnalyticsExtension analyticsExtension, EventType eventType, EventSource eventSource) {
        super(analyticsExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        Log.trace(LOG_TAG, "hear - Submitting Generic reset request event for processing.", new Object[0]);
        ((AnalyticsExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsListenerGenericRequestReset.1
            @Override // java.lang.Runnable
            public void run() {
                ((AnalyticsExtension) AnalyticsListenerGenericRequestReset.this.parentModule).handleGenericResetEvent(event);
            }
        });
    }
}
