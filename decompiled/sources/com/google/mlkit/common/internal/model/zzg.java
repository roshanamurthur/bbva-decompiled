package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzlm;
import com.google.android.gms.internal.mlkit_common.zzmh;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzne;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import com.google.mlkit.common.sdkinternal.model.ModelInfoRetrieverInterop;
import com.google.mlkit.common.sdkinternal.model.RemoteModelDownloadManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelFileManager;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzg implements RemoteModelManagerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MlKitContext f49377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzsh f49378b;

    public zzg(MlKitContext mlKitContext) {
        zzsh zzshVarZzb = zzss.zzb("common");
        this.f49377a = mlKitContext;
        this.f49378b = zzshVarZzb;
    }

    public final RemoteModelDownloadManager a(CustomRemoteModel customRemoteModel) {
        MlKitContext mlKitContext = this.f49377a;
        return RemoteModelDownloadManager.getInstance(mlKitContext, customRemoteModel, new ModelFileHelper(mlKitContext), new RemoteModelFileManager(this.f49377a, customRemoteModel, null, new ModelFileHelper(mlKitContext), new zza(mlKitContext, customRemoteModel.getUniqueModelNameForPersist())), (ModelInfoRetrieverInterop) mlKitContext.get(ModelInfoRetrieverInterop.class));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task deleteDownloadedModel(RemoteModel remoteModel) {
        final CustomRemoteModel customRemoteModel = (CustomRemoteModel) remoteModel;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.mlkit.common.internal.model.zzb
            @Override // java.lang.Runnable
            public final void run() {
                zzg zzgVar = this.zza;
                CustomRemoteModel customRemoteModel2 = customRemoteModel;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                zzgVar.getClass();
                try {
                    new ModelFileHelper(zzgVar.f49377a).deleteAllModels(ModelType.CUSTOM, (String) Preconditions.checkNotNull(customRemoteModel2.getModelName()));
                    taskCompletionSource2.setResult(null);
                } catch (RuntimeException e5) {
                    taskCompletionSource2.setException(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e5));
                }
            }
        });
        return taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzg zzgVar = this.zza;
                zzgVar.getClass();
                boolean zIsSuccessful = task.isSuccessful();
                zzmw zzmwVar = new zzmw();
                zzlm zzlmVar = new zzlm();
                zzlmVar.zzb(zzne.CUSTOM);
                zzlmVar.zza(Boolean.valueOf(zIsSuccessful));
                zzmwVar.zze(zzlmVar.zzc());
                zzgVar.f49378b.zzd(zzsk.zzf(zzmwVar), zzmv.REMOTE_MODEL_DELETE_ON_DEVICE);
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task download(RemoteModel remoteModel, DownloadConditions downloadConditions) {
        final RemoteModelDownloadManager remoteModelDownloadManagerA = a((CustomRemoteModel) remoteModel);
        remoteModelDownloadManagerA.setDownloadConditions(downloadConditions);
        return Tasks.forResult(null).onSuccessTask(MLTaskExecutor.workerThreadExecutor(), new SuccessContinuation() { // from class: com.google.mlkit.common.internal.model.zzd
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return remoteModelDownloadManagerA.ensureModelDownloaded();
            }
        });
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final Task<Set<CustomRemoteModel>> getDownloadedModels() {
        return Tasks.forException(new MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    @Override // com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface
    public final /* bridge */ /* synthetic */ Task isModelDownloaded(RemoteModel remoteModel) {
        final CustomRemoteModel customRemoteModel = (CustomRemoteModel) remoteModel;
        return MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.mlkit.common.internal.model.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.zza.a(customRemoteModel).isModelDownloadedAndValid());
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.mlkit.common.internal.model.zzf
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzg zzgVar = this.zza;
                zzgVar.getClass();
                boolean zBooleanValue = ((Boolean) task.getResult()).booleanValue();
                zzmw zzmwVar = new zzmw();
                zzmh zzmhVar = new zzmh();
                zzmhVar.zzb(zzne.CUSTOM);
                zzmhVar.zza(Boolean.valueOf(zBooleanValue));
                zzmwVar.zzg(zzmhVar.zzc());
                zzgVar.f49378b.zzd(zzsk.zzf(zzmwVar), zzmv.REMOTE_MODEL_IS_DOWNLOADED);
            }
        });
    }
}
