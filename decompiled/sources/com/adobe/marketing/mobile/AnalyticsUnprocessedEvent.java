package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsUnprocessedEvent {
    private Event event;
    private List<String> hardStateDependencies;
    private List<String> softStateDependencies;

    public AnalyticsUnprocessedEvent(Event event, List<String> list, List<String> list2) {
        this.event = event;
        this.hardStateDependencies = list != null ? new ArrayList(list) : new ArrayList();
        this.softStateDependencies = list2 != null ? new ArrayList(list2) : new ArrayList();
    }

    public Event getEvent() {
        return this.event;
    }

    public List<String> getHardStateDependencies() {
        return this.hardStateDependencies;
    }

    public List<String> getSoftStateDependencies() {
        return this.softStateDependencies;
    }
}
