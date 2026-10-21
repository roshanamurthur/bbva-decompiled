package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import n3.b;
import n3.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkerWrapper implements Runnable {
    public static final String N0 = Logger.tagWithPrefix("WorkerWrapper");
    public WorkDatabase E0;
    public WorkSpecDao F0;
    public DependencyDao G0;
    public WorkTagDao H0;
    public List<String> I0;
    public String J0;

    @NonNull
    public SettableFuture<Boolean> K0;

    @Nullable
    public ListenableFuture<ListenableWorker.Result> L0;
    public volatile boolean M0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Context f24407p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f24408q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public List<Scheduler> f24409r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public WorkerParameters.RuntimeExtras f24410s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public WorkSpec f24411t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ListenableWorker f24412u0;
    public TaskExecutor v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    public ListenableWorker.Result f24413w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Configuration f24414x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ForegroundProcessor f24415y0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f24416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ListenableWorker f24417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ForegroundProcessor f24418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final TaskExecutor f24419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public final Configuration f24420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public final WorkDatabase f24421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public final String f24422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<Scheduler> f24423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public WorkerParameters.RuntimeExtras f24424i = new WorkerParameters.RuntimeExtras();

        public Builder(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull ForegroundProcessor foregroundProcessor, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.f24416a = context.getApplicationContext();
            this.f24419d = taskExecutor;
            this.f24418c = foregroundProcessor;
            this.f24420e = configuration;
            this.f24421f = workDatabase;
            this.f24422g = str;
        }

        @NonNull
        public WorkerWrapper build() {
            WorkerWrapper workerWrapper = new WorkerWrapper();
            workerWrapper.f24413w0 = ListenableWorker.Result.failure();
            workerWrapper.K0 = SettableFuture.create();
            workerWrapper.L0 = null;
            workerWrapper.f24407p0 = this.f24416a;
            workerWrapper.v0 = this.f24419d;
            workerWrapper.f24415y0 = this.f24418c;
            workerWrapper.f24408q0 = this.f24422g;
            workerWrapper.f24409r0 = this.f24423h;
            workerWrapper.f24410s0 = this.f24424i;
            workerWrapper.f24412u0 = this.f24417b;
            workerWrapper.f24414x0 = this.f24420e;
            WorkDatabase workDatabase = this.f24421f;
            workerWrapper.E0 = workDatabase;
            workerWrapper.F0 = workDatabase.workSpecDao();
            workerWrapper.G0 = workDatabase.dependencyDao();
            workerWrapper.H0 = workDatabase.workTagDao();
            return workerWrapper;
        }

        @NonNull
        public Builder withRuntimeExtras(@Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.f24424i = runtimeExtras;
            }
            return this;
        }

        @NonNull
        public Builder withSchedulers(@NonNull List<Scheduler> list) {
            this.f24423h = list;
            return this;
        }

        @NonNull
        @VisibleForTesting
        public Builder withWorker(@NonNull ListenableWorker listenableWorker) {
            this.f24417b = listenableWorker;
            return this;
        }
    }

    public final void a(ListenableWorker.Result result) {
        boolean z10 = result instanceof ListenableWorker.Result.Success;
        String str = N0;
        if (!z10) {
            if (result instanceof ListenableWorker.Result.Retry) {
                Logger.get().info(str, String.format("Worker result RETRY for %s", this.J0), new Throwable[0]);
                d();
                return;
            }
            Logger.get().info(str, String.format("Worker result FAILURE for %s", this.J0), new Throwable[0]);
            if (this.f24411t0.isPeriodic()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        Logger.get().info(str, String.format("Worker result SUCCESS for %s", this.J0), new Throwable[0]);
        if (this.f24411t0.isPeriodic()) {
            e();
            return;
        }
        DependencyDao dependencyDao = this.G0;
        String str2 = this.f24408q0;
        WorkSpecDao workSpecDao = this.F0;
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            workSpecDao.setState(WorkInfo.State.SUCCEEDED, str2);
            workSpecDao.setOutput(str2, ((ListenableWorker.Result.Success) this.f24413w0).getOutputData());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : dependencyDao.getDependentWorkIds(str2)) {
                if (workSpecDao.getState(str3) == WorkInfo.State.BLOCKED && dependencyDao.hasCompletedAllPrerequisites(str3)) {
                    Logger.get().info(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, str3);
                    workSpecDao.setPeriodStartTime(str3, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkSpecDao workSpecDao = this.F0;
            if (workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                workSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.G0.getDependentWorkIds(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f24408q0;
        WorkDatabase workDatabase = this.E0;
        if (!zI) {
            workDatabase.beginTransaction();
            try {
                WorkInfo.State state = this.F0.getState(str);
                workDatabase.workProgressDao().delete(str);
                if (state == null) {
                    f(false);
                } else if (state == WorkInfo.State.RUNNING) {
                    a(this.f24413w0);
                } else if (!state.isFinished()) {
                    d();
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
        List<Scheduler> list = this.f24409r0;
        if (list != null) {
            Iterator<Scheduler> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(str);
            }
            Schedulers.schedule(this.f24414x0, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f24408q0;
        WorkSpecDao workSpecDao = this.F0;
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
            workSpecDao.setPeriodStartTime(str, System.currentTimeMillis());
            workSpecDao.markWorkSpecScheduled(str, -1L);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(true);
        }
    }

    public final void e() {
        String str = this.f24408q0;
        WorkSpecDao workSpecDao = this.F0;
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            workSpecDao.setPeriodStartTime(str, System.currentTimeMillis());
            workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
            workSpecDao.resetWorkSpecRunAttemptCount(str);
            workSpecDao.markWorkSpecScheduled(str, -1L);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final void f(boolean z10) {
        ListenableWorker listenableWorker;
        WorkSpecDao workSpecDao = this.F0;
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            if (!workDatabase.workSpecDao().hasUnfinishedWork()) {
                PackageManagerHelper.setComponentEnabled(this.f24407p0, RescheduleReceiver.class, false);
            }
            String str = this.f24408q0;
            if (z10) {
                workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                workSpecDao.markWorkSpecScheduled(str, -1L);
            }
            if (this.f24411t0 != null && (listenableWorker = this.f24412u0) != null && listenableWorker.isRunInForeground()) {
                this.f24415y0.stopForeground(str);
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            this.K0.set(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    public final void g() {
        WorkSpecDao workSpecDao = this.F0;
        String str = this.f24408q0;
        WorkInfo.State state = workSpecDao.getState(str);
        WorkInfo.State state2 = WorkInfo.State.RUNNING;
        String str2 = N0;
        if (state == state2) {
            Logger.get().debug(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            Logger.get().debug(str2, String.format("Status for %s is %s; not doing any work", str, state), new Throwable[0]);
            f(false);
        }
    }

    @NonNull
    public ListenableFuture<Boolean> getFuture() {
        return this.K0;
    }

    @VisibleForTesting
    public final void h() {
        String str = this.f24408q0;
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            b(str);
            this.F0.setOutput(str, ((ListenableWorker.Result.Failure) this.f24413w0).getOutputData());
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.M0) {
            return false;
        }
        Logger.get().debug(N0, String.format("Work interrupted for %s", this.J0), new Throwable[0]);
        WorkInfo.State state = this.F0.getState(this.f24408q0);
        if (state == null) {
            f(false);
        } else {
            f(!state.isFinished());
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void interrupt() {
        boolean zIsDone;
        this.M0 = true;
        i();
        ListenableFuture<ListenableWorker.Result> listenableFuture = this.L0;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            this.L0.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f24412u0;
        if (listenableWorker == null || zIsDone) {
            Logger.get().debug(N0, String.format("WorkSpec %s is already done. Not interrupting.", this.f24411t0), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        Data dataMerge;
        WorkTagDao workTagDao = this.H0;
        String str = this.f24408q0;
        List<String> tagsForWorkSpecId = workTagDao.getTagsForWorkSpecId(str);
        this.I0 = tagsForWorkSpecId;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(str);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str2 : tagsForWorkSpecId) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.J0 = sb2.toString();
        WorkSpecDao workSpecDao = this.F0;
        if (i()) {
            return;
        }
        WorkDatabase workDatabase = this.E0;
        workDatabase.beginTransaction();
        try {
            WorkSpec workSpec = workSpecDao.getWorkSpec(str);
            this.f24411t0 = workSpec;
            String str3 = N0;
            if (workSpec == null) {
                Logger.get().error(str3, String.format("Didn't find WorkSpec for id %s", str), new Throwable[0]);
                f(false);
                workDatabase.setTransactionSuccessful();
            } else {
                WorkInfo.State state = workSpec.state;
                WorkInfo.State state2 = WorkInfo.State.ENQUEUED;
                if (state == state2) {
                    if (workSpec.isPeriodic() || this.f24411t0.isBackedOff()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        WorkSpec workSpec2 = this.f24411t0;
                        if (workSpec2.periodStartTime != 0 && jCurrentTimeMillis < workSpec2.calculateNextRunTime()) {
                            Logger.get().debug(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.f24411t0.workerClassName), new Throwable[0]);
                            f(true);
                            workDatabase.setTransactionSuccessful();
                        }
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    boolean zIsPeriodic = this.f24411t0.isPeriodic();
                    Configuration configuration = this.f24414x0;
                    if (zIsPeriodic) {
                        dataMerge = this.f24411t0.input;
                    } else {
                        InputMerger inputMergerCreateInputMergerWithDefaultFallback = configuration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.f24411t0.inputMergerClassName);
                        if (inputMergerCreateInputMergerWithDefaultFallback == null) {
                            Logger.get().error(str3, String.format("Could not create Input Merger %s", this.f24411t0.inputMergerClassName), new Throwable[0]);
                            h();
                            return;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(this.f24411t0.input);
                            arrayList.addAll(workSpecDao.getInputsFromPrerequisites(str));
                            dataMerge = inputMergerCreateInputMergerWithDefaultFallback.merge(arrayList);
                        }
                    }
                    Data data = dataMerge;
                    UUID uuidFromString = UUID.fromString(str);
                    List<String> list = this.I0;
                    WorkerParameters.RuntimeExtras runtimeExtras = this.f24410s0;
                    int i10 = this.f24411t0.runAttemptCount;
                    Executor executor = configuration.getExecutor();
                    TaskExecutor taskExecutor = this.v0;
                    WorkerFactory workerFactory = configuration.getWorkerFactory();
                    TaskExecutor taskExecutor2 = this.v0;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, data, list, runtimeExtras, i10, executor, taskExecutor, workerFactory, new WorkProgressUpdater(workDatabase, taskExecutor2), new WorkForegroundUpdater(workDatabase, this.f24415y0, taskExecutor2));
                    if (this.f24412u0 == null) {
                        this.f24412u0 = configuration.getWorkerFactory().createWorkerWithDefaultFallback(this.f24407p0, this.f24411t0.workerClassName, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f24412u0;
                    if (listenableWorker == null) {
                        Logger.get().error(str3, String.format("Could not create Worker %s", this.f24411t0.workerClassName), new Throwable[0]);
                        h();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        Logger.get().error(str3, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f24411t0.workerClassName), new Throwable[0]);
                        h();
                        return;
                    }
                    boolean z11 = true;
                    this.f24412u0.setUsed();
                    workDatabase.beginTransaction();
                    try {
                        if (workSpecDao.getState(str) == state2) {
                            workSpecDao.setState(WorkInfo.State.RUNNING, str);
                            workSpecDao.incrementWorkSpecRunAttemptCount(str);
                        } else {
                            z11 = false;
                        }
                        workDatabase.setTransactionSuccessful();
                        workDatabase.endTransaction();
                        if (!z11) {
                            g();
                            return;
                        }
                        if (i()) {
                            return;
                        }
                        SettableFuture settableFutureCreate = SettableFuture.create();
                        WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.f24407p0, this.f24411t0, this.f24412u0, workerParameters.getForegroundUpdater(), this.v0);
                        taskExecutor2.getMainThreadExecutor().execute(workForegroundRunnable);
                        ListenableFuture<Void> future = workForegroundRunnable.getFuture();
                        future.addListener(new b(this, future, settableFutureCreate), taskExecutor2.getMainThreadExecutor());
                        settableFutureCreate.addListener(new c(this, settableFutureCreate, this.J0), taskExecutor2.getBackgroundExecutor());
                        return;
                    } catch (Throwable th2) {
                        workDatabase.endTransaction();
                        throw th2;
                    }
                }
                g();
                workDatabase.setTransactionSuccessful();
                Logger.get().debug(str3, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f24411t0.workerClassName), new Throwable[0]);
            }
            workDatabase.endTransaction();
        } catch (Throwable th3) {
            workDatabase.endTransaction();
            throw th3;
        }
    }
}
