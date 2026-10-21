package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ListenerIdentityGenericIdentityRequestReset extends ModuleEventListener<IdentityExtension> {
    public ListenerIdentityGenericIdentityRequestReset(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ListenerIdentityGenericIdentityRequestReset.1
            @Override // java.lang.Runnable
            public void run() {
                ((IdentityExtension) ListenerIdentityGenericIdentityRequestReset.this.parentModule).enqueueEvent(event);
                ((IdentityExtension) ListenerIdentityGenericIdentityRequestReset.this.parentModule).processEventQueue();
            }
        });
    }
}
