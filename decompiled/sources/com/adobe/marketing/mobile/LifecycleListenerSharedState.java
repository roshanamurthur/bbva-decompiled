package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleListenerSharedState extends ModuleEventListener<LifecycleExtension> {
    public LifecycleListenerSharedState(LifecycleExtension lifecycleExtension, EventType eventType, EventSource eventSource) {
        super(lifecycleExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((LifecycleExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.LifecycleListenerSharedState.1
            @Override // java.lang.Runnable
            public void run() {
                ((LifecycleExtension) LifecycleListenerSharedState.this.parentModule).handleSharedStateUpdateEvent(event);
            }
        });
    }
}
