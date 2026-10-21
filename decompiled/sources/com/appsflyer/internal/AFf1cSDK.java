package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1cSDK extends AFf1oSDK {
    public AFf1cSDK(Runnable runnable) {
        super("store", "xiaomi", runnable);
    }

    private static boolean values() {
        if (!AFf1oSDK.AFKeystoreWrapper()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.afDebugLog("Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(final Context context) {
        if (values()) {
            this.AFLogger = System.currentTimeMillis();
            this.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
            addObserver(new AFf1jSDK.AnonymousClass5());
            final GetAppsReferrerClient getAppsReferrerClientBuild = GetAppsReferrerClient.Companion.newBuilder(context).build();
            getAppsReferrerClientBuild.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFf1cSDK.4
                public final void onGetAppsReferrerSetupFinished(int i10) {
                    AFf1cSDK.this.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, "com.xiaomi.mipicks")));
                    AFf1cSDK.this.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, "com.xiaomi.mipicks"));
                    if (i10 == -1) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFf1cSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_DISCONNECTED");
                    } else if (i10 == 0) {
                        AFf1cSDK aFf1cSDK = AFf1cSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = getAppsReferrerClientBuild;
                        aFf1cSDK.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "OK");
                        try {
                            AFLogger.afDebugLog("XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFf1cSDK.AFKeystoreWrapper.put("referrer", installReferrer2);
                                }
                                aFf1cSDK.AFKeystoreWrapper.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFf1cSDK.AFKeystoreWrapper.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap map = new HashMap();
                                map.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                map.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                map.put("install_version", installReferrer.getInstallVersion());
                                aFf1cSDK.AFKeystoreWrapper.put("xiaomi_custom", map);
                            } else {
                                AFLogger.afWarnLog("XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            AFLogger.afWarnLog(sb2.toString());
                        }
                    } else if (i10 == 1) {
                        AFf1cSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_UNAVAILABLE");
                        AFLogger.afWarnLog("XiaomiInstallReferrer not supported");
                    } else if (i10 == 2) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFf1cSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                    } else if (i10 == 3) {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1cSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "DEVELOPER_ERROR");
                    } else if (i10 != 4) {
                        AFLogger.afWarnLog("responseCode not found.");
                    } else {
                        AFLogger.afWarnLog("XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFf1cSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "PERMISSION_ERROR");
                    }
                    AFLogger.afDebugLog("Xiaomi Install Referrer collected locally");
                    AFf1cSDK.this.AFInAppEventType();
                    getAppsReferrerClientBuild.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
