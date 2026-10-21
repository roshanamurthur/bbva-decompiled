package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xf.k;
import xf.l;
import xf.m;
import xf.p;
import xf.q;
import xf.r;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f47726b;

    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f47729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f47730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f47732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IdManager f47733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FileStore f47734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AnalyticsEventLogger f47735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f47736l;
    public final CrashlyticsBackgroundWorker m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f47737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CrashlyticsNativeComponent f47738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RemoteConfigDeferredProxy f47739p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47728d = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnDemandCounter f47727c = new OnDemandCounter();

    public class a implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettingsProvider f47740p0;

        public a(SettingsProvider settingsProvider) {
            this.f47740p0 = settingsProvider;
        }

        @Override // java.util.concurrent.Callable
        public final Task<Void> call() throws Exception {
            return CrashlyticsCore.a(CrashlyticsCore.this, this.f47740p0);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SettingsProvider f47742p0;

        public b(SettingsProvider settingsProvider) {
            this.f47742p0 = settingsProvider;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CrashlyticsCore.a(CrashlyticsCore.this, this.f47742p0);
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, FileStore fileStore, ExecutorService executorService, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy) {
        this.f47726b = dataCollectionArbiter;
        this.f47725a = firebaseApp.getApplicationContext();
        this.f47733i = idManager;
        this.f47738o = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.f47735k = analyticsEventLogger;
        this.f47736l = executorService;
        this.f47734j = fileStore;
        this.m = new CrashlyticsBackgroundWorker(executorService);
        this.f47737n = crashlyticsAppQualitySessionsSubscriber;
        this.f47739p = remoteConfigDeferredProxy;
    }

    public static Task a(final CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider) {
        Task<Void> taskForException;
        p pVar;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = crashlyticsCore.m;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker2 = crashlyticsCore.m;
        crashlyticsBackgroundWorker.checkRunningOnThread();
        crashlyticsCore.f47729e.a();
        Logger.getLogger().v("Initialization marker file was created.");
        try {
            try {
                crashlyticsCore.breadcrumbSource.registerBreadcrumbHandler(new BreadcrumbHandler() { // from class: xf.o
                    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                    public final void handleBreadcrumb(String str) {
                        this.f94627a.log(str);
                    }
                });
                crashlyticsCore.f47732h.i();
                if (settingsProvider.getSettingsSync().featureFlagData.collectReports) {
                    if (!crashlyticsCore.f47732h.e(settingsProvider)) {
                        Logger.getLogger().w("Previous sessions could not be finalized.");
                    }
                    taskForException = crashlyticsCore.f47732h.k(settingsProvider.getSettingsAsync());
                    pVar = new p(crashlyticsCore);
                } else {
                    Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                    taskForException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    pVar = new p(crashlyticsCore);
                }
            } catch (Exception e5) {
                Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e5);
                taskForException = Tasks.forException(e5);
                pVar = new p(crashlyticsCore);
            }
            crashlyticsBackgroundWorker2.submit(pVar);
            return taskForException;
        } catch (Throwable th2) {
            crashlyticsBackgroundWorker2.submit(new p(crashlyticsCore));
            throw th2;
        }
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public final void b(SettingsProvider settingsProvider) {
        Future<?> futureSubmit = this.f47736l.submit(new b(settingsProvider));
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", e5);
        } catch (ExecutionException e7) {
            Logger.getLogger().e("Crashlytics encountered a problem during initialization.", e7);
        } catch (TimeoutException e10) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", e10);
        }
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        e eVar = this.f47732h;
        if (eVar.f47806s.compareAndSet(false, true)) {
            return eVar.f47803p.getTask();
        }
        Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> deleteUnsentReports() {
        e eVar = this.f47732h;
        eVar.f47804q.trySetResult(Boolean.FALSE);
        return eVar.f47805r.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f47731g;
    }

    public Task<Void> doBackgroundInitializationAsync(SettingsProvider settingsProvider) {
        return Utils.callTask(this.f47736l, new a(settingsProvider));
    }

    public void log(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f47728d;
        e eVar = this.f47732h;
        eVar.getClass();
        eVar.f47793e.submit(new k(eVar, jCurrentTimeMillis, str));
    }

    public void logException(@NonNull Throwable th2) {
        e eVar = this.f47732h;
        Thread threadCurrentThread = Thread.currentThread();
        eVar.getClass();
        l lVar = new l(eVar, System.currentTimeMillis(), th2, threadCurrentThread);
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = eVar.f47793e;
        crashlyticsBackgroundWorker.getClass();
        crashlyticsBackgroundWorker.submit(new xf.f(lVar));
    }

    public void logFatalException(Throwable th2) {
        Logger logger = Logger.getLogger();
        StringBuilder sb2 = new StringBuilder("Recorded on-demand fatal events: ");
        OnDemandCounter onDemandCounter = this.f47727c;
        sb2.append(onDemandCounter.getRecordedOnDemandExceptions());
        logger.d(sb2.toString());
        Logger.getLogger().d("Dropped on-demand fatal events: " + onDemandCounter.getDroppedOnDemandExceptions());
        this.f47732h.j("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(onDemandCounter.getRecordedOnDemandExceptions()));
        this.f47732h.j("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(onDemandCounter.getDroppedOnDemandExceptions()));
        e eVar = this.f47732h;
        Thread threadCurrentThread = Thread.currentThread();
        SettingsProvider settingsProvider = eVar.f47802o;
        if (settingsProvider == null) {
            Logger.getLogger().w("settingsProvider not set");
        } else {
            eVar.h(settingsProvider, threadCurrentThread, th2, true);
        }
    }

    public boolean onPreExecute(AppData appData, SettingsProvider settingsProvider) {
        boolean z10;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker = this.m;
        FileStore fileStore = this.f47734j;
        Context context = this.f47725a;
        boolean booleanResourceValue = CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true);
        String str = appData.buildId;
        if (!booleanResourceValue) {
            Logger.getLogger().v("Configured not to require a build ID.");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        new com.google.firebase.crashlytics.internal.common.b(this.f47733i);
        String str2 = com.google.firebase.crashlytics.internal.common.b.f47783b;
        try {
            this.f47730f = new r(fileStore, "crash_marker");
            this.f47729e = new r(fileStore, "initialization_marker");
            UserMetadata userMetadata = new UserMetadata(str2, fileStore, crashlyticsBackgroundWorker);
            LogFileManager logFileManager = new LogFileManager(fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
            this.f47739p.setupListener(userMetadata);
            z10 = false;
            try {
                this.f47732h = new e(this.f47725a, this.m, this.f47733i, this.f47726b, this.f47734j, this.f47730f, appData, userMetadata, logFileManager, SessionReportingCoordinator.create(this.f47725a, this.f47733i, this.f47734j, appData, logFileManager, userMetadata, middleOutFallbackStrategy, settingsProvider, this.f47727c, this.f47737n), this.f47738o, this.f47735k, this.f47737n);
                r rVar = this.f47729e;
                boolean zExists = rVar.f94631b.getCommonFile(rVar.f94630a).exists();
                try {
                    this.f47731g = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(crashlyticsBackgroundWorker.submit(new q(this))));
                } catch (Exception unused) {
                    this.f47731g = false;
                }
                e eVar = this.f47732h;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                eVar.f47802o = settingsProvider;
                eVar.f47793e.submit(new m(eVar, str2));
                h hVar = new h(new c(eVar), settingsProvider, defaultUncaughtExceptionHandler, eVar.f47798j);
                eVar.f47801n = hVar;
                Thread.setDefaultUncaughtExceptionHandler(hVar);
                if (!zExists || !CommonUtils.canTryConnection(context)) {
                    Logger.getLogger().d("Successfully configured exception handler.");
                    return true;
                }
                Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                b(settingsProvider);
                return false;
            } catch (Exception e5) {
                e = e5;
                Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
                this.f47732h = null;
                return z10;
            }
        } catch (Exception e7) {
            e = e7;
            z10 = false;
        }
    }

    public Task<Void> sendUnsentReports() {
        e eVar = this.f47732h;
        eVar.f47804q.trySetResult(Boolean.TRUE);
        return eVar.f47805r.getTask();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean bool) {
        this.f47726b.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        e eVar = this.f47732h;
        eVar.getClass();
        try {
            eVar.f47792d.setCustomKey(str, str2);
        } catch (IllegalArgumentException e5) {
            Context context = eVar.f47789a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e5;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f47732h.f47792d.setCustomKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        this.f47732h.j(str, str2);
    }

    public void setUserId(String str) {
        this.f47732h.f47792d.setUserId(str);
    }
}
