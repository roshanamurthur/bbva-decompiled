package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        float f6 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = Float.MAX_VALUE;
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float f19 = -1.0f;
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
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    zznVarArr = (zzn[]) SafeParcelReader.createTypedArray(parcel, header, zzn.CREATOR);
                    break;
                case 10:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) SafeParcelReader.createTypedArray(parcel, header, zzd.CREATOR);
                    break;
                case 14:
                    f18 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f19 = SafeParcelReader.readFloat(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzf(i10, i11, f6, f10, f11, f12, f16, f17, f18, zznVarArr, f13, f14, f15, zzdVarArr, f19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzf[i10];
    }
}
