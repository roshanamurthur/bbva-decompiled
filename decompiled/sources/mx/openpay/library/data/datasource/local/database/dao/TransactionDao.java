package mx.openpay.library.data.datasource.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.entity.TransactionEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TransactionDao.kt */
/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H'J\b\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH'J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH'¨\u0006\u0011"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;", "", Constants.deleteAll, "", "getLocalTransaction", "Lmx/openpay/library/data/datasource/local/database/entity/TransactionEntity;", "insertTransaction", "", "localTransaction", "updateLocalTerminalCapacityDataSent", "", "updateTerminalCapacityData", "terminalCapacity", "", "updateTransaction", "transactionData", "idTransaction", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TransactionDao {
    @Query("DELETE FROM transactions")
    @Transaction
    int deleteAll();

    @Query("SELECT * FROM transactions")
    @Nullable
    TransactionEntity getLocalTransaction();

    @Insert(onConflict = 1)
    long insertTransaction(@NotNull TransactionEntity localTransaction);

    @Query("UPDATE transactions SET tcDataSent = 1")
    void updateLocalTerminalCapacityDataSent();

    @Query("UPDATE transactions SET tc =:terminalCapacity")
    void updateTerminalCapacityData(@NotNull String terminalCapacity);

    @Query("UPDATE transactions SET transactionData =:transactionData WHERE idTransaction=:idTransaction")
    void updateTransaction(@NotNull String transactionData, @NotNull String idTransaction);
}
