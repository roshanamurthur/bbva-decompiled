package com.bbva.gp2.android.product.trustdevice.library.utils;

import androidx.appcompat.app.i;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/utils/DeviceInfo;", "", "id", "", Constants.deviceType, "model", "os", ContextualDataConstants.CD_OS_VERSION, "hasNFC", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDeviceType", "()Ljava/lang/String;", "getHasNFC", "()Z", "getId", "getModel", "getOs", "getOsVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class DeviceInfo {

    @NotNull
    private final String deviceType;
    private final boolean hasNFC;

    @NotNull
    private final String id;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osVersion;

    public DeviceInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z10) {
        this.id = str;
        this.deviceType = str2;
        this.model = str3;
        this.os = str4;
        this.osVersion = str5;
        this.hasNFC = z10;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deviceInfo.id;
        }
        if ((i10 & 2) != 0) {
            str2 = deviceInfo.deviceType;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = deviceInfo.model;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = deviceInfo.os;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = deviceInfo.osVersion;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            z10 = deviceInfo.hasNFC;
        }
        return deviceInfo.copy(str, str6, str7, str8, str9, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHasNFC() {
        return this.hasNFC;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String id, @NotNull String deviceType, @NotNull String model, @NotNull String os, @NotNull String osVersion, boolean hasNFC) {
        return new DeviceInfo(id, deviceType, model, os, osVersion, hasNFC);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.id, deviceInfo.id) && Intrinsics.areEqual(this.deviceType, deviceInfo.deviceType) && Intrinsics.areEqual(this.model, deviceInfo.model) && Intrinsics.areEqual(this.os, deviceInfo.os) && Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion) && this.hasNFC == deviceInfo.hasNFC;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final boolean getHasNFC() {
        return this.hasNFC;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deviceType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.model;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.os;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.osVersion;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z10 = this.hasNFC;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode5 + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(id=");
        sb2.append(this.id);
        sb2.append(", deviceType=");
        sb2.append(this.deviceType);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", os=");
        sb2.append(this.os);
        sb2.append(", osVersion=");
        sb2.append(this.osVersion);
        sb2.append(", hasNFC=");
        return i.c(sb2, this.hasNFC, ")");
    }
}
