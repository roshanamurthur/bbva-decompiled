package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f6 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
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
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzst(i10, i11, i12, i13, z10, f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzst[i10];
    }
}
