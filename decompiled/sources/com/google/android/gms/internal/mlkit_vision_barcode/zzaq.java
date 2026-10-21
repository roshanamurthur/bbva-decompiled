package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.camera.core.imagecapture.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaq {
    public static int zza(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzar.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(a.a(26, "negative size: ", i11));
            }
            strZza = zzar.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zze(i10, i11, FirebaseAnalytics.Param.INDEX));
        }
        return i10;
    }

    public static void zzc(int i10, int i11, int i12) {
        String strZze;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZze = zze(i10, i12, "start index");
            } else {
                strZze = (i11 < 0 || i11 > i12) ? zze(i11, i12, "end index") : zzar.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZze);
        }
    }

    public static void zzd(boolean z10, @CheckForNull Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zze(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzar.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzar.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a.a(26, "negative size: ", i11));
    }
}
