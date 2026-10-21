package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzod;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjy {

    @VisibleForTesting
    protected long zza;

    @VisibleForTesting
    protected long zzb;
    final /* synthetic */ zzka zzc;
    private final zzan zzd;

    public zzjy(zzka zzkaVar) {
        this.zzc = zzkaVar;
        this.zzd = new zzjx(this, zzkaVar.zzs);
        long jElapsedRealtime = zzkaVar.zzs.zzav().elapsedRealtime();
        this.zza = jElapsedRealtime;
        this.zzb = jElapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    @WorkerThread
    public final void zzb(long j10) {
        this.zzd.zzb();
    }

    @WorkerThread
    public final void zzc(long j10) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j10;
        this.zzb = j10;
    }

    @WorkerThread
    public final boolean zzd(boolean z10, boolean z11, long j10) {
        this.zzc.zzg();
        this.zzc.zza();
        zzod.zzc();
        if (!this.zzc.zzs.zzf().zzs(null, zzdu.zzad) || this.zzc.zzs.zzJ()) {
            this.zzc.zzs.zzm().zzj.zzb(this.zzc.zzs.zzav().currentTimeMillis());
        }
        long j11 = j10 - this.zza;
        if (!z10 && j11 < 1000) {
            this.zzc.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.zzb;
            this.zzb = j10;
        }
        this.zzc.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        zzkw.zzJ(this.zzc.zzs.zzs().zzj(!this.zzc.zzs.zzf().zzu()), bundle, true);
        if (!z11) {
            this.zzc.zzs.zzq().zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_e", bundle);
        }
        this.zza = j10;
        this.zzd.zzb();
        this.zzd.zzd(3600000L);
        return true;
    }
}
