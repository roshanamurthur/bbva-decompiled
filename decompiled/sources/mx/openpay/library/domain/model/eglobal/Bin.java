package mx.openpay.library.domain.model.eglobal;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bin.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bD\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\bP\u0010QJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J»\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010$\u001a\u00020\u0005HÆ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u000eHÖ\u0001J\u0013\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0017\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010 \u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u00103R\u0019\u0010!\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u00103R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u00103R\u0019\u0010#\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bM\u00103R\u0017\u0010$\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u00103¨\u0006R"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/Bin;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "component12", "component13", "component14", "component15", "component16", "allows6DigitMasking", "allows8DigitMasking", "bank", "bankCode", "bankId", "bankName", "bbvaWallet", "bin", "brand", "category", "idBin", "level", "pointsType", "product", "provider", "type", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getAllows6DigitMasking", "()Z", "b", "getAllows8DigitMasking", "c", "Ljava/lang/String;", "getBank", "()Ljava/lang/String;", "d", "getBankCode", "e", "getBankId", "f", "getBankName", "g", "getBbvaWallet", "h", "getBin", "i", "getBrand", "j", "getCategory", "k", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIdBin", "()I", "l", "getLevel", "m", "getPointsType", "n", "getProduct", "o", "getProvider", "p", "getType", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Bin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean allows6DigitMasking;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean allows8DigitMasking;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bank;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bankCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bankId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bankName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean bbvaWallet;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String bin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String brand;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String category;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int idBin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String level;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String pointsType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String product;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String provider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    public Bin(boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z12, @NotNull String bin, @NotNull String brand, @Nullable String str5, int i10, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String type) {
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
    public final Bin copy(boolean allows6DigitMasking, boolean allows8DigitMasking, @Nullable String bank, @Nullable String bankCode, @Nullable String bankId, @Nullable String bankName, boolean bbvaWallet, @NotNull String bin, @NotNull String brand, @Nullable String category, int idBin, @Nullable String level, @Nullable String pointsType, @Nullable String product, @Nullable String provider, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Bin(allows6DigitMasking, allows8DigitMasking, bank, bankCode, bankId, bankName, bbvaWallet, bin, brand, category, idBin, level, pointsType, product, provider, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bin)) {
            return false;
        }
        Bin bin = (Bin) other;
        return this.allows6DigitMasking == bin.allows6DigitMasking && this.allows8DigitMasking == bin.allows8DigitMasking && Intrinsics.areEqual(this.bank, bin.bank) && Intrinsics.areEqual(this.bankCode, bin.bankCode) && Intrinsics.areEqual(this.bankId, bin.bankId) && Intrinsics.areEqual(this.bankName, bin.bankName) && this.bbvaWallet == bin.bbvaWallet && Intrinsics.areEqual(this.bin, bin.bin) && Intrinsics.areEqual(this.brand, bin.brand) && Intrinsics.areEqual(this.category, bin.category) && this.idBin == bin.idBin && Intrinsics.areEqual(this.level, bin.level) && Intrinsics.areEqual(this.pointsType, bin.pointsType) && Intrinsics.areEqual(this.product, bin.product) && Intrinsics.areEqual(this.provider, bin.provider) && Intrinsics.areEqual(this.type, bin.type);
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
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
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
        StringBuilder sb2 = new StringBuilder("Bin(allows6DigitMasking=");
        sb2.append(this.allows6DigitMasking);
        sb2.append(", allows8DigitMasking=");
        sb2.append(this.allows8DigitMasking);
        sb2.append(", bank=");
        sb2.append(this.bank);
        sb2.append(", bankCode=");
        sb2.append(this.bankCode);
        sb2.append(", bankId=");
        sb2.append(this.bankId);
        sb2.append(", bankName=");
        sb2.append(this.bankName);
        sb2.append(", bbvaWallet=");
        sb2.append(this.bbvaWallet);
        sb2.append(", bin=");
        sb2.append(this.bin);
        sb2.append(", brand=");
        sb2.append(this.brand);
        sb2.append(", category=");
        sb2.append(this.category);
        sb2.append(", idBin=");
        sb2.append(this.idBin);
        sb2.append(", level=");
        sb2.append(this.level);
        sb2.append(", pointsType=");
        sb2.append(this.pointsType);
        sb2.append(", product=");
        sb2.append(this.product);
        sb2.append(", provider=");
        sb2.append(this.provider);
        sb2.append(", type=");
        return d.f(sb2, this.type, ")");
    }
}
