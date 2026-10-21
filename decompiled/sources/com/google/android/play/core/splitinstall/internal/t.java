package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class t extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ zzaf f46284q0;

    public t(zzaf zzafVar) {
        this.f46284q0 = zzafVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        synchronized (this.f46284q0.f46291f) {
            try {
                if (this.f46284q0.f46296k.get() > 0 && this.f46284q0.f46296k.decrementAndGet() > 0) {
                    this.f46284q0.f46287b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                zzaf zzafVar = this.f46284q0;
                if (zzafVar.m != null) {
                    zzafVar.f46287b.zzd("Unbind from service.", new Object[0]);
                    zzaf zzafVar2 = this.f46284q0;
                    zzafVar2.f46286a.unbindService(zzafVar2.f46297l);
                    zzaf zzafVar3 = this.f46284q0;
                    zzafVar3.f46292g = false;
                    zzafVar3.m = null;
                    zzafVar3.f46297l = null;
                }
                this.f46284q0.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
