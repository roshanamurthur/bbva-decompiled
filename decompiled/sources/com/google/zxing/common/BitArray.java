package com.google.zxing.common;

import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes10.dex */
public final class BitArray implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int[] f49806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f49807q0;

    public BitArray() {
        this.f49807q0 = 0;
        this.f49806p0 = new int[1];
    }

    public final void a(int i10) {
        int[] iArr = this.f49806p0;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f49806p0 = iArr2;
        }
    }

    public void appendBit(boolean z10) {
        a(this.f49807q0 + 1);
        if (z10) {
            int[] iArr = this.f49806p0;
            int i10 = this.f49807q0;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f49807q0++;
    }

    public void appendBitArray(BitArray bitArray) {
        int i10 = bitArray.f49807q0;
        a(this.f49807q0 + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            appendBit(bitArray.get(i11));
        }
    }

    public void appendBits(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        a(this.f49807q0 + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            appendBit(z10);
            i11--;
        }
    }

    public void clear() {
        int length = this.f49806p0.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f49806p0[i10] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.f49807q0 == bitArray.f49807q0 && Arrays.equals(this.f49806p0, bitArray.f49806p0);
    }

    public void flip(int i10) {
        int[] iArr = this.f49806p0;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) ^ iArr[i11];
    }

    public boolean get(int i10) {
        return ((1 << (i10 & 31)) & this.f49806p0[i10 / 32]) != 0;
    }

    public int[] getBitArray() {
        return this.f49806p0;
    }

    public int getNextSet(int i10) {
        int i11 = this.f49807q0;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & this.f49806p0[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f49806p0;
            if (i12 == iArr.length) {
                return this.f49807q0;
            }
            i13 = iArr[i12];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i13) + (i12 << 5);
        int i14 = this.f49807q0;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public int getNextUnset(int i10) {
        int i11 = this.f49807q0;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (~((1 << (i10 & 31)) - 1)) & (~this.f49806p0[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f49806p0;
            if (i12 == iArr.length) {
                return this.f49807q0;
            }
            i13 = ~iArr[i12];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i13) + (i12 << 5);
        int i14 = this.f49807q0;
        return iNumberOfTrailingZeros > i14 ? i14 : iNumberOfTrailingZeros;
    }

    public int getSize() {
        return this.f49807q0;
    }

    public int getSizeInBytes() {
        return (this.f49807q0 + 7) / 8;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f49806p0) + (this.f49807q0 * 31);
    }

    public boolean isRange(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f49807q0) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f49806p0[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    public void reverse() {
        int[] iArr = new int[this.f49806p0.length];
        int i10 = (this.f49807q0 - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = this.f49806p0[i12];
            long j11 = ((j10 & 1431655765) << 1) | ((j10 >> 1) & 1431655765);
            long j12 = ((j11 & 858993459) << 2) | ((j11 >> 2) & 858993459);
            long j13 = ((j12 & 252645135) << 4) | ((j12 >> 4) & 252645135);
            long j14 = ((j13 & 16711935) << 8) | ((j13 >> 8) & 16711935);
            iArr[i10 - i12] = (int) (((j14 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j14 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i13 = this.f49807q0;
        int i14 = i11 << 5;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i10] = i16;
        }
        this.f49806p0 = iArr;
    }

    public void set(int i10) {
        int[] iArr = this.f49806p0;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void setBulk(int i10, int i11) {
        this.f49806p0[i10 / 32] = i11;
    }

    public void setRange(int i10, int i11) {
        if (i11 < i10 || i10 < 0 || i11 > this.f49807q0) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = 31;
            int i17 = i15 > i13 ? 0 : i10 & 31;
            if (i15 >= i14) {
                i16 = 31 & i12;
            }
            int i18 = (2 << i16) - (1 << i17);
            int[] iArr = this.f49806p0;
            iArr[i15] = i18 | iArr[i15];
            i15++;
        }
    }

    public void toBytes(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (get(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public String toString() {
        int i10 = this.f49807q0;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f49807q0; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(get(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void xor(BitArray bitArray) {
        if (this.f49807q0 != bitArray.f49807q0) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f49806p0;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ bitArray.f49806p0[i10];
            i10++;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitArray m5296clone() {
        int[] iArr = (int[]) this.f49806p0.clone();
        int i10 = this.f49807q0;
        BitArray bitArray = new BitArray();
        bitArray.f49806p0 = iArr;
        bitArray.f49807q0 = i10;
        return bitArray;
    }

    public BitArray(int i10) {
        this.f49807q0 = i10;
        this.f49806p0 = new int[(i10 + 31) / 32];
    }
}
