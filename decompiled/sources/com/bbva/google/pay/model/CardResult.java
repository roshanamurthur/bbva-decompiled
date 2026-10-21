package com.bbva.google.pay.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.google.pay.utils.TokenState;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/bbva/google/pay/model/CardResult;", "", "primaryAccountNumberSuffix", "", "isDefault", "", "state", "Lcom/bbva/google/pay/utils/TokenState;", "tokenReferenceId", "(Ljava/lang/String;ZLcom/bbva/google/pay/utils/TokenState;Ljava/lang/String;)V", "()Z", "getPrimaryAccountNumberSuffix", "()Ljava/lang/String;", "getState", "()Lcom/bbva/google/pay/utils/TokenState;", "getTokenReferenceId", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "google-pay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardResult {
    private final boolean isDefault;

    @NotNull
    private final String primaryAccountNumberSuffix;

    @NotNull
    private final TokenState state;

    @NotNull
    private final String tokenReferenceId;

    public CardResult(@NotNull String primaryAccountNumberSuffix, boolean z10, @NotNull TokenState state, @NotNull String tokenReferenceId) {
        Intrinsics.checkNotNullParameter(primaryAccountNumberSuffix, "primaryAccountNumberSuffix");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tokenReferenceId, "tokenReferenceId");
        this.primaryAccountNumberSuffix = primaryAccountNumberSuffix;
        this.isDefault = z10;
        this.state = state;
        this.tokenReferenceId = tokenReferenceId;
    }

    public static /* synthetic */ CardResult copy$default(CardResult cardResult, String str, boolean z10, TokenState tokenState, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cardResult.primaryAccountNumberSuffix;
        }
        if ((i10 & 2) != 0) {
            z10 = cardResult.isDefault;
        }
        if ((i10 & 4) != 0) {
            tokenState = cardResult.state;
        }
        if ((i10 & 8) != 0) {
            str2 = cardResult.tokenReferenceId;
        }
        return cardResult.copy(str, z10, tokenState, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimaryAccountNumberSuffix() {
        return this.primaryAccountNumberSuffix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TokenState getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    @NotNull
    public final CardResult copy(@NotNull String primaryAccountNumberSuffix, boolean isDefault, @NotNull TokenState state, @NotNull String tokenReferenceId) {
        Intrinsics.checkNotNullParameter(primaryAccountNumberSuffix, "primaryAccountNumberSuffix");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tokenReferenceId, "tokenReferenceId");
        return new CardResult(primaryAccountNumberSuffix, isDefault, state, tokenReferenceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardResult)) {
            return false;
        }
        CardResult cardResult = (CardResult) other;
        return Intrinsics.areEqual(this.primaryAccountNumberSuffix, cardResult.primaryAccountNumberSuffix) && this.isDefault == cardResult.isDefault && this.state == cardResult.state && Intrinsics.areEqual(this.tokenReferenceId, cardResult.tokenReferenceId);
    }

    @NotNull
    public final String getPrimaryAccountNumberSuffix() {
        return this.primaryAccountNumberSuffix;
    }

    @NotNull
    public final TokenState getState() {
        return this.state;
    }

    @NotNull
    public final String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.primaryAccountNumberSuffix.hashCode() * 31;
        boolean z10 = this.isDefault;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return this.tokenReferenceId.hashCode() + ((this.state.hashCode() + ((iHashCode + r1) * 31)) * 31);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CardResult(primaryAccountNumberSuffix=");
        sb2.append(this.primaryAccountNumberSuffix);
        sb2.append(", isDefault=");
        sb2.append(this.isDefault);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", tokenReferenceId=");
        return y2.b(sb2, this.tokenReferenceId, RootService.CLOSE_BRACKET);
    }
}
