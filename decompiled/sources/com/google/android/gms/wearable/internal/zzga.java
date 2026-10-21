package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "SendMessageResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzga extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzga> CREATOR = new zzgb();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @SafeParcelable.Field(id = 3)
    public final int zzeh;

    @SafeParcelable.Constructor
    public zzga(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11) {
        this.statusCode = i10;
        this.zzeh = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeInt(parcel, 3, this.zzeh);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
