package com.adobe.marketing.mobile;

import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
class SignalExtension extends InternalModule {
    private static final String LOGTAG = "SignalExtension";
    private SignalHitsDatabase signalHitsDatabase;
    private final ConcurrentLinkedQueue<Event> unprocessedEvents;

    public SignalExtension(EventHub eventHub, PlatformServices platformServices) {
        super(EventDataKeys.Signal.MODULE_NAME, eventHub, platformServices);
        EventType eventType = EventType.RULES_ENGINE;
        EventSource eventSource = EventSource.RESPONSE_CONTENT;
        registerListener(eventType, eventSource, ListenerRulesEngineResponseContentSignal.class);
        registerListener(EventType.CONFIGURATION, eventSource, ListenerConfigurationResponseContentSignal.class);
        this.signalHitsDatabase = new SignalHitsDatabase(platformServices);
        this.unprocessedEvents = new ConcurrentLinkedQueue<>();
    }

    public void handleOpenURLConsequenceEvent(final Event event) {
        getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.SignalExtension.2
            @Override // java.lang.Runnable
            public void run() {
                Event event2 = event;
                EventData data = event2 == null ? null : event2.getData();
                if (data == null) {
                    return;
                }
                Log.trace(SignalExtension.LOGTAG, "Handling signal open url consequence event, number: %s", Integer.valueOf(event.getEventNumber()));
                Map<String, Variant> mapOptVariantMap = data.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
                if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
                    Log.debug(SignalExtension.LOGTAG, "Null or empty signal consequence. Return", new Object[0]);
                    return;
                }
                Map<String, Variant> mapOptVariantMap2 = Variant.optVariantFromMap(mapOptVariantMap, "detail").optVariantMap(null);
                if (mapOptVariantMap2 == null || mapOptVariantMap2.isEmpty()) {
                    Log.debug(SignalExtension.LOGTAG, "Null or empty signal consequence detail. Return", new Object[0]);
                    return;
                }
                String strOptString = Variant.optVariantFromMap(mapOptVariantMap2, "url").optString("");
                if (StringUtils.isNullOrEmpty(strOptString)) {
                    Log.debug(SignalExtension.LOGTAG, "Tried to process an OpenURL event, but no URL were found in EventData.", new Object[0]);
                    return;
                }
                if (SignalExtension.this.getPlatformServices() == null) {
                    Log.debug(SignalExtension.LOGTAG, "%s (Platform Services), Unable to process an OpenURL event.", "Unexpected Null Value");
                    return;
                }
                UIService uIService = SignalExtension.this.getPlatformServices().getUIService();
                if (uIService == null) {
                    Log.debug(SignalExtension.LOGTAG, "%s (UIService), Unable to process OpenURL event.", "Unexpected Null Value");
                } else {
                    uIService.showUrl(strOptString);
                }
            }
        });
    }

    public void handleSignalConsequenceEvent(final Event event) {
        getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.SignalExtension.1
            @Override // java.lang.Runnable
            public void run() {
                Log.trace(SignalExtension.LOGTAG, "Handling signal consequence event, number: %s", Integer.valueOf(event.getEventNumber()));
                SignalExtension.this.unprocessedEvents.add(event);
                SignalExtension.this.tryProcessQueuedEvent();
            }
        });
    }

    public boolean processSignalEvent(Event event) {
        EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
        if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
            Log.debug(LOGTAG, "Can not handle signal consequence. Shared state for Configuration module is not ready.", new Object[0]);
            return false;
        }
        MobilePrivacyStatus mobilePrivacyStatusFromString = MobilePrivacyStatus.fromString(sharedEventState.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, MobilePrivacyStatus.UNKNOWN.getValue()));
        if (mobilePrivacyStatusFromString == MobilePrivacyStatus.OPT_OUT) {
            Log.debug(LOGTAG, "Privacy status is OPT OUT. Signal processed without queuing the hit.", new Object[0]);
            return true;
        }
        EventData data = event == null ? null : event.getData();
        if (data == null) {
            return true;
        }
        Map<String, Variant> mapOptVariantMap = data.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
        if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
            Log.debug(LOGTAG, "Null or empty signal consequence. Return", new Object[0]);
        } else {
            SignalTemplate signalTemplateCreateSignalTemplateFromConsequence = SignalTemplate.createSignalTemplateFromConsequence(mapOptVariantMap);
            if (signalTemplateCreateSignalTemplateFromConsequence != null) {
                this.signalHitsDatabase.queue(signalTemplateCreateSignalTemplateFromConsequence.getSignalHit(), event.getTimestamp(), mobilePrivacyStatusFromString);
            }
        }
        return true;
    }

    public void tryProcessQueuedEvent() {
        while (!this.unprocessedEvents.isEmpty() && processSignalEvent(this.unprocessedEvents.peek())) {
            this.unprocessedEvents.poll();
        }
    }

    public void updatePrivacyStatus(final MobilePrivacyStatus mobilePrivacyStatus) {
        getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.SignalExtension.3
            @Override // java.lang.Runnable
            public void run() {
                if (mobilePrivacyStatus == MobilePrivacyStatus.OPT_OUT) {
                    SignalExtension.this.unprocessedEvents.clear();
                }
                SignalExtension.this.signalHitsDatabase.updatePrivacyStatus(mobilePrivacyStatus);
                SignalExtension.this.tryProcessQueuedEvent();
            }
        });
    }

    public SignalExtension(EventHub eventHub, PlatformServices platformServices, SignalHitsDatabase signalHitsDatabase) {
        this(eventHub, platformServices);
        this.signalHitsDatabase = signalHitsDatabase;
    }
}
