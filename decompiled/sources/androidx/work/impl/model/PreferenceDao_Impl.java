package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceDao_Impl implements PreferenceDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24553b;

    public class a extends EntityInsertionAdapter<Preference> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(SupportSQLiteStatement supportSQLiteStatement, Preference preference) {
            Preference preference2 = preference;
            String str = preference2.mKey;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            Long l6 = preference2.mValue;
            if (l6 == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindLong(2, l6.longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public class b implements Callable<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24554p0;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24554p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(PreferenceDao_Impl.this.f24552a, this.f24554p0, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public final void finalize() {
            this.f24554p0.release();
        }
    }

    public PreferenceDao_Impl(RoomDatabase roomDatabase) {
        this.f24552a = roomDatabase;
        this.f24553b = new a(roomDatabase);
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24552a;
        roomDatabase.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                lValueOf = Long.valueOf(cursorQuery.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public LiveData<Long> getObservableLongValue(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.f24552a.getInvalidationTracker().createLiveData(new String[]{"Preference"}, false, new b(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(Preference preference) {
        RoomDatabase roomDatabase = this.f24552a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f24553b.insert(preference);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
