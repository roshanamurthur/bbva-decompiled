package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetConfigsResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdy> CREATOR = new zzdz();

    @SafeParcelable.Field(id = 2)
    private final int statusCode;

    @SafeParcelable.Field(id = 3)
    private final ConnectionConfiguration[] zzdw;

    @SafeParcelable.Constructor
    public zzdy(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) ConnectionConfiguration[] connectionConfigurationArr) {
        this.statusCode = i10;
        this.zzdw = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzdw, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
