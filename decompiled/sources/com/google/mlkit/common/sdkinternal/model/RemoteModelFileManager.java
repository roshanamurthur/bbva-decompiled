package com.google.mlkit.common.sdkinternal.model;

import android.annotation.SuppressLint;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.ModelUtils;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class RemoteModelFileManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GmsLogger f49469h = new GmsLogger("RemoteModelFileManager", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelType f49472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ModelValidator f49473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteModelFileMover f49474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedPrefManager f49475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ModelFileHelper f49476g;

    @SuppressLint({"FirebaseLambdaLast"})
    public RemoteModelFileManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @Nullable ModelValidator modelValidator, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        this.f49470a = mlKitContext;
        ModelType modelType = remoteModel.getModelType();
        this.f49472c = modelType;
        this.f49471b = modelType == ModelType.TRANSLATE ? remoteModel.getModelNameForBackend() : remoteModel.getUniqueModelNameForPersist();
        this.f49473d = modelValidator;
        this.f49475f = SharedPrefManager.getInstance(mlKitContext);
        this.f49476g = modelFileHelper;
        this.f49474e = remoteModelFileMover;
    }

    @NonNull
    @KeepForSdk
    public File getModelDirUnsafe(boolean z10) {
        return this.f49476g.getModelDirUnsafe(this.f49471b, this.f49472c, z10);
    }

    @Nullable
    @KeepForSdk
    @WorkerThread
    public synchronized File moveModelToPrivateFolder(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull String str, @NonNull RemoteModel remoteModel) throws MlKitException {
        File file;
        MlKitException mlKitException;
        ModelValidator modelValidator;
        try {
            file = new File(this.f49476g.zza(this.f49471b, this.f49472c), "to_be_validated_model.tmp");
            ModelValidator.ValidationResult validationResultValidateModel = null;
            try {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = autoCloseInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                            try {
                                autoCloseInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        autoCloseInputStream.close();
                        boolean zZza = ModelUtils.zza(file, str);
                        if (zZza && (modelValidator = this.f49473d) != null) {
                            validationResultValidateModel = modelValidator.validateModel(file, remoteModel);
                            if (validationResultValidateModel.getErrorCode().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                                String appVersion = CommonUtils.getAppVersion(this.f49470a.getApplicationContext());
                                this.f49475f.setIncompatibleModelInfo(remoteModel, str, appVersion);
                                String strValueOf = String.valueOf(str);
                                GmsLogger gmsLogger = f49469h;
                                gmsLogger.d("RemoteModelFileManager", "Model is not compatible. Model hash: ".concat(strValueOf));
                                gmsLogger.d("RemoteModelFileManager", "The current app version is: ".concat(String.valueOf(appVersion)));
                            }
                        }
                        if (zZza && (validationResultValidateModel == null || validationResultValidateModel.isValid())) {
                        }
                        if (zZza) {
                            mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                        } else {
                            f49469h.d("RemoteModelFileManager", "Hash does not match with expected: ".concat(String.valueOf(str)));
                            zzss.zzb("common").zzf(zzsk.zzg(), remoteModel, zzmu.MODEL_HASH_MISMATCH, true, this.f49472c, zzna.SUCCEEDED);
                            mlKitException = new MlKitException("Hash does not match with expected", 102);
                        }
                        if (file.delete()) {
                            throw mlKitException;
                        }
                        f49469h.d("RemoteModelFileManager", "Failed to delete the temp file: ".concat(String.valueOf(file.getAbsolutePath())));
                        throw mlKitException;
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    autoCloseInputStream.close();
                    throw th5;
                }
            } catch (IOException e5) {
                f49469h.e("RemoteModelFileManager", "Failed to copy downloaded model file to private folder: ".concat(e5.toString()));
                return null;
            }
        } catch (Throwable th6) {
            throw th6;
        }
        return this.f49474e.moveAllFilesFromPrivateTempToPrivateDestination(file);
    }

    @NonNull
    @WorkerThread
    public final synchronized File zza(@NonNull File file) throws MlKitException {
        File file2 = new File(String.valueOf(this.f49476g.getModelDir(this.f49471b, this.f49472c).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        return file.renameTo(file2) ? file2 : file;
    }

    @Nullable
    @WorkerThread
    public final synchronized String zzb() throws MlKitException {
        return this.f49476g.zzb(this.f49471b, this.f49472c);
    }

    @WorkerThread
    public final synchronized void zzc(@NonNull File file) {
        File[] fileArrListFiles;
        File modelDirUnsafe = getModelDirUnsafe(false);
        if (modelDirUnsafe.exists() && (fileArrListFiles = modelDirUnsafe.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.equals(file)) {
                    this.f49476g.deleteRecursively(file);
                    return;
                }
            }
        }
    }

    @WorkerThread
    public final synchronized boolean zzd(@NonNull File file) throws MlKitException {
        File modelDir = this.f49476g.getModelDir(this.f49471b, this.f49472c);
        if (!modelDir.exists()) {
            return false;
        }
        File[] fileArrListFiles = modelDir.listFiles();
        boolean z10 = true;
        if (fileArrListFiles == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.equals(file) && !this.f49476g.deleteRecursively(file2)) {
                z10 = false;
            }
        }
        return z10;
    }
}
