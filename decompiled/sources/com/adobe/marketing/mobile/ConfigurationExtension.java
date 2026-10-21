package com.adobe.marketing.mobile;

import ad.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationExtension extends InternalModule {
    private static final String ADOBE_CACHE_DIR = "adbdownloadcache";
    private static final String BUNDLED_RULES_ZIP_FILE = "ADBMobileConfig-rules.zip";
    private static final String CONFIGURATION_URL_BASE = "https://assets.adobedtm.com/%s.json";
    private static final String CONFIG_BUNDLED_FILE_NAME = "ADBMobileConfig.json";
    private static final String CONFIG_MANIFEST_APPID_KEY = "ADBMobileAppID";
    private static final String CONFIG_REMOTE_SERVER = "com.adobe.marketing.mobile.RemoteConfigServer";
    private static final String DATASTORE_KEY = "AdobeMobile_ConfigState";
    private static final int DEFAULT_NOT_DOWNLOAD_RULES_WITHIN_TIME_SEC = 15;
    static final String LOG_SOURCE = "ConfigurationExtension";
    static int NOT_DOWNLOAD_RULES_WITHIN_TIME_SEC = 15;
    private static final String PERSISTED_APPID = "config.appID";
    private static final String PERSISTED_OVERRIDDEN_CONFIG = "config.overridden.map";
    private static final String PERSISTED_RULES_URL = "config.last.rules.url";
    private static final String RULES_CACHE_FOLDER = "configRules";
    private static final String RULES_JSON_CONDITION_KEY = "condition";
    private static final String RULES_JSON_CONSEQUENCES_KEY = "consequences";
    private static final String RULES_JSON_FILE_NAME = "rules.json";
    private static final String RULES_JSON_KEY = "rules";
    private final List<Event> cachedEvents;
    private ConcurrentHashMap<String, Long> cachedRulesDownloadTime;
    private ConfigurationData currentConfig;
    final ConcurrentLinkedQueue<Event> getsdkIdsEventQueue;
    private boolean isUnregistered;
    private AtomicBoolean needToProcessEvents;
    private ConfigurationData programmaticConfig;
    private final ConfigurationDispatcherConfigurationRequestContent requestDispatcher;
    private final ConfigurationDispatcherConfigurationResponseContent responseDispatcher;
    private final ConfigurationDispatcherConfigurationResponseIdentity responseIdentityDispatcher;
    private final ExecutorService rulesDownloadExecutor;
    private ConfigurationData unmergedConfiguration;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.ConfigurationExtension$1State, reason: invalid class name */
    public class C1State {
        public boolean isListenerRegistered = false;

        public C1State() {
        }
    }

    public ConfigurationExtension(EventHub eventHub, PlatformServices platformServices) throws Throwable {
        super(EventDataKeys.Configuration.MODULE_NAME, eventHub, platformServices);
        this.needToProcessEvents = new AtomicBoolean(true);
        this.getsdkIdsEventQueue = new ConcurrentLinkedQueue<>();
        this.cachedRulesDownloadTime = new ConcurrentHashMap<>();
        EventType eventType = EventType.CONFIGURATION;
        registerListener(eventType, EventSource.REQUEST_CONTENT, ConfigurationListenerRequestContent.class);
        registerListener(EventType.HUB, EventSource.BOOTED, ConfigurationListenerBootEvent.class);
        registerListener(eventType, EventSource.REQUEST_IDENTITY, ConfigurationListenerRequestIdentity.class);
        registerWildcardListener(ConfigurationWildCardListener.class);
        this.requestDispatcher = createRequestDispatcher();
        this.responseDispatcher = createResponseDispatcher();
        this.responseIdentityDispatcher = createResponseIdentityDispatcher();
        this.rulesDownloadExecutor = Executors.newSingleThreadExecutor();
        this.cachedEvents = Collections.synchronizedList(new ArrayList());
        if (retrieveCachedRules(retrieveRulesURLFromPersistence())) {
            return;
        }
        Log.debug(LOG_SOURCE, "Failed to apply cached rules. Attempting to apply bundled rules.", new Object[0]);
        applyBundledRules();
    }

    private void changeConfiguration(Event event, ConfigurationData configurationData, boolean z10) {
        EventData eventData = configurationData.getEventData();
        createSharedState(event.getEventNumber(), eventData);
        Log.trace(LOG_SOURCE, "Shared state is created for event number %d with data \n %s", Integer.valueOf(event.getEventNumber()), eventData);
        if (z10) {
            final String strOptString = configurationData.getEventData().optString(EventDataKeys.Configuration.RULES_CONFIG_URL, "");
            this.rulesDownloadExecutor.execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.9
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigurationExtension.this.downloadRules(strOptString);
                }
            });
        }
        this.responseDispatcher.dispatchConfigResponseWithEventData(eventData, event.getPairID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadRules(String str) throws Throwable {
        PlatformServices platformServices;
        long unixTimeInSeconds = TimeUtil.getUnixTimeInSeconds();
        Long l6 = this.cachedRulesDownloadTime.get(str);
        if (l6 != null && unixTimeInSeconds - l6.longValue() < NOT_DOWNLOAD_RULES_WITHIN_TIME_SEC) {
            Log.debug(LOG_SOURCE, "Will not download rules from same url in 30 sec. ", new Object[0]);
            return;
        }
        this.cachedRulesDownloadTime.put(str, Long.valueOf(unixTimeInSeconds));
        saveRulesURLToPersistence(str);
        if (StringUtils.isNullOrEmpty(str) || (platformServices = getPlatformServices()) == null) {
            return;
        }
        try {
            onRulesDownloaded(new RulesRemoteDownloader(platformServices.getNetworkService(), platformServices.getSystemInfoService(), platformServices.getCompressedFileService(), str, RULES_CACHE_FOLDER).startDownloadSync());
        } catch (MissingPlatformServicesException e5) {
            Log.debug(LOG_SOURCE, "Unable to download remote rules. Exception: %s", e5);
        }
    }

    private List<Event> generateConsequenceEvents(JsonUtilityService.JSONArray jSONArray) throws JsonException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            RuleConsequence ruleConsequenceConsequenceFromJson = RuleConsequence.consequenceFromJson(jSONArray.getJSONObject(i10), getPlatformServices().getJsonUtilityService());
            if (ruleConsequenceConsequenceFromJson != null) {
                arrayList.add(new Event.Builder("Rules Event", EventType.RULES_ENGINE, EventSource.RESPONSE_CONTENT).setData(ruleConsequenceConsequenceFromJson.generateEventData()).build());
            }
        }
        return arrayList;
    }

    private String getAppIDFromManifest() {
        if (getPlatformServices() == null) {
            Log.debug(LOG_SOURCE, "%s (Platform services)", "Unexpected Null Value");
            return null;
        }
        if (getPlatformServices().getSystemInfoService() == null) {
            Log.debug(LOG_SOURCE, "%s (System Info services)", "Unexpected Null Value");
            return null;
        }
        SystemInfoService systemInfoService = getPlatformServices().getSystemInfoService();
        if (systemInfoService == null) {
            Log.debug(LOG_SOURCE, "%s (System info service), unable to read AppID from manifest", "Unexpected Null Value");
            return null;
        }
        String property = systemInfoService.getProperty(CONFIG_MANIFEST_APPID_KEY);
        if (StringUtils.isNullOrEmpty(property)) {
            return null;
        }
        Log.trace(LOG_SOURCE, " Valid AppID is retrieved from manifest - %s", property);
        saveAppIdToPersistence(property);
        return property;
    }

    private LocalStorageService.DataStore getDataStore() {
        if (getPlatformServices() == null) {
            Log.debug(LOG_SOURCE, "%s (Platform services)", "Unexpected Null Value");
            return null;
        }
        if (getPlatformServices().getLocalStorageService() != null) {
            return getPlatformServices().getLocalStorageService().getDataStore(DATASTORE_KEY);
        }
        Log.debug(LOG_SOURCE, "%s (Local Storage services)", "Unexpected Null Value");
        return null;
    }

    private JsonUtilityService getJSONUtilityService() {
        if (getPlatformServices() == null) {
            Log.debug(LOG_SOURCE, "%s (Platform services)", "Unexpected Null Value");
            return null;
        }
        if (getPlatformServices().getJsonUtilityService() != null) {
            return getPlatformServices().getJsonUtilityService();
        }
        Log.debug(LOG_SOURCE, "%s (JSON Utility services)", "Unexpected Null Value");
        return null;
    }

    private String getValidAppID() {
        String strRetrieveAppIdFromPersistence = retrieveAppIdFromPersistence();
        if (StringUtils.isNullOrEmpty(strRetrieveAppIdFromPersistence)) {
            return getAppIDFromManifest();
        }
        Log.trace(LOG_SOURCE, "Valid AppID is retrieved from persistence - %s", strRetrieveAppIdFromPersistence);
        return strRetrieveAppIdFromPersistence;
    }

    private boolean loadCachedConfig(String str, Event event) {
        ConfigurationDownloader configDownloader = getConfigDownloader(str);
        if (configDownloader == null) {
            return false;
        }
        String strLoadCachedConfig = configDownloader.loadCachedConfig();
        if (StringUtils.isNullOrEmpty(strLoadCachedConfig)) {
            Log.trace(LOG_SOURCE, "Nothing is loaded from cached file", new Object[0]);
            return false;
        }
        Log.debug(LOG_SOURCE, "Cached configuration loaded. \n %s", strLoadCachedConfig);
        configureWithJsonString(strLoadCachedConfig, event, false);
        return true;
    }

    private boolean loadProgrammaticConfig(Event event) {
        if (this.programmaticConfig.isEmpty()) {
            return false;
        }
        changeConfiguration(event, this.programmaticConfig, true);
        return true;
    }

    private void onRulesDownloaded(File file) throws Throwable {
        if (file == null || !file.isDirectory()) {
            unregisterAllRules();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getPath());
        replaceRulesAndReprocessEvents(parseRulesFromJsonObject(getPlatformServices().getJsonUtilityService().createJSONObject(readFromFile(new File(d.f(sb2, File.separator, RULES_JSON_FILE_NAME))))));
    }

    private List<Rule> parseRulesFromJsonObject(JsonUtilityService.JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            JsonUtilityService.JSONArray jSONArray = jSONObject.getJSONArray(RULES_JSON_KEY);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JsonUtilityService.JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    arrayList.add(new Rule(RuleCondition.ruleConditionFromJson(jSONObject2.getJSONObject("condition")), generateConsequenceEvents(jSONObject2.getJSONArray(RULES_JSON_CONSEQUENCES_KEY))));
                } catch (JsonException e5) {
                    Log.debug(LOG_SOURCE, "Unable to parse individual rule json. Exception: (%s)", e5);
                } catch (UnsupportedConditionException e7) {
                    Log.debug(LOG_SOURCE, "Unable to parse individual rule conditions. Exception: (%s)", e7);
                } catch (IllegalArgumentException e10) {
                    Log.debug(LOG_SOURCE, "Unable to create rule object. Exception: (%s)", e10);
                }
            }
            return arrayList;
        } catch (JsonException e11) {
            Log.debug(LOG_SOURCE, "Unable to parse rules. Exception: (%s)", e11);
            return arrayList;
        }
    }

    private void processBootEvent(Event event) {
        Log.trace(LOG_SOURCE, "Processing boot configuration event", new Object[0]);
        retrieveProgrammaticConfigFromPersistence();
        String validAppID = getValidAppID();
        if (!StringUtils.isNullOrEmpty(validAppID)) {
            this.requestDispatcher.dispatchInternalConfigureWithAppIdEvent(validAppID);
            if (loadCachedConfig(validAppID, event)) {
                return;
            }
        }
        if (loadBundledConfig(event, CONFIG_BUNDLED_FILE_NAME)) {
            return;
        }
        loadProgrammaticConfig(event);
    }

    private String readContentFromAsset(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.debug(LOG_SOURCE, "Invalid asset file name.", new Object[0]);
            return null;
        }
        if (getPlatformServices() == null) {
            Log.debug(LOG_SOURCE, "%s (Platform services)", "Unexpected Null Value");
            return null;
        }
        SystemInfoService systemInfoService = getPlatformServices().getSystemInfoService();
        if (systemInfoService == null) {
            Log.debug(LOG_SOURCE, "%s (System info services), unable to read bundled configuration", "Unexpected Null Value");
            return null;
        }
        InputStream asset = systemInfoService.getAsset(str);
        if (asset == null) {
            return null;
        }
        return StringUtils.streamToString(asset);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v8 */
    private String readFromFile(File file) throws Throwable {
        ?? r10;
        Throwable th2;
        FileInputStream fileInputStream;
        String strStreamToString = null;
        if (file != null) {
            int i10 = 2;
            i10 = 2;
            i10 = 2;
            i10 = 2;
            i10 = 2;
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        strStreamToString = StringUtils.streamToString(fileInputStream);
                        try {
                            fileInputStream.close();
                            r10 = fileInputStream;
                        } catch (Exception e5) {
                            Log.trace(LOG_SOURCE, "Failed to close stream for %s, with Exception: %s", file, e5);
                        }
                    } catch (IOException e7) {
                        e = e7;
                        Log.debug(LOG_SOURCE, "Could not read the rules json file! Exception: (%s)", e);
                        r10 = fileInputStream;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                r10 = fileInputStream;
                            } catch (Exception e10) {
                                Object[] objArr = {file, e10};
                                Log.trace(LOG_SOURCE, "Failed to close stream for %s, with Exception: %s", objArr);
                                i10 = objArr;
                                r10 = e10;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (Exception e11) {
                            String str = LOG_SOURCE;
                            Object[] objArr2 = new Object[i10];
                            objArr2[0] = file;
                            objArr2[1] = e11;
                            Log.trace(str, "Failed to close stream for %s, with Exception: %s", objArr2);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th4) {
                r10 = 0;
                th2 = th4;
                if (r10 != 0) {
                    r10.close();
                }
                throw th2;
            }
        }
        return strStreamToString;
    }

    private void removeAppIdFromPersistence() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to remove appId from persistence", "Unexpected Null Value");
        } else {
            Log.trace(LOG_SOURCE, "Removing appID from persistence", new Object[0]);
            dataStore.remove(PERSISTED_APPID);
        }
    }

    private void removeProgrammaticConfigFromPersistence() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to remove overridden configuration from persistence", "Unexpected Null Value");
        } else {
            Log.trace(LOG_SOURCE, "Removing overridden configuration from persistence", new Object[0]);
            dataStore.remove(PERSISTED_OVERRIDDEN_CONFIG);
        }
    }

    private String retrieveAppIdFromPersistence() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to load appId from persistence", "Unexpected Null Value");
            return null;
        }
        String string = dataStore.getString(PERSISTED_APPID, null);
        Log.trace(LOG_SOURCE, "AppID loaded from persistence - %s", string);
        return string;
    }

    private boolean retrieveCachedRules(String str) throws Throwable {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.trace(LOG_SOURCE, "Remote rules URL is empty.", new Object[0]);
            return false;
        }
        PlatformServices platformServices = getPlatformServices();
        if (platformServices == null) {
            Log.trace(LOG_SOURCE, "Cannot retrieve cached rules. PlatformServices are missing.", new Object[0]);
            return false;
        }
        try {
            onRulesDownloaded(new RulesRemoteDownloader(platformServices.getNetworkService(), platformServices.getSystemInfoService(), platformServices.getCompressedFileService(), str, RULES_CACHE_FOLDER).getCachedRulesFile());
            return true;
        } catch (MissingPlatformServicesException e5) {
            Log.debug(LOG_SOURCE, "Unable to read cached remote rules. Exception: (%s)", e5);
            return false;
        }
    }

    private void retrieveProgrammaticConfigFromPersistence() {
        if (getJSONUtilityService() == null) {
            return;
        }
        this.programmaticConfig = new ConfigurationData(getJSONUtilityService());
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Local storage service), unable to load overridden config from persistence", "Unexpected Null Value");
            return;
        }
        String string = dataStore.getString(PERSISTED_OVERRIDDEN_CONFIG, null);
        Log.trace(LOG_SOURCE, "Loading overridden configuration from persistence - \n %s", string);
        this.programmaticConfig = new ConfigurationData(getJSONUtilityService()).put(string);
    }

    private String retrieveRulesURLFromPersistence() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to load the last known rules URL from persistence", "Unexpected Null Value");
            return null;
        }
        String string = dataStore.getString(PERSISTED_RULES_URL, null);
        Log.trace(LOG_SOURCE, "Last known rules URL loaded from persistence - %s", string);
        return string;
    }

    private void saveAppIdToPersistence(String str) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to save appId to persistence", "Unexpected Null Value");
        } else {
            Log.trace(LOG_SOURCE, "Saving appID to persistence - %s", str);
            dataStore.setString(PERSISTED_APPID, str);
        }
    }

    private void saveProgrammaticConfigToPersistence(ConfigurationData configurationData) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Local storage service), unable to save overridden config to persistence", "Unexpected Null Value");
        } else {
            Log.trace(LOG_SOURCE, "Saving the overridden configuration to persistence - \n %s", configurationData);
            dataStore.setString(PERSISTED_OVERRIDDEN_CONFIG, configurationData.getJSONString());
        }
    }

    private void saveRulesURLToPersistence(String str) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "%s (Storage Service), unable to save the last known rules URL to persistence", "Unexpected Null Value");
        } else {
            Log.trace(LOG_SOURCE, "Saving last known rules URL to persistence - %s", str);
            dataStore.setString(PERSISTED_RULES_URL, str);
        }
    }

    private boolean validateForInternalEventAppIDChange(EventData eventData, String str) {
        return !eventData.optBoolean("config.isinternalevent", false) || str.equals(getValidAppID());
    }

    public void applyBundledRules() throws Throwable {
        PlatformServices platformServices = getPlatformServices();
        if (platformServices == null) {
            Log.trace(LOG_SOURCE, "Cannot retrieve bundled rules. PlatformServices are missing.", new Object[0]);
            return;
        }
        CompressedFileService compressedFileService = platformServices.getCompressedFileService();
        SystemInfoService systemInfoService = platformServices.getSystemInfoService();
        if (compressedFileService == null || systemInfoService == null) {
            Log.trace(LOG_SOURCE, "Cannot retrieve bundled rules. PlatformServices are missing.", new Object[0]);
            return;
        }
        InputStream asset = systemInfoService.getAsset(BUNDLED_RULES_ZIP_FILE);
        if (asset == null) {
            Log.debug(LOG_SOURCE, "No bundled rules found.", new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(systemInfoService.getApplicationCacheDir().getAbsolutePath());
        String str = File.separator;
        File file = new File(d.f(sb2, str, ADOBE_CACHE_DIR));
        if (!file.exists() && !file.mkdir()) {
            Log.trace(LOG_SOURCE, "Unable to write to or create cache directory for storing bundled rules.", new Object[0]);
            return;
        }
        String str2 = file.getPath() + str + BUNDLED_RULES_ZIP_FILE;
        if (!FileUtil.readInputStreamIntoFile(new File(str2), asset, false)) {
            Log.trace(LOG_SOURCE, "Failed to read bundled rules into cache.", new Object[0]);
        } else if (!compressedFileService.extract(new File(str2), CompressedFileService.FileType.ZIP, file.getPath())) {
            Log.trace(LOG_SOURCE, "Failed to extract bundled rules.", new Object[0]);
        } else {
            Log.debug(LOG_SOURCE, "Applying bundled rules.", new Object[0]);
            onRulesDownloaded(file);
        }
    }

    public void configureWithJsonString(String str, Event event, boolean z10) {
        if (getJSONUtilityService() == null) {
            return;
        }
        ConfigurationData configurationDataPut = new ConfigurationData(getJSONUtilityService()).put(str);
        if (configurationDataPut.isEmpty()) {
            Log.debug(LOG_SOURCE, "Empty configuration found when processing JSON string.", new Object[0]);
            return;
        }
        retrieveProgrammaticConfigFromPersistence();
        this.unmergedConfiguration = new ConfigurationData(getJSONUtilityService()).put(str);
        this.currentConfig = configurationDataPut;
        configurationDataPut.put(this.programmaticConfig);
        changeConfiguration(event, this.currentConfig, z10);
    }

    public ConfigurationDispatcherConfigurationRequestContent createRequestDispatcher() {
        return (ConfigurationDispatcherConfigurationRequestContent) createDispatcher(ConfigurationDispatcherConfigurationRequestContent.class);
    }

    public ConfigurationDispatcherConfigurationResponseContent createResponseDispatcher() {
        return (ConfigurationDispatcherConfigurationResponseContent) createDispatcher(ConfigurationDispatcherConfigurationResponseContent.class);
    }

    public ConfigurationDispatcherConfigurationResponseIdentity createResponseIdentityDispatcher() {
        return (ConfigurationDispatcherConfigurationResponseIdentity) createDispatcher(ConfigurationDispatcherConfigurationResponseIdentity.class);
    }

    public ConfigurationDownloader getConfigDownloader(String str) {
        if (getPlatformServices() == null) {
            Log.debug(LOG_SOURCE, "%s (Platform services)", "Unexpected Null Value");
            return null;
        }
        if (getPlatformServices().getSystemInfoService() == null) {
            Log.debug(LOG_SOURCE, "%s (System Info services)", "Unexpected Null Value");
            return null;
        }
        String str2 = String.format(CONFIGURATION_URL_BASE, str);
        SystemInfoService systemInfoService = getPlatformServices().getSystemInfoService();
        if (systemInfoService != null) {
            String property = systemInfoService.getProperty(CONFIG_REMOTE_SERVER);
            if (!StringUtils.isNullOrEmpty(property)) {
                str2 = String.format(property, str);
            }
        }
        if (getPlatformServices().getNetworkService() == null) {
            Log.debug(LOG_SOURCE, "%s (Network services)", "Unexpected Null Value");
            return null;
        }
        try {
            return new ConfigurationDownloader(getPlatformServices().getNetworkService(), getPlatformServices().getSystemInfoService(), str2);
        } catch (MissingPlatformServicesException e5) {
            Log.warning(LOG_SOURCE, "Unable to Initialize Downloader (%s)", e5);
            return null;
        }
    }

    public void handleBootEvent(Event event) {
        processBootEvent(event);
    }

    public void handleEvent(final Event event) {
        Log.trace(LOG_SOURCE, "Handling the configuration event: %s", Integer.valueOf(event.getEventNumber()));
        EventData data = event.getData();
        if (data.containsKey(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID)) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.2
                @Override // java.lang.Runnable
                public void run() {
                    ConfigurationExtension.this.processConfigureWithAppIDEvent(event);
                }
            });
            return;
        }
        if (data.containsKey("config.assetFile")) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.3
                @Override // java.lang.Runnable
                public void run() {
                    ConfigurationExtension.this.loadBundledConfig(event, event.getData().optString("config.assetFile", null));
                }
            });
            return;
        }
        if (data.containsKey(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH)) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.4
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigurationExtension.this.processConfigWithFilePathEvent(event);
                }
            });
            return;
        }
        if (event.getData().containsKey(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG)) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.5
                @Override // java.lang.Runnable
                public void run() {
                    ConfigurationExtension.this.processUpdateConfigEvent(event);
                }
            });
        } else if (event.getData().containsKey("config.clearUpdates")) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.6
                @Override // java.lang.Runnable
                public void run() {
                    ConfigurationExtension.this.processClearUpdatedConfigEvent(event);
                }
            });
        } else if (event.getData().containsKey(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG)) {
            getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.7
                @Override // java.lang.Runnable
                public void run() {
                    ConfigurationExtension.this.processPublishConfigurationEvent(event);
                }
            });
        }
    }

    public void handleGetSdkIdentitiesEvent(final Event event) {
        getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.1
            @Override // java.lang.Runnable
            public void run() {
                ConfigurationExtension.this.getsdkIdsEventQueue.add(event);
                ConfigurationExtension.this.processGetSdkIdsEvent();
            }
        });
    }

    public void handleWildcardEvent(Event event) {
        this.cachedEvents.add(event);
    }

    public boolean loadBundledConfig(Event event, String str) {
        String contentFromAsset = readContentFromAsset(str);
        if (contentFromAsset == null) {
            Log.trace(LOG_SOURCE, "%s (Failed to read bundled config file content from asset file %s)", "Unexpected Null Value", str);
            return false;
        }
        Log.debug(LOG_SOURCE, "Bundled configuration loaded from asset file (%s). \n %s", str, contentFromAsset);
        configureWithJsonString(contentFromAsset, event, true);
        return true;
    }

    @Override // com.adobe.marketing.mobile.Module
    public void onUnregistered() {
        synchronized (this) {
            this.isUnregistered = true;
        }
    }

    public void processClearUpdatedConfigEvent(Event event) {
        Log.trace(LOG_SOURCE, "Processing clear updated configuration event", new Object[0]);
        if (this.unmergedConfiguration == null) {
            if (getJSONUtilityService() == null) {
                return;
            } else {
                this.unmergedConfiguration = new ConfigurationData(getJSONUtilityService());
            }
        }
        removeProgrammaticConfigFromPersistence();
        retrieveProgrammaticConfigFromPersistence();
        ConfigurationData configurationData = this.unmergedConfiguration;
        this.currentConfig = configurationData;
        changeConfiguration(event, configurationData, true);
    }

    public void processConfigWithFilePathEvent(Event event) throws Throwable {
        String strOptString = event.getData().optString(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH, null);
        if (StringUtils.isNullOrEmpty(strOptString)) {
            Log.warning(LOG_SOURCE, "Unable to read config from provided file (filePath is invalid)", new Object[0]);
            return;
        }
        String str = LOG_SOURCE;
        Log.trace(str, "Processing configWithFilePath Event. \n %s", strOptString);
        String stringFromFile = FileUtil.readStringFromFile(new File(strOptString));
        Log.trace(str, "Configuration obtained from filePath %s is \n %s", strOptString, stringFromFile);
        configureWithJsonString(stringFromFile, event, true);
    }

    public void processConfigureWithAppIDEvent(Event event) {
        EventData data = event.getData();
        if (data == null) {
            Log.trace(LOG_SOURCE, "%s (event data), for ConfigureWithAppID event, Ignoring event", "Unexpected Null Value");
            return;
        }
        String string = event.getData().getString(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID);
        if (StringUtils.isNullOrEmpty(string)) {
            Log.trace(LOG_SOURCE, "App ID was null or empty while processing ConfigureWithAppID event", new Object[0]);
            removeAppIdFromPersistence();
            return;
        }
        if (!validateForInternalEventAppIDChange(data, string)) {
            Log.trace(LOG_SOURCE, "App ID is changed. Ignoring the setAppID Internal event %s", string);
            return;
        }
        String str = LOG_SOURCE;
        Log.trace(str, "Processing configureWithAppID event. AppID -(%s)", string);
        saveAppIdToPersistence(string);
        ConfigurationDownloader configDownloader = getConfigDownloader(string);
        if (configDownloader == null) {
            Log.trace(str, "%s (Configuration Downloader).", "Unexpected Null Value");
            return;
        }
        String strDownloadConfig = configDownloader.downloadConfig();
        if (StringUtils.isNullOrEmpty(strDownloadConfig)) {
            strDownloadConfig = configDownloader.loadCachedConfig();
        }
        if (StringUtils.isNullOrEmpty(strDownloadConfig)) {
            PlatformServices platformServices = getPlatformServices();
            SystemInfoService systemInfoService = platformServices == null ? null : platformServices.getSystemInfoService();
            if (systemInfoService != null && systemInfoService.getNetworkConnectionStatus() != SystemInfoService.ConnectionStatus.CONNECTED && waitForNetworkConnection()) {
                strDownloadConfig = configDownloader.downloadConfig();
            }
        }
        if (StringUtils.isNullOrEmpty(strDownloadConfig)) {
            Log.warning(str, "Unable to fetch config. Rolling back to previous configuration.", new Object[0]);
        } else {
            configureWithJsonString(strDownloadConfig, event, true);
        }
    }

    public void processGetSdkIdsEvent() {
        while (!this.getsdkIdsEventQueue.isEmpty()) {
            Event eventPeek = this.getsdkIdsEventQueue.peek();
            JsonUtilityService jSONUtilityService = getJSONUtilityService();
            if (jSONUtilityService == null) {
                Log.debug(LOG_SOURCE, "%s (JSON Utility Service), unable to retrieve sdk identities", "Unexpected Null Value");
                this.responseIdentityDispatcher.dispatchAllIdentities("{}", eventPeek.getResponsePairID());
                this.getsdkIdsEventQueue.poll();
            } else {
                if (!MobileIdentities.areAllSharedStatesReady(eventPeek, this)) {
                    return;
                }
                this.responseIdentityDispatcher.dispatchAllIdentities(MobileIdentities.getAllIdentifiers(jSONUtilityService, eventPeek, this), eventPeek.getResponsePairID());
                this.getsdkIdsEventQueue.poll();
            }
        }
    }

    public void processPublishConfigurationEvent(Event event) {
        Log.trace(LOG_SOURCE, "Processing publish configuration event", new Object[0]);
        if (getJSONUtilityService() == null) {
            return;
        }
        this.responseDispatcher.dispatchConfigResponseWithEventData(new ConfigurationData(getJSONUtilityService()).put(this.currentConfig).put(this.programmaticConfig).getEventData(), event.getResponsePairID());
    }

    public void processUpdateConfigEvent(Event event) {
        Map<String, Variant> mapOptVariantMap = event.getData().optVariantMap(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG, null);
        if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
            Log.debug(LOG_SOURCE, "Configuration update data was either not provided in event or is empty.", new Object[0]);
            return;
        }
        Log.trace(LOG_SOURCE, "Processing updateConfiguration Event. \n %s", mapOptVariantMap);
        retrieveProgrammaticConfigFromPersistence();
        this.programmaticConfig.put(mapOptVariantMap);
        saveProgrammaticConfigToPersistence(this.programmaticConfig);
        if (this.currentConfig == null) {
            if (getJSONUtilityService() == null) {
                return;
            } else {
                this.currentConfig = new ConfigurationData(getJSONUtilityService());
            }
        }
        this.currentConfig.put(this.programmaticConfig);
        changeConfiguration(event, this.currentConfig, true);
    }

    public void replaceRulesAndReprocessEvents(List<Rule> list) {
        if (this.needToProcessEvents.getAndSet(false)) {
            replaceRulesAndEvaluateEvents(list, new ReprocessEventsHandler() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.10
                @Override // com.adobe.marketing.mobile.ReprocessEventsHandler
                public List<Event> getEvents() {
                    return new ArrayList(ConfigurationExtension.this.cachedEvents);
                }

                @Override // com.adobe.marketing.mobile.ReprocessEventsHandler
                public void onEventReprocessingComplete() {
                    ConfigurationExtension.this.unregisterWildcardListener();
                    ConfigurationExtension.this.cachedEvents.clear();
                }
            });
        } else {
            replaceRules(list);
        }
    }

    public boolean waitForNetworkConnection() {
        SystemInfoService systemInfoService;
        PlatformServices platformServices = getPlatformServices();
        if (platformServices == null || (systemInfoService = platformServices.getSystemInfoService()) == null) {
            return false;
        }
        final C1State c1State = new C1State();
        while (true) {
            synchronized (this) {
                try {
                    if (this.isUnregistered) {
                        return false;
                    }
                    if (systemInfoService.getNetworkConnectionStatus() == SystemInfoService.ConnectionStatus.CONNECTED) {
                        return true;
                    }
                    synchronized (c1State) {
                        if (!c1State.isListenerRegistered) {
                            c1State.isListenerRegistered = true;
                            systemInfoService.registerOneTimeNetworkConnectionActiveListener(new SystemInfoService.NetworkConnectionActiveListener() { // from class: com.adobe.marketing.mobile.ConfigurationExtension.8
                                @Override // com.adobe.marketing.mobile.SystemInfoService.NetworkConnectionActiveListener
                                public final void onActive() {
                                    synchronized (c1State) {
                                        c1State.notifyAll();
                                        c1State.isListenerRegistered = false;
                                    }
                                }
                            });
                        }
                        try {
                            c1State.wait(1000L);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
