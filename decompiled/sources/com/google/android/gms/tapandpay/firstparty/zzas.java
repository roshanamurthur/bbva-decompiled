package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.bbva.notifications.constants.PushConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.math.BigDecimal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SeTransactionInfoCreator")
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    @SafeParcelable.Field(id = 1)
    final long zza;

    @SafeParcelable.Field(id = 2)
    final BigDecimal zzb;

    @SafeParcelable.Field(id = 3)
    final String zzc;

    @SafeParcelable.Field(id = 4)
    final long zzd;

    @SafeParcelable.Field(id = 5)
    final int zze;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 1) long j10, @SafeParcelable.Param(id = 2) BigDecimal bigDecimal, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j11, @SafeParcelable.Param(id = 5) int i10) {
        this.zza = j10;
        this.zzb = bigDecimal;
        this.zzc = str;
        this.zzd = j11;
        this.zze = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzas) {
            zzas zzasVar = (zzas) obj;
            if (this.zza == zzasVar.zza && Objects.equal(this.zzb, zzasVar.zzb) && Objects.equal(this.zzc, zzasVar.zzc) && this.zzd == zzasVar.zzd && this.zze == zzasVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), this.zzb, this.zzc, Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionId", Long.valueOf(this.zza)).add(PushConstants.AMOUNT, this.zzb).add("currency", this.zzc).add("transactionTimeMillis", Long.valueOf(this.zzd)).add("type", Integer.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zza);
        SafeParcelWriter.writeBigDecimal(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
