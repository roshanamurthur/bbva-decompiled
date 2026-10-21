package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzje implements Runnable {
    final /* synthetic */ zzdx zza;
    final /* synthetic */ zzjj zzb;

    public zzje(zzjj zzjjVar, zzdx zzdxVar) {
        this.zzb = zzjjVar;
        this.zza = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzs.zzay().zzj().zza("Connected to service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
