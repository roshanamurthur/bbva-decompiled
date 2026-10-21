package com.bbva.plugin.naturalauthentication.domain.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/DeleteParams;", "", "action", "", "authHandler", "deviceId", Constants.backendRequestUserId, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getAuthHandler", "getDeviceId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteParams {

    @SerializedName("action")
    @NotNull
    private final String action;

    @SerializedName("auth_handler")
    @NotNull
    private final String authHandler;

    @SerializedName("device_id")
    @NotNull
    private final String deviceId;

    @SerializedName(UserProfileKeyConstants.USER_ID)
    @NotNull
    private final String userId;

    public DeleteParams(@NotNull String action, @NotNull String authHandler, @NotNull String deviceId, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.action = action;
        this.authHandler = authHandler;
        this.deviceId = deviceId;
        this.userId = userId;
    }

    public static /* synthetic */ DeleteParams copy$default(DeleteParams deleteParams, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deleteParams.action;
        }
        if ((i10 & 2) != 0) {
            str2 = deleteParams.authHandler;
        }
        if ((i10 & 4) != 0) {
            str3 = deleteParams.deviceId;
        }
        if ((i10 & 8) != 0) {
            str4 = deleteParams.userId;
        }
        return deleteParams.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthHandler() {
        return this.authHandler;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final DeleteParams copy(@NotNull String action, @NotNull String authHandler, @NotNull String deviceId, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(authHandler, "authHandler");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new DeleteParams(action, authHandler, deviceId, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteParams)) {
            return false;
        }
        DeleteParams deleteParams = (DeleteParams) other;
        return Intrinsics.areEqual(this.action, deleteParams.action) && Intrinsics.areEqual(this.authHandler, deleteParams.authHandler) && Intrinsics.areEqual(this.deviceId, deleteParams.deviceId) && Intrinsics.areEqual(this.userId, deleteParams.userId);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getAuthHandler() {
        return this.authHandler;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + n1.c(this.deviceId, n1.c(this.authHandler, this.action.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.authHandler;
        return c.b(a.c("DeleteParams(action=", str, ", authHandler=", str2, ", deviceId="), this.deviceId, ", userId=", this.userId, ")");
    }
}
