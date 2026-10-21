package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzit implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjk zzc;

    public zzit(zzjk zzjkVar, zzp zzpVar, Bundle bundle) {
        this.zzc = zzjkVar;
        this.zza = zzpVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zzc;
        zzdx zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzjkVar.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e5) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e5);
        }
    }
}
