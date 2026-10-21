package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        Bitmap bitmap = null;
        String strCreateString2 = null;
        WalletCardIntent[] walletCardIntentArr = null;
        CardIconMessage[] cardIconMessageArr = null;
        String strCreateString3 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    bitmap = (Bitmap) SafeParcelReader.createParcelable(parcel, header, Bitmap.CREATOR);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    walletCardIntentArr = (WalletCardIntent[]) SafeParcelReader.createTypedArray(parcel, header, WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (CardIconMessage[]) SafeParcelReader.createTypedArray(parcel, header, CardIconMessage.CREATOR);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new QuickAccessWalletCard(strCreateString, bitmap, strCreateString2, walletCardIntentArr, cardIconMessageArr, j10, j11, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new QuickAccessWalletCard[i10];
    }
}
