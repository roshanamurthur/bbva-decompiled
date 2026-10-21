package n3;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: WorkDatabase.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends RoomDatabase.Callback {
    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        super.onOpen(supportSQLiteDatabase);
        supportSQLiteDatabase.beginTransaction();
        try {
            int i10 = WorkDatabase.f24377b;
            supportSQLiteDatabase.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f24376a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            supportSQLiteDatabase.setTransactionSuccessful();
        } finally {
            supportSQLiteDatabase.endTransaction();
        }
    }
}
