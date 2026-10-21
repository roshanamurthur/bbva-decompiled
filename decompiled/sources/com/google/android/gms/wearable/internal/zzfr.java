package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzfr implements Parcelable.Creator<zzfq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfq createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        zzay zzayVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzayVar = (zzay) SafeParcelReader.createParcelable(parcel, header, zzay.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzfq(i10, zzayVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfq[] newArray(int i10) {
        return new zzfq[i10];
    }
}
