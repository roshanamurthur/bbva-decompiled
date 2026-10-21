package com.google.android.gms.tapandpay.globalactions;

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
@SafeParcelable.Class(creator = "SelectGlobalActionCardRequestCreator")
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getCardType", id = 2)
    private int zza;

    @SafeParcelable.Field(getter = "getCardId", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getSelectionTimeoutMs", id = 4)
    private int zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final SelectGlobalActionCardRequest zza;

        public Builder() {
            this.zza = new SelectGlobalActionCardRequest(null);
        }

        @NonNull
        public SelectGlobalActionCardRequest build() {
            return this.zza;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.zza.zzb = str;
            return this;
        }

        @NonNull
        public Builder setCardType(int i10) {
            this.zza.zza = i10;
            return this;
        }

        @NonNull
        public Builder setSelectionTimeoutMs(int i10) {
            this.zza.zzc = i10;
            return this;
        }

        public Builder(@NonNull SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = new SelectGlobalActionCardRequest(null);
            this.zza = selectGlobalActionCardRequest2;
            selectGlobalActionCardRequest2.zza = selectGlobalActionCardRequest.zza;
            selectGlobalActionCardRequest2.zzb = selectGlobalActionCardRequest.zzb;
            selectGlobalActionCardRequest2.zzc = selectGlobalActionCardRequest.zzc;
        }
    }

    private SelectGlobalActionCardRequest() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(selectGlobalActionCardRequest.zza)) && Objects.equal(this.zzb, selectGlobalActionCardRequest.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(selectGlobalActionCardRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getCardId() {
        return this.zzb;
    }

    public int getCardType() {
        return this.zza;
    }

    public int getSelectionTimeoutMs() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getCardType());
        SafeParcelWriter.writeString(parcel, 3, getCardId(), false);
        SafeParcelWriter.writeInt(parcel, 4, getSelectionTimeoutMs());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SelectGlobalActionCardRequest(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i11) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
    }

    public /* synthetic */ SelectGlobalActionCardRequest(zzg zzgVar) {
    }
}
