package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzhw zzb;

    public zzgy(zzhw zzhwVar, boolean z10) {
        this.zzb = zzhwVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZzJ = this.zzb.zzs.zzJ();
        boolean zZzI = this.zzb.zzs.zzI();
        this.zzb.zzs.zzF(this.zza);
        if (zZzI == this.zza) {
            this.zzb.zzs.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzs.zzJ() == zZzJ || this.zzb.zzs.zzJ() != this.zzb.zzs.zzI()) {
            this.zzb.zzs.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zZzJ));
        }
        this.zzb.zzad();
    }
}
