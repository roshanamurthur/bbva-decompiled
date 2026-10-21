package com.bbva.gp2.android.product.mobilepayment.plugin.request;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTransactionHistoryRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/GetTransactionHistoryRequest;", "", ConfigConstantsKt.LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID, "", "pkcs7", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getPkcs7", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetTransactionHistoryRequest {

    @NotNull
    private final String cardId;

    @NotNull
    private final String pkcs7;

    public GetTransactionHistoryRequest(@NotNull String cardId, @NotNull String pkcs7) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        this.cardId = cardId;
        this.pkcs7 = pkcs7;
    }

    public static /* synthetic */ GetTransactionHistoryRequest copy$default(GetTransactionHistoryRequest getTransactionHistoryRequest, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getTransactionHistoryRequest.cardId;
        }
        if ((i10 & 2) != 0) {
            str2 = getTransactionHistoryRequest.pkcs7;
        }
        return getTransactionHistoryRequest.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPkcs7() {
        return this.pkcs7;
    }

    @NotNull
    public final GetTransactionHistoryRequest copy(@NotNull String cardId, @NotNull String pkcs7) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        return new GetTransactionHistoryRequest(cardId, pkcs7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTransactionHistoryRequest)) {
            return false;
        }
        GetTransactionHistoryRequest getTransactionHistoryRequest = (GetTransactionHistoryRequest) other;
        return Intrinsics.areEqual(this.cardId, getTransactionHistoryRequest.cardId) && Intrinsics.areEqual(this.pkcs7, getTransactionHistoryRequest.pkcs7);
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getPkcs7() {
        return this.pkcs7;
    }

    public int hashCode() {
        return this.pkcs7.hashCode() + (this.cardId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("GetTransactionHistoryRequest(cardId=", this.cardId, ", pkcs7=", this.pkcs7, ")");
    }
}
