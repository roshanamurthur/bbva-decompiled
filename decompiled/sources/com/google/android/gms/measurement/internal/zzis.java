package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzis implements Runnable {
    final /* synthetic */ zzid zza;
    final /* synthetic */ zzjk zzb;

    public zzis(zzjk zzjkVar, zzid zzidVar) {
        this.zzb = zzjkVar;
        this.zza = zzidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zzb;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zzid zzidVar = this.zza;
            if (zzidVar == null) {
                zzdxVar.zzq(0L, null, null, zzjkVar.zzs.zzau().getPackageName());
            } else {
                zzdxVar.zzq(zzidVar.zzc, zzidVar.zza, zzidVar.zzb, zzjkVar.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e5) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e5);
        }
    }
}
