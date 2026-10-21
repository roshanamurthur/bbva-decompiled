package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzha implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzhw zzb;

    public zzha(zzhw zzhwVar, long j10) {
        this.zzb = zzhwVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
