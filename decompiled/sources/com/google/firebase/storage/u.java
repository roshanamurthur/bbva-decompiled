package com.google.firebase.storage;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.UpdateMetadataNetworkRequest;
import org.json.JSONException;

/* JADX INFO: compiled from: UpdateMetadataTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final StorageReference f49196p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TaskCompletionSource<StorageMetadata> f49197q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final StorageMetadata f49198r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public StorageMetadata f49199s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ExponentialBackoffSender f49200t0;

    public u(@NonNull StorageReference storageReference, @NonNull TaskCompletionSource<StorageMetadata> taskCompletionSource, @NonNull StorageMetadata storageMetadata) {
        this.f49196p0 = storageReference;
        this.f49197q0 = taskCompletionSource;
        this.f49198r0 = storageMetadata;
        FirebaseStorage storage = storageReference.getStorage();
        this.f49200t0 = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxOperationRetryTimeMillis());
    }

    @Override // java.lang.Runnable
    public final void run() {
        StorageReference storageReference = this.f49196p0;
        UpdateMetadataNetworkRequest updateMetadataNetworkRequest = new UpdateMetadataNetworkRequest(storageReference.b(), storageReference.a(), this.f49198r0.a());
        this.f49200t0.sendWithExponentialBackoff(updateMetadataNetworkRequest);
        boolean zIsResultSuccess = updateMetadataNetworkRequest.isResultSuccess();
        TaskCompletionSource<StorageMetadata> taskCompletionSource = this.f49197q0;
        if (zIsResultSuccess) {
            try {
                this.f49199s0 = new StorageMetadata.Builder(updateMetadataNetworkRequest.getResultBody(), storageReference).build();
            } catch (JSONException e5) {
                updateMetadataNetworkRequest.getRawResult();
                taskCompletionSource.setException(StorageException.fromException(e5));
                return;
            }
        }
        if (taskCompletionSource != null) {
            updateMetadataNetworkRequest.completeTask(taskCompletionSource, this.f49199s0);
        }
    }
}
