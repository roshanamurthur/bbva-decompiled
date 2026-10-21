package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzh implements zzaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaf f46112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaf f46113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzaf f46114c;

    public zzh(zzaf zzafVar, zzaf zzafVar2, zzaf zzafVar3) {
        this.f46112a = zzafVar;
        this.f46113b = zzafVar2;
        this.f46114c = zzafVar3;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a((h) this.f46112a.zza(), (zzc) this.f46113b.zza(), ((zzk) this.f46114c).zzb());
    }
}
