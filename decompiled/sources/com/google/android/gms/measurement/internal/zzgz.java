package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgz implements Runnable {
    final /* synthetic */ zzhw zza;

    public zzgz(zzhw zzhwVar) {
        this.zza = zzhwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
