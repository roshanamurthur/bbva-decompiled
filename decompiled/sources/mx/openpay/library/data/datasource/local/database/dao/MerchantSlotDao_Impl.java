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
import mx.openpay.library.data.datasource.local.database.entity.MerchantSlotEntity;

/* JADX INFO: loaded from: classes12.dex */
public final class MerchantSlotDao_Impl implements MerchantSlotDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<MerchantSlotEntity> __insertionAdapterOfMerchantSlotEntity;
    private final SharedSQLiteStatement __preparedStmtOfUpdateMerchantSlotKeyInjectedBySlot;
    private final SharedSQLiteStatement __preparedStmtOfUpdateRenewKeyBySlotAndTerminal;

    public MerchantSlotDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMerchantSlotEntity = new EntityInsertionAdapter<MerchantSlotEntity>(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `merchant_slot` (`id`,`keyInjected`,`renewKey`,`slotKey`,`terminalSerialId`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, MerchantSlotEntity merchantSlotEntity) {
                supportSQLiteStatement.bindLong(1, merchantSlotEntity.getId());
                supportSQLiteStatement.bindLong(2, merchantSlotEntity.getKeyInjected());
                supportSQLiteStatement.bindLong(3, merchantSlotEntity.getRenewKey());
                supportSQLiteStatement.bindLong(4, merchantSlotEntity.getSlotKey());
                if (merchantSlotEntity.getTerminalSerialId() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, merchantSlotEntity.getTerminalSerialId());
                }
            }
        };
        this.__preparedStmtOfUpdateRenewKeyBySlotAndTerminal = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE merchant_slot SET renewKey =? WHERE slotKey=? and terminalSerialId=?";
            }
        };
        this.__preparedStmtOfUpdateMerchantSlotKeyInjectedBySlot = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE merchant_slot SET keyInjected =? WHERE slotKey=? and terminalSerialId=?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public int getCountSlotInfoBySlotKeyAndSerialId(int i10, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM merchant_slot WHERE slotKey=? and terminalSerialId=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, i10);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public int getRenewKeyBySlotAndTerminal(int i10, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT renewKey FROM merchant_slot WHERE slotKey=? and terminalSerialId=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, i10);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public long insertMerchantSlot(MerchantSlotEntity merchantSlotEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfMerchantSlotEntity.insertAndReturnId(merchantSlotEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public boolean isMerchantSlotKeyValidated(String str, int i10) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT keyInjected FROM merchant_slot WHERE slotKey=? and terminalSerialId=?", 2);
        roomSQLiteQueryAcquire.bindLong(1, i10);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str);
        }
        this.__db.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                z10 = cursorQuery.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public void updateMerchantSlotKeyInjectedBySlot(int i10, String str, int i11) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateMerchantSlotKeyInjectedBySlot.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i11);
        supportSQLiteStatementAcquire.bindLong(2, i10);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindString(3, str);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateMerchantSlotKeyInjectedBySlot.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao
    public void updateRenewKeyBySlotAndTerminal(int i10, int i11, String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateRenewKeyBySlotAndTerminal.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i10);
        supportSQLiteStatementAcquire.bindLong(2, i11);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindString(3, str);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateRenewKeyBySlotAndTerminal.release(supportSQLiteStatementAcquire);
        }
    }
}
