package ud;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: SafeLoggingExecutor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Executor f93788p0;

    /* JADX INFO: compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f93789p0;

        public a(Runnable runnable) {
            this.f93789p0 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f93789p0.run();
            } catch (Exception e5) {
                Logging.e("Executor", "Background execution failure.", e5);
            }
        }
    }

    public c(ExecutorService executorService) {
        this.f93788p0 = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f93788p0.execute(new a(runnable));
    }
}
