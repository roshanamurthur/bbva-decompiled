package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzhw zzc;

    public zzhd(zzhw zzhwVar, AtomicReference atomicReference, boolean z10) {
        this.zzc = zzhwVar;
        this.zza = atomicReference;
        this.zzb = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
