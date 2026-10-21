package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkDatabasePathHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24381a = Logger.tagWithPrefix("WrkDbPathHelper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f24382b = {"-journal", "-shm", "-wal"};

    @NonNull
    @VisibleForTesting
    public static File getDatabasePath(@NonNull Context context) {
        return new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
    }

    @NonNull
    @VisibleForTesting
    public static File getDefaultDatabasePath(@NonNull Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    @NonNull
    public static String getWorkDatabaseName() {
        return "androidx.work.workdb";
    }

    public static void migrateDatabase(@NonNull Context context) {
        if (getDefaultDatabasePath(context).exists()) {
            String str = f24381a;
            Logger.get().debug(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapMigrationPaths = migrationPaths(context);
            for (File file : mapMigrationPaths.keySet()) {
                File file2 = mapMigrationPaths.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        Logger.get().warning(str, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    Logger.get().debug(str, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public static Map<File, File> migrationPaths(@NonNull Context context) {
        HashMap map = new HashMap();
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        map.put(defaultDatabasePath, databasePath);
        for (String str : f24382b) {
            map.put(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
        }
        return map;
    }
}
