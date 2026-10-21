package mx.openpay.library.data.datasource.local.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BinEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(tableName = "bin")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u0006+"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/entity/BinEntity;", "", "id", "", "idBin", "bin", "", "allows6DigitMasking", "", "allows8DigitMasking", "bank", "bankCode", "bankId", "bankName", "bbvaWallet", "brand", "category", "level", "pointsType", "product", "provider", "type", "(IILjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllows6DigitMasking", "()Z", "getAllows8DigitMasking", "getBank", "()Ljava/lang/String;", "getBankCode", "getBankId", "getBankName", "getBbvaWallet", "getBin", "getBrand", "getCategory", "getId", "()I", "getIdBin", "getLevel", "getPointsType", "getProduct", "getProvider", "getType", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BinEntity {
    private final boolean allows6DigitMasking;
    private final boolean allows8DigitMasking;

    @Nullable
    private final String bank;

    @Nullable
    private final String bankCode;

    @Nullable
    private final String bankId;

    @Nullable
    private final String bankName;
    private final boolean bbvaWallet;

    @NotNull
    private final String bin;

    @NotNull
    private final String brand;

    @Nullable
    private final String category;

    @PrimaryKey(autoGenerate = true)
    private final int id;
    private final int idBin;

    @Nullable
    private final String level;

    @Nullable
    private final String pointsType;

    @Nullable
    private final String product;

    @Nullable
    private final String provider;

    @NotNull
    private final String type;

    public BinEntity(int i10, int i11, @NotNull String bin, boolean z10, boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z12, @NotNull String brand, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String type) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = i10;
        this.idBin = i11;
        this.bin = bin;
        this.allows6DigitMasking = z10;
        this.allows8DigitMasking = z11;
        this.bank = str;
        this.bankCode = str2;
        this.bankId = str3;
        this.bankName = str4;
        this.bbvaWallet = z12;
        this.brand = brand;
        this.category = str5;
        this.level = str6;
        this.pointsType = str7;
        this.product = str8;
        this.provider = str9;
        this.type = type;
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

    public final int getId() {
        return this.id;
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

    public /* synthetic */ BinEntity(int i10, int i11, String str, boolean z10, boolean z11, String str2, String str3, String str4, String str5, boolean z12, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, i11, str, z10, z11, str2, str3, str4, str5, z12, str6, str7, str8, str9, str10, str11, str12);
    }
}
