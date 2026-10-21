package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "CheckContactlessEligibilityResponseCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getIsContactlessEligible", id = 1)
    private boolean zza;

    @SafeParcelable.Field(getter = "getHasContactlessCompleted", id = 2)
    private boolean zzb;

    private zzg() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzg) {
            zzg zzgVar = (zzg) obj;
            if (Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(zzgVar.zza)) && Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzgVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) boolean z11) {
        this.zza = z10;
        this.zzb = z11;
    }
}
