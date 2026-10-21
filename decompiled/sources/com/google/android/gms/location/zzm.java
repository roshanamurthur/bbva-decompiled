package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f6 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        byte b10 = 0;
        long j10 = 0;
        float[] fArrCreateFloatArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        f6 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 5:
                        f10 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 6:
                        j10 = SafeParcelReader.readLong(parcel, header);
                        break;
                    case 7:
                        b10 = SafeParcelReader.readByte(parcel, header);
                        break;
                    case 8:
                        f11 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 9:
                        f12 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                fArrCreateFloatArray = SafeParcelReader.createFloatArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DeviceOrientation(fArrCreateFloatArray, f6, f10, j10, b10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DeviceOrientation[i10];
    }
}
