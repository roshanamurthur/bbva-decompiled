package org.bouncycastle.crypto.modes;

import androidx.appcompat.widget.g0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ChaCha20Poly1305 implements AEADCipher {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f88982l = new byte[15];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaCha7539Engine f88983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mac f88984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f88989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f88991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f88992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88993k;

    public ChaCha20Poly1305() {
        this(new Poly1305());
    }

    public static long d(int i10, long j10, long j11) {
        long j12 = i10;
        if (j10 - Long.MIN_VALUE <= (j11 - j12) - Long.MIN_VALUE) {
            return j10 + j12;
        }
        throw new IllegalStateException("Limit exceeded");
    }

    public final void a() {
        int i10 = this.f88992j;
        int i11 = 2;
        if (i10 != 1) {
            if (i10 == 2) {
                return;
            }
            if (i10 == 4) {
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            }
            i11 = 6;
            if (i10 != 5) {
                if (i10 != 6) {
                    throw new IllegalStateException();
                }
                return;
            }
        }
        this.f88992j = i11;
    }

    public final void b() {
        int i10;
        int i11 = this.f88992j;
        Mac mac = this.f88984b;
        byte[] bArr = f88982l;
        switch (i11) {
            case 1:
            case 2:
                int i12 = ((int) this.f88990h) & 15;
                if (i12 != 0) {
                    mac.update(bArr, 0, 16 - i12);
                }
                i10 = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                int i13 = ((int) this.f88990h) & 15;
                if (i13 != 0) {
                    mac.update(bArr, 0, 16 - i13);
                }
                i10 = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        this.f88992j = i10;
    }

    public final void c(int i10) {
        int i11 = ((int) this.f88991i) & 15;
        Mac mac = this.f88984b;
        if (i11 != 0) {
            mac.update(f88982l, 0, 16 - i11);
        }
        byte[] bArr = new byte[16];
        Pack.longToLittleEndian(this.f88990h, bArr, 0);
        Pack.longToLittleEndian(this.f88991i, bArr, 8);
        mac.update(bArr, 0, 16);
        mac.doFinal(this.f88988f, 0);
        this.f88992j = i10;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) throws InvalidCipherTextException, IllegalStateException {
        int i11;
        if (bArr == null) {
            throw new NullPointerException("'out' cannot be null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        b();
        byte[] bArr2 = this.f88988f;
        Arrays.clear(bArr2);
        int i12 = this.f88992j;
        Mac mac = this.f88984b;
        if (i12 == 3) {
            int i13 = this.f88993k;
            i11 = i13 + 16;
            if (i10 > bArr.length - i11) {
                throw new OutputLengthException("Output buffer too short");
            }
            if (i13 > 0) {
                e(0, i13, this.f88987e, i10, bArr);
                mac.update(bArr, i10, this.f88993k);
            }
            c(4);
            System.arraycopy(bArr2, 0, bArr, i10 + this.f88993k, 16);
        } else {
            if (i12 != 7) {
                throw new IllegalStateException();
            }
            int i14 = this.f88993k;
            if (i14 < 16) {
                throw new InvalidCipherTextException("data too short");
            }
            i11 = i14 - 16;
            if (i10 > bArr.length - i11) {
                throw new OutputLengthException("Output buffer too short");
            }
            byte[] bArr3 = this.f88987e;
            if (i11 > 0) {
                mac.update(bArr3, 0, i11);
                e(0, i11, this.f88987e, i10, bArr);
            }
            c(8);
            if (!Arrays.constantTimeAreEqual(16, bArr2, 0, bArr3, i11)) {
                throw new InvalidCipherTextException("mac check in ChaCha20Poly1305 failed");
            }
        }
        f(false, true);
        return i11;
    }

    public final void e(int i10, int i11, byte[] bArr, int i12, byte[] bArr2) {
        if (i12 > bArr2.length - i11) {
            throw new OutputLengthException("Output buffer too short");
        }
        this.f88983a.processBytes(bArr, i10, i11, bArr2, i12);
        this.f88991i = d(i11, this.f88991i, 274877906880L);
    }

    public final void f(boolean z10, boolean z11) {
        Arrays.clear(this.f88987e);
        if (z10) {
            Arrays.clear(this.f88988f);
        }
        this.f88990h = 0L;
        this.f88991i = 0L;
        this.f88993k = 0;
        switch (this.f88992j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.f88992j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.f88992j = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z11) {
            this.f88983a.reset();
        }
        byte[] bArr = new byte[64];
        try {
            this.f88983a.processBytes(bArr, 0, 64, bArr, 0);
            this.f88984b.init(new KeyParameter(bArr, 0, 32));
            Arrays.clear(bArr);
            byte[] bArr2 = this.f88989g;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } catch (Throwable th2) {
            Arrays.clear(bArr);
            throw th2;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return Arrays.clone(this.f88988f);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int iMax = Math.max(0, i10) + this.f88993k;
        int i11 = this.f88992j;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return iMax + 16;
        }
        if (i11 == 5 || i11 == 6 || i11 == 7) {
            return Math.max(0, iMax - 16);
        }
        throw new IllegalStateException("state=" + this.f88992j);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int iMax = Math.max(0, i10) + this.f88993k;
        int i11 = this.f88992j;
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalStateException();
            }
            iMax = Math.max(0, iMax - 16);
        }
        return iMax - (iMax % 64);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        ParametersWithIV parametersWithIV;
        KeyParameter key;
        byte[] iv;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            int macSize = aEADParameters.getMacSize();
            if (128 != macSize) {
                throw new IllegalArgumentException(g0.c("Invalid value for MAC size: ", macSize));
            }
            key = aEADParameters.getKey();
            iv = aEADParameters.getNonce();
            parametersWithIV = new ParametersWithIV(key, iv);
            this.f88989g = aEADParameters.getAssociatedText();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
            }
            parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv = parametersWithIV.getIV();
            this.f88989g = null;
        }
        if (key == null) {
            if (this.f88992j == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != key.getKey().length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (iv == null || 12 != iv.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        int i10 = this.f88992j;
        byte[] bArr = this.f88985c;
        byte[] bArr2 = this.f88986d;
        if (i10 != 0 && z10 && Arrays.areEqual(bArr2, iv) && (key == null || Arrays.areEqual(bArr, key.getKey()))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (key != null) {
            System.arraycopy(key.getKey(), 0, bArr, 0, 32);
        }
        System.arraycopy(iv, 0, bArr2, 0, 12);
        this.f88983a.init(true, parametersWithIV);
        this.f88992j = z10 ? 1 : 5;
        f(true, false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        a();
        this.f88990h = d(1, this.f88990h, -1L);
        this.f88984b.update(b10);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i10 > bArr.length - i11) {
            throw new DataLengthException("Input buffer too short");
        }
        a();
        if (i11 > 0) {
            this.f88990h = d(i11, this.f88990h, -1L);
            this.f88984b.update(bArr, i10, i11);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) throws DataLengthException {
        b();
        int i11 = this.f88992j;
        Mac mac = this.f88984b;
        if (i11 == 3) {
            byte[] bArr2 = this.f88987e;
            int i12 = this.f88993k;
            bArr2[i12] = b10;
            int i13 = i12 + 1;
            this.f88993k = i13;
            if (i13 != 64) {
                return 0;
            }
            e(0, 64, bArr2, i10, bArr);
            mac.update(bArr, i10, 64);
            this.f88993k = 0;
            return 64;
        }
        if (i11 != 7) {
            throw new IllegalStateException();
        }
        int i14 = this.f88993k;
        byte[] bArr3 = this.f88987e;
        bArr3[i14] = b10;
        int i15 = i14 + 1;
        this.f88993k = i15;
        if (i15 != bArr3.length) {
            return 0;
        }
        mac.update(bArr3, 0, 64);
        e(0, 64, this.f88987e, i10, bArr);
        System.arraycopy(bArr3, 64, bArr3, 0, 16);
        this.f88993k = 16;
        return 64;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
        int i13;
        int i14 = i10;
        int i15 = i11;
        if (bArr == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i14 > bArr.length - i15) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        b();
        int i16 = this.f88992j;
        Mac mac = this.f88984b;
        byte[] bArr3 = this.f88987e;
        if (i16 == 3) {
            if (this.f88993k == 0) {
                i13 = 0;
                break;
            }
            while (true) {
                if (i15 <= 0) {
                    i13 = 0;
                    break;
                }
                i15--;
                byte[] bArr4 = this.f88987e;
                int i17 = this.f88993k;
                int i18 = i14 + 1;
                bArr4[i17] = bArr[i14];
                int i19 = i17 + 1;
                this.f88993k = i19;
                if (i19 == 64) {
                    e(0, 64, bArr4, i12, bArr2);
                    mac.update(bArr2, i12, 64);
                    this.f88993k = 0;
                    i14 = i18;
                    i13 = 64;
                    break;
                }
                i14 = i18;
            }
            while (i15 >= 64) {
                int i20 = i12 + i13;
                e(i14, 64, bArr, i20, bArr2);
                mac.update(bArr2, i20, 64);
                i14 += 64;
                i15 -= 64;
                i13 += 64;
            }
            if (i15 > 0) {
                System.arraycopy(bArr, i14, bArr3, 0, i15);
                this.f88993k = i15;
            }
        } else {
            if (i16 != 7) {
                throw new IllegalStateException();
            }
            i13 = 0;
            for (int i21 = 0; i21 < i15; i21++) {
                int i22 = this.f88993k;
                bArr3[i22] = bArr[i14 + i21];
                int i23 = i22 + 1;
                this.f88993k = i23;
                if (i23 == bArr3.length) {
                    mac.update(bArr3, 0, 64);
                    e(0, 64, this.f88987e, i12 + i13, bArr2);
                    System.arraycopy(bArr3, 64, bArr3, 0, 16);
                    this.f88993k = 16;
                    i13 += 64;
                }
            }
        }
        return i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        f(true, true);
    }

    public ChaCha20Poly1305(Mac mac) {
        this.f88985c = new byte[32];
        this.f88986d = new byte[12];
        this.f88987e = new byte[80];
        this.f88988f = new byte[16];
        this.f88992j = 0;
        if (mac == null) {
            throw new NullPointerException("'poly1305' cannot be null");
        }
        if (16 != mac.getMacSize()) {
            throw new IllegalArgumentException("'poly1305' must be a 128-bit MAC");
        }
        this.f88983a = new ChaCha7539Engine();
        this.f88984b = mac;
    }
}
