package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsExtension extends InternalModule {
    private static final String LOG_TAG = "AnalyticsExtension";
    private final List<String> analyticsHardDependencies;
    AnalyticsDispatcherAnalyticsResponseIdentity analyticsIdentityResponseDispatcher;
    AnalyticsProperties analyticsProperties;
    AnalyticsRequestSerializer analyticsRequestSerializer;
    AnalyticsDispatcherAnalyticsResponseContent analyticsResponseDispatcher;
    private EventData analyticsSharedData;
    private final List<String> analyticsSoftDependencies;
    ConcurrentLinkedQueue<AnalyticsUnprocessedEvent> analyticsUnprocessedEvents;
    AnalyticsHitsDatabase hitDatabase;
    private long mostRecentHitTimestampInSeconds;

    public AnalyticsExtension(EventHub eventHub, PlatformServices platformServices) {
        super(EventDataKeys.Analytics.MODULE_NAME, eventHub, platformServices);
        registerAnalyticsListeners();
        registerAnalyticsDispatchers();
        this.analyticsProperties = new AnalyticsProperties();
        this.analyticsUnprocessedEvents = new ConcurrentLinkedQueue<>();
        this.analyticsRequestSerializer = new AnalyticsRequestSerializer();
        ArrayList arrayList = new ArrayList();
        this.analyticsHardDependencies = arrayList;
        arrayList.add(EventDataKeys.Configuration.MODULE_NAME);
        arrayList.add(EventDataKeys.Identity.MODULE_NAME);
        ArrayList arrayList2 = new ArrayList();
        this.analyticsSoftDependencies = arrayList2;
        arrayList2.add("com.adobe.module.places");
        arrayList2.add("com.adobe.assurance");
        arrayList2.add(EventDataKeys.Lifecycle.MODULE_NAME);
    }

    private void backdateLifecycleCrash(AnalyticsState analyticsState, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("a.CrashEvent", "CrashEvent");
        if (!StringUtils.isNullOrEmpty(str)) {
            map.put("a.OSVersion", str);
        }
        if (!StringUtils.isNullOrEmpty(str2)) {
            map.put("a.AppID", str2);
        }
        track(analyticsState, new EventData().putString("action", "Crash").putStringMap("contextdata", map).putBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, true), getMostRecentHitTimestampInSeconds() + 1, true, str3);
    }

    private void backdateLifecycleSessionInfo(AnalyticsState analyticsState, String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("a.PrevSessionLength", str);
        }
        if (!StringUtils.isNullOrEmpty(str2)) {
            map.put("a.OSVersion", str2);
        }
        if (!StringUtils.isNullOrEmpty(str3)) {
            map.put("a.AppID", str3);
        }
        track(analyticsState, new EventData().putString("action", "SessionInfo").putStringMap("contextdata", map).putBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, true), Math.max(getMostRecentHitTimestampInSeconds(), this.analyticsProperties.getLifecyclePreviousSessionPauseTimestamp()) + 1, true, str4);
    }

    private void forceKickEventsFromDB(AnalyticsState analyticsState) {
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase != null) {
            hitDatabase.forceKick(analyticsState);
        } else {
            Log.warning(LOG_TAG, "forceKickEventsFromDB - Unable to force kick analytic hits. Database Service is unavailable", new Object[0]);
        }
    }

    private String getActionKey(boolean z10) {
        return z10 ? "a.internalaction" : "a.action";
    }

    private String getActionPrefix(boolean z10) {
        return z10 ? "ADBINTERNAL:" : "AMACTION:";
    }

    private LocalStorageService.DataStore getDataStore() {
        PlatformServices platformServices = getPlatformServices();
        if (platformServices == null) {
            Log.warning(LOG_TAG, "getDataStore - Unable to access platform services", new Object[0]);
            return null;
        }
        LocalStorageService localStorageService = platformServices.getLocalStorageService();
        if (localStorageService == null) {
            return null;
        }
        return localStorageService.getDataStore("AnalyticsDataStorage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AnalyticsHitsDatabase getHitDatabase() {
        try {
            if (this.hitDatabase == null) {
                this.hitDatabase = new AnalyticsHitsDatabase(getPlatformServices(), this.analyticsProperties, this.analyticsResponseDispatcher);
            }
        } catch (MissingPlatformServicesException e5) {
            Log.error(LOG_TAG, "getHitDatabase - Database service not initialized %s", e5);
        }
        return this.hitDatabase;
    }

    private long getMostRecentHitTimestampInSeconds() {
        if (this.mostRecentHitTimestampInSeconds <= 0) {
            LocalStorageService.DataStore dataStore = getDataStore();
            if (dataStore != null) {
                this.mostRecentHitTimestampInSeconds = dataStore.getLong("mostRecentHitTimestampSeconds", 0L);
            } else {
                Log.warning(LOG_TAG, "getMostRecentHitTimestampInSeconds - Unable to get most recent hit timestamp from persistence. LocalStorage Service not initialized.", new Object[0]);
            }
        }
        return this.mostRecentHitTimestampInSeconds;
    }

    private Map<String, EventData> getSharedState(AnalyticsUnprocessedEvent analyticsUnprocessedEvent) {
        HashMap map = new HashMap();
        for (String str : analyticsUnprocessedEvent.getHardStateDependencies()) {
            EventData sharedEventState = getSharedEventState(str, analyticsUnprocessedEvent.getEvent());
            if (!hasSharedEventState(str)) {
                Log.debug(LOG_TAG, "getSharedState - Shared State for %s couldn't be retrieved at the time, will retry later. If this message persists, please make sure you have registered and configured the %s extension properly based on the documentation.", str, str);
                return null;
            }
            if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
                Log.debug(LOG_TAG, "getSharedState - Shared State for %s couldn't be retrieved at the time of process while it is pending, will retry later.", str);
                return null;
            }
            map.put(str, new EventData(sharedEventState));
        }
        for (String str2 : analyticsUnprocessedEvent.getSoftStateDependencies()) {
            EventData sharedEventState2 = getSharedEventState(str2, analyticsUnprocessedEvent.getEvent());
            if (sharedEventState2 != null) {
                map.put(str2, new EventData(sharedEventState2));
            }
        }
        return map;
    }

    private long getTimeSinceLaunch(long j10) {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j10;
    }

    private void registerAnalyticsListeners() {
        EventType eventType = EventType.RULES_ENGINE;
        EventSource eventSource = EventSource.RESPONSE_CONTENT;
        registerListener(eventType, eventSource, AnalyticsListenerRulesEngineResponseContent.class);
        EventType eventType2 = EventType.ANALYTICS;
        EventSource eventSource2 = EventSource.REQUEST_CONTENT;
        registerListener(eventType2, eventSource2, AnalyticsListenerAnalyticsRequestContent.class);
        registerListener(eventType2, EventSource.REQUEST_IDENTITY, AnalyticsListenerAnalyticsRequestIdentity.class);
        EventType eventType3 = EventType.HUB;
        registerListener(eventType3, EventSource.SHARED_STATE, AnalyticsListenerHubSharedState.class);
        registerListener(eventType3, EventSource.BOOTED, AnalyticsListenerHubBooted.class);
        registerListener(EventType.CONFIGURATION, eventSource, AnalyticsListenerConfigurationResponseContent.class);
        registerListener(EventType.GENERIC_LIFECYLE, eventSource2, AnalyticsListenerLifecycleRequestContent.class);
        registerListener(EventType.LIFECYCLE, eventSource, AnalyticsListenerLifecycleResponseContent.class);
        registerListener(EventType.ACQUISITION, eventSource, AnalyticsListenerAcquisitionResponseContent.class);
        registerListener(EventType.GENERIC_TRACK, eventSource2, AnalyticsListenerGenericTrackRequestContent.class);
        registerListener(EventType.GENERIC_IDENTITY, EventSource.REQUEST_RESET, AnalyticsListenerGenericRequestReset.class);
    }

    private void setMostRecentHitTimestampInSeconds(long j10) {
        long mostRecentHitTimestampInSeconds = getMostRecentHitTimestampInSeconds();
        this.mostRecentHitTimestampInSeconds = mostRecentHitTimestampInSeconds;
        if (mostRecentHitTimestampInSeconds < j10) {
            this.mostRecentHitTimestampInSeconds = j10;
            LocalStorageService.DataStore dataStore = getDataStore();
            if (dataStore != null) {
                dataStore.setLong("mostRecentHitTimestampSeconds", j10);
            } else {
                Log.warning(LOG_TAG, "setMostRecentHitTimestampInSeconds - Unable to set most recent hit timestamp in persistence. LocalStorage Service not initialized.", new Object[0]);
            }
        }
    }

    private void updateAIDInLocalStorage(String str) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.warning(LOG_TAG, "updateAIDInLocalStorage - Unable to update AID in persistence. LocalStorage Service not initialized.", new Object[0]);
        } else if (StringUtils.isNullOrEmpty(str)) {
            dataStore.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
        } else {
            dataStore.setString("ADOBEMOBILE_STOREDDEFAULTS_AID", str);
        }
    }

    private void updateVIDInLocalStorage(String str) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.warning(LOG_TAG, "updateVIDInLocalStorage - Unable to update VID in persistence. LocalStorage Service not initialized.", new Object[0]);
        } else if (StringUtils.isNullOrEmpty(str)) {
            dataStore.remove("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER");
        } else {
            dataStore.setString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", str);
        }
    }

    private void waitForAcquisitionData(final AnalyticsState analyticsState, long j10) {
        this.analyticsProperties.getReferrerTimerState().startTimer(j10, new AdobeCallback<Boolean>() { // from class: com.adobe.marketing.mobile.AnalyticsExtension.2
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public void call(Boolean bool) {
                AnalyticsExtension.this.getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsExtension.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.warning(AnalyticsExtension.LOG_TAG, "waitForAcquisitionData - Referrer timeout has expired without referrer data", new Object[0]);
                        AnalyticsHitsDatabase hitDatabase = AnalyticsExtension.this.getHitDatabase();
                        if (hitDatabase != null) {
                            hitDatabase.kick(analyticsState, false);
                        }
                    }
                });
            }
        });
    }

    private void waitForLifecycleData() {
        this.analyticsProperties.getLifecycleTimerState().startTimer(1000L, new AdobeCallback<Boolean>() { // from class: com.adobe.marketing.mobile.AnalyticsExtension.1
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public void call(Boolean bool) {
                AnalyticsExtension.this.getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsExtension.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.warning(AnalyticsExtension.LOG_TAG, "waitForLifecycleData - Lifecycle timeout has expired without Lifecycle data", new Object[0]);
                        AnalyticsHitsDatabase hitDatabase = AnalyticsExtension.this.getHitDatabase();
                        if (hitDatabase != null) {
                            hitDatabase.kick(null, false);
                        }
                    }
                });
            }
        });
    }

    public void clearAllHits() {
        clearUnprocessedEventQueue();
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase != null) {
            hitDatabase.clearTrackingQueue();
        } else {
            Log.warning(LOG_TAG, "clearAllHits - Unable to clear tracking queue. Database Service is unavailable", new Object[0]);
        }
    }

    public void clearUnprocessedEventQueue() {
        Iterator<AnalyticsUnprocessedEvent> it = this.analyticsUnprocessedEvents.iterator();
        while (it.hasNext()) {
            Event event = it.next().getEvent();
            EventType eventType = event.getEventType();
            EventType eventType2 = EventType.ANALYTICS;
            if (eventType == eventType2 && event.getEventSource() == EventSource.REQUEST_IDENTITY) {
                this.analyticsIdentityResponseDispatcher.dispatch(null, null, event.getResponsePairID());
            }
            if (event.getEventType() == eventType2 && event.getEventSource() == EventSource.REQUEST_CONTENT) {
                this.analyticsResponseDispatcher.dispatchQueueSize(0L, event.getResponsePairID());
            }
        }
        this.analyticsUnprocessedEvents.clear();
    }

    public void getTrackingQueueSize(String str) {
        long trackingQueueSize;
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase != null) {
            trackingQueueSize = hitDatabase.getTrackingQueueSize();
        } else {
            Log.warning(LOG_TAG, "getTrackingQueueSize - Database queueSize is 0. Database Service is unavailable", new Object[0]);
            trackingQueueSize = 0;
        }
        this.analyticsResponseDispatcher.dispatchQueueSize(trackingQueueSize + ((long) this.analyticsUnprocessedEvents.size()), str);
    }

    public void handleAcquisitionResponseEvent(Event event) {
        if (!this.analyticsProperties.getReferrerTimerState().isTimerRunning()) {
            putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
            processEvents();
            return;
        }
        String str = LOG_TAG;
        Log.debug(str, "handleAcquisitionResponseEvent - Acquisition response received with referrer data.", new Object[0]);
        this.analyticsProperties.getReferrerTimerState().cancel();
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase != null) {
            hitDatabase.kickWithAdditionalData(null, event.getData() != null ? event.getData().optStringMap("contextdata", null) : null);
        } else {
            Log.warning(str, "handleAcquisitionResponseEvent - Unable to kick analytics hit with referrer data. Database Service is unavailable", new Object[0]);
        }
    }

    public void handleAnalyticsConsequenceEvent(Event event) {
        if (event == null) {
            Log.debug(LOG_TAG, "Ignoring analytics rules consequence, event was null.", new Object[0]);
        } else {
            putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
            processEvents();
        }
    }

    public void handleAnalyticsIdentityRequest(String str, int i10) {
        if (this.analyticsSharedData == null) {
            this.analyticsSharedData = new EventData();
        }
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore != null) {
            this.analyticsProperties.setAid(dataStore.getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null));
            this.analyticsProperties.setVid(dataStore.getString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", null));
        } else {
            Log.warning(LOG_TAG, "handleAnalyticsIdentityRequest - Unable to get AID from persistence. LocalStorage Service not initialized.", new Object[0]);
        }
        this.analyticsSharedData.putString(EventDataKeys.Analytics.ANALYTICS_ID, this.analyticsProperties.getAid());
        this.analyticsSharedData.putString(EventDataKeys.Identity.USER_IDENTIFIER, this.analyticsProperties.getVid());
        createSharedState(i10, this.analyticsSharedData);
        Log.trace(LOG_TAG, "handleAnalyticsIdentityRequest - New analytics response identity dispatched, with aid = %s, vid = %s", this.analyticsProperties.getAid(), this.analyticsProperties.getVid());
        this.analyticsIdentityResponseDispatcher.dispatch(this.analyticsProperties.getAid(), this.analyticsProperties.getVid(), str);
    }

    public void handleAnalyticsRequestEvent(Event event) {
        EventData data = event.getData();
        if (data.containsKey(EventDataKeys.Analytics.CLEAR_HITS_QUEUE)) {
            clearAllHits();
            return;
        }
        if (data.containsKey(EventDataKeys.Analytics.GET_QUEUE_SIZE)) {
            getTrackingQueueSize(event.getResponsePairID());
            return;
        }
        if (data.containsKey(EventDataKeys.Analytics.FORCE_KICK_HITS)) {
            putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
            processEvents();
        } else if (data.containsKey("action") || data.containsKey("state") || data.containsKey("contextdata")) {
            putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
            processEvents();
        }
    }

    public void handleConfigurationUpdateEvent(Event event) {
        if (event == null || event.getData() == null) {
            return;
        }
        putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
        processEvents();
    }

    public void handleGenericResetEvent(Event event) {
        Log.debug(LOG_TAG, "handleGenericResetEvent - queuing resetIdentities event.", new Object[0]);
        this.analyticsProperties.setLastResetIdentitiesTimestamp(event.getTimestampInSeconds());
        putEvent(event, null, null);
        processEvents();
    }

    public void handleHubBootedEvent(Event event) {
        putEvent(event, this.analyticsHardDependencies, new ArrayList());
        processEvents();
    }

    public void handleLifecycleRequestEvent(Event event) {
        putEvent(event, this.analyticsHardDependencies, null);
        processEvents();
    }

    public void handleLifecycleResponseEvent(Event event) {
        putEvent(event, this.analyticsHardDependencies, this.analyticsSoftDependencies);
        processEvents();
    }

    public void handleSharedStateUpdateEvent(String str) {
        if (this.analyticsHardDependencies.contains(str)) {
            processEvents();
        }
    }

    public void handleVisitorIdentifierRequest(AnalyticsState analyticsState, String str, String str2, int i10) {
        String aid = null;
        if (analyticsState.getPrivacyStatus() == MobilePrivacyStatus.OPT_OUT) {
            Log.trace(LOG_TAG, "handleVisitorIdentifierRequest - Returning null identifiers as privacy status is opt-out.", new Object[0]);
            this.analyticsIdentityResponseDispatcher.dispatch(null, null, str2);
            return;
        }
        if (getDataStore() == null) {
            Log.error(LOG_TAG, "handleVisitorIdentifierRequest - Unable to update visitor identifier in persistence. LocalStorage Service not initialized.", new Object[0]);
            return;
        }
        updateVIDInLocalStorage(str);
        AnalyticsProperties analyticsProperties = this.analyticsProperties;
        if (analyticsProperties != null) {
            analyticsProperties.setVid(str);
            aid = this.analyticsProperties.getAid();
        }
        EventData eventData = this.analyticsSharedData;
        if (eventData != null) {
            eventData.putString(EventDataKeys.Analytics.ANALYTICS_ID, aid);
            this.analyticsSharedData.putString(EventDataKeys.Identity.USER_IDENTIFIER, str);
        }
        createSharedState(i10, this.analyticsSharedData);
        this.analyticsIdentityResponseDispatcher.dispatch(aid, str, str2);
    }

    public void process(Event event, Map<String, EventData> map) {
        if (event == null || event.getData() == null) {
            Log.debug(LOG_TAG, "process - Failed to process this event; invalid event or null data", new Object[0]);
            return;
        }
        AnalyticsState analyticsState = new AnalyticsState(map);
        EventData data = event.getData();
        EventSource eventSource = event.getEventSource();
        EventType eventType = event.getEventType();
        EventType eventType2 = EventType.ANALYTICS;
        if ((eventType == eventType2 || eventType == EventType.GENERIC_TRACK) && eventSource == EventSource.REQUEST_CONTENT) {
            if (data.containsKey("state") || data.containsKey("action") || data.containsKey("contextdata")) {
                track(analyticsState, data, event.getTimestampInSeconds(), false, event.getUniqueIdentifier());
            }
            if (data.containsKey(EventDataKeys.Analytics.FORCE_KICK_HITS)) {
                forceKickEventsFromDB(analyticsState);
                return;
            }
            return;
        }
        if (eventType == EventType.LIFECYCLE && eventSource == EventSource.RESPONSE_CONTENT) {
            this.analyticsProperties.setLifecyclePreviousSessionPauseTimestamp(data.optLong("previoussessionpausetimestampmillis", 0L));
            trackLifecycle(analyticsState, event);
            return;
        }
        if (eventType == EventType.ACQUISITION && eventSource == EventSource.RESPONSE_CONTENT) {
            trackAcquisition(analyticsState, event);
            return;
        }
        if ((eventType == EventType.HUB && eventSource == EventSource.BOOTED) || (eventType == eventType2 && eventSource == EventSource.REQUEST_IDENTITY)) {
            if (data.containsKey(EventDataKeys.Identity.USER_IDENTIFIER)) {
                handleVisitorIdentifierRequest(analyticsState, data.optString(EventDataKeys.Identity.USER_IDENTIFIER, ""), event.getResponsePairID(), event.getEventNumber());
                return;
            } else {
                handleAnalyticsIdentityRequest(event.getResponsePairID(), event.getEventNumber());
                return;
            }
        }
        if (eventType == EventType.RULES_ENGINE && eventSource == EventSource.RESPONSE_CONTENT) {
            Map<String, Variant> mapOptVariantMap = data.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
            if (mapOptVariantMap != null) {
                track(analyticsState, new EventData(mapOptVariantMap.get("detail").optVariantMap(new HashMap())), event.getTimestampInSeconds(), false, event.getUniqueIdentifier());
                return;
            } else {
                Log.debug(LOG_TAG, "process - Triggered consequence is null, ignoring", new Object[0]);
                return;
            }
        }
        if (eventType == EventType.GENERIC_LIFECYLE && eventSource == EventSource.REQUEST_CONTENT) {
            processLifecycleRequest(analyticsState, event);
            return;
        }
        if (eventType == EventType.GENERIC_IDENTITY && eventSource == EventSource.REQUEST_RESET) {
            processGenericResetEvent(event);
        } else if (eventType == EventType.CONFIGURATION && eventSource == EventSource.RESPONSE_CONTENT) {
            updatePrivacyStatus(event.getEventNumber(), analyticsState);
        }
    }

    public Map<String, String> processAnalyticsContextData(AnalyticsState analyticsState, EventData eventData) {
        HashMap map = new HashMap();
        if (analyticsState.getDefaultData() != null) {
            map.putAll(analyticsState.getDefaultData());
        }
        Map<String, String> mapOptStringMap = eventData.optStringMap("contextdata", null);
        if (mapOptStringMap != null) {
            map.putAll(mapOptStringMap);
        }
        String strOptString = eventData.optString("action", null);
        boolean zOptBoolean = eventData.optBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, false);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            map.put(getActionKey(zOptBoolean), strOptString);
        }
        long lifecycleSessionStartTimestamp = analyticsState.getLifecycleSessionStartTimestamp();
        if (lifecycleSessionStartTimestamp > 0) {
            long lifecycleMaxSessionLength = analyticsState.getLifecycleMaxSessionLength();
            long timeSinceLaunch = getTimeSinceLaunch(lifecycleSessionStartTimestamp);
            if (timeSinceLaunch >= 0 && timeSinceLaunch <= lifecycleMaxSessionLength) {
                map.put("a.TimeSinceLaunch", String.valueOf(timeSinceLaunch));
            }
        }
        if (analyticsState.getPrivacyStatus() == MobilePrivacyStatus.UNKNOWN) {
            map.put("a.privacy.mode", "unknown");
        }
        String strOptString2 = eventData.optString("requestEventIdentifier", null);
        if (strOptString2 != null) {
            map.put("a.DebugEventIdentifier", strOptString2);
        }
        return map;
    }

    public void processAnalyticsIDRequest(Event event) {
        putEvent(event, this.analyticsHardDependencies, null);
        processEvents();
    }

    public Map<String, String> processAnalyticsVars(AnalyticsState analyticsState, EventData eventData, long j10) {
        HashMap map = new HashMap();
        String strOptString = eventData.optString("action", null);
        String strOptString2 = eventData.optString("state", null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            map.put("pe", "lnk_o");
            map.put("pev2", getActionPrefix(eventData.optBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, false)) + strOptString);
        }
        map.put("pageName", analyticsState.getApplicationID());
        if (!StringUtils.isNullOrEmpty(strOptString2)) {
            map.put("pageName", strOptString2);
        }
        if (!StringUtils.isNullOrEmpty(this.analyticsProperties.getAid())) {
            map.put(EventDataKeys.Analytics.ANALYTICS_ID, this.analyticsProperties.getAid());
        }
        String vid = this.analyticsProperties.getVid();
        if (!StringUtils.isNullOrEmpty(vid)) {
            map.put(EventDataKeys.Identity.USER_IDENTIFIER, vid);
        }
        map.put("ce", "UTF-8");
        map.put("t", AnalyticsProperties.TIMESTAMP_TIMEZONE_OFFSET);
        if (analyticsState.isOfflineTrackingEnabled()) {
            map.put("ts", Long.toString(j10));
        }
        if (analyticsState.isVisitorIDServiceEnabled()) {
            map.putAll(analyticsState.getAnalyticsIdVisitorParameters());
        }
        if (getPlatformServices() == null) {
            Log.warning(LOG_TAG, "processAnalyticsVars - Unable to access platform services. Platform services is null", new Object[0]);
            return null;
        }
        UIService uIService = getPlatformServices().getUIService();
        if (uIService == null || uIService.getAppState() != UIService.AppState.BACKGROUND) {
            map.put("cp", "foreground");
        } else {
            map.put("cp", "background");
        }
        return map;
    }

    public void processEvents() {
        AnalyticsUnprocessedEvent analyticsUnprocessedEventPeek;
        Map<String, EventData> sharedState;
        while (!this.analyticsUnprocessedEvents.isEmpty() && (sharedState = getSharedState((analyticsUnprocessedEventPeek = this.analyticsUnprocessedEvents.peek()))) != null) {
            process(analyticsUnprocessedEventPeek.getEvent(), sharedState);
            this.analyticsUnprocessedEvents.poll();
        }
    }

    public void processGenericResetEvent(Event event) {
        Log.debug(LOG_TAG, "processGenericResetEvent - Resetting all identifiers.", new Object[0]);
        clearAllHits();
        purgeAid();
        purgeVid();
        createSharedState(event.getEventNumber(), new EventData());
    }

    public void processLifecycleRequest(AnalyticsState analyticsState, Event event) {
        boolean z10 = false;
        if (analyticsState == null) {
            Log.debug(LOG_TAG, "processLifecycleRequest - Failed to track lifecycle event (invalid state)", new Object[0]);
            return;
        }
        String strOptString = event.getData().optString("action", null);
        if (EventDataKeys.Lifecycle.LIFECYCLE_START.equals(strOptString)) {
            long timestamp = event.getTimestamp() - this.analyticsProperties.getLifecyclePrevoiusPauseEventTimestamp();
            int iMin = Math.min(1000, analyticsState.getSessionTimeout());
            if (this.analyticsProperties.getLifecyclePrevoiusPauseEventTimestamp() != 0 && timestamp < iMin) {
                z10 = true;
            }
            if (this.analyticsProperties.getLifecycleTimerState().isTimerRunning() || z10) {
                return;
            }
            waitForLifecycleData();
            AnalyticsHitsDatabase hitDatabase = getHitDatabase();
            if (hitDatabase != null) {
                hitDatabase.resetIsWaitingFlag();
                hitDatabase.queue(null, "", 0L, false, true, event.getUniqueIdentifier());
            }
        }
        if (EventDataKeys.Lifecycle.LIFECYCLE_PAUSE.equals(strOptString)) {
            this.analyticsProperties.getLifecycleTimerState().cancel();
            this.analyticsProperties.getReferrerTimerState().cancel();
            this.analyticsProperties.setLifecyclePrevoiusPauseEventTimestamp(event.getTimestamp());
        }
    }

    public void purgeAid() {
        EventData eventData = this.analyticsSharedData;
        if (eventData != null) {
            eventData.putString(EventDataKeys.Analytics.ANALYTICS_ID, null);
        }
        AnalyticsProperties analyticsProperties = this.analyticsProperties;
        if (analyticsProperties != null) {
            analyticsProperties.setAid(null);
        }
        updateAIDInLocalStorage(null);
    }

    public void purgeVid() {
        EventData eventData = this.analyticsSharedData;
        if (eventData != null) {
            eventData.putString(EventDataKeys.Identity.USER_IDENTIFIER, null);
        }
        AnalyticsProperties analyticsProperties = this.analyticsProperties;
        if (analyticsProperties != null) {
            analyticsProperties.setVid(null);
        }
        updateVIDInLocalStorage(null);
    }

    public void putEvent(Event event, List<String> list, List<String> list2) {
        if (event == null || event.getData() == null) {
            return;
        }
        this.analyticsUnprocessedEvents.add(new AnalyticsUnprocessedEvent(event, list, list2));
    }

    public void registerAnalyticsDispatchers() {
        this.analyticsResponseDispatcher = (AnalyticsDispatcherAnalyticsResponseContent) createDispatcher(AnalyticsDispatcherAnalyticsResponseContent.class);
        this.analyticsIdentityResponseDispatcher = (AnalyticsDispatcherAnalyticsResponseIdentity) createDispatcher(AnalyticsDispatcherAnalyticsResponseIdentity.class);
    }

    public void track(AnalyticsState analyticsState, EventData eventData, long j10, boolean z10, String str) {
        if (eventData == null) {
            Log.debug(LOG_TAG, "track - Dropping the Analytics track request, request was null.", new Object[0]);
            return;
        }
        if (!analyticsState.isAnalyticsConfigured()) {
            Log.warning(LOG_TAG, "track - Dropping the Analytics track request, Analytics is not configured.", new Object[0]);
            return;
        }
        setMostRecentHitTimestampInSeconds(j10);
        if (MobilePrivacyStatus.OPT_OUT == analyticsState.getPrivacyStatus()) {
            Log.warning(LOG_TAG, "track - Dropping the Analytics track request, privacy status is opted out.", new Object[0]);
            return;
        }
        String strBuildRequest = this.analyticsRequestSerializer.buildRequest(analyticsState, processAnalyticsContextData(analyticsState, eventData), processAnalyticsVars(analyticsState, eventData, j10));
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase == null) {
            Log.warning(LOG_TAG, "track - Unable to queue analytic hit. Database Service is unavailable", new Object[0]);
            return;
        }
        if (z10) {
            hitDatabase.updateBackdatedHit(analyticsState, strBuildRequest, j10, str);
        } else {
            hitDatabase.queue(analyticsState, strBuildRequest, j10, this.analyticsProperties.isDatabaseWaiting(), false, str);
        }
        Log.debug(LOG_TAG, "track - Track Request Queued (%s)", strBuildRequest);
    }

    public void trackAcquisition(AnalyticsState analyticsState, Event event) {
        if (analyticsState == null) {
            Log.trace(LOG_TAG, "trackAcquisition - Failed to track acquisition event (invalid state)", new Object[0]);
            return;
        }
        Map<String, String> mapOptStringMap = event.getData().optStringMap("contextdata", new HashMap());
        if (!this.analyticsProperties.getReferrerTimerState().isTimerRunning()) {
            this.analyticsProperties.getReferrerTimerState().cancel();
            track(analyticsState, new EventData().putString("action", "AdobeLink").putStringMap("contextdata", mapOptStringMap).putBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, true), event.getTimestampInSeconds(), false, event.getUniqueIdentifier());
            return;
        }
        this.analyticsProperties.getReferrerTimerState().cancel();
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (hitDatabase != null) {
            hitDatabase.kickWithAdditionalData(analyticsState, mapOptStringMap);
        } else {
            Log.warning(LOG_TAG, "trackAcquisition - Unable to kick analytic hit with referrer data. Database Service is unavailable", new Object[0]);
        }
    }

    public void trackLifecycle(AnalyticsState analyticsState, Event event) {
        if (analyticsState == null) {
            Log.trace(LOG_TAG, "trackLifecycle - Failed to track lifecycle event (invalid state)", new Object[0]);
            return;
        }
        Map<String, String> mapOptStringMap = event.getData().optStringMap(EventDataKeys.Lifecycle.LIFECYCLE_CONTEXT_DATA, null);
        if (mapOptStringMap == null || mapOptStringMap.isEmpty()) {
            Log.trace(LOG_TAG, "trackLifecycle - Failed to track lifecycle event (context data was null or empty)", new Object[0]);
            return;
        }
        HashMap map = new HashMap(mapOptStringMap);
        HashMap map2 = new HashMap();
        String str = (String) map.remove("previousosversion");
        String str2 = (String) map.remove("previousappid");
        for (Map.Entry<String, String> entry : AnalyticsConstants.MAP_TO_CONTEXT_DATA_KEYS.entrySet()) {
            String str3 = (String) map.get(entry.getKey());
            if (!StringUtils.isNullOrEmpty(str3)) {
                map2.put(entry.getValue(), str3);
                map.remove(entry.getKey());
            }
        }
        map2.putAll(map);
        if (map2.containsKey("a.InstallEvent")) {
            waitForAcquisitionData(analyticsState, TimeUnit.SECONDS.toMillis(analyticsState.getReferrerTimeout()));
        } else if (map2.containsKey("a.LaunchEvent")) {
            waitForAcquisitionData(analyticsState, 500L);
        }
        if (analyticsState.isBackdateSessionInfoEnabled() && analyticsState.isOfflineTrackingEnabled()) {
            if (map2.containsKey("a.CrashEvent")) {
                map2.remove("a.CrashEvent");
                backdateLifecycleCrash(analyticsState, str, str2, event.getUniqueIdentifier());
            }
            if (map2.containsKey("a.PrevSessionLength")) {
                backdateLifecycleSessionInfo(analyticsState, (String) map2.remove("a.PrevSessionLength"), str, str2, event.getUniqueIdentifier());
            }
        }
        AnalyticsHitsDatabase hitDatabase = getHitDatabase();
        if (this.analyticsProperties.getLifecycleTimerState().isTimerRunning() && hitDatabase != null && hitDatabase.isHitWaiting()) {
            this.analyticsProperties.getLifecycleTimerState().cancel();
            hitDatabase.kickWithAdditionalData(analyticsState, map2);
        } else {
            this.analyticsProperties.getLifecycleTimerState().cancel();
            track(analyticsState, new EventData().putString("action", "Lifecycle").putStringMap("contextdata", map2).putBoolean(EventDataKeys.Analytics.TRACK_INTERNAL, true), event.getTimestampInSeconds(), false, event.getUniqueIdentifier());
        }
    }

    public void updatePrivacyStatus(int i10, AnalyticsState analyticsState) {
        if (analyticsState.getPrivacyStatus() == MobilePrivacyStatus.OPT_IN) {
            AnalyticsHitsDatabase hitDatabase = getHitDatabase();
            if (hitDatabase != null) {
                hitDatabase.kick(analyticsState, false);
                return;
            } else {
                Log.warning(LOG_TAG, "updatePrivacyStatus - Unable to kick the analytics hits. Database Service is unavailable", new Object[0]);
                return;
            }
        }
        if (analyticsState.getPrivacyStatus() == MobilePrivacyStatus.OPT_OUT) {
            clearAllHits();
            purgeAid();
            purgeVid();
            createSharedState(i10, new EventData());
        }
    }
}
