package com.bbva.gp2.android.product.mobilepayment.library.model;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.google.pay.GoogleTapAndPay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/model/CardRequest;", "", ConfigConstantsKt.LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID, "", GoogleTapAndPay.KEY_PAN, "expirationMonth", "expirationYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getPan", "getExpirationMonth", "getExpirationYear", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardRequest {

    @NotNull
    private final String cardId;

    @NotNull
    private final String expirationMonth;

    @NotNull
    private final String expirationYear;

    @NotNull
    private final String pan;

    public CardRequest(@NotNull String cardId, @NotNull String pan, @NotNull String expirationMonth, @NotNull String expirationYear) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        this.cardId = cardId;
        this.pan = pan;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public static /* synthetic */ CardRequest copy$default(CardRequest cardRequest, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cardRequest.cardId;
        }
        if ((i10 & 2) != 0) {
            str2 = cardRequest.pan;
        }
        if ((i10 & 4) != 0) {
            str3 = cardRequest.expirationMonth;
        }
        if ((i10 & 8) != 0) {
            str4 = cardRequest.expirationYear;
        }
        return cardRequest.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    public final CardRequest copy(@NotNull String cardId, @NotNull String pan, @NotNull String expirationMonth, @NotNull String expirationYear) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        return new CardRequest(cardId, pan, expirationMonth, expirationYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardRequest)) {
            return false;
        }
        CardRequest cardRequest = (CardRequest) other;
        return Intrinsics.areEqual(this.cardId, cardRequest.cardId) && Intrinsics.areEqual(this.pan, cardRequest.pan) && Intrinsics.areEqual(this.expirationMonth, cardRequest.expirationMonth) && Intrinsics.areEqual(this.expirationYear, cardRequest.expirationYear);
    }

    @NotNull
    public final String getCardId() {
        return this.cardId;
    }

    @NotNull
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        return this.expirationYear.hashCode() + n1.c(this.expirationMonth, n1.c(this.pan, this.cardId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.cardId;
        String str2 = this.pan;
        return c.b(a.c("CardRequest(cardId=", str, ", pan=", str2, ", expirationMonth="), this.expirationMonth, ", expirationYear=", this.expirationYear, ")");
    }
}
