package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class ang implements apj {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53311f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53312g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aph f53313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final apl f53315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BigInteger f53316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BigInteger f53317e;

    public ang(aph aphVar, apl aplVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (aphVar == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.f53313a = aphVar;
        this.f53315c = (apl) setOnFocusChangeListener(new Object[]{aphVar, aplVar}, -1031630191, 1031630191, (int) System.currentTimeMillis());
        this.f53316d = bigInteger;
        this.f53317e = bigInteger2;
        this.f53314b = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        switch ((((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16) {
            case 1:
                ang angVar = (ang) objArr[0];
                int i18 = f53311f + 23;
                f53312g = i18 % 128;
                int i19 = i18 % 2;
                BigInteger bigInteger = angVar.f53317e;
                if (i19 != 0) {
                    return bigInteger;
                }
                throw null;
            case 2:
                ang angVar2 = (ang) objArr[0];
                int i20 = f53312g;
                int i21 = (-2) - ((i20 + 90) ^ (-1));
                f53311f = i21 % 128;
                int i22 = i21 % 2;
                apl aplVar = angVar2.f53315c;
                int i23 = i20 & 39;
                int i24 = (i20 | 39) & (~i23);
                int i25 = -(-(i23 << 1));
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f53311f = i26 % 128;
                if (i26 % 2 == 0) {
                    return aplVar;
                }
                int i27 = 41 / 0;
                return aplVar;
            case 3:
                ang angVar3 = (ang) objArr[0];
                apl aplVar2 = (apl) objArr[1];
                int i28 = f53311f;
                int i29 = ((((i28 ^ 31) | (i28 & 31)) << 1) - (~(-(((~i28) & 31) | (i28 & (-32)))))) - 1;
                f53312g = i29 % 128;
                int i30 = i29 % 2;
                apl aplVar3 = (apl) setOnFocusChangeListener(new Object[]{(aph) setOnFocusChangeListener(new Object[]{angVar3}, 1031463732, -1031463726, System.identityHashCode(angVar3)), aplVar2}, -1031630191, 1031630191, (int) System.currentTimeMillis());
                System.identityHashCode(angVar3);
                System.identityHashCode(angVar3);
                return aplVar3;
            case 4:
                ang angVar4 = (ang) objArr[0];
                int i31 = f53311f;
                int i32 = (((i31 | 24) << 1) - (i31 ^ 24)) - 1;
                f53312g = i32 % 128;
                int i33 = i32 % 2;
                byte[] bArr = angVar4.f53314b;
                if (i33 == 0) {
                    throw null;
                }
                byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i34 = f53312g;
                int i35 = (i34 ^ 105) + ((i34 & 105) << 1);
                f53311f = i35 % 128;
                int i36 = i35 % 2;
                return bArr2;
            case 5:
                ang angVar5 = (ang) objArr[0];
                int i37 = f53311f;
                int i38 = i37 + 111;
                f53312g = i38 % 128;
                int i39 = i38 % 2;
                BigInteger bigInteger2 = angVar5.f53316d;
                int i40 = i37 + 105;
                f53312g = i40 % 128;
                if (i40 % 2 != 0) {
                    return bigInteger2;
                }
                throw null;
            case 6:
                ang angVar6 = (ang) objArr[0];
                int i41 = f53311f;
                int i42 = i41 & 77;
                int i43 = (i42 - (~(-(-((i41 ^ 77) | i42))))) - 1;
                int i44 = i43 % 128;
                f53312g = i44;
                int i45 = i43 % 2;
                aph aphVar = angVar6.f53313a;
                if (i45 == 0) {
                    throw null;
                }
                int i46 = (i44 & (-60)) | ((~i44) & 59);
                int i47 = (i44 & 59) << 1;
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                f53311f = i48 % 128;
                int i49 = i48 % 2;
                return aphVar;
            default:
                aph aphVar2 = (aph) objArr[0];
                apl aplVar4 = (apl) objArr[1];
                int i50 = f53312g;
                int i51 = i50 & 109;
                int i52 = i51 + ((i50 ^ 109) | i51);
                f53311f = i52 % 128;
                int i53 = i52 % 2;
                if (aplVar4 == null) {
                    throw new NullPointerException("Point cannot be null");
                }
                apl aplVar5 = (apl) api.setX(new Object[]{aphVar2, aplVar4}, -2091094345, 2091094345, (int) System.currentTimeMillis());
                apl aplVar6 = (apl) apl.setOnFocusChangeListener(new Object[]{aplVar5}, 1013204546, -1013204533, System.identityHashCode(aplVar5));
                if (((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar6}, 2114769082, -2114769081, System.identityHashCode(aplVar6))).booleanValue()) {
                    throw new IllegalArgumentException("Point at infinity");
                }
                if (!((Boolean) apl.setOnFocusChangeListener(new Object[]{aplVar6}, -1076104209, 1076104209, System.identityHashCode(aplVar6))).booleanValue()) {
                    throw new IllegalArgumentException("Point not on curve");
                }
                int i54 = f53312g + 69;
                f53311f = i54 % 128;
                if (i54 % 2 == 0) {
                    return aplVar6;
                }
                throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.isolation.ang) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r9 = r0 & 99;
        r1 = (r0 ^ 99) | r9;
        r2 = ((r9 | r1) << 1) - (r9 ^ r1);
        com.mypinpad.tsdk.isolation.ang.f53311f = r2 % 128;
        r2 = r2 % 2;
        r9 = (((r0 & (-24)) | ((~r0) & 23)) - (~((r0 & 23) << 1))) - 1;
        com.mypinpad.tsdk.isolation.ang.f53311f = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r9 = (com.mypinpad.tsdk.isolation.ang) r9;
        r0 = r9.f53313a;
        r2 = r8.f53313a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.aph.setX(new java.lang.Object[]{r2, r0}, 349213807, -349213802, java.lang.System.identityHashCode(r2))).booleanValue()) == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ang.f53311f;
        r1 = ((r0 ^ 31) | (r0 & 31)) << 1;
        r0 = -(((~r0) & 31) | (r0 & (-32)));
        r2 = (r1 & r0) + (r0 | r1);
        com.mypinpad.tsdk.isolation.ang.f53312g = r2 % 128;
        r2 = r2 % 2;
        r1 = r8.f53315c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.apl.setOnFocusChangeListener(new java.lang.Object[]{r1, r9.f53315c}, -1376432433, 1376432448, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ang.f53312g + 81;
        com.mypinpad.tsdk.isolation.ang.f53311f = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r8.f53316d.equals(r9.f53316d) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.ang.f53312g;
        r0 = r9 & 103;
        r9 = -(-((r9 ^ 103) | r0));
        r1 = (r0 & r9) + (r9 | r0);
        r9 = r1 % 128;
        com.mypinpad.tsdk.isolation.ang.f53311f = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        if ((r1 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        r1 = r9 | 79;
        r2 = ((r1 << 1) - (~(-((~(r9 & 79)) & r1)))) - 1;
        com.mypinpad.tsdk.isolation.ang.f53312g = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if ((r2 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        r9 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.ang.f53312g;
        r0 = ((r9 & 105) - (~(r9 | 105))) - 1;
        com.mypinpad.tsdk.isolation.ang.f53311f = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if ((r0 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r8 == r9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r2 = r2 + 99;
        com.mypinpad.tsdk.isolation.ang.f53312g = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ang.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f53312g;
        int i11 = (i10 ^ 96) + ((i10 & 96) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53311f = i12 % 128;
        int i13 = i12 % 2;
        int iHashCode = this.f53313a.hashCode();
        int i14 = ((iHashCode & (-1029)) | ((~iHashCode) & 1028)) * 257;
        int iHashCode2 = this.f53315c.hashCode();
        int i15 = i14 & iHashCode2;
        int i16 = (((i14 ^ iHashCode2) | i15) & (~i15)) * 257;
        int iHashCode3 = this.f53316d.hashCode();
        int i17 = i16 & iHashCode3;
        int i18 = ((i16 ^ iHashCode3) | i17) & (~i17);
        int i19 = f53311f;
        int i20 = (i19 ^ 61) + ((i19 & 61) << 1);
        f53312g = i20 % 128;
        int i21 = i20 % 2;
        return i18;
    }

    public final apl setCompoundDrawableTintBlendMode() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, 2118200324, -2118200322, System.identityHashCode(this));
    }

    public final aph setDividerPadding() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 1031463732, -1031463726, System.identityHashCode(this));
    }

    public final apl setX(apl aplVar) {
        return (apl) setOnFocusChangeListener(new Object[]{this, aplVar}, 54804998, -54804995, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, -1444830087, 1444830092, System.identityHashCode(this));
    }

    public ang(aph aphVar, apl aplVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(aphVar, aplVar, bigInteger, bigInteger2, null);
    }

    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1963862991, -1963862987, System.identityHashCode(this));
    }

    public ang(aph aphVar, apl aplVar, BigInteger bigInteger) {
        this(aphVar, aplVar, bigInteger, apj.setOnFocusChangeListener, null);
    }

    public ang(ajz ajzVar) {
        this(ajzVar.setDividerPadding(), ajzVar.setOnFocusChangeListener(), ajzVar.setX(), ajzVar.setY(), ajzVar.setCompoundDrawableTintBlendMode());
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, -1314957240, 1314957241, System.identityHashCode(this));
    }
}
