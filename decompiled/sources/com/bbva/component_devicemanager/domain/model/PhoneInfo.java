package com.bbva.component_devicemanager.domain.model;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JO\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u000b\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\f\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\r\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006#"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/PhoneInfo;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "isBluetoothActive", "isMicrophoneActive", "isActiveUseProxyActive", "isMobileDevice", "isAutoZoneActive", "isAutoDateTimeActive", "isGoogleServiceActive", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "<init>", "(ZZZZZZZ)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class PhoneInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isBluetoothActive;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isMicrophoneActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isActiveUseProxyActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isMobileDevice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isAutoZoneActive;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isAutoDateTimeActive;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean isGoogleServiceActive;

    public PhoneInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.isBluetoothActive = z10;
        this.isMicrophoneActive = z11;
        this.isActiveUseProxyActive = z12;
        this.isMobileDevice = z13;
        this.isAutoZoneActive = z14;
        this.isAutoDateTimeActive = z15;
        this.isGoogleServiceActive = z16;
    }

    public static /* synthetic */ PhoneInfo copy$default(PhoneInfo phoneInfo, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = phoneInfo.isBluetoothActive;
        }
        if ((i10 & 2) != 0) {
            z11 = phoneInfo.isMicrophoneActive;
        }
        boolean z17 = z11;
        if ((i10 & 4) != 0) {
            z12 = phoneInfo.isActiveUseProxyActive;
        }
        boolean z18 = z12;
        if ((i10 & 8) != 0) {
            z13 = phoneInfo.isMobileDevice;
        }
        boolean z19 = z13;
        if ((i10 & 16) != 0) {
            z14 = phoneInfo.isAutoZoneActive;
        }
        boolean z20 = z14;
        if ((i10 & 32) != 0) {
            z15 = phoneInfo.isAutoDateTimeActive;
        }
        boolean z21 = z15;
        if ((i10 & 64) != 0) {
            z16 = phoneInfo.isGoogleServiceActive;
        }
        return phoneInfo.copy(z10, z17, z18, z19, z20, z21, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBluetoothActive() {
        return this.isBluetoothActive;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsMicrophoneActive() {
        return this.isMicrophoneActive;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsActiveUseProxyActive() {
        return this.isActiveUseProxyActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMobileDevice() {
        return this.isMobileDevice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAutoZoneActive() {
        return this.isAutoZoneActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsAutoDateTimeActive() {
        return this.isAutoDateTimeActive;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsGoogleServiceActive() {
        return this.isGoogleServiceActive;
    }

    @NotNull
    public final PhoneInfo copy(boolean isBluetoothActive, boolean isMicrophoneActive, boolean isActiveUseProxyActive, boolean isMobileDevice, boolean isAutoZoneActive, boolean isAutoDateTimeActive, boolean isGoogleServiceActive) {
        return new PhoneInfo(isBluetoothActive, isMicrophoneActive, isActiveUseProxyActive, isMobileDevice, isAutoZoneActive, isAutoDateTimeActive, isGoogleServiceActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneInfo)) {
            return false;
        }
        PhoneInfo phoneInfo = (PhoneInfo) other;
        return this.isBluetoothActive == phoneInfo.isBluetoothActive && this.isMicrophoneActive == phoneInfo.isMicrophoneActive && this.isActiveUseProxyActive == phoneInfo.isActiveUseProxyActive && this.isMobileDevice == phoneInfo.isMobileDevice && this.isAutoZoneActive == phoneInfo.isAutoZoneActive && this.isAutoDateTimeActive == phoneInfo.isAutoDateTimeActive && this.isGoogleServiceActive == phoneInfo.isGoogleServiceActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z10 = this.isBluetoothActive;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.isMicrophoneActive;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        boolean z12 = this.isActiveUseProxyActive;
        ?? r4 = z12;
        if (z12) {
            r4 = 1;
        }
        int i12 = (i11 + r4) * 31;
        boolean z13 = this.isMobileDevice;
        ?? r10 = z13;
        if (z13) {
            r10 = 1;
        }
        int i13 = (i12 + r10) * 31;
        boolean z14 = this.isAutoZoneActive;
        ?? r11 = z14;
        if (z14) {
            r11 = 1;
        }
        int i14 = (i13 + r11) * 31;
        boolean z15 = this.isAutoDateTimeActive;
        ?? r12 = z15;
        if (z15) {
            r12 = 1;
        }
        int i15 = (i14 + r12) * 31;
        boolean z16 = this.isGoogleServiceActive;
        return i15 + (z16 ? 1 : z16);
    }

    public final boolean isActiveUseProxyActive() {
        return this.isActiveUseProxyActive;
    }

    public final boolean isAutoDateTimeActive() {
        return this.isAutoDateTimeActive;
    }

    public final boolean isAutoZoneActive() {
        return this.isAutoZoneActive;
    }

    public final boolean isBluetoothActive() {
        return this.isBluetoothActive;
    }

    public final boolean isGoogleServiceActive() {
        return this.isGoogleServiceActive;
    }

    public final boolean isMicrophoneActive() {
        return this.isMicrophoneActive;
    }

    public final boolean isMobileDevice() {
        return this.isMobileDevice;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneInfo(isBluetoothActive=");
        sb2.append(this.isBluetoothActive);
        sb2.append(", isMicrophoneActive=");
        sb2.append(this.isMicrophoneActive);
        sb2.append(", isActiveUseProxyActive=");
        sb2.append(this.isActiveUseProxyActive);
        sb2.append(", isMobileDevice=");
        sb2.append(this.isMobileDevice);
        sb2.append(", isAutoZoneActive=");
        sb2.append(this.isAutoZoneActive);
        sb2.append(", isAutoDateTimeActive=");
        sb2.append(this.isAutoDateTimeActive);
        sb2.append(", isGoogleServiceActive=");
        return i.c(sb2, this.isGoogleServiceActive, ")");
    }

    public /* synthetic */ PhoneInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, z12, (i10 & 8) != 0 ? true : z13, z14, z15, z16);
    }
}
