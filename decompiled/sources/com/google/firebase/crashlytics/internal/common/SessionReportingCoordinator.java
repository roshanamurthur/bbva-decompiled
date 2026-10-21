package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.n0;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import xf.v;
import xf.x;

/* JADX INFO: loaded from: classes10.dex */
public class SessionReportingCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReportDataCapture f47773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReportPersistence f47774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataTransportCrashlyticsReportSender f47775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LogFileManager f47776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UserMetadata f47777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdManager f47778f;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager) {
        this.f47773a = crashlyticsReportDataCapture;
        this.f47774b = crashlyticsReportPersistence;
        this.f47775c = dataTransportCrashlyticsReportSender;
        this.f47776d = logFileManager;
        this.f47777e = userMetadata;
        this.f47778f = idManager;
    }

    public static CrashlyticsReport.Session.Event a(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> listB = b(userMetadata.getCustomKeys());
        List<CrashlyticsReport.CustomAttribute> listB2 = b(userMetadata.getInternalKeys());
        if (!listB.isEmpty() || !listB2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(listB).setInternalKeys(listB2).build());
        }
        return builder.build();
    }

    @NonNull
    public static List<CrashlyticsReport.CustomAttribute> b(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new x());
        return Collections.unmodifiableList(arrayList);
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider, onDemandCounter), logFileManager, userMetadata, idManager);
    }

    public final void c(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j10, boolean z10) {
        boolean zEquals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        CrashlyticsReport.Session.Event eventCaptureEventData = this.f47773a.captureEventData(th2, thread, str2, j10, 4, 8, z10);
        LogFileManager logFileManager = this.f47776d;
        UserMetadata userMetadata = this.f47777e;
        CrashlyticsReport.Session.Event eventA = a(eventCaptureEventData, logFileManager, userMetadata);
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (!rolloutsState.isEmpty()) {
            CrashlyticsReport.Session.Event.Builder builder = eventA.toBuilder();
            builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
            eventA = builder.build();
        }
        this.f47774b.persistEvent(eventA, str, zEquals);
    }

    public void finalizeSessionWithNativeEvent(@NonNull String str, @NonNull List<v> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            CrashlyticsReport.FilesPayload.File fileA = it.next().a();
            if (fileA != null) {
                arrayList.add(fileA);
            }
        }
        this.f47774b.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j10, @Nullable String str) {
        this.f47774b.finalizeReports(str, j10);
    }

    public boolean hasReportsToSend() {
        return this.f47774b.hasFinalizedReports();
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.f47774b.getOpenSessionIds();
    }

    public void onBeginSession(@NonNull String str, long j10) {
        this.f47774b.persistReport(this.f47773a.captureReportData(str, j10));
    }

    public void onCustomKey(String str, String str2) {
        this.f47777e.setCustomKey(str, str2);
    }

    public void onLog(long j10, String str) {
        this.f47776d.writeToLog(j10, str);
    }

    public void onUserId(String str) {
        this.f47777e.setUserId(str);
    }

    public void persistFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j10) {
        Logger.getLogger().v("Persisting fatal event for session " + str);
        c(th2, thread, str, AppMeasurement.CRASH_ORIGIN, j10, true);
    }

    public void persistNonFatalEvent(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j10) {
        Logger.getLogger().v("Persisting non-fatal event for session " + str);
        c(th2, thread, str, "error", j10, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager, UserMetadata userMetadata) {
        String strConvertInputStreamToString;
        ApplicationExitInfo applicationExitInfoA;
        CrashlyticsReportPersistence crashlyticsReportPersistence = this.f47774b;
        long startTimestampMillis = crashlyticsReportPersistence.getStartTimestampMillis(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        do {
            strConvertInputStreamToString = null;
            if (it.hasNext()) {
                applicationExitInfoA = n0.a(it.next());
                if (applicationExitInfoA.getTimestamp() < startTimestampMillis) {
                }
            }
            applicationExitInfoA = null;
            break;
        } while (applicationExitInfoA.getReason() != 6);
        if (applicationExitInfoA == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        try {
            InputStream traceInputStream = applicationExitInfoA.getTraceInputStream();
            if (traceInputStream != null) {
                strConvertInputStreamToString = convertInputStreamToString(traceInputStream);
            }
        } catch (IOException e5) {
            Logger.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfoA.toString() + " Error: " + e5);
        }
        CrashlyticsReport.Session.Event eventCaptureAnrEventData = this.f47773a.captureAnrEventData(CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfoA.getImportance()).setProcessName(applicationExitInfoA.getProcessName()).setReasonCode(applicationExitInfoA.getReason()).setTimestamp(applicationExitInfoA.getTimestamp()).setPid(applicationExitInfoA.getPid()).setPss(applicationExitInfoA.getPss()).setRss(applicationExitInfoA.getRss()).setTraceFile(strConvertInputStreamToString).build());
        Logger.getLogger().d("Persisting anr for session " + str);
        CrashlyticsReport.Session.Event eventA = a(eventCaptureAnrEventData, logFileManager, userMetadata);
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (!rolloutsState.isEmpty()) {
            CrashlyticsReport.Session.Event.Builder builder = eventA.toBuilder();
            builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
            eventA = builder.build();
        }
        crashlyticsReportPersistence.persistEvent(eventA, str, true);
    }

    public void removeAllReports() {
        this.f47774b.deleteAllReports();
    }

    public Task<Void> sendReports(@NonNull Executor executor) {
        return sendReports(executor, null);
    }

    public Task<Void> sendReports(@NonNull Executor executor, @Nullable String str) {
        List<CrashlyticsReportWithSessionId> listLoadFinalizedReports = this.f47774b.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        Iterator<CrashlyticsReportWithSessionId> it = listLoadFinalizedReports.iterator();
        while (it.hasNext()) {
            CrashlyticsReportWithSessionId next = it.next();
            if (str == null || str.equals(next.getSessionId())) {
                if (next.getReport().getFirebaseInstallationId() == null) {
                    next = CrashlyticsReportWithSessionId.create(next.getReport().withFirebaseInstallationId(this.f47778f.fetchTrueFid()), next.getSessionId(), next.getReportFile());
                }
                arrayList.add(this.f47775c.enqueueReport(next, str != null).continueWith(executor, new y0.h(this)));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
