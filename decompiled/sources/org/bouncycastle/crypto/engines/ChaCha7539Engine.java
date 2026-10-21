package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ChaCha7539Engine extends Salsa20Engine {
    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12] + 1;
        iArr[12] = i10;
        if (i10 == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.f88602x);
        Pack.intToLittleEndian(this.f88602x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        return ((long) this.engineState[12]) & 4294967295L;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public int getNonceSize() {
        return 12;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[12];
        if (i10 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr[12] = i10 - 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
        int[] iArr = this.engineState;
        int i12 = iArr[12];
        int i13 = i11 + i12;
        iArr[12] = i13;
        if (i12 != 0 && i13 < i12) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int[] iArr = this.engineState;
        int i12 = iArr[12];
        if ((((long) i12) & 4294967295L) < (4294967295L & ((long) i11))) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr[12] = i12 - i11;
    }
}
