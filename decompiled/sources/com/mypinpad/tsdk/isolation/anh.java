package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public class anh implements akk {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53318t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f53319u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f53320p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f53321q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f53322r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final anf f53323s0;

    public anh(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, anf anfVar) {
        this.f53320p0 = bigInteger3;
        this.f53322r0 = bigInteger;
        this.f53321q0 = bigInteger2;
        this.f53323s0 = anfVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        if (i16 == 1) {
            anh anhVar = (anh) objArr[0];
            int i17 = f53319u0;
            int i18 = i17 ^ 65;
            int i19 = ((((i17 & 65) | i18) << 1) - (~(-i18))) - 1;
            f53318t0 = i19 % 128;
            int i20 = i19 % 2;
            anf anfVar = anhVar.f53323s0;
            int i21 = (-2) - ((((i17 | 36) << 1) - (i17 ^ 36)) ^ (-1));
            f53318t0 = i21 % 128;
            if (i21 % 2 == 0) {
                return anfVar;
            }
            throw null;
        }
        if (i16 == 2) {
            anh anhVar2 = (anh) objArr[0];
            int i22 = f53318t0;
            int i23 = i22 | 51;
            int i24 = (i23 << 1) - ((~(i22 & 51)) & i23);
            int i25 = i24 % 128;
            f53319u0 = i25;
            int i26 = i24 % 2;
            BigInteger bigInteger = anhVar2.f53320p0;
            int i27 = i25 & 77;
            int i28 = -(-((i25 ^ 77) | i27));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f53318t0 = i29 % 128;
            int i30 = i29 % 2;
            return bigInteger;
        }
        if (i16 != 3) {
            anh anhVar3 = (anh) objArr[0];
            int i31 = f53319u0;
            int i32 = ((i31 | 49) << 1) - (i31 ^ 49);
            f53318t0 = i32 % 128;
            int i33 = i32 % 2;
            BigInteger bigInteger2 = anhVar3.f53322r0;
            if (i33 == 0) {
                return bigInteger2;
            }
            throw null;
        }
        anh anhVar4 = (anh) objArr[0];
        int i34 = f53319u0 + 103;
        int i35 = i34 % 128;
        f53318t0 = i35;
        int i36 = i34 % 2;
        BigInteger bigInteger3 = anhVar4.f53321q0;
        if (i36 != 0) {
            int i37 = 98 / 0;
        }
        int i38 = ((i35 & 82) + (i35 | 82)) - 1;
        f53319u0 = i38 % 128;
        if (i38 % 2 != 0) {
            return bigInteger3;
        }
        int i39 = 83 / 0;
        return bigInteger3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0083  */
    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
    public boolean equals(Object obj) {
        int i10;
        BigInteger bigInteger;
        int i11;
        int i12 = f53319u0;
        int i13 = (i12 | 93) << 1;
        int i14 = -(i12 ^ 93);
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        int i16 = i15 % 128;
        f53318t0 = i16;
        if (i15 % 2 != 0) {
            boolean z10 = obj instanceof anh;
            throw null;
        }
        if (!(obj instanceof anh)) {
            int i17 = i16 & 53;
            int i18 = (i16 ^ 53) | i17;
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            int i20 = i19 % 128;
            f53319u0 = i20;
            int i21 = i19 % 2;
            int i22 = i20 ^ 101;
            int i23 = (i20 & 101) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f53318t0 = i24 % 128;
            int i25 = i24 % 2;
            return false;
        }
        anh anhVar = (anh) obj;
        if (!(!((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))).equals(this.f53322r0))) {
            int i26 = f53318t0;
            int i27 = i26 & 43;
            int i28 = (i26 ^ 43) | i27;
            int i29 = (i27 & i28) + (i28 | i27);
            f53319u0 = i29 % 128;
            int i30 = i29 % 2;
            BigInteger bigInteger2 = this.f53321q0;
            if (i30 == 0) {
                int i31 = 38 / 0;
                if (((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -11125249, 11125252, System.identityHashCode(anhVar))).equals(bigInteger2)) {
                    int i32 = f53318t0;
                    int i33 = i32 & 105;
                    int i34 = (i33 - (~(-(-((i32 ^ 105) | i33))))) - 1;
                    f53319u0 = i34 % 128;
                    i10 = i34 % 2;
                    bigInteger = this.f53320p0;
                    if (i10 != 0) {
                        ((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -213177263, 213177265, System.identityHashCode(anhVar))).equals(bigInteger);
                        throw null;
                    }
                    if (((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -213177263, 213177265, System.identityHashCode(anhVar))).equals(bigInteger)) {
                        int i35 = f53319u0;
                        int i36 = (i35 & 121) + (i35 | 121);
                        f53318t0 = i36 % 128;
                        int i37 = i36 % 2;
                        i11 = i35 + 35;
                        f53318t0 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i38 = 9 / 0;
                        }
                        return true;
                    }
                }
            } else if (((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -11125249, 11125252, System.identityHashCode(anhVar))).equals(bigInteger2)) {
                int i39 = f53318t0;
                int i310 = i39 & 105;
                int i311 = (i310 - (~(-(-((i39 ^ 105) | i310))))) - 1;
                f53319u0 = i311 % 128;
                i10 = i311 % 2;
                bigInteger = this.f53320p0;
                if (i10 != 0) {
                    ((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -213177263, 213177265, System.identityHashCode(anhVar))).equals(bigInteger);
                    throw null;
                }
                if (((BigInteger) setOnFocusChangeListener(new Object[]{anhVar}, -213177263, 213177265, System.identityHashCode(anhVar))).equals(bigInteger)) {
                    int i312 = f53319u0;
                    int i313 = (i312 & 121) + (i312 | 121);
                    f53318t0 = i313 % 128;
                    int i314 = i313 % 2;
                    i11 = i312 + 35;
                    f53318t0 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i315 = 9 / 0;
                    }
                    return true;
                }
            }
        }
        int i40 = f53318t0;
        int i41 = ((i40 | 105) << 1) - (i40 ^ 105);
        f53319u0 = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = 26 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i10 = f53318t0;
        int i11 = (i10 & (-66)) | ((~i10) & 65);
        int i12 = -(-((i10 & 65) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53319u0 = i13 % 128;
        int i14 = i13 % 2;
        int iHashCode = ((BigInteger) setOnFocusChangeListener(new Object[]{this}, -1766607053, 1766607053, System.identityHashCode(this))).hashCode();
        int iHashCode2 = ((BigInteger) setOnFocusChangeListener(new Object[]{this}, -11125249, 11125252, System.identityHashCode(this))).hashCode();
        int i15 = (iHashCode | iHashCode2) & (~(iHashCode & iHashCode2));
        int iHashCode3 = ((BigInteger) setOnFocusChangeListener(new Object[]{this}, -213177263, 213177265, System.identityHashCode(this))).hashCode();
        int i16 = i15 & iHashCode3;
        int i17 = ((i15 ^ iHashCode3) | i16) & (~i16);
        int i18 = f53319u0;
        int i19 = (i18 & 107) + (i18 | 107);
        f53318t0 = i19 % 128;
        if (i19 % 2 == 0) {
            return i17;
        }
        throw null;
    }

    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, -1766607053, 1766607053, System.identityHashCode(this));
    }

    public final anf setDividerPadding() {
        return (anf) setOnFocusChangeListener(new Object[]{this}, -291403566, 291403567, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, -213177263, 213177265, System.identityHashCode(this));
    }

    public anh(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f53320p0 = bigInteger3;
        this.f53322r0 = bigInteger;
        this.f53321q0 = bigInteger2;
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setOnFocusChangeListener(new Object[]{this}, -11125249, 11125252, System.identityHashCode(this));
    }
}
