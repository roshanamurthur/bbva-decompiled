package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AutoClosingRoomOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "create", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/AutoCloser;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.Factory f23169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AutoCloser f23170b;

    public AutoClosingRoomOpenHelperFactory(@NotNull SupportSQLiteOpenHelper.Factory delegate, @NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f23169a = delegate;
        this.f23170b = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NotNull
    public AutoClosingRoomOpenHelper create(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.f23169a.create(configuration), this.f23170b);
    }
}
