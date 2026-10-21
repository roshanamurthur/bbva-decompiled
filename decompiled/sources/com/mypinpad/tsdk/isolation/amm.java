package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class amm extends FilterInputStream {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53218w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53219x0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f53220p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final akh f53221q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f53222r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f53223s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f53224t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f53225u0;
    public boolean v0;

    public amm(InputStream inputStream, akh akhVar) {
        super(inputStream);
        this.f53221q0 = akhVar;
        this.f53220p0 = new byte[2048];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ef  */
    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        amm ammVar = (amm) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i11 = f53219x0;
        int i12 = i11 + 121;
        int i13 = i12 % 128;
        f53218w0 = i13;
        int i14 = i12 % 2;
        if (zBooleanValue) {
            int i15 = ~i13;
            int i16 = ((((i13 ^ 77) | (i13 & 77)) << 1) - (~(-((i13 & (-78)) | (77 & i15))))) - 1;
            f53219x0 = i16 % 128;
            if (i16 % 2 == 0) {
                akh akhVar = ammVar.f53221q0;
                throw null;
            }
            akh akhVar2 = ammVar.f53221q0;
            if (akhVar2 != null) {
                int i17 = (i13 & (-72)) | (i15 & 71);
                int i18 = (71 & i13) << 1;
                int i19 = (i17 & i18) + (i17 | i18);
                f53219x0 = i19 % 128;
                int i20 = i19 % 2;
                iIntValue = ((Integer) akh.setY(new Object[]{akhVar2, Integer.valueOf(iIntValue)}, 428416267, -428416262, iIntValue)).intValue();
                int i21 = f53218w0;
                int i22 = i21 & 105;
                int i23 = -(-((i21 ^ 105) | i22));
                i10 = ((i22 | i23) << 1) - (i23 ^ i22);
            } else {
                int i24 = i13 & 47;
                int i25 = (i13 ^ 47) | i24;
                i10 = (i24 ^ i25) + ((i24 & i25) << 1);
            }
            f53219x0 = i10 % 128;
            int i26 = i10 % 2;
        } else {
            akh akhVar3 = ammVar.f53221q0;
            if (akhVar3 != null) {
                int i27 = i11 + 39;
                f53218w0 = i27 % 128;
                if (i27 % 2 != 0) {
                    ((Integer) akh.setY(new Object[]{akhVar3, Integer.valueOf(iIntValue)}, -1498406433, 1498406437, iIntValue)).intValue();
                    throw null;
                }
                iIntValue = ((Integer) akh.setY(new Object[]{akhVar3, Integer.valueOf(iIntValue)}, -1498406433, 1498406437, iIntValue)).intValue();
            } else {
                int i28 = (i13 ^ 69) + ((i13 & 69) << 1);
                f53219x0 = i28 % 128;
                int i29 = i28 % 2;
            }
        }
        byte[] bArr = ammVar.f53222r0;
        if (bArr != null) {
            int i30 = f53218w0;
            int i31 = i30 & 21;
            int i32 = (i30 | 21) & (~i31);
            int i33 = -(-(i31 << 1));
            int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
            f53219x0 = i34 % 128;
            int i35 = i34 % 2;
            if (bArr.length < iIntValue) {
                ammVar.f53222r0 = new byte[iIntValue];
                int i36 = f53218w0;
                int i37 = i36 ^ 55;
                int i38 = (((i36 & 55) | i37) << 1) - i37;
                f53219x0 = i38 % 128;
                int i39 = i38 % 2;
            }
        } else {
            ammVar.f53222r0 = new byte[iIntValue];
            int i310 = f53218w0;
            int i311 = i310 ^ 55;
            int i312 = (((i310 & 55) | i311) << 1) - i311;
            f53219x0 = i312 % 128;
            int i313 = i312 % 2;
        }
        int i40 = f53218w0;
        int i41 = i40 & 95;
        int i42 = i41 + ((i40 ^ 95) | i41);
        f53219x0 = i42 % 128;
        int i43 = i42 % 2;
    }

    public static /* synthetic */ Integer b(Object[] objArr) throws IOException {
        amm ammVar = (amm) objArr[0];
        int i10 = f53218w0;
        int i11 = i10 & 119;
        int i12 = i11 + ((i10 ^ 119) | i11);
        f53219x0 = i12 % 128;
        int i13 = i12 % 2;
        if (!(!ammVar.v0)) {
            int i14 = i10 + 87;
            f53219x0 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i15 = (((i10 | 116) << 1) - (i10 ^ 116)) - 1;
            f53219x0 = i15 % 128;
            int i16 = i15 % 2;
            return -1;
        }
        ammVar.f53224t0 = 0;
        ammVar.f53225u0 = 0;
        int i17 = i10 + 95;
        while (true) {
            f53219x0 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ammVar.f53225u0;
            if (i19 != 0) {
                int i20 = f53219x0 + 63;
                f53218w0 = i20 % 128;
                int i21 = i20 % 2;
                return Integer.valueOf(i19);
            }
            int i22 = f53219x0;
            int i23 = i22 & 9;
            int i24 = -(-((i22 ^ 9) | i23));
            int i25 = (i23 & i24) + (i24 | i23);
            f53218w0 = i25 % 128;
            if (i25 % 2 != 0) {
                ((FilterInputStream) ammVar).in.read(ammVar.f53220p0);
                throw null;
            }
            int i26 = ((FilterInputStream) ammVar).in.read(ammVar.f53220p0);
            if (i26 == -1) {
                setCompoundDrawableTintBlendMode(new Object[]{ammVar}, -850517411, 850517416, System.identityHashCode(ammVar));
                int i27 = ammVar.f53225u0;
                if (i27 == 0) {
                    int i28 = f53219x0;
                    int i29 = i28 & 65;
                    int i30 = -(-((i28 ^ 65) | i29));
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    f53218w0 = i31 % 128;
                    if (i31 % 2 != 0) {
                        int i32 = 75 / 0;
                    }
                    return -1;
                }
                int i33 = f53218w0;
                int i34 = i33 | 121;
                int i35 = i34 << 1;
                int i36 = -((~(i33 & 121)) & i34);
                int i37 = (i35 & i36) + (i36 | i35);
                f53219x0 = i37 % 128;
                if (i37 % 2 != 0) {
                    return Integer.valueOf(i27);
                }
                int i38 = 57 / 0;
                return Integer.valueOf(i27);
            }
            try {
                setCompoundDrawableTintBlendMode(new Object[]{ammVar, Integer.valueOf(i26), Boolean.FALSE}, -444434638, 444434639, i26);
                akh akhVar = ammVar.f53221q0;
                if (akhVar == null) {
                    throw new NullPointerException();
                }
                int i39 = f53219x0;
                int i40 = i39 & 5;
                int i41 = (i40 - (~((i39 ^ 5) | i40))) - 1;
                f53218w0 = i41 % 128;
                int i42 = i41 % 2;
                ammVar.f53225u0 = ((Integer) akh.setY(new Object[]{akhVar, ammVar.f53220p0, 0, Integer.valueOf(i26), ammVar.f53222r0}, 1000438278, -1000438278, 0)).intValue();
                int i43 = f53218w0;
                int i44 = i43 ^ 5;
                i17 = ((((i43 & 5) | i44) << 1) - (~(-i44))) - 1;
            } catch (Exception e5) {
                throw new amn("Error processing stream ", e5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8.f53221q0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void c(java.lang.Object[] r8) throws java.io.IOException {
        /*
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r8 = r8[r0]
            com.mypinpad.tsdk.i.amm r8 = (com.mypinpad.tsdk.isolation.amm) r8
            int r2 = com.mypinpad.tsdk.isolation.amm.f53218w0
            r3 = r2 & 53
            r2 = r2 ^ 53
            r2 = r2 | r3
            int r2 = -r2
            int r2 = -r2
            r4 = r3 & r2
            r2 = r2 | r3
            int r4 = r4 + r2
            int r2 = r4 % 128
            com.mypinpad.tsdk.isolation.amm.f53219x0 = r2
            r2 = 2
            int r4 = r4 % r2
            r3 = 444434639(0x1a7d88cf, float:5.2429687E-23)
            r5 = -444434638(0xffffffffe5827732, float:-7.70133E22)
            r6 = 3
            r7 = 1
            if (r4 != 0) goto L3e
            r8.v0 = r0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r0] = r8     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r7] = r1     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r2] = r1     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            setCompoundDrawableTintBlendMode(r4, r5, r3, r0)     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            com.mypinpad.tsdk.i.akh r1 = r8.f53221q0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            if (r1 == 0) goto L7b
            goto L51
        L3a:
            r8 = move-exception
            goto L94
        L3c:
            r8 = move-exception
            goto La4
        L3e:
            r8.v0 = r7     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r0] = r8     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r7] = r1     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r2] = r1     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            setCompoundDrawableTintBlendMode(r4, r5, r3, r0)     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            com.mypinpad.tsdk.i.akh r1 = r8.f53221q0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            if (r1 == 0) goto L7b
        L51:
            com.mypinpad.tsdk.i.akh r1 = r8.f53221q0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            byte[] r3 = r8.f53222r0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r0] = r1     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r4[r7] = r3     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            int r0 = java.lang.System.identityHashCode(r1)     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r1 = 284365035(0x10f310eb, float:9.5872666E-29)
            r3 = -284365032(0xffffffffef0cef18, float:-4.361695E28)
            java.lang.Object r0 = com.mypinpad.tsdk.isolation.akh.setY(r4, r1, r3, r0)     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r8.f53225u0 = r0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            int r8 = com.mypinpad.tsdk.isolation.amm.f53219x0
            int r8 = r8 + 7
            int r0 = r8 % 128
            com.mypinpad.tsdk.isolation.amm.f53218w0 = r0
            int r8 = r8 % r2
            return
        L7b:
            r8.getClass()     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            r8.f53225u0 = r0     // Catch: java.lang.Exception -> L3a com.mypinpad.tsdk.isolation.akx -> L3c
            int r8 = com.mypinpad.tsdk.isolation.amm.f53218w0
            r1 = r8 ^ 111(0x6f, float:1.56E-43)
            r8 = r8 & 111(0x6f, float:1.56E-43)
            r8 = r8 | r1
            int r8 = r8 << r7
            int r8 = r8 - r1
            int r1 = r8 % 128
            com.mypinpad.tsdk.isolation.amm.f53219x0 = r1
            int r8 = r8 % r2
            if (r8 != 0) goto L93
            r8 = 95
            int r8 = r8 / r0
        L93:
            return
        L94:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "Error finalising cipher "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        La4:
            com.mypinpad.tsdk.i.amk r0 = new com.mypinpad.tsdk.i.amk
            java.lang.String r1 = "Error finalising cipher"
            r0.<init>(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.amm.c(java.lang.Object[]):void");
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        amm ammVar = (amm) objArr[0];
        int i10 = f53218w0;
        int i11 = (i10 & 105) + (i10 | 105);
        int i12 = i11 % 128;
        f53219x0 = i12;
        if (i11 % 2 == 0) {
            int i13 = ammVar.f53224t0;
            throw null;
        }
        if (ammVar.f53224t0 >= ammVar.f53225u0) {
            int i14 = i12 ^ 29;
            int i15 = ((((i12 & 29) | i14) << 1) - (~(-i14))) - 1;
            f53218w0 = i15 % 128;
            int i16 = i15 % 2;
            if (((Integer) setCompoundDrawableTintBlendMode(new Object[]{ammVar}, 1792602215, -1792602208, System.identityHashCode(ammVar))).intValue() < 0) {
                int i17 = f53218w0;
                int i18 = ((i17 | 113) << 1) - (i17 ^ 113);
                f53219x0 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 17 / 0;
                }
                return -1;
            }
        }
        byte[] bArr = ammVar.f53222r0;
        int i20 = ammVar.f53224t0;
        int i21 = i20 ^ 1;
        int i22 = ((i20 & 1) | i21) << 1;
        int i23 = -i21;
        ammVar.f53224t0 = (i22 & i23) + (i23 | i22);
        int i24 = bArr[i20] & 255;
        int i25 = f53218w0;
        int i26 = i25 & 1;
        int i27 = -(-((i25 ^ 1) | i26));
        int i28 = (i26 & i27) + (i27 | i26);
        f53219x0 = i28 % 128;
        int i29 = i28 % 2;
        return Integer.valueOf(i24);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object objValueOf;
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        switch ((((~(i10 | i12)) | (~(i11 | i15))) * 950) + (((~(i15 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i14 | i15)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949))) {
            case 1:
                a(objArr);
                return null;
            case 2:
                return d(objArr);
            case 3:
                ((amm) objArr[0]).getClass();
                throw new IOException("cipher must implement SkippingCipher to be used with reset()");
            case 4:
                amm ammVar = (amm) objArr[0];
                int i16 = f53219x0;
                int i17 = i16 & 35;
                int i18 = i17 + ((i16 ^ 35) | i17);
                f53218w0 = i18 % 128;
                int i19 = i18 % 2;
                ammVar.getClass();
                int i20 = f53219x0;
                int i21 = i20 | 45;
                int i22 = i21 << 1;
                int i23 = -((~(i20 & 45)) & i21);
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f53218w0 = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.FALSE;
            case 5:
                c(objArr);
                return null;
            case 6:
                amm ammVar2 = (amm) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i26 = f53218w0;
                int i27 = i26 & 111;
                int i28 = -(-((i26 ^ 111) | i27));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                int i30 = i29 % 128;
                f53219x0 = i30;
                if (i29 % 2 != 0 ? jLongValue <= 0 : jLongValue <= 0) {
                    int i31 = i30 & 77;
                    int i32 = i31 + ((i30 ^ 77) | i31);
                    f53218w0 = i32 % 128;
                    objValueOf = Long.valueOf(i32 % 2 != 0 ? 1L : 0L);
                } else {
                    ammVar2.getClass();
                    int iMin = (int) Math.min(jLongValue, ammVar2.available());
                    int i33 = ammVar2.f53224t0;
                    ammVar2.f53224t0 = (((~iMin) & i33) | ((~i33) & iMin)) + ((i33 & iMin) << 1);
                    int i34 = f53218w0;
                    int i35 = i34 & 101;
                    int i36 = (((i34 | 101) & (~i35)) - (~(-(-(i35 << 1))))) - 1;
                    f53219x0 = i36 % 128;
                    int i37 = i36 % 2;
                    objValueOf = Long.valueOf(iMin);
                }
                break;
            case 7:
                return b(objArr);
            case 8:
                amm ammVar3 = (amm) objArr[0];
                int i38 = f53218w0;
                int i39 = (i38 ^ 35) + ((i38 & 35) << 1);
                f53219x0 = i39 % 128;
                int i40 = i39 % 2;
                try {
                    ((FilterInputStream) ammVar3).in.close();
                    if (!ammVar3.v0) {
                        int i41 = f53218w0;
                        int i42 = (i41 & (-126)) | ((~i41) & 125);
                        int i43 = (i41 & 125) << 1;
                        int i44 = (i42 & i43) + (i43 | i42);
                        f53219x0 = i44 % 128;
                        Object[] objArr2 = new Object[1];
                        if (i44 % 2 == 0) {
                            objArr2[0] = ammVar3;
                            setCompoundDrawableTintBlendMode(objArr2, -850517411, 850517416, System.identityHashCode(ammVar3));
                            int i45 = 14 / 0;
                        } else {
                            objArr2[0] = ammVar3;
                            setCompoundDrawableTintBlendMode(objArr2, -850517411, 850517416, System.identityHashCode(ammVar3));
                        }
                    }
                    ammVar3.f53224t0 = 0;
                    ammVar3.f53225u0 = 0;
                    byte[] bArr = ammVar3.f53223s0;
                    if (bArr != null) {
                        int i46 = f53219x0;
                        int i47 = i46 & 79;
                        int i48 = i46 | 79;
                        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                        f53218w0 = i49 % 128;
                        int i50 = i49 % 2;
                        bek.setOnFocusChangeListener(new Object[]{bArr}, -949833373, 949833375, (int) System.currentTimeMillis());
                        ammVar3.f53223s0 = null;
                        int i51 = f53219x0;
                        int i52 = (i51 ^ 51) + ((i51 & 51) << 1);
                        f53218w0 = i52 % 128;
                        int i53 = i52 % 2;
                    }
                    byte[] bArr2 = ammVar3.f53222r0;
                    if (bArr2 != null) {
                        int i54 = f53218w0;
                        int i55 = ((i54 ^ 56) + ((i54 & 56) << 1)) - 1;
                        f53219x0 = i55 % 128;
                        Object[] objArr3 = new Object[1];
                        if (i55 % 2 == 0) {
                            objArr3[0] = bArr2;
                            bek.setOnFocusChangeListener(objArr3, -949833373, 949833375, (int) System.currentTimeMillis());
                            ammVar3.f53222r0 = null;
                            int i56 = 75 / 0;
                        } else {
                            objArr3[0] = bArr2;
                            bek.setOnFocusChangeListener(objArr3, -949833373, 949833375, (int) System.currentTimeMillis());
                            ammVar3.f53222r0 = null;
                        }
                        int i57 = f53219x0 + 103;
                        f53218w0 = i57 % 128;
                        int i58 = i57 % 2;
                    }
                    bek.setOnFocusChangeListener(new Object[]{ammVar3.f53220p0}, -949833373, 949833375, (int) System.currentTimeMillis());
                    int i59 = f53218w0;
                    int i60 = (i59 | 49) << 1;
                    int i61 = -(((~i59) & 49) | (i59 & (-50)));
                    int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                    f53219x0 = i62 % 128;
                    int i63 = i62 % 2;
                    return null;
                } catch (Throwable th2) {
                    if (!ammVar3.v0) {
                        setCompoundDrawableTintBlendMode(new Object[]{ammVar3}, -850517411, 850517416, System.identityHashCode(ammVar3));
                        int i64 = f53219x0;
                        int i65 = (i64 | 119) << 1;
                        int i66 = -(((~i64) & 119) | (i64 & (-120)));
                        int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                        f53218w0 = i67 % 128;
                        int i68 = i67 % 2;
                    }
                    throw th2;
                }
            case 9:
                amm ammVar4 = (amm) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i69 = f53219x0;
                int i70 = i69 | 21;
                int i71 = ((i70 << 1) - (~(-((~(i69 & 21)) & i70)))) - 1;
                f53218w0 = i71 % 128;
                int i72 = i71 % 2;
                int i73 = ammVar4.read(bArr3, 0, bArr3.length);
                int i74 = f53219x0 + 29;
                f53218w0 = i74 % 128;
                int i75 = i74 % 2;
                return Integer.valueOf(i73);
            case 10:
                amm ammVar5 = (amm) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i76 = f53219x0;
                int i77 = i76 & 111;
                int i78 = (i76 | 111) & (~i77);
                int i79 = i77 << 1;
                int i80 = (i78 & i79) + (i78 | i79);
                f53218w0 = i80 % 128;
                int i81 = i80 % 2;
                ((FilterInputStream) ammVar5).in.mark(iIntValue);
                byte[] bArr4 = ammVar5.f53222r0;
                if (bArr4 == null) {
                    return null;
                }
                int i82 = f53218w0;
                int i83 = i82 & 9;
                int i84 = (i83 - (~((i82 ^ 9) | i83))) - 1;
                f53219x0 = i84 % 128;
                int i85 = i84 % 2;
                byte[] bArr5 = new byte[bArr4.length];
                if (i85 == 0) {
                    ammVar5.f53223s0 = bArr5;
                    System.arraycopy(bArr4, 1, bArr5, 0, bArr4.length);
                    return null;
                }
                ammVar5.f53223s0 = bArr5;
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                return null;
            case 11:
                amm ammVar6 = (amm) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i86 = f53218w0;
                int i87 = i86 & 35;
                int i88 = i86 | 35;
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                f53219x0 = i89 % 128;
                if (i89 % 2 == 0) {
                    int i90 = ammVar6.f53224t0;
                    throw null;
                }
                if (ammVar6.f53224t0 < ammVar6.f53225u0 || ((Integer) setCompoundDrawableTintBlendMode(new Object[]{ammVar6}, 1792602215, -1792602208, System.identityHashCode(ammVar6))).intValue() >= 0) {
                    int iMin2 = Math.min(iIntValue3, ammVar6.available());
                    System.arraycopy(ammVar6.f53222r0, ammVar6.f53224t0, bArr6, iIntValue2, iMin2);
                    int i91 = ammVar6.f53224t0;
                    int i92 = iMin2 * 141;
                    int i93 = i91 * (-279);
                    int i94 = (((i92 ^ i93) | (i92 & i93)) << 1) - (((~i92) & i93) | ((~i93) & i92));
                    int i95 = ~iIntValue2;
                    int i96 = ~i91;
                    int i97 = (i91 & i95) | (iIntValue2 & i96);
                    int i98 = i91 & iIntValue2;
                    int i99 = -(-(((i97 & i98) | (i97 ^ i98)) * 140));
                    int i100 = i94 & i99;
                    int i101 = i100 + ((i99 ^ i94) | i100);
                    int i102 = ~iMin2;
                    int i103 = ~((i102 ^ i91) | (i102 & i91));
                    int i104 = (i95 | iIntValue2) & i95;
                    int i105 = i104 & i91;
                    int i106 = (i104 | i91) & (~i105);
                    int i107 = -(-((i103 | (~((i106 & i105) | (i106 ^ i105)))) * (-280)));
                    int i108 = ((~i107) & i101) | ((~i101) & i107);
                    int i109 = (i107 & i101) << 1;
                    int i110 = (i108 & i109) + (i109 | i108);
                    int i111 = (i96 & i102) | ((~i96) & iMin2);
                    int i112 = i96 & iMin2;
                    int i113 = ~((i111 & i112) | (i111 ^ i112));
                    int i114 = i95 ^ iMin2;
                    int i115 = i95 & iMin2;
                    int i116 = (i114 & i115) | (i114 ^ i115);
                    int i117 = ~i116;
                    int i118 = (i116 | i117) & i117;
                    int i119 = i113 & i118;
                    int i120 = (i113 | i118) & (~i119);
                    int i121 = (i120 & i119) | (i120 ^ i119);
                    int i122 = i102 & (i102 | iMin2);
                    int i123 = i122 & i91;
                    int i124 = (i91 | i122) & (~i123);
                    int i125 = (i124 & i123) | (i124 ^ i123);
                    int i126 = (i95 & i125) | ((~i125) & iIntValue2);
                    int i127 = i125 & iIntValue2;
                    int i128 = ~((i127 & i126) | (i126 ^ i127));
                    int i129 = ((i128 & i121) | ((~i128) & i121) | ((~i121) & i128)) * 140;
                    ammVar6.f53224t0 = (i110 & i129) + (i129 | i110);
                    int i130 = f53219x0;
                    int i131 = i130 & 19;
                    int i132 = (i130 | 19) & (~i131);
                    int i133 = i131 << 1;
                    int i134 = (i132 ^ i133) + ((i132 & i133) << 1);
                    f53218w0 = i134 % 128;
                    int i135 = i134 % 2;
                    objValueOf = Integer.valueOf(iMin2);
                } else {
                    int i136 = f53218w0 + 27;
                    f53219x0 = i136 % 128;
                    if (i136 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = -1;
                }
                break;
                break;
            default:
                amm ammVar7 = (amm) objArr[0];
                int i137 = f53219x0;
                int i138 = ((i137 ^ 54) + ((i137 & 54) << 1)) - 1;
                int i139 = i138 % 128;
                f53218w0 = i139;
                int i140 = i138 % 2;
                int i141 = ammVar7.f53225u0;
                int i142 = ammVar7.f53224t0;
                if (i140 != 0) {
                    i13 = i141 >>> i142;
                } else {
                    int i143 = -i142;
                    int i144 = (i141 | i143) << 1;
                    int i145 = -((i143 & (~i141)) | ((~i143) & i141));
                    i13 = (i145 | i144) + (i144 & i145);
                }
                int i146 = i139 & 61;
                int i147 = i146 + ((i139 ^ 61) | i146);
                f53219x0 = i147 % 128;
                if (i147 % 2 != 0) {
                    return Integer.valueOf(i13);
                }
                throw null;
        }
        return objValueOf;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -344627716, 344627716, System.identityHashCode(this))).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -928305798, 928305806, System.identityHashCode(this));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1904236001, -1904235991, i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1006302489, -1006302485, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 1401968461, -1401968450, i10)).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -716504465, 716504468, System.identityHashCode(this));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, 362630202, -362630196, System.identityHashCode(this))).longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -1848454738, 1848454747, System.identityHashCode(this))).intValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -731682132, 731682134, System.identityHashCode(this))).intValue();
    }
}
