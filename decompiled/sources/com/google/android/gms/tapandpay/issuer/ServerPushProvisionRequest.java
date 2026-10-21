package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ServerPushProvisionRequestCreator")
public final class ServerPushProvisionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ServerPushProvisionRequest> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getSessionContext", id = 1)
    private final PushProvisionSessionContext zza;

    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getUserAddress", id = 3)
    private final UserAddress zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions.defaultOptions()", getter = "getExtraOptions", id = 4)
    private final ExtraOptions zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    public static class Builder {
        private PushProvisionSessionContext zza;
        private String zzb;
        private UserAddress zzc;
        private ExtraOptions zzd;

        @NonNull
        public ServerPushProvisionRequest build() {
            return new ServerPushProvisionRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @NonNull
        public Builder setDisplayName(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setExtraOptions(@NonNull ExtraOptions extraOptions) {
            this.zzd = extraOptions;
            return this;
        }

        @NonNull
        public Builder setSessionContext(@NonNull PushProvisionSessionContext pushProvisionSessionContext) {
            this.zza = pushProvisionSessionContext;
            return this;
        }

        @NonNull
        public Builder setUserAddress(@NonNull UserAddress userAddress) {
            this.zzc = userAddress;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @SafeParcelable.Class(creator = "ExtraOptionsCreator")
    public static class ExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {

        @NonNull
        public static final Parcelable.Creator<ExtraOptions> CREATOR = new zzb();

        @SafeParcelable.Field(defaultValue = "false", getter = "getServerSideAddressDeliveryEnabled", id = 1)
        private boolean zza;

        @SafeParcelable.Field(defaultValue = "false", getter = "getVirtualCardsSetting", id = 2)
        private boolean zzb;

        @SafeParcelable.Constructor
        public ExtraOptions(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) boolean z11) {
            this.zza = z10;
            this.zzb = z11;
        }

        @NonNull
        public static ExtraOptions defaultOptions() {
            return new ExtraOptions(false, false);
        }

        public boolean getServerSideAddressDeliveryEnabled() {
            return this.zza;
        }

        public boolean getVirtualCardsSetting() {
            return this.zzb;
        }

        @NonNull
        public ExtraOptions setServerSideAddressDeliveryEnabled(boolean z10) {
            this.zza = z10;
            return this;
        }

        @NonNull
        public ExtraOptions setVirtualCardsSetting(boolean z10) {
            this.zzb = z10;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, getServerSideAddressDeliveryEnabled());
            SafeParcelWriter.writeBoolean(parcel, 2, getVirtualCardsSetting());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public ServerPushProvisionRequest(@SafeParcelable.Param(id = 1) PushProvisionSessionContext pushProvisionSessionContext, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) UserAddress userAddress, @SafeParcelable.Param(id = 4) ExtraOptions extraOptions) {
        this.zza = pushProvisionSessionContext;
        this.zzb = str;
        this.zzc = userAddress;
        this.zzd = extraOptions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
