package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

/* JADX INFO: loaded from: classes4.dex */
public class CBCBlockCipherMac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CBCBlockCipher f88828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipherPadding f88829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88830f;

    public CBCBlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        CBCBlockCipher cBCBlockCipher = this.f88828d;
        int blockSize = cBCBlockCipher.getBlockSize();
        byte[] bArr2 = this.f88825a;
        byte[] bArr3 = this.f88826b;
        BlockCipherPadding blockCipherPadding = this.f88829e;
        if (blockCipherPadding == null) {
            while (true) {
                int i11 = this.f88827c;
                if (i11 >= blockSize) {
                    break;
                }
                bArr3[i11] = 0;
                this.f88827c = i11 + 1;
            }
        } else {
            if (this.f88827c == blockSize) {
                cBCBlockCipher.processBlock(bArr3, 0, bArr2, 0);
                this.f88827c = 0;
            }
            blockCipherPadding.addPadding(bArr3, this.f88827c);
        }
        cBCBlockCipher.processBlock(bArr3, 0, bArr2, 0);
        int i12 = this.f88830f;
        System.arraycopy(bArr2, 0, bArr, i10, i12);
        reset();
        return i12;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.f88828d.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88830f;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.f88828d.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88826b;
            if (i10 >= bArr.length) {
                this.f88827c = 0;
                this.f88828d.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88827c;
        byte[] bArr = this.f88826b;
        if (i10 == bArr.length) {
            this.f88828d.processBlock(bArr, 0, this.f88825a, 0);
            this.f88827c = 0;
        }
        int i11 = this.f88827c;
        this.f88827c = i11 + 1;
        bArr[i11] = b10;
    }

    public CBCBlockCipherMac(BlockCipher blockCipher, int i10) {
        this(blockCipher, i10, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        CBCBlockCipher cBCBlockCipher = this.f88828d;
        int blockSize = cBCBlockCipher.getBlockSize();
        int i12 = this.f88827c;
        int i13 = blockSize - i12;
        byte[] bArr2 = this.f88826b;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            byte[] bArr3 = this.f88825a;
            cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
            this.f88827c = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                cBCBlockCipher.processBlock(bArr, i10, bArr3, 0);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88827c, i11);
        this.f88827c += i11;
    }

    public CBCBlockCipherMac(BlockCipher blockCipher, int i10, BlockCipherPadding blockCipherPadding) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f88828d = new CBCBlockCipher(blockCipher);
        this.f88829e = blockCipherPadding;
        this.f88830f = i10 / 8;
        this.f88825a = new byte[blockCipher.getBlockSize()];
        this.f88826b = new byte[blockCipher.getBlockSize()];
        this.f88827c = 0;
    }

    public CBCBlockCipherMac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2, blockCipherPadding);
    }
}
