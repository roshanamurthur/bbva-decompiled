package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
interface EventHistory {
    void deleteEvents(EventHistoryRequest[] eventHistoryRequestArr, EventHistoryResultHandler<Integer> eventHistoryResultHandler);

    void getEvents(EventHistoryRequest[] eventHistoryRequestArr, boolean z10, EventHistoryResultHandler<Integer> eventHistoryResultHandler);

    void recordEvent(Event event, EventHistoryResultHandler<Boolean> eventHistoryResultHandler);
}
