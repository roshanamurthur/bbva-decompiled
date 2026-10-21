package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultPlacement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f49883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f49886d;

    public DefaultPlacement(CharSequence charSequence, int i10, int i11) {
        this.f49883a = charSequence;
        this.f49885c = i10;
        this.f49884b = i11;
        byte[] bArr = new byte[i10 * i11];
        this.f49886d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            int i14 = this.f49884b;
            i10 += i14;
            i11 += 4 - ((i14 + 4) % 8);
        }
        int i15 = this.f49885c;
        if (i11 < 0) {
            i11 += i15;
            i10 += 4 - ((i15 + 4) % 8);
        }
        this.f49886d[(i10 * i15) + i11] = (byte) ((this.f49883a.charAt(i12) & (1 << (8 - i13))) == 0 ? 0 : 1);
    }

    public final void b(int i10, int i11, int i12) {
        int i13 = i10 - 2;
        int i14 = i11 - 2;
        a(i13, i14, i12, 1);
        int i15 = i11 - 1;
        a(i13, i15, i12, 2);
        int i16 = i10 - 1;
        a(i16, i14, i12, 3);
        a(i16, i15, i12, 4);
        a(i16, i11, i12, 5);
        a(i10, i14, i12, 6);
        a(i10, i15, i12, 7);
        a(i10, i11, i12, 8);
    }

    public final boolean getBit(int i10, int i11) {
        return this.f49886d[(i11 * this.f49885c) + i10] == 1;
    }

    public final void place() {
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        int i13 = 0;
        int i14 = 0;
        int i15 = 4;
        while (true) {
            i10 = this.f49885c;
            i11 = this.f49884b;
            if (i15 == i11 && i13 == 0) {
                int i16 = i11 - 1;
                a(i16, 0, i14, 1);
                a(i16, 1, i14, 2);
                a(i16, 2, i14, 3);
                a(0, i10 - 2, i14, 4);
                int i17 = i10 - 1;
                a(0, i17, i14, 5);
                a(1, i17, i14, 6);
                a(2, i17, i14, 7);
                a(3, i17, i14, 8);
                i14++;
            }
            i12 = i11 - 2;
            if (i15 == i12 && i13 == 0 && i10 % 4 != 0) {
                a(i11 - 3, 0, i14, 1);
                a(i12, 0, i14, 2);
                a(i11 - 1, 0, i14, 3);
                a(0, i10 - 4, i14, 4);
                a(0, i10 - 3, i14, 5);
                a(0, i10 - 2, i14, 6);
                int i18 = i10 - 1;
                a(0, i18, i14, 7);
                a(1, i18, i14, 8);
                i14++;
            }
            if (i15 == i12 && i13 == 0 && i10 % 8 == 4) {
                a(i11 - 3, 0, i14, 1);
                a(i12, 0, i14, 2);
                a(i11 - 1, 0, i14, 3);
                a(0, i10 - 2, i14, 4);
                int i19 = i10 - 1;
                a(0, i19, i14, 5);
                a(1, i19, i14, 6);
                a(2, i19, i14, 7);
                a(3, i19, i14, 8);
                i14++;
            }
            if (i15 == i11 + 4 && i13 == 2 && i10 % 8 == 0) {
                int i20 = i11 - 1;
                a(i20, 0, i14, 1);
                int i21 = i10 - 1;
                a(i20, i21, i14, 2);
                int i22 = i10 - 3;
                a(0, i22, i14, 3);
                int i23 = i10 - 2;
                a(0, i23, i14, 4);
                a(0, i21, i14, 5);
                a(1, i22, i14, 6);
                a(1, i23, i14, 7);
                a(1, i21, i14, 8);
                i14++;
            }
            while (true) {
                bArr = this.f49886d;
                if (i15 < i11 && i13 >= 0 && bArr[(i15 * i10) + i13] < 0) {
                    b(i15, i13, i14);
                    i14++;
                }
                int i24 = i15 - 2;
                int i25 = i13 + 2;
                if (i24 < 0 || i25 >= i10) {
                    break;
                }
                i15 = i24;
                i13 = i25;
            }
            int i26 = i15 - 1;
            int i27 = i13 + 5;
            while (true) {
                if (i26 >= 0 && i27 < i10 && bArr[(i26 * i10) + i27] < 0) {
                    b(i26, i27, i14);
                    i14++;
                }
                int i28 = i26 + 2;
                int i29 = i27 - 2;
                if (i28 >= i11 || i29 < 0) {
                    break;
                }
                i26 = i28;
                i27 = i29;
            }
            i15 = i26 + 5;
            i13 = i27 - 1;
            if (i15 >= i11 && i13 >= i10) {
                break;
            }
        }
        int i30 = i10 - 1;
        int i31 = i11 - 1;
        if (bArr[(i31 * i10) + i30] >= 0) {
            return;
        }
        int i32 = (i31 * i10) + i30;
        byte b10 = (byte) 1;
        bArr[i32] = b10;
        bArr[(i12 * i10) + (i10 - 2)] = b10;
    }
}
