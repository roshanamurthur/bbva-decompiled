package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import cz.muni.fi.xklinex.whiteboxAES.generator.GF2MatrixEx;

/* JADX INFO: loaded from: classes9.dex */
public class t3 {
    public static void a(GF2MatrixEx gF2MatrixEx, byte b10, int i10, int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            gF2MatrixEx.set(i10 + i12, i11, (1 << i12) & b10);
        }
    }

    public static byte a(GF2MatrixEx gF2MatrixEx, int i10, int i11) {
        long j10 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            j10 |= gF2MatrixEx.get(i10 + i12, i11) == 0 ? 0L : 1 << i12;
        }
        return (byte) j10;
    }
}
