package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzj implements Parcelable.Creator<zzi> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzi createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte b10 = 0;
        String strCreateString = null;
        byte b11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                b10 = SafeParcelReader.readByte(parcel, header);
            } else if (fieldId == 3) {
                b11 = SafeParcelReader.readByte(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzi(b10, b11, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzi[] newArray(int i10) {
        return new zzi[i10];
    }
}
