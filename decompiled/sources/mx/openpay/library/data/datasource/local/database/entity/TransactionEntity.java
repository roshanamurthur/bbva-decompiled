package mx.openpay.library.data.datasource.local.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TransactionEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Entity(tableName = "transactions")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/entity/TransactionEntity;", "", "idTransaction", "", "transactionData", "tc", "tcDataSent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getIdTransaction", "()Ljava/lang/String;", "getTc", "getTcDataSent", "()Z", "getTransactionData", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransactionEntity {

    @PrimaryKey
    @NotNull
    private final String idTransaction;

    @NotNull
    private final String tc;
    private final boolean tcDataSent;

    @NotNull
    private final String transactionData;

    public TransactionEntity(@NotNull String idTransaction, @NotNull String transactionData, @NotNull String tc2, boolean z10) {
        Intrinsics.checkNotNullParameter(idTransaction, "idTransaction");
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(tc2, "tc");
        this.idTransaction = idTransaction;
        this.transactionData = transactionData;
        this.tc = tc2;
        this.tcDataSent = z10;
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
}
