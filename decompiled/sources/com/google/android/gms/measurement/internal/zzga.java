package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzga implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgj zzb;

    public zzga(zzgj zzgjVar, zzp zzpVar) {
        this.zzb = zzgjVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        zzkp zzkpVar = this.zzb.zza;
        zzp zzpVar = this.zza;
        zzkpVar.zzaz().zzg();
        zzkpVar.zzB();
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzkpVar.zzd(zzpVar);
    }
}
