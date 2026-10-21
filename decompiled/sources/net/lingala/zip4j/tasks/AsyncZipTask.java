package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AsyncZipTask<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressMonitor f85119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f85121c;

    public static class AsyncTaskParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProgressMonitor f85122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f85123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ExecutorService f85124c;

        public AsyncTaskParameters(ExecutorService executorService, boolean z10, ProgressMonitor progressMonitor) {
            this.f85124c = executorService;
            this.f85123b = z10;
            this.f85122a = progressMonitor;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f85125p0;

        public a(Object obj) {
            this.f85125p0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ExecutorService executorService;
            AsyncZipTask asyncZipTask = AsyncZipTask.this;
            try {
                try {
                    Object obj = this.f85125p0;
                    ProgressMonitor progressMonitor = asyncZipTask.f85119a;
                    try {
                        asyncZipTask.executeTask(obj, progressMonitor);
                        progressMonitor.endProgressMonitor();
                        executorService = asyncZipTask.f85121c;
                        executorService.shutdown();
                    } catch (ZipException e5) {
                        progressMonitor.endProgressMonitor(e5);
                        throw e5;
                    } catch (Exception e7) {
                        progressMonitor.endProgressMonitor(e7);
                        throw new ZipException(e7);
                    }
                } catch (Throwable th2) {
                    asyncZipTask.f85121c.shutdown();
                    throw th2;
                }
            } catch (ZipException unused) {
                executorService = asyncZipTask.f85121c;
            }
        }
    }

    public AsyncZipTask(AsyncTaskParameters asyncTaskParameters) {
        this.f85119a = asyncTaskParameters.f85122a;
        this.f85120b = asyncTaskParameters.f85123b;
        this.f85121c = asyncTaskParameters.f85124c;
    }

    public abstract long calculateTotalWork(T t10) throws ZipException;

    public void execute(T t10) throws ZipException {
        ProgressMonitor progressMonitor = this.f85119a;
        boolean z10 = this.f85120b;
        if (z10 && ProgressMonitor.State.BUSY.equals(progressMonitor.getState())) {
            throw new ZipException("invalid operation - Zip4j is in busy state");
        }
        progressMonitor.fullReset();
        progressMonitor.setState(ProgressMonitor.State.BUSY);
        progressMonitor.setCurrentTask(getTask());
        if (z10) {
            progressMonitor.setTotalWork(calculateTotalWork(t10));
            this.f85121c.execute(new a(t10));
            return;
        }
        try {
            executeTask(t10, progressMonitor);
            progressMonitor.endProgressMonitor();
        } catch (ZipException e5) {
            progressMonitor.endProgressMonitor(e5);
            throw e5;
        } catch (Exception e7) {
            progressMonitor.endProgressMonitor(e7);
            throw new ZipException(e7);
        }
    }

    public abstract void executeTask(T t10, ProgressMonitor progressMonitor) throws IOException;

    public abstract ProgressMonitor.Task getTask();

    public void verifyIfTaskIsCancelled() throws ZipException {
        ProgressMonitor progressMonitor = this.f85119a;
        if (progressMonitor.isCancelAllTasks()) {
            progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
            progressMonitor.setState(ProgressMonitor.State.READY);
            throw new ZipException("Task cancelled", ZipException.Type.TASK_CANCELLED_EXCEPTION);
        }
    }
}
