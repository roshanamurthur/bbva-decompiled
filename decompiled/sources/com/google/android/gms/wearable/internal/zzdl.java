package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzdl implements Parcelable.Creator<zzdk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdk createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        zzah zzahVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdk(i10, zzahVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdk[] newArray(int i10) {
        return new zzdk[i10];
    }
}
