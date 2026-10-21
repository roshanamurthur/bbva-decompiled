package com.google.android.gms.internal.mlkit_vision_common;

import androidx.collection.j;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(j.b("null value in entry: ", obj, "=null"));
        }
    }
}
