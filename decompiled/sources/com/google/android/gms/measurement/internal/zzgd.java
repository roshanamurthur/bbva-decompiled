package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgd implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgj zzc;

    public zzgd(zzgj zzgjVar, zzau zzauVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        this.zzc.zza.zzE(this.zza, this.zzb);
    }
}
