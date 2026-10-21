package mn;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.ParentRunner;

/* JADX INFO: compiled from: ParentRunner.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f83498p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RunNotifier f83499q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ParentRunner f83500r0;

    public a(ParentRunner parentRunner, Object obj, RunNotifier runNotifier) {
        this.f83500r0 = parentRunner;
        this.f83498p0 = obj;
        this.f83499q0 = runNotifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f83500r0.runChild(this.f83498p0, this.f83499q0);
    }
}
