package com.google.android.gms.wearable;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ConnectionConfigurationCreator")
@SafeParcelable.Reserved({1})
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String name;

    @SafeParcelable.Field(getter = "getType", id = 4)
    private final int type;

    @SafeParcelable.Field(getter = "getAddress", id = 3)
    private final String zzi;

    @SafeParcelable.Field(getter = "getRole", id = 5)
    private final int zzj;

    @SafeParcelable.Field(getter = "isEnabled", id = 6)
    private final boolean zzk;

    @SafeParcelable.Field(getter = "isConnected", id = 7)
    private volatile boolean zzl;

    @SafeParcelable.Field(getter = "getPeerNodeId", id = 8)
    private volatile String zzm;

    @SafeParcelable.Field(getter = "getBtlePriority", id = 9)
    private boolean zzn;

    @SafeParcelable.Field(getter = "getNodeId", id = 10)
    private String zzo;

    @SafeParcelable.Constructor
    public ConnectionConfiguration(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) boolean z10, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) String str3, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) String str4) {
        this.name = str;
        this.zzi = str2;
        this.type = i10;
        this.zzj = i11;
        this.zzk = z10;
        this.zzl = z11;
        this.zzm = str3;
        this.zzn = z12;
        this.zzo = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return Objects.equal(this.name, connectionConfiguration.name) && Objects.equal(this.zzi, connectionConfiguration.zzi) && Objects.equal(Integer.valueOf(this.type), Integer.valueOf(connectionConfiguration.type)) && Objects.equal(Integer.valueOf(this.zzj), Integer.valueOf(connectionConfiguration.zzj)) && Objects.equal(Boolean.valueOf(this.zzk), Boolean.valueOf(connectionConfiguration.zzk)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(connectionConfiguration.zzn));
    }

    public int hashCode() {
        return Objects.hashCode(this.name, this.zzi, Integer.valueOf(this.type), Integer.valueOf(this.zzj), Boolean.valueOf(this.zzk), Boolean.valueOf(this.zzn));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConnectionConfiguration[ ");
        String strValueOf = String.valueOf(this.name);
        sb2.append(strValueOf.length() != 0 ? "mName=".concat(strValueOf) : new String("mName="));
        String strValueOf2 = String.valueOf(this.zzi);
        sb2.append(strValueOf2.length() != 0 ? ", mAddress=".concat(strValueOf2) : new String(", mAddress="));
        int i10 = this.type;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mType=");
        sb3.append(i10);
        sb2.append(sb3.toString());
        int i11 = this.zzj;
        StringBuilder sb4 = new StringBuilder(19);
        sb4.append(", mRole=");
        sb4.append(i11);
        sb2.append(sb4.toString());
        boolean z10 = this.zzk;
        StringBuilder sb5 = new StringBuilder(16);
        sb5.append(", mEnabled=");
        sb5.append(z10);
        sb2.append(sb5.toString());
        boolean z11 = this.zzl;
        StringBuilder sb6 = new StringBuilder(20);
        sb6.append(", mIsConnected=");
        sb6.append(z11);
        sb2.append(sb6.toString());
        String strValueOf3 = String.valueOf(this.zzm);
        sb2.append(strValueOf3.length() != 0 ? ", mPeerNodeId=".concat(strValueOf3) : new String(", mPeerNodeId="));
        boolean z12 = this.zzn;
        StringBuilder sb7 = new StringBuilder(21);
        sb7.append(", mBtlePriority=");
        sb7.append(z12);
        sb2.append(sb7.toString());
        String strValueOf4 = String.valueOf(this.zzo);
        return d.f(sb2, strValueOf4.length() != 0 ? ", mNodeId=".concat(strValueOf4) : new String(", mNodeId="), Constant.BRACKET_CLOSE);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzi, false);
        SafeParcelWriter.writeInt(parcel, 4, this.type);
        SafeParcelWriter.writeInt(parcel, 5, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzl);
        SafeParcelWriter.writeString(parcel, 8, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeString(parcel, 10, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
