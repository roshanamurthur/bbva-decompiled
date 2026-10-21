package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ViewTokenRequestCreator")
public class ViewTokenRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new zzj();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final int zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private String zza;
        private int zzb;

        @NonNull
        public ViewTokenRequest build() {
            return new ViewTokenRequest(this.zza, this.zzb);
        }

        @NonNull
        public Builder setIssuerTokenId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i10) {
            this.zzb = i10;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ViewTokenRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
