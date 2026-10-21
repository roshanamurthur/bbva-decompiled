package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class ListenerAnalyticsResponseIdentity extends ModuleEventListener<IdentityExtension> {
    public ListenerAnalyticsResponseIdentity(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ListenerAnalyticsResponseIdentity.1
            @Override // java.lang.Runnable
            public void run() {
                ((IdentityExtension) ListenerAnalyticsResponseIdentity.this.parentModule).handleAnalyticsResponseIdentity(event);
            }
        });
    }

    @Override // com.adobe.marketing.mobile.ModuleEventListener, com.adobe.marketing.mobile.EventListener
    public /* bridge */ /* synthetic */ void onUnregistered() {
        super.onUnregistered();
    }
}
