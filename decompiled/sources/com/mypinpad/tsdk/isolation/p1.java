package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.noknok.android.client.asm.api.uaf.json.UAFPublicKeyFormat;
import java.math.BigInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class p1 implements Cloneable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final short[] f57617q0 = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, UAFPublicKeyFormat.UAF_ALG_KEY_ECC_X962_DER, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f57618r0 = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57619s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57620t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long[] f57621p0;

    static {
        int i10 = (0 - (-19)) - 1;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f57620t0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public p1(long[] jArr, int i10) {
        if (i10 == jArr.length) {
            this.f57621p0 = jArr;
            return;
        }
        long[] jArr2 = new long[i10];
        this.f57621p0 = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        return "0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        r2 = r2 - 1;
        r0 = new java.lang.StringBuffer(java.lang.Long.toBinaryString(r9.f57621p0[r2]));
        r4 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r5 = ((r4 | 73) << 1) - (r4 ^ 73);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r2 = (-2) - (r2 ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r2 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.p1.f57619s0 + 73;
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r4 % 128;
        r4 = r4 % 2;
        r4 = java.lang.Long.toBinaryString(r9.f57621p0[r2]);
        r5 = r4.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r5 >= 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r7 = r6 & 43;
        r6 = (r6 ^ 43) | r7;
        r8 = (r7 & r6) + (r6 | r7);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r8 % 128;
        r8 = r8 % 2;
        r0.append("0000000000000000000000000000000000000000000000000000000000000000".substring(r5));
        r5 = com.mypinpad.tsdk.isolation.p1.f57620t0 + 103;
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        r0.append(r4);
        r4 = com.mypinpad.tsdk.isolation.p1.f57619s0 + 111;
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
    
        r9 = r0.toString();
        r0 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r2 = r0 ^ 45;
        r0 = ((((r0 & 45) | r2) << 1) - (~(-r2))) - 1;
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f4, code lost:
    
        if ((r0 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r2 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r0 = (r9 & (-80)) | ((~r9) & 79);
        r9 = -(-((r9 & 79) << 1));
        r2 = (r0 ^ r9) + ((r9 & r0) << 1);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String A(java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.A(java.lang.Object[]):java.lang.String");
    }

    public static /* synthetic */ void B(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        p1 p1Var2 = (p1) objArr[1];
        int i10 = f57620t0;
        int i11 = (((i10 | 125) << 1) - (~(-(((~i10) & 125) | (i10 & (-126)))))) - 1;
        f57619s0 = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) m(new Object[]{p1Var2}, 440849681, -440849671, System.identityHashCode(p1Var2))).intValue();
            throw null;
        }
        int iIntValue = ((Integer) m(new Object[]{p1Var2}, 440849681, -440849671, System.identityHashCode(p1Var2))).intValue();
        if (iIntValue == 0) {
            System.identityHashCode(p1Var);
            System.identityHashCode(p1Var);
            return;
        }
        if (iIntValue > p1Var.f57621p0.length) {
            int i12 = f57619s0;
            int i13 = i12 ^ 107;
            int i14 = (i12 & 107) << 1;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            f57620t0 = i15 % 128;
            int i16 = i15 % 2;
            p1Var.f57621p0 = (long[]) m(new Object[]{p1Var, Integer.valueOf(iIntValue)}, -702785186, 702785220, iIntValue);
            int i17 = f57619s0;
            int i18 = ((i17 ^ 59) | (i17 & 59)) << 1;
            int i19 = -(((~i17) & 59) | (i17 & (-60)));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f57620t0 = i20 % 128;
            int i21 = i20 % 2;
        }
        i(0, p1Var.f57621p0, 0, p1Var2.f57621p0, iIntValue);
        int i22 = f57620t0 + 35;
        f57619s0 = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 24 / 0;
        }
    }

    public static /* synthetic */ p1 D(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int i10 = f57620t0;
        int i11 = ((i10 | 113) << 1) - (i10 ^ 113);
        int i12 = i11 % 128;
        f57619s0 = i12;
        int i13 = i11 % 2;
        if (p1Var.f57621p0.length == 0) {
            p1 p1Var2 = new p1(new long[]{1});
            int i14 = i12 & 125;
            int i15 = -(-((i12 ^ 125) | i14));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f57620t0 = i16 % 128;
            int i17 = i16 % 2;
            return p1Var2;
        }
        int iMax = Math.max(1, ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue());
        long[] jArr = (long[]) m(new Object[]{p1Var, Integer.valueOf(iMax)}, -702785186, 702785220, iMax);
        jArr[0] = jArr[0] ^ 1;
        p1 p1Var3 = new p1(jArr);
        int i18 = f57620t0;
        int i19 = i18 & 105;
        int i20 = -(-((i18 ^ 105) | i19));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f57619s0 = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 65 / 0;
        }
        return p1Var3;
    }

    public static void E(long[] jArr, int i10, int i11, int[] iArr) {
        while (true) {
            int i12 = i10 ^ (-79);
            int i13 = ((((i10 & (-79)) | i12) << 1) - (~(-i12))) - 1;
            i10 = ((i13 & 79) + (i13 | 79)) - 1;
            if (i10 < i11) {
                int i14 = f57619s0;
                int i15 = ((i14 | 49) << 1) - (i14 ^ 49);
                f57620t0 = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 63 / 0;
                    return;
                }
                return;
            }
            int i17 = f57620t0;
            int i18 = i17 & 103;
            int i19 = ((((i17 ^ 103) | i18) << 1) - (~(-((i17 | 103) & (~i18))))) - 1;
            f57619s0 = i19 % 128;
            if (i19 % 2 != 0) {
                F(jArr, i10);
                throw null;
            }
            if (F(jArr, i10)) {
                int i20 = f57619s0;
                int i21 = (i20 & (-14)) | ((~i20) & 13);
                int i22 = -(-((i20 & 13) << 1));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f57620t0 = i23 % 128;
                int i24 = i23 % 2;
                m(new Object[]{jArr, 0, Integer.valueOf(i10), Integer.valueOf(i11), iArr}, 1427469539, -1427469528, 0);
                int i25 = f57619s0;
                int i26 = ((i25 ^ 104) + ((i25 & 104) << 1)) - 1;
                f57620t0 = i26 % 128;
                int i27 = i26 % 2;
            }
        }
    }

    public static boolean F(long[] jArr, int i10) {
        int i11 = f57619s0;
        int i12 = i11 & 107;
        int i13 = (i12 - (~((i11 ^ 107) | i12))) - 1;
        f57620t0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i10 >>> 6;
        long j10 = 1 << (i10 & 63);
        int i16 = -(-(i15 * 592));
        int i17 = ~i15;
        int i18 = (i17 | i15) & i17;
        int i19 = (~i18) * (-1182);
        int i20 = ((~i19) & i16) | ((~i16) & i19);
        int i21 = (i16 & i19) << 1;
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        int i23 = ~i18;
        int i24 = (i23 & i18) | (i23 ^ i18);
        int i25 = ~(i24 | (i24 ^ (-1)));
        int i26 = ~(i15 & (~0));
        int i27 = ((~i26) & i25) | ((~i25) & i26);
        int i28 = i25 & i26;
        int i29 = -(-(((i28 & i27) | (i27 ^ i28)) * (-591)));
        int i30 = i22 ^ i29;
        int i31 = ((i29 & i22) | i30) << 1;
        int i32 = -i30;
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        int i34 = -(-(((i17 ^ (-1)) | i17) * 591));
        if ((jArr[((i33 | i34) << 1) - (i34 ^ i33)] & j10) != 0) {
            int i35 = i11 & 39;
            int i36 = (i35 - (~((i11 ^ 39) | i35))) - 1;
            f57620t0 = i36 % 128;
            return !(i36 % 2 == 0);
        }
        int i37 = (((i11 | 58) << 1) - (i11 ^ 58)) - 1;
        f57620t0 = i37 % 128;
        int i38 = i37 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r11 = (com.mypinpad.tsdk.isolation.p1) r11;
        r3 = ((java.lang.Integer) m(new java.lang.Object[]{r1}, 440849681, -440849671, java.lang.System.identityHashCode(r1))).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (((java.lang.Integer) m(new java.lang.Object[]{r11}, 440849681, -440849671, java.lang.System.identityHashCode(r11))).intValue() == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r0 = ((r11 | 39) << 1) - (r11 ^ 39);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        java.lang.System.identityHashCode(r1);
        java.lang.System.identityHashCode(r1);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r4 >= r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r6 = r5 & 103;
        r7 = (~r6) & (r5 | 103);
        r6 = r6 << 1;
        r8 = (r7 & r6) + (r6 | r7);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r1.f57621p0[r4] == r11.f57621p0[r4]) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r11 = (-2) - ((r5 + 92) ^ (-1));
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if ((r11 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        r6 = ((r4 ^ 15) + ((r4 & 15) << 1)) - 1;
        r4 = r6 & (-13);
        r6 = (r6 | (-13)) & (~r4);
        r4 = -(-(r4 << 1));
        r4 = ((r6 | r4) << 1) - (r4 ^ r6);
        r6 = ((r5 | 3) << 1) - (r5 ^ 3);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        r11 = (-2) - ((com.mypinpad.tsdk.isolation.p1.f57619s0 + 112) ^ (-1));
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if ((r11 instanceof com.mypinpad.tsdk.isolation.p1) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r11 instanceof com.mypinpad.tsdk.isolation.p1) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r11 = r3 & 85;
        r0 = (~r11) & (r3 | 85);
        r11 = r11 << 1;
        r1 = (r0 & r11) + (r11 | r0);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean G(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.G(java.lang.Object[]):java.lang.Boolean");
    }

    public static void H(long[] jArr, int i10, int i11, long j10, int i12, int[] iArr) {
        int i13 = f57619s0 + 79;
        int i14 = i13 % 128;
        f57620t0 = i14;
        int i15 = i13 % 2;
        int i16 = (i11 - (~(-i12))) - 1;
        int length = iArr.length;
        int i17 = i14 + 111;
        f57619s0 = i17 % 128;
        int i18 = i17 % 2;
        while (true) {
            int i19 = length ^ 122;
            int i20 = ((length & 122) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 & i21) + (i21 | i20);
            int i23 = i22 & (-123);
            length = ((i22 ^ (-123)) | i23) + i23;
            if (length < 0) {
                m(new Object[]{jArr, Integer.valueOf(i10), Integer.valueOf(i16), Long.valueOf(j10)}, 1074244935, -1074244932, i10);
                int i24 = f57619s0;
                int i25 = i24 & 103;
                int i26 = -(-((i24 ^ 103) | i25));
                int i27 = (i25 & i26) + (i26 | i25);
                f57620t0 = i27 % 128;
                int i28 = i27 % 2;
                return;
            }
            int i29 = f57620t0;
            int i30 = (i29 & 61) + (i29 | 61);
            f57619s0 = i30 % 128;
            if (i30 % 2 != 0) {
                m(new Object[]{jArr, Integer.valueOf(i10), Integer.valueOf(i16 << iArr[length]), Long.valueOf(j10)}, 1074244935, -1074244932, i10);
            } else {
                int i31 = -(-iArr[length]);
                m(new Object[]{jArr, Integer.valueOf(i10), Integer.valueOf(((((~i31) & i16) | ((~i16) & i31)) - (~(-(-((i31 & i16) << 1))))) - 1), Long.valueOf(j10)}, 1074244935, -1074244932, i10);
            }
        }
    }

    public static /* synthetic */ void I(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr = (int[]) objArr[2];
        int i10 = f57619s0;
        int i11 = (((i10 | 12) << 1) - (i10 ^ 12)) - 1;
        f57620t0 = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr = p1Var.f57621p0;
        int iIntValue2 = ((Integer) m(new Object[]{jArr, 0, Integer.valueOf(jArr.length), Integer.valueOf(iIntValue), iArr}, -456521769, 456521800, 0)).intValue();
        if (iIntValue2 < jArr.length) {
            int i13 = f57620t0 + 95;
            f57619s0 = i13 % 128;
            int i14 = i13 % 2;
            long[] jArr2 = new long[iIntValue2];
            p1Var.f57621p0 = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, iIntValue2);
        }
        int i15 = f57620t0;
        int i16 = (-2) - (((i15 & 42) + (i15 | 42)) ^ (-1));
        f57619s0 = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i11 = f57619s0;
        int i12 = (((i11 & (-20)) | ((~i11) & 19)) - (~((i11 & 19) << 1))) - 1;
        f57620t0 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = iIntValue & 1;
            int i14 = ((iIntValue ^ 1) | i13) << 1;
            int i15 = -((~i13) & (iIntValue | 1));
            i10 = (i14 ^ i15) + ((i14 & i15) << 1);
        } else {
            i10 = iIntValue << 1;
        }
        int i16 = i11 + 89;
        f57620t0 = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            iIntValue = (iIntValue << 1) + (iIntValue ^ (-1));
            if (iIntValue < 0) {
                break;
            }
            int i18 = f57620t0;
            int i19 = i18 & 17;
            int i20 = -(-(i18 | 17));
            int i21 = (i19 & i20) + (i20 | i19);
            f57619s0 = i21 % 128;
            int i22 = i21 % 2;
            long j10 = jArr[iIntValue];
            int i23 = ((i10 ^ (-107)) | (i10 & (-107))) << 1;
            int i24 = -(((~i10) & (-107)) | (i10 & 106));
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            int i26 = i25 & 106;
            int i27 = (((~i26) & (i25 | 106)) - (~(i26 << 1))) - 1;
            int i28 = (int) (j10 >>> 32);
            jArr[i27] = ((Long) m(new Object[]{Integer.valueOf(i28)}, 559780327, -559780298, i28)).longValue();
            int i29 = i27 & 5;
            int i30 = (i29 - (~((i27 ^ 5) | i29))) - 1;
            i10 = ((i30 & (-6)) - (~(-(-(i30 | (-6)))))) - 1;
            int i31 = (int) j10;
            jArr[i10] = ((Long) m(new Object[]{Integer.valueOf(i31)}, 559780327, -559780298, i31)).longValue();
        }
        int i32 = f57620t0;
        int i33 = (-2) - (((i32 ^ 54) + ((i32 & 54) << 1)) ^ (-1));
        f57619s0 = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 8 / 0;
        }
    }

    public static /* synthetic */ Long b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i10 = f57620t0;
        int i11 = i10 & 37;
        int i12 = (i10 ^ 37) | i11;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f57619s0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = -iIntValue4;
        int i16 = (i15 * (-589)) - (-37824);
        int i17 = ~iIntValue;
        int i18 = (i17 | iIntValue) & i17;
        int i19 = ~i18;
        int i20 = ~(((-65) & i19) | (i18 & 64) | ((-65) & i18));
        int i21 = ~i15;
        int i22 = ((-65) & i21) | (i15 & 64);
        int i23 = (-65) & i15;
        int i24 = ~((i22 ^ i23) | (i22 & i23));
        int i25 = i20 ^ i24;
        int i26 = i20 & i24;
        int i27 = (i25 & i26) | (i25 ^ i26);
        int i28 = i17 & i15;
        int i29 = (~i28) & (i17 | i15);
        int i30 = ~((i29 ^ i28) | (i29 & i28));
        int i31 = i27 ^ i30;
        int i32 = i27 & i30;
        int i33 = (i32 & i31) | (i31 ^ i32);
        int i34 = (i21 | i15) & i21;
        int i35 = i34 & 64;
        int i36 = (i34 | 64) & (~i35);
        int i37 = (i36 & i35) | (i36 ^ i35);
        int i38 = ~((i37 & iIntValue) | (i37 ^ iIntValue));
        int i39 = -(-(((i33 & i38) | ((~i38) & i33) | ((~i33) & i38)) * 590));
        int i40 = i16 & i39;
        int i41 = (i39 ^ i16) | i40;
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = (-65) ^ i17;
        int i44 = (-65) & i17;
        int i45 = (i43 & i44) | (i43 ^ i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = (-65) ^ i15;
        int i49 = ~((i48 & i23) | (i48 ^ i23));
        int i50 = (i49 & i47) | (i47 ^ i49);
        int i51 = (i18 & i21) | (i15 & i19);
        int i52 = i15 & i18;
        int i53 = ~((i51 & i52) | (i51 ^ i52));
        int i54 = i50 & i53;
        int i55 = (((i50 | i53) & (~i54)) | i54) * (-1180);
        int i56 = (((~i55) & i42) | ((~i42) & i55)) + ((i55 & i42) << 1);
        int i57 = i21 & i17;
        int i58 = ~(i57 | ((i21 | i17) & (~i57)));
        int i59 = ~((i17 ^ 64) | (i17 & 64));
        int i60 = i58 ^ i59;
        int i61 = i58 & i59;
        int i62 = -(~(((i61 & i60) | (i60 ^ i61)) * 590));
        int i63 = (((i56 | i62) << 1) - (i62 ^ i56)) - 1;
        int i64 = (i10 & 66) + (i10 | 66);
        int i65 = (i64 ^ (-1)) + (i64 << 1);
        f57619s0 = i65 % 128;
        int i66 = 2;
        int i67 = i65 % 2;
        long j10 = 0;
        int i68 = 0;
        while (i68 < iIntValue3) {
            int i69 = f57619s0;
            int i70 = i69 + 79;
            f57620t0 = i70 % 128;
            int i71 = i70 % i66;
            int i72 = i68 * 253;
            int i73 = -(-(iIntValue * 253));
            int i74 = i72 | i73;
            int i75 = (i74 << 1) - ((~(i72 & i73)) & i74);
            int i76 = ~i68;
            int i77 = (i76 | i68) & i76;
            int i78 = i77 & i17;
            int i79 = (i77 | i17) & (~i78);
            int i80 = ~((i79 & i78) | (i79 ^ i78));
            int i81 = i17 & i17;
            int i82 = (~i81) & (i17 | i17);
            int i83 = (i82 ^ i81) | (i81 & i82);
            int i84 = ~i83;
            int i85 = iIntValue3;
            int i86 = ((~i80) & i84) | ((~i84) & i80);
            int i87 = i80 & i84;
            int i88 = (i86 & i87) | (i86 ^ i87);
            int i89 = i68 & iIntValue;
            int i90 = (i68 ^ iIntValue) | i89;
            int i91 = i63;
            int i92 = (i90 & i17) | ((~i90) & iIntValue);
            int i93 = i90 & iIntValue;
            int i94 = ~((i92 ^ i93) | (i92 & i93));
            int i95 = i88 ^ i94;
            int i96 = i94 & i88;
            int i97 = ((i96 & i95) | (i95 ^ i96)) * (-252);
            int i98 = ((((i75 ^ i97) | (i75 & i97)) << 1) - (~(-((i97 & (~i75)) | ((~i97) & i75))))) - 1;
            int i99 = i68 & i17;
            int i100 = (iIntValue & i76) | i99;
            int i101 = -(-(((i100 & i89) | (i100 ^ i89)) * (-252)));
            int i102 = i98 & i101;
            int i103 = -(-((i98 ^ i101) | i102));
            int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
            int i105 = (i83 & i76) | (i68 & i84);
            int i106 = i83 & i68;
            int i107 = ~((i105 & i106) | (i105 ^ i106));
            int i108 = i68 | iIntValue;
            int i109 = i108 | iIntValue;
            int i110 = ~i109;
            int i111 = (i109 | i110) & i110;
            long j11 = j10;
            int i112 = ((~i107) & i111) | ((~i111) & i107);
            int i113 = i107 & i111;
            long j12 = jArr[(((i113 & i112) | (i112 ^ i113)) * 252) + i104];
            int i114 = i68 * 165;
            int i115 = -(-(iIntValue2 * (-163)));
            int i116 = i114 & i115;
            int i117 = (i116 - (~(-(-((i114 ^ i115) | i116))))) - 1;
            int i118 = ~((i17 ^ iIntValue2) | (i17 & iIntValue2));
            int i119 = ((~i118) & i68) | (i118 & i76);
            int i120 = i118 & i68;
            int i121 = (i117 - (~(((i120 & i119) | (i119 ^ i120)) * (-328)))) - 1;
            int i122 = (~i89) & i108;
            int i123 = -(~(((i122 & i89) | (i122 ^ i89)) * 164));
            int i124 = ((i121 & i123) + (i123 | i121)) - 1;
            int i125 = ~iIntValue2;
            int i126 = (i76 ^ i125) | (i76 & i125);
            int i127 = ~i126;
            int i128 = (i126 | i127) & i127;
            int i129 = i125 ^ iIntValue;
            int i130 = i125 & iIntValue;
            int i131 = ~((i130 & i129) | (i129 ^ i130));
            int i132 = i128 & i131;
            int i133 = ((i131 | i128) & (~i132)) | i132;
            int i134 = (i76 & i17) | ((~i17) & i68);
            int i135 = (i134 & i99) | (i134 ^ i99);
            int i136 = ~((i135 & iIntValue2) | (i135 ^ iIntValue2));
            int i137 = -(-(((i136 & i133) | (i133 ^ i136)) * 164));
            jArr2[((i124 ^ i137) - (~((i137 & i124) << 1))) - 1] = (j12 << iIntValue4) | j11;
            j10 = j12 >>> i91;
            i68 = ((i68 & 1) << 1) + (i68 ^ 1);
            int i138 = i69 + 65;
            f57620t0 = i138 % 128;
            int i139 = i138 % 2;
            iIntValue3 = i85;
            i63 = i91;
            i66 = 2;
        }
        long j13 = j10;
        int i140 = f57620t0;
        int i141 = i140 & 121;
        int i142 = (i140 | 121) & (~i141);
        int i143 = -(-(i141 << 1));
        int i144 = (i142 & i143) + (i142 | i143);
        f57619s0 = i144 % 128;
        if (i144 % 2 == 0) {
            return Long.valueOf(j13);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (r6 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.p1.f57619s0 + 29;
        r3 = r2 % 128;
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r2 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        r0 = r3 & 39;
        r2 = (r3 ^ 39) | r0;
        r3 = (r0 & r2) + (r0 | r2);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if ((r3 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        r1 = (com.mypinpad.tsdk.isolation.p1) m(new java.lang.Object[]{r1}, -272341761, 272341791, java.lang.System.identityHashCode(r1));
        r8 = r3 * (-183);
        r10 = (((-11529) ^ r8) | ((-11529) & r8)) << 1;
        r8 = -((r8 & 11528) | ((-11529) & (~r8)));
        r9 = (r10 & r8) + (r8 | r10);
        r8 = ~r3;
        r10 = (r8 | r3) & r8;
        r11 = ~r10;
        r13 = ((-64) & r11) | (r10 & 63);
        r14 = (-64) & r10;
        r13 = (r13 & r14) | (r13 ^ r14);
        r15 = r13 & r3;
        r7 = (~r15) & (r13 | r3);
        r7 = ~((r7 & r15) | (r7 ^ r15));
        r13 = r8 & r8;
        r15 = (~r13) & (r8 | r8);
        r13 = (r15 ^ r13) | (r13 & r15);
        r15 = r13 & 63;
        r4 = (~r15) & (r13 | 63);
        r4 = ~((r4 & r15) | (r4 ^ r15));
        r13 = ((~r4) & r7) | ((~r7) & r4);
        r4 = r4 & r7;
        r4 = ((r4 & r13) | (r13 ^ r4)) * (-184);
        r7 = (((r9 ^ r4) | (r9 & r4)) << 1) - ((r4 & (~r9)) | ((~r4) & r9));
        r4 = (-64) ^ r10;
        r4 = ~((r4 & r14) | (r4 ^ r14));
        r9 = ~((-64) | r8);
        r12 = ((~r9) & r4) | ((~r4) & r9);
        r4 = r4 & r9;
        r4 = (r4 & r12) | (r12 ^ r4);
        r9 = r10 & r8;
        r9 = ~(r9 | ((~r9) & (r10 | r8)));
        r12 = r4 & r9;
        r4 = (r4 | r9) & (~r12);
        r4 = ((r4 & r12) | (r4 ^ r12)) * 184;
        r9 = r7 & r4;
        r4 = ((r4 | r7) & (~r9)) + (r9 << 1);
        r7 = -(-(((r3 ^ 63) | (r3 & 63)) * 184));
        r4 = (((r4 & r7) - (~(r4 | r7))) - 1) >>> 6;
        r7 = new com.mypinpad.tsdk.isolation.p1(r4);
        m(new java.lang.Object[]{r7.f57621p0, 0, java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r3), r5}, 1427469539, -1427469528, 0);
        r5 = new com.mypinpad.tsdk.isolation.p1(r4);
        r5.f57621p0[0] = 1;
        r13 = new com.mypinpad.tsdk.isolation.p1(r4);
        r4 = r3 & 1;
        r15 = (~r4) & (r3 | 1);
        r12 = -(-(r4 << 1));
        r6 = new int[]{r6, (r15 ^ r12) + ((r12 & r15) << 1)};
        r15 = new com.mypinpad.tsdk.isolation.p1[]{r1, r7};
        r1 = new int[]{1, 0};
        r7 = new com.mypinpad.tsdk.isolation.p1[]{r5, r13};
        r5 = r6[1];
        r12 = r1[1];
        r13 = -r6[0];
        r0 = r13 * (-1529);
        r9 = -(-(r5 * (-764)));
        r19 = (r0 ^ r9) + ((r0 & r9) << 1);
        r0 = ~r13;
        r9 = ~r5;
        r14 = (~r9) & r0;
        r2 = ~r0;
        r14 = (r14 | (r9 & r2)) | (r0 & r9);
        r14 = (r14 ^ r8) | (r14 & r8);
        r12 = ~r14;
        r12 = r12 & (r14 | r12);
        r14 = (r0 | r13) & r0;
        r22 = r14 | r5;
        r23 = r22 ^ r3;
        r22 = r22 & r3;
        r7 = ~((r23 ^ r22) | (r23 & r22));
        r7 = (r12 ^ r7) | (r7 & r12);
        r12 = (r9 | r5) & r9;
        r22 = r12 ^ r13;
        r24 = r12 & r13;
        r22 = (r22 ^ r24) | (r22 & r24);
        r5 = -(-(((~((r22 ^ r3) | (r22 & r3))) | r7) * 765));
        r7 = r19 & r5;
        r5 = (r19 | r5) & (~r7);
        r7 = -(-(r7 << 1));
        r19 = (r5 ^ r7) + ((r5 & r7) << 1);
        r5 = (r14 ^ r9) | (r14 & r9);
        r7 = ~r5;
        r5 = (r5 | r7) & r7;
        r2 = ~(((r2 & r10) | (r0 & r11)) | (r0 & r10));
        r7 = r5 ^ r2;
        r2 = r2 & r5;
        r2 = ((r2 & r7) | (r7 ^ r2)) * 1530;
        r7 = r19 & r2;
        r5 = ((r19 ^ r2) | r7) << 1;
        r2 = -((r19 | r2) & (~r7));
        r7 = (r5 & r2) + (r2 | r5);
        r2 = r0 & r3;
        r0 = (r0 | r3) & (~r2);
        r0 = ~((r0 & r2) | (r0 ^ r2));
        r2 = r12 & r8;
        r5 = (~r2) & (r12 | r8);
        r9 = ~r8;
        r2 = (r2 & r5) | (r5 ^ r2);
        r5 = r2 & r13;
        r2 = (r2 | r13) & (~r5);
        r2 = (r2 & r5) | (r2 ^ r5);
        r5 = ~r2;
        r2 = (r2 | r5) & r5;
        r0 = -(-(((r0 & r2) | (r0 ^ r2)) * 765));
        r2 = r7 ^ r0;
        r0 = (((r0 & r7) | r2) << 1) - r2;
        r2 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r5 = r2 & 79;
        r2 = -(-((r2 ^ 79) | r5));
        r7 = (r5 & r2) + (r2 | r5);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r7 % 128;
        r7 = r7 % 2;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0277, code lost:
    
        if (r0 >= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0279, code lost:
    
        r12 = r12;
        r5 = r5;
        r13 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r14 = (r13 | 89) << 1;
        r13 = -(r13 ^ 89);
        r13 = (r14 ^ r13) + ((r13 & r14) << 1);
        r14 = r13 % 128;
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r14;
        r13 = r13 % 2;
        r0 = -r0;
        r6[r2] = r5;
        r1[r2] = r12;
        r2 = -r2;
        r5 = r2 * 881;
        r12 = (r5 ^ 881) + ((r5 & 881) << 1);
        r5 = ~r2;
        r13 = r5 ^ (-2);
        r15 = r5 & (-2);
        r13 = ~((r13 ^ r15) | (r13 & r15));
        r5 = r5 & (r5 | r2);
        r7 = ~r5;
        r15 = (r5 & r8) | (r3 & r7);
        r21 = r5 & r3;
        r15 = ~((r15 ^ r21) | (r15 & r21));
        r0 = r13 & r15;
        r0 = r0 | ((~r0) & (r13 | r15));
        r13 = ((-2) & r8) | r4;
        r15 = (-2) & r3;
        r9 = ~((r13 ^ r15) | (r13 & r15));
        r13 = r0 & r9;
        r0 = (r0 | r9) & (~r13);
        r0 = ((r0 & r13) | (r0 ^ r13)) * (-880);
        r9 = ((((~r0) & r12) | ((~r12) & r0)) - (~(-(-((r0 & r12) << 1))))) - 1;
        r0 = (r5 & r11) | (r7 & r10);
        r5 = r5 & r10;
        r0 = ~((r0 & r5) | (r0 ^ r5));
        r5 = r0 & 1;
        r0 = (r0 | 1) & (~r5);
        r0 = (r0 & r5) | (r0 ^ r5);
        r2 = ~((r2 & r3) | (r2 ^ r3));
        r5 = r0 & r2;
        r0 = -(-((((r0 | r2) & (~r5)) | r5) * (-880)));
        r5 = (r9 ^ r0) + ((r0 & r9) << 1);
        r2 = r2 * 880;
        r0 = r5 & r2;
        r2 = (r2 ^ r5) | r0;
        r2 = (r0 ^ r2) + ((r0 & r2) << 1);
        r5 = r6[r2];
        r12 = r1[r2];
        r0 = (r14 & (-4)) | ((~r14) & 3);
        r7 = (r14 & 3) << 1;
        r13 = (r0 ^ r7) + ((r0 & r7) << 1);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r13 % 128;
        r13 = r13 % 2;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0339, code lost:
    
        r12 = r12;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x033b, code lost:
    
        r7 = r15[r2];
        r9 = -r2;
        r13 = r9 * (-405);
        r13 = (-2) - (((r13 ^ mx.openpay.library.domain.util.Constant.ERROR_CODE_408) + ((r13 & mx.openpay.library.domain.util.Constant.ERROR_CODE_408) << 1)) ^ (-1));
        r15 = (-2) & r8;
        r21 = r15 | r4;
        r25 = (-2) & r3;
        r14 = ~((r21 ^ r25) | (r21 & r25));
        r25 = r8 & r9;
        r21 = (r8 ^ r9) | r25;
        r26 = r21 ^ 1;
        r21 = r21 & 1;
        r27 = r26 ^ r21;
        r21 = r26 & r21;
        r26 = r4;
        r4 = ~(r27 | r21);
        r21 = r12;
        r12 = r14 & r4;
        r27 = r1;
        r1 = (((~r12) & (r4 | r14)) | r12) * (-406);
        r4 = r13 & r1;
        r1 = ((r1 | r13) & (~r4)) + (r4 << 1);
        r12 = (-2) & r10;
        r4 = (~r12) & ((-2) | r10);
        r4 = (r4 & r12) | (r4 ^ r12);
        r13 = r4 & r9;
        r4 = -(-((~(((r4 | r9) & (~r13)) | r13)) * (-406)));
        r14 = r1 & r4;
        r13 = ((r1 ^ r4) | r14) << 1;
        r1 = -((r1 | r4) & (~r14));
        r4 = (r13 & r1) + (r1 | r13);
        r1 = ~r9;
        r13 = r1 & r3;
        r14 = (~r13) & (r1 | r3);
        r14 = ~((r14 ^ r13) | (r14 & r13));
        r28 = r15 | (r9 & 1);
        r29 = r8 & 1;
        r31 = r11;
        r11 = ~((r28 ^ r29) | (r28 & r29));
        r12 = r14 & r11;
        r30 = r10;
        r10 = (~r12) & (r14 | r11);
        r10 = ((r10 & r12) | (r10 ^ r12)) * 406;
        r4 = r15[(r4 ^ r10) + ((r4 & r10) << 1)];
        r10 = (r9 * 51) - 49;
        r12 = r25 | r13;
        r13 = r9 & r3;
        r12 = -(-(((r12 & r13) | (r12 ^ r13)) * (-50)));
        r13 = r10 & r12;
        r10 = -(-(r10 | r12));
        r12 = (r13 & r10) + (r10 | r13);
        r10 = (r1 | r9) & r1;
        r13 = r10 ^ (-2);
        r14 = r10 & (-2);
        r13 = (r13 ^ r14) | (r13 & r14);
        r11 = (r13 & r8) | ((~r13) & r3);
        r13 = r13 & r3;
        r11 = (r11 ^ r13) | (r11 & r13);
        r13 = ~r11;
        r11 = (r11 | r13) & r13;
        r13 = ((-2) & r9) | r29;
        r13 = (r13 ^ r15) | (r13 & r15);
        r34 = r3;
        r3 = (r13 ^ r9) | (r13 & r9);
        r15 = ~r3;
        r3 = (r3 | r15) & r15;
        r10 = ((~r11) & r3) | ((~r3) & r11);
        r3 = r3 & r11;
        r3 = -(-(((r3 & r10) | (r10 ^ r3)) * 50));
        r10 = r12 | r3;
        r11 = ((r10 << 1) - (~(-((~(r3 & r12)) & r10)))) - 1;
        r3 = ~r13;
        r13 = (-2) & r9;
        r10 = ~(((-2) ^ r9) | r13);
        r12 = r3 ^ r10;
        r3 = r3 & r10;
        r3 = (r3 & r12) | (r12 ^ r3);
        r10 = r8 & r1;
        r12 = ~(((r9 & r9) | r10) | r25);
        r15 = r3 & r12;
        r3 = (r3 | r12) & (~r15);
        r11 = r6[(r11 - (~(-(-(((r3 & r15) | (r3 ^ r15)) * 50))))) - 1];
        m(new java.lang.Object[]{r7, r4, java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r0)}, -496395393, 496395415, r11);
        r13 = ((java.lang.Integer) m(new java.lang.Object[]{r15[r2], java.lang.Integer.valueOf(r5)}, -119891106, 119891127, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x04b0, code lost:
    
        if (r13 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x04b2, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r2 = (((r0 | 34) << 1) - (r0 ^ 34)) - 1;
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r2 % 128;
        r2 = r2 % 2;
        r2 = r9 * (-183);
        r4 = r2 & (-183);
        r3 = ((((r2 ^ (-183)) | r4) << 1) - (~(-((r2 | (-183)) & (~r4))))) - 1;
        r2 = (r1 ^ r8) | r10;
        r4 = (r2 & (-2)) | ((~r2) & 1);
        r2 = r2 & 1;
        r2 = ~((r2 & r4) | (r4 ^ r2));
        r5 = (-2) ^ r30;
        r4 = (r5 ^ r12) | (r5 & r12);
        r5 = (r4 & r1) | ((~r4) & r9);
        r4 = r4 & r9;
        r4 = ~((r4 & r5) | (r5 ^ r4));
        r5 = ((~r4) & r2) | ((~r2) & r4);
        r2 = r2 & r4;
        r2 = -(-(((r2 & r5) | (r5 ^ r2)) * (-184)));
        r4 = r3 & r2;
        r2 = (r2 ^ r3) | r4;
        r3 = (r4 ^ r2) + ((r2 & r4) << 1);
        r2 = (~r14) & (r10 | (-2));
        r2 = ~((r2 & r14) | (r2 ^ r14));
        r4 = (r1 & r31) | (r30 & (~r1));
        r5 = r1 & r30;
        r4 = ~((r4 & r5) | (r4 ^ r5));
        r2 = (r2 & r4) | (r2 ^ r4);
        r4 = (~r15) & ((-2) | r8);
        r4 = ~((r4 & r15) | (r4 ^ r15));
        r5 = r2 & r4;
        r2 = -(-((((r2 | r4) & (~r5)) | r5) * 184));
        r4 = r3 & r2;
        r4 = r4 + ((r2 ^ r3) | r4);
        r1 = r13 | (r1 & 1);
        r3 = r9 & 1;
        r1 = ((r1 & r3) | (r1 ^ r3)) * 184;
        r1 = r7[(r4 ^ r1) + ((r1 & r4) << 1)];
        r3 = r0 & 27;
        r3 = (r3 - (~((r0 ^ 27) | r3))) - 1;
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0561, code lost:
    
        if ((r3 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0563, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0565, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0566, code lost:
    
        r15 = r9 * 398;
        r4 = r15 & (-396);
        r4 = (r4 - (~((r15 ^ (-396)) | r4))) - 1;
        r10 = ~(r10 | ((~r10) & (r1 | r8)));
        r15 = r10 & 1;
        r3 = ~((((~r10) & 1) | r14) | r15);
        r35 = r6;
        r6 = ((~r10) & r3) | ((~r3) & r10);
        r3 = r3 & r10;
        r3 = (r3 & r6) | (r6 ^ r3);
        r7 = ((~r11) & r3) | ((~r3) & r11);
        r3 = r3 & r11;
        r3 = ((r3 & r7) | (r7 ^ r3)) * (-397);
        r6 = (((~r3) & r4) | ((~r4) & r3)) + ((r3 & r4) << 1);
        r3 = (~r15) & (r10 | 1);
        r3 = -(-((~((r3 & r15) | (r3 ^ r15))) * (-397)));
        r4 = r6 & r3;
        r3 = r3 | r6;
        r6 = (r4 ^ r3) + ((r3 & r4) << 1);
        r3 = r1 & 1;
        r1 = ~(((r1 | 1) & (~r3)) | r3);
        r1 = (r34 & r1) | ((r34 & (~r1)) | (r1 & r8));
        r7 = (~r13) & ((-2) | r9);
        r7 = ~((r7 & r13) | (r7 ^ r13));
        r10 = r1 & r7;
        r1 = -(~(-(-((((r1 | r7) & (~r10)) | r10) * 397))));
        r1 = r27[((r6 ^ r1) + ((r1 & r6) << 1)) - 1];
        r6 = r7[r2];
        r7 = (r9 * 253) + 253;
        r10 = ((~r14) & (r10 | (-2))) | r14;
        r12 = ~r10;
        r10 = (r10 | r12) & r12;
        r12 = (~r15) & ((-2) | r8);
        r11 = (r15 & r12) | (r12 ^ r15);
        r10 = r10 | (~r11);
        r12 = r9 & 1;
        r15 = r9 | 1;
        r14 = ((~r12) & r15) | r12;
        r14 = (r14 ^ r34) | (r14 & r34);
        r19 = r8;
        r8 = ~r14;
        r8 = r8 & (r14 | r8);
        r8 = -(-(((r8 & r10) | (((~r10) & r8) | ((~r8) & r10))) * (-252)));
        r13 = r7 & r8;
        r10 = ((r7 ^ r8) | r13) << 1;
        r7 = -((r7 | r8) & (~r13));
        r8 = (r10 ^ r7) + ((r7 & r10) << 1);
        r3 = r3 | r13;
        r3 = -(-(((r3 & r12) | (r3 ^ r12)) * (-252)));
        r7 = r8 & r3;
        r4 = ((r8 ^ r3) | r7) << 1;
        r3 = -((r3 | r8) & (~r7));
        r7 = (r4 & r3) + (r3 | r4);
        r3 = r11 & r9;
        r4 = (~r3) & (r11 | r9);
        r3 = ~((r3 & r4) | (r4 ^ r3));
        r4 = r15 & r34;
        r4 = r4 | ((~r4) & (r15 | r34));
        r8 = ~r4;
        r4 = (r4 | r8) & r8;
        r8 = ((~r4) & r3) | ((~r3) & r4);
        r3 = r3 & r4;
        m(new java.lang.Object[]{r6, r7[(r7 - (~(((r3 & r8) | (r8 ^ r3)) * 252))) - 1], java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r0)}, -496395393, 496395415, r1);
        r1 = r1 + r0;
        r12 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0696, code lost:
    
        if (r1 <= r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0698, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r6 = r3 & 107;
        r3 = -(-((r3 ^ 107) | r6));
        r8 = ((r6 | r3) << 1) - (r3 ^ r6);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x06ad, code lost:
    
        if ((r8 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x06af, code lost:
    
        r3 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x06b3, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x06b7, code lost:
    
        if (r1 != r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x06b9, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.p1.f57619s0 + 69;
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x06c3, code lost:
    
        if ((r1 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x06c5, code lost:
    
        r1 = ((java.lang.Integer) m(new java.lang.Object[]{r7[r2], java.lang.Integer.valueOf(r12)}, -119891106, 119891127, r12)).intValue();
        r3 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r6 = r3 & 7;
        r3 = (((r3 | 7) & (~r6)) - (~(r6 << 1))) - 1;
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x06f7, code lost:
    
        ((java.lang.Integer) m(new java.lang.Object[]{r7[r2], java.lang.Integer.valueOf(r12)}, -119891106, 119891127, r12)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0716, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0717, code lost:
    
        r5 = -r5;
        r6 = r5 * 960;
        r13 = r13 * (-1917);
        r9 = ((~r13) & r6) | ((~r6) & r13);
        r6 = -(-((r6 & r13) << 1));
        r10 = (r9 & r6) + (r6 | r9);
        r6 = ~r13;
        r9 = (r6 | r13) & r6;
        r11 = (r9 & r31) | (r30 & (~r9));
        r9 = r9 & r30;
        r9 = ~((r9 & r11) | (r11 ^ r9));
        r11 = r5 & r34;
        r13 = (~r11) & (r5 | r34);
        r11 = ~((r11 & r13) | (r13 ^ r11));
        r10 = (((r10 - (~(((r9 & r11) | (r9 ^ r11)) * 959))) - 1) - (~(-(-(r6 * (-959)))))) - 1;
        r9 = (r6 & r19) | (r34 & (~r6));
        r6 = r6 & r34;
        r6 = ~((r6 & r9) | (r9 ^ r6));
        r9 = (r30 & (~r5)) | (r5 & r31);
        r5 = r30 & r5;
        r5 = ~((r5 & r9) | (r9 ^ r5));
        r9 = r6 ^ r5;
        r5 = r5 & r6;
        r5 = -(-(((r5 & r9) | (r9 ^ r5)) * 959));
        r6 = ((~r5) & r10) | ((~r10) & r5);
        r5 = (r5 & r10) << 1;
        r9 = (r6 & r5) + (r5 | r6);
        r5 = r9 * 960;
        r6 = r0 * (-1917);
        r10 = r5 & r6;
        r5 = (((r5 | r6) & (~r10)) - (~(-(-(r10 << 1))))) - 1;
        r6 = ~r0;
        r10 = r6 & r19;
        r11 = (~r10) & (r6 | r19);
        r11 = (r11 & r10) | (r11 ^ r10);
        r13 = ~r11;
        r11 = (r11 | r13) & r13;
        r13 = (r9 ^ r34) | (r9 & r34);
        r14 = ~r13;
        r13 = (r13 | r14) & r14;
        r14 = r11 & r13;
        r11 = (r11 | r13) & (~r14);
        r11 = ((r11 & r14) | (r11 ^ r14)) * 959;
        r13 = (r5 ^ r11) + ((r5 & r11) << 1);
        r0 = -(-(((r0 | r6) & r6) * (-959)));
        r5 = r13 & r0;
        r0 = ((r0 | r13) & (~r5)) + (r5 << 1);
        r5 = (r34 & (~r6)) | r10;
        r6 = r6 & r34;
        r5 = (r5 & r6) | (r5 ^ r6);
        r6 = ~r5;
        r5 = (r5 | r6) & r6;
        r6 = (r30 & (~r9)) | (r9 & r31);
        r9 = r30 & r9;
        r6 = ~((r6 & r9) | (r6 ^ r9));
        r9 = r5 & r6;
        r5 = (r5 | r6) & (~r9);
        r5 = -(-(((r5 & r9) | (r5 ^ r9)) * 959));
        r6 = (r0 | r5) << 1;
        r0 = -(r0 ^ r5);
        r0 = ((r6 | r0) << 1) - (r0 ^ r6);
        r5 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r6 = (r5 ^ 5) + ((r5 & 5) << 1);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r6 % 128;
        r6 = r6 % 2;
        r5 = r13;
        r8 = r19;
        r9 = r9;
        r4 = r26;
        r1 = r27;
        r10 = r30;
        r11 = r31;
        r3 = r34;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0828, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        if (r6 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if (r6 != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.p1 c(java.lang.Object[] r36) {
        /*
            Method dump skipped, instruction units count: 2089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.c(java.lang.Object[]):com.mypinpad.tsdk.i.p1");
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f57620t0 + 81;
        int i11 = i10 % 128;
        f57619s0 = i11;
        int i12 = i10 % 2;
        int i13 = iIntValue2 >>> 6;
        long j10 = 1 << (iIntValue2 & 63);
        int i14 = i13 * 595;
        int i15 = -(-(iIntValue * (-1187)));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = ~i13;
        int i18 = ~iIntValue;
        int i19 = i17 & i18;
        int i20 = ((~i17) & iIntValue) | i19;
        int i21 = i17 & iIntValue;
        int i22 = ~((i20 & i21) | (i20 ^ i21));
        int i23 = i18 & iIntValue;
        int i24 = ~((i18 ^ iIntValue) | i23);
        int i25 = ((i22 ^ i24) | (i22 & i24)) * (-1188);
        int i26 = ((i16 ^ i25) | (i16 & i25)) << 1;
        int i27 = -(((~i25) & i16) | ((~i16) & i25));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        int i29 = (~i21) & (i17 | iIntValue);
        int i30 = ~((i29 & i21) | (i29 ^ i21));
        int i31 = i18 & i18;
        int i32 = ~i18;
        int i33 = ~((iIntValue & i32) | i31 | i23);
        int i34 = (i30 & i33) | (i30 ^ i33);
        int i35 = i19 | (i32 & i13);
        int i36 = i18 & i13;
        int i37 = (i35 & i36) | (i35 ^ i36);
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = i34 & i39;
        int i41 = (i34 | i39) & (~i40);
        int i42 = -(-(((i41 & i40) | (i41 ^ i40)) * 594));
        int i43 = ((i28 ^ i42) - (~(-(-((i42 & i28) << 1))))) - 1;
        int i44 = (~i31) & (i18 | i18);
        int i45 = (i44 & i31) | (i44 ^ i31);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = (iIntValue | i18) & i18;
        int i49 = i48 & i13;
        int i50 = (i48 ^ i13) | i49;
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = ((~i52) & i47) | ((~i47) & i52);
        int i54 = i47 & i52;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~(((i48 | i13) & (~i49)) | i49);
        int i57 = ((i56 & i55) | ((~i56) & i55) | ((~i55) & i56)) * 594;
        int i58 = i43 ^ i57;
        int i59 = -(-((i57 & i43) << 1));
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        jArr[i60] = jArr[i60] ^ j10;
        int i61 = i11 & 17;
        int i62 = (i61 - (~((i11 ^ 17) | i61))) - 1;
        f57620t0 = i62 % 128;
        if (i62 % 2 == 0) {
            throw null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6811. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static /* synthetic */ java.lang.Integer e(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.e(java.lang.Object[]):java.lang.Integer");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00fc A[DONT_INVERT, PHI: r0
      0x00fc: PHI (r0v27 byte) = (r0v16 byte), (r0v30 byte) binds: [B:18:0x00fa, B:15:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[SYNTHETIC] */
    public static /* synthetic */ BigInteger f(Object[] objArr) {
        long j10;
        int i10;
        byte b10;
        p1 p1Var = (p1) objArr[0];
        int i11 = f57620t0;
        int i12 = (i11 & (-16)) | ((~i11) & 15);
        int i13 = -(-((i11 & 15) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f57619s0 = i14 % 128;
        int i15 = i14 % 2;
        int iIntValue = ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue();
        if (iIntValue == 0) {
            int i16 = f57619s0 + 85;
            f57620t0 = i16 % 128;
            if (i16 % 2 != 0) {
                return apj.setY;
            }
            BigInteger bigInteger = apj.setY;
            throw null;
        }
        long[] jArr = p1Var.f57621p0;
        int iIdentityHashCode = System.identityHashCode(p1Var);
        int i17 = -(-(iIntValue * (-195)));
        int i18 = (391 | i17) << 1;
        int i19 = -((i17 & (-392)) | (391 & (~i17)));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        int i21 = ~iIntValue;
        int i22 = ~i21;
        int i23 = ~(i22 | i21);
        int i24 = (i21 & iIdentityHashCode) | ((~iIdentityHashCode) & iIntValue);
        int i25 = iIntValue & iIdentityHashCode;
        int i26 = ~((i24 & i25) | (i24 ^ i25));
        int i27 = ((~i26) & i23) | ((~i23) & i26);
        int i28 = i26 & i23;
        int i29 = -(~(((i28 & i27) | (i27 ^ i28)) * (-196)));
        int i30 = (-2) - (((i20 & i29) + (i29 | i20)) ^ (-1));
        int i31 = (-1) ^ iIntValue;
        int i32 = -(-(((i31 & iIntValue) | (i31 ^ iIntValue)) * 392));
        int i33 = i30 & i32;
        int i34 = (i30 ^ i32) | i33;
        int i35 = (i33 & i34) + (i34 | i33);
        int i36 = iIdentityHashCode ^ iIntValue;
        int i37 = (i36 & i25) | (i36 ^ i25);
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = i22 & i39;
        int i41 = (i39 | i22) & (~i40);
        long j11 = jArr[(i35 - (~(-(-(((i41 & i40) | (i41 ^ i40)) * 196))))) - 1];
        byte[] bArr = new byte[8];
        int i42 = f57620t0;
        int i43 = (((i42 | 46) << 1) - (i42 ^ 46)) - 1;
        f57619s0 = i43 % 128;
        int i44 = i43 % 2;
        int i45 = 0;
        boolean z10 = false;
        int i46 = 7;
        while (i46 >= 0) {
            int i47 = f57620t0;
            int i48 = i47 & 81;
            int i49 = (i47 ^ 81) | i48;
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            f57619s0 = i50 % 128;
            if (i50 % 2 != 0) {
                b10 = (byte) (j11 << (i46 >> 2));
                if (!z10) {
                    if (b10 != 0) {
                    }
                }
                i46 = (i46 ^ (-15)) + ((i46 & (-15)) << 1) + 14;
                int i51 = i47 & 1;
                int i52 = i51 + ((i47 ^ 1) | i51);
                f57619s0 = i52 % 128;
                int i53 = i52 % 2;
            } else {
                b10 = (byte) (j11 >>> (i46 << 3));
                if (!z10) {
                    if (b10 != 0) {
                    }
                }
                i46 = (i46 ^ (-15)) + ((i46 & (-15)) << 1) + 14;
                int i54 = i47 & 1;
                int i55 = i54 + ((i47 ^ 1) | i54);
                f57619s0 = i55 % 128;
                int i56 = i55 % 2;
            }
            int i57 = (((i45 ^ 45) | (i45 & 45)) << 1) - ((i45 & (-46)) | ((~i45) & 45));
            int i58 = i57 & (-44);
            bArr[i45] = b10;
            int i59 = (i47 ^ 47) + ((i47 & 47) << 1);
            f57619s0 = i59 % 128;
            int i60 = i59 % 2;
            z10 = true;
            i45 = i58 + ((i57 ^ (-44)) | i58);
            i46 = (i46 ^ (-15)) + ((i46 & (-15)) << 1) + 14;
            int i510 = i47 & 1;
            int i511 = i510 + ((i47 ^ 1) | i510);
            f57619s0 = i511 % 128;
            int i512 = i511 % 2;
        }
        int i61 = (iIntValue << 1) - iIntValue;
        int i62 = ((i61 ^ (-1)) + (i61 << 1)) * 8;
        int i63 = -(-i45);
        byte[] bArr2 = new byte[(((i62 ^ i63) | (i62 & i63)) << 1) - ((i63 & (~i62)) | ((~i63) & i62))];
        int i64 = f57620t0;
        int i65 = ((i64 | 105) << 1) - (i64 ^ 105);
        f57619s0 = i65 % 128;
        int i66 = i65 % 2;
        int i67 = 0;
        while (i67 < i45) {
            int i68 = f57619s0 + 117;
            int i69 = i68 % 128;
            f57620t0 = i69;
            int i70 = i68 % 2;
            bArr2[i67] = bArr[i67];
            i67++;
            int i71 = (((i69 | 14) << 1) - (i69 ^ 14)) - 1;
            f57619s0 = i71 % 128;
            int i72 = i71 % 2;
        }
        int i73 = iIntValue - 2;
        int i74 = f57619s0;
        while (true) {
            int i75 = i74 + 29;
            f57620t0 = i75 % 128;
            int i76 = i75 % 2;
            if (i73 < 0) {
                break;
            }
            int i77 = f57619s0;
            int i78 = i77 & 5;
            int i79 = ((i77 ^ 5) | i78) << 1;
            int i80 = -((i77 | 5) & (~i78));
            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
            f57620t0 = i81 % 128;
            int i82 = i81 % 2;
            long[] jArr2 = p1Var.f57621p0;
            if (i82 == 0) {
                j10 = jArr2[i73];
                i10 = 53;
            } else {
                j10 = jArr2[i73];
                i10 = 7;
            }
            while (i10 >= 0) {
                int i83 = f57619s0;
                int i84 = (i83 | 97) << 1;
                int i85 = -(i83 ^ 97);
                int i86 = ((i84 | i85) << 1) - (i84 ^ i85);
                f57620t0 = i86 % 128;
                if (i86 % 2 == 0) {
                    bArr2[i45] = (byte) (j10 >>> (i10 * 2));
                    int i87 = i10 & 2;
                    int i88 = (((i10 ^ 2) | i87) << 1) - ((i10 | 2) & (~i87));
                    int i89 = (i88 & (-101)) | ((~i88) & 100);
                    int i90 = -(-((i88 & 100) << 1));
                    i45 = (-2) - ((i45 + 15) ^ (-1));
                    i10 = ((i89 | i90) << 1) - (i89 ^ i90);
                } else {
                    int i91 = i45 & 49;
                    int i92 = ((~i91) & (i45 | 49)) + (i91 << 1);
                    int i93 = (((i92 ^ (-48)) | (i92 & (-48))) << 1) - (((~i92) & (-48)) | (i92 & 47));
                    bArr2[i45] = (byte) (j10 >>> (i10 << 3));
                    int i94 = i10 & 1;
                    int i95 = (((i10 | 1) & (~i94)) - (~(i94 << 1))) - 1;
                    int i96 = (i95 | (-2)) << 1;
                    int i97 = -(((~i95) & (-2)) | (i95 & 1));
                    i45 = i93;
                    i10 = (i96 & i97) + (i97 | i96);
                }
                int i98 = ((i83 | 123) << 1) - (i83 ^ 123);
                f57620t0 = i98 % 128;
                int i99 = i98 % 2;
            }
            i73--;
            i74 = f57619s0;
        }
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        int i100 = f57620t0 + 117;
        f57619s0 = i100 % 128;
        if (i100 % 2 == 0) {
            return bigInteger2;
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f57620t0;
        int i11 = (i10 ^ 71) + ((i10 & 71) << 1);
        f57619s0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = iIntValue * (-1187);
        int i14 = (36890 | i13) << 1;
        int i15 = -((i13 & (-36891)) | (36890 & (~i13)));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = (-63) ^ iIntValue;
        int i18 = (-63) & iIntValue;
        int i19 = ~(i17 | i18);
        int i20 = ~iIntValue;
        int i21 = i20 & iIntValue;
        int i22 = i20 | iIntValue;
        int i23 = ~(i21 | ((~i21) & i22));
        int i24 = i19 ^ i23;
        int i25 = i19 & i23;
        int i26 = (((i25 & i24) | (i24 ^ i25)) * (-1188)) + i16;
        int i27 = (i18 & i17) | (i17 ^ i18);
        int i28 = ~i27;
        int i29 = (i27 | i28) & i28;
        int i30 = i20 & i22;
        int i31 = i30 & iIntValue;
        int i32 = (~i31) & (i30 | iIntValue);
        int i33 = ~((i31 & i32) | (i32 ^ i31));
        int i34 = ((~i33) & i29) | ((~i29) & i33);
        int i35 = i29 & i33;
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = i20 ^ 62;
        int i38 = i20 & 62;
        int i39 = (i37 & i38) | (i37 ^ i38);
        int i40 = ~i39;
        int i41 = -(-((i36 | ((i39 | i40) & i40)) * 594));
        int i42 = (((i26 ^ i41) | (i26 & i41)) << 1) - ((i41 & (~i26)) | ((~i41) & i26));
        int i43 = i20 & i20;
        int i44 = (~i43) & (i20 | i20);
        int i45 = (i43 & i44) | (i44 ^ i43);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = i30 & 62;
        int i49 = (~i48) & (i30 | 62);
        int i50 = ~((i49 ^ i48) | (i49 & i48));
        int i51 = i47 & i50;
        int i52 = (i47 | i50) & (~i51);
        int i53 = (i52 & i51) | (i52 ^ i51);
        int i54 = ~(i48 | i49);
        int i55 = i53 & i54;
        int i56 = (i53 | i54) & (~i55);
        int i57 = ((i56 & i55) | (i56 ^ i55)) * 594;
        int i58 = i42 & i57;
        int i59 = ((i42 ^ i57) | i58) << 1;
        int i60 = -((i57 | i42) & (~i58));
        int i61 = ((i59 & i60) + (i60 | i59)) >>> 6;
        int i62 = i10 & 9;
        int i63 = ((i10 ^ 9) | i62) << 1;
        int i64 = -((i10 | 9) & (~i62));
        int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
        f57619s0 = i65 % 128;
        int i66 = i65 % 2;
        while (i61 != 0) {
            i61--;
            long j10 = p1Var.f57621p0[i61];
            if (j10 != 0) {
                int i67 = f57619s0;
                int i68 = i67 & 27;
                int i69 = i68 + ((i67 ^ 27) | i68);
                f57620t0 = i69 % 128;
                int i70 = i69 % 2;
                int i71 = i61 << 6;
                int iIntValue2 = ((Integer) m(new Object[]{Long.valueOf(j10)}, -1775663429, 1775663446, (int) System.currentTimeMillis())).intValue();
                int i72 = iIntValue2 * 141;
                int i73 = -(-(i71 * (-139)));
                int i74 = i72 & i73;
                int i75 = (i72 | i73) & (~i74);
                int i76 = i74 << 1;
                int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
                int i78 = ~iIntValue2;
                int i79 = i78 & i71;
                int i80 = (~i79) & (i78 | i71);
                int i81 = ~i71;
                int i82 = (i79 & i80) | (i80 ^ i79);
                int i83 = ~i82;
                int i84 = (i82 | i83) & i83;
                int i85 = i78 ^ iIntValue;
                int i86 = i78 & iIntValue;
                int i87 = (i85 & i86) | (i85 ^ i86);
                int i88 = ~i87;
                int i89 = (i87 | i88) & i88;
                int i90 = ((~i89) & i84) | ((~i84) & i89);
                int i91 = i84 & i89;
                int i92 = -(-(((i91 & i90) | (i90 ^ i91)) * (-280)));
                int i93 = (((i77 ^ i92) | (i77 & i92)) << 1) - ((i92 & (~i77)) | ((~i92) & i77));
                int i94 = (i81 & i20) | ((~i81) & iIntValue);
                int i95 = i81 & iIntValue;
                int i96 = ~((i94 & i95) | (i94 ^ i95));
                int i97 = ((i96 & i89) | (i89 ^ i96)) * 140;
                int i98 = (i93 ^ i97) + ((i97 & i93) << 1);
                int i99 = i78 & i81;
                int i100 = i99 | ((~i99) & (i78 | i81));
                int i101 = i100 & iIntValue;
                int i102 = (iIntValue | i100) & (~i101);
                int i103 = ~((i102 & i101) | (i102 ^ i101));
                int i104 = (i78 | iIntValue2) & i78;
                int i105 = (i104 & i30) | (i104 ^ i30);
                int i106 = (i105 & i81) | ((~i105) & i71);
                int i107 = i71 & i105;
                int i108 = ~((i107 & i106) | (i106 ^ i107));
                int i109 = ((~i108) & i103) | ((~i103) & i108);
                int i110 = i103 & i108;
                int i111 = (i81 ^ i30) | (i81 & i30);
                int i112 = (i78 & i111) | ((~i111) & iIntValue2);
                int i113 = iIntValue2 & i111;
                int i114 = (i113 & i112) | (i112 ^ i113);
                int i115 = ~i114;
                int i116 = -(-(((i110 & i109) | (i109 ^ i110) | ((i114 | i115) & i115)) * 140));
                int i117 = ((i98 | i116) << 1) - (i116 ^ i98);
                int i118 = f57620t0;
                int i119 = (i118 & (-114)) | ((~i118) & 113);
                int i120 = (i118 & 113) << 1;
                int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
                f57619s0 = i121 % 128;
                int i122 = i121 % 2;
                return Integer.valueOf(i117);
            }
        }
        int i123 = f57619s0;
        int i124 = ((((i123 ^ 47) | (i123 & 47)) << 1) - (~(-(((~i123) & 47) | (i123 & (-48)))))) - 1;
        f57620t0 = i124 % 128;
        if (i124 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int i10 = f57619s0;
        int i11 = i10 + 117;
        f57620t0 = i11 % 128;
        int i12 = i11 % 2;
        int length = p1Var.f57621p0.length;
        int i13 = i10 + 97;
        f57620t0 = i13 % 128;
        int i14 = i13 % 2;
        while (length != 0) {
            long[] jArr = p1Var.f57621p0;
            int i15 = ((length ^ (-3)) | (length & (-3))) << 1;
            int i16 = -(((~length) & (-3)) | (length & 2));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            int i18 = i17 & 2;
            length = i18 + ((i17 ^ 2) | i18);
            long j10 = jArr[length];
            if (j10 != 0) {
                int i19 = f57620t0;
                int i20 = ((i19 & 37) - (~(-(-(i19 | 37))))) - 1;
                f57619s0 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = length << 6;
                int i23 = -(-((Integer) m(new Object[]{Long.valueOf(j10)}, -1775663429, 1775663446, (int) System.currentTimeMillis())).intValue());
                int i24 = i22 & i23;
                int i25 = -(-(i22 | i23));
                int i26 = (i24 & i25) + (i25 | i24);
                int i27 = f57620t0;
                int i28 = ((i27 | 73) << 1) - (i27 ^ 73);
                f57619s0 = i28 % 128;
                if (i28 % 2 == 0) {
                    return Integer.valueOf(i26);
                }
                int i29 = 56 / 0;
                return Integer.valueOf(i26);
            }
        }
        int i30 = f57620t0;
        int i31 = ((i30 & 24) + (i30 | 24)) - 1;
        f57619s0 = i31 % 128;
        int i32 = i31 % 2;
        int i33 = (i30 & (-30)) | ((~i30) & 29);
        int i34 = -(-((i30 & 29) << 1));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        f57619s0 = i35 % 128;
        if (i35 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public static void i(int i10, long[] jArr, int i11, long[] jArr2, int i12) {
        int i13 = f57619s0;
        int i14 = i13 + 37;
        f57620t0 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((i13 & 86) + (i13 | 86)) - 1;
        f57620t0 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < i12) {
            int i19 = f57619s0;
            int i20 = i19 & 27;
            int i21 = -(-((i19 ^ 27) | i20));
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f57620t0 = i22 % 128;
            int i23 = i22 % 2;
            int i24 = i18 * (-496);
            int i25 = -(-(i10 * (-496)));
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = ~i18;
            int i28 = ~i18;
            int i29 = i28 | i18;
            int i30 = i27 & i29;
            int i31 = ~i10;
            int i32 = (i30 & i31) | (i30 ^ i31);
            int i33 = (i26 - (~(-(-(((i32 | (~i32)) & (~i32)) * 497))))) - 1;
            int i34 = ~i10;
            int i35 = ~i34;
            int i36 = (i27 ^ i34) | (i27 & i34) | i10;
            int i37 = (i36 | (~i36)) & (~i36);
            int i38 = ~i10;
            int i39 = i38 & i34;
            int i40 = (~i39) & (i38 | i34);
            int i41 = (i40 & i39) | (i40 ^ i39);
            int i42 = ~((i41 & i18) | (i41 ^ i18));
            int i43 = ((~i42) & i37) | ((~i37) & i42);
            int i44 = i42 & i37;
            int i45 = -(-(((i44 & i43) | (i43 ^ i44)) * 497));
            int i46 = (i33 & i45) + (i45 | i33);
            int i47 = (~i18) & i29;
            int i48 = i31 | i10;
            int i49 = i34 & i48;
            int i50 = i47 & i49;
            int i51 = (i47 | i49) & (~i50);
            int i52 = ~((i51 & i50) | (i51 ^ i50));
            int i53 = i27 & i10;
            int i54 = (~i53) & (i27 | i10);
            int i55 = (i53 & i54) | (i54 ^ i53);
            int i56 = (i55 | (~i55)) & (~i55);
            int i57 = (i52 & i56) | (i52 ^ i56);
            int i58 = i48 & i34;
            int i59 = (i58 & i18) | (i58 ^ i18);
            int i60 = i59 ^ i10;
            int i61 = i59 & i10;
            int i62 = ~((i61 & i60) | (i60 ^ i61));
            int i63 = ((~i62) & i57) | ((~i57) & i62);
            int i64 = i57 & i62;
            int i65 = -(-(((i64 & i63) | (i63 ^ i64)) * 497));
            int i66 = i46 & i65;
            int i67 = -(-((i65 ^ i46) | i66));
            int i68 = (i66 & i67) + (i67 | i66);
            long j10 = jArr[i68];
            int i69 = i18 * 165;
            int i70 = -(-(i11 * (-163)));
            int i71 = i69 & i70;
            int i72 = (i69 ^ i70) | i71;
            int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
            int i74 = (i34 ^ i11) | (i34 & i11);
            int i75 = (i74 | (~i74)) & (~i74);
            int i76 = i18 & i75;
            int i77 = (i75 | i18) & (~i76);
            int i78 = (((i77 & i76) | (i77 ^ i76)) * (-328)) + i73;
            int i79 = (i18 | i10) * 164;
            int i80 = i78 ^ i79;
            int i81 = ((i78 & i79) | i80) << 1;
            int i82 = -i80;
            int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
            int i84 = i27 & i29;
            int i85 = ~i11;
            int i86 = i84 & i85;
            int i87 = (i84 | i85) & (~i86);
            int i88 = ~((i87 & i86) | (i87 ^ i86));
            int i89 = ~((i85 & i10) | (i85 ^ i10));
            int i90 = i88 ^ i89;
            int i91 = i88 & i89;
            int i92 = (i91 & i90) | (i90 ^ i91);
            int i93 = (i34 & i28) | (i18 & i35);
            int i94 = i34 & i18;
            int i95 = (i93 & i94) | (i93 ^ i94);
            int i96 = i95 & i11;
            int i97 = (i95 | i11) & (~i96);
            int i98 = ~((i97 & i96) | (i97 ^ i96));
            int i99 = ((~i98) & i92) | ((~i92) & i98);
            int i100 = i92 & i98;
            int i101 = -(-(((i100 & i99) | (i99 ^ i100)) * 164));
            int i102 = i83 & i101;
            int i103 = (i101 ^ i83) | i102;
            jArr[i68] = jArr2[(i102 ^ i103) + ((i103 & i102) << 1)] ^ j10;
            i18 = ((i18 | 1) << 1) - (i18 ^ 1);
            int i104 = (i19 & (-94)) | ((~i19) & 93);
            int i105 = -(-((i19 & 93) << 1));
            int i106 = (i104 & i105) + (i104 | i105);
            f57620t0 = i106 % 128;
            int i107 = i106 % 2;
        }
        int i108 = f57620t0;
        int i109 = ((-1) << 1) - ((-1) ^ ((i108 ^ 60) + ((i108 & 60) << 1)));
        f57619s0 = i109 % 128;
        if (i109 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00d3 A[PHI: r3
      0x00d3: PHI (r3v12 long) = (r3v11 long), (r3v24 long) binds: [B:16:0x00d1, B:13:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    public static void j(long[] jArr, long j10, long[] jArr2, int i10) {
        long jLongValue;
        long j11 = 1;
        if ((j10 & 1) != 0) {
            int i11 = f57619s0;
            int i12 = (i11 ^ 109) + ((i11 & 109) << 1);
            f57620t0 = i12 % 128;
            int i13 = i12 % 2;
            i(0, jArr2, 0, jArr, i10);
            int i14 = f57620t0;
            int i15 = ((i14 & (-120)) | ((~i14) & 119)) + ((i14 & 119) << 1);
            f57619s0 = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = f57620t0;
        int i18 = i17 ^ 23;
        int i19 = ((i17 & 23) | i18) << 1;
        int i20 = -i18;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f57619s0 = i21 % 128;
        int i22 = i21 % 2;
        long j12 = j10;
        int i23 = 1;
        while (true) {
            j12 >>>= 1;
            if (j12 == 0) {
                break;
            }
            int i24 = f57620t0 + 61;
            int i25 = i24 % 128;
            f57619s0 = i25;
            int i26 = i24 % 2;
            if ((j12 & j11) != 0) {
                int i27 = i25 & 39;
                int i28 = (i27 - (~(-(-((i25 ^ 39) | i27))))) - 1;
                f57620t0 = i28 % 128;
                Object[] objArr = new Object[6];
                if (i28 % 2 == 0) {
                    objArr[0] = jArr2;
                    objArr[1] = 1;
                    objArr[2] = jArr;
                    objArr[3] = 0;
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = Integer.valueOf(i23);
                    jLongValue = ((Long) m(objArr, -537617247, 537617261, 1)).longValue();
                    if (jLongValue != 0) {
                        jArr2[i10] = jLongValue ^ jArr2[i10];
                        int i29 = f57620t0;
                        int i30 = ((i29 ^ 89) | (i29 & 89)) << 1;
                        int i31 = -(((~i29) & 89) | (i29 & (-90)));
                        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                        f57619s0 = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else {
                    objArr[0] = jArr2;
                    objArr[1] = 0;
                    objArr[2] = jArr;
                    objArr[3] = 0;
                    objArr[4] = Integer.valueOf(i10);
                    objArr[5] = Integer.valueOf(i23);
                    jLongValue = ((Long) m(objArr, -537617247, 537617261, 0)).longValue();
                    if (jLongValue != 0) {
                        jArr2[i10] = jLongValue ^ jArr2[i10];
                        int i210 = f57620t0;
                        int i34 = ((i210 ^ 89) | (i210 & 89)) << 1;
                        int i35 = -(((~i210) & 89) | (i210 & (-90)));
                        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                        f57619s0 = i36 % 128;
                        int i37 = i36 % 2;
                    }
                }
            }
            i23 = (i23 ^ 1) + ((i23 & 1) << 1);
            int i38 = f57619s0 + 33;
            f57620t0 = i38 % 128;
            int i39 = i38 % 2;
            j11 = 1;
        }
        int i40 = f57620t0;
        int i41 = i40 & 23;
        int i42 = -(-((i40 ^ 23) | i41));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        f57619s0 = i43 % 128;
        if (i43 % 2 != 0) {
            int i44 = 22 / 0;
        }
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int i10 = 0;
        p1 p1Var = (p1) objArr[0];
        int i11 = f57620t0;
        int i12 = i11 & 103;
        int i13 = i12 + ((i11 ^ 103) | i12);
        f57619s0 = i13 % 128;
        int iIntValue = ((Integer) (i13 % 2 != 0 ? m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var)) : m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var)))).intValue();
        int i14 = 1;
        while (i10 < iIntValue) {
            int i15 = f57619s0;
            int i16 = (-2) - (((i15 ^ 2) + ((i15 & 2) << 1)) ^ (-1));
            f57620t0 = i16 % 128;
            if (i16 % 2 == 0) {
                long j10 = p1Var.f57621p0[i10];
                int i17 = i14 >> 2;
                int i18 = (int) j10;
                int i19 = (~i18) & i17;
                int i20 = (~i17) & i18;
                int i21 = (i20 & i19) | (i19 ^ i20);
                int i22 = (i21 ^ (-36)) + ((i21 & (-36)) << 1);
                int i23 = (int) (j10 >> 13);
                int i24 = (~i23) & i22;
                int i25 = i23 & (~i22);
                i14 = (i25 & i24) | (i24 ^ i25);
                int i26 = i10 ^ 59;
                int i27 = ((i10 & 59) | i26) << 1;
                int i28 = -i26;
                i10 = (i27 ^ i28) + ((i27 & i28) << 1);
            } else {
                long j11 = p1Var.f57621p0[i10];
                int i29 = i14 * 31;
                int i30 = (int) j11;
                int i31 = i29 & i30;
                int i32 = (((i29 ^ i30) | i31) & (~i31)) * 31;
                int i33 = (int) (j11 >>> 32);
                int i34 = i32 & i33;
                i14 = ((i32 ^ i33) | i34) & (~i34);
                i10 = ((i10 & 124) + (i10 | 124)) - 123;
            }
        }
        int i35 = f57620t0;
        int i36 = i35 & 17;
        int i37 = ((((i35 ^ 17) | i36) << 1) - (~(-((i35 | 17) & (~i36))))) - 1;
        f57619s0 = i37 % 128;
        if (i37 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static /* synthetic */ p1 l(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int i10 = f57620t0;
        int i11 = i10 & 105;
        int i12 = (i11 - (~(-(-((i10 ^ 105) | i11))))) - 1;
        f57619s0 = i12 % 128;
        if (i12 % 2 != 0) {
            ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue();
            throw null;
        }
        int iIntValue = ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue();
        if (iIntValue == 0) {
            int i13 = f57619s0;
            int i14 = (-2) - ((((i13 | 30) << 1) - (i13 ^ 30)) ^ (-1));
            f57620t0 = i14 % 128;
            int i15 = i14 % 2;
            return p1Var;
        }
        int i16 = iIntValue << 1;
        long[] jArr = new long[i16];
        int i17 = f57620t0 + 25;
        f57619s0 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < i16) {
            int i20 = f57619s0;
            int i21 = (((i20 | 49) << 1) - (~(-(((~i20) & 49) | (i20 & (-50)))))) - 1;
            f57620t0 = i21 % 128;
            if (i21 % 2 == 0) {
                long j10 = p1Var.f57621p0[i19 >>> 1];
                int i22 = (i19 << 1) - i19;
                int i23 = ((i22 | 84) << 1) - (~(-(((~i22) & 84) | (i22 & (-85)))));
                int i24 = (int) j10;
                jArr[i19] = ((Long) m(new Object[]{Integer.valueOf(i24)}, 559780327, -559780298, i24)).longValue();
                int i25 = (int) (j10 >>> 100);
                jArr[i23 - 1] = ((Long) m(new Object[]{Integer.valueOf(i25)}, 559780327, -559780298, i25)).longValue();
                i19 = i23 + 61;
            } else {
                long j11 = p1Var.f57621p0[i19 >>> 1];
                int i26 = i19 & 1;
                int i27 = (i19 ^ 1) | i26;
                int i28 = (i26 & i27) + (i26 | i27);
                int i29 = (int) j11;
                jArr[i19] = ((Long) m(new Object[]{Integer.valueOf(i29)}, 559780327, -559780298, i29)).longValue();
                int i30 = i28 & 19;
                int i31 = ((((i28 ^ 19) | i30) << 1) - (~(-((~i30) & (i28 | 19))))) - 1;
                int i32 = i31 & (-18);
                int i33 = (((i31 ^ (-18)) | i32) << 1) - ((i31 | (-18)) & (~i32));
                int i34 = (int) (j11 >>> 32);
                jArr[i28] = ((Long) m(new Object[]{Integer.valueOf(i34)}, 559780327, -559780298, i34)).longValue();
                i19 = i33;
            }
        }
        p1 p1Var2 = new p1(jArr, i16);
        int i35 = f57620t0 + 61;
        f57619s0 = i35 % 128;
        int i36 = i35 % 2;
        return p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x087a A[PHI: r1
      0x087a: PHI (r1v16 int) = (r1v15 int), (r1v29 int) binds: [B:75:0x0878, B:72:0x085c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x088a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0890  */
    /* JADX WARN: Code duplicated, block: B:82:0x08ad A[PHI: r1 r2
      0x08ad: PHI (r1v21 int) = (r1v15 int), (r1v29 int) binds: [B:75:0x0878, B:72:0x085c] A[DONT_GENERATE, DONT_INLINE]
      0x08ad: PHI (r2v15 int) = (r2v6 int), (r2v25 int) binds: [B:75:0x0878, B:72:0x085c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x08bf  */
    public static /* synthetic */ Object m(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17 = ~((~i10) | i11);
        int i18 = ~i11;
        int i19 = ~(i18 | i10);
        int i20 = (((~((~i12) | i18)) | i17 | i19) * 398) + ((i10 | i11) * (-1194)) + ((i17 | i19 | (~(i18 | i12))) * 398) + (i11 * 399) + (i10 * 399);
        int i21 = 0;
        int iValueOf = 0;
        long j11 = 0;
        int i22 = 2;
        int i23 = 1;
        switch (i20) {
            case 1:
                return G(objArr);
            case 2:
                return D(objArr);
            case 3:
                long[] jArr = (long[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                long jLongValue = ((Number) objArr[3]).longValue();
                int i24 = f57619s0;
                int i25 = i24 & 75;
                int i26 = (i24 ^ 75) | i25;
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                int i28 = i27 % 128;
                f57620t0 = i28;
                if (i27 % 2 == 0) {
                    i13 = iIntValue % (iIntValue2 * 99);
                    i14 = iIntValue2 & 51;
                    if (i14 == 0) {
                        int i29 = i28 & 11;
                        int i30 = (i28 ^ 11) | i29;
                        i15 = (i29 & i30) + (i29 | i30);
                        int i31 = i15 % 128;
                        f57619s0 = i31;
                        if (i15 % 2 != 0) {
                            jArr[i13] = jArr[i13] ^ jLongValue;
                        } else {
                            jArr[i13] = jArr[i13] ^ jLongValue;
                        }
                        int i32 = i31 & 5;
                        int i33 = ((i31 ^ 5) | i32) << 1;
                        int i34 = -((~i32) & (i31 | 5));
                        i16 = (i33 & i34) + (i33 | i34);
                        f57620t0 = i16 % 128;
                    } else {
                        jArr[i13] = jArr[i13] ^ (jLongValue << i14);
                        int i35 = -i14;
                        j10 = jLongValue >>> ((i35 & 64) + (i35 | 64));
                        if (j10 != 0) {
                            int i36 = (i28 & (-12)) | ((~i28) & 11);
                            int i37 = -(-((i28 & 11) << 1));
                            int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                            int i39 = i38 % 128;
                            f57619s0 = i39;
                            int i40 = i38 % 2;
                            int i41 = ((i13 & (-77)) + (i13 | (-77))) - 1;
                            int i42 = ((i41 ^ 79) | (i41 & 79)) << 1;
                            int i43 = -(((~i41) & 79) | (i41 & (-80)));
                            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                            jArr[i44] = jArr[i44] ^ j10;
                            int i45 = (-2) - (((i39 & 70) + (i39 | 70)) ^ (-1));
                            f57620t0 = i45 % 128;
                            int i46 = i45 % 2;
                        }
                        int i47 = f57620t0;
                        int i48 = i47 | 27;
                        i16 = (i48 << 1) - ((~(i47 & 27)) & i48);
                        f57619s0 = i16 % 128;
                    }
                } else {
                    int i49 = -(-(iIntValue2 >>> 6));
                    int i50 = ((iIntValue ^ i49) | (iIntValue & i49)) << 1;
                    int i51 = -(((~iIntValue) & i49) | ((~i49) & iIntValue));
                    i13 = ((i50 | i51) << 1) - (i51 ^ i50);
                    i14 = iIntValue2 & 63;
                    if (i14 == 0) {
                        int i210 = i28 & 11;
                        int i310 = (i28 ^ 11) | i210;
                        i15 = (i210 & i310) + (i210 | i310);
                        int i311 = i15 % 128;
                        f57619s0 = i311;
                        if (i15 % 2 != 0) {
                            jArr[i13] = jArr[i13] ^ jLongValue;
                        } else {
                            jArr[i13] = jArr[i13] ^ jLongValue;
                        }
                        int i312 = i311 & 5;
                        int i313 = ((i311 ^ 5) | i312) << 1;
                        int i314 = -((~i312) & (i311 | 5));
                        i16 = (i313 & i314) + (i313 | i314);
                        f57620t0 = i16 % 128;
                    } else {
                        jArr[i13] = jArr[i13] ^ (jLongValue << i14);
                        int i315 = -i14;
                        j10 = jLongValue >>> ((i315 & 64) + (i315 | 64));
                        if (j10 != 0) {
                            int i316 = (i28 & (-12)) | ((~i28) & 11);
                            int i317 = -(-((i28 & 11) << 1));
                            int i318 = ((i316 | i317) << 1) - (i316 ^ i317);
                            int i319 = i318 % 128;
                            f57619s0 = i319;
                            int i410 = i318 % 2;
                            int i411 = ((i13 & (-77)) + (i13 | (-77))) - 1;
                            int i412 = ((i411 ^ 79) | (i411 & 79)) << 1;
                            int i413 = -(((~i411) & 79) | (i411 & (-80)));
                            int i414 = ((i412 | i413) << 1) - (i413 ^ i412);
                            jArr[i414] = jArr[i414] ^ j10;
                            int i415 = (-2) - (((i319 & 70) + (i319 | 70)) ^ (-1));
                            f57620t0 = i415 % 128;
                            int i416 = i415 % 2;
                        }
                        int i417 = f57620t0;
                        int i418 = i417 | 27;
                        i16 = (i418 << 1) - ((~(i417 & 27)) & i418);
                        f57619s0 = i16 % 128;
                    }
                }
                int i52 = i16 % 2;
                return null;
            case 4:
                return l(objArr);
            case 5:
                return x(objArr);
            case 6:
                return q(objArr);
            case 7:
                long[] jArr2 = (long[]) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int iIntValue5 = ((Number) objArr[3]).intValue();
                int iIntValue6 = ((Number) objArr[4]).intValue();
                int[] iArr = (int[]) objArr[5];
                int i53 = f57619s0;
                int i54 = ((i53 ^ 95) | (i53 & 95)) << 1;
                int i55 = -(((~i53) & 95) | (i53 & (-96)));
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                int i57 = i56 % 128;
                f57620t0 = i57;
                int i58 = i56 % 2;
                int i59 = iIntValue5 << 6;
                int i60 = -iIntValue6;
                int i61 = i60 * 370;
                int i62 = -(-(i59 * 370));
                int i63 = i61 ^ i62;
                int i64 = (i61 & i62) << 1;
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                int i66 = i60 & i59;
                int i67 = (~i66) & (i60 | i59);
                int i68 = ~i59;
                int i69 = (i67 ^ i66) | (i66 & i67);
                int i70 = ~iIntValue3;
                int i71 = i70 & (i70 | iIntValue3);
                int i72 = i69 & i71;
                int i73 = (~i72) & (i69 | i71);
                int i74 = ((i73 & i72) | (i73 ^ i72)) * (-369);
                int i75 = i65 & i74;
                int i76 = -(-((i65 ^ i74) | i75));
                int i77 = (i75 & i76) + (i76 | i75);
                int i78 = ~i60;
                int i79 = i78 & i70;
                int i80 = (~i79) & (i78 | i70);
                int i81 = (i80 ^ i79) | (i79 & i80);
                int i82 = ~i81;
                int i83 = (i81 | i82) & i82;
                int i84 = ((~i83) & i59) | (i83 & i68);
                int i85 = i83 & i59;
                int i86 = ((i84 ^ i85) | (i85 & i84)) * (-369);
                int i87 = (((i77 | i86) << 1) - (~(-(i86 ^ i77)))) - 1;
                int i88 = i68 & i60;
                int i89 = ~(i88 | ((~i88) & (i68 | i60)));
                int i90 = ~((i60 ^ iIntValue3) | (i60 & iIntValue3));
                int i91 = i89 ^ i90;
                int i92 = i89 & i90;
                int i93 = (i92 & i91) | (i91 ^ i92);
                int i94 = i78 & (i60 | i78);
                int i95 = ~i70;
                int i96 = (i94 & i95) | ((~i94) & i70);
                int i97 = i94 & i70;
                int i98 = (i97 & i96) | (i96 ^ i97);
                int i99 = i98 & i59;
                int i100 = ~(((i98 | i59) & (~i99)) | i99);
                int i101 = i93 & i100;
                int i102 = (i100 | i93) & (~i101);
                int i103 = ((i102 & i101) | (i102 ^ i101)) * 369;
                int i104 = (i87 ^ i103) + ((i103 & i87) << 1);
                int length = iArr.length;
                int i105 = (i57 ^ 37) + ((i57 & 37) << 1);
                f57619s0 = i105 % 128;
                int i106 = i105 % 2;
                while (true) {
                    int i107 = (~length) | length;
                    length = ((length & i107) << 1) + (length ^ i107);
                    if (length < 0) {
                        long[] jArr3 = jArr2;
                        int i108 = i104;
                        int i109 = i71;
                        int i110 = iIntValue5 * (-317);
                        int i111 = -(-(iIntValue3 * 319));
                        int i112 = i110 & i111;
                        int i113 = (i110 | i111) & (~i112);
                        int i114 = i112 << 1;
                        int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                        int i116 = ~iIntValue5;
                        int i117 = i116 | i70;
                        int i118 = i117 & iIntValue3;
                        int i119 = (i117 | iIntValue3) & (~i118);
                        int i120 = (i119 & i118) | (i119 ^ i118);
                        int i121 = ~i120;
                        int i122 = (i120 | i121) & i121;
                        int i123 = (i70 ^ iIntValue5) | (i70 & iIntValue5);
                        int i124 = ~((i123 ^ iIntValue3) | (i123 & iIntValue3));
                        int i125 = ((~i124) & i122) | ((~i122) & i124);
                        int i126 = i122 & i124;
                        int i127 = -(~(-(-(((i126 & i125) | (i125 ^ i126)) * (-318)))));
                        int i128 = ((i115 & i127) + (i127 | i115)) - 1;
                        int i129 = ~i123;
                        int i130 = ~((iIntValue5 ^ iIntValue3) | (iIntValue5 & iIntValue3));
                        int i131 = (i128 - (~(((i129 & i130) | (i129 ^ i130)) * (-318)))) - 1;
                        int i132 = i116 & (i116 | iIntValue5);
                        int i133 = (i132 & i70) | ((~i132) & iIntValue3);
                        int i134 = i132 & iIntValue3;
                        int i135 = (i134 & i133) | (i133 ^ i134);
                        int i136 = ~i135;
                        int i137 = (i135 | i136) & i136;
                        int i138 = (i109 & (~i137)) | ((~i109) & i137);
                        int i139 = i137 & i109;
                        int i140 = -(~(-(-(((i139 & i138) | (i138 ^ i139)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                        int i141 = ((i131 & i140) + (i140 | i131)) - 1;
                        int i142 = -iIntValue5;
                        int i143 = i142 * (-1939);
                        int i144 = -(~(iIntValue4 * 971));
                        int i145 = (i143 & i144) + (i143 | i144);
                        int i146 = (i145 ^ (-1)) + (i145 << 1);
                        int i147 = ~iIntValue4;
                        int i148 = (i147 | iIntValue4) & i147;
                        int i149 = i148 ^ i142;
                        int i150 = ~i142;
                        int i151 = i142 & i148;
                        int i152 = (i151 & i149) | (i149 ^ i151);
                        int i153 = ~i152;
                        int i154 = (i152 | i153) & i153;
                        int i155 = i70 ^ iIntValue4;
                        int i156 = i70 & iIntValue4;
                        int i157 = ~((i155 & i156) | (i155 ^ i156));
                        int i158 = ((i154 & i157) | (i154 ^ i157)) * (-970);
                        int i159 = (i146 & i158) + (i158 | i146);
                        int i160 = i150 & i147;
                        int i161 = ((~i150) & iIntValue4) | i160 | (i150 & iIntValue4);
                        int i162 = ~i161;
                        int i163 = (((i161 | i162) & i162) * 1940) + i159;
                        int i164 = (i147 | i150) & (~i160);
                        int i165 = ~((i160 & i164) | (i164 ^ i160));
                        int i166 = ~(iIntValue4 | i70);
                        int i167 = -(-(((i165 & i166) | (i165 ^ i166)) * 970));
                        int i168 = i163 & i167;
                        int i169 = (i167 ^ i163) | i168;
                        m(new Object[]{jArr3, Integer.valueOf(iIntValue3), jArr3, Integer.valueOf(i141), Integer.valueOf((i168 ^ i169) + ((i169 & i168) << 1)), Integer.valueOf(i108)}, 1879216199, -1879216190, iIntValue3);
                        int i170 = f57619s0;
                        int i171 = i170 & 59;
                        int i172 = -(-((i170 ^ 59) | i171));
                        int i173 = ((i171 | i172) << 1) - (i172 ^ i171);
                        f57620t0 = i173 % 128;
                        int i174 = i173 % 2;
                        return null;
                    }
                    int i175 = f57620t0;
                    int i176 = i175 & 83;
                    int i177 = (i176 - (~((i175 ^ 83) | i176))) - 1;
                    f57619s0 = i177 % 128;
                    int i178 = i177 % 2;
                    int i179 = iIntValue5 * (-721);
                    int i180 = -(-(iIntValue3 * (-721)));
                    int i181 = ((i179 ^ i180) | (i179 & i180)) << 1;
                    int i182 = -(((~i180) & i179) | ((~i179) & i180));
                    int i183 = (i181 ^ i182) + ((i182 & i181) << 1);
                    int i184 = ~iIntValue5;
                    int i185 = (i184 & i95) | ((~i184) & i70);
                    int i186 = i184 & i70;
                    int i187 = (i185 & i186) | (i185 ^ i186);
                    int i188 = ~i187;
                    int i189 = (i187 | i188) & i188;
                    int i190 = ((~i189) & i70) | (i189 & i95);
                    int i191 = i189 & i70;
                    int i192 = (i190 ^ i191) | (i191 & i190);
                    int i193 = iIntValue5 & iIntValue3;
                    int i194 = (~i193) & (iIntValue5 | iIntValue3);
                    int i195 = i71;
                    int i196 = ~(i194 | i193);
                    long[] jArr4 = jArr2;
                    int i197 = i192 & i196;
                    int i198 = i104;
                    int i199 = (~i197) & (i196 | i192);
                    int i200 = -(-(((i197 & i199) | (i199 ^ i197)) * 1444));
                    int i201 = (((i183 ^ i200) | (i183 & i200)) << 1) - ((i200 & (~i183)) | ((~i200) & i183));
                    int i202 = iIntValue5 & i70;
                    int i203 = iIntValue3 & i184;
                    int i204 = i202 | i203 | i193;
                    int i205 = ~i204;
                    int i206 = (i204 | i205) & i205;
                    int i207 = ~((i194 & i193) | (i194 ^ i193));
                    int i208 = i206 & i207;
                    int i209 = (i207 | i206) & (~i208);
                    int i211 = (i209 & i208) | (i209 ^ i208);
                    int i212 = iIntValue3 & i70;
                    int i213 = i212 | i212;
                    int i214 = iIntValue3 & iIntValue3;
                    int i215 = (i213 & i214) | (i213 ^ i214);
                    int i216 = ~i215;
                    int i217 = (i215 | i216) & i216;
                    int i218 = i211 ^ i217;
                    int i219 = i211 & i217;
                    int i220 = ((i219 & i218) | (i218 ^ i219)) * (-1444);
                    int i221 = (i201 ^ i220) + ((i201 & i220) << 1);
                    int i222 = (i184 | iIntValue3) & (~i203);
                    int i223 = ~((i222 & i203) | (i222 ^ i203));
                    int i224 = (iIntValue5 & i95) | i186;
                    int i225 = ~((i202 & i224) | (i224 ^ i202));
                    int i226 = i223 & i225;
                    int i227 = (i221 - (~((((i223 | i225) & (~i226)) | i226) * ErrorCodes.STORAGE_PERMISSION))) - 1;
                    int i228 = -iIntValue5;
                    int i229 = i228 * 630;
                    int i230 = iIntValue4 * (-628);
                    int i231 = i229 & i230;
                    int i232 = -(-((i229 ^ i230) | i231));
                    int i233 = ((i231 | i232) << 1) - (i232 ^ i231);
                    int i234 = ~iIntValue4;
                    int i235 = i233 - (~(((i234 | iIntValue4) & i234) * (-629)));
                    int i236 = (i235 ^ (-1)) + (i235 << 1);
                    int i237 = ~i228;
                    int i238 = ((~i234) & i237) | ((~i237) & i234);
                    int i239 = i234 & i237;
                    int i240 = (i239 & i238) | (i238 ^ i239);
                    int i241 = ~i240;
                    int i242 = ((i240 | i241) & i241) * (-629);
                    int i243 = (i236 ^ i242) + ((i242 & i236) << 1);
                    int i244 = iIntValue4 ^ i237;
                    int i245 = i237 & iIntValue4;
                    int i246 = -(-(((i245 & i244) | (i244 ^ i245)) * 629));
                    int i247 = (((i243 ^ i246) | (i243 & i246)) << 1) - ((i246 & (~i243)) | ((~i246) & i243));
                    int i248 = -(-iArr[length]);
                    int i249 = i198 ^ i248;
                    int i250 = (i198 & i248) << 1;
                    m(new Object[]{jArr4, Integer.valueOf(iIntValue3), jArr4, Integer.valueOf(i227), Integer.valueOf(i247), Integer.valueOf((i249 & i250) + (i250 | i249))}, 1879216199, -1879216190, iIntValue3);
                    int i251 = f57620t0;
                    int i252 = i251 | 111;
                    int i253 = ((i252 << 1) - (~(-((~(i251 & 111)) & i252)))) - 1;
                    f57619s0 = i253 % 128;
                    int i254 = i253 % 2;
                    i71 = i195;
                    jArr2 = jArr4;
                    i104 = i198;
                }
                break;
            case 8:
                return c(objArr);
            case 9:
                v(objArr);
                return null;
            case 10:
                p1 p1Var = (p1) objArr[0];
                int i255 = f57619s0;
                int i256 = i255 & 67;
                int i257 = i256 + ((i255 ^ 67) | i256);
                f57620t0 = i257 % 128;
                int i258 = i257 % 2;
                int length2 = p1Var.f57621p0.length;
                int iIntValue7 = ((Integer) m(new Object[]{p1Var, Integer.valueOf(length2)}, 1225282330, -1225282306, length2)).intValue();
                int i259 = f57619s0;
                int i260 = i259 ^ 43;
                int i261 = ((i259 & 43) | i260) << 1;
                int i262 = -i260;
                int i263 = (i261 & i262) + (i261 | i262);
                f57620t0 = i263 % 128;
                int i264 = i263 % 2;
                return Integer.valueOf(iIntValue7);
            case 11:
                u(objArr);
                return null;
            case 12:
                return z(objArr);
            case 13:
                a(objArr);
                return null;
            case 14:
                long[] jArr5 = (long[]) objArr[0];
                int iIntValue8 = ((Number) objArr[1]).intValue();
                long[] jArr6 = (long[]) objArr[2];
                int iIntValue9 = ((Number) objArr[3]).intValue();
                int iIntValue10 = ((Number) objArr[4]).intValue();
                int iIntValue11 = ((Number) objArr[5]).intValue();
                int i265 = f57619s0;
                int i266 = (i265 | 19) << 1;
                int i267 = -(i265 ^ 19);
                int i268 = (i266 ^ i267) + ((i266 & i267) << 1);
                f57620t0 = i268 % 128;
                int i269 = i268 % 2;
                int i270 = -iIntValue11;
                int i271 = (((i270 ^ 64) | (i270 & 64)) << 1) - ((i270 & (-65)) | ((~i270) & 64));
                int i272 = i265 & 121;
                int i273 = -(-((i265 ^ 121) | i272));
                int i274 = (i272 & i273) + (i273 | i272);
                f57620t0 = i274 % 128;
                int i275 = i274 % 2;
                while (i21 < iIntValue10) {
                    int i276 = f57619s0 + 97;
                    int i277 = i276 % 128;
                    f57620t0 = i277;
                    int i278 = i276 % i22;
                    int i279 = i21 * (-501);
                    int i280 = -(-(iIntValue9 * 503));
                    int i281 = i279 & i280;
                    int i282 = ((i279 | i280) & (~i281)) + (i281 << i23);
                    int i283 = ~iIntValue9;
                    int i284 = ~iIntValue8;
                    int i285 = ~(((~i283) & iIntValue8) | (i283 & i284) | (i283 & iIntValue8));
                    int i286 = iIntValue10;
                    int i287 = ~i21;
                    int i288 = (i21 & i283) | (iIntValue9 & i287);
                    int i289 = i21 & iIntValue9;
                    int i290 = ~((i288 ^ i289) | (i288 & i289));
                    int i291 = iIntValue9;
                    int i292 = ((~i290) & i285) | ((~i285) & i290);
                    int i293 = i285 & i290;
                    int i294 = ((i292 & i293) | (i292 ^ i293)) * (-502);
                    int i295 = i282 & i294;
                    int i296 = -(-((i294 ^ i282) | i295));
                    int i297 = (i295 ^ i296) + ((i296 & i295) << 1);
                    int i298 = i283 | i284;
                    int i299 = i298 & i21;
                    int i300 = (i298 | i21) & (~i299);
                    int i301 = (~((i300 & i299) | (i300 ^ i299))) * (-502);
                    int i302 = (i297 | i301) << 1;
                    int i303 = -((i301 & (~i297)) | ((~i301) & i297));
                    int i304 = (i302 ^ i303) + ((i303 & i302) << 1);
                    int i305 = i287 & (i287 | i21);
                    int i306 = ~((i305 & iIntValue8) | (i305 ^ iIntValue8));
                    int i307 = i283 & i306;
                    int i308 = (i283 | i306) & (~i307);
                    long j12 = jArr6[(i304 - (~(((i308 & i307) | (i308 ^ i307)) * 502))) - 1];
                    int i309 = (iIntValue8 - (~(-(~(-(-i21)))))) - 2;
                    jArr5[i309] = ((j12 << iIntValue11) | j11) ^ jArr5[i309];
                    j11 = j12 >>> i271;
                    int i320 = i21 & 1;
                    i21 = ((i21 ^ 1) | i320) + i320;
                    int i321 = ((i277 & 79) - (~(-(-(i277 | 79))))) - 1;
                    f57619s0 = i321 % 128;
                    int i322 = i321 % 2;
                    iIntValue10 = i286;
                    iIntValue9 = i291;
                    i22 = 2;
                    i23 = 1;
                }
                int i323 = f57620t0;
                int i324 = (-2) - (((i323 ^ 80) + ((i323 & 80) << 1)) ^ (-1));
                f57619s0 = i324 % 128;
                int i325 = i324 % 2;
                return Long.valueOf(j11);
            case 15:
                return p(objArr);
            case 16:
                I(objArr);
                return null;
            case 17:
                return e(objArr);
            case 18:
                long[] jArr7 = (long[]) objArr[0];
                p1 p1Var2 = new p1(jArr7, ((Integer) m(new Object[]{jArr7, 0, Integer.valueOf(((Number) objArr[1]).intValue()), Integer.valueOf(((Number) objArr[2]).intValue()), (int[]) objArr[3]}, -456521769, 456521800, 0)).intValue());
                int i326 = f57620t0;
                int i327 = i326 & 123;
                int i328 = (i327 - (~((i326 ^ 123) | i327))) - 1;
                f57619s0 = i328 % 128;
                int i329 = i328 % 2;
                return p1Var2;
            case 19:
                return A(objArr);
            case 20:
                return f(objArr);
            case 21:
                return g(objArr);
            case 22:
                w(objArr);
                return null;
            case 23:
                return b(objArr);
            case 24:
                p1 p1Var3 = (p1) objArr[0];
                int iIntValue12 = ((Number) objArr[1]).intValue();
                int i330 = f57620t0;
                int i331 = (i330 ^ 69) + ((i330 & 69) << 1);
                f57619s0 = i331 % 128;
                int i332 = i331 % 2;
                long[] jArr8 = p1Var3.f57621p0;
                int iMin = Math.min(iIntValue12, jArr8.length);
                if (iMin <= 0) {
                    int i333 = f57620t0;
                    int i334 = i333 & 29;
                    int i335 = (((~i334) & (i333 | 29)) - (~(-(-(i334 << 1))))) - 1;
                    f57619s0 = i335 % 128;
                    i21 = i335 % 2 != 0 ? 1 : 0;
                    int i336 = (i333 ^ 103) + ((i333 & 103) << 1);
                    f57619s0 = i336 % 128;
                    int i337 = i336 % 2;
                    iValueOf = Integer.valueOf(i21);
                } else if (jArr8[0] != 0) {
                    do {
                        int i338 = ((iMin & 12) + (iMin | 12)) - 1;
                        iMin = ((i338 & (-11)) + (i338 | (-11))) - 1;
                    } while (jArr8[iMin] == 0);
                    int i339 = f57620t0 + 23;
                    f57619s0 = i339 % 128;
                    iValueOf = Integer.valueOf(i339 % 2 != 0 ? iMin % 0 : ((iMin & 1) - (~(iMin | 1))) - 1);
                } else {
                    do {
                        iMin = ((~iMin) - (~(iMin << 1))) - 1;
                        if (jArr8[iMin] != 0) {
                            int i340 = f57619s0;
                            int i341 = i340 & 121;
                            int i342 = -(-((i340 ^ 121) | i341));
                            int i343 = ((i341 | i342) << 1) - (i342 ^ i341);
                            int i344 = i343 % 128;
                            f57620t0 = i344;
                            int i345 = i343 % 2;
                            int i346 = -(-(iMin * 421));
                            int i347 = (-419) & i346;
                            int i348 = (i346 ^ (-419)) | i347;
                            int i349 = (i347 ^ i348) + ((i348 & i347) << 1);
                            int i350 = iMin & iIntValue12;
                            int i351 = (~i350) & (iMin | iIntValue12);
                            int i352 = ~iIntValue12;
                            int i353 = -(-((~((i350 & i351) | (i351 ^ i350))) * TypedValues.CycleType.TYPE_EASING));
                            int i354 = i349 & i353;
                            int i355 = (((i353 | i349) & (~i354)) - (~(-(-(i354 << 1))))) - 1;
                            int i356 = iMin & (-2);
                            int i357 = (~i356) & (iMin | (-2));
                            int i358 = -(-(((i356 & i357) | (i357 ^ i356)) * (-420)));
                            int i359 = ((~i358) & i355) | ((~i355) & i358);
                            int i360 = (i355 & i358) << 1;
                            int i361 = (i359 & i360) + (i360 | i359);
                            int i362 = ~iMin;
                            int i363 = (-2) ^ i362;
                            int i364 = i362 & (-2);
                            int i365 = ~((i364 & i363) | (i363 ^ i364));
                            int i366 = (i352 | iIntValue12) & i352;
                            int i367 = i366 & iMin;
                            int i368 = (i366 | iMin) & (~i367);
                            int i369 = (i368 & i367) | (i368 ^ i367);
                            int i370 = ~i369;
                            int i371 = (i369 | i370) & i370;
                            int i372 = i365 ^ i371;
                            int i373 = i365 & i371;
                            int i374 = ((i373 & i372) | (i372 ^ i373)) * TypedValues.CycleType.TYPE_EASING;
                            int i375 = i361 & i374;
                            int i376 = (i374 ^ i361) | i375;
                            int i377 = (i375 ^ i376) + ((i376 & i375) << 1);
                            int i378 = (i344 ^ 9) + ((i344 & 9) << 1);
                            f57619s0 = i378 % 128;
                            int i379 = i378 % 2;
                            iValueOf = Integer.valueOf(i377);
                        }
                    } while (iMin > 0);
                    int i380 = f57619s0;
                    int i381 = (((i380 & (-4)) | ((~i380) & 3)) - (~((i380 & 3) << 1))) - 1;
                    int i382 = i381 % 128;
                    f57620t0 = i382;
                    int i383 = i381 % 2;
                    int i384 = i382 & 103;
                    int i385 = i382 | 103;
                    int i386 = ((i384 | i385) << 1) - (i385 ^ i384);
                    f57619s0 = i386 % 128;
                    int i387 = i386 % 2;
                }
                return iValueOf;
            case 25:
                B(objArr);
                return null;
            case 26:
                d(objArr);
                return null;
            case 27:
                s(objArr);
                return null;
            case 28:
                r(objArr);
                return null;
            case 29:
                int iIntValue13 = ((Number) objArr[0]).intValue();
                int i388 = f57620t0 + 11;
                int i389 = i388 % 128;
                f57619s0 = i389;
                int i390 = i388 % 2;
                short[] sArr = f57617q0;
                short s4 = sArr[iIntValue13 & 255];
                int i391 = sArr[(iIntValue13 >>> 8) & 255] << 16;
                int i392 = ((~i391) & s4) | ((~s4) & i391);
                int i393 = s4 & i391;
                short s7 = sArr[(iIntValue13 >>> 16) & 255];
                int i394 = sArr[iIntValue13 >>> 24] << 16;
                int i395 = ((~i394) & s7) | ((~s7) & i394);
                int i396 = i394 & s7;
                long j13 = ((((long) ((i396 & i395) | (i395 ^ i396))) & 4294967295L) << 32) | (4294967295L & ((long) ((i393 & i392) | (i392 ^ i393))));
                int i397 = i389 + 11;
                f57620t0 = i397 % 128;
                int i398 = i397 % 2;
                return Long.valueOf(j13);
            case 30:
                p1 p1Var4 = new p1((long[]) bek.setOnFocusChangeListener(new Object[]{((p1) objArr[0]).f57621p0}, 1616665569, -1616665546, (int) System.currentTimeMillis()));
                int i399 = f57620t0;
                int i400 = i399 | 77;
                int i401 = ((i400 << 1) - (~(-((~(i399 & 77)) & i400)))) - 1;
                f57619s0 = i401 % 128;
                int i402 = i401 % 2;
                return p1Var4;
            case 31:
                return t(objArr);
            case 32:
                return o(objArr);
            case 33:
                return k(objArr);
            case 34:
                p1 p1Var5 = (p1) objArr[0];
                int iIntValue14 = ((Number) objArr[1]).intValue();
                int i403 = f57619s0;
                int i404 = ((i403 ^ 89) | (i403 & 89)) << 1;
                int i405 = -(((~i403) & 89) | (i403 & (-90)));
                int i406 = (i404 ^ i405) + ((i405 & i404) << 1);
                f57620t0 = i406 % 128;
                int i407 = i406 % 2;
                long[] jArr9 = new long[iIntValue14];
                long[] jArr10 = p1Var5.f57621p0;
                if (i407 == 0) {
                    System.arraycopy(jArr10, 0, jArr9, 0, Math.min(jArr10.length, iIntValue14));
                } else {
                    System.arraycopy(jArr10, 0, jArr9, 0, Math.min(jArr10.length, iIntValue14));
                }
                int i408 = f57620t0;
                int i409 = i408 ^ 71;
                int i419 = -(-((i408 & 71) << 1));
                int i420 = (i409 & i419) + (i419 | i409);
                f57619s0 = i420 % 128;
                int i421 = i420 % 2;
                return jArr9;
            default:
                return h(objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if ((r4 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        r1 = 30 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
    
        r10 = (((-2) - (((r6 & 64) + (r6 | 64)) ^ (-1))) >>> 6) << 1;
        r11 = new long[r10];
        java.lang.System.arraycopy(r2.f57621p0, 0, r11, 0, r9);
        r2 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r12 = r2 | 105;
        r13 = (r12 << 1) - ((~(r2 & 105)) & r12);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        r2 = (~r4) | r4;
        r4 = (r4 & r2) + (r2 | r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a3, code lost:
    
        if (r4 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.p1.f57619s0;
        r12 = ((r2 ^ 103) | (r2 & 103)) << 1;
        r2 = -(((~r2) & 103) | (r2 & (-104)));
        r13 = (r12 ^ r2) + ((r2 & r12) << 1);
        com.mypinpad.tsdk.isolation.p1.f57620t0 = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c7, code lost:
    
        if ((r13 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        m(new java.lang.Object[]{r11, java.lang.Integer.valueOf(r9)}, -73347202, 73347215, r9);
        r2 = m(new java.lang.Object[]{r11, 0, java.lang.Integer.valueOf(r10), java.lang.Integer.valueOf(r6), r8}, -456521769, 456521800, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f4, code lost:
    
        r9 = ((java.lang.Integer) r2).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fc, code lost:
    
        m(new java.lang.Object[]{r11, java.lang.Integer.valueOf(r9)}, -73347202, 73347215, r9);
        r2 = m(new java.lang.Object[]{r11, 0, java.lang.Integer.valueOf(r10), java.lang.Integer.valueOf(r6), r8}, -456521769, 456521800, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0128, code lost:
    
        r0 = new com.mypinpad.tsdk.isolation.p1(r11, r9);
        r1 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r1 = (-2) - (((r1 & 118) + (r1 | 118)) ^ (-1));
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
    
        if (r9 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r9 == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.p1.f57620t0;
        r3 = r1 & 47;
        r1 = -(-((r1 ^ 47) | r3));
        r4 = (r3 & r1) + (r1 | r3);
        com.mypinpad.tsdk.isolation.p1.f57619s0 = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.p1 o(java.lang.Object[] r17) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.o(java.lang.Object[]):com.mypinpad.tsdk.i.p1");
    }

    public static p1 p(Object[] objArr) {
        int i10;
        p1 p1Var = (p1) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr = (int[]) objArr[2];
        int i11 = f57620t0;
        int i12 = i11 & 121;
        int i13 = ((i11 | 121) & (~i12)) + (i12 << 1);
        f57619s0 = i13 % 128;
        if (i13 % 2 != 0) {
            ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue();
            throw null;
        }
        int iIntValue2 = ((Integer) m(new Object[]{p1Var}, 440849681, -440849671, System.identityHashCode(p1Var))).intValue();
        if (iIntValue2 == 0) {
            int i14 = f57620t0;
            int i15 = (((i14 & (-6)) | ((~i14) & 5)) - (~(-(-((i14 & 5) << 1))))) - 1;
            f57619s0 = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i14 & 39) + (i14 | 39);
            f57619s0 = i17 % 128;
            int i18 = i17 % 2;
            return p1Var;
        }
        int i19 = iIntValue2 << 1;
        long[] jArr = new long[i19];
        int i20 = f57619s0;
        int i21 = (i20 & (-102)) | ((~i20) & 101);
        int i22 = -(-((i20 & 101) << 1));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f57620t0 = i23 % 128;
        int i24 = i23 % 2;
        int i25 = 0;
        while (i25 < i19) {
            int i26 = f57619s0;
            int i27 = i26 & 113;
            int i28 = ((((i26 ^ 113) | i27) << 1) - (~(-((i26 | 113) & (~i27))))) - 1;
            f57620t0 = i28 % 128;
            if (i28 % 2 == 0) {
                long j10 = p1Var.f57621p0[i25 << 1];
                int i29 = i25 + 59;
                int i30 = (int) j10;
                jArr[i25] = ((Long) m(new Object[]{Integer.valueOf(i30)}, 559780327, -559780298, i30)).longValue();
                int i31 = i29 | 13;
                int i32 = i31 << 1;
                int i33 = -(i31 & (~(i29 & 13)));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                int i35 = i34 & 89;
                int i36 = (i34 ^ 89) | i35;
                i10 = (i35 & i36) + (i35 | i36);
                int i37 = (int) (j10 >>> 38);
                jArr[i29] = ((Long) m(new Object[]{Integer.valueOf(i37)}, 559780327, -559780298, i37)).longValue();
            } else {
                long j11 = p1Var.f57621p0[i25 >>> 1];
                int i38 = i25 & (-120);
                int i39 = (i38 - (~(-(-((i25 ^ (-120)) | i38))))) + 120;
                int i40 = (int) j11;
                jArr[i25] = ((Long) m(new Object[]{Integer.valueOf(i40)}, 559780327, -559780298, i40)).longValue();
                int i41 = i39 & (-69);
                int i42 = i39 | (-69);
                int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                int i44 = ((i43 ^ 70) | (i43 & 70)) << 1;
                int i45 = -((i43 & (-71)) | (70 & (~i43)));
                i10 = (i44 & i45) + (i44 | i45);
                int i46 = (int) (j11 >>> 32);
                jArr[i39] = ((Long) m(new Object[]{Integer.valueOf(i46)}, 559780327, -559780298, i46)).longValue();
            }
            i25 = i10;
            int i47 = f57619s0;
            int i48 = (i47 ^ 43) + ((i47 & 43) << 1);
            f57620t0 = i48 % 128;
            int i49 = i48 % 2;
        }
        p1 p1Var2 = new p1(jArr, ((Integer) m(new Object[]{jArr, 0, Integer.valueOf(i19), Integer.valueOf(iIntValue), iArr}, -456521769, 456521800, 0)).intValue());
        int i50 = f57619s0 + 17;
        f57620t0 = i50 % 128;
        int i51 = i50 % 2;
        return p1Var2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v65 long, still in use, count: 2, list:
          (r10v65 long) from 0x0204: PHI (r10 I:??) = (r10v63 long), (r10v65 long) binds: [B:37:0x01db, B:34:0x01d1] A[DONT_GENERATE, DONT_INLINE]
          (r10v65 long) from 0x01cf: CMP_L (r10v65 long), (0 long) A[WRAPPED] (LINE:464)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.p1 q(java.lang.Object[] r38) {
        /*
            Method dump skipped, instruction units count: 1743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.q(java.lang.Object[]):com.mypinpad.tsdk.i.p1");
    }

    public static /* synthetic */ void r(Object[] objArr) {
        int i10 = 0;
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i11 = 2;
        long[] jArr2 = (long[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        long[] jArr3 = (long[]) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int iIntValue4 = ((Number) objArr[6]).intValue();
        int i12 = f57620t0;
        int i13 = (i12 & (-68)) | ((~i12) & 67);
        int i14 = -(-((i12 & 67) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        int i16 = i15 % 128;
        f57619s0 = i16;
        int i17 = i15 % 2;
        int i18 = i16 & 43;
        int i19 = ((((i16 ^ 43) | i18) << 1) - (~(-((i16 | 43) & (~i18))))) - 1;
        f57620t0 = i19 % 128;
        int i20 = i19 % 2;
        while (i10 < iIntValue4) {
            int i21 = f57619s0;
            int i22 = (i21 & (-24)) | ((~i21) & 23);
            int i23 = (i21 & 23) << 1;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f57620t0 = i24 % 128;
            int i25 = i24 % i11;
            int i26 = i10 * 319;
            int i27 = iIntValue * (-317);
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            int i29 = ~iIntValue;
            int i30 = ~i10;
            int i31 = i30 & iIntValue;
            int i32 = (~i31) & (i30 | iIntValue);
            int i33 = ~((i31 & i32) | (i32 ^ i31));
            int i34 = i29 & i33;
            int i35 = (((i33 | i29) & (~i34)) | i34) * (-318);
            int i36 = (i28 ^ i35) + ((i28 & i35) << 1);
            int i37 = i29 & iIntValue;
            int i38 = i29 | iIntValue;
            int i39 = ~(i37 | ((~i37) & i38));
            int i40 = i29 & i38;
            int i41 = (i40 & i10) | (i40 ^ i10);
            int i42 = i41 ^ iIntValue;
            int i43 = i41 & iIntValue;
            int i44 = (i42 ^ i43) | (i43 & i42);
            int i45 = ~i44;
            int i46 = (i44 | i45) & i45;
            int i47 = ((~i39) & i46) | ((~i46) & i39);
            int i48 = i39 & i46;
            int i49 = -(-(((i47 & i48) | (i47 ^ i48)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i50 = i36 ^ i49;
            int i51 = ((((i49 & i36) | i50) << 1) - (~(-i50))) - 1;
            int i52 = i29 & i29;
            int i53 = ((i29 | i29) & (~i52)) | i52;
            int i54 = (i53 & i30) | ((~i53) & i10);
            int i55 = i53 & i10;
            int i56 = (i55 & i54) | (i54 ^ i55);
            int i57 = ~i56;
            int i58 = (i56 | i57) & i57;
            int i59 = i10 ^ iIntValue;
            int i60 = i10 & iIntValue;
            int i61 = (i59 & i60) | (i59 ^ i60);
            int i62 = i61 ^ iIntValue;
            int i63 = i61 & iIntValue;
            int i64 = (i63 & i62) | (i62 ^ i63);
            int i65 = ~i64;
            int i66 = (i64 | i65) & i65;
            int i67 = i58 & i66;
            int i68 = (((i58 | i66) & (~i67)) | i67) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            int i69 = ((~i68) & i51) | ((~i51) & i68);
            int i70 = (i51 & i68) << 1;
            int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
            long j10 = jArr[i71];
            int i72 = -(-i10);
            long j11 = jArr2[((iIntValue2 ^ i72) - (~(-(-((i72 & iIntValue2) << 1))))) - 1];
            int i73 = iIntValue3 - i30;
            jArr[i71] = j10 ^ (j11 ^ jArr3[(i73 ^ (-1)) + (i73 << 1)]);
            i10++;
            i11 = 2;
        }
        int i74 = f57620t0;
        int i75 = ((i74 & (-18)) | ((~i74) & 17)) + ((i74 & 17) << 1);
        f57619s0 = i75 % 128;
        if (i75 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void s(Object[] objArr) {
        int i10;
        long[] jArr = (long[]) objArr[0];
        int i11 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i12 = 2;
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int[] iArr = (int[]) objArr[5];
        int i13 = f57619s0;
        int i14 = i13 & 33;
        int i15 = -(-((i13 ^ 33) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f57620t0 = i16 % 128;
        int i17 = i16 % 2 == 0 ? iIntValue3 % 1 : iIntValue3 >>> 6;
        while (true) {
            int i18 = iIntValue2 & (-44);
            int i19 = ((iIntValue2 ^ (-44)) | i18) << i11;
            int i20 = -((iIntValue2 | (-44)) & (~i18));
            int i21 = ((i19 | i20) << i11) - (i20 ^ i19);
            int i22 = i21 & 43;
            int i23 = (~i22) & (i21 | 43);
            int i24 = -(-(i22 << i11));
            int i25 = (i23 & i24) + (i24 | i23);
            if (i25 <= i17) {
                break;
            }
            int i26 = f57619s0 + 51;
            int i27 = i26 % 128;
            f57620t0 = i27;
            int i28 = i26 % i12;
            int i29 = i25 * (-51);
            int i30 = -(-(iIntValue * 53));
            int i31 = ((i29 | i30) << i11) - (i29 ^ i30);
            int i32 = ~iIntValue;
            int i33 = i32 | iIntValue;
            int i34 = i32 & i33;
            int i35 = i34 ^ i25;
            int i36 = i34 & i25;
            int i37 = (i35 ^ i36) | (i35 & i36);
            int i38 = i37 & iIntValue;
            int i39 = (~i38) & (i37 | iIntValue);
            int i40 = -(-((~((i39 ^ i38) | (i38 & i39))) * 52));
            int i41 = i31 & i40;
            int i42 = (i40 | i31) & (~i41);
            int i43 = -(-(i41 << 1));
            int i44 = (i42 & i43) + (i42 | i43);
            int i45 = ~i32;
            int i46 = i32 & i45;
            int i47 = i46 | i46;
            int i48 = i32 & i32;
            int i49 = (i47 ^ i48) | (i47 & i48);
            int i50 = i17;
            int i51 = ~i49;
            int i52 = (i49 | i51) & i51;
            int i53 = i32 ^ i25;
            int i54 = iIntValue3;
            int i55 = ~i25;
            int[] iArr2 = iArr;
            int i56 = i32 & i25;
            int i57 = ~((i53 ^ i56) | (i53 & i56));
            int i58 = (i52 ^ i57) | (i52 & i57);
            int i59 = (~i36) & (i34 | i25);
            int i60 = ~((i59 ^ i36) | (i36 & i59));
            int i61 = i58 & i60;
            int i62 = iIntValue4;
            int i63 = (i58 | i60) & (~i61);
            int i64 = -(-(((i63 & i61) | (i63 ^ i61)) * (-52)));
            int i65 = (i44 & i64) + (i64 | i44);
            int i66 = (i55 | i25) & i55;
            int i67 = (i66 ^ i34) | (i66 & i34);
            int i68 = ~i67;
            int i69 = (i67 | i68) & i68;
            int i70 = i55 & iIntValue;
            int i71 = ~(i70 | ((~i70) & (i55 | iIntValue)));
            int i72 = i69 & i71;
            int i73 = (((~i72) & (i69 | i71)) | i72) * 52;
            int i74 = i65 & i73;
            long j10 = jArr[i74 + ((i73 ^ i65) | i74)];
            if (j10 != 0) {
                int i75 = ((i27 & 100) + (i27 | 100)) - 1;
                f57619s0 = i75 % 128;
                int i76 = i75 % 2;
                int i77 = i25 * (-405);
                int i78 = iIntValue * 407;
                int i79 = ((((~i78) & i77) | ((~i77) & i78)) - (~(-(-((i77 & i78) << 1))))) - 1;
                int i80 = (i45 & iIntValue) | i48;
                int i81 = i32 & iIntValue;
                int i82 = ~((i80 & i81) | (i80 ^ i81));
                int i83 = (~i56) & (i32 | i25);
                int i84 = (i83 & i56) | (i83 ^ i56);
                int i85 = ~((i84 & iIntValue) | (i84 ^ iIntValue));
                int i86 = i82 & i85;
                int i87 = (i82 | i85) & (~i86);
                int i88 = -(~(((i87 & i86) | (i87 ^ i86)) * (-406)));
                int i89 = ((i79 & i88) + (i88 | i79)) - 1;
                int i90 = i32 & i34;
                int i91 = (i32 | i34) & (~i90);
                int i92 = (i90 & i91) | (i91 ^ i90);
                int i93 = -(-((~((i92 & i25) | (i92 & i55) | ((~i92) & i25))) * (-406)));
                int i94 = i89 & i93;
                int i95 = (i93 | i89) & (~i94);
                int i96 = i94 << 1;
                int i97 = (i95 & i96) + (i95 | i96);
                int i98 = ~((i66 ^ iIntValue) | (i66 & iIntValue));
                int i99 = (~i81) & i33;
                int i100 = ~((i99 & i81) | (i99 ^ i81));
                int i101 = ((i98 & i100) | (i98 ^ i100)) * 406;
                jArr[((i97 ^ i101) - (~((i101 & i97) << 1))) - 1] = 0;
                H(jArr, iIntValue, i25 << 6, j10, i62, iArr2);
                int i102 = f57620t0;
                int i103 = ((i102 ^ 12) + ((i102 & 12) << 1)) - 1;
                f57619s0 = i103 % 128;
                int i104 = i103 % 2;
            }
            int i105 = f57619s0;
            int i106 = i105 ^ 35;
            int i107 = ((((i105 & 35) | i106) << 1) - (~(-i106))) - 1;
            f57620t0 = i107 % 128;
            int i108 = i107 % 2;
            iArr = iArr2;
            iIntValue2 = i25;
            i17 = i50;
            iIntValue3 = i54;
            iIntValue4 = i62;
            i11 = 1;
            i12 = 2;
        }
        int i109 = iIntValue3;
        int i110 = iIntValue4;
        int[] iArr3 = iArr;
        int i111 = i17;
        int i112 = i109 & 63;
        int i113 = i111 * 70;
        int i114 = iIntValue * (-68);
        int i115 = (i113 | i114) << 1;
        int i116 = -((i114 & (~i113)) | ((~i114) & i113));
        int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
        int i118 = ~i111;
        int i119 = ~iIntValue;
        int i120 = (i119 | iIntValue) & i119;
        int i121 = i118 & i120;
        int i122 = (i118 ^ i120) | i121;
        int i123 = i122 ^ iIntValue;
        int i124 = i122 & iIntValue;
        int i125 = ~((i124 & i123) | (i123 ^ i124));
        int i126 = i111 & i119;
        int i127 = iIntValue & i118;
        int i128 = i111 & iIntValue;
        int i129 = i126 | i127 | i128;
        int i130 = (i129 & iIntValue) | (i129 ^ iIntValue);
        int i131 = ~i130;
        int i132 = (i130 | i131) & i131;
        int i133 = i125 & i132;
        int i134 = (i125 | i132) & (~i133);
        int i135 = -(-(((i134 & i133) | (i134 ^ i133)) * 69));
        int i136 = (i117 ^ i135) + ((i117 & i135) << 1);
        int i137 = (i118 | i111) & i118;
        int i138 = i137 & iIntValue;
        int i139 = (i137 | iIntValue) & (~i138);
        int i140 = ~((i139 & i138) | (i139 ^ i138));
        int i141 = (i118 ^ iIntValue) | i127;
        int i142 = ~i141;
        int i143 = i140 | ((i141 | i142) & i142);
        int i144 = iIntValue & i119;
        int i145 = i144 | i144;
        int i146 = iIntValue & iIntValue;
        int i147 = ~((i145 & i146) | (i145 ^ i146));
        int i148 = ((i143 & i147) | (i143 ^ i147)) * (-69);
        int i149 = i136 & i148;
        int i150 = -(-((i148 ^ i136) | i149));
        int i151 = (i149 & i150) + (i150 | i149);
        int i152 = i120 & i111;
        int i153 = (~i152) & (i120 | i111);
        int i154 = -(-((~((i152 & i153) | (i153 ^ i152))) * 69));
        int i155 = i151 | i154;
        long j11 = jArr[((i155 << 1) - (~(-((~(i154 & i151)) & i155)))) - 1] >>> i112;
        if (j11 != 0) {
            int i156 = f57620t0 + 121;
            f57619s0 = i156 % 128;
            int i157 = i156 % 2;
            int i158 = i111 * (-830);
            int i159 = iIntValue * 832;
            int i160 = (i158 & i159) + (i159 | i158);
            int i161 = i119 & i119;
            int i162 = (~i161) & (i119 | i119);
            int i163 = ~((i162 ^ i161) | (i161 & i162));
            int i164 = (i111 ^ iIntValue) | i128;
            int i165 = i164 & iIntValue;
            int i166 = (~i165) & (i164 | iIntValue);
            int i167 = ~((i165 & i166) | (i166 ^ i165));
            int i168 = ((~i167) & i163) | ((~i163) & i167);
            int i169 = i167 & i163;
            int i170 = -(-(((i169 & i168) | (i168 ^ i169)) * (-831)));
            int i171 = (i160 & i170) + (i170 | i160);
            int i172 = (i119 & i118) | ((~i119) & i111);
            int i173 = (i172 & i126) | (i172 ^ i126);
            int i174 = (i119 & i173) | ((~i173) & iIntValue);
            int i175 = i173 & iIntValue;
            int i176 = (~((i175 & i174) | (i174 ^ i175))) * (-1662);
            int i177 = (i171 & i176) + (i176 | i171);
            int i178 = (~i121) & (i118 | i120);
            int i179 = ~((i178 & i121) | (i178 ^ i121));
            int i180 = (i111 | iIntValue) & (~i128);
            int i181 = ~((i180 & i128) | (i180 ^ i128));
            int i182 = (i179 & i181) | (i179 ^ i181);
            int i183 = i182 ^ i147;
            int i184 = i182 & i147;
            int i185 = ((i184 & i183) | (i183 ^ i184)) * 831;
            int i186 = i177 & i185;
            int i187 = ((i185 | i177) & (~i186)) + (i186 << 1);
            jArr[i187] = jArr[i187] ^ (j11 << i112);
            H(jArr, iIntValue, i109, j11, i110, iArr3);
            int i188 = f57619s0 + 9;
            f57620t0 = i188 % 128;
            i10 = 2;
            int i189 = i188 % 2;
        } else {
            i10 = 2;
        }
        int i190 = f57620t0 + 85;
        f57619s0 = i190 % 128;
        if (i190 % i10 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer t(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int[] iArr = (int[]) objArr[4];
        int i17 = f57619s0;
        int i18 = ((i17 & (-10)) | ((~i17) & 9)) + ((i17 & 9) << 1);
        f57620t0 = i18 % 128;
        int i19 = i18 % 2;
        int i20 = (-2) - (((-51219) - (~(iIntValue3 * Constant.ERROR_CODE_408))) ^ (-1));
        int i21 = ~iIntValue3;
        int i22 = (i21 | iIntValue3) & i21;
        int i23 = ~((i22 & (-64)) | ((~i22) & 63) | (i22 & 63));
        int i24 = iIntValue & 63;
        int i25 = (~i24) & (iIntValue | 63);
        int i26 = ~iIntValue;
        int i27 = ~((i25 ^ i24) | (i25 & i24));
        int i28 = ((~i27) & i23) | ((~i23) & i27);
        int i29 = i23 & i27;
        int i30 = -(-(((i28 & i29) | (i28 ^ i29)) * (-814)));
        int i31 = (i20 ^ i30) + ((i30 & i20) << 1);
        int i32 = (i26 | iIntValue) & i26;
        int i33 = i21 ^ i32;
        int i34 = i21 & i32;
        int i35 = (i33 & i34) | (i33 ^ i34);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = (-64) & iIntValue3;
        int i39 = ~(((-64) ^ iIntValue3) | i38);
        int i40 = iIntValue & (-64);
        int i41 = ((i37 ^ i39) | (i37 & i39) | (~((i26 & 63) | i40 | i24))) * 407;
        int i42 = (i31 | i41) << 1;
        int i43 = -(((~i31) & i41) | ((~i41) & i31));
        int i44 = (i42 & i43) + (i43 | i42);
        int i45 = ((-64) & i21) | (iIntValue3 & 63) | i38;
        int i46 = ~i45;
        int i47 = (-64) ^ iIntValue;
        int i48 = ((i45 | i46) & i46) | (~((i47 & i40) | (i47 ^ i40)));
        int i49 = ~((iIntValue3 & i26) | (iIntValue & i21) | (iIntValue3 & iIntValue));
        int i50 = -(-(((i48 & i49) | (i48 ^ i49)) * 407));
        int i51 = i44 & i50;
        int i52 = ((i44 ^ i50) | i51) << 1;
        int i53 = -((i50 | i44) & (~i51));
        int i54 = ((i52 & i53) + (i53 | i52)) >>> 6;
        if (iIntValue2 < i54) {
            int i55 = i17 & 61;
            int i56 = i55 + ((i17 ^ 61) | i55);
            f57620t0 = i56 % 128;
            if (i56 % 2 == 0) {
                int i57 = 25 / 0;
            }
            int i58 = i17 ^ 109;
            int i59 = (i17 & 109) << 1;
            int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
            f57620t0 = i60 % 128;
            if (i60 % 2 != 0) {
                return Integer.valueOf(iIntValue2);
            }
            throw null;
        }
        int i61 = iIntValue2 << 6;
        int iMin = Math.min(i61, (iIntValue3 << 1) - 1);
        int i62 = -iMin;
        int i63 = i61 & i62;
        int i64 = ((i61 ^ i62) | i63) << 1;
        int i65 = -((i61 | i62) & (~i63));
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        int i67 = f57619s0;
        int i68 = (i67 & 76) + (i67 | 76);
        int i69 = (i68 ^ (-1)) + (i68 << 1);
        f57620t0 = i69 % 128;
        int i70 = i69 % 2;
        while (i66 >= 64) {
            int i71 = f57620t0;
            int i72 = i71 & 33;
            int i73 = i72 + ((i71 ^ 33) | i72);
            f57619s0 = i73 % 128;
            if (i73 % 2 != 0) {
                int i74 = (iIntValue2 & 47) + (iIntValue2 | 47);
                int i75 = i66 ^ 127;
                int i76 = (i66 & 127) << 1;
                int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                iIntValue2 = i74;
                i66 = i77;
            } else {
                int i78 = (iIntValue2 ^ (-96)) + ((iIntValue2 & (-96)) << 1);
                iIntValue2 = (i78 ^ 95) + ((i78 & 95) << 1);
                i66 -= 64;
            }
            int i79 = i71 & 57;
            int i80 = -(-((i71 ^ 57) | i79));
            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
            f57619s0 = i81 % 128;
            int i82 = i81 % 2;
        }
        int length = iArr.length;
        int i83 = -(-(length * (-55)));
        int i84 = (55 | i83) << 1;
        int i85 = -(((~i83) & 55) | (i83 & (-56)));
        int i86 = (i84 & i85) + (i84 | i85);
        int i87 = ~((i26 ^ iIntValue) | (i26 & iIntValue));
        int i88 = length & i87;
        int i89 = (~i88) & (i87 | length);
        int i90 = -(~(-(-(((i89 & i88) | (i89 ^ i88)) * 56))));
        int i91 = (((i86 | i90) << 1) - (i90 ^ i86)) - 1;
        int i92 = ((-1) ^ length) | length;
        int i93 = ~i92;
        int i94 = ((i92 | i93) & i93) * (-56);
        int i95 = i91 & i94;
        int i96 = (((i94 | i91) & (~i95)) - (~(-(-(i95 << 1))))) - 1;
        int i97 = i32 ^ length;
        int i98 = i32 & length;
        int i99 = ~((i97 & i98) | (i97 ^ i98));
        int i100 = ~i99;
        int i101 = iArr[(i96 - (~(-(~(-(-(((i99 & i100) | (i100 ^ i99)) * 56))))))) - 2];
        if (length > 1) {
            int i102 = f57620t0;
            int i103 = (i102 ^ 110) + ((i102 & 110) << 1);
            int i104 = (i103 ^ (-1)) + (i103 << 1);
            f57619s0 = i104 % 128;
            int i105 = i104 % 2;
            int i106 = length & (-2);
            i10 = iArr[(((length | (-2)) & (~i106)) - (~(i106 << 1))) - 1];
            int i107 = i102 & 57;
            int i108 = i102 | 57;
            int i109 = (i107 & i108) + (i107 | i108);
            f57619s0 = i109 % 128;
            int i110 = i109 % 2;
        } else {
            int i111 = f57620t0;
            int i112 = (((i111 | 76) << 1) - (i111 ^ 76)) - 1;
            f57619s0 = i112 % 128;
            int i113 = i112 % 2;
            i10 = 0;
        }
        int i114 = -(-(i101 * (-712)));
        int i115 = 45696 & i114;
        int i116 = i114 | 45696;
        int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
        int i118 = (-65) & i26;
        int i119 = (~i118) & ((-65) | i26);
        int i120 = ~i26;
        int i121 = ~((i119 ^ i118) | (i119 & i118));
        int i122 = ((-65) ^ i101) | ((-65) & i101);
        int i123 = ~i122;
        int i124 = i123 & (i122 | i123);
        int i125 = (i124 & i121) | (i121 ^ i124);
        int i126 = ~i101;
        int i127 = i126 ^ 64;
        int i128 = i126 & 64;
        int i129 = (i127 ^ i128) | (i127 & i128);
        int i130 = i129 & iIntValue;
        int i131 = (~i130) & (i129 | iIntValue);
        int i132 = ~((i131 ^ i130) | (i131 & i130));
        int i133 = i125 & i132;
        int i134 = iIntValue2;
        int i135 = (i125 | i132) & (~i133);
        int i136 = ((i135 & i133) | (i135 ^ i133)) * (-713);
        int i137 = ((i117 | i136) << 1) - (i136 ^ i117);
        int i138 = i127 | i128;
        int i139 = i138 ^ iIntValue;
        int i140 = i138 & iIntValue;
        int i141 = (i140 & i139) | (i139 ^ i140);
        int i142 = ~i141;
        int i143 = (i137 - (~(-(~(((i141 | i142) & i142) * 1426))))) - 2;
        int i144 = (i126 | i101) & i126;
        int i145 = (i144 & i26) | (i144 ^ i26);
        int i146 = ~i145;
        int i147 = -(-(((i145 | i146) & i146) * 713));
        int i148 = ((i143 ^ i147) | (i143 & i147)) << 1;
        int i149 = -((i147 & (~i143)) | ((~i147) & i143));
        int iMax = Math.max(iIntValue3, ((i148 | i149) << 1) - (i149 ^ i148));
        int i150 = -iMax;
        int i151 = ((iMin ^ i150) | (iMin & i150)) << 1;
        int i152 = -((i150 & (~iMin)) | ((~i150) & iMin));
        int i153 = (i151 ^ i152) + ((i152 & i151) << 1);
        int i154 = -(~(-i10));
        int iMin2 = Math.min(i153, (((iIntValue3 | i154) << 1) - (i154 ^ iIntValue3)) - 1);
        int i155 = iMin2 * (-1529);
        int i156 = -(-(i66 * (-764)));
        int i157 = i155 & i156;
        int i158 = (i155 ^ i156) | i157;
        int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
        int i160 = ~iMin2;
        int i161 = ~i66;
        int i162 = (i161 | i66) & i161;
        int i163 = (~i162) & i160;
        int i164 = ~i160;
        int i165 = i163 | (i162 & i164);
        int i166 = i160 & i162;
        int i167 = (i165 ^ i166) | (i165 & i166);
        int i168 = i167 & i32;
        int i169 = (~i168) & (i167 | i32);
        int i170 = ~((i169 & i168) | (i169 ^ i168));
        int i171 = i160 | i66;
        int i172 = i171 & iIntValue;
        int i173 = (i171 | iIntValue) & (~i172);
        int i174 = ~((i173 & i172) | (i173 ^ i172));
        int i175 = i170 & i174;
        int i176 = ((i170 | i174) & (~i175)) | i175;
        int i177 = i161 & iMin2;
        int i178 = i177 | ((~i177) & (i161 | iMin2));
        int i179 = (i178 & iIntValue) | (i178 ^ iIntValue);
        int i180 = ~i179;
        int i181 = (i179 | i180) & i180;
        int i182 = i176 ^ i181;
        int i183 = i176 & i181;
        int i184 = ((i183 & i182) | (i182 ^ i183)) * 765;
        int i185 = i159 ^ i184;
        int i186 = -(-((i184 & i159) << 1));
        int i187 = (i185 & i186) + (i186 | i185);
        int i188 = ~((i160 ^ i162) | i166);
        int i189 = (i160 & i120) | (i26 & i164);
        int i190 = i160 & i26;
        int i191 = ~((i189 & i190) | (i189 ^ i190));
        int i192 = -(-(((i188 & i191) | ((~i191) & i188) | ((~i188) & i191)) * 1530));
        int i193 = i187 & i192;
        int i194 = (i192 | i187) & (~i193);
        int i195 = i193 << 1;
        int i196 = ((i194 | i195) << 1) - (i194 ^ i195);
        int i197 = (iIntValue & i164) | i190 | (i160 & iIntValue);
        int i198 = ~i197;
        int i199 = (i197 | i198) & i198;
        int i200 = (i161 ^ i26) | (i161 & i26);
        int i201 = i200 & iMin2;
        int i202 = (i199 | (~(((iMin2 | i200) & (~i201)) | i201))) * 765;
        int i203 = ((i196 & i202) + (i202 | i196)) >> 6;
        if (i203 > 1) {
            int i204 = f57620t0;
            int i205 = i204 ^ 19;
            int i206 = ((i204 & 19) | i205) << 1;
            int i207 = -i205;
            int i208 = (i206 & i207) + (i207 | i206);
            f57619s0 = i208 % 128;
            if (i208 % 2 != 0) {
                i16 = i134 / i203;
                m(new Object[]{jArr, 1, Integer.valueOf(i134), Integer.valueOf(i16), Integer.valueOf(iIntValue3), iArr}, -172092952, 172092959, 1);
                i15 = i134;
            } else {
                int i209 = -i203;
                i15 = i134;
                i16 = ((((i134 ^ i209) | (i134 & i209)) << 1) - (~(-((i209 & (~i15)) | (i134 & (~i209)))))) - 1;
                m(new Object[]{jArr, 0, Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(iIntValue3), iArr}, -172092952, 172092959, 0);
            }
            while (i15 > i16) {
                int i210 = i15 & (-68);
                i15 = i210 + ((i15 ^ (-68)) | i210) + 67;
                int i211 = i15 * (-445);
                int i212 = ~i15;
                int i213 = ~i212;
                int i214 = ~((i213 & i212) | (i213 ^ i212));
                int i215 = ~(((-1) ^ i32) | i32);
                int i216 = ((~i215) & i214) | ((~i214) & i215);
                int i217 = i214 & i215;
                int i218 = -(-(((i217 & i216) | (i216 ^ i217)) * 446));
                int i219 = i211 & i218;
                int i220 = (i211 | i218) & (~i219);
                int i221 = -(-(i219 << 1));
                int i222 = (i220 ^ i221) + ((i220 & i221) << 1);
                int i223 = ~i212;
                int i224 = i223 & (i223 | i212);
                int i225 = (i212 ^ i15) | (i212 & i15);
                int i226 = i225 & iIntValue;
                int i227 = (i225 | iIntValue) & (~i226);
                int i228 = (i227 & i226) | (i227 ^ i226);
                int i229 = ~i228;
                int i230 = (i228 | i229) & i229;
                int i231 = -(-(((i224 & i230) | (i224 ^ i230)) * 446));
                int i232 = i222 & i231;
                int i233 = (i231 | i222) & (~i232);
                int i234 = -(-(i232 << 1));
                int i235 = (i233 ^ i234) + ((i233 & i234) << 1);
                int i236 = (i212 | i15) & i212;
                int i237 = i236 | (~i236);
                int i238 = ~i237;
                int i239 = -(-(((i237 | i238) & i238) * 446));
                jArr[(i235 & i239) + (i239 | i235)] = 0;
                int i240 = f57620t0;
                int i241 = ((i240 | 113) << 1) - (i240 ^ 113);
                f57619s0 = i241 % 128;
                int i242 = i241 % 2;
            }
            i12 = i16 << 6;
            int i243 = f57619s0;
            int i244 = i243 & 101;
            int i245 = (i243 | 101) & (~i244);
            int i246 = i244 << 1;
            int i247 = (i245 ^ i246) + ((i245 & i246) << 1);
            f57620t0 = i247 % 128;
            int i248 = i247 % 2;
            i11 = i15;
        } else {
            i11 = i134;
            i12 = iMin;
        }
        if (i12 > iMax) {
            int i249 = f57619s0;
            int i250 = (i249 ^ 123) + ((i249 & 123) << 1);
            f57620t0 = i250 % 128;
            int i251 = i250 % 2;
            m(new Object[]{jArr, 0, Integer.valueOf(i11), Integer.valueOf(iMax), Integer.valueOf(iIntValue3), iArr}, 544188401, -544188374, 0);
            int i252 = f57619s0;
            int i253 = i252 & 79;
            int i254 = (i252 ^ 79) | i253;
            int i255 = ((i253 | i254) << 1) - (i254 ^ i253);
            f57620t0 = i255 % 128;
            int i256 = i255 % 2;
        } else {
            i13 = i12;
        }
        if (i13 > iIntValue3) {
            i13 = iMax;
            int i257 = (-2) - ((f57620t0 + 114) ^ (-1));
            f57619s0 = i257 % 128;
            int i258 = i257 % 2;
            E(jArr, i13, iIntValue3, iArr);
            int i259 = f57619s0;
            int i260 = (-2) - ((-1) ^ ((i259 & 48) + (i259 | 48)));
            f57620t0 = i260 % 128;
            i14 = 2;
            int i261 = i260 % 2;
        } else {
            i13 = iMax;
            i14 = 2;
        }
        int i262 = f57619s0 + 111;
        f57620t0 = i262 % 128;
        int i263 = i262 % i14;
        return Integer.valueOf(i54);
    }

    public static /* synthetic */ void u(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int[] iArr = (int[]) objArr[4];
        int i10 = f57619s0 + 25;
        f57620t0 = i10 % 128;
        int i11 = i10 % 2;
        m(new Object[]{jArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 700255084, -700255058, iIntValue);
        int i12 = -iIntValue3;
        int i13 = i12 * 367;
        int i14 = -(~(-(-(iIntValue2 * 367))));
        int i15 = ((i13 ^ i14) + ((i13 & i14) << 1)) - 1;
        int i16 = ~iIntValue2;
        int i17 = ~i12;
        int i18 = iIntValue2 & i17;
        int i19 = (i12 & i16) | i18;
        int i20 = i12 & iIntValue2;
        int i21 = (i15 - (~(((i19 ^ i20) | (i19 & i20)) * (-366)))) - 1;
        int i22 = i16 & iIntValue;
        int i23 = (~i22) & (i16 | iIntValue);
        int i24 = ~((i23 ^ i22) | (i23 & i22));
        int i25 = i12 ^ i24;
        int i26 = i24 & i12;
        int i27 = ((i25 ^ i26) | (i26 & i25)) * (-366);
        int i28 = i21 & i27;
        int i29 = ((i27 | i21) & (~i28)) + (i28 << 1);
        int i30 = (~i18) & (i17 | iIntValue2);
        int i31 = ~((i30 & i18) | (i30 ^ i18));
        int i32 = (iIntValue2 | i16) & i16;
        int i33 = (i32 & i17) | ((~i32) & i12);
        int i34 = i32 & i12;
        int i35 = (i34 & i33) | (i33 ^ i34);
        int i36 = ~((i35 & iIntValue) | (i35 ^ iIntValue));
        int i37 = i31 & i36;
        int i38 = (i36 | i31) & (~i37);
        int i39 = -(-(((i38 & i37) | (i38 ^ i37)) * 366));
        int i40 = ((i29 ^ i39) | (i29 & i39)) << 1;
        int i41 = -((i39 & (~i29)) | ((~i39) & i29));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int length = iArr.length;
        int i43 = (-2) - ((f57619s0 + 36) ^ (-1));
        f57620t0 = i43 % 128;
        int i44 = i43 % 2;
        while (true) {
            int i45 = ~length;
            length = ((length | i45) << 1) - i45;
            if (length < 0) {
                break;
            }
            int i46 = f57620t0;
            int i47 = i46 & 59;
            int i48 = -(-((i46 ^ 59) | i47));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            f57619s0 = i49 % 128;
            if (i49 % 2 != 0) {
                m(new Object[]{jArr, Integer.valueOf(iIntValue), Integer.valueOf(iArr[length] << i42)}, 700255084, -700255058, iIntValue);
            } else {
                int i50 = iArr[length];
                int i51 = (i50 | i42) << 1;
                int i52 = -(i50 ^ i42);
                m(new Object[]{jArr, Integer.valueOf(iIntValue), Integer.valueOf((i51 & i52) + (i52 | i51))}, 700255084, -700255058, iIntValue);
            }
            int i53 = f57619s0;
            int i54 = ((i53 ^ 24) + ((i53 & 24) << 1)) - 1;
            f57620t0 = i54 % 128;
            int i55 = i54 % 2;
        }
        m(new Object[]{jArr, Integer.valueOf(iIntValue), Integer.valueOf(i42)}, 700255084, -700255058, iIntValue);
        int i56 = f57620t0;
        int i57 = (i56 & (-118)) | ((~i56) & 117);
        int i58 = (i56 & 117) << 1;
        int i59 = (i57 & i58) + (i58 | i57);
        f57619s0 = i59 % 128;
        if (i59 % 2 != 0) {
            throw null;
        }
    }

    public static void v(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int iIntValue4 = ((Number) objArr[5]).intValue();
        int i10 = f57619s0;
        int i11 = i10 & 37;
        int i12 = (i11 - (~((i10 ^ 37) | i11))) - 1;
        f57620t0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = iIntValue - (~(iIntValue4 >>> 6));
        int i15 = i14 - 1;
        int i16 = iIntValue4 & 63;
        if (i16 == 0) {
            int i17 = ((i10 | 42) << 1) - (i10 ^ 42);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f57620t0 = i18 % 128;
            int i19 = i18 % 2;
            i(i15, jArr, iIntValue2, jArr2, iIntValue3);
            if (i19 == 0) {
                int i20 = 86 / 0;
            }
            int i21 = f57620t0;
            int i22 = (i21 & (-102)) | ((~i21) & 101);
            int i23 = -(-((i21 & 101) << 1));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f57619s0 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 86 / 0;
                return;
            }
            return;
        }
        int i26 = -i16;
        int i27 = i26 * 714;
        int i28 = ((i27 & (-45567)) + (i27 | (-45567))) - 1;
        int i29 = ~i26;
        int i30 = (i29 | i26) & i29;
        int i31 = ~iIntValue;
        int i32 = i31 & (i31 | iIntValue);
        int i33 = ((~i30) & i32) | ((~i32) & i30);
        int i34 = i30 & i32;
        int i35 = (i33 & i34) | (i33 ^ i34);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = i30 ^ 64;
        int i39 = i30 & 64;
        int i40 = ~((i38 & i39) | (i38 ^ i39));
        int i41 = i37 & i40;
        int i42 = ((i37 | i40) & (~i41)) | i41;
        int i43 = ((-65) & i29) | (i26 & 64);
        int i44 = (-65) & i26;
        int i45 = i43 | i44;
        int i46 = ~((i45 & iIntValue) | (i45 ^ iIntValue));
        int i47 = ((~i42) & i46) | ((~i46) & i42);
        int i48 = i42 & i46;
        int i49 = ((i48 & i47) | (i47 ^ i48)) * (-713);
        int i50 = (i28 & i49) + (i49 | i28);
        int i51 = (i26 | (-65)) & (~i44);
        int i52 = (i51 & i44) | (i51 ^ i44);
        int i53 = i52 ^ iIntValue;
        int i54 = i52 & iIntValue;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~i55;
        int i57 = ((i55 | i56) & i56) * 1426;
        int i58 = (((~i57) & i50) | ((~i50) & i57)) + ((i57 & i50) << 1);
        int i59 = (~(((-65) ^ i31) | ((-65) & i31))) * 713;
        int i60 = (i58 & i59) + (i59 | i58);
        int i61 = (i10 & (-46)) | ((~i10) & 45);
        int i62 = (i10 & 45) << 1;
        int i63 = ((i61 | i62) << 1) - (i61 ^ i62);
        int i64 = i63 % 128;
        f57620t0 = i64;
        int i65 = i63 % 2;
        int i66 = -i60;
        int i67 = i66 * 868;
        int i68 = (i67 & 55552) + (i67 | 55552);
        int i69 = ~i66;
        int i70 = ~i14;
        int i71 = i69 & i70;
        int i72 = (~i71) & (i69 | i70);
        int i73 = ~((i71 & i72) | (i72 ^ i71));
        int i74 = ((~i70) & (-65)) | (i70 & 64);
        int i75 = (-65) & i70;
        int i76 = ~((i74 & i75) | (i74 ^ i75));
        int i77 = ((~i76) & i73) | ((~i73) & i76);
        int i78 = i73 & i76;
        int i79 = (((i78 & i77) | (i77 ^ i78)) * (-867)) + i68;
        int i80 = ~(i69 | (-65));
        int i81 = i69 & i14;
        int i82 = (~i81) & (i69 | i14);
        int i83 = ~((i81 & i82) | (i82 ^ i81));
        int i84 = (i80 & i83) | (i80 ^ i83);
        int i85 = ~(((-65) ^ i14) | ((-65) & i14));
        int i86 = ((~i85) & i84) | ((~i84) & i85);
        int i87 = i84 & i85;
        int i88 = -(-(((i87 & i86) | (i86 ^ i87)) * (-1734)));
        int i89 = ((~i88) & i79) | ((~i79) & i88);
        int i90 = (i88 & i79) << 1;
        int i91 = (i89 & i90) + (i90 | i89);
        int i92 = (i69 | i66) & i69;
        int i93 = (i92 & (-65)) | (i92 ^ (-65));
        int i94 = i93 & i70;
        int i95 = (i93 | i70) & (~i94);
        int i96 = ~((i95 & i94) | (i95 ^ i94));
        int i97 = i69 & 64;
        int i98 = (i69 | 64) & (~i97);
        int i99 = (i98 & i97) | (i98 ^ i97);
        int i100 = i99 & i14;
        int i101 = ~(((i99 | i14) & (~i100)) | i100);
        int i102 = ((~i101) & i96) | ((~i96) & i101);
        int i103 = i101 & i96;
        int i104 = (i103 & i102) | (i102 ^ i103);
        int i105 = (-65) ^ i66;
        int i106 = i66 & (-65);
        int i107 = (i106 & i105) | (i105 ^ i106);
        int i108 = (i107 & i14) | (i107 ^ i14);
        int i109 = ~i108;
        int i110 = (i108 | i109) & i109;
        int i111 = i104 ^ i110;
        int i112 = i110 & i104;
        int i113 = ((i112 & i111) | (i111 ^ i112)) * 867;
        int i114 = (i91 & i113) + (i113 | i91);
        int i115 = i64 & 65;
        int i116 = (i64 | 65) & (~i115);
        int i117 = 1;
        int i118 = -(-(i115 << 1));
        int i119 = (i116 ^ i118) + ((i116 & i118) << 1);
        f57619s0 = i119 % 128;
        int i120 = i119 % 2;
        long j10 = 0;
        while (true) {
            int i121 = iIntValue3 - i117;
            if (i121 < 0) {
                int i122 = f57620t0;
                int i123 = (i122 & 120) + (i122 | 120);
                int i124 = (i123 ^ (-1)) + (i123 << 1);
                f57619s0 = i124 % 128;
                int i125 = i124 % 2;
                jArr[i15] = jArr[i15] ^ j10;
                int i126 = i122 & 5;
                int i127 = (i122 ^ 5) | i126;
                int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                f57619s0 = i128 % 128;
                int i129 = i128 % 2;
                return;
            }
            int i130 = f57619s0;
            int i131 = ((i130 ^ 91) | (i130 & 91)) << i117;
            int i132 = -((i130 & (-92)) | ((~i130) & 91));
            int i133 = (i131 & i132) + (i131 | i132);
            f57620t0 = i133 % 128;
            int i134 = i133 % 2;
            int i135 = iIntValue2 & i121;
            long j11 = jArr2[(i135 - (~(-(-((iIntValue2 ^ i121) | i135))))) - 1];
            int i136 = i121 * (-381);
            int i137 = -(-(i14 * 192));
            int i138 = (i136 & i137) + (i136 | i137);
            int i139 = ~i121;
            int i140 = -(-(i139 * (-191)));
            int i141 = i138 ^ i140;
            int i142 = -(-((i138 & i140) << 1));
            int i143 = (i141 & i142) + (i141 | i142);
            int i144 = i14 & i70;
            int i145 = i144 | i144;
            int i146 = i14 & i14;
            int i147 = i145 ^ i146;
            int i148 = i145 & i146;
            long[] jArr3 = jArr2;
            int i149 = ~(i147 | i148);
            int i150 = iIntValue2;
            int i151 = ((~i149) & i121) | (i149 & i139);
            int i152 = i149 & i121;
            int i153 = ((i151 ^ i152) | (i152 & i151)) * Opcodes.ATHROW;
            int i154 = ((~i153) & i143) | ((~i143) & i153);
            int i155 = -(-((i153 & i143) << 1));
            int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
            int i157 = i139 ^ i14;
            int i158 = i139 & i14;
            int i159 = (i158 & i157) | (i157 ^ i158);
            int i160 = ~i159;
            int i161 = (i159 | i160) & i160;
            int i162 = i70 ^ i14;
            int i163 = ~((i162 & i144) | (i162 ^ i144));
            int i164 = -(-(((i161 & i163) | (i161 ^ i163)) * Opcodes.ATHROW));
            int i165 = i156 & i164;
            int i166 = (i165 - (~(-(-((i164 ^ i156) | i165))))) - 1;
            jArr[i166] = jArr[i166] ^ ((j11 >>> i60) | j10);
            j10 = j11 << i114;
            int i167 = (i130 ^ 70) + ((i130 & 70) << 1);
            int i168 = (i167 ^ (-1)) + (i167 << 1);
            f57620t0 = i168 % 128;
            int i169 = i168 % 2;
            iIntValue3 = i121;
            iIntValue2 = i150;
            jArr2 = jArr3;
            i117 = 1;
        }
    }

    public static /* synthetic */ void w(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        p1 p1Var2 = (p1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f57620t0;
        int i11 = i10 & 113;
        int i12 = (((~i11) & (i10 | 113)) - (~(i11 << 1))) - 1;
        f57619s0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = -(-(iIntValue * (-103)));
        int i15 = (((-6489) ^ i14) | ((-6489) & i14)) << 1;
        int i16 = -((i14 & 6488) | ((-6489) & (~i14)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = ~iIntValue;
        int i19 = (-64) ^ i18;
        int i20 = (-64) & i18;
        int i21 = (i19 & i20) | (i19 ^ i20);
        int i22 = ~i21;
        int i23 = -(-((((i21 | i22) & i22) | (~(i18 | iIntValue))) * 104));
        int i24 = i17 ^ i23;
        int i25 = (i17 & i23) << 1;
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        int i27 = ((~i18) & 63) | i20;
        int i28 = i18 & 63;
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i30 = -(-((~((i29 & iIntValue) | (i29 ^ iIntValue))) * (-104)));
        int i31 = i26 ^ i30;
        int i32 = ((i30 & i26) | i31) << 1;
        int i33 = -i31;
        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
        int i35 = ((iIntValue & 63) | (iIntValue ^ 63)) * 104;
        int i36 = ((i34 ^ i35) + ((i35 & i34) << 1)) >>> 6;
        int i37 = iIntValue2 >>> 6;
        int i38 = iIntValue2 & 63;
        if (i38 == 0) {
            int i39 = i10 & 31;
            int i40 = i39 + ((i10 ^ 31) | i39);
            f57619s0 = i40 % 128;
            if (i40 % 2 != 0) {
                i(i37, p1Var.f57621p0, 1, p1Var2.f57621p0, i36);
            } else {
                i(i37, p1Var.f57621p0, 0, p1Var2.f57621p0, i36);
            }
            int i41 = f57619s0 + 87;
            f57620t0 = i41 % 128;
            if (i41 % 2 == 0) {
                int i42 = 45 / 0;
                return;
            }
            return;
        }
        long jLongValue = ((Long) m(new Object[]{p1Var.f57621p0, Integer.valueOf(i37), p1Var2.f57621p0, 0, Integer.valueOf(i36), Integer.valueOf(i38)}, -537617247, 537617261, i37)).longValue();
        if (jLongValue != 0) {
            int i43 = f57620t0;
            int i44 = i43 + 103;
            f57619s0 = i44 % 128;
            int i45 = i44 % 2;
            long[] jArr = p1Var.f57621p0;
            int i46 = i36 & i37;
            int i47 = (~i46) & (i36 | i37);
            int i48 = i46 << 1;
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            jArr[i49] = jLongValue ^ jArr[i49];
            int i50 = ((i43 ^ 116) + ((i43 & 116) << 1)) - 1;
            f57619s0 = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = f57619s0;
        int i53 = (i52 | 37) << 1;
        int i54 = -(((~i52) & 37) | (i52 & (-38)));
        int i55 = (i53 & i54) + (i54 | i53);
        f57620t0 = i55 % 128;
        if (i55 % 2 == 0) {
            int i56 = 22 / 0;
        }
    }

    public static /* synthetic */ Boolean x(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int i10 = f57619s0 + 1;
        int i11 = i10 % 128;
        f57620t0 = i11;
        int i12 = i10 % 2;
        long[] jArr = p1Var.f57621p0;
        if (jArr.length > 0) {
            int i13 = i11 & 15;
            int i14 = (i11 ^ 15) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            f57619s0 = i15 % 128;
            int i16 = i15 % 2;
            if ((jArr[0] & 1) != 0) {
                int i17 = i11 + 23;
                int i18 = i17 % 128;
                f57619s0 = i18;
                int i19 = i17 % 2;
                int i20 = i18 ^ 99;
                int i21 = ((i18 & 99) | i20) << 1;
                int i22 = -i20;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                f57620t0 = i23 % 128;
                if (i23 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        int i24 = f57619s0 + 35;
        f57620t0 = i24 % 128;
        if (i24 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i25 = 94 / 0;
        return Boolean.FALSE;
    }

    public static void y(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12, int i13) {
        int i14 = f57619s0;
        int i15 = ((i14 ^ 33) - (~(-(-((i14 & 33) << 1))))) - 1;
        f57620t0 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = (i14 & 71) + (i14 | 71);
        f57620t0 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < i13) {
            int i20 = f57620t0;
            int i21 = ((i20 | 65) << 1) - (i20 ^ 65);
            f57619s0 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i19 * (-344);
            int i24 = -(-(i12 * (-344)));
            int i25 = ((~i24) & i23) | ((~i23) & i24);
            int i26 = (i23 & i24) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = ~i19;
            int i29 = (i28 | i19) & i28;
            int i30 = ~i12;
            int i31 = i29 & i30;
            int i32 = ~(((~i31) & (i29 | i30)) | i31);
            int i33 = i28 ^ i10;
            int i34 = i28 & i10;
            int i35 = ~((i33 & i34) | (i33 ^ i34));
            int i36 = -(~(((i32 & i35) | (i32 ^ i35)) * 345));
            int i37 = ((i27 & i36) + (i27 | i36)) - 1;
            int i38 = ~i10;
            int i39 = ~((i29 ^ i38) | (i29 & i38));
            int i40 = i30 & i19;
            int i41 = (~i40) & (i30 | i19);
            int i42 = (i41 ^ i40) | (i40 & i41);
            int i43 = ~i42;
            int i44 = (i42 | i43) & i43;
            int i45 = i39 & i44;
            int i46 = (((~i45) & (i39 | i44)) | i45) * 345;
            int i47 = i37 & i46;
            int i48 = -(-((i46 ^ i37) | i47));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            int i50 = (i29 ^ i30) | i31;
            int i51 = i50 & i10;
            int i52 = (i50 | i10) & (~i51);
            int i53 = -(~(-(-((~((i52 & i51) | (i52 ^ i51))) * 345))));
            int i54 = (((i49 | i53) << 1) - (i53 ^ i49)) - 1;
            int i55 = i19 * (-958);
            int i56 = -(~(-(-(i10 * (-958)))));
            int i57 = (((i55 | i56) << 1) - (i55 ^ i56)) - 1;
            int i58 = i38 & i38;
            int i59 = (~i58) & (i38 | i38);
            int i60 = ~((i58 & i59) | (i59 ^ i58));
            int i61 = i29 & i10;
            int i62 = ~(i61 | ((~i61) & (i29 | i10)));
            int i63 = ((~i62) & i60) | ((~i60) & i62);
            int i64 = i60 & i62;
            int i65 = (i64 & i63) | (i63 ^ i64);
            int i66 = i38 & i19;
            int i67 = (~i66) & (i38 | i19);
            int i68 = ~((i67 & i66) | (i67 ^ i66));
            int i69 = i65 ^ i68;
            int i70 = i65 & i68;
            int i71 = ((i70 & i69) | (i69 ^ i70)) * 959;
            int i72 = i57 & i71;
            int i73 = (i71 ^ i57) | i72;
            int i74 = (i72 & i73) + (i73 | i72);
            int i75 = i19 & i10;
            int i76 = (~i75) & (i19 | i10);
            int i77 = (~((i76 & i75) | (i76 ^ i75))) * (-959);
            int i78 = i74 & i77;
            int i79 = i74 | i77;
            int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
            int i81 = ~((i28 ^ i38) | (i28 & i38));
            int i82 = (i38 | i10) & i38;
            int i83 = i82 & i10;
            int i84 = (~i83) & (i82 | i10);
            int i85 = ~((i84 ^ i83) | (i84 & i83));
            int i86 = (i85 & i81) | (i81 ^ i85);
            int i87 = i66 | i34;
            int i88 = (i87 & i75) | (i87 ^ i75);
            int i89 = ~i88;
            int i90 = (i88 | i89) & i89;
            int i91 = ((i86 & i90) | (i86 ^ i90)) * 959;
            int i92 = i80 & i91;
            long j10 = jArr[(i92 - (~((i91 ^ i80) | i92))) - 1];
            int i93 = i19 * 51;
            int i94 = -(-(i11 * (-49)));
            int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
            int i96 = (i75 | (i19 ^ i10)) * (-50);
            int i97 = i95 & i96;
            int i98 = ((i96 | i95) & (~i97)) + (i97 << 1);
            int i99 = ~i11;
            int i100 = (i29 & i99) | (i29 ^ i99);
            int i101 = i100 ^ i10;
            int i102 = i100 & i10;
            int i103 = (i102 & i101) | (i101 ^ i102);
            int i104 = ~i103;
            int i105 = (i103 | i104) & i104;
            int i106 = i99 & i38;
            int i107 = (~i106) & (i99 | i38);
            int i108 = (i107 & i106) | (i107 ^ i106);
            int i109 = (i108 & i19) | (i108 ^ i19);
            int i110 = ~i109;
            int i111 = (i109 | i110) & i110;
            int i112 = i105 & i111;
            int i113 = (~i112) & (i105 | i111);
            int i114 = ((i113 & i112) | (i113 ^ i112)) * 50;
            int i115 = i98 & i114;
            int i116 = (i114 | i98) & (~i115);
            int i117 = -(-(i115 << 1));
            int i118 = (i116 ^ i117) + ((i116 & i117) << 1);
            int i119 = i99 ^ i38;
            int i120 = ~((i119 & i106) | (i119 ^ i106));
            int i121 = (i99 | i11) & i99;
            int i122 = i121 ^ i19;
            int i123 = i121 & i19;
            int i124 = ~((i123 & i122) | (i122 ^ i123));
            int i125 = (i120 & i124) | (i120 ^ i124);
            int i126 = (i82 & i28) | ((~i82) & i19);
            int i127 = i82 & i19;
            int i128 = ~((i126 & i127) | (i126 ^ i127));
            int i129 = i125 ^ i128;
            int i130 = i125 & i128;
            int i131 = -(-(((i130 & i129) | (i129 ^ i130)) * 50));
            int i132 = i118 & i131;
            int i133 = (i131 ^ i118) | i132;
            jArr3[i54] = jArr2[((i132 | i133) << 1) - (i133 ^ i132)] ^ j10;
            i19 = (-2) - ((i19 + 2) ^ (-1));
            int i134 = ((i20 | 31) << 1) - (i20 ^ 31);
            f57619s0 = i134 % 128;
            int i135 = i134 % 2;
        }
        int i136 = f57620t0;
        int i137 = i136 & 105;
        int i138 = -(-((i136 ^ 105) | i137));
        int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
        f57619s0 = i139 % 128;
        int i140 = i139 % 2;
    }

    public static /* synthetic */ Boolean z(Object[] objArr) {
        p1 p1Var = (p1) objArr[0];
        int i10 = f57620t0;
        int i11 = ((((i10 ^ 65) | (i10 & 65)) << 1) - (~(-((i10 & (-66)) | ((~i10) & 65))))) - 1;
        int i12 = i11 % 128;
        f57619s0 = i12;
        int i13 = i11 % 2;
        long[] jArr = p1Var.f57621p0;
        if (i13 == 0 ? jArr[0] != 1 : jArr[1] != 1) {
            int i14 = i12 & 91;
            int i15 = ((i12 ^ 91) | i14) << 1;
            int i16 = -((~i14) & (i12 | 91));
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            int i18 = i17 % 128;
            f57620t0 = i18;
            boolean z10 = i17 % 2 == 0;
            int i19 = (i18 & (-100)) | ((~i18) & 99);
            int i20 = -(-((i18 & 99) << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f57619s0 = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.valueOf(z10);
        }
        int i23 = i10 & 25;
        int i24 = (i10 ^ 25) | i23;
        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
        f57619s0 = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 1;
        while (i27 < jArr.length) {
            int i28 = f57619s0;
            int i29 = ~i28;
            int i30 = (((i28 & (-84)) | (i29 & 83)) - (~(-(-((i28 & 83) << 1))))) - 1;
            f57620t0 = i30 % 128;
            int i31 = i30 % 2;
            if (jArr[i27] != 0) {
                int i32 = ((i28 | 85) << 1) - (i28 ^ 85);
                f57620t0 = i32 % 128;
                int i33 = i32 % 2;
                int i34 = (i28 & (-52)) | (i29 & 51);
                int i35 = (i28 & 51) << 1;
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                f57620t0 = i36 % 128;
                if (i36 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            i27 = ((i27 & 2) + (i27 | 2)) - 1;
            int i37 = i28 & 13;
            int i38 = (i28 ^ 13) | i37;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f57620t0 = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = f57620t0;
        int i42 = (((i41 ^ 81) | (i41 & 81)) << 1) - (((~i41) & 81) | (i41 & (-82)));
        f57619s0 = i42 % 128;
        int i43 = i42 % 2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0347 A[PHI: r5
      0x0347: PHI (r5v23 int) = (r5v22 int), (r5v26 int) binds: [B:41:0x0345, B:38:0x032b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0351  */
    /* JADX WARN: Code duplicated, block: B:45:0x037d  */
    /* JADX WARN: Code duplicated, block: B:46:0x03ae A[PHI: r5
      0x03ae: PHI (r5v25 int) = (r5v22 int), (r5v26 int) binds: [B:41:0x0345, B:38:0x032b] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v83 long, still in use, count: 2, list:
          (r4v83 long) from 0x0203: PHI (r4 I:??) = (r4v79 long), (r4v83 long) binds: [B:27:0x01ea, B:24:0x01de] A[DONT_GENERATE, DONT_INLINE]
          (r4v83 long) from 0x01dc: CMP_L (r4v83 long), (0 long) A[WRAPPED] (LINE:477)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final com.mypinpad.tsdk.isolation.p1 C(com.mypinpad.tsdk.isolation.p1 r29) {
        /*
            Method dump skipped, instruction units count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.p1.C(com.mypinpad.tsdk.i.p1):com.mypinpad.tsdk.i.p1");
    }

    public final Object clone() {
        return m(new Object[]{this}, -272341761, 272341791, System.identityHashCode(this));
    }

    public final boolean equals(Object obj) {
        return ((Boolean) m(new Object[]{this, obj}, 1941980192, -1941980191, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) m(new Object[]{this}, 1214859400, -1214859367, System.identityHashCode(this))).intValue();
    }

    public final boolean n() {
        int i10 = f57619s0;
        int i11 = i10 & 71;
        int i12 = (~i11) & (i10 | 71);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f57620t0 = i14 % 128;
        int i15 = i14 % 2;
        long[] jArr = this.f57621p0;
        int i16 = (i10 | 77) << 1;
        int i17 = -(i10 ^ 77);
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f57620t0 = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (i20 < jArr.length) {
            int i21 = f57619s0;
            int i22 = i21 + 3;
            int i23 = i22 % 128;
            f57620t0 = i23;
            int i24 = i22 % 2;
            if (jArr[i20] != 0) {
                int i25 = i23 & 31;
                int i26 = (i25 - (~((i23 ^ 31) | i25))) - 1;
                f57619s0 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i23 ^ 31;
                int i29 = ((i23 & 31) | i28) << 1;
                int i30 = -i28;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f57619s0 = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 2 / 0;
                }
                return false;
            }
            int i33 = i20 & 1;
            i20 = ((i20 | 1) & (~i33)) + (i33 << 1);
            int i34 = i21 & 25;
            int i35 = (i34 - (~(-(-((i21 ^ 25) | i34))))) - 1;
            f57620t0 = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f57620t0;
        int i38 = i37 & 71;
        int i39 = (i37 | 71) & (~i38);
        int i40 = -(-(i38 << 1));
        int i41 = (i39 & i40) + (i39 | i40);
        f57619s0 = i41 % 128;
        if (i41 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        return (String) m(new Object[]{this}, -1123519665, 1123519684, System.identityHashCode(this));
    }

    public p1(long[] jArr) {
        this.f57621p0 = jArr;
    }

    public p1(int i10) {
        this.f57621p0 = new long[i10];
    }
}
