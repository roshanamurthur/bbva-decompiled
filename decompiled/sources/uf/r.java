package uf;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: LimitedConcurrencyExecutor.java */
/* JADX INFO: loaded from: classes10.dex */
public class r implements Executor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Executor f93832p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Semaphore f93833q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedBlockingQueue<Runnable> f93834r0 = new LinkedBlockingQueue<>();

    public r(Executor executor, int i10) {
        Preconditions.checkArgument(i10 > 0, "concurrency must be positive.");
        this.f93832p0 = executor;
        this.f93833q0 = new Semaphore(i10, true);
    }

    public final void a() {
        while (true) {
            Semaphore semaphore = this.f93833q0;
            if (!semaphore.tryAcquire()) {
                return;
            }
            Runnable runnablePoll = this.f93834r0.poll();
            if (runnablePoll == null) {
                semaphore.release();
                return;
            } else {
                this.f93832p0.execute(new tf.g(this, runnablePoll, 1));
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f93834r0.offer(runnable);
        a();
    }
}
