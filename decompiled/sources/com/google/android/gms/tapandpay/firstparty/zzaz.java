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
@SafeParcelable.Class(creator = "TransactionInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    @SafeParcelable.Field(id = 2)
    final int zza;

    @SafeParcelable.Field(id = 3)
    final int zzb;

    @SafeParcelable.Field(id = 4)
    final int zzc;

    @SafeParcelable.Field(id = 5)
    final int zzd;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zza == zzazVar.zza && this.zzb == zzazVar.zzb && this.zzc == zzazVar.zzc && this.zzd == zzazVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionDelivery", Integer.valueOf(this.zza)).add("transactionLimit", Integer.valueOf(this.zzb)).add("supportedTransactions", Integer.valueOf(this.zzc)).add("deliveryPreference", Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
