package bc.org.bouncycastle.crypto;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.h4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h5;

/* JADX INFO: loaded from: classes2.dex */
public class BufferedBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected byte[] f24900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f24901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f24902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected BlockCipher f24903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f24904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f24905f;

    public BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        try {
            int i11 = this.f24901b;
            if (i10 + i11 > bArr.length) {
                throw new h4("output buffer too short for doFinal()");
            }
            int i12 = 0;
            if (i11 != 0) {
                if (!this.f24904e) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.f24903d;
                byte[] bArr2 = this.f24900a;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i13 = this.f24901b;
                this.f24901b = 0;
                System.arraycopy(this.f24900a, 0, bArr, i10, i13);
                i12 = i13;
            }
            reset();
            return i12;
        } catch (Throwable th2) {
            reset();
            throw th2;
        }
    }

    public int getBlockSize() {
        return this.f24903d.getBlockSize();
    }

    public int getOutputSize(int i10) {
        return i10 + this.f24901b;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.f24903d;
    }

    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f24901b;
        int length = (this.f24905f && this.f24902c) ? (i11 % this.f24900a.length) - (this.f24903d.getBlockSize() + 2) : i11 % this.f24900a.length;
        return i11 - length;
    }

    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f24902c = z10;
        reset();
        this.f24903d.init(z10, cipherParameters);
    }

    public int processByte(byte b10, byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = this.f24900a;
        int i11 = this.f24901b;
        int i12 = i11 + 1;
        this.f24901b = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int iProcessBlock = this.f24903d.processBlock(bArr2, 0, bArr, i10);
        this.f24901b = 0;
        return iProcessBlock;
    }

    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        int iProcessBlock;
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
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            iProcessBlock = this.f24903d.processBlock(this.f24900a, 0, bArr2, i12);
            this.f24901b = 0;
            i11 -= i14;
            i10 += i14;
            while (i11 > this.f24900a.length) {
                iProcessBlock += this.f24903d.processBlock(bArr, i10, bArr2, i12 + iProcessBlock);
                i11 -= blockSize;
                i10 += blockSize;
            }
        } else {
            iProcessBlock = 0;
        }
        System.arraycopy(bArr, i10, this.f24900a, this.f24901b, i11);
        int i15 = this.f24901b + i11;
        this.f24901b = i15;
        byte[] bArr4 = this.f24900a;
        if (i15 != bArr4.length) {
            return iProcessBlock;
        }
        int iProcessBlock2 = iProcessBlock + this.f24903d.processBlock(bArr4, 0, bArr2, i12 + iProcessBlock);
        this.f24901b = 0;
        return iProcessBlock2;
    }

    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f24900a;
            if (i10 >= bArr.length) {
                this.f24901b = 0;
                this.f24903d.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.f24903d = blockCipher;
        this.f24900a = new byte[blockCipher.getBlockSize()];
        boolean z10 = false;
        this.f24901b = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z11 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.f24905f = z11;
        if (z11 || (blockCipher instanceof h5)) {
            this.f24904e = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z10 = true;
        }
        this.f24904e = z10;
    }
}
