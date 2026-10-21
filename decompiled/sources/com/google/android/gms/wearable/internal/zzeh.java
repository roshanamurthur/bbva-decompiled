package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzeh implements Parcelable.Creator<zzeg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzeg createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        zzfo zzfoVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzfoVar = (zzfo) SafeParcelReader.createParcelable(parcel, header, zzfo.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzeg(i10, zzfoVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzeg[] newArray(int i10) {
        return new zzeg[i10];
    }
}
