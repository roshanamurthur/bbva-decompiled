package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.ListNetworkRequest;
import org.json.JSONException;

/* JADX INFO: compiled from: ListTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final StorageReference f49110p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TaskCompletionSource<ListResult> f49111q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ExponentialBackoffSender f49112r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final String f49113s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final Integer f49114t0;

    public f(@NonNull StorageReference storageReference, @Nullable Integer num, @Nullable String str, @NonNull TaskCompletionSource<ListResult> taskCompletionSource) {
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(taskCompletionSource);
        this.f49110p0 = storageReference;
        this.f49114t0 = num;
        this.f49113s0 = str;
        this.f49111q0 = taskCompletionSource;
        FirebaseStorage storage = storageReference.getStorage();
        this.f49112r0 = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), storage.b(), storage.a(), storage.getMaxDownloadRetryTimeMillis());
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListResult listResultA;
        StorageReference storageReference = this.f49110p0;
        ListNetworkRequest listNetworkRequest = new ListNetworkRequest(storageReference.b(), storageReference.a(), this.f49114t0, this.f49113s0);
        this.f49112r0.sendWithExponentialBackoff(listNetworkRequest);
        boolean zIsResultSuccess = listNetworkRequest.isResultSuccess();
        TaskCompletionSource<ListResult> taskCompletionSource = this.f49111q0;
        if (zIsResultSuccess) {
            try {
                listResultA = ListResult.a(storageReference.getStorage(), listNetworkRequest.getResultBody());
            } catch (JSONException e5) {
                listNetworkRequest.getRawResult();
                taskCompletionSource.setException(StorageException.fromException(e5));
                return;
            }
        } else {
            listResultA = null;
        }
        if (taskCompletionSource != null) {
            listNetworkRequest.completeTask(taskCompletionSource, listResultA);
        }
    }
}
