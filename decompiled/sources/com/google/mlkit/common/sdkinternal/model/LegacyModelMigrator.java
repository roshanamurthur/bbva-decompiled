package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public abstract class LegacyModelMigrator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f49444b;

    @NonNull
    @KeepForSdk
    protected final ModelFileHelper modelFileHelper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f49443a = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f49445c = MLTaskExecutor.workerThreadExecutor();

    @KeepForSdk
    public LegacyModelMigrator(@NonNull Context context, @NonNull ModelFileHelper modelFileHelper) {
        this.f49444b = context;
        this.modelFileHelper = modelFileHelper;
    }

    @KeepForSdk
    public static void deleteIfEmpty(@NonNull File file) {
        File[] fileArrListFiles = file.listFiles();
        if ((fileArrListFiles == null || fileArrListFiles.length == 0) && !file.delete()) {
            "Error deleting model directory ".concat(String.valueOf(file));
        }
    }

    @KeepForSdk
    public static boolean isValidFirebasePersistenceKey(@NonNull String str) {
        String[] strArrSplit = str.split("\\+", -1);
        if (strArrSplit.length != 2) {
            return false;
        }
        try {
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[0]);
            Base64Utils.decodeUrlSafeNoPadding(strArrSplit[1]);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public static void migrateFile(@NonNull File file, @NonNull File file2) {
        if (file.exists()) {
            if (!file2.exists() && !file.renameTo(file2)) {
                String.valueOf(file);
                String.valueOf(file2);
            }
            if (!file.exists() || file.delete()) {
                return;
            }
            "Error deleting model file ".concat(String.valueOf(file));
        }
    }

    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public abstract String getLegacyModelDirName();

    @NonNull
    @KeepForSdk
    @VisibleForTesting
    public File getLegacyRootDir() {
        return new File(this.f49444b.getNoBackupFilesDir(), getLegacyModelDirName());
    }

    @NonNull
    @KeepForSdk
    public Task<Void> getMigrationTask() {
        return this.f49443a.getTask();
    }

    @KeepForSdk
    public abstract void migrateAllModelDirs(@NonNull File file);

    @KeepForSdk
    public void start() {
        this.f49445c.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.model.zza
            @Override // java.lang.Runnable
            public final void run() {
                LegacyModelMigrator legacyModelMigrator = this.zza;
                File legacyRootDir = legacyModelMigrator.getLegacyRootDir();
                File[] fileArrListFiles = legacyRootDir.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        legacyModelMigrator.migrateAllModelDirs(file);
                    }
                    LegacyModelMigrator.deleteIfEmpty(legacyRootDir);
                }
                legacyModelMigrator.f49443a.setResult(null);
            }
        });
    }
}
