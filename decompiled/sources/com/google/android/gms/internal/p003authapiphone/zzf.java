package com.google.android.gms.internal.p003authapiphone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p003authapiphone.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z10 = parcel.readInt() != 0;
        zzc.zzb(parcel);
        zzb(status, z10);
        return true;
    }
}
