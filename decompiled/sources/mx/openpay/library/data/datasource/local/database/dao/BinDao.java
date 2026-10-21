package mx.openpay.library.data.datasource.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.bbva.component.dm.naturalauth.Constants;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.entity.BinEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BinDao.kt */
/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH'¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/dao/BinDao;", "", Constants.deleteAll, "", "getCount", "insertBin", "", "binEntity", "Lmx/openpay/library/data/datasource/local/database/entity/BinEntity;", "validateIfBinIsBbvaPoints", "cardBin", "", "bankCode", "bancomerPointsType", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BinDao {
    @Query("DELETE FROM bin")
    @Transaction
    int deleteAll();

    @Query("SELECT COUNT(*) FROM bin")
    int getCount();

    @Insert(onConflict = 1)
    long insertBin(@NotNull BinEntity binEntity);

    @Query("SELECT COUNT(*) FROM bin WHERE bin=:cardBin and ( (bankCode=:bankCode and pointsType=:bancomerPointsType) or (bankId = 12 and type IN ('CREDIT', 'credit')) )")
    int validateIfBinIsBbvaPoints(@NotNull String cardBin, @NotNull String bankCode, @NotNull String bancomerPointsType);
}
