package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class ana implements akk {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53287s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53288t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f53289p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f53290q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f53291r0;

    public ana(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, amz amzVar) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !((Boolean) bet.setCompoundDrawableTintBlendMode(new Object[]{"org.bouncycastle.dh.allow_unsafe_p_value"}, 1196176667, -1196176666, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f53289p0 = bigInteger2;
        this.f53290q0 = bigInteger;
        this.f53291r0 = bigInteger3;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        if (i16 == 1) {
            ana anaVar = (ana) objArr[0];
            int i17 = f53288t0;
            int i18 = i17 & 59;
            int i19 = ((i17 ^ 59) | i18) << 1;
            int i20 = -((~i18) & (i17 | 59));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f53287s0 = i21 % 128;
            int i22 = i21 % 2;
            BigInteger bigInteger = anaVar.f53291r0;
            int i23 = ((((i17 ^ 117) | (i17 & 117)) << 1) - (~(-(((~i17) & 117) | (i17 & (-118)))))) - 1;
            f53287s0 = i23 % 128;
            int i24 = i23 % 2;
            return bigInteger;
        }
        if (i16 == 2) {
            ana anaVar2 = (ana) objArr[0];
            System.identityHashCode(anaVar2);
            System.identityHashCode(anaVar2);
            BigInteger bigInteger2 = anaVar2.f53289p0;
            int i25 = f53287s0;
            int i26 = i25 & 33;
            int i27 = i25 | 33;
            int i28 = (i26 & i27) + (i27 | i26);
            f53288t0 = i28 % 128;
            if (i28 % 2 != 0) {
                return bigInteger2;
            }
            throw null;
        }
        if (i16 == 3) {
            ana anaVar3 = (ana) objArr[0];
            int i29 = f53287s0;
            int i30 = i29 ^ 89;
            int i31 = -(-((i29 & 89) << 1));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i33 = i32 % 128;
            f53288t0 = i33;
            int i34 = i32 % 2;
            BigInteger bigInteger3 = anaVar3.f53290q0;
            int i35 = (((i33 & (-70)) | ((~i33) & 69)) - (~(-(-((i33 & 69) << 1))))) - 1;
            f53287s0 = i35 % 128;
            int i36 = i35 % 2;
            return bigInteger3;
        }
        int iIntValue = ((Number) objArr[0]).intValue();
        int i37 = f53287s0;
        int i38 = (i37 & (-86)) | ((~i37) & 85);
        int i39 = -(-((i37 & 85) << 1));
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        int i41 = i40 % 128;
        f53288t0 = i41;
        if (i40 % 2 == 0) {
            throw null;
        }
        int i42 = 160;
        if (iIntValue == 0) {
            int i43 = ((i37 ^ 22) + ((i37 & 22) << 1)) - 1;
            int i44 = i43 % 128;
            f53288t0 = i44;
            i42 = i43 % 2 == 0 ? 29417 : 160;
            int i45 = i44 & 63;
            int i46 = ((((i44 ^ 63) | i45) << 1) - (~(-((i44 | 63) & (~i45))))) - 1;
            f53287s0 = i46 % 128;
            if (i46 % 2 != 0) {
                throw null;
            }
        } else {
            if (iIntValue < 160) {
                int i47 = (i41 & 99) + (i41 | 99);
                f53287s0 = i47 % 128;
                if (i47 % 2 != 0) {
                    throw null;
                }
                int i48 = (-2) - (((i41 ^ 26) + ((i41 & 26) << 1)) ^ (-1));
                f53287s0 = i48 % 128;
                int i49 = i48 % 2;
                return Integer.valueOf(iIntValue);
            }
            int i50 = (((i37 | 124) << 1) - (i37 ^ 124)) - 1;
            f53288t0 = i50 % 128;
            if (i50 % 2 == 0) {
                throw null;
            }
        }
        return Integer.valueOf(i42);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0124, code lost:
    
        if (r8 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013a, code lost:
    
        if ((!((java.math.BigInteger) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r8}, 1952997265, -1952997263, java.lang.System.identityHashCode(r8))).equals(r0)) != true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013c, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.ana.f53288t0 + 55;
        com.mypinpad.tsdk.isolation.ana.f53287s0 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0146, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ana.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10 = f53287s0;
        int i11 = (i10 & 49) + (i10 | 49);
        f53288t0 = i11 % 128;
        int iHashCode = 0;
        if (i11 % 2 == 0) {
            ((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -1926110135, 1926110138, System.identityHashCode(this))).hashCode();
            ((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 1952997265, -1952997263, System.identityHashCode(this))).hashCode();
            throw null;
        }
        int iHashCode2 = ((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -1926110135, 1926110138, System.identityHashCode(this))).hashCode();
        int iHashCode3 = ((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, 1952997265, -1952997263, System.identityHashCode(this))).hashCode();
        int i12 = (~iHashCode3) & iHashCode2;
        int i13 = iHashCode3 & (~iHashCode2);
        int i14 = (i13 & i12) | (i12 ^ i13);
        if (((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -27084180, 27084181, System.identityHashCode(this))) != null) {
            iHashCode = ((BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -27084180, 27084181, System.identityHashCode(this))).hashCode();
            int i15 = f53288t0 + 21;
            f53287s0 = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = f53287s0;
            int i18 = ((i17 ^ 100) + ((i17 & 100) << 1)) - 1;
            f53288t0 = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = (~iHashCode) & i14;
        int i21 = (~i14) & iHashCode;
        int i22 = (i21 & i20) | (i20 ^ i21);
        int i23 = f53287s0;
        int i24 = i23 & 37;
        int i25 = i24 + ((i23 ^ 37) | i24);
        f53288t0 = i25 % 128;
        int i26 = i25 % 2;
        return i22;
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -27084180, 27084181, System.identityHashCode(this));
    }

    public ana(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, amz amzVar) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, amzVar);
    }

    public ana(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this(bigInteger, bigInteger2, null, ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, -322443493, 322443493, i10)).intValue(), i10, null, null);
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -1926110135, 1926110138, System.identityHashCode(this));
    }
}
