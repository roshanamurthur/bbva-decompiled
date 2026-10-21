package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.g0;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteProgram;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0002]\\B\u000f\u0012\u0006\u0010Y\u001a\u00020:¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001eH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017J \u0010&\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016J5\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\"H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\"H\u0016J\u0010\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000fH\u0017J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u0006H\u0017J\b\u00109\u001a\u00020\u0006H\u0016J\u000e\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:R\u0014\u0010=\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010D\u001a\u00020\"2\u0006\u0010?\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010H\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\b\u0015\u0010GR\u0014\u0010I\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010>R$\u0010L\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010GR\u0014\u0010M\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010>R\u0014\u0010N\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010>R\u0016\u0010Q\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010>R(\u0010W\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020T\u0018\u00010S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010>¨\u0006^"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "numBytes", "setMaximumSize", "", "", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "newVersion", "needUpgrade", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "enabled", "setForeignKeyConstraintsEnabled", "enableWriteAheadLogging", "disableWriteAheadLogging", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "isDelegate", "isDbLockedByCurrentThread", "()Z", "value", "getVersion", "()I", "setVersion", "(I)V", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "isExecPerConnectionSQLSupported", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Companion", "Api30Impl", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final String[] f23497q0 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final String[] f23498r0 = new String[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SQLiteDatabase f23499p0;

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    @RequiresApi(30)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "()V", "execPerConnectionSQL", "", "sQLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "sql", "", "bindArgs", "", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api30Impl {

        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        @DoNotInline
        public final void execPerConnectionSQL(@NotNull SQLiteDatabase sQLiteDatabase, @NotNull String sql, @Nullable Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "()V", "CONFLICT_VALUES", "", "", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    public static final class a extends Lambda implements Function4<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SupportSQLiteQuery f23500p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SupportSQLiteQuery supportSQLiteQuery) {
            super(4);
            this.f23500p0 = supportSQLiteQuery;
        }

        @Override // kotlin.jvm.functions.Function4
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SQLiteQuery sQLiteQuery2 = sQLiteQuery;
            Intrinsics.checkNotNull(sQLiteQuery2);
            this.f23500p0.bindTo(new FrameworkSQLiteProgram(sQLiteQuery2));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
        }
    }

    public FrameworkSQLiteDatabase(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23499p0 = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.f23499p0.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.f23499p0.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f23499p0.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f23499p0.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23499p0.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f23499p0.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@NotNull String table, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(table);
        if (whereClause != null && whereClause.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        SimpleSQLiteQuery.INSTANCE.bind(supportSQLiteStatementCompileStatement, whereArgs);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.f23499p0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.f23499p0.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.f23499p0.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String sql, @Nullable Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            throw new UnsupportedOperationException(g0.c("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: ", i10));
        }
        Api30Impl.INSTANCE.execPerConnectionSQL(this.f23499p0, sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f23499p0.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f23499p0.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.f23499p0.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.f23499p0.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public String getPath() {
        return this.f23499p0.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.f23499p0.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.f23499p0.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values) throws SQLException {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f23499p0.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.f23499p0.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.f23499p0.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.f23499p0, sqLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f23499p0.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.f23499p0.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.f23499p0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int newVersion) {
        return this.f23499p0.needUpgrade(newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.f23499p0, enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f23499p0.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int cacheSize) {
        this.f23499p0.setMaxSqlCacheSize(cacheSize);
    }

    /* JADX INFO: renamed from: setMaximumSize, reason: collision with other method in class */
    public void m4642setMaximumSize(long j10) {
        this.f23499p0.setMaximumSize(j10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j10) {
        this.f23499p0.setPageSize(j10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.f23499p0.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i10) {
        this.f23499p0.setVersion(i10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f23497q0[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        if (whereArgs != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr[i11] = whereArgs[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(string);
        SimpleSQLiteQuery.INSTANCE.bind(supportSQLiteStatementCompileStatement, objArr);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.f23499p0.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) throws SQLException {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f23499p0.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long numBytes) {
        SQLiteDatabase sQLiteDatabase = this.f23499p0;
        sQLiteDatabase.setMaximumSize(numBytes);
        return sQLiteDatabase.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
        return this.f23499p0.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final a aVar = new a(query);
        Cursor cursorRawQueryWithFactory = this.f23499p0.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: f3.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                FrameworkSQLiteDatabase.Companion companion = FrameworkSQLiteDatabase.INSTANCE;
                Function4 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getF23480p0(), f23498r0, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(16)
    @NotNull
    public Cursor query(@NotNull final SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f23499p0;
        String f23480p0 = query.getF23480p0();
        String[] strArr = f23498r0;
        Intrinsics.checkNotNull(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, f23480p0, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: f3.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                FrameworkSQLiteDatabase.Companion companion = FrameworkSQLiteDatabase.INSTANCE;
                SupportSQLiteQuery query2 = query;
                Intrinsics.checkNotNullParameter(query2, "$query");
                Intrinsics.checkNotNull(sQLiteQuery);
                query2.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }
}
