package com.google.android.play.core.appupdate.internal;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ f f46056q0;

    public e(f fVar) {
        this.f46056q0 = fVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        f fVar = this.f46056q0;
        zzx zzxVar = (zzx) fVar.f46058b;
        zzxVar.f46073b.zzd("unlinkToDeath", new Object[0]);
        zzxVar.m.asBinder().unlinkToDeath(zzxVar.f46081j, 0);
        zzx zzxVar2 = (zzx) fVar.f46058b;
        zzxVar2.m = null;
        zzxVar2.f46078g = false;
    }
}
