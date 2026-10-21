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
@SafeParcelable.Class(creator = "NotificationSettingsCreator")
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    @SafeParcelable.Field(id = 1)
    final boolean zza;

    @SafeParcelable.Field(id = 2)
    final boolean zzb;

    @SafeParcelable.Field(id = 3)
    final boolean zzc;

    @SafeParcelable.Field(id = 4)
    final int zzd;

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) boolean z12, @SafeParcelable.Param(id = 4) int i10) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.zza == zzalVar.zza && this.zzb == zzalVar.zzb && this.zzc == zzalVar.zzc && this.zzd == zzalVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactions", Boolean.valueOf(this.zza)).add("plasticTransactions", Boolean.valueOf(this.zzb)).add("promotions", Boolean.valueOf(this.zzc)).add("bitMask", Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
