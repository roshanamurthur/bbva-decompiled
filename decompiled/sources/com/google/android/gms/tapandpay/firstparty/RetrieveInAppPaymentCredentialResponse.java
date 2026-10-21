package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "RetrieveInAppPaymentCredentialResponseCreator")
@SafeParcelable.Reserved({1})
public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> CREATOR = new zzar();

    @Nullable
    @SafeParcelable.Field(id = 2)
    final String zza;

    @Nullable
    @SafeParcelable.Field(id = 3)
    final byte[] zzb;

    @SafeParcelable.Field(id = 4)
    final int zzc;

    @SafeParcelable.Field(id = 5)
    final int zzd;

    @Nullable
    @SafeParcelable.Field(id = 6)
    final String zze;

    @Nullable
    @SafeParcelable.Field(id = 7)
    final String zzf;

    @SafeParcelable.Constructor
    public RetrieveInAppPaymentCredentialResponse(@Nullable @SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) int i11, @Nullable @SafeParcelable.Param(id = 6) String str2, @Nullable @SafeParcelable.Param(id = 7) String str3) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
