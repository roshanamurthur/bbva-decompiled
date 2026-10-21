package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzim implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzks zzc;
    final /* synthetic */ zzjk zzd;

    public zzim(zzjk zzjkVar, zzp zzpVar, boolean z10, zzks zzksVar) {
        this.zzd = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z10;
        this.zzc = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zzd;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
