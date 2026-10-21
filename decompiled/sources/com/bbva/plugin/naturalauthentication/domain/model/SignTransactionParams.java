package com.bbva.plugin.naturalauthentication.domain.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.adobe.marketing.mobile.UserProfileKeyConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SignTransactionParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/SignTransactionParams;", "", Constants.backendRequestUserId, "", "transactionId", "transactionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getTransactionId", "getTransactionText", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignTransactionParams {

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    @NotNull
    private final String transactionId;

    @SerializedName("transaction_text")
    @NotNull
    private final String transactionText;

    @SerializedName(UserProfileKeyConstants.USER_ID)
    @NotNull
    private final String userId;

    public SignTransactionParams(@NotNull String userId, @NotNull String transactionId, @NotNull String transactionText) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionText, "transactionText");
        this.userId = userId;
        this.transactionId = transactionId;
        this.transactionText = transactionText;
    }

    public static /* synthetic */ SignTransactionParams copy$default(SignTransactionParams signTransactionParams, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signTransactionParams.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = signTransactionParams.transactionId;
        }
        if ((i10 & 4) != 0) {
            str3 = signTransactionParams.transactionText;
        }
        return signTransactionParams.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionText() {
        return this.transactionText;
    }

    @NotNull
    public final SignTransactionParams copy(@NotNull String userId, @NotNull String transactionId, @NotNull String transactionText) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionText, "transactionText");
        return new SignTransactionParams(userId, transactionId, transactionText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignTransactionParams)) {
            return false;
        }
        SignTransactionParams signTransactionParams = (SignTransactionParams) other;
        return Intrinsics.areEqual(this.userId, signTransactionParams.userId) && Intrinsics.areEqual(this.transactionId, signTransactionParams.transactionId) && Intrinsics.areEqual(this.transactionText, signTransactionParams.transactionText);
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getTransactionText() {
        return this.transactionText;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.transactionText.hashCode() + n1.c(this.transactionId, this.userId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        String str2 = this.transactionId;
        return d.f(a.c("SignTransactionParams(userId=", str, ", transactionId=", str2, ", transactionText="), this.transactionText, ")");
    }
}
