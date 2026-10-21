package xf;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends BackgroundPriorityRunnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f94632p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f94633q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f94634r0 = 2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f94635s0;

    public s(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f94632p0 = str;
        this.f94633q0 = executorService;
        this.f94635s0 = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
    public final void onRun() {
        String str = this.f94632p0;
        ExecutorService executorService = this.f94633q0;
        try {
            Logger.getLogger().d("Executing shutdown hook for " + str);
            executorService.shutdown();
            if (executorService.awaitTermination(this.f94634r0, this.f94635s0)) {
                return;
            }
            Logger.getLogger().d(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Logger.getLogger().d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
            executorService.shutdownNow();
        }
    }
}
