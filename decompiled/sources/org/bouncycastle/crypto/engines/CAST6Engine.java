package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes3.dex */
public final class CAST6Engine extends CAST5Engine {
    protected static final int BLOCK_SIZE = 16;
    protected static final int ROUNDS = 12;
    protected int[] _Kr = new int[48];
    protected int[] _Km = new int[48];
    protected int[] _Tr = new int[192];
    protected int[] _Tm = new int[192];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f88327l = new int[8];

    public final void CAST_Decipher(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 >= 6) {
                break;
            }
            int i16 = (11 - i15) * 4;
            i12 ^= F1(i13, this._Km[i16], this._Kr[i16]);
            int i17 = i16 + 1;
            i11 ^= F2(i12, this._Km[i17], this._Kr[i17]);
            int i18 = i16 + 2;
            i10 ^= F3(i11, this._Km[i18], this._Kr[i18]);
            int i19 = i16 + 3;
            i13 ^= F1(i10, this._Km[i19], this._Kr[i19]);
            i15++;
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = (11 - i14) * 4;
            int i21 = i20 + 3;
            i13 ^= F1(i10, this._Km[i21], this._Kr[i21]);
            int i22 = i20 + 2;
            i10 ^= F3(i11, this._Km[i22], this._Kr[i22]);
            int i23 = i20 + 1;
            i11 ^= F2(i12, this._Km[i23], this._Kr[i23]);
            i12 ^= F1(i13, this._Km[i20], this._Kr[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    public final void CAST_Encipher(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        int i15 = 0;
        while (true) {
            if (i15 >= 6) {
                break;
            }
            int i16 = i15 * 4;
            i12 ^= F1(i13, this._Km[i16], this._Kr[i16]);
            int i17 = i16 + 1;
            i11 ^= F2(i12, this._Km[i17], this._Kr[i17]);
            int i18 = i16 + 2;
            i10 ^= F3(i11, this._Km[i18], this._Kr[i18]);
            int i19 = i16 + 3;
            i13 ^= F1(i10, this._Km[i19], this._Kr[i19]);
            i15++;
        }
        for (i14 = 6; i14 < 12; i14++) {
            int i20 = i14 * 4;
            int i21 = i20 + 3;
            i13 ^= F1(i10, this._Km[i21], this._Kr[i21]);
            int i22 = i20 + 2;
            i10 ^= F3(i11, this._Km[i22], this._Kr[i22]);
            int i23 = i20 + 1;
            i11 ^= F2(i12, this._Km[i23], this._Kr[i23]);
            i12 ^= F1(i13, this._Km[i20], this._Kr[i20]);
        }
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        CAST_Decipher(BytesTo32bits(bArr, i10), BytesTo32bits(bArr, i10 + 4), BytesTo32bits(bArr, i10 + 8), BytesTo32bits(bArr, i10 + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i11);
        Bits32ToBytes(iArr[1], bArr2, i11 + 4);
        Bits32ToBytes(iArr[2], bArr2, i11 + 8);
        Bits32ToBytes(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public int encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = new int[4];
        CAST_Encipher(BytesTo32bits(bArr, i10), BytesTo32bits(bArr, i10 + 4), BytesTo32bits(bArr, i10 + 8), BytesTo32bits(bArr, i10 + 12), iArr);
        Bits32ToBytes(iArr[0], bArr2, i11);
        Bits32ToBytes(iArr[1], bArr2, i11 + 4);
        Bits32ToBytes(iArr[2], bArr2, i11 + 8);
        Bits32ToBytes(iArr[3], bArr2, i11 + 12);
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "CAST6";
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine
    public void setKey(byte[] bArr) {
        int[] iArr;
        int i10 = 1518500249;
        int i11 = 19;
        for (int i12 = 0; i12 < 24; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = (i12 * 8) + i13;
                this._Tm[i14] = i10;
                i10 += 1859775393;
                this._Tr[i14] = i11;
                i11 = (i11 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        int i15 = 0;
        while (true) {
            iArr = this.f88327l;
            if (i15 >= 8) {
                break;
            }
            iArr[i15] = BytesTo32bits(bArr2, i15 * 4);
            i15++;
        }
        for (int i16 = 0; i16 < 12; i16++) {
            int i17 = i16 * 16;
            iArr[6] = iArr[6] ^ F1(iArr[7], this._Tm[i17], this._Tr[i17]);
            int i18 = i17 + 1;
            iArr[5] = iArr[5] ^ F2(iArr[6], this._Tm[i18], this._Tr[i18]);
            int i19 = i17 + 2;
            iArr[4] = iArr[4] ^ F3(iArr[5], this._Tm[i19], this._Tr[i19]);
            int i20 = i17 + 3;
            iArr[3] = F1(iArr[4], this._Tm[i20], this._Tr[i20]) ^ iArr[3];
            int i21 = i17 + 4;
            iArr[2] = F2(iArr[3], this._Tm[i21], this._Tr[i21]) ^ iArr[2];
            int i22 = i17 + 5;
            iArr[1] = F3(iArr[2], this._Tm[i22], this._Tr[i22]) ^ iArr[1];
            int i23 = i17 + 6;
            iArr[0] = iArr[0] ^ F1(iArr[1], this._Tm[i23], this._Tr[i23]);
            int i24 = i17 + 7;
            iArr[7] = F2(iArr[0], this._Tm[i24], this._Tr[i24]) ^ iArr[7];
            int i25 = ((i16 * 2) + 1) * 8;
            iArr[6] = iArr[6] ^ F1(iArr[7], this._Tm[i25], this._Tr[i25]);
            int i26 = i25 + 1;
            iArr[5] = iArr[5] ^ F2(iArr[6], this._Tm[i26], this._Tr[i26]);
            int i27 = i25 + 2;
            iArr[4] = iArr[4] ^ F3(iArr[5], this._Tm[i27], this._Tr[i27]);
            int i28 = i25 + 3;
            iArr[3] = F1(iArr[4], this._Tm[i28], this._Tr[i28]) ^ iArr[3];
            int i29 = i25 + 4;
            iArr[2] = F2(iArr[3], this._Tm[i29], this._Tr[i29]) ^ iArr[2];
            int i30 = i25 + 5;
            iArr[1] = F3(iArr[2], this._Tm[i30], this._Tr[i30]) ^ iArr[1];
            int i31 = i25 + 6;
            iArr[0] = iArr[0] ^ F1(iArr[1], this._Tm[i31], this._Tr[i31]);
            int i32 = i25 + 7;
            iArr[7] = F2(iArr[0], this._Tm[i32], this._Tr[i32]) ^ iArr[7];
            int[] iArr2 = this._Kr;
            int i33 = i16 * 4;
            iArr2[i33] = iArr[0] & 31;
            int i34 = i33 + 1;
            iArr2[i34] = iArr[2] & 31;
            int i35 = i33 + 2;
            iArr2[i35] = iArr[4] & 31;
            int i36 = i33 + 3;
            iArr2[i36] = iArr[6] & 31;
            int[] iArr3 = this._Km;
            iArr3[i33] = iArr[7];
            iArr3[i34] = iArr[5];
            iArr3[i35] = iArr[3];
            iArr3[i36] = iArr[1];
        }
    }

    @Override // org.bouncycastle.crypto.engines.CAST5Engine, org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
