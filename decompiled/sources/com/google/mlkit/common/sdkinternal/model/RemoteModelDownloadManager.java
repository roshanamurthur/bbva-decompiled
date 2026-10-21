package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.utils.b;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzry;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelInfo;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class RemoteModelDownloadManager {
    public static final GmsLogger m = new GmsLogger("ModelDownloadManager", "");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @GuardedBy("RemoteModelDownloadManager.class")
    public static final HashMap f49456n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final LongSparseArray f49457a = new LongSparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final LongSparseArray f49458b = new LongSparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MlKitContext f49459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final DownloadManager f49460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RemoteModel f49461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ModelType f49462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzsh f49463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SharedPrefManager f49464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ModelFileHelper f49465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final ModelInfoRetrieverInterop f49466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RemoteModelFileManager f49467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DownloadConditions f49468l;

    @VisibleForTesting
    public RemoteModelDownloadManager(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop, @NonNull zzsh zzshVar) {
        this.f49459c = mlKitContext;
        this.f49462f = remoteModel.getModelType();
        this.f49461e = remoteModel;
        DownloadManager downloadManager = (DownloadManager) mlKitContext.getApplicationContext().getSystemService("download");
        this.f49460d = downloadManager;
        this.f49463g = zzshVar;
        if (downloadManager == null) {
            m.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.f49465i = modelFileHelper;
        this.f49464h = SharedPrefManager.getInstance(mlKitContext);
        this.f49466j = modelInfoRetrieverInterop;
        this.f49467k = remoteModelFileManager;
    }

    @NonNull
    @KeepForSdk
    public static synchronized RemoteModelDownloadManager getInstance(@NonNull MlKitContext mlKitContext, @NonNull RemoteModel remoteModel, @NonNull ModelFileHelper modelFileHelper, @NonNull RemoteModelFileManager remoteModelFileManager, @Nullable ModelInfoRetrieverInterop modelInfoRetrieverInterop) {
        HashMap map;
        try {
            map = f49456n;
            if (!map.containsKey(remoteModel)) {
                map.put(remoteModel, new RemoteModelDownloadManager(mlKitContext, remoteModel, modelFileHelper, remoteModelFileManager, modelInfoRetrieverInterop, zzss.zzb("common")));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (RemoteModelDownloadManager) map.get(remoteModel);
    }

    @Nullable
    @WorkerThread
    public final synchronized ModelInfo a() throws MlKitException {
        boolean z10;
        try {
            boolean zModelExistsLocally = modelExistsLocally();
            if (zModelExistsLocally) {
                zzsh zzshVar = this.f49463g;
                RemoteModel remoteModel = this.f49461e;
                zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.LIVE);
            }
            ModelInfoRetrieverInterop modelInfoRetrieverInterop = this.f49466j;
            if (modelInfoRetrieverInterop == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            ModelInfo modelInfoRetrieveRemoteModelInfo = modelInfoRetrieverInterop.retrieveRemoteModelInfo(this.f49461e);
            if (modelInfoRetrieveRemoteModelInfo == null) {
                return null;
            }
            MlKitContext mlKitContext = this.f49459c;
            RemoteModel remoteModel2 = this.f49461e;
            String modelHash = modelInfoRetrieveRemoteModelInfo.getModelHash();
            SharedPrefManager sharedPrefManager = SharedPrefManager.getInstance(mlKitContext);
            boolean zEquals = modelHash.equals(sharedPrefManager.getIncompatibleModelHash(remoteModel2));
            boolean z11 = false;
            if (zEquals && CommonUtils.getAppVersion(mlKitContext.getApplicationContext()).equals(sharedPrefManager.getPreviousAppVersion())) {
                m.e("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z10 = false;
            } else {
                z10 = true;
            }
            if (!zModelExistsLocally) {
                this.f49464h.clearLatestModelHash(this.f49461e);
            }
            boolean z12 = !modelInfoRetrieveRemoteModelInfo.getModelHash().equals(SharedPrefManager.getInstance(this.f49459c).getLatestModelHash(this.f49461e));
            if (!z10) {
                z11 = z12;
            } else if (!zModelExistsLocally || z12) {
                return modelInfoRetrieveRemoteModelInfo;
            }
            if (zModelExistsLocally && (z11 ^ z10)) {
                return null;
            }
            throw new MlKitException("The model " + this.f49461e.getModelName() + " is incompatible with TFLite runtime", 100);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Task b(long j10) {
        a aVar;
        MlKitContext mlKitContext = this.f49459c;
        synchronized (this) {
            aVar = (a) this.f49457a.get(j10);
            if (aVar == null) {
                aVar = new a(this, j10, c(j10));
                this.f49457a.put(j10, aVar);
            }
        }
        ContextCompat.registerReceiver(mlKitContext.getApplicationContext(), aVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, MLTaskExecutor.getInstance().getHandler(), 2);
        return c(j10).getTask();
    }

    public final synchronized TaskCompletionSource c(long j10) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f49458b.get(j10);
        if (taskCompletionSource != null) {
            return taskCompletionSource;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.f49458b.put(j10, taskCompletionSource2);
        return taskCompletionSource2;
    }

    public final MlKitException d(@Nullable Long l6) {
        Cursor cursorQuery = null;
        DownloadManager downloadManager = this.f49460d;
        if (downloadManager != null && l6 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l6.longValue()));
        }
        int i10 = 13;
        String strA = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i11 == 1006) {
                strA = "Model downloading failed due to insufficient space on the device.";
                i10 = 101;
            } else {
                strA = b.a("Model downloading failed due to error code: ", i11, " from Android DownloadManager");
            }
        }
        return new MlKitException(strA, i10);
    }

    @Nullable
    public final synchronized Long e(@NonNull DownloadManager.Request request, @NonNull ModelInfo modelInfo) {
        DownloadManager downloadManager = this.f49460d;
        if (downloadManager == null) {
            return null;
        }
        long jEnqueue = downloadManager.enqueue(request);
        m.d("ModelDownloadManager", "Schedule a new downloading task: " + jEnqueue);
        this.f49464h.setDownloadingModelInfo(jEnqueue, modelInfo);
        this.f49463g.zzf(zzsk.zzg(), this.f49461e, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.SCHEDULED);
        return Long.valueOf(jEnqueue);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public Task<Void> ensureModelDownloaded() {
        MlKitException mlKitException;
        ModelInfo modelInfoA;
        this.f49463g.zzf(zzsk.zzg(), this.f49461e, zzmu.NO_ERROR, false, ModelType.UNKNOWN, zzna.EXPLICITLY_REQUESTED);
        Long lF = null;
        try {
            modelInfoA = a();
            mlKitException = null;
        } catch (MlKitException e5) {
            mlKitException = e5;
            modelInfoA = null;
        }
        try {
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            Long downloadingId = getDownloadingId();
            if (!modelExistsLocally() && (downloadingModelStatusCode == null || downloadingModelStatusCode.intValue() != 8)) {
                if (downloadingModelStatusCode != null && downloadingModelStatusCode.intValue() == 16) {
                    MlKitException mlKitExceptionD = d(downloadingId);
                    removeOrCancelDownload();
                    return Tasks.forException(mlKitExceptionD);
                }
                if (downloadingModelStatusCode == null || (!(downloadingModelStatusCode.intValue() == 4 || downloadingModelStatusCode.intValue() == 2 || downloadingModelStatusCode.intValue() == 1) || downloadingId == null || getDownloadingModelHash() == null)) {
                    if (modelInfoA != null) {
                        lF = f(modelInfoA, this.f49468l);
                    }
                    return lF == null ? Tasks.forException(new MlKitException("Failed to schedule the download task", 13, mlKitException)) : b(lF.longValue());
                }
                zzsh zzshVar = this.f49463g;
                zzry zzryVarZzg = zzsk.zzg();
                RemoteModel remoteModel = this.f49461e;
                zzshVar.zzf(zzryVarZzg, remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                return b(downloadingId.longValue());
            }
            if (modelInfoA != null) {
                Long lF2 = f(modelInfoA, this.f49468l);
                if (lF2 != null) {
                    return b(lF2.longValue());
                }
                m.i("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return Tasks.forResult(null);
        } catch (MlKitException e7) {
            return Tasks.forException(new MlKitException("Failed to ensure the model is downloaded.", 13, e7));
        }
    }

    @Nullable
    @WorkerThread
    public final synchronized Long f(@NonNull ModelInfo modelInfo, @NonNull DownloadConditions downloadConditions) throws MlKitException {
        try {
            Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
            String downloadingModelHash = this.f49464h.getDownloadingModelHash(this.f49461e);
            Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
            if (downloadingModelHash != null && downloadingModelHash.equals(modelInfo.getModelHash()) && downloadingModelStatusCode != null) {
                Integer downloadingModelStatusCode2 = getDownloadingModelStatusCode();
                if (downloadingModelStatusCode2 == null || (downloadingModelStatusCode2.intValue() != 8 && downloadingModelStatusCode2.intValue() != 16)) {
                    zzsh zzshVar = this.f49463g;
                    RemoteModel remoteModel = this.f49461e;
                    zzshVar.zzf(zzsk.zzg(), remoteModel, zzmu.NO_ERROR, false, remoteModel.getModelType(), zzna.DOWNLOADING);
                }
                m.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            GmsLogger gmsLogger = m;
            gmsLogger.d("ModelDownloadManager", "Need to download a new model.");
            removeOrCancelDownload();
            DownloadManager.Request request = new DownloadManager.Request(modelInfo.getModelUri());
            if (this.f49465i.modelExistsLocally(modelInfo.getModelNameForPersist(), modelInfo.getModelType())) {
                gmsLogger.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.f49463g.zzf(zzsk.zzg(), this.f49461e, zzmu.NO_ERROR, false, modelInfo.getModelType(), zzna.UPDATE_AVAILABLE);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                request.setRequiresCharging(downloadConditions.isChargingRequired());
            }
            if (downloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return e(request, modelInfo);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    @KeepForSdk
    public synchronized ParcelFileDescriptor getDownloadedFile() {
        DownloadManager downloadManager = this.f49460d;
        Long downloadingId = getDownloadingId();
        ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
        if (downloadManager == null || downloadingId == null) {
            return null;
        }
        try {
            parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(downloadingId.longValue());
        } catch (FileNotFoundException unused) {
            m.e("ModelDownloadManager", "Downloaded file is not found");
        }
        return parcelFileDescriptorOpenDownloadedFile;
    }

    @Nullable
    @KeepForSdk
    public synchronized Long getDownloadingId() {
        return this.f49464h.getDownloadingModelId(this.f49461e);
    }

    @Nullable
    @KeepForSdk
    public synchronized String getDownloadingModelHash() {
        return this.f49464h.getDownloadingModelHash(this.f49461e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000e, B:18:0x0043, B:35:0x006f, B:42:0x007c, B:41:0x0079, B:38:0x0074, B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:47:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #2 {all -> 0x003c, blocks: (B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:50:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    @Nullable
    @KeepForSdk
    public synchronized Integer getDownloadingModelStatusCode() {
        Integer numValueOf;
        DownloadManager downloadManager = this.f49460d;
        Long downloadingId = getDownloadingId();
        if (downloadManager != null && downloadingId != null) {
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(downloadingId.longValue()));
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")));
                    }
                    if (numValueOf == null) {
                        Integer num = (numValueOf.intValue() != 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8 || numValueOf.intValue() == 16) ? numValueOf : null;
                        cursorQuery.close();
                        return num;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            numValueOf = null;
            if (numValueOf == null) {
                if (numValueOf.intValue() != 2) {
                }
                cursorQuery.close();
                return num;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }

    @KeepForSdk
    public int getFailureReason(@NonNull Long l6) {
        int columnIndex;
        Cursor cursorQuery = null;
        DownloadManager downloadManager = this.f49460d;
        if (downloadManager != null && l6 != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l6.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }

    @KeepForSdk
    @WorkerThread
    public boolean isModelDownloadedAndValid() throws MlKitException {
        GmsLogger gmsLogger = m;
        try {
            if (modelExistsLocally()) {
                return true;
            }
        } catch (MlKitException unused) {
            gmsLogger.d("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long downloadingId = getDownloadingId();
        String downloadingModelHash = getDownloadingModelHash();
        if (downloadingId == null || downloadingModelHash == null) {
            gmsLogger.d("ModelDownloadManager", "No new model is downloading.");
            removeOrCancelDownload();
            return false;
        }
        Integer downloadingModelStatusCode = getDownloadingModelStatusCode();
        gmsLogger.d("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(downloadingModelStatusCode)));
        if (downloadingModelStatusCode != null) {
            return Objects.equal(downloadingModelStatusCode, 8) && zzi(downloadingModelHash) != null;
        }
        removeOrCancelDownload();
        return false;
    }

    @KeepForSdk
    public boolean modelExistsLocally() throws MlKitException {
        return this.f49465i.modelExistsLocally(this.f49461e.getUniqueModelNameForPersist(), this.f49462f);
    }

    @KeepForSdk
    public synchronized void removeOrCancelDownload() throws MlKitException {
        try {
            DownloadManager downloadManager = this.f49460d;
            Long downloadingId = getDownloadingId();
            if (downloadManager != null && downloadingId != null) {
                m.d("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(downloadingId.toString()));
                if (this.f49460d.remove(downloadingId.longValue()) <= 0) {
                    if (getDownloadingModelStatusCode() == null) {
                    }
                }
                ModelFileHelper modelFileHelper = this.f49465i;
                RemoteModel remoteModel = this.f49461e;
                modelFileHelper.deleteTempFilesInPrivateFolder(remoteModel.getUniqueModelNameForPersist(), remoteModel.getModelType());
                this.f49464h.clearDownloadingModelInfo(this.f49461e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @KeepForSdk
    public void setDownloadConditions(@NonNull DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions can not be null");
        this.f49468l = downloadConditions;
    }

    @KeepForSdk
    public synchronized void updateLatestModelHashAndType(@NonNull String str) throws MlKitException {
        this.f49464h.setLatestModelHash(this.f49461e, str);
        removeOrCancelDownload();
    }

    @Nullable
    public final File zzi(@NonNull String str) throws MlKitException {
        GmsLogger gmsLogger = m;
        gmsLogger.d("ModelDownloadManager", "Model downloaded successfully");
        this.f49463g.zzf(zzsk.zzg(), this.f49461e, zzmu.NO_ERROR, true, this.f49462f, zzna.SUCCEEDED);
        ParcelFileDescriptor downloadedFile = getDownloadedFile();
        if (downloadedFile == null) {
            removeOrCancelDownload();
            return null;
        }
        gmsLogger.d("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.f49467k.moveModelToPrivateFolder(downloadedFile, str, this.f49461e);
        } finally {
            removeOrCancelDownload();
        }
    }
}
