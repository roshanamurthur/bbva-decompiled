package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleListenerRequestContent extends ModuleEventListener<LifecycleExtension> {
    public LifecycleListenerRequestContent(LifecycleExtension lifecycleExtension, EventType eventType, EventSource eventSource) {
        super(lifecycleExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((LifecycleExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.LifecycleListenerRequestContent.1
            @Override // java.lang.Runnable
            public void run() {
                ((LifecycleExtension) LifecycleListenerRequestContent.this.parentModule).queueEvent(event);
            }
        });
    }
}
