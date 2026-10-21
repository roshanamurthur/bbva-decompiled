package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzot();

    @Nullable
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzoi zza;

    @Nullable
    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzoj[] zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzog[] zze;

    @Nullable
    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzob[] zzg;

    @SafeParcelable.Constructor
    public zzoe(@Nullable @SafeParcelable.Param(id = 1) zzoi zzoiVar, @Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) zzoj[] zzojVarArr, @Nullable @SafeParcelable.Param(id = 5) zzog[] zzogVarArr, @Nullable @SafeParcelable.Param(id = 6) String[] strArr, @Nullable @SafeParcelable.Param(id = 7) zzob[] zzobVarArr) {
        this.zza = zzoiVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzojVarArr;
        this.zze = zzogVarArr;
        this.zzf = strArr;
        this.zzg = zzobVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i10, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    public final zzoi zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Nullable
    public final zzob[] zzd() {
        return this.zzg;
    }

    @Nullable
    public final zzog[] zze() {
        return this.zze;
    }

    @Nullable
    public final zzoj[] zzf() {
        return this.zzd;
    }

    @Nullable
    public final String[] zzg() {
        return this.zzf;
    }
}
