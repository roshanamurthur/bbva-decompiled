package com.google.android.gms.internal.common;

import androidx.appcompat.widget.g0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@NullMarked
public final class zzah {
    @CanIgnoreReturnValue
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(g0.c("at index ", i11));
            }
        }
        return objArr;
    }
}
