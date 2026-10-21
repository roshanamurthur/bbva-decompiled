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
@SafeParcelable.Class(creator = "GetLastAttestationResultResponseCreator")
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();

    @SafeParcelable.Field(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    final long zzb;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) long j10) {
        this.zza = i10;
        this.zzb = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.zza == zzxVar.zza && this.zzb == zzxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("result", Integer.valueOf(this.zza)).add("timeMillis", Long.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
