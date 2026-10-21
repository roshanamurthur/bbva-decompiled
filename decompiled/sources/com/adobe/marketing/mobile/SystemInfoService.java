package com.adobe.marketing.mobile;

import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
interface SystemInfoService {

    public enum ConnectionStatus {
        CONNECTED,
        DISCONNECTED,
        UNKNOWN
    }

    public enum DeviceType {
        PHONE,
        TABLET,
        WATCH,
        UNKNOWN
    }

    public interface DisplayInformation {
        int getDensityDpi();

        int getHeightPixels();

        int getWidthPixels();
    }

    public interface NetworkConnectionActiveListener {
        void onActive();
    }

    Locale getActiveLocale();

    File getApplicationBaseDir();

    File getApplicationCacheDir();

    String getApplicationName();

    String getApplicationPackageName();

    String getApplicationVersion();

    String getApplicationVersionCode();

    InputStream getAsset(String str);

    String getCanonicalPlatformName();

    String getCoreVersion();

    int getCurrentOrientation();

    String getDefaultUserAgent();

    String getDeviceBuildId();

    String getDeviceManufacturer();

    String getDeviceName();

    DeviceType getDeviceType();

    DisplayInformation getDisplayInformation();

    String getLocaleString();

    String getMobileCarrierName();

    ConnectionStatus getNetworkConnectionStatus();

    String getOperatingSystemName();

    String getOperatingSystemVersion();

    String getProperty(String str);

    String getRunMode();

    @Deprecated
    String getSdkVersion();

    boolean registerOneTimeNetworkConnectionActiveListener(NetworkConnectionActiveListener networkConnectionActiveListener);
}
