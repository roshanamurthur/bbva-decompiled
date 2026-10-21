package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes9.dex */
public class ByteVector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39887b;

    public ByteVector() {
        this.f39886a = new byte[64];
    }

    public final void a(int i10) {
        byte[] bArr = this.f39886a;
        int length = bArr.length * 2;
        int i11 = this.f39887b;
        int i12 = i10 + i11;
        if (length <= i12) {
            length = i12;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        this.f39886a = bArr2;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f39887b;
        int i13 = i12 + 2;
        if (i13 > this.f39886a.length) {
            a(2);
        }
        byte[] bArr = this.f39886a;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) i11;
        this.f39887b = i13;
    }

    public final void c(int i10, int i11) {
        int i12 = this.f39887b;
        int i13 = i12 + 3;
        if (i13 > this.f39886a.length) {
            a(3);
        }
        byte[] bArr = this.f39886a;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
        this.f39887b = i13;
    }

    public final void d(int i10, int i11, String str) {
        int length = str.length();
        int i12 = i10;
        int i13 = i12;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 1 || cCharAt > 127) {
                i13 = cCharAt > 2047 ? i13 + 3 : i13 + 2;
            } else {
                i13++;
            }
            i12++;
        }
        if (i13 > i11) {
            throw new IllegalArgumentException();
        }
        int i14 = this.f39887b;
        int i15 = i14 - i10;
        int i16 = i15 - 2;
        if (i16 >= 0) {
            byte[] bArr = this.f39886a;
            bArr[i16] = (byte) (i13 >>> 8);
            bArr[i15 - 1] = (byte) i13;
        }
        if ((i14 + i13) - i10 > this.f39886a.length) {
            a(i13 - i10);
        }
        int i17 = this.f39887b;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                byte[] bArr2 = this.f39886a;
                int i18 = i17 + 1;
                if (cCharAt2 > 2047) {
                    bArr2[i17] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                    int i19 = i17 + 2;
                    bArr2[i18] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i17 += 3;
                    bArr2[i19] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    bArr2[i17] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                    i17 += 2;
                    bArr2[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
            } else {
                this.f39886a[i17] = (byte) cCharAt2;
                i17++;
            }
            i10++;
        }
        this.f39887b = i17;
    }

    public ByteVector putByte(int i10) {
        int i11 = this.f39887b;
        int i12 = i11 + 1;
        if (i12 > this.f39886a.length) {
            a(1);
        }
        this.f39886a[i11] = (byte) i10;
        this.f39887b = i12;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i10, int i11) {
        if (this.f39887b + i11 > this.f39886a.length) {
            a(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.f39886a, this.f39887b, i11);
        }
        this.f39887b += i11;
        return this;
    }

    public ByteVector putInt(int i10) {
        int i11 = this.f39887b;
        if (i11 + 4 > this.f39886a.length) {
            a(4);
        }
        byte[] bArr = this.f39886a;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.f39887b = i11 + 4;
        return this;
    }

    public ByteVector putLong(long j10) {
        int i10 = this.f39887b;
        if (i10 + 8 > this.f39886a.length) {
            a(8);
        }
        byte[] bArr = this.f39886a;
        int i11 = (int) (j10 >>> 32);
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
        int i12 = (int) j10;
        bArr[i10 + 4] = (byte) (i12 >>> 24);
        bArr[i10 + 5] = (byte) (i12 >>> 16);
        bArr[i10 + 6] = (byte) (i12 >>> 8);
        bArr[i10 + 7] = (byte) i12;
        this.f39887b = i10 + 8;
        return this;
    }

    public ByteVector putShort(int i10) {
        int i11 = this.f39887b;
        if (i11 + 2 > this.f39886a.length) {
            a(2);
        }
        byte[] bArr = this.f39886a;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        this.f39887b = i11 + 2;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f39887b;
        int i11 = i10 + 2;
        if (i11 + length > this.f39886a.length) {
            a(length + 2);
        }
        byte[] bArr = this.f39886a;
        bArr[i10] = (byte) (length >>> 8);
        bArr[i10 + 1] = (byte) length;
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 1 || cCharAt > 127) {
                this.f39887b = i11;
                d(i12, 65535, str);
                return this;
            }
            bArr[i11] = (byte) cCharAt;
            i12++;
            i11++;
        }
        this.f39887b = i11;
        return this;
    }

    public ByteVector(int i10) {
        this.f39886a = new byte[i10];
    }
}
