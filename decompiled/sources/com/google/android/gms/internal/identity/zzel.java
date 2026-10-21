package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = -1;
        int i11 = 0;
        short s4 = 0;
        int i12 = 0;
        long j10 = 0;
        float f6 = 0.0f;
        double d2 = 0.0d;
        double d3 = 0.0d;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s4 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d2 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d3 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzek(strCreateString, i11, s4, d2, d3, f6, j10, i12, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzek[i10];
    }
}
