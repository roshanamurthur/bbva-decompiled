package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.play.core.review.internal.zzf
    public final void zzc(String str, Bundle bundle, zzh zzhVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzc(parcelZza, bundle);
        zzc.zzd(parcelZza, zzhVar);
        zzb(2, parcelZza);
    }
}
