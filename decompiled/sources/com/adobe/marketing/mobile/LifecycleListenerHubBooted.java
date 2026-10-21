package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleListenerHubBooted extends ModuleEventListener<LifecycleExtension> {
    public LifecycleListenerHubBooted(LifecycleExtension lifecycleExtension, EventType eventType, EventSource eventSource) {
        super(lifecycleExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((LifecycleExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.LifecycleListenerHubBooted.1
            @Override // java.lang.Runnable
            public void run() {
                ((LifecycleExtension) LifecycleListenerHubBooted.this.parentModule).handleEventHubBootEvent(event);
            }
        });
    }
}
