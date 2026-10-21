package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;

/* JADX INFO: loaded from: classes10.dex */
public final class bdz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54609d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54610e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdt f54611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f54613c;

    public bdz(bdz bdzVar) {
        this.f54611a = bdzVar.f54611a;
        this.f54612b = bdzVar.f54612b;
        this.f54613c = (int[]) bds.setCompoundDrawableTintBlendMode(new Object[]{bdzVar.f54613c}, 1409201840, -1409201839, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a5, code lost:
    
        r3 = new java.lang.Object[r2];
        r3[r0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b8, code lost:
    
        if (r7 > ((java.lang.Integer) setDividerPadding(r3, r9, r8, (int) java.lang.System.currentTimeMillis())).intValue()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.bdz.f54610e;
        r6 = r3 & 17;
        r3 = (((r3 | 17) & (~r6)) - (~(-(-(r6 << r2))))) - r2;
        com.mypinpad.tsdk.isolation.bdz.f54609d = r3 % 128;
        r3 = r3 % r4;
        r3 = new java.lang.Object[r2];
        r3[r0] = r10;
        r3 = ((java.lang.Integer) setDividerPadding(r3, -797926854, r14, (int) java.lang.System.currentTimeMillis())).intValue();
        r13 = new java.lang.Object[3];
        r13[r0] = r1.f54611a;
        r13[r2] = java.lang.Integer.valueOf(r3);
        r13[r4] = java.lang.Integer.valueOf(r11);
        r3 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bdt.setX(r13, 1119876470, -1119876464, r3)).intValue();
        r12 = new java.lang.Object[r2];
        r12[r0] = r10;
        r12 = ((java.lang.Integer) setDividerPadding(r12, r9, r8, (int) java.lang.System.currentTimeMillis())).intValue();
        r14 = -r7;
        r15 = java.lang.System.identityHashCode(r1);
        r8 = r14 * 371;
        r9 = -(-(r12 * 371));
        r13 = r8 & r9;
        r16 = ((r8 ^ r9) | r13) << 1;
        r8 = -((r8 | r9) & (~r13));
        r9 = (r16 ^ r8) + ((r16 & r8) << r2);
        r8 = ~r12;
        r13 = ~r15;
        r6 = ~r15;
        r13 = r13 & (r6 | r15);
        r0 = r8 & r13;
        r4 = (~r0) & (r13 | r8);
        r0 = (r0 & r4) | (r4 ^ r0);
        r0 = (r0 | (~r0)) & (~r0);
        r4 = ~r14;
        r13 = (r4 ^ r15) | (r4 & r15);
        r19 = r7;
        r2 = (~r13) & ((~r13) | r13);
        r7 = ((~r2) & r0) | ((~r0) & r2);
        r0 = r0 & r2;
        r0 = ((r0 & r7) | (r7 ^ r0)) * (-370);
        r2 = ((r9 | r0) << 1) - (r0 ^ r9);
        r0 = (r4 ^ r6) | (r4 & r6);
        r0 = (r0 | (~r0)) & (~r0);
        r4 = r8 ^ r15;
        r6 = r8 & r15;
        r4 = ~((r4 & r6) | (r4 ^ r6));
        r6 = r0 & r4;
        r0 = (r0 | r4) & (~r6);
        r0 = (r0 & r6) | (r0 ^ r6);
        r6 = r14 & r12;
        r4 = ~((r14 ^ r12) | r6);
        r0 = ((r0 & r4) | (r0 ^ r4)) * (-370);
        r4 = (r2 ^ r0) + ((r0 & r2) << 1);
        r0 = (~r6) & (r14 | r12);
        r0 = -(-((~((r0 & r6) | (r0 ^ r6))) * 370));
        r2 = (((~r0) & r4) | ((~r4) & r0)) + ((r0 & r4) << 1);
        r0 = 0;
        r10 = (int[]) setDividerPadding(new java.lang.Object[]{r1, (int[]) setDividerPadding(new java.lang.Object[]{r1, (int[]) setDividerPadding(new java.lang.Object[]{r5, java.lang.Integer.valueOf(r2)}, 955312681, -955312678, r2), java.lang.Integer.valueOf(r3)}, 1106557462, -1106557455, r3), r10}, -1794119142, 1794119160, java.lang.System.identityHashCode(r1));
        r2 = com.mypinpad.tsdk.isolation.bdz.f54609d + 25;
        com.mypinpad.tsdk.isolation.bdz.f54610e = r2 % 128;
        r2 = r2 % 2;
        r7 = r19;
        r2 = 1;
        r4 = 2;
        r8 = -9221804;
        r9 = 9221819;
        r14 = 797926862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x020f, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.bdz.f54610e;
        r1 = ((r0 | 29) << 1) - (r0 ^ 29);
        com.mypinpad.tsdk.isolation.bdz.f54609d = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x021e, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0226, code lost:
    
        throw new java.lang.ArithmeticException("Division by zero");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003b, code lost:
    
        if (r7 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r7 != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        r6 = r3.length;
        r10 = new int[r6];
        r14 = 797926862;
        r11 = ((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r5}, -797926854, 797926862, (int) java.lang.System.currentTimeMillis())).intValue();
        r11 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.bdt.setX(new java.lang.Object[]{r1.f54611a, java.lang.Integer.valueOf(r11)}, 2104839888, -2104839886, r11)).intValue();
        java.lang.System.arraycopy(r3, 0, r10, 0, r6);
        r3 = com.mypinpad.tsdk.isolation.bdz.f54610e;
        r12 = r3 & 23;
        r6 = ((r3 ^ 23) | r12) << 1;
        r3 = -((r3 | 23) & (~r12));
        r12 = ((r6 | r3) << 1) - (r3 ^ r6);
        com.mypinpad.tsdk.isolation.bdz.f54609d = r12 % 128;
        r12 = r12 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r20) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdz.a(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        Object obj = objArr[1];
        int i10 = f54609d;
        int i11 = i10 + 121;
        f54610e = i11 % 128;
        int i12 = i11 % 2;
        if (obj != null) {
            int i13 = i10 ^ 105;
            int i14 = ((i10 & 105) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 & i15) + (i15 | i14);
            f54610e = i16 % 128;
            int i17 = i16 % 2;
            if (obj instanceof bdz) {
                bdz bdzVar2 = (bdz) obj;
                if (bdzVar.f54611a.equals(bdzVar2.f54611a)) {
                    int i18 = f54609d;
                    int i19 = i18 & 31;
                    int i20 = (i18 ^ 31) | i19;
                    int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                    f54610e = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                    if (bdzVar.f54612b == bdzVar2.f54612b && ((Boolean) setDividerPadding(new Object[]{bdzVar.f54613c, bdzVar2.f54613c}, 1380886330, -1380886311, (int) System.currentTimeMillis())).booleanValue()) {
                        int i22 = f54610e + 93;
                        f54609d = i22 % 128;
                        return Boolean.valueOf(i22 % 2 == 0);
                    }
                }
                int i23 = f54610e;
                int i24 = i23 | 47;
                int i25 = i24 << 1;
                int i26 = -((~(i23 & 47)) & i24);
                int i27 = (i25 & i26) + (i26 | i25);
                f54609d = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.FALSE;
            }
        }
        int i29 = i10 ^ 59;
        int i30 = ((i10 & 59) | i29) << 1;
        int i31 = -i29;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        f54610e = i32 % 128;
        if (i32 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54609d;
        int i11 = (i10 & 30) + (i10 | 30);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        int i13 = i12 % 128;
        f54610e = i13;
        int i14 = i12 % 2;
        int[] iArr = bdzVar.f54613c;
        int i15 = bdzVar.f54612b;
        int i16 = iArr[i15];
        int i17 = i15 - 1;
        int i18 = (i13 ^ 75) + ((i13 & 75) << 1);
        f54609d = i18 % 128;
        int i19 = i18 % 2;
        while (i17 >= 0) {
            int i20 = f54610e;
            int i21 = (i20 & (-2)) | ((~i20) & 1);
            int i22 = -(-((i20 & 1) << 1));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f54609d = i23 % 128;
            int i24 = i23 % 2;
            int iIntValue2 = ((Integer) bdt.setX(new Object[]{bdzVar.f54611a, Integer.valueOf(i16), Integer.valueOf(iIntValue)}, 1119876470, -1119876464, i16)).intValue();
            int i25 = bdzVar.f54613c[i17];
            int i26 = iIntValue2 & i25;
            i16 = ((iIntValue2 ^ i25) | i26) & (~i26);
            int i27 = -(~i17);
            i17 = (((-2) | i27) << 1) - (i27 ^ (-2));
            int i28 = f54609d;
            int i29 = (i28 & (-34)) | ((~i28) & 33);
            int i30 = -(-((i28 & 33) << 1));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            f54610e = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = f54610e;
        int i34 = i33 & 81;
        int i35 = ((((i33 ^ 81) | i34) << 1) - (~(-((i33 | 81) & (~i34))))) - 1;
        f54609d = i35 % 128;
        if (i35 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        int i36 = 76 / 0;
        return Integer.valueOf(i16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r1 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r6 = (r1 | 87) << 1;
        r0 = -((r1 & (-88)) | ((~r1) & 87));
        r1 = (r6 & r0) + (r6 | r0);
        com.mypinpad.tsdk.isolation.bdz.f54609d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if ((r1 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        return java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r6[r4] == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r6[r4] == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r6 = r2 ^ 109;
        r1 = ((((r2 & 109) | r6) << 1) - (~(-r6))) - 1;
        com.mypinpad.tsdk.isolation.bdz.f54610e = r1 % 128;
        r1 = r1 % 2;
        r2 = r2 + 73;
        com.mypinpad.tsdk.isolation.bdz.f54610e = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer d(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            com.mypinpad.tsdk.i.bdz r6 = (com.mypinpad.tsdk.isolation.bdz) r6
            int r1 = com.mypinpad.tsdk.isolation.bdz.f54610e
            r2 = r1 ^ 23
            r3 = r1 & 23
            r2 = r2 | r3
            int r2 = r2 << 1
            int r3 = ~r3
            r4 = r1 | 23
            r3 = r3 & r4
            int r3 = -r3
            r4 = r2 ^ r3
            r2 = r2 & r3
            int r2 = r2 << 1
            int r4 = r4 + r2
            int r2 = r4 % 128
            com.mypinpad.tsdk.isolation.bdz.f54609d = r2
            int r4 = r4 % 2
            int[] r6 = r6.f54613c
            if (r4 == 0) goto L2c
            int r3 = r6.length
            int r4 = r3 << 1
            int r4 = r4 - r3
            r6 = r6[r4]
            if (r6 != 0) goto L65
            goto L3b
        L2c:
            int r3 = r6.length
            int r4 = ~r3
            int r3 = r3 << 1
            r5 = r4 ^ r3
            r3 = r3 & r4
            int r3 = r3 << 1
            int r4 = r5 + r3
            r6 = r6[r4]
            if (r6 != 0) goto L65
        L3b:
            r6 = r2 ^ 109(0x6d, float:1.53E-43)
            r1 = r2 & 109(0x6d, float:1.53E-43)
            r1 = r1 | r6
            int r1 = r1 << 1
            int r6 = -r6
            int r6 = ~r6
            int r1 = r1 - r6
            int r1 = r1 + (-1)
            int r6 = r1 % 128
            com.mypinpad.tsdk.isolation.bdz.f54610e = r6
            int r1 = r1 % 2
            int r2 = r2 + 73
            int r6 = r2 % 128
            com.mypinpad.tsdk.isolation.bdz.f54610e = r6
            int r2 = r2 % 2
            r6 = -1
            if (r2 != 0) goto L60
            r1 = 75
            int r1 = r1 / r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L60:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L65:
            r6 = r1 | 87
            int r6 = r6 << 1
            r0 = r1 & (-88)
            int r1 = ~r1
            r1 = r1 & 87
            r0 = r0 | r1
            int r0 = -r0
            r1 = r6 & r0
            r6 = r6 | r0
            int r1 = r1 + r6
            int r6 = r1 % 128
            com.mypinpad.tsdk.isolation.bdz.f54609d = r6
            int r1 = r1 % 2
            if (r1 != 0) goto L81
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            return r6
        L81:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdz.d(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        int[] iArr = (int[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f54610e;
        int i11 = (i10 & 65) + (i10 | 65);
        f54609d = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        int iIntValue2 = ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
        if (iIntValue2 != -1) {
            int i12 = f54610e;
            int i13 = i12 & 79;
            int i14 = -(-((i12 ^ 79) | i13));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            int i16 = i15 % 128;
            f54609d = i16;
            if (i15 % 2 != 0) {
                throw null;
            }
            if (iIntValue != 0) {
                if (iIntValue == 1) {
                    int i17 = i16 + 81;
                    f54610e = i17 % 128;
                    int i18 = i17 % 2;
                    int[] iArr2 = (int[]) bds.setCompoundDrawableTintBlendMode(new Object[]{iArr}, 1409201840, -1409201839, (int) System.currentTimeMillis());
                    int i19 = f54609d + 56;
                    int i20 = (i19 ^ (-1)) + (i19 << 1);
                    f54610e = i20 % 128;
                    if (i20 % 2 != 0) {
                        return iArr2;
                    }
                    throw null;
                }
                int i21 = -(-(iIntValue2 * 713));
                int i22 = ((((-711) ^ i21) | ((-711) & i21)) << 1) - ((i21 & 710) | ((-711) & (~i21)));
                int i23 = ~iIntValue2;
                int i24 = (i23 & (-2)) | ((~i23) & 1);
                int i25 = i23 & 1;
                int i26 = ~((i24 & i25) | (i24 ^ i25));
                int i27 = ~iIntValue;
                int i28 = i27 & 1;
                int i29 = i28 | ((~i28) & (i27 | 1));
                int i30 = ((~i29) | i29) & (~i29);
                int i31 = -(~(-(-(((i30 & i26) | (i26 ^ i30)) * (-712)))));
                int i32 = ((i22 & i31) + (i31 | i22)) - 1;
                int i33 = ~iIntValue;
                int i34 = (i33 | iIntValue) & i27;
                int i35 = (i23 & i34) | ((~i34) & i23) | ((~i23) & i34);
                int i36 = i35 & 1;
                int i37 = ~(((i35 | 1) & (~i36)) | i36);
                int i38 = iIntValue2 & 1;
                int i39 = (~i38) & (iIntValue2 | 1);
                int i40 = (i38 & i39) | (i39 ^ i38);
                int i41 = i40 ^ iIntValue;
                int i42 = i40 & iIntValue;
                int i43 = ~((i42 & i41) | (i41 ^ i42));
                int i44 = i37 & i43;
                int i45 = (((i37 | i43) & (~i44)) | i44) * (-712);
                int i46 = i32 & i45;
                int i47 = i33 & 1;
                int[] iArr3 = new int[(((~(((i33 | 1) & (~i47)) | i47)) | (~iIntValue2)) * 712) + ((((i45 | i32) & (~i46)) - (~(i46 << 1))) - 1)];
                int i48 = ((i12 & 74) + (i12 | 74)) - 1;
                f54609d = i48 % 128;
                int i49 = i48 % 2;
                while (iIntValue2 >= 0) {
                    int i50 = f54610e + 117;
                    f54609d = i50 % 128;
                    int i51 = i50 % 2;
                    bdt bdtVar = bdzVar.f54611a;
                    int i52 = iArr[iIntValue2];
                    iArr3[iIntValue2] = ((Integer) bdt.setX(new Object[]{bdtVar, Integer.valueOf(i52), Integer.valueOf(iIntValue)}, 1119876470, -1119876464, i52)).intValue();
                    iIntValue2--;
                    int i53 = f54610e;
                    int i54 = i53 & 9;
                    int i55 = -(-((i53 ^ 9) | i54));
                    int i56 = (i54 & i55) + (i55 | i54);
                    f54609d = i56 % 128;
                    int i57 = i56 % 2;
                }
                int i58 = f54610e;
                int i59 = ((-1) << 1) - (((i58 ^ 36) + ((i58 & 36) << 1)) ^ (-1));
                f54609d = i59 % 128;
                if (i59 % 2 == 0) {
                    return iArr3;
                }
                throw null;
            }
        }
        int[] iArr4 = new int[1];
        int i60 = f54609d;
        int i61 = i60 & 21;
        int i62 = (i61 - (~((i60 ^ 21) | i61))) - 1;
        f54610e = i62 % 128;
        if (i62 % 2 != 0) {
            return iArr4;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
    
        r2 = r12.length;
        r6 = ~r1;
        r4 = (r1 & (-2)) | (r6 & 1);
        r7 = (r1 & 1) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        if (r2 != (((r4 | r7) << 1) - (r4 ^ r7))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.bdz.f54609d;
        r2 = (((r1 | 38) << 1) - (r1 ^ 38)) - 1;
        com.mypinpad.tsdk.isolation.bdz.f54610e = r2 % 128;
        r2 = r2 % 2;
        r12 = (int[]) com.mypinpad.tsdk.isolation.bds.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r12}, 1409201840, -1409201839, (int) java.lang.System.currentTimeMillis());
        r0 = com.mypinpad.tsdk.isolation.bdz.f54610e + 109;
        com.mypinpad.tsdk.isolation.bdz.f54609d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00aa, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        r2 = (int) java.lang.System.currentTimeMillis();
        r4 = r1 * (-103);
        r8 = (-103) & r4;
        r4 = -(-((r4 ^ (-103)) | r8));
        r7 = (r8 & r4) + (r4 | r8);
        r4 = ~r1;
        r6 = r6 | r1;
        r8 = r4 & r6;
        r9 = ((~r8) & (-2)) | (r8 & 1);
        r8 = r8 & (-2);
        r8 = (r8 & r9) | (r9 ^ r8);
        r8 = (r8 | (~r8)) & (~r8);
        r4 = r4 & r6;
        r6 = r4 & r2;
        r4 = (r4 | r2) & (~r6);
        r9 = ~r2;
        r4 = (r4 & r6) | (r4 ^ r6);
        r4 = (r4 | (~r4)) & (~r4);
        r4 = ((-1) << 1) - ((-1) ^ (r7 - (~(-(-(((r4 & r8) | (r8 ^ r4)) * 104))))));
        r5 = (~r2) & (r9 | r2);
        r6 = r5 & 1;
        r5 = (r5 | 1) & (~r6);
        r5 = (r5 & r6) | (r5 ^ r6);
        r4 = (r4 - (~((~((r5 & r1) | (r5 ^ r1))) * (-104)))) - 1;
        r5 = r2 ^ 1;
        r2 = r2 & 1;
        r2 = ((r2 & r5) | (r5 ^ r2)) * 104;
        r5 = r4 ^ r2;
        r2 = (r2 & r4) << 1;
        r2 = new int[((r5 | r2) << 1) - (r2 ^ r5)];
        r4 = (r1 ^ 2) + ((r1 & 2) << 1);
        java.lang.System.arraycopy(r12, 0, r2, 0, (r4 ^ (-1)) + (r4 << 1));
        r12 = com.mypinpad.tsdk.isolation.bdz.f54609d;
        r1 = r12 & 61;
        r0 = (((r12 ^ 61) | r1) << 1) - ((r12 | 61) & (~r1));
        com.mypinpad.tsdk.isolation.bdz.f54610e = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0139, code lost:
    
        if ((r0 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r1 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r1 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.bdz.f54609d;
        r0 = r12 & 87;
        r12 = (r12 | 87) & (~r0);
        r0 = -(-(r0 << 1));
        r1 = (r12 ^ r0) + ((r12 & r0) << 1);
        r12 = r1 % 128;
        com.mypinpad.tsdk.isolation.bdz.f54610e = r12;
        r1 = r1 % 2;
        r0 = new int[1];
        r12 = r12 + 21;
        com.mypinpad.tsdk.isolation.bdz.f54609d = r12 % 128;
        r12 = r12 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object f(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdz.f(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ bdz g(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54609d;
        int i11 = ((i10 ^ 23) | (i10 & 23)) << 1;
        int i12 = -(((~i10) & 23) | (i10 & (-24)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f54610e = i13 % 128;
        if (i13 % 2 == 0) {
            ((Boolean) bdt.setX(new Object[]{bdzVar.f54611a, Integer.valueOf(iIntValue)}, 704366847, -704366847, iIntValue)).booleanValue();
            throw null;
        }
        if (!((Boolean) bdt.setX(new Object[]{bdzVar.f54611a, Integer.valueOf(iIntValue)}, 704366847, -704366847, iIntValue)).booleanValue()) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        bdz bdzVar2 = new bdz(bdzVar.f54611a, (int[]) setDividerPadding(new Object[]{bdzVar, bdzVar.f54613c, Integer.valueOf(iIntValue)}, 1106557462, -1106557455, iIntValue));
        int i14 = f54610e;
        int i15 = (-2) - ((((i14 | 66) << 1) - (i14 ^ 66)) ^ (-1));
        f54609d = i15 % 128;
        int i16 = i15 % 2;
        return bdzVar2;
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f54610e;
        int i11 = ((i10 & 40) + (i10 | 40)) - 1;
        f54609d = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        int iIntValue = ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
        if (iIntValue == -1) {
            int i12 = f54610e + 51;
            f54609d = i12 % 128;
            int i13 = i12 % 2;
            return 0;
        }
        int i14 = iArr[iIntValue];
        int i15 = f54609d;
        int i16 = i15 & 51;
        int i17 = i16 + ((i15 ^ 51) | i16);
        f54610e = i17 % 128;
        int i18 = i17 % 2;
        return Integer.valueOf(i14);
    }

    public static /* synthetic */ void i(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        int i10 = f54610e + 117;
        f54609d = i10 % 128;
        int i11 = i10 % 2;
        int length = bdzVar.f54613c.length;
        int iIdentityHashCode = System.identityHashCode(bdzVar);
        int i12 = -(-(length * (-68)));
        int i13 = (-70) & i12;
        int i14 = -(-((i12 ^ (-70)) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        int i16 = ~length;
        int i17 = ~((i16 ^ iIdentityHashCode) | (i16 & iIdentityHashCode));
        int i18 = (i16 ^ length) | (i16 & length);
        int i19 = ~((i18 & iIdentityHashCode) | (i18 ^ iIdentityHashCode));
        int i20 = (i15 - (~(-(~(((i17 & i19) | (i17 ^ i19)) * 69))))) - 2;
        int i21 = ~iIdentityHashCode;
        int i22 = (i16 ^ i21) | (i16 & i21);
        int i23 = (i16 & iIdentityHashCode) | (i21 & length);
        int i24 = length & iIdentityHashCode;
        int i25 = ~((i24 & i23) | (i23 ^ i24));
        int i26 = -(-(((i25 & i22) | (i22 ^ i25)) * (-69)));
        int i27 = i20 & i26;
        int i28 = (i26 | i20) & (~i27);
        int i29 = -(-(i27 << 1));
        bdzVar.f54612b = (i28 & i29) + (i28 | i29);
        int i30 = f54610e;
        int i31 = i30 & 91;
        int i32 = (i31 - (~(-(-((i30 ^ 91) | i31))))) - 1;
        f54609d = i32 % 128;
        while (true) {
            int i33 = i32 % 2;
            int i34 = bdzVar.f54612b;
            if (i34 < 0) {
                break;
            }
            int i35 = f54609d;
            int i36 = (i35 & 39) + (i35 | 39);
            f54610e = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = bdzVar.f54613c[i34];
                throw null;
            }
            if (bdzVar.f54613c[i34] != 0) {
                break;
            }
            int iIdentityHashCode2 = System.identityHashCode(bdzVar);
            int i38 = i34 * 1435;
            int i39 = 716 & i38;
            int i40 = (i38 ^ 716) | i39;
            int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
            int i42 = i34 * (-1434);
            int i43 = ((i41 ^ i42) - (~(-(-((i42 & i41) << 1))))) - 1;
            int i44 = ~iIdentityHashCode2;
            int i45 = ~i34;
            int i46 = i44 & i45;
            int i47 = ((~i44) & i34) | i46;
            int i48 = i44 & i34;
            int i49 = ~((i47 & i48) | (i47 ^ i48));
            int i50 = ~((i45 ^ i34) | (i45 & i34));
            int i51 = (i49 & i50) | (i49 ^ i50);
            int i52 = i46 | ((~i45) & iIdentityHashCode2);
            int i53 = i45 & iIdentityHashCode2;
            int i54 = ~((i52 & i53) | (i52 ^ i53));
            int i55 = i51 & i54;
            int i56 = (i54 | i51) & (~i55);
            int i57 = -(-(((i56 & i55) | (i56 ^ i55)) * 717));
            int i58 = i43 & i57;
            int i59 = (i43 ^ i57) | i58;
            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
            int i61 = i45 & (i45 | i34);
            int i62 = i61 & i44;
            int i63 = (i44 | i61) & (~i62);
            int i64 = ~((i63 & i62) | (i63 ^ i62));
            int i65 = ((-1) ^ i34) | i34;
            int i66 = ~i65;
            int i67 = (i65 | i66) & i66;
            int i68 = ((~i67) & i64) | ((~i64) & i67);
            int i69 = i64 & i67;
            int i70 = (i69 & i68) | (i68 ^ i69);
            int i71 = i48 | i53;
            int i72 = i34 & iIdentityHashCode2;
            int i73 = ~((i72 & i71) | (i71 ^ i72));
            int i74 = ((~i73) & i70) | ((~i70) & i73);
            int i75 = i73 & i70;
            int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * 717));
            bdzVar.f54612b = (i60 ^ i76) + ((i76 & i60) << 1);
            int i77 = f54609d;
            i32 = ((i77 | 53) << 1) - (((~i77) & 53) | (i77 & (-54)));
            f54610e = i32 % 128;
        }
        int i78 = f54609d;
        int i79 = (i78 ^ 15) + ((i78 & 15) << 1);
        f54610e = i79 % 128;
        int i80 = i79 % 2;
    }

    public static /* synthetic */ Object j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54610e;
        int i11 = (i10 & 93) + (i10 | 93);
        f54609d = i11 % 128;
        if (i11 % 2 != 0) {
            ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        int iIntValue2 = ((Integer) setDividerPadding(new Object[]{iArr}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
        if (iIntValue2 == -1) {
            int[] iArr2 = new int[1];
            int i12 = f54609d;
            int i13 = i12 & 25;
            int i14 = (i12 | 25) & (~i13);
            int i15 = -(-(i13 << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f54610e = i16 % 128;
            if (i16 % 2 != 0) {
                return iArr2;
            }
            throw null;
        }
        int i17 = iIntValue * (-574);
        int i18 = iIntValue2 * (-574);
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        int i20 = ~iIntValue;
        int i21 = ~iIntValue;
        int i22 = ((~i21) & i20) | ((~i20) & i21);
        int i23 = i20 & i21;
        int i24 = ~((i23 & i22) | (i22 ^ i23));
        int i25 = ~iIntValue2;
        int i26 = (i25 & i21) | ((~i25) & iIntValue);
        int i27 = i25 & iIntValue;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = (i28 | (~i28)) & (~i28);
        int i30 = ((~i29) & i24) | ((~i24) & i29);
        int i31 = i24 & i29;
        int i32 = -(~(((i31 & i30) | (i30 ^ i31)) * 1150));
        int i33 = ((-1) << 1) - ((-1) ^ ((i19 ^ i32) + ((i32 & i19) << 1)));
        int i34 = ~iIntValue2;
        int i35 = (i34 & i21) | ((~i34) & iIntValue);
        int i36 = i34 & iIntValue;
        int i37 = (i35 & i36) | (i35 ^ i36);
        int i38 = (i37 | (~i37)) & (~i37);
        int i39 = ~iIntValue;
        int i40 = (i34 & i39) | ((~i39) & iIntValue2);
        int i41 = i39 & iIntValue2;
        int i42 = ~((i40 & i41) | (i40 ^ i41));
        int i43 = i33 - (~(((i42 & i38) | (i38 ^ i42)) * (-575)));
        int i44 = (i43 ^ (-1)) + (i43 << 1);
        int i45 = (i21 | iIntValue) & i39;
        int i46 = i45 ^ iIntValue;
        int i47 = i45 & iIntValue;
        int i48 = ~((i47 & i46) | (i46 ^ i47));
        int i49 = (i21 & i21) | ((~i21) & iIntValue);
        int i50 = i21 & iIntValue;
        int i51 = ~((i50 & i49) | (i49 ^ i50));
        int i52 = -(-(((i48 & i51) | (i48 ^ i51)) * 575));
        int i53 = i44 & i52;
        int i54 = (((i52 | i44) & (~i53)) - (~(i53 << 1))) - 1;
        int i55 = ((i54 ^ 1) | (i54 & 1)) << 1;
        int i56 = -(((~i54) & 1) | (i54 & (-2)));
        int[] iArr3 = new int[(i55 ^ i56) + ((i56 & i55) << 1)];
        System.arraycopy(iArr, 0, iArr3, iIntValue, iIntValue2 + 1);
        int i57 = f54609d;
        int i58 = i57 & 27;
        int i59 = (i57 ^ 27) | i58;
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        f54610e = i60 % 128;
        int i61 = i60 % 2;
        return iArr3;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        bdz bdzVar = (bdz) objArr[0];
        int i10 = f54610e;
        int i11 = i10 ^ 15;
        int i12 = -(-((i10 & 15) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f54609d = i13 % 128;
        int i14 = i13 % 2;
        int iHashCode = bdzVar.f54611a.hashCode();
        int i15 = i14 != 0 ? 1 : 0;
        while (true) {
            int[] iArr = bdzVar.f54613c;
            if (i15 >= iArr.length) {
                break;
            }
            int i16 = f54610e;
            int i17 = i16 & 39;
            int i18 = -(-((i16 ^ 39) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            f54609d = i20;
            int i21 = i19 % 2;
            int i22 = iHashCode * 31;
            int i23 = -(-iArr[i15]);
            iHashCode = ((i22 | i23) << 1) - (i22 ^ i23);
            int i24 = i15 + 29;
            i15 = ((i24 & (-28)) << 1) + (i24 ^ (-28));
            int i25 = (((i20 & (-84)) | ((~i20) & 83)) - (~(-(-((i20 & 83) << 1))))) - 1;
            f54610e = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f54609d;
        int i28 = i27 & 17;
        int i29 = ((i27 | 17) & (~i28)) + (i28 << 1);
        f54610e = i29 % 128;
        if (i29 % 2 != 0) {
            return Integer.valueOf(iHashCode);
        }
        int i30 = 51 / 0;
        return Integer.valueOf(iHashCode);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0340  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int length;
        int i13;
        int i14;
        int[] iArr;
        int i15 = ~i11;
        int i16 = ~i10;
        int i17 = ~i12;
        int i18 = ((i11 | i16 | i17) * 494) + ((i10 | i15) * (-988)) + (i11 * (-493)) + (i10 * 495);
        int i19 = (~(i17 | i11)) | (~(i15 | i16));
        int i20 = 0;
        switch ((((~(i10 | i11)) | i19) * 494) + i18) {
            case 1:
                i(objArr);
                return null;
            case 2:
                return g(objArr);
            case 3:
                return j(objArr);
            case 4:
                return d(objArr);
            case 5:
                return c(objArr);
            case 6:
                bdz bdzVar = (bdz) objArr[0];
                int i21 = f54610e;
                int i22 = i21 & 33;
                int i23 = (i22 - (~(-(-((i21 ^ 33) | i22))))) - 1;
                f54609d = i23 % 128;
                int i24 = i23 % 2;
                int i25 = i21 & 103;
                int i26 = (((i21 | 103) & (~i25)) - (~(i25 << 1))) - 1;
                f54609d = i26 % 128;
                int i27 = i26 % 2;
                int i28 = 8;
                int i29 = 1;
                while (true) {
                    bdt bdtVar = bdzVar.f54611a;
                    if (((Integer) bdt.setX(new Object[]{bdtVar}, -2076948404, 2076948405, System.identityHashCode(bdtVar))).intValue() <= i28) {
                        byte[] bArr = new byte[bdzVar.f54613c.length * i29];
                        int i30 = f54610e;
                        int i31 = (i30 ^ 105) + ((i30 & 105) << 1);
                        f54609d = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = 0;
                        int i34 = 0;
                        while (i33 < bdzVar.f54613c.length) {
                            int i35 = f54609d;
                            int i36 = ((i35 ^ 121) | (i35 & 121)) << 1;
                            int i37 = -((i35 & (-122)) | ((~i35) & 121));
                            int i38 = (i36 & i37) + (i36 | i37);
                            f54610e = i38 % 128;
                            int i39 = i38 % 2;
                            int i40 = (i35 ^ 13) + ((i35 & 13) << 1);
                            f54610e = i40 % 128;
                            int i41 = i40 % 2;
                            int i42 = 0;
                            while (i42 < i28) {
                                int i43 = f54610e;
                                int i44 = (((i43 | 32) << 1) - (i43 ^ 32)) - 1;
                                f54609d = i44 % 128;
                                int i45 = i44 % 2;
                                int i46 = i34 + 1;
                                bArr[i34] = (byte) (bdzVar.f54613c[i33] >>> i42);
                                int i47 = i42 - 47;
                                int i48 = i47 & 55;
                                int i49 = (i47 ^ 55) | i48;
                                i42 = (i48 ^ i49) + ((i48 & i49) << 1);
                                int i50 = ((i43 | 51) << 1) - (i43 ^ 51);
                                f54609d = i50 % 128;
                                int i51 = i50 % 2;
                                i34 = i46;
                            }
                            int i52 = ((i33 & 115) | ((~i33) & (-116))) + ((i33 & (-116)) << 1);
                            int i53 = i52 | 117;
                            i33 = (i53 << 1) - (i53 & (~(i52 & 117)));
                            int i54 = f54610e;
                            int i55 = ((i54 | 97) << 1) - (i54 ^ 97);
                            f54609d = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        int i57 = f54609d;
                        int i58 = ((i57 ^ 88) + ((i57 & 88) << 1)) - 1;
                        f54610e = i58 % 128;
                        int i59 = i58 % 2;
                        return bArr;
                    }
                    int i60 = f54610e;
                    int i61 = (i60 | 121) << 1;
                    int i62 = -(i60 ^ 121);
                    int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                    int i64 = i63 % 128;
                    f54609d = i64;
                    if (i63 % 2 != 0) {
                        i29 += 67;
                        int i65 = i28 & 77;
                        int i66 = -(-(i28 | 77));
                        i28 = ((i65 | i66) << 1) - (i66 ^ i65);
                    } else {
                        int i67 = (((i29 | 1) << 1) - (~(-(i29 ^ 1)))) - 1;
                        int i68 = ((i28 & (-89)) + (i28 | (-89))) - 1;
                        i28 = (((i68 ^ 98) | (i68 & 98)) << 1) - (((~i68) & 98) | (i68 & (-99)));
                        i29 = i67;
                    }
                    int i69 = (i64 & (-8)) | ((~i64) & 7);
                    int i70 = -(-((i64 & 7) << 1));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    f54610e = i71 % 128;
                    int i72 = i71 % 2;
                }
                break;
            case 7:
                return e(objArr);
            case 8:
                return h(objArr);
            case 9:
                bdz bdzVar2 = (bdz) objArr[0];
                StringBuilder sb2 = new StringBuilder(" Polynomial over ");
                sb2.append(bdzVar2.f54611a.toString());
                sb2.append(": \n");
                String string = sb2.toString();
                int i73 = f54610e;
                int i74 = i73 & 87;
                int i75 = -(-((i73 ^ 87) | i74));
                int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                f54609d = i76 % 128;
                int i77 = i76 % 2;
                int i78 = 0;
                while (i78 < bdzVar2.f54613c.length) {
                    StringBuilder sbD = c.d(string);
                    int i79 = bdzVar2.f54613c[i78];
                    sbD.append((String) bdt.setX(new Object[]{bdzVar2.f54611a, Integer.valueOf(i79)}, 1140470754, -1140470751, i79));
                    sbD.append("Y^");
                    sbD.append(i78);
                    sbD.append("+");
                    string = sbD.toString();
                    i78 = (((i78 | 69) << 1) - (i78 ^ 69)) - 68;
                    int i80 = f54609d;
                    int i81 = i80 | 65;
                    int i82 = i81 << 1;
                    int i83 = -((~(i80 & 65)) & i81);
                    int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                    f54610e = i84 % 128;
                    int i85 = i84 % 2;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(ReplenishLogic.ID_SEPARATOR);
                String string2 = sb3.toString();
                int i86 = f54609d;
                int i87 = ((i86 & (-46)) | ((~i86) & 45)) + ((i86 & 45) << 1);
                f54610e = i87 % 128;
                int i88 = i87 % 2;
                return string2;
            case 10:
                return f(objArr);
            case 11:
                bdz bdzVar3 = (bdz) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i89 = f54609d;
                int i90 = (((i89 | 92) << 1) - (i89 ^ 92)) - 1;
                f54610e = i90 % 128;
                int i91 = i90 % 2;
                if (!((Boolean) bdt.setX(new Object[]{bdzVar3.f54611a, Integer.valueOf(iIntValue)}, 704366847, -704366847, iIntValue)).booleanValue()) {
                    throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
                }
                bdzVar3.f54613c = (int[]) setDividerPadding(new Object[]{bdzVar3, bdzVar3.f54613c, Integer.valueOf(iIntValue)}, 1106557462, -1106557455, iIntValue);
                setDividerPadding(new Object[]{bdzVar3}, 94522969, -94522968, System.identityHashCode(bdzVar3));
                int i92 = f54610e;
                int i93 = (i92 & (-44)) | ((~i92) & 43);
                int i94 = (i92 & 43) << 1;
                int i95 = (i93 & i94) + (i94 | i93);
                f54609d = i95 % 128;
                int i96 = i95 % 2;
                return null;
            case 12:
                return b(objArr);
            case 13:
                bdz bdzVar4 = (bdz) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i97 = f54609d;
                int i98 = i97 + 25;
                int i99 = i98 % 128;
                f54610e = i99;
                if (i98 % 2 == 0) {
                    throw null;
                }
                if (iIntValue2 >= 0 && iIntValue2 <= bdzVar4.f54612b) {
                    int i100 = bdzVar4.f54613c[iIntValue2];
                    int i101 = (i99 & (-74)) | ((~i99) & 73);
                    int i102 = (i99 & 73) << 1;
                    int i103 = (i101 & i102) + (i101 | i102);
                    f54609d = i103 % 128;
                    int i104 = i103 % 2;
                    objValueOf = Integer.valueOf(i100);
                } else {
                    int i105 = (i97 | 103) << 1;
                    int i106 = -(i97 ^ 103);
                    int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                    f54610e = i107 % 128;
                    if (i107 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = 0;
                }
                break;
                break;
            case 14:
                return k(objArr);
            case 15:
                int[] iArr2 = (int[]) objArr[0];
                int i108 = f54610e;
                int i109 = i108 + 95;
                f54609d = i109 % 128;
                if (i109 % 2 != 0) {
                    int length2 = iArr2.length;
                    length = ((length2 ^ (-1)) - (~(-(-(length2 << 1))))) - 1;
                } else {
                    length = iArr2.length - 1;
                }
                int i110 = ((((i108 ^ 9) | (i108 & 9)) << 1) - (~(-(((~i108) & 9) | (i108 & (-10)))))) - 1;
                f54609d = i110 % 128;
                int i111 = i110 % 2;
                while (length >= 0) {
                    int i112 = f54609d + 69;
                    int i113 = i112 % 128;
                    f54610e = i113;
                    if (i112 % 2 == 0) {
                        int i114 = iArr2[length];
                        throw null;
                    }
                    if (iArr2[length] != 0) {
                        int i115 = f54610e;
                        int i116 = i115 & 1;
                        int i117 = ((i115 ^ 1) | i116) << 1;
                        int i118 = -((i115 | 1) & (~i116));
                        i13 = (i117 & i118) + (i118 | i117);
                        f54609d = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i119 = 12 / 0;
                        }
                        objValueOf = Integer.valueOf(length);
                    } else {
                        int i120 = i113 + 33;
                        f54609d = i120 % 128;
                        if (i120 % 2 != 0) {
                            i14 = ((length | 126) << 1) - (length ^ 126);
                        } else {
                            int i121 = length - 95;
                            i14 = ((i121 ^ 95) + ((i121 & 95) << 1)) - 1;
                        }
                        length = i14;
                    }
                    break;
                }
                int i1110 = f54610e;
                int i1111 = i1110 & 1;
                int i1112 = ((i1110 ^ 1) | i1111) << 1;
                int i1113 = -((i1110 | 1) & (~i1111));
                i13 = (i1112 & i1113) + (i1113 | i1112);
                f54609d = i13 % 128;
                if (i13 % 2 != 0) {
                    int i1114 = 12 / 0;
                }
                objValueOf = Integer.valueOf(length);
                break;
            case 16:
                bdz bdzVar5 = (bdz) objArr[0];
                bdz bdzVar6 = (bdz) objArr[1];
                System.identityHashCode(bdzVar5);
                System.identityHashCode(bdzVar5);
                bdzVar5.f54613c = (int[]) setDividerPadding(new Object[]{bdzVar5, bdzVar5.f54613c, bdzVar6.f54613c}, -1794119142, 1794119160, System.identityHashCode(bdzVar5));
                setDividerPadding(new Object[]{bdzVar5}, 94522969, -94522968, System.identityHashCode(bdzVar5));
                int i122 = f54610e + 55;
                f54609d = i122 % 128;
                if (i122 % 2 == 0) {
                    return null;
                }
                throw null;
            case 17:
                return a(objArr);
            case 18:
                bdz bdzVar7 = (bdz) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i123 = f54609d + 22;
                int i124 = (i123 ^ (-1)) + (i123 << 1);
                f54610e = i124 % 128;
                if (i124 % 2 == 0) {
                    int length3 = iArr3.length;
                    int length4 = iArr4.length;
                    throw null;
                }
                if (iArr3.length < iArr4.length) {
                    iArr = new int[iArr4.length];
                    System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                    int i125 = f54610e;
                    int i126 = ((i125 & 124) + (i125 | 124)) - 1;
                    f54609d = i126 % 128;
                    int i127 = i126 % 2;
                } else {
                    iArr = new int[iArr3.length];
                    System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
                    int i128 = f54609d + 75;
                    f54610e = i128 % 128;
                    int i129 = i128 % 2;
                    iArr3 = iArr4;
                }
                int length5 = iArr3.length;
                int iIdentityHashCode = System.identityHashCode(bdzVar7);
                int i130 = length5 * (-159);
                int i131 = 159 & i130;
                int i132 = ((i130 | 159) & (~i131)) + (i131 << 1);
                int i133 = length5 * 160;
                int i134 = i132 & i133;
                int i135 = (((i132 ^ i133) | i134) << 1) - ((i132 | i133) & (~i134));
                int i136 = ~iIdentityHashCode;
                int i137 = ~i136;
                int i138 = ~((i137 ^ i136) | (i137 & i136));
                int i139 = ~length5;
                int i140 = (length5 & i139) | (i139 ^ length5);
                int i141 = ~i140;
                int i142 = (i140 | i141) & i141;
                int i143 = ((~i142) & i138) | ((~i138) & i142);
                int i144 = i142 & i138;
                int i145 = ((i144 & i143) | (i143 ^ i144)) * (-160);
                int i146 = ((i135 | i145) << 1) - (i145 ^ i135);
                int i147 = ~((i139 & i137) | ((~i139) & i136) | (i136 & i139));
                int i148 = ~i147;
                int i149 = ((i147 & i148) | (i148 ^ i147)) * 160;
                int i150 = i146 & i149;
                int i151 = ((i146 ^ i149) | i150) << 1;
                int i152 = -((i149 | i146) & (~i150));
                int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                System.identityHashCode(bdzVar7);
                System.identityHashCode(bdzVar7);
                while (i153 >= 0) {
                    int i154 = f54609d;
                    int i155 = i154 ^ 95;
                    int i156 = ((i154 & 95) | i155) << 1;
                    int i157 = -i155;
                    int i158 = ((i156 | i157) << 1) - (i156 ^ i157);
                    f54610e = i158 % 128;
                    int i159 = i158 % 2;
                    bdt bdtVar2 = bdzVar7.f54611a;
                    int i160 = iArr[i153];
                    iArr[i153] = ((Integer) bdt.setX(new Object[]{Integer.valueOf(i160), Integer.valueOf(iArr3[i153])}, -1259450993, 1259450997, i160)).intValue();
                    int i161 = (i153 ^ (-127)) + ((i153 & (-127)) << 1);
                    i153 = ((i161 | 126) << 1) - (i161 ^ 126);
                    int i162 = f54609d + 61;
                    f54610e = i162 % 128;
                    int i163 = i162 % 2;
                }
                int i164 = f54610e;
                int i165 = i164 ^ 95;
                int i166 = ((i164 & 95) | i165) << 1;
                int i167 = -i165;
                int i168 = (i166 & i167) + (i166 | i167);
                f54609d = i168 % 128;
                if (i168 % 2 == 0) {
                    return iArr;
                }
                throw null;
            case 19:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int i169 = f54609d;
                int i170 = ((i169 & 50) + (i169 | 50)) - 1;
                f54610e = i170 % 128;
                if (i170 % 2 == 0) {
                    ((Integer) setDividerPadding(new Object[]{iArr5}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
                    ((Integer) setDividerPadding(new Object[]{iArr6}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                int iIntValue3 = ((Integer) setDividerPadding(new Object[]{iArr5}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue();
                if (iIntValue3 == ((Integer) setDividerPadding(new Object[]{iArr6}, 9221819, -9221804, (int) System.currentTimeMillis())).intValue()) {
                    int i171 = f54610e;
                    int i172 = i171 & 83;
                    int i173 = ((i171 ^ 83) | i172) << 1;
                    int i174 = -((i171 | 83) & (~i172));
                    int i175 = (i173 & i174) + (i174 | i173);
                    f54609d = i175 % 128;
                    int i176 = i175 % 2;
                    while (true) {
                        if (i20 > iIntValue3) {
                            int i177 = f54610e;
                            int i178 = i177 & 47;
                            int i179 = (i177 | 47) & (~i178);
                            int i180 = i178 << 1;
                            int i181 = (i179 ^ i180) + ((i179 & i180) << 1);
                            f54609d = i181 % 128;
                            int i182 = i181 % 2;
                            objValueOf = Boolean.TRUE;
                            break;
                        } else {
                            int i183 = f54610e;
                            int i184 = i183 + 15;
                            f54609d = i184 % 128;
                            int i185 = i184 % 2;
                            if (iArr5[i20] != iArr6[i20]) {
                                int i186 = i183 & 21;
                                int i187 = -(-((i183 ^ 21) | i186));
                                int i188 = (i186 & i187) + (i186 | i187);
                                f54609d = i188 % 128;
                                int i189 = i188 % 2;
                                int i190 = i183 + 15;
                                f54609d = i190 % 128;
                                if (i190 % 2 != 0) {
                                    throw null;
                                }
                            } else {
                                int i191 = (((i20 ^ (-34)) | (i20 & (-34))) << 1) - (((~i20) & (-34)) | (i20 & 33));
                                int i192 = i191 & 35;
                                i20 = (i192 - (~(-(-((i191 ^ 35) | i192))))) - 1;
                                int i193 = i183 + 71;
                                f54609d = i193 % 128;
                                int i194 = i193 % 2;
                            }
                        }
                    }
                } else {
                    int i195 = f54610e;
                    int i196 = i195 & 21;
                    int i197 = (i195 ^ 21) | i196;
                    int i198 = ((i196 | i197) << 1) - (i197 ^ i196);
                    int i199 = i198 % 128;
                    f54609d = i199;
                    int i200 = i198 % 2;
                    int i201 = ((i199 | 19) << 1) - (i199 ^ 19);
                    f54610e = i201 % 128;
                    int i202 = i201 % 2;
                }
                objValueOf = Boolean.FALSE;
                break;
                break;
            default:
                bdz bdzVar8 = (bdz) objArr[0];
                bdz bdzVar9 = new bdz(bdzVar8.f54611a, (int[]) setDividerPadding(new Object[]{bdzVar8, bdzVar8.f54613c, ((bdz) objArr[1]).f54613c}, 1189952805, -1189952788, System.identityHashCode(bdzVar8)));
                int i203 = f54610e;
                int i204 = i203 & 83;
                int i205 = i204 + ((i203 ^ 83) | i204);
                f54609d = i205 % 128;
                int i206 = i205 % 2;
                return bdzVar9;
        }
        return objValueOf;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 732750201, -732750189, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -140987630, 140987644, System.identityHashCode(this))).intValue();
    }

    public final bdz setOnFocusChangeListener(bdz bdzVar) {
        return (bdz) setDividerPadding(new Object[]{this, bdzVar}, 1699950918, -1699950918, System.identityHashCode(this));
    }

    public final bdz setX(int i10) {
        return (bdz) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -20767297, 20767299, i10);
    }

    public final void setY(int i10) {
        setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1103206351, 1103206362, i10);
    }

    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 2043099963, -2043099954, System.identityHashCode(this));
    }

    public bdz(bdt bdtVar, byte[] bArr) {
        this.f54611a = bdtVar;
        int i10 = 8;
        int i11 = 1;
        while (((Integer) bdt.setX(new Object[]{bdtVar}, -2076948404, 2076948405, System.identityHashCode(bdtVar))).intValue() > i10) {
            int i12 = i11 & 1;
            i11 = ((i11 ^ 1) | i12) + i12;
            i10 = ((i10 ^ 9) + ((i10 & 9) << 1)) - 1;
        }
        if (bArr.length % i11 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f54613c = new int[bArr.length / i11];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f54613c;
            if (i13 >= iArr.length) {
                if (iArr.length != 1) {
                    int length = iArr.length;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i15 = -(-(length * (-489)));
                    int i16 = (-491) ^ i15;
                    int i17 = (i15 & (-491)) << 1;
                    int i18 = (i16 & i17) + (i17 | i16);
                    int i19 = ~length;
                    int i20 = -(~(-(-((((~0) & i19) | ((~iCurrentTimeMillis) & ((~iCurrentTimeMillis) | iCurrentTimeMillis))) * (-490)))));
                    int i21 = (((i18 | i20) << 1) - (i18 ^ i20)) - 1;
                    int i22 = (length | (~length)) & (~length);
                    int i23 = ~i22;
                    int i24 = ~((i22 & i23) | (i23 ^ i22));
                    int i25 = i19 ^ iCurrentTimeMillis;
                    int i26 = iCurrentTimeMillis & i19;
                    int i27 = ~((i26 & i25) | (i25 ^ i26));
                    int i28 = i24 & i27;
                    int i29 = (i21 - (~(-(~((((i24 | i27) & (~i28)) | i28) * 490))))) - 2;
                    int i30 = i29 << 1;
                    int i31 = -((~0) & i29);
                    if (iArr[(i30 ^ i31) + ((i30 & i31) << 1)] == 0) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                }
                setDividerPadding(new Object[]{this}, 94522969, -94522968, System.identityHashCode(this));
                return;
            }
            int i32 = 0;
            while (i32 < i10) {
                int[] iArr2 = this.f54613c;
                int i33 = iArr2[i13];
                int i34 = ((-1) << 1) - ((i14 + 2) ^ (-1));
                int i35 = (bArr[i14] & 255) << i32;
                int i36 = i33 & i35;
                iArr2[i13] = ((i35 ^ i33) | i36) & (~i36);
                int i37 = i32 & (-5);
                int i38 = -(-(i32 | (-5)));
                int i39 = (i37 & i38) + (i37 | i38);
                i32 = ((-1) << 1) - (((i39 ^ 14) + ((i39 & 14) << 1)) ^ (-1));
                i14 = i34;
            }
            bdt bdtVar2 = this.f54611a;
            int i40 = this.f54613c[i13];
            if (!((Boolean) bdt.setX(new Object[]{bdtVar2, Integer.valueOf(i40)}, 704366847, -704366847, i40)).booleanValue()) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            int i41 = ((-1) << 1) - ((((i13 | 94) << 1) - (i13 ^ 94)) ^ (-1));
            int i42 = i41 & (-92);
            i13 = (((i41 ^ (-92)) | i42) << 1) - ((i41 | (-92)) & (~i42));
        }
    }

    public final int setOnFocusChangeListener(int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1470802724, 1470802737, i10)).intValue();
    }

    public final int setX() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1803293290, -1803293286, System.identityHashCode(this))).intValue();
    }

    public final void setY(bdz bdzVar) {
        setDividerPadding(new Object[]{this, bdzVar}, 1560654763, -1560654747, System.identityHashCode(this));
    }

    public bdz(bdt bdtVar, int[] iArr) {
        this.f54611a = bdtVar;
        this.f54613c = (int[]) setDividerPadding(new Object[]{iArr}, 2017463696, -2017463686, (int) System.currentTimeMillis());
        setDividerPadding(new Object[]{this}, 94522969, -94522968, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, -449127289, 449127295, System.identityHashCode(this));
    }

    public bdz(bdt bdtVar, int i10) {
        this.f54611a = bdtVar;
        this.f54612b = i10;
        int i11 = (i10 & (-2)) | ((~i10) & 1);
        int i12 = (i10 & 1) << 1;
        int[] iArr = new int[(i11 ^ i12) + ((i11 & i12) << 1)];
        this.f54613c = iArr;
        iArr[i10] = 1;
    }

    public final int setDividerPadding(int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 178729546, -178729541, i10)).intValue();
    }
}
