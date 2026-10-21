package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.Module;

/* JADX INFO: loaded from: classes2.dex */
abstract class ModuleEventListener<T extends Module> implements EventListener {
    final T parentModule;
    private final EventSource source;
    private final EventType type;

    public ModuleEventListener(T t10, EventType eventType, EventSource eventSource) {
        this.parentModule = t10;
        this.type = eventType;
        this.source = eventSource;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public final EventSource getEventSource() {
        return this.source;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public final EventType getEventType() {
        return this.type;
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void onUnregistered() {
    }
}
