package com.adobe.marketing.mobile;

import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.nulabinc.zxcvbn.Guess;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
class IdentityExtension extends InternalModule {
    static final String LOG_SOURCE = "IdentityExtension";
    private static final Object _pushEnabledMutex = new Object();
    private static boolean pushEnabled = false;
    String advertisingIdentifier;
    String blob;
    List<VisitorID> customerIds;
    IdentityHitsDatabase database;
    ConcurrentLinkedQueue<Event> eventsQueue;
    DispatcherAnalyticsRequestContentIdentity idAnalyticsEventDispatcher;
    DispatcherConfigurationRequestContentIdentity idConfigurationEventDispatcher;
    DispatcherIdentityResponseIdentityIdentity idResponseEventDispatcher;
    LocalStorageService.DataStore internalDataStore;
    long lastSync;
    private ConfigurationSharedStateIdentity latestValidConfig;
    String locationHint;
    String mid;
    MobilePrivacyStatus privacyStatus;
    String pushIdentifier;
    long ttl;

    public IdentityExtension(EventHub eventHub, PlatformServices platformServices) {
        super(EventDataKeys.Identity.MODULE_NAME, eventHub, platformServices);
        this.privacyStatus = IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY;
        this.eventsQueue = new ConcurrentLinkedQueue<>();
        EventType eventType = EventType.HUB;
        registerListener(eventType, EventSource.BOOTED, ListenerHubBootedIdentity.class);
        EventType eventType2 = EventType.IDENTITY;
        registerListener(eventType2, EventSource.REQUEST_IDENTITY, ListenerIdentityRequestIdentity.class);
        EventSource eventSource = EventSource.RESPONSE_IDENTITY;
        registerListener(eventType2, eventSource, IdentityListenerResponseIdentity.class);
        registerListener(eventType, EventSource.SHARED_STATE, ListenerHubSharedStateIdentity.class);
        registerListener(EventType.ANALYTICS, eventSource, ListenerAnalyticsResponseIdentity.class);
        EventType eventType3 = EventType.AUDIENCEMANAGER;
        EventSource eventSource2 = EventSource.RESPONSE_CONTENT;
        registerListener(eventType3, eventSource2, IdentityListenerAudienceResponseContent.class);
        registerListener(EventType.CONFIGURATION, eventSource2, IdentityListenerConfigurationResponseContent.class);
        EventType eventType4 = EventType.GENERIC_IDENTITY;
        registerListener(eventType4, EventSource.REQUEST_CONTENT, ListenerIdentityGenericIdentityRequestIdentity.class);
        registerListener(eventType4, EventSource.REQUEST_RESET, ListenerIdentityGenericIdentityRequestReset.class);
        this.idResponseEventDispatcher = (DispatcherIdentityResponseIdentityIdentity) createDispatcher(DispatcherIdentityResponseIdentityIdentity.class);
        this.idAnalyticsEventDispatcher = (DispatcherAnalyticsRequestContentIdentity) createDispatcher(DispatcherAnalyticsRequestContentIdentity.class);
        this.idConfigurationEventDispatcher = (DispatcherConfigurationRequestContentIdentity) createDispatcher(DispatcherConfigurationRequestContentIdentity.class);
        loadVariablesFromPersistentData();
    }

