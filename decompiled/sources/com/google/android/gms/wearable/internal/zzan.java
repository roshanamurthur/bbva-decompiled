package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelApi;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
final class zzan extends zzn<Status> {
    private final String zzce;
    private ChannelApi.ChannelListener zzcf;

    public zzan(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener, @Nullable String str) {
        super(googleApiClient);
        this.zzcf = (ChannelApi.ChannelListener) Preconditions.checkNotNull(channelListener);
        this.zzce = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        this.zzcf = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzhg) anyClient).zza(this, this.zzcf, this.zzce);
        this.zzcf = null;
    }
}
