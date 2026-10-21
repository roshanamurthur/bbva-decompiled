package com.google.android.gms.internal.mlkit_vision_common;

import androidx.appcompat.widget.g0;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(g0.c("at index ", i11));
            }
        }
        return objArr;
    }
}
