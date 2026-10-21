package com.google.android.gms.internal.wearable;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class zzr {
    protected static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Object zzhk = new Object();

    public static boolean equals(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        }
        return Arrays.equals(jArr, jArr2);
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    public static void zza(zzn zznVar, zzn zznVar2) {
        zzp zzpVar = zznVar.zzhc;
        if (zzpVar != null) {
            zznVar2.zzhc = (zzp) zzpVar.clone();
        }
    }

    public static int hashCode(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(fArr);
    }

    public static int hashCode(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int iHashCode = 0;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            if (obj != null) {
                iHashCode = obj.hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length == 0) {
            return fArr2 == null || fArr2.length == 0;
        }
        return Arrays.equals(fArr, fArr2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length || objArr[i10] != null) {
                while (i11 < length2 && objArr2[i11] == null) {
                    i11++;
                }
                boolean z10 = i10 >= length;
                boolean z11 = i11 >= length2;
                if (z10 && z11) {
                    return true;
                }
                if (z10 != z11 || !objArr[i10].equals(objArr2[i11])) {
                    return false;
                }
                i10++;
                i11++;
            } else {
                i10++;
            }
        }
    }
}
