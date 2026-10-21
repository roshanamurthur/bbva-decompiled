package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
final class zzb<T> extends zzn<Status> {
    private T zzaw;
    private ListenerHolder<T> zzax;
    private zzc<T> zzay;

    private zzb(GoogleApiClient googleApiClient, T t10, ListenerHolder<T> listenerHolder, zzc<T> zzcVar) {
        super(googleApiClient);
        this.zzaw = (T) Preconditions.checkNotNull(t10);
        this.zzax = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
        this.zzay = (zzc) Preconditions.checkNotNull(zzcVar);
    }

    public static <T> PendingResult<Status> zza(GoogleApiClient googleApiClient, zzc<T> zzcVar, T t10) {
        return googleApiClient.enqueue(new zzb(googleApiClient, t10, googleApiClient.registerListener(t10), zzcVar));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        this.zzaw = null;
        this.zzax = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        this.zzay.zza((zzhg) anyClient, this, this.zzaw, this.zzax);
        this.zzaw = null;
        this.zzax = null;
    }
}
