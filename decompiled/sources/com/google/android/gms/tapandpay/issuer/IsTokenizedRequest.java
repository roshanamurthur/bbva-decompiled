package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "IsTokenizedRequestCreator")
public class IsTokenizedRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new zzc();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final int zzb;

    @SafeParcelable.Field(id = 3)
    final int zzc;

    @SafeParcelable.Field(id = 4)
    final String zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private String zza;
        private int zzb;
        private int zzc;
        private String zzd;

        @NonNull
        public IsTokenizedRequest build() {
            return new IsTokenizedRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        public Builder setIdentifier(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setNetwork(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i10) {
            this.zzc = i10;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public IsTokenizedRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
