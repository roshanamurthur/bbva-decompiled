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

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetQuickAccessWalletConfigRequestCreator")
public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetQuickAccessWalletConfigRequest> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final GetQuickAccessWalletConfigRequest zza;

        public Builder() {
            this.zza = new GetQuickAccessWalletConfigRequest(null);
        }

        @NonNull
        public GetQuickAccessWalletConfigRequest build() {
            return this.zza;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.zza.zzb = account;
            return this;
        }

        @NonNull
        public Builder setSource(int i10) {
            this.zza.zza = i10;
            return this;
        }

        public Builder(@NonNull GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest2 = new GetQuickAccessWalletConfigRequest(null);
            this.zza = getQuickAccessWalletConfigRequest2;
            getQuickAccessWalletConfigRequest2.zza = getQuickAccessWalletConfigRequest.zza;
            getQuickAccessWalletConfigRequest2.zzb = getQuickAccessWalletConfigRequest.zzb;
        }
    }

    private GetQuickAccessWalletConfigRequest() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getQuickAccessWalletConfigRequest.zza)) && Objects.equal(this.zzb, getQuickAccessWalletConfigRequest.zzb)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Account getAccount() {
        return this.zzb;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GetQuickAccessWalletConfigRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Account account) {
        this.zza = i10;
        this.zzb = account;
    }

    public /* synthetic */ GetQuickAccessWalletConfigRequest(zzc zzcVar) {
    }
}
