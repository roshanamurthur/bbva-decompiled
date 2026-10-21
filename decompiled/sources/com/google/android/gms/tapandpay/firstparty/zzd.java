package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        TokenStatus tokenStatus = null;
        String strCreateString4 = null;
        Uri uri = null;
        zzaj zzajVar = null;
        String strCreateString5 = null;
        zzaz zzazVar = null;
        String strCreateString6 = null;
        byte[] bArrCreateByteArray2 = null;
        zzah zzahVar = null;
        zzaf zzafVar = null;
        String strCreateString7 = null;
        zzan[] zzanVarArr = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        zze zzeVar = null;
        String strCreateString10 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        int i17 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) SafeParcelReader.createParcelable(parcel, header, TokenStatus.CREATOR);
                    break;
                case 8:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
                    break;
                case 10:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 11:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    zzajVar = (zzaj) SafeParcelReader.createParcelable(parcel, header, zzaj.CREATOR);
                    break;
                case 13:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                case 19:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 15:
                    zzazVar = (zzaz) SafeParcelReader.createParcelable(parcel, header, zzaz.CREATOR);
                    break;
                case 16:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 22:
                    zzahVar = (zzah) SafeParcelReader.createParcelable(parcel, header, zzah.CREATOR);
                    break;
                case 23:
                    zzafVar = (zzaf) SafeParcelReader.createParcelable(parcel, header, zzaf.CREATOR);
                    break;
                case 24:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, header, zzan.CREATOR);
                    break;
                case 26:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 27:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzb.CREATOR);
                    break;
                case 28:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 30:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 31:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 32:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 33:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 34:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 35:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    zzeVar = (zze) SafeParcelReader.createParcelable(parcel, header, zze.CREATOR);
                    break;
                case 37:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 38:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 39:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 40:
                    i17 = SafeParcelReader.readInt(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CardInfo(strCreateString, bArrCreateByteArray, strCreateString2, strCreateString3, i10, tokenStatus, strCreateString4, uri, i11, i12, zzajVar, strCreateString5, zzazVar, strCreateString6, bArrCreateByteArray2, i13, i14, i15, zzahVar, zzafVar, strCreateString7, zzanVarArr, z10, arrayListCreateTypedList, z11, z12, j10, j11, z13, j12, strCreateString8, strCreateString9, zzeVar, i16, z14, strCreateString10, i17);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CardInfo[i10];
    }
}
