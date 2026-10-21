package com.google.android.gms.internal.mlkit_common;

import androidx.appcompat.widget.g0;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzak {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(g0.c("at index ", i11));
            }
        }
        return objArr;
    }
}
