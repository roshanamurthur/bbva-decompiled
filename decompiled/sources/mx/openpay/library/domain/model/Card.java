package mx.openpay.library.domain.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ocrcard.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\bB\u0010CJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\u008f\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001f\u001a\u00020\u0002HÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010+R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010%\u001a\u0004\bA\u0010'¨\u0006D"}, d2 = {"Lmx/openpay/library/domain/model/Card;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "address", "allowsCharges", "allowsPayouts", "bankCode", "bankName", "brand", ConstantsKt.CARD_NUMBER, "expirationMonth", "expirationYear", "holderName", "pointsCard", "pointsType", "type", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "b", "Z", "getAllowsCharges", "()Z", "c", "getAllowsPayouts", "d", "getBankCode", "e", "getBankName", "f", "getBrand", "g", "getCardNumber", "h", "getExpirationMonth", "i", "getExpirationYear", "j", "getHolderName", "k", "getPointsCard", "l", "getPointsType", "m", "getType", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Card {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean allowsCharges;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean allowsPayouts;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String bankCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bankName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String brand;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cardNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String expirationMonth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String expirationYear;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String holderName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean pointsCard;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pointsType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String type;

    public Card(@Nullable String str, boolean z10, boolean z11, @NotNull String bankCode, @Nullable String str2, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean z12, @NotNull String pointsType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(pointsType, "pointsType");
        Intrinsics.checkNotNullParameter(type, "type");
        this.address = str;
        this.allowsCharges = z10;
        this.allowsPayouts = z11;
        this.bankCode = bankCode;
        this.bankName = str2;
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.holderName = holderName;
        this.pointsCard = z12;
        this.pointsType = pointsType;
        this.type = type;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getPointsCard() {
        return this.pointsCard;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPointsType() {
        return this.pointsType;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllowsCharges() {
        return this.allowsCharges;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAllowsPayouts() {
        return this.allowsPayouts;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    public final Card copy(@Nullable String address, boolean allowsCharges, boolean allowsPayouts, @NotNull String bankCode, @Nullable String bankName, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean pointsCard, @NotNull String pointsType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(pointsType, "pointsType");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Card(address, allowsCharges, allowsPayouts, bankCode, bankName, brand, cardNumber, expirationMonth, expirationYear, holderName, pointsCard, pointsType, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(this.address, card.address) && this.allowsCharges == card.allowsCharges && this.allowsPayouts == card.allowsPayouts && Intrinsics.areEqual(this.bankCode, card.bankCode) && Intrinsics.areEqual(this.bankName, card.bankName) && Intrinsics.areEqual(this.brand, card.brand) && Intrinsics.areEqual(this.cardNumber, card.cardNumber) && Intrinsics.areEqual(this.expirationMonth, card.expirationMonth) && Intrinsics.areEqual(this.expirationYear, card.expirationYear) && Intrinsics.areEqual(this.holderName, card.holderName) && this.pointsCard == card.pointsCard && Intrinsics.areEqual(this.pointsType, card.pointsType) && Intrinsics.areEqual(this.type, card.type);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    public final boolean getAllowsCharges() {
        return this.allowsCharges;
    }

    public final boolean getAllowsPayouts() {
        return this.allowsPayouts;
    }

    @NotNull
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
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
    public final String getHolderName() {
        return this.holderName;
    }

    public final boolean getPointsCard() {
        return this.pointsCard;
    }

    @NotNull
    public final String getPointsType() {
        return this.pointsType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.allowsCharges;
        ?? r4 = z10;
        if (z10) {
            r4 = 1;
        }
        int i10 = (iHashCode + r4) * 31;
        boolean z11 = this.allowsPayouts;
        ?? r10 = z11;
        if (z11) {
            r10 = 1;
        }
        int iC = n1.c(this.bankCode, (i10 + r10) * 31, 31);
        String str2 = this.bankName;
        int iC2 = n1.c(this.holderName, n1.c(this.expirationYear, n1.c(this.expirationMonth, n1.c(this.cardNumber, n1.c(this.brand, (iC + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        boolean z12 = this.pointsCard;
        return this.type.hashCode() + n1.c(this.pointsType, (iC2 + (z12 ? 1 : z12)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Card(address=");
        sb2.append(this.address);
        sb2.append(", allowsCharges=");
        sb2.append(this.allowsCharges);
        sb2.append(", allowsPayouts=");
        sb2.append(this.allowsPayouts);
        sb2.append(", bankCode=");
        sb2.append(this.bankCode);
        sb2.append(", bankName=");
        sb2.append(this.bankName);
        sb2.append(", brand=");
        sb2.append(this.brand);
        sb2.append(", cardNumber=");
        sb2.append(this.cardNumber);
        sb2.append(", expirationMonth=");
        sb2.append(this.expirationMonth);
        sb2.append(", expirationYear=");
        sb2.append(this.expirationYear);
        sb2.append(", holderName=");
        sb2.append(this.holderName);
        sb2.append(", pointsCard=");
        sb2.append(this.pointsCard);
        sb2.append(", pointsType=");
        sb2.append(this.pointsType);
        sb2.append(", type=");
        return d.f(sb2, this.type, ")");
    }
}
