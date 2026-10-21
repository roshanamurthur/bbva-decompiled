package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Schedulers {
    public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24365a = Logger.tagWithPrefix("Schedulers");

    public static void schedule(@NonNull Configuration configuration, @NonNull WorkDatabase workDatabase, List<Scheduler> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<WorkSpec> it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(it.next().id, jCurrentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                for (Scheduler scheduler : list) {
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
            for (Scheduler scheduler2 : list) {
                if (!scheduler2.hasLimitedSchedulingSlots()) {
                    scheduler2.schedule(workSpecArr2);
                }
            }
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }
}
