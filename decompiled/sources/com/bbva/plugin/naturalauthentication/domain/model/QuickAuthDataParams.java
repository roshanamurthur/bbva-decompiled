package com.bbva.plugin.naturalauthentication.domain.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QuickAuthDataParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/QuickAuthDataParams;", "", Constants.backendRequestUserId, "", "tenant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getTenant", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickAuthDataParams {

    @NotNull
    private final String tenant;

    @SerializedName(UserProfileKeyConstants.USER_ID)
    @NotNull
    private final String userId;

    public QuickAuthDataParams(@NotNull String userId, @NotNull String tenant) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        this.userId = userId;
        this.tenant = tenant;
    }

    public static /* synthetic */ QuickAuthDataParams copy$default(QuickAuthDataParams quickAuthDataParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = quickAuthDataParams.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = quickAuthDataParams.tenant;
        }
        return quickAuthDataParams.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTenant() {
        return this.tenant;
    }

    @NotNull
    public final QuickAuthDataParams copy(@NotNull String userId, @NotNull String tenant) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        return new QuickAuthDataParams(userId, tenant);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAuthDataParams)) {
            return false;
        }
        QuickAuthDataParams quickAuthDataParams = (QuickAuthDataParams) other;
        return Intrinsics.areEqual(this.userId, quickAuthDataParams.userId) && Intrinsics.areEqual(this.tenant, quickAuthDataParams.tenant);
    }

    @NotNull
    public final String getTenant() {
        return this.tenant;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.tenant.hashCode() + (this.userId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("QuickAuthDataParams(userId=", this.userId, ", tenant=", this.tenant, ")");
    }
}
