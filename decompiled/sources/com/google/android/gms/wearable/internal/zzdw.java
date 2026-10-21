package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetConfigResponseCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zzdw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdw> CREATOR = new zzdx();

    @SafeParcelable.Field(id = 2)
    private final int statusCode;

    @SafeParcelable.Field(id = 3)
    private final ConnectionConfiguration zzdv;

    @SafeParcelable.Constructor
    public zzdw(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) ConnectionConfiguration connectionConfiguration) {
        this.statusCode = i10;
        this.zzdv = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdv, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
