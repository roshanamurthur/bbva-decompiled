package com.bbva.component_devicemanager.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b;\u0010<J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J_\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManagerData;", "", "", "component1", "component2", "component3", "Lcom/bbva/component_devicemanager/domain/model/DeviceType;", "component4", "Lcom/bbva/component_devicemanager/domain/model/Country;", "component5", "Lcom/bbva/component_devicemanager/domain/model/StatusType;", "component6", "Lcom/bbva/component_devicemanager/domain/model/BlackBox;", "component7", "Lcom/bbva/component_devicemanager/domain/model/ActiveServices;", "component8", "accessId", "etherDeviceId", "tokenIntegrityChecker", Constants.deviceType, "country", "statusType", "blackBox", "activeServices", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAccessId", "()Ljava/lang/String;", "b", "getEtherDeviceId", "c", "getTokenIntegrityChecker", "d", "Lcom/bbva/component_devicemanager/domain/model/DeviceType;", "getDeviceType", "()Lcom/bbva/component_devicemanager/domain/model/DeviceType;", "e", "Lcom/bbva/component_devicemanager/domain/model/Country;", "getCountry", "()Lcom/bbva/component_devicemanager/domain/model/Country;", "f", "Lcom/bbva/component_devicemanager/domain/model/StatusType;", "getStatusType", "()Lcom/bbva/component_devicemanager/domain/model/StatusType;", "g", "Lcom/bbva/component_devicemanager/domain/model/BlackBox;", "getBlackBox", "()Lcom/bbva/component_devicemanager/domain/model/BlackBox;", "h", "Lcom/bbva/component_devicemanager/domain/model/ActiveServices;", "getActiveServices", "()Lcom/bbva/component_devicemanager/domain/model/ActiveServices;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component_devicemanager/domain/model/DeviceType;Lcom/bbva/component_devicemanager/domain/model/Country;Lcom/bbva/component_devicemanager/domain/model/StatusType;Lcom/bbva/component_devicemanager/domain/model/BlackBox;Lcom/bbva/component_devicemanager/domain/model/ActiveServices;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class DeviceManagerData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String accessId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String etherDeviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String tokenIntegrityChecker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceType deviceType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Country country;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StatusType statusType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BlackBox blackBox;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ActiveServices activeServices;

    public DeviceManagerData(@NotNull String accessId, @NotNull String etherDeviceId, @Nullable String str, @NotNull DeviceType deviceType, @NotNull Country country, @NotNull StatusType statusType, @Nullable BlackBox blackBox, @Nullable ActiveServices activeServices) {
        Intrinsics.checkNotNullParameter(accessId, "accessId");
        Intrinsics.checkNotNullParameter(etherDeviceId, "etherDeviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(statusType, "statusType");
        this.accessId = accessId;
        this.etherDeviceId = etherDeviceId;
        this.tokenIntegrityChecker = str;
        this.deviceType = deviceType;
        this.country = country;
        this.statusType = statusType;
        this.blackBox = blackBox;
        this.activeServices = activeServices;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessId() {
        return this.accessId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEtherDeviceId() {
        return this.etherDeviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenIntegrityChecker() {
        return this.tokenIntegrityChecker;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StatusType getStatusType() {
        return this.statusType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BlackBox getBlackBox() {
        return this.blackBox;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ActiveServices getActiveServices() {
        return this.activeServices;
    }

    @NotNull
    public final DeviceManagerData copy(@NotNull String accessId, @NotNull String etherDeviceId, @Nullable String tokenIntegrityChecker, @NotNull DeviceType deviceType, @NotNull Country country, @NotNull StatusType statusType, @Nullable BlackBox blackBox, @Nullable ActiveServices activeServices) {
        Intrinsics.checkNotNullParameter(accessId, "accessId");
        Intrinsics.checkNotNullParameter(etherDeviceId, "etherDeviceId");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(statusType, "statusType");
        return new DeviceManagerData(accessId, etherDeviceId, tokenIntegrityChecker, deviceType, country, statusType, blackBox, activeServices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceManagerData)) {
            return false;
        }
        DeviceManagerData deviceManagerData = (DeviceManagerData) other;
        return Intrinsics.areEqual(this.accessId, deviceManagerData.accessId) && Intrinsics.areEqual(this.etherDeviceId, deviceManagerData.etherDeviceId) && Intrinsics.areEqual(this.tokenIntegrityChecker, deviceManagerData.tokenIntegrityChecker) && Intrinsics.areEqual(this.deviceType, deviceManagerData.deviceType) && Intrinsics.areEqual(this.country, deviceManagerData.country) && Intrinsics.areEqual(this.statusType, deviceManagerData.statusType) && Intrinsics.areEqual(this.blackBox, deviceManagerData.blackBox) && Intrinsics.areEqual(this.activeServices, deviceManagerData.activeServices);
    }

    @NotNull
    public final String getAccessId() {
        return this.accessId;
    }

    @Nullable
    public final ActiveServices getActiveServices() {
        return this.activeServices;
    }

    @Nullable
    public final BlackBox getBlackBox() {
        return this.blackBox;
    }

    @NotNull
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getEtherDeviceId() {
        return this.etherDeviceId;
    }

    @NotNull
    public final StatusType getStatusType() {
        return this.statusType;
    }

    @Nullable
    public final String getTokenIntegrityChecker() {
        return this.tokenIntegrityChecker;
    }

    public int hashCode() {
        int iC = n1.c(this.etherDeviceId, this.accessId.hashCode() * 31, 31);
        String str = this.tokenIntegrityChecker;
        int iHashCode = (this.statusType.hashCode() + ((this.country.hashCode() + ((this.deviceType.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        BlackBox blackBox = this.blackBox;
        int iHashCode2 = (iHashCode + (blackBox == null ? 0 : blackBox.hashCode())) * 31;
        ActiveServices activeServices = this.activeServices;
        return iHashCode2 + (activeServices != null ? activeServices.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceManagerData(accessId=" + this.accessId + ", etherDeviceId=" + this.etherDeviceId + ", tokenIntegrityChecker=" + this.tokenIntegrityChecker + ", deviceType=" + this.deviceType + ", country=" + this.country + ", statusType=" + this.statusType + ", blackBox=" + this.blackBox + ", activeServices=" + this.activeServices + ")";
    }
}
