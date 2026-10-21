package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;

/* JADX INFO: loaded from: classes9.dex */
final class zzcb extends zzn<DataApi.DeleteDataItemsResult> {
    private final /* synthetic */ Uri zzco;
    private final /* synthetic */ int zzdc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcb(zzbw zzbwVar, GoogleApiClient googleApiClient, Uri uri, int i10) {
        super(googleApiClient);
        this.zzco = uri;
        this.zzdc = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzch(status, 0);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzep) ((zzhg) anyClient).getService()).zzb(new zzgp(this), this.zzco, this.zzdc);
    }
}
