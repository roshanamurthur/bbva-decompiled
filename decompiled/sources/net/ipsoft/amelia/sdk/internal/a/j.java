package net.ipsoft.amelia.sdk.internal.a;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ net.ipsoft.amelia.sdk.internal.common.f f84660p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e f84661q0;

    public j(e eVar, net.ipsoft.amelia.sdk.internal.common.f fVar) {
        this.f84661q0 = eVar;
        this.f84660p0 = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84661q0.f84623l.a(this.f84660p0);
    }
}
