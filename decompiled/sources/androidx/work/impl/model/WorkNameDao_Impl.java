package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkNameDao_Impl implements WorkNameDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24563b;

    public class a extends EntityInsertionAdapter<WorkName> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(SupportSQLiteStatement supportSQLiteStatement, WorkName workName) {
            WorkName workName2 = workName;
            String str = workName2.name;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            String str2 = workName2.workSpecId;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, str2);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.f24562a = roomDatabase;
        this.f24563b = new a(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getNamesForWorkSpecId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24562a;
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

    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getWorkSpecIdsWithName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24562a;
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

    @Override // androidx.work.impl.model.WorkNameDao
    public void insert(WorkName workName) {
        RoomDatabase roomDatabase = this.f24562a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f24563b.insert(workName);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
