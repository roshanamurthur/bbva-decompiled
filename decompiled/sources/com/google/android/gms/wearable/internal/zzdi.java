package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetAllCapabilitiesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzdi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdi> CREATOR = new zzdj();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @VisibleForTesting
    @SafeParcelable.Field(id = 3)
    public final List<zzah> zzdp;

    @SafeParcelable.Constructor
    public zzdi(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) List<zzah> list) {
        this.statusCode = i10;
        this.zzdp = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzdp, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
