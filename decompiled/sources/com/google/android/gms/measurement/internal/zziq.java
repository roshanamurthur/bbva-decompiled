package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zziq implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjk zzc;

    public zziq(zzjk zzjkVar, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjkVar;
        this.zza = zzpVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        String strZzd = null;
        try {
            if (this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                zzjk zzjkVar = this.zzc;
                zzdx zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                    zzfrVar = this.zzc.zzs;
                } else {
                    Preconditions.checkNotNull(this.zza);
                    strZzd = zzdxVar.zzd(this.zza);
                    if (strZzd != null) {
                        this.zzc.zzs.zzq().zzO(strZzd);
                        this.zzc.zzs.zzm().zze.zzb(strZzd);
                    }
                    this.zzc.zzQ();
                    zzfrVar = this.zzc.zzs;
                }
            } else {
                this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzO(null);
                this.zzc.zzs.zzm().zze.zzb(null);
                zzfrVar = this.zzc.zzs;
            }
        } catch (RemoteException e5) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e5);
            zzfrVar = this.zzc.zzs;
        } finally {
            this.zzc.zzs.zzv().zzU(this.zzb, null);
        }
        zzkw zzkwVarZzv = zzfrVar.zzv();
    }
}
