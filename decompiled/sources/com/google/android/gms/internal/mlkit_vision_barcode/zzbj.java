package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.collection.f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbj {
    public static int zza(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(f.c(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }
}
