package com.bbva.sl.ar.android.secsdk.fido.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoQuickAuthData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoQuickAuthData;", "", "aaid", "", "fidoAuthenticatorType", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoAuthenticatorType;", "tenant", Constants.backendRequestUserId, "<init>", "(Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoAuthenticatorType;Ljava/lang/String;Ljava/lang/String;)V", "getAaid", "()Ljava/lang/String;", "getFidoAuthenticatorType", "()Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoAuthenticatorType;", "getTenant", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FidoQuickAuthData {

    @NotNull
    private final String aaid;

    @Nullable
    private final FidoAuthenticatorType fidoAuthenticatorType;

    @NotNull
    private final String tenant;

    @NotNull
    private final String userId;

    public FidoQuickAuthData(@NotNull String aaid, @Nullable FidoAuthenticatorType fidoAuthenticatorType, @NotNull String tenant, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(aaid, "aaid");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.aaid = aaid;
        this.fidoAuthenticatorType = fidoAuthenticatorType;
        this.tenant = tenant;
        this.userId = userId;
    }

    public static /* synthetic */ FidoQuickAuthData copy$default(FidoQuickAuthData fidoQuickAuthData, String str, FidoAuthenticatorType fidoAuthenticatorType, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fidoQuickAuthData.aaid;
        }
        if ((i10 & 2) != 0) {
            fidoAuthenticatorType = fidoQuickAuthData.fidoAuthenticatorType;
        }
        if ((i10 & 4) != 0) {
            str2 = fidoQuickAuthData.tenant;
        }
        if ((i10 & 8) != 0) {
            str3 = fidoQuickAuthData.userId;
        }
        return fidoQuickAuthData.copy(str, fidoAuthenticatorType, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAaid() {
        return this.aaid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FidoAuthenticatorType getFidoAuthenticatorType() {
        return this.fidoAuthenticatorType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTenant() {
        return this.tenant;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final FidoQuickAuthData copy(@NotNull String aaid, @Nullable FidoAuthenticatorType fidoAuthenticatorType, @NotNull String tenant, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(aaid, "aaid");
        Intrinsics.checkNotNullParameter(tenant, "tenant");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new FidoQuickAuthData(aaid, fidoAuthenticatorType, tenant, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FidoQuickAuthData)) {
            return false;
        }
        FidoQuickAuthData fidoQuickAuthData = (FidoQuickAuthData) other;
        return Intrinsics.areEqual(this.aaid, fidoQuickAuthData.aaid) && this.fidoAuthenticatorType == fidoQuickAuthData.fidoAuthenticatorType && Intrinsics.areEqual(this.tenant, fidoQuickAuthData.tenant) && Intrinsics.areEqual(this.userId, fidoQuickAuthData.userId);
    }

    @NotNull
    public final String getAaid() {
        return this.aaid;
    }

    @Nullable
    public final FidoAuthenticatorType getFidoAuthenticatorType() {
        return this.fidoAuthenticatorType;
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
        int iHashCode = this.aaid.hashCode() * 31;
        FidoAuthenticatorType fidoAuthenticatorType = this.fidoAuthenticatorType;
        return this.userId.hashCode() + n1.c(this.tenant, (iHashCode + (fidoAuthenticatorType == null ? 0 : fidoAuthenticatorType.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.aaid;
        FidoAuthenticatorType fidoAuthenticatorType = this.fidoAuthenticatorType;
        String str2 = this.tenant;
        String str3 = this.userId;
        StringBuilder sb2 = new StringBuilder("FidoQuickAuthData(aaid=");
        sb2.append(str);
        sb2.append(", fidoAuthenticatorType=");
        sb2.append(fidoAuthenticatorType);
        sb2.append(", tenant=");
        return c.b(sb2, str2, ", userId=", str3, ")");
    }

    public /* synthetic */ FidoQuickAuthData(String str, FidoAuthenticatorType fidoAuthenticatorType, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : fidoAuthenticatorType, str2, str3);
    }
}
