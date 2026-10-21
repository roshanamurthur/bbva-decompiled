package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class RemoteModelLoader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final GmsLogger f49477h = new GmsLogger("RemoteModelLoader", "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @GuardedBy("RemoteModelLoader.class")
    public static final HashMap f49478i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteModel f49480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteModelDownloadManager f49481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RemoteModelFileManager f49482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteModelLoaderHelper f49483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzsh f49484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49485g;

    public RemoteModelLoader(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        RemoteModelFileManager remoteModelFileManager = new RemoteModelFileManager(mlKitContext, remoteModel, modelValidator, new ModelFileHelper(mlKitContext), remoteModelFileMover);
        this.f49482d = remoteModelFileManager;
        this.f49485g = true;
        this.f49481c = RemoteModelDownloadManager.getInstance(mlKitContext, remoteModel, new ModelFileHelper(mlKitContext), remoteModelFileManager, (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
        this.f49483e = remoteModelLoaderHelper;
        this.f49479a = mlKitContext;
        this.f49480b = remoteModel;
        this.f49484f = zzss.zzb("common");
    }

    @NonNull
    @KeepForSdk
    public static synchronized RemoteModelLoader getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelValidator modelValidator, @NonNull RemoteModelLoaderHelper remoteModelLoaderHelper, @NonNull RemoteModelFileMover remoteModelFileMover) {
        String uniqueModelNameForPersist;
        HashMap map;
        try {
            uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
            map = f49478i;
            if (!map.containsKey(uniqueModelNameForPersist)) {
                map.put(uniqueModelNameForPersist, new RemoteModelLoader(mlKitContext, remoteModel, modelValidator, remoteModelLoaderHelper, remoteModelFileMover));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (RemoteModelLoader) map.get(uniqueModelNameForPersist);
    }

    public final MappedByteBuffer a(File file) throws MlKitException {
        try {
            return this.f49483e.loadModelAtPath(file.getAbsolutePath());
        } catch (Exception e5) {
            this.f49482d.zzc(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e5);
        }
    }

    @NonNull
    @KeepForSdk
    public RemoteModel getRemoteModel() {
        return this.f49480b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b8 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d7, B:36:0x00f5, B:37:0x00f6, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d7, B:36:0x00f5, B:37:0x00f6, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:3:0x0001, B:7:0x001e, B:9:0x0026, B:28:0x00b8, B:30:0x00c7, B:32:0x00cf, B:35:0x00d7, B:36:0x00f5, B:37:0x00f6, B:13:0x0031, B:15:0x0048, B:18:0x0051, B:20:0x006f, B:22:0x0077, B:23:0x0089, B:25:0x0091, B:26:0x00a8), top: B:45:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    @KeepForSdk
    @WorkerThread
    public synchronized MappedByteBuffer load() throws MlKitException {
        MappedByteBuffer mappedByteBufferLoadModelAtPath;
        MappedByteBuffer mappedByteBufferA;
        String strZzb;
        try {
            GmsLogger gmsLogger = f49477h;
            gmsLogger.d("RemoteModelLoader", "Try to load newly downloaded model file.");
            RemoteModelDownloadManager remoteModelDownloadManager = this.f49481c;
            boolean z10 = this.f49485g;
            Long downloadingId = remoteModelDownloadManager.getDownloadingId();
            String downloadingModelHash = remoteModelDownloadManager.getDownloadingModelHash();
            mappedByteBufferLoadModelAtPath = null;
            if (downloadingId == null || downloadingModelHash == null) {
                gmsLogger.d("RemoteModelLoader", "No new model is downloading.");
                this.f49481c.removeOrCancelDownload();
            } else {
                Integer downloadingModelStatusCode = this.f49481c.getDownloadingModelStatusCode();
                if (downloadingModelStatusCode == null) {
                    this.f49481c.removeOrCancelDownload();
                } else {
                    gmsLogger.d("RemoteModelLoader", "Download Status code: ".concat(downloadingModelStatusCode.toString()));
                    if (downloadingModelStatusCode.intValue() == 8) {
                        File fileZzi = this.f49481c.zzi(downloadingModelHash);
                        if (fileZzi != null) {
                            mappedByteBufferA = a(fileZzi);
                            gmsLogger.d("RemoteModelLoader", "Moved the downloaded model to private folder successfully: ".concat(String.valueOf(fileZzi.getParent())));
                            this.f49481c.updateLatestModelHashAndType(downloadingModelHash);
                            if (z10 && this.f49482d.zzd(fileZzi)) {
                                gmsLogger.d("RemoteModelLoader", "All old models are deleted.");
                                mappedByteBufferA = a(this.f49482d.zza(fileZzi));
                            }
                        }
                        if (mappedByteBufferA == null) {
                            gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                            strZzb = this.f49482d.zzb();
                            if (strZzb == null) {
                                gmsLogger.d("RemoteModelLoader", "No existing model file");
                            } else {
                                try {
                                    mappedByteBufferLoadModelAtPath = this.f49483e.loadModelAtPath(strZzb);
                                } catch (Exception e5) {
                                    this.f49482d.zzc(new File(strZzb));
                                    SharedPrefManager.getInstance(this.f49479a).clearLatestModelHash(this.f49480b);
                                    throw new MlKitException("Failed to load an already downloaded model.", 14, e5);
                                }
                            }
                        } else {
                            this.f49485g = false;
                            mappedByteBufferLoadModelAtPath = mappedByteBufferA;
                        }
                    } else if (downloadingModelStatusCode.intValue() == 16) {
                        this.f49484f.zze(zzsk.zzg(), this.f49480b, false, this.f49481c.getFailureReason(downloadingId));
                        this.f49481c.removeOrCancelDownload();
                    }
                }
            }
            mappedByteBufferA = null;
            if (mappedByteBufferA == null) {
                gmsLogger.d("RemoteModelLoader", "Loading existing model file.");
                strZzb = this.f49482d.zzb();
                if (strZzb == null) {
                    gmsLogger.d("RemoteModelLoader", "No existing model file");
                } else {
                    mappedByteBufferLoadModelAtPath = this.f49483e.loadModelAtPath(strZzb);
                }
            } else {
                this.f49485g = false;
                mappedByteBufferLoadModelAtPath = mappedByteBufferA;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mappedByteBufferLoadModelAtPath;
    }
}
