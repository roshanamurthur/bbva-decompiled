package bc.org.bouncycastle.crypto.paddings;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.BufferedBlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.InvalidCipherTextException;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.l4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.p0;

/* JADX INFO: loaded from: classes2.dex */
public class PaddedBufferedBlockCipher extends BufferedBlockCipher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p0 f24984g;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, p0 p0Var) {
        this.f24903d = blockCipher;
        this.f24984g = p0Var;
        this.f24900a = new byte[blockCipher.getBlockSize()];
        this.f24901b = 0;
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        int iProcessBlock;
        int blockSize = this.f24903d.getBlockSize();
        boolean z10 = this.f24902c;
        p0 p0Var = this.f24984g;
        if (z10) {
            if (this.f24901b != blockSize) {
                iProcessBlock = 0;
            } else {
                if ((blockSize * 2) + i10 > bArr.length) {
                    reset();
                    throw new h4("output buffer too short");
                }
                iProcessBlock = this.f24903d.processBlock(this.f24900a, 0, bArr, i10);
                this.f24901b = 0;
            }
            p0Var.addPadding(this.f24900a, this.f24901b);
            int iProcessBlock2 = this.f24903d.processBlock(this.f24900a, 0, bArr, i10 + iProcessBlock) + iProcessBlock;
            reset();
            return iProcessBlock2;
        }
        if (this.f24901b != blockSize) {
            reset();
            throw new DataLengthException("last block incomplete in decryption");
        }
        BlockCipher blockCipher = this.f24903d;
        byte[] bArr2 = this.f24900a;
        int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        this.f24901b = 0;
        try {
            int iPadCount = iProcessBlock3 - p0Var.padCount(this.f24900a);
            System.arraycopy(this.f24900a, 0, bArr, i10, iPadCount);
            return iPadCount;
        } finally {
            reset();
        }
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        int length;
        int i11 = i10 + this.f24901b;
        byte[] bArr = this.f24900a;
        int length2 = i11 % bArr.length;
        if (length2 != 0) {
            i11 -= length2;
            length = bArr.length;
        } else {
            if (!this.f24902c) {
                return i11;
            }
            length = bArr.length;
        }
        return i11 + length;
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f24901b;
        byte[] bArr = this.f24900a;
        int length = i11 % bArr.length;
        return length == 0 ? Math.max(0, i11 - bArr.length) : i11 - length;
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f24902c = z10;
        reset();
        boolean z11 = cipherParameters instanceof l4;
        p0 p0Var = this.f24984g;
        if (!z11) {
            p0Var.init(null);
            this.f24903d.init(z10, cipherParameters);
        } else {
            l4 l4Var = (l4) cipherParameters;
            p0Var.init(l4Var.b());
            this.f24903d.init(z10, l4Var.a());
        }
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        int i11 = this.f24901b;
        byte[] bArr2 = this.f24900a;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int iProcessBlock = this.f24903d.processBlock(bArr2, 0, bArr, i10);
            this.f24901b = 0;
            i12 = iProcessBlock;
        }
        byte[] bArr3 = this.f24900a;
        int i13 = this.f24901b;
        this.f24901b = i13 + 1;
        bArr3[i13] = b10;
        return i12;
    }

    @Override // bc.org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i11);
        if (updateOutputSize > 0 && updateOutputSize + i12 > bArr2.length) {
            throw new h4("output buffer too short");
        }
        byte[] bArr3 = this.f24900a;
        int length = bArr3.length;
        int i13 = this.f24901b;
        int i14 = length - i13;
        int iProcessBlock = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int iProcessBlock2 = this.f24903d.processBlock(this.f24900a, 0, bArr2, i12);
            this.f24901b = 0;
            i11 -= i14;
            i10 += i14;
            iProcessBlock = iProcessBlock2;
            while (i11 > this.f24900a.length) {
                iProcessBlock += this.f24903d.processBlock(bArr, i10, bArr2, i12 + iProcessBlock);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, this.f24900a, this.f24901b, i11);
        this.f24901b += i11;
        return iProcessBlock;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
}
