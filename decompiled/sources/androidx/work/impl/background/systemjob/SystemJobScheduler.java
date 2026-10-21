package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.IdGenerator;
import com.esotericsoftware.kryo.serializers.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3.a;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobScheduler implements Scheduler {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f24481t0 = Logger.tagWithPrefix("SystemJobScheduler");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final JobScheduler f24483q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final WorkManagerImpl f24484r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f24485s0;

    public SystemJobScheduler(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void a(@NonNull JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            Logger.get().error(f24481t0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Nullable
    public static ArrayList b(@NonNull Context context, @NonNull JobScheduler jobScheduler, @NonNull String str) {
        String string;
        ArrayList<JobInfo> arrayListC = c(context, jobScheduler);
        if (arrayListC == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : arrayListC) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                try {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        string = extras.getString("EXTRA_WORK_SPEC_ID");
                    } else {
                        string = null;
                    }
                } catch (NullPointerException unused) {
                }
            } else {
                string = null;
            }
            if (str.equals(string)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ArrayList c(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            Logger.get().error(f24481t0, "getAllPendingJobs() is not reliable on this device.", th2);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void cancelAll(@NonNull Context context) {
        ArrayList arrayListC;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (arrayListC = c(context, jobScheduler)) == null || arrayListC.isEmpty()) {
            return;
        }
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    public static boolean reconcileJobs(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        String string;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListC = c(context, jobScheduler);
        List<String> workSpecIds = workManagerImpl.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
        boolean z10 = false;
        HashSet hashSet = new HashSet(arrayListC != null ? arrayListC.size() : 0);
        if (arrayListC != null && !arrayListC.isEmpty()) {
            for (JobInfo jobInfo : arrayListC) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            string = extras.getString("EXTRA_WORK_SPEC_ID");
                        } else {
                            string = null;
                        }
                    } catch (NullPointerException unused) {
                    }
                } else {
                    string = null;
                }
                if (TextUtils.isEmpty(string)) {
                    a(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(string);
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                Logger.get().debug(f24481t0, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
            } finally {
                workDatabase.endTransaction();
            }
        }
        return z10;
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        Context context = this.f24482p0;
        JobScheduler jobScheduler = this.f24483q0;
        ArrayList arrayListB = b(context, jobScheduler, str);
        if (arrayListB == null || arrayListB.isEmpty()) {
            return;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f24484r0.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(str);
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        ArrayList arrayListB;
        WorkManagerImpl workManagerImpl = this.f24484r0;
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.beginTransaction();
            try {
                WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(workSpec.id);
                String str = f24481t0;
                if (workSpec2 == null) {
                    Logger.get().warning(str, "Skipping scheduling " + workSpec.id + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger.get().warning(str, "Skipping scheduling " + workSpec.id + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.setTransactionSuccessful();
                } else {
                    SystemIdInfo systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(workSpec.id);
                    int iNextJobSchedulerIdWithRange = systemIdInfo != null ? systemIdInfo.systemId : idGenerator.nextJobSchedulerIdWithRange(workManagerImpl.getConfiguration().getMinJobSchedulerId(), workManagerImpl.getConfiguration().getMaxJobSchedulerId());
                    if (systemIdInfo == null) {
                        workManagerImpl.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo(new SystemIdInfo(workSpec.id, iNextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(workSpec, iNextJobSchedulerIdWithRange);
                    if (Build.VERSION.SDK_INT == 23 && (arrayListB = b(this.f24482p0, this.f24483q0, workSpec.id)) != null) {
                        int iIndexOf = arrayListB.indexOf(Integer.valueOf(iNextJobSchedulerIdWithRange));
                        if (iIndexOf >= 0) {
                            arrayListB.remove(iIndexOf);
                        }
                        scheduleInternal(workSpec, !arrayListB.isEmpty() ? ((Integer) arrayListB.get(0)).intValue() : idGenerator.nextJobSchedulerIdWithRange(workManagerImpl.getConfiguration().getMinJobSchedulerId(), workManagerImpl.getConfiguration().getMaxJobSchedulerId()));
                    }
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    @VisibleForTesting
    public void scheduleInternal(WorkSpec workSpec, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f24483q0;
        a aVar = this.f24485s0;
        aVar.getClass();
        Constraints constraints = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.id);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f92555a).setRequiresCharging(constraints.requiresCharging()).setRequiresDeviceIdle(constraints.requiresDeviceIdle()).setExtras(persistableBundle);
        NetworkType requiredNetworkType = constraints.getRequiredNetworkType();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 30 || requiredNetworkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i13 = a.C0477a.f92556a[requiredNetworkType.ordinal()];
            if (i13 == 1) {
                i11 = 0;
            } else if (i13 == 2) {
                i11 = 1;
            } else if (i13 == 3) {
                i11 = 2;
            } else if (i13 != 4) {
                if (i13 == 5 && i12 >= 26) {
                    i11 = 4;
                } else {
                    Logger.get().debug(a.f92554b, String.format("API version too low. Cannot convert network type value %s", requiredNetworkType), new Throwable[0]);
                    i11 = 1;
                }
            } else if (i12 >= 24) {
                i11 = 3;
            } else {
                Logger.get().debug(a.f92554b, String.format("API version too low. Cannot convert network type value %s", requiredNetworkType), new Throwable[0]);
                i11 = 1;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!constraints.requiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.calculateNextRunTime() - System.currentTimeMillis(), 0L);
        if (i12 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (i12 >= 24 && constraints.hasContentUriTriggers()) {
            for (ContentUriTriggers.Trigger trigger : constraints.getContentUriTriggers().getTriggers()) {
                boolean zShouldTriggerForDescendants = trigger.shouldTriggerForDescendants();
                c.c();
                extras.addTriggerContentUri(ae.c.a(trigger.getUri(), zShouldTriggerForDescendants ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.getTriggerContentUpdateDelay());
            extras.setTriggerContentMaxDelay(constraints.getTriggerMaxContentDelay());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(constraints.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(constraints.requiresStorageNotLow());
        }
        boolean z10 = workSpec.runAttemptCount > 0;
        boolean z11 = jMax > 0;
        if (BuildCompat.isAtLeastS() && workSpec.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        Logger logger = Logger.get();
        Object[] objArr = {workSpec.id, Integer.valueOf(i10)};
        String str = f24481t0;
        logger.debug(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                Logger.get().warning(str, String.format("Unable to schedule work ID %s", workSpec.id), new Throwable[0]);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    Logger.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.id), new Throwable[0]);
                    scheduleInternal(workSpec, i10);
                }
            }
        } catch (IllegalStateException e5) {
            ArrayList arrayListC = c(this.f24482p0, jobScheduler);
            int size = arrayListC != null ? arrayListC.size() : 0;
            Locale locale = Locale.getDefault();
            WorkManagerImpl workManagerImpl = this.f24484r0;
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(size), Integer.valueOf(workManagerImpl.getWorkDatabase().workSpecDao().getScheduledWork().size()), Integer.valueOf(workManagerImpl.getConfiguration().getMaxSchedulerLimit()));
            Logger.get().error(str, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e5);
        } catch (Throwable th2) {
            Logger.get().error(str, String.format("Unable to schedule %s", workSpec), th2);
        }
    }

    @VisibleForTesting
    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl, JobScheduler jobScheduler, a aVar) {
        this.f24482p0 = context;
        this.f24484r0 = workManagerImpl;
        this.f24483q0 = jobScheduler;
        this.f24485s0 = aVar;
    }
}
