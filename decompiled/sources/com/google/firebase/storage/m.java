package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SuccessContinuation f49160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f49161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f49162c;

    public /* synthetic */ m(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f49160a = successContinuation;
        this.f49161b = taskCompletionSource;
        this.f49162c = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SuccessContinuation successContinuation = this.f49160a;
        final TaskCompletionSource taskCompletionSource = this.f49161b;
        StorageTask.ProvideError provideError = (StorageTask.ProvideError) obj;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        try {
            Task taskThen = successContinuation.then(provideError);
            Objects.requireNonNull(taskCompletionSource);
            taskThen.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.firebase.storage.o
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj2) {
                    taskCompletionSource.setResult(obj2);
                }
            });
            taskThen.addOnFailureListener(new OnFailureListener() { // from class: com.google.firebase.storage.p
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    taskCompletionSource.setException(exc);
                }
            });
            CancellationTokenSource cancellationTokenSource = this.f49162c;
            Objects.requireNonNull(cancellationTokenSource);
            taskThen.addOnCanceledListener(new n(cancellationTokenSource));
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
