package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Rect rect = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateTypedList2 = null;
        float f6 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.createParcelable(parcel, header, Rect.CREATOR);
                    break;
                case 3:
                    f6 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 10:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zztc.CREATOR);
                    break;
                case 11:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, zzsr.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzsv(i10, rect, f6, f10, f11, f12, f13, f14, f15, arrayListCreateTypedList, arrayListCreateTypedList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzsv[i10];
    }
}
