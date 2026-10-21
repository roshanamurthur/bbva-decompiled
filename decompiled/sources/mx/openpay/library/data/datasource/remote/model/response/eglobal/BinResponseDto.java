package mx.openpay.library.data.datasource.remote.model.response.eglobal;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.c;
import androidx.collection.k;
import androidx.room.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BinResponseDto.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J»\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\u0013\u0010:\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u000fHÖ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006>"}, d2 = {"Lmx/openpay/library/data/datasource/remote/model/response/eglobal/BinResponseDto;", "", "allows6DigitMasking", "", "allows8DigitMasking", "bank", "", "bankCode", "bankId", "bankName", "bbvaWallet", "bin", "brand", "category", "idBin", "", "level", "pointsType", "product", "provider", "type", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllows6DigitMasking", "()Z", "getAllows8DigitMasking", "getBank", "()Ljava/lang/String;", "getBankCode", "getBankId", "getBankName", "getBbvaWallet", "getBin", "getBrand", "getCategory", "getIdBin", "()I", "getLevel", "getPointsType", "getProduct", "getProvider", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BinResponseDto {

    @SerializedName("allows6_digit_masking")
    private final boolean allows6DigitMasking;

    @SerializedName("allows8_digit_masking")
    private final boolean allows8DigitMasking;

    @SerializedName("bank")
    @Nullable
    private final String bank;

    @SerializedName("bank_code")
    @Nullable
    private final String bankCode;

    @SerializedName("bank_id")
    @Nullable
    private final String bankId;

    @SerializedName("bank_name")
    @Nullable
    private final String bankName;

    @SerializedName("bbva_wallet")
    private final boolean bbvaWallet;

    @SerializedName("bin")
    @NotNull
    private final String bin;

    @SerializedName("brand")
    @NotNull
    private final String brand;

    @SerializedName("category")
    @Nullable
    private final String category;

    @SerializedName("id_bin")
    private final int idBin;

    @SerializedName("level")
    @Nullable
    private final String level;

    @SerializedName("points_type")
    @Nullable
    private final String pointsType;

    @SerializedName("product")
    @Nullable
    private final String product;

    @SerializedName("provider")
    @Nullable
    private final String provider;

    @SerializedName("type")
    @NotNull
    private final String type;

    public BinResponseDto(boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z12, @NotNull String bin, @NotNull String brand, @Nullable String str5, int i10, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        this.allows6DigitMasking = z10;
        this.allows8DigitMasking = z11;
        this.bank = str;
        this.bankCode = str2;
        this.bankId = str3;
        this.bankName = str4;
        this.bbvaWallet = z12;
        this.bin = bin;
        this.brand = brand;
        this.category = str5;
        this.idBin = i10;
        this.level = str6;
        this.pointsType = str7;
        this.product = str8;
        this.provider = str9;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAllows6DigitMasking() {
        return this.allows6DigitMasking;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIdBin() {
        return this.idBin;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPointsType() {
        return this.pointsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAllows8DigitMasking() {
        return this.allows8DigitMasking;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBank() {
        return this.bank;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getBbvaWallet() {
        return this.bbvaWallet;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final BinResponseDto copy(boolean allows6DigitMasking, boolean allows8DigitMasking, @Nullable String bank, @Nullable String bankCode, @Nullable String bankId, @Nullable String bankName, boolean bbvaWallet, @NotNull String bin, @NotNull String brand, @Nullable String category, int idBin, @Nullable String level, @Nullable String pointsType, @Nullable String product, @Nullable String provider, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BinResponseDto(allows6DigitMasking, allows8DigitMasking, bank, bankCode, bankId, bankName, bbvaWallet, bin, brand, category, idBin, level, pointsType, product, provider, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinResponseDto)) {
            return false;
        }
        BinResponseDto binResponseDto = (BinResponseDto) other;
        return this.allows6DigitMasking == binResponseDto.allows6DigitMasking && this.allows8DigitMasking == binResponseDto.allows8DigitMasking && Intrinsics.areEqual(this.bank, binResponseDto.bank) && Intrinsics.areEqual(this.bankCode, binResponseDto.bankCode) && Intrinsics.areEqual(this.bankId, binResponseDto.bankId) && Intrinsics.areEqual(this.bankName, binResponseDto.bankName) && this.bbvaWallet == binResponseDto.bbvaWallet && Intrinsics.areEqual(this.bin, binResponseDto.bin) && Intrinsics.areEqual(this.brand, binResponseDto.brand) && Intrinsics.areEqual(this.category, binResponseDto.category) && this.idBin == binResponseDto.idBin && Intrinsics.areEqual(this.level, binResponseDto.level) && Intrinsics.areEqual(this.pointsType, binResponseDto.pointsType) && Intrinsics.areEqual(this.product, binResponseDto.product) && Intrinsics.areEqual(this.provider, binResponseDto.provider) && Intrinsics.areEqual(this.type, binResponseDto.type);
    }

    public final boolean getAllows6DigitMasking() {
        return this.allows6DigitMasking;
    }

    public final boolean getAllows8DigitMasking() {
        return this.allows8DigitMasking;
    }

    @Nullable
    public final String getBank() {
        return this.bank;
    }

    @Nullable
    public final String getBankCode() {
        return this.bankCode;
    }

    @Nullable
    public final String getBankId() {
        return this.bankId;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    public final boolean getBbvaWallet() {
        return this.bbvaWallet;
    }

    @NotNull
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    public final int getIdBin() {
        return this.idBin;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    public final String getPointsType() {
        return this.pointsType;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    public int hashCode() {
        boolean z10 = this.allows6DigitMasking;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.allows8DigitMasking;
        ?? r3 = z11;
        if (z11) {
            r3 = 1;
        }
        int i11 = (i10 + r3) * 31;
        String str = this.bank;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bankId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z12 = this.bbvaWallet;
        int iC = n1.c(this.brand, n1.c(this.bin, (iHashCode4 + (z12 ? 1 : z12)) * 31, 31), 31);
        String str5 = this.category;
        int iHashCode5 = (((iC + (str5 == null ? 0 : str5.hashCode())) * 31) + this.idBin) * 31;
        String str6 = this.level;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pointsType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.product;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.provider;
        return this.type.hashCode() + ((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        boolean z10 = this.allows6DigitMasking;
        boolean z11 = this.allows8DigitMasking;
        String str = this.bank;
        String str2 = this.bankCode;
        String str3 = this.bankId;
        String str4 = this.bankName;
        boolean z12 = this.bbvaWallet;
        String str5 = this.bin;
        String str6 = this.brand;
        String str7 = this.category;
        int i10 = this.idBin;
        String str8 = this.level;
        String str9 = this.pointsType;
        String str10 = this.product;
        String str11 = this.provider;
        String str12 = this.type;
        StringBuilder sb2 = new StringBuilder("BinResponseDto(allows6DigitMasking=");
        sb2.append(z10);
        sb2.append(", allows8DigitMasking=");
        sb2.append(z11);
        sb2.append(", bank=");
        k.e(sb2, str, ", bankCode=", str2, ", bankId=");
        k.e(sb2, str3, ", bankName=", str4, ", bbvaWallet=");
        sb2.append(z12);
        sb2.append(", bin=");
        sb2.append(str5);
        sb2.append(", brand=");
        k.e(sb2, str6, ", category=", str7, ", idBin=");
        a.f(sb2, i10, ", level=", str8, ", pointsType=");
        k.e(sb2, str9, ", product=", str10, ", provider=");
        return c.b(sb2, str11, ", type=", str12, ")");
    }
}
