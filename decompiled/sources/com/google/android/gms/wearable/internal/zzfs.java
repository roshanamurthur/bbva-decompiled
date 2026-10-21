package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "PackageStorageInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzfs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfs> CREATOR = new zzft();

    @SafeParcelable.Field(id = 3)
    private final String label;

    @SafeParcelable.Field(id = 2)
    private final String packageName;

    @SafeParcelable.Field(id = 4)
    private final long zzep;

    @SafeParcelable.Constructor
    public zzfs(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) long j10) {
        this.packageName = str;
        this.label = str2;
        this.zzep = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.label, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzep);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
