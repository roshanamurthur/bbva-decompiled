package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class G3413OFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f89036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f89038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89039i;

    public G3413OFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.f89039i = false;
        int blockSize = blockCipher.getBlockSize();
        this.f89033c = blockSize;
        this.f89037g = blockCipher;
        this.f89036f = new byte[blockSize];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.f89038h;
        int i11 = this.f89033c;
        byte[] bArr = this.f89036f;
        if (i10 == 0) {
            this.f89037g.processBlock(Arrays.copyOf(this.f89034d, i11), 0, bArr, 0);
        }
        int i12 = this.f89038h;
        byte b11 = (byte) (b10 ^ bArr[i12]);
        int i13 = i12 + 1;
        this.f89038h = i13;
        if (i13 == getBlockSize()) {
            this.f89038h = 0;
            byte[] bArr2 = this.f89034d;
            int i14 = this.f89032b - i11;
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, bArr2.length - i14, bArr3, 0, i14);
            System.arraycopy(bArr3, 0, this.f89034d, 0, i14);
            System.arraycopy(bArr, 0, this.f89034d, i14, this.f89032b - i14);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89037g.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89033c;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89037g;
        int i10 = this.f89033c;
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length < i10) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            int length = iv.length;
            this.f89032b = length;
            this.f89034d = new byte[length];
            this.f89035e = new byte[length];
            byte[] bArrClone = Arrays.clone(iv);
            this.f89035e = bArrClone;
            System.arraycopy(bArrClone, 0, this.f89034d, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher.init(true, parametersWithIV.getParameters());
            }
        } else {
            int i11 = i10 * 2;
            this.f89032b = i11;
            byte[] bArr = new byte[i11];
            this.f89034d = bArr;
            byte[] bArr2 = new byte[i11];
            this.f89035e = bArr2;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher.init(true, cipherParameters);
            }
        }
        this.f89039i = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f89033c, bArr2, i11);
        return this.f89033c;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.f89039i) {
            byte[] bArr = this.f89035e;
            System.arraycopy(bArr, 0, this.f89034d, 0, bArr.length);
            Arrays.clear(this.f89036f);
            this.f89038h = 0;
            this.f89037g.reset();
        }
    }
}
