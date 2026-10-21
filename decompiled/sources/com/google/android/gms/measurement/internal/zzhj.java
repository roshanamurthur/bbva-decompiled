package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhj implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhw zze;

    public zzhj(zzhw zzhwVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.zze = zzhwVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzs.zzt().zzz(this.zza, null, this.zzb, this.zzc, this.zzd);
    }
}
