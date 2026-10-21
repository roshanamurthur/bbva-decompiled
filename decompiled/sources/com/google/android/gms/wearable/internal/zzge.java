package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "StorageInfoResponseCreator")
@SafeParcelable.Reserved({1})
public final class zzge extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzge> CREATOR = new zzgf();

    @SafeParcelable.Field(id = 2)
    private final int statusCode;

    @SafeParcelable.Field(id = 3)
    private final long zzep;

    @SafeParcelable.Field(id = 4)
    private final List<zzfs> zzer;

    @SafeParcelable.Constructor
    public zzge(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 4) List<zzfs> list) {
        this.statusCode = i10;
        this.zzep = j10;
        this.zzer = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.statusCode);
        SafeParcelWriter.writeLong(parcel, 3, this.zzep);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzer, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
