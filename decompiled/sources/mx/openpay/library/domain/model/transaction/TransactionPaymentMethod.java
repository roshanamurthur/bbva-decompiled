package mx.openpay.library.domain.model.transaction;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionPaymentMethod.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lmx/openpay/library/domain/model/transaction/TransactionPaymentMethod;", "", "", "component1", "component2", "component3", "type", "barcodeBase64", "wallet", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "getBarcodeBase64", "c", "getWallet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransactionPaymentMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String barcodeBase64;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String wallet;

    public TransactionPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.barcodeBase64 = str2;
        this.wallet = str3;
    }

    public static /* synthetic */ TransactionPaymentMethod copy$default(TransactionPaymentMethod transactionPaymentMethod, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionPaymentMethod.type;
        }
        if ((i10 & 2) != 0) {
            str2 = transactionPaymentMethod.barcodeBase64;
        }
        if ((i10 & 4) != 0) {
            str3 = transactionPaymentMethod.wallet;
        }
        return transactionPaymentMethod.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBarcodeBase64() {
        return this.barcodeBase64;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWallet() {
        return this.wallet;
    }

    @NotNull
    public final TransactionPaymentMethod copy(@Nullable String type, @Nullable String barcodeBase64, @Nullable String wallet) {
        return new TransactionPaymentMethod(type, barcodeBase64, wallet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionPaymentMethod)) {
            return false;
        }
        TransactionPaymentMethod transactionPaymentMethod = (TransactionPaymentMethod) other;
        return Intrinsics.areEqual(this.type, transactionPaymentMethod.type) && Intrinsics.areEqual(this.barcodeBase64, transactionPaymentMethod.barcodeBase64) && Intrinsics.areEqual(this.wallet, transactionPaymentMethod.wallet);
    }

    @Nullable
    public final String getBarcodeBase64() {
        return this.barcodeBase64;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.barcodeBase64;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wallet;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionPaymentMethod(type=");
        sb2.append(this.type);
        sb2.append(", barcodeBase64=");
        sb2.append(this.barcodeBase64);
        sb2.append(", wallet=");
        return d.f(sb2, this.wallet, ")");
    }
}
