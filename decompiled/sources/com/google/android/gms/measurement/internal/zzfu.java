package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfu implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzgj zzb;

    public zzfu(zzgj zzgjVar, zzab zzabVar) {
        this.zzb = zzgjVar;
        this.zza = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzM(this.zza);
        } else {
            this.zzb.zza.zzS(this.zza);
        }
    }
}
