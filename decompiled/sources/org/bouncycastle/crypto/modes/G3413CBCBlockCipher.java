package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class G3413CBCBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f89008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f89009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipher f89010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f89011f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f89012g;

    public G3413CBCBlockCipher(BlockCipher blockCipher) {
        this.f89007b = blockCipher.getBlockSize();
        this.f89010e = blockCipher;
    }

    public final void a(byte[] bArr) {
        byte[] bArr2 = this.f89008c;
        int i10 = this.f89006a - this.f89007b;
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr2, bArr2.length - i10, bArr3, 0, i10);
        System.arraycopy(bArr3, 0, this.f89008c, 0, i10);
        System.arraycopy(bArr, 0, this.f89008c, i10, this.f89006a - i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89010e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89007b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89012g = z10;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89010e;
        int i10 = this.f89007b;
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length < i10) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            int length = iv.length;
            this.f89006a = length;
            this.f89008c = new byte[length];
            this.f89009d = new byte[length];
            byte[] bArrClone = Arrays.clone(iv);
            this.f89009d = bArrClone;
            System.arraycopy(bArrClone, 0, this.f89008c, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(z10, cipherParameters);
            }
        } else {
            this.f89006a = i10;
            byte[] bArr = new byte[i10];
            this.f89008c = bArr;
            byte[] bArr2 = new byte[i10];
            this.f89009d = bArr2;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher.init(z10, cipherParameters);
            }
        }
        this.f89011f = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        boolean z10 = this.f89012g;
        BlockCipher blockCipher = this.f89010e;
        int length = this.f89007b;
        if (z10) {
            byte[] bArrCopyOf = Arrays.copyOf(this.f89008c, length);
            if (bArr.length < length + i10) {
                length = bArr.length - i10;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i10, bArr3, 0, length);
            byte[] bArr4 = new byte[length];
            for (int i12 = 0; i12 < length; i12++) {
                bArr4[i12] = (byte) (bArr3[i12] ^ bArrCopyOf[i12]);
            }
            byte[] bArr5 = new byte[length];
            blockCipher.processBlock(bArr4, 0, bArr5, 0);
            System.arraycopy(bArr5, 0, bArr2, i11, length);
            if (bArr2.length > i11 + length) {
                a(bArr5);
            }
        } else {
            byte[] bArrCopyOf2 = Arrays.copyOf(this.f89008c, length);
            if (bArr.length < length + i10) {
                length = bArr.length - i10;
            }
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, i10, bArr6, 0, length);
            byte[] bArr7 = new byte[length];
            blockCipher.processBlock(bArr6, 0, bArr7, 0);
            byte[] bArr8 = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                bArr8[i13] = (byte) (bArr7[i13] ^ bArrCopyOf2[i13]);
            }
            System.arraycopy(bArr8, 0, bArr2, i11, length);
            if (bArr2.length > i11 + length) {
                a(bArr6);
            }
        }
        return length;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.f89011f) {
            byte[] bArr = this.f89009d;
            System.arraycopy(bArr, 0, this.f89008c, 0, bArr.length);
            this.f89010e.reset();
        }
    }
}
