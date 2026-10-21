package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class anb extends anc {
    public static final BigInteger v0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final BigInteger f53292w0 = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53293x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f53294y0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final BigInteger f53295u0;

    static {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = (1967585631 & i10) | (iCurrentTimeMillis & (-1967585632));
        int i12 = 1967585631 & iCurrentTimeMillis;
        int i13 = (i12 & i11) | (i11 ^ i12);
        int i14 = (i13 | (~i13)) & (~i13);
        int i15 = 34669088 & i14;
        int i16 = ((i14 | 34669088) & (~i15)) | i15;
        int i17 = ~iCurrentTimeMillis;
        int i18 = (iCurrentTimeMillis | i10) & i17;
        int i19 = ((-1985298989) & i18) | ((~i18) & 1985298988);
        int i20 = i18 & 1985298988;
        int i21 = (i20 & i19) | (i19 ^ i20);
        int i22 = ~((i21 & (-1967585632)) | (i21 ^ (-1967585632)));
        int i23 = ((~i22) & i16) | ((~i16) & i22);
        int i24 = i22 & i16;
        int i25 = ((i24 & i23) | (i23 ^ i24)) * 886;
        int i26 = ((((-86547556) | i25) << 1) - (~(-(i25 ^ (-86547556))))) - 1;
        int i27 = ~((i17 ^ (-1967585632)) | (i17 & (-1967585632)));
        int i28 = -(-(((i27 & 1985298988) | (1985298988 ^ i27)) * (-1772)));
        int i29 = (i26 ^ i28) + ((i28 & i26) << 1);
        int i30 = i10 & 1985298988;
        int i31 = (i10 | 1985298988) & (~i30);
        int i32 = (i29 - (~(-(-((~((i30 & i31) | (i31 ^ i30))) * 886))))) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i33 = ~iCurrentTimeMillis2;
        int i34 = ~iCurrentTimeMillis2;
        int i35 = i34 | iCurrentTimeMillis2;
        int i36 = i33 & i35;
        int i37 = ((~i36) & (-1964284995)) | (i36 & 1964284994);
        int i38 = i36 & (-1964284995);
        int i39 = (i38 & i37) | (i37 ^ i38);
        int i40 = ~((i39 & (-593579522)) | (i39 ^ (-593579522)));
        int i41 = ((-593579522) & i34) | ((~i34) & 593579521) | (593579521 & i34);
        int i42 = i41 & 1964284994;
        int i43 = (i41 | 1964284994) & (~i42);
        int i44 = (i43 & i42) | (i43 ^ i42);
        int i45 = (i44 | (~i44)) & (~i44);
        int i46 = i40 & i45;
        int i47 = (i40 | i45) & (~i46);
        int i48 = ((i47 & i46) | (i47 ^ i46)) * (-184);
        int i49 = ((-1730998208) & i48) + (i48 | (-1730998208));
        int i50 = ~((-1964284995) | i34);
        int i51 = 1410633794 & i50;
        int i52 = (i50 | 1410633794) & (~i51);
        int i53 = (i52 & i51) | (i52 ^ i51);
        int i54 = (~iCurrentTimeMillis2) & i35;
        int i55 = (i54 & 593579521) | (593579521 ^ i54);
        int i56 = (i55 | (~i55)) & (~i55);
        int i57 = ((~i56) & i53) | ((~i53) & i56);
        int i58 = i56 & i53;
        int i59 = -(~(((i58 & i57) | (i57 ^ i58)) * 184));
        int i60 = (((i49 | i59) << 1) - (i59 ^ i49)) - 1;
        int i61 = i60 & 1243123344;
        int i62 = (1243123344 | i60) & (~i61);
        int i63 = i61 << 1;
        if (i32 > (i62 & i63) + (i62 | i63)) {
            int i64 = 72 / 0;
        }
    }

    public anb(BigInteger bigInteger, ana anaVar) {
        super(anaVar);
        this.f53295u0 = (BigInteger) setDividerPadding(new Object[]{bigInteger, anaVar}, -1599529082, 1599529085, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x057b, code lost:
    
        if (((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r0, r5}, 186764352, -186764348, (int) java.lang.System.currentTimeMillis())).intValue() != 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0593, code lost:
    
        if (1 != ((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r0, r5}, 186764352, -186764348, (int) java.lang.System.currentTimeMillis())).intValue()) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0595, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.anb.f53293x0;
        r2 = r1 & 49;
        r2 = r2 + ((r1 ^ 49) | r2);
        com.mypinpad.tsdk.isolation.anb.f53294y0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x05a2, code lost:
    
        if ((r2 % 2) == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x05a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x05b2, code lost:
    
        if (com.mypinpad.tsdk.isolation.anb.v0.equals(r0.modPow(r1, r5)) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x05b4, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r2 = (((r1 | 6) << 1) - (r1 ^ 6)) - 1;
        r1 = r2 % 128;
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r1;
        r2 = r2 % 2;
        r2 = r1 & 29;
        r1 = (((r1 | 29) & (~r2)) - (~(-(-(r2 << 1))))) - 1;
        com.mypinpad.tsdk.isolation.anb.f53294y0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x05dc, code lost:
    
        throw new java.lang.IllegalArgumentException("Y value does not appear to be in correct group");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x05e4, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid DH public key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05ec, code lost:
    
        throw new java.lang.NullPointerException("y value cannot be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.anb.f53294y0 + 33;
        r2 = r0 % 128;
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r2;
        r0 = r0 % 2;
        r2 = r2 + 71;
        com.mypinpad.tsdk.isolation.anb.f53294y0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if ((r2 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x043f, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0442, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0444, code lost:
    
        r5 = (java.math.BigInteger) com.mypinpad.tsdk.isolation.ana.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1926110135, 1926110138, java.lang.System.identityHashCode(r1));
        r6 = com.mypinpad.tsdk.isolation.anb.f53292w0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x045e, code lost:
    
        if (r0.compareTo(r6) < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0460, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r8 = (r7 & 25) + (r7 | 25);
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0474, code lost:
    
        if (r0.compareTo(r5.subtract(r6)) > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0476, code lost:
    
        r1 = (java.math.BigInteger) com.mypinpad.tsdk.isolation.ana.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -27084180, 27084181, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x048a, code lost:
    
        if (r1 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x048c, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r2 = ((r1 | 86) << 1) - (r1 ^ 86);
        r1 = (r2 ^ (-1)) + (r2 << 1);
        r2 = r1 % 128;
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r2;
        r1 = r1 % 2;
        r1 = (r2 & 59) + (r2 | 59);
        com.mypinpad.tsdk.isolation.anb.f53294y0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04a7, code lost:
    
        if ((r1 % 2) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x04b1, code lost:
    
        if (r5.testBit(0) == true) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04b5, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r7 = (r6 & 122) + (r6 | 122);
        r6 = (r7 ^ (-1)) + (r7 << 1);
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r6 % 128;
        r6 = r6 % 2;
        r6 = r5.bitLength();
        r7 = (int) java.lang.System.currentTimeMillis();
        r8 = 519 - (~(-(-(r6 * com.bbva.sl.ar.android.sslpinning.result.ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY))));
        r9 = ~r6;
        r10 = r6 & r7;
        r11 = (~r10) & (r6 | r7);
        r10 = (r10 & r11) | (r11 ^ r10);
        r11 = ~r10;
        r10 = -(-(((r10 | r11) & r11) * com.bbva.sl.ar.android.sslpinning.result.ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        r11 = ((r8 | r10) << 1) - (r8 ^ r10);
        r8 = (~r9) | r9;
        r10 = ~r8;
        r8 = -(-(((r8 | r10) & r10) * (-1042)));
        r10 = r11 ^ r8;
        r8 = -(-((r8 & r11) << 1));
        r11 = (r10 & r8) + (r8 | r10);
        r8 = (r9 | r6) & r9;
        r10 = ~r8;
        r8 = ~((r8 & r10) | (r10 ^ r8));
        r10 = ~r7;
        r7 = (r7 | r10) & r10;
        r6 = (r6 & r7) | ((r9 & r7) | ((~r7) & r6));
        r7 = ~r6;
        r6 = (((r6 | r7) & r7) | r8) * com.bbva.sl.ar.android.sslpinning.result.ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        r7 = r11 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0520, code lost:
    
        if ((r7 + ((r6 ^ r11) | r7)) != r1.bitLength()) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0522, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r7 = r6 ^ 43;
        r6 = ((((r6 & 43) | r7) << 1) - (~(-r7))) - 1;
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0533, code lost:
    
        if ((r6 % 2) == 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x053e, code lost:
    
        if ((!r5.shiftRight(0).equals(r1)) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0549, code lost:
    
        if (r5.shiftRight(1).equals(r1) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x054b, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.anb.f53294y0;
        r6 = (((r1 & (-66)) | ((~r1) & 65)) - (~((r1 & 65) << 1))) - 1;
        com.mypinpad.tsdk.isolation.anb.f53293x0 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0564, code lost:
    
        if ((r6 % 2) == 0) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.anb.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.anc
    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, 1681947761, -1681947761, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.anc
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -509392866, 509392867, System.identityHashCode(this))).intValue();
    }
}
