package com.bbva.plugin.geolocation.command.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.v;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.geolocation.common.ConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationPayload.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/bbva/plugin/geolocation/command/response/LocationPayload;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "latitude", "", "longitude", ConstantsKt.ALTITUDE, ConstantsKt.ACCURACY, "", "<init>", "(DDDF)V", "getLatitude", "()D", "getLongitude", "getAltitude", "getAccuracy", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationPayload extends PayloadDTO {
    private final float accuracy;
    private final double altitude;
    private final double latitude;
    private final double longitude;

    public LocationPayload(double d2, double d3, double d7, float f6) {
        this.latitude = d2;
        this.longitude = d3;
        this.altitude = d7;
        this.accuracy = f6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final LocationPayload copy(double latitude, double longitude, double altitude, float accuracy) {
        return new LocationPayload(latitude, longitude, altitude, accuracy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationPayload)) {
            return false;
        }
        LocationPayload locationPayload = (LocationPayload) other;
        return Double.compare(this.latitude, locationPayload.latitude) == 0 && Double.compare(this.longitude, locationPayload.longitude) == 0 && Double.compare(this.altitude, locationPayload.altitude) == 0 && Float.compare(this.accuracy, locationPayload.accuracy) == 0;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.altitude);
        return Float.floatToIntBits(this.accuracy) + ((i10 + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31);
    }

    @NotNull
    public String toString() {
        double d2 = this.latitude;
        double d3 = this.longitude;
        double d7 = this.altitude;
        float f6 = this.accuracy;
        StringBuilder sb2 = new StringBuilder("LocationPayload(latitude=");
        sb2.append(d2);
        sb2.append(", longitude=");
        sb2.append(d3);
        v.f(sb2, ", altitude=", d7, ", accuracy=");
        return l0.a(sb2, f6, ")");
    }
}
