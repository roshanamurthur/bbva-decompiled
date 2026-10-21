package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;

/* JADX INFO: loaded from: classes9.dex */
public final class zzdb extends DataBufferRef implements DataItemAsset {
    public zzdb(DataHolder dataHolder, int i10) {
        super(dataHolder, i10);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ DataItemAsset freeze() {
        return new zzcz(this);
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getDataItemKey() {
        return getString("asset_key");
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        return getString("asset_id");
    }
}
