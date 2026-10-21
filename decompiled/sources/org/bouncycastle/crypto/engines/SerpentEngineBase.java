package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    protected int X0;
    protected int X1;
    protected int X2;
    protected int X3;
    protected boolean encrypting;
    protected int[] wKey;

    public static int rotateLeft(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static int rotateRight(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public final void LT() {
        int iRotateLeft = rotateLeft(this.X0, 13);
        int iRotateLeft2 = rotateLeft(this.X2, 3);
        int i10 = (this.X1 ^ iRotateLeft) ^ iRotateLeft2;
        int i11 = (this.X3 ^ iRotateLeft2) ^ (iRotateLeft << 3);
        this.X1 = rotateLeft(i10, 1);
        int iRotateLeft3 = rotateLeft(i11, 7);
        this.X3 = iRotateLeft3;
        this.X0 = rotateLeft((iRotateLeft ^ this.X1) ^ iRotateLeft3, 5);
        this.X2 = rotateLeft((this.X3 ^ iRotateLeft2) ^ (this.X1 << 7), 22);
    }

    public abstract void decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11);

    public abstract void encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11);

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    public final void ib0(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i10;
        int i16 = (i14 | i15) ^ i13;
        int i17 = i12 ^ i16;
        int i18 = i15 ^ i17;
        this.X2 = i18;
        int i19 = (i15 & i13) ^ i14;
        int i20 = (i18 & i19) ^ i16;
        this.X1 = i20;
        int i21 = (i10 & i16) ^ (i20 | i17);
        this.X3 = i21;
        this.X0 = i21 ^ (i19 ^ i17);
    }

    public final void ib1(int i10, int i11, int i12, int i13) {
        int i14 = i13 ^ i11;
        int i15 = i10 ^ (i11 & i14);
        int i16 = i14 ^ i15;
        int i17 = i12 ^ i16;
        this.X3 = i17;
        int i18 = i11 ^ (i14 & i15);
        int i19 = i15 ^ (i17 | i18);
        this.X1 = i19;
        int i20 = ~i19;
        int i21 = i18 ^ i17;
        this.X0 = i20 ^ i21;
        this.X2 = (i20 | i21) ^ i16;
    }

    public final void ib2(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i13;
        int i15 = ~i14;
        int i16 = i10 ^ i12;
        int i17 = i12 ^ i14;
        int i18 = (i11 & i17) ^ i16;
        this.X0 = i18;
        int i19 = (((i10 | i15) ^ i13) | i16) ^ i14;
        this.X3 = i19;
        int i20 = ~i17;
        int i21 = i19 | i18;
        this.X1 = i20 ^ i21;
        this.X2 = (i21 ^ i16) ^ (i13 & i20);
    }

    public final void ib3(int i10, int i11, int i12, int i13) {
        int i14 = i10 | i11;
        int i15 = i11 ^ i12;
        int i16 = i10 ^ (i11 & i15);
        int i17 = i12 ^ i16;
        int i18 = i13 | i16;
        int i19 = i15 ^ i18;
        this.X0 = i19;
        int i20 = (i18 | i15) ^ i13;
        this.X2 = i17 ^ i20;
        int i21 = i14 ^ i20;
        int i22 = i16 ^ (i19 & i21);
        this.X3 = i22;
        this.X1 = i22 ^ (i21 ^ i19);
    }

    public final void ib4(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ ((i12 | i13) & i10);
        int i15 = i12 ^ (i10 & i14);
        int i16 = i13 ^ i15;
        this.X1 = i16;
        int i17 = ~i10;
        int i18 = (i15 & i16) ^ i14;
        this.X3 = i18;
        int i19 = i13 ^ (i16 | i17);
        this.X0 = i18 ^ i19;
        this.X2 = (i17 ^ i16) ^ (i14 & i19);
    }

    public final void ib5(int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = (i11 & i14) ^ i13;
        int i16 = i10 & i15;
        int i17 = (i11 ^ i14) ^ i16;
        this.X3 = i17;
        int i18 = i17 | i11;
        this.X1 = i15 ^ (i10 & i18);
        int i19 = i13 | i10;
        this.X0 = (i14 ^ i18) ^ i19;
        this.X2 = ((i10 ^ i12) | i16) ^ (i11 & i19);
    }

    public final void ib6(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i12 ^ i15;
        int i17 = (i12 | i14) ^ i13;
        this.X1 = i16 ^ i17;
        int i18 = i15 ^ (i16 & i17);
        int i19 = i17 ^ (i11 | i18);
        this.X3 = i19;
        int i20 = i11 | i19;
        this.X0 = i18 ^ i20;
        this.X2 = (i13 & i14) ^ (i20 ^ i16);
    }

    public final void ib7(int i10, int i11, int i12, int i13) {
        int i14 = (i10 & i11) | i12;
        int i15 = (i10 | i11) & i13;
        int i16 = i14 ^ i15;
        this.X3 = i16;
        int i17 = i11 ^ i15;
        int i18 = ((i16 ^ (~i13)) | i17) ^ i10;
        this.X1 = i18;
        int i19 = (i17 ^ i12) ^ (i13 | i18);
        this.X0 = i19;
        this.X2 = ((i10 & i16) ^ i19) ^ (i14 ^ i18);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z10;
            this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
        }
    }

    public final void inverseLT() {
        int iRotateRight = (rotateRight(this.X2, 22) ^ this.X3) ^ (this.X1 << 7);
        int iRotateRight2 = rotateRight(this.X0, 5) ^ this.X1;
        int i10 = this.X3;
        int i11 = iRotateRight2 ^ i10;
        int iRotateRight3 = rotateRight(i10, 7);
        int iRotateRight4 = rotateRight(this.X1, 1);
        this.X3 = (iRotateRight3 ^ iRotateRight) ^ (i11 << 3);
        this.X1 = (iRotateRight4 ^ i11) ^ iRotateRight;
        this.X2 = rotateRight(iRotateRight, 3);
        this.X0 = rotateRight(i11, 13);
    }

    public abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.bouncycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.wKey == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypting) {
            encryptBlock(bArr, i10, bArr2, i11);
            return 16;
        }
        decryptBlock(bArr, i10, bArr2, i11);
        return 16;
    }

    public final void sb0(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ i14;
        int i16 = i11 ^ i15;
        int i17 = (i13 & i10) ^ i16;
        this.X3 = i17;
        int i18 = i10 ^ (i11 & i14);
        this.X2 = (i12 | i18) ^ i16;
        int i19 = (i15 ^ i18) & i17;
        this.X1 = (~i15) ^ i19;
        this.X0 = (~i18) ^ i19;
    }

    public final void sb1(int i10, int i11, int i12, int i13) {
        int i14 = (~i10) ^ i11;
        int i15 = (i10 | i14) ^ i12;
        int i16 = i13 ^ i15;
        this.X2 = i16;
        int i17 = i11 ^ (i13 | i14);
        int i18 = i16 ^ i14;
        int i19 = (i15 & i17) ^ i18;
        this.X3 = i19;
        int i20 = i17 ^ i15;
        this.X1 = i19 ^ i20;
        this.X0 = i15 ^ (i20 & i18);
    }

    public final void sb2(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i11 ^ i13;
        int i16 = (i12 & i14) ^ i15;
        this.X0 = i16;
        int i17 = i12 ^ i14;
        int i18 = i11 & (i12 ^ i16);
        int i19 = i17 ^ i18;
        this.X3 = i19;
        int i20 = i10 ^ ((i18 | i13) & (i16 | i17));
        this.X2 = i20;
        this.X1 = (i20 ^ (i13 | i14)) ^ (i15 ^ i19);
    }

    public final void sb3(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i11;
        int i15 = i10 & i12;
        int i16 = i10 | i13;
        int i17 = i12 ^ i13;
        int i18 = i15 | (i14 & i16);
        int i19 = i17 ^ i18;
        this.X2 = i19;
        int i20 = (i16 ^ i11) ^ i18;
        int i21 = i14 ^ (i17 & i20);
        this.X0 = i21;
        int i22 = i21 & i19;
        this.X1 = i20 ^ i22;
        this.X3 = (i11 | i13) ^ (i17 ^ i22);
    }

    public final void sb4(int i10, int i11, int i12, int i13) {
        int i14 = i10 ^ i13;
        int i15 = i12 ^ (i13 & i14);
        int i16 = i11 | i15;
        this.X3 = i14 ^ i16;
        int i17 = ~i11;
        int i18 = (i14 | i17) ^ i15;
        this.X0 = i18;
        int i19 = i17 ^ i14;
        int i20 = (i16 & i19) ^ (i18 & i10);
        this.X2 = i20;
        this.X1 = (i10 ^ i15) ^ (i19 & i20);
    }

    public final void sb5(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i11;
        int i16 = i10 ^ i13;
        int i17 = (i12 ^ i14) ^ (i15 | i16);
        this.X0 = i17;
        int i18 = i13 & i17;
        int i19 = (i15 ^ i17) ^ i18;
        this.X1 = i19;
        int i20 = i16 ^ (i17 | i14);
        this.X2 = (i15 | i18) ^ i20;
        this.X3 = (i20 & i19) ^ (i11 ^ i18);
    }

    public final void sb6(int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = i10 ^ i13;
        int i16 = i11 ^ i15;
        int i17 = i12 ^ (i14 | i15);
        int i18 = i11 ^ i17;
        this.X1 = i18;
        int i19 = (i15 | i18) ^ i13;
        int i20 = (i17 & i19) ^ i16;
        this.X2 = i20;
        int i21 = i19 ^ i17;
        this.X0 = i20 ^ i21;
        this.X3 = (i21 & i16) ^ (~i17);
    }

    public final void sb7(int i10, int i11, int i12, int i13) {
        int i14 = i11 ^ i12;
        int i15 = (i12 & i14) ^ i13;
        int i16 = i10 ^ i15;
        int i17 = i11 ^ ((i13 | i14) & i16);
        this.X1 = i17;
        int i18 = (i10 & i16) ^ i14;
        this.X3 = i18;
        int i19 = (i17 | i15) ^ i16;
        int i20 = i15 ^ (i18 & i19);
        this.X2 = i20;
        this.X0 = (i18 & i20) ^ (~i19);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
