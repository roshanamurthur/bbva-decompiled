package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB7\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "", "enabled", "", "setWriteAheadLoggingEnabled", HearingDisabilitiesConstants.CLOSE_MODAL, "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Landroid/content/Context;", "context", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "callback", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "Companion", "a", "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f23501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final String f23502q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.Callback f23503r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f23504s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f23505t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy<OpenHelper> f23506u0;
    public boolean v0;

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class OpenHelper extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        @NotNull
        public static final Companion f23507w0 = new Companion(null);

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Context f23508p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final a f23509q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final SupportSQLiteOpenHelper.Callback f23510r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f23511s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f23512t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @NotNull
        public final ProcessLock f23513u0;
        public boolean v0;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
        public static final class CallbackName {
            private static final /* synthetic */ CallbackName[] $VALUES;
            public static final CallbackName ON_CONFIGURE;
            public static final CallbackName ON_CREATE;
            public static final CallbackName ON_DOWNGRADE;
            public static final CallbackName ON_OPEN;
            public static final CallbackName ON_UPGRADE;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                ON_CONFIGURE = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                ON_CREATE = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                ON_UPGRADE = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                ON_DOWNGRADE = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                ON_OPEN = callbackName5;
                $VALUES = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public CallbackName() {
                throw null;
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) $VALUES.clone();
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$a;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "getWrappedDb", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FrameworkSQLiteDatabase getWrappedDb(@NotNull a refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f23516a;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.isDelegate(sqLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.f23516a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
        public static final class a extends RuntimeException {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public final CallbackName f23514p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            @NotNull
            public final Throwable f23515q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull CallbackName callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f23514p0 = callbackName;
                this.f23515q0 = cause;
            }

            @Override // java.lang.Throwable
            @NotNull
            public final Throwable getCause() {
                return this.f23515q0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(@NotNull Context context, @Nullable String str, @NotNull final a dbRef, @NotNull final SupportSQLiteOpenHelper.Callback callback, boolean z10) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: f3.c
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    SupportSQLiteOpenHelper.Callback callback2 = callback;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    FrameworkSQLiteOpenHelper.a dbRef2 = dbRef;
                    Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                    Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                    callback2.onCorruption(FrameworkSQLiteOpenHelper.OpenHelper.f23507w0.getWrappedDb(dbRef2, dbObj));
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f23508p0 = context;
            this.f23509q0 = dbRef;
            this.f23510r0 = callback;
            this.f23511s0 = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.f23513u0 = new ProcessLock(str, context.getCacheDir(), false);
        }

        @NotNull
        public final SupportSQLiteDatabase a(boolean z10) {
            ProcessLock processLock = this.f23513u0;
            try {
                processLock.lock((this.v0 || getDatabaseName() == null) ? false : true);
                this.f23512t0 = false;
                SQLiteDatabase sQLiteDatabaseD = d(z10);
                if (!this.f23512t0) {
                    return b(sQLiteDatabaseD);
                }
                close();
                return a(z10);
            } finally {
                processLock.unlock();
            }
        }

        @NotNull
        public final FrameworkSQLiteDatabase b(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f23507w0.getWrappedDb(this.f23509q0, sqLiteDatabase);
        }

        public final SQLiteDatabase c(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.f23513u0;
            try {
                ProcessLock.lock$default(processLock, false, 1, null);
                super.close();
                this.f23509q0.f23516a = null;
                this.v0 = false;
            } finally {
                processLock.unlock();
            }
        }

        public final SQLiteDatabase d(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.v0;
            Context context = this.f23508p0;
            if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return c(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return c(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.f23514p0.ordinal()];
                        Throwable th3 = aVar.f23515q0;
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(th3 instanceof SQLiteException)) {
                            throw th3;
                        }
                    } else if (!(th2 instanceof SQLiteException) || databaseName == null || !this.f23511s0) {
                        throw th2;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return c(z10);
                    } catch (a e5) {
                        throw e5.f23515q0;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            boolean z10 = this.f23512t0;
            SupportSQLiteOpenHelper.Callback callback = this.f23510r0;
            if (!z10 && callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                callback.onConfigure(b(db2));
            } catch (Throwable th2) {
                throw new a(CallbackName.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f23510r0.onCreate(b(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(CallbackName.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(@NotNull SQLiteDatabase db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f23512t0 = true;
            try {
                this.f23510r0.onDowngrade(b(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(CallbackName.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f23512t0) {
                try {
                    this.f23510r0.onOpen(b(db2));
                } catch (Throwable th2) {
                    throw new a(CallbackName.ON_OPEN, th2);
                }
            }
            this.v0 = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f23512t0 = true;
            try {
                this.f23510r0.onUpgrade(b(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(CallbackName.ON_UPGRADE, th2);
            }
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public FrameworkSQLiteDatabase f23516a = null;
    }

    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.kt */
    public static final class b extends Lambda implements Function0<OpenHelper> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenHelper invoke() {
            OpenHelper openHelper;
            FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = FrameworkSQLiteOpenHelper.this;
            if (frameworkSQLiteOpenHelper.f23502q0 == null || !frameworkSQLiteOpenHelper.f23504s0) {
                openHelper = new OpenHelper(frameworkSQLiteOpenHelper.f23501p0, frameworkSQLiteOpenHelper.f23502q0, new a(), frameworkSQLiteOpenHelper.f23503r0, frameworkSQLiteOpenHelper.f23505t0);
            } else {
                openHelper = new OpenHelper(frameworkSQLiteOpenHelper.f23501p0, new File(SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(frameworkSQLiteOpenHelper.f23501p0), frameworkSQLiteOpenHelper.f23502q0).getAbsolutePath(), new a(), frameworkSQLiteOpenHelper.f23503r0, frameworkSQLiteOpenHelper.f23505t0);
            }
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, frameworkSQLiteOpenHelper.v0);
            return openHelper;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Lazy<OpenHelper> lazy = this.f23506u0;
        if (lazy.isInitialized()) {
            lazy.getValue().close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public String getF23502q0() {
        return this.f23502q0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        return this.f23506u0.getValue().a(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.f23506u0.getValue().a(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        Lazy<OpenHelper> lazy = this.f23506u0;
        if (lazy.isInitialized()) {
            SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(lazy.getValue(), enabled);
        }
        this.v0 = enabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback, boolean z10) {
        this(context, str, callback, z10, false, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Callback callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f23501p0 = context;
        this.f23502q0 = str;
        this.f23503r0 = callback;
        this.f23504s0 = z10;
        this.f23505t0 = z11;
        this.f23506u0 = LazyKt__LazyJVMKt.lazy(new b());
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, callback, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
