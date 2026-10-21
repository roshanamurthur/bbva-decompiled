package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkForegroundRunnable implements Runnable {
    public static final String v0 = Logger.tagWithPrefix("WorkForegroundRunnable");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SettableFuture<Void> f24652p0 = SettableFuture.create();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f24653q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WorkSpec f24654r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ListenableWorker f24655s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ForegroundUpdater f24656t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final TaskExecutor f24657u0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f24658p0;

        public a(SettableFuture settableFuture) {
            this.f24658p0 = settableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24658p0.setFuture(WorkForegroundRunnable.this.f24655s0.getForegroundInfoAsync());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f24660p0;

        public b(SettableFuture settableFuture) {
            this.f24660p0 = settableFuture;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
            try {
                ForegroundInfo foregroundInfo = (ForegroundInfo) this.f24660p0.get();
                if (foregroundInfo == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", workForegroundRunnable.f24654r0.workerClassName));
                }
                Logger.get().debug(WorkForegroundRunnable.v0, String.format("Updating notification for %s", workForegroundRunnable.f24654r0.workerClassName), new Throwable[0]);
                workForegroundRunnable.f24655s0.setRunInForeground(true);
                workForegroundRunnable.f24652p0.setFuture(workForegroundRunnable.f24656t0.setForegroundAsync(workForegroundRunnable.f24653q0, workForegroundRunnable.f24655s0.getId(), foregroundInfo));
            } catch (Throwable th2) {
                workForegroundRunnable.f24652p0.setException(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public WorkForegroundRunnable(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull ForegroundUpdater foregroundUpdater, @NonNull TaskExecutor taskExecutor) {
        this.f24653q0 = context;
        this.f24654r0 = workSpec;
        this.f24655s0 = listenableWorker;
        this.f24656t0 = foregroundUpdater;
        this.f24657u0 = taskExecutor;
    }

    @NonNull
    public ListenableFuture<Void> getFuture() {
        return this.f24652p0;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f24654r0.expedited || BuildCompat.isAtLeastS()) {
            this.f24652p0.set(null);
            return;
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        TaskExecutor taskExecutor = this.f24657u0;
        taskExecutor.getMainThreadExecutor().execute(new a(settableFutureCreate));
        settableFutureCreate.addListener(new b(settableFutureCreate), taskExecutor.getMainThreadExecutor());
    }
}
