package com.adobe.marketing.mobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class AndroidSystemInfoService implements SystemInfoService {
    private static final String ANDROID_OS_STRING = "Android";
    private static final String CANONICAL_PLATFORM_NAME = "android";
    static final String CORE_VERSION = MobileCore.extensionVersion();
    private static final String LOG_TAG = "AndroidSystemInfoService";

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public Locale getActiveLocale() {
        return ServiceProvider.getInstance().getDeviceInfoService().getActiveLocale();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public File getApplicationBaseDir() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationBaseDir();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public File getApplicationCacheDir() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getApplicationName() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationName();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getApplicationPackageName() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationPackageName();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getApplicationVersion() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationVersion();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getApplicationVersionCode() {
        return ServiceProvider.getInstance().getDeviceInfoService().getApplicationVersionCode();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public InputStream getAsset(String str) {
        return ServiceProvider.getInstance().getDeviceInfoService().getAsset(str);
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getCanonicalPlatformName() {
        return CANONICAL_PLATFORM_NAME;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getCoreVersion() {
        return CORE_VERSION;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public int getCurrentOrientation() {
        return App.getCurrentOrientation();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getDefaultUserAgent() {
        String str = getOperatingSystemName() + " " + getOperatingSystemVersion();
        if (StringUtils.isNullOrEmpty(str)) {
            str = "unknown";
        }
        String localeString = getLocaleString();
        if (StringUtils.isNullOrEmpty(localeString)) {
            localeString = "unknown";
        }
        return String.format("Mozilla/5.0 (Linux; U; %s; %s; %s Build/%s)", str, localeString, StringUtils.isNullOrEmpty(getDeviceName()) ? "unknown" : getDeviceName(), StringUtils.isNullOrEmpty(getDeviceBuildId()) ? "unknown" : getDeviceBuildId());
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getDeviceBuildId() {
        return Build.ID;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getDeviceName() {
        return Build.MODEL;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public SystemInfoService.DeviceType getDeviceType() {
        Context appContext = App.getAppContext();
        if (appContext == null) {
            return SystemInfoService.DeviceType.UNKNOWN;
        }
        Resources resources = appContext.getResources();
        if (resources == null) {
            return SystemInfoService.DeviceType.UNKNOWN;
        }
        if ((resources.getConfiguration().uiMode & 15) == 6) {
            return SystemInfoService.DeviceType.WATCH;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f6 = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f6 * f6) + (f10 * f10))) >= 6.5d ? SystemInfoService.DeviceType.TABLET : SystemInfoService.DeviceType.PHONE;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public SystemInfoService.DisplayInformation getDisplayInformation() {
        Resources resources;
        Context appContext = App.getAppContext();
        if (appContext == null || (resources = appContext.getResources()) == null) {
            return null;
        }
        return new AndroidDisplayInformation(resources.getDisplayMetrics());
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getLocaleString() {
        return ServiceProvider.getInstance().getDeviceInfoService().getLocaleString();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getMobileCarrierName() {
        return ServiceProvider.getInstance().getDeviceInfoService().getMobileCarrierName();
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public SystemInfoService.ConnectionStatus getNetworkConnectionStatus() {
        Context appContext = App.getAppContext();
        if (appContext == null) {
            return SystemInfoService.ConnectionStatus.UNKNOWN;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) appContext.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return (activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) ? SystemInfoService.ConnectionStatus.CONNECTED : SystemInfoService.ConnectionStatus.DISCONNECTED;
                }
                Log.debug(LOG_TAG, "Unable to determine connectivity status due to there being no default network currently active", new Object[0]);
            } else {
                Log.warning(LOG_TAG, "Unable to determine connectivity status due to the system service requested being unrecognized", new Object[0]);
            }
        } catch (NullPointerException e5) {
            Log.warning(LOG_TAG, "Unable to determine connectivity status due to an unexpected error (%s)", e5.getLocalizedMessage());
        } catch (SecurityException e7) {
            Log.error(LOG_TAG, "Unable to access connectivity status due to a security error (%s)", e7.getLocalizedMessage());
        } catch (Exception e10) {
            Log.warning(LOG_TAG, "Unable to access connectivity status due to an unexpected error (%s)", e10.getLocalizedMessage());
        }
        return SystemInfoService.ConnectionStatus.UNKNOWN;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getOperatingSystemName() {
        return "Android";
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getOperatingSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getProperty(String str) {
        return ServiceProvider.getInstance().getDeviceInfoService().getPropertyFromManifest(str);
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getRunMode() {
        return "Application";
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public String getSdkVersion() {
        return CORE_VERSION;
    }

    @Override // com.adobe.marketing.mobile.SystemInfoService
    public boolean registerOneTimeNetworkConnectionActiveListener(final SystemInfoService.NetworkConnectionActiveListener networkConnectionActiveListener) {
        try {
            Context appContext = App.getAppContext();
            if (appContext == null) {
                Log.debug(LOG_TAG, "%s (application context), registerOneTimeNetworkConnectionActiveListener did not register.", "Unexpected Null Value");
                return false;
            }
            if (((ConnectivityManager) appContext.getSystemService("connectivity")) == null) {
                Log.debug(LOG_TAG, "%s (Connectivity Manager), registerOneTimeNetworkConnectionActiveListener did not register.", "Unexpected Null Value");
                return false;
            }
            appContext.registerReceiver(new BroadcastReceiver() { // from class: com.adobe.marketing.mobile.AndroidSystemInfoService.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (AndroidSystemInfoService.this.getNetworkConnectionStatus() != SystemInfoService.ConnectionStatus.CONNECTED) {
                        return;
                    }
                    try {
                        context.unregisterReceiver(this);
                        networkConnectionActiveListener.onActive();
                    } catch (Exception e5) {
                        Log.warning(AndroidSystemInfoService.LOG_TAG, "registerOneTimeNetworkConnectionActiveListener: Unexpected error while invoking callback (%s)", e5.getLocalizedMessage());
                    }
                }
            }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return true;
        } catch (Exception e5) {
            Log.warning(LOG_TAG, "registerOneTimeNetworkConnectionActiveListener: Unexpected error while registering listener (%s)", e5.getLocalizedMessage());
            return false;
        }
    }
}
