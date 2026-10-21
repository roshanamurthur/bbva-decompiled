package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class IdentityListenerConfigurationResponseContent extends ModuleEventListener<IdentityExtension> {
    public IdentityListenerConfigurationResponseContent(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        if (event == null) {
            return;
        }
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.IdentityListenerConfigurationResponseContent.1
            @Override // java.lang.Runnable
            public void run() {
                ((IdentityExtension) IdentityListenerConfigurationResponseContent.this.parentModule).handleConfiguration(event);
            }
        });
    }

    @Override // com.adobe.marketing.mobile.ModuleEventListener, com.adobe.marketing.mobile.EventListener
    public /* bridge */ /* synthetic */ void onUnregistered() {
        super.onUnregistered();
    }
}
