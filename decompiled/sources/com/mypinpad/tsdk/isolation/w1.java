package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class w1 implements aul {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61593b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61594c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f61595a;

    public w1(BigInteger bigInteger) {
        this.f61595a = bigInteger;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        int i15 = ((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13;
        if (i15 == 1) {
            w1 w1Var = (w1) objArr[0];
            int i16 = f61594c;
            int i17 = i16 + 93;
            f61593b = i17 % 128;
            int i18 = i17 % 2;
            BigInteger bigInteger = w1Var.f61595a;
            if (i18 != 0) {
                int i19 = 55 / 0;
            }
            int i20 = (i16 ^ 36) + ((i16 & 36) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f61593b = i21 % 128;
            int i22 = i21 % 2;
            return bigInteger;
        }
        if (i15 == 2) {
            int i23 = f61593b;
            int i24 = i23 & 87;
            int i25 = -(-((i23 ^ 87) | i24));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = i26 % 128;
            f61594c = i27;
            int i28 = i26 % 2;
            int i29 = i27 & 29;
            int i30 = (i29 - (~((i27 ^ 29) | i29))) - 1;
            f61593b = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 37 / 0;
            }
            return 1;
        }
        if (i15 != 3) {
            w1 w1Var2 = (w1) objArr[0];
            int i32 = f61593b + 59;
            f61594c = i32 % 128;
            int i33 = i32 % 2;
            BigInteger bigInteger2 = w1Var2.f61595a;
            if (i33 == 0) {
                bigInteger2.hashCode();
                throw null;
            }
            int iHashCode = bigInteger2.hashCode();
            int i34 = f61594c + 9;
            f61593b = i34 % 128;
            if (i34 % 2 == 0) {
                return Integer.valueOf(iHashCode);
            }
            throw null;
        }
        w1 w1Var3 = (w1) objArr[0];
        Object obj = objArr[1];
        int i35 = f61594c;
        int i36 = ~i35;
        int i37 = ((((i35 ^ 109) | (i35 & 109)) << 1) - (~(-((i35 & (-110)) | (i36 & 109))))) - 1;
        int i38 = i37 % 128;
        f61593b = i38;
        int i39 = i37 % 2;
        if (w1Var3 == obj) {
            int i40 = (i35 | 19) << 1;
            int i41 = -((i35 & (-20)) | (i36 & 19));
            int i42 = (i40 & i41) + (i40 | i41);
            int i43 = i42 % 128;
            f61593b = i43;
            boolean z10 = i42 % 2 == 0;
            int i44 = (((i43 ^ 75) | (i43 & 75)) << 1) - (((~i43) & 75) | (i43 & (-76)));
            f61594c = i44 % 128;
            int i45 = i44 % 2;
            return Boolean.valueOf(z10);
        }
        if (!(!(obj instanceof w1))) {
            boolean zEquals = w1Var3.f61595a.equals(((w1) obj).f61595a);
            int i46 = f61594c;
            int i47 = (i46 & 51) + (i46 | 51);
            f61593b = i47 % 128;
            int i48 = i47 % 2;
            return Boolean.valueOf(zEquals);
        }
        int i49 = i38 & 113;
        int i50 = (~i49) & (i38 | 113);
        int i51 = i49 << 1;
        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
        f61594c = i52 % 128;
        int i53 = i52 % 2;
        int i54 = i38 & 119;
        int i55 = -(-((i38 ^ 119) | i54));
        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
        f61594c = i56 % 128;
        int i57 = i56 % 2;
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, 612770537, -612770534, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, 1763649790, -1763649790, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aul
    public final int setDividerPadding() {
        return ((Integer) a(new Object[]{this}, -1683543130, 1683543132, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aul
    public final BigInteger setY() {
        return (BigInteger) a(new Object[]{this}, -1973271849, 1973271850, System.identityHashCode(this));
    }
}
