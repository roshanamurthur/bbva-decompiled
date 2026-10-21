package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ListenerConfigurationResponseContentSignal extends ModuleEventListener<SignalExtension> {
    public ListenerConfigurationResponseContentSignal(SignalExtension signalExtension, EventType eventType, EventSource eventSource) {
        super(signalExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        ((SignalExtension) this.parentModule).updatePrivacyStatus(MobilePrivacyStatus.fromString(event.getData().optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, "")));
    }
}