    private String buildOptOutURLString(ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        if (configurationSharedStateIdentity == null || configurationSharedStateIdentity.orgID == null || this.mid == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("d_orgid", configurationSharedStateIdentity.orgID);
        map.put("d_mid", this.mid);
        URLBuilder uRLBuilder = new URLBuilder();
        uRLBuilder.enableSSL(true).addPath("demoptout.jpg").setServer(configurationSharedStateIdentity.marketingCloudServer).addQueryParameters(map);
        return uRLBuilder.build();
    }

    private String buildURLString(List<VisitorID> list, Map<String, String> map, ConfigurationSharedStateIdentity configurationSharedStateIdentity, boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("d_ver", "2");
        linkedHashMap.put("d_rtbd", "json");
        if (z10) {
            if (StringUtils.isNullOrEmpty(this.advertisingIdentifier)) {
                linkedHashMap.put("device_consent", "0");
                linkedHashMap.put("d_consent_ic", EventDataKeys.Identity.ADID_DSID);
            } else {
                linkedHashMap.put("device_consent", "1");
            }
        }
        linkedHashMap.put("d_orgid", configurationSharedStateIdentity.orgID);
        String str = this.mid;
        if (str != null) {
            linkedHashMap.put("d_mid", str);
        }
        String str2 = this.blob;
        if (str2 != null) {
            linkedHashMap.put("d_blob", str2);
        }
        String str3 = this.locationHint;
        if (str3 != null) {
            linkedHashMap.put("dcs_region", str3);
        }
        URLBuilder uRLBuilder = new URLBuilder();
        uRLBuilder.enableSSL(true).addPath("id").setServer(configurationSharedStateIdentity.marketingCloudServer).addQueryParameters(linkedHashMap);
        String strGenerateURLEncodedValuesCustomerIdString = generateURLEncodedValuesCustomerIdString(list);
        if (!StringUtils.isNullOrEmpty(strGenerateURLEncodedValuesCustomerIdString)) {
            uRLBuilder.addQuery(strGenerateURLEncodedValuesCustomerIdString, URLBuilder.EncodeType.NONE);
        }
        String strGenerateInternalIdString = generateInternalIdString(map);
        if (!StringUtils.isNullOrEmpty(strGenerateInternalIdString)) {
            uRLBuilder.addQuery(strGenerateInternalIdString, URLBuilder.EncodeType.NONE);
        }
        return uRLBuilder.build();
    }

    private void changePushStatusAndHitAnalytics(boolean z10) {
        setPushStatus(z10);
        HashMap map = new HashMap();
        map.put(EventDataKeys.Identity.EVENT_PUSH_STATUS, String.valueOf(z10));
        EventData eventData = new EventData();
        eventData.putString("action", EventDataKeys.Identity.PUSH_ID_ENABLED_ACTION_NAME);
        eventData.putStringMap("contextdata", map);
        this.idAnalyticsEventDispatcher.dispatchAnalyticsHit(eventData);
    }

    private void clearEventsQueue() {
        Iterator<Event> it = this.eventsQueue.iterator();
        while (it.hasNext()) {
            Event next = it.next();
            EventData data = next.getData();
            if (data == null || !data.containsKey(EventDataKeys.Identity.BASE_URL)) {
                handleIdentityResponseEvent("IDENTITY_RESPONSE", data, next.getResponsePairID());
                it.remove();
            }
        }
    }

    private Event createForcedSyncEvent(int i10) {
        EventData eventData = new EventData();
        eventData.putBoolean(EventDataKeys.Identity.FORCE_SYNC, true);
        eventData.putBoolean(EventDataKeys.Identity.IS_SYNC_EVENT, true);
        eventData.putInteger(EventDataKeys.Identity.AUTHENTICATION_STATE, VisitorID.AuthenticationState.UNKNOWN.getValue());
        Event eventBuild = new Event.Builder("id-construct-forced-sync", EventType.IDENTITY, EventSource.REQUEST_IDENTITY).setData(eventData).build();
        eventBuild.setEventNumber(i10);
        return eventBuild;
    }

    private Map<String, String> extractDPID(EventData eventData) {
        HashMap map = new HashMap();
        if (eventData.containsKey(EventDataKeys.Identity.PUSH_IDENTIFIER)) {
            try {
                Variant variant = eventData.getVariant(EventDataKeys.Identity.PUSH_IDENTIFIER);
                String string = variant.getKind().equals(VariantKind.NULL) ? null : variant.getString();
                updatePushIdentifier(string);
                map.put(EventDataKeys.Identity.MCPNS_DPID, string);
            } catch (Exception e5) {
                Log.error(LOG_SOURCE, "extractDPID : Unable to update the push identifier due to: (%s).", e5);
            }
        }
        if (map.size() == 0) {
            return null;
        }
        return map;
    }

    private LocalStorageService.DataStore getDataStore() {
        if (this.internalDataStore == null) {
            if (getPlatformServices() == null) {
                Log.debug(LOG_SOURCE, "getDataStore : Unable to get the data store as the platform services are not available.", new Object[0]);
                return null;
            }
            LocalStorageService localStorageService = getPlatformServices().getLocalStorageService();
            if (localStorageService == null) {
                Log.debug(LOG_SOURCE, "getDataStore : Local storage service is null. Cannot fetch persisted values. Loading default values.", new Object[0]);
                loadDefaultValues();
                return null;
            }
            this.internalDataStore = localStorageService.getDataStore("visitorIDServiceDataStore");
        }
        return this.internalDataStore;
    }

    private void handleIdentityConfigurationUpdateEvent(EventData eventData) {
        DispatcherConfigurationRequestContentIdentity dispatcherConfigurationRequestContentIdentity = this.idConfigurationEventDispatcher;
        if (dispatcherConfigurationRequestContentIdentity != null) {
            dispatcherConfigurationRequestContentIdentity.dispatchConfigUpdateRequest(eventData);
        }
    }

    private void handleIdentityResponseEvent(String str, EventData eventData, String str2) {
        DispatcherIdentityResponseIdentityIdentity dispatcherIdentityResponseIdentityIdentity = this.idResponseEventDispatcher;
        if (dispatcherIdentityResponseIdentityIdentity != null) {
            dispatcherIdentityResponseIdentityIdentity.dispatchResponse(str, eventData, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    private boolean handleNetworkResponseMap(IdentityResponseObject identityResponseObject) {
        boolean z10;
        if (identityResponseObject == null) {
            Log.debug(LOG_SOURCE, "handleNetworkResponseMap : Received an empty JSON in response from ECID Service, so there is nothing to handle.", new Object[0]);
            return false;
        }
        List<String> list = identityResponseObject.optOutList;
        if (list != null && !list.isEmpty()) {
            Log.debug(LOG_SOURCE, "handleNetworkResponseMap : Received opt-out response from ECID Service, so updating the privacy status in the configuration to opt-out.", new Object[0]);
            HashMap map = new HashMap();
            map.put(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, Variant.fromString(MobilePrivacyStatus.OPT_OUT.getValue()));
            EventData eventData = new EventData();
            eventData.putVariantMap(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG, map);
            handleIdentityConfigurationUpdateEvent(eventData);
        }
        if (!StringUtils.isNullOrEmpty(identityResponseObject.error)) {
            Log.warning(LOG_SOURCE, "handleNetworkResponseMap : ECID Service returned an error: (%s).", identityResponseObject.error);
            if (this.mid != null) {
                return false;
            }
            this.mid = generateMID();
            return true;
        }
        if (StringUtils.isNullOrEmpty(identityResponseObject.mid) || !identityResponseObject.mid.equals(this.mid)) {
            return false;
        }
        try {
            String str = identityResponseObject.blob;
            if (str != null && !str.equals(this.blob)) {
                z10 = true;
            } else if (!StringUtils.isNullOrEmpty(identityResponseObject.blob) || StringUtils.isNullOrEmpty(this.blob)) {
                z10 = false;
            } else {
                z10 = true;
            }
            try {
                String str2 = identityResponseObject.hint;
                if (str2 != null && !str2.equals(this.locationHint)) {
                    z10 = true;
                } else if (StringUtils.isNullOrEmpty(identityResponseObject.hint) && !StringUtils.isNullOrEmpty(this.locationHint)) {
                    z10 = true;
                }
                String str3 = identityResponseObject.blob;
                this.blob = str3;
                String str4 = identityResponseObject.hint;
                this.locationHint = str4;
                long j10 = identityResponseObject.ttl;
                this.ttl = j10;
                Log.debug(LOG_SOURCE, "handleNetworkResponseMap : ECID Service returned (mid: %s, blob: %s, hint: %s, ttl: %d).", this.mid, str3, str4, Long.valueOf(j10));
            } catch (Exception e5) {
                e = e5;
                Log.warning(LOG_SOURCE, "handleNetworkResponseMap : Error parsing the response from ECID Service : (%s).", e);
            }
        } catch (Exception e7) {
            e = e7;
            z10 = false;
        }
        return z10;
    }

    private void initializeDatabaseWithCurrentPrivacyStatus() {
        if (this.database == null) {
            this.database = new IdentityHitsDatabase(this, getPlatformServices());
        }
        this.database.updatePrivacyStatus(this.privacyStatus);
    }

    private boolean isPushEnabled() {
        synchronized (_pushEnabledMutex) {
            try {
                LocalStorageService.DataStore dataStore = getDataStore();
                if (dataStore == null) {
                    Log.trace(LOG_SOURCE, "isPushEnabled : Unable to update push flag because the LocalStorageService was not available.", new Object[0]);
                    return false;
                }
                boolean z10 = dataStore.getBoolean("ADOBEMOBILE_PUSH_ENABLED", false);
                pushEnabled = z10;
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void loadDefaultValues() {
        this.latestValidConfig = null;
        this.mid = null;
        this.advertisingIdentifier = null;
        this.pushIdentifier = null;
        this.customerIds = null;
        this.blob = null;
        this.locationHint = null;
        this.lastSync = 0L;
        this.ttl = 600L;
        Log.debug(LOG_SOURCE, "loadDefaultValues : ECID Service did not return an ID, so generating one locally : (ttl: %d).", 600L);
    }

    private void loadPrivacyStatus(Event event) {
        EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
        if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
            return;
        }
        String strOptString = sharedEventState.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY.getValue());
        this.privacyStatus = MobilePrivacyStatus.fromString(strOptString);
        Log.trace(LOG_SOURCE, "loadPrivacyStatus : Updated the database with the current privacy status: %s.", strOptString);
        initializeDatabaseWithCurrentPrivacyStatus();
    }

    private VisitorID parseCustomerIDStringToVisitorIDObject(String str) {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf == -1) {
            Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences: (%s).", str);
            return null;
        }
        try {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            List listAsList = Arrays.asList(strSubstring2.split("%01"));
            if (listAsList.size() != 3) {
                Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences because the value was malformed: (%s).", strSubstring2);
                return null;
            }
            if (StringUtils.isNullOrEmpty((String) listAsList.get(1))) {
                Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID from Shared Preferences because the ECID had null or empty id: (%s).", strSubstring2);
                return null;
            }
            try {
                return new VisitorID(strSubstring, (String) listAsList.get(0), (String) listAsList.get(1), VisitorID.AuthenticationState.fromInteger(Integer.parseInt((String) listAsList.get(2))));
            } catch (IllegalStateException e5) {
                Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to create the ECID after encoding due to an exception: (%s).", e5);
                return null;
            } catch (NumberFormatException e7) {
                Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to parse the ECID: (%s) due to an exception: (%s).", str, e7.getLocalizedMessage());
                return null;
            }
        } catch (IndexOutOfBoundsException e10) {
            Log.debug(LOG_SOURCE, "parseCustomerIDStringToVisitorIDObject : Unable to load Visitor ID: (%s) from Shared Preference because the name or value was malformed as in the exception: (%s).", str, e10);
            return null;
        }
    }

    private boolean sameIdType(VisitorID visitorID, VisitorID visitorID2) {
        if (visitorID == null || visitorID2 == null) {
            return false;
        }
        if (visitorID.getIdType() != null) {
            return visitorID.getIdType().equals(visitorID2.getIdType());
        }
        return visitorID2.getIdType() == null;
    }

    private void savePersistently() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.trace(LOG_SOURCE, "savePersistently : Unable to save the IdentityExtension fields into persistence because the data store was null.", new Object[0]);
            return;
        }
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_VISITORID_IDS", stringFromVisitorIdList(this.customerIds));
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_PERSISTED_MID", this.mid);
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_PUSH_IDENTIFIER", this.pushIdentifier);
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_ADVERTISING_IDENTIFIER", this.advertisingIdentifier);
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_PERSISTED_MID_HINT", this.locationHint);
        storeOrRemovePersistentString(dataStore, "ADOBEMOBILE_PERSISTED_MID_BLOB", this.blob);
        dataStore.setLong("ADOBEMOBILE_VISITORID_TTL", this.ttl);
        dataStore.setLong("ADOBEMOBILE_VISITORID_SYNC", this.lastSync);
        Log.trace(LOG_SOURCE, "savePersistently : Successfully saved the Identity data into persistence.", new Object[0]);
    }

    private void setPushStatus(boolean z10) {
        synchronized (_pushEnabledMutex) {
            try {
                LocalStorageService.DataStore dataStore = getDataStore();
                if (dataStore != null) {
                    dataStore.setBoolean("ADOBEMOBILE_PUSH_ENABLED", z10);
                } else {
                    Log.trace(LOG_SOURCE, "setPushStatus : Unable to update push flag because the LocalStorageService was not available.", new Object[0]);
                }
                pushEnabled = z10;
                Log.trace(LOG_SOURCE, "setPushStatus : Push notifications status is now: ".concat(z10 ? "Enabled" : "Disabled"), new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean shouldSync(List<VisitorID> list, Map<String, String> map, boolean z10, ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        boolean z11;
        if (configurationSharedStateIdentity.canSyncIdentifiersWithCurrentConfiguration()) {
            z11 = true;
        } else {
            Log.debug(LOG_SOURCE, "shouldSync : Ignoring ID Sync due to privacy status opt-out or missing experienceCloud.org.", new Object[0]);
            z11 = false;
        }
        boolean z12 = TimeUtil.getUnixTimeInSeconds() - this.lastSync > this.ttl || z10;
        boolean z13 = (list == null || list.isEmpty()) ? false : true;
        boolean z14 = map != null;
        if (!StringUtils.isNullOrEmpty(this.mid) && !z13 && !z14 && !z12) {
            return false;
        }
        if (StringUtils.isNullOrEmpty(this.mid)) {
            this.mid = generateMID();
        }
        return z11;
    }

    private static void storeOrRemovePersistentString(LocalStorageService.DataStore dataStore, String str, String str2) {
        if (StringUtils.isNullOrEmpty(str2)) {
            dataStore.remove(str);
        } else {
            dataStore.setString(str, str2);
        }
    }

    private String stringFromVisitorIdList(List<VisitorID> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (VisitorID visitorID : list) {
            sb2.append("&d_cid_ic=");
            sb2.append(visitorID.getIdType());
            sb2.append("%01");
            if (visitorID.getId() != null) {
                sb2.append(visitorID.getId());
            }
            sb2.append("%01");
            sb2.append(visitorID.getAuthenticationState().getValue());
        }
        return sb2.toString();
    }

    private void updateAdvertisingIdentifier(String str) {
        this.advertisingIdentifier = str;
        savePersistently();
    }

    public String appendKVPToVisitorIdString(String str, String str2, String str3) {
        if (StringUtils.isNullOrEmpty(str2) || StringUtils.isNullOrEmpty(str3)) {
            return str;
        }
        String str4 = String.format("%s=%s", str2, str3);
        return StringUtils.isNullOrEmpty(str) ? str4 : String.format("%s|%s", str, str4);
    }

    public void appendVisitorInfoForURL(String str, String str2, ConfigurationSharedStateIdentity configurationSharedStateIdentity, EventData eventData) {
        if (StringUtils.isNullOrEmpty(str)) {
            EventData eventData2 = new EventData();
            eventData2.putString(EventDataKeys.Identity.UPDATED_URL, str);
            handleIdentityResponseEvent("IDENTITY_APPENDED_URL", eventData2, str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder(str);
        StringBuilder sbGenerateVisitorIDURLPayload = generateVisitorIDURLPayload(configurationSharedStateIdentity, eventData);
        if (!StringUtils.isNullOrEmpty(sbGenerateVisitorIDURLPayload.toString())) {
            int iIndexOf = sb2.indexOf("?");
            int iIndexOf2 = sb2.indexOf("#");
            int length = iIndexOf2 > 0 ? iIndexOf2 : sb2.length();
            boolean z10 = iIndexOf2 > 0 && iIndexOf2 < iIndexOf;
            if (iIndexOf > 0 && iIndexOf != sb2.length() - 1 && !z10) {
                sbGenerateVisitorIDURLPayload.insert(0, "&");
            } else if (iIndexOf < 0 || z10) {
                sbGenerateVisitorIDURLPayload.insert(0, "?");
            }
            sb2.insert(length, sbGenerateVisitorIDURLPayload.toString());
        }
        EventData eventData3 = new EventData();
        eventData3.putString(EventDataKeys.Identity.UPDATED_URL, sb2.toString());
        handleIdentityResponseEvent("IDENTITY_APPENDED_URL", eventData3, str2);
    }

    public void bootup(Event event) {
        Log.trace(LOG_SOURCE, "bootup : Processing BOOTED event.", new Object[0]);
        loadPrivacyStatus(event);
        enqueueEvent(createForcedSyncEvent(event.getEventNumber()));
        processEventQueue();
        Log.trace(LOG_SOURCE, "bootup : Added an Identity force sync event on boot.", new Object[0]);
        if (this.privacyStatus == MobilePrivacyStatus.OPT_OUT) {
            Log.trace(LOG_SOURCE, "bootup : Privacy status was opted out on boot, so created Identity shared state.", new Object[0]);
            createSharedState(event.getEventNumber(), packageEventData());
        }
    }

    public List<VisitorID> cleanupVisitorIdentifiers(List<VisitorID> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (StringUtils.isNullOrEmpty(((VisitorID) it.next()).getId())) {
                    it.remove();
                    Log.trace(LOG_SOURCE, "cleanupVisitorIdentifiers : VisitorID was discarded due to an empty/null identifier value.", new Object[0]);
                }
            }
        } catch (ClassCastException e5) {
            Log.error(LOG_SOURCE, "cleanupVisitorIdentifiers : Caught ClassCastException while iterating through visitor identifiers: %s", e5.getLocalizedMessage());
        } catch (NullPointerException e7) {
            Log.error(LOG_SOURCE, "cleanupVisitorIdentifiers : Caught NullPointerException while iterating through visitor identifiers: %s", e7.getLocalizedMessage());
        }
        return arrayList;
    }

    public List<VisitorID> convertVisitorIdsStringToVisitorIDObjects(String str) {
        VisitorID visitorID;
        if (StringUtils.isNullOrEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("&")) {
            if (!StringUtils.isNullOrEmpty(str2)) {
                VisitorID customerIDStringToVisitorIDObject = parseCustomerIDStringToVisitorIDObject(str2);
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        visitorID = null;
                        break;
                    }
                    visitorID = (VisitorID) it.next();
                } while (!sameIdType(visitorID, customerIDStringToVisitorIDObject));
                if (visitorID != null) {
                    arrayList.remove(visitorID);
                }
                if (customerIDStringToVisitorIDObject != null) {
                    arrayList.add(customerIDStringToVisitorIDObject);
                }
            }
        }
        return arrayList;
    }

    public void enqueueEvent(Event event) {
        if (event == null) {
            Log.debug(LOG_SOURCE, "enqueueEvent : Unable to add the Identity event into the event queue because the event was null.", new Object[0]);
        } else {
            this.eventsQueue.add(event);
            Log.trace(LOG_SOURCE, "enqueueEvent : An Identity event has been added into the event queue : %s", event);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:8:0x0015, B:12:0x0021, B:14:0x0027, B:23:0x0041, B:25:0x0047, B:27:0x004f, B:19:0x0033, B:21:0x0039), top: B:44:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    public IdentityGenericPair<VisitorID, Boolean> extractAndUpdateAdid(EventData eventData) {
        boolean z10;
        boolean z11;
        VisitorID visitorID;
        String str = "";
        VisitorID visitorID2 = null;
        if (eventData == null || !eventData.containsKey(EventDataKeys.Identity.ADVERTISING_IDENTIFIER)) {
            return new IdentityGenericPair<>(null, Boolean.FALSE);
        }
        boolean z12 = false;
        try {
            String strOptString = eventData.optString(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, "");
            if (!"00000000-0000-0000-0000-000000000000".equals(strOptString)) {
                str = strOptString;
            }
            if (!str.isEmpty() && !str.equals(this.advertisingIdentifier)) {
                if (str.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                visitorID = new VisitorID("d_cid_ic", EventDataKeys.Identity.ADID_DSID, str, VisitorID.AuthenticationState.AUTHENTICATED);
                updateAdvertisingIdentifier(str);
                Log.trace(LOG_SOURCE, "extractAndUpdateAdid : The advertising identifier was set to: (%s).", str);
                z12 = z11;
                visitorID2 = visitorID;
            } else if (str.isEmpty() && !StringUtils.isNullOrEmpty(this.advertisingIdentifier)) {
                if (str.isEmpty() || StringUtils.isNullOrEmpty(this.advertisingIdentifier) || "00000000-0000-0000-0000-000000000000".equals(this.advertisingIdentifier)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                try {
                    visitorID = new VisitorID("d_cid_ic", EventDataKeys.Identity.ADID_DSID, str, VisitorID.AuthenticationState.AUTHENTICATED);
                    try {
                        updateAdvertisingIdentifier(str);
                        Log.trace(LOG_SOURCE, "extractAndUpdateAdid : The advertising identifier was set to: (%s).", str);
                        z12 = z11;
                        visitorID2 = visitorID;
                    } catch (Exception e5) {
                        visitorID2 = visitorID;
                        z10 = z11;
                        e = e5;
                        Log.error(LOG_SOURCE, "extractAndUpdateAdid : Unable to update the advertising identifier due to: (%s)", e);
                        z12 = z10;
                    }
                } catch (Exception e7) {
                    z10 = z11;
                    e = e7;
                }
            }
        } catch (Exception e10) {
            e = e10;
            z10 = false;
        }
        return new IdentityGenericPair<>(visitorID2, Boolean.valueOf(z12));
    }

    public Map<String, String> extractIdentifiers(EventData eventData) {
        Map<String, String> mapOptStringMap;
        HashMap map = new HashMap();
        return (eventData == null || !eventData.containsKey(EventDataKeys.Identity.IDENTIFIERS) || (mapOptStringMap = eventData.optStringMap(EventDataKeys.Identity.IDENTIFIERS, null)) == null) ? map : new HashMap(mapOptStringMap);
    }

    public List<VisitorID> generateCustomerIds(Map<String, String> map, VisitorID.AuthenticationState authenticationState) {
        if (map == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                arrayList.add(new VisitorID("d_cid_ic", entry.getKey(), entry.getValue(), authenticationState));
            } catch (IllegalStateException e5) {
                Log.debug(LOG_SOURCE, "generateCustomerIds : Unable to create Visitor IDs after encoding the provided list due to: (%s).", e5);
            }
        }
        return arrayList;
    }

    public String generateInternalIdString(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        HashMap map2 = new HashMap(map);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map2.entrySet()) {
            sb2.append("&d_cid=");
            sb2.append(UrlUtilities.urlEncode((String) entry.getKey()));
            sb2.append("%01");
            sb2.append(UrlUtilities.urlEncode((String) entry.getValue()));
        }
        if (sb2.charAt(0) == '&') {
            sb2.deleteCharAt(0);
        }
        return sb2.toString();
    }

    public String generateMID() {
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        if (mostSignificantBits < 0) {
            mostSignificantBits = -mostSignificantBits;
        }
        objArr[0] = Long.valueOf(mostSignificantBits);
        if (leastSignificantBits < 0) {
            leastSignificantBits = -leastSignificantBits;
        }
        objArr[1] = Long.valueOf(leastSignificantBits);
        return String.format(locale, "%019d%019d", objArr);
    }

    public String generateURLEncodedValuesCustomerIdString(List<VisitorID> list) {
        if (list == null || list.isEmpty()) {
            Log.debug(LOG_SOURCE, "generateURLEncodedValuesCustomerIdString : No Visitor ID exists in the provided list to generate for URL.", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (VisitorID visitorID : list) {
            sb2.append("&d_cid_ic=");
            sb2.append(UrlUtilities.urlEncode(visitorID.getIdType()));
            sb2.append("%01");
            String strUrlEncode = UrlUtilities.urlEncode(visitorID.getId());
            if (strUrlEncode != null) {
                sb2.append(strUrlEncode);
            }
            sb2.append("%01");
            sb2.append(visitorID.getAuthenticationState().getValue());
        }
        if (sb2.charAt(0) == '&') {
            sb2.deleteCharAt(0);
        }
        return sb2.toString();
    }

    public StringBuilder generateVisitorIDURLPayload(ConfigurationSharedStateIdentity configurationSharedStateIdentity, EventData eventData) {
        String strOptString;
        StringBuilder sb2 = new StringBuilder();
        String strAppendKVPToVisitorIdString = appendKVPToVisitorIdString(appendKVPToVisitorIdString(null, "TS", String.valueOf(TimeUtil.getUnixTimeInSeconds())), "MCMID", this.mid);
        if (eventData != null) {
            String strOptString2 = eventData.optString(EventDataKeys.Analytics.ANALYTICS_ID, null);
            if (!StringUtils.isNullOrEmpty(strOptString2)) {
                strAppendKVPToVisitorIdString = appendKVPToVisitorIdString(strAppendKVPToVisitorIdString, "MCAID", strOptString2);
            }
            strOptString = eventData.optString(EventDataKeys.Identity.USER_IDENTIFIER, null);
        } else {
            strOptString = null;
        }
        String str = configurationSharedStateIdentity != null ? configurationSharedStateIdentity.orgID : null;
        if (!StringUtils.isNullOrEmpty(str)) {
            strAppendKVPToVisitorIdString = appendKVPToVisitorIdString(strAppendKVPToVisitorIdString, "MCORGID", str);
        }
        sb2.append("adobe_mc=");
        sb2.append(UrlUtilities.urlEncode(strAppendKVPToVisitorIdString));
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            sb2.append("&adobe_aa_vid=");
            sb2.append(UrlUtilities.urlEncode(strOptString));
        }
        return sb2;
    }

    public void handleAnalyticsResponseIdentity(Event event) {
        EventData data;
        LocalStorageService.DataStore dataStore;
        if (event == null || (data = event.getData()) == null) {
            return;
        }
        String strOptString = data.optString(EventDataKeys.Analytics.ANALYTICS_ID, null);
        if (StringUtils.isNullOrEmpty(strOptString) || (dataStore = getDataStore()) == null || dataStore.contains("ADOBEMOBILE_AID_SYNCED")) {
            return;
        }
        dataStore.setBoolean("ADOBEMOBILE_AID_SYNCED", true);
        HashMap map = new HashMap();
        map.put("AVID", strOptString);
        EventData eventData = new EventData();
        eventData.putStringMap(EventDataKeys.Identity.IDENTIFIERS, map);
        eventData.putInteger(EventDataKeys.Identity.AUTHENTICATION_STATE, VisitorID.AuthenticationState.UNKNOWN.getValue());
        eventData.putBoolean(EventDataKeys.Identity.FORCE_SYNC, false);
        eventData.putBoolean(EventDataKeys.Identity.IS_SYNC_EVENT, true);
        enqueueEvent(new Event.Builder("AVID Sync", EventType.IDENTITY, EventSource.REQUEST_IDENTITY).setData(eventData).build());
        processEventQueue();
    }

    public void handleAppendURL(Event event, ConfigurationSharedStateIdentity configurationSharedStateIdentity, EventData eventData) {
        appendVisitorInfoForURL(event.getData().optString(EventDataKeys.Identity.BASE_URL, null), event.getResponsePairID(), configurationSharedStateIdentity, eventData);
    }

    public void handleConfiguration(Event event) {
        EventData data;
        if (event == null || (data = event.getData()) == null) {
            return;
        }
        if (MobilePrivacyStatus.fromString(data.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY.getValue())).equals(MobilePrivacyStatus.OPT_OUT)) {
            handleOptOut(event);
        }
        processPrivacyChange(event.getEventNumber(), data);
        updateLatestValidConfiguration(data);
    }

    public void handleGetUrlVariables(Event event, ConfigurationSharedStateIdentity configurationSharedStateIdentity, EventData eventData) {
        StringBuilder sbGenerateVisitorIDURLPayload = generateVisitorIDURLPayload(configurationSharedStateIdentity, eventData);
        EventData eventData2 = new EventData();
        eventData2.putString("urlvariables", sbGenerateVisitorIDURLPayload.toString());
        handleIdentityResponseEvent("IDENTITY_URL_VARIABLES", eventData2, event.getResponsePairID());
    }

    public void handleIdentityRequestReset(Event event) {
        if (event == null) {
            Log.debug(LOG_SOURCE, "handleIdentityRequestReset: Ignoring null event", new Object[0]);
            return;
        }
        if (this.privacyStatus == MobilePrivacyStatus.OPT_OUT) {
            Log.debug(LOG_SOURCE, "handleIdentityRequestReset: Privacy is opt-out, ignoring event.", new Object[0]);
            return;
        }
        this.mid = null;
        this.advertisingIdentifier = null;
        this.blob = null;
        this.locationHint = null;
        this.customerIds = null;
        this.pushIdentifier = null;
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore != null) {
            dataStore.remove("ADOBEMOBILE_AID_SYNCED");
            dataStore.remove("ADOBEMOBILE_PUSH_ENABLED");
        }
        clearEventsQueue();
        savePersistently();
        this.eventsQueue.add(createForcedSyncEvent(event.getEventNumber()));
        processEventQueue();
        Log.debug(LOG_SOURCE, "handleIdentityRequestReset: Did reset identifiers and queued force sync event.", new Object[0]);
    }

    public void handleIdentityResponseIdentityForSharedState(Event event) {
        EventData data;
        if (event == null || (data = event.getData()) == null || !data.optBoolean("updatesharedstate", false)) {
            return;
        }
        createSharedState(event.getEventNumber(), packageEventData());
    }

    public void handleOptOut(Event event) {
        EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
        if (sharedEventState == EventHub.SHARED_STATE_PENDING || sharedEventState.containsKey(EventDataKeys.Configuration.AAM_CONFIG_SERVER)) {
            return;
        }
        ConfigurationSharedStateIdentity configurationSharedStateIdentity = new ConfigurationSharedStateIdentity();
        configurationSharedStateIdentity.getConfigurationProperties(sharedEventState);
        if (configurationSharedStateIdentity.privacyStatus.equals(MobilePrivacyStatus.OPT_OUT)) {
            sendOptOutHit(configurationSharedStateIdentity);
        }
    }

    public boolean handleSyncIdentifiers(Event event, ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        if (configurationSharedStateIdentity == null) {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Ignoring the Sync Identifiers call because the configuration was null.", new Object[0]);
            return true;
        }
        MobilePrivacyStatus mobilePrivacyStatus = this.privacyStatus;
        MobilePrivacyStatus mobilePrivacyStatus2 = MobilePrivacyStatus.OPT_OUT;
        if (mobilePrivacyStatus == mobilePrivacyStatus2) {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Ignoring the Sync Identifiers call because the privacy status was opt-out.", new Object[0]);
            return true;
        }
        if (event == null) {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Ignoring the Sync Identifiers call because the event sent was null.", new Object[0]);
            return true;
        }
        if (StringUtils.isNullOrEmpty(configurationSharedStateIdentity.orgID) && (configurationSharedStateIdentity = this.latestValidConfig) == null) {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Unable to process sync identifiers request as the configuration did not contain a valid Experience Cloud organization ID. Will attempt to process event when a valid configuration is received.", new Object[0]);
            return false;
        }
        if (configurationSharedStateIdentity.privacyStatus == mobilePrivacyStatus2) {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Ignored the Sync Identifiers call because the privacy status was opt-out.", new Object[0]);
            return true;
        }
        if (StringUtils.isNullOrEmpty(configurationSharedStateIdentity.marketingCloudServer)) {
            configurationSharedStateIdentity.marketingCloudServer = "dpm.demdex.net";
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : The experienceCloud.server was empty is the configuration, hence used the default server: (%s).", "dpm.demdex.net");
        }
        EventData data = event.getData();
        Map<String, String> mapExtractDPID = extractDPID(data);
        Map<String, String> mapExtractIdentifiers = extractIdentifiers(data);
        VisitorID.AuthenticationState authenticationStateFromInteger = VisitorID.AuthenticationState.fromInteger(data.optInteger(EventDataKeys.Identity.AUTHENTICATION_STATE, 0));
        boolean zOptBoolean = data.optBoolean(EventDataKeys.Identity.FORCE_SYNC, false);
        List<VisitorID> listGenerateCustomerIds = generateCustomerIds(mapExtractIdentifiers, authenticationStateFromInteger);
        IdentityGenericPair<VisitorID, Boolean> identityGenericPairExtractAndUpdateAdid = extractAndUpdateAdid(data);
        boolean zBooleanValue = identityGenericPairExtractAndUpdateAdid.getSecond().booleanValue();
        VisitorID first = identityGenericPairExtractAndUpdateAdid.getFirst();
        if (first != null) {
            listGenerateCustomerIds.add(first);
        }
        List<VisitorID> listMergeCustomerIds = mergeCustomerIds(listGenerateCustomerIds);
        this.customerIds = listMergeCustomerIds;
        this.customerIds = cleanupVisitorIdentifiers(listMergeCustomerIds);
        List<VisitorID> listCleanupVisitorIdentifiers = cleanupVisitorIdentifiers(listGenerateCustomerIds);
        if (shouldSync(listCleanupVisitorIdentifiers, mapExtractDPID, zOptBoolean || zBooleanValue, configurationSharedStateIdentity)) {
            String strBuildURLString = buildURLString(listCleanupVisitorIdentifiers, mapExtractDPID, configurationSharedStateIdentity, zBooleanValue);
            initializeDatabaseWithCurrentPrivacyStatus();
            this.database.queue(strBuildURLString, event, configurationSharedStateIdentity);
        } else {
            Log.debug(LOG_SOURCE, "handleSyncIdentifiers : Ignoring ID sync because nothing new to sync after the last sync.", new Object[0]);
        }
        createSharedState(event.getEventNumber(), packageEventData());
        savePersistently();
        return true;
    }

    public void loadVariablesFromPersistentData() {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.debug(LOG_SOURCE, "loadVariablesFromPersistentData : Unable to load the Identity data from persistence because the LocalStorageService was null.", new Object[0]);
            return;
        }
        this.mid = dataStore.getString("ADOBEMOBILE_PERSISTED_MID", null);
        List<VisitorID> listConvertVisitorIdsStringToVisitorIDObjects = convertVisitorIdsStringToVisitorIDObjects(dataStore.getString("ADOBEMOBILE_VISITORID_IDS", null));
        if (listConvertVisitorIdsStringToVisitorIDObjects == null || listConvertVisitorIdsStringToVisitorIDObjects.isEmpty()) {
            listConvertVisitorIdsStringToVisitorIDObjects = null;
        }
        this.customerIds = listConvertVisitorIdsStringToVisitorIDObjects;
        this.locationHint = dataStore.getString("ADOBEMOBILE_PERSISTED_MID_HINT", null);
        this.blob = dataStore.getString("ADOBEMOBILE_PERSISTED_MID_BLOB", null);
        this.ttl = dataStore.getLong("ADOBEMOBILE_VISITORID_TTL", 600L);
        this.lastSync = dataStore.getLong("ADOBEMOBILE_VISITORID_SYNC", 0L);
        this.advertisingIdentifier = dataStore.getString("ADOBEMOBILE_ADVERTISING_IDENTIFIER", null);
        this.pushIdentifier = dataStore.getString("ADOBEMOBILE_PUSH_IDENTIFIER", null);
        Log.trace(LOG_SOURCE, "loadVariablesFromPersistentData : Successfully loaded the Identity data from persistence.", new Object[0]);
    }

    public List<VisitorID> mergeCustomerIds(List<VisitorID> list) {
        VisitorID visitorID;
        VisitorID visitorID2;
        if (list == null || list.isEmpty()) {
            return this.customerIds;
        }
        ArrayList arrayList = this.customerIds != null ? new ArrayList(this.customerIds) : new ArrayList();
        for (VisitorID visitorID3 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    visitorID = null;
                    visitorID2 = null;
                    break;
                }
                visitorID = (VisitorID) it.next();
                if (sameIdType(visitorID, visitorID3)) {
                    visitorID2 = new VisitorID(visitorID.getIdOrigin(), visitorID.getIdType(), visitorID3.getId(), visitorID3.getAuthenticationState());
                    break;
                }
            }
            if (visitorID2 != null) {
                arrayList.remove(visitorID);
                arrayList.add(visitorID2);
            } else {
                arrayList.add(visitorID3);
            }
        }
        return arrayList;
    }

    public void networkResponseLoaded(IdentityResponseObject identityResponseObject, String str, int i10) {
        boolean zHandleNetworkResponseMap;
        this.lastSync = TimeUtil.getUnixTimeInSeconds();
        if (this.privacyStatus != MobilePrivacyStatus.OPT_OUT) {
            zHandleNetworkResponseMap = handleNetworkResponseMap(identityResponseObject);
            savePersistently();
        } else {
            zHandleNetworkResponseMap = false;
        }
        EventData eventDataPackageEventData = packageEventData();
        if (zHandleNetworkResponseMap) {
            eventDataPackageEventData.putBoolean("updatesharedstate", true);
        }
        handleIdentityResponseEvent("UPDATED_IDENTITY_RESPONSE", eventDataPackageEventData, null);
        if (StringUtils.isNullOrEmpty(str)) {
            return;
        }
        handleIdentityResponseEvent("UPDATED_IDENTITY_RESPONSE", eventDataPackageEventData, str);
    }

    public EventData packageEventData() {
        EventData eventData = new EventData();
        if (!StringUtils.isNullOrEmpty(this.mid)) {
            eventData.putString(EventDataKeys.Identity.VISITOR_ID_MID, this.mid);
        }
        if (!StringUtils.isNullOrEmpty(this.advertisingIdentifier)) {
            eventData.putString(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, this.advertisingIdentifier);
        }
        if (!StringUtils.isNullOrEmpty(this.pushIdentifier)) {
            eventData.putString(EventDataKeys.Identity.PUSH_IDENTIFIER, this.pushIdentifier);
        }
        if (!StringUtils.isNullOrEmpty(this.blob)) {
            eventData.putString(EventDataKeys.Identity.VISITOR_ID_BLOB, this.blob);
        }
        if (!StringUtils.isNullOrEmpty(this.locationHint)) {
            eventData.putString(EventDataKeys.Identity.VISITOR_ID_LOCATION_HINT, this.locationHint);
        }
        List<VisitorID> list = this.customerIds;
        if (list != null && !list.isEmpty()) {
            eventData.putTypedList(EventDataKeys.Identity.VISITOR_IDS_LIST, this.customerIds, VisitorID.VARIANT_SERIALIZER);
        }
        eventData.putLong(EventDataKeys.Identity.VISITOR_IDS_LAST_SYNC, this.lastSync);
        return eventData;
    }

    public void processAudienceResponse(Event event) {
        EventData data;
        if (event == null || (data = event.getData()) == null || !data.containsKey("optedouthitsent") || data.optBoolean("optedouthitsent", false)) {
            return;
        }
        EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
        if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
            Log.trace(LOG_SOURCE, "processAudienceResponse : Unable to process the Identity events in the event queue because the configuration shared state is pending.", new Object[0]);
            return;
        }
        ConfigurationSharedStateIdentity configurationSharedStateIdentity = new ConfigurationSharedStateIdentity();
        configurationSharedStateIdentity.getConfigurationProperties(sharedEventState);
        if (configurationSharedStateIdentity.privacyStatus.equals(MobilePrivacyStatus.OPT_OUT)) {
            sendOptOutHit(configurationSharedStateIdentity);
        }
    }

