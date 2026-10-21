package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ami {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53201f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53202g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amj f53203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f53205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f53206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53207e;

    public ami(aky akyVar) {
        this.f53203a = new amj(akyVar);
        this.f53204b = akyVar.setY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
    
        if (((((~r9) & r8) | ((~r8) & r9)) + ((r8 & r9) << 1)) <= (21471 / r0.f53204b)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (((r0.f53207e - (~r2)) - 1) <= (r0.f53204b * 255)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        r8 = r0.f53207e;
        r9 = r0.f53204b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        if ((r8 % r9) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r8 = (((r3 | 58) << 1) - (r3 ^ 58)) - 1;
        com.mypinpad.tsdk.isolation.ami.f53202g = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if ((r8 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        setDividerPadding(new java.lang.Object[]{r0}, -787482522, 787482524, java.lang.System.identityHashCode(r0));
        r3 = com.mypinpad.tsdk.isolation.ami.f53201f + 79;
        com.mypinpad.tsdk.isolation.ami.f53202g = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        setDividerPadding(new java.lang.Object[]{r0}, -787482522, 787482524, java.lang.System.identityHashCode(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r3 = r0.f53207e % r9;
        r8 = -r3;
        r13 = ((r8 * (-496)) - (~(-(-(r9 * (-496)))))) - 1;
        r14 = ~r8;
        r15 = ~r9;
        r17 = r14 & r15;
        r4 = (~((r14 ^ r15) | r17)) * 497;
        r10 = r13 & r4;
        r4 = ((r4 | r13) & (~r10)) + (r10 << 1);
        r10 = (r15 | r9) & r15;
        r11 = (~r10) & r14;
        r13 = ~r14;
        r11 = (r11 | (r10 & r13)) | (r14 & r10);
        r6 = r11 & r2;
        r11 = (r11 | r2) & (~r6);
        r6 = (r6 & r11) | (r11 ^ r6);
        r11 = ~r6;
        r6 = (r6 | r11) & r11;
        r11 = ~r2;
        r12 = (r11 | r2) & r11;
        r5 = r15 & r12;
        r7 = (~r5) & (r15 | r12);
        r15 = ~r12;
        r5 = (r7 ^ r5) | (r5 & r7);
        r7 = r5 & r8;
        r5 = ~(((r5 | r8) & (~r7)) | r7);
        r5 = -(-(((r5 & r6) | (r6 ^ r5)) * 497));
        r6 = ((~r5) & r4) | ((~r4) & r5);
        r4 = -(-((r4 & r5) << 1));
        r7 = ((r6 | r4) << 1) - (r4 ^ r6);
        r4 = ~r11;
        r5 = (r14 & r4) | (r11 & r13);
        r6 = r14 & r11;
        r5 = (r5 & r6) | (r5 ^ r6);
        r6 = ~r5;
        r5 = (r5 | r6) & r6;
        r6 = (r17 | (r9 & r13)) | (r14 & r9);
        r12 = ~r6;
        r6 = (r6 | r12) & r12;
        r12 = r5 ^ r6;
        r5 = r5 & r6;
        r5 = (r5 & r12) | (r12 ^ r5);
        r6 = (r10 ^ r8) | (r8 & r10);
        r8 = r6 & r2;
        r6 = ~(((r6 | r2) & (~r8)) | r8);
        r8 = ((~r6) & r5) | ((~r5) & r6);
        r5 = r5 & r6;
        r5 = java.lang.Math.min((((r5 & r8) | (r8 ^ r5)) * 497) + r7, r2);
        java.lang.System.arraycopy(r0.f53206d, r3, r1, 0, r5);
        r3 = r0.f53207e;
        r6 = -r5;
        r7 = -r6;
        r8 = r3 & r7;
        r3 = (r3 | r7) & (~r8);
        r8 = r8 << 1;
        r0.f53207e = (r3 & r8) + (r3 | r8);
        r3 = -(~r6);
        r12 = (-2) - (((r2 & r3) + (r3 | r2)) ^ (-1));
        r3 = com.mypinpad.tsdk.isolation.ami.f53201f;
        r6 = (r3 & 89) + (r3 | 89);
        com.mypinpad.tsdk.isolation.ami.f53202g = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0196, code lost:
    
        if (r12 <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0198, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.ami.f53201f;
        r6 = ((r3 & 6) + (r3 | 6)) - 1;
        com.mypinpad.tsdk.isolation.ami.f53202g = r6 % 128;
        r6 = r6 % 2;
        setDividerPadding(new java.lang.Object[]{r0}, -787482522, 787482524, java.lang.System.identityHashCode(r0));
        r6 = java.lang.Math.min(r9, r12);
        java.lang.System.arraycopy(r0.f53206d, 0, r1, r5, r6);
        r3 = r0.f53207e;
        r7 = r6 * (-559);
        r13 = -(-(r3 * 561));
        r14 = r7 ^ r13;
        r7 = (((r7 & r13) | r14) << 1) - r14;
        r13 = ~r6;
        r14 = (r11 & r13) | (r6 & r4);
        r17 = r11 & r6;
        r14 = -(-((~((r14 ^ r17) | (r14 & r17))) * (-560)));
        r17 = (r7 ^ r14) + ((r7 & r14) << 1);
        r7 = ~r3;
        r8 = ((~r7) & r6) | (r7 & r13);
        r14 = r7 & r6;
        r8 = (r8 ^ r14) | (r8 & r14);
        r8 = (r8 & r2) | (((~r8) & r2) | (r8 & r11));
        r10 = ~r8;
        r8 = -(-(((r8 | r10) & r10) * (-560)));
        r10 = r17 & r8;
        r10 = (r10 - (~(-(-((r17 ^ r8) | r10))))) - 1;
        r8 = (r13 | r6) & r13;
        r7 = ~(((r7 & r8) | ((~r8) & r3)) | (r8 & r3));
        r8 = r11 & r3;
        r3 = (r3 | r11) & (~r8);
        r3 = (r3 & r8) | (r3 ^ r8);
        r8 = ~r3;
        r3 = (r3 | r8) & r8;
        r8 = r7 ^ r3;
        r3 = r3 & r7;
        r3 = -(~(((r3 & r8) | (r8 ^ r3)) * 560));
        r0.f53207e = (-2) - ((((r10 | r3) << 1) - (r3 ^ r10)) ^ (-1));
        r3 = -r6;
        r6 = r3 * (-711);
        r7 = r12 * 713;
        r8 = r6 & r7;
        r6 = (((r6 | r7) & (~r8)) - (~(-(-(r8 << 1))))) - 1;
        r7 = ~r12;
        r8 = (~r3) & r7;
        r10 = ~r7;
        r8 = r8 | (r3 & r10);
        r13 = r7 & r3;
        r8 = ~((r8 & r13) | (r8 ^ r13));
        r13 = r11 & r3;
        r14 = (~r13) & (r11 | r3);
        r14 = ~((r14 ^ r13) | (r14 & r13));
        r17 = r8 ^ r14;
        r8 = r8 & r14;
        r8 = -(-(((r17 & r8) | (r17 ^ r8)) * (-712)));
        r14 = r6 & r8;
        r6 = -(-((r6 ^ r8) | r14));
        r8 = (r14 & r6) + (r6 | r14);
        r6 = (r7 & r15) | (r12 & r10);
        r10 = r7 & r12;
        r6 = (r6 & r10) | (r6 ^ r10);
        r10 = r6 & r3;
        r6 = (r6 | r3) & (~r10);
        r6 = (r6 & r10) | (r6 ^ r10);
        r10 = ~r6;
        r6 = (r6 | r10) & r10;
        r10 = r3 | r12;
        r10 = ~((r10 & r2) | ((r10 & r11) | ((~r10) & r2)));
        r12 = r6 ^ r10;
        r6 = r6 & r10;
        r8 = (r8 - (~(((r6 & r12) | (r12 ^ r6)) * (-712)))) - 1;
        r6 = r11 ^ r3;
        r12 = (r8 - (~(-(-(((~((r6 & r13) | (r6 ^ r13))) | r7) * 712))))) - 1;
        r3 = -(~(-r3));
        r3 = (-2) - (((r5 ^ r3) + ((r3 & r5) << 1)) ^ (-1));
        r5 = com.mypinpad.tsdk.isolation.ami.f53201f + 39;
        com.mypinpad.tsdk.isolation.ami.f53202g = r5 % 128;
        r5 = r5 % 2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02db, code lost:
    
        r0 = ~(((-1444483873) & r2) | ((-1444483873) ^ r2));
        r3 = 134359052 ^ r0;
        r0 = r0 & 134359052;
        r0 = -(-(((r0 & r3) | (r3 ^ r0)) * 501));
        r1 = ((~r0) & 658076760) | ((-658076761) & r0);
        r0 = -(-((r0 & 658076760) << 1));
        r5 = ((r1 | r0) << 1) - (r0 ^ r1);
        r1 = r5 & 1277164350;
        r0 = 161639452 | r11;
        r1 = ((r1 + ((1277164350 ^ r5) | r1)) - (~(-(-((~((r0 & (-1471764273)) | (r0 ^ (-1471764273)))) * 501))))) - 1;
        r3 = 195130280 & r11;
        r6 = (r2 & (-195130281)) | r3;
        r0 = 195130280 & r2;
        r0 = (r0 & r6) | (r6 ^ r0);
        r6 = ~r0;
        r0 = (r0 | r6) & r6;
        r0 = ((r0 & 1097290561) | (1097290561 ^ r0)) * (-318);
        r9 = 2126706979 & r0;
        r8 = ((2126706979 ^ r0) | r9) << 1;
        r0 = -((r0 | 2126706979) & (~r9));
        r7 = (r8 & r0) + (r0 | r8);
        r0 = ~((1097290561 ^ r2) | (1097290561 & r2));
        r3 = r3 | ((-195130281) & r4);
        r8 = r11 & (-195130281);
        r3 = (r3 & r8) | (r3 ^ r8);
        r9 = r3 ^ (-1097290562);
        r3 = r3 & (-1097290562);
        r3 = ~((r3 & r9) | (r9 ^ r3));
        r9 = r0 ^ r3;
        r0 = r0 & r3;
        r0 = -(-(((r0 & r9) | (r9 ^ r0)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        r3 = ((((r7 ^ r0) | (r7 & r0)) << 1) - (~(-((r0 & (~r7)) | ((~r0) & r7))))) - 1;
        r0 = (1097290561 & r4) | (r11 & (-1097290562));
        r4 = 1097290561 & r11;
        r0 = (r0 & r4) | (r0 ^ r4);
        r4 = r0 ^ (-195130281);
        r0 = r0 & (-195130281);
        r0 = ~((r0 & r4) | (r4 ^ r0));
        r4 = ((-18961153) & r2) | ((-18961153) ^ r2);
        r5 = ~r4;
        r4 = (r4 | r5) & r5;
        r5 = r0 & r4;
        r0 = (r0 | r4) & (~r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x03ad, code lost:
    
        if (r1 > ((((r0 & r5) | (r0 ^ r5)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET) + r3)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x03b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x03be, code lost:
    
        throw new com.mypinpad.tsdk.isolation.akr("HKDF may only be used for 255 * HashLen bytes of output");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x06d6, code lost:
    
        return java.lang.Integer.valueOf(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setDividerPadding(java.lang.Object[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 1763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ami.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final void setCompoundDrawableTintBlendMode(akq akqVar) {
        setDividerPadding(new Object[]{this, akqVar}, -1157420496, 1157420497, System.identityHashCode(this));
    }

    public final int setX(byte[] bArr, int i10) throws akr, IllegalArgumentException {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 1036326691, -1036326691, i10)).intValue();
    }
}
