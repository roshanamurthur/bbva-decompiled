package com.google.android.gms.internal.p002authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zbh extends zbb implements zbi {
    public zbh() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p002authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        AuthorizationResult authorizationResult = (AuthorizationResult) zbc.zba(parcel, AuthorizationResult.CREATOR);
        zbc.zbb(parcel);
        zbb(status, authorizationResult);
        return true;
    }
}
