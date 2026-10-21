package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: loaded from: classes9.dex */
public final class zzdx implements Parcelable.Creator<zzdw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdw createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                connectionConfiguration = (ConnectionConfiguration) SafeParcelReader.createParcelable(parcel, header, ConnectionConfiguration.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdw(i10, connectionConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdw[] newArray(int i10) {
        return new zzdw[i10];
    }
}
