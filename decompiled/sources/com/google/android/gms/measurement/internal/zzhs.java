package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhs implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhw zze;

    public zzhs(zzhw zzhwVar, zzah zzahVar, int i10, long j10, boolean z10) {
        this.zze = zzhwVar;
        this.zza = zzahVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzW(this.zza);
        zzhw.zzv(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
