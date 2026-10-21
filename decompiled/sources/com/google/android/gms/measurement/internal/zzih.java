package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzih implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    public zzih(zzik zzikVar, long j10) {
        this.zzb = zzikVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
