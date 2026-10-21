package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ByteMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f50066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50068c;

    public ByteMatrix(int i10, int i11) {
        this.f50066a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f50067b = i10;
        this.f50068c = i11;
    }

    public void clear(byte b10) {
        for (byte[] bArr : this.f50066a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte get(int i10, int i11) {
        return this.f50066a[i11][i10];
    }

    public byte[][] getArray() {
        return this.f50066a;
    }

    public int getHeight() {
        return this.f50068c;
    }

    public int getWidth() {
        return this.f50067b;
    }

    public void set(int i10, int i11, byte b10) {
        this.f50066a[i11][i10] = b10;
    }

    public String toString() {
        int i10 = this.f50067b;
        int i11 = this.f50068c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f50066a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public void set(int i10, int i11, int i12) {
        this.f50066a[i11][i10] = (byte) i12;
    }

    public void set(int i10, int i11, boolean z10) {
        this.f50066a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }
}
