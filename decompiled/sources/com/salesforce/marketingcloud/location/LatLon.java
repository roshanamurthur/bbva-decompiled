package com.salesforce.marketingcloud.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.salesforce.marketingcloud.MCKeep;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0014J\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/salesforce/marketingcloud/location/LatLon;", "Landroid/os/Parcelable;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "latitude", "", "longitude", "(DD)V", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "-deprecated_latitude", "-deprecated_longitude", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LatLon implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatLon> CREATOR = new a();
    private final double latitude;
    private final double longitude;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LatLon> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatLon createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatLon(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatLon[] newArray(int i10) {
            return new LatLon[i10];
        }
    }

    public LatLon(double d2, double d3) {
        this.latitude = d2;
        this.longitude = d3;
    }

    public static /* synthetic */ LatLon copy$default(LatLon latLon, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = latLon.latitude;
        }
        if ((i10 & 2) != 0) {
            d3 = latLon.longitude;
        }
        return latLon.copy(d2, d3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "latitude", imports = {}))
    @JvmName(name = "-deprecated_latitude")
    /* JADX INFO: renamed from: -deprecated_latitude, reason: not valid java name and from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "longitude", imports = {}))
    @JvmName(name = "-deprecated_longitude")
    /* JADX INFO: renamed from: -deprecated_longitude, reason: not valid java name and from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @NotNull
    public final LatLon copy(double latitude, double longitude) {
        return new LatLon(latitude, longitude);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatLon)) {
            return false;
        }
        LatLon latLon = (LatLon) other;
        return Double.compare(this.latitude, latLon.latitude) == 0 && Double.compare(this.longitude, latLon.longitude) == 0;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @JvmName(name = "latitude")
    public final double latitude() {
        return this.latitude;
    }

    @JvmName(name = "longitude")
    public final double longitude() {
        return this.longitude;
    }

    @NotNull
    public String toString() {
        return "LatLon(latitude=" + this.latitude + ", longitude=" + this.longitude + RootService.CLOSE_BRACKET;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LatLon(@NotNull JSONObject json) throws JSONException {
        this(json.getDouble("latitude"), json.getDouble("longitude"));
        Intrinsics.checkNotNullParameter(json, "json");
    }
}
