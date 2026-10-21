package ag;

import android.os.SystemClock;
import androidx.lifecycle.d;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ReportQueue.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Transport<CrashlyticsReport> f238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OnDemandCounter f239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f241k;

    /* JADX INFO: compiled from: ReportQueue.java */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CrashlyticsReportWithSessionId f242p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TaskCompletionSource<CrashlyticsReportWithSessionId> f243q0;

        public a(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.f242p0 = crashlyticsReportWithSessionId;
            this.f243q0 = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.f242p0;
            bVar.b(crashlyticsReportWithSessionId, this.f243q0);
            bVar.f239i.resetDroppedOnDemandExceptions();
            double dMin = Math.min(3600000.0d, Math.pow(bVar.f232b, bVar.a()) * (60000.0d / bVar.f231a));
            Logger.getLogger().d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + crashlyticsReportWithSessionId.getSessionId());
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public b(Transport<CrashlyticsReport> transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d2 = settings.onDemandUploadRatePerMinute;
        double d3 = settings.onDemandBackoffBase;
        long j10 = ((long) settings.onDemandBackoffStepDurationSeconds) * 1000;
        this.f231a = d2;
        this.f232b = d3;
        this.f233c = j10;
        this.f238h = transport;
        this.f239i = onDemandCounter;
        this.f234d = SystemClock.elapsedRealtime();
        int i10 = (int) d2;
        this.f235e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f236f = arrayBlockingQueue;
        this.f237g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f240j = 0;
        this.f241k = 0L;
    }

    public final int a() {
        if (this.f241k == 0) {
            this.f241k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f241k) / this.f233c);
        int iMin = this.f236f.size() == this.f235e ? Math.min(100, this.f240j + iCurrentTimeMillis) : Math.max(0, this.f240j - iCurrentTimeMillis);
        if (this.f240j != iMin) {
            this.f240j = iMin;
            this.f241k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger.getLogger().d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f234d < 2000;
        this.f238h.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new TransportScheduleCallback() { // from class: ag.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                b bVar = this.f227p0;
                bVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z10) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new d(bVar, countDownLatch, 3)).start();
                    Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
                }
                taskCompletionSource2.trySetResult(crashlyticsReportWithSessionId);
            }
        });
    }
}
