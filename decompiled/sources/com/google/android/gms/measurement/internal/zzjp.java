package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjp implements Runnable {
    final /* synthetic */ zzkp zza;
    final /* synthetic */ Runnable zzb;

    public zzjp(zzjr zzjrVar, zzkp zzkpVar, Runnable runnable) {
        this.zza = zzkpVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
