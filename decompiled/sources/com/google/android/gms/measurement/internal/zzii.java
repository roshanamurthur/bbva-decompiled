package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzik zzc;

    public zzii(zzik zzikVar, zzid zzidVar, long j10) {
        this.zzc = zzikVar;
        this.zza = zzidVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzik zzikVar = this.zzc;
        zzikVar.zza = null;
        zzikVar.zzs.zzt().zzG(null);
    }
}
