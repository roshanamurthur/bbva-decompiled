package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetFdForAssetResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @SafeParcelable.Field(id = 3)
    public final ParcelFileDescriptor zzdz;

    @SafeParcelable.Constructor
    public zzee(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.statusCode = i10;
        this.zzdz = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdz, i10 | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
