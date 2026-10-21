package com.airbnb.lottie.utils;

import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: classes2.dex */
public class GammaEvaluator {
    public static float a(float f6) {
        return f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f6) {
        return f6 <= 0.0031308f ? f6 * 12.92f : (float) ((Math.pow(f6, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int evaluate(float f6, int i10, int i11) {
        if (i10 == i11 || f6 <= 0.0f) {
            return i10;
        }
        if (f6 >= 1.0f) {
            return i11;
        }
        float f10 = ((i10 >> 24) & 255) / 255.0f;
        float f11 = ((i11 >> 24) & 255) / 255.0f;
        float fA = a(((i10 >> 16) & 255) / 255.0f);
        float fA2 = a(((i10 >> 8) & 255) / 255.0f);
        float fA3 = a((i10 & 255) / 255.0f);
        float fA4 = a(((i11 >> 16) & 255) / 255.0f);
        float fA5 = a(((i11 >> 8) & 255) / 255.0f);
        float fA6 = a((i11 & 255) / 255.0f);
        float fA7 = e.a(f11, f10, f6, f10);
        float fA8 = e.a(fA4, fA, f6, fA);
        float fA9 = e.a(fA5, fA2, f6, fA2);
        float fA10 = e.a(fA6, fA3, f6, fA3);
        float fB = b(fA8) * 255.0f;
        float fB2 = b(fA9) * 255.0f;
        return Math.round(b(fA10) * 255.0f) | (Math.round(fB) << 16) | (Math.round(fA7 * 255.0f) << 24) | (Math.round(fB2) << 8);
    }
}
