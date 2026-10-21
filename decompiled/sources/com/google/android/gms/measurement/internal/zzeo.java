package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzeo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzep zzb;

    public zzeo(zzep zzepVar, boolean z10) {
        this.zzb = zzepVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzI(this.zza);
    }
}
