package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QueryInterceptorOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Landroidx/room/QueryInterceptorOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.Factory f23259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Executor f23260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.QueryCallback f23261c;

    public QueryInterceptorOpenHelperFactory(@NotNull SupportSQLiteOpenHelper.Factory delegate, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f23259a = delegate;
        this.f23260b = queryCallbackExecutor;
        this.f23261c = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NotNull
    public SupportSQLiteOpenHelper create(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.f23259a.create(configuration), this.f23260b, this.f23261c);
    }
}
