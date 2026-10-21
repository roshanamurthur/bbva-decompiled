package org.bouncycastle.crypto.modes;

import androidx.appcompat.widget.g0;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class GCMBlockCipher implements AEADBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockCipher f89045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GCMMultiplier f89046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BasicGCMExponentiator f89047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f89049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f89051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f89052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f89053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f89054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f89055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f89056l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f89057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f89058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f89059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f89060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f89061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f89062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f89063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f89064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f89065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f89066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f89067x;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    public final void a() {
        if (this.f89049e) {
            return;
        }
        if (!this.f89048d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    public final void b(byte[] bArr) {
        int i10 = this.f89061r;
        if (i10 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f89061r = i10 - 1;
        byte[] bArr2 = this.f89060q;
        int i11 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i11;
        int i12 = (i11 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i12;
        int i13 = (i12 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i13;
        bArr2[12] = (byte) ((i13 >>> 8) + (bArr2[12] & 255));
        this.f89045a.processBlock(bArr2, 0, bArr, 0);
    }

    public final void c() {
        if (this.f89066w > 0) {
            System.arraycopy(this.f89058o, 0, this.f89059p, 0, 16);
            this.f89067x = this.f89066w;
        }
        int i10 = this.f89065v;
        if (i10 > 0) {
            byte[] bArr = this.f89059p;
            GCMUtil.xor(bArr, this.f89064u, 0, i10);
            this.f89046b.multiplyH(bArr);
            this.f89067x += (long) this.f89065v;
        }
        if (this.f89067x > 0) {
            System.arraycopy(this.f89059p, 0, this.f89057n, 0, 16);
        }
    }

    public final void d(byte[] bArr, int i10, int i11, byte[] bArr2) {
        if (bArr2.length - i11 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.f89063t == 0) {
            c();
        }
        byte[] bArr3 = new byte[16];
        b(bArr3);
        if (this.f89048d) {
            GCMUtil.xor(bArr3, bArr, i10);
            byte[] bArr4 = this.f89057n;
            GCMUtil.xor(bArr4, bArr3);
            this.f89046b.multiplyH(bArr4);
            System.arraycopy(bArr3, 0, bArr2, i11, 16);
        } else {
            byte[] bArr5 = this.f89057n;
            GCMUtil.xor(bArr5, bArr, i10);
            this.f89046b.multiplyH(bArr5);
            GCMUtil.xor(bArr3, 0, bArr, i10, bArr2, i11);
        }
        this.f89063t += 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        a();
        if (this.f89063t == 0) {
            c();
        }
        int i11 = this.f89062s;
        if (!this.f89048d) {
            int i12 = this.f89050f;
            if (i11 < i12) {
                throw new InvalidCipherTextException("data too short");
            }
            i11 -= i12;
            if (bArr.length - i10 < i11) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i10 < this.f89050f + i11) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (i11 > 0) {
            byte[] bArr2 = this.f89056l;
            byte[] bArr3 = new byte[16];
            b(bArr3);
            if (this.f89048d) {
                GCMUtil.xor(bArr2, 0, bArr3, 0, i11);
                byte[] bArr4 = this.f89057n;
                GCMUtil.xor(bArr4, bArr2, 0, i11);
                this.f89046b.multiplyH(bArr4);
            } else {
                byte[] bArr5 = this.f89057n;
                GCMUtil.xor(bArr5, bArr2, 0, i11);
                this.f89046b.multiplyH(bArr5);
                GCMUtil.xor(bArr2, 0, bArr3, 0, i11);
            }
            System.arraycopy(bArr2, 0, bArr, i10, i11);
            this.f89063t += (long) i11;
        }
        long j10 = this.f89066w;
        int i13 = this.f89065v;
        long j11 = j10 + ((long) i13);
        this.f89066w = j11;
        if (j11 > this.f89067x) {
            if (i13 > 0) {
                byte[] bArr6 = this.f89058o;
                GCMUtil.xor(bArr6, this.f89064u, 0, i13);
                this.f89046b.multiplyH(bArr6);
            }
            if (this.f89067x > 0) {
                GCMUtil.xor(this.f89058o, this.f89059p);
            }
            long j12 = ((this.f89063t * 8) + 127) >>> 7;
            byte[] bArr7 = new byte[16];
            if (this.f89047c == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                this.f89047c = basicGCMExponentiator;
                basicGCMExponentiator.init(this.f89054j);
            }
            this.f89047c.exponentiateX(j12, bArr7);
            GCMUtil.multiply(this.f89058o, bArr7);
            GCMUtil.xor(this.f89057n, this.f89058o);
        }
        byte[] bArr8 = new byte[16];
        Pack.longToBigEndian(this.f89066w * 8, bArr8, 0);
        Pack.longToBigEndian(this.f89063t * 8, bArr8, 8);
        byte[] bArr9 = this.f89057n;
        GCMUtil.xor(bArr9, bArr8);
        this.f89046b.multiplyH(bArr9);
        byte[] bArr10 = new byte[16];
        this.f89045a.processBlock(this.f89055k, 0, bArr10, 0);
        GCMUtil.xor(bArr10, this.f89057n);
        int i14 = this.f89050f;
        byte[] bArr11 = new byte[i14];
        this.m = bArr11;
        System.arraycopy(bArr10, 0, bArr11, 0, i14);
        if (this.f89048d) {
            System.arraycopy(this.m, 0, bArr, i10 + this.f89062s, this.f89050f);
            i11 += this.f89050f;
        } else {
            int i15 = this.f89050f;
            byte[] bArr12 = new byte[i15];
            System.arraycopy(this.f89056l, i11, bArr12, 0, i15);
            if (!Arrays.constantTimeAreEqual(this.m, bArr12)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        e(false);
        return i11;
    }

    public final void e(boolean z10) {
        this.f89045a.reset();
        this.f89057n = new byte[16];
        this.f89058o = new byte[16];
        this.f89059p = new byte[16];
        this.f89064u = new byte[16];
        this.f89065v = 0;
        this.f89066w = 0L;
        this.f89067x = 0L;
        this.f89060q = Arrays.clone(this.f89055k);
        this.f89061r = -2;
        this.f89062s = 0;
        this.f89063t = 0L;
        byte[] bArr = this.f89056l;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z10) {
            this.m = null;
        }
        if (this.f89048d) {
            this.f89049e = false;
            return;
        }
        byte[] bArr2 = this.f89053i;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.f89045a.getAlgorithmName() + "/GCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.m;
        return bArr == null ? new byte[this.f89050f] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f89062s;
        if (this.f89048d) {
            return i11 + this.f89050f;
        }
        int i12 = this.f89050f;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.f89045a;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f89062s;
        if (!this.f89048d) {
            int i12 = this.f89050f;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        KeyParameter key;
        byte[] bArr;
        this.f89048d = z10;
        this.m = null;
        this.f89049e = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.f89053i = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException(g0.c("Invalid value for MAC size: ", macSize));
            }
            this.f89050f = macSize / 8;
            key = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.f89053i = null;
            this.f89050f = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.f89056l = new byte[z10 ? 16 : this.f89050f + 16];
        if (iv == null || iv.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z10 && (bArr = this.f89052h) != null && Arrays.areEqual(bArr, iv)) {
            if (key == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.f89051g;
            if (bArr2 != null && Arrays.areEqual(bArr2, key.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.f89052h = iv;
        if (key != null) {
            this.f89051g = key.getKey();
        }
        if (key != null) {
            BlockCipher blockCipher = this.f89045a;
            blockCipher.init(true, key);
            byte[] bArr3 = new byte[16];
            this.f89054j = bArr3;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            this.f89046b.init(this.f89054j);
            this.f89047c = null;
        } else if (this.f89054j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f89055k = bArr4;
        byte[] bArr5 = this.f89052h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f89055k[15] = 1;
        } else {
            int length = bArr5.length;
            for (int i10 = 0; i10 < length; i10 += 16) {
                GCMUtil.xor(bArr4, bArr5, i10, Math.min(length - i10, 16));
                this.f89046b.multiplyH(bArr4);
            }
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(((long) this.f89052h.length) * 8, bArr6, 8);
            byte[] bArr7 = this.f89055k;
            GCMUtil.xor(bArr7, bArr6);
            this.f89046b.multiplyH(bArr7);
        }
        this.f89057n = new byte[16];
        this.f89058o = new byte[16];
        this.f89059p = new byte[16];
        this.f89064u = new byte[16];
        this.f89065v = 0;
        this.f89066w = 0L;
        this.f89067x = 0L;
        this.f89060q = Arrays.clone(this.f89055k);
        this.f89061r = -2;
        this.f89062s = 0;
        this.f89063t = 0L;
        byte[] bArr8 = this.f89053i;
        if (bArr8 != null) {
            processAADBytes(bArr8, 0, bArr8.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        a();
        byte[] bArr = this.f89064u;
        int i10 = this.f89065v;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f89065v = i11;
        if (i11 == 16) {
            byte[] bArr2 = this.f89058o;
            GCMUtil.xor(bArr2, bArr);
            this.f89046b.multiplyH(bArr2);
            this.f89065v = 0;
            this.f89066w += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        a();
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f89064u;
            int i13 = this.f89065v;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f89065v = i14;
            if (i14 == 16) {
                byte[] bArr3 = this.f89058o;
                GCMUtil.xor(bArr3, bArr2);
                this.f89046b.multiplyH(bArr3);
                this.f89065v = 0;
                this.f89066w += 16;
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        a();
        byte[] bArr2 = this.f89056l;
        int i11 = this.f89062s;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.f89062s = i12;
        if (i12 != bArr2.length) {
            return 0;
        }
        d(bArr2, 0, i10, bArr);
        if (this.f89048d) {
            this.f89062s = 0;
        } else {
            byte[] bArr3 = this.f89056l;
            System.arraycopy(bArr3, 16, bArr3, 0, this.f89050f);
            this.f89062s = this.f89050f;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        int i13;
        a();
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("Input buffer too short");
        }
        if (this.f89048d) {
            if (this.f89062s == 0) {
                i13 = 0;
                break;
            }
            while (true) {
                if (i11 <= 0) {
                    i13 = 0;
                    break;
                }
                i11--;
                byte[] bArr3 = this.f89056l;
                int i14 = this.f89062s;
                int i15 = i10 + 1;
                bArr3[i14] = bArr[i10];
                int i16 = i14 + 1;
                this.f89062s = i16;
                if (i16 == 16) {
                    d(bArr3, 0, i12, bArr2);
                    this.f89062s = 0;
                    i13 = 16;
                    i10 = i15;
                    break;
                }
                i10 = i15;
            }
            while (i11 >= 16) {
                d(bArr, i10, i12 + i13, bArr2);
                i10 += 16;
                i11 -= 16;
                i13 += 16;
            }
            if (i11 > 0) {
                System.arraycopy(bArr, i10, this.f89056l, 0, i11);
                this.f89062s = i11;
            }
        } else {
            i13 = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                byte[] bArr4 = this.f89056l;
                int i18 = this.f89062s;
                bArr4[i18] = bArr[i10 + i17];
                int i19 = i18 + 1;
                this.f89062s = i19;
                if (i19 == bArr4.length) {
                    d(bArr4, 0, i12 + i13, bArr2);
                    byte[] bArr5 = this.f89056l;
                    System.arraycopy(bArr5, 16, bArr5, 0, this.f89050f);
                    this.f89062s = this.f89050f;
                    i13 += 16;
                }
            }
        }
        return i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        e(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.f89045a = blockCipher;
        this.f89046b = gCMMultiplier;
    }
}
