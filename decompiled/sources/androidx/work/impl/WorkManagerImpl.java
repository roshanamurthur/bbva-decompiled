package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.core.os.BuildCompat;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.R;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkManagerImpl extends WorkManager {
    public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
    public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
    public static final String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f24392k = Logger.tagWithPrefix("WorkManagerImpl");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static WorkManagerImpl f24393l = null;
    public static WorkManagerImpl m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f24394n = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Configuration f24396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkDatabase f24397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TaskExecutor f24398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<Scheduler> f24399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Processor f24400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceUtils f24401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f24403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile RemoteWorkManager f24404j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettableFuture f24405p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PreferenceUtils f24406q0;

        public a(SettableFuture settableFuture, PreferenceUtils preferenceUtils) {
            this.f24405p0 = settableFuture;
            this.f24406q0 = preferenceUtils;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SettableFuture settableFuture = this.f24405p0;
            try {
                settableFuture.set(Long.valueOf(this.f24406q0.getLastCancelAllTimeMillis()));
            } catch (Throwable th2) {
                settableFuture.setException(th2);
            }
        }
    }

    public class b implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        public final WorkInfo apply(List<WorkSpec.WorkInfoPojo> list) {
            List<WorkSpec.WorkInfoPojo> list2 = list;
            if (list2 == null || list2.size() <= 0) {
                return null;
            }
            return list2.get(0).toWorkInfo();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor) {
        this(context, configuration, taskExecutor, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    public static WorkManagerImpl getInstance() {
        synchronized (f24394n) {
            try {
                WorkManagerImpl workManagerImpl = f24393l;
                if (workManagerImpl != null) {
                    return workManagerImpl;
                }
                return m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void initialize(@NonNull Context context, @NonNull Configuration configuration) {
        synchronized (f24394n) {
            try {
                WorkManagerImpl workManagerImpl = f24393l;
                if (workManagerImpl != null && m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (m == null) {
                        m = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.getTaskExecutor()));
                    }
                    f24393l = m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDelegate(@Nullable WorkManagerImpl workManagerImpl) {
        synchronized (f24394n) {
            f24393l = workManagerImpl;
        }
    }

    public final void a(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<Scheduler> list, @NonNull Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.f24395a = applicationContext;
        this.f24396b = configuration;
        this.f24398d = taskExecutor;
        this.f24397c = workDatabase;
        this.f24399e = list;
        this.f24400f = processor;
        this.f24401g = new PreferenceUtils(workDatabase);
        this.f24402h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f24398d.executeOnBackgroundThread(new ForceStopRunnable(applicationContext, this));
    }

    public final void b() {
        try {
            this.f24404j = (RemoteWorkManager) Class.forName(REMOTE_WORK_MANAGER_CLIENT).getConstructor(Context.class, WorkManagerImpl.class).newInstance(this.f24395a, this);
        } catch (Throwable th2) {
            Logger.get().debug(f24392k, "Unable to initialize multi-process support", th2);
        }
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public WorkContinuation beginUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, str, existingWorkPolicy, list);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new WorkContinuationImpl(this, list);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation cancelAllWork() {
        CancelWorkRunnable cancelWorkRunnableForAll = CancelWorkRunnable.forAll(this);
        this.f24398d.executeOnBackgroundThread(cancelWorkRunnableForAll);
        return cancelWorkRunnableForAll.getOperation();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation cancelAllWorkByTag(@NonNull String str) {
        CancelWorkRunnable cancelWorkRunnableForTag = CancelWorkRunnable.forTag(str, this);
        this.f24398d.executeOnBackgroundThread(cancelWorkRunnableForTag);
        return cancelWorkRunnableForTag.getOperation();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation cancelUniqueWork(@NonNull String str) {
        CancelWorkRunnable cancelWorkRunnableForName = CancelWorkRunnable.forName(str, this, true);
        this.f24398d.executeOnBackgroundThread(cancelWorkRunnableForName);
        return cancelWorkRunnableForName.getOperation();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation cancelWorkById(@NonNull UUID uuid) {
        CancelWorkRunnable cancelWorkRunnableForId = CancelWorkRunnable.forId(uuid, this);
        this.f24398d.executeOnBackgroundThread(cancelWorkRunnableForId);
        return cancelWorkRunnableForId.getOperation();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public PendingIntent createCancelPendingIntent(@NonNull UUID uuid) {
        return PendingIntent.getService(this.f24395a, 0, SystemForegroundDispatcher.createCancelWorkIntent(this.f24395a, uuid.toString()), BuildCompat.isAtLeastS() ? 167772160 : 134217728);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<Scheduler> createSchedulers(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor) {
        String str = Schedulers.GCM_SCHEDULER;
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, this);
        PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
        Logger.get().debug(Schedulers.f24365a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return Arrays.asList(systemJobScheduler, new GreedyScheduler(context, configuration, taskExecutor, this));
    }

    @NonNull
    public WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWorkRequest) {
        return new WorkContinuationImpl(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(periodicWorkRequest));
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation enqueue(@NonNull List<? extends WorkRequest> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new WorkContinuationImpl(this, list).enqueue();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation enqueueUniquePeriodicWork(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest periodicWorkRequest) {
        return createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest).enqueue();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation enqueueUniqueWork(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<OneTimeWorkRequest> list) {
        return new WorkContinuationImpl(this, str, existingWorkPolicy, list).enqueue();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Context getApplicationContext() {
        return this.f24395a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Configuration getConfiguration() {
        return this.f24396b;
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public ListenableFuture<Long> getLastCancelAllTimeMillis() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.f24398d.executeOnBackgroundThread(new a(settableFutureCreate, this.f24401g));
        return settableFutureCreate;
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public LiveData<Long> getLastCancelAllTimeMillisLiveData() {
        return this.f24401g.getLastCancelAllTimeMillisLiveData();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PreferenceUtils getPreferenceUtils() {
        return this.f24401g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Processor getProcessor() {
        return this.f24400f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteWorkManager getRemoteWorkManager() {
        if (this.f24404j == null) {
            synchronized (f24394n) {
                try {
                    if (this.f24404j == null) {
                        b();
                        if (this.f24404j == null && !TextUtils.isEmpty(this.f24396b.getDefaultProcessName())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f24404j;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<Scheduler> getSchedulers() {
        return this.f24399e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkDatabase getWorkDatabase() {
        return this.f24397c;
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public ListenableFuture<WorkInfo> getWorkInfoById(@NonNull UUID uuid) {
        StatusRunnable<WorkInfo> statusRunnableForUUID = StatusRunnable.forUUID(this, uuid);
        this.f24398d.getBackgroundExecutor().execute(statusRunnableForUUID);
        return statusRunnableForUUID.getFuture();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID uuid) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.f24397c.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString())), new b(), this.f24398d);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfos(@NonNull WorkQuery workQuery) {
        StatusRunnable<List<WorkInfo>> statusRunnableForWorkQuerySpec = StatusRunnable.forWorkQuerySpec(this, workQuery);
        this.f24398d.getBackgroundExecutor().execute(statusRunnableForWorkQuerySpec);
        return statusRunnableForWorkQuerySpec.getFuture();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfosByTag(@NonNull String str) {
        StatusRunnable<List<WorkInfo>> statusRunnableForTag = StatusRunnable.forTag(this, str);
        this.f24398d.getBackgroundExecutor().execute(statusRunnableForTag);
        return statusRunnableForTag.getFuture();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String str) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.f24397c.workSpecDao().getWorkStatusPojoLiveDataForTag(str), WorkSpec.WORK_INFO_MAPPER, this.f24398d);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(@NonNull String str) {
        StatusRunnable<List<WorkInfo>> statusRunnableForUniqueWork = StatusRunnable.forUniqueWork(this, str);
        this.f24398d.getBackgroundExecutor().execute(statusRunnableForUniqueWork);
        return statusRunnableForUniqueWork.getFuture();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String str) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.f24397c.workSpecDao().getWorkStatusPojoLiveDataForName(str), WorkSpec.WORK_INFO_MAPPER, this.f24398d);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public LiveData<List<WorkInfo>> getWorkInfosLiveData(@NonNull WorkQuery workQuery) {
        return LiveDataUtils.dedupedMappedLiveDataFor(this.f24397c.rawWorkInfoDao().getWorkInfoPojosLiveData(RawQueries.workQueryToRawQuery(workQuery)), WorkSpec.WORK_INFO_MAPPER, this.f24398d);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TaskExecutor getWorkTaskExecutor() {
        return this.f24398d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onForceStopRunnableCompleted() {
        synchronized (f24394n) {
            try {
                this.f24402h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f24403i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f24403i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.WorkManager
    @NonNull
    public Operation pruneWork() {
        PruneWorkRunnable pruneWorkRunnable = new PruneWorkRunnable(this);
        this.f24398d.executeOnBackgroundThread(pruneWorkRunnable);
        return pruneWorkRunnable.getOperation();
    }

    public void rescheduleEligibleWork() {
        SystemJobScheduler.cancelAll(getApplicationContext());
        getWorkDatabase().workSpecDao().resetScheduledState();
        Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setReschedulePendingResult(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f24394n) {
            try {
                this.f24403i = pendingResult;
                if (this.f24402h) {
                    pendingResult.finish();
                    this.f24403i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void startWork(@NonNull String str) {
        startWork(str, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void stopForegroundWork(@NonNull String str) {
        this.f24398d.executeOnBackgroundThread(new StopWorkRunnable(this, str, true));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void stopWork(@NonNull String str) {
        this.f24398d.executeOnBackgroundThread(new StopWorkRunnable(this, str, false));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void startWork(@NonNull String str, @Nullable WorkerParameters.RuntimeExtras runtimeExtras) {
        this.f24398d.executeOnBackgroundThread(new StartWorkRunnable(this, str, runtimeExtras));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, boolean z10) {
        this(context, configuration, taskExecutor, WorkDatabase.create(context.getApplicationContext(), taskExecutor.getBackgroundExecutor(), z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static WorkManagerImpl getInstance(@NonNull Context context) {
        WorkManagerImpl workManagerImpl;
        synchronized (f24394n) {
            try {
                workManagerImpl = getInstance();
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof Configuration.Provider) {
                        initialize(applicationContext, ((Configuration.Provider) applicationContext).getWorkManagerConfiguration());
                        workManagerImpl = getInstance(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return workManagerImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        Logger.setLogger(new Logger.LogcatLogger(configuration.getMinimumLoggingLevel()));
        List<Scheduler> listCreateSchedulers = createSchedulers(applicationContext, configuration, taskExecutor);
        a(context, configuration, taskExecutor, workDatabase, listCreateSchedulers, new Processor(context, configuration, taskExecutor, workDatabase, listCreateSchedulers));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkManagerImpl(@NonNull Context context, @NonNull Configuration configuration, @NonNull TaskExecutor taskExecutor, @NonNull WorkDatabase workDatabase, @NonNull List<Scheduler> list, @NonNull Processor processor) {
        a(context, configuration, taskExecutor, workDatabase, list, processor);
    }
}
