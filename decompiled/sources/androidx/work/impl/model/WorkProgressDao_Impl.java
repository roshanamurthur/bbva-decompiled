package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24567d;

    public class a extends EntityInsertionAdapter<WorkProgress> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(SupportSQLiteStatement supportSQLiteStatement, WorkProgress workProgress) throws Throwable {
            WorkProgress workProgress2 = workProgress;
            String str = workProgress2.mWorkSpecId;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            byte[] byteArrayInternal = Data.toByteArrayInternal(workProgress2.mProgress);
            if (byteArrayInternal == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindBlob(2, byteArrayInternal);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    public class b extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        this.f24564a = roomDatabase;
        this.f24565b = new a(roomDatabase);
        this.f24566c = new b(roomDatabase);
        this.f24567d = new c(roomDatabase);
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(String str) {
        RoomDatabase roomDatabase = this.f24564a;
        roomDatabase.assertNotSuspendingTransaction();
        b bVar = this.f24566c;
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        RoomDatabase roomDatabase = this.f24564a;
        roomDatabase.assertNotSuspendingTransaction();
        c cVar = this.f24567d;
        SupportSQLiteStatement supportSQLiteStatementAcquire = cVar.acquire();
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            cVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24564a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? Data.fromByteArray(cursorQuery.getBlob(0)) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public List<Data> getProgressForWorkSpecIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i10);
            } else {
                roomSQLiteQueryAcquire.bindString(i10, str);
            }
            i10++;
        }
        RoomDatabase roomDatabase = this.f24564a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
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

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(WorkProgress workProgress) {
        RoomDatabase roomDatabase = this.f24564a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f24565b.insert(workProgress);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
