package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zziz implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjk zze;

    public zziz(zzjk zzjkVar, boolean z10, zzp zzpVar, boolean z11, zzau zzauVar, String str) {
        this.zze = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zze;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
