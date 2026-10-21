package com.google.android.gms.tapandpay.issuer;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "UserAddressCreator")
@SafeParcelable.Reserved({1})
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzi();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    String zzb;

    @SafeParcelable.Field(id = 4)
    String zzc;

    @SafeParcelable.Field(id = 5)
    String zzd;

    @SafeParcelable.Field(id = 6)
    String zze;

    @SafeParcelable.Field(id = 7)
    String zzf;

    @SafeParcelable.Field(id = 8)
    String zzg;

    @SafeParcelable.Field(id = 9)
    String zzh;

    @SafeParcelable.Field(id = 10)
    String zzi;

    @SafeParcelable.Field(id = 11)
    String zzj;

    @SafeParcelable.Field(id = 12)
    String zzk;

    @SafeParcelable.Field(id = 13)
    String zzl;

    @SafeParcelable.Field(id = 14)
    boolean zzm;

    @SafeParcelable.Field(id = 15)
    String zzn;

    @SafeParcelable.Field(id = 16)
    String zzo;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private String zza;
        private String zzb;
        private String zzc;
        private String zzd;
        private String zze;
        private String zzf;
        private String zzg;
        private String zzh;

        @NonNull
        public UserAddress build() {
            return new UserAddress(this.zza, this.zzb, this.zzc, null, null, null, this.zzd, this.zze, this.zzf, this.zzg, null, this.zzh, false, null, null);
        }

        @NonNull
        public Builder setAddress1(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setAddress2(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setAdministrativeArea(@NonNull String str) {
            this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setCountryCode(@NonNull String str) {
            this.zzf = str;
            return this;
        }

        @NonNull
        public Builder setLocality(@NonNull String str) {
            this.zze = str;
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setPhoneNumber(@NonNull String str) {
            this.zzh = str;
            return this;
        }

        @NonNull
        public Builder setPostalCode(@NonNull String str) {
            this.zzg = str;
            return this;
        }
    }

    public UserAddress() {
    }

    @Nullable
    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getAddress1() {
        return this.zzb;
    }

    @NonNull
    public String getAddress2() {
        return this.zzc;
    }

    @NonNull
    public String getAddress3() {
        return this.zzd;
    }

    @NonNull
    public String getAddress4() {
        return this.zze;
    }

    @NonNull
    public String getAddress5() {
        return this.zzf;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.zzg;
    }

    @NonNull
    public String getCompanyName() {
        return this.zzn;
    }

    @NonNull
    public String getCountryCode() {
        return this.zzi;
    }

    @NonNull
    public String getEmailAddress() {
        return this.zzo;
    }

    @NonNull
    public String getLocality() {
        return this.zzh;
    }

    @NonNull
    public String getName() {
        return this.zza;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.zzl;
    }

    @NonNull
    public String getPostalCode() {
        return this.zzj;
    }

    @NonNull
    public String getSortingCode() {
        return this.zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UserAddress(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) String str11, @SafeParcelable.Param(id = 13) String str12, @SafeParcelable.Param(id = 14) boolean z10, @SafeParcelable.Param(id = 15) String str13, @SafeParcelable.Param(id = 16) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z10;
        this.zzn = str13;
        this.zzo = str14;
    }
}
