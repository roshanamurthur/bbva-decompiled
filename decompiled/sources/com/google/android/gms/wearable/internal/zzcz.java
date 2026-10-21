package com.google.android.gms.wearable.internal;

import ad.d;
import com.google.android.gms.wearable.DataItemAsset;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class zzcz implements DataItemAsset {
    private final String zzdm;
    private final String zzdn;

    public zzcz(DataItemAsset dataItemAsset) {
        this.zzdm = dataItemAsset.getId();
        this.zzdn = dataItemAsset.getDataItemKey();
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getDataItemKey() {
        return this.zzdn;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        return this.zzdm;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataItemAssetEntity[@");
        sb2.append(Integer.toHexString(hashCode()));
        if (this.zzdm == null) {
            sb2.append(",noid");
        } else {
            sb2.append(",");
            sb2.append(this.zzdm);
        }
        sb2.append(", key=");
        return d.f(sb2, this.zzdn, Constant.BRACKET_CLOSE);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ DataItemAsset freeze() {
        return this;
    }
}
