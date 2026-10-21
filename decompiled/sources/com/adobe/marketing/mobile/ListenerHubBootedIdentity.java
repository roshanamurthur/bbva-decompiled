package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ListenerHubBootedIdentity extends ModuleEventListener<IdentityExtension> {
    public ListenerHubBootedIdentity(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ListenerHubBootedIdentity.1
            @Override // java.lang.Runnable
            public void run() {
                ((IdentityExtension) ListenerHubBootedIdentity.this.parentModule).bootup(event);
            }
        });
    }
}
