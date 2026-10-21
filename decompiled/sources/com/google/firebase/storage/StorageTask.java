package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.StorageTask.ProvideError;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public abstract class StorageTask<ResultT extends ProvideError> extends ControllableTask<ResultT> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap<Integer, HashSet<Integer>> f49037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap<Integer, HashSet<Integer>> f49038j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnProgressListener<? super ResultT>, ResultT> f49043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnPausedListener<? super ResultT>, ResultT> f49044f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ResultT f49046h;
    protected final Object syncObject = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnSuccessListener<? super ResultT>, ResultT> f49039a = new t<>(this, 128, new vf.a(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnFailureListener, ResultT> f49040b = new t<>(this, 64, new com.google.android.material.navigation.c(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnCompleteListener<ResultT>, ResultT> f49041c = new t<>(this, 448, new y0.g(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public final t<OnCanceledListener, ResultT> f49042d = new t<>(this, 256, new y0.h(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f49045g = 1;

    public interface ProvideError {
        Exception getError();
    }

    public class SnapshotBase implements ProvideError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f49047a;

        public SnapshotBase(Exception exc) {
            if (exc != null) {
                this.f49047a = exc;
                return;
            }
            if (StorageTask.this.isCanceled()) {
                this.f49047a = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
            } else if (StorageTask.this.f49045g == 64) {
                this.f49047a = StorageException.fromErrorStatus(Status.RESULT_INTERNAL_ERROR);
            } else {
                this.f49047a = null;
            }
        }

        @Override // com.google.firebase.storage.StorageTask.ProvideError
        @Nullable
        public Exception getError() {
            return this.f49047a;
        }

        @NonNull
        public StorageReference getStorage() {
            return getTask().d();
        }

        @NonNull
        public StorageTask<ResultT> getTask() {
            return StorageTask.this;
        }
    }

    static {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        f49037i = map;
        HashMap<Integer, HashSet<Integer>> map2 = new HashMap<>();
        f49038j = map2;
        map.put(1, new HashSet<>(Arrays.asList(16, 256)));
        map.put(2, new HashSet<>(Arrays.asList(8, 32)));
        map.put(4, new HashSet<>(Arrays.asList(8, 32)));
        map.put(16, new HashSet<>(Arrays.asList(2, 256)));
        map.put(64, new HashSet<>(Arrays.asList(2, 256)));
        map2.put(1, new HashSet<>(Arrays.asList(2, 64)));
        map2.put(2, new HashSet<>(Arrays.asList(4, 64, 128)));
        map2.put(4, new HashSet<>(Arrays.asList(4, 64, 128)));
        map2.put(8, new HashSet<>(Arrays.asList(16, 64, 128)));
        map2.put(32, new HashSet<>(Arrays.asList(256, 64, 128)));
    }

    public StorageTask() {
        int i10 = 6;
        this.f49043e = new t<>(this, -465, new w4.a(i10));
        this.f49044f = new t<>(this, 16, new w4.b(i10));
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "INTERNAL_STATE_NOT_STARTED";
        }
        if (i10 == 2) {
            return "INTERNAL_STATE_QUEUED";
        }
        if (i10 == 4) {
            return "INTERNAL_STATE_IN_PROGRESS";
        }
        if (i10 == 8) {
            return "INTERNAL_STATE_PAUSING";
        }
        if (i10 == 16) {
            return "INTERNAL_STATE_PAUSED";
        }
        if (i10 == 32) {
            return "INTERNAL_STATE_CANCELING";
        }
        if (i10 == 64) {
            return "INTERNAL_STATE_FAILURE";
        }
        if (i10 != 128) {
            return i10 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED";
        }
        return "INTERNAL_STATE_SUCCESS";
    }

    public final void a() {
        if (isComplete() || isPaused() || this.f49045g == 2 || i(256, false)) {
            return;
        }
        i(64, false);
    }

    public final ResultT b() {
        ResultT resultt = this.f49046h;
        if (resultt != null) {
            return resultt;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f49046h == null) {
            this.f49046h = (ResultT) g();
        }
        return this.f49046h;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean cancel() {
        return j(new int[]{256, 32}, true);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(@NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f49041c.a(null, null, new k(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(@NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f49041c.a(null, null, new l(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @VisibleForTesting
    public abstract StorageReference d();

    @VisibleForTesting
    public final void e() {
        if (i(2, false)) {
            schedule();
        }
    }

    @VisibleForTesting
    public abstract void f();

    @NonNull
    @VisibleForTesting
    public final ResultT g() {
        ResultT resultt;
        synchronized (this.syncObject) {
            resultt = (ResultT) h();
        }
        return resultt;
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    public Exception getException() {
        if (b() == null) {
            return null;
        }
        return b().getError();
    }

    @NonNull
    public ResultT getSnapshot() {
        return (ResultT) g();
    }

    @NonNull
    @VisibleForTesting
    public abstract ResultT h();

    @VisibleForTesting
    public final boolean i(int i10, boolean z10) {
        return j(new int[]{i10}, z10);
    }

    @Override // com.google.firebase.storage.CancellableTask, com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        return this.f49045g == 256;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        return (this.f49045g & 448) != 0;
    }

    @Override // com.google.firebase.storage.CancellableTask
    public boolean isInProgress() {
        return (this.f49045g & (-465)) != 0;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean isPaused() {
        return (this.f49045g & 16) != 0;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        return (this.f49045g & 128) != 0;
    }

    @VisibleForTesting
    public final boolean j(int[] iArr, boolean z10) {
        String strSubstring;
        HashMap<Integer, HashSet<Integer>> map = z10 ? f49037i : f49038j;
        synchronized (this.syncObject) {
            try {
                for (int i10 : iArr) {
                    HashSet<Integer> hashSet = map.get(Integer.valueOf(this.f49045g));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i10))) {
                        this.f49045g = i10;
                        int i11 = this.f49045g;
                        if (i11 == 2) {
                            q.f49184c.a(this);
                            onQueued();
                        } else if (i11 == 4) {
                            onProgress();
                        } else if (i11 == 16) {
                            onPaused();
                        } else if (i11 == 64) {
                            onFailure();
                        } else if (i11 == 128) {
                            onSuccess();
                        } else if (i11 == 256) {
                            onCanceled();
                        }
                        this.f49039a.b();
                        this.f49040b.b();
                        this.f49042d.b();
                        this.f49041c.b();
                        this.f49044f.b();
                        this.f49043e.b();
                        return true;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unable to change internal state to: ");
                if (iArr.length == 0) {
                    strSubstring = "";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    for (int i12 : iArr) {
                        sb3.append(c(i12));
                        sb3.append(", ");
                    }
                    strSubstring = sb3.substring(0, sb3.length() - 2);
                }
                sb2.append(strSubstring);
                sb2.append(" isUser: ");
                sb2.append(z10);
                sb2.append(" from state:");
                sb2.append(c(this.f49045g));
                Log.w("StorageTask", sb2.toString());
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(@NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f49039a.a(null, null, new m(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean pause() {
        return j(new int[]{16, 8}, true);
    }

    @NonNull
    public StorageTask<ResultT> removeOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.f49042d.c(onCanceledListener);
        return this;
    }

    @NonNull
    public StorageTask<ResultT> removeOnCompleteListener(@NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.f49041c.c(onCompleteListener);
        return this;
    }

    @NonNull
    public StorageTask<ResultT> removeOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.f49040b.c(onFailureListener);
        return this;
    }

    @NonNull
    public StorageTask<ResultT> removeOnPausedListener(@NonNull OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        this.f49044f.c(onPausedListener);
        return this;
    }

    @NonNull
    public StorageTask<ResultT> removeOnProgressListener(@NonNull OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        this.f49043e.c(onProgressListener);
        return this;
    }

    @NonNull
    public StorageTask<ResultT> removeOnSuccessListener(@NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.f49039a.c(onSuccessListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    public boolean resume() {
        if (!i(2, true)) {
            return false;
        }
        resetState();
        schedule();
        return true;
    }

    @VisibleForTesting
    public abstract void schedule();

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public ResultT getResult() {
        if (b() != null) {
            Exception error = b().getError();
            if (error == null) {
                return (ResultT) b();
            }
            throw new RuntimeExecutionException(error);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.f49042d.a(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCompleteListener(@NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.f49041c.a(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.f49040b.a(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    @NonNull
    public StorageTask<ResultT> addOnPausedListener(@NonNull OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        this.f49044f.a(null, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    @NonNull
    public StorageTask<ResultT> addOnProgressListener(@NonNull OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        this.f49043e.a(null, null, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnSuccessListener(@NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.f49039a.a(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> continueWith(@NonNull Executor executor, @NonNull Continuation<ResultT, ContinuationResultT> continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f49041c.a(null, executor, new k(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(executor);
        this.f49042d.a(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(executor);
        this.f49041c.a(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(executor);
        this.f49040b.a(null, executor, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    @NonNull
    public StorageTask<ResultT> addOnPausedListener(@NonNull Executor executor, @NonNull OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        Preconditions.checkNotNull(executor);
        this.f49044f.a(null, executor, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    @NonNull
    public StorageTask<ResultT> addOnProgressListener(@NonNull Executor executor, @NonNull OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        Preconditions.checkNotNull(executor);
        this.f49043e.a(null, executor, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSuccessListener);
        this.f49039a.a(null, executor, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> continueWithTask(@NonNull Executor executor, @NonNull Continuation<ResultT, Task<ContinuationResultT>> continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f49041c.a(null, executor, new l(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <ContinuationResultT> Task<ContinuationResultT> onSuccessTask(@NonNull Executor executor, @NonNull SuccessContinuation<ResultT, ContinuationResultT> successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f49039a.a(null, executor, new m(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public <X extends Throwable> ResultT getResult(@NonNull Class<X> cls) throws Throwable {
        if (b() != null) {
            if (!cls.isInstance(b().getError())) {
                Exception error = b().getError();
                if (error == null) {
                    return (ResultT) b();
                }
                throw new RuntimeExecutionException(error);
            }
            throw cls.cast(b().getError());
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(activity);
        this.f49042d.a(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<ResultT> onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(activity);
        this.f49041c.a(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(activity);
        this.f49040b.a(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.firebase.storage.ControllableTask
    @NonNull
    public StorageTask<ResultT> addOnPausedListener(@NonNull Activity activity, @NonNull OnPausedListener<? super ResultT> onPausedListener) {
        Preconditions.checkNotNull(onPausedListener);
        Preconditions.checkNotNull(activity);
        this.f49044f.a(activity, null, onPausedListener);
        return this;
    }

    @Override // com.google.firebase.storage.CancellableTask
    @NonNull
    public StorageTask<ResultT> addOnProgressListener(@NonNull Activity activity, @NonNull OnProgressListener<? super ResultT> onProgressListener) {
        Preconditions.checkNotNull(onProgressListener);
        Preconditions.checkNotNull(activity);
        this.f49043e.a(activity, null, onProgressListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public StorageTask<ResultT> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super ResultT> onSuccessListener) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(onSuccessListener);
        this.f49039a.a(activity, null, onSuccessListener);
        return this;
    }

    public void onCanceled() {
    }

    public void onFailure() {
    }

    public void onPaused() {
    }

    public void onProgress() {
    }

    public void onQueued() {
    }

    public void onSuccess() {
    }

    @VisibleForTesting
    public void resetState() {
    }
}
