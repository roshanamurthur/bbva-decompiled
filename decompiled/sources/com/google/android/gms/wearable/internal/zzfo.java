package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "NodeParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfo extends AbstractSafeParcelable implements Node {
    public static final Parcelable.Creator<zzfo> CREATOR = new zzfp();

    @SafeParcelable.Field(getter = "getDisplayName", id = 3)
    private final String zzbk;

    @SafeParcelable.Field(getter = "getId", id = 2)
    private final String zzdm;

    @SafeParcelable.Field(getter = "getHopCount", id = 4)
    private final int zzen;

    @SafeParcelable.Field(getter = "isNearby", id = 5)
    private final boolean zzeo;

    @SafeParcelable.Constructor
    public zzfo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) boolean z10) {
        this.zzdm = str;
        this.zzbk = str2;
        this.zzen = i10;
        this.zzeo = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfo) {
            return ((zzfo) obj).zzdm.equals(this.zzdm);
        }
        return false;
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getDisplayName() {
        return this.zzbk;
    }

    @Override // com.google.android.gms.wearable.Node
    public final String getId() {
        return this.zzdm;
    }

    public final int hashCode() {
        return this.zzdm.hashCode();
    }

    @Override // com.google.android.gms.wearable.Node
    public final boolean isNearby() {
        return this.zzeo;
    }

    public final String toString() {
        String str = this.zzbk;
        String str2 = this.zzdm;
        int i10 = this.zzen;
        boolean z10 = this.zzeo;
        StringBuilder sb2 = new StringBuilder(n1.b(str2, n1.b(str, 45)));
        sb2.append("Node{");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(str2);
        sb2.append(", hops=");
        sb2.append(i10);
        sb2.append(", isNearby=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getDisplayName(), false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzen);
        SafeParcelWriter.writeBoolean(parcel, 5, isNearby());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
