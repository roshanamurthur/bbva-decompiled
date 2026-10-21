package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsWorker extends Worker {
    public static final String v0 = Logger.tagWithPrefix("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public static String a(@NonNull WorkNameDao workNameDao, @NonNull WorkTagDao workTagDao, @NonNull SystemIdInfoDao systemIdInfoDao, @NonNull List<WorkSpec> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workSpec.id);
            sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.id, workSpec.workerClassName, systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null, workSpec.state.name(), TextUtils.join(",", workNameDao.getNamesForWorkSpecId(workSpec.id)), TextUtils.join(",", workTagDao.getTagsForWorkSpecId(workSpec.id))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.Result doWork() {
        WorkDatabase workDatabase = WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkNameDao workNameDao = workDatabase.workNameDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        List<WorkSpec> recentlyCompletedWork = workSpecDao.getRecentlyCompletedWork(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<WorkSpec> runningWork = workSpecDao.getRunningWork();
        List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
        String str = v0;
        if (recentlyCompletedWork != null && !recentlyCompletedWork.isEmpty()) {
            Logger.get().info(str, "Recently completed work:\n\n", new Throwable[0]);
            Logger.get().info(str, a(workNameDao, workTagDao, systemIdInfoDao, recentlyCompletedWork), new Throwable[0]);
        }
        if (runningWork != null && !runningWork.isEmpty()) {
            Logger.get().info(str, "Running work:\n\n", new Throwable[0]);
            Logger.get().info(str, a(workNameDao, workTagDao, systemIdInfoDao, runningWork), new Throwable[0]);
        }
        if (allEligibleWorkSpecsForScheduling != null && !allEligibleWorkSpecsForScheduling.isEmpty()) {
            Logger.get().info(str, "Enqueued work:\n\n", new Throwable[0]);
            Logger.get().info(str, a(workNameDao, workTagDao, systemIdInfoDao, allEligibleWorkSpecsForScheduling), new Throwable[0]);
        }
        return ListenableWorker.Result.success();
    }
}
