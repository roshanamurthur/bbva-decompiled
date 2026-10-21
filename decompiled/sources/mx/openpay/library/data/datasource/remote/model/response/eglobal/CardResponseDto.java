package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CardResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "", "address", "", "allowsCharges", "", "allowsPayouts", "bankCode", "bankName", "brand", ConstantsKt.CARD_NUMBER, "expirationMonth", "expirationYear", "holderName", "pointsCard", "pointsType", "type", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAllowsCharges", "()Z", "getAllowsPayouts", "getBankCode", "getBankName", "getBrand", "getCardNumber", "getExpirationMonth", "getExpirationYear", "getHolderName", "getPointsCard", "getPointsType", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardResponseDto {

    @SerializedName("address")
    @Nullable
    private final String address;

    @SerializedName("allows_charges")
    private final boolean allowsCharges;

    @SerializedName("allows_payouts")
    private final boolean allowsPayouts;

    @SerializedName("bank_code")
    @NotNull
    private final String bankCode;

    @SerializedName("bank_name")
    @Nullable
    private final String bankName;

    @SerializedName("brand")
    @NotNull
    private final String brand;

    @SerializedName("card_number")
    @NotNull
    private final String cardNumber;

    @SerializedName("expiration_month")
    @NotNull
    private final String expirationMonth;

    @SerializedName("expiration_year")
    @NotNull
    private final String expirationYear;

    @SerializedName("holder_name")
    @NotNull
    private final String holderName;

    @SerializedName("points_card")
    private final boolean pointsCard;

    @SerializedName("points_type")
    @Nullable
    private final String pointsType;

    @SerializedName("type")
    @NotNull
    private final String type;

    public CardResponseDto(@Nullable String str, boolean z10, boolean z11, @NotNull String bankCode, @Nullable String str2, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean z12, @Nullable String str3, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
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
        this.pointsType = str3;
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

    @Nullable
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
    public final CardResponseDto copy(@Nullable String address, boolean allowsCharges, boolean allowsPayouts, @NotNull String bankCode, @Nullable String bankName, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean pointsCard, @Nullable String pointsType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(type, "type");
        return new CardResponseDto(address, allowsCharges, allowsPayouts, bankCode, bankName, brand, cardNumber, expirationMonth, expirationYear, holderName, pointsCard, pointsType, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardResponseDto)) {
            return false;
        }
        CardResponseDto cardResponseDto = (CardResponseDto) other;
        return Intrinsics.areEqual(this.address, cardResponseDto.address) && this.allowsCharges == cardResponseDto.allowsCharges && this.allowsPayouts == cardResponseDto.allowsPayouts && Intrinsics.areEqual(this.bankCode, cardResponseDto.bankCode) && Intrinsics.areEqual(this.bankName, cardResponseDto.bankName) && Intrinsics.areEqual(this.brand, cardResponseDto.brand) && Intrinsics.areEqual(this.cardNumber, cardResponseDto.cardNumber) && Intrinsics.areEqual(this.expirationMonth, cardResponseDto.expirationMonth) && Intrinsics.areEqual(this.expirationYear, cardResponseDto.expirationYear) && Intrinsics.areEqual(this.holderName, cardResponseDto.holderName) && this.pointsCard == cardResponseDto.pointsCard && Intrinsics.areEqual(this.pointsType, cardResponseDto.pointsType) && Intrinsics.areEqual(this.type, cardResponseDto.type);
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

    @Nullable
    public final String getPointsType() {
        return this.pointsType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.allowsCharges;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.allowsPayouts;
        ?? r4 = z11;
        if (z11) {
            r4 = 1;
        }
        int iC = n1.c(this.bankCode, (i10 + r4) * 31, 31);
        String str2 = this.bankName;
        int iC2 = n1.c(this.holderName, n1.c(this.expirationYear, n1.c(this.expirationMonth, n1.c(this.cardNumber, n1.c(this.brand, (iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31);
        boolean z12 = this.pointsCard;
        int i11 = (iC2 + (z12 ? 1 : z12)) * 31;
        String str3 = this.pointsType;
        return this.type.hashCode() + ((i11 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.address;
        boolean z10 = this.allowsCharges;
        boolean z11 = this.allowsPayouts;
        String str2 = this.bankCode;
        String str3 = this.bankName;
        String str4 = this.brand;
        String str5 = this.cardNumber;
        String str6 = this.expirationMonth;
        String str7 = this.expirationYear;
        String str8 = this.holderName;
        boolean z12 = this.pointsCard;
        String str9 = this.pointsType;
        String str10 = this.type;
        StringBuilder sb2 = new StringBuilder("CardResponseDto(address=");
        sb2.append(str);
        sb2.append(", allowsCharges=");
        sb2.append(z10);
        sb2.append(", allowsPayouts=");
        sb2.append(z11);
        sb2.append(", bankCode=");
        sb2.append(str2);
        sb2.append(", bankName=");
        k.e(sb2, str3, ", brand=", str4, ", cardNumber=");
        k.e(sb2, str5, ", expirationMonth=", str6, ", expirationYear=");
        k.e(sb2, str7, ", holderName=", str8, ", pointsCard=");
        sb2.append(z12);
        sb2.append(", pointsType=");
        sb2.append(str9);
        sb2.append(", type=");
        return d.f(sb2, str10, ")");
    }
}
