package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53758b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f53757a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53759c = 35 % 128;

    static {
        int i10 = 35 % 2;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53759c + 119;
        f53758b = i10 % 128;
        if (i10 % 2 == 0) {
            long[] jArr3 = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, -1337952354, 1337952361, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 559598899, -559598884, (int) System.currentTimeMillis());
        } else {
            long[] jArr4 = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr4}, -1337952354, 1337952361, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr4, jArr2}, 559598899, -559598884, (int) System.currentTimeMillis());
            int i11 = 34 / 0;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53758b;
        int i11 = (i10 & 45) + (i10 | 45);
        f53759c = i11 % 128;
        if (i11 % 2 == 0) {
            long[] jArr4 = new long[29];
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, -1795825797, 1795825799, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, 597833983, -597833983, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = new long[8];
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr5}, -1795825797, 1795825799, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr5, jArr3}, 597833983, -597833983, (int) System.currentTimeMillis());
        }
        int i12 = f53758b;
        int i13 = i12 & 41;
        int i14 = (((i12 | 41) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
        f53759c = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 34 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01be, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[]{r1}, 1694485490, -1694485484, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[]{r1}, 1694485490, -1694485484, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        r5 = (long[]) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[0], -1915146282, 1915146293, (int) java.lang.System.currentTimeMillis());
        r6 = (long[]) com.mypinpad.tsdk.isolation.auv.setDividerPadding(new java.lang.Object[0], -1915146282, 1915146293, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r1, r5}, -934364245, 934364256, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r5, 1, r6}, -236981925, 236981941, 1);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r6, 1, r6}, -236981925, 236981941, 1);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r5, 3, r6}, -236981925, 236981941, 3);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r6, 3, r6}, -236981925, 236981941, 3);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r5, 9, r6}, -236981925, 236981941, 9);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r6, 9, r6}, -236981925, 236981941, 9);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r5, 27, r6}, -236981925, 236981941, 27);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r6, 27, r6}, -236981925, 236981941, 27);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r5}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        setOnFocusChangeListener(new java.lang.Object[]{r5, 81, r6}, -236981925, 236981941, 81);
        setOnFocusChangeListener(new java.lang.Object[]{r5, r6, r15}, 208519125, -208519117, (int) java.lang.System.currentTimeMillis());
        r15 = com.mypinpad.tsdk.isolation.asl.f53758b;
        r0 = r15 & 65;
        r15 = r15 | 65;
        r1 = ((r0 | r15) << 1) - (r15 ^ r0);
        com.mypinpad.tsdk.isolation.asl.f53759c = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c(java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asl.c(java.lang.Object[]):void");
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i10 = f53759c;
        int i11 = ~i10;
        int i12 = ((i10 & (-22)) | (i11 & 21)) + ((i10 & 21) << 1);
        f53758b = i12 % 128;
        int i13 = i12 % 2;
        jArr[1] = jLongValue2;
        long j10 = jLongValue2 << 1;
        jArr[2] = j10;
        long j11 = j10 ^ jLongValue2;
        jArr[3] = j11;
        long j12 = jLongValue2 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ jLongValue2;
        long j13 = j11 << 1;
        jArr[6] = j13;
        jArr[7] = jLongValue2 ^ j13;
        long j14 = jArr[((int) jLongValue) & 3];
        int i14 = (((i11 & 33) | (i10 & (-34))) - (~(-(-((i10 & 33) << 1))))) - 1;
        f53758b = i14 % 128;
        int i15 = i14 % 2;
        long j15 = 0;
        int i16 = 47;
        long j16 = j14;
        do {
            int i17 = (int) (jLongValue >>> i16);
            long j17 = (jArr[i17 & 7] ^ (jArr[(i17 >>> 3) & 7] << 3)) ^ (jArr[(i17 >>> 6) & 7] << 6);
            j16 ^= j17 << i16;
            j15 ^= j17 >>> (-i16);
            i16 -= 9;
        } while (i16 > 0);
        int i18 = f53759c;
        int i19 = (-2) - (((i18 ^ 106) + ((i18 & 106) << 1)) ^ (-1));
        f53758b = i19 % 128;
        int i20 = i19 % 2;
        jArr2[iIntValue] = j16 & 36028797018963967L;
        int i21 = iIntValue * (-864);
        int i22 = 866 & i21;
        int i23 = (i21 ^ 866) | i22;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        int i25 = ~iIntValue;
        int i26 = (i25 | iIntValue) & i25;
        int i27 = ~i25;
        int i28 = i25 & 1;
        int i29 = ((-2) & i27) | i28;
        int i30 = (-2) & i25;
        int i31 = (i29 & i30) | (i29 ^ i30);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = ((~i33) & i26) | ((~i26) & i33);
        int i35 = i33 & i26;
        int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * (-865)));
        int i37 = i24 ^ i36;
        int i38 = ((((i24 & i36) | i37) << 1) - (~(-i37))) - 1;
        int i39 = (iIntValue ^ 1) | (iIntValue & 1);
        int i40 = ~i39;
        int i41 = ((i39 | i40) & i40) * 865;
        int i42 = ((i38 ^ i41) | (i38 & i41)) << 1;
        int i43 = -(((~i38) & i41) | ((~i41) & i38));
        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
        int i45 = i26 & i25;
        int i46 = ~(((i25 | i26) & (~i45)) | i45);
        int i47 = i30 | (i27 & 1);
        int i48 = ~((i47 & i28) | (i47 ^ i28));
        int i49 = ((i46 & i48) | (i46 ^ i48)) * 865;
        int i50 = i44 & i49;
        jArr2[((i49 | i44) & (~i50)) + (i50 << 1)] = (j15 << 9) ^ (j16 >>> 55);
        int i51 = i18 & 105;
        int i52 = (i18 | 105) & (~i51);
        int i53 = i51 << 1;
        int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
        f53758b = i54 % 128;
        if (i54 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53759c;
        int i11 = (i10 ^ 97) + ((i10 & 97) << 1);
        f53758b = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr3 = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, -1337952354, 1337952361, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr2}, 597833983, -597833983, (int) System.currentTimeMillis());
            int i12 = 73 / 0;
        } else {
            long[] jArr4 = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr4}, -1337952354, 1337952361, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr4, jArr2}, 597833983, -597833983, (int) System.currentTimeMillis());
        }
        int i13 = f53758b;
        int i14 = i13 & 63;
        int i15 = (i13 ^ 63) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f53759c = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 27 / 0;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53758b;
        int i11 = ((i10 ^ 88) + ((i10 & 88) << 1)) - 1;
        f53759c = i11 % 128;
        int i12 = i11 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        int i13 = ~((int) System.currentTimeMillis());
        int i14 = (-839065669) ^ i13;
        int i15 = (-839065669) & i13;
        int i16 = (-1460107960) - (~(-(-(((i15 & i14) | (i14 ^ i15)) * 184))));
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        int i18 = (974338405 & i13) | ((~i13) & (-974338406));
        int i19 = i13 & (-974338406);
        int i20 = ~((i19 & i18) | (i18 ^ i19));
        int i21 = ((~i20) & (-2147172326)) | (2147172325 & i20);
        int i22 = i20 & (-2147172326);
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = (i17 - (~(((i23 & 135272737) | (i23 ^ 135272737)) * 184))) - 1;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i25 = ~iCurrentTimeMillis;
        int i26 = 2147342333 & i25;
        int i27 = ~((iCurrentTimeMillis & (-2147342334)) | i26 | (2147342333 & iCurrentTimeMillis));
        int i28 = 1526567801 ^ i25;
        int i29 = 1526567801 & i25;
        int i30 = (i29 & i28) | (i28 ^ i29);
        int i31 = i30 & (-1868842734);
        int i32 = (i30 | (-1868842734)) & (~i31);
        int i33 = ~((i32 & i31) | (i32 ^ i31));
        int i34 = i27 & i33;
        int i35 = (i27 | i33) & (~i34);
        int i36 = ((i35 & i34) | (i35 ^ i34)) * 920;
        int i37 = (-2058941608) ^ i36;
        int i38 = ((i36 & (-2058941608)) | i37) << 1;
        int i39 = -i37;
        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
        int i41 = ~((1868842733 & i25) | (1868842733 ^ i25));
        int i42 = ((~i41) & (-2147342334)) | (i41 & 2147342333);
        int i43 = (-2147342334) & i41;
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * 920));
        int i45 = i40 & i44;
        int i46 = i45 + ((i44 ^ i40) | i45);
        int i47 = 2147342333 ^ i25;
        int i48 = ~((i47 & i26) | (i47 ^ i26));
        int i49 = (-278499601) ^ iCurrentTimeMillis;
        int i50 = (-278499601) & iCurrentTimeMillis;
        int i51 = ~((i50 & i49) | (i49 ^ i50));
        int i52 = i48 & i51;
        int i53 = ((i48 | i51) & (~i52)) | i52;
        int i54 = (i25 & (-620774533)) | (620774532 & iCurrentTimeMillis);
        int i55 = iCurrentTimeMillis & (-620774533);
        int i56 = ~((i55 & i54) | (i54 ^ i55));
        int i57 = ((~i56) & i53) | ((~i53) & i56);
        int i58 = i56 & i53;
        if (i24 <= (i46 - (~(-(-(((i58 & i57) | (i57 ^ i58)) * 920))))) - 1) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53759c;
        int i11 = (i10 | 21) << 1;
        int i12 = -(i10 ^ 21);
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53758b = i14;
        int i15 = i13 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = j13 ^ ((((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)) ^ (j15 >>> 28));
        long j17 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)) ^ (j14 >>> 28));
        long j18 = j10 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36));
        long j19 = (j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36))) ^ ((j16 >>> 28) ^ (((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)));
        long j20 = j17 >>> 35;
        jArr2[0] = (((j18 ^ j20) ^ (j20 << 3)) ^ (j20 << 6)) ^ (j20 << 7);
        jArr2[1] = j19;
        jArr2[2] = 34359738367L & j17;
        int i16 = ((i14 | 45) << 1) - (i14 ^ 45);
        f53759c = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static void getNavBarTitleString(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1819763196, 1819763213, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53758b;
        int i11 = i10 & 5;
        int i12 = i11 + ((i10 ^ 5) | i11);
        f53759c = i12 % 128;
        int i13 = i12 % 2;
        long[] jArr4 = new long[8];
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, -1795825797, 1795825799, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, jArr3}, 559598899, -559598884, (int) System.currentTimeMillis());
        int i14 = f53759c;
        int i15 = ((i14 & 2) + (i14 | 2)) - 1;
        f53758b = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 12 / 0;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53759c;
        int i11 = ((i10 | 71) << 1) - (i10 ^ 71);
        int i12 = i11 % 128;
        f53758b = i12;
        int i13 = i11 % 2;
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        int i14 = ((i12 | 47) << 1) - (i12 ^ 47);
        f53759c = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 80 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1010553498, -1010553495, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -484206552, 484206556, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        long[] jArr;
        int i13 = ~i10;
        int i14 = (i13 * (-333)) + (i11 * 334) + (i10 * (-665));
        int i15 = ~i12;
        int i16 = 1337952361;
        switch ((((~(i13 | i12)) | (~(i11 | i15))) * 333) + (((~(i13 | i15)) | (~(i11 | i12))) * 333) + i14) {
            case 1:
                long[] jArr2 = (long[]) objArr[0];
                long[] jArr3 = (long[]) objArr[1];
                long[] jArr4 = (long[]) objArr[2];
                int i17 = f53759c;
                int i18 = (i17 | 105) << 1;
                int i19 = -(((~i17) & 105) | (i17 & (-106)));
                int i20 = (i18 & i19) + (i19 | i18);
                f53758b = i20 % 128;
                if (i20 % 2 == 0) {
                    jArr4[0] = jArr2[0] ^ jArr3[0];
                    jArr4[1] = jArr2[1] ^ jArr3[1];
                    jArr4[2] = jArr3[2] ^ jArr2[2];
                    return null;
                }
                long j10 = jArr2[1];
                jArr4[0] = j10 - jArr3[0];
                jArr4[1] = j10 & jArr3[0];
                jArr4[5] = jArr3[4] | jArr2[2];
                return null;
            case 2:
                long[] jArr5 = (long[]) objArr[0];
                long[] jArr6 = (long[]) objArr[1];
                long[] jArr7 = (long[]) objArr[2];
                int i21 = f53759c;
                int i22 = ((i21 ^ 78) + ((i21 & 78) << 1)) - 1;
                f53758b = i22 % 128;
                int i23 = i22 % 2;
                long j11 = jArr5[0];
                long j12 = jArr5[1];
                long j13 = (j12 >>> 46) ^ (jArr5[2] << 18);
                long j14 = ((j11 >>> 55) ^ (j12 << 9)) & 36028797018963967L;
                long j15 = j11 & 36028797018963967L;
                long j16 = jArr6[0];
                long j17 = jArr6[1];
                long j18 = (j17 >>> 46) ^ (jArr6[2] << 18);
                long j19 = ((j16 >>> 55) ^ (j17 << 9)) & 36028797018963967L;
                long j20 = j16 & 36028797018963967L;
                long[] jArr8 = new long[10];
                setOnFocusChangeListener(new Object[]{jArr7, Long.valueOf(j15), Long.valueOf(j20), jArr8, 0}, 763404836, -763404823, 0);
                setOnFocusChangeListener(new Object[]{jArr7, Long.valueOf(j13), Long.valueOf(j18), jArr8, 2}, 763404836, -763404823, 2);
                long j21 = (j15 ^ j14) ^ j13;
                long j22 = (j20 ^ j19) ^ j18;
                setOnFocusChangeListener(new Object[]{jArr7, Long.valueOf(j21), Long.valueOf(j22), jArr8, 4}, 763404836, -763404823, 4);
                long j23 = (j14 << 1) ^ (j13 << 2);
                long j24 = (j19 << 1) ^ (j18 << 2);
                setOnFocusChangeListener(new Object[]{jArr7, Long.valueOf(j15 ^ j23), Long.valueOf(j20 ^ j24), jArr8, 6}, 763404836, -763404823, 6);
                setOnFocusChangeListener(new Object[]{jArr7, Long.valueOf(j21 ^ j23), Long.valueOf(j22 ^ j24), jArr8, 8}, 763404836, -763404823, 8);
                long j25 = jArr8[6];
                long j26 = jArr8[8] ^ j25;
                long j27 = jArr8[7];
                long j28 = jArr8[9] ^ j27;
                long j29 = (j26 << 1) ^ j25;
                long j30 = (j26 ^ (j28 << 1)) ^ j27;
                long j31 = jArr8[0];
                long j32 = jArr8[1];
                long j33 = (j32 ^ j31) ^ jArr8[4];
                long j34 = j32 ^ jArr8[5];
                long j35 = jArr8[2];
                long j36 = ((j29 ^ j31) ^ (j35 << 4)) ^ (j35 << 1);
                long j37 = jArr8[3];
                long j38 = (((j33 ^ j30) ^ (j37 << 4)) ^ (j37 << 1)) ^ (j36 >>> 55);
                long j39 = (j34 ^ j28) ^ (j38 >>> 55);
                long j40 = ((j36 & 36028797018963967L) >>> 1) ^ ((j38 & 1) << 54);
                long j41 = j40 ^ (j40 << 1);
                long j42 = j41 ^ (j41 << 2);
                long j43 = j42 ^ (j42 << 4);
                long j44 = j43 ^ (j43 << 8);
                long j45 = j44 ^ (j44 << 16);
                long j46 = (j45 ^ (j45 << 32)) & 36028797018963967L;
                long j47 = (((j38 & 36028797018963967L) >>> 1) ^ ((j39 & 1) << 54)) ^ (j46 >>> 54);
                long j48 = j47 ^ (j47 << 1);
                long j49 = j48 ^ (j48 << 2);
                long j50 = j49 ^ (j49 << 4);
                long j51 = j50 ^ (j50 << 8);
                long j52 = j51 ^ (j51 << 16);
                long j53 = (j52 ^ (j52 << 32)) & 36028797018963967L;
                long j54 = (j39 >>> 1) ^ (j53 >>> 54);
                long j55 = j54 ^ (j54 << 1);
                long j56 = j55 ^ (j55 << 2);
                long j57 = j56 ^ (j56 << 4);
                long j58 = j57 ^ (j57 << 8);
                long j59 = j58 ^ (j58 << 16);
                long j60 = j59 ^ (j59 << 32);
                jArr7[0] = j31;
                jArr7[1] = (j33 ^ j46) ^ j35;
                jArr7[2] = (j46 ^ (j34 ^ j53)) ^ j37;
                jArr7[3] = j60 ^ j53;
                jArr7[4] = jArr8[2] ^ j60;
                jArr7[5] = jArr8[3];
                setOnFocusChangeListener(new Object[]{jArr7}, -1657322740, 1657322750, (int) System.currentTimeMillis());
                int i24 = f53758b;
                int i25 = i24 ^ 37;
                int i26 = -(-((i24 & 37) << 1));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f53759c = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 3:
                i(objArr);
                return null;
            case 4:
                long[] jArr9 = (long[]) objArr[0];
                long[] jArr10 = (long[]) objArr[1];
                int i29 = f53759c;
                int i30 = i29 ^ 17;
                int i31 = ((i29 & 17) | i30) << 1;
                int i32 = -i30;
                int i33 = (i31 & i32) + (i31 | i32);
                f53758b = i33 % 128;
                int i34 = i33 % 2;
                long[] jArr11 = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr9[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr9[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                jArr11[0] = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr9[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                jArr11[1] = jLongValue3 >>> 32;
                setOnFocusChangeListener(new Object[]{jArr11, f53757a, jArr10}, 208519125, -208519117, (int) System.currentTimeMillis());
                jArr10[0] = jArr10[0] ^ ((4294967295L & jLongValue) | (jLongValue2 << 32));
                jArr10[1] = jArr10[1] ^ (4294967295L & jLongValue3);
                int i35 = f53759c;
                int i36 = i35 ^ 73;
                int i37 = (i35 & 73) << 1;
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f53758b = i38 % 128;
                int i39 = i38 % 2;
                return null;
            case 5:
                c(objArr);
                return null;
            case 6:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i40 = f53759c;
                int i41 = i40 & 117;
                int i42 = ((i40 | 117) & (~i41)) + (i41 << 1);
                f53758b = i42 % 128;
                return (long[]) (i42 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{8742, bigInteger}, 1678029135, -1678029124, 8742) : auy.setOnFocusChangeListener(new Object[]{163, bigInteger}, 1678029135, -1678029124, 163));
            case 7:
                long[] jArr12 = (long[]) objArr[0];
                long[] jArr13 = (long[]) objArr[1];
                int i43 = f53758b;
                int i44 = ((i43 & 5) - (~(-(-(i43 | 5))))) - 1;
                f53759c = i44 % 128;
                if (i44 % 2 == 0) {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr12, 4, jArr13, 0}, 1056168849, -1056168849, 4);
                    return null;
                }
                auu.setCompoundDrawableTintBlendMode(new Object[]{jArr12, 3, jArr13, 0}, 1056168849, -1056168849, 3);
                return null;
            case 8:
                h(objArr);
                return null;
            case 9:
                b(objArr);
                return null;
            case 10:
                long[] jArr14 = (long[]) objArr[0];
                int i45 = f53758b;
                int i46 = i45 & 67;
                int i47 = i46 + ((i45 ^ 67) | i46);
                int i48 = i47 % 128;
                f53759c = i48;
                int i49 = i47 % 2;
                long j61 = jArr14[0];
                long j62 = jArr14[1];
                long j63 = jArr14[2];
                long j64 = jArr14[3];
                long j65 = jArr14[4];
                long j66 = jArr14[5];
                jArr14[0] = j61 ^ (j62 << 55);
                jArr14[1] = (j62 >>> 9) ^ (j63 << 46);
                jArr14[2] = (j63 >>> 18) ^ (j64 << 37);
                jArr14[3] = (j64 >>> 27) ^ (j65 << 28);
                jArr14[4] = (j65 >>> 36) ^ (j66 << 19);
                jArr14[5] = j66 >>> 45;
                int i50 = (i48 & (-108)) | ((~i48) & 107);
                int i51 = (i48 & 107) << 1;
                int i52 = (i50 & i51) + (i50 | i51);
                f53758b = i52 % 128;
                int i53 = i52 % 2;
                return null;
            case 11:
                a(objArr);
                return null;
            case 12:
                long[] jArr15 = (long[]) objArr[0];
                long[] jArr16 = (long[]) objArr[1];
                int i54 = f53758b;
                int i55 = ((((i54 ^ 39) | (i54 & 39)) << 1) - (~(-(((~i54) & 39) | (i54 & (-40)))))) - 1;
                int i56 = i55 % 128;
                f53759c = i56;
                int i57 = i55 % 2;
                jArr16[0] = jArr16[0] ^ jArr15[0];
                jArr16[1] = jArr16[1] ^ jArr15[1];
                jArr16[2] = jArr16[2] ^ jArr15[2];
                int i58 = i56 & 39;
                int i59 = ((~i58) & (i56 | 39)) + (i58 << 1);
                f53758b = i59 % 128;
                int i60 = i59 % 2;
                return null;
            case 13:
                d(objArr);
                return null;
            case 14:
                long[] jArr17 = (long[]) objArr[0];
                long[] jArr18 = (long[]) objArr[1];
                int i61 = f53759c;
                int i62 = (i61 & (-30)) | ((~i61) & 29);
                int i63 = -(-((i61 & 29) << 1));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                f53758b = i64 % 128;
                if (i64 % 2 != 0) {
                    jArr = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
                    auv.setDividerPadding(new Object[]{jArr17, jArr18}, -644509532, 644509562, (int) System.currentTimeMillis());
                } else {
                    jArr = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
                    auv.setDividerPadding(new Object[]{jArr17, jArr18}, -644509532, 644509562, (int) System.currentTimeMillis());
                }
                int i65 = 1;
                while (i65 < 163) {
                    int i66 = f53759c;
                    int i67 = ((i66 ^ 89) | (i66 & 89)) << 1;
                    int i68 = -(((~i66) & 89) | (i66 & (-90)));
                    int i69 = (i67 & i68) + (i68 | i67);
                    f53758b = i69 % 128;
                    if (i69 % 2 != 0) {
                        setOnFocusChangeListener(new Object[]{jArr18, jArr}, -1337952354, i16, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr, jArr18}, 559598899, -559598884, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr18, jArr}, -1337952354, i16, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr, jArr18}, 559598899, -559598884, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr17, jArr18}, 903825391, -903825379, (int) System.currentTimeMillis());
                        int i70 = i65 & 60;
                        int i71 = i65 | 60;
                        i65 = (i70 ^ i71) + ((i71 & i70) << 1);
                    } else {
                        setOnFocusChangeListener(new Object[]{jArr18, jArr}, -1337952354, i16, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr, jArr18}, 559598899, -559598884, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr18, jArr}, -1337952354, i16, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr, jArr18}, 559598899, -559598884, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{jArr17, jArr18}, 903825391, -903825379, (int) System.currentTimeMillis());
                        int i72 = i65 ^ 54;
                        int i73 = (i65 & 54) << 1;
                        int i74 = (i72 & i73) + (i73 | i72);
                        int i75 = i74 & (-52);
                        int i76 = (i74 ^ (-52)) | i75;
                        i65 = (i75 & i76) + (i75 | i76);
                    }
                    i16 = 1337952361;
                }
                int i77 = f53758b + 61;
                f53759c = i77 % 128;
                int i78 = i77 % 2;
                return null;
            case 15:
                g(objArr);
                return null;
            case 16:
                long[] jArr19 = (long[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                long[] jArr20 = (long[]) objArr[2];
                int i79 = f53758b;
                int i80 = i79 & 7;
                int i81 = -(-((i79 ^ 7) | i80));
                int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                f53759c = i82 % 128;
                int i83 = i82 % 2;
                long[] jArr21 = (long[]) auv.setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr19, jArr21}, -1337952354, 1337952361, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr21, jArr20}, 559598899, -559598884, (int) System.currentTimeMillis());
                int i84 = f53759c;
                int i85 = i84 & 75;
                int i86 = (i84 ^ 75) | i85;
                int i87 = (i85 & i86) + (i86 | i85);
                f53758b = i87 % 128;
                int i88 = i87 % 2;
                while (true) {
                    iIntValue = (iIntValue << 1) + (iIntValue ^ (-1));
                    if (iIntValue <= 0) {
                        int i89 = f53758b;
                        int i90 = ((i89 & (-58)) | ((~i89) & 57)) + ((i89 & 57) << 1);
                        f53759c = i90 % 128;
                        int i91 = i90 % 2;
                        return null;
                    }
                    int i92 = f53759c;
                    int i93 = (i92 & (-48)) | ((~i92) & 47);
                    int i94 = (i92 & 47) << 1;
                    int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                    f53758b = i95 % 128;
                    int i96 = i95 % 2;
                    setOnFocusChangeListener(new Object[]{jArr20, jArr21}, -1337952354, 1337952361, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{jArr21, jArr20}, 559598899, -559598884, (int) System.currentTimeMillis());
                    int i97 = f53759c;
                    int i98 = i97 & 11;
                    int i99 = (((i97 | 11) & (~i98)) - (~(i98 << 1))) - 1;
                    f53758b = i99 % 128;
                    int i100 = i99 % 2;
                }
                break;
            case 17:
                e(objArr);
                return null;
            case 18:
                long[] jArr22 = (long[]) objArr[0];
                int i101 = f53758b;
                int i102 = (-2) - (((i101 ^ 64) + ((i101 & 64) << 1)) ^ (-1));
                int i103 = i102 % 128;
                f53759c = i103;
                int i104 = i102 % 2;
                int i105 = ((int) (jArr22[0] ^ (jArr22[2] >>> 29))) & 1;
                int i106 = (i103 & (-14)) | ((~i103) & 13);
                int i107 = (i103 & 13) << 1;
                int i108 = (i106 & i107) + (i107 | i106);
                f53758b = i108 % 128;
                int i109 = i108 % 2;
                return Integer.valueOf(i105);
            default:
                f(objArr);
                return null;
        }
    }

    public static void setOnLongClickListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -934364245, 934364256, (int) System.currentTimeMillis());
    }

    public static int setX(long[] jArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{jArr}, -2039892055, 2039892073, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 559598899, -559598884, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -1312887919, 1312887920, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, int i10, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i10), jArr2}, -236981925, 236981941, i10);
    }

    public static void setY(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, 208519125, -208519117, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, 1954384641, -1954384632, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -541612768, 541612773, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -730983218, 730983232, (int) System.currentTimeMillis());
    }

    public static long[] setOnFocusChangeListener(BigInteger bigInteger) {
        return (long[]) setOnFocusChangeListener(new Object[]{bigInteger}, 1976744658, -1976744652, (int) System.currentTimeMillis());
    }
}
