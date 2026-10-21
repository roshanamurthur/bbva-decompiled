package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class SignalCore {
    private static final String LOG_TAG = "SignalCore";
    EventHub eventHub;

    public SignalCore(EventHub eventHub, ModuleDetails moduleDetails) {
        if (eventHub == null) {
            Log.debug(LOG_TAG, "%s (EventHub) while initializing Signal Core", "Unexpected Null Value");
            return;
        }
        this.eventHub = eventHub;
        try {
            eventHub.registerModule(SignalExtension.class, moduleDetails);
            Log.trace(LOG_TAG, "Registered %s extension", "SignalExtension");
        } catch (InvalidModuleException e5) {
            Log.debug(LOG_TAG, "Failed to register %s module (%s)", "SignalExtension", e5);
        }
    }

    public void collectPii(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.debug(LOG_TAG, "Could not trigger PII, the data is null or empty.", new Object[0]);
        } else {
            this.eventHub.dispatch(new Event.Builder("CollectPII", EventType.SIGNAL, EventSource.REQUEST_CONTENT).setData(new EventData().putStringMap("contextdata", map)).build());
        }
    }
}
