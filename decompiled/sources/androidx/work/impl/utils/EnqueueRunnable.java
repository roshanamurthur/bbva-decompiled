package androidx.work.impl.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EnqueueRunnable implements Runnable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f24604r0 = Logger.tagWithPrefix("EnqueueRunnable");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WorkContinuationImpl f24605p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final OperationImpl f24606q0 = new OperationImpl();

    public EnqueueRunnable(@NonNull WorkContinuationImpl workContinuationImpl) {
        this.f24605p0 = workContinuationImpl;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0230  */
    /* JADX WARN: Code duplicated, block: B:124:0x0232  */
    /* JADX WARN: Code duplicated, block: B:127:0x023d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0241 A[LOOP:5: B:128:0x023f->B:129:0x0241, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x0264 A[LOOP:6: B:131:0x025e->B:133:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x027d  */
    /* JADX WARN: Code duplicated, block: B:158:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa A[PHI: r0 r12 r15 r16 r17
      0x01aa: PHI (r0v4 java.lang.String[]) = (r0v3 java.lang.String[]), (r0v3 java.lang.String[]), (r0v3 java.lang.String[]), (r0v7 java.lang.String[]) binds: [B:38:0x00c8, B:39:0x00ca, B:41:0x00d8, B:93:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v7 boolean) binds: [B:38:0x00c8, B:39:0x00ca, B:41:0x00d8, B:93:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r15v2 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v4 boolean) binds: [B:38:0x00c8, B:39:0x00ca, B:41:0x00d8, B:93:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r16v2 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v5 boolean) binds: [B:38:0x00c8, B:39:0x00ca, B:41:0x00d8, B:93:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r17v2 boolean) = (r17v1 boolean), (r17v1 boolean), (r17v1 boolean), (r17v5 boolean) binds: [B:38:0x00c8, B:39:0x00ca, B:41:0x00d8, B:93:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:127:0x023d, please report this as an issue */
    public static boolean a(@NonNull WorkContinuationImpl workContinuationImpl) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Iterator<String> it;
        int i10;
        boolean z15;
        List listEmptyList;
        boolean z16;
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        String str = f24604r0;
        if (parents != null) {
            zA = false;
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (workContinuationImpl2.isEnqueued()) {
                    Logger.get().warning(str, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", workContinuationImpl2.getIds())), new Throwable[0]);
                } else {
                    zA |= a(workContinuationImpl2);
                }
            }
        } else {
            zA = false;
        }
        Set<String> setPrerequisitesFor = WorkContinuationImpl.prerequisitesFor(workContinuationImpl);
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        List<? extends WorkRequest> work = workContinuationImpl.getWork();
        String[] strArr = (String[]) setPrerequisitesFor.toArray(new String[0]);
        String name = workContinuationImpl.getName();
        ExistingWorkPolicy existingWorkPolicy = workContinuationImpl.getExistingWorkPolicy();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        boolean z17 = strArr != null && strArr.length > 0;
        if (z17) {
            int length = strArr.length;
            z10 = true;
            int i11 = 0;
            z11 = false;
            z12 = false;
            while (true) {
                if (i11 < length) {
                    String str2 = strArr[i11];
                    WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(str2);
                    if (workSpec == null) {
                        Logger.get().error(str, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    } else {
                        WorkInfo.State state = workSpec.state;
                        z10 &= state == WorkInfo.State.SUCCEEDED;
                        if (state == WorkInfo.State.FAILED) {
                            z12 = true;
                        } else if (state == WorkInfo.State.CANCELLED) {
                            z11 = true;
                        }
                        i11++;
                    }
                }
                z13 = false;
                workContinuationImpl.markEnqueued();
                return zA | z13;
            }
        }
        z10 = true;
        z11 = false;
        z12 = false;
        boolean z18 = true;
        boolean z19 = !TextUtils.isEmpty(name);
        if (!z19 || z17) {
            z18 = false;
        } else {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase.workSpecDao().getWorkSpecIdAndStatesForName(name);
            if (workSpecIdAndStatesForName.isEmpty()) {
                z18 = false;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                DependencyDao dependencyDao = workDatabase.dependencyDao();
                ArrayList arrayList = new ArrayList();
                for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                    if (!dependencyDao.hasDependents(idAndState.id)) {
                        WorkInfo.State state2 = idAndState.state;
                        boolean z20 = (state2 == WorkInfo.State.SUCCEEDED) & z10;
                        if (state2 == WorkInfo.State.FAILED) {
                            z16 = true;
                        } else if (state2 == WorkInfo.State.CANCELLED) {
                            z16 = z12;
                            z11 = true;
                        } else {
                            z16 = z12;
                        }
                        arrayList.add(idAndState.id);
                        z12 = z16;
                        z10 = z20;
                    }
                }
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z11 || z12)) {
                    WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                    Iterator<WorkSpec.IdAndState> it2 = workSpecDao.getWorkSpecIdAndStatesForName(name).iterator();
                    while (it2.hasNext()) {
                        workSpecDao.delete(it2.next().id);
                    }
                    z15 = false;
                    z11 = false;
                    listEmptyList = Collections.emptyList();
                } else {
                    z15 = z12;
                    listEmptyList = arrayList;
                }
                strArr = (String[]) listEmptyList.toArray(strArr);
                z17 = strArr.length > 0;
                z12 = z15;
                z18 = false;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator<WorkSpec.IdAndState> it3 = workSpecIdAndStatesForName.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            WorkInfo.State state3 = it3.next().state;
                            if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                                z13 = false;
                                workContinuationImpl.markEnqueued();
                                return zA | z13;
                            }
                        }
                    }
                }
                CancelWorkRunnable.forName(name, workManagerImpl, false).run();
                WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
                Iterator<WorkSpec.IdAndState> it4 = workSpecIdAndStatesForName.iterator();
                while (it4.hasNext()) {
                    workSpecDao2.delete(it4.next().id);
                }
            }
        }
        for (Iterator<? extends WorkRequest> it5 = work.iterator(); it5.hasNext(); it5 = it5) {
            WorkRequest next = it5.next();
            WorkSpec workSpec2 = next.getWorkSpec();
            if (!z17 || z10) {
                if (workSpec2.isPeriodic()) {
                    workSpec2.periodStartTime = 0L;
                } else {
                    workSpec2.periodStartTime = jCurrentTimeMillis;
                }
            } else if (z12) {
                workSpec2.state = WorkInfo.State.FAILED;
            } else if (z11) {
                workSpec2.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec2.state = WorkInfo.State.BLOCKED;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                Constraints constraints = workSpec2.constraints;
                String str3 = workSpec2.workerClassName;
                z14 = z18;
                if (!str3.equals(ConstraintTrackingWorker.class.getName()) && (constraints.requiresBatteryNotLow() || constraints.requiresStorageNotLow())) {
                    Data.Builder builder = new Data.Builder();
                    builder.putAll(workSpec2.input).putString(ConstraintTrackingWorker.ARGUMENT_CLASS_NAME, str3);
                    workSpec2.workerClassName = ConstraintTrackingWorker.class.getName();
                    workSpec2.input = builder.build();
                }
                if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
                workDatabase.workSpecDao().insertWorkSpec(workSpec2);
                if (z17) {
                    for (String str4 : strArr) {
                        workDatabase.dependencyDao().insertDependency(new Dependency(next.getStringId(), str4));
                    }
                }
                it = next.getTags().iterator();
                while (it.hasNext()) {
                    workDatabase.workTagDao().insert(new WorkTag(it.next(), next.getStringId()));
                }
                if (z19) {
                    workDatabase.workNameDao().insert(new WorkName(name, next.getStringId()));
                }
            } else {
                z14 = z18;
            }
            if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                z18 = true;
            } else {
                z18 = z14;
            }
            workDatabase.workSpecDao().insertWorkSpec(workSpec2);
            if (z17) {
                while (i10 < r3) {
                    workDatabase.dependencyDao().insertDependency(new Dependency(next.getStringId(), str4));
                }
            }
            it = next.getTags().iterator();
            while (it.hasNext()) {
                workDatabase.workTagDao().insert(new WorkTag(it.next(), next.getStringId()));
            }
            if (z19) {
                workDatabase.workNameDao().insert(new WorkName(name, next.getStringId()));
            }
        }
        z13 = z18;
        workContinuationImpl.markEnqueued();
        return zA | z13;
    }

    @VisibleForTesting
    public boolean addToDatabase() {
        WorkContinuationImpl workContinuationImpl = this.f24605p0;
        WorkDatabase workDatabase = workContinuationImpl.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean zA = a(workContinuationImpl);
            workDatabase.setTransactionSuccessful();
            return zA;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @NonNull
    public Operation getOperation() {
        return this.f24606q0;
    }

    @Override // java.lang.Runnable
    public void run() {
        OperationImpl operationImpl = this.f24606q0;
        WorkContinuationImpl workContinuationImpl = this.f24605p0;
        try {
            if (workContinuationImpl.hasCycles()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", workContinuationImpl));
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(workContinuationImpl.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            operationImpl.setState(Operation.SUCCESS);
        } catch (Throwable th2) {
            operationImpl.setState(new Operation.State.FAILURE(th2));
        }
    }

    @VisibleForTesting
    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.f24605p0.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
