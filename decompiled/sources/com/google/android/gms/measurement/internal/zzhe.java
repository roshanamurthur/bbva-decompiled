package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhe implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzhw zzb;

    public zzhe(zzhw zzhwVar, long j10) {
        this.zzb = zzhwVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
