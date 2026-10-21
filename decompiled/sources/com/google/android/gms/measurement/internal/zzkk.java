package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkk implements Callable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzkp zzb;

    public zzkk(zzkp zzkpVar, zzp zzpVar) {
        this.zzb = zzkpVar;
        this.zza = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzah zzahVarZzh = this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza));
        zzag zzagVar = zzag.ANALYTICS_STORAGE;
        if (zzahVarZzh.zzi(zzagVar) && zzah.zzb(this.zza.zzv).zzi(zzagVar)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
