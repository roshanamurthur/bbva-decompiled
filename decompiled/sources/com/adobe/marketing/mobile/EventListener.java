package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
interface EventListener {
    EventSource getEventSource();

    EventType getEventType();

    void hear(Event event);

    void onUnregistered();
}
