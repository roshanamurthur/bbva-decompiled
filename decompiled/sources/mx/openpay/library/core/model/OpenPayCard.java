package mx.openpay.library.core.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ocrcard.utils.ConstantsKt;
import d.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0013\u00105\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000204HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013¨\u0006?"}, d2 = {"Lmx/openpay/library/core/model/OpenPayCard;", "Landroid/os/Parcelable;", "address", "", "allowsCharges", "", "allowsPayouts", "bankCode", "bankName", "brand", ConstantsKt.CARD_NUMBER, "expirationMonth", "expirationYear", "holderName", "pointsCard", "pointsType", "type", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getAllowsCharges", "()Z", "getAllowsPayouts", "getBankCode", "getBankName", "bin", "getBin", "getBrand", "getCardNumber", "getExpirationMonth", "getExpirationYear", "getHolderName", "getPointsCard", "getPointsType", "span", "getSpan", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayCard implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OpenPayCard> CREATOR = new Creator();

    @Nullable
    private final String address;
    private final boolean allowsCharges;
    private final boolean allowsPayouts;

    @NotNull
    private final String bankCode;

    @NotNull
    private final String bankName;

    @NotNull
    private final String bin;

    @NotNull
    private final String brand;

    @NotNull
    private final String cardNumber;

    @NotNull
    private final String expirationMonth;

    @NotNull
    private final String expirationYear;

    @NotNull
    private final String holderName;
    private final boolean pointsCard;

    @NotNull
    private final String pointsType;

    @NotNull
    private final String span;

    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenPayCard> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCard createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenPayCard(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenPayCard[] newArray(int i10) {
            return new OpenPayCard[i10];
        }
    }

    public OpenPayCard(@Nullable String str, boolean z10, boolean z11, @NotNull String bankCode, @NotNull String bankName, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean z12, @NotNull String pointsType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
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
        this.bankName = bankName;
        this.brand = brand;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.holderName = holderName;
        this.pointsCard = z12;
        this.pointsType = pointsType;
        this.type = type;
        this.bin = StringsKt___StringsKt.take(cardNumber, 6);
        this.span = StringsKt___StringsKt.takeLast(cardNumber, 4);
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

    @NotNull
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
    public final OpenPayCard copy(@Nullable String address, boolean allowsCharges, boolean allowsPayouts, @NotNull String bankCode, @NotNull String bankName, @NotNull String brand, @NotNull String cardNumber, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, boolean pointsCard, @NotNull String pointsType, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        Intrinsics.checkNotNullParameter(pointsType, "pointsType");
        Intrinsics.checkNotNullParameter(type, "type");
        return new OpenPayCard(address, allowsCharges, allowsPayouts, bankCode, bankName, brand, cardNumber, expirationMonth, expirationYear, holderName, pointsCard, pointsType, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayCard)) {
            return false;
        }
        OpenPayCard openPayCard = (OpenPayCard) other;
        return Intrinsics.areEqual(this.address, openPayCard.address) && this.allowsCharges == openPayCard.allowsCharges && this.allowsPayouts == openPayCard.allowsPayouts && Intrinsics.areEqual(this.bankCode, openPayCard.bankCode) && Intrinsics.areEqual(this.bankName, openPayCard.bankName) && Intrinsics.areEqual(this.brand, openPayCard.brand) && Intrinsics.areEqual(this.cardNumber, openPayCard.cardNumber) && Intrinsics.areEqual(this.expirationMonth, openPayCard.expirationMonth) && Intrinsics.areEqual(this.expirationYear, openPayCard.expirationYear) && Intrinsics.areEqual(this.holderName, openPayCard.holderName) && this.pointsCard == openPayCard.pointsCard && Intrinsics.areEqual(this.pointsType, openPayCard.pointsType) && Intrinsics.areEqual(this.type, openPayCard.type);
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

    @NotNull
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final String getBin() {
        return this.bin;
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
    public final String getSpan() {
        return this.span;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
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
        int iA = a.a(this.holderName, a.a(this.expirationYear, a.a(this.expirationMonth, a.a(this.cardNumber, a.a(this.brand, a.a(this.bankName, a.a(this.bankCode, (i10 + r4) * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z12 = this.pointsCard;
        return this.type.hashCode() + a.a(this.pointsType, (iA + (z12 ? 1 : z12)) * 31, 31);
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
        StringBuilder sb2 = new StringBuilder("OpenPayCard(address=");
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

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.address);
        parcel.writeInt(this.allowsCharges ? 1 : 0);
        parcel.writeInt(this.allowsPayouts ? 1 : 0);
        parcel.writeString(this.bankCode);
        parcel.writeString(this.bankName);
        parcel.writeString(this.brand);
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.expirationMonth);
        parcel.writeString(this.expirationYear);
        parcel.writeString(this.holderName);
        parcel.writeInt(this.pointsCard ? 1 : 0);
        parcel.writeString(this.pointsType);
        parcel.writeString(this.type);
    }
}
