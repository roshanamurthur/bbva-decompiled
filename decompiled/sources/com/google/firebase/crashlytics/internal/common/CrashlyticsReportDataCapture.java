package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsReportDataCapture {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f47744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f47745h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdManager f47747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppData f47748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StackTraceTrimmingStrategy f47749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SettingsProvider f47750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ProcessDetailsProvider f47751f = ProcessDetailsProvider.INSTANCE;

    static {
        HashMap map = new HashMap();
        f47744g = map;
        ad.e.f(5, map, "armeabi", 6, "armeabi-v7a");
        ad.e.f(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        f47745h = String.format(Locale.US, "Crashlytics Android SDK/%s", BuildConfig.VERSION_NAME);
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        this.f47746a = context;
        this.f47747b = idManager;
        this.f47748c = appData;
        this.f47749d = stackTraceTrimmingStrategy;
        this.f47750e = settingsProvider;
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception c(TrimmedThrowableData trimmedThrowableData, int i10, int i11, int i12) {
        String str = trimmedThrowableData.className;
        String str2 = trimmedThrowableData.localizedMessage;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (i12 >= i11) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.cause;
                i13++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder overflowCount = CrashlyticsReport.Session.Event.Application.Execution.Exception.builder().setType(str).setReason(str2).setFrames(d(stackTraceElementArr, i10)).setOverflowCount(i13);
        if (trimmedThrowableData2 != null && i13 == 0) {
            overflowCount.setCausedBy(c(trimmedThrowableData2, i10, i11, i12 + 1));
        }
        return overflowCount.build();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder importance = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder().setImportance(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + Constant.DOT_STRING + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            arrayList.add(importance.setPc(jMax).setSymbol(str).setFile(fileName).setOffset(lineNumber).build());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> a() {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder size = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder().setBaseAddress(0L).setSize(0L);
        AppData appData = this.f47748c;
        return Collections.singletonList(size.setName(appData.packageName).setUuid(appData.buildId).build());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046 A[PHI: r4
      0x0046: PHI (r4v2 boolean) = (r4v1 boolean), (r4v0 boolean), (r4v10 boolean), (r4v10 boolean) binds: [B:19:0x003d, B:4:0x0011, B:13:0x002f, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public final CrashlyticsReport.Session.Event.Device b(int i10) {
        Float fValueOf;
        Context context = this.f47746a;
        int i11 = 1;
        boolean z10 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver == null) {
                fValueOf = null;
            } else {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z10 = true;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra(ImageScaleTypeHandler.ID, -1);
                if (intExtra2 == -1 || intExtra3 == -1) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e5) {
            Logger.getLogger().e("An error occurred getting battery state.", e5);
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (z10 && fValueOf != null) {
            i11 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
        }
        boolean proximitySensorEnabled = CommonUtils.getProximitySensorEnabled(context);
        long jCalculateTotalRamInBytes = CommonUtils.calculateTotalRamInBytes(context) - CommonUtils.calculateFreeRamInBytes(context);
        if (jCalculateTotalRamInBytes <= 0) {
            jCalculateTotalRamInBytes = 0;
        }
        return CrashlyticsReport.Session.Event.Device.builder().setBatteryLevel(dValueOf).setBatteryVelocity(i11).setProximityOn(proximitySensorEnabled).setOrientation(i10).setRamUsed(jCalculateTotalRamInBytes).setDiskUsed(CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath())).build();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0074  */
    public CrashlyticsReport.Session.Event captureAnrEventData(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> listUnmodifiableList;
        int i10 = this.f47746a.getResources().getConfiguration().orientation;
        CrashlyticsReport.Session.Event.Builder timestamp = CrashlyticsReport.Session.Event.builder().setType("anr").setTimestamp(applicationExitInfo.getTimestamp());
        if (this.f47750e.getSettingsSync().featureFlagData.collectBuildIds) {
            AppData appData = this.f47748c;
            if (appData.buildIdInfoList.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (BuildIdInfo buildIdInfo : appData.buildIdInfoList) {
                    arrayList.add(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder().setLibraryName(buildIdInfo.getLibraryName()).setArch(buildIdInfo.getArch()).setBuildId(buildIdInfo.getBuildId()).build());
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                listUnmodifiableList = null;
            }
        } else {
            listUnmodifiableList = null;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfoBuild = CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReasonCode()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(applicationExitInfo.getTraceFile()).setBuildIdMappingForArch(listUnmodifiableList).build();
        return timestamp.setApp(CrashlyticsReport.Session.Event.Application.builder().setBackground(Boolean.valueOf(applicationExitInfoBuild.getImportance() != 100)).setCurrentProcessDetails(this.f47751f.buildProcessDetails(applicationExitInfoBuild.getProcessName(), applicationExitInfoBuild.getPid(), applicationExitInfoBuild.getImportance())).setUiOrientation(i10).setExecution(CrashlyticsReport.Session.Event.Application.Execution.builder().setAppExitInfo(applicationExitInfoBuild).setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(a()).build()).build()).setDevice(b(i10)).build();
    }

    public CrashlyticsReport.Session.Event captureEventData(Throwable th2, Thread thread, String str, long j10, int i10, int i11, boolean z10) {
        Context context = this.f47746a;
        int i12 = context.getResources().getConfiguration().orientation;
        StackTraceTrimmingStrategy stackTraceTrimmingStrategy = this.f47749d;
        TrimmedThrowableData trimmedThrowableDataMakeTrimmedThrowableData = TrimmedThrowableData.makeTrimmedThrowableData(th2, stackTraceTrimmingStrategy);
        CrashlyticsReport.Session.Event.Builder timestamp = CrashlyticsReport.Session.Event.builder().setType(str).setTimestamp(j10);
        ProcessDetailsProvider processDetailsProvider = this.f47751f;
        CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(context);
        CrashlyticsReport.Session.Event.Application.Builder uiOrientation = CrashlyticsReport.Session.Event.Application.builder().setBackground(currentProcessDetails.getImportance() > 0 ? Boolean.valueOf(currentProcessDetails.getImportance() != 100) : null).setCurrentProcessDetails(currentProcessDetails).setAppProcessDetails(processDetailsProvider.getAppProcessDetails(context)).setUiOrientation(i12);
        CrashlyticsReport.Session.Event.Application.Execution.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.builder();
        ArrayList arrayList = new ArrayList();
        arrayList.add(CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread.getName()).setImportance(i10).setFrames(d(trimmedThrowableDataMakeTrimmedThrowableData.stacktrace, i10)).build());
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(key.getName()).setImportance(0).setFrames(d(stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue()), 0)).build());
                }
            }
        }
        return timestamp.setApp(uiOrientation.setExecution(builder.setThreads(Collections.unmodifiableList(arrayList)).setException(c(trimmedThrowableDataMakeTrimmedThrowableData, i10, i11, 0)).setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(a()).build()).build()).setDevice(b(i12)).build();
    }

    public CrashlyticsReport captureReportData(String str, long j10) {
        Integer num;
        CrashlyticsReport.Builder sdkVersion = CrashlyticsReport.builder().setSdkVersion(BuildConfig.VERSION_NAME);
        AppData appData = this.f47748c;
        CrashlyticsReport.Builder gmpAppId = sdkVersion.setGmpAppId(appData.googleAppId);
        IdManager idManager = this.f47747b;
        CrashlyticsReport.Builder platform = gmpAppId.setInstallationUuid(idManager.getInstallIds().getCrashlyticsInstallId()).setFirebaseInstallationId(idManager.getInstallIds().getFirebaseInstallationId()).setBuildVersion(appData.versionCode).setDisplayVersion(appData.versionName).setPlatform(4);
        CrashlyticsReport.Session.Builder os = CrashlyticsReport.Session.builder().setStartedAt(j10).setIdentifier(str).setGenerator(f47745h).setApp(CrashlyticsReport.Session.Application.builder().setIdentifier(idManager.getAppIdentifier()).setVersion(appData.versionCode).setDisplayVersion(appData.versionName).setInstallationUuid(idManager.getInstallIds().getCrashlyticsInstallId()).setDevelopmentPlatform(appData.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(appData.developmentPlatformProvider.getDevelopmentPlatformVersion()).build()).setOs(CrashlyticsReport.Session.OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted()).build());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str2 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str2) && (num = (Integer) f47744g.get(str2.toLowerCase(Locale.US))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jCalculateTotalRamInBytes = CommonUtils.calculateTotalRamInBytes(this.f47746a);
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean zIsEmulator = CommonUtils.isEmulator();
        int deviceState = CommonUtils.getDeviceState();
        return platform.setSession(os.setDevice(CrashlyticsReport.Session.Device.builder().setArch(iIntValue).setModel(Build.MODEL).setCores(iAvailableProcessors).setRam(jCalculateTotalRamInBytes).setDiskSpace(blockCount).setSimulator(zIsEmulator).setState(deviceState).setManufacturer(Build.MANUFACTURER).setModelClass(Build.PRODUCT).build()).setGeneratorType(3).build()).build();
    }
}
