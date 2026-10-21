package t3;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: ConstraintTrackingWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f93445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f93446q0;

    public a(ConstraintTrackingWorker constraintTrackingWorker, ListenableFuture listenableFuture) {
        this.f93446q0 = constraintTrackingWorker;
        this.f93445p0 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f93446q0.v0) {
            try {
                if (this.f93446q0.f24716w0) {
                    this.f93446q0.f24717x0.set(ListenableWorker.Result.retry());
                } else {
                    this.f93446q0.f24717x0.setFuture(this.f93445p0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
