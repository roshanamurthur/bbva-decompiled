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
import mx.openpay.library.data.datasource.local.database.entity.BinEntity;

/* JADX INFO: loaded from: classes12.dex */
public final class BinDao_Impl implements BinDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<BinEntity> __insertionAdapterOfBinEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public BinDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfBinEntity = new EntityInsertionAdapter<BinEntity>(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.BinDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `bin` (`id`,`idBin`,`bin`,`allows6DigitMasking`,`allows8DigitMasking`,`bank`,`bankCode`,`bankId`,`bankName`,`bbvaWallet`,`brand`,`category`,`level`,`pointsType`,`product`,`provider`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, BinEntity binEntity) {
                supportSQLiteStatement.bindLong(1, binEntity.getId());
                supportSQLiteStatement.bindLong(2, binEntity.getIdBin());
                if (binEntity.getBin() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, binEntity.getBin());
                }
                supportSQLiteStatement.bindLong(4, binEntity.getAllows6DigitMasking() ? 1L : 0L);
                supportSQLiteStatement.bindLong(5, binEntity.getAllows8DigitMasking() ? 1L : 0L);
                if (binEntity.getBank() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, binEntity.getBank());
                }
                if (binEntity.getBankCode() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, binEntity.getBankCode());
                }
                if (binEntity.getBankId() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, binEntity.getBankId());
                }
                if (binEntity.getBankName() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, binEntity.getBankName());
                }
                supportSQLiteStatement.bindLong(10, binEntity.getBbvaWallet() ? 1L : 0L);
                if (binEntity.getBrand() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, binEntity.getBrand());
                }
                if (binEntity.getCategory() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, binEntity.getCategory());
                }
                if (binEntity.getLevel() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, binEntity.getLevel());
                }
                if (binEntity.getPointsType() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, binEntity.getPointsType());
                }
                if (binEntity.getProduct() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, binEntity.getProduct());
                }
                if (binEntity.getProvider() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, binEntity.getProvider());
                }
                if (binEntity.getType() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, binEntity.getType());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.BinDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM bin";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.BinDao
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

    @Override // mx.openpay.library.data.datasource.local.database.dao.BinDao
    public int getCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM bin", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.BinDao
    public long insertBin(BinEntity binEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfBinEntity.insertAndReturnId(binEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.BinDao
    public int validateIfBinIsBbvaPoints(String str, String str2, String str3) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) FROM bin WHERE bin=? and ( (bankCode=? and pointsType=?) or (bankId = 12 and type IN ('CREDIT', 'credit')) )", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        if (str2 == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, str2);
        }
        if (str3 == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, str3);
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
}
