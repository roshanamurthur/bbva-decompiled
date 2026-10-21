package com.bbva.google.pay.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardPendingVerificationResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/google/pay/model/CardPendingVerificationResult;", "", "primaryAccountNumberSuffix", "", "tokenReferenceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryAccountNumberSuffix", "()Ljava/lang/String;", "getTokenReferenceId", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "google-pay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardPendingVerificationResult {

    @NotNull
    private final String primaryAccountNumberSuffix;

    @NotNull
    private final String tokenReferenceId;

    public CardPendingVerificationResult(@NotNull String primaryAccountNumberSuffix, @NotNull String tokenReferenceId) {
        Intrinsics.checkNotNullParameter(primaryAccountNumberSuffix, "primaryAccountNumberSuffix");
        Intrinsics.checkNotNullParameter(tokenReferenceId, "tokenReferenceId");
        this.primaryAccountNumberSuffix = primaryAccountNumberSuffix;
        this.tokenReferenceId = tokenReferenceId;
    }

    public static /* synthetic */ CardPendingVerificationResult copy$default(CardPendingVerificationResult cardPendingVerificationResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cardPendingVerificationResult.primaryAccountNumberSuffix;
        }
        if ((i10 & 2) != 0) {
            str2 = cardPendingVerificationResult.tokenReferenceId;
        }
        return cardPendingVerificationResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimaryAccountNumberSuffix() {
        return this.primaryAccountNumberSuffix;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    @NotNull
    public final CardPendingVerificationResult copy(@NotNull String primaryAccountNumberSuffix, @NotNull String tokenReferenceId) {
        Intrinsics.checkNotNullParameter(primaryAccountNumberSuffix, "primaryAccountNumberSuffix");
        Intrinsics.checkNotNullParameter(tokenReferenceId, "tokenReferenceId");
        return new CardPendingVerificationResult(primaryAccountNumberSuffix, tokenReferenceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPendingVerificationResult)) {
            return false;
        }
        CardPendingVerificationResult cardPendingVerificationResult = (CardPendingVerificationResult) other;
        return Intrinsics.areEqual(this.primaryAccountNumberSuffix, cardPendingVerificationResult.primaryAccountNumberSuffix) && Intrinsics.areEqual(this.tokenReferenceId, cardPendingVerificationResult.tokenReferenceId);
    }

    @NotNull
    public final String getPrimaryAccountNumberSuffix() {
        return this.primaryAccountNumberSuffix;
    }

    @NotNull
    public final String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    public int hashCode() {
        return this.tokenReferenceId.hashCode() + (this.primaryAccountNumberSuffix.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardPendingVerificationResult(primaryAccountNumberSuffix=");
        sb2.append(this.primaryAccountNumberSuffix);
        sb2.append(", tokenReferenceId=");
        return y2.b(sb2, this.tokenReferenceId, RootService.CLOSE_BRACKET);
    }
}
