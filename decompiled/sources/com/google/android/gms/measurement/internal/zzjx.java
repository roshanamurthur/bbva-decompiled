package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjx extends zzan {
    final /* synthetic */ zzjy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjx(zzjy zzjyVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    @WorkerThread
    public final void zzc() {
        zzjy zzjyVar = this.zza;
        zzjyVar.zzc.zzg();
        zzjyVar.zzd(false, false, zzjyVar.zzc.zzs.zzav().elapsedRealtime());
        zzjyVar.zzc.zzs.zzd().zzf(zzjyVar.zzc.zzs.zzav().elapsedRealtime());
    }
}
