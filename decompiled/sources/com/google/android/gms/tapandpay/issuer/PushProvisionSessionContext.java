package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PushProvisionSessionContextCreator")
public final class PushProvisionSessionContext extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PushProvisionSessionContext> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getServerSessionId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getDeviceId", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getWalletId", id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public PushProvisionSessionContext(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @NonNull @SafeParcelable.Param(id = 3) String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @NonNull
    public String getDeviceId() {
        return this.zzb;
    }

    @NonNull
    public String getServerSessionId() {
        return this.zza;
    }

    @NonNull
    public String getWalletId() {
        return this.zzc;
    }

    @NonNull
    public String toString() {
        return String.format("PushProvisionSessionContext{serverSessionId=%s, deviceId=%s, walletId=%s}", this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerSessionId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDeviceId(), false);
        SafeParcelWriter.writeString(parcel, 3, getWalletId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
