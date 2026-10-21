package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ListenerHubSharedStateIdentity extends ModuleEventListener<IdentityExtension> {
    public ListenerHubSharedStateIdentity(IdentityExtension identityExtension, EventType eventType, EventSource eventSource) {
        super(identityExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        ((IdentityExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ListenerHubSharedStateIdentity.1
            @Override // java.lang.Runnable
            public void run() {
                String strOptString = event.getData().optString(EventDataKeys.EVENT_STATE_OWNER, null);
                if (EventDataKeys.Configuration.MODULE_NAME.equals(strOptString) || EventDataKeys.Analytics.MODULE_NAME.equals(strOptString) || "com.adobe.module.eventhub".equals(strOptString)) {
                    ((IdentityExtension) ListenerHubSharedStateIdentity.this.parentModule).processEventQueue();
                }
            }
        });
    }
}
