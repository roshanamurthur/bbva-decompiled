package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialExecutor f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f24712b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f24713c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            WorkManagerTaskExecutor.this.postToMainThread(runnable);
        }
    }

    public WorkManagerTaskExecutor(@NonNull Executor executor) {
        this.f24711a = new SerialExecutor(executor);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void executeOnBackgroundThread(Runnable runnable) {
        this.f24711a.execute(runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    @NonNull
    public SerialExecutor getBackgroundExecutor() {
        return this.f24711a;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public Executor getMainThreadExecutor() {
        return this.f24713c;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void postToMainThread(Runnable runnable) {
        this.f24712b.post(runnable);
    }
}
