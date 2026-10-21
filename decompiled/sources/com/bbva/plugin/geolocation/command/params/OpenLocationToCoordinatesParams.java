package com.bbva.plugin.geolocation.command.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenLocationToCoordinatesParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/geolocation/command/params/OpenLocationToCoordinatesParams;", "", "openLocationCode", "", "<init>", "(Ljava/lang/String;)V", "getOpenLocationCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OpenLocationToCoordinatesParams {

    @Nullable
    private final String openLocationCode;

    public OpenLocationToCoordinatesParams(@Nullable String str) {
        this.openLocationCode = str;
    }

    public static /* synthetic */ OpenLocationToCoordinatesParams copy$default(OpenLocationToCoordinatesParams openLocationToCoordinatesParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openLocationToCoordinatesParams.openLocationCode;
        }
        return openLocationToCoordinatesParams.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOpenLocationCode() {
        return this.openLocationCode;
    }

    @NotNull
    public final OpenLocationToCoordinatesParams copy(@Nullable String openLocationCode) {
        return new OpenLocationToCoordinatesParams(openLocationCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenLocationToCoordinatesParams) && Intrinsics.areEqual(this.openLocationCode, ((OpenLocationToCoordinatesParams) other).openLocationCode);
    }

    @Nullable
    public final String getOpenLocationCode() {
        return this.openLocationCode;
    }

    public int hashCode() {
        String str = this.openLocationCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("OpenLocationToCoordinatesParams(openLocationCode=", this.openLocationCode, ")");
    }
}
