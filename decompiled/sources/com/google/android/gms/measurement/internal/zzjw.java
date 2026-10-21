package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjw {
    final /* synthetic */ zzka zza;
    private zzjv zzb;

    public zzjw(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    @WorkerThread
    public final void zza(long j10) {
        this.zzb = new zzjv(this, this.zza.zzs.zzav().currentTimeMillis(), j10);
        this.zza.zzd.postDelayed(this.zzb, 2000L);
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzg();
        zzjv zzjvVar = this.zzb;
        if (zzjvVar != null) {
            this.zza.zzd.removeCallbacks(zzjvVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
