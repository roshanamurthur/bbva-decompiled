package mx.openpay.library.data.datasource.local.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.sun.mail.imap.IMAPStore;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mx.openpay.library.data.datasource.local.database.dao.BinDao;
import mx.openpay.library.data.datasource.local.database.dao.BinDao_Impl;
import mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao;
import mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao_Impl;
import mx.openpay.library.data.datasource.local.database.dao.MerchantDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantDao_Impl;
import mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao_Impl;
import mx.openpay.library.data.datasource.local.database.dao.TransactionDao;
import mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl;

/* JADX INFO: loaded from: classes12.dex */
public final class OpenPaySDKDataBase_Impl extends OpenPaySDKDataBase {
    private volatile BinDao _binDao;
    private volatile ConnectedDeviceDao _connectedDeviceDao;
    private volatile MerchantDao _merchantDao;
    private volatile MerchantSlotDao _merchantSlotDao;
    private volatile TransactionDao _transactionDao;

    @Override // mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase
    public BinDao binDao() {
        BinDao binDao;
        if (this._binDao != null) {
            return this._binDao;
        }
        synchronized (this) {
            try {
                if (this._binDao == null) {
                    this._binDao = new BinDao_Impl(this);
                }
                binDao = this._binDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return binDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `bin`");
            writableDatabase.execSQL("DELETE FROM `transactions`");
            writableDatabase.execSQL("DELETE FROM `merchant`");
            writableDatabase.execSQL("DELETE FROM `merchant_slot`");
            writableDatabase.execSQL("DELETE FROM `connected_device`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase
    public ConnectedDeviceDao connectedDeviceDao() {
        ConnectedDeviceDao connectedDeviceDao;
        if (this._connectedDeviceDao != null) {
            return this._connectedDeviceDao;
        }
        synchronized (this) {
            try {
                if (this._connectedDeviceDao == null) {
                    this._connectedDeviceDao = new ConnectedDeviceDao_Impl(this);
                }
                connectedDeviceDao = this._connectedDeviceDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return connectedDeviceDao;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "bin", "transactions", "merchant", "merchant_slot", "connected_device");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(1) { // from class: mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `bin` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `idBin` INTEGER NOT NULL, `bin` TEXT NOT NULL, `allows6DigitMasking` INTEGER NOT NULL, `allows8DigitMasking` INTEGER NOT NULL, `bank` TEXT, `bankCode` TEXT, `bankId` TEXT, `bankName` TEXT, `bbvaWallet` INTEGER NOT NULL, `brand` TEXT NOT NULL, `category` TEXT, `level` TEXT, `pointsType` TEXT, `product` TEXT, `provider` TEXT, `type` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`idTransaction` TEXT NOT NULL, `transactionData` TEXT NOT NULL, `tc` TEXT NOT NULL, `tcDataSent` INTEGER NOT NULL, PRIMARY KEY(`idTransaction`))");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `merchant` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `slotKey` INTEGER NOT NULL, `merchantName` TEXT NOT NULL, `keyName` TEXT NOT NULL, `renewKey` INTEGER NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `merchant_slot` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `keyInjected` INTEGER NOT NULL, `renewKey` INTEGER NOT NULL, `slotKey` INTEGER NOT NULL, `terminalSerialId` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `connected_device` (`serial` TEXT NOT NULL, `firmwareVersion` TEXT NOT NULL, `batteryCheck` TEXT NOT NULL, `codResponse` INTEGER NOT NULL, `command` TEXT NOT NULL, `model` TEXT NOT NULL, `message` TEXT NOT NULL, `status` TEXT NOT NULL, `slotKey` TEXT NOT NULL, `slotKeyName` TEXT NOT NULL, `keyInjectedDate` TEXT NOT NULL, PRIMARY KEY(`serial`))");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd44198d40fe442a6787c9eed3748a99b')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `bin`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `transactions`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `merchant`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `merchant_slot`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `connected_device`");
                if (((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.get(i10)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.get(i10)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mDatabase = supportSQLiteDatabase;
                OpenPaySDKDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks != null) {
                    int size = ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((RoomDatabase.Callback) ((RoomDatabase) OpenPaySDKDataBase_Impl.this).mCallbacks.get(i10)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap map = new HashMap(17);
                map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map.put("idBin", new TableInfo.Column("idBin", "INTEGER", true, 0, null, 1));
                map.put("bin", new TableInfo.Column("bin", "TEXT", true, 0, null, 1));
                map.put("allows6DigitMasking", new TableInfo.Column("allows6DigitMasking", "INTEGER", true, 0, null, 1));
                map.put("allows8DigitMasking", new TableInfo.Column("allows8DigitMasking", "INTEGER", true, 0, null, 1));
                map.put("bank", new TableInfo.Column("bank", "TEXT", false, 0, null, 1));
                map.put("bankCode", new TableInfo.Column("bankCode", "TEXT", false, 0, null, 1));
                map.put("bankId", new TableInfo.Column("bankId", "TEXT", false, 0, null, 1));
                map.put("bankName", new TableInfo.Column("bankName", "TEXT", false, 0, null, 1));
                map.put("bbvaWallet", new TableInfo.Column("bbvaWallet", "INTEGER", true, 0, null, 1));
                map.put("brand", new TableInfo.Column("brand", "TEXT", true, 0, null, 1));
                map.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, 1));
                map.put("level", new TableInfo.Column("level", "TEXT", false, 0, null, 1));
                map.put("pointsType", new TableInfo.Column("pointsType", "TEXT", false, 0, null, 1));
                map.put("product", new TableInfo.Column("product", "TEXT", false, 0, null, 1));
                map.put("provider", new TableInfo.Column("provider", "TEXT", false, 0, null, 1));
                map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("bin", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "bin");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "bin(mx.openpay.library.data.datasource.local.database.entity.BinEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(4);
                map2.put("idTransaction", new TableInfo.Column("idTransaction", "TEXT", true, 1, null, 1));
                map2.put("transactionData", new TableInfo.Column("transactionData", "TEXT", true, 0, null, 1));
                map2.put("tc", new TableInfo.Column("tc", "TEXT", true, 0, null, 1));
                map2.put("tcDataSent", new TableInfo.Column("tcDataSent", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("transactions", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "transactions");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, "transactions(mx.openpay.library.data.datasource.local.database.entity.TransactionEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(5);
                map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map3.put("slotKey", new TableInfo.Column("slotKey", "INTEGER", true, 0, null, 1));
                map3.put("merchantName", new TableInfo.Column("merchantName", "TEXT", true, 0, null, 1));
                map3.put("keyName", new TableInfo.Column("keyName", "TEXT", true, 0, null, 1));
                map3.put("renewKey", new TableInfo.Column("renewKey", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("merchant", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "merchant");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenHelper.ValidationResult(false, "merchant(mx.openpay.library.data.datasource.local.database.entity.MerchantEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(5);
                map4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map4.put("keyInjected", new TableInfo.Column("keyInjected", "INTEGER", true, 0, null, 1));
                map4.put("renewKey", new TableInfo.Column("renewKey", "INTEGER", true, 0, null, 1));
                map4.put("slotKey", new TableInfo.Column("slotKey", "INTEGER", true, 0, null, 1));
                map4.put("terminalSerialId", new TableInfo.Column("terminalSerialId", "TEXT", true, 0, null, 1));
                TableInfo tableInfo7 = new TableInfo("merchant_slot", map4, new HashSet(0), new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "merchant_slot");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenHelper.ValidationResult(false, "merchant_slot(mx.openpay.library.data.datasource.local.database.entity.MerchantSlotEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(11);
                map5.put("serial", new TableInfo.Column("serial", "TEXT", true, 1, null, 1));
                map5.put("firmwareVersion", new TableInfo.Column("firmwareVersion", "TEXT", true, 0, null, 1));
                map5.put("batteryCheck", new TableInfo.Column("batteryCheck", "TEXT", true, 0, null, 1));
                map5.put("codResponse", new TableInfo.Column("codResponse", "INTEGER", true, 0, null, 1));
                map5.put(IMAPStore.ID_COMMAND, new TableInfo.Column(IMAPStore.ID_COMMAND, "TEXT", true, 0, null, 1));
                map5.put("model", new TableInfo.Column("model", "TEXT", true, 0, null, 1));
                map5.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, 1));
                map5.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
                map5.put("slotKey", new TableInfo.Column("slotKey", "TEXT", true, 0, null, 1));
                map5.put("slotKeyName", new TableInfo.Column("slotKeyName", "TEXT", true, 0, null, 1));
                map5.put("keyInjectedDate", new TableInfo.Column("keyInjectedDate", "TEXT", true, 0, null, 1));
                TableInfo tableInfo9 = new TableInfo("connected_device", map5, new HashSet(0), new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "connected_device");
                if (tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenHelper.ValidationResult(true, null);
                }
                return new RoomOpenHelper.ValidationResult(false, "connected_device(mx.openpay.library.data.datasource.local.database.entity.ConnectedDeviceEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }
        }, "d44198d40fe442a6787c9eed3748a99b", "3e9620a923939a4116ecdb3c47e70393")).build());
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(BinDao.class, BinDao_Impl.getRequiredConverters());
        map.put(TransactionDao.class, TransactionDao_Impl.getRequiredConverters());
        map.put(MerchantDao.class, MerchantDao_Impl.getRequiredConverters());
        map.put(MerchantSlotDao.class, MerchantSlotDao_Impl.getRequiredConverters());
        map.put(ConnectedDeviceDao.class, ConnectedDeviceDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase
    public MerchantDao merchantDao() {
        MerchantDao merchantDao;
        if (this._merchantDao != null) {
            return this._merchantDao;
        }
        synchronized (this) {
            try {
                if (this._merchantDao == null) {
                    this._merchantDao = new MerchantDao_Impl(this);
                }
                merchantDao = this._merchantDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return merchantDao;
    }

    @Override // mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase
    public MerchantSlotDao merchantSlotDao() {
        MerchantSlotDao merchantSlotDao;
        if (this._merchantSlotDao != null) {
            return this._merchantSlotDao;
        }
        synchronized (this) {
            try {
                if (this._merchantSlotDao == null) {
                    this._merchantSlotDao = new MerchantSlotDao_Impl(this);
                }
                merchantSlotDao = this._merchantSlotDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return merchantSlotDao;
    }

    @Override // mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase
    public TransactionDao transactionDao() {
        TransactionDao transactionDao;
        if (this._transactionDao != null) {
            return this._transactionDao;
        }
        synchronized (this) {
            try {
                if (this._transactionDao == null) {
                    this._transactionDao = new TransactionDao_Impl(this);
                }
                transactionDao = this._transactionDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return transactionDao;
    }
}
