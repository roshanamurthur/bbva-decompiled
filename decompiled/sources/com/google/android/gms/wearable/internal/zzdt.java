package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetCloudSyncOptInStatusCreator")
@SafeParcelable.Reserved({1})
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = new zzds();

    @SafeParcelable.Field(id = 2)
    private final int statusCode;

    @SafeParcelable.Field(id = 3)
    private final boolean zzdt;

    @SafeParcelable.Field(id = 4)
    private final boolean zzdu;

    @SafeParcelable.Constructor
    public zzdt(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) boolean z11) {
        this.statusCode = i10;
        this.zzdt = z10;
        this.zzdu = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzdt);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdu);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
