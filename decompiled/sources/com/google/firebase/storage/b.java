package com.google.firebase.storage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.DeleteNetworkRequest;

/* JADX INFO: compiled from: DeleteStorageTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public StorageReference f49096p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TaskCompletionSource<Void> f49097q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ExponentialBackoffSender f49098r0;

    @Override // java.lang.Runnable
    public final void run() {
        StorageReference storageReference = this.f49096p0;
        DeleteNetworkRequest deleteNetworkRequest = new DeleteNetworkRequest(storageReference.b(), storageReference.a());
        this.f49098r0.sendWithExponentialBackoff(deleteNetworkRequest);
        deleteNetworkRequest.completeTask(this.f49097q0, null);
    }
}
