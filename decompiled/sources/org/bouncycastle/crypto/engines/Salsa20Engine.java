package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f88595g = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88600e;
    protected int[] engineState;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88601f;
    protected int rounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f88602x;

    public Salsa20Engine() {
        this(20);
    }

    public static int rotl(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    public static void salsaCore(int i10, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i10 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        boolean z10 = false;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = 7;
        int i19 = iArr[7];
        int i20 = iArr[8];
        int i21 = 9;
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = 13;
        int i27 = iArr[13];
        int i28 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i28;
        int iRotl3 = i27;
        int iRotl4 = i25;
        int iRotl5 = i24;
        int iRotl6 = i23;
        int iRotl7 = i22;
        int i29 = i20;
        int iRotl8 = i19;
        int iRotl9 = i17;
        int iRotl10 = i16;
        int i30 = i15;
        int i31 = i14;
        int iRotl11 = i13;
        int iRotl12 = i12;
        int i32 = i11;
        int i33 = i10;
        while (i33 > 0) {
            int iRotl13 = rotl(i32 + iRotl4, i18) ^ i30;
            int iRotl14 = i29 ^ rotl(iRotl13 + i32, i21);
            int iRotl15 = iRotl4 ^ rotl(iRotl14 + iRotl13, i26);
            int iRotl16 = rotl(iRotl15 + iRotl14, 18) ^ i32;
            int iRotl17 = iRotl7 ^ rotl(iRotl10 + iRotl12, i18);
            int iRotl18 = iRotl3 ^ rotl(iRotl17 + iRotl10, i21);
            int iRotl19 = iRotl12 ^ rotl(iRotl18 + iRotl17, i26);
            int iRotl20 = rotl(iRotl19 + iRotl18, 18) ^ iRotl10;
            int iRotl21 = iRotl2 ^ rotl(iRotl6 + iRotl9, 7);
            int iRotl22 = iRotl11 ^ rotl(iRotl21 + iRotl6, 9);
            int iRotl23 = iRotl9 ^ rotl(iRotl22 + iRotl21, 13);
            int iRotl24 = iRotl6 ^ rotl(iRotl23 + iRotl22, 18);
            int iRotl25 = i31 ^ rotl(iRotl + iRotl5, 7);
            int iRotl26 = iRotl8 ^ rotl(iRotl25 + iRotl, 9);
            int i34 = i33;
            int iRotl27 = iRotl5 ^ rotl(iRotl26 + iRotl25, 13);
            int iRotl28 = iRotl ^ rotl(iRotl27 + iRotl26, 18);
            iRotl12 = iRotl19 ^ rotl(iRotl16 + iRotl25, 7);
            iRotl11 = iRotl22 ^ rotl(iRotl12 + iRotl16, 9);
            int iRotl29 = iRotl25 ^ rotl(iRotl11 + iRotl12, 13);
            int iRotl30 = iRotl16 ^ rotl(iRotl29 + iRotl11, 18);
            iRotl9 = iRotl23 ^ rotl(iRotl20 + iRotl13, 7);
            iRotl8 = iRotl26 ^ rotl(iRotl9 + iRotl20, 9);
            int iRotl31 = rotl(iRotl8 + iRotl9, 13) ^ iRotl13;
            iRotl10 = iRotl20 ^ rotl(iRotl31 + iRotl8, 18);
            iRotl5 = iRotl27 ^ rotl(iRotl24 + iRotl17, 7);
            int iRotl32 = rotl(iRotl5 + iRotl24, 9) ^ iRotl14;
            iRotl7 = iRotl17 ^ rotl(iRotl32 + iRotl5, 13);
            iRotl6 = iRotl24 ^ rotl(iRotl7 + iRotl32, 18);
            iRotl4 = iRotl15 ^ rotl(iRotl28 + iRotl21, 7);
            iRotl3 = iRotl18 ^ rotl(iRotl4 + iRotl28, 9);
            iRotl2 = iRotl21 ^ rotl(iRotl3 + iRotl4, 13);
            iRotl = iRotl28 ^ rotl(iRotl2 + iRotl3, 18);
            i31 = iRotl29;
            i29 = iRotl32;
            i32 = iRotl30;
            i30 = iRotl31;
            z10 = false;
            i26 = 13;
            i21 = 9;
            i18 = 7;
            i33 = i34 - 2;
        }
        boolean z11 = z10;
        iArr2[z11 ? 1 : 0] = i32 + iArr[z11 ? 1 : 0];
        iArr2[1] = iRotl12 + iArr[1];
        iArr2[2] = iRotl11 + iArr[2];
        iArr2[3] = i31 + iArr[3];
        iArr2[4] = i30 + iArr[4];
        iArr2[5] = iRotl10 + iArr[5];
        iArr2[6] = iRotl9 + iArr[6];
        iArr2[7] = iRotl8 + iArr[7];
        iArr2[8] = i29 + iArr[8];
        iArr2[9] = iRotl7 + iArr[9];
        iArr2[10] = iRotl6 + iArr[10];
        iArr2[11] = iRotl5 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[8] + 1;
        iArr[8] = i10;
        if (i10 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f88602x);
        Pack.intToLittleEndian(this.f88602x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & 4294967295L);
    }

    public int getNonceSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.f88596a);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.f88598c) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            setKey(((KeyParameter) parameters).getKey(), iv);
        }
        reset();
        this.f88598c = true;
    }

    public void packTauOrSigma(int i10, int[] iArr, int i11) {
        int i12 = (i10 - 16) / 4;
        int[] iArr2 = f88595g;
        iArr[i11] = iArr2[i12];
        iArr[i11 + 1] = iArr2[i12 + 1];
        iArr[i11 + 2] = iArr2[i12 + 2];
        iArr[i11 + 3] = iArr2[i12 + 3];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f88598c) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i13 = this.f88599d + i11;
        this.f88599d = i13;
        if (i13 < i11 && i13 >= 0) {
            int i14 = this.f88600e + 1;
            this.f88600e = i14;
            if (i14 == 0) {
                int i15 = this.f88601f + 1;
                this.f88601f = i15;
                if ((i15 & 32) != 0) {
                    throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
                }
            }
        }
        for (int i16 = 0; i16 < i11; i16++) {
            int i17 = this.f88596a;
            byte[] bArr3 = this.f88597b;
            bArr2[i16 + i12] = (byte) (bArr3[i17] ^ bArr[i16 + i10]);
            int i18 = (i17 + 1) & 63;
            this.f88596a = i18;
            if (i18 == 0) {
                advanceCounter();
                generateKeyStream(bArr3);
            }
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.f88596a = 0;
        this.f88599d = 0;
        this.f88600e = 0;
        this.f88601f = 0;
        resetCounter();
        generateKeyStream(this.f88597b);
    }

    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i10 = iArr[8];
        if (i10 == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = i10 - 1;
        iArr[8] = i11;
        if (i11 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        int i10 = this.f88599d + 1;
        this.f88599d = i10;
        if (i10 == 0) {
            int i11 = this.f88600e + 1;
            this.f88600e = i11;
            if (i11 == 0) {
                int i12 = this.f88601f + 1;
                this.f88601f = i12;
                if ((i12 & 32) != 0) {
                    throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
                }
            }
        }
        int i13 = this.f88596a;
        byte[] bArr = this.f88597b;
        byte b11 = (byte) (b10 ^ bArr[i13]);
        int i14 = (i13 + 1) & 63;
        this.f88596a = i14;
        if (i14 == 0) {
            advanceCounter();
            generateKeyStream(bArr);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = f88595g;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 >= 64) {
                long j12 = j10 / 64;
                advanceCounter(j12);
                j11 = j10 - (j12 * 64);
            } else {
                j11 = j10;
            }
            int i10 = this.f88596a;
            int i11 = (((int) j11) + i10) & 63;
            this.f88596a = i11;
            if (i11 < i10) {
                advanceCounter();
            }
        } else {
            long j13 = -j10;
            if (j13 >= 64) {
                long j14 = j13 / 64;
                retreatCounter(j14);
                j13 -= j14 * 64;
            }
            for (long j15 = 0; j15 < j13; j15++) {
                if (this.f88596a == 0) {
                    retreatCounter();
                }
                this.f88596a = (this.f88596a - 1) & 63;
            }
        }
        generateKeyStream(this.f88597b);
        return j10;
    }

    public Salsa20Engine(int i10) {
        this.f88596a = 0;
        this.engineState = new int[16];
        this.f88602x = new int[16];
        this.f88597b = new byte[64];
        this.f88598c = false;
        if (i10 <= 0 || (i10 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i10;
    }

    public void advanceCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i10;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[8];
        int i13 = i11 + i12;
        iArr2[8] = i13;
        if (i12 == 0 || i13 >= i12) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    public void retreatCounter(long j10) {
        int i10 = (int) (j10 >>> 32);
        int i11 = (int) j10;
        if (i10 != 0) {
            int[] iArr = this.engineState;
            int i12 = iArr[9];
            if ((((long) i12) & 4294967295L) < (((long) i10) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i12 - i10;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[8];
        if ((((long) i13) & 4294967295L) >= (4294967295L & ((long) i11))) {
            iArr2[8] = i13 - i11;
            return;
        }
        int i14 = iArr2[9];
        if (i14 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i14 - 1;
        iArr2[8] = i13 - i11;
    }
}
