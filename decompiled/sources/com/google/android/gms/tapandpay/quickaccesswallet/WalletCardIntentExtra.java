package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "WalletCardIntentExtraCreator")
public final class WalletCardIntentExtra extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new zzn();

    @SafeParcelable.Field(getter = "getKey", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getValueType", id = 2)
    private int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getValueString", id = 3)
    private String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getValueBytes", id = 4)
    private byte[] zzd;

    @SafeParcelable.Field(getter = "getValueBoolean", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getValueInt", id = 6)
    private int zzf;

    @SafeParcelable.Field(getter = "getValueLong", id = 7)
    private long zzg;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final WalletCardIntentExtra zza;

        public Builder() {
            this.zza = new WalletCardIntentExtra(null);
        }

        @NonNull
        public WalletCardIntentExtra build() {
            return this.zza;
        }

        @NonNull
        public Builder setKey(@NonNull String str) {
            this.zza.zza = str;
            return this;
        }

        @NonNull
        public Builder setValueBoolean(boolean z10) {
            this.zza.zze = z10;
            return this;
        }

        @NonNull
        public Builder setValueBytes(@Nullable byte[] bArr) {
            this.zza.zzd = bArr;
            return this;
        }

        @NonNull
        public Builder setValueInt(int i10) {
            this.zza.zzf = i10;
            return this;
        }

        @NonNull
        public Builder setValueLong(long j10) {
            this.zza.zzg = j10;
            return this;
        }

        @NonNull
        public Builder setValueString(@Nullable String str) {
            this.zza.zzc = str;
            return this;
        }

        @NonNull
        public Builder setValueType(int i10) {
            this.zza.zzb = i10;
            return this;
        }

        public Builder(@NonNull WalletCardIntentExtra walletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra2 = new WalletCardIntentExtra(null);
            this.zza = walletCardIntentExtra2;
            walletCardIntentExtra2.zza = walletCardIntentExtra.zza;
            walletCardIntentExtra2.zzb = walletCardIntentExtra.zzb;
            walletCardIntentExtra2.zzc = walletCardIntentExtra.zzc;
            walletCardIntentExtra2.zzd = walletCardIntentExtra.zzd;
            walletCardIntentExtra2.zze = walletCardIntentExtra.zze;
            walletCardIntentExtra2.zzf = walletCardIntentExtra.zzf;
            walletCardIntentExtra2.zzg = walletCardIntentExtra.zzg;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ValueType {
        public static final int BOOLEAN = 3;
        public static final int BYTES = 2;
        public static final int INT = 4;
        public static final int LONG = 5;
        public static final int STRING = 1;
        public static final int VALUE_TYPE_UNKNOWN = 0;
    }

    private WalletCardIntentExtra() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj;
            if (Objects.equal(this.zza, walletCardIntentExtra.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(walletCardIntentExtra.zzb)) && Objects.equal(this.zzc, walletCardIntentExtra.zzc) && Arrays.equals(this.zzd, walletCardIntentExtra.zzd) && Objects.equal(Boolean.valueOf(this.zze), Boolean.valueOf(walletCardIntentExtra.zze)) && Objects.equal(Integer.valueOf(this.zzf), Integer.valueOf(walletCardIntentExtra.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(walletCardIntentExtra.zzg))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getKey() {
        return this.zza;
    }

    public boolean getValueBoolean() {
        return this.zze;
    }

    @Nullable
    public byte[] getValueBytes() {
        return this.zzd;
    }

    public int getValueInt() {
        return this.zzf;
    }

    public long getValueLong() {
        return this.zzg;
    }

    @Nullable
    public String getValueString() {
        return this.zzc;
    }

    public int getValueType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Boolean.valueOf(this.zze), Integer.valueOf(this.zzf), Long.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        SafeParcelWriter.writeInt(parcel, 2, getValueType());
        SafeParcelWriter.writeString(parcel, 3, getValueString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getValueBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getValueBoolean());
        SafeParcelWriter.writeInt(parcel, 6, getValueInt());
        SafeParcelWriter.writeLong(parcel, 7, getValueLong());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ WalletCardIntentExtra(zzm zzmVar) {
    }

    @SafeParcelable.Constructor
    public WalletCardIntentExtra(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10, @Nullable @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) long j10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z10;
        this.zzf = i11;
        this.zzg = j10;
    }
}
