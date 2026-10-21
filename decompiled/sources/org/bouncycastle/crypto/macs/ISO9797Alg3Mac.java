package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes4.dex */
public class ISO9797Alg3Mac implements Mac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CBCBlockCipher f88882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockCipherPadding f88883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public KeyParameter f88885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public KeyParameter f88886h;

    public ISO9797Alg3Mac(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        CBCBlockCipher cBCBlockCipher = this.f88882d;
        int blockSize = cBCBlockCipher.getBlockSize();
        byte[] bArr2 = this.f88880b;
        byte[] bArr3 = this.f88879a;
        BlockCipherPadding blockCipherPadding = this.f88883e;
        if (blockCipherPadding == null) {
            while (true) {
                int i11 = this.f88881c;
                if (i11 >= blockSize) {
                    break;
                }
                bArr2[i11] = 0;
                this.f88881c = i11 + 1;
            }
        } else {
            if (this.f88881c == blockSize) {
                cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
                this.f88881c = 0;
            }
            blockCipherPadding.addPadding(bArr2, this.f88881c);
        }
        cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
        DESEngine dESEngine = new DESEngine();
        dESEngine.init(false, this.f88885g);
        dESEngine.processBlock(bArr3, 0, bArr3, 0);
        dESEngine.init(true, this.f88886h);
        dESEngine.processBlock(bArr3, 0, bArr3, 0);
        int i12 = this.f88884f;
        System.arraycopy(bArr3, 0, bArr, i10, i12);
        reset();
        return i12;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.f88884f;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        reset();
        boolean z10 = cipherParameters instanceof KeyParameter;
        if (!z10 && !(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] key = (z10 ? (KeyParameter) cipherParameters : (KeyParameter) ((ParametersWithIV) cipherParameters).getParameters()).getKey();
        if (key.length == 16) {
            keyParameter = new KeyParameter(key, 0, 8);
            this.f88885g = new KeyParameter(key, 8, 8);
            this.f88886h = keyParameter;
        } else {
            if (key.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            keyParameter = new KeyParameter(key, 0, 8);
            this.f88885g = new KeyParameter(key, 8, 8);
            this.f88886h = new KeyParameter(key, 16, 8);
        }
        boolean z11 = cipherParameters instanceof ParametersWithIV;
        CBCBlockCipher cBCBlockCipher = this.f88882d;
        if (z11) {
            cBCBlockCipher.init(true, new ParametersWithIV(keyParameter, ((ParametersWithIV) cipherParameters).getIV()));
        } else {
            cBCBlockCipher.init(true, keyParameter);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88880b;
            if (i10 >= bArr.length) {
                this.f88881c = 0;
                this.f88882d.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        int i10 = this.f88881c;
        byte[] bArr = this.f88880b;
        if (i10 == bArr.length) {
            this.f88882d.processBlock(bArr, 0, this.f88879a, 0);
            this.f88881c = 0;
        }
        int i11 = this.f88881c;
        this.f88881c = i11 + 1;
        bArr[i11] = b10;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i10) {
        this(blockCipher, i10, null);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        CBCBlockCipher cBCBlockCipher = this.f88882d;
        int blockSize = cBCBlockCipher.getBlockSize();
        int i12 = this.f88881c;
        int i13 = blockSize - i12;
        byte[] bArr2 = this.f88880b;
        if (i11 > i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i13);
            byte[] bArr3 = this.f88879a;
            cBCBlockCipher.processBlock(bArr2, 0, bArr3, 0);
            this.f88881c = 0;
            i11 -= i13;
            i10 += i13;
            while (i11 > blockSize) {
                cBCBlockCipher.processBlock(bArr, i10, bArr3, 0);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, bArr2, this.f88881c, i11);
        this.f88881c += i11;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, int i10, BlockCipherPadding blockCipherPadding) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!(blockCipher instanceof DESEngine)) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.f88882d = new CBCBlockCipher(blockCipher);
        this.f88883e = blockCipherPadding;
        this.f88884f = i10 / 8;
        this.f88879a = new byte[blockCipher.getBlockSize()];
        this.f88880b = new byte[blockCipher.getBlockSize()];
        this.f88881c = 0;
    }

    public ISO9797Alg3Mac(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        this(blockCipher, blockCipher.getBlockSize() * 8, blockCipherPadding);
    }
}
