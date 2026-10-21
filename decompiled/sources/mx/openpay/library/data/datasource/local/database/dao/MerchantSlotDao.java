package mx.openpay.library.data.datasource.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.entity.MerchantSlotEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MerchantDao.kt */
/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H'J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0003H'J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;", "", "getCountSlotInfoBySlotKeyAndSerialId", "", "slotKey", "serial", "", "getRenewKeyBySlotAndTerminal", "insertMerchantSlot", "", "merchantSlotEntity", "Lmx/openpay/library/data/datasource/local/database/entity/MerchantSlotEntity;", "isMerchantSlotKeyValidated", "", "updateMerchantSlotKeyInjectedBySlot", "", "status", "updateRenewKeyBySlotAndTerminal", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MerchantSlotDao {
    @Query("SELECT COUNT(*) FROM merchant_slot WHERE slotKey=:slotKey and terminalSerialId=:serial")
    int getCountSlotInfoBySlotKeyAndSerialId(int slotKey, @NotNull String serial);

    @Query("SELECT renewKey FROM merchant_slot WHERE slotKey=:slotKey and terminalSerialId=:serial")
    int getRenewKeyBySlotAndTerminal(int slotKey, @NotNull String serial);

    @Insert(onConflict = 1)
    long insertMerchantSlot(@NotNull MerchantSlotEntity merchantSlotEntity);

    @Query("SELECT keyInjected FROM merchant_slot WHERE slotKey=:slotKey and terminalSerialId=:serial")
    boolean isMerchantSlotKeyValidated(@NotNull String serial, int slotKey);

    @Query("UPDATE merchant_slot SET keyInjected =:status WHERE slotKey=:slotKey and terminalSerialId=:serial")
    void updateMerchantSlotKeyInjectedBySlot(int slotKey, @NotNull String serial, int status);

    @Query("UPDATE merchant_slot SET renewKey =:status WHERE slotKey=:slotKey and terminalSerialId=:serial")
    void updateRenewKeyBySlotAndTerminal(int status, int slotKey, @NotNull String serial);
}
