package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabaseMigrations;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PreferenceUtils {
    public static final String KEY_LAST_CANCEL_ALL_TIME_MS = "last_cancel_all_time_ms";
    public static final String KEY_RESCHEDULE_NEEDED = "reschedule_needed";
    public static final String PREFERENCES_FILE_NAME = "androidx.work.util.preferences";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f24622a;

    public class a implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function
        public final Long apply(Long l6) {
            Long l7 = l6;
            return Long.valueOf(l7 != null ? l7.longValue() : 0L);
        }
    }

    public PreferenceUtils(@NonNull WorkDatabase workDatabase) {
        this.f24622a = workDatabase;
    }

    public static void migrateLegacyPreferences(@NonNull Context context, @NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_FILE_NAME, 0);
        if (sharedPreferences.contains(KEY_RESCHEDULE_NEEDED) || sharedPreferences.contains(KEY_LAST_CANCEL_ALL_TIME_MS)) {
            long j10 = sharedPreferences.getLong(KEY_LAST_CANCEL_ALL_TIME_MS, 0L);
            long j11 = sharedPreferences.getBoolean(KEY_RESCHEDULE_NEEDED, false) ? 1L : 0L;
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL(WorkDatabaseMigrations.INSERT_PREFERENCE, new Object[]{KEY_LAST_CANCEL_ALL_TIME_MS, Long.valueOf(j10)});
                supportSQLiteDatabase.execSQL(WorkDatabaseMigrations.INSERT_PREFERENCE, new Object[]{KEY_RESCHEDULE_NEEDED, Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }

    public long getLastCancelAllTimeMillis() {
        Long longValue = this.f24622a.preferenceDao().getLongValue(KEY_LAST_CANCEL_ALL_TIME_MS);
        if (longValue != null) {
            return longValue.longValue();
        }
        return 0L;
    }

    @NonNull
    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return Transformations.map(this.f24622a.preferenceDao().getObservableLongValue(KEY_LAST_CANCEL_ALL_TIME_MS), new a());
    }

    public boolean getNeedsReschedule() {
        Long longValue = this.f24622a.preferenceDao().getLongValue(KEY_RESCHEDULE_NEEDED);
        return longValue != null && longValue.longValue() == 1;
    }

    public void setLastCancelAllTimeMillis(long j10) {
        this.f24622a.preferenceDao().insertPreference(new Preference(KEY_LAST_CANCEL_ALL_TIME_MS, j10));
    }

    public void setNeedsReschedule(boolean z10) {
        this.f24622a.preferenceDao().insertPreference(new Preference(KEY_RESCHEDULE_NEEDED, z10));
    }
}
