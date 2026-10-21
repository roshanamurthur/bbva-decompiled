package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PushTokenizeRequestCreator")
@SafeParcelable.Reserved({1})
public class PushTokenizeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new zze();

    @SafeParcelable.Field(id = 2)
    final int zza;

    @SafeParcelable.Field(id = 3)
    final int zzb;

    @SafeParcelable.Field(id = 4)
    final byte[] zzc;

    @SafeParcelable.Field(id = 5)
    final String zzd;

    @SafeParcelable.Field(id = 6)
    final String zze;

    @SafeParcelable.Field(id = 7)
    final UserAddress zzf;

    @SafeParcelable.Field(id = 8)
    final boolean zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private int zza;
        private int zzb;
        private byte[] zzc;
        private String zzd;
        private String zze;
        private UserAddress zzf;
        private boolean zzg;

        @NonNull
        public PushTokenizeRequest build() {
            return new PushTokenizeRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        @NonNull
        public Builder setDisplayName(@NonNull String str) {
            this.zze = str;
            return this;
        }

        @NonNull
        public Builder setIsTransit(boolean z10) {
            this.zzg = z10;
            return this;
        }

        @NonNull
        public Builder setLastDigits(@NonNull String str) {
            this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setNetwork(int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setOpaquePaymentCard(@NonNull byte[] bArr) {
            this.zzc = bArr;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setUserAddress(@NonNull UserAddress userAddress) {
            this.zzf = userAddress;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PushTokenizeRequest(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) UserAddress userAddress, @SafeParcelable.Param(id = 8) boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = bArr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = userAddress;
        this.zzg = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
