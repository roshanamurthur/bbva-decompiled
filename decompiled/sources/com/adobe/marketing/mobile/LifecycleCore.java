package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleCore {
    private static final String LOG_TAG = "LifecycleCore";
    private EventHub eventHub;

    public LifecycleCore(EventHub eventHub, ModuleDetails moduleDetails) {
        if (eventHub == null) {
            Log.debug(LOG_TAG, "Core initialization was not successful, %s (EventHub)", "Unexpected Null Value");
            return;
        }
        this.eventHub = eventHub;
        try {
            eventHub.registerModule(LifecycleExtension.class, moduleDetails);
            Log.trace(LOG_TAG, "Registered %s ", "LifecycleExtension");
        } catch (InvalidModuleException e5) {
            Log.error(LOG_TAG, "Failed to register %s (%s)", "LifecycleExtension", e5);
        }
    }
}
