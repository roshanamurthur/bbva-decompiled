package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkh implements Runnable {
    final /* synthetic */ zzkq zza;
    final /* synthetic */ zzkp zzb;

    public zzkh(zzkp zzkpVar, zzkq zzkqVar) {
        this.zzb = zzkpVar;
        this.zza = zzkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}
