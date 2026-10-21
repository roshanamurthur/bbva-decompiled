package tc;

/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.a f93502p0;

    public a(com.bumptech.glide.load.engine.a aVar) {
        this.f93502p0 = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.engine.a aVar = this.f93502p0;
        while (!aVar.f38221f) {
            try {
                aVar.b((com.bumptech.glide.load.engine.a.b) aVar.f38219d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
