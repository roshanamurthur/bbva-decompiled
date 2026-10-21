package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzjk zze;

    public zzjc(zzjk zzjkVar, String str, String str2, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjkVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr zzfrVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjk zzjkVar = this.zze;
                zzdx zzdxVar = zzjkVar.zzb;
                if (zzdxVar == null) {
                    zzjkVar.zzs.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzfrVar = this.zze.zzs;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzkw.zzG(zzdxVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzfrVar = this.zze.zzs;
                }
            } catch (RemoteException e5) {
                this.zze.zzs.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e5);
                zzfrVar = this.zze.zzs;
            }
            zzkw zzkwVarZzv = zzfrVar.zzv();
        } finally {
            this.zze.zzs.zzv().zzP(this.zzd, arrayList);
        }
    }
}
