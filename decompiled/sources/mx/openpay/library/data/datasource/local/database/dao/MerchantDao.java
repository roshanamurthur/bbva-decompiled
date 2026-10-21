package mx.openpay.library.data.datasource.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.entity.MerchantEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MerchantDao.kt */
/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;", "", "getMerchantKeyNameBySlot", "", "slotKey", "", "insertMerchant", "", "merchantEntity", "Lmx/openpay/library/data/datasource/local/database/entity/MerchantEntity;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MerchantDao {
    @Query("SELECT keyName FROM merchant WHERE slotKey=:slotKey")
    @NotNull
    String getMerchantKeyNameBySlot(int slotKey);

    @Insert(onConflict = 1)
    long insertMerchant(@NotNull MerchantEntity merchantEntity);
}
