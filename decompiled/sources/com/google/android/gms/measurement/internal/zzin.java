package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzin implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjk zzd;

    public zzin(zzjk zzjkVar, AtomicReference atomicReference, zzp zzpVar, boolean z10) {
        this.zzd = zzjkVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    zzjk zzjkVar = this.zzd;
                    zzdx zzdxVar = zzjkVar.zzb;
                    if (zzdxVar == null) {
                        zzjkVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                        this.zza.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.zzb);
                    this.zza.set(zzdxVar.zze(this.zzb, this.zzc));
                    this.zzd.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e5) {
                    this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e5);
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
