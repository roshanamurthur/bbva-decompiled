package com.adobe.marketing.mobile.services;

import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public interface DeviceInforming {

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

    String getOperatingSystemVersion();

    String getPropertyFromManifest(String str);

    String getRunMode();

    boolean registerOneTimeNetworkConnectionActiveListener(NetworkConnectionActiveListener networkConnectionActiveListener);
}
