package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import xf.i;
import xf.j;
import xf.n;
import xf.r;
import xf.t;
import xf.v;
import xf.w;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i f47788t = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f47790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f47791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserMetadata f47792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsBackgroundWorker f47793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdManager f47794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FileStore f47795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppData f47796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LogFileManager f47797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CrashlyticsNativeComponent f47798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AnalyticsEventLogger f47799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f47800l;
    public final SessionReportingCoordinator m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f47801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SettingsProvider f47802o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f47803p = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f47804q = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource<Void> f47805r = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f47806s = new AtomicBoolean(false);

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class a implements Callable<Task<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f47807p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Throwable f47808q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Thread f47809r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SettingsProvider f47810s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f47811t0;

        public a(long j10, Throwable th2, Thread thread, SettingsProvider settingsProvider, boolean z10) {
            this.f47807p0 = j10;
            this.f47808q0 = th2;
            this.f47809r0 = thread;
            this.f47810s0 = settingsProvider;
            this.f47811t0 = z10;
        }

        @Override // java.util.concurrent.Callable
        public final Task<Void> call() throws Exception {
            long j10 = this.f47807p0;
            long j11 = j10 / 1000;
            e eVar = e.this;
            String strF = eVar.f();
            if (strF == null) {
                Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                return Tasks.forResult(null);
            }
            eVar.f47791c.a();
            eVar.m.persistFatalEvent(this.f47808q0, this.f47809r0, strF, j11);
            eVar.d(j10);
            SettingsProvider settingsProvider = this.f47810s0;
            eVar.c(false, settingsProvider);
            new com.google.firebase.crashlytics.internal.common.b(eVar.f47794f);
            e.a(eVar, com.google.firebase.crashlytics.internal.common.b.f47783b, Boolean.valueOf(this.f47811t0));
            if (!eVar.f47790b.isAutomaticDataCollectionEnabled()) {
                return Tasks.forResult(null);
            }
            Executor executor = eVar.f47793e.getExecutor();
            return settingsProvider.getSettingsAsync().onSuccessTask(executor, new d(this, executor, strF));
        }
    }

    /* JADX INFO: compiled from: CrashlyticsController.java */
    public class b implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Task f47813p0;

        public b(Task task) {
            this.f47813p0 = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(@Nullable Boolean bool) throws Exception {
            return e.this.f47793e.submitTask(new g(this, bool));
        }
    }

    public e(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, r rVar, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f47789a = context;
        this.f47793e = crashlyticsBackgroundWorker;
        this.f47794f = idManager;
        this.f47790b = dataCollectionArbiter;
        this.f47795g = fileStore;
        this.f47791c = rVar;
        this.f47796h = appData;
        this.f47792d = userMetadata;
        this.f47797i = logFileManager;
        this.f47798j = crashlyticsNativeComponent;
        this.f47799k = analyticsEventLogger;
        this.f47800l = crashlyticsAppQualitySessionsSubscriber;
        this.m = sessionReportingCoordinator;
    }

    public static void a(e eVar, String str, Boolean bool) {
        eVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Logger.getLogger().d("Opening a new session with ID " + str);
        String str2 = String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion());
        IdManager idManager = eVar.f47794f;
        String appIdentifier = idManager.getAppIdentifier();
        AppData appData = eVar.f47796h;
        StaticSessionData.AppData appDataCreate = StaticSessionData.AppData.create(appIdentifier, appData.versionCode, appData.versionName, idManager.getInstallIds().getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
        StaticSessionData.OsData osDataCreate = StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        eVar.f47798j.prepareNativeSession(str, str2, jCurrentTimeMillis, StaticSessionData.create(appDataCreate, osDataCreate, StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.calculateTotalRamInBytes(eVar.f47789a), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT)));
        if (bool.booleanValue() && str != null) {
            eVar.f47792d.setNewSession(str);
        }
        eVar.f47797i.setCurrentSession(str);
        eVar.f47800l.setSessionId(str);
        eVar.m.onBeginSession(str, jCurrentTimeMillis);
    }

    public static Task b(e eVar) {
        Task taskCall;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : eVar.f47795g.getCommonFiles(f47788t)) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    Logger.getLogger().d("Logging app exception event to Firebase Analytics");
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new n(eVar, j10));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[LOOP:0: B:12:0x003b->B:14:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[SYNTHETIC] */
    public static String g() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i10;
        ClassLoader classLoader = e.class.getClassLoader();
        if (classLoader == null) {
            Logger.getLogger().w("Couldn't get Class Loader");
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Logger.getLogger().i("No version control information found");
            }
            if (resourceAsStream == null) {
                return null;
            }
            Logger.getLogger().d("Read version control info");
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[1024];
            while (true) {
                i10 = resourceAsStream.read(bArr);
                if (i10 != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        Logger.getLogger().d("Read version control info");
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[1024];
        while (true) {
            i10 = resourceAsStream.read(bArr);
            if (i10 != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(boolean z10, SettingsProvider settingsProvider) throws Throwable {
        String str;
        InputStream inputStream;
        InputStream inputStreamC;
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        ArrayList arrayList = new ArrayList(sessionReportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z10) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z10 ? 1 : 0);
        boolean z11 = settingsProvider.getSettingsSync().featureFlagData.collectAnrs;
        FileStore fileStore = this.f47795g;
        if (z11) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f47789a.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    sessionReportingCoordinator.persistRelevantAppExitInfoEvent(str2, historicalProcessExitReasons, new LogFileManager(fileStore, str2), UserMetadata.loadFromExistingSession(str2, fileStore, this.f47793e));
                } else {
                    Logger.getLogger().v("No ApplicationExitInfo available. Session: " + str2);
                }
            } else {
                Logger.getLogger().v("ANR feature enabled, but device is API " + i10);
            }
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f47798j;
        if (crashlyticsNativeComponent.hasCrashDataForSession(str2)) {
            Logger.getLogger().v("Finalizing native report for session " + str2);
            NativeSessionFileProvider sessionFileProvider = crashlyticsNativeComponent.getSessionFileProvider(str2);
            File minidumpFile = sessionFileProvider.getMinidumpFile();
            CrashlyticsReport.ApplicationExitInfo applicationExitInto = sessionFileProvider.getApplicationExitInto();
            if (minidumpFile == null || !minidumpFile.exists()) {
                Logger.getLogger().w("No minidump data found for session " + str2);
            }
            if (applicationExitInto == null) {
                Logger.getLogger().i("No Tombstones data found for session " + str2);
            }
            if ((minidumpFile == null || !minidumpFile.exists()) && applicationExitInto == null) {
                Logger.getLogger().w("No native core present");
            } else {
                long jLastModified = minidumpFile.lastModified();
                LogFileManager logFileManager = new LogFileManager(fileStore, str2);
                File nativeSessionDir = fileStore.getNativeSessionDir(str2);
                if (nativeSessionDir.isDirectory()) {
                    d(jLastModified);
                    byte[] bytesForLog = logFileManager.getBytesForLog();
                    File sessionFile = fileStore.getSessionFile(str2, UserMetadata.USERDATA_FILENAME);
                    File sessionFile2 = fileStore.getSessionFile(str2, "keys");
                    File sessionFile3 = fileStore.getSessionFile(str2, UserMetadata.ROLLOUTS_STATE_FILENAME);
                    ArrayList<v> arrayList2 = new ArrayList();
                    arrayList2.add(new xf.b("logs_file", "logs", bytesForLog));
                    arrayList2.add(new t(sessionFileProvider.getMetadataFile(), "crash_meta_file", "metadata"));
                    arrayList2.add(new t(sessionFileProvider.getSessionFile(), "session_meta_file", "session"));
                    arrayList2.add(new t(sessionFileProvider.getAppFile(), "app_meta_file", "app"));
                    arrayList2.add(new t(sessionFileProvider.getDeviceFile(), "device_meta_file", Constants.device));
                    arrayList2.add(new t(sessionFileProvider.getOsFile(), "os_meta_file", "os"));
                    File minidumpFile2 = sessionFileProvider.getMinidumpFile();
                    arrayList2.add((minidumpFile2 == null || !minidumpFile2.exists()) ? new xf.b("minidump_file", "minidump", new byte[]{0}) : new t(minidumpFile2, "minidump_file", "minidump"));
                    arrayList2.add(new t(sessionFile, "user_meta_file", "user"));
                    arrayList2.add(new t(sessionFile2, "keys_file", "keys"));
                    arrayList2.add(new t(sessionFile3, "rollouts_file", "rollouts"));
                    for (v vVar : arrayList2) {
                        try {
                            inputStreamC = vVar.c();
                            if (inputStreamC != null) {
                                try {
                                    w.a(inputStreamC, new File(nativeSessionDir, vVar.b()));
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = inputStreamC;
                                    CommonUtils.closeQuietly(inputStream);
                                    throw th;
                                }
                            }
                        } catch (IOException unused2) {
                            inputStreamC = null;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                        CommonUtils.closeQuietly(inputStreamC);
                    }
                    Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
                    sessionReportingCoordinator.finalizeSessionWithNativeEvent(str2, arrayList2, applicationExitInto);
                    logFileManager.clearLog();
                } else {
                    Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
                }
            }
        }
        if (z10 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f47800l.setSessionId(null);
            str = null;
        }
        sessionReportingCoordinator.finalizeSessions(System.currentTimeMillis() / 1000, str);
    }

    public final void d(long j10) {
        try {
            if (this.f47795g.getCommonFile(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e5) {
            Logger.getLogger().w("Could not create app exception marker file.", e5);
        }
    }

    public final boolean e(SettingsProvider settingsProvider) throws Throwable {
        this.f47793e.checkRunningOnThread();
        h hVar = this.f47801n;
        if (hVar != null && hVar.f47823e.get()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            c(true, settingsProvider);
            Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e5) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e5);
            return false;
        }
    }

    @Nullable
    public final String f() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.m.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    public final synchronized void h(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th2, boolean z10) {
        try {
            Logger.getLogger().d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
            try {
                Utils.awaitEvenIfOnMainThread(this.f47793e.submitTask(new a(System.currentTimeMillis(), th2, thread, settingsProvider, z10)));
            } catch (TimeoutException unused) {
                Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e5) {
                Logger.getLogger().e("Error handling uncaught exception", e5);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void i() {
        try {
            String strG = g();
            if (strG != null) {
                j("com.crashlytics.version-control-info", strG);
                Logger.getLogger().i("Saved version control info");
            }
        } catch (IOException e5) {
            Logger.getLogger().w("Unable to save version control info", e5);
        }
    }

    public final void j(String str, String str2) {
        try {
            this.f47792d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e5) {
            Context context = this.f47789a;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e5;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> k(Task<Settings> task) {
        Task taskRace;
        boolean zHasReportsToSend = this.m.hasReportsToSend();
        TaskCompletionSource<Boolean> taskCompletionSource = this.f47803p;
        if (!zHasReportsToSend) {
            Logger.getLogger().v("No crash reports are available to be sent.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        Logger.getLogger().v("Crash reports are available to be sent.");
        DataCollectionArbiter dataCollectionArbiter = this.f47790b;
        if (dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskRace = Tasks.forResult(Boolean.TRUE);
        } else {
            Logger.getLogger().d("Automatic data collection is disabled.");
            Logger.getLogger().v("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            Task<TContinuationResult> taskOnSuccessTask = dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new j());
            Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
            taskRace = Utils.race(taskOnSuccessTask, this.f47804q.getTask());
        }
        return taskRace.onSuccessTask(new b(task));
    }
}
