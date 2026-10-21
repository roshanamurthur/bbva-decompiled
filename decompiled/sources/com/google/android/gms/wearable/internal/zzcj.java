package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class zzcj extends DataClient {
    private final DataApi zzdi;

    public zzcj(@NonNull Context context, @NonNull GoogleApi.Settings settings) {
        super(context, settings);
        this.zzdi = new zzbw();
    }

    private final Task<Void> zza(DataClient.OnDataChangedListener onDataChangedListener, IntentFilter[] intentFilterArr) {
        ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener");
        return doRegisterEventListener(new zzcv(onDataChangedListener, intentFilterArr, listenerHolderCreateListenerHolder), new zzcw(onDataChangedListener, listenerHolderCreateListenerHolder.getListenerKey()));
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Void> addListener(@NonNull DataClient.OnDataChangedListener onDataChangedListener) {
        return zza(onDataChangedListener, new IntentFilter[]{zzgj.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Integer> deleteDataItems(@NonNull Uri uri) {
        return PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), uri), zzcp.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItem> getDataItem(@NonNull Uri uri) {
        return PendingResultUtil.toTask(this.zzdi.getDataItem(asGoogleApiClient(), uri), zzcl.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems() {
        return PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient()), zzcm.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(@NonNull Asset asset) {
        return PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), asset), zzcr.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItem> putDataItem(@NonNull PutDataRequest putDataRequest) {
        return PendingResultUtil.toTask(this.zzdi.putDataItem(asGoogleApiClient(), putDataRequest), zzck.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Boolean> removeListener(@NonNull DataClient.OnDataChangedListener onDataChangedListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onDataChangedListener, getLooper(), "DataListener").getListenerKey());
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems(@NonNull Uri uri) {
        return PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), uri), zzcn.zzbx);
    }

    public zzcj(@NonNull Activity activity, @NonNull GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzdi = new zzbw();
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Void> addListener(@NonNull DataClient.OnDataChangedListener onDataChangedListener, @NonNull Uri uri, int i10) {
        Asserts.checkNotNull(uri, "uri must not be null");
        Preconditions.checkArgument(i10 == 0 || i10 == 1, "invalid filter type");
        return zza(onDataChangedListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i10)});
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<Integer> deleteDataItems(@NonNull Uri uri, int i10) {
        return PendingResultUtil.toTask(this.zzdi.deleteDataItems(asGoogleApiClient(), uri, i10), zzcq.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataClient.GetFdForAssetResponse> getFdForAsset(@NonNull DataItemAsset dataItemAsset) {
        return PendingResultUtil.toTask(this.zzdi.getFdForAsset(asGoogleApiClient(), dataItemAsset), zzcs.zzbx);
    }

    @Override // com.google.android.gms.wearable.DataClient
    public final Task<DataItemBuffer> getDataItems(@NonNull Uri uri, int i10) {
        return PendingResultUtil.toTask(this.zzdi.getDataItems(asGoogleApiClient(), uri, i10), zzco.zzbx);
    }
}
