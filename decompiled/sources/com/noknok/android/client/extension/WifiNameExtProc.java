package com.noknok.android.client.extension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import androidx.core.content.ContextCompat;
import com.bbva.nativesettings.common.Constants;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.HelperActivity;
import com.noknok.android.client.utils.Logger;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class WifiNameExtProc implements IExtensionProcessor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Semaphore f63337d = new Semaphore(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager f63339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63340c;

    /* JADX INFO: renamed from: com.noknok.android.client.extension.WifiNameExtProc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63341a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63341a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63341a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63341a[IExtensionProcessor.ExtensionMode.silently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63341a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public WifiNameExtProc(Context context) {
        this.f63338a = context.getApplicationContext();
    }

    private boolean a() {
        return ContextCompat.checkSelfPermission(this.f63338a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        if (!this.f63340c || (connectivityManager = (ConnectivityManager) this.f63338a.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) {
            return;
        }
        iExtensionList.addExtension(ExtensionManager.WIFI_SSID_EXT_ID, this.f63339b.getConnectionInfo().getSSID(), false);
        this.f63340c = false;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        this.f63340c = false;
        boolean z10 = iExtensionList.getExtension(ExtensionManager.WIFI_SSID_EXT_ID) != null;
        int i10 = AnonymousClass1.f63341a[ExtensionConfigHelper.getConfigExtensionMode(this.f63338a, AppSDKConfig.Key.sendWifiSSID.name(), map.get(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE)).ordinal()];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    this.f63340c = true;
                }
            } else if (ContextCompat.checkSelfPermission(this.f63338a, "android.permission.ACCESS_WIFI_STATE") == 0 && a()) {
                this.f63340c = true;
            }
        } else if (z10) {
            this.f63340c = true;
        }
        if (this.f63340c) {
            if (z10) {
                iExtensionList.removeExtension(ExtensionManager.WIFI_SSID_EXT_ID);
            }
            if (ContextCompat.checkSelfPermission(this.f63338a, "android.permission.ACCESS_WIFI_STATE") != 0) {
                Logger.w("WifiNameExtProc", "Missing wifi state permission");
                this.f63340c = false;
                return;
            }
            try {
                if (!a()) {
                    try {
                        Semaphore semaphore = f63337d;
                        semaphore.acquire();
                        if (!activityProxy.hasActivity()) {
                            throw new IllegalArgumentException("Caller Activity is required for showing request permission dialog");
                        }
                        Intent intentCreateIntent = activityProxy.createIntent(HelperActivity.class);
                        intentCreateIntent.setFlags(335544320);
                        activityProxy.startActivityForResult(intentCreateIntent, null);
                        semaphore.release();
                        if (!a()) {
                            Logger.w("WifiNameExtProc", "Missing location permission, User has disabled location visibility");
                            this.f63340c = false;
                            return;
                        }
                    } catch (InterruptedException e5) {
                        throw new IllegalStateException("Problem during wait", e5);
                    }
                }
                LocationManager locationManager = (LocationManager) this.f63338a.getSystemService("location");
                if (locationManager != null && locationManager.isProviderEnabled("gps")) {
                    this.f63339b = (WifiManager) this.f63338a.getApplicationContext().getSystemService(Constants.WIFI);
                } else {
                    Logger.w("WifiNameExtProc", "Location is disabled.");
                    this.f63340c = false;
                }
            } catch (Throwable th2) {
                f63337d.release();
                throw th2;
            }
        }
    }
}
