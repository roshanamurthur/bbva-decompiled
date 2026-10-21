package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
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
@SafeParcelable.Class(creator = "SetQuickAccessWalletCardsRequestCreator")
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account zzb;

    @SafeParcelable.Field(getter = "getCards", id = 3)
    private QuickAccessWalletCard[] zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final SetQuickAccessWalletCardsRequest zza;

        public Builder() {
            this.zza = new SetQuickAccessWalletCardsRequest(null);
        }

        @NonNull
        public SetQuickAccessWalletCardsRequest build() {
            return this.zza;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.zza.zzb = account;
            return this;
        }

        @NonNull
        public Builder setCards(@NonNull QuickAccessWalletCard[] quickAccessWalletCardArr) {
            this.zza.zzc = quickAccessWalletCardArr;
            return this;
        }

        @NonNull
        public Builder setSource(int i10) {
            this.zza.zza = i10;
            return this;
        }

        public Builder(@NonNull SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest2 = new SetQuickAccessWalletCardsRequest(null);
            this.zza = setQuickAccessWalletCardsRequest2;
            setQuickAccessWalletCardsRequest2.zza = setQuickAccessWalletCardsRequest.zza;
            setQuickAccessWalletCardsRequest2.zzb = setQuickAccessWalletCardsRequest.zzb;
            setQuickAccessWalletCardsRequest2.zzc = setQuickAccessWalletCardsRequest.zzc;
        }
    }

    private SetQuickAccessWalletCardsRequest() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(setQuickAccessWalletCardsRequest.zza)) && Objects.equal(this.zzb, setQuickAccessWalletCardsRequest.zzb) && Arrays.equals(this.zzc, setQuickAccessWalletCardsRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Account getAccount() {
        return this.zzb;
    }

    @NonNull
    public QuickAccessWalletCard[] getCards() {
        return this.zzc;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i10, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getCards(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SetQuickAccessWalletCardsRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zza = i10;
        this.zzb = account;
        this.zzc = quickAccessWalletCardArr;
    }

    public /* synthetic */ SetQuickAccessWalletCardsRequest(zzi zziVar) {
    }
}
