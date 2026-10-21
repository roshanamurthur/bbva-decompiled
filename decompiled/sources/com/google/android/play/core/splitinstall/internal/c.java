package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ d f46263q0;

    public c(d dVar) {
        this.f46263q0 = dVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        d dVar = this.f46263q0;
        zzaf zzafVar = dVar.f46264a;
        zzafVar.f46287b.zzd("unlinkToDeath", new Object[0]);
        zzafVar.m.asBinder().unlinkToDeath(zzafVar.f46295j, 0);
        zzaf zzafVar2 = dVar.f46264a;
        zzafVar2.m = null;
        zzafVar2.f46292g = false;
    }
}
