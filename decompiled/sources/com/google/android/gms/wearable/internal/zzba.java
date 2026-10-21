package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes9.dex */
final class zzba extends zzn<Status> {
    private final /* synthetic */ zzay zzcm;
    private final /* synthetic */ int zzcn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(zzay zzayVar, GoogleApiClient googleApiClient, int i10) {
        super(googleApiClient);
        this.zzcm = zzayVar;
        this.zzcn = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzep) ((zzhg) anyClient).getService()).zzb(new zzgo(this), this.zzcm.zzce, this.zzcn);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
