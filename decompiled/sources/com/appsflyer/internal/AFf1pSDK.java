package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.adobe.marketing.mobile.EventDataKeys;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class AFf1pSDK extends AFf1oSDK {

    @NonNull
    private final ExecutorService valueOf;
    public final Map<String, Object> values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1pSDK$1, reason: invalid class name */
    public class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        public AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i10) {
            AFf1pSDK.AFKeystoreWrapper(AFf1pSDK.this, installReferrerClient, context, i10);
        }

        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.afDebugLog("Install Referrer service disconnected");
        }

        public final void onInstallReferrerSetupFinished(final int i10) {
            ExecutorService executorService = AFf1pSDK.this.valueOf;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26412p0.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i10);
                }
            });
        }
    }

    public AFf1pSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService) {
        super("store", "google", runnable);
        this.values = new HashMap();
        this.valueOf = executorService;
    }

    private static boolean AFInAppEventParameterName(@NonNull Context context) {
        if (!AFf1oSDK.AFKeystoreWrapper()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFa1cSDK.AFInAppEventType(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e5) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e5);
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(Context context) {
        if (AFInAppEventParameterName(context)) {
            this.AFLogger = System.currentTimeMillis();
            this.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
            addObserver(new AFf1jSDK.AnonymousClass5());
            try {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                installReferrerClientBuild.startConnection(new AnonymousClass1(installReferrerClientBuild, context));
            } catch (Throwable th2) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th2);
            }
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(AFf1pSDK aFf1pSDK, InstallReferrerClient installReferrerClient, Context context, int i10) {
        aFf1pSDK.values.put("code", String.valueOf(i10));
        aFf1pSDK.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, "com.android.vending")));
        aFf1pSDK.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, "com.android.vending"));
        if (i10 == -1) {
            AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
            aFf1pSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_DISCONNECTED");
        } else if (i10 == 0) {
            aFf1pSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "OK");
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        aFf1pSDK.values.put("val", installReferrer2);
                        aFf1pSDK.AFKeystoreWrapper.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    aFf1pSDK.values.put("clk", Long.toString(referrerClickTimestampSeconds));
                    aFf1pSDK.AFKeystoreWrapper.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    aFf1pSDK.values.put(EventDataKeys.Acquisition.ACQUISITION_TYPE_INSTALL, Long.toString(installBeginTimestampSeconds));
                    aFf1pSDK.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap map = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        aFf1pSDK.values.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        map.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e5) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e5);
                    }
                    try {
                        map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        map.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e7) {
                        AFLogger.afErrorLogForExcManagerOnly("some method not exist", e7);
                    }
                    if (!map.isEmpty()) {
                        aFf1pSDK.AFKeystoreWrapper.put("google_custom", map);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                    aFf1pSDK.values.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                AFLogger.afWarnLog(sb2.toString());
                aFf1pSDK.values.put(NotificationCompat.CATEGORY_ERROR, th2.getMessage());
                AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th2);
            }
        } else if (i10 == 1) {
            aFf1pSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_UNAVAILABLE");
            AFLogger.afWarnLog("InstallReferrer not supported");
        } else if (i10 == 2) {
            AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
            aFf1pSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
        } else if (i10 != 3) {
            AFLogger.afWarnLog("responseCode not found.");
        } else {
            AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
            aFf1pSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "DEVELOPER_ERROR");
        }
        AFLogger.afDebugLog("Install Referrer collected locally");
        aFf1pSDK.AFInAppEventType();
    }
}
