package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzp zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjk zzf;

    public zzjd(zzjk zzjkVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z10) {
        this.zzf = zzjkVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    zzjk zzjkVar = this.zzf;
                    zzdx zzdxVar = zzjkVar.zzb;
                    if (zzdxVar == null) {
                        zzjkVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                        this.zza.set(Collections.emptyList());
                        this.zza.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.zzd);
                        this.zza.set(zzdxVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
                    } else {
                        this.zza.set(zzdxVar.zzi(null, this.zzb, this.zzc, this.zze));
                    }
                    this.zzf.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e5) {
                    this.zzf.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e5);
                    this.zza.set(Collections.emptyList());
                    atomicReference = this.zza;
                }
            } catch (Throwable th2) {
                this.zza.notify();
                throw th2;
            }
        }
    }
}
