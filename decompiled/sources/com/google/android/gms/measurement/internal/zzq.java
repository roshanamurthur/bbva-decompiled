package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = "";
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString9 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        long j15 = -2147483648L;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 14:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 18:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 24:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzp(strCreateString2, strCreateString3, strCreateString4, strCreateString5, j10, j11, strCreateString6, z10, z12, j15, strCreateString7, j12, j13, i10, z11, z13, strCreateString8, booleanObject, j14, arrayListCreateStringList, strCreateString9, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
