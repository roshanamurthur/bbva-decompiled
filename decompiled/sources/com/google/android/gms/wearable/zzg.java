package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes9.dex */
public final class zzg implements Parcelable.Creator<ConnectionConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionConfiguration createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ConnectionConfiguration(strCreateString, strCreateString2, i10, i11, z10, z11, strCreateString3, z12, strCreateString4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionConfiguration[] newArray(int i10) {
        return new ConnectionConfiguration[i10];
    }
}
