package com.google.android.gms.wearable.internal;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItemAsset;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@KeepName
@SafeParcelable.Class(creator = "DataItemAssetParcelableCreator")
@SafeParcelable.Reserved({1})
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, DataItemAsset {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new zzda();

    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zzdm;

    @SafeParcelable.Field(getter = "getDataItemKey", id = 3)
    private final String zzdn;

    @SafeParcelable.Constructor
    public DataItemAssetParcelable(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zzdm = str;
        this.zzdn = str2;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public String getDataItemKey() {
        return this.zzdn;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public String getId() {
        return this.zzdm;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataItemAssetParcelable[@");
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getDataItemKey(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        this.zzdm = (String) Preconditions.checkNotNull(dataItemAsset.getId());
        this.zzdn = (String) Preconditions.checkNotNull(dataItemAsset.getDataItemKey());
    }

    @Override // com.google.android.gms.common.data.Freezable
    public /* bridge */ /* synthetic */ DataItemAsset freeze() {
        return this;
    }
}
