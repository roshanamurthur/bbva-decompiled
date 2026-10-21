package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfq implements Runnable {
    final /* synthetic */ zzgu zza;
    final /* synthetic */ zzfr zzb;

    public zzfq(zzfr zzfrVar, zzgu zzguVar) {
        this.zzb = zzfrVar;
        this.zza = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
