package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "FaceParcelCreator")
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    @SafeParcelable.Field(getter = "getId", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect zzb;

    @SafeParcelable.Field(getter = "getRollAngle", id = 3)
    private final float zzc;

    @SafeParcelable.Field(getter = "getPanAngle", id = 4)
    private final float zzd;

    @SafeParcelable.Field(getter = "getTiltAngle", id = 5)
    private final float zze;

    @SafeParcelable.Field(getter = "getLeftEyeOpenProbability", id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getRightEyeOpenProbability", id = 7)
    private final float zzg;

    @SafeParcelable.Field(getter = "getSmileProbability", id = 8)
    private final float zzh;

    @SafeParcelable.Field(getter = "getConfidenceScore", id = 9)
    private final float zzi;

    @SafeParcelable.Field(getter = "getLandmarkParcelList", id = 10)
    private final List zzj;

    @SafeParcelable.Field(getter = "getContourParcelList", id = 11)
    private final List zzk;

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) float f6, @SafeParcelable.Param(id = 4) float f10, @SafeParcelable.Param(id = 5) float f11, @SafeParcelable.Param(id = 6) float f12, @SafeParcelable.Param(id = 7) float f13, @SafeParcelable.Param(id = 8) float f14, @SafeParcelable.Param(id = 9) float f15, @SafeParcelable.Param(id = 10) List list, @SafeParcelable.Param(id = 11) List list2) {
        this.zza = i10;
        this.zzb = rect;
        this.zzc = f6;
        this.zzd = f10;
        this.zze = f11;
        this.zzf = f12;
        this.zzg = f13;
        this.zzh = f14;
        this.zzi = f15;
        this.zzj = list;
        this.zzk = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.zzh);
        SafeParcelWriter.writeFloat(parcel, 9, this.zzi);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final float zzc() {
        return this.zzg;
    }

    public final float zzd() {
        return this.zzc;
    }

    public final float zze() {
        return this.zzh;
    }

    public final float zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zza;
    }

    public final Rect zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzj;
    }
}
