package com.google.firebase.crashlytics.internal.send;

import ag.b;
import ag.b.a;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import fc.a;

/* JADX INFO: loaded from: classes10.dex */
public class DataTransportCrashlyticsReportSender {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f48293c = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f48294d = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f48295e = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48296f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f48297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformer<CrashlyticsReport, byte[]> f48298b;

    public DataTransportCrashlyticsReportSender(b bVar, a aVar) {
        this.f48297a = bVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.initialize(context);
        TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(new CCTDestination(f48294d, f48295e));
        Encoding encodingOf = Encoding.of("json");
        a aVar = f48296f;
        return new DataTransportCrashlyticsReportSender(new b(transportFactoryNewFactory.getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, encodingOf, aVar), settingsProvider.getSettingsSync(), onDemandCounter), aVar);
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z10) {
        TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource;
        b bVar = this.f48297a;
        synchronized (bVar.f236f) {
            try {
                taskCompletionSource = new TaskCompletionSource<>();
                if (z10) {
                    bVar.f239i.incrementRecordedOnDemandExceptions();
                    if (bVar.f236f.size() < bVar.f235e) {
                        Logger.getLogger().d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                        Logger.getLogger().d("Queue size: " + bVar.f236f.size());
                        bVar.f237g.execute(bVar.new a(crashlyticsReportWithSessionId, taskCompletionSource));
                        Logger.getLogger().d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    } else {
                        bVar.a();
                        Logger.getLogger().d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                        bVar.f239i.incrementDroppedOnDemandExceptions();
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    }
                } else {
                    bVar.b(crashlyticsReportWithSessionId, taskCompletionSource);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taskCompletionSource.getTask();
    }
}
