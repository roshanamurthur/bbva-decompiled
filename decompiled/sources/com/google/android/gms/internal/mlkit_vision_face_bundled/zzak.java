package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.appcompat.widget.g0;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzak {
    public static int zza(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzal.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(g0.c("negative size: ", i11));
            }
            strZza = zzal.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzd(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
        return i10;
    }

    public static void zzc(int i10, int i11, int i12) {
        String strZzd;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzd = zzd(i10, i12, "start index");
            } else {
                strZzd = (i11 < 0 || i11 > i12) ? zzd(i11, i12, "end index") : zzal.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZzd);
        }
    }

    private static String zzd(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzal.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzal.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(g0.c("negative size: ", i11));
    }
}
