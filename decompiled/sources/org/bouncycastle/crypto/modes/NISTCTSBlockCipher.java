package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes5.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89114b;

    public NISTCTSBlockCipher(int i10, BlockCipher blockCipher) {
        this.f89113a = i10;
        this.cipher = new CBCBlockCipher(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.f89114b = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (this.bufOff + i10 > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i11 = this.bufOff;
        int i12 = i11 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        boolean z10 = this.forEncryption;
        int i13 = this.f89113a;
        if (z10) {
            if (i11 < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (i11 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                if (i13 == 2 || i13 == 3) {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i12);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (i13 == 2 && i12 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i10, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i10 + blockSize, i12);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i10, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i10 + blockSize, i12);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10, i12);
                    System.arraycopy(this.buf, this.bufOff - i12, bArr3, 0, i12);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i10 + i12, blockSize);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        } else {
            if (i11 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i11 > blockSize) {
                if (i13 == 3 || (i13 == 2 && (this.buf.length - i11) % blockSize != 0)) {
                    BlockCipher blockCipher = this.cipher;
                    if (blockCipher instanceof CBCBlockCipher) {
                        ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(this.buf, 0, bArr2, 0);
                    }
                    for (int i14 = blockSize; i14 != this.bufOff; i14++) {
                        int i15 = i14 - blockSize;
                        bArr4[i15] = (byte) (bArr2[i15] ^ this.buf[i14]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i12);
                    this.cipher.processBlock(bArr2, 0, bArr, i10);
                } else {
                    ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i12 != blockSize) {
                        System.arraycopy(bArr4, i12, bArr2, i12, blockSize - i12);
                    }
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10, blockSize);
                    for (int i16 = 0; i16 != i12; i16++) {
                        bArr4[i16] = (byte) (bArr4[i16] ^ this.buf[i16]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i10 + blockSize, i12);
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        }
        int i17 = this.bufOff;
        reset();
        return i17;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        return i10 + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        return length == 0 ? i11 - bArr.length : i11 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int i11 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i10);
            byte[] bArr3 = this.buf;
            int i13 = this.f89114b;
            System.arraycopy(bArr3, i13, bArr3, 0, i13);
            this.bufOff = i13;
            i12 = iProcessBlock;
        }
        byte[] bArr4 = this.buf;
        int i14 = this.bufOff;
        this.bufOff = i14 + 1;
        bArr4[i14] = b10;
        return i12;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i11);
        if (updateOutputSize > 0 && updateOutputSize + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i13 = this.bufOff;
        int i14 = length - i13;
        int i15 = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i12);
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            this.bufOff = blockSize;
            i11 -= i14;
            i10 += i14;
            while (i11 > blockSize) {
                System.arraycopy(bArr, i10, this.buf, this.bufOff, blockSize);
                iProcessBlock += this.cipher.processBlock(this.buf, 0, bArr2, i12 + iProcessBlock);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i11 -= blockSize;
                i10 += blockSize;
            }
            i15 = iProcessBlock;
        }
        System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
        this.bufOff += i11;
        return i15;
    }
}
