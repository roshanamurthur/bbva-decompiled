package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.h0;
import com.bbva.plugin.media.capture.util.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ModelFileHelper {

    @KeepForSdk
    public static final int INVALID_INDEX = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GmsLogger f49449b = new GmsLogger("ModelFileHelper", "");

    @NonNull
    @VisibleForTesting
    public static final String zza = String.format("com.google.mlkit.%s.models", "translate");

    @NonNull
    @VisibleForTesting
    public static final String zzb = String.format("com.google.mlkit.%s.models", "custom");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public static final String f49450c = String.format("com.google.mlkit.%s.models", "base");

    public ModelFileHelper(@NonNull MlKitContext mlKitContext) {
        this.f49451a = mlKitContext;
    }

    @WorkerThread
    public final File a(@NonNull String str, @NonNull ModelType modelType, boolean z10) throws MlKitException {
        File modelDirUnsafe = getModelDirUnsafe(str, modelType, z10);
        if (!modelDirUnsafe.exists()) {
            f49449b.d("ModelFileHelper", "model folder does not exist, creating one: ".concat(String.valueOf(modelDirUnsafe.getAbsolutePath())));
            if (!modelDirUnsafe.mkdirs()) {
                throw new MlKitException("Failed to create model folder: ".concat(String.valueOf(modelDirUnsafe)), 13);
            }
        } else if (!modelDirUnsafe.isDirectory()) {
            throw new MlKitException("Can not create model folder, since an existing file has the same name: ".concat(String.valueOf(modelDirUnsafe)), 6);
        }
        return modelDirUnsafe;
    }

    @KeepForSdk
    @WorkerThread
    public synchronized void deleteAllModels(@NonNull ModelType modelType, @NonNull String str) {
        deleteRecursively(getModelDirUnsafe(str, modelType, false));
        deleteRecursively(getModelDirUnsafe(str, modelType, true));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032 A[RETURN] */
    @KeepForSdk
    @WorkerThread
    public boolean deleteRecursively(@Nullable File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            boolean z10 = true;
            for (File file2 : (File[]) Preconditions.checkNotNull(file.listFiles())) {
                z10 = z10 && deleteRecursively(file2);
            }
            if (z10) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    @WorkerThread
    public void deleteTempFilesInPrivateFolder(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        File fileA = a(str, modelType, true);
        if (deleteRecursively(fileA)) {
            return;
        }
        f49449b.e("ModelFileHelper", "Failed to delete the temp labels file directory: ".concat(String.valueOf(fileA.getAbsolutePath())));
    }

    @KeepForSdk
    @WorkerThread
    public int getLatestCachedModelVersion(@NonNull File file) {
        File[] fileArrListFiles = file.listFiles();
        int iMax = -1;
        if (fileArrListFiles != null && (fileArrListFiles.length) != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    iMax = Math.max(iMax, Integer.parseInt(file2.getName()));
                } catch (NumberFormatException unused) {
                    f49449b.d("ModelFileHelper", "Contains non-integer file name ".concat(String.valueOf(file2.getName())));
                }
            }
        }
        return iMax;
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public File getModelDir(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        return a(str, modelType, false);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public File getModelDirUnsafe(@NonNull String str, @NonNull ModelType modelType, boolean z10) {
        String str2;
        int iOrdinal = modelType.ordinal();
        if (iOrdinal == 1) {
            str2 = f49450c;
        } else if (iOrdinal == 2) {
            str2 = zza;
        } else {
            if (iOrdinal != 4) {
                throw new IllegalArgumentException(h0.b("Unknown model type ", modelType.name(), ". Cannot find a dir to store the downloaded model."));
            }
            str2 = zzb;
        }
        File file = new File(this.f49451a.getApplicationContext().getNoBackupFilesDir(), str2);
        if (z10) {
            file = new File(file, Constants.TEMP_FOLDER);
        }
        return new File(file, str);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public File getModelTempDir(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        return a(str, modelType, true);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public File getTempFileInPrivateFolder(@NonNull String str, @NonNull ModelType modelType, @NonNull String str2) throws MlKitException {
        File fileA = a(str, modelType, true);
        if (fileA.exists() && fileA.isFile() && !fileA.delete()) {
            throw new MlKitException("Failed to delete the temp labels file: ".concat(String.valueOf(fileA.getAbsolutePath())), 13);
        }
        if (!fileA.exists()) {
            f49449b.d("ModelFileHelper", "Temp labels folder does not exist, creating one: ".concat(String.valueOf(fileA.getAbsolutePath())));
            if (!fileA.mkdirs()) {
                throw new MlKitException("Failed to create a directory to hold the AutoML model's labels file.", 13);
            }
        }
        return new File(fileA, str2);
    }

    @KeepForSdk
    @WorkerThread
    public boolean modelExistsLocally(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        String strZzb;
        if (modelType == ModelType.UNKNOWN || (strZzb = zzb(str, modelType)) == null) {
            return false;
        }
        File file = new File(strZzb);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file, com.google.mlkit.common.sdkinternal.Constants.MODEL_FILE_NAME);
        f49449b.i("ModelFileHelper", "Model file path: ".concat(String.valueOf(file2.getAbsolutePath())));
        return file2.exists();
    }

    @NonNull
    @WorkerThread
    public final File zza(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        return a(str, modelType, true);
    }

    @Nullable
    @WorkerThread
    public final String zzb(@NonNull String str, @NonNull ModelType modelType) throws MlKitException {
        File modelDir = getModelDir(str, modelType);
        int latestCachedModelVersion = getLatestCachedModelVersion(modelDir);
        if (latestCachedModelVersion == -1) {
            return null;
        }
        return modelDir.getAbsolutePath() + "/" + latestCachedModelVersion;
    }
}
