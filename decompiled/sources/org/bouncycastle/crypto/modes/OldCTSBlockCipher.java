package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: loaded from: classes5.dex */
public class OldCTSBlockCipher extends BufferedBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89142a;

    public OldCTSBlockCipher(BlockCipher blockCipher) {
        if ((blockCipher instanceof OFBBlockCipher) || (blockCipher instanceof CFBBlockCipher)) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89142a = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (this.bufOff + i10 > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i11 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            this.cipher.processBlock(this.buf, 0, bArr2, 0);
            int i12 = this.bufOff;
            if (i12 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            while (true) {
                byte[] bArr3 = this.buf;
                if (i12 == bArr3.length) {
                    break;
                }
                bArr3[i12] = bArr2[i12 - blockSize];
                i12++;
            }
            for (int i13 = blockSize; i13 != this.bufOff; i13++) {
                byte[] bArr4 = this.buf;
                bArr4[i13] = (byte) (bArr4[i13] ^ bArr2[i13 - blockSize]);
            }
            BlockCipher blockCipher = this.cipher;
            if (blockCipher instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, blockSize, bArr, i10);
            } else {
                blockCipher.processBlock(this.buf, blockSize, bArr, i10);
            }
            System.arraycopy(bArr2, 0, bArr, i10 + blockSize, i11);
        } else {
            byte[] bArr5 = new byte[blockSize];
            BlockCipher blockCipher2 = this.cipher;
            if (blockCipher2 instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher2).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
            } else {
                blockCipher2.processBlock(this.buf, 0, bArr2, 0);
            }
            for (int i14 = blockSize; i14 != this.bufOff; i14++) {
                int i15 = i14 - blockSize;
                bArr5[i15] = (byte) (bArr2[i15] ^ this.buf[i14]);
            }
            System.arraycopy(this.buf, blockSize, bArr2, 0, i11);
            this.cipher.processBlock(bArr2, 0, bArr, i10);
            System.arraycopy(bArr5, 0, bArr, i10 + blockSize, i11);
        }
        int i16 = this.bufOff;
        reset();
        return i16;
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
            int i13 = this.f89142a;
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
