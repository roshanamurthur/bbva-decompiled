package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "InStoreCvmConfigCreator")
@SafeParcelable.Reserved({1})
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @SafeParcelable.Field(id = 2)
    final boolean zza;

    @SafeParcelable.Field(id = 3)
    final int zzb;

    @SafeParcelable.Field(id = 4)
    final int zzc;

    @SafeParcelable.Field(id = 5)
    final int zzd;

    @SafeParcelable.Field(defaultValue = "false", id = 6)
    final boolean zze;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12, @SafeParcelable.Param(id = 6) boolean z11) {
        this.zza = z10;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = z11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (this.zza == zzahVar.zza && this.zzb == zzahVar.zzb && this.zzd == zzahVar.zzd && this.zzc == zzahVar.zzc && this.zze == zzahVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Boolean.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("requireCdcvmPassing", Boolean.valueOf(this.zza)).add("cdcvmExpirtaionInSecs", Integer.valueOf(this.zzb)).add("unlockedTapLimit", Integer.valueOf(this.zzc)).add("cdcvmTapLimit", Integer.valueOf(this.zzd)).add("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
