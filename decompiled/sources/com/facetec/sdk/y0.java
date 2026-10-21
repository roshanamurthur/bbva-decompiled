package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42985p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42986q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42987r0;

    public /* synthetic */ y0(Object obj, Object obj2, int i10) {
        this.f42985p0 = i10;
        this.f42986q0 = obj;
        this.f42987r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42985p0;
        Object obj = this.f42987r0;
        Object obj2 = this.f42986q0;
        switch (i10) {
            case 0:
                ((al) obj2).b((StackTraceElement[]) obj);
                break;
            case 1:
                ((cz) obj2).e((aq.b) obj);
                break;
            default:
                ((co) obj2).h((Runnable) obj);
                break;
        }
    }
}
