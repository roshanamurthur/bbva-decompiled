package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class KCTRBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f89093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89095g;

    public KCTRBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.f89095g = blockCipher;
        this.f89090b = new byte[blockCipher.getBlockSize()];
        this.f89091c = new byte[blockCipher.getBlockSize()];
        this.f89092d = new byte[blockCipher.getBlockSize()];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.f89093e;
        byte[] bArr = this.f89091c;
        byte[] bArr2 = this.f89092d;
        if (i10 != 0) {
            int i11 = i10 + 1;
            this.f89093e = i11;
            byte b11 = (byte) (b10 ^ bArr2[i10]);
            if (i11 == bArr.length) {
                this.f89093e = 0;
            }
            return b11;
        }
        int i12 = 0;
        while (i12 < bArr.length) {
            int i13 = i12 + 1;
            byte b12 = (byte) (bArr[i12] + 1);
            bArr[i12] = b12;
            if (b12 != 0) {
                break;
            }
            i12 = i13;
        }
        this.f89095g.processBlock(bArr, 0, bArr2, 0);
        int i14 = this.f89093e;
        this.f89093e = i14 + 1;
        return (byte) (b10 ^ bArr2[i14]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89095g.getAlgorithmName() + "/KCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89095g.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89094f = true;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("invalid parameter passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        byte[] bArr = this.f89090b;
        int length = bArr.length - iv.length;
        Arrays.fill(bArr, (byte) 0);
        System.arraycopy(iv, 0, bArr, length, iv.length);
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters != null) {
            this.f89095g.init(true, parameters);
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (bArr.length - i10 < getBlockSize()) {
            throw new DataLengthException("input buffer too short");
        }
        if (bArr2.length - i11 < getBlockSize()) {
            throw new OutputLengthException("output buffer too short");
        }
        processBytes(bArr, i10, getBlockSize(), bArr2, i11);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        boolean z10 = this.f89094f;
        BlockCipher blockCipher = this.f89095g;
        if (z10) {
            blockCipher.processBlock(this.f89090b, 0, this.f89091c, 0);
        }
        blockCipher.reset();
        this.f89093e = 0;
    }
}
