package com.google.firebase.storage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetMetadataNetworkRequest;
import org.json.JSONException;

/* JADX INFO: compiled from: GetMetadataTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public StorageReference f49106p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TaskCompletionSource<StorageMetadata> f49107q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public StorageMetadata f49108r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ExponentialBackoffSender f49109s0;

    @Override // java.lang.Runnable
    public final void run() {
        StorageReference storageReference = this.f49106p0;
        GetMetadataNetworkRequest getMetadataNetworkRequest = new GetMetadataNetworkRequest(storageReference.b(), storageReference.a());
        this.f49109s0.sendWithExponentialBackoff(getMetadataNetworkRequest);
        boolean zIsResultSuccess = getMetadataNetworkRequest.isResultSuccess();
        TaskCompletionSource<StorageMetadata> taskCompletionSource = this.f49107q0;
        if (zIsResultSuccess) {
            try {
                this.f49108r0 = new StorageMetadata.Builder(getMetadataNetworkRequest.getResultBody(), storageReference).build();
            } catch (JSONException e5) {
                getMetadataNetworkRequest.getRawResult();
                taskCompletionSource.setException(StorageException.fromException(e5));
                return;
            }
        }
        if (taskCompletionSource != null) {
            getMetadataNetworkRequest.completeTask(taskCompletionSource, this.f49108r0);
        }
    }
}
