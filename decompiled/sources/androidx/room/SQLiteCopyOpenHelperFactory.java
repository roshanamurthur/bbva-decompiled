package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SQLiteCopyOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "", "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SQLiteCopyOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f23352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Callable<InputStream> f23353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SupportSQLiteOpenHelper.Factory f23354d;

    public SQLiteCopyOpenHelperFactory(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NotNull SupportSQLiteOpenHelper.Factory mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f23351a = str;
        this.f23352b = file;
        this.f23353c = callable;
        this.f23354d = mDelegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NotNull
    public SupportSQLiteOpenHelper create(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new SQLiteCopyOpenHelper(configuration.context, this.f23351a, this.f23352b, this.f23353c, configuration.callback.version, this.f23354d.create(configuration));
    }
}
