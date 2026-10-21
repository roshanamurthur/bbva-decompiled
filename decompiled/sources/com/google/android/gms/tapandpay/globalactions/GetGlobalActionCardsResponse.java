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
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetGlobalActionCardsResponseCreator")
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getCards", id = 1)
    private GlobalActionCard[] zza;

    @SafeParcelable.Field(getter = "getSelectedIndex", id = 2)
    private int zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final GetGlobalActionCardsResponse zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsResponse(null);
        }

        @NonNull
        public GetGlobalActionCardsResponse build() {
            return this.zza;
        }

        @NonNull
        public Builder setCards(@NonNull GlobalActionCard[] globalActionCardArr) {
            this.zza.zza = globalActionCardArr;
            return this;
        }

        @NonNull
        public Builder setSelectedIndex(int i10) {
            this.zza.zzb = i10;
            return this;
        }

        public Builder(@NonNull GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new GetGlobalActionCardsResponse(null);
            this.zza = getGlobalActionCardsResponse2;
            getGlobalActionCardsResponse2.zza = getGlobalActionCardsResponse.zza;
            getGlobalActionCardsResponse2.zzb = getGlobalActionCardsResponse.zzb;
        }
    }

    private GetGlobalActionCardsResponse() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsResponse.zzb))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public GlobalActionCard[] getCards() {
        return this.zza;
    }

    public int getSelectedIndex() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, getCards(), i10, false);
        SafeParcelWriter.writeInt(parcel, 2, getSelectedIndex());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ GetGlobalActionCardsResponse(zzc zzcVar) {
    }

    @SafeParcelable.Constructor
    public GetGlobalActionCardsResponse(@SafeParcelable.Param(id = 1) GlobalActionCard[] globalActionCardArr, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = globalActionCardArr;
        this.zzb = i10;
    }
}
