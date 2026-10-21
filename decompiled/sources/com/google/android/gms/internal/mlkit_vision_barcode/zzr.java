package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String strCreateString = null;
        String strCreateString2 = null;
        Point[] pointArr = null;
        zzj zzjVar = null;
        zzm zzmVar = null;
        zzn zznVar = null;
        zzp zzpVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzg zzgVar = null;
        zzh zzhVar = null;
        zzi zziVar = null;
        byte[] bArrCreateByteArray = null;
        double d2 = 0.0d;
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
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, header, Point.CREATOR);
                    break;
                case 7:
                    zzjVar = (zzj) SafeParcelReader.createParcelable(parcel, header, zzj.CREATOR);
                    break;
                case 8:
                    zzmVar = (zzm) SafeParcelReader.createParcelable(parcel, header, zzm.CREATOR);
                    break;
                case 9:
                    zznVar = (zzn) SafeParcelReader.createParcelable(parcel, header, zzn.CREATOR);
                    break;
                case 10:
                    zzpVar = (zzp) SafeParcelReader.createParcelable(parcel, header, zzp.CREATOR);
                    break;
                case 11:
                    zzoVar = (zzo) SafeParcelReader.createParcelable(parcel, header, zzo.CREATOR);
                    break;
                case 12:
                    zzkVar = (zzk) SafeParcelReader.createParcelable(parcel, header, zzk.CREATOR);
                    break;
                case 13:
                    zzgVar = (zzg) SafeParcelReader.createParcelable(parcel, header, zzg.CREATOR);
                    break;
                case 14:
                    zzhVar = (zzh) SafeParcelReader.createParcelable(parcel, header, zzh.CREATOR);
                    break;
                case 15:
                    zziVar = (zzi) SafeParcelReader.createParcelable(parcel, header, zzi.CREATOR);
                    break;
                case 16:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 17:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    d2 = SafeParcelReader.readDouble(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzq(i10, strCreateString, strCreateString2, i11, pointArr, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar, bArrCreateByteArray, z10, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
