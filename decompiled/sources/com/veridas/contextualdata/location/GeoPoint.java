package com.veridas.contextualdata.location;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeoPoint.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/veridas/contextualdata/location/GeoPoint;", "", "", "component1", "component2", "latitude", "longitude", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "D", "getLatitude", "()D", "b", "getLongitude", "<init>", "(DD)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class GeoPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double longitude;

    public GeoPoint(double d2, double d3) {
        this.latitude = d2;
        this.longitude = d3;
    }

    public static /* synthetic */ GeoPoint copy$default(GeoPoint geoPoint, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = geoPoint.latitude;
        }
        if ((i10 & 2) != 0) {
            d3 = geoPoint.longitude;
        }
        return geoPoint.copy(d2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final GeoPoint copy(double latitude, double longitude) {
        return new GeoPoint(latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) other;
        return Double.compare(this.latitude, geoPoint.latitude) == 0 && Double.compare(this.longitude, geoPoint.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "GeoPoint(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
