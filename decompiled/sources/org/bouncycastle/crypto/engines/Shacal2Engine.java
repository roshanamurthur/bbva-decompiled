package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class Shacal2Engine implements BlockCipher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f88603c = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88604a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f88605b = null;

    public static void a(byte[] bArr, int i10, int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
            int i13 = i10 + 3;
            int i14 = ((bArr[i10 + 2] & 255) << 8) | i12;
            i10 += 4;
            iArr[i11] = i14 | (bArr[i13] & 255);
        }
    }

    public static void b(byte[] bArr, int i10, int[] iArr) {
        for (int i11 : iArr) {
            bArr[i10] = (byte) (i11 >>> 24);
            bArr[i10 + 1] = (byte) (i11 >>> 16);
            int i12 = i10 + 3;
            bArr[i10 + 2] = (byte) (i11 >>> 8);
            i10 += 4;
            bArr[i12] = (byte) i11;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Shacal2";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        }
        this.f88604a = z10;
        this.f88605b = new int[64];
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (this.f88605b == null) {
            throw new IllegalStateException("Shacal2 not initialised");
        }
        if (i10 + 32 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 32 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.f88604a;
        int[] iArr = f88603c;
        char c10 = 1;
        if (z10) {
            int[] iArr2 = new int[8];
            a(bArr, i10, iArr2);
            for (int i12 = 0; i12 < 64; i12++) {
                int i13 = iArr2[4];
                int i14 = iArr2[5];
                int i15 = ~i13;
                int i16 = iArr2[6];
                int i17 = ((((i13 >>> 6) | (i13 << (-6))) ^ ((i13 >>> 11) | (i13 << (-11)))) ^ ((i13 >>> 25) | (i13 << (-25)))) + ((i13 & i14) ^ (i15 & i16)) + iArr2[7] + iArr[i12] + this.f88605b[i12];
                iArr2[7] = i16;
                iArr2[6] = i14;
                iArr2[5] = i13;
                iArr2[4] = iArr2[3] + i17;
                int i18 = iArr2[2];
                iArr2[3] = i18;
                int i19 = iArr2[1];
                iArr2[2] = i19;
                int i20 = iArr2[0];
                iArr2[1] = i20;
                iArr2[0] = i17 + ((((i20 >>> 2) | (i20 << (-2))) ^ ((i20 >>> 13) | (i20 << (-13)))) ^ ((i20 >>> 22) | (i20 << (-22)))) + (((i20 & i19) ^ (i20 & i18)) ^ (i18 & i19));
            }
            b(bArr2, i11, iArr2);
            return 32;
        }
        int[] iArr3 = new int[8];
        a(bArr, i10, iArr3);
        int i21 = 63;
        while (i21 > -1) {
            int i22 = iArr3[0];
            int i23 = iArr3[c10];
            int i24 = iArr3[2];
            int i25 = iArr3[3];
            int i26 = (i22 - ((((i23 >>> 2) | (i23 << (-2))) ^ ((i23 >>> 13) | (i23 << (-13)))) ^ ((i23 >>> 22) | (i23 << (-22))))) - (((i23 & i24) ^ (i23 & i25)) ^ (i24 & i25));
            iArr3[0] = i23;
            iArr3[c10] = i24;
            iArr3[2] = i25;
            iArr3[3] = iArr3[4] - i26;
            int i27 = iArr3[5];
            iArr3[4] = i27;
            int i28 = iArr3[6];
            iArr3[5] = i28;
            int i29 = iArr3[7];
            iArr3[6] = i29;
            iArr3[7] = (((i26 - iArr[i21]) - this.f88605b[i21]) - ((((i27 >>> 6) | (i27 << (-6))) ^ ((i27 >>> 11) | (i27 << (-11)))) ^ ((i27 >>> 25) | (i27 << (-25))))) - (((~i27) & i29) ^ (i27 & i28));
            i21--;
            c10 = 1;
        }
        b(bArr2, i11, iArr3);
        return 32;
    }

    public void setKey(byte[] bArr) {
        if (bArr.length != 0 && bArr.length <= 64) {
            if (bArr.length >= 16 && bArr.length % 8 == 0) {
                int[] iArr = this.f88605b;
                int i10 = 0;
                for (int i11 = 0; i11 < bArr.length / 4; i11++) {
                    int i12 = i10 + 3;
                    int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
                    i10 += 4;
                    iArr[i11] = i13 | (bArr[i12] & 255);
                }
                for (int i14 = 16; i14 < 64; i14++) {
                    int[] iArr2 = this.f88605b;
                    int i15 = iArr2[i14 - 2];
                    int i16 = ((i15 >>> 10) ^ (((i15 >>> 17) | (i15 << (-17))) ^ ((i15 >>> 19) | (i15 << (-19))))) + iArr2[i14 - 7];
                    int i17 = iArr2[i14 - 15];
                    iArr2[i14] = i16 + ((i17 >>> 3) ^ (((i17 >>> 7) | (i17 << (-7))) ^ ((i17 >>> 18) | (i17 << (-18))))) + iArr2[i14 - 16];
                }
                return;
            }
        }
        throw new IllegalArgumentException("Shacal2-key must be 16 - 64 bytes and multiple of 8");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