    public boolean processEvent(Event event, ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        if (configurationSharedStateIdentity == null) {
            Log.trace(LOG_SOURCE, "processEvent : Unable to process the Identity event in the event queue because the configuration was not available yet.", new Object[0]);
            return true;
        }
        if (event == null) {
            Log.trace(LOG_SOURCE, "processEvent : Unable to process the Identity event in the event queue because the event was null.", new Object[0]);
            return true;
        }
        EventData data = event.getData();
        if (data == null) {
            Log.trace(LOG_SOURCE, "processEvent : Unable to process the Identity event in the event queue because the event data was null.", new Object[0]);
            return true;
        }
        Log.trace(LOG_SOURCE, "processEvent : Processing the Identity event: %s", event);
        EventType eventType = event.getEventType();
        EventType eventType2 = EventType.GENERIC_IDENTITY;
        if (eventType.equals(eventType2) && event.getEventSource().equals(EventSource.REQUEST_RESET)) {
            handleIdentityRequestReset(event);
        } else if (data.optBoolean(EventDataKeys.Identity.IS_SYNC_EVENT, false) || event.getEventType().equals(eventType2)) {
            if (!handleSyncIdentifiers(event, configurationSharedStateIdentity)) {
                Log.warning(LOG_SOURCE, "ProcessEvent : Configuration is missing a valid experienceCloud.org which is needed to process Identity events. Processing will resume once a valid configuration is obtained.", new Object[0]);
                return false;
            }
        } else if (data.containsKey(EventDataKeys.Identity.BASE_URL)) {
            EventData sharedEventState = getSharedEventState(EventDataKeys.Analytics.MODULE_NAME, event);
            if (shouldWaitForPendingSharedState(event, EventDataKeys.Analytics.MODULE_NAME, sharedEventState)) {
                Log.trace(LOG_SOURCE, "ProcessEvent : Analytics is registered but has pending shared state. Waiting for Analytics state before processing appendToUrl event.", new Object[0]);
                return false;
            }
            handleAppendURL(event, configurationSharedStateIdentity, sharedEventState);
        } else if (data.optBoolean("urlvariables", false)) {
            EventData sharedEventState2 = getSharedEventState(EventDataKeys.Analytics.MODULE_NAME, event);
            if (shouldWaitForPendingSharedState(event, EventDataKeys.Analytics.MODULE_NAME, sharedEventState2)) {
                Log.trace(LOG_SOURCE, "ProcessEvent : Analytics is registered but has pending shared state. Waiting for Analytics state before processing getUrlVariables event.", new Object[0]);
                return false;
            }
            handleGetUrlVariables(event, configurationSharedStateIdentity, sharedEventState2);
        } else {
            handleIdentityResponseEvent("IDENTITY_RESPONSE_CONTENT_ONE_TIME", packageEventData(), event.getResponsePairID());
        }
        return true;
    }

