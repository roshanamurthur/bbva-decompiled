package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i10, int[] iArr, int[] iArr2) {
        int i11 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        char c10 = 0;
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = 7;
        int i20 = iArr[7];
        int i21 = 8;
        int i22 = iArr[8];
        int i23 = iArr[9];
        int i24 = iArr[10];
        int i25 = iArr[11];
        int i26 = 12;
        int i27 = iArr[12];
        int i28 = iArr[13];
        int i29 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i29;
        int iRotl3 = i28;
        int iRotl4 = i27;
        int i30 = i25;
        int i31 = i24;
        int i32 = i23;
        int i33 = i22;
        int iRotl5 = i20;
        int iRotl6 = i18;
        int iRotl7 = i17;
        int iRotl8 = i16;
        int i34 = i15;
        int i35 = i14;
        int i36 = i13;
        int i37 = i12;
        int i38 = i10;
        while (i38 > 0) {
            int i39 = i37 + iRotl8;
            int iRotl9 = Salsa20Engine.rotl(iRotl4 ^ i39, i11);
            int i40 = i33 + iRotl9;
            int iRotl10 = Salsa20Engine.rotl(iRotl8 ^ i40, i26);
            int i41 = i39 + iRotl10;
            int iRotl11 = Salsa20Engine.rotl(iRotl9 ^ i41, i21);
            int i42 = i40 + iRotl11;
            int iRotl12 = Salsa20Engine.rotl(iRotl10 ^ i42, i19);
            int i43 = i36 + iRotl7;
            int iRotl13 = Salsa20Engine.rotl(iRotl3 ^ i43, i11);
            int i44 = i32 + iRotl13;
            int iRotl14 = Salsa20Engine.rotl(iRotl7 ^ i44, i26);
            int i45 = i43 + iRotl14;
            int iRotl15 = Salsa20Engine.rotl(iRotl13 ^ i45, i21);
            int i46 = i44 + iRotl15;
            int iRotl16 = Salsa20Engine.rotl(iRotl14 ^ i46, i19);
            int i47 = i35 + iRotl6;
            int iRotl17 = Salsa20Engine.rotl(iRotl2 ^ i47, i11);
            int i48 = i31 + iRotl17;
            int iRotl18 = Salsa20Engine.rotl(iRotl6 ^ i48, i26);
            int i49 = i47 + iRotl18;
            int iRotl19 = Salsa20Engine.rotl(iRotl17 ^ i49, i21);
            int i50 = i48 + iRotl19;
            int iRotl20 = Salsa20Engine.rotl(iRotl18 ^ i50, i19);
            int i51 = i34 + iRotl5;
            int iRotl21 = Salsa20Engine.rotl(iRotl ^ i51, 16);
            int i52 = i30 + iRotl21;
            int iRotl22 = Salsa20Engine.rotl(iRotl5 ^ i52, i26);
            int i53 = i51 + iRotl22;
            int iRotl23 = Salsa20Engine.rotl(iRotl21 ^ i53, 8);
            int i54 = i52 + iRotl23;
            int iRotl24 = Salsa20Engine.rotl(iRotl22 ^ i54, 7);
            int i55 = i41 + iRotl16;
            int iRotl25 = Salsa20Engine.rotl(iRotl23 ^ i55, 16);
            int i56 = i50 + iRotl25;
            int iRotl26 = Salsa20Engine.rotl(iRotl16 ^ i56, 12);
            i37 = i55 + iRotl26;
            iRotl = Salsa20Engine.rotl(iRotl25 ^ i37, 8);
            i31 = i56 + iRotl;
            iRotl7 = Salsa20Engine.rotl(iRotl26 ^ i31, 7);
            int i57 = i45 + iRotl20;
            int iRotl27 = Salsa20Engine.rotl(iRotl11 ^ i57, 16);
            int i58 = i54 + iRotl27;
            int iRotl28 = Salsa20Engine.rotl(iRotl20 ^ i58, 12);
            i36 = i57 + iRotl28;
            iRotl4 = Salsa20Engine.rotl(iRotl27 ^ i36, 8);
            i30 = i58 + iRotl4;
            iRotl6 = Salsa20Engine.rotl(iRotl28 ^ i30, 7);
            int i59 = i49 + iRotl24;
            int iRotl29 = Salsa20Engine.rotl(iRotl15 ^ i59, 16);
            int i60 = i42 + iRotl29;
            int iRotl30 = Salsa20Engine.rotl(iRotl24 ^ i60, 12);
            i35 = i59 + iRotl30;
            iRotl3 = Salsa20Engine.rotl(iRotl29 ^ i35, 8);
            i33 = i60 + iRotl3;
            iRotl5 = Salsa20Engine.rotl(iRotl30 ^ i33, 7);
            int i61 = i53 + iRotl12;
            i11 = 16;
            int iRotl31 = Salsa20Engine.rotl(iRotl19 ^ i61, 16);
            int i62 = i46 + iRotl31;
            int iRotl32 = Salsa20Engine.rotl(iRotl12 ^ i62, 12);
            i34 = i61 + iRotl32;
            iRotl2 = Salsa20Engine.rotl(iRotl31 ^ i34, 8);
            i32 = i62 + iRotl2;
            iRotl8 = Salsa20Engine.rotl(iRotl32 ^ i32, 7);
            i38 -= 2;
            c10 = 0;
            i26 = 12;
            i21 = 8;
            i19 = 7;
        }
        iArr2[c10] = i37 + iArr[c10];
        iArr2[1] = i36 + iArr[1];
        iArr2[2] = i35 + iArr[2];
        iArr2[3] = i34 + iArr[3];
        iArr2[4] = iRotl8 + iArr[4];
        iArr2[5] = iRotl7 + iArr[5];
        iArr2[6] = iRotl6 + iArr[6];
        iArr2[7] = iRotl5 + iArr[7];
        iArr2[8] = i33 + iArr[8];
        iArr2[9] = i32 + iArr[9];
        iArr2[10] = i31 + iArr[10];
        iArr2[11] = i30 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f88602x);
        Pack.intToLittleEndian(this.f88602x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & 4294967295L);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12];
        if (i10 == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = i10 - 1;
        iArr[12] = i11;
        if (i11 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i10) {
        super(i10);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i10;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[12];
        int i13 = i11 + i12;
        iArr2[12] = i13;
        if (i12 == 0 || i13 >= i12) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            int[] iArr = this.engineState;
            int i12 = iArr[13];
            if ((((long) i12) & 4294967295L) < (((long) i10) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[13] = i12 - i10;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[12];
        if ((((long) i13) & 4294967295L) >= (4294967295L & ((long) i11))) {
            iArr2[12] = i13 - i11;
            return;
        }
        int i14 = iArr2[13];
        if (i14 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[13] = i14 - 1;
        iArr2[12] = i13 - i11;
    }
}
