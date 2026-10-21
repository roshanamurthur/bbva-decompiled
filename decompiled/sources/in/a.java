package in;

import java.util.concurrent.locks.ReentrantLock;
import org.junit.runner.Request;
import org.junit.runner.Runner;

/* JADX INFO: compiled from: MemoizingRequest.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f69728a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Runner f69729b;

    public abstract Runner createRunner();

    @Override // org.junit.runner.Request
    public final Runner getRunner() {
        if (this.f69729b == null) {
            this.f69728a.lock();
            try {
                if (this.f69729b == null) {
                    this.f69729b = createRunner();
                }
            } finally {
                this.f69728a.unlock();
            }
        }
        return this.f69729b;
    }
}
