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
@SafeParcelable.Class(creator = "AccountInfoCreator")
@SafeParcelable.Reserved({1})
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountInfo> CREATOR = new zza();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Constructor
    public AccountInfo(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (Objects.equal(this.zza, accountInfo.zza) && Objects.equal(this.zzb, accountInfo.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("accountId", this.zza).add("accountName", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
