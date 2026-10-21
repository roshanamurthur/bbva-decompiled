package xf;

import com.google.firebase.crashlytics.internal.Logger;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f94619p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Throwable f94620q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Thread f94621r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.e f94622s0;

    public l(com.google.firebase.crashlytics.internal.common.e eVar, long j10, Throwable th2, Thread thread) {
        this.f94622s0 = eVar;
        this.f94619p0 = j10;
        this.f94620q0 = th2;
        this.f94621r0 = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.firebase.crashlytics.internal.common.e eVar = this.f94622s0;
        com.google.firebase.crashlytics.internal.common.h hVar = eVar.f47801n;
        if (hVar == null || !hVar.f47823e.get()) {
            long j10 = this.f94619p0 / 1000;
            String strF = eVar.f();
            if (strF == null) {
                Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
            } else {
                eVar.m.persistNonFatalEvent(this.f94620q0, this.f94621r0, strF, j10);
            }
        }
    }
}
