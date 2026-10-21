package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzja implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzab zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ zzjk zze;

    public zzja(zzjk zzjkVar, boolean z10, zzp zzpVar, boolean z11, zzab zzabVar, zzab zzabVar2) {
        this.zze = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzabVar;
        this.zzd = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zze;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
