package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhq implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzhw zzf;

    public zzhq(zzhw zzhwVar, zzah zzahVar, long j10, int i10, long j11, boolean z10) {
        this.zzf = zzhwVar;
        this.zza = zzahVar;
        this.zzb = j10;
        this.zzc = i10;
        this.zzd = j11;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzW(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzhw.zzv(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}
