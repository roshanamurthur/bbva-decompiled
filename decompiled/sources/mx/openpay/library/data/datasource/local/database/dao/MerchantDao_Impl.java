package mx.openpay.library.data.datasource.local.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import mx.openpay.library.data.datasource.local.database.entity.MerchantEntity;

/* JADX INFO: loaded from: classes12.dex */
public final class MerchantDao_Impl implements MerchantDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<MerchantEntity> __insertionAdapterOfMerchantEntity;

    public MerchantDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfMerchantEntity = new EntityInsertionAdapter<MerchantEntity>(this, roomDatabase) { // from class: mx.openpay.library.data.datasource.local.database.dao.MerchantDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `merchant` (`id`,`slotKey`,`merchantName`,`keyName`,`renewKey`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, MerchantEntity merchantEntity) {
                supportSQLiteStatement.bindLong(1, merchantEntity.getId());
                supportSQLiteStatement.bindLong(2, merchantEntity.getSlotKey());
                if (merchantEntity.getMerchantName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, merchantEntity.getMerchantName());
                }
                if (merchantEntity.getKeyName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, merchantEntity.getKeyName());
                }
                supportSQLiteStatement.bindLong(5, merchantEntity.getRenewKey());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantDao
    public String getMerchantKeyNameBySlot(int i10) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT keyName FROM merchant WHERE slotKey=?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i10);
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

    @Override // mx.openpay.library.data.datasource.local.database.dao.MerchantDao
    public long insertMerchant(MerchantEntity merchantEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfMerchantEntity.insertAndReturnId(merchantEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }
}
