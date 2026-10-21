package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import androidx.core.view.n0;
import androidx.work.Configuration;
import androidx.work.InitializationExceptionHandler;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f24607s0 = Logger.tagWithPrefix("ForceStopRunnable");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final long f24608t0 = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f24609p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final WorkManagerImpl f24610q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f24611r0 = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f24612a = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            Logger.get().verbose(f24612a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.a(context);
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this.f24609p0 = context.getApplicationContext();
        this.f24610q0 = workManagerImpl;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i10 = BuildCompat.isAtLeastS() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f24608t0;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    @VisibleForTesting
    public boolean cleanUp() {
        Context context = this.f24609p0;
        WorkManagerImpl workManagerImpl = this.f24610q0;
        boolean zReconcileJobs = SystemJobScheduler.reconcileJobs(context, workManagerImpl);
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            boolean z10 = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z10) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.id);
                    workSpecDao.markWorkSpecScheduled(workSpec.id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return z10 || zReconcileJobs;
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    @VisibleForTesting
    public void forceStopRunnable() {
        boolean zCleanUp = cleanUp();
        WorkManagerImpl workManagerImpl = this.f24610q0;
        boolean needsReschedule = workManagerImpl.getPreferenceUtils().getNeedsReschedule();
        String str = f24607s0;
        if (needsReschedule) {
            Logger.get().debug(str, "Rescheduling Workers.", new Throwable[0]);
            workManagerImpl.rescheduleEligibleWork();
            workManagerImpl.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(str, "Application was force-stopped, rescheduling.", new Throwable[0]);
            workManagerImpl.rescheduleEligibleWork();
        } else if (zCleanUp) {
            Logger.get().debug(str, "Found unfinished work, scheduling it.", new Throwable[0]);
            Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean isForceStopped() {
        Context context = this.f24609p0;
        try {
            int i10 = BuildCompat.isAtLeastS() ? 570425344 : PKIFailureInfo.duplicateCertReq;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
            if (Build.VERSION.SDK_INT >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        if (n0.a(historicalProcessExitReasons.get(i11)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (broadcast == null) {
                a(context);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e5) {
            e = e5;
            Logger.get().warning(f24607s0, "Ignoring exception", e);
            return true;
        } catch (SecurityException e7) {
            e = e7;
            Logger.get().warning(f24607s0, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    public boolean multiProcessChecks() {
        Configuration configuration = this.f24610q0.getConfiguration();
        boolean zIsEmpty = TextUtils.isEmpty(configuration.getDefaultProcessName());
        String str = f24607s0;
        if (zIsEmpty) {
            Logger.get().debug(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zIsDefaultProcess = ProcessUtils.isDefaultProcess(this.f24609p0, configuration);
        Logger.get().debug(str, String.format("Is default app process = %s", Boolean.valueOf(zIsDefaultProcess)), new Throwable[0]);
        return zIsDefaultProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        String str = f24607s0;
        WorkManagerImpl workManagerImpl = this.f24610q0;
        try {
            if (!multiProcessChecks()) {
                workManagerImpl.onForceStopRunnableCompleted();
                return;
            }
            while (true) {
                WorkDatabasePathHelper.migrateDatabase(this.f24609p0);
                Logger.get().debug(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    forceStopRunnable();
                    break;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e5) {
                    i10 = this.f24611r0 + 1;
                    this.f24611r0 = i10;
                    if (i10 >= 3) {
                        Logger.get().error(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e5);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e5);
                        InitializationExceptionHandler exceptionHandler = workManagerImpl.getConfiguration().getExceptionHandler();
                        if (exceptionHandler == null) {
                            throw illegalStateException;
                        }
                        Logger.get().debug(str, "Routing exception to the specified exception handler", illegalStateException);
                        exceptionHandler.handleException(illegalStateException);
                        break;
                    }
                    Logger.get().debug(str, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e5);
                    sleep(((long) this.f24611r0) * 300);
                }
                Logger.get().debug(str, String.format("Retrying after %s", Long.valueOf(((long) i10) * 300)), e5);
                sleep(((long) this.f24611r0) * 300);
            }
            workManagerImpl.onForceStopRunnableCompleted();
        } catch (Throwable th2) {
            workManagerImpl.onForceStopRunnableCompleted();
            throw th2;
        }
    }

    @VisibleForTesting
    public void sleep(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }
}
