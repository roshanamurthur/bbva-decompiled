package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f24431x0 = Logger.tagWithPrefix("GreedyScheduler");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24432p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final WorkManagerImpl f24433q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WorkConstraintsTracker f24434r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DelayedWorkTracker f24436t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24437u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Boolean f24438w0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final HashSet f24435s0 = new HashSet();
    public final Object v0 = new Object();

    public GreedyScheduler(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkManagerImpl workManagerImpl) {
        this.f24432p0 = context;
        this.f24433q0 = workManagerImpl;
        this.f24434r0 = new WorkConstraintsTracker(context, taskExecutor, this);
        this.f24436t0 = new DelayedWorkTracker(this, configuration.getRunnableScheduler());
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        Boolean bool = this.f24438w0;
        WorkManagerImpl workManagerImpl = this.f24433q0;
        if (bool == null) {
            this.f24438w0 = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.f24432p0, workManagerImpl.getConfiguration()));
        }
        boolean zBooleanValue = this.f24438w0.booleanValue();
        String str2 = f24431x0;
        if (!zBooleanValue) {
            Logger.get().info(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f24437u0) {
            workManagerImpl.getProcessor().addExecutionListener(this);
            this.f24437u0 = true;
        }
        Logger.get().debug(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        DelayedWorkTracker delayedWorkTracker = this.f24436t0;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(str);
        }
        workManagerImpl.stopWork(str);
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NonNull List<String> list) {
        for (String str : list) {
            Logger.get().debug(f24431x0, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f24433q0.startWork(str);
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        for (String str : list) {
            Logger.get().debug(f24431x0, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f24433q0.stopWork(str);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        synchronized (this.v0) {
            try {
                for (WorkSpec workSpec : this.f24435s0) {
                    if (workSpec.id.equals(str)) {
                        Logger.get().debug(f24431x0, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f24435s0.remove(workSpec);
                        this.f24434r0.replace(this.f24435s0);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        if (this.f24438w0 == null) {
            this.f24438w0 = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.f24432p0, this.f24433q0.getConfiguration()));
        }
        if (!this.f24438w0.booleanValue()) {
            Logger.get().info(f24431x0, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f24437u0) {
            this.f24433q0.getProcessor().addExecutionListener(this);
            this.f24437u0 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            long jCalculateNextRunTime = workSpec.calculateNextRunTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (workSpec.state == WorkInfo.State.ENQUEUED) {
                if (jCurrentTimeMillis < jCalculateNextRunTime) {
                    DelayedWorkTracker delayedWorkTracker = this.f24436t0;
                    if (delayedWorkTracker != null) {
                        delayedWorkTracker.schedule(workSpec);
                    }
                } else if (workSpec.hasConstraints()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (workSpec.constraints.requiresDeviceIdle()) {
                        Logger.get().debug(f24431x0, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                    } else if (i10 < 24 || !workSpec.constraints.hasContentUriTriggers()) {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.id);
                    } else {
                        Logger.get().debug(f24431x0, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                    }
                } else {
                    Logger.get().debug(f24431x0, String.format("Starting work for %s", workSpec.id), new Throwable[0]);
                    this.f24433q0.startWork(workSpec.id);
                }
            }
        }
        synchronized (this.v0) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.get().debug(f24431x0, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f24435s0.addAll(hashSet);
                    this.f24434r0.replace(this.f24435s0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public void setDelayedWorkTracker(@NonNull DelayedWorkTracker delayedWorkTracker) {
        this.f24436t0 = delayedWorkTracker;
    }

    @VisibleForTesting
    public GreedyScheduler(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, @NonNull WorkConstraintsTracker workConstraintsTracker) {
        this.f24432p0 = context;
        this.f24433q0 = workManagerImpl;
        this.f24434r0 = workConstraintsTracker;
    }
}
