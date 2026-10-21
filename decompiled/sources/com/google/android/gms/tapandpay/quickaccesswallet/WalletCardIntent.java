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
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "WalletCardIntentCreator")
public final class WalletCardIntent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletCardIntent> CREATOR = new zzl();

    @SafeParcelable.Field(getter = "getClassName", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getAction", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getExtras", id = 3)
    private WalletCardIntentExtra[] zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final WalletCardIntent zza;

        public Builder() {
            this.zza = new WalletCardIntent(null);
        }

        @NonNull
        public WalletCardIntent build() {
            return this.zza;
        }

        @NonNull
        public Builder setAction(@NonNull String str) {
            this.zza.zzb = str;
            return this;
        }

        @NonNull
        public Builder setClassName(@NonNull String str) {
            this.zza.zza = str;
            return this;
        }

        @NonNull
        public Builder setExtras(@NonNull WalletCardIntentExtra[] walletCardIntentExtraArr) {
            this.zza.zzc = walletCardIntentExtraArr;
            return this;
        }

        public Builder(@NonNull WalletCardIntent walletCardIntent) {
            WalletCardIntent walletCardIntent2 = new WalletCardIntent(null);
            this.zza = walletCardIntent2;
            walletCardIntent2.zza = walletCardIntent.zza;
            walletCardIntent2.zzb = walletCardIntent.zzb;
            walletCardIntent2.zzc = walletCardIntent.zzc;
        }
    }

    private WalletCardIntent() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj;
            if (Objects.equal(this.zza, walletCardIntent.zza) && Objects.equal(this.zzb, walletCardIntent.zzb) && Arrays.equals(this.zzc, walletCardIntent.zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAction() {
        return this.zzb;
    }

    @NonNull
    public String getClassName() {
        return this.zza;
    }

    @NonNull
    public WalletCardIntentExtra[] getExtras() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getClassName(), false);
        SafeParcelWriter.writeString(parcel, 2, getAction(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getExtras(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ WalletCardIntent(zzk zzkVar) {
    }

    @SafeParcelable.Constructor
    public WalletCardIntent(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = walletCardIntentExtraArr;
    }
}
