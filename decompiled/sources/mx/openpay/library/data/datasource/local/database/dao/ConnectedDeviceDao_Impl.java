package mx.openpay.library.data.datasource.local.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import mx.openpay.library.data.datasource.local.database.entity.ConnectedDeviceEntity;

/* JADX INFO: loaded from: classes12.dex */
public final class ConnectedDeviceDao_Impl implements ConnectedDeviceDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ConnectedDeviceEntity> __insertionAdapterOfConnectedDeviceEntity;
    private final SharedSQLiteStatement __preparedStmtOfUpdateKeyInjectedDateBySerial;

    public ConnectedDeviceDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfConnectedDeviceEntity = new EntityInsertionAdapter<ConnectedDeviceEntity>(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `connected_device` (`serial`,`firmwareVersion`,`batteryCheck`,`codResponse`,`command`,`model`,`message`,`status`,`slotKey`,`slotKeyName`,`keyInjectedDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ConnectedDeviceEntity connectedDeviceEntity) {
                if (connectedDeviceEntity.getSerial() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, connectedDeviceEntity.getSerial());
                }
                if (connectedDeviceEntity.getFirmwareVersion() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, connectedDeviceEntity.getFirmwareVersion());
                }
                if (connectedDeviceEntity.getBatteryCheck() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, connectedDeviceEntity.getBatteryCheck());
                }
                supportSQLiteStatement.bindLong(4, connectedDeviceEntity.getCodResponse());
                if (connectedDeviceEntity.getCommand() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, connectedDeviceEntity.getCommand());
                }
                if (connectedDeviceEntity.getModel() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, connectedDeviceEntity.getModel());
                }
                if (connectedDeviceEntity.getMessage() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, connectedDeviceEntity.getMessage());
                }
                if (connectedDeviceEntity.getStatus() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, connectedDeviceEntity.getStatus());
                }
                if (connectedDeviceEntity.getSlotKey() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, connectedDeviceEntity.getSlotKey());
                }
                if (connectedDeviceEntity.getSlotKeyName() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, connectedDeviceEntity.getSlotKeyName());
                }
                if (connectedDeviceEntity.getKeyInjectedDate() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, connectedDeviceEntity.getKeyInjectedDate());
                }
            }
        };
        this.__preparedStmtOfUpdateKeyInjectedDateBySerial = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE connected_device SET keyInjectedDate =? WHERE serial=?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao
    public String getKeyInjectedDateBySerial(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT keyInjectedDate FROM connected_device WHERE serial=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                string = cursorQuery.getString(0);
            }
            return string;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao
    public long insertConnectedDevice(ConnectedDeviceEntity connectedDeviceEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfConnectedDeviceEntity.insertAndReturnId(connectedDeviceEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao
    public void updateKeyInjectedDateBySerial(String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateKeyInjectedDateBySerial.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        if (str2 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str2);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateKeyInjectedDateBySerial.release(supportSQLiteStatementAcquire);
        }
    }
}
