package org.bouncycastle.crypto.paddings;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* JADX INFO: loaded from: classes5.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipherPadding f89181a;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iProcessBlock;
        int blockSize = this.cipher.getBlockSize();
        boolean z10 = this.forEncryption;
        BlockCipherPadding blockCipherPadding = this.f89181a;
        if (z10) {
            if (this.bufOff != blockSize) {
                iProcessBlock = 0;
            } else {
                if ((blockSize * 2) + i10 > bArr.length) {
                    reset();
                    throw new OutputLengthException("output buffer too short");
                }
                iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr, i10);
                this.bufOff = 0;
            }
            blockCipherPadding.addPadding(this.buf, this.bufOff);
            int iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr, i10 + iProcessBlock) + iProcessBlock;
            reset();
            return iProcessBlock2;
        }
        if (this.bufOff != blockSize) {
            reset();
            throw new DataLengthException("last block incomplete in decryption");
        }
        BlockCipher blockCipher = this.cipher;
        byte[] bArr2 = this.buf;
        int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        this.bufOff = 0;
        try {
            int iPadCount = iProcessBlock3 - blockCipherPadding.padCount(this.buf);
            System.arraycopy(this.buf, 0, bArr, i10, iPadCount);
            return iPadCount;
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        if (length != 0) {
            i11 -= length;
        } else if (!this.forEncryption) {
            return i11;
        }
        return i11 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        return length == 0 ? Math.max(0, i11 - bArr.length) : i11 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z10;
        reset();
        boolean z11 = cipherParameters instanceof ParametersWithRandom;
        BlockCipherPadding blockCipherPadding = this.f89181a;
        if (z11) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            blockCipherPadding.init(parametersWithRandom.getRandom());
            blockCipher = this.cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            blockCipherPadding.init(null);
            blockCipher = this.cipher;
        }
        blockCipher.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int i11 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i10);
            this.bufOff = 0;
            i12 = iProcessBlock;
        }
        byte[] bArr3 = this.buf;
        int i13 = this.bufOff;
        this.bufOff = i13 + 1;
        bArr3[i13] = b10;
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
        int iProcessBlock = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int iProcessBlock2 = this.cipher.processBlock(this.buf, 0, bArr2, i12);
            this.bufOff = 0;
            i11 -= i14;
            i10 += i14;
            iProcessBlock = iProcessBlock2;
            while (i11 > this.buf.length) {
                iProcessBlock += this.cipher.processBlock(bArr, i10, bArr2, i12 + iProcessBlock);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
        this.bufOff += i11;
        return iProcessBlock;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this.cipher = blockCipher;
        this.f89181a = blockCipherPadding;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }
}
