package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzft implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgj zzc;

    public zzft(zzgj zzgjVar, zzab zzabVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzabVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzN(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzT(this.zza, this.zzb);
        }
    }
}
