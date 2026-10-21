package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleExtension extends InternalModule {
    private static final String LOG_TAG = "LifecycleExtension";
    private final Queue<Event> eventQueue;
    private final Map<String, String> lifecycleContextData;
    private LifecycleDispatcherResponseContent lifecycleDispatcherResponseContent;
    private final LifecycleSession lifecycleSession;
    private final Map<String, String> previousSessionLifecycleContextData;

    public LifecycleExtension(EventHub eventHub, PlatformServices platformServices) {
        super(EventDataKeys.Lifecycle.MODULE_NAME, eventHub, platformServices);
        this.lifecycleContextData = new HashMap();
        this.previousSessionLifecycleContextData = new HashMap();
        this.eventQueue = new ConcurrentLinkedQueue();
        this.lifecycleSession = new LifecycleSession(getDataStore());
        registerListeners();
        createDispatchers();
    }

    private void createDispatchers() {
        this.lifecycleDispatcherResponseContent = (LifecycleDispatcherResponseContent) createDispatcher(LifecycleDispatcherResponseContent.class);
    }

    private LocalStorageService.DataStore getDataStore() {
        PlatformServices platformServices = getPlatformServices();
        if (platformServices == null) {
            Log.debug(LOG_TAG, "Unable to retrieve LocalStorageService, %s (Platform Service)", "Unexpected Null Value");
            return null;
        }
        LocalStorageService localStorageService = platformServices.getLocalStorageService();
        if (localStorageService == null) {
            return null;
        }
        return localStorageService.getDataStore("AdobeMobile_Lifecycle");
    }

    private JsonUtilityService getJsonUtilityService() {
        PlatformServices platformServices = getPlatformServices();
        if (platformServices != null) {
            return platformServices.getJsonUtilityService();
        }
        Log.debug(LOG_TAG, "Unable to retrieve JsonUtilityService, %s (Platform Services)", "Unexpected Null Value");
        return null;
    }

    private SystemInfoService getSystemInfoService() {
        PlatformServices platformServices = getPlatformServices();
        if (platformServices != null) {
            return platformServices.getSystemInfoService();
        }
        Log.debug(LOG_TAG, "Unable to retrieve System Services, %s (Platform Services)", "Unexpected Null Value");
        return null;
    }

    private boolean isInstall() {
        LocalStorageService.DataStore dataStore = getDataStore();
        return (dataStore == null || dataStore.contains("InstallDate")) ? false : true;
    }

    private boolean isUpgrade() {
        LocalStorageService.DataStore dataStore = getDataStore();
        String string = dataStore != null ? dataStore.getString("LastVersion", "") : "";
        SystemInfoService systemInfoService = getSystemInfoService();
        return (systemInfoService == null || string.equalsIgnoreCase(systemInfoService.getApplicationVersion())) ? false : true;
    }

    private void persistLifecycleContextData(long j10) {
        JsonUtilityService.JSONObject jSONObjectCreateJSONObject;
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_TAG, "Failed to update lifecycle data, %s (DataStore)", "Unexpected Null Value");
            return;
        }
        JsonUtilityService jsonUtilityService = getJsonUtilityService();
        if (jsonUtilityService != null && (jSONObjectCreateJSONObject = jsonUtilityService.createJSONObject(this.lifecycleContextData)) != null) {
            dataStore.setString("LifecycleData", jSONObjectCreateJSONObject.toString());
        }
        dataStore.setLong("LastDateUsed", j10);
        SystemInfoService systemInfoService = getSystemInfoService();
        if (systemInfoService != null) {
            dataStore.setString("LastVersion", systemInfoService.getApplicationVersion());
        }
    }

    private void processRequestContentEvent(Event event, EventData eventData) {
        EventData data = event.getData();
        if (data == null) {
            Log.trace(LOG_TAG, "Failed to process lifecycle event '%s for %s (%d)'", "Unexpected Null Value", event.getName(), Integer.valueOf(event.getEventNumber()));
            return;
        }
        String strOptString = data.optString("action", null);
        if (EventDataKeys.Lifecycle.LIFECYCLE_START.equals(strOptString)) {
            start(event, eventData);
        } else if (EventDataKeys.Lifecycle.LIFECYCLE_PAUSE.equals(strOptString)) {
            pause(event);
        } else {
            Log.trace(LOG_TAG, "Failed to process lifecycle event, invalid action (%s)", strOptString);
        }
    }

    private void registerListeners() {
        registerListener(EventType.GENERIC_LIFECYLE, EventSource.REQUEST_CONTENT, LifecycleListenerRequestContent.class);
        EventType eventType = EventType.HUB;
        registerListener(eventType, EventSource.SHARED_STATE, LifecycleListenerSharedState.class);
        registerListener(eventType, EventSource.BOOTED, LifecycleListenerHubBooted.class);
    }

    private void updateLifecycleSharedState(int i10, long j10, Map<String, String> map) {
        EventData eventData = new EventData();
        eventData.putLong(EventDataKeys.Lifecycle.SESSION_START_TIMESTAMP, j10);
        eventData.putLong(EventDataKeys.Lifecycle.MAX_SESSION_LENGTH, LifecycleConstants.MAX_SESSION_LENGTH_SECONDS);
        eventData.putStringMap(EventDataKeys.Lifecycle.LIFECYCLE_CONTEXT_DATA, map);
        createSharedState(i10, eventData);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public void checkForApplicationUpgrade(Map<String, String> map) {
        Map<String, String> contextData;
        if (isInstall() || !isUpgrade() || (contextData = getContextData()) == null || contextData.isEmpty()) {
            return;
        }
        String str = map.get("appid");
        contextData.put("appid", str);
        if (!this.lifecycleContextData.isEmpty()) {
            this.lifecycleContextData.putAll(contextData);
            return;
        }
        this.previousSessionLifecycleContextData.put("appid", str);
        LocalStorageService.DataStore dataStore = getDataStore();
        JsonUtilityService jsonUtilityService = getJsonUtilityService();
        JsonUtilityService.JSONObject jSONObjectCreateJSONObject = jsonUtilityService != null ? jsonUtilityService.createJSONObject(contextData) : null;
        if (dataStore == null || jSONObjectCreateJSONObject == null) {
            return;
        }
        dataStore.setString("LifecycleData", jSONObjectCreateJSONObject.toString());
    }

    public String getAdvertisingIdentifier(Event event) {
        if (event == null) {
            Log.trace(LOG_TAG, "Failed to get advertising identifier, %s (Event)", "Unexpected Null Value");
            return null;
        }
        EventData sharedEventState = getSharedEventState(EventDataKeys.Identity.MODULE_NAME, event);
        if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
            return null;
        }
        return sharedEventState.optString(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, null);
    }

    public Map<String, String> getContextData() {
        if (!this.lifecycleContextData.isEmpty()) {
            return new HashMap(this.lifecycleContextData);
        }
        if (!this.previousSessionLifecycleContextData.isEmpty()) {
            return new HashMap(this.previousSessionLifecycleContextData);
        }
        this.previousSessionLifecycleContextData.putAll(getPersistedContextData());
        return new HashMap(this.previousSessionLifecycleContextData);
    }

    public Queue<Event> getEventQueue() {
        return this.eventQueue;
    }

    public Map<String, String> getPersistedContextData() {
        LocalStorageService.DataStore dataStore = getDataStore();
        JsonUtilityService jsonUtilityService = getJsonUtilityService();
        HashMap map = new HashMap();
        if (dataStore != null && jsonUtilityService != null) {
            String string = dataStore.getString("LifecycleData", null);
            Map<String, String> mapMapFromJsonObject = StringUtils.isNullOrEmpty(string) ? null : jsonUtilityService.mapFromJsonObject(jsonUtilityService.createJSONObject(string));
            if (mapMapFromJsonObject != null) {
                map.putAll(mapMapFromJsonObject);
            } else {
                Log.warning(LOG_TAG, "Failed to read lifecycle data from persistence", new Object[0]);
            }
        }
        return map;
    }

    public void handleEventHubBootEvent(Event event) {
        HashMap map = new HashMap();
        Map<String, String> contextData = getContextData();
        if (contextData != null) {
            map.putAll(contextData);
        }
        map.putAll(new LifecycleMetricsBuilder(getSystemInfoService(), getDataStore(), event.getTimestampInSeconds()).addCoreData().addGenericData().build());
        updateLifecycleSharedState(event.getEventNumber(), 0L, map);
    }

    public void handleSharedStateUpdateEvent(Event event) {
        if (event == null) {
            Log.trace(LOG_TAG, "Failed to process state change event, %s(Event)", "Unexpected Null Value");
            return;
        }
        EventData data = event.getData();
        if (data == null) {
            Log.trace(LOG_TAG, "Failed to process state change event, %s (Data)", "Unexpected Null Value");
        } else if (EventDataKeys.Configuration.MODULE_NAME.equals(data.optString(EventDataKeys.EVENT_STATE_OWNER, null))) {
            processQueuedEvents();
        }
    }

    public void pause(Event event) {
        this.lifecycleSession.pause(event.getTimestampInSeconds());
    }

    public void processQueuedEvents() {
        while (!this.eventQueue.isEmpty()) {
            EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, this.eventQueue.peek());
            if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
                Log.trace(LOG_TAG, "Configuration is pending, waiting...", new Object[0]);
                return;
            }
            processRequestContentEvent(this.eventQueue.poll(), sharedEventState);
        }
    }

    public void queueEvent(Event event) {
        if (event == null) {
            return;
        }
        this.eventQueue.add(event);
        processQueuedEvents();
    }

    public void start(Event event, EventData eventData) {
        HashMap map;
        long timestampInSeconds = event.getTimestampInSeconds();
        SystemInfoService systemInfoService = getSystemInfoService();
        LocalStorageService.DataStore dataStore = getDataStore();
        String string = dataStore.getString("OsVersion", "");
        String string2 = dataStore.getString("AppId", "");
        Map<String, String> mapBuild = new LifecycleMetricsBuilder(systemInfoService, dataStore, timestampInSeconds).addCoreData().addGenericData().build();
        checkForApplicationUpgrade(mapBuild);
        long jOptInteger = eventData.optInteger(EventDataKeys.Configuration.LIFECYCLE_CONFIG_SESSION_TIMEOUT, 300);
        LifecycleSession.SessionInfo sessionInfoStart = this.lifecycleSession.start(timestampInSeconds, jOptInteger, mapBuild);
        if (sessionInfoStart == null) {
            updateLifecycleSharedState(event.getEventNumber(), dataStore.getLong("SessionStart", 0L), getContextData());
            return;
        }
        this.lifecycleContextData.clear();
        HashMap map2 = new HashMap();
        if (isInstall()) {
            map2.putAll(new LifecycleMetricsBuilder(systemInfoService, dataStore, timestampInSeconds).addInstallData().addGenericData().addCoreData().build());
            map = map2;
        } else {
            map2.putAll(new LifecycleMetricsBuilder(systemInfoService, dataStore, timestampInSeconds).addLaunchData().addUpgradeData(isUpgrade()).addCrashData(sessionInfoStart.isCrash()).addGenericData().addCoreData().build());
            map = map2;
            Map<String, String> sessionData = this.lifecycleSession.getSessionData(timestampInSeconds, jOptInteger, sessionInfoStart);
            if (sessionData != null) {
                map.putAll(sessionData);
            }
            if (!string.isEmpty()) {
                map.put("previousosversion", string);
            }
            if (!string2.isEmpty()) {
                map.put("previousappid", string2);
            }
        }
        Map<String, String> mapOptStringMap = event.getData().optStringMap(EventDataKeys.Lifecycle.ADDITIONAL_CONTEXT_DATA, null);
        if (mapOptStringMap != null) {
            map.putAll(mapOptStringMap);
        }
        String advertisingIdentifier = getAdvertisingIdentifier(event);
        if (!StringUtils.isNullOrEmpty(advertisingIdentifier)) {
            map.put(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, advertisingIdentifier);
        }
        this.lifecycleContextData.putAll(map);
        persistLifecycleContextData(timestampInSeconds);
        updateLifecycleSharedState(event.getEventNumber(), timestampInSeconds, getContextData());
        this.lifecycleDispatcherResponseContent.dispatchSessionStart(timestampInSeconds, getContextData(), sessionInfoStart.getStartTimestampInSeconds(), sessionInfoStart.getPauseTimestampInSeconds());
    }

    public void updateContextData(Map<String, String> map, int i10) {
        if (map == null) {
            return;
        }
        this.lifecycleContextData.putAll(map);
        new EventData().putStringMap(EventDataKeys.Lifecycle.LIFECYCLE_CONTEXT_DATA, new HashMap(this.lifecycleContextData));
        LocalStorageService.DataStore dataStore = getDataStore();
        updateLifecycleSharedState(i10, dataStore != null ? dataStore.getLong("SessionStart", 0L) : 0L, this.lifecycleContextData);
    }
}
