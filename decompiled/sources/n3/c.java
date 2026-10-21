package n3;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SettableFuture f84417p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f84418q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ WorkerWrapper f84419r0;

    public c(WorkerWrapper workerWrapper, SettableFuture settableFuture, String str) {
        this.f84419r0 = workerWrapper;
        this.f84417p0 = settableFuture;
        this.f84418q0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f84418q0;
        WorkerWrapper workerWrapper = this.f84419r0;
        try {
            try {
                ListenableWorker.Result result = (ListenableWorker.Result) this.f84417p0.get();
                if (result == null) {
                    Logger.get().error(WorkerWrapper.N0, String.format("%s returned a null result. Treating it as a failure.", workerWrapper.f24411t0.workerClassName), new Throwable[0]);
                } else {
                    Logger.get().debug(WorkerWrapper.N0, String.format("%s returned a %s result.", workerWrapper.f24411t0.workerClassName, result), new Throwable[0]);
                    workerWrapper.f24413w0 = result;
                }
            } catch (InterruptedException e5) {
                e = e5;
                Logger.get().error(WorkerWrapper.N0, String.format("%s failed because it threw an exception/error", str), e);
            } catch (CancellationException e7) {
                Logger.get().info(WorkerWrapper.N0, String.format("%s was cancelled", str), e7);
            } catch (ExecutionException e10) {
                e = e10;
                Logger.get().error(WorkerWrapper.N0, String.format("%s failed because it threw an exception/error", str), e);
            }
            workerWrapper.c();
        } catch (Throwable th2) {
            workerWrapper.c();
            throw th2;
        }
    }
}
