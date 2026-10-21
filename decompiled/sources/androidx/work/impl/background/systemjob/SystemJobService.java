package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements ExecutionListener {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f24486r0 = Logger.tagWithPrefix("SystemJobService");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public WorkManagerImpl f24487p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f24488q0 = new HashMap();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
            this.f24487p0 = workManagerImpl;
            workManagerImpl.getProcessor().addExecutionListener(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            Logger.get().warning(f24486r0, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f24487p0;
        if (workManagerImpl != null) {
            workManagerImpl.getProcessor().removeExecutionListener(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull String str, boolean z10) {
        JobParameters jobParameters;
        Logger.get().debug(f24486r0, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f24488q0) {
            jobParameters = (JobParameters) this.f24488q0.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        String string;
        if (this.f24487p0 == null) {
            Logger.get().debug(f24486r0, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        WorkerParameters.RuntimeExtras runtimeExtras = null;
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            Logger.get().error(f24486r0, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f24488q0) {
            try {
                if (this.f24488q0.containsKey(string)) {
                    Logger.get().debug(f24486r0, String.format("Job is already being executed by SystemJobService: %s", string), new Throwable[0]);
                    return false;
                }
                Logger.get().debug(f24486r0, String.format("onStartJob for %s", string), new Throwable[0]);
                this.f24488q0.put(string, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    runtimeExtras = new WorkerParameters.RuntimeExtras();
                    if (jobParameters.getTriggeredContentUris() != null) {
                        runtimeExtras.triggeredContentUris = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        runtimeExtras.triggeredContentAuthorities = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i10 >= 28) {
                        runtimeExtras.network = jobParameters.getNetwork();
                    }
                }
                this.f24487p0.startWork(string, runtimeExtras);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        String string;
        if (this.f24487p0 == null) {
            Logger.get().debug(f24486r0, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            Logger.get().error(f24486r0, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Logger.get().debug(f24486r0, String.format("onStopJob for %s", string), new Throwable[0]);
        synchronized (this.f24488q0) {
            this.f24488q0.remove(string);
        }
        this.f24487p0.stopWork(string);
        return !this.f24487p0.getProcessor().isCancelled(string);
    }
}
