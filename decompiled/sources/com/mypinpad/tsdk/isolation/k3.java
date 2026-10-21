package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f56747p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f56748q0;

    public /* synthetic */ k3(Object obj, int i10) {
        this.f56747p0 = i10;
        this.f56748q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f56747p0;
        Object obj = this.f56748q0;
        switch (i10) {
            case 0:
                ((MonitoringModuleImplementation) obj).setX();
                break;
            default:
                oa oaVar = oa.INSTANCE;
                oa.setCompoundDrawableTintBlendMode(new Object[]{(Function0) obj}, -1060905953, 1060905953, (int) System.currentTimeMillis());
                break;
        }
    }
}
