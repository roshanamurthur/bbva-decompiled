package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "TokenInfoCreator")
public final class TokenInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zzg();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final String zzb;

    @SafeParcelable.Field(id = 3)
    final String zzc;

    @SafeParcelable.Field(id = 4)
    final String zzd;

    @SafeParcelable.Field(id = 5)
    final int zze;

    @SafeParcelable.Field(id = 6)
    final int zzf;

    @SafeParcelable.Field(id = 7)
    final int zzg;

    @SafeParcelable.Field(id = 8)
    final boolean zzh;

    @SafeParcelable.Field(id = 9)
    final String zzi;

    @SafeParcelable.Constructor
    public TokenInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) int i10, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) int i12, @SafeParcelable.Param(id = 8) boolean z10, @SafeParcelable.Param(id = 9) String str5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = z10;
        this.zzi = str5;
    }

    @NonNull
    public String getDpanLastFour() {
        return this.zzd;
    }

    @NonNull
    public String getFpanLastFour() {
        return this.zzc;
    }

    public boolean getIsDefaultToken() {
        return this.zzh;
    }

    @NonNull
    public String getIssuerName() {
        return this.zzb;
    }

    @NonNull
    public String getIssuerTokenId() {
        return this.zza;
    }

    public int getNetwork() {
        return this.zzf;
    }

    @NonNull
    public String getPortfolioName() {
        return this.zzi;
    }

    public int getTokenServiceProvider() {
        return this.zze;
    }

    public int getTokenState() {
        return this.zzg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
