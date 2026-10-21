package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class EventHistoryRequest {
    long fromDate;
    Map<String, Variant> mask;
    long toDate;

    public EventHistoryRequest(Map<String, Variant> map, long j10, long j11) {
        this.mask = map;
        this.fromDate = j10;
        this.toDate = j11;
    }
}
