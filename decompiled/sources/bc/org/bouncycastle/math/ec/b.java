package bc.org.bouncycastle.math.ec;

import bc.org.bouncycastle.util.Arrays;
import com.noknok.android.client.asm.api.uaf.json.UAFPublicKeyFormat;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final short[] f25054q0 = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, UAFPublicKeyFormat.UAF_ALG_KEY_ECC_X962_DER, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f25055r0 = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long[] f25056p0;

    public b(int i10) {
        this.f25056p0 = new long[i10];
    }

    public static int b(long j10) {
        int i10;
        int i11 = 32;
        int i12 = (int) (j10 >>> 32);
        if (i12 == 0) {
            i12 = (int) j10;
            i11 = 0;
        }
        int i13 = i12 >>> 16;
        byte[] bArr = f25055r0;
        if (i13 == 0) {
            int i14 = i12 >>> 8;
            i10 = i14 == 0 ? bArr[i12] : bArr[i14] + 8;
        } else {
            int i15 = i12 >>> 24;
            i10 = i15 == 0 ? bArr[i13] + 16 : bArr[i15] + 24;
        }
        return i11 + i10;
    }

    public static void d(int i10, long[] jArr, int i11, long[] jArr2, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            jArr[i14] = jArr[i14] ^ jArr2[i11 + i13];
        }
    }

    public static void g(long[] jArr, int i10) {
        int i11 = i10 >>> 6;
        jArr[i11] = (1 << (i10 & 63)) ^ jArr[i11];
    }

    public static void h(long[] jArr, int i10, long j10) {
        int i11 = i10 >>> 6;
        int i12 = i10 & 63;
        if (i12 == 0) {
            jArr[i11] = jArr[i11] ^ j10;
            return;
        }
        jArr[i11] = jArr[i11] ^ (j10 << i12);
        long j11 = j10 >>> (64 - i12);
        if (j11 != 0) {
            int i13 = i11 + 1;
            jArr[i13] = j11 ^ jArr[i13];
        }
    }

    public static void i(long[] jArr, int i10, long j10, long[] jArr2) {
        if ((j10 & 1) != 0) {
            d(0, jArr2, 0, jArr, i10);
        }
        long j11 = j10;
        int i11 = 1;
        while (true) {
            long j12 = j11 >>> 1;
            if (j12 == 0) {
                return;
            }
            if ((j12 & 1) != 0) {
                long j13 = j(jArr2, 0, jArr, 0, i10, i11);
                if (j13 != 0) {
                    jArr2[i10] = j13 ^ jArr2[i10];
                }
            }
            i11++;
            j11 = j12;
        }
    }

    public static long j(long[] jArr, int i10, long[] jArr2, int i11, int i12, int i13) {
        int i14 = 64 - i13;
        long j10 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            long j11 = jArr2[i11 + i15];
            int i16 = i10 + i15;
            jArr[i16] = (j10 | (j11 << i13)) ^ jArr[i16];
            j10 = j11 >>> i14;
        }
        return j10;
    }

    public static int n(long[] jArr, int i10, int i11, int[] iArr) {
        int i12 = (i11 + 63) >>> 6;
        if (i10 < i12) {
            return i10;
        }
        int i13 = i10 << 6;
        int iMin = Math.min(i13, (i11 << 1) - 1);
        int i14 = i13 - iMin;
        while (i14 >= 64) {
            i10--;
            i14 -= 64;
        }
        int length = iArr.length;
        int i15 = iArr[length - 1];
        int i16 = length > 1 ? iArr[length - 2] : 0;
        int iMax = Math.max(i11, i15 + 64);
        int iMin2 = (Math.min(iMin - iMax, i11 - i16) + i14) >> 6;
        if (iMin2 > 1) {
            int i17 = i10 - iMin2;
            iMin = i17 << 6;
            int i18 = iMin - i11;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                p(jArr, jArr, i17, i10 - i17, iArr[length2] + i18);
            }
            p(jArr, jArr, i17, i10 - i17, i18);
            while (i10 > i17) {
                i10--;
                jArr[i10] = 0;
            }
        }
        if (iMin > iMax) {
            int i19 = iMax >>> 6;
            while (true) {
                i10--;
                if (i10 <= i19) {
                    break;
                }
                long j10 = jArr[i10];
                if (j10 != 0) {
                    jArr[i10] = 0;
                    int i20 = (i10 << 6) - i11;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        h(jArr, iArr[length3] + i20, j10);
                    }
                    h(jArr, i20, j10);
                }
            }
            int i21 = iMax & 63;
            long j11 = jArr[i19];
            long j12 = j11 >>> i21;
            if (j12 != 0) {
                jArr[i19] = j11 ^ (j12 << i21);
                int i22 = iMax - i11;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    h(jArr, iArr[length4] + i22, j12);
                }
                h(jArr, i22, j12);
            }
        } else {
            iMax = iMin;
        }
        if (iMax > i11) {
            while (true) {
                iMax--;
                if (iMax < i11) {
                    break;
                }
                if (((1 << (iMax & 63)) & jArr[iMax >>> 6]) != 0) {
                    g(jArr, iMax);
                    int i23 = iMax - i11;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        g(jArr, iArr[length5] + i23);
                    }
                    g(jArr, i23);
                }
            }
        }
        return i12;
    }

    public static long o(int i10) {
        short[] sArr = f25054q0;
        int i11 = sArr[i10 & 255] | (sArr[(i10 >>> 8) & 255] << 16);
        return (((long) i11) & 4294967295L) | ((((long) ((sArr[i10 >>> 24] << 16) | sArr[(i10 >>> 16) & 255])) & 4294967295L) << 32);
    }

    public static void p(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        int i13 = i12 >>> 6;
        int i14 = i12 & 63;
        if (i14 == 0) {
            d(i13, jArr, i10, jArr2, i11);
            return;
        }
        int i15 = i11;
        int i16 = i13 + 1;
        int i17 = 64 - i14;
        int i18 = 64 - i17;
        long j10 = 0;
        while (true) {
            i15--;
            if (i15 < 0) {
                jArr[i13] = jArr[i13] ^ j10;
                return;
            }
            long j11 = jArr2[i10 + i15];
            int i19 = i16 + i15;
            jArr[i19] = (j10 | (j11 >>> i17)) ^ jArr[i19];
            j10 = j11 << i18;
        }
    }

    public static void q(long[] jArr, int i10, long[] jArr2, int i11, int i12, int i13) {
        int i14 = 64 - i13;
        long j10 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            long j11 = jArr[i10 + i15];
            jArr2[i11 + i15] = j10 | (j11 << i13);
            j10 = j11 >>> i14;
        }
    }

    public final int a(int i10) {
        int i11 = (i10 + 62) >>> 6;
        while (i11 != 0) {
            i11--;
            long j10 = this.f25056p0[i11];
            if (j10 != 0) {
                return b(j10) + (i11 << 6);
            }
        }
        return 0;
    }

    public final b c(int i10, int[] iArr) {
        int iL = l();
        if (iL == 0) {
            throw new IllegalStateException();
        }
        int i11 = 1;
        if (iL == 1) {
            return this;
        }
        b bVar = (b) clone();
        int i12 = (i10 + 63) >>> 6;
        b bVar2 = new b(i12);
        long[] jArr = bVar2.f25056p0;
        g(jArr, i10);
        int i13 = i10 - i10;
        int length = iArr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            g(jArr, iArr[length] + i13);
        }
        g(jArr, i13);
        b bVar3 = new b(i12);
        bVar3.f25056p0[0] = 1;
        b bVar4 = new b(i12);
        int[] iArr2 = {iL, i10 + 1};
        b[] bVarArr = {bVar, bVar2};
        int[] iArr3 = {1, 0};
        b[] bVarArr2 = {bVar3, bVar4};
        int i14 = iArr2[1];
        int iA = iArr3[1];
        int i15 = i14 - iArr2[0];
        while (true) {
            if (i15 < 0) {
                i15 = -i15;
                iArr2[i11] = i14;
                iArr3[i11] = iA;
                int i16 = 1 - i11;
                int i17 = iArr2[i16];
                iA = iArr3[i16];
                i11 = i16;
                i14 = i17;
            }
            int i18 = 1 - i11;
            bVarArr[i11].f(bVarArr[i18], iArr2[i18], i15);
            int iA2 = bVarArr[i11].a(i14);
            if (iA2 == 0) {
                return bVarArr2[i18];
            }
            int i19 = iArr3[i18];
            bVarArr2[i11].f(bVarArr2[i18], i19, i15);
            int i20 = i19 + i15;
            if (i20 > iA) {
                iA = i20;
            } else if (i20 == iA) {
                iA = bVarArr2[i11].a(iA);
            }
            i15 += iA2 - i14;
            i14 = iA2;
        }
    }

    public final Object clone() {
        return new b(Arrays.clone(this.f25056p0));
    }

    public final void e(b bVar) {
        int iM = bVar.m();
        if (iM == 0) {
            return;
        }
        long[] jArr = this.f25056p0;
        if (iM > jArr.length) {
            long[] jArr2 = new long[iM];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, iM));
            this.f25056p0 = jArr2;
        }
        d(0, this.f25056p0, 0, bVar.f25056p0, iM);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int iM = m();
        if (bVar.m() != iM) {
            return false;
        }
        for (int i10 = 0; i10 < iM; i10++) {
            if (this.f25056p0[i10] != bVar.f25056p0[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(b bVar, int i10, int i11) {
        int i12 = (i10 + 63) >>> 6;
        int i13 = i11 >>> 6;
        int i14 = i11 & 63;
        if (i14 == 0) {
            d(i13, this.f25056p0, 0, bVar.f25056p0, i12);
            return;
        }
        long j10 = j(this.f25056p0, i13, bVar.f25056p0, 0, i12, i14);
        if (j10 != 0) {
            long[] jArr = this.f25056p0;
            int i15 = i12 + i13;
            jArr[i15] = j10 ^ jArr[i15];
        }
    }

    public final int hashCode() {
        int iM = m();
        int i10 = 1;
        for (int i11 = 0; i11 < iM; i11++) {
            long j10 = this.f25056p0[i11];
            i10 = (((i10 * 31) ^ ((int) j10)) * 31) ^ ((int) (j10 >>> 32));
        }
        return i10;
    }

    public final b k(b bVar) {
        int i10;
        int i11;
        b bVar2;
        b bVar3;
        long[] jArr;
        int iL = l();
        if (iL == 0) {
            return this;
        }
        int iL2 = bVar.l();
        if (iL2 == 0) {
            return bVar;
        }
        if (iL > iL2) {
            i11 = iL;
            i10 = iL2;
            bVar3 = this;
            bVar2 = bVar;
        } else {
            i10 = iL;
            i11 = iL2;
            bVar2 = this;
            bVar3 = bVar;
        }
        int i12 = (i10 + 63) >>> 6;
        int i13 = (i11 + 63) >>> 6;
        int i14 = ((i10 + i11) + 62) >>> 6;
        if (i12 == 1) {
            long j10 = bVar2.f25056p0[0];
            if (j10 == 1) {
                return bVar3;
            }
            long[] jArr2 = new long[i14];
            i(bVar3.f25056p0, i13, j10, jArr2);
            return new b(jArr2, i14);
        }
        int i15 = (i11 + 70) >>> 6;
        int[] iArr = new int[16];
        int i16 = i15 << 4;
        long[] jArr3 = new long[i16];
        iArr[1] = i15;
        System.arraycopy(bVar3.f25056p0, 0, jArr3, i15, i13);
        int i17 = 2;
        int i18 = i15;
        while (i17 < 16) {
            i18 += i15;
            iArr[i17] = i18;
            if ((i17 & 1) == 0) {
                jArr = jArr3;
                q(jArr3, i18 >>> 1, jArr3, i18, i15, 1);
            } else {
                jArr = jArr3;
                int i19 = i18 - i15;
                for (int i20 = 0; i20 < i15; i20++) {
                    jArr[i18 + i20] = jArr[i15 + i20] ^ jArr[i19 + i20];
                }
            }
            i17++;
            i16 = i16;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i21 = i16;
        long[] jArr5 = new long[i21];
        q(jArr4, 0, jArr5, 0, i21, 4);
        long[] jArr6 = bVar2.f25056p0;
        int i22 = i14 << 3;
        long[] jArr7 = new long[i22];
        for (int i23 = 0; i23 < i12; i23++) {
            long j11 = jArr6[i23];
            int i24 = i23;
            while (true) {
                int i25 = iArr[((int) j11) & 15];
                int i26 = iArr[((int) (j11 >>> 4)) & 15];
                for (int i27 = 0; i27 < i15; i27++) {
                    int i28 = i24 + i27;
                    jArr7[i28] = jArr7[i28] ^ (jArr4[i25 + i27] ^ jArr5[i26 + i27]);
                }
                j11 >>>= 8;
                if (j11 == 0) {
                    break;
                }
                i24 += i14;
            }
        }
        while (true) {
            i22 -= i14;
            if (i22 == 0) {
                return new b(jArr7, i14);
            }
            j(jArr7, i22 - i14, jArr7, i22, i14, 8);
        }
    }

    public final int l() {
        int length = this.f25056p0.length;
        while (length != 0) {
            length--;
            long j10 = this.f25056p0[length];
            if (j10 != 0) {
                return b(j10) + (length << 6);
            }
        }
        return 0;
    }

    public final int m() {
        long[] jArr = this.f25056p0;
        int iMin = Math.min(jArr.length, jArr.length);
        if (iMin < 1) {
            return 0;
        }
        if (jArr[0] != 0) {
            while (true) {
                int i10 = iMin - 1;
                if (jArr[i10] != 0) {
                    break;
                }
                iMin = i10;
            }
        } else {
            while (true) {
                int i11 = iMin - 1;
                if (jArr[i11] != 0) {
                    break;
                }
                if (i11 <= 0) {
                    return 0;
                }
                iMin = i11;
            }
        }
        return iMin;
    }

    public final boolean r() {
        long[] jArr = this.f25056p0;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < jArr.length; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public final BigInteger s() {
        int iM = m();
        if (iM == 0) {
            return ECConstants.ZERO;
        }
        int i10 = iM - 1;
        long j10 = this.f25056p0[i10];
        byte[] bArr = new byte[8];
        int i11 = 0;
        boolean z10 = false;
        for (int i12 = 7; i12 >= 0; i12--) {
            byte b10 = (byte) (j10 >>> (i12 * 8));
            if (z10 || b10 != 0) {
                bArr[i11] = b10;
                i11++;
                z10 = true;
            }
        }
        byte[] bArr2 = new byte[(i10 * 8) + i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i13] = bArr[i13];
        }
        for (int i14 = iM - 2; i14 >= 0; i14--) {
            long j11 = this.f25056p0[i14];
            int i15 = 7;
            while (i15 >= 0) {
                bArr2[i11] = (byte) (j11 >>> (i15 * 8));
                i15--;
                i11++;
            }
        }
        return new BigInteger(1, bArr2);
    }

    public final String toString() {
        int iM = m();
        if (iM == 0) {
            return "0";
        }
        int i10 = iM - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f25056p0[i10]));
        while (true) {
            i10--;
            if (i10 < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f25056p0[i10]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }

    public b(long[] jArr) {
        this.f25056p0 = jArr;
    }

    public b(long[] jArr, int i10) {
        if (i10 == jArr.length) {
            this.f25056p0 = jArr;
            return;
        }
        long[] jArr2 = new long[i10];
        this.f25056p0 = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i10);
    }

    public b(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int i10 = 1;
            if (bigInteger.signum() == 0) {
                this.f25056p0 = new long[]{0};
                return;
            }
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (byteArray[0] == 0) {
                length--;
            } else {
                i10 = 0;
            }
            int i11 = (length + 7) / 8;
            this.f25056p0 = new long[i11];
            int i12 = i11 - 1;
            int i13 = (length % 8) + i10;
            if (i10 < i13) {
                long j10 = 0;
                while (i10 < i13) {
                    j10 = (j10 << 8) | ((long) (byteArray[i10] & 255));
                    i10++;
                }
                this.f25056p0[i12] = j10;
                i12 = i11 - 2;
            }
            while (i12 >= 0) {
                long j11 = 0;
                int i14 = 0;
                while (i14 < 8) {
                    j11 = (j11 << 8) | ((long) (byteArray[i10] & 255));
                    i14++;
                    i10++;
                }
                this.f25056p0[i12] = j11;
                i12--;
            }
            return;
        }
        throw new IllegalArgumentException("invalid F2m field value");
    }
}
