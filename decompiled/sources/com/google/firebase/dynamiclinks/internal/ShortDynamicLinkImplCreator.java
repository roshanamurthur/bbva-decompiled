package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ShortDynamicLinkImplCreator implements Parcelable.Creator<ShortDynamicLinkImpl> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ShortDynamicLinkImpl createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
            } else if (fieldId == 2) {
                uri2 = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ShortDynamicLinkImpl(uri, uri2, arrayListCreateTypedList);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ShortDynamicLinkImpl[] newArray(int i10) {
        return new ShortDynamicLinkImpl[i10];
    }
}
