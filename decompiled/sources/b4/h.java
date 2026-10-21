package b4;

import com.cyberfend.cyfsecurity.CYFMonitor;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ com.akamai.botman.k f24792p0;

    public h(com.akamai.botman.k kVar) {
        this.f24792p0 = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (CYFMonitor.isActivityVisible()) {
            com.akamai.botman.k kVar = this.f24792p0;
            kVar.f();
            kVar.d();
            kVar.e();
            kVar.c();
        }
    }
}
