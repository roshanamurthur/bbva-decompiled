package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import androidx.collection.f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AmsEntityUpdateParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getValue", id = 4)
    private final String value;

    @SafeParcelable.Field(getter = "getEntityId", id = 2)
    private byte zzbd;

    @SafeParcelable.Field(getter = "getAttributeId", id = 3)
    private final byte zzbe;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 2) byte b10, @SafeParcelable.Param(id = 3) byte b11, @SafeParcelable.Param(id = 4) String str) {
        this.zzbd = b10;
        this.zzbe = b11;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.zzbd == zziVar.zzbd && this.zzbe == zziVar.zzbe && this.value.equals(zziVar.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + ((((this.zzbd + 31) * 31) + this.zzbe) * 31);
    }

    public final String toString() {
        byte b10 = this.zzbd;
        byte b11 = this.zzbe;
        String str = this.value;
        StringBuilder sb2 = new StringBuilder(n1.b(str, 73));
        sb2.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb2.append((int) b10);
        sb2.append(", mAttributeId=");
        sb2.append((int) b11);
        return f.c(sb2, ", mValue='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, this.zzbd);
        SafeParcelWriter.writeByte(parcel, 3, this.zzbe);
        SafeParcelWriter.writeString(parcel, 4, this.value, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
