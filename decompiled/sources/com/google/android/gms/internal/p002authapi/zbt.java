package com.google.android.gms.internal.p002authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zbt extends zbb implements zbu {
    public zbt() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p002authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) zbc.zba(parcel, SavePasswordResult.CREATOR);
        zbc.zbb(parcel);
        zbb(status, savePasswordResult);
        return true;
    }
}
