package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class StopWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f24646s0 = Logger.tagWithPrefix("StopWorkRunnable");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WorkManagerImpl f24647p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f24648q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f24649r0;

    public StopWorkRunnable(@NonNull WorkManagerImpl workManagerImpl, @NonNull String str, boolean z10) {
        this.f24647p0 = workManagerImpl;
        this.f24648q0 = str;
        this.f24649r0 = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zStopWork;
        String str = this.f24648q0;
        WorkManagerImpl workManagerImpl = this.f24647p0;
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        Processor processor = workManagerImpl.getProcessor();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            boolean zIsEnqueuedInForeground = processor.isEnqueuedInForeground(str);
            if (this.f24649r0) {
                zStopWork = workManagerImpl.getProcessor().stopForegroundWork(str);
            } else {
                if (!zIsEnqueuedInForeground && workSpecDao.getState(str) == WorkInfo.State.RUNNING) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                }
                zStopWork = workManagerImpl.getProcessor().stopWork(str);
            }
            Logger.get().debug(f24646s0, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", str, Boolean.valueOf(zStopWork)), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }
}
