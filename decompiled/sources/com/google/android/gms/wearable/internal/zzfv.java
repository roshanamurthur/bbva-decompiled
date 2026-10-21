package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzfv implements Parcelable.Creator<zzfu> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfu createFromParcel(Parcel parcel) {
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
        return new zzfu(i10, zzddVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfu[] newArray(int i10) {
        return new zzfu[i10];
    }
}
