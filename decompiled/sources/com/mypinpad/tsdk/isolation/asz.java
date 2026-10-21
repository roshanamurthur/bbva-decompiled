package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asz extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53793f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53794g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53795e;

    public asz(long[] jArr) {
        this.f53795e = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r6 instanceof com.mypinpad.tsdk.isolation.asz) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r6 = r4 + 64;
        r1 = (r6 ^ (-1)) + (r6 << 1);
        com.mypinpad.tsdk.isolation.asz.f53793f = r1 % 128;
        r1 = r1 % 2;
        r4 = r4 + 13;
        com.mypinpad.tsdk.isolation.asz.f53793f = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r6 = 20 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r6 = ((java.lang.Boolean) com.mypinpad.tsdk.isolation.avf.setX(new java.lang.Object[]{r1.f53795e, ((com.mypinpad.tsdk.isolation.asz) r6).f53795e}, 479700147, -479700143, (int) java.lang.System.currentTimeMillis())).booleanValue();
        r0 = com.mypinpad.tsdk.isolation.asz.f53794g;
        r1 = r0 & 105;
        r1 = r1 + ((r0 ^ 105) | r1);
        com.mypinpad.tsdk.isolation.asz.f53793f = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r6 == r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r6 == r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r6 = (((r4 | 107) << 1) - (~(-(r4 ^ 107)))) - 1;
        com.mypinpad.tsdk.isolation.asz.f53793f = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.mypinpad.tsdk.i.asz r1 = (com.mypinpad.tsdk.isolation.asz) r1
            r2 = 1
            r6 = r6[r2]
            int r3 = com.mypinpad.tsdk.isolation.asz.f53793f
            int r3 = r3 + 19
            int r4 = r3 % 128
            com.mypinpad.tsdk.isolation.asz.f53794g = r4
            r5 = 2
            int r3 = r3 % r5
            if (r3 != 0) goto L1a
            r3 = 75
            int r3 = r3 / r0
            if (r6 != r1) goto L2d
            goto L1c
        L1a:
            if (r6 != r1) goto L2d
        L1c:
            r6 = r4 | 107(0x6b, float:1.5E-43)
            int r6 = r6 << r2
            r0 = r4 ^ 107(0x6b, float:1.5E-43)
            int r0 = -r0
            int r0 = ~r0
            int r6 = r6 - r0
            int r6 = r6 - r2
            int r0 = r6 % 128
            com.mypinpad.tsdk.isolation.asz.f53793f = r0
            int r6 = r6 % r5
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L2d:
            boolean r3 = r6 instanceof com.mypinpad.tsdk.isolation.asz
            if (r3 != 0) goto L4e
            int r6 = r4 + 64
            r1 = r6 ^ (-1)
            int r6 = r6 << r2
            int r1 = r1 + r6
            int r6 = r1 % 128
            com.mypinpad.tsdk.isolation.asz.f53793f = r6
            int r1 = r1 % r5
            int r4 = r4 + 13
            int r6 = r4 % 128
            com.mypinpad.tsdk.isolation.asz.f53793f = r6
            int r4 = r4 % r5
            if (r4 == 0) goto L4b
            r6 = 20
            int r6 = r6 / r0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L4e:
            com.mypinpad.tsdk.i.asz r6 = (com.mypinpad.tsdk.isolation.asz) r6
            long[] r1 = r1.f53795e
            long[] r6 = r6.f53795e
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r0] = r1
            r3[r2] = r6
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (int) r0
            r0 = 479700147(0x1c97a4b3, float:1.0034916E-21)
            r1 = -479700143(0xffffffffe3685b51, float:-4.2862247E21)
            java.lang.Object r6 = com.mypinpad.tsdk.isolation.avf.setX(r3, r0, r1, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            int r0 = com.mypinpad.tsdk.isolation.asz.f53794g
            r1 = r0 & 105(0x69, float:1.47E-43)
            r0 = r0 ^ 105(0x69, float:1.47E-43)
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.asz.f53793f = r0
            int r1 = r1 % r5
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.asz.a(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        int i10 = f53793f;
        int i11 = i10 & 1;
        int i12 = -(-((i10 ^ 1) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53794g = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr = aszVar.f53795e;
        if (i14 == 0) {
            ((Integer) asy.setY(new Object[]{jArr}, 194119420, -194119415, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        int iIntValue = ((Integer) asy.setY(new Object[]{jArr}, 194119420, -194119415, (int) System.currentTimeMillis())).intValue();
        int i15 = f53794g;
        int i16 = i15 & 81;
        int i17 = (i15 | 81) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f53793f = i19 % 128;
        int i20 = i19 % 2;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ asz c(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        long[] jArr = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        asy.setY(new Object[]{aszVar.f53795e, jArr}, -488663456, 488663460, (int) System.currentTimeMillis());
        asz aszVar2 = new asz(jArr);
        int i10 = f53793f;
        int i11 = i10 & 27;
        int i12 = (((i10 | 27) & (~i11)) - (~(i11 << 1))) - 1;
        f53794g = i12 % 128;
        if (i12 % 2 != 0) {
            return aszVar2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        int i10 = f53793f;
        int i11 = i10 & 47;
        int i12 = (((i10 | 47) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f53794g = i12 % 128;
        int i13 = i12 % 2;
        boolean zBooleanValue = ((Boolean) avf.setX(new Object[]{aszVar.f53795e}, 572389043, -572389036, (int) System.currentTimeMillis())).booleanValue();
        int i14 = f53794g + 125;
        f53793f = i14 % 128;
        if (i14 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i15 = 94 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ asz e(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53794g;
        int i11 = (i10 & 1) + (i10 | 1);
        int i12 = i11 % 128;
        f53793f = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (iIntValue <= 0) {
            int i13 = (-2) - ((i12 + 114) ^ (-1));
            f53794g = i13 % 128;
            if (i13 % 2 != 0) {
                return aszVar;
            }
            throw null;
        }
        long[] jArr = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        asy.setY(new Object[]{aszVar.f53795e, Integer.valueOf(iIntValue), jArr}, 886665907, -886665892, iIntValue);
        asz aszVar2 = new asz(jArr);
        int i14 = f53793f;
        int i15 = i14 & 117;
        int i16 = ((i14 | 117) & (~i15)) + (i15 << 1);
        f53794g = i16 % 128;
        if (i16 % 2 != 0) {
            return aszVar2;
        }
        throw null;
    }

    public static /* synthetic */ asz f(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        long[] jArr = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        asy.setY(new Object[]{aszVar.f53795e, jArr}, -1708277463, 1708277466, (int) System.currentTimeMillis());
        asz aszVar2 = new asz(jArr);
        int i10 = f53793f;
        int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
        f53794g = i11 % 128;
        if (i11 % 2 != 0) {
            return aszVar2;
        }
        throw null;
    }

    public static /* synthetic */ apk g(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        apk apkVar = (apk) objArr[1];
        apk apkVar2 = (apk) objArr[2];
        apk apkVar3 = (apk) objArr[3];
        int i10 = f53794g;
        int i11 = (i10 & (-106)) | ((~i10) & 105);
        int i12 = -(-((i10 & 105) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53793f = i13 % 128;
        if (i13 % 2 == 0) {
            return aszVar.setCompoundDrawableTintBlendMode(apkVar, apkVar2, apkVar3);
        }
        aszVar.setCompoundDrawableTintBlendMode(apkVar, apkVar2, apkVar3);
        throw null;
    }

    public static /* synthetic */ asz h(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        int i10 = f53794g;
        int i11 = (i10 & 81) + (i10 | 81);
        f53793f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 & 117;
        int i13 = ((i10 ^ 117) | i12) << 1;
        int i14 = -((i10 | 117) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f53793f = i15 % 128;
        if (i15 % 2 == 0) {
            return aszVar;
        }
        throw null;
    }

    public static /* synthetic */ asz i(Object[] objArr) {
        asz aszVar = (asz) objArr[0];
        apk apkVar = (apk) objArr[1];
        long[] jArr = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
        asy.setY(new Object[]{aszVar.f53795e, ((asz) apkVar).f53795e, jArr}, -1576375366, 1576375367, (int) System.currentTimeMillis());
        asz aszVar2 = new asz(jArr);
        int i10 = f53793f + 31;
        f53794g = i10 % 128;
        if (i10 % 2 != 0) {
            return aszVar2;
        }
        throw null;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        asz aszVar;
        int i13 = ~i10;
        int i14 = (i13 * (-333)) + (i11 * 334) + (i10 * (-665));
        int i15 = ~i12;
        switch ((((~(i13 | i12)) | (~(i11 | i15))) * 333) + (((~(i13 | i15)) | (~(i11 | i12))) * 333) + i14) {
            case 1:
                asz aszVar2 = (asz) objArr[0];
                apk apkVar = (apk) objArr[1];
                apk apkVar2 = (apk) objArr[2];
                apk apkVar3 = (apk) objArr[3];
                long[] jArr = aszVar2.f53795e;
                long[] jArr2 = ((asz) apkVar).f53795e;
                long[] jArr3 = ((asz) apkVar2).f53795e;
                long[] jArr4 = ((asz) apkVar3).f53795e;
                long[] jArr5 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr, jArr2, jArr5}, -2109571802, 2109571813, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr3, jArr4, jArr5}, -2109571802, 2109571813, (int) System.currentTimeMillis());
                long[] jArr6 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr5, jArr6}, -31475590, 31475607, (int) System.currentTimeMillis());
                aszVar = new asz(jArr6);
                int i16 = f53794g + 105;
                f53793f = i16 % 128;
                int i17 = i16 % 2;
                break;
            case 2:
                return i(objArr);
            case 3:
                asz aszVar3 = (asz) objArr[0];
                long[] jArr7 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{aszVar3.f53795e, jArr7}, 192912033, -192912024, (int) System.currentTimeMillis());
                asz aszVar4 = new asz(jArr7);
                System.identityHashCode(aszVar3);
                System.identityHashCode(aszVar3);
                return aszVar4;
            case 4:
                return b(objArr);
            case 5:
                return c(objArr);
            case 6:
                int i18 = f53794g + 47;
                f53793f = i18 % 128;
                return Boolean.valueOf(i18 % 2 == 0);
            case 7:
                return g(objArr);
            case 8:
                return a(objArr);
            case 9:
                asz aszVar5 = (asz) objArr[0];
                long[] jArr8 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{aszVar5.f53795e, jArr8}, 1499764271, -1499764258, (int) System.currentTimeMillis());
                asz aszVar6 = new asz(jArr8);
                int i19 = f53793f + 113;
                f53794g = i19 % 128;
                int i20 = i19 % 2;
                return aszVar6;
            case 10:
                asz aszVar7 = (asz) objArr[0];
                int i21 = f53793f;
                int i22 = ((i21 ^ 70) + ((i21 & 70) << 1)) - 1;
                f53794g = i22 % 128;
                int i23 = i22 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aszVar7.f53795e, 4}, -1971094880, 1971094881, 4)).intValue();
                int i24 = iIntValue & 2330074;
                int i25 = ((iIntValue ^ 2330074) | i24) & (~i24);
                int i26 = f53794g;
                int i27 = i26 & 87;
                int i28 = ((i26 | 87) & (~i27)) + (i27 << 1);
                f53793f = i28 % 128;
                int i29 = i28 % 2;
                return Integer.valueOf(i25);
            case 11:
                asz aszVar8 = (asz) objArr[0];
                int i30 = f53793f + 85;
                f53794g = i30 % 128;
                int i31 = i30 % 2;
                boolean zBooleanValue = ((Boolean) avf.setX(new Object[]{aszVar8.f53795e}, -1422980310, 1422980335, (int) System.currentTimeMillis())).booleanValue();
                int i32 = f53793f;
                int i33 = (i32 ^ 31) + ((i32 & 31) << 1);
                f53794g = i33 % 128;
                int i34 = i33 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 12:
                return f(objArr);
            case 13:
                return d(objArr);
            case 14:
                asz aszVar9 = (asz) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                apk apkVar5 = (apk) objArr[2];
                long[] jArr9 = aszVar9.f53795e;
                long[] jArr10 = ((asz) apkVar4).f53795e;
                long[] jArr11 = ((asz) apkVar5).f53795e;
                long[] jArr12 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr9, jArr12}, 1306010535, -1306010523, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr10, jArr11, jArr12}, -2109571802, 2109571813, (int) System.currentTimeMillis());
                long[] jArr13 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{jArr12, jArr13}, -31475590, 31475607, (int) System.currentTimeMillis());
                aszVar = new asz(jArr13);
                int i35 = f53793f + 63;
                f53794g = i35 % 128;
                int i36 = i35 % 2;
                break;
            case 15:
                return e(objArr);
            case 16:
                int i37 = f53794g;
                int i38 = i37 & 81;
                int i39 = -(-((i37 ^ 81) | i38));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f53793f = i40 % 128;
                return Integer.valueOf(i40 % 2 != 0 ? 3169 : 233);
            case 17:
                return h(objArr);
            case 18:
                asz aszVar10 = (asz) objArr[0];
                int i41 = f53794g + 23;
                int i42 = i41 % 128;
                f53793f = i42;
                int i43 = i41 % 2;
                if ((1 & aszVar10.f53795e[0]) == 0) {
                    int i44 = (i42 & (-82)) | ((~i42) & 81);
                    int i45 = (i42 & 81) << 1;
                    int i46 = (i44 & i45) + (i44 | i45);
                    f53794g = i46 % 128;
                    if (i46 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i47 = (i42 & (-32)) | ((~i42) & 31);
                int i48 = (i42 & 31) << 1;
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                f53794g = i49 % 128;
                int i50 = i49 % 2;
                int i51 = i42 & 35;
                int i52 = i42 | 35;
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                f53794g = i53 % 128;
                int i54 = i53 % 2;
                return Boolean.TRUE;
            case 19:
                asz aszVar11 = (asz) objArr[0];
                apk apkVar6 = (apk) objArr[1];
                long[] jArr14 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{aszVar11.f53795e, ((asz) apkVar6).f53795e, jArr14}, 1760454700, -1760454686, (int) System.currentTimeMillis());
                asz aszVar12 = new asz(jArr14);
                int i55 = f53793f;
                int i56 = (i55 & (-48)) | ((~i55) & 47);
                int i57 = (i55 & 47) << 1;
                int i58 = (i56 & i57) + (i57 | i56);
                f53794g = i58 % 128;
                int i59 = i58 % 2;
                return aszVar12;
            case 20:
                asz aszVar13 = (asz) objArr[0];
                int i60 = f53793f;
                int i61 = (((i60 | 98) << 1) - (i60 ^ 98)) - 1;
                f53794g = i61 % 128;
                int i62 = i61 % 2;
                BigInteger bigInteger = (BigInteger) avf.setX(new Object[]{aszVar13.f53795e}, -692671830, 692671838, (int) System.currentTimeMillis());
                int i63 = f53794g + 60;
                int i64 = (i63 ^ (-1)) + (i63 << 1);
                f53793f = i64 % 128;
                if (i64 % 2 == 0) {
                    return bigInteger;
                }
                throw null;
            case 21:
                asz aszVar14 = (asz) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                int i65 = f53794g;
                int i66 = i65 | 1;
                int i67 = ((i66 << 1) - (~(-((~(i65 & 1)) & i66)))) - 1;
                f53793f = i67 % 128;
                int i68 = i67 % 2;
                apk onFocusChangeListener = aszVar14.setOnFocusChangeListener(apkVar7);
                int i69 = f53793f;
                int i70 = i69 ^ 107;
                int i71 = (i69 & 107) << 1;
                int i72 = (i70 & i71) + (i71 | i70);
                f53794g = i72 % 128;
                int i73 = i72 % 2;
                return onFocusChangeListener;
            case 22:
                asz aszVar15 = (asz) objArr[0];
                long[] jArr15 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                asy.setY(new Object[]{aszVar15.f53795e, jArr15}, 10248962, -10248960, (int) System.currentTimeMillis());
                asz aszVar16 = new asz(jArr15);
                int i74 = f53793f;
                int i75 = i74 & 3;
                int i76 = (i74 ^ 3) | i75;
                int i77 = (i75 & i76) + (i76 | i75);
                f53794g = i77 % 128;
                if (i77 % 2 != 0) {
                    return aszVar16;
                }
                int i78 = 83 / 0;
                return aszVar16;
            default:
                asz aszVar17 = (asz) objArr[0];
                apk apkVar8 = (apk) objArr[1];
                int i79 = f53794g;
                int i80 = ((i79 | 56) << 1) - (i79 ^ 56);
                int i81 = (i80 ^ (-1)) + (i80 << 1);
                f53793f = i81 % 128;
                int i82 = i81 % 2;
                apk navigationOnClickListener = apkVar8.setNavigationOnClickListener();
                if (i82 != 0) {
                    aszVar17.setCompoundDrawableTintBlendMode(navigationOnClickListener);
                    throw null;
                }
                apk compoundDrawableTintBlendMode = aszVar17.setCompoundDrawableTintBlendMode(navigationOnClickListener);
                int i83 = f53794g + 51;
                f53793f = i83 % 128;
                if (i83 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
        }
        return aszVar;
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setX(new Object[]{this}, 1737923781, -1737923777, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1598546737, -1598546729, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setX(new Object[]{this}, -926258059, 926258072, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1057608352, -1057608342, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setX(new Object[]{this}, -2132942928, 2132942946, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setX(new Object[]{this, Integer.valueOf(i10)}, 1050164720, -1050164705, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -497481660, 497481660, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setX(new Object[]{this}, 633721681, -633721669, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setX(new Object[]{this}, -657398874, 657398877, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setX(new Object[]{this}, 1131479473, -1131479462, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -1577458610, 1577458612, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setX(new Object[]{this}, -1955195626, 1955195631, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2}, 1039765595, -1039765581, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setX(new Object[]{this}, 763284247, -763284241, System.identityHashCode(this))).booleanValue();
    }

    public asz() {
        this.f53795e = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, 1569924265, -1569924264, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setX(new Object[]{this}, 1148324236, -1148324227, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -385641287, 385641303, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setX(new Object[]{this}, -422428497, 422428514, System.identityHashCode(this));
    }

    public asz(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f53795e = (long[]) asy.setY(new Object[]{bigInteger}, -1412860296, 1412860314, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, 397375351, -397375332, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setX(new Object[]{this, apkVar, apkVar2, apkVar3}, 368657470, -368657463, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setX(new Object[]{this}, -1200957995, 1200958015, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setX(new Object[]{this, apkVar}, -379315143, 379315164, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setX(new Object[]{this}, -229615024, 229615046, System.identityHashCode(this));
    }
}
