package mx.openpay.library.data.datasource.local.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import mx.openpay.library.data.datasource.local.database.dao.BinDao;
import mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao;
import mx.openpay.library.data.datasource.local.database.dao.TransactionDao;
import mx.openpay.library.data.datasource.local.database.entity.BinEntity;
import mx.openpay.library.data.datasource.local.database.entity.ConnectedDeviceEntity;
import mx.openpay.library.data.datasource.local.database.entity.MerchantEntity;
import mx.openpay.library.data.datasource.local.database.entity.MerchantSlotEntity;
import mx.openpay.library.data.datasource.local.database.entity.TransactionEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenPaySDKDataBase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Database(entities = {BinEntity.class, TransactionEntity.class, MerchantEntity.class, MerchantSlotEntity.class, ConnectedDeviceEntity.class}, version = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lmx/openpay/library/data/datasource/local/database/OpenPaySDKDataBase;", "Landroidx/room/RoomDatabase;", "()V", "binDao", "Lmx/openpay/library/data/datasource/local/database/dao/BinDao;", "connectedDeviceDao", "Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;", "merchantDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;", "merchantSlotDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;", "transactionDao", "Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPaySDKDataBase extends RoomDatabase {
    @NotNull
    public abstract BinDao binDao();

    @NotNull
    public abstract ConnectedDeviceDao connectedDeviceDao();

    @NotNull
    public abstract MerchantDao merchantDao();

    @NotNull
    public abstract MerchantSlotDao merchantSlotDao();

    @NotNull
    public abstract TransactionDao transactionDao();
}
