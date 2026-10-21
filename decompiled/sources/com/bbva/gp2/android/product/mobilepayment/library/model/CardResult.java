package com.bbva.gp2.android.product.mobilepayment.library.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/model/CardResult;", "", ConfigConstantsKt.LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID, "", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getResult", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardResult {

    @NotNull
    private final String cardId;

    @NotNull
    private final String result;

    public CardResult(@NotNull String cardId, @NotNull String result) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.cardId = cardId;
        this.result = result;
    }

    public static /* synthetic */ CardResult copy$default(CardResult cardResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cardResult.cardId;
        }
        if ((i10 & 2) != 0) {
            str2 = cardResult.result;
        }
        return cardResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final CardResult copy(@NotNull String cardId, @NotNull String result) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(result, "result");
        return new CardResult(cardId, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardResult)) {
            return false;
        }
        CardResult cardResult = (CardResult) other;
        return Intrinsics.areEqual(this.cardId, cardResult.cardId) && Intrinsics.areEqual(this.result, cardResult.result);
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode() + (this.cardId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("CardResult(cardId=", this.cardId, ", result=", this.result, ")");
    }
}
