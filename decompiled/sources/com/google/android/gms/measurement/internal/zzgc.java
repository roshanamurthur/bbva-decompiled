package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgc implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgj zzc;

    public zzgc(zzgj zzgjVar, zzau zzauVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
