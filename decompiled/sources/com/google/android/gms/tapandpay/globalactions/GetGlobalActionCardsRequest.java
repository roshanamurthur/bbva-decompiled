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
@SafeParcelable.Class(creator = "GetGlobalActionCardsRequestCreator")
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getMaxCards", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardWidthPx", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getCardHeightPx", id = 3)
    private int zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final GetGlobalActionCardsRequest zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsRequest(null);
        }

        @NonNull
        public GetGlobalActionCardsRequest build() {
            return this.zza;
        }

        @NonNull
        public Builder setCardHeightPx(int i10) {
            this.zza.zzc = i10;
            return this;
        }

        @NonNull
        public Builder setCardWidthPx(int i10) {
            this.zza.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setMaxCards(int i10) {
            this.zza.zza = i10;
            return this;
        }

        public Builder(@NonNull GetGlobalActionCardsRequest getGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest2 = new GetGlobalActionCardsRequest(null);
            this.zza = getGlobalActionCardsRequest2;
            getGlobalActionCardsRequest2.zza = getGlobalActionCardsRequest.zza;
            getGlobalActionCardsRequest2.zzb = getGlobalActionCardsRequest.zzb;
            getGlobalActionCardsRequest2.zzc = getGlobalActionCardsRequest.zzc;
        }
    }

    private GetGlobalActionCardsRequest() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getGlobalActionCardsRequest.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsRequest.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(getGlobalActionCardsRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzc;
    }

    public int getCardWidthPx() {
        return this.zzb;
    }

    public int getMaxCards() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMaxCards());
        SafeParcelWriter.writeInt(parcel, 2, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 3, getCardHeightPx());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GetGlobalActionCardsRequest(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public /* synthetic */ GetGlobalActionCardsRequest(zza zzaVar) {
    }
}
