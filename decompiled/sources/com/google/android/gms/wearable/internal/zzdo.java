package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetChannelOutputStreamResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdo> CREATOR = new zzdp();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @Nullable
    @SafeParcelable.Field(id = 3)
    public final ParcelFileDescriptor zzdr;

    @SafeParcelable.Constructor
    public zzdo(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) ParcelFileDescriptor parcelFileDescriptor) {
        this.statusCode = i10;
        this.zzdr = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdr, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
