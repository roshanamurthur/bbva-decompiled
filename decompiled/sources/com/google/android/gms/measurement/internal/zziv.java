package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zziv implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjk zzd;

    public zziv(zzjk zzjkVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjkVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        byte[] bArrZzu = null;
        try {
            try {
                zzjk zzjkVar = this.zzd;
                zzdx zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzfrVar = this.zzd.zzs;
                } else {
                    bArrZzu = zzdxVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzfrVar = this.zzd.zzs;
                }
            } catch (RemoteException e5) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e5);
                zzfrVar = this.zzd.zzs;
            }
            zzkw zzkwVarZzv = zzfrVar.zzv();
        } finally {
            this.zzd.zzs.zzv().zzR(this.zzc, bArrZzu);
        }
    }
}
