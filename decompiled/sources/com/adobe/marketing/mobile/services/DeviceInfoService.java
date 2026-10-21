package com.adobe.marketing.mobile.services;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
class DeviceInfoService implements DeviceInforming {
    private static final String ANDROID_OS_STRING = "Android";
    private static final String CANONICAL_PLATFORM_NAME = "android";
    private static final String LOG_TAG = "DeviceInfoService";
    private static final String UNEXPECTED_NULL_VALUE = "Unexpected Null Value";

    private Context getApplicationContext() {
        return ServiceProvider.getInstance().getApplicationContext();
    }

    private Activity getCurrentActivity() {
        return ServiceProvider.getInstance().getCurrentActivity();
    }

    private PackageInfo getPackageInfo() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getPackageInfo(applicationContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e5) {
            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("PackageManager couldn't find application version (%s)", e5.getLocalizedMessage()));
            return null;
        }
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public Locale getActiveLocale() {
        Resources resources;
        Configuration configuration;
        Context applicationContext = getApplicationContext();
        if (applicationContext == null || (resources = applicationContext.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 24 ? configuration.locale : configuration.getLocales().get(0);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public File getApplicationBaseDir() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null || applicationContext.getApplicationInfo() == null) {
            return null;
        }
        return new File(applicationContext.getApplicationInfo().dataDir);
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public File getApplicationCacheDir() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getCacheDir();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getApplicationName() {
        ApplicationInfo applicationInfo;
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 0)) == null) {
                return null;
            }
            return (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("PackageManager couldn't find application name (%s)", e5));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getApplicationPackageName() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getPackageName();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getApplicationVersion() {
        PackageInfo packageInfo = getPackageInfo();
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getApplicationVersionCode() {
        int iLongValue;
        PackageInfo packageInfo = getPackageInfo();
        if (packageInfo == null) {
            return null;
        }
        Locale locale = Locale.US;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                iLongValue = (int) ((Long) packageInfo.getClass().getDeclaredMethod("getLongVersionCode", new Class[0]).invoke(packageInfo, new Object[0])).longValue();
            } catch (Exception e5) {
                MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Failed to get app version code, (%s)", e5));
                iLongValue = 0;
            }
        } else {
            iLongValue = packageInfo.versionCode;
        }
        if (iLongValue > 0) {
            return String.format(locale, "%d", Integer.valueOf(iLongValue));
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public InputStream getAsset(String str) {
        Context applicationContext = getApplicationContext();
        if (isNullOrEmpty(str) || applicationContext == null) {
            return null;
        }
        Resources resources = applicationContext.getResources();
        if (resources == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (Resources), unable to read (%s) from the the assets folder.", UNEXPECTED_NULL_VALUE, str));
            return null;
        }
        AssetManager assets = resources.getAssets();
        if (assets == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (AssetManager), unable to read (%s) from the the assets folder.", UNEXPECTED_NULL_VALUE, str));
            return null;
        }
        try {
            return assets.open(str);
        } catch (IOException e5) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("Unable to read (%s) from the the assets folder. (%s)", str, e5));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getCanonicalPlatformName() {
        return CANONICAL_PLATFORM_NAME;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public int getCurrentOrientation() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return 0;
        }
        return currentActivity.getResources().getConfiguration().orientation;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getDefaultUserAgent() {
        String str = getOperatingSystemName() + " " + getOperatingSystemVersion();
        if (isNullOrEmpty(str)) {
            str = "unknown";
        }
        String localeString = getLocaleString();
        if (isNullOrEmpty(localeString)) {
            localeString = "unknown";
        }
        return String.format("Mozilla/5.0 (Linux; U; %s; %s; %s Build/%s)", str, localeString, isNullOrEmpty(getDeviceName()) ? "unknown" : getDeviceName(), isNullOrEmpty(getDeviceBuildId()) ? "unknown" : getDeviceBuildId());
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getDeviceBuildId() {
        return Build.ID;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getDeviceManufacturer() {
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getDeviceName() {
        return Build.MODEL;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public DeviceInforming.DeviceType getDeviceType() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return DeviceInforming.DeviceType.UNKNOWN;
        }
        Resources resources = applicationContext.getResources();
        if (resources == null) {
            return DeviceInforming.DeviceType.UNKNOWN;
        }
        if ((resources.getConfiguration().uiMode & 15) == 6) {
            return DeviceInforming.DeviceType.WATCH;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f6 = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f6 * f6) + (f10 * f10))) >= 6.5d ? DeviceInforming.DeviceType.TABLET : DeviceInforming.DeviceType.PHONE;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public DeviceInforming.DisplayInformation getDisplayInformation() {
        Resources resources;
        Context applicationContext = getApplicationContext();
        if (applicationContext == null || (resources = applicationContext.getResources()) == null) {
            return null;
        }
        return new DisplayInfoService(resources.getDisplayMetrics());
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getLocaleString() {
        Locale activeLocale = getActiveLocale();
        if (activeLocale == null) {
            activeLocale = Locale.US;
        }
        String language = activeLocale.getLanguage();
        String country = activeLocale.getCountry();
        return !country.isEmpty() ? androidx.camera.core.impl.utils.a.b(language, Constant.DASH_STRING, country) : language;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getMobileCarrierName() {
        TelephonyManager telephonyManager;
        Context applicationContext = getApplicationContext();
        if (applicationContext == null || (telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone")) == null) {
            return null;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public DeviceInforming.ConnectionStatus getNetworkConnectionStatus() {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return DeviceInforming.ConnectionStatus.UNKNOWN;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return (activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) ? DeviceInforming.ConnectionStatus.CONNECTED : DeviceInforming.ConnectionStatus.DISCONNECTED;
                }
                MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("Unable to determine connectivity status due to there being no default network currently active", new Object[0]));
            } else {
                MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Unable to determine connectivity status due to the system service requested being unrecognized", new Object[0]));
            }
        } catch (NullPointerException e5) {
            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Unable to determine connectivity status due to an unexpected error (%s)", e5.getLocalizedMessage()));
        } catch (SecurityException e7) {
            MobileCore.log(LoggingMode.ERROR, LOG_TAG, String.format("Unable to access connectivity status due to a security error (%s)", e7.getLocalizedMessage()));
        } catch (Exception e10) {
            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Unable to access connectivity status due to an unexpected error (%s)", e10.getLocalizedMessage()));
        }
        return DeviceInforming.ConnectionStatus.UNKNOWN;
    }

    public String getOperatingSystemName() {
        return "Android";
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getOperatingSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getPropertyFromManifest(String str) {
        Context applicationContext = getApplicationContext();
        if (isNullOrEmpty(str) || applicationContext == null) {
            return null;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (Package Manager), unable to read property for key (%s).", UNEXPECTED_NULL_VALUE, str));
            return null;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null) {
                MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (Application info), unable to read property for key (%s).", UNEXPECTED_NULL_VALUE, str));
                return null;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                return bundle.getString(str);
            }
            MobileCore.log(LoggingMode.DEBUG, LOG_TAG, String.format("%s (ApplicationInfo's metaData), unable to read property for key (%s).", UNEXPECTED_NULL_VALUE, str));
            return null;
        } catch (Exception e5) {
            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Unable to read property for key (%s). Exception - (%s)", str, e5));
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public String getRunMode() {
        return "Application";
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public boolean registerOneTimeNetworkConnectionActiveListener(DeviceInforming.NetworkConnectionActiveListener networkConnectionActiveListener) {
        return false;
    }
}
