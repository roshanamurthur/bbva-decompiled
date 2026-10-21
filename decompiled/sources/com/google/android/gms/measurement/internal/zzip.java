package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzip implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzjk zzc;

    public zzip(zzjk zzjkVar, AtomicReference atomicReference, zzp zzpVar) {
        this.zzc = zzjkVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    if (!this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                        this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.zzc.zzs.zzq().zzO(null);
                        this.zzc.zzs.zzm().zze.zzb(null);
                        this.zza.set(null);
                        this.zza.notify();
                        return;
                    }
                    zzjk zzjkVar = this.zzc;
                    zzdx zzdxVar = zzjkVar.zzb;
                    if (zzdxVar == null) {
                        zzjkVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        this.zza.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzdxVar.zzd(this.zzb));
                    String str = (String) this.zza.get();
                    if (str != null) {
                        this.zzc.zzs.zzq().zzO(str);
                        this.zzc.zzs.zzm().zze.zzb(str);
                    }
                    this.zzc.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e5) {
                    this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e5);
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
