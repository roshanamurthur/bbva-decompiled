package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
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
@SafeParcelable.Class(creator = "QuickAccessWalletCardCreator")
public final class QuickAccessWalletCard extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getCardId", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getCardImage", id = 2)
    private Bitmap zzb;

    @SafeParcelable.Field(getter = "getContentDescription", id = 3)
    private String zzc;

    @SafeParcelable.Field(getter = "getIntents", id = 4)
    private WalletCardIntent[] zzd;

    @SafeParcelable.Field(getter = "getIconMessages", id = 5)
    private CardIconMessage[] zze;

    @SafeParcelable.Field(getter = "getAvailableTimestamp", id = 6)
    private long zzf;

    @SafeParcelable.Field(getter = "getExpirationTimestamp", id = 7)
    private long zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getAvailableBalance", id = 8)
    private String zzh;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final QuickAccessWalletCard zza;

        public Builder() {
            this.zza = new QuickAccessWalletCard(null);
        }

        @NonNull
        public QuickAccessWalletCard build() {
            return this.zza;
        }

        @NonNull
        public Builder setAvailableBalance(@Nullable String str) {
            this.zza.zzh = str;
            return this;
        }

        @NonNull
        public Builder setAvailableTimestamp(long j10) {
            this.zza.zzf = j10;
            return this;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.zza.zza = str;
            return this;
        }

        @NonNull
        public Builder setCardImage(@NonNull Bitmap bitmap) {
            this.zza.zzb = bitmap;
            return this;
        }

        @NonNull
        public Builder setContentDescription(@NonNull String str) {
            this.zza.zzc = str;
            return this;
        }

        @NonNull
        public Builder setExpirationTimestamp(long j10) {
            this.zza.zzg = j10;
            return this;
        }

        @NonNull
        public Builder setIconMessages(@NonNull CardIconMessage[] cardIconMessageArr) {
            this.zza.zze = cardIconMessageArr;
            return this;
        }

        @NonNull
        public Builder setIntents(@NonNull WalletCardIntent[] walletCardIntentArr) {
            this.zza.zzd = walletCardIntentArr;
            return this;
        }

        public Builder(@NonNull QuickAccessWalletCard quickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard2 = new QuickAccessWalletCard(null);
            this.zza = quickAccessWalletCard2;
            quickAccessWalletCard2.zza = quickAccessWalletCard.zza;
            quickAccessWalletCard2.zzb = quickAccessWalletCard.zzb;
            quickAccessWalletCard2.zzc = quickAccessWalletCard.zzc;
            quickAccessWalletCard2.zzd = quickAccessWalletCard.zzd;
            quickAccessWalletCard2.zze = quickAccessWalletCard.zze;
            quickAccessWalletCard2.zzf = quickAccessWalletCard.zzf;
            quickAccessWalletCard2.zzg = quickAccessWalletCard.zzg;
            quickAccessWalletCard2.zzh = quickAccessWalletCard.zzh;
        }
    }

    private QuickAccessWalletCard() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj;
            if (Objects.equal(this.zza, quickAccessWalletCard.zza) && Objects.equal(this.zzb, quickAccessWalletCard.zzb) && Objects.equal(this.zzc, quickAccessWalletCard.zzc) && Arrays.equals(this.zzd, quickAccessWalletCard.zzd) && Arrays.equals(this.zze, quickAccessWalletCard.zze) && Objects.equal(Long.valueOf(this.zzf), Long.valueOf(quickAccessWalletCard.zzf)) && Objects.equal(Long.valueOf(this.zzg), Long.valueOf(quickAccessWalletCard.zzg)) && Objects.equal(this.zzh, quickAccessWalletCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String getAvailableBalance() {
        return this.zzh;
    }

    public long getAvailableTimestamp() {
        return this.zzf;
    }

    @NonNull
    public String getCardId() {
        return this.zza;
    }

    @NonNull
    public Bitmap getCardImage() {
        return this.zzb;
    }

    @NonNull
    public String getContentDescription() {
        return this.zzc;
    }

    public long getExpirationTimestamp() {
        return this.zzg;
    }

    @NonNull
    public CardIconMessage[] getIconMessages() {
        return this.zze;
    }

    @NonNull
    public WalletCardIntent[] getIntents() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)), Long.valueOf(this.zzf), Long.valueOf(this.zzg), this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getCardImage(), i10, false);
        SafeParcelWriter.writeString(parcel, 3, getContentDescription(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, getIntents(), i10, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, getIconMessages(), i10, false);
        SafeParcelWriter.writeLong(parcel, 6, getAvailableTimestamp());
        SafeParcelWriter.writeLong(parcel, 7, getExpirationTimestamp());
        SafeParcelWriter.writeString(parcel, 8, getAvailableBalance(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ QuickAccessWalletCard(zze zzeVar) {
    }

    @SafeParcelable.Constructor
    public QuickAccessWalletCard(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bitmap bitmap, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) WalletCardIntent[] walletCardIntentArr, @SafeParcelable.Param(id = 5) CardIconMessage[] cardIconMessageArr, @SafeParcelable.Param(id = 6) long j10, @SafeParcelable.Param(id = 7) long j11, @Nullable @SafeParcelable.Param(id = 8) String str3) {
        this.zza = str;
        this.zzb = bitmap;
        this.zzc = str2;
        this.zzd = walletCardIntentArr;
        this.zze = cardIconMessageArr;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = str3;
    }
}
