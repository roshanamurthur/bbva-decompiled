package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class adp extends ady {
    public static final a v0 = new a(adp.class, 2);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52489w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52490x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f52491t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f52492u0;

    public static class a extends j0 {
        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            return (adp) adp.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2))}, -712381831, 712381832, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f52489w0;
        int i11 = i10 ^ 69;
        int i12 = (((i10 & 69) | i11) << 1) - i11;
        f52490x0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public adp(byte[] bArr) {
        if (((Boolean) setOnFocusChangeListener(new Object[]{bArr}, 1574757708, -1574757697, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f52491t0 = bArr;
        this.f52492u0 = ((Integer) setOnFocusChangeListener(new Object[]{bArr}, 1273588141, -1273588125, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:14:0x0085  */
    /* JADX WARN: Code duplicated, block: B:16:0x0099  */
    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:20:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public static /* synthetic */ Boolean f(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        adp adpVar = (adp) objArr[0];
        BigInteger bigInteger = (BigInteger) objArr[1];
        int i13 = f52490x0;
        int i14 = (i13 ^ 124) + ((i13 & 124) << 1);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        int i16 = i15 % 128;
        f52489w0 = i16;
        if (i15 % 2 != 0) {
            int i17 = 37 / 0;
            if (bigInteger != null) {
                int i18 = i16 & 101;
                i10 = ((((i16 ^ 101) | i18) << 1) - (~(-((i16 | 101) & (~i18))))) - 1;
                f52490x0 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i19 = adpVar.f52492u0;
                    ((Integer) setOnFocusChangeListener(new Object[]{adpVar.f52491t0, Integer.valueOf(i19), -1}, 2139027336, -2139027323, i19)).intValue();
                    bigInteger.intValue();
                    throw null;
                }
                i11 = adpVar.f52492u0;
                if (((Integer) setOnFocusChangeListener(new Object[]{adpVar.f52491t0, Integer.valueOf(i11), -1}, 2139027336, -2139027323, i11)).intValue() == bigInteger.intValue()) {
                    int i20 = f52489w0;
                    int i21 = (i20 & (-42)) | ((~i20) & 41);
                    int i22 = (i20 & 41) << 1;
                    i12 = (i21 ^ i22) + ((i22 & i21) << 1);
                    f52490x0 = i12 % 128;
                    if (i12 % 2 != 0) {
                        ((BigInteger) setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar))).equals(bigInteger);
                        throw null;
                    }
                    if (((BigInteger) setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar))).equals(bigInteger)) {
                        int i23 = f52490x0;
                        int i24 = ((i23 ^ 120) + ((i23 & 120) << 1)) - 1;
                        f52489w0 = i24 % 128;
                        int i25 = i24 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
        } else if (bigInteger != null) {
            int i110 = i16 & 101;
            i10 = ((((i16 ^ 101) | i110) << 1) - (~(-((i16 | 101) & (~i110))))) - 1;
            f52490x0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i111 = adpVar.f52492u0;
                ((Integer) setOnFocusChangeListener(new Object[]{adpVar.f52491t0, Integer.valueOf(i111), -1}, 2139027336, -2139027323, i111)).intValue();
                bigInteger.intValue();
                throw null;
            }
            i11 = adpVar.f52492u0;
            if (((Integer) setOnFocusChangeListener(new Object[]{adpVar.f52491t0, Integer.valueOf(i11), -1}, 2139027336, -2139027323, i11)).intValue() == bigInteger.intValue()) {
                int i26 = f52489w0;
                int i27 = (i26 & (-42)) | ((~i26) & 41);
                int i28 = (i26 & 41) << 1;
                i12 = (i27 ^ i28) + ((i28 & i27) << 1);
                f52490x0 = i12 % 128;
                if (i12 % 2 != 0) {
                    ((BigInteger) setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar))).equals(bigInteger);
                    throw null;
                }
                if (((BigInteger) setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar))).equals(bigInteger)) {
                    int i29 = f52490x0;
                    int i210 = ((i29 ^ 120) + ((i29 & 120) << 1)) - 1;
                    f52489w0 = i210 % 128;
                    int i211 = i210 % 2;
                    return Boolean.TRUE;
                }
            }
        }
        int i30 = f52489w0;
        int i31 = i30 & 71;
        int i32 = i31 + ((i30 ^ 71) | i31);
        f52490x0 = i32 % 128;
        if (i32 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f52489w0;
        int i11 = (-2) - (((i10 & 12) + (i10 | 12)) ^ (-1));
        f52490x0 = i11 % 128;
        int i12 = i11 % 2;
        int length = bArr.length;
        int i13 = length * (-445);
        int i14 = 1780 & i13;
        int i15 = -(-((i13 ^ 1780) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = ~length;
        int i18 = (i17 | length) & i17;
        int i19 = ~((3 ^ i18) | (3 & i18));
        int i20 = ~iIntValue;
        int i21 = i17 & i20;
        int i22 = ~(((i20 | i17) & (~i21)) | i21);
        int i23 = i19 ^ i22;
        int i24 = i19 & i22;
        int i25 = ((i24 & i23) | (i23 ^ i24)) * 446;
        int i26 = (i16 & i25) + (i16 | i25);
        int i27 = ~((3 ^ length) | (3 & length));
        int i28 = i18 | (-4);
        int i29 = i28 & iIntValue;
        int i30 = (i28 | iIntValue) & (~i29);
        int i31 = ~((i30 & i29) | (i30 ^ i29));
        int i32 = i27 & i31;
        int i33 = -(-((((i27 | i31) & (~i32)) | i32) * 446));
        int i34 = (i26 & i33) + (i33 | i26);
        int i35 = 3 ^ i17;
        int i36 = i17 & 3;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = ~i37;
        int iMax = Math.max(iIntValue, (i34 - (~(((i37 | i38) & i38) * 446))) - 1);
        int i39 = iIntValue2 & bArr[iMax];
        int i40 = f52489w0;
        int i41 = (((i40 ^ 29) | (i40 & 29)) << 1) - (((~i40) & 29) | (i40 & (-30)));
        f52490x0 = i41 % 128;
        int i42 = i41 % 2;
        while (true) {
            iMax++;
            if (iMax >= length) {
                break;
            }
            int i43 = f52489w0;
            int i44 = (i43 & 13) + (i43 | 13);
            int i45 = i44 % 128;
            f52490x0 = i45;
            int i46 = i44 % 2;
            int i47 = i39 << 8;
            int i48 = bArr[iMax] & 255;
            int i49 = i47 ^ i48;
            int i50 = i47 & i48;
            i39 = (i50 & i49) | (i49 ^ i50);
            int i51 = i45 + 73;
            f52489w0 = i51 % 128;
            int i52 = i51 % 2;
        }
        int i53 = f52489w0 + 35;
        f52490x0 = i53 % 128;
        if (i53 % 2 != 0) {
            return Integer.valueOf(i39);
        }
        int i54 = 91 / 0;
        return Integer.valueOf(i39);
    }

    public static /* synthetic */ Boolean h(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f52489w0;
        int i11 = ((i10 | 115) << 1) - (i10 ^ 115);
        int i12 = i11 % 128;
        f52490x0 = i12;
        int i13 = i11 % 2;
        int length = bArr.length;
        if (length == 0) {
            int i14 = i12 + 77;
            f52489w0 = i14 % 128;
            int i15 = i14 % 2;
            return Boolean.TRUE;
        }
        if (length == 1) {
            int i16 = (-2) - (((i12 ^ 100) + ((i12 & 100) << 1)) ^ (-1));
            f52489w0 = i16 % 128;
            int i17 = i16 % 2;
            return Boolean.FALSE;
        }
        if (bArr[0] == (bArr[1] >> 7)) {
            int i18 = i12 & 3;
            int i19 = ((i12 | 3) & (~i18)) + (i18 << 1);
            f52489w0 = i19 % 128;
            int i20 = i19 % 2;
            if (!((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.asn1.allow_unsafe_integer"}, 1196176667, -1196176666, (int) System.currentTimeMillis())).booleanValue()) {
                int i21 = f52489w0;
                int i22 = i21 & 117;
                int i23 = ((~i22) & (i21 | 117)) + (i22 << 1);
                f52490x0 = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ((i21 | 13) << 1) - (i21 ^ 13);
                f52490x0 = i25 % 128;
                if (i25 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i26 = 33 / 0;
                return Boolean.TRUE;
            }
        }
        int i27 = f52489w0 + 103;
        f52490x0 = i27 % 128;
        int i28 = i27 % 2;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((r6 instanceof com.mypinpad.tsdk.isolation.adp) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r2 = ((r3 ^ 56) + ((r3 & 56) << 1)) - 1;
        com.mypinpad.tsdk.isolation.adp.f52489w0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.adp.v0;
        r6 = (com.mypinpad.tsdk.isolation.adp) com.mypinpad.tsdk.isolation.j0.c(-1221427223, 1221427224, java.lang.System.identityHashCode(r2), new java.lang.Object[]{r2, (byte[]) r6});
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.adp.f52490x0;
        r2 = r0 ^ 107;
        r0 = -(-((r0 & 107) << 1));
        r1 = ((r2 | r0) << 1) - (r0 ^ r2);
        com.mypinpad.tsdk.isolation.adp.f52489w0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r1 = new java.lang.StringBuilder("encoding error in getInstance: ");
        r1.append(r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        throw new java.lang.IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(r6, "illegal object in getInstance: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((r6 instanceof com.mypinpad.tsdk.isolation.adp) != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.adp i(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            int r1 = com.mypinpad.tsdk.isolation.adp.f52490x0
            r2 = r1 & 109(0x6d, float:1.53E-43)
            r1 = r1 | 109(0x6d, float:1.53E-43)
            int r1 = ~r1
            int r2 = r2 - r1
            r1 = 1
            int r2 = r2 - r1
            int r3 = r2 % 128
            com.mypinpad.tsdk.isolation.adp.f52489w0 = r3
            r4 = 2
            int r2 = r2 % r4
            if (r2 != 0) goto Lab
            if (r6 == 0) goto L95
            r2 = r3 | 89
            int r2 = r2 << r1
            r3 = r3 ^ 89
            int r2 = r2 - r3
            int r3 = r2 % 128
            com.mypinpad.tsdk.isolation.adp.f52490x0 = r3
            int r2 = r2 % r4
            if (r2 != 0) goto L2c
            boolean r2 = r6 instanceof com.mypinpad.tsdk.isolation.adp
            r5 = 64
            int r5 = r5 / r0
            if (r2 == r1) goto L95
            goto L31
        L2c:
            boolean r2 = r6 instanceof com.mypinpad.tsdk.isolation.adp
            if (r2 == 0) goto L31
            goto L95
        L31:
            boolean r2 = r6 instanceof byte[]
            if (r2 == 0) goto L89
            r2 = r3 ^ 56
            r3 = r3 & 56
            int r3 = r3 << r1
            int r2 = r2 + r3
            int r2 = r2 - r1
            int r3 = r2 % 128
            com.mypinpad.tsdk.isolation.adp.f52489w0 = r3
            int r2 = r2 % r4
            com.mypinpad.tsdk.i.adp$a r2 = com.mypinpad.tsdk.isolation.adp.v0     // Catch: java.lang.Exception -> L70
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> L70
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L70
            r3[r0] = r2     // Catch: java.lang.Exception -> L70
            r3[r1] = r6     // Catch: java.lang.Exception -> L70
            int r6 = java.lang.System.identityHashCode(r2)     // Catch: java.lang.Exception -> L70
            r0 = -1221427223(0xffffffffb7327fe9, float:-1.0639408E-5)
            r2 = 1221427224(0x48cd8018, float:420864.75)
            com.mypinpad.tsdk.i.ady r6 = com.mypinpad.tsdk.isolation.j0.c(r0, r2, r6, r3)     // Catch: java.lang.Exception -> L70
            com.mypinpad.tsdk.i.adp r6 = (com.mypinpad.tsdk.isolation.adp) r6     // Catch: java.lang.Exception -> L70
            int r0 = com.mypinpad.tsdk.isolation.adp.f52490x0
            r2 = r0 ^ 107(0x6b, float:1.5E-43)
            r0 = r0 & 107(0x6b, float:1.5E-43)
            int r0 = r0 << r1
            int r0 = -r0
            int r0 = -r0
            r3 = r2 | r0
            int r1 = r3 << 1
            r0 = r0 ^ r2
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.adp.f52489w0 = r0
            int r1 = r1 % r4
            return r6
        L70:
            r6 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "encoding error in getInstance: "
            r1.<init>(r2)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L89:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.String r6 = androidx.emoji2.text.flatbuffer.a.c(r6, r1)
            r0.<init>(r6)
            throw r0
        L95:
            com.mypinpad.tsdk.i.adp r6 = (com.mypinpad.tsdk.isolation.adp) r6
            int r0 = com.mypinpad.tsdk.isolation.adp.f52490x0
            r2 = r0 & 93
            r0 = r0 ^ 93
            r0 = r0 | r2
            int r0 = -r0
            int r0 = -r0
            r3 = r2 ^ r0
            r0 = r0 & r2
            int r0 = r0 << r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            com.mypinpad.tsdk.isolation.adp.f52489w0 = r0
            int r3 = r3 % r4
            return r6
        Lab:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adp.i(java.lang.Object[]):com.mypinpad.tsdk.i.adp");
    }

    public static /* synthetic */ adp j(Object[] objArr) {
        aeh aehVar = (aeh) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f52490x0;
        int i11 = i10 ^ 19;
        int i12 = (((i10 & 19) | i11) << 1) - i11;
        f52489w0 = i12 % 128;
        int i13 = i12 % 2;
        a aVar = v0;
        adp adpVar = (adp) j0.c(-1072042084, 1072042084, System.identityHashCode(aVar), new Object[]{aVar, aehVar, Boolean.valueOf(zBooleanValue)});
        int i14 = f52489w0;
        int i15 = i14 & 27;
        int i16 = (i15 - (~(-(-((i14 ^ 27) | i15))))) - 1;
        f52490x0 = i16 % 128;
        if (i16 % 2 != 0) {
            return adpVar;
        }
        throw null;
    }

    public static /* synthetic */ Boolean k(Object[] objArr) {
        adp adpVar = (adp) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52489w0;
        int i11 = i10 & 115;
        int i12 = -(-(i10 | 115));
        int i13 = (i11 & i12) + (i11 | i12);
        f52490x0 = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = adpVar.f52491t0;
        int length = bArr.length;
        int i15 = adpVar.f52492u0;
        int i16 = -i15;
        int i17 = i16 * 450;
        int i18 = length * (-448);
        int i19 = ((i17 ^ i18) | (i17 & i18)) << 1;
        int i20 = -(((~i17) & i18) | ((~i18) & i17));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = ~i16;
        int i23 = ~length;
        int i24 = i22 & i23;
        int i25 = ((~i22) & length) | i24;
        int i26 = i22 & length;
        int i27 = (i25 & i26) | (i25 ^ i26);
        int i28 = ~i27;
        int i29 = ((~i23) & i16) | i24;
        int i30 = i23 & i16;
        int i31 = (i29 ^ i30) | (i29 & i30);
        int i32 = (i31 & iIntValue) | (i31 ^ iIntValue);
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = ((~i28) & i34) | ((~i34) & i28);
        int i36 = i34 & i28;
        int i37 = ((i36 & i35) | (i35 ^ i36)) * 449;
        int i38 = ((i21 | i37) << 1) - (i37 ^ i21);
        int i39 = (~i26) & (length | i22);
        int i40 = (i39 & i26) | (i39 ^ i26);
        int i41 = ~i40;
        int i42 = -(-(((i40 | i41) & i41) * (-1347)));
        int i43 = (i38 & i42) + (i42 | i38);
        int i44 = (i28 | i27) & i28;
        int i45 = ~iIntValue;
        int i46 = (i45 & i23) | (i23 ^ i45);
        int i47 = i46 & i16;
        int i48 = (i46 | i16) & (~i47);
        int i49 = ~((i48 & i47) | (i48 ^ i47));
        int i50 = -(-(((i44 & i49) | ((~i49) & i44) | ((~i44) & i49)) * 449));
        if ((((i43 ^ i50) | (i43 & i50)) << 1) - ((i50 & (~i43)) | ((~i50) & i43)) <= 4) {
            int i51 = i10 & 105;
            int i52 = ((i10 ^ 105) | i51) << 1;
            int i53 = -((i10 | 105) & (~i51));
            int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
            f52490x0 = i54 % 128;
            int i55 = i54 % 2;
            if (((Integer) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i15), -1}, 2139027336, -2139027323, i15)).intValue() == iIntValue) {
                int i56 = f52489w0;
                int i57 = ((i56 | 78) << 1) - (i56 ^ 78);
                int i58 = (i57 ^ (-1)) + (i57 << 1);
                int i59 = i58 % 128;
                f52490x0 = i59;
                int i60 = i58 % 2;
                int i61 = i59 & 101;
                int i62 = ((i59 | 101) & (~i61)) + (i61 << 1);
                f52489w0 = i62 % 128;
                int i63 = i62 % 2;
                return Boolean.TRUE;
            }
        }
        int i64 = f52490x0;
        int i65 = (-2) - ((((i64 | 18) << 1) - (i64 ^ 18)) ^ (-1));
        f52489w0 = i65 % 128;
        if (i65 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i66 = 10 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ void l(Object[] objArr) throws IOException {
        adp adpVar = (adp) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = (-2) - ((f52490x0 + 4) ^ (-1));
        f52489w0 = i10 % 128;
        int i11 = i10 % 2;
        aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 2, adpVar.f52491t0}, 478760665, -478760661, 2);
        int i12 = f52490x0;
        int i13 = ((((i12 ^ 43) | (i12 & 43)) << 1) - (~(-(((~i12) & 43) | (i12 & (-44)))))) - 1;
        f52489w0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0432 A[DONT_INVERT, PHI: r5
      0x0432: PHI (r5v4 int) = (r5v3 int), (r5v6 int) binds: [B:60:0x0430, B:57:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0434  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0451, code lost:
    
        if ((r12.f52491t0[r12.f52492u0] & 128) == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adp.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10)}, -713631796, 713631808, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -440317745, 440317749, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, adyVar}, -1632385653, 1632385668, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52489w0;
        int i11 = i10 & 63;
        int i12 = i11 + ((i10 ^ 63) | i11);
        f52490x0 = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{this.f52491t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        int i14 = f52490x0;
        int i15 = i14 | 105;
        int i16 = ((i15 << 1) - (~(-((~(i14 & 105)) & i15)))) - 1;
        f52489w0 = i16 % 128;
        int i17 = i16 % 2;
        return iIntValue;
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, 1599682974, -1599682960, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -910726606, 910726613, System.identityHashCode(this))).intValue();
    }

    public final long setLayoutAnimation() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -786927668, 786927685, System.identityHashCode(this))).longValue();
    }

    public final int setX() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -2079758436, 2079758436, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 261002736, -261002726, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52489w0;
        int i11 = ((i10 | 31) << 1) - (((~i10) & 31) | (i10 & (-32)));
        f52490x0 = i11 % 128;
        int i12 = i11 % 2;
        String string = ((BigInteger) setOnFocusChangeListener(new Object[]{this}, 1599682974, -1599682960, System.identityHashCode(this))).toString();
        int i13 = f52489w0;
        int i14 = i13 | 99;
        int i15 = (i14 << 1) - ((~(i13 & 99)) & i14);
        f52490x0 = i15 % 128;
        int i16 = i15 % 2;
        return string;
    }

    public adp(BigInteger bigInteger) {
        this.f52491t0 = bigInteger.toByteArray();
        this.f52492u0 = 0;
    }

    public static adp setCompoundDrawableTintBlendMode(Object obj) {
        return (adp) setOnFocusChangeListener(new Object[]{obj}, -837021952, 837021958, (int) System.currentTimeMillis());
    }

    public static adp setDividerPadding(aeh aehVar, boolean z10) {
        return (adp) setOnFocusChangeListener(new Object[]{aehVar, Boolean.valueOf(z10)}, 522248224, -522248221, (int) System.currentTimeMillis());
    }

    public final boolean setX(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 920356441, -920356436, i10)).booleanValue();
    }

    public final boolean setY(BigInteger bigInteger) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, bigInteger}, 1361074046, -1361074044, System.identityHashCode(this))).booleanValue();
    }

    public adp(long j10) {
        this.f52491t0 = BigInteger.valueOf(j10).toByteArray();
        this.f52492u0 = 0;
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, 446421226, -446421218, System.identityHashCode(this));
    }
}
