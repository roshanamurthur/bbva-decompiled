package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzka zzb;

    public zzjs(zzka zzkaVar, long j10) {
        this.zzb = zzkaVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzka.zzl(this.zzb, this.zza);
    }
}
