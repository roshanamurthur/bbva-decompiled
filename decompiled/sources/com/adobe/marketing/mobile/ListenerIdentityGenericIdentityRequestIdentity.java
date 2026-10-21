package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ListenerIdentityGenericIdentityRequestIdentity extends ModuleEventListener<IdentityExtension> {
    public ListenerIdentityGenericIdentityRequestIdentity(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ListenerIdentityGenericIdentityRequestIdentity.1
            @Override // java.lang.Runnable
            public void run() {
                ((IdentityExtension) ListenerIdentityGenericIdentityRequestIdentity.this.parentModule).enqueueEvent(event);
                ((IdentityExtension) ListenerIdentityGenericIdentityRequestIdentity.this.parentModule).processEventQueue();
            }
        });
    }
}
