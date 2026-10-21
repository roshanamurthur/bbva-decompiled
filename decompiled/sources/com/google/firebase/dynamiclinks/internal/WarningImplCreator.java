package com.google.firebase.dynamiclinks.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes10.dex */
public class WarningImplCreator implements Parcelable.Creator<ShortDynamicLinkImpl.WarningImpl> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ShortDynamicLinkImpl.WarningImpl createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ShortDynamicLinkImpl.WarningImpl(strCreateString);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ShortDynamicLinkImpl.WarningImpl[] newArray(int i10) {
        return new ShortDynamicLinkImpl.WarningImpl[i10];
    }
}
