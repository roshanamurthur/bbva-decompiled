package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class aeg extends ady {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52538w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f52539t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f52540u0;

    static {
        Integer num = 13;
        num.intValue();
        int i10 = v0 + 101;
        f52538w0 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public aeg(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        long j10 = 0;
        BigInteger bigIntegerShiftLeft = null;
        boolean z10 = true;
        while (i10 != bArr.length) {
            byte b10 = bArr[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j10) : bigIntegerShiftLeft).or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        z10 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(bigIntegerOr);
                    j10 = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            int i11 = i10 & (-9);
            int i12 = (i10 ^ (-9)) | i11;
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            int i14 = i13 & 10;
            int i15 = i13 | 10;
            i10 = (i14 & i15) + (i14 | i15);
        }
        this.f52539t0 = stringBuffer.toString();
        this.f52540u0 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02d7, code lost:
    
        if (r1.charAt(((r0 | r3) << 1) - (r0 ^ r3)) == '0') goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean f(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aeg.f(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ void h(Object[] objArr) throws IOException {
        aeg aegVar = (aeg) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f52538w0;
        int i11 = i10 & 125;
        int i12 = (i10 | 125) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        v0 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArrG = aegVar.g();
        if (i15 != 0) {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 23, bArrG}, 478760665, -478760661, 23);
        } else {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 13, bArrG}, 478760665, -478760661, 13);
        }
        int i16 = f52538w0;
        int i17 = i16 & 121;
        int i18 = -(-((i16 ^ 121) | i17));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        v0 = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 52 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if ((r7 instanceof com.mypinpad.tsdk.isolation.aeg) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r1 = r4 & 85;
        r7 = (((r4 ^ 85) | r1) << 1) - ((~r1) & (r4 | 85));
        com.mypinpad.tsdk.isolation.aeg.v0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if ((r7 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return java.lang.Boolean.valueOf(!r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r7 = r1.f52539t0.equals(((com.mypinpad.tsdk.isolation.aeg) r7).f52539t0);
        r0 = com.mypinpad.tsdk.isolation.aeg.f52538w0;
        r1 = (((r0 | 46) << 1) - (r0 ^ 46)) - 1;
        com.mypinpad.tsdk.isolation.aeg.v0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        return java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r7 = ((r3 | 29) << 1) - (r3 ^ 29);
        com.mypinpad.tsdk.isolation.aeg.f52538w0 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r7 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean i(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            com.mypinpad.tsdk.i.aeg r1 = (com.mypinpad.tsdk.isolation.aeg) r1
            r2 = 1
            r7 = r7[r2]
            com.mypinpad.tsdk.i.ady r7 = (com.mypinpad.tsdk.isolation.ady) r7
            int r3 = com.mypinpad.tsdk.isolation.aeg.v0
            r4 = r3 & 23
            r5 = r3 ^ 23
            r5 = r5 | r4
            r6 = r4 ^ r5
            r4 = r4 & r5
            int r4 = r4 << r2
            int r6 = r6 + r4
            int r4 = r6 % 128
            com.mypinpad.tsdk.isolation.aeg.f52538w0 = r4
            int r6 = r6 % 2
            if (r6 != 0) goto L24
            r5 = 50
            int r5 = r5 / r0
            if (r1 != r7) goto L39
            goto L26
        L24:
            if (r1 != r7) goto L39
        L26:
            r7 = r3 | 29
            int r7 = r7 << r2
            r0 = r3 ^ 29
            int r7 = r7 - r0
            int r0 = r7 % 128
            com.mypinpad.tsdk.isolation.aeg.f52538w0 = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L37
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L37:
            r7 = 0
            throw r7
        L39:
            boolean r3 = r7 instanceof com.mypinpad.tsdk.isolation.aeg
            if (r3 != 0) goto L59
            r7 = r4 ^ 85
            r1 = r4 & 85
            r7 = r7 | r1
            int r7 = r7 << r2
            int r1 = ~r1
            r3 = r4 | 85
            r1 = r1 & r3
            int r7 = r7 - r1
            int r1 = r7 % 128
            com.mypinpad.tsdk.isolation.aeg.v0 = r1
            int r7 = r7 % 2
            if (r7 == 0) goto L51
            goto L52
        L51:
            r0 = r2
        L52:
            r7 = r0 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L59:
            com.mypinpad.tsdk.i.aeg r7 = (com.mypinpad.tsdk.isolation.aeg) r7
            java.lang.String r0 = r1.f52539t0
            java.lang.String r7 = r7.f52539t0
            boolean r7 = r0.equals(r7)
            int r0 = com.mypinpad.tsdk.isolation.aeg.f52538w0
            r1 = r0 | 46
            int r1 = r1 << r2
            r0 = r0 ^ 46
            int r1 = r1 - r0
            int r1 = r1 + (-1)
            int r0 = r1 % 128
            com.mypinpad.tsdk.isolation.aeg.v0 = r0
            int r1 = r1 % 2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aeg.i(java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        if (r5 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0077, code lost:
    
        r12.write(0);
        r11 = com.mypinpad.tsdk.isolation.aeg.f52538w0;
        r12 = r11 & 85;
        r11 = (r11 ^ 85) | r12;
        r13 = (r12 ^ r11) + ((r11 & r12) << 1);
        com.mypinpad.tsdk.isolation.aeg.v0 = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008d, code lost:
    
        r13 = new byte[r5];
        r0 = r5 - 1;
        r6 = com.mypinpad.tsdk.isolation.aeg.v0 + 33;
        com.mypinpad.tsdk.isolation.aeg.f52538w0 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        if (r0 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.aeg.f52538w0;
        r7 = r6 ^ 37;
        r6 = -(-((r6 & 37) << 1));
        r8 = ((r7 | r6) << 1) - (r6 ^ r7);
        com.mypinpad.tsdk.isolation.aeg.v0 = r8 % 128;
        r8 = r8 % 2;
        r6 = r11.intValue();
        r7 = (r6 & (-129)) | ((~r6) & 128);
        r6 = r6 & 128;
        r13[r0] = (byte) ((r6 & r7) | (r7 ^ r6));
        r11 = r11.shiftRight(7);
        r0 = (((r0 | 50) << 1) - (r0 ^ 50)) - 51;
        r6 = com.mypinpad.tsdk.isolation.aeg.v0;
        r7 = r6 & 101;
        r7 = r7 + ((r6 ^ 101) | r7);
        com.mypinpad.tsdk.isolation.aeg.f52538w0 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
    
        r11 = r5 - 1;
        r13[r11] = (byte) (r13[r11] & 127);
        r12.write(r13, 0, r5);
        r11 = com.mypinpad.tsdk.isolation.aeg.v0;
        r12 = (r11 ^ 29) + ((r11 & 29) << 1);
        com.mypinpad.tsdk.isolation.aeg.f52538w0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (r5 == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r11, int r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aeg.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, -628505769, 628505771, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -186959685, 186959686, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, -802299050, 802299054, System.identityHashCode(this))).booleanValue();
    }

    public final synchronized byte[] g() {
        byte[] bArr;
        try {
            int i10 = v0 + 81;
            f52538w0 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (this.f52540u0 == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                setX(new Object[]{this, byteArrayOutputStream}, -1097120831, 1097120838, System.identityHashCode(this));
                this.f52540u0 = byteArrayOutputStream.toByteArray();
                int i11 = f52538w0;
                int i12 = ((i11 & (-102)) | ((~i11) & 101)) + ((i11 & 101) << 1);
                v0 = i12 % 128;
                int i13 = i12 % 2;
            }
            bArr = this.f52540u0;
            int i14 = f52538w0;
            int i15 = ((i14 | 57) << 1) - (i14 ^ 57);
            v0 = i15 % 128;
            int i16 = i15 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = v0 + 89;
        f52538w0 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f52539t0;
        if (i11 == 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        int i12 = v0;
        int i13 = ((i12 | 37) << 1) - (i12 ^ 37);
        f52538w0 = i13 % 128;
        int i14 = i13 % 2;
        return iHashCode;
    }

    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, -1950729017, 1950729023, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1755387660, 1755387665, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        int i10 = ~iIdentityHashCode;
        int i11 = ((-284711179) & i10) | (iIdentityHashCode & 284711178);
        int i12 = (-284711179) & iIdentityHashCode;
        int i13 = ~((i11 & i12) | (i11 ^ i12));
        int i14 = ((i13 & 7870720) | ((~i13) & 7870720) | (i13 & (-7870721))) * 992;
        int i15 = (-117900498) ^ i14;
        int i16 = (i14 & (-117900498)) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = (-284711179) | iIdentityHashCode;
        int i19 = (i18 | (~i18)) & (~i18);
        int i20 = ((-7870721) & i19) | ((~i19) & 7870720);
        int i21 = i19 & 7870720;
        int i22 = ((-284711179) & i10) | ((~i10) & 284711178);
        int i23 = i10 & 284711178;
        int i24 = (i23 & i22) | (i22 ^ i23);
        int i25 = -(-(((~((i24 & (-310503100)) | (i24 ^ (-310503100)))) | (i21 & i20) | (i20 ^ i21)) * (-496)));
        int i26 = i17 & i25;
        int i27 = i26 + ((i25 ^ i17) | i26);
        int i28 = ((iIdentityHashCode & (-310503100)) | ((-310503100) ^ iIdentityHashCode)) * 496;
        int i29 = i27 & i28;
        int i30 = ((i27 ^ i28) | i29) << 1;
        int i31 = -((i28 | i27) & (~i29));
        int i32 = (i30 & i31) + (i31 | i30);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i33 = ~iIdentityHashCode2;
        int i34 = ((~i33) & (-2146230726)) | (2146230725 & i33);
        int i35 = i33 & (-2146230726);
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = (i36 & (-1210388782)) | (i36 ^ (-1210388782));
        int i38 = -(~(((i37 | (~i37)) & (~i37)) * (-783)));
        int i39 = ((2102287665 & i38) + (i38 | 2102287665)) - 1;
        int i40 = ~iIdentityHashCode2;
        int i41 = i40 & (-1210388782);
        int i42 = (i40 | (-1210388782)) & (~i41);
        int i43 = (i42 & i41) | (i42 ^ i41);
        int i44 = (i43 | (~i43)) & (~i43);
        int i45 = (-2146230726) & i44;
        int i46 = (i44 | (-2146230726)) & (~i45);
        int i47 = ((i46 & i45) | (i46 ^ i45)) * 783;
        int i48 = ((~i47) & i39) | ((~i39) & i47);
        int i49 = -(-((i47 & i39) << 1));
        if (i32 > ((i48 | i49) << 1) - (i49 ^ i48)) {
            throw null;
        }
        String str = (String) setX(new Object[]{this}, -1950729017, 1950729023, System.identityHashCode(this));
        int i50 = v0;
        int i51 = i50 ^ 27;
        int i52 = -(-((i50 & 27) << 1));
        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
        f52538w0 = i53 % 128;
        if (i53 % 2 == 0) {
            int i54 = 9 / 0;
        }
        return str;
    }
}
