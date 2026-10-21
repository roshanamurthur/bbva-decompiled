package com.bbva.ethermobilesdk.deviceinfo.plugin.command.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollideFingerprintParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/command/params/CollideFingerprintParams;", "", "userID", "", "(Ljava/lang/String;)V", "getUserID", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CollideFingerprintParams {

    @SerializedName(Constants.backendRequestUserId)
    @NotNull
    private final String userID;

    public CollideFingerprintParams(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
    }

    public static /* synthetic */ CollideFingerprintParams copy$default(CollideFingerprintParams collideFingerprintParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collideFingerprintParams.userID;
        }
        return collideFingerprintParams.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    public final CollideFingerprintParams copy(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return new CollideFingerprintParams(userID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CollideFingerprintParams) && Intrinsics.areEqual(this.userID, ((CollideFingerprintParams) other).userID);
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return this.userID.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("CollideFingerprintParams(userID=", this.userID, ")");
    }
}
