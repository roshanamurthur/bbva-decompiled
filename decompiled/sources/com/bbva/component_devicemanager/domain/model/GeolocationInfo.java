package com.bbva.component_devicemanager.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.geolocation.common.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/GeolocationInfo;", "", "", "component1", "component2", "component3", "component4", "latitudeId", "altitudeId", "longitude", ConstantsKt.ACCURACY, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getLatitudeId", "()Ljava/lang/String;", "b", "getAltitudeId", "c", "getLongitude", "d", "getAccuracy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GeolocationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String latitudeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String altitudeId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String longitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String accuracy;

    public GeolocationInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.latitudeId = str;
        this.altitudeId = str2;
        this.longitude = str3;
        this.accuracy = str4;
    }

    public static /* synthetic */ GeolocationInfo copy$default(GeolocationInfo geolocationInfo, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geolocationInfo.latitudeId;
        }
        if ((i10 & 2) != 0) {
            str2 = geolocationInfo.altitudeId;
        }
        if ((i10 & 4) != 0) {
            str3 = geolocationInfo.longitude;
        }
        if ((i10 & 8) != 0) {
            str4 = geolocationInfo.accuracy;
        }
        return geolocationInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLatitudeId() {
        return this.latitudeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAltitudeId() {
        return this.altitudeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final GeolocationInfo copy(@Nullable String latitudeId, @Nullable String altitudeId, @Nullable String longitude, @Nullable String accuracy) {
        return new GeolocationInfo(latitudeId, altitudeId, longitude, accuracy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeolocationInfo)) {
            return false;
        }
        GeolocationInfo geolocationInfo = (GeolocationInfo) other;
        return Intrinsics.areEqual(this.latitudeId, geolocationInfo.latitudeId) && Intrinsics.areEqual(this.altitudeId, geolocationInfo.altitudeId) && Intrinsics.areEqual(this.longitude, geolocationInfo.longitude) && Intrinsics.areEqual(this.accuracy, geolocationInfo.accuracy);
    }

    @Nullable
    public final String getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final String getAltitudeId() {
        return this.altitudeId;
    }

    @Nullable
    public final String getLatitudeId() {
        return this.latitudeId;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        String str = this.latitudeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altitudeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.longitude;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accuracy;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeolocationInfo(latitudeId=");
        sb2.append(this.latitudeId);
        sb2.append(", altitudeId=");
        sb2.append(this.altitudeId);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", accuracy=");
        return d.f(sb2, this.accuracy, ")");
    }
}
