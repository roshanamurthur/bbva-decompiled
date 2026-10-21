package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

/* JADX INFO: loaded from: classes4.dex */
public class BlockCipherMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CBCBlockCipher f88823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88824e;

    public BlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        CBCBlockCipher cBCBlockCipher = this.f88823d;
        int blockSize = cBCBlockCipher.getBlockSize();
        while (true) {
            int i11 = this.f88822c;
            byte[] bArr2 = this.f88821b;
            if (i11 >= blockSize) {
                byte[] bArr3 = this.f88820a;
                cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
                int i12 = this.f88824e;
                System.arraycopy(bArr3, 0, bArr, i10, i12);
                reset();
                return i12;
            }
            bArr2[i11] = 0;
            this.f88822c = i11 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88823d.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88824e;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.f88823d.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88821b;
            if (i10 >= bArr.length) {
                this.f88822c = 0;
                this.f88823d.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88822c;
        byte[] bArr = this.f88821b;
        if (i10 == bArr.length) {
            this.f88823d.processBlock(bArr, 0, this.f88820a, 0);
            this.f88822c = 0;
        }
        int i11 = this.f88822c;
        this.f88822c = i11 + 1;
        bArr[i11] = b10;
    }

    public BlockCipherMac(BlockCipher blockCipher, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f88823d = new CBCBlockCipher(blockCipher);
        this.f88824e = i10 / 8;
        this.f88820a = new byte[blockCipher.getBlockSize()];
        this.f88821b = new byte[blockCipher.getBlockSize()];
        this.f88822c = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        CBCBlockCipher cBCBlockCipher = this.f88823d;
        int blockSize = cBCBlockCipher.getBlockSize();
        int i12 = this.f88822c;
        int i13 = blockSize - i12;
        byte[] bArr2 = this.f88821b;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            byte[] bArr3 = this.f88820a;
            cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
            this.f88822c = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                cBCBlockCipher.processBlock(bArr, i10, bArr3, 0);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88822c, i11);
        this.f88822c += i11;
    }
}
