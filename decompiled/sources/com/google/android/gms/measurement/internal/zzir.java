package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzir implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjk zzb;

    public zzir(zzjk zzjkVar, zzp zzpVar) {
        this.zzb = zzjkVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zzb;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzj(this.zza);
            this.zzb.zzs.zzi().zzm();
            this.zzb.zzD(zzdxVar, null, this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e5) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send app launch to the service", e5);
        }
    }
}
