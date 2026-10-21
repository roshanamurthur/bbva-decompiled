package mx.openpay.library.domain.model.eglobal;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Merchant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/Merchant;", "", "", "component1", "Lmx/openpay/library/domain/model/eglobal/SlotKey;", "component2", "", "component3", "component4", "component5", "merchantName", "slotKey", "updateBines", "updateVersion", "firmwareVersion", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getMerchantName", "()Ljava/lang/String;", "b", "Lmx/openpay/library/domain/model/eglobal/SlotKey;", "getSlotKey", "()Lmx/openpay/library/domain/model/eglobal/SlotKey;", "c", "Z", "getUpdateBines", "()Z", "d", "getUpdateVersion", "e", "getFirmwareVersion", "<init>", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/SlotKey;ZZLjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Merchant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String merchantName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotKey slotKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean updateBines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean updateVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String firmwareVersion;

    public Merchant(@NotNull String merchantName, @NotNull SlotKey slotKey, boolean z10, boolean z11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        this.merchantName = merchantName;
        this.slotKey = slotKey;
        this.updateBines = z10;
        this.updateVersion = z11;
        this.firmwareVersion = str;
    }

    public static /* synthetic */ Merchant copy$default(Merchant merchant, String str, SlotKey slotKey, boolean z10, boolean z11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = merchant.merchantName;
        }
        if ((i10 & 2) != 0) {
            slotKey = merchant.slotKey;
        }
        SlotKey slotKey2 = slotKey;
        if ((i10 & 4) != 0) {
            z10 = merchant.updateBines;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = merchant.updateVersion;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            str2 = merchant.firmwareVersion;
        }
        return merchant.copy(str, slotKey2, z12, z13, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SlotKey getSlotKey() {
        return this.slotKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUpdateBines() {
        return this.updateBines;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUpdateVersion() {
        return this.updateVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final Merchant copy(@NotNull String merchantName, @NotNull SlotKey slotKey, boolean updateBines, boolean updateVersion, @Nullable String firmwareVersion) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(slotKey, "slotKey");
        return new Merchant(merchantName, slotKey, updateBines, updateVersion, firmwareVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Merchant)) {
            return false;
        }
        Merchant merchant = (Merchant) other;
        return Intrinsics.areEqual(this.merchantName, merchant.merchantName) && Intrinsics.areEqual(this.slotKey, merchant.slotKey) && this.updateBines == merchant.updateBines && this.updateVersion == merchant.updateVersion && Intrinsics.areEqual(this.firmwareVersion, merchant.firmwareVersion);
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final SlotKey getSlotKey() {
        return this.slotKey;
    }

    public final boolean getUpdateBines() {
        return this.updateBines;
    }

    public final boolean getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = (this.slotKey.hashCode() + (this.merchantName.hashCode() * 31)) * 31;
        boolean z10 = this.updateBines;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.updateVersion;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str = this.firmwareVersion;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Merchant(merchantName=");
        sb2.append(this.merchantName);
        sb2.append(", slotKey=");
        sb2.append(this.slotKey);
        sb2.append(", updateBines=");
        sb2.append(this.updateBines);
        sb2.append(", updateVersion=");
        sb2.append(this.updateVersion);
        sb2.append(", firmwareVersion=");
        return d.f(sb2, this.firmwareVersion, ")");
    }
}
