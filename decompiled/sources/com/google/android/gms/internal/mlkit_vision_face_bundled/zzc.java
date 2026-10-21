package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.g0;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
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
}
