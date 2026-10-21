package mx.openpay.library.domain.model.eglobal;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalTransaction.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lmx/openpay/library/domain/model/eglobal/LocalTransaction;", "", "", "component1", "component2", "component3", "", "component4", "idTransaction", "transactionData", "tc", "tcDataSent", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getIdTransaction", "()Ljava/lang/String;", "b", "getTransactionData", "c", "getTc", "d", "Z", "getTcDataSent", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LocalTransaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String idTransaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String transactionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean tcDataSent;

    public LocalTransaction(@NotNull String idTransaction, @NotNull String transactionData, @NotNull String tc2, boolean z10) {
        Intrinsics.checkNotNullParameter(idTransaction, "idTransaction");
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(tc2, "tc");
        this.idTransaction = idTransaction;
        this.transactionData = transactionData;
        this.tc = tc2;
        this.tcDataSent = z10;
    }

    public static /* synthetic */ LocalTransaction copy$default(LocalTransaction localTransaction, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localTransaction.idTransaction;
        }
        if ((i10 & 2) != 0) {
            str2 = localTransaction.transactionData;
        }
        if ((i10 & 4) != 0) {
            str3 = localTransaction.tc;
        }
        if ((i10 & 8) != 0) {
            z10 = localTransaction.tcDataSent;
        }
        return localTransaction.copy(str, str2, str3, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdTransaction() {
        return this.idTransaction;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionData() {
        return this.transactionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTc() {
        return this.tc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTcDataSent() {
        return this.tcDataSent;
    }

    @NotNull
    public final LocalTransaction copy(@NotNull String idTransaction, @NotNull String transactionData, @NotNull String tc2, boolean tcDataSent) {
        Intrinsics.checkNotNullParameter(idTransaction, "idTransaction");
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(tc2, "tc");
        return new LocalTransaction(idTransaction, transactionData, tc2, tcDataSent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalTransaction)) {
            return false;
        }
        LocalTransaction localTransaction = (LocalTransaction) other;
        return Intrinsics.areEqual(this.idTransaction, localTransaction.idTransaction) && Intrinsics.areEqual(this.transactionData, localTransaction.transactionData) && Intrinsics.areEqual(this.tc, localTransaction.tc) && this.tcDataSent == localTransaction.tcDataSent;
    }

    @NotNull
    public final String getIdTransaction() {
        return this.idTransaction;
    }

    @NotNull
    public final String getTc() {
        return this.tc;
    }

    public final boolean getTcDataSent() {
        return this.tcDataSent;
    }

    @NotNull
    public final String getTransactionData() {
        return this.transactionData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.tc, n1.c(this.transactionData, this.idTransaction.hashCode() * 31, 31), 31);
        boolean z10 = this.tcDataSent;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iC + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocalTransaction(idTransaction=");
        sb2.append(this.idTransaction);
        sb2.append(", transactionData=");
        sb2.append(this.transactionData);
        sb2.append(", tc=");
        sb2.append(this.tc);
        sb2.append(", tcDataSent=");
        return i.c(sb2, this.tcDataSent, ")");
    }
}
