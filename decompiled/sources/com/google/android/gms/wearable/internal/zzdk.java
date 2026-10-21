package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetCapabilityResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdk> CREATOR = new zzdl();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @SafeParcelable.Field(id = 3)
    public final zzah zzdq;

    @SafeParcelable.Constructor
    public zzdk(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) zzah zzahVar) {
        this.statusCode = i10;
        this.zzdq = zzahVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdq, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
