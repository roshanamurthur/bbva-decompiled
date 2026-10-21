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
@SafeParcelable.Class(creator = "GetFelicaTosAcceptanceResponseCreator")
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();

    @SafeParcelable.Field(getter = "getIsAccepted", id = 1)
    private boolean zza;

    private zzv() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            return Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(((zzv) obj).zza));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(id = 1) boolean z10) {
        this.zza = z10;
    }
}
