package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzil implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjk zzf;

    public zzil(zzjk zzjkVar, String str, String str2, zzp zzpVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjkVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e5;
        Bundle bundle2 = new Bundle();
        try {
            try {
                zzjk zzjkVar = this.zzf;
                zzdx zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzks> listZzh = zzdxVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (listZzh != null) {
                    for (zzks zzksVar : listZzh) {
                        String str = zzksVar.zze;
                        if (str != null) {
                            bundle.putString(zzksVar.zzb, str);
                        } else {
                            Long l6 = zzksVar.zzd;
                            if (l6 != null) {
                                bundle.putLong(zzksVar.zzb, l6.longValue());
                            } else {
                                Double d2 = zzksVar.zzg;
                                if (d2 != null) {
                                    bundle.putDouble(zzksVar.zzb, d2.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                } catch (RemoteException e7) {
                    e5 = e7;
                    this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e5);
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e10) {
            bundle = bundle2;
            e5 = e10;
        } catch (Throwable th3) {
            th = th3;
            this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
            throw th;
        }
    }
}
