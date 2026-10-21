package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();

    @SafeParcelable.Field(getter = "getPerformanceMode", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getLandmarkMode", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getClassificationMode", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getContourMode", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "isTrackingEnabled", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", id = 6)
    private final float zzf;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) float f6) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = z10;
        this.zzf = f6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
