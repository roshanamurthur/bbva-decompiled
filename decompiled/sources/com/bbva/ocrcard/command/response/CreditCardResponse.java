package com.bbva.ocrcard.command.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreditCardResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lcom/bbva/ocrcard/command/response/CreditCardResponse;", "", ConstantsKt.CARD_TYPE, "", ConstantsKt.REDACTED_CARD_NUMBER, ConstantsKt.CARD_NUMBER, ConstantsKt.EXPIRY_MONTH, ConstantsKt.EXPIRY_YEAR, ConstantsKt.CVV, "postalCode", "cardHolderName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardHolderName", "()Ljava/lang/String;", "getCardNumber", "getCardType", "getCvv", "getExpiryMonth", "getExpiryYear", "getPostalCode", "getRedactedCardNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ocrcard_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CreditCardResponse {

    @NotNull
    private final String cardHolderName;

    @NotNull
    private final String cardNumber;

    @NotNull
    private final String cardType;

    @NotNull
    private final String cvv;

    @NotNull
    private final String expiryMonth;

    @NotNull
    private final String expiryYear;

    @NotNull
    private final String postalCode;

    @NotNull
    private final String redactedCardNumber;

    public CreditCardResponse(@NotNull String cardType, @NotNull String redactedCardNumber, @NotNull String cardNumber, @NotNull String expiryMonth, @NotNull String expiryYear, @NotNull String cvv, @NotNull String postalCode, @NotNull String cardHolderName) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(redactedCardNumber, "redactedCardNumber");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expiryMonth, "expiryMonth");
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(cardHolderName, "cardHolderName");
        this.cardType = cardType;
        this.redactedCardNumber = redactedCardNumber;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.postalCode = postalCode;
        this.cardHolderName = cardHolderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRedactedCardNumber() {
        return this.redactedCardNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    @NotNull
    public final CreditCardResponse copy(@NotNull String cardType, @NotNull String redactedCardNumber, @NotNull String cardNumber, @NotNull String expiryMonth, @NotNull String expiryYear, @NotNull String cvv, @NotNull String postalCode, @NotNull String cardHolderName) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(redactedCardNumber, "redactedCardNumber");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expiryMonth, "expiryMonth");
        Intrinsics.checkNotNullParameter(expiryYear, "expiryYear");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(postalCode, "postalCode");
        Intrinsics.checkNotNullParameter(cardHolderName, "cardHolderName");
        return new CreditCardResponse(cardType, redactedCardNumber, cardNumber, expiryMonth, expiryYear, cvv, postalCode, cardHolderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditCardResponse)) {
            return false;
        }
        CreditCardResponse creditCardResponse = (CreditCardResponse) other;
        return Intrinsics.areEqual(this.cardType, creditCardResponse.cardType) && Intrinsics.areEqual(this.redactedCardNumber, creditCardResponse.redactedCardNumber) && Intrinsics.areEqual(this.cardNumber, creditCardResponse.cardNumber) && Intrinsics.areEqual(this.expiryMonth, creditCardResponse.expiryMonth) && Intrinsics.areEqual(this.expiryYear, creditCardResponse.expiryYear) && Intrinsics.areEqual(this.cvv, creditCardResponse.cvv) && Intrinsics.areEqual(this.postalCode, creditCardResponse.postalCode) && Intrinsics.areEqual(this.cardHolderName, creditCardResponse.cardHolderName);
    }

    @NotNull
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final String getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    @NotNull
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    public final String getPostalCode() {
        return this.postalCode;
    }

    @NotNull
    public final String getRedactedCardNumber() {
        return this.redactedCardNumber;
    }

    public int hashCode() {
        return this.cardHolderName.hashCode() + n1.c(this.postalCode, n1.c(this.cvv, n1.c(this.expiryYear, n1.c(this.expiryMonth, n1.c(this.cardNumber, n1.c(this.redactedCardNumber, this.cardType.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CreditCardResponse(cardType=");
        sb2.append(this.cardType);
        sb2.append(", redactedCardNumber=");
        sb2.append(this.redactedCardNumber);
        sb2.append(", cardNumber=");
        sb2.append(this.cardNumber);
        sb2.append(", expiryMonth=");
        sb2.append(this.expiryMonth);
        sb2.append(", expiryYear=");
        sb2.append(this.expiryYear);
        sb2.append(", cvv=");
        sb2.append(this.cvv);
        sb2.append(", postalCode=");
        sb2.append(this.postalCode);
        sb2.append(", cardHolderName=");
        return y2.b(sb2, this.cardHolderName, RootService.CLOSE_BRACKET);
    }
}
