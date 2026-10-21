package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();

    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private final PointF zzb;

    @SafeParcelable.Constructor
    public zzpc(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) PointF pointF) {
        this.zza = i10;
        this.zzb = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final PointF zzb() {
        return this.zzb;
    }
}
