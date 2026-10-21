package com.google.zxing.common;

/* JADX INFO: loaded from: classes10.dex */
public final class BitSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f49812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49814c;

    public BitSource(byte[] bArr) {
        this.f49812a = bArr;
    }

    public int available() {
        return ((this.f49812a.length - this.f49813b) * 8) - this.f49814c;
    }

    public int getBitOffset() {
        return this.f49814c;
    }

    public int getByteOffset() {
        return this.f49813b;
    }

    public int readBits(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > available()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f49814c;
        int i12 = 0;
        byte[] bArr = this.f49812a;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            int i16 = this.f49813b;
            int i17 = (((255 >> (8 - i14)) << i15) & bArr[i16]) >> i15;
            i10 -= i14;
            int i18 = i11 + i14;
            this.f49814c = i18;
            if (i18 == 8) {
                this.f49814c = 0;
                this.f49813b = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i19 = i12 << 8;
            int i20 = this.f49813b;
            int i21 = i19 | (bArr[i20] & 255);
            this.f49813b = i20 + 1;
            i10 -= 8;
            i12 = i21;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i22 = 8 - i10;
        int i23 = (i12 << i10) | ((bArr[this.f49813b] & ((255 >> i22) << i22)) >> i22);
        this.f49814c += i10;
        return i23;
    }
}
