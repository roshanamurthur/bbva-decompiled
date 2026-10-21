package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            zzc(bundle);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
        zzc.zzb(parcel);
        zzb(bundle2);
        return true;
    }
}
