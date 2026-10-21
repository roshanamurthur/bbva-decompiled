package androidx.room;

import androidx.appcompat.widget.w1;
import androidx.appcompat.widget.x1;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QueryInterceptorStatement.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016¨\u0006\u001e"}, d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "execute", "", "executeUpdateDelete", "", "executeInsert", "simpleQueryForLong", "", "simpleQueryForString", FirebaseAnalytics.Param.INDEX, "bindNull", "value", "bindLong", "", "bindDouble", "bindString", "", "bindBlob", "clearBindings", "delegate", "sqlStatement", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteStatement f23263p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f23264q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Executor f23265r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.QueryCallback f23266s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ArrayList f23267t0;

    public QueryInterceptorStatement(@NotNull SupportSQLiteStatement delegate, @NotNull String sqlStatement, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f23263p0 = delegate;
        this.f23264q0 = sqlStatement;
        this.f23265r0 = queryCallbackExecutor;
        this.f23266s0 = queryCallback;
        this.f23267t0 = new ArrayList();
    }

    public final void a(int i10, Object obj) {
        int i11 = i10 - 1;
        ArrayList arrayList = this.f23267t0;
        if (i11 >= arrayList.size()) {
            int size = (i11 - arrayList.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(null);
            }
        }
        arrayList.set(i11, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a(index, value);
        this.f23263p0.bindBlob(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        a(index, Double.valueOf(value));
        this.f23263p0.bindDouble(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        a(index, Long.valueOf(value));
        this.f23263p0.bindLong(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        a(index, null);
        this.f23263p0.bindNull(index);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a(index, value);
        this.f23263p0.bindString(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.f23267t0.clear();
        this.f23263p0.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23263p0.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.f23265r0.execute(new g(this, 0));
        this.f23263p0.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.f23265r0.execute(new w1(this, 1));
        return this.f23263p0.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.f23265r0.execute(new f(this, 0));
        return this.f23263p0.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.f23265r0.execute(new h(this, 0));
        return this.f23263p0.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        this.f23265r0.execute(new x1(this, 1));
        return this.f23263p0.simpleQueryForString();
    }
}