    public void processEventQueue() {
        while (!this.eventsQueue.isEmpty()) {
            Event eventPeek = this.eventsQueue.peek();
            EventData sharedEventState = getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, eventPeek);
            if (sharedEventState == EventHub.SHARED_STATE_PENDING) {
                Log.trace(LOG_SOURCE, "processEventQueue : Unable to process the Identity events in the event queue because the configuration shared state was pending.", new Object[0]);
                return;
            }
            ConfigurationSharedStateIdentity configurationSharedStateIdentity = new ConfigurationSharedStateIdentity();
            configurationSharedStateIdentity.getConfigurationProperties(sharedEventState);
            if (!processEvent(eventPeek, configurationSharedStateIdentity)) {
                return;
            } else {
                this.eventsQueue.poll();
            }
        }
    }

    public boolean processNewPushToken(String str) {
        LocalStorageService.DataStore dataStore = getDataStore();
        if (dataStore == null) {
            Log.trace(LOG_SOURCE, "processNewPushToken : Unable to update push settings because the LocalStorageService was not available.", new Object[0]);
            return false;
        }
        String string = dataStore.getString("ADOBEMOBILE_PUSH_IDENTIFIER", null);
        boolean z10 = dataStore.getBoolean("ADOBEMOBILE_ANALYTICS_PUSH_SYNC", false);
        boolean z11 = (StringUtils.isNullOrEmpty(str) && string == null) || (string != null && string.equals(str));
        if ((z11 && !StringUtils.isNullOrEmpty(str)) || (z11 && z10)) {
            return false;
        }
        if (!z10) {
            dataStore.setBoolean("ADOBEMOBILE_ANALYTICS_PUSH_SYNC", true);
        }
        if (StringUtils.isNullOrEmpty(str)) {
            dataStore.remove("ADOBEMOBILE_PUSH_IDENTIFIER");
        } else {
            dataStore.setString("ADOBEMOBILE_PUSH_IDENTIFIER", str);
        }
        return true;
    }

    public void processPrivacyChange(int i10, EventData eventData) {
        MobilePrivacyStatus mobilePrivacyStatusFromString;
        if (eventData == null || this.privacyStatus == (mobilePrivacyStatusFromString = MobilePrivacyStatus.fromString(eventData.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY.getValue())))) {
            return;
        }
        this.privacyStatus = mobilePrivacyStatusFromString;
        Log.trace(LOG_SOURCE, "processPrivacyChange : Processed privacy change request: [%d]. New privacy status is: (%s).", Integer.valueOf(i10), this.privacyStatus.getValue());
        if (this.privacyStatus == MobilePrivacyStatus.OPT_OUT) {
            this.mid = null;
            this.advertisingIdentifier = null;
            this.blob = null;
            this.locationHint = null;
            this.customerIds = null;
            LocalStorageService.DataStore dataStore = getDataStore();
            if (dataStore != null) {
                dataStore.remove("ADOBEMOBILE_AID_SYNCED");
            }
            updatePushIdentifier(null);
            savePersistently();
            createSharedState(i10, packageEventData());
            clearEventsQueue();
        } else if (StringUtils.isNullOrEmpty(this.mid)) {
            this.eventsQueue.add(createForcedSyncEvent(i10));
            processEventQueue();
        }
        initializeDatabaseWithCurrentPrivacyStatus();
    }

    public void sendOptOutHit(ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        String strBuildOptOutURLString = buildOptOutURLString(configurationSharedStateIdentity);
        if (StringUtils.isNullOrEmpty(strBuildOptOutURLString)) {
            Log.debug(LOG_SOURCE, "sendOptOutHit : Unable to send network hit because the opt-out URL was null.", new Object[0]);
            return;
        }
        PlatformServices platformServices = getPlatformServices();
        if (platformServices != null) {
            NetworkService networkService = platformServices.getNetworkService();
            if (networkService == null) {
                Log.debug(LOG_SOURCE, "sendOptOutHit : Unable to send network request to the opt-out URL (%s) because NetworkService is unavailable.", strBuildOptOutURLString);
            } else {
                Log.debug(LOG_SOURCE, "sendOptOutHit : Sending network request to the opt-out URL: (%s).", strBuildOptOutURLString);
                networkService.connectUrlAsync(strBuildOptOutURLString, NetworkService.HttpCommand.GET, null, null, Guess.REFERENCE_YEAR, Guess.REFERENCE_YEAR, new NetworkService.Callback() { // from class: com.adobe.marketing.mobile.IdentityExtension.1
                    @Override // com.adobe.marketing.mobile.NetworkService.Callback
                    public void call(NetworkService.HttpConnection httpConnection) {
                        if (httpConnection == null) {
                            return;
                        }
                        if (httpConnection.getResponseCode() == 200) {
                            Log.trace(IdentityExtension.LOG_SOURCE, "sendOptOutHit - Successfully sent the opt-out hit.", new Object[0]);
                        } else {
                            Log.trace(IdentityExtension.LOG_SOURCE, "sendOptOutHit - Failed to send the opt-out hit with connection status (%s).", Integer.valueOf(httpConnection.getResponseCode()));
                        }
                        httpConnection.close();
                    }
                });
            }
        }
    }

    public boolean shouldWaitForPendingSharedState(Event event, String str, EventData eventData) {
        EventData eventData2 = EventHub.SHARED_STATE_PENDING;
        if (eventData != eventData2) {
            return false;
        }
        EventData sharedEventState = getSharedEventState("com.adobe.module.eventhub", event);
        if (sharedEventState == eventData2) {
            Log.trace(LOG_SOURCE, "shouldWaitForPendingSharedState : Event Hub shared state is pending.", new Object[0]);
            return true;
        }
        Map<String, Variant> mapOptVariantMap = sharedEventState.optVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, null);
        if (mapOptVariantMap != null) {
            return mapOptVariantMap.containsKey(str);
        }
        Log.warning(LOG_SOURCE, "shouldWaitForPendingSharedState : Event Hub shared state did not have registered extensions info.", new Object[0]);
        return false;
    }

    public void updateLatestValidConfiguration(EventData eventData) {
        if (StringUtils.isNullOrEmpty(eventData.optString(EventDataKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORGID_KEY, null))) {
            return;
        }
        ConfigurationSharedStateIdentity configurationSharedStateIdentity = new ConfigurationSharedStateIdentity();
        this.latestValidConfig = configurationSharedStateIdentity;
        configurationSharedStateIdentity.getConfigurationProperties(eventData);
        processEventQueue();
    }

    public void updatePushIdentifier(String str) {
        this.pushIdentifier = str;
        if (!processNewPushToken(str)) {
            Log.debug(LOG_SOURCE, "updatePushIdentifier : Ignored a push token (%s) as it matches with an existing token, and the push notification status will not be re-sent to Analytics.", str);
            return;
        }
        if (str == null && !isPushEnabled()) {
            changePushStatusAndHitAnalytics(false);
            Log.debug(LOG_SOURCE, "updatePushIdentifier : First time sending a.push.optin false", new Object[0]);
        } else if (str == null) {
            changePushStatusAndHitAnalytics(false);
        } else {
            if (isPushEnabled()) {
                return;
            }
            changePushStatusAndHitAnalytics(true);
        }
    }
}
