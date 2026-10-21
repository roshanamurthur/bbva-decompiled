package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StorageTask f49156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Continuation f49157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f49158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f49159d;

    public /* synthetic */ l(StorageTask storageTask, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f49156a = storageTask;
        this.f49157b = continuation;
        this.f49158c = taskCompletionSource;
        this.f49159d = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Continuation continuation = this.f49157b;
        TaskCompletionSource taskCompletionSource = this.f49158c;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        StorageTask storageTask = this.f49156a;
        storageTask.getClass();
        try {
            Task task2 = (Task) continuation.then(storageTask);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new com.dasnano.vdphotoselfiecapture.other.d(taskCompletionSource, 1));
            task2.addOnFailureListener(new com.dasnano.vdphotoselfiecapture.other.e(taskCompletionSource, 2));
            CancellationTokenSource cancellationTokenSource = this.f49159d;
            Objects.requireNonNull(cancellationTokenSource);
            task2.addOnCanceledListener(new n(cancellationTokenSource));
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
