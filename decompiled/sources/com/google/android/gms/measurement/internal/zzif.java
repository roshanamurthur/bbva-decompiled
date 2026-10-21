package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzif implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ zzid zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzik zze;

    public zzif(zzik zzikVar, zzid zzidVar, zzid zzidVar2, long j10, boolean z10) {
        this.zze = zzikVar;
        this.zza = zzidVar;
        this.zzb = zzidVar2;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
