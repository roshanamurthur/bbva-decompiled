package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int i12 = com.google.android.gms.internal.auth.zzc.zza;
            int i13 = parcel.readInt();
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzc(i13 != 0);
        } else {
            Account account = (Account) com.google.android.gms.internal.auth.zzc.zza(parcel, Account.CREATOR);
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
