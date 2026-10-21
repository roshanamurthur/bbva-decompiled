package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41856p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41857q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41858r0;

    public /* synthetic */ h4(Object obj, Object obj2, int i10) {
        this.f41856p0 = i10;
        this.f41857q0 = obj;
        this.f41858r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41856p0;
        Object obj = this.f41858r0;
        Object obj2 = this.f41857q0;
        switch (i10) {
            case 0:
                ((be) obj2).d((cn) obj);
                break;
            case 1:
                ((co) obj2).d((aq.b) obj);
                break;
            default:
                ((co) obj2).a((String) obj);
                break;
        }
    }
}
