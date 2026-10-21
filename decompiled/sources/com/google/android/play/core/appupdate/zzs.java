package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzs implements zzaf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaf f46117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaf f46118b;

    public zzs(zzaf zzafVar, zzaf zzafVar2) {
        this.f46117a = zzafVar;
        this.f46118b = zzafVar2;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final /* bridge */ /* synthetic */ Object zza() {
        return new h(((zzk) this.f46117a).zzb(), (i) this.f46118b.zza());
    }
}
