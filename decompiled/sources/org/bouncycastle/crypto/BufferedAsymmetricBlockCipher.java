package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class BufferedAsymmetricBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricBlockCipher f87851a;
    protected byte[] buf;
    protected int bufOff;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.f87851a = asymmetricBlockCipher;
    }

    public byte[] doFinal() throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.f87851a.processBlock(this.buf, 0, this.bufOff);
        reset();
        return bArrProcessBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.f87851a.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.f87851a.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.f87851a;
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        reset();
        AsymmetricBlockCipher asymmetricBlockCipher = this.f87851a;
        asymmetricBlockCipher.init(z10, cipherParameters);
        this.buf = new byte[asymmetricBlockCipher.getInputBlockSize() + (z10 ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b10) {
        int i10 = this.bufOff;
        byte[] bArr = this.buf;
        if (i10 >= bArr.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        this.bufOff = i10 + 1;
        bArr[i10] = b10;
    }

    public void processBytes(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i12 = this.bufOff;
        int i13 = i12 + i11;
        byte[] bArr2 = this.buf;
        if (i13 > bArr2.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        this.bufOff += i11;
    }

    public void reset() {
        if (this.buf != null) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i10 >= bArr.length) {
                    break;
                }
                bArr[i10] = 0;
                i10++;
            }
        }
        this.bufOff = 0;
    }
}
