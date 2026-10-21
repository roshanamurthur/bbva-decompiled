package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzax implements Parcelable.Creator<zzaw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaw createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzay zzayVar = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                zzayVar = (zzay) SafeParcelReader.createParcelable(parcel, header, zzay.CREATOR);
            } else if (fieldId == 3) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                i11 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i12 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaw(zzayVar, i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaw[] newArray(int i10) {
        return new zzaw[i10];
    }
}
