package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    b10 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b11 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    b12 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 12:
                    b13 = SafeParcelReader.readByte(parcel, header);
                    break;
                case 13:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzl(i10, strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, strCreateString6, b10, b11, b12, b13, strCreateString7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
