package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzds extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzee zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzee zzeeVar, String str, String str2, Object obj, boolean z10) {
        super(zzeeVar, true);
        this.zze = zzeeVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    public final void zza() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.zze.zzj)).setUserProperty(this.zza, this.zzb, ObjectWrapper.wrap(this.zzc), this.zzd, this.zzh);
    }
}
