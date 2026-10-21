package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.h0;
import com.bbva.notifications.constants.PushConstants;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import zf.a;
import zf.b;
import zf.c;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsReportPersistence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f48278e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48279f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f48280g = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f48281h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f48282i = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f48283a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStore f48284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsProvider f48285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f48286d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f48284b = fileStore;
        this.f48285c = settingsProvider;
        this.f48286d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    @NonNull
    public static String c(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f48278e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void d(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f48278e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        FileStore fileStore = this.f48284b;
        arrayList.addAll(fileStore.getPriorityReports());
        arrayList.addAll(fileStore.getNativeReports());
        b bVar = f48281h;
        Collections.sort(arrayList, bVar);
        List<File> reports = fileStore.getReports();
        Collections.sort(reports, bVar);
        arrayList.addAll(reports);
        return arrayList;
    }

    public void deleteAllReports() {
        FileStore fileStore = this.f48284b;
        a(fileStore.getReports());
        a(fileStore.getPriorityReports());
        a(fileStore.getNativeReports());
    }

    public void finalizeReports(@Nullable String str, long j10) {
        boolean z10;
        CrashlyticsReportJsonTransform crashlyticsReportJsonTransform;
        FileStore fileStore = this.f48284b;
        fileStore.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() > 8) {
            while (openSessionIds.size() > 8) {
                String strLast = openSessionIds.last();
                Logger.getLogger().d("Removing session over cap: " + strLast);
                fileStore.deleteSessionFiles(strLast);
                openSessionIds.remove(strLast);
            }
        }
        for (String str2 : openSessionIds) {
            Logger.getLogger().v("Finalizing report for session " + str2);
            List<File> sessionFiles = fileStore.getSessionFiles(str2, f48282i);
            if (!sessionFiles.isEmpty()) {
                Collections.sort(sessionFiles);
                ArrayList arrayList = new ArrayList();
                Iterator<File> it = sessionFiles.iterator();
                while (true) {
                    z10 = false;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        crashlyticsReportJsonTransform = f48280g;
                        if (!zHasNext) {
                            break;
                        }
                        File next = it.next();
                        try {
                            arrayList.add(crashlyticsReportJsonTransform.eventFromJson(c(next)));
                            if (!z10) {
                                String name = next.getName();
                                if (!name.startsWith("event") || !name.endsWith(PushConstants.GE_PARAMS_SEPARATOR)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e5) {
                            Logger.getLogger().w("Could not add event to report for " + next, e5);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    String userId = UserMetadata.readUserId(str2, fileStore);
                    String appQualitySessionId = this.f48286d.getAppQualitySessionId(str2);
                    File sessionFile = fileStore.getSessionFile(str2, "report");
                    try {
                        CrashlyticsReport crashlyticsReportWithEvents = crashlyticsReportJsonTransform.reportFromJson(c(sessionFile)).withSessionEndFields(j10, z10, userId).withAppQualitySessionId(appQualitySessionId).withEvents(arrayList);
                        CrashlyticsReport.Session session = crashlyticsReportWithEvents.getSession();
                        if (session != null) {
                            Logger.getLogger().d("appQualitySessionId: " + appQualitySessionId);
                            d(z10 ? fileStore.getPriorityReport(session.getIdentifier()) : fileStore.getReport(session.getIdentifier()), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportWithEvents));
                            break;
                        }
                        break;
                    } catch (IOException e7) {
                        Logger.getLogger().w("Could not synthesize final report file for " + sessionFile, e7);
                        break;
                    }
                }
                Logger.getLogger().w("Could not parse event files for session " + str2);
                break;
            }
            Logger.getLogger().v("Session " + str2 + " has no events.");
            fileStore.deleteSessionFiles(str2);
        }
        int i10 = this.f48285c.getSettingsSync().sessionData.maxCompleteSessionsCount;
        ArrayList arrayListB = b();
        int size = arrayListB.size();
        if (size <= i10) {
            return;
        }
        Iterator it2 = arrayListB.subList(i10, size).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        FileStore fileStore = this.f48284b;
        File sessionFile = fileStore.getSessionFile(str, "report");
        Logger.getLogger().d("Writing native session report for " + str + " to file: " + sessionFile);
        String appQualitySessionId = this.f48286d.getAppQualitySessionId(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = f48280g;
            d(fileStore.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(c(sessionFile)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e5) {
            Logger.getLogger().w("Could not synthesize final native report file for " + sessionFile, e5);
        }
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.f48284b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.f48284b.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        FileStore fileStore = this.f48284b;
        return (fileStore.getReports().isEmpty() && fileStore.getPriorityReports().isEmpty() && fileStore.getNativeReports().isEmpty()) ? false : true;
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        ArrayList<File> arrayListB = b();
        ArrayList arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(f48280g.reportFromJson(c(file)), file.getName(), file));
            } catch (IOException e5) {
                Logger.getLogger().w("Could not load report file " + file + "; deleting", e5);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        persistEvent(event, str, false);
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport) {
        FileStore fileStore = this.f48284b;
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            d(fileStore.getSessionFile(identifier, "report"), f48280g.reportToJson(crashlyticsReport));
            File sessionFile = fileStore.getSessionFile(identifier, "start-time");
            long startedAt = session.getStartedAt();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(sessionFile), f48278e);
            try {
                outputStreamWriter.write("");
                sessionFile.setLastModified(startedAt * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e5) {
            Logger.getLogger().d("Could not persist report for session " + identifier, e5);
        }
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z10) {
        FileStore fileStore = this.f48284b;
        int i10 = this.f48285c.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            d(fileStore.getSessionFile(str, h0.b("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f48283a.getAndIncrement())), z10 ? PushConstants.GE_PARAMS_SEPARATOR : "")), f48280g.eventToJson(event));
        } catch (IOException e5) {
            Logger.getLogger().w("Could not persist event for session " + str, e5);
        }
        List<File> sessionFiles = fileStore.getSessionFiles(str, new a());
        Collections.sort(sessionFiles, new c2.a(1));
        int size = sessionFiles.size();
        for (File file : sessionFiles) {
            if (size <= i10) {
                return;
            }
            FileStore.c(file);
            size--;
        }
    }
}
