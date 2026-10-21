package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class beo {
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        return (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((((~(i12 | (i14 | i19))) | (~((i19 | i16) | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((i17 | i18) * (-516)) + i13)) != 1 ? new IOException((String) objArr[0], (Throwable) objArr[1]) : new IllegalStateException((String) objArr[0], (Throwable) objArr[1]);
    }

    public static IOException setX(String str, Throwable th2) {
        return (IOException) setCompoundDrawableTintBlendMode(new Object[]{str, th2}, -175138791, 175138791, (int) System.currentTimeMillis());
    }

    public static IllegalStateException setY(String str, Throwable th2) {
        return (IllegalStateException) setCompoundDrawableTintBlendMode(new Object[]{str, th2}, -1445130895, 1445130896, (int) System.currentTimeMillis());
    }
}
