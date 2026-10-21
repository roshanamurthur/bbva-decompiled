package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsState {
    private static final String LOG_TAG = "AnalyticsState";
    private String advertisingIdentifier;
    private String applicationID;
    private String blob;
    private String locationHint;
    private String marketingCloudID;
    private String marketingCloudOrganizationID;
    private String rsids;
    private String serializedVisitorIDsList;
    private String server;
    private boolean analyticsForwardingEnabled = false;
    private boolean offlineEnabled = false;
    private int batchLimit = 0;
    private MobilePrivacyStatus privacyStatus = AnalyticsConstants.Default.DEFAULT_PRIVACY_STATUS;
    private int referrerTimeout = 0;
    private boolean assuranceSessionActive = false;
    private boolean backdateSessionInfoEnabled = false;
    private Map<String, String> defaultData = new HashMap();
    private int sessionTimeout = 300000;
    private long lifecycleMaxSessionLength = 0;
    private long lifecycleSessionStartTimestamp = 0;

    public AnalyticsState(Map<String, EventData> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, EventData> entry : map.entrySet()) {
            if (EventDataKeys.Configuration.MODULE_NAME.equals(entry.getKey())) {
                extractConfigurationInfo(entry.getValue());
            } else if (EventDataKeys.Lifecycle.MODULE_NAME.equals(entry.getKey())) {
                extractLifecycleInfo(entry.getValue());
            } else if (EventDataKeys.Identity.MODULE_NAME.equals(entry.getKey())) {
                extractIdentityInfo(entry.getValue());
            } else if ("com.adobe.module.places".equals(entry.getKey())) {
                extractPlacesInfo(entry.getValue());
            } else if ("com.adobe.assurance".equals(entry.getKey())) {
                extractAssuranceInfo(entry.getValue());
            }
        }
    }

    private void extractAssuranceInfo(EventData eventData) {
        if (eventData == null) {
            Log.trace(LOG_TAG, "extractAssuranceInfo - Failed to extract assurance data (event data was null).", new Object[0]);
        } else {
            this.assuranceSessionActive = !StringUtils.isNullOrEmpty(eventData.optString("sessionid", null));
        }
    }

    private void extractConfigurationInfo(EventData eventData) {
        if (eventData == null) {
            Log.trace(LOG_TAG, "extractConfigurationInfo - Failed to extract configuration data as event data was null.", new Object[0]);
            return;
        }
        this.server = eventData.optString(EventDataKeys.Configuration.ANALYTICS_CONFIG_SERVER, null);
        this.rsids = eventData.optString(EventDataKeys.Configuration.ANALYTICS_CONFIG_REPORT_SUITES, null);
        this.analyticsForwardingEnabled = eventData.optBoolean(EventDataKeys.Configuration.ANALYTICS_CONFIG_AAMFORWARDING, false);
        this.offlineEnabled = eventData.optBoolean(EventDataKeys.Configuration.ANALYTICS_CONFIG_OFFLINE_TRACKING, false);
        this.batchLimit = eventData.optInteger(EventDataKeys.Configuration.ANALYTICS_CONFIG_BATCH_LIMIT, 0);
        int iOptInteger = eventData.optInteger("analytics.launchHitDelay", 0);
        if (iOptInteger >= 0) {
            this.referrerTimeout = iOptInteger;
        }
        this.marketingCloudOrganizationID = eventData.optString(EventDataKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORGID_KEY, null);
        this.backdateSessionInfoEnabled = eventData.optBoolean(EventDataKeys.Configuration.ANALYTICS_CONFIG_BACKDATE_PREVIOUS_SESSION, false);
        this.privacyStatus = MobilePrivacyStatus.fromString(eventData.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, AnalyticsConstants.Default.DEFAULT_PRIVACY_STATUS.getValue()));
        this.sessionTimeout = eventData.optInteger(EventDataKeys.Configuration.LIFECYCLE_CONFIG_SESSION_TIMEOUT, 300000);
    }

    private void extractIdentityInfo(EventData eventData) {
        if (eventData == null) {
            Log.trace(LOG_TAG, "extractIdentityInfo - Failed to extract identity data as event data was null.", new Object[0]);
            return;
        }
        this.marketingCloudID = eventData.optString(EventDataKeys.Identity.VISITOR_ID_MID, null);
        this.blob = eventData.optString(EventDataKeys.Identity.VISITOR_ID_BLOB, null);
        this.locationHint = eventData.optString(EventDataKeys.Identity.VISITOR_ID_LOCATION_HINT, null);
        this.advertisingIdentifier = eventData.optString(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, null);
        if (eventData.containsKey(EventDataKeys.Identity.VISITOR_IDS_LIST)) {
            try {
                this.serializedVisitorIDsList = AnalyticsRequestSerializer.generateAnalyticsCustomerIdString(eventData.getTypedList(EventDataKeys.Identity.VISITOR_IDS_LIST, VisitorID.VARIANT_SERIALIZER));
            } catch (VariantException e5) {
                Log.debug(LOG_TAG, "extractIdentityInfo - The format of the serializedVisitorIDsList list is invalid: %s", e5);
            }
        }
    }

    private void extractLifecycleInfo(EventData eventData) {
        if (eventData == null) {
            Log.trace(LOG_TAG, "extractLifecycleInfo - Failed to extract lifecycle data (event data was null).", new Object[0]);
            return;
        }
        this.lifecycleSessionStartTimestamp = eventData.optLong(EventDataKeys.Lifecycle.SESSION_START_TIMESTAMP, 0L);
        this.lifecycleMaxSessionLength = eventData.optLong(EventDataKeys.Lifecycle.MAX_SESSION_LENGTH, 0L);
        Map<String, String> mapOptStringMap = eventData.optStringMap(EventDataKeys.Lifecycle.LIFECYCLE_CONTEXT_DATA, null);
        if (mapOptStringMap == null || mapOptStringMap.isEmpty()) {
            return;
        }
        String str = mapOptStringMap.get("osversion");
        if (!StringUtils.isNullOrEmpty(str)) {
            this.defaultData.put("a.OSVersion", str);
        }
        String str2 = mapOptStringMap.get("devicename");
        if (!StringUtils.isNullOrEmpty(str2)) {
            this.defaultData.put("a.DeviceName", str2);
        }
        String str3 = mapOptStringMap.get("resolution");
        if (!StringUtils.isNullOrEmpty(str3)) {
            this.defaultData.put("a.Resolution", str3);
        }
        String str4 = mapOptStringMap.get("carriername");
        if (!StringUtils.isNullOrEmpty(str4)) {
            this.defaultData.put("a.CarrierName", str4);
        }
        String str5 = mapOptStringMap.get("runmode");
        if (!StringUtils.isNullOrEmpty(str5)) {
            this.defaultData.put("a.RunMode", str5);
        }
        String str6 = mapOptStringMap.get("appid");
        if (StringUtils.isNullOrEmpty(str6)) {
            return;
        }
        this.defaultData.put("a.AppID", str6);
        this.applicationID = str6;
    }

    private void extractPlacesInfo(EventData eventData) {
        if (eventData == null) {
            Log.trace(LOG_TAG, "extractPlacesInfo - Failed to extract places data (event data was null).", new Object[0]);
            return;
        }
        Map<String, String> mapOptStringMap = eventData.optStringMap("currentpoi", null);
        if (mapOptStringMap == null) {
            return;
        }
        String str = mapOptStringMap.get("regionid");
        if (!StringUtils.isNullOrEmpty(str)) {
            this.defaultData.put("a.loc.poi.id", str);
        }
        String str2 = mapOptStringMap.get("regionname");
        if (StringUtils.isNullOrEmpty(str2)) {
            return;
        }
        this.defaultData.put("a.loc.poi", str2);
    }

    private String getAnalyticsResponseType() {
        return this.analyticsForwardingEnabled ? "10" : "0";
    }

    public String getAdvertisingIdentifier() {
        return this.advertisingIdentifier;
    }

    public final Map<String, String> getAnalyticsIdVisitorParameters() {
        HashMap map = new HashMap();
        if (StringUtils.isNullOrEmpty(this.marketingCloudID)) {
            return map;
        }
        map.put(EventDataKeys.Identity.VISITOR_ID_MID, this.marketingCloudID);
        if (!StringUtils.isNullOrEmpty(this.blob)) {
            map.put("aamb", this.blob);
        }
        if (!StringUtils.isNullOrEmpty(this.locationHint)) {
            map.put("aamlh", this.locationHint);
        }
        return map;
    }

    public String getApplicationID() {
        return this.applicationID;
    }

    public String getBaseURL(String str) {
        URLBuilder uRLBuilder = new URLBuilder();
        uRLBuilder.enableSSL(true).setServer(this.server).addPath("b").addPath("ss").addPath(this.rsids).addPath(getAnalyticsResponseType()).addPath(str).addPath("s");
        String strBuild = uRLBuilder.build();
        return strBuild == null ? "" : strBuild;
    }

    public int getBatchLimit() {
        return this.batchLimit;
    }

    public Map<String, String> getDefaultData() {
        return this.defaultData;
    }

    public long getLifecycleMaxSessionLength() {
        return this.lifecycleMaxSessionLength;
    }

    public long getLifecycleSessionStartTimestamp() {
        return this.lifecycleSessionStartTimestamp;
    }

    public String getMarketingCloudId() {
        return this.marketingCloudID;
    }

    public String getMarketingCloudOrganizationID() {
        return this.marketingCloudOrganizationID;
    }

    public MobilePrivacyStatus getPrivacyStatus() {
        return this.privacyStatus;
    }

    public int getReferrerTimeout() {
        return this.referrerTimeout;
    }

    public String getRsids() {
        return this.rsids;
    }

    public String getSerializedVisitorIDsList() {
        return this.serializedVisitorIDsList;
    }

    public String getServer() {
        return this.server;
    }

    public int getSessionTimeout() {
        return this.sessionTimeout;
    }

    public boolean isAnalyticsConfigured() {
        return (StringUtils.isNullOrEmpty(this.rsids) || StringUtils.isNullOrEmpty(this.server)) ? false : true;
    }

    public boolean isAnalyticsForwardingEnabled() {
        return this.analyticsForwardingEnabled;
    }

    public boolean isAssuranceSessionActive() {
        return this.assuranceSessionActive;
    }

    public boolean isBackdateSessionInfoEnabled() {
        return this.backdateSessionInfoEnabled;
    }

    public boolean isOfflineTrackingEnabled() {
        return this.offlineEnabled;
    }

    public boolean isOptIn() {
        return this.privacyStatus == MobilePrivacyStatus.OPT_IN;
    }

    public boolean isVisitorIDServiceEnabled() {
        return !StringUtils.isNullOrEmpty(this.marketingCloudOrganizationID);
    }

    public void setAnalyticsForwardingEnabled(boolean z10) {
        this.analyticsForwardingEnabled = z10;
    }

    public void setApplicationID(String str) {
        this.applicationID = str;
    }

    public void setBackdateSessionInfoEnabled(boolean z10) {
        this.backdateSessionInfoEnabled = z10;
    }

    public void setBatchLimit(int i10) {
        this.batchLimit = i10;
    }

    public void setMarketingCloudOrganizationID(String str) {
        this.marketingCloudOrganizationID = str;
    }

    public void setOfflineEnabled(boolean z10) {
        this.offlineEnabled = z10;
    }

    public void setPrivacyStatus(MobilePrivacyStatus mobilePrivacyStatus) {
        this.privacyStatus = mobilePrivacyStatus;
    }

    public void setReferrerTimeout(int i10) {
        this.referrerTimeout = i10;
    }

    public void setRsids(String str) {
        this.rsids = str;
    }

    public void setServer(String str) {
        this.server = str;
    }
}
