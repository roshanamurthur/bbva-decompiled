package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleDispatcherResponseContent extends ModuleEventDispatcher<LifecycleExtension> {
    public LifecycleDispatcherResponseContent(EventHub eventHub, LifecycleExtension lifecycleExtension) {
        super(eventHub, lifecycleExtension);
    }

    public void dispatchSessionStart(long j10, Map<String, String> map, long j11, long j12) {
        dispatch(new Event.Builder("LifecycleStart", EventType.LIFECYCLE, EventSource.RESPONSE_CONTENT).setData(new EventData().putStringMap(EventDataKeys.Lifecycle.LIFECYCLE_CONTEXT_DATA, map).putString(EventDataKeys.Lifecycle.SESSION_EVENT, EventDataKeys.Lifecycle.LIFECYCLE_START).putLong(EventDataKeys.Lifecycle.SESSION_START_TIMESTAMP, j10).putLong(EventDataKeys.Lifecycle.MAX_SESSION_LENGTH, LifecycleConstants.MAX_SESSION_LENGTH_SECONDS).putLong(EventDataKeys.Lifecycle.PREVIOUS_SESSION_START_TIMESTAMP, j11).putLong("previoussessionpausetimestampmillis", j12)).build());
    }
}
