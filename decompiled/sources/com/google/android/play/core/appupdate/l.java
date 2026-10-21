package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaf f46089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaf f46090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzaf f46091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaf f46092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzaf f46093e;

    public /* synthetic */ l(b bVar) {
        zzk zzkVar = new zzk(bVar);
        zzaf zzafVarZzb = zzad.zzb(new zzu(zzkVar));
        this.f46089a = zzafVarZzb;
        zzaf zzafVarZzb2 = zzad.zzb(new zzs(zzkVar, zzafVarZzb));
        this.f46090b = zzafVarZzb2;
        zzaf zzafVarZzb3 = zzad.zzb(new zzd(zzkVar));
        this.f46091c = zzafVarZzb3;
        zzaf zzafVarZzb4 = zzad.zzb(new zzh(zzafVarZzb2, zzafVarZzb3, zzkVar));
        this.f46092d = zzafVarZzb4;
        this.f46093e = zzad.zzb(new zzj(zzafVarZzb4));
    }

    @Override // com.google.android.play.core.appupdate.zza
    public final AppUpdateManager zza() {
        return (AppUpdateManager) this.f46093e.zza();
    }
}
