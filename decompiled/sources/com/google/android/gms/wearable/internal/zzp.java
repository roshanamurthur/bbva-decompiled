package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

/* JADX INFO: loaded from: classes9.dex */
final class zzp extends zzn<CapabilityApi.GetCapabilityResult> {
    private final /* synthetic */ String zzbp;
    private final /* synthetic */ int zzbq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzo zzoVar, GoogleApiClient googleApiClient, String str, int i10) {
        super(googleApiClient);
        this.zzbp = str;
        this.zzbq = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzy(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzep) ((zzhg) anyClient).getService()).zza(new zzgr(this), this.zzbp, this.zzbq);
    }
}
