package com.google.android.gms.internal.mlkit_common;

import androidx.camera.camera2.internal.h0;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(h0.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
