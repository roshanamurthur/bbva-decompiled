package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class G3413CTRBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f89025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f89030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89031i;

    public G3413CTRBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.f89030h;
        int i11 = this.f89024b;
        if (i10 == 0) {
            byte[] bArr = this.f89025c;
            byte[] bArr2 = new byte[bArr.length];
            this.f89029g.processBlock(bArr, 0, bArr2, 0);
            this.f89027e = Arrays.copyOf(bArr2, i11);
        }
        byte[] bArr3 = this.f89027e;
        int i12 = this.f89030h;
        byte b11 = (byte) (b10 ^ bArr3[i12]);
        int i13 = i12 + 1;
        this.f89030h = i13;
        if (i13 == i11) {
            this.f89030h = 0;
            byte[] bArr4 = this.f89025c;
            int length = bArr4.length - 1;
            bArr4[length] = (byte) (bArr4[length] + 1);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89029g.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89024b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        int i10 = this.f89024b;
        int i11 = this.f89028f;
        BlockCipher blockCipher = this.f89029g;
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f89026d = new byte[i11 / 2];
            this.f89025c = new byte[i11];
            this.f89027e = new byte[i10];
            byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
            this.f89026d = bArrClone;
            if (bArrClone.length != i11 / 2) {
                throw new IllegalArgumentException("Parameter IV length must be == blockSize/2");
            }
            System.arraycopy(bArrClone, 0, this.f89025c, 0, bArrClone.length);
            for (int length = this.f89026d.length; length < i11; length++) {
                this.f89025c[length] = 0;
            }
            if (parametersWithIV.getParameters() != null) {
                blockCipher.init(true, parametersWithIV.getParameters());
            }
        } else {
            this.f89026d = new byte[i11 / 2];
            this.f89025c = new byte[i11];
            this.f89027e = new byte[i10];
            if (cipherParameters != null) {
                blockCipher.init(true, cipherParameters);
            }
        }
        this.f89031i = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, this.f89024b, bArr2, i11);
        return this.f89024b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.f89031i) {
            byte[] bArr = this.f89026d;
            System.arraycopy(bArr, 0, this.f89025c, 0, bArr.length);
            for (int length = this.f89026d.length; length < this.f89028f; length++) {
                this.f89025c[length] = 0;
            }
            this.f89030h = 0;
            this.f89029g.reset();
        }
    }

    public G3413CTRBlockCipher(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.f89030h = 0;
        if (i10 < 0 || i10 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (blockCipher.getBlockSize() * 8));
        }
        this.f89029g = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f89028f = blockSize;
        this.f89024b = i10 / 8;
        this.f89025c = new byte[blockSize];
    }
}
