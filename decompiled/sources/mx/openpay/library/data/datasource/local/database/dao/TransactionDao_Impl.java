package mx.openpay.library.data.datasource.local.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import mx.openpay.library.data.datasource.local.database.entity.TransactionEntity;

/* JADX INFO: loaded from: classes12.dex */
public final class TransactionDao_Impl implements TransactionDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<TransactionEntity> __insertionAdapterOfTransactionEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfUpdateLocalTerminalCapacityDataSent;
    private final SharedSQLiteStatement __preparedStmtOfUpdateTerminalCapacityData;
    private final SharedSQLiteStatement __preparedStmtOfUpdateTransaction;

    public TransactionDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTransactionEntity = new EntityInsertionAdapter<TransactionEntity>(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `transactions` (`idTransaction`,`transactionData`,`tc`,`tcDataSent`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, TransactionEntity transactionEntity) {
                if (transactionEntity.getIdTransaction() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, transactionEntity.getIdTransaction());
                }
                if (transactionEntity.getTransactionData() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, transactionEntity.getTransactionData());
                }
                if (transactionEntity.getTc() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, transactionEntity.getTc());
                }
                supportSQLiteStatement.bindLong(4, transactionEntity.getTcDataSent() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM transactions";
            }
        };
        this.__preparedStmtOfUpdateLocalTerminalCapacityDataSent = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE transactions SET tcDataSent = 1";
            }
        };
        this.__preparedStmtOfUpdateTerminalCapacityData = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE transactions SET tc =?";
            }
        };
        this.__preparedStmtOfUpdateTransaction = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.TransactionDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE transactions SET transactionData =? WHERE idTransaction=?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public int deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public TransactionEntity getLocalTransaction() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM transactions", 0);
        this.__db.assertNotSuspendingTransaction();
        TransactionEntity transactionEntity = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "idTransaction");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "transactionData");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tc");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "tcDataSent");
            if (cursorQuery.moveToFirst()) {
                String string2 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                String string3 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                    string = cursorQuery.getString(columnIndexOrThrow3);
                }
                transactionEntity = new TransactionEntity(string2, string3, string, cursorQuery.getInt(columnIndexOrThrow4) != 0);
            }
            return transactionEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public long insertTransaction(TransactionEntity transactionEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfTransactionEntity.insertAndReturnId(transactionEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public void updateLocalTerminalCapacityDataSent() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateLocalTerminalCapacityDataSent.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateLocalTerminalCapacityDataSent.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public void updateTerminalCapacityData(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateTerminalCapacityData.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateTerminalCapacityData.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.TransactionDao
    public void updateTransaction(String str, String str2) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfUpdateTransaction.acquire();
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
            this.__preparedStmtOfUpdateTransaction.release(supportSQLiteStatementAcquire);
        }
    }
}
