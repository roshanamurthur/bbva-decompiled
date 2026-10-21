package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatabaseConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0015¢\u0006\u0004\b8\u00109Bk\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106¢\u0006\u0004\b8\u0010:B\u0083\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106¢\u0006\u0004\b8\u0010;B\u0097\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b8\u0010<B§\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+¢\u0006\u0004\b8\u0010=B±\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b8\u0010>B¿\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b8\u0010?BÍ\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010'\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0015¢\u0006\u0004\b8\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0016\u0010'\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u000eR\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u0014\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001a¨\u0006A"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "", "version", "", "isMigrationRequiredFrom", "fromVersion", "toVersion", "isMigrationRequired", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "name", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqliteOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "Ljava/util/List;", "allowMainThreadQueries", "Z", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "Ljava/util/concurrent/Executor;", "queryExecutor", "Ljava/util/concurrent/Executor;", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "Landroid/content/Intent;", "requireMigration", "allowDestructiveMigrationOnDowngrade", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "typeConverters", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "multiInstanceInvalidation", "", "migrationNotRequiredFrom", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public class DatabaseConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Set<Integer> f23196a;

    @JvmField
    public final boolean allowDestructiveMigrationOnDowngrade;

    @JvmField
    public final boolean allowMainThreadQueries;

    @JvmField
    @NotNull
    public final List<AutoMigrationSpec> autoMigrationSpecs;

    @JvmField
    @Nullable
    public final List<RoomDatabase.Callback> callbacks;

    @JvmField
    @NotNull
    public final Context context;

    @JvmField
    @Nullable
    public final String copyFromAssetPath;

    @JvmField
    @Nullable
    public final File copyFromFile;

    @JvmField
    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    @JvmField
    @NotNull
    public final RoomDatabase.JournalMode journalMode;

    @JvmField
    @NotNull
    public final RoomDatabase.MigrationContainer migrationContainer;

    @JvmField
    public final boolean multiInstanceInvalidation;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent multiInstanceInvalidationServiceIntent;

    @JvmField
    @Nullable
    public final String name;

    @JvmField
    @Nullable
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

    @JvmField
    @NotNull
    public final Executor queryExecutor;

    @JvmField
    public final boolean requireMigration;

    @JvmField
    @NotNull
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    @JvmField
    @NotNull
    public final Executor transactionExecutor;

    @JvmField
    @NotNull
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.f23196a = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int fromVersion, int toVersion) {
        if ((fromVersion > toVersion && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.f23196a;
        return set == null || !set.contains(Integer.valueOf(fromVersion));
    }

    @Deprecated(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @ReplaceWith(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int version) {
        return isMigrationRequired(version, version + 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, boolean z11, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, (Intent) null, z11, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt__CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt__CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt__CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) CollectionsKt__CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, (List<? extends Object>) CollectionsKt__CollectionsKt.emptyList(), (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, (List<? extends AutoMigrationSpec>) CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated.", replaceWith = @ReplaceWith(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
