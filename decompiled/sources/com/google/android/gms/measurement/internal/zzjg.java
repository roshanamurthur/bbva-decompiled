package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjg implements Runnable {
    final /* synthetic */ zzdx zza;
    final /* synthetic */ zzjj zzb;

    public zzjg(zzjj zzjjVar, zzdx zzdxVar) {
        this.zzb = zzjjVar;
        this.zza = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            try {
                this.zzb.zzb = false;
                if (!this.zzb.zza.zzL()) {
                    this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                    this.zzb.zza.zzJ(this.zza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
