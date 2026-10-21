package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "CloseChannelResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzbu();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @SafeParcelable.Constructor
    public zzbt(@SafeParcelable.Param(id = 2) int i10) {
        this.statusCode = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
