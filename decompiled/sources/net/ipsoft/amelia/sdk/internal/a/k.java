package net.ipsoft.amelia.sdk.internal.a;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ net.ipsoft.amelia.sdk.internal.common.f f84662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e f84663q0;

    public k(e eVar, net.ipsoft.amelia.sdk.internal.common.f fVar) {
        this.f84663q0 = eVar;
        this.f84662p0 = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84663q0.f84623l.b(this.f84662p0);
    }
}
