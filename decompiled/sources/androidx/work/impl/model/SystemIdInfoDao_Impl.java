package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24561c;

    public class a extends EntityInsertionAdapter<SystemIdInfo> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(SupportSQLiteStatement supportSQLiteStatement, SystemIdInfo systemIdInfo) {
            SystemIdInfo systemIdInfo2 = systemIdInfo;
            String str = systemIdInfo2.workSpecId;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, systemIdInfo2.systemId);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f24559a = roomDatabase;
        this.f24560b = new a(roomDatabase);
        this.f24561c = new b(roomDatabase);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24559a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? new SystemIdInfo(cursorQuery.getString(CursorUtil.getColumnIndexOrThrow(cursorQuery, "work_spec_id")), cursorQuery.getInt(CursorUtil.getColumnIndexOrThrow(cursorQuery, "system_id"))) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        RoomDatabase roomDatabase = this.f24559a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
        RoomDatabase roomDatabase = this.f24559a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f24560b.insert(systemIdInfo);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        RoomDatabase roomDatabase = this.f24559a;
        roomDatabase.assertNotSuspendingTransaction();
        b bVar = this.f24561c;
        SupportSQLiteStatement supportSQLiteStatementAcquire = bVar.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            bVar.release(supportSQLiteStatementAcquire);
        }
    }
}
