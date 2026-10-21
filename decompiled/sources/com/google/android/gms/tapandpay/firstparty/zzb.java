package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.bbva.google.pay.GoogleTapAndPay;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "BadgeInfoCreator")
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final byte[] zzb;

    @SafeParcelable.Field(id = 3)
    final int zzc;

    @SafeParcelable.Field(id = 4)
    final TokenStatus zzd;

    @SafeParcelable.Field(id = 5)
    final String zze;

    @SafeParcelable.Field(id = 6)
    final zzaz zzf;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) TokenStatus tokenStatus, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) zzaz zzazVar) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = tokenStatus;
        this.zze = str2;
        this.zzf = zzazVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.zzc == zzbVar.zzc && Objects.equal(this.zza, zzbVar.zza) && Arrays.equals(this.zzb, zzbVar.zzb) && Objects.equal(this.zzd, zzbVar.zzd) && Objects.equal(this.zze, zzbVar.zze) && Objects.equal(this.zzf, zzbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("clientTokenId", this.zza);
        byte[] bArr = this.zzb;
        return toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add(GoogleTapAndPay.KEY_CARD_NETWORK, Integer.valueOf(this.zzc)).add("tokenStatus", this.zzd).add("tokenLastDigits", this.zze).add("transactionInfo", this.zzf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
