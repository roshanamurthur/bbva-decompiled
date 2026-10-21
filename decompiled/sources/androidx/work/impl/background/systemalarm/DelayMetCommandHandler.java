package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DelayMetCommandHandler implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f24448y0 = Logger.tagWithPrefix("DelayMetCommandHandler");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24449p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f24450q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f24451r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final SystemAlarmDispatcher f24452s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final WorkConstraintsTracker f24453t0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f24455w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f24456x0 = false;
    public int v0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Object f24454u0 = new Object();

    public DelayMetCommandHandler(@NonNull Context context, int i10, @NonNull String str, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f24449p0 = context;
        this.f24450q0 = i10;
        this.f24452s0 = systemAlarmDispatcher;
        this.f24451r0 = str;
        this.f24453t0 = new WorkConstraintsTracker(context, systemAlarmDispatcher.f24459q0, this);
    }

    public final void a() {
        synchronized (this.f24454u0) {
            try {
                this.f24453t0.reset();
                this.f24452s0.f24460r0.stopTimer(this.f24451r0);
                PowerManager.WakeLock wakeLock = this.f24455w0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.get().debug(f24448y0, String.format("Releasing wakelock %s for WorkSpec %s", this.f24455w0, this.f24451r0), new Throwable[0]);
                    this.f24455w0.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void b() {
        String str = this.f24451r0;
        this.f24455w0 = WakeLocks.newWakeLock(this.f24449p0, String.format("%s (%s)", str, Integer.valueOf(this.f24450q0)));
        Logger logger = Logger.get();
        Object[] objArr = {this.f24455w0, str};
        String str2 = f24448y0;
        logger.debug(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f24455w0.acquire();
        WorkSpec workSpec = this.f24452s0.f24462t0.getWorkDatabase().workSpecDao().getWorkSpec(str);
        if (workSpec == null) {
            c();
            return;
        }
        boolean zHasConstraints = workSpec.hasConstraints();
        this.f24456x0 = zHasConstraints;
        if (zHasConstraints) {
            this.f24453t0.replace(Collections.singletonList(workSpec));
        } else {
            Logger.get().debug(str2, String.format("No constraints for %s", str), new Throwable[0]);
            onAllConstraintsMet(Collections.singletonList(str));
        }
    }

    public final void c() {
        synchronized (this.f24454u0) {
            try {
                if (this.v0 < 2) {
                    this.v0 = 2;
                    Logger logger = Logger.get();
                    String str = f24448y0;
                    logger.debug(str, String.format("Stopping work for WorkSpec %s", this.f24451r0), new Throwable[0]);
                    Context context = this.f24449p0;
                    String str2 = this.f24451r0;
                    String str3 = CommandHandler.f24439s0;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    SystemAlarmDispatcher systemAlarmDispatcher = this.f24452s0;
                    systemAlarmDispatcher.c(new SystemAlarmDispatcher.b(this.f24450q0, intent, systemAlarmDispatcher));
                    if (this.f24452s0.f24461s0.isEnqueued(this.f24451r0)) {
                        Logger.get().debug(str, String.format("WorkSpec %s needs to be rescheduled", this.f24451r0), new Throwable[0]);
                        Intent intentB = CommandHandler.b(this.f24449p0, this.f24451r0);
                        SystemAlarmDispatcher systemAlarmDispatcher2 = this.f24452s0;
                        systemAlarmDispatcher2.c(new SystemAlarmDispatcher.b(this.f24450q0, intentB, systemAlarmDispatcher2));
                    } else {
                        Logger.get().debug(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f24451r0), new Throwable[0]);
                    }
                } else {
                    Logger.get().debug(f24448y0, String.format("Already stopped work for %s", this.f24451r0), new Throwable[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(@NonNull List<String> list) {
        if (list.contains(this.f24451r0)) {
            synchronized (this.f24454u0) {
                try {
                    if (this.v0 == 0) {
                        this.v0 = 1;
                        Logger.get().debug(f24448y0, String.format("onAllConstraintsMet for %s", this.f24451r0), new Throwable[0]);
                        if (this.f24452s0.f24461s0.startWork(this.f24451r0)) {
                            this.f24452s0.f24460r0.startTimer(this.f24451r0, 600000L, this);
                        } else {
                            a();
                        }
                    } else {
                        Logger.get().debug(f24448y0, String.format("Already started work for %s", this.f24451r0), new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(@NonNull List<String> list) {
        c();
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        Logger.get().debug(f24448y0, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        a();
        int i10 = this.f24450q0;
        SystemAlarmDispatcher systemAlarmDispatcher = this.f24452s0;
        Context context = this.f24449p0;
        if (z10) {
            systemAlarmDispatcher.c(new SystemAlarmDispatcher.b(i10, CommandHandler.b(context, this.f24451r0), systemAlarmDispatcher));
        }
        if (this.f24456x0) {
            String str2 = CommandHandler.f24439s0;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            systemAlarmDispatcher.c(new SystemAlarmDispatcher.b(i10, intent, systemAlarmDispatcher));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void onTimeLimitExceeded(@NonNull String str) {
        Logger.get().debug(f24448y0, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        c();
    }
}
