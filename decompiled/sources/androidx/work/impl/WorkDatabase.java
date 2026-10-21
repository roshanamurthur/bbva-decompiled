package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.Data;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@TypeConverters({Data.class, WorkTypeConverters.class})
@Database(entities = {Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f24376a = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24377b = 0;

    public class a implements SupportSQLiteOpenHelper.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24378a;

        public a(Context context) {
            this.f24378a = context;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
        @NonNull
        public final SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
            SupportSQLiteOpenHelper.Configuration.Builder builder = SupportSQLiteOpenHelper.Configuration.builder(this.f24378a);
            builder.name(configuration.name).callback(configuration.callback).noBackupDirectory(true);
            return new FrameworkSQLiteOpenHelperFactory().create(builder.build());
        }
    }

    @NonNull
    public static WorkDatabase create(@NonNull Context context, @NonNull Executor executor, boolean z10) {
        RoomDatabase.Builder builderDatabaseBuilder;
        if (z10) {
            builderDatabaseBuilder = Room.inMemoryDatabaseBuilder(context, WorkDatabase.class).allowMainThreadQueries();
        } else {
            builderDatabaseBuilder = Room.databaseBuilder(context, WorkDatabase.class, WorkDatabasePathHelper.getWorkDatabaseName());
            builderDatabaseBuilder.openHelperFactory(new a(context));
        }
        return (WorkDatabase) builderDatabaseBuilder.setQueryExecutor(executor).addCallback(new n3.a()).addMigrations(WorkDatabaseMigrations.MIGRATION_1_2).addMigrations(new WorkDatabaseMigrations.RescheduleMigration(context, 2, 3)).addMigrations(WorkDatabaseMigrations.MIGRATION_3_4).addMigrations(WorkDatabaseMigrations.MIGRATION_4_5).addMigrations(new WorkDatabaseMigrations.RescheduleMigration(context, 5, 6)).addMigrations(WorkDatabaseMigrations.MIGRATION_6_7).addMigrations(WorkDatabaseMigrations.MIGRATION_7_8).addMigrations(WorkDatabaseMigrations.MIGRATION_8_9).addMigrations(new WorkDatabaseMigrations.WorkMigration9To10(context)).addMigrations(new WorkDatabaseMigrations.RescheduleMigration(context, 10, 11)).addMigrations(WorkDatabaseMigrations.MIGRATION_11_12).fallbackToDestructiveMigration().build();
    }

    @NonNull
    public abstract DependencyDao dependencyDao();

    @NonNull
    public abstract PreferenceDao preferenceDao();

    @NonNull
    public abstract RawWorkInfoDao rawWorkInfoDao();

    @NonNull
    public abstract SystemIdInfoDao systemIdInfoDao();

    @NonNull
    public abstract WorkNameDao workNameDao();

    @NonNull
    public abstract WorkProgressDao workProgressDao();

    @NonNull
    public abstract WorkSpecDao workSpecDao();

    @NonNull
    public abstract WorkTagDao workTagDao();
}
