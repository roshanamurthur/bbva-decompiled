package com.adobe.marketing.mobile;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ReprocessEventsHandler {
    List<Event> getEvents();

    void onEventReprocessingComplete();
}
