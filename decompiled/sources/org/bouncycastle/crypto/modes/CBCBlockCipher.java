package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class CBCBlockCipher implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f88958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f88959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipher f88961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88962f;

    public CBCBlockCipher(BlockCipher blockCipher) {
        this.f88961e = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.f88960d = blockSize;
        this.f88957a = new byte[blockSize];
        this.f88958b = new byte[blockSize];
        this.f88959c = new byte[blockSize];
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.f88961e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88961e.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.f88961e;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        boolean z11 = this.f88962f;
        this.f88962f = z10;
        boolean z12 = cipherParameters instanceof ParametersWithIV;
        BlockCipher blockCipher = this.f88961e;
        if (z12) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != this.f88960d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(iv, 0, this.f88957a, 0, iv.length);
            reset();
            if (parametersWithIV.getParameters() == null) {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                if (z11 != z10) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        blockCipher.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        boolean z10 = this.f88962f;
        BlockCipher blockCipher = this.f88961e;
        int i12 = this.f88960d;
        if (z10) {
            if (i10 + i12 > bArr.length) {
                throw new DataLengthException("input buffer too short");
            }
            for (int i13 = 0; i13 < i12; i13++) {
                byte[] bArr3 = this.f88958b;
                bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i10 + i13]);
            }
            int iProcessBlock = blockCipher.processBlock(this.f88958b, 0, bArr2, i11);
            byte[] bArr4 = this.f88958b;
            System.arraycopy(bArr2, i11, bArr4, 0, bArr4.length);
            return iProcessBlock;
        }
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(bArr, i10, this.f88959c, 0, i12);
        int iProcessBlock2 = blockCipher.processBlock(bArr, i10, bArr2, i11);
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i11 + i14;
            bArr2[i15] = (byte) (bArr2[i15] ^ this.f88958b[i14]);
        }
        byte[] bArr5 = this.f88958b;
        this.f88958b = this.f88959c;
        this.f88959c = bArr5;
        return iProcessBlock2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.f88958b;
        byte[] bArr2 = this.f88957a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f88959c, (byte) 0);
        this.f88961e.reset();
    }
}
