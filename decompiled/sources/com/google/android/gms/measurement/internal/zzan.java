package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zzan {
    private static volatile Handler zza;
    private final zzgm zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzan(zzgm zzgmVar) {
        Preconditions.checkNotNull(zzgmVar);
        this.zzb = zzgmVar;
        this.zzc = new zzam(this, zzgmVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzan.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzau().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j10) {
        zzb();
        if (j10 >= 0) {
            this.zzd = this.zzb.zzav().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j10)) {
                return;
            }
            this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
