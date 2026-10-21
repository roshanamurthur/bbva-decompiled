package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes5.dex */
public class OFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89141g;

    public OFBBlockCipher(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.f89141g = blockCipher;
        this.f89140f = i10 / 8;
        this.f89137c = new byte[blockCipher.getBlockSize()];
        this.f89138d = new byte[blockCipher.getBlockSize()];
        this.f89139e = new byte[blockCipher.getBlockSize()];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) throws IllegalStateException, DataLengthException {
        int i10 = this.f89136b;
        byte[] bArr = this.f89139e;
        byte[] bArr2 = this.f89138d;
        if (i10 == 0) {
            this.f89141g.processBlock(bArr2, 0, bArr, 0);
        }
        int i11 = this.f89136b;
        int i12 = i11 + 1;
        this.f89136b = i12;
        byte b11 = (byte) (b10 ^ bArr[i11]);
        int i13 = this.f89140f;
        if (i12 == i13) {
            this.f89136b = 0;
            System.arraycopy(bArr2, i13, bArr2, 0, bArr2.length - i13);
            System.arraycopy(bArr, 0, bArr2, bArr2.length - i13, i13);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89141g.getAlgorithmName() + "/OFB" + (this.f89140f * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89140f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89141g;
        if (!z11) {
            reset();
            if (cipherParameters != null) {
                blockCipher.init(true, cipherParameters);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        int length = iv.length;
        byte[] bArr = this.f89137c;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            for (int i10 = 0; i10 < bArr.length - iv.length; i10++) {
                bArr[i10] = 0;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (parametersWithIV.getParameters() != null) {
            blockCipher.init(true, parametersWithIV.getParameters());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f89140f, bArr2, i11);
        return this.f89140f;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f89138d;
        byte[] bArr2 = this.f89137c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f89136b = 0;
        this.f89141g.reset();
    }
}
