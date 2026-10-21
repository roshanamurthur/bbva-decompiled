package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzka extends zzf {
    protected final zzjz zza;
    protected final zzjy zzb;
    protected final zzjw zzc;
    private Handler zzd;

    public zzka(zzfr zzfrVar) {
        super(zzfrVar);
        this.zza = new zzjz(this);
        this.zzb = new zzjy(this);
        this.zzc = new zzjw(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzka zzkaVar, long j10) {
        zzkaVar.zzg();
        zzkaVar.zzm();
        zzkaVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkaVar.zzc.zza(j10);
        if (zzkaVar.zzs.zzf().zzu()) {
            zzkaVar.zzb.zzb(j10);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzka zzkaVar, long j10) {
        zzkaVar.zzg();
        zzkaVar.zzm();
        zzkaVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkaVar.zzs.zzf().zzu() || zzkaVar.zzs.zzm().zzl.zzb()) {
            zzkaVar.zzb.zzc(j10);
        }
        zzkaVar.zzc.zzb();
        zzjz zzjzVar = zzkaVar.zza;
        zzjzVar.zza.zzg();
        if (zzjzVar.zza.zzs.zzJ()) {
            zzjzVar.zzb(zzjzVar.zza.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }
}
