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

/* JADX INFO: compiled from: OobAuthenticateParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/OobAuthenticateParams;", "", "action", "", Constants.backendRequestUserId, "oobData", "confirmationRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAction", "()Ljava/lang/String;", "getUserId", "getOobData", "getConfirmationRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/bbva/plugin/naturalauthentication/domain/model/OobAuthenticateParams;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OobAuthenticateParams {

    @SerializedName("action")
    @NotNull
    private final String action;

    @SerializedName("confirmation_required")
    @Nullable
    private final Boolean confirmationRequired;

    @SerializedName("oob_data")
    @NotNull
    private final String oobData;

    @SerializedName(UserProfileKeyConstants.USER_ID)
    @NotNull
    private final String userId;

    public OobAuthenticateParams(@NotNull String action, @NotNull String userId, @NotNull String oobData, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(oobData, "oobData");
        this.action = action;
        this.userId = userId;
        this.oobData = oobData;
        this.confirmationRequired = bool;
    }

    public static /* synthetic */ OobAuthenticateParams copy$default(OobAuthenticateParams oobAuthenticateParams, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oobAuthenticateParams.action;
        }
        if ((i10 & 2) != 0) {
            str2 = oobAuthenticateParams.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = oobAuthenticateParams.oobData;
        }
        if ((i10 & 8) != 0) {
            bool = oobAuthenticateParams.confirmationRequired;
        }
        return oobAuthenticateParams.copy(str, str2, str3, bool);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOobData() {
        return this.oobData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    @NotNull
    public final OobAuthenticateParams copy(@NotNull String action, @NotNull String userId, @NotNull String oobData, @Nullable Boolean confirmationRequired) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(oobData, "oobData");
        return new OobAuthenticateParams(action, userId, oobData, confirmationRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OobAuthenticateParams)) {
            return false;
        }
        OobAuthenticateParams oobAuthenticateParams = (OobAuthenticateParams) other;
        return Intrinsics.areEqual(this.action, oobAuthenticateParams.action) && Intrinsics.areEqual(this.userId, oobAuthenticateParams.userId) && Intrinsics.areEqual(this.oobData, oobAuthenticateParams.oobData) && Intrinsics.areEqual(this.confirmationRequired, oobAuthenticateParams.confirmationRequired);
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
    public final String getOobData() {
        return this.oobData;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iC = n1.c(this.oobData, n1.c(this.userId, this.action.hashCode() * 31, 31), 31);
        Boolean bool = this.confirmationRequired;
        return iC + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.userId;
        String str3 = this.oobData;
        Boolean bool = this.confirmationRequired;
        StringBuilder sbC = a.c("OobAuthenticateParams(action=", str, ", userId=", str2, ", oobData=");
        sbC.append(str3);
        sbC.append(", confirmationRequired=");
        sbC.append(bool);
        sbC.append(")");
        return sbC.toString();
    }
}
