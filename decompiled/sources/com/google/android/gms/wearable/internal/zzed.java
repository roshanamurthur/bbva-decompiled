package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzed implements Parcelable.Creator<zzec> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzec createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        zzdd zzddVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzddVar = (zzdd) SafeParcelReader.createParcelable(parcel, header, zzdd.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzec(i10, zzddVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzec[] newArray(int i10) {
        return new zzec[i10];
    }
}
