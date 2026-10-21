package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 19)
public final class AFf1iSDK extends AFf1jSDK {
    final ProviderInfo valueOf;
    private final AFc1zSDK values;

    public AFf1iSDK(ProviderInfo providerInfo, Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.values = aFc1zSDK;
        this.valueOf = providerInfo;
    }

    @Override // com.appsflyer.internal.AFf1jSDK
    public final void AFKeystoreWrapper(final Context context) {
        this.values.valueOf().execute(new Runnable() { // from class: com.appsflyer.internal.AFf1iSDK.1
            /* JADX WARN: Code duplicated, block: B:19:0x0073  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFf1iSDK aFf1iSDK = AFf1iSDK.this;
                aFf1iSDK.AFLogger = System.currentTimeMillis();
                aFf1iSDK.afRDLog = AFf1jSDK.AFa1vSDK.STARTED;
                aFf1iSDK.addObserver(new AFf1jSDK.AnonymousClass5());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFf1iSDK.this.valueOf.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientAFKeystoreWrapper = AFf1iSDK.AFKeystoreWrapper(context, uri);
                if (contentProviderClientAFKeystoreWrapper != null) {
                    try {
                        try {
                            try {
                                StringBuilder sb3 = new StringBuilder("app_id=");
                                sb3.append(context.getPackageName());
                                cursorQuery = contentProviderClientAFKeystoreWrapper.query(uri, null, sb3.toString(), null, null);
                                if (Build.VERSION.SDK_INT >= 24) {
                                    contentProviderClientAFKeystoreWrapper.release();
                                } else {
                                    contentProviderClientAFKeystoreWrapper.release();
                                }
                            } catch (RemoteException e5) {
                                AFLogger.afErrorLog("[Preinstall]: Failed to query unstable content providerClient", e5, false);
                                if (Build.VERSION.SDK_INT >= 24) {
                                    contentProviderClientAFKeystoreWrapper.release();
                                } else {
                                    contentProviderClientAFKeystoreWrapper.release();
                                }
                                cursorQuery = null;
                            }
                        } catch (DeadObjectException e7) {
                            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient", e7, false);
                            if (Build.VERSION.SDK_INT >= 24) {
                                contentProviderClientAFKeystoreWrapper.release();
                            } else {
                                contentProviderClientAFKeystoreWrapper.release();
                            }
                            cursorQuery = null;
                        } catch (Throwable th2) {
                            AFLogger.afErrorLog("[Preinstall]: Error to get data from providerClient ", th2, false);
                            if (Build.VERSION.SDK_INT >= 24) {
                                contentProviderClientAFKeystoreWrapper.release();
                            } else {
                                contentProviderClientAFKeystoreWrapper.release();
                            }
                            cursorQuery = null;
                        }
                    } catch (Throwable th3) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            contentProviderClientAFKeystoreWrapper.release();
                        } else {
                            contentProviderClientAFKeystoreWrapper.release();
                        }
                        throw th3;
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                    if (columnIndex == -1) {
                        AFLogger.afWarnLog("[Preinstall]: Wrong column name");
                        AFf1iSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFf1iSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFf1iSDK.this.AFKeystoreWrapper.put("referrer", string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.afWarnLog("[Preinstall]: ContentProvider query failed, got null Cursor");
                    AFf1iSDK.this.AFKeystoreWrapper.put(DigipassManagerConstants.KEY_RESPONSE, "SERVICE_UNAVAILABLE");
                }
                AFf1iSDK aFf1iSDK2 = AFf1iSDK.this;
                aFf1iSDK2.AFKeystoreWrapper.put("api_ver", Long.valueOf(AFa1cSDK.valueOf(context, ((PackageItemInfo) aFf1iSDK2.valueOf).packageName)));
                AFf1iSDK aFf1iSDK3 = AFf1iSDK.this;
                aFf1iSDK3.AFKeystoreWrapper.put("api_ver_name", AFa1cSDK.AFInAppEventParameterName(context, ((PackageItemInfo) aFf1iSDK3.valueOf).packageName));
                AFf1iSDK.this.AFInAppEventType();
            }
        });
    }

    @Nullable
    @VisibleForTesting
    public static ContentProviderClient AFKeystoreWrapper(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e5) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to SecurityException", e5, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.afErrorLog("[Preinstall]: Failed to acquire unstable content providerClient due to unexpected throwable", th2, false);
            return null;
        }
    }
}
