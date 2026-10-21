package org.bouncycastle.pqc.math.linearalgebra;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.noknok.android.client.asm.api.uaf.json.UAFPublicKeyFormat;
import java.math.BigInteger;
import java.util.Random;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GF2Polynomial {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Random f91578d = new Random();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean[] f91579e = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final short[] f91580f = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, UAFPublicKeyFormat.UAF_ALG_KEY_ECC_X962_DER, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f91581g = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 134217728, 268435456, PKIFailureInfo.duplicateCertReq, 1073741824, Integer.MIN_VALUE, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f91582h = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, ViewCompat.MEASURED_SIZE_MASK, 33554431, 67108863, 134217727, 268435455, 536870911, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, Integer.MAX_VALUE, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f91585c;

    public GF2Polynomial(int i10) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i11;
        this.f91585c = new int[i11];
        this.f91583a = i10;
    }

    public static int[] b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i10 = iArr5[0];
            if (i10 != 0 || iArr7[0] != 0) {
                int[] iArrD = d(i10, iArr7[0]);
                int i11 = iArr3[5];
                int i12 = iArrD[1];
                iArr3[5] = i11 ^ i12;
                int i13 = iArr3[4];
                int i14 = iArrD[0];
                iArr3[4] = i13 ^ i14;
                iArr3[3] = iArr3[3] ^ i12;
                iArr3[2] = i14 ^ iArr3[2];
            }
        } else {
            int[] iArrE = e(iArr5, iArr7);
            int i15 = iArr3[7];
            int i16 = iArrE[3];
            iArr3[7] = i15 ^ i16;
            int i17 = iArr3[6];
            int i18 = iArrE[2];
            iArr3[6] = i17 ^ i18;
            int i19 = iArr3[5];
            int i20 = iArrE[1];
            iArr3[5] = i19 ^ (i16 ^ i20);
            int i21 = iArr3[4];
            int i22 = iArrE[0];
            iArr3[4] = i21 ^ (i22 ^ i18);
            iArr3[3] = iArr3[3] ^ i20;
            iArr3[2] = i22 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i23 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i23;
        int i24 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i24;
        if (iArr5[1] == 0 && i24 == 0) {
            int[] iArrD2 = d(iArr5[0], i23);
            iArr3[3] = iArr3[3] ^ iArrD2[1];
            iArr3[2] = iArrD2[0] ^ iArr3[2];
        } else {
            int[] iArrE2 = e(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ iArrE2[3];
            iArr3[4] = iArr3[4] ^ iArrE2[2];
            iArr3[3] = iArr3[3] ^ iArrE2[1];
            iArr3[2] = iArrE2[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] iArrD3 = d(iArr4[0], iArr6[0]);
            int i25 = iArr3[3];
            int i26 = iArrD3[1];
            iArr3[3] = i25 ^ i26;
            int i27 = iArr3[2];
            int i28 = iArrD3[0];
            iArr3[2] = i27 ^ i28;
            iArr3[1] = iArr3[1] ^ i26;
            iArr3[0] = i28 ^ iArr3[0];
        } else {
            int[] iArrE3 = e(iArr4, iArr6);
            int i29 = iArr3[5];
            int i30 = iArrE3[3];
            iArr3[5] = i29 ^ i30;
            int i31 = iArr3[4];
            int i32 = iArrE3[2];
            iArr3[4] = i31 ^ i32;
            int i33 = iArr3[3];
            int i34 = iArrE3[1];
            iArr3[3] = i33 ^ (i30 ^ i34);
            int i35 = iArr3[2];
            int i36 = iArrE3[0];
            iArr3[2] = i35 ^ (i36 ^ i32);
            iArr3[1] = iArr3[1] ^ i34;
            iArr3[0] = i36 ^ iArr3[0];
        }
        return iArr3;
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            int[] iArrB = b(iArr5, iArr7);
            int i10 = iArr3[15];
            int i11 = iArrB[7];
            iArr3[15] = i10 ^ i11;
            int i12 = iArr3[14];
            int i13 = iArrB[6];
            iArr3[14] = i12 ^ i13;
            int i14 = iArr3[13];
            int i15 = iArrB[5];
            iArr3[13] = i14 ^ i15;
            int i16 = iArr3[12];
            int i17 = iArrB[4];
            iArr3[12] = i16 ^ i17;
            int i18 = iArr3[11];
            int i19 = iArrB[3];
            iArr3[11] = i18 ^ (i19 ^ i11);
            int i20 = iArr3[10];
            int i21 = iArrB[2];
            iArr3[10] = i20 ^ (i21 ^ i13);
            int i22 = iArr3[9];
            int i23 = iArrB[1];
            iArr3[9] = i22 ^ (i23 ^ i15);
            int i24 = iArr3[8];
            int i25 = iArrB[0];
            iArr3[8] = i24 ^ (i25 ^ i17);
            iArr3[7] = iArr3[7] ^ i19;
            iArr3[6] = iArr3[6] ^ i21;
            iArr3[5] = iArr3[5] ^ i23;
            iArr3[4] = i25 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i26 = iArr5[0];
            if (i26 != 0 || iArr7[0] != 0) {
                int[] iArrD = d(i26, iArr7[0]);
                int i27 = iArr3[9];
                int i28 = iArrD[1];
                iArr3[9] = i27 ^ i28;
                int i29 = iArr3[8];
                int i30 = iArrD[0];
                iArr3[8] = i29 ^ i30;
                iArr3[5] = iArr3[5] ^ i28;
                iArr3[4] = i30 ^ iArr3[4];
            }
        } else {
            int[] iArrE = e(iArr5, iArr7);
            int i31 = iArr3[11];
            int i32 = iArrE[3];
            iArr3[11] = i31 ^ i32;
            int i33 = iArr3[10];
            int i34 = iArrE[2];
            iArr3[10] = i33 ^ i34;
            int i35 = iArr3[9];
            int i36 = iArrE[1];
            iArr3[9] = i35 ^ i36;
            int i37 = iArr3[8];
            int i38 = iArrE[0];
            iArr3[8] = i37 ^ i38;
            iArr3[7] = iArr3[7] ^ i32;
            iArr3[6] = iArr3[6] ^ i34;
            iArr3[5] = iArr3[5] ^ i36;
            iArr3[4] = i38 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        int[] iArrB2 = b(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ iArrB2[7];
        iArr3[10] = iArr3[10] ^ iArrB2[6];
        iArr3[9] = iArr3[9] ^ iArrB2[5];
        iArr3[8] = iArr3[8] ^ iArrB2[4];
        iArr3[7] = iArr3[7] ^ iArrB2[3];
        iArr3[6] = iArr3[6] ^ iArrB2[2];
        iArr3[5] = iArr3[5] ^ iArrB2[1];
        iArr3[4] = iArrB2[0] ^ iArr3[4];
        int[] iArrB3 = b(iArr4, iArr6);
        int i39 = iArr3[11];
        int i40 = iArrB3[7];
        iArr3[11] = i39 ^ i40;
        int i41 = iArr3[10];
        int i42 = iArrB3[6];
        iArr3[10] = i41 ^ i42;
        int i43 = iArr3[9];
        int i44 = iArrB3[5];
        iArr3[9] = i43 ^ i44;
        int i45 = iArr3[8];
        int i46 = iArrB3[4];
        iArr3[8] = i45 ^ i46;
        int i47 = iArr3[7];
        int i48 = iArrB3[3];
        iArr3[7] = i47 ^ (i40 ^ i48);
        int i49 = iArr3[6];
        int i50 = iArrB3[2];
        iArr3[6] = i49 ^ (i42 ^ i50);
        int i51 = iArr3[5];
        int i52 = iArrB3[1];
        iArr3[5] = i51 ^ (i44 ^ i52);
        int i53 = iArr3[4];
        int i54 = iArrB3[0];
        iArr3[4] = i53 ^ (i54 ^ i46);
        iArr3[3] = iArr3[3] ^ i48;
        iArr3[2] = iArr3[2] ^ i50;
        iArr3[1] = iArr3[1] ^ i52;
        iArr3[0] = i54 ^ iArr3[0];
        return iArr3;
    }

    public static int[] d(int i10, int i11) {
        int[] iArr = new int[2];
        if (i10 != 0 && i11 != 0) {
            long j10 = ((long) i11) & 4294967295L;
            long j11 = 0;
            for (int i12 = 1; i12 <= 32; i12++) {
                if ((f91581g[i12 - 1] & i10) != 0) {
                    j11 ^= j10;
                }
                j10 <<= 1;
            }
            iArr[1] = (int) (j11 >>> 32);
            iArr[0] = (int) (j11 & 4294967295L);
        }
        return iArr;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i10 = iArr[0];
        int i11 = iArr.length > 1 ? iArr[1] : 0;
        int i12 = iArr2[0];
        int i13 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i11 != 0 || i13 != 0) {
            int[] iArrD = d(i11, i13);
            int i14 = iArr3[3];
            int i15 = iArrD[1];
            iArr3[3] = i14 ^ i15;
            int i16 = iArr3[2];
            int i17 = iArrD[0];
            iArr3[2] = i16 ^ (i17 ^ i15);
            iArr3[1] = i17 ^ iArr3[1];
        }
        int[] iArrD2 = d(i11 ^ i10, i13 ^ i12);
        iArr3[2] = iArr3[2] ^ iArrD2[1];
        iArr3[1] = iArrD2[0] ^ iArr3[1];
        int[] iArrD3 = d(i10, i12);
        int i18 = iArr3[2];
        int i19 = iArrD3[1];
        iArr3[2] = i18 ^ i19;
        int i20 = iArr3[1];
        int i21 = iArrD3[0];
        iArr3[1] = i20 ^ (i19 ^ i21);
        iArr3[0] = i21 ^ iArr3[0];
        return iArr3;
    }

    public final GF2Polynomial a(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.f91583a << 1);
        int i10 = this.f91583a;
        if (i10 <= 32) {
            gF2Polynomial2.f91585c = d(this.f91585c[0], gF2Polynomial.f91585c[0]);
            return gF2Polynomial2;
        }
        if (i10 <= 64) {
            gF2Polynomial2.f91585c = e(this.f91585c, gF2Polynomial.f91585c);
            return gF2Polynomial2;
        }
        if (i10 <= 128) {
            gF2Polynomial2.f91585c = b(this.f91585c, gF2Polynomial.f91585c);
            return gF2Polynomial2;
        }
        if (i10 <= 256) {
            gF2Polynomial2.f91585c = c(this.f91585c, gF2Polynomial.f91585c);
            return gF2Polynomial2;
        }
        if (i10 > 512) {
            int i11 = f91581g[IntegerFunctions.floorLog(i10 - 1)];
            int i12 = ((i11 - 1) >> 5) + 1;
            int i13 = i12 << 5;
            GF2Polynomial gF2Polynomial3 = new GF2Polynomial(i13);
            System.arraycopy(this.f91585c, 0, gF2Polynomial3.f91585c, 0, Math.min(i12, this.f91584b));
            GF2Polynomial gF2PolynomialF = f(i12);
            gF2Polynomial.getClass();
            GF2Polynomial gF2Polynomial4 = new GF2Polynomial(i13);
            System.arraycopy(gF2Polynomial.f91585c, 0, gF2Polynomial4.f91585c, 0, Math.min(i12, gF2Polynomial.f91584b));
            GF2Polynomial gF2PolynomialF2 = gF2Polynomial.f(i12);
            GF2Polynomial gF2PolynomialA = gF2PolynomialF.a(gF2PolynomialF2);
            GF2Polynomial gF2PolynomialA2 = gF2Polynomial3.a(gF2Polynomial4);
            gF2Polynomial3.addToThis(gF2PolynomialF);
            gF2Polynomial4.addToThis(gF2PolynomialF2);
            GF2Polynomial gF2PolynomialA3 = gF2Polynomial3.a(gF2Polynomial4);
            gF2Polynomial2.shiftLeftAddThis(gF2PolynomialA, i11 << 1);
            gF2Polynomial2.shiftLeftAddThis(gF2PolynomialA, i11);
            gF2Polynomial2.shiftLeftAddThis(gF2PolynomialA3, i11);
            gF2Polynomial2.shiftLeftAddThis(gF2PolynomialA2, i11);
            gF2Polynomial2.addToThis(gF2PolynomialA2);
            return gF2Polynomial2;
        }
        int[] iArr = this.f91585c;
        int[] iArr2 = gF2Polynomial.f91585c;
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] iArrC = c(iArr5, iArr7);
        int i14 = iArr3[31];
        int i15 = iArrC[15];
        iArr3[31] = i14 ^ i15;
        int i16 = iArr3[30];
        int i17 = iArrC[14];
        iArr3[30] = i16 ^ i17;
        int i18 = iArr3[29];
        int i19 = iArrC[13];
        iArr3[29] = i18 ^ i19;
        int i20 = iArr3[28];
        int i21 = iArrC[12];
        iArr3[28] = i20 ^ i21;
        int i22 = iArr3[27];
        int i23 = iArrC[11];
        iArr3[27] = i22 ^ i23;
        int i24 = iArr3[26];
        int i25 = iArrC[10];
        iArr3[26] = i24 ^ i25;
        int i26 = iArr3[25];
        int i27 = iArrC[9];
        iArr3[25] = i26 ^ i27;
        int i28 = iArr3[24];
        int i29 = iArrC[8];
        iArr3[24] = i28 ^ i29;
        int i30 = iArr3[23];
        int i31 = iArrC[7];
        iArr3[23] = i30 ^ (i31 ^ i15);
        int i32 = iArr3[22];
        int i33 = iArrC[6];
        iArr3[22] = i32 ^ (i33 ^ i17);
        int i34 = iArr3[21];
        int i35 = iArrC[5];
        iArr3[21] = i34 ^ (i35 ^ i19);
        int i36 = iArr3[20];
        int i37 = iArrC[4];
        iArr3[20] = i36 ^ (i37 ^ i21);
        int i38 = iArr3[19];
        int i39 = iArrC[3];
        iArr3[19] = i38 ^ (i39 ^ i23);
        int i40 = iArr3[18];
        int i41 = iArrC[2];
        iArr3[18] = i40 ^ (i41 ^ i25);
        int i42 = iArr3[17];
        int i43 = iArrC[1];
        iArr3[17] = i42 ^ (i43 ^ i27);
        int i44 = iArr3[16];
        int i45 = iArrC[0];
        iArr3[16] = i44 ^ (i45 ^ i29);
        iArr3[15] = iArr3[15] ^ i31;
        iArr3[14] = iArr3[14] ^ i33;
        iArr3[13] = iArr3[13] ^ i35;
        iArr3[12] = iArr3[12] ^ i37;
        iArr3[11] = iArr3[11] ^ i39;
        iArr3[10] = iArr3[10] ^ i41;
        iArr3[9] = iArr3[9] ^ i43;
        iArr3[8] = iArr3[8] ^ i45;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] iArrC2 = c(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ iArrC2[15];
        iArr3[22] = iArr3[22] ^ iArrC2[14];
        iArr3[21] = iArr3[21] ^ iArrC2[13];
        iArr3[20] = iArr3[20] ^ iArrC2[12];
        iArr3[19] = iArr3[19] ^ iArrC2[11];
        iArr3[18] = iArr3[18] ^ iArrC2[10];
        iArr3[17] = iArr3[17] ^ iArrC2[9];
        iArr3[16] = iArr3[16] ^ iArrC2[8];
        iArr3[15] = iArr3[15] ^ iArrC2[7];
        iArr3[14] = iArr3[14] ^ iArrC2[6];
        iArr3[13] = iArr3[13] ^ iArrC2[5];
        iArr3[12] = iArr3[12] ^ iArrC2[4];
        iArr3[11] = iArr3[11] ^ iArrC2[3];
        iArr3[10] = iArr3[10] ^ iArrC2[2];
        iArr3[9] = iArr3[9] ^ iArrC2[1];
        iArr3[8] = iArrC2[0] ^ iArr3[8];
        int[] iArrC3 = c(iArr4, iArr6);
        int i46 = iArr3[23];
        int i47 = iArrC3[15];
        iArr3[23] = i46 ^ i47;
        int i48 = iArr3[22];
        int i49 = iArrC3[14];
        iArr3[22] = i48 ^ i49;
        int i50 = iArr3[21];
        int i51 = iArrC3[13];
        iArr3[21] = i50 ^ i51;
        int i52 = iArr3[20];
        int i53 = iArrC3[12];
        iArr3[20] = i52 ^ i53;
        int i54 = iArr3[19];
        int i55 = iArrC3[11];
        iArr3[19] = i54 ^ i55;
        int i56 = iArr3[18];
        int i57 = iArrC3[10];
        iArr3[18] = i56 ^ i57;
        int i58 = iArr3[17];
        int i59 = iArrC3[9];
        iArr3[17] = i58 ^ i59;
        int i60 = iArr3[16];
        int i61 = iArrC3[8];
        iArr3[16] = i60 ^ i61;
        int i62 = iArr3[15];
        int i63 = iArrC3[7];
        iArr3[15] = i62 ^ (i63 ^ i47);
        int i64 = iArr3[14];
        int i65 = iArrC3[6];
        iArr3[14] = i64 ^ (i49 ^ i65);
        int i66 = iArr3[13];
        int i67 = iArrC3[5];
        iArr3[13] = i66 ^ (i51 ^ i67);
        int i68 = iArr3[12];
        int i69 = iArrC3[4];
        iArr3[12] = i68 ^ (i53 ^ i69);
        int i70 = iArr3[11];
        int i71 = iArrC3[3];
        iArr3[11] = i70 ^ (i55 ^ i71);
        int i72 = iArr3[10];
        int i73 = iArrC3[2];
        iArr3[10] = i72 ^ (i73 ^ i57);
        int i74 = iArr3[9];
        int i75 = iArrC3[1];
        iArr3[9] = i74 ^ (i75 ^ i59);
        int i76 = iArr3[8];
        int i77 = iArrC3[0];
        iArr3[8] = i76 ^ (i77 ^ i61);
        iArr3[7] = iArr3[7] ^ i63;
        iArr3[6] = iArr3[6] ^ i65;
        iArr3[5] = iArr3[5] ^ i67;
        iArr3[4] = iArr3[4] ^ i69;
        iArr3[3] = iArr3[3] ^ i71;
        iArr3[2] = iArr3[2] ^ i73;
        iArr3[1] = iArr3[1] ^ i75;
        iArr3[0] = i77 ^ iArr3[0];
        gF2Polynomial2.f91585c = iArr3;
        return gF2Polynomial2;
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.f91583a);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = -1;
        }
        g();
    }

    public void assignOne() {
        for (int i10 = 1; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = 0;
        }
        this.f91585c[0] = 1;
    }

    public void assignX() {
        for (int i10 = 1; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = 0;
        }
        this.f91585c[0] = 2;
    }

    public void assignZero() {
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.f91583a);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i10 = gF2Polynomial3.f91583a;
        int i11 = gF2Polynomial4.f91583a;
        if (i10 < i11) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i12 = i10 - i11;
        gF2Polynomial2.expandN(i12 + 1);
        while (i12 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i12));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i12);
            i12 = gF2Polynomial3.f91583a - gF2Polynomial4.f91583a;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.f91583a != gF2Polynomial.f91583a) {
            return false;
        }
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            if (this.f91585c[i10] != gF2Polynomial.f91585c[i10]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i10) {
        if (this.f91583a >= i10) {
            return;
        }
        this.f91583a = i10;
        int i11 = ((i10 - 1) >>> 5) + 1;
        int i12 = this.f91584b;
        if (i12 >= i11) {
            return;
        }
        int[] iArr = this.f91585c;
        if (iArr.length >= i11) {
            while (i12 < i11) {
                this.f91585c[i12] = 0;
                i12++;
            }
            this.f91584b = i11;
            return;
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i12);
        this.f91584b = i11;
        this.f91585c = iArr2;
    }

    public final GF2Polynomial f(int i10) {
        int iMin = Math.min(i10, this.f91584b - i10);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(iMin << 5);
        if (this.f91584b >= i10) {
            System.arraycopy(this.f91585c, i10, gF2Polynomial.f91585c, 0, iMin);
        }
        return gF2Polynomial;
    }

    public final void g() {
        int i10 = this.f91583a;
        if ((i10 & 31) != 0) {
            int[] iArr = this.f91585c;
            int i11 = this.f91584b - 1;
            iArr[i11] = f91582h[i10 & 31] & iArr[i11];
        }
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (isZero() && gF2Polynomial.isZero()) {
            throw new ArithmeticException("Both operands of gcd equal zero.");
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
        GF2Polynomial gF2PolynomialRemainder = gF2Polynomial3;
        while (!gF2PolynomialRemainder.isZero()) {
            GF2Polynomial gF2Polynomial5 = gF2PolynomialRemainder;
            gF2PolynomialRemainder = gF2Polynomial4.remainder(gF2PolynomialRemainder);
            gF2Polynomial4 = gF2Polynomial5;
        }
        return gF2Polynomial4;
    }

    public int getBit(int i10) {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.f91583a - 1) {
            return 0;
        }
        return (f91581g[i10 & 31] & this.f91585c[i10 >>> 5]) != 0 ? 1 : 0;
    }

    public int getLength() {
        return this.f91583a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91585c) + this.f91583a;
    }

    public GF2Polynomial increase() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() {
        xorBit(0);
    }

    public boolean isIrreducible() {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i10 = gF2Polynomial.f91583a;
        int i11 = i10 - 1;
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i10, "X");
        for (int i12 = 1; i12 <= (i11 >> 1); i12++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial gF2PolynomialAdd = gF2Polynomial2.add(new GF2Polynomial(32, "X"));
            if (gF2PolynomialAdd.isZero() || !gF2Polynomial.gcd(gF2PolynomialAdd).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        for (int i10 = 1; i10 < this.f91584b; i10++) {
            if (this.f91585c[i10] != 0) {
                return false;
            }
        }
        return this.f91585c[0] == 1;
    }

    public boolean isZero() {
        if (this.f91583a == 0) {
            return true;
        }
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            if (this.f91585c[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int iMax = Math.max(this.f91583a, gF2Polynomial.f91583a);
        expandN(iMax);
        gF2Polynomial.expandN(iMax);
        return a(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.f91583a, gF2Polynomial.f91583a) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i10 = 1; i10 <= 31; i10++) {
            gF2PolynomialArr[i10] = gF2PolynomialArr[i10 - 1].shiftLeft();
        }
        for (int i11 = 0; i11 < gF2Polynomial.f91584b; i11++) {
            for (int i12 = 0; i12 <= 31; i12++) {
                if ((gF2Polynomial.f91585c[i11] & f91581g[i12]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i12]);
                }
            }
            for (int i13 = 0; i13 <= 31; i13++) {
                GF2Polynomial gF2Polynomial3 = gF2PolynomialArr[i13];
                int i14 = gF2Polynomial3.f91584b;
                int i15 = i14 + 1;
                gF2Polynomial3.f91584b = i15;
                gF2Polynomial3.f91583a += 32;
                int[] iArr = gF2Polynomial3.f91585c;
                if (i15 <= iArr.length) {
                    while (i14 >= 1) {
                        int[] iArr2 = gF2Polynomial3.f91585c;
                        iArr2[i14] = iArr2[i14 - 1];
                        i14--;
                    }
                    gF2Polynomial3.f91585c[0] = 0;
                } else {
                    int[] iArr3 = new int[i15];
                    System.arraycopy(iArr, 0, iArr3, 1, i14);
                    gF2Polynomial3.f91585c = iArr3;
                }
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.f91583a);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i10 = gF2Polynomial3.f91583a;
        int i11 = gF2Polynomial4.f91583a;
        if (i10 < i11) {
            return new GF2Polynomial(0);
        }
        int i12 = i10 - i11;
        gF2Polynomial2.expandN(i12 + 1);
        while (i12 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i12));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i12);
            i12 = gF2Polynomial3.f91583a - gF2Polynomial4.f91583a;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = f91578d.nextInt();
        }
        g();
    }

    public void reduceN() {
        int i10;
        int i11 = this.f91584b;
        do {
            i11--;
            i10 = this.f91585c[i11];
            if (i10 != 0) {
                break;
            }
        } while (i11 > 0);
        int i12 = 0;
        while (i10 != 0) {
            i10 >>>= 1;
            i12++;
        }
        this.f91583a = (i11 << 5) + i12;
        this.f91584b = i11 + 1;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            throw new RuntimeException();
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i10 = gF2Polynomial2.f91583a;
        int i11 = gF2Polynomial3.f91583a;
        if (i10 < i11) {
            return gF2Polynomial2;
        }
        while (true) {
            int i12 = i10 - i11;
            if (i12 < 0) {
                return gF2Polynomial2;
            }
            gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i12));
            gF2Polynomial2.reduceN();
            i10 = gF2Polynomial2.f91583a;
            i11 = gF2Polynomial3.f91583a;
        }
    }

    public void resetBit(int i10) throws RuntimeException {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.f91583a - 1) {
            return;
        }
        int[] iArr = this.f91585c;
        int i11 = i10 >>> 5;
        iArr[i11] = (~f91581g[i10 & 31]) & iArr[i11];
    }

    public void setBit(int i10) throws RuntimeException {
        if (i10 < 0 || i10 > this.f91583a - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.f91585c;
        int i11 = i10 >>> 5;
        iArr[i11] = f91581g[i10 & 31] | iArr[i11];
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.f91583a + 1, this.f91585c);
        for (int i10 = gF2Polynomial.f91584b - 1; i10 >= 1; i10--) {
            int[] iArr = gF2Polynomial.f91585c;
            int i11 = iArr[i10] << 1;
            iArr[i10] = i11;
            iArr[i10] = i11 | (iArr[i10 - 1] >>> 31);
        }
        int[] iArr2 = gF2Polynomial.f91585c;
        iArr2[0] = iArr2[0] << 1;
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i10) {
        int i11;
        if (i10 == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.f91583a + i10);
        int i12 = i10 >>> 5;
        for (int i13 = gF2Polynomial.f91584b - 1; i13 >= 0; i13--) {
            int i14 = i13 + i12;
            int i15 = i14 + 1;
            if (i15 < this.f91584b && (i11 = i10 & 31) != 0) {
                int[] iArr = this.f91585c;
                iArr[i15] = (gF2Polynomial.f91585c[i13] >>> (32 - i11)) ^ iArr[i15];
            }
            int[] iArr2 = this.f91585c;
            iArr2[i14] = iArr2[i14] ^ (gF2Polynomial.f91585c[i13] << (i10 & 31));
        }
    }

    public void shiftLeftThis() {
        int i10 = this.f91583a;
        int i11 = i10 & 31;
        this.f91583a = i10 + 1;
        int i12 = this.f91584b;
        if (i11 != 0) {
            for (int i13 = i12 - 1; i13 >= 1; i13--) {
                int[] iArr = this.f91585c;
                int i14 = iArr[i13] << 1;
                iArr[i13] = i14;
                iArr[i13] = i14 | (iArr[i13 - 1] >>> 31);
            }
            int[] iArr2 = this.f91585c;
            iArr2[0] = iArr2[0] << 1;
            return;
        }
        int i15 = i12 + 1;
        this.f91584b = i15;
        int[] iArr3 = this.f91585c;
        if (i15 > iArr3.length) {
            int[] iArr4 = new int[i15];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            this.f91585c = iArr4;
        }
        for (int i16 = this.f91584b - 1; i16 >= 1; i16--) {
            int[] iArr5 = this.f91585c;
            int i17 = i16 - 1;
            iArr5[i16] = iArr5[i16] | (iArr5[i17] >>> 31);
            iArr5[i17] = iArr5[i17] << 1;
        }
    }

    public GF2Polynomial shiftRight() {
        int i10;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.f91583a - 1);
        int i11 = 0;
        System.arraycopy(this.f91585c, 0, gF2Polynomial.f91585c, 0, gF2Polynomial.f91584b);
        while (true) {
            i10 = gF2Polynomial.f91584b;
            if (i11 > i10 - 2) {
                break;
            }
            int[] iArr = gF2Polynomial.f91585c;
            int i12 = iArr[i11] >>> 1;
            iArr[i11] = i12;
            int i13 = i11 + 1;
            iArr[i11] = i12 | (iArr[i13] << 31);
            i11 = i13;
        }
        int[] iArr2 = gF2Polynomial.f91585c;
        int i14 = i10 - 1;
        iArr2[i14] = iArr2[i14] >>> 1;
        if (i10 < this.f91584b) {
            int i15 = i10 - 1;
            iArr2[i15] = (this.f91585c[i10] << 31) | iArr2[i15];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i10;
        int i11 = this.f91583a;
        this.f91583a = i11 - 1;
        this.f91584b = ((i11 - 2) >>> 5) + 1;
        int i12 = 0;
        while (true) {
            i10 = this.f91584b;
            if (i12 > i10 - 2) {
                break;
            }
            int[] iArr = this.f91585c;
            int i13 = iArr[i12] >>> 1;
            iArr[i12] = i13;
            int i14 = i12 + 1;
            iArr[i12] = i13 | (iArr[i14] << 31);
            i12 = i14;
        }
        int[] iArr2 = this.f91585c;
        int i15 = i10 - 1;
        iArr2[i15] = iArr2[i15] >>> 1;
        if ((this.f91583a & 31) == 0) {
            int i16 = i10 - 1;
            iArr2[i16] = (iArr2[i10] << 31) | iArr2[i16];
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i10 = this.f91584b;
        int i11 = i10 << 1;
        int[] iArr = new int[i11];
        for (int i12 = i10 - 1; i12 >= 0; i12--) {
            int i13 = this.f91585c[i12];
            int i14 = 1;
            for (int i15 = 0; i15 < 16; i15++) {
                if ((i13 & 1) != 0) {
                    int i16 = i12 << 1;
                    iArr[i16] = iArr[i16] | i14;
                }
                if ((65536 & i13) != 0) {
                    int i17 = (i12 << 1) + 1;
                    iArr[i17] = iArr[i17] | i14;
                }
                i14 <<= 2;
                i13 >>>= 1;
            }
        }
        this.f91585c = iArr;
        this.f91584b = i11;
        this.f91583a = (this.f91583a << 1) - 1;
    }

    public void squareThisPreCalc() {
        int i10;
        int i11;
        if (isZero()) {
            return;
        }
        int length = this.f91585c.length;
        int i12 = this.f91584b;
        int i13 = i12 << 1;
        short[] sArr = f91580f;
        if (length >= i13) {
            for (int i14 = i12 - 1; i14 >= 0; i14--) {
                int[] iArr = this.f91585c;
                int i15 = i14 << 1;
                int i16 = iArr[i14];
                iArr[i15 + 1] = (sArr[(i16 & ViewCompat.MEASURED_STATE_MASK) >>> 24] << 16) | sArr[(i16 & 16711680) >>> 16];
                int i17 = iArr[i14];
                iArr[i15] = (sArr[(i17 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8] << 16) | sArr[i17 & 255];
            }
            i11 = this.f91584b << 1;
        } else {
            int[] iArr2 = new int[i12 << 1];
            int i18 = 0;
            while (true) {
                i10 = this.f91584b;
                if (i18 >= i10) {
                    break;
                }
                int i19 = i18 << 1;
                int[] iArr3 = this.f91585c;
                int i20 = iArr3[i18];
                iArr2[i19] = (sArr[(i20 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8] << 16) | sArr[i20 & 255];
                int i21 = iArr3[i18];
                iArr2[i19 + 1] = (sArr[(i21 & ViewCompat.MEASURED_STATE_MASK) >>> 24] << 16) | sArr[(i21 & 16711680) >>> 16];
                i18++;
            }
            this.f91585c = iArr2;
            i11 = i10 << 1;
        }
        this.f91584b = i11;
        this.f91583a = (this.f91583a << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.f91583a);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i10) {
        if (i10 < 0) {
            throw new RuntimeException();
        }
        if (i10 > this.f91583a - 1) {
            return false;
        }
        return (f91581g[i10 & 31] & this.f91585c[i10 >>> 5]) != 0;
    }

    public byte[] toByteArray() {
        int i10 = ((this.f91583a - 1) >> 3) + 1;
        int i11 = i10 & 3;
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < (i10 >> 2); i12++) {
            int i13 = i10 - (i12 << 2);
            int i14 = this.f91585c[i12];
            bArr[i13 - 1] = (byte) (i14 & 255);
            bArr[i13 - 2] = (byte) ((65280 & i14) >>> 8);
            bArr[i13 - 3] = (byte) ((16711680 & i14) >>> 16);
            bArr[i13 - 4] = (byte) (((-16777216) & i14) >>> 24);
        }
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = ((i11 - i15) - 1) << 3;
            bArr[i15] = (byte) ((this.f91585c[this.f91584b - 1] & (255 << i16)) >>> i16);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.f91583a == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i10 = this.f91584b;
        int[] iArr = new int[i10];
        System.arraycopy(this.f91585c, 0, iArr, 0, i10);
        return iArr;
    }

    public String toString(int i10) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        if (i10 == 16) {
            for (int i11 = this.f91584b - 1; i11 >= 0; i11--) {
                StringBuilder sbD = c.d(str);
                sbD.append(cArr[(this.f91585c[i11] >>> 28) & 15]);
                StringBuilder sbD2 = c.d(sbD.toString());
                sbD2.append(cArr[(this.f91585c[i11] >>> 24) & 15]);
                StringBuilder sbD3 = c.d(sbD2.toString());
                sbD3.append(cArr[(this.f91585c[i11] >>> 20) & 15]);
                StringBuilder sbD4 = c.d(sbD3.toString());
                sbD4.append(cArr[(this.f91585c[i11] >>> 16) & 15]);
                StringBuilder sbD5 = c.d(sbD4.toString());
                sbD5.append(cArr[(this.f91585c[i11] >>> 12) & 15]);
                StringBuilder sbD6 = c.d(sbD5.toString());
                sbD6.append(cArr[(this.f91585c[i11] >>> 8) & 15]);
                StringBuilder sbD7 = c.d(sbD6.toString());
                sbD7.append(cArr[(this.f91585c[i11] >>> 4) & 15]);
                StringBuilder sbD8 = c.d(sbD7.toString());
                sbD8.append(cArr[this.f91585c[i11] & 15]);
                str = u.f(sbD8.toString(), " ");
            }
        } else {
            for (int i12 = this.f91584b - 1; i12 >= 0; i12--) {
                StringBuilder sbD9 = c.d(str);
                sbD9.append(strArr[(this.f91585c[i12] >>> 28) & 15]);
                StringBuilder sbD10 = c.d(sbD9.toString());
                sbD10.append(strArr[(this.f91585c[i12] >>> 24) & 15]);
                StringBuilder sbD11 = c.d(sbD10.toString());
                sbD11.append(strArr[(this.f91585c[i12] >>> 20) & 15]);
                StringBuilder sbD12 = c.d(sbD11.toString());
                sbD12.append(strArr[(this.f91585c[i12] >>> 16) & 15]);
                StringBuilder sbD13 = c.d(sbD12.toString());
                sbD13.append(strArr[(this.f91585c[i12] >>> 12) & 15]);
                StringBuilder sbD14 = c.d(sbD13.toString());
                sbD14.append(strArr[(this.f91585c[i12] >>> 8) & 15]);
                StringBuilder sbD15 = c.d(sbD14.toString());
                sbD15.append(strArr[(this.f91585c[i12] >>> 4) & 15]);
                StringBuilder sbD16 = c.d(sbD15.toString());
                sbD16.append(strArr[this.f91585c[i12] & 15]);
                str = u.f(sbD16.toString(), " ");
            }
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (this.f91583a != gF2Polynomial.f91583a) {
            throw new RuntimeException();
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            int i11 = this.f91585c[i10] & gF2Polynomial.f91585c[i10];
            boolean[] zArr = f91579e;
            z10 = (((z10 ^ zArr[i11 & 255]) ^ zArr[(i11 >>> 8) & 255]) ^ zArr[(i11 >>> 16) & 255]) ^ zArr[(i11 >>> 24) & 255];
        }
        return z10;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int iMin = Math.min(this.f91584b, gF2Polynomial.f91584b);
        int i10 = 0;
        if (this.f91583a >= gF2Polynomial.f91583a) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i10 < iMin) {
                int[] iArr = gF2Polynomial2.f91585c;
                iArr[i10] = iArr[i10] ^ gF2Polynomial.f91585c[i10];
                i10++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i10 < iMin) {
                int[] iArr2 = gF2Polynomial2.f91585c;
                iArr2[i10] = iArr2[i10] ^ this.f91585c[i10];
                i10++;
            }
        }
        gF2Polynomial2.g();
        return gF2Polynomial2;
    }

    public void xorBit(int i10) throws RuntimeException {
        if (i10 < 0 || i10 > this.f91583a - 1) {
            throw new RuntimeException();
        }
        int[] iArr = this.f91585c;
        int i11 = i10 >>> 5;
        iArr[i11] = f91581g[i10 & 31] ^ iArr[i11];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i10 = 0; i10 < Math.min(this.f91584b, gF2Polynomial.f91584b); i10++) {
            int[] iArr = this.f91585c;
            iArr[i10] = iArr[i10] ^ gF2Polynomial.f91585c[i10];
        }
        g();
    }

    public GF2Polynomial(int i10, String str) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i11;
        this.f91585c = new int[i11];
        this.f91583a = i10;
        if (str.equalsIgnoreCase("ZERO")) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase("ONE")) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase("RANDOM")) {
            randomize();
        } else if (str.equalsIgnoreCase("X")) {
            assignX();
        } else {
            if (!str.equalsIgnoreCase("ALL")) {
                throw new IllegalArgumentException(h0.b("Error: GF2Polynomial was called using ", str, " as value!"));
            }
            assignAll();
        }
    }

    public void randomize(Random random) {
        for (int i10 = 0; i10 < this.f91584b; i10++) {
            this.f91585c[i10] = random.nextInt();
        }
        g();
    }

    public GF2Polynomial shiftLeft(int i10) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.f91583a + i10, this.f91585c);
        if (i10 >= 32) {
            int i11 = i10 >>> 5;
            int i12 = gF2Polynomial.f91584b;
            int[] iArr = gF2Polynomial.f91585c;
            if (i12 <= iArr.length) {
                for (int i13 = i12 - 1; i13 >= i11; i13--) {
                    int[] iArr2 = gF2Polynomial.f91585c;
                    iArr2[i13] = iArr2[i13 - i11];
                }
                for (int i14 = 0; i14 < i11; i14++) {
                    gF2Polynomial.f91585c[i14] = 0;
                }
            } else {
                int[] iArr3 = new int[i12];
                System.arraycopy(iArr, 0, iArr3, i11, i12 - i11);
                gF2Polynomial.f91585c = iArr3;
            }
        }
        int i15 = i10 & 31;
        if (i15 != 0) {
            for (int i16 = gF2Polynomial.f91584b - 1; i16 >= 1; i16--) {
                int[] iArr4 = gF2Polynomial.f91585c;
                int i17 = iArr4[i16] << i15;
                iArr4[i16] = i17;
                iArr4[i16] = i17 | (iArr4[i16 - 1] >>> (32 - i15));
            }
            int[] iArr5 = gF2Polynomial.f91585c;
            iArr5[0] = iArr5[0] << i15;
        }
        return gF2Polynomial;
    }

    public GF2Polynomial(int i10, BigInteger bigInteger) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i11;
        this.f91585c = new int[i11];
        this.f91583a = i10;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i12 = 0; i12 < length2; i12++) {
            int[] iArr = this.f91585c;
            iArr[length3] = iArr[length3] | ((byteArray[i12] & 255) << (((length2 - 1) - i12) << 3));
        }
        for (int i13 = 0; i13 <= ((byteArray.length - 4) >> 2); i13++) {
            int length4 = (byteArray.length - 1) - (i13 << 2);
            int[] iArr2 = this.f91585c;
            int i14 = byteArray[length4] & 255;
            iArr2[i13] = i14;
            int i15 = i14 | ((byteArray[length4 - 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            iArr2[i13] = i15;
            int i16 = i15 | ((byteArray[length4 - 2] << 16) & 16711680);
            iArr2[i13] = i16;
            iArr2[i13] = ((byteArray[length4 - 3] << 24) & ViewCompat.MEASURED_STATE_MASK) | i16;
        }
        int i17 = this.f91583a;
        if ((i17 & 31) != 0) {
            int[] iArr3 = this.f91585c;
            int i18 = this.f91584b - 1;
            iArr3[i18] = f91582h[i17 & 31] & iArr3[i18];
        }
        reduceN();
    }

    public GF2Polynomial(int i10, Random random) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i11;
        this.f91585c = new int[i11];
        this.f91583a = i10;
        randomize(random);
    }

    public GF2Polynomial(int i10, byte[] bArr) {
        int i11;
        i10 = i10 < 1 ? 1 : i10;
        int i12 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i12;
        this.f91585c = new int[i12];
        this.f91583a = i10;
        int iMin = Math.min(((bArr.length - 1) >> 2) + 1, i12);
        int i13 = 0;
        while (true) {
            i11 = iMin - 1;
            if (i13 >= i11) {
                break;
            }
            int length = bArr.length - (i13 << 2);
            int[] iArr = this.f91585c;
            int i14 = bArr[length - 1] & 255;
            iArr[i13] = i14;
            int i15 = (65280 & (bArr[length - 2] << 8)) | i14;
            iArr[i13] = i15;
            int i16 = (16711680 & (bArr[length - 3] << 16)) | i15;
            iArr[i13] = i16;
            iArr[i13] = ((bArr[length - 4] << 24) & ViewCompat.MEASURED_STATE_MASK) | i16;
            i13++;
        }
        int length2 = bArr.length - (i11 << 2);
        int i17 = length2 - 1;
        int[] iArr2 = this.f91585c;
        int i18 = bArr[i17] & 255;
        iArr2[i11] = i18;
        if (i17 > 0) {
            iArr2[i11] = (65280 & (bArr[length2 - 2] << 8)) | i18;
        }
        if (i17 > 1) {
            iArr2[i11] = iArr2[i11] | (16711680 & (bArr[length2 - 3] << 16));
        }
        if (i17 > 2) {
            iArr2[i11] = ((bArr[length2 - 4] << 24) & ViewCompat.MEASURED_STATE_MASK) | iArr2[i11];
        }
        g();
        reduceN();
    }

    public GF2Polynomial(int i10, int[] iArr) {
        i10 = i10 < 1 ? 1 : i10;
        int i11 = ((i10 - 1) >> 5) + 1;
        this.f91584b = i11;
        this.f91585c = new int[i11];
        this.f91583a = i10;
        System.arraycopy(iArr, 0, this.f91585c, 0, Math.min(i11, iArr.length));
        g();
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.f91583a = gF2Polynomial.f91583a;
        this.f91584b = gF2Polynomial.f91584b;
        this.f91585c = IntUtils.clone(gF2Polynomial.f91585c);
    }
}
