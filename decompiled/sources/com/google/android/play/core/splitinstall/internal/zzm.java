package com.google.android.play.core.splitinstall.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.g0;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzm {
    public static final /* synthetic */ int zza = 0;

    static {
        zzm.class.getClassLoader();
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(g0.c("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
