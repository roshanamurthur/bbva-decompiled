package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CommandHandler implements ExecutionListener {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f24439s0 = Logger.tagWithPrefix("CommandHandler");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24440p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f24441q0 = new HashMap();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f24442r0 = new Object();

    public CommandHandler(@NonNull Context context) {
        this.f24440p0 = context;
    }

    public static Intent a(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f24442r0) {
            z10 = !this.f24441q0.isEmpty();
        }
        return z10;
    }

    @WorkerThread
    public final void d(int i10, @NonNull Intent intent, @NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.get().debug(f24439s0, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            a aVar = new a(this.f24440p0, i10, systemAlarmDispatcher);
            List<WorkSpec> scheduledWork = systemAlarmDispatcher.f24462t0.getWorkDatabase().workSpecDao().getScheduledWork();
            String str = ConstraintProxy.f24443a;
            Iterator<WorkSpec> it = scheduledWork.iterator();
            boolean zRequiresBatteryNotLow = false;
            boolean zRequiresCharging = false;
            boolean zRequiresStorageNotLow = false;
            boolean z10 = false;
            while (it.hasNext()) {
                Constraints constraints = it.next().constraints;
                zRequiresBatteryNotLow |= constraints.requiresBatteryNotLow();
                zRequiresCharging |= constraints.requiresCharging();
                zRequiresStorageNotLow |= constraints.requiresStorageNotLow();
                z10 |= constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
                if (zRequiresBatteryNotLow && zRequiresCharging && zRequiresStorageNotLow && z10) {
                    break;
                }
            }
            Context context = aVar.f24478a;
            context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, zRequiresBatteryNotLow, zRequiresCharging, zRequiresStorageNotLow, z10));
            WorkConstraintsTracker workConstraintsTracker = aVar.f24480c;
            workConstraintsTracker.replace(scheduledWork);
            ArrayList arrayList = new ArrayList(scheduledWork.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : scheduledWork) {
                String str2 = workSpec.id;
                if (jCurrentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || workConstraintsTracker.areAllConstraintsMet(str2))) {
                    arrayList.add(workSpec);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str3 = ((WorkSpec) it2.next()).id;
                Intent intentA = a(context, str3);
                Logger.get().debug(a.f24477d, String.format("Creating a delay_met command for workSpec with id (%s)", str3), new Throwable[0]);
                systemAlarmDispatcher.c(new SystemAlarmDispatcher.b(aVar.f24479b, intentA, systemAlarmDispatcher));
            }
            workConstraintsTracker.reset();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.get().debug(f24439s0, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            systemAlarmDispatcher.f24462t0.rescheduleEligibleWork();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.get().error(f24439s0, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str4 = f24439s0;
            Logger.get().debug(str4, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = systemAlarmDispatcher.f24462t0.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(string);
                if (workSpec2 == null) {
                    Logger.get().warning(str4, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (workSpec2.state.isFinished()) {
                    Logger.get().warning(str4, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jCalculateNextRunTime = workSpec2.calculateNextRunTime();
                    boolean zHasConstraints = workSpec2.hasConstraints();
                    Context context2 = this.f24440p0;
                    WorkManagerImpl workManagerImpl = systemAlarmDispatcher.f24462t0;
                    if (zHasConstraints) {
                        Logger.get().debug(str4, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jCalculateNextRunTime)), new Throwable[0]);
                        o3.a.b(context2, workManagerImpl, string, jCalculateNextRunTime);
                        Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
                        systemAlarmDispatcher.c(new SystemAlarmDispatcher.b(i10, intent2, systemAlarmDispatcher));
                    } else {
                        Logger.get().debug(str4, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jCalculateNextRunTime)), new Throwable[0]);
                        o3.a.b(context2, workManagerImpl, string, jCalculateNextRunTime);
                    }
                    workDatabase.setTransactionSuccessful();
                }
                return;
            } finally {
                workDatabase.endTransaction();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f24442r0) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    Logger logger = Logger.get();
                    String str5 = f24439s0;
                    logger.debug(str5, String.format("Handing delay met for %s", string2), new Throwable[0]);
                    if (this.f24441q0.containsKey(string2)) {
                        Logger.get().debug(str5, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                    } else {
                        DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f24440p0, i10, string2, systemAlarmDispatcher);
                        this.f24441q0.put(string2, delayMetCommandHandler);
                        delayMetCommandHandler.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger.get().warning(f24439s0, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z11 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            Logger.get().debug(f24439s0, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            onExecuted(string3, z11);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger.get().debug(f24439s0, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        systemAlarmDispatcher.f24462t0.stopWork(string4);
        String str6 = o3.a.f85265a;
        SystemIdInfoDao systemIdInfoDao = systemAlarmDispatcher.f24462t0.getWorkDatabase().systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(string4);
        if (systemIdInfo != null) {
            o3.a.a(this.f24440p0, systemIdInfo.systemId, string4);
            Logger.get().debug(o3.a.f85265a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            systemIdInfoDao.removeSystemIdInfo(string4);
        }
        systemAlarmDispatcher.onExecuted(string4, false);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        synchronized (this.f24442r0) {
            try {
                ExecutionListener executionListener = (ExecutionListener) this.f24441q0.remove(str);
                if (executionListener != null) {
                    executionListener.onExecuted(str, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
