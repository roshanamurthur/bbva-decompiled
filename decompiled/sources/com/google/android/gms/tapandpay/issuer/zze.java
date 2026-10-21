package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        byte[] bArrCreateByteArray = null;
        String strCreateString = null;
        String strCreateString2 = null;
        UserAddress userAddress = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 5:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    userAddress = (UserAddress) SafeParcelReader.createParcelable(parcel, header, UserAddress.CREATOR);
                    break;
                case 8:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PushTokenizeRequest(i10, i11, bArrCreateByteArray, strCreateString, strCreateString2, userAddress, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PushTokenizeRequest[i10];
    }
}
