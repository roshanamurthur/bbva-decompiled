package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class CustomModelLoader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GmsLogger f49434h = new GmsLogger("CustomModelLoader", "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("CustomModelLoader.class")
    public static final HashMap f49435i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LocalModel f49437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final CustomRemoteModel f49438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final RemoteModelDownloadManager f49439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final RemoteModelFileManager f49440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzsh f49441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49442g;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public interface CustomModelLoaderHelper {
        @KeepForSdk
        void logLoad() throws MlKitException;

        @KeepForSdk
        boolean tryLoad(@NonNull LocalModel localModel) throws MlKitException;
    }

    public CustomModelLoader(@NonNull MlKitContext mlKitContext, @Nullable LocalModel localModel, @Nullable CustomRemoteModel customRemoteModel) {
        if (customRemoteModel != null) {
            RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, customRemoteModel, null, new ModelFileHelper(mlKitContext), new com.google.mlkit.common.internal.model.zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist()));
            this.f49440e = remoteModelFileManager;
            this.f49439d = RemoteModelDownloadManager.getInstance(mlKitContext, customRemoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
            this.f49442g = true;
        } else {
            this.f49440e = null;
            this.f49439d = null;
        }
        this.f49436a = mlKitContext;
        this.f49437b = localModel;
        this.f49438c = customRemoteModel;
        this.f49441f = zzss.zzb("common");
    }

    @WorkerThread
    public static final LocalModel b(File file) {
        if (file.isDirectory()) {
            LocalModel.Builder builder = new LocalModel.Builder();
            builder.setAbsoluteManifestFilePath(new File(file.getAbsolutePath(), Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME).toString());
            return builder.build();
        }
        LocalModel.Builder builder2 = new LocalModel.Builder();
        builder2.setAbsoluteFilePath(file.getAbsolutePath());
        return builder2.build();
    }

    @NonNull
    @KeepForSdk
    public static synchronized CustomModelLoader getInstance(@NonNull MlKitContext mlKitContext, @Nullable LocalModel localModel, @Nullable CustomRemoteModel customRemoteModel) {
        String string;
        HashMap map;
        try {
            string = customRemoteModel == null ? ((LocalModel) Preconditions.checkNotNull(localModel)).toString() : customRemoteModel.getUniqueModelNameForPersist();
            map = f49435i;
            if (!map.containsKey(string)) {
                map.put(string, new CustomModelLoader(mlKitContext, localModel, customRemoteModel));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (CustomModelLoader) map.get(string);
    }

    @Nullable
    @WorkerThread
    public final File a() throws MlKitException {
        String strZzb = ((RemoteModelFileManager) Preconditions.checkNotNull(this.f49440e)).zzb();
        if (strZzb == null) {
            f49434h.d("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(strZzb);
        File[] fileArrListFiles = file.listFiles();
        return ((File[]) Preconditions.checkNotNull(fileArrListFiles)).length == 1 ? fileArrListFiles[0] : file;
    }

    @VisibleForTesting
    @Nullable
    @KeepForSdk
    @WorkerThread
    public synchronized LocalModel createLocalModelByLatestExistingModel() throws MlKitException {
        f49434h.d("CustomModelLoader", "Try to get the latest existing model file.");
        File fileA = a();
        if (fileA == null) {
            return null;
        }
        return b(fileA);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0023, B:9:0x002b, B:27:0x00b7, B:11:0x0039, B:13:0x0050, B:16:0x0059, B:19:0x0074, B:21:0x007c, B:22:0x00a0), top: B:32:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00b5, please report this as an issue */
    @VisibleForTesting
    @Nullable
    @KeepForSdk
    @WorkerThread
    public synchronized LocalModel createLocalModelByNewlyDownloadedModel() throws MlKitException {
        File fileZzi;
        try {
            GmsLogger gmsLogger = f49434h;
            gmsLogger.d("CustomModelLoader", "Try to get newly downloaded model file.");
            Long downloadingId = ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.f49439d)).getDownloadingId();
            String downloadingModelHash = this.f49439d.getDownloadingModelHash();
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.d("CustomModelLoader", "No new model is downloading.");
                ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.f49439d)).removeOrCancelDownload();
            } else {
                Integer downloadingModelStatusCode = this.f49439d.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.f49439d)).removeOrCancelDownload();
                } else {
                    gmsLogger.d("CustomModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        fileZzi = this.f49439d.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            gmsLogger.d("CustomModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.f49439d.updateLatestModelHashAndType(downloadingModelHash);
                        }
                        if (fileZzi == null) {
                            return null;
                        }
                        return b(fileZzi);
                    }
                    if (downloadingModelStatusCode.intValue() == 16) {
                        this.f49441f.zze(zzsk.zzg(), (RemoteModel) Preconditions.checkNotNull(this.f49438c), false, this.f49439d.getFailureReason(downloadingId));
                        ((RemoteModelDownloadManager) Preconditions.checkNotNull(this.f49439d)).removeOrCancelDownload();
                    }
                }
            }
            fileZzi = null;
            if (fileZzi == null) {
                return null;
            }
            return b(fileZzi);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public void deleteLatestExistingModel() throws MlKitException {
        File fileA = a();
        if (fileA != null) {
            ((RemoteModelFileManager) Preconditions.checkNotNull(this.f49440e)).zzc(fileA);
            SharedPrefManager.getInstance(this.f49436a).clearLatestModelHash((RemoteModel) Preconditions.checkNotNull(this.f49438c));
        }
    }

    @KeepForSdk
    @VisibleForTesting
    @WorkerThread
    public void deleteOldModels(@NonNull LocalModel localModel) throws MlKitException {
        File parentFile = new File((String) Preconditions.checkNotNull(localModel.getAbsoluteFilePath())).getParentFile();
        RemoteModelFileManager remoteModelFileManager = this.f49440e;
        boolean zZzd = ((RemoteModelFileManager) Preconditions.checkNotNull(remoteModelFileManager)).zzd((File) Preconditions.checkNotNull(parentFile));
        GmsLogger gmsLogger = f49434h;
        if (!zZzd) {
            gmsLogger.e("CustomModelLoader", "Failed to delete old models");
        } else {
            gmsLogger.d("CustomModelLoader", "All old models are deleted.");
            remoteModelFileManager.zza(parentFile);
        }
    }

    @KeepForSdk
    @WorkerThread
    public synchronized void load(@NonNull CustomModelLoaderHelper customModelLoaderHelper) throws MlKitException {
        try {
            LocalModel localModelCreateLocalModelByLatestExistingModel = this.f49437b;
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                localModelCreateLocalModelByLatestExistingModel = createLocalModelByNewlyDownloadedModel();
            }
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
            }
            if (localModelCreateLocalModelByLatestExistingModel == null) {
                throw new MlKitException("Model is not available.", 14);
            }
            while (!customModelLoaderHelper.tryLoad(localModelCreateLocalModelByLatestExistingModel)) {
                if (this.f49438c != null) {
                    deleteLatestExistingModel();
                    localModelCreateLocalModelByLatestExistingModel = createLocalModelByLatestExistingModel();
                } else {
                    localModelCreateLocalModelByLatestExistingModel = null;
                }
                if (localModelCreateLocalModelByLatestExistingModel == null) {
                    customModelLoaderHelper.logLoad();
                    return;
                }
            }
            if (this.f49438c != null && this.f49442g) {
                deleteOldModels((LocalModel) Preconditions.checkNotNull(localModelCreateLocalModelByLatestExistingModel));
                this.f49442g = false;
            }
            customModelLoaderHelper.logLoad();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
