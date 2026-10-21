package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzap(i10, i11, i12, i13, i14, i15, z10, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzap[i10];
    }
}
