package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class G3413CFBBlockCipher extends StreamBlockCipher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f89016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f89017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockCipher f89018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f89020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f89021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f89022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f89023l;

    public G3413CFBBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.f89023l;
        int i11 = this.f89013b;
        if (i10 == 0) {
            byte[] bArrCopyOf = Arrays.copyOf(this.f89016e, this.f89015d);
            byte[] bArr = new byte[bArrCopyOf.length];
            this.f89018g.processBlock(bArrCopyOf, 0, bArr, 0);
            this.f89021j = Arrays.copyOf(bArr, i11);
        }
        byte[] bArr2 = this.f89021j;
        int i12 = this.f89023l;
        byte b11 = (byte) (bArr2[i12] ^ b10);
        int i13 = i12 + 1;
        this.f89023l = i13;
        if (this.f89019h) {
            b10 = b11;
        }
        byte[] bArr3 = this.f89022k;
        bArr3[i12] = b10;
        if (i13 == getBlockSize()) {
            this.f89023l = 0;
            byte[] bArr4 = this.f89016e;
            int i14 = this.f89014c - i11;
            byte[] bArr5 = new byte[i14];
            System.arraycopy(bArr4, bArr4.length - i14, bArr5, 0, i14);
            System.arraycopy(bArr5, 0, this.f89016e, 0, i14);
            System.arraycopy(bArr3, 0, this.f89016e, i14, this.f89014c - i14);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f89018g.getAlgorithmName() + "/CFB" + (this.f89015d * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f89013b;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.f89019h = z10;
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f89018g;
        int i10 = this.f89015d;
        if (z11) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length < i10) {
                throw new IllegalArgumentException("Parameter m must blockSize <= m");
            }
            int length = iv.length;
            this.f89014c = length;
            this.f89016e = new byte[length];
            this.f89017f = new byte[length];
            byte[] bArrClone = Arrays.clone(iv);
            this.f89017f = bArrClone;
            System.arraycopy(bArrClone, 0, this.f89016e, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher.init(true, parametersWithIV.getParameters());
            }
        } else {
            int i11 = i10 * 2;
            this.f89014c = i11;
            byte[] bArr = new byte[i11];
            this.f89016e = bArr;
            byte[] bArr2 = new byte[i11];
            this.f89017f = bArr2;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher.init(true, cipherParameters);
            }
        }
        this.f89020i = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i10, getBlockSize(), bArr2, i11);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.f89023l = 0;
        Arrays.clear(this.f89022k);
        Arrays.clear(this.f89021j);
        if (this.f89020i) {
            byte[] bArr = this.f89017f;
            System.arraycopy(bArr, 0, this.f89016e, 0, bArr.length);
            this.f89018g.reset();
        }
    }

    public G3413CFBBlockCipher(BlockCipher blockCipher, int i10) {
        super(blockCipher);
        this.f89020i = false;
        if (i10 < 0 || i10 > blockCipher.getBlockSize() * 8) {
            throw new IllegalArgumentException("Parameter bitBlockSize must be in range 0 < bitBlockSize <= " + (blockCipher.getBlockSize() * 8));
        }
        this.f89015d = blockCipher.getBlockSize();
        this.f89018g = blockCipher;
        this.f89013b = i10 / 8;
        this.f89022k = new byte[getBlockSize()];
    }
}
