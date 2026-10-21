package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import androidx.camera.core.impl.a;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.geolocation.common.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeolocationResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "", ConstantsKt.ACCURACY, "Lcom/bbva/ethermobile/help/kit/result/Result;", "", ConstantsKt.ALTITUDE, "latitude", "longitude", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getAccuracy", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "getAltitude", "getLatitude", "getLongitude", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeolocationResponse {

    @NotNull
    private final Result<String> accuracy;

    @NotNull
    private final Result<String> altitude;

    @NotNull
    private final Result<String> latitude;

    @NotNull
    private final Result<String> longitude;

    public GeolocationResponse(@NotNull Result<String> accuracy, @NotNull Result<String> altitude, @NotNull Result<String> latitude, @NotNull Result<String> longitude) {
        Intrinsics.checkNotNullParameter(accuracy, "accuracy");
        Intrinsics.checkNotNullParameter(altitude, "altitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        this.accuracy = accuracy;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeolocationResponse copy$default(GeolocationResponse geolocationResponse, Result result, Result result2, Result result3, Result result4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = geolocationResponse.accuracy;
        }
        if ((i10 & 2) != 0) {
            result2 = geolocationResponse.altitude;
        }
        if ((i10 & 4) != 0) {
            result3 = geolocationResponse.latitude;
        }
        if ((i10 & 8) != 0) {
            result4 = geolocationResponse.longitude;
        }
        return geolocationResponse.copy(result, result2, result3, result4);
    }

    @NotNull
    public final Result<String> component1() {
        return this.accuracy;
    }

    @NotNull
    public final Result<String> component2() {
        return this.altitude;
    }

    @NotNull
    public final Result<String> component3() {
        return this.latitude;
    }

    @NotNull
    public final Result<String> component4() {
        return this.longitude;
    }

    @NotNull
    public final GeolocationResponse copy(@NotNull Result<String> accuracy, @NotNull Result<String> altitude, @NotNull Result<String> latitude, @NotNull Result<String> longitude) {
        Intrinsics.checkNotNullParameter(accuracy, "accuracy");
        Intrinsics.checkNotNullParameter(altitude, "altitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        return new GeolocationResponse(accuracy, altitude, latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeolocationResponse)) {
            return false;
        }
        GeolocationResponse geolocationResponse = (GeolocationResponse) other;
        return Intrinsics.areEqual(this.accuracy, geolocationResponse.accuracy) && Intrinsics.areEqual(this.altitude, geolocationResponse.altitude) && Intrinsics.areEqual(this.latitude, geolocationResponse.latitude) && Intrinsics.areEqual(this.longitude, geolocationResponse.longitude);
    }

    @NotNull
    public final Result<String> getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final Result<String> getAltitude() {
        return this.altitude;
    }

    @NotNull
    public final Result<String> getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final Result<String> getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return this.longitude.hashCode() + a.b(this.latitude, a.b(this.altitude, this.accuracy.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "GeolocationResponse(accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
