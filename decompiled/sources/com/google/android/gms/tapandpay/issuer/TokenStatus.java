package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "TokenStatusCreator")
@SafeParcelable.Reserved({1})
public final class TokenStatus extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzh();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    int zzb;

    @SafeParcelable.Field(id = 4)
    boolean zzc;

    @SafeParcelable.Constructor
    public TokenStatus(@NonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) boolean z10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = z10;
    }

    public int getTokenState() {
        return this.zzb;
    }

    public boolean isSelected() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
