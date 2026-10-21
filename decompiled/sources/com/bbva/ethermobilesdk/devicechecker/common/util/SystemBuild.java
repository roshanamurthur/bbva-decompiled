package com.bbva.ethermobilesdk.devicechecker.common.util;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SystemBuild.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u000e\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/common/util/SystemBuild;", "", "()V", "getBoard", "", "kotlin.jvm.PlatformType", "getBootloader", "getBrand", "getDevice", "getFingerprint", "getHardware", "getManufacturer", "getModel", "getProduct", "getTags", "getVersion", "", "getVersionCodesAndroidP", "getVersionCodesAndroidR", "getVersionCodesAndroidS", "getVersionCodesAndroidT", "devicechecker-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SystemBuild {

    @NotNull
    public static final SystemBuild INSTANCE = new SystemBuild();

    public final String getBoard() {
        return Build.BOARD;
    }

    public final String getBootloader() {
        return Build.BOOTLOADER;
    }

    public final String getBrand() {
        return Build.BRAND;
    }

    public final String getDevice() {
        return Build.DEVICE;
    }

    public final String getFingerprint() {
        return Build.FINGERPRINT;
    }

    public final String getHardware() {
        return Build.HARDWARE;
    }

    public final String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public final String getModel() {
        return Build.MODEL;
    }

    public final String getProduct() {
        return Build.PRODUCT;
    }

    public final String getTags() {
        return Build.TAGS;
    }

    public final int getVersion() {
        return Build.VERSION.SDK_INT;
    }

    public final int getVersionCodesAndroidP() {
        return 28;
    }

    public final int getVersionCodesAndroidR() {
        return 30;
    }

    public final int getVersionCodesAndroidS() {
        return 31;
    }

    public final int getVersionCodesAndroidT() {
        return 33;
    }
}
