package mx.openpay.library.data.datasource.local.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.entity.ConnectedDeviceEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectedDeviceDao.kt */
/* JADX INFO: loaded from: classes12.dex */
@Dao
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H'¨\u0006\f"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;", "", "getKeyInjectedDateBySerial", "", "serial", "insertConnectedDevice", "", "connectedDeviceEntity", "Lmx/openpay/library/data/datasource/local/database/entity/ConnectedDeviceEntity;", "updateKeyInjectedDateBySerial", "", "keyInjectedDate", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ConnectedDeviceDao {
    @Query("SELECT keyInjectedDate FROM connected_device WHERE serial=:serial")
    @NotNull
    String getKeyInjectedDateBySerial(@NotNull String serial);

    @Insert(onConflict = 1)
    long insertConnectedDevice(@NotNull ConnectedDeviceEntity connectedDeviceEntity);

    @Query("UPDATE connected_device SET keyInjectedDate =:keyInjectedDate WHERE serial=:serial")
    void updateKeyInjectedDateBySerial(@NotNull String keyInjectedDate, @NotNull String serial);
}
