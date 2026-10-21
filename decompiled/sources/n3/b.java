package n3;

import androidx.work.Logger;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f84414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f84415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WorkerWrapper f84416r0;

    public b(WorkerWrapper workerWrapper, ListenableFuture listenableFuture, SettableFuture settableFuture) {
        this.f84416r0 = workerWrapper;
        this.f84414p0 = listenableFuture;
        this.f84415q0 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SettableFuture settableFuture = this.f84415q0;
        WorkerWrapper workerWrapper = this.f84416r0;
        try {
            this.f84414p0.get();
            Logger.get().debug(WorkerWrapper.N0, String.format("Starting work for %s", workerWrapper.f24411t0.workerClassName), new Throwable[0]);
            workerWrapper.L0 = workerWrapper.f24412u0.startWork();
            settableFuture.setFuture(workerWrapper.L0);
        } catch (Throwable th2) {
            settableFuture.setException(th2);
        }
    }
}
