package com.google.android.play.core.appupdate.internal;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ zzx f46053q0;

    public c(zzx zzxVar) {
        this.f46053q0 = zzxVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        synchronized (this.f46053q0.f46077f) {
            try {
                if (this.f46053q0.f46082k.get() > 0 && this.f46053q0.f46082k.decrementAndGet() > 0) {
                    this.f46053q0.f46073b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                zzx zzxVar = this.f46053q0;
                if (zzxVar.m != null) {
                    zzxVar.f46073b.zzd("Unbind from service.", new Object[0]);
                    zzx zzxVar2 = this.f46053q0;
                    zzxVar2.f46072a.unbindService(zzxVar2.f46083l);
                    zzx zzxVar3 = this.f46053q0;
                    zzxVar3.f46078g = false;
                    zzxVar3.m = null;
                    zzxVar3.f46083l = null;
                }
                this.f46053q0.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
