package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class u1 implements auq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61228c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61229d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aul f61230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public aur f61231b;

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        int i17 = (((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529));
        if (i17 == 1) {
            u1 u1Var = (u1) objArr[0];
            int i18 = f61229d;
            int i19 = (i18 & (-52)) | ((~i18) & 51);
            int i20 = -(-((i18 & 51) << 1));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f61228c = i21 % 128;
            if (i21 % 2 != 0) {
                int iHashCode = u1Var.f61230a.hashCode();
                int iHashCode2 = u1Var.f61231b.hashCode();
                iIntValue = ((Integer) beq.setY(new Object[]{Integer.valueOf(iHashCode2), 118}, 582008537, -582008536, iHashCode2)).intValue() ^ iHashCode;
            } else {
                int iHashCode3 = u1Var.f61230a.hashCode();
                int iHashCode4 = u1Var.f61231b.hashCode();
                int iIntValue2 = ((Integer) beq.setY(new Object[]{Integer.valueOf(iHashCode4), 16}, 582008537, -582008536, iHashCode4)).intValue();
                int i22 = iHashCode3 & iIntValue2;
                iIntValue = ((iIntValue2 ^ iHashCode3) | i22) & (~i22);
            }
            int i23 = f61228c;
            int i24 = i23 & 13;
            int i25 = ((((i23 ^ 13) | i24) << 1) - (~(-((i23 | 13) & (~i24))))) - 1;
            f61229d = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 48 / 0;
            }
            return Integer.valueOf(iIntValue);
        }
        if (i17 == 2) {
            u1 u1Var2 = (u1) objArr[0];
            int i27 = f61228c;
            int i28 = i27 & 85;
            int i29 = (i28 - (~(-(-((i27 ^ 85) | i28))))) - 1;
            int i30 = i29 % 128;
            f61229d = i30;
            int i31 = i29 % 2;
            aur aurVar = u1Var2.f61231b;
            int i32 = ((i30 & 34) + (i30 | 34)) - 1;
            f61228c = i32 % 128;
            if (i32 % 2 == 0) {
                return aurVar;
            }
            int i33 = 97 / 0;
            return aurVar;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                u1 u1Var3 = (u1) objArr[0];
                int i34 = f61228c + 77;
                f61229d = i34 % 128;
                int i35 = i34 % 2;
                BigInteger y7 = u1Var3.f61230a.setY();
                int i36 = f61228c;
                int i37 = i36 ^ 73;
                int i38 = ((i36 & 73) | i37) << 1;
                int i39 = -i37;
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                f61229d = i40 % 128;
                if (i40 % 2 != 0) {
                    return y7;
                }
                throw null;
            }
            u1 u1Var4 = (u1) objArr[0];
            int i41 = f61229d;
            int i42 = (i41 & (-54)) | ((~i41) & 53);
            int i43 = -(-((i41 & 53) << 1));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            f61228c = i44 % 128;
            int i45 = i44 % 2;
            int x4 = u1Var4.f61231b.setX() * u1Var4.f61230a.setDividerPadding();
            int i46 = f61229d;
            int i47 = i46 ^ 81;
            int i48 = (i46 & 81) << 1;
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            f61228c = i49 % 128;
            if (i49 % 2 != 0) {
                int i50 = 5 / 0;
            }
            return Integer.valueOf(x4);
        }
        u1 u1Var5 = (u1) objArr[0];
        Object obj = objArr[1];
        int i51 = f61228c;
        int i52 = i51 & 97;
        int i53 = (i52 - (~((i51 ^ 97) | i52))) - 1;
        f61229d = i53 % 128;
        if (i53 % 2 == 0) {
            throw null;
        }
        if (u1Var5 != obj) {
            if (obj instanceof u1) {
                u1 u1Var6 = (u1) obj;
                if (u1Var5.f61230a.equals(u1Var6.f61230a)) {
                    int i54 = f61229d;
                    int i55 = ((i54 & (-32)) | ((~i54) & 31)) + ((i54 & 31) << 1);
                    f61228c = i55 % 128;
                    int i56 = i55 % 2;
                    aur aurVar2 = u1Var5.f61231b;
                    aur aurVar3 = u1Var6.f61231b;
                    if (i56 != 0) {
                        aurVar2.equals(aurVar3);
                        throw null;
                    }
                    if (aurVar2.equals(aurVar3)) {
                        int i57 = f61229d;
                        int i58 = i57 & 35;
                        int i59 = (((i57 ^ 35) | i58) << 1) - ((i57 | 35) & (~i58));
                        f61228c = i59 % 128;
                        if (i59 % 2 != 0) {
                            int i60 = 54 / 0;
                        }
                    }
                }
                int i61 = f61229d;
                int i62 = i61 & 109;
                int i63 = -(-(i61 | 109));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                f61228c = i64 % 128;
                if (i64 % 2 != 0) {
                    throw null;
                }
            } else {
                int i65 = (i51 ^ 54) + ((i51 & 54) << 1);
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                int i67 = i66 % 128;
                f61229d = i67;
                int i68 = i66 % 2;
                int i69 = i67 + 15;
                f61228c = i69 % 128;
                int i70 = i69 % 2;
            }
            return Boolean.FALSE;
        }
        int i71 = i51 & 17;
        int i72 = i71 + ((i51 ^ 17) | i71);
        f61229d = i72 % 128;
        int i73 = i72 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, 767828136, -767828133, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, -714861572, 714861573, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aul
    public final int setDividerPadding() {
        return ((Integer) a(new Object[]{this}, 727781029, -727781025, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.auq
    public final aur setX() {
        return (aur) a(new Object[]{this}, 131880726, -131880724, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aul
    public final BigInteger setY() {
        return (BigInteger) a(new Object[]{this}, -804246719, 804246719, System.identityHashCode(this));
    }
}
