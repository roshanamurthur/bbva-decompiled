package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.r1;
import androidx.camera.core.h0;
import androidx.camera.core.impl.t;
import androidx.camera.core.u1;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.android.gms.actions.SearchIntents;
import h2.q;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QueryInterceptorDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010U\u001a\u00020\u0001\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u000eH\u0096\u0001J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0097\u0001J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0096\u0001JF\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020\u0002H\u0016J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u0004H\u0016J)\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b3\u00105J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u000206H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00103\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J)\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b9\u0010\u0013R(\u0010>\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040;\u0018\u00010:8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0014\u0010H\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001c\u0010L\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bI\u0010G\"\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001c\u0010T\u001a\u00020\n8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006\\"}, d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "", "table", "whereClause", "", "", "whereArgs", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "sql", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "inTransaction", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "newVersion", "needUpgrade", "enabled", "setForeignKeyConstraintsEnabled", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "numBytes", "setMaximumSize", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "()Z", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", "getVersion", "()I", "setVersion", "(I)V", "version", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteDatabase f23253p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Executor f23254q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.QueryCallback f23255r0;

    public QueryInterceptorDatabase(@NotNull SupportSQLiteDatabase delegate, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f23253p0 = delegate;
        this.f23254q0 = queryCallbackExecutor;
        this.f23255r0 = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.f23254q0.execute(new t(this, 2));
        this.f23253p0.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.f23254q0.execute(new r1(this, 2));
        this.f23253p0.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f23254q0.execute(new h0(this, 1));
        this.f23253p0.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.f23254q0.execute(new u1(this, 2));
        this.f23253p0.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23253p0.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new QueryInterceptorStatement(this.f23253p0.compileStatement(sql), sql, this.f23254q0, this.f23255r0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@NotNull String table, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        return this.f23253p0.delete(table, whereClause, whereArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.f23253p0.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.f23253p0.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.f23254q0.execute(new d(this, 0));
        this.f23253p0.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@NotNull String sql, @SuppressLint({"ArrayReturn"}) @Nullable Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f23253p0.execPerConnectionSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f23254q0.execute(new q(this, sql, 1));
        this.f23253p0.execSQL(sql);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f23253p0.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.f23253p0.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.f23253p0.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @Nullable
    public String getPath() {
        return this.f23253p0.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.f23253p0.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.f23253p0.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f23253p0.insert(table, conflictAlgorithm, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.f23253p0.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.f23253p0.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.f23253p0.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f23253p0.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.f23253p0.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.f23253p0.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int newVersion) {
        return this.f23253p0.needUpgrade(newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f23254q0.execute(new androidx.camera.camera2.interop.a(this, query, 2));
        return this.f23253p0.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean enabled) {
        this.f23253p0.setForeignKeyConstraintsEnabled(enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f23253p0.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int cacheSize) {
        this.f23253p0.setMaxSqlCacheSize(cacheSize);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long numBytes) {
        return this.f23253p0.setMaximumSize(numBytes);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j10) {
        this.f23253p0.setPageSize(j10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.f23254q0.execute(new androidx.activity.f(this, 4));
        this.f23253p0.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i10) {
        this.f23253p0.setVersion(i10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f23253p0.update(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.f23253p0.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
        return this.f23253p0.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@NotNull String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        List listCreateListBuilder = bk.d.createListBuilder();
        bk.g.addAll(listCreateListBuilder, bindArgs);
        List listBuild = bk.d.build(listCreateListBuilder);
        this.f23254q0.execute(new e(this, sql, listBuild));
        this.f23253p0.execSQL(sql, listBuild.toArray(new Object[0]));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull String query, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f23254q0.execute(new c(this, query, 0, bindArgs));
        return this.f23253p0.query(query, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.f23254q0.execute(new v2.e(this, query, 1, queryInterceptorProgram));
        return this.f23253p0.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.f23254q0.execute(new b(this, query, 0, queryInterceptorProgram));
        return this.f23253p0.query(query);
    }
}
