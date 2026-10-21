package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkc extends zzan {
    final /* synthetic */ zzkd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkc(zzkd zzkdVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzkdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        this.zza.zza();
        androidx.activity.a.g(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
