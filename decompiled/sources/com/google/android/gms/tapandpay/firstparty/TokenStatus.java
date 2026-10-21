package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenStatusCreator")
@SafeParcelable.Reserved({1})
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzay();

    @SafeParcelable.Field(id = 2)
    zzaw zza;

    @SafeParcelable.Field(id = 3)
    int zzb;

    @SafeParcelable.Field(id = 4)
    boolean zzc;

    @SafeParcelable.Constructor
    public TokenStatus(@SafeParcelable.Param(id = 2) zzaw zzawVar, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) boolean z10) {
        this.zza = zzawVar;
        this.zzb = i10;
        this.zzc = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (Objects.equal(this.zza, tokenStatus.zza) && this.zzb == tokenStatus.zzb && this.zzc == tokenStatus.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("tokenReference", this.zza).add("tokenState", Integer.valueOf(this.zzb)).add("isSelected", Boolean.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
