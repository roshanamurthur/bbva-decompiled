package com.bbva.plugin.naturalauthentication.domain.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticateParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/AuthenticateParams;", "", "action", "", Constants.backendRequestUserId, "confirmationRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAction", "()Ljava/lang/String;", "getUserId", "getConfirmationRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/plugin/naturalauthentication/domain/model/AuthenticateParams;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticateParams {

    @SerializedName("action")
    @NotNull
    private final String action;

    @SerializedName("confirmation_required")
    @Nullable
    private final Boolean confirmationRequired;

    @SerializedName(UserProfileKeyConstants.USER_ID)
    @NotNull
    private final String userId;

    public AuthenticateParams(@NotNull String action, @NotNull String userId, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.action = action;
        this.userId = userId;
        this.confirmationRequired = bool;
    }

    public static /* synthetic */ AuthenticateParams copy$default(AuthenticateParams authenticateParams, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authenticateParams.action;
        }
        if ((i10 & 2) != 0) {
            str2 = authenticateParams.userId;
        }
        if ((i10 & 4) != 0) {
            bool = authenticateParams.confirmationRequired;
        }
        return authenticateParams.copy(str, str2, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    @NotNull
    public final AuthenticateParams copy(@NotNull String action, @NotNull String userId, @Nullable Boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new AuthenticateParams(action, userId, confirmationRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticateParams)) {
            return false;
        }
        AuthenticateParams authenticateParams = (AuthenticateParams) other;
        return Intrinsics.areEqual(this.action, authenticateParams.action) && Intrinsics.areEqual(this.userId, authenticateParams.userId) && Intrinsics.areEqual(this.confirmationRequired, authenticateParams.confirmationRequired);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iC = n1.c(this.userId, this.action.hashCode() * 31, 31);
        Boolean bool = this.confirmationRequired;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.userId;
        Boolean bool = this.confirmationRequired;
        StringBuilder sbC = a.c("AuthenticateParams(action=", str, ", userId=", str2, ", confirmationRequired=");
        sbC.append(bool);
        sbC.append(")");
        return sbC.toString();
    }
}
