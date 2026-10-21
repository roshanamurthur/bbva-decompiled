package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbw implements DataApi {
    private static PendingResult<Status> zza(GoogleApiClient googleApiClient, DataApi.DataListener dataListener, IntentFilter[] intentFilterArr) {
        return zzb.zza(googleApiClient, new zzce(intentFilterArr), dataListener);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataApi.DataListener dataListener) {
        return zza(googleApiClient, dataListener, new IntentFilter[]{zzgj.zzc("com.google.android.gms.wearable.DATA_CHANGED")});
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, Uri uri) {
        return deleteDataItems(googleApiClient, uri, 0);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.DataItemResult> getDataItem(GoogleApiClient googleApiClient, Uri uri) {
        return googleApiClient.enqueue(new zzby(this, googleApiClient, uri));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new zzbz(this, googleApiClient));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.getData() == null) {
            return googleApiClient.enqueue(new zzcc(this, googleApiClient, asset));
        }
        throw new IllegalArgumentException("invalid asset");
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.DataItemResult> putDataItem(GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
        return googleApiClient.enqueue(new zzbx(this, googleApiClient, putDataRequest));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, DataApi.DataListener dataListener) {
        return googleApiClient.enqueue(new zzcf(this, googleApiClient, dataListener));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient googleApiClient, Uri uri, int i10) {
        Asserts.checkNotNull(uri, "uri must not be null");
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "invalid filter type");
        return googleApiClient.enqueue(new zzcb(this, googleApiClient, uri, i10));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, Uri uri) {
        return getDataItems(googleApiClient, uri, 0);
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, DataApi.DataListener dataListener, Uri uri, int i10) {
        Asserts.checkNotNull(uri, "uri must not be null");
        Preconditions.checkArgument(i10 == 0 || i10 == 1, "invalid filter type");
        return zza(googleApiClient, dataListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.DATA_CHANGED", uri, i10)});
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataItemBuffer> getDataItems(GoogleApiClient googleApiClient, Uri uri, int i10) {
        Asserts.checkNotNull(uri, "uri must not be null");
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "invalid filter type");
        return googleApiClient.enqueue(new zzca(this, googleApiClient, uri, i10));
    }

    @Override // com.google.android.gms.wearable.DataApi
    public final PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient googleApiClient, DataItemAsset dataItemAsset) {
        return googleApiClient.enqueue(new zzcd(this, googleApiClient, dataItemAsset));
    }
}
