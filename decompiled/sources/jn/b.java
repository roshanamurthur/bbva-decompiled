package jn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.runners.MethodRoadie;
import org.junit.runners.model.TestTimedOutException;

/* JADX INFO: compiled from: MethodRoadie.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f79105p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MethodRoadie f79106q0;

    /* JADX INFO: compiled from: MethodRoadie.java */
    public class a implements Callable<Object> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            b.this.f79106q0.runTestMethod();
            return null;
        }
    }

    public b(MethodRoadie methodRoadie, long j10) {
        this.f79106q0 = methodRoadie;
        this.f79105p0 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MethodRoadie methodRoadie = this.f79106q0;
        long j10 = this.f79105p0;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new a());
        executorServiceNewSingleThreadExecutor.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!executorServiceNewSingleThreadExecutor.awaitTermination(j10, timeUnit)) {
                executorServiceNewSingleThreadExecutor.shutdownNow();
            }
            futureSubmit.get(0L, timeUnit);
        } catch (TimeoutException unused) {
            methodRoadie.addFailure(new TestTimedOutException(j10, TimeUnit.MILLISECONDS));
        } catch (Exception e5) {
            methodRoadie.addFailure(e5);
        }
    }
}
