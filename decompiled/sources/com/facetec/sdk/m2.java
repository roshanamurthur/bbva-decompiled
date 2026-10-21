package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42396p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42397q0;

    public /* synthetic */ m2(Object obj, int i10) {
        this.f42396p0 = i10;
        this.f42397q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f42396p0;
        Object obj = this.f42397q0;
        switch (i10) {
            case 0:
                ((bb) obj).m();
                break;
            case 1:
                ((bk) obj).e();
                break;
            case 2:
                ((bt) obj).i();
                break;
            case 3:
                ((cc) obj).ac();
                break;
            case 4:
                ((az) obj).s();
                break;
            case 5:
                ((bj) obj).v();
                break;
            case 6:
                ((cn) obj).F();
                break;
            default:
                ((co) obj).b();
                break;
        }
    }
}
