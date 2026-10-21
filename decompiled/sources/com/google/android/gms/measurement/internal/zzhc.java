package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzhw zze;

    public zzhc(zzhw zzhwVar, String str, String str2, Object obj, long j10) {
        this.zze = zzhwVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzZ(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
