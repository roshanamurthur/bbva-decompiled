package com.adobe.marketing.mobile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class SignalHitsDatabase implements HitQueue.IHitProcessor<SignalHit> {
    private static final String LOG_TAG = "SignalHitsDatabase";
    private static final String SIGNAL_FILENAME = "ADBMobileSignalDataCache.sqlite";
    private static final String SIGNAL_TABLE_NAME = "HITS";
    private final HitQueue<SignalHit, SignalHitSchema> hitQueue;
    private final NetworkService networkService;
    private final SystemInfoService systemInfoService;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.SignalHitsDatabase$1, reason: invalid class name */
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

    public SignalHitsDatabase(PlatformServices platformServices) {
        this(platformServices, null);
    }

    public void queue(SignalHit signalHit, long j10, MobilePrivacyStatus mobilePrivacyStatus) {
        if (signalHit != null) {
            signalHit.timestamp = TimeUnit.MILLISECONDS.toSeconds(j10);
        }
        this.hitQueue.queue(signalHit);
        if (mobilePrivacyStatus == MobilePrivacyStatus.OPT_IN) {
            this.hitQueue.bringOnline();
        }
    }

    public void updatePrivacyStatus(MobilePrivacyStatus mobilePrivacyStatus) {
        int i10 = AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$MobilePrivacyStatus[mobilePrivacyStatus.ordinal()];
        if (i10 == 1) {
            this.hitQueue.bringOnline();
            return;
        }
        if (i10 == 2) {
            this.hitQueue.suspend();
            this.hitQueue.deleteAllHits();
        } else {
            if (i10 != 3) {
                return;
            }
            this.hitQueue.suspend();
        }
    }

    public SignalHitsDatabase(PlatformServices platformServices, HitQueue<SignalHit, SignalHitSchema> hitQueue) {
        this.networkService = platformServices.getNetworkService();
        SystemInfoService systemInfoService = platformServices.getSystemInfoService();
        this.systemInfoService = systemInfoService;
        if (hitQueue != null) {
            this.hitQueue = hitQueue;
        } else {
            this.hitQueue = new HitQueue<>(platformServices, new File(systemInfoService != null ? systemInfoService.getApplicationCacheDir() : null, SIGNAL_FILENAME), SIGNAL_TABLE_NAME, new SignalHitSchema(), this);
        }
    }

    @Override // com.adobe.marketing.mobile.HitQueue.IHitProcessor
    public HitQueue.RetryType process(SignalHit signalHit) {
        HitQueue.RetryType retryType = HitQueue.RetryType.NO;
        try {
            String str = signalHit.body;
            byte[] bytes = str != null ? str.getBytes("UTF-8") : null;
            Map<String, String> headers = NetworkConnectionUtil.getHeaders(false, signalHit.contentType);
            NetworkService networkService = this.networkService;
            String str2 = signalHit.url;
            NetworkService.HttpCommand httpCommand = signalHit.getHttpCommand();
            int i10 = signalHit.timeout;
            NetworkService.HttpConnection httpConnectionConnectUrl = networkService.connectUrl(str2, httpCommand, bytes, headers, i10, i10);
            if (httpConnectionConnectUrl == null) {
                Log.warning(LOG_TAG, "Could not process a request because it was invalid. Discarding request", new Object[0]);
                return retryType;
            }
            if (httpConnectionConnectUrl.getResponseCode() == 200) {
                try {
                    NetworkConnectionUtil.readFromInputStream(httpConnectionConnectUrl.getInputStream());
                } catch (IOException unused) {
                }
                Log.debug(LOG_TAG, "Request (%s)was sent", signalHit.url);
            } else if (NetworkConnectionUtil.recoverableNetworkErrorCodes.contains(Integer.valueOf(httpConnectionConnectUrl.getResponseCode()))) {
                Log.debug(LOG_TAG, "Recoverable network error: (%s) while processing requests, will retry.", Integer.valueOf(httpConnectionConnectUrl.getResponseCode()));
                retryType = HitQueue.RetryType.YES;
            } else {
                Log.debug(LOG_TAG, "Un-recoverable network error: (%s) while processing requests. Discarding request.", Integer.valueOf(httpConnectionConnectUrl.getResponseCode()));
            }
            httpConnectionConnectUrl.close();
            return retryType;
        } catch (UnsupportedEncodingException e5) {
            Log.debug(LOG_TAG, "Unable to encode the post body (%s) for the signal request, %s", signalHit.body, e5);
        }
    }
}
