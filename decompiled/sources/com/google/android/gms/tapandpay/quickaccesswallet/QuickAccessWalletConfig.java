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
@SafeParcelable.Class(creator = "QuickAccessWalletConfigCreator")
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getCardWidthPx", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardHeightPx", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getMaxCards", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getCurrentWalletCardIds", id = 5)
    private String[] zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final QuickAccessWalletConfig zza;

        public Builder() {
            this.zza = new QuickAccessWalletConfig(null);
        }

        @NonNull
        public QuickAccessWalletConfig build() {
            return this.zza;
        }

        @NonNull
        public Builder setCardHeightPx(int i10) {
            this.zza.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setCardWidthPx(int i10) {
            this.zza.zza = i10;
            return this;
        }

        @NonNull
        public Builder setCurrentWalletCardIds(@NonNull String[] strArr) {
            this.zza.zzd = strArr;
            return this;
        }

        @NonNull
        public Builder setMaxCards(int i10) {
            this.zza.zzc = i10;
            return this;
        }

        public Builder(@NonNull QuickAccessWalletConfig quickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig2 = new QuickAccessWalletConfig(null);
            this.zza = quickAccessWalletConfig2;
            quickAccessWalletConfig2.zza = quickAccessWalletConfig.zza;
            quickAccessWalletConfig2.zzb = quickAccessWalletConfig.zzb;
            quickAccessWalletConfig2.zzc = quickAccessWalletConfig.zzc;
            quickAccessWalletConfig2.zzd = quickAccessWalletConfig.zzd;
        }
    }

    private QuickAccessWalletConfig() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(quickAccessWalletConfig.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(quickAccessWalletConfig.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(quickAccessWalletConfig.zzc)) && Arrays.equals(this.zzd, quickAccessWalletConfig.zzd)) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzb;
    }

    public int getCardWidthPx() {
        return this.zza;
    }

    @NonNull
    public String[] getCurrentWalletCardIds() {
        return this.zzd;
    }

    public int getMaxCards() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public QuickAccessWalletConfig(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 5) String[] strArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = strArr;
    }

    public /* synthetic */ QuickAccessWalletConfig(zzg zzgVar) {
    }
}
