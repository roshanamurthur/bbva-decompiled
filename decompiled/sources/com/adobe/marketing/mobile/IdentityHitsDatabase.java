package com.adobe.marketing.mobile;

import com.nulabinc.zxcvbn.Guess;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class IdentityHitsDatabase implements HitQueue.IHitProcessor<IdentityHit> {
    private static final String IDENTITY_DATABASE_FILENAME = "ADBMobileIdentity.sqlite";
    private static final String LOG_TAG = "IdentityHitsDatabase";
    private static final String TABLE_REQUESTS = "REQUESTS";
    private final HitQueue<IdentityHit, IdentityHitSchema> hitQueue;
    private final IdentityHitSchema identityHitSchema;
    private final NetworkService networkService;
    private final IdentityExtension parentModule;
    private final SystemInfoService systemInfoService;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.IdentityHitsDatabase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus;

        static {
            int[] iArr = new int[MobilePrivacyStatus.values().length];
            $SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus = iArr;
            try {
                iArr[MobilePrivacyStatus.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus[MobilePrivacyStatus.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus[MobilePrivacyStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IdentityHitsDatabase(IdentityExtension identityExtension, PlatformServices platformServices) {
        this(identityExtension, platformServices, null);
    }

    private void resetEventNumberAndPairIdForExistingRequests() {
        this.hitQueue.updateAllHits(this.identityHitSchema.generateUpdateValuesForResetEventNumberAndPairId());
    }

    public IdentityResponseObject createIdentityObjectFromResponseJsonObject(JsonUtilityService.JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.debug("IdentityExtension", "createIdentityObjectFromResponseJsonObject: Unable to parse identity network response because the JSON object created was null.", new Object[0]);
            return null;
        }
        IdentityResponseObject identityResponseObject = new IdentityResponseObject();
        identityResponseObject.blob = jSONObject.optString("d_blob", null);
        identityResponseObject.error = jSONObject.optString("error_msg", null);
        identityResponseObject.mid = jSONObject.optString("d_mid", null);
        int iOptInt = jSONObject.optInt("dcs_region", -1);
        identityResponseObject.hint = iOptInt != -1 ? Integer.toString(iOptInt) : null;
        identityResponseObject.ttl = jSONObject.optLong("id_sync_ttl", 600L);
        JsonUtilityService.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("d_optout");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                } catch (JsonException e5) {
                    Log.debug("IdentityExtension", "createIdentityObjectFromResponseJsonObject : Unable to read opt-out JSON array due to an exception: (%s).", e5);
                }
            }
            identityResponseObject.optOutList = arrayList;
        }
        return identityResponseObject;
    }

    public boolean queue(String str, Event event, ConfigurationSharedStateIdentity configurationSharedStateIdentity) {
        IdentityHit identityHit = new IdentityHit();
        identityHit.url = str;
        identityHit.timestamp = event.getTimestampInSeconds();
        identityHit.pairId = event.getResponsePairID();
        identityHit.eventNumber = event.getEventNumber();
        identityHit.configSSL = true;
        boolean zQueue = this.hitQueue.queue(identityHit);
        Log.debug(LOG_TAG, "IdentityHitsDatabase.queue : Queued an identity sync call with URL: (%s) resulted from the event: (%s).", str, event.getUniqueIdentifier());
        if (configurationSharedStateIdentity.privacyStatus == MobilePrivacyStatus.OPT_IN) {
            this.hitQueue.bringOnline();
        }
        return zQueue;
    }

    public void updatePrivacyStatus(MobilePrivacyStatus mobilePrivacyStatus) {
        if (this.hitQueue == null) {
            Log.trace(LOG_TAG, "updatePrivacyStatus : No Identity hits to process due to Privacy Status change.", new Object[0]);
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus[mobilePrivacyStatus.ordinal()];
        if (i10 == 1) {
            Log.debug(LOG_TAG, "updatePrivacyStatus : Privacy Status was opted-in, so attempting to send all the queued Identity hits from database.", new Object[0]);
            this.hitQueue.bringOnline();
        } else if (i10 == 2) {
            Log.debug(LOG_TAG, "updatePrivacyStatus : Privacy Status was opted-out, so all the queued Identity hits were cleared from database.", new Object[0]);
            this.hitQueue.suspend();
            this.hitQueue.deleteAllHits();
        } else if (i10 != 3) {
            Log.debug(LOG_TAG, "updatePrivacyStatus : Received an unknown Privacy Status value: (%s). ", mobilePrivacyStatus);
        } else {
            Log.debug(LOG_TAG, "updatePrivacyStatus : Privacy Status was opt-unknown, suspending the Identity hits processing from database.", new Object[0]);
            this.hitQueue.suspend();
        }
    }

    public IdentityHitsDatabase(IdentityExtension identityExtension, PlatformServices platformServices, HitQueue<IdentityHit, IdentityHitSchema> hitQueue) {
        IdentityHitSchema identityHitSchema = new IdentityHitSchema();
        this.identityHitSchema = identityHitSchema;
        this.parentModule = identityExtension;
        SystemInfoService systemInfoService = platformServices.getSystemInfoService();
        this.systemInfoService = systemInfoService;
        this.networkService = platformServices.getNetworkService();
        File file = new File(systemInfoService != null ? systemInfoService.getApplicationCacheDir() : null, IDENTITY_DATABASE_FILENAME);
        if (hitQueue != null) {
            this.hitQueue = hitQueue;
        } else {
            this.hitQueue = new HitQueue<>(platformServices, file, TABLE_REQUESTS, identityHitSchema, this);
        }
        resetEventNumberAndPairIdForExistingRequests();
    }

    @Override // com.adobe.marketing.mobile.HitQueue.IHitProcessor
    public HitQueue.RetryType process(IdentityHit identityHit) {
        String str = identityHit.url;
        IdentityResponseObject identityResponseObjectCreateIdentityObjectFromResponseJsonObject = null;
        if (str == null) {
            Log.debug("IdentityExtension", "IdentityHitsDatabase.process : Unable to process IdentityExtension hit because it does not contain a url.", new Object[0]);
            this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
            return HitQueue.RetryType.NO;
        }
        Log.debug("IdentityExtension", "IdentityHitsDatabase.process : Sending request: (%s).", str);
        NetworkService.HttpConnection httpConnectionConnectUrl = this.networkService.connectUrl(identityHit.url, NetworkService.HttpCommand.GET, null, NetworkConnectionUtil.getHeaders(identityHit.configSSL), Guess.REFERENCE_YEAR, Guess.REFERENCE_YEAR);
        if (httpConnectionConnectUrl == null) {
            Log.debug("IdentityExtension", "IdentityHitsDatabase.process : An unknown error occurred during the Identity network call, connection is null. Will not retry.", new Object[0]);
            this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
            return HitQueue.RetryType.NO;
        }
        if (httpConnectionConnectUrl.getResponseCode() != 200) {
            if (NetworkConnectionUtil.recoverableNetworkErrorCodes.contains(Integer.valueOf(httpConnectionConnectUrl.getResponseCode()))) {
                Log.debug(LOG_TAG, "IdentityHitsDatabase.process : A recoverable network error occurred with response code %d while processing ECID Service requests.  Will retry in 30 seconds.", Integer.valueOf(httpConnectionConnectUrl.getResponseCode()));
                return HitQueue.RetryType.YES;
            }
            Log.debug(LOG_TAG, "IdentityHitsDatabase.process : Discarding ECID Service request because of an un-recoverable network error with response code %d occurred while processing it.", Integer.valueOf(httpConnectionConnectUrl.getResponseCode()));
            this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
            return HitQueue.RetryType.NO;
        }
        try {
            String fromInputStream = NetworkConnectionUtil.readFromInputStream(httpConnectionConnectUrl.getInputStream());
            if (this.parentModule.getPlatformServices() == null) {
                Log.debug("IdentityExtension", "IdentityHitsDatabase.process : Unable to parse the ECID Service response data because Platform Services are not available.", new Object[0]);
                this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
                return HitQueue.RetryType.NO;
            }
            JsonUtilityService jsonUtilityService = this.parentModule.getPlatformServices().getJsonUtilityService();
            if (jsonUtilityService == null) {
                Log.debug("IdentityExtension", "IdentityHitsDatabase.process : Unable to parse the ECID Service response data because the JSON utility service is not available.", new Object[0]);
                this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
                return HitQueue.RetryType.NO;
            }
            JsonUtilityService.JSONObject jSONObjectCreateJSONObject = jsonUtilityService.createJSONObject(fromInputStream);
            if (jSONObjectCreateJSONObject == null) {
                Log.debug("IdentityExtension", "IdentityHitsDatabase.process : Unable to parse the ECID Service response data, no response data or invalid JSON format: (%s)", fromInputStream);
                this.parentModule.networkResponseLoaded(null, identityHit.pairId, identityHit.eventNumber);
                return HitQueue.RetryType.NO;
            }
            identityResponseObjectCreateIdentityObjectFromResponseJsonObject = createIdentityObjectFromResponseJsonObject(jSONObjectCreateJSONObject);
            Log.trace(LOG_TAG, "IdentityHitsDatabase.process : ECID Service response data was parsed successfully.", new Object[0]);
            this.parentModule.networkResponseLoaded(identityResponseObjectCreateIdentityObjectFromResponseJsonObject, identityHit.pairId, identityHit.eventNumber);
            return HitQueue.RetryType.NO;
        } catch (IOException e5) {
            Log.debug("IdentityExtension", "IdentityHitsDatabase.process : An unknown exception occurred while trying to process the response from the ECID Service: (%s).", e5);
        }
    }
}
