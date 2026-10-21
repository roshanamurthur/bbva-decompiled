package com.adobe.marketing.mobile;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsHitsDatabase implements HitQueue.IHitProcessor<AnalyticsHit> {
    private static final String ANALYTICS_FILENAME = "ADBMobileDataCache.sqlite";
    private static final String ANALYTICS_TABLE_NAME = "HITS";
    private static final String LOG_TAG = "AnalyticsHitsDatabase";
    private static final int RANDOM_INT_BOUND = 100000000;
    private static final SecureRandom SECURE_RNG = new SecureRandom();
    private static final int TIMESTAMP_DISABLED_WAIT_THRESHOLD_SECONDS = 60;
    private AnalyticsHitSchema analyticsHitSchema;
    private AnalyticsProperties analyticsProperties;
    private AnalyticsDispatcherAnalyticsResponseContent analyticsResponseDispatcher;
    private HitQueue<AnalyticsHit, AnalyticsHitSchema> hitQueue;
    long lastHitTimestampInSeconds;
    private NetworkService networkService;
    private AnalyticsState previousState;
    private SystemInfoService systemInfoService;

    public AnalyticsHitsDatabase(PlatformServices platformServices, AnalyticsProperties analyticsProperties, AnalyticsDispatcherAnalyticsResponseContent analyticsDispatcherAnalyticsResponseContent) throws MissingPlatformServicesException {
        this.analyticsProperties = analyticsProperties;
        this.analyticsResponseDispatcher = analyticsDispatcherAnalyticsResponseContent;
        this.networkService = platformServices.getNetworkService();
        this.systemInfoService = platformServices.getSystemInfoService();
        this.analyticsHitSchema = new AnalyticsHitSchema();
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService == null || this.networkService == null) {
            throw new MissingPlatformServicesException("Missing platform service (SystemInfoService and/or NetworkService)");
        }
        this.hitQueue = new HitQueue<>(platformServices, new File(systemInfoService.getApplicationCacheDir(), ANALYTICS_FILENAME), ANALYTICS_TABLE_NAME, this.analyticsHitSchema, this);
        this.lastHitTimestampInSeconds = 0L;
    }

    private HitQueue.RetryType handleNetworkConnection(NetworkService.HttpConnection httpConnection, AnalyticsHit analyticsHit) {
        if (httpConnection == null) {
            return HitQueue.RetryType.YES;
        }
        HitQueue.RetryType retryType = HitQueue.RetryType.NO;
        if (httpConnection.getResponseCode() == 200) {
            try {
                String fromInputStream = NetworkConnectionUtil.readFromInputStream(httpConnection.getInputStream());
                HashMap<String, String> map = new HashMap<>();
                map.put("ETag", httpConnection.getResponsePropertyValue("ETag"));
                map.put("Server", httpConnection.getResponsePropertyValue("Server"));
                map.put(DigipassManagerConstants.KEY_CONTENT_TYPE, httpConnection.getResponsePropertyValue(DigipassManagerConstants.KEY_CONTENT_TYPE));
                if (analyticsHit.timestamp > this.analyticsProperties.getLastResetIdentitiesTimestamp()) {
                    this.analyticsResponseDispatcher.dispatchAnalyticsHitResponse(fromInputStream, map, analyticsHit.uniqueEventIdentifier, analyticsHit.server, analyticsHit.url);
                }
                this.lastHitTimestampInSeconds = analyticsHit.timestamp;
            } catch (IOException e5) {
                Log.warning(LOG_TAG, "handleNetworkConnection - Couldn't read server response, failed with error (%s)", e5);
                retryType = HitQueue.RetryType.NO;
            }
        } else if (httpConnection.getResponseCode() == -1) {
            retryType = HitQueue.RetryType.YES;
        }
        httpConnection.close();
        return retryType;
    }

    private NetworkService.HttpConnection sendAnalyticsHitToServer(String str, String str2) {
        StringBuilder sbD = c.d(str);
        sbD.append(SECURE_RNG.nextInt(RANDOM_INT_BOUND));
        String string = sbD.toString();
        byte[] bytes = str2 != null ? str2.getBytes(Charset.forName("UTF-8")) : null;
        Log.debug(LOG_TAG, "sendAnalyticsHitToServer - AnalyticsExtension request was sent with body (%s)", str2);
        return this.networkService.connectUrl(string, NetworkService.HttpCommand.POST, bytes, NetworkConnectionUtil.getHeaders(true), 5, 5);
    }

    private void updateTimestampIfNeeded(AnalyticsHit analyticsHit, long j10) {
        if (analyticsHit.timestamp - j10 < 0) {
            long j11 = j10 + 1;
            String str = "&ts=" + Long.toString(analyticsHit.timestamp);
            String str2 = "&ts=" + Long.toString(j11);
            Log.debug(LOG_TAG, "updateTimestampIfNeeded - Adjusting out of order hit timestamp (%d->%d)", Long.valueOf(analyticsHit.timestamp), Long.valueOf(j11));
            analyticsHit.timestamp = j11;
            analyticsHit.url = analyticsHit.url.replaceFirst(str, str2);
        }
    }

    public void clearTrackingQueue() {
        this.hitQueue.deleteAllHits();
    }

    public void forceKick(AnalyticsState analyticsState) {
        Log.debug(LOG_TAG, "forceKick - Force Kicking database hits.", new Object[0]);
        kick(analyticsState, true);
    }

    public long getTrackingQueueSize() {
        return this.hitQueue.getSize(this.analyticsHitSchema.getRegularHitQuery(ANALYTICS_TABLE_NAME));
    }

    public boolean isHitWaiting() {
        return this.hitQueue.queryHit(this.analyticsHitSchema.getFirstWaitingHitQuery(ANALYTICS_TABLE_NAME)) != null;
    }

    public void kick(AnalyticsState analyticsState, boolean z10) {
        if (this.analyticsProperties.isDatabaseWaiting()) {
            Log.debug(LOG_TAG, "kick - Failed to kick database hits as Database not ready", new Object[0]);
            return;
        }
        if (analyticsState == null) {
            analyticsState = this.previousState;
        }
        if (analyticsState == null) {
            Log.debug(LOG_TAG, "kick - Failed to kick database hits as Analytics state is null.", new Object[0]);
            return;
        }
        if (!analyticsState.isOptIn()) {
            Log.debug(LOG_TAG, "kick - Failed to kick database hits as Privacy status is not opted-in.", new Object[0]);
            return;
        }
        if (!analyticsState.isOfflineTrackingEnabled() || getTrackingQueueSize() > analyticsState.getBatchLimit() || z10) {
            String baseURL = analyticsState.getBaseURL(AnalyticsVersionProvider.getVersion());
            if (!StringUtils.isNullOrEmpty(baseURL)) {
                Log.debug(LOG_TAG, "kick - Bring Analytics tracking online as it is over batch limit or offline tracking is not enabled", new Object[0]);
                this.hitQueue.updateAllHits(AnalyticsHitSchema.generateUpdateValuesForServer(baseURL));
                this.hitQueue.bringOnline();
            }
        }
        this.previousState = analyticsState;
    }

    public void kickWithAdditionalData(AnalyticsState analyticsState, Map<String, String> map) {
        String str;
        Log.trace(LOG_TAG, "kickWithAdditionalData - Additional data was received, trying to kick Analytics queue.", new Object[0]);
        if (map == null || map.isEmpty()) {
            kick(analyticsState, false);
            return;
        }
        AnalyticsHit analyticsHit = (AnalyticsHit) this.hitQueue.queryHit(this.analyticsHitSchema.getFirstWaitingHitQuery(ANALYTICS_TABLE_NAME));
        if (analyticsHit != null && (str = analyticsHit.url) != null) {
            analyticsHit.url = ContextDataUtil.appendContextData(map, str);
            this.hitQueue.updateHit(analyticsHit);
        }
        kick(analyticsState, false);
        if (analyticsState != null) {
            this.previousState = analyticsState;
        }
    }

    public void queue(AnalyticsState analyticsState, String str, long j10, boolean z10, boolean z11, String str2) {
        AnalyticsHit analyticsHit = new AnalyticsHit();
        analyticsHit.url = str;
        analyticsHit.timestamp = j10;
        analyticsHit.server = analyticsState != null ? analyticsState.getBaseURL(AnalyticsVersionProvider.getVersion()) : "";
        analyticsHit.offlineTrackingEnabled = analyticsState == null || analyticsState.isOfflineTrackingEnabled();
        analyticsHit.aamForwardingEnabled = analyticsState == null || analyticsState.isAnalyticsForwardingEnabled();
        analyticsHit.isWaiting = z10;
        analyticsHit.isBackdatePlaceHolder = z11;
        analyticsHit.uniqueEventIdentifier = str2;
        if (this.hitQueue.queue(analyticsHit)) {
            Log.debug(LOG_TAG, "queue - AnalyticsExtension hit queued (%s)", str);
        } else {
            Log.debug(LOG_TAG, "queue - AnalyticsExtension hit queue failed (%s)", analyticsHit.url);
        }
        if (analyticsState != null && !StringUtils.isNullOrEmpty(analyticsHit.server)) {
            kick(analyticsState, false);
        }
        if (analyticsState != null) {
            this.previousState = analyticsState;
        }
    }

    public void resetIsWaitingFlag() {
        this.hitQueue.updateAllHits(this.analyticsHitSchema.generateUpdateValuesForResetIsWaitingFlag());
    }

    public void updateBackdatedHit(AnalyticsState analyticsState, String str, long j10, String str2) {
        Log.debug(LOG_TAG, "updateBackdatedHit - Backdated session info received.", new Object[0]);
        AnalyticsHit analyticsHit = (AnalyticsHit) this.hitQueue.queryHit(this.analyticsHitSchema.getLatestPlaceHolderHitQuery(ANALYTICS_TABLE_NAME));
        if (analyticsHit != null && analyticsHit.url != null) {
            analyticsHit.url = str;
            analyticsHit.timestamp = j10;
            analyticsHit.isBackdatePlaceHolder = false;
            analyticsHit.server = analyticsState.getBaseURL(AnalyticsVersionProvider.getVersion());
            analyticsHit.offlineTrackingEnabled = analyticsState.isOfflineTrackingEnabled();
            analyticsHit.aamForwardingEnabled = analyticsState.isAnalyticsForwardingEnabled();
            analyticsHit.uniqueEventIdentifier = str2;
            this.hitQueue.updateHit(analyticsHit);
        }
        kick(analyticsState, false);
        if (analyticsState != null) {
            this.previousState = analyticsState;
        }
    }

    @Override // com.adobe.marketing.mobile.HitQueue.IHitProcessor
    public HitQueue.RetryType process(AnalyticsHit analyticsHit) {
        String strSubstring;
        if (this.analyticsProperties.isDatabaseWaiting()) {
            return HitQueue.RetryType.WAIT;
        }
        if (analyticsHit.isBackdatePlaceHolder) {
            return HitQueue.RetryType.NO;
        }
        if (StringUtils.isNullOrEmpty(analyticsHit.server)) {
            return HitQueue.RetryType.YES;
        }
        if (analyticsHit.timestamp < this.analyticsProperties.getLastResetIdentitiesTimestamp()) {
            Log.debug(LOG_TAG, "process - Dropping Analytics hit, resetIdentities API was called after this request.", new Object[0]);
            return HitQueue.RetryType.NO;
        }
        if (analyticsHit.offlineTrackingEnabled) {
            long j10 = analyticsHit.timestamp;
            long j11 = this.lastHitTimestampInSeconds;
            if (j10 - j11 < 0) {
                updateTimestampIfNeeded(analyticsHit, j11);
            }
        }
        if (!analyticsHit.offlineTrackingEnabled && analyticsHit.timestamp < TimeUtil.getUnixTimeInSeconds() - 60) {
            return HitQueue.RetryType.NO;
        }
        if (analyticsHit.url.startsWith("ndh")) {
            strSubstring = analyticsHit.url;
        } else {
            String str = analyticsHit.url;
            strSubstring = str.substring(str.indexOf(63) + 1);
        }
        AnalyticsState analyticsState = this.previousState;
        if (analyticsState != null && analyticsState.isAssuranceSessionActive()) {
            strSubstring = u.f(strSubstring, "&p.&debug=true&.p");
            analyticsHit.url = d.f(new StringBuilder(), analyticsHit.url, "&p.&debug=true&.p");
        }
        return handleNetworkConnection(sendAnalyticsHitToServer(analyticsHit.server, strSubstring), analyticsHit);
    }

    public AnalyticsHitsDatabase(PlatformServices platformServices, AnalyticsProperties analyticsProperties, AnalyticsDispatcherAnalyticsResponseContent analyticsDispatcherAnalyticsResponseContent, HitQueue<AnalyticsHit, AnalyticsHitSchema> hitQueue) throws MissingPlatformServicesException {
        this(platformServices, analyticsProperties, analyticsDispatcherAnalyticsResponseContent);
        this.hitQueue = hitQueue;
    }
}
