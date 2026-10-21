package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    public static final String E0 = Logger.tagWithPrefix("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final WorkerParameters f24715u0;
    public final Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile boolean f24716w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final SettableFuture<ListenableWorker.Result> f24717x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public ListenableWorker f24718y0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String string = constraintTrackingWorker.getInputData().getString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME);
            if (TextUtils.isEmpty(string)) {
                Logger.get().error(ConstraintTrackingWorker.E0, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.failure());
                return;
            }
            ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = constraintTrackingWorker.getWorkerFactory().createWorkerWithDefaultFallback(constraintTrackingWorker.getApplicationContext(), string, constraintTrackingWorker.f24715u0);
            constraintTrackingWorker.f24718y0 = listenableWorkerCreateWorkerWithDefaultFallback;
            if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
                Logger.get().debug(ConstraintTrackingWorker.E0, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.failure());
                return;
            }
            WorkSpec workSpec = constraintTrackingWorker.getWorkDatabase().workSpecDao().getWorkSpec(constraintTrackingWorker.getId().toString());
            if (workSpec == null) {
                constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.failure());
                return;
            }
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            workConstraintsTracker.replace(Collections.singletonList(workSpec));
            if (!workConstraintsTracker.areAllConstraintsMet(constraintTrackingWorker.getId().toString())) {
                Logger.get().debug(ConstraintTrackingWorker.E0, String.format("Constraints not met for delegate %s. Requesting retry.", string), new Throwable[0]);
                constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.retry());
                return;
            }
            Logger.get().debug(ConstraintTrackingWorker.E0, String.format("Constraints met for delegate %s", string), new Throwable[0]);
            try {
                ListenableFuture<ListenableWorker.Result> listenableFutureStartWork = constraintTrackingWorker.f24718y0.startWork();
                listenableFutureStartWork.addListener(new t3.a(constraintTrackingWorker, listenableFutureStartWork), constraintTrackingWorker.getBackgroundExecutor());
            } catch (Throwable th2) {
                Logger logger = Logger.get();
                String str = ConstraintTrackingWorker.E0;
                logger.debug(str, String.format("Delegated worker %s threw exception in startWork.", string), th2);
                synchronized (constraintTrackingWorker.v0) {
                    try {
                        if (constraintTrackingWorker.f24716w0) {
                            Logger.get().debug(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.retry());
                        } else {
                            constraintTrackingWorker.f24717x0.set(ListenableWorker.Result.failure());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f24715u0 = workerParameters;
        this.v0 = new Object();
        this.f24716w0 = false;
        this.f24717x0 = SettableFuture.create();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public ListenableWorker getDelegate() {
        return this.f24718y0;
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public TaskExecutor getTaskExecutor() {
        return WorkManagerImpl.getInstance(getApplicationContext()).getWorkTaskExecutor();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public WorkDatabase getWorkDatabase() {
        return WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f24718y0;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        Logger.get().debug(E0, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.v0) {
            this.f24716w0 = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f24718y0;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f24718y0.stop();
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ListenableWorker.Result> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f24717x0;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NonNull List<String> list) {
    }
}
