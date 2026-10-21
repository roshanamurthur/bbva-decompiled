package com.google.firebase.storage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StorageTask f49144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Continuation f49145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f49146c;

    public /* synthetic */ k(StorageTask storageTask, Continuation continuation, TaskCompletionSource taskCompletionSource) {
        this.f49144a = storageTask;
        this.f49145b = continuation;
        this.f49146c = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Continuation continuation = this.f49145b;
        TaskCompletionSource taskCompletionSource = this.f49146c;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        StorageTask storageTask = this.f49144a;
        storageTask.getClass();
        try {
            Object objThen = continuation.then(storageTask);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            taskCompletionSource.setResult(objThen);
        } catch (RuntimeExecutionException e5) {
            if (e5.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e5.getCause());
            } else {
                taskCompletionSource.setException(e5);
            }
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }
}
