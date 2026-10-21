package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.h0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inject.Provider;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.model.RemoteModelManagerInterface;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public class RemoteModelManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f49398a = new HashMap();

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    @KeepForSdk
    public static class RemoteModelManagerRegistration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f49399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Provider f49400b;

        @KeepForSdk
        public <RemoteT extends RemoteModel> RemoteModelManagerRegistration(@NonNull Class<RemoteT> cls, @NonNull Provider<? extends RemoteModelManagerInterface<RemoteT>> provider) {
            this.f49399a = cls;
            this.f49400b = provider;
        }
    }

    @KeepForSdk
    public RemoteModelManager(@NonNull Set<RemoteModelManagerRegistration> set) {
        for (RemoteModelManagerRegistration remoteModelManagerRegistration : set) {
            this.f49398a.put(remoteModelManagerRegistration.f49399a, remoteModelManagerRegistration.f49400b);
        }
    }

    @NonNull
    public static synchronized RemoteModelManager getInstance() {
        return (RemoteModelManager) MlKitContext.getInstance().get(RemoteModelManager.class);
    }

    public final RemoteModelManagerInterface a(Class cls) {
        return (RemoteModelManagerInterface) ((Provider) Preconditions.checkNotNull((Provider) this.f49398a.get(cls))).get();
    }

    @NonNull
    public Task<Void> deleteDownloadedModel(@NonNull RemoteModel remoteModel) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return a(remoteModel.getClass()).deleteDownloadedModel(remoteModel);
    }

    @NonNull
    public Task<Void> download(@NonNull RemoteModel remoteModel, @NonNull DownloadConditions downloadConditions) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        Preconditions.checkNotNull(downloadConditions, "DownloadConditions cannot be null");
        return this.f49398a.containsKey(remoteModel.getClass()) ? a(remoteModel.getClass()).download(remoteModel, downloadConditions) : Tasks.forException(new MlKitException(h0.b("Feature model '", remoteModel.getClass().getSimpleName(), "' doesn't have a corresponding modelmanager registered."), 13));
    }

    @NonNull
    public <T extends RemoteModel> Task<Set<T>> getDownloadedModels(@NonNull Class<T> cls) {
        return ((RemoteModelManagerInterface) ((Provider) Preconditions.checkNotNull((Provider) this.f49398a.get(cls))).get()).getDownloadedModels();
    }

    @NonNull
    public Task<Boolean> isModelDownloaded(@NonNull RemoteModel remoteModel) {
        Preconditions.checkNotNull(remoteModel, "RemoteModel cannot be null");
        return a(remoteModel.getClass()).isModelDownloaded(remoteModel);
    }
}
