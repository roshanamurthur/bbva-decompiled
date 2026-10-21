package mx.openpay.library.domain.model.eglobal;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMerchant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J)\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001c"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "", "", "component1", "", "component2", "component3", "version", "binesCount", DigipassManagerConstants.KEY_SERIAL_NUMBER, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBinesCount", "()I", "c", "getSerialNumber", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GetMerchant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int binesCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serialNumber;

    public GetMerchant(@Nullable String str, int i10, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.version = str;
        this.binesCount = i10;
        this.serialNumber = serialNumber;
    }

    public static /* synthetic */ GetMerchant copy$default(GetMerchant getMerchant, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = getMerchant.version;
        }
        if ((i11 & 2) != 0) {
            i10 = getMerchant.binesCount;
        }
        if ((i11 & 4) != 0) {
            str2 = getMerchant.serialNumber;
        }
        return getMerchant.copy(str, i10, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBinesCount() {
        return this.binesCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @NotNull
    public final GetMerchant copy(@Nullable String version, int binesCount, @NotNull String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new GetMerchant(version, binesCount, serialNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMerchant)) {
            return false;
        }
        GetMerchant getMerchant = (GetMerchant) other;
        return Intrinsics.areEqual(this.version, getMerchant.version) && this.binesCount == getMerchant.binesCount && Intrinsics.areEqual(this.serialNumber, getMerchant.serialNumber);
    }

    public final int getBinesCount() {
        return this.binesCount;
    }

    @NotNull
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        return this.serialNumber.hashCode() + ((((str == null ? 0 : str.hashCode()) * 31) + this.binesCount) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GetMerchant(version=");
        sb2.append(this.version);
        sb2.append(", binesCount=");
        sb2.append(this.binesCount);
        sb2.append(", serialNumber=");
        return d.f(sb2, this.serialNumber, ")");
    }
}
