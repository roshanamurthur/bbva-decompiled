package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PhoneParcelCreator")
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzbq();

    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getNumber", id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(id = 1) int i10, @Nullable @SafeParcelable.Param(id = 2) String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
