package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgf implements Runnable {
    final /* synthetic */ zzks zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgj zzc;

    public zzgf(zzgj zzgjVar, zzks zzksVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzksVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzO(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzV(this.zza, this.zzb);
        }
    }
}
