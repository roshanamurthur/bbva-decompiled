package com.noknok.android.client.asm.json;

import android.content.Context;
import android.os.Build;
import com.google.gson.Gson;
import com.noknok.android.client.utils.AppSDKConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FingerprintUIConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static FingerprintUIConfig f63274a;
    public final List<Device> devices = null;
    public boolean useBottomSheetDialog;

    public static class Device {
        public String manufacturer;
        public String model;
        public final Mode mode = Mode.as_is;
        public final Integer useBiometricForLevel = 30;

        public boolean useBiometric() {
            return this.useBiometricForLevel.intValue() <= Build.VERSION.SDK_INT;
        }
    }

    public enum Mode {
        hide,
        no_icon,
        as_is
    }

    public static synchronized FingerprintUIConfig get(Context context) {
        try {
            if (f63274a == null) {
                f63274a = (FingerprintUIConfig) new Gson().fromJson(AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.fingerprintUI), FingerprintUIConfig.class);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63274a;
    }

    public Device currentDevice() {
        List<Device> list = f63274a.devices;
        if (list != null) {
            for (Device device : list) {
                if (Build.MANUFACTURER.equalsIgnoreCase(device.manufacturer) && Build.MODEL.toLowerCase().startsWith(device.model.toLowerCase())) {
                    return device;
                }
            }
        }
        return new Device();
    }
}
