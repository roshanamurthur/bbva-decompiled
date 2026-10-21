package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;
import kh.a;

/* JADX INFO: loaded from: classes10.dex */
public final class BarcodeMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f50009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50012d;

    public BarcodeMatrix(int i10, int i11) {
        a[] aVarArr = new a[i10];
        this.f50009a = aVarArr;
        int length = aVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f50009a[i12] = new a(((i11 + 4) * 17) + 1);
        }
        this.f50012d = i11 * 17;
        this.f50011c = i10;
        this.f50010b = -1;
    }

    public final a a() {
        return this.f50009a[this.f50010b];
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i10, int i11) {
        int i12 = this.f50011c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12 * i11, this.f50012d * i10);
        int i13 = i12 * i11;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = (i13 - i14) - 1;
            byte[] bArr2 = this.f50009a[i14 / i11].f79323a;
            int length = bArr2.length * i10;
            byte[] bArr3 = new byte[length];
            for (int i16 = 0; i16 < length; i16++) {
                bArr3[i16] = bArr2[i16 / i10];
            }
            bArr[i15] = bArr3;
        }
        return bArr;
    }
}
