package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SQLiteCopyOpenHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bR\u001a\u0010\u000f\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006&"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "", "enabled", "", "setWriteAheadLoggingEnabled", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroidx/room/DatabaseConfiguration;", "databaseConfiguration", "setDatabaseConfiguration", "u0", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegate", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Landroid/content/Context;", "context", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f23343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final String f23344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final File f23345r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final Callable<InputStream> f23346s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f23347t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SupportSQLiteOpenHelper delegate;
    public DatabaseConfiguration v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f23349w0;

    public SQLiteCopyOpenHelper(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull SupportSQLiteOpenHelper delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23343p0 = context;
        this.f23344q0 = str;
        this.f23345r0 = file;
        this.f23346s0 = callable;
        this.f23347t0 = i10;
        this.delegate = delegate;
    }

    public final void a(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        Context context = this.f23343p0;
        String str = this.f23344q0;
        if (str != null) {
            readableByteChannelNewChannel = Channels.newChannel(context.getAssets().open(str));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else {
            File file2 = this.f23345r0;
            if (file2 != null) {
                readableByteChannelNewChannel = new FileInputStream(file2).getChannel();
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
            } else {
                Callable<InputStream> callable = this.f23346s0;
                if (callable == null) {
                    throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                }
                try {
                    readableByteChannelNewChannel = Channels.newChannel(callable.call());
                    Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
                } catch (Exception e5) {
                    throw new IOException("inputStreamCallable exception on call", e5);
                }
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        FileUtil.copy(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        DatabaseConfiguration databaseConfiguration = this.v0;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback != null) {
            try {
                final int version = DBUtil.readVersion(intermediateFile);
                FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
                SupportSQLiteOpenHelper.Configuration.Builder builderName = SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(context).name(intermediateFile.getAbsolutePath());
                final int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(version, 1);
                SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = frameworkSQLiteOpenHelperFactory.create(builderName.callback(new SupportSQLiteOpenHelper.Callback(iCoerceAtLeast) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                    public void onCreate(@NotNull SupportSQLiteDatabase db2) {
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                    public void onOpen(@NotNull SupportSQLiteDatabase db2) {
                        Intrinsics.checkNotNullParameter(db2, "db");
                        int i10 = version;
                        if (i10 < 1) {
                            db2.setVersion(i10);
                        }
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                    public void onUpgrade(@NotNull SupportSQLiteDatabase db2, int oldVersion, int newVersion) {
                        Intrinsics.checkNotNullParameter(db2, "db");
                    }
                }).build());
                try {
                    SupportSQLiteDatabase writableDatabase = z10 ? supportSQLiteOpenHelperCreate.getWritableDatabase() : supportSQLiteOpenHelperCreate.getReadableDatabase();
                    DatabaseConfiguration databaseConfiguration2 = this.v0;
                    if (databaseConfiguration2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                        databaseConfiguration2 = null;
                    }
                    RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
                    Intrinsics.checkNotNull(prepackagedDatabaseCallback);
                    prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(supportSQLiteOpenHelperCreate, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(supportSQLiteOpenHelperCreate, th2);
                        throw th3;
                    }
                }
            } catch (IOException e7) {
                throw new RuntimeException("Malformed database file, unable to read version.", e7);
            }
        }
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public final void b(boolean z10) {
        String f23502q0 = getF23502q0();
        if (f23502q0 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Context context = this.f23343p0;
        File databaseFile = context.getDatabasePath(f23502q0);
        DatabaseConfiguration databaseConfiguration = this.v0;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(f23502q0, context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    a(databaseFile, z10);
                    processLock.unlock();
                    return;
                } catch (IOException e5) {
                    throw new RuntimeException("Unable to copy database file.", e5);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int version = DBUtil.readVersion(databaseFile);
                int i10 = this.f23347t0;
                if (version == i10) {
                    processLock.unlock();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.v0;
                if (databaseConfiguration3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(version, i10)) {
                    processLock.unlock();
                    return;
                }
                if (context.deleteDatabase(f23502q0)) {
                    try {
                        a(databaseFile, z10);
                    } catch (IOException e7) {
                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e7);
                    }
                } else {
                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + f23502q0 + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (IOException e10) {
                Log.w(Room.LOG_TAG, "Unable to read database version.", e10);
                processLock.unlock();
                return;
            }
        } catch (Throwable th2) {
            processLock.unlock();
            throw th2;
        }
        processLock.unlock();
        throw th2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.f23349w0 = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getF23502q0() {
        return getDelegate().getF23502q0();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.f23349w0) {
            b(false);
            this.f23349w0 = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.f23349w0) {
            b(true);
            this.f23349w0 = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@NotNull DatabaseConfiguration databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.v0 = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }
}
