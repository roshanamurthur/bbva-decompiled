package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

/* JADX INFO: loaded from: classes9.dex */
final class zzz extends zzn<Status> {
    private CapabilityApi.CapabilityListener zzbs;

    private zzz(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener) {
        super(googleApiClient);
        this.zzbs = capabilityListener;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        this.zzbs = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzhg) anyClient).zza(this, this.zzbs);
        this.zzbs = null;
    }

    public /* synthetic */ zzz(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, zzp zzpVar) {
        this(googleApiClient, capabilityListener);
    }
}
