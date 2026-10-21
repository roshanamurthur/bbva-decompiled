package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GeoPointParcelCreator")
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzbj();

    @SafeParcelable.Field(getter = "getLat", id = 1)
    private final double zza;

    @SafeParcelable.Field(getter = "getLng", id = 2)
    private final double zzb;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 1) double d2, @SafeParcelable.Param(id = 2) double d3) {
        this.zza = d2;
        this.zzb = d3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.zza);
        SafeParcelWriter.writeDouble(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
