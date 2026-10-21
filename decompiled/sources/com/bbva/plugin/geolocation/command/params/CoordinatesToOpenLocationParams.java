package com.bbva.plugin.geolocation.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoordinatesToOpenLocationParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/bbva/plugin/geolocation/command/params/CoordinatesToOpenLocationParams;", "", "latitude", "", "longitude", "length", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "getLatitude", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLongitude", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/bbva/plugin/geolocation/command/params/CoordinatesToOpenLocationParams;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoordinatesToOpenLocationParams {

    @Nullable
    private final Double latitude;

    @Nullable
    private final Integer length;

    @Nullable
    private final Double longitude;

    public CoordinatesToOpenLocationParams(@Nullable Double d2, @Nullable Double d3, @Nullable Integer num) {
        this.latitude = d2;
        this.longitude = d3;
        this.length = num;
    }

    public static /* synthetic */ CoordinatesToOpenLocationParams copy$default(CoordinatesToOpenLocationParams coordinatesToOpenLocationParams, Double d2, Double d3, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = coordinatesToOpenLocationParams.latitude;
        }
        if ((i10 & 2) != 0) {
            d3 = coordinatesToOpenLocationParams.longitude;
        }
        if ((i10 & 4) != 0) {
            num = coordinatesToOpenLocationParams.length;
        }
        return coordinatesToOpenLocationParams.copy(d2, d3, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @NotNull
    public final CoordinatesToOpenLocationParams copy(@Nullable Double latitude, @Nullable Double longitude, @Nullable Integer length) {
        return new CoordinatesToOpenLocationParams(latitude, longitude, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinatesToOpenLocationParams)) {
            return false;
        }
        CoordinatesToOpenLocationParams coordinatesToOpenLocationParams = (CoordinatesToOpenLocationParams) other;
        return Intrinsics.areEqual((Object) this.latitude, (Object) coordinatesToOpenLocationParams.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) coordinatesToOpenLocationParams.longitude) && Intrinsics.areEqual(this.length, coordinatesToOpenLocationParams.length);
    }

    @Nullable
    public final Double getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        Double d2 = this.latitude;
        int iHashCode = (d2 == null ? 0 : d2.hashCode()) * 31;
        Double d3 = this.longitude;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.length;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CoordinatesToOpenLocationParams(latitude=" + this.latitude + ", longitude=" + this.longitude + ", length=" + this.length + ")";
    }
}
