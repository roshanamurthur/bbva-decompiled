package com.bbva.plugin.geolocation.command.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAddressFromLocationParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/plugin/geolocation/command/params/GetAddressFromLocationParams;", "", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatitude", "()Ljava/lang/String;", "getLongitude", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetAddressFromLocationParams {

    @Nullable
    private final String latitude;

    @Nullable
    private final String longitude;

    public GetAddressFromLocationParams(@Nullable String str, @Nullable String str2) {
        this.latitude = str;
        this.longitude = str2;
    }

    public static /* synthetic */ GetAddressFromLocationParams copy$default(GetAddressFromLocationParams getAddressFromLocationParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getAddressFromLocationParams.latitude;
        }
        if ((i10 & 2) != 0) {
            str2 = getAddressFromLocationParams.longitude;
        }
        return getAddressFromLocationParams.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final GetAddressFromLocationParams copy(@Nullable String latitude, @Nullable String longitude) {
        return new GetAddressFromLocationParams(latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAddressFromLocationParams)) {
            return false;
        }
        GetAddressFromLocationParams getAddressFromLocationParams = (GetAddressFromLocationParams) other;
        return Intrinsics.areEqual(this.latitude, getAddressFromLocationParams.latitude) && Intrinsics.areEqual(this.longitude, getAddressFromLocationParams.longitude);
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        String str = this.latitude;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.longitude;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return u.g("GetAddressFromLocationParams(latitude=", this.latitude, ", longitude=", this.longitude, ")");
    }
}
