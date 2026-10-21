package com.akamai.botman;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ao {
    public static long a(long j10) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = j10 | (j10 >>> 1);
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        return j15 - (j15 >>> 1);
    }

    public static String b(float[] fArr, float f6, float f10) {
        int length = fArr.length;
        StringBuilder sb2 = new StringBuilder();
        float f11 = (f10 - f6) / 60.0f;
        for (int i10 = 0; i10 < length; i10++) {
            char cFloor = (char) (((int) Math.floor((fArr[i10] - f6) / f11)) + 65);
            if (fArr[i10] == f10) {
                cFloor = AbstractJsonLexerKt.END_OBJ;
            }
            if (cFloor == '\\') {
                cFloor = '.';
            } else if (cFloor == '.') {
                cFloor = '\\';
            }
            sb2.append(cFloor);
        }
        return sb2.toString();
    }
}
