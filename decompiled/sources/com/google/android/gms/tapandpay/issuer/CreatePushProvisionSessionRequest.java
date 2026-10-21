package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "CreatePushProvisionSessionRequestCreator")
public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getIntegratorId", id = 1)
    private final String zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private String zza;

        @NonNull
        public CreatePushProvisionSessionRequest build() {
            return new CreatePushProvisionSessionRequest(this.zza);
        }

        @NonNull
        public Builder setIntegratorId(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public CreatePushProvisionSessionRequest(@SafeParcelable.Param(id = 1) String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
