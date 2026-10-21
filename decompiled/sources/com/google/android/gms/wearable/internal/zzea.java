package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetConnectedNodesResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzea> CREATOR = new zzeb();

    @SafeParcelable.Field(id = 2)
    public final int statusCode;

    @SafeParcelable.Field(id = 3)
    public final List<zzfo> zzdx;

    @SafeParcelable.Constructor
    public zzea(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) List<zzfo> list) {
        this.statusCode = i10;
        this.zzdx = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zzdx, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
