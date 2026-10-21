package com.bbva.tohu.android.core.utils;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.TrustDevicePreferencesManager;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.PropertyManagerImpl;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.TrustDevicePreferencesManagerDefaultImpl;
import com.bbva.gp2.android.trustdevice.sdk.export.manager.impl.UserSharedPreferencesManagerDefaultImpl;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfo {
    private Context context;
    private KeyguardManager keyguardManager;
    private TrustDevicePreferencesManager trustDevicePreferencesManager;

    private DeviceInfo(Context context) {
        this.context = context;
        this.trustDevicePreferencesManager = new TrustDevicePreferencesManagerDefaultImpl(new UserSharedPreferencesManagerDefaultImpl(context), new PropertyManagerImpl());
        this.keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
    }

    public static DeviceInfo getInstance(Context context) {
        return new DeviceInfo(context);
    }

    public Long getCurrentTimeInMillis() {
        return Long.valueOf(Calendar.getInstance().getTimeInMillis());
    }

    public String getDeviceCode() {
        return this.trustDevicePreferencesManager.getDeviceCode();
    }

    public String getDeviceName() {
        return this.trustDevicePreferencesManager.getDeviceName();
    }

    public String getDeviceType() {
        return "PHONE";
    }

    public String getOsName() {
        return "ANDROID";
    }

    public String getOsVersion() {
        return this.trustDevicePreferencesManager.getOsVersion();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public boolean isDeviceLocked() {
        return this.keyguardManager.isDeviceLocked();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public boolean isDeviceSecure() {
        return this.keyguardManager.isDeviceSecure();
    }

    public boolean isNfcCapable() {
        return this.context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    public boolean isScreenOn() {
        return ((PowerManager) this.context.getSystemService("power")).isInteractive();
    }
}
