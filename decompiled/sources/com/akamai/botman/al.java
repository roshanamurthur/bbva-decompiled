package com.akamai.botman;

import android.util.Pair;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class al {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    public static Pair<String, Long> a(float[] fArr, float f6) {
        long jLongValue;
        long j10;
        ?? Concat;
        ?? r3 = "";
        try {
            int length = fArr.length;
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            Pair<Float, Float> pairB = b(fArr);
            float fFloatValue = ((Float) pairB.first).floatValue();
            float fFloatValue2 = ((Float) pairB.second).floatValue();
            String strA = an.a(ao.b(fArr, fFloatValue, fFloatValue2));
            int length2 = strA.length();
            long jA = ak.a(strA);
            float fA = a(fFloatValue);
            float fA2 = a(fFloatValue2);
            aq aqVar = new aq(String.format(Locale.US, "2;%.2f;%.2f;%d;%s", Float.valueOf(fA), Float.valueOf(fA2), Long.valueOf(jA), strA), Integer.valueOf(length2), Long.valueOf(((long) Math.round((fA2 * 100.0f) + (fA * 100.0f))) + jA));
            int iIntValue = ((Integer) aqVar.f26312b).intValue();
            if (Integer.bitCount(length) != 1) {
                throw new IllegalArgumentException("Length must be power of 2");
            }
            am.a(fArr2, 0, new float[length], length);
            Float[] fArr3 = new Float[length];
            for (int i10 = 0; i10 < length; i10++) {
                fArr3[i10] = Float.valueOf(Math.abs(fArr2[i10]));
            }
            Arrays.sort(fArr3);
            int i11 = length - 1;
            float fFloatValue3 = fArr3[(int) Math.floor(i11 * f6)].floatValue();
            for (int i12 = 0; i12 < length; i12++) {
                if (Math.abs(fArr2[i12]) < fFloatValue3) {
                    fArr2[i12] = 0.0f;
                }
            }
            float f10 = fArr2[0];
            float[] fArr4 = new float[i11];
            System.arraycopy(fArr2, 1, fArr4, 0, i11);
            Pair<Float, Float> pairB2 = b(fArr4);
            float fFloatValue4 = ((Float) pairB2.first).floatValue();
            float fFloatValue5 = ((Float) pairB2.second).floatValue();
            String strA2 = an.a(ao.b(fArr4, fFloatValue4, fFloatValue5));
            int length3 = strA2.length();
            long jA2 = ak.a(strA2);
            float fA3 = a(fFloatValue4);
            float fA4 = a(fFloatValue5);
            float fA5 = a(f10);
            aq aqVar2 = new aq(String.format(Locale.US, "1;%.2f;%.2f;%.2f;%d;%s", Float.valueOf(fA3), Float.valueOf(fA4), Float.valueOf(fA5), Long.valueOf(jA2), strA2), Integer.valueOf(length3), Long.valueOf(((long) Math.round((fA5 * 100.0f) + (fA4 * 100.0f) + (fA3 * 100.0f))) + jA2));
            ?? r4 = 20;
            String strD = "Incorrect sensor data";
            try {
                if (iIntValue - ((Integer) aqVar2.f26312b).intValue() < 20) {
                    String str = (String) aqVar.f26311a;
                    jLongValue = ((Long) aqVar.f26313c).longValue();
                    r4 = str;
                } else {
                    String str2 = (String) aqVar2.f26311a;
                    jLongValue = ((Long) aqVar2.f26313c).longValue();
                    r4 = str2;
                }
            } catch (Exception e5) {
                e = e5;
                r3 = r4;
                String message = e.getMessage();
                ap.c("DctEncoding", "Failed in DCT processing: ".concat(String.valueOf(message)), new Throwable[0]);
                strD = androidx.camera.core.processing.f.d("Incorrect sensor data: ", message);
                r4 = r3;
                jLongValue = 0;
            }
            if (r4.isEmpty()) {
                ap.c("DctEncoding", strD, new Throwable[0]);
                j10 = 0;
                Concat = "0;".concat(String.valueOf(strD));
            } else {
                j10 = jLongValue;
                Concat = r4;
            }
            return new Pair<>(Concat, Long.valueOf(j10));
        } catch (Exception e7) {
            e = e7;
        }
    }

    public static Pair<Float, Float> b(float[] fArr) {
        float f6 = fArr[0];
        float f10 = f6;
        for (float f11 : fArr) {
            if (f11 < f6) {
                f6 = f11;
            } else if (f11 > f10) {
                f10 = f11;
            }
        }
        return new Pair<>(Float.valueOf(f6), Float.valueOf(f10));
    }

    public static float a(float f6) {
        return Math.round(f6 * 100.0f) / 100.0f;
    }
}
