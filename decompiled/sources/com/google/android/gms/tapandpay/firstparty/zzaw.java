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
@SafeParcelable.Class(creator = "TokenReferenceCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();

    @SafeParcelable.Field(id = 2)
    final String zza;

    @SafeParcelable.Field(id = 3)
    final int zzb;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzaw) {
            zzaw zzawVar = (zzaw) obj;
            if (Objects.equal(this.zza, zzawVar.zza) && this.zzb == zzawVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("tokenReferenceId", this.zza).add("tokenProvider", Integer.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
