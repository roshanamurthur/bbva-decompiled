package com.mypinpad.tsdk.isolation;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class v1 implements aur {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61448b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61449c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f61450a;

    public static /* synthetic */ Serializable a(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        boolean zBooleanValue;
        int i13 = ~i10;
        int i14 = (((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303);
        if (i14 == 1) {
            v1 v1Var = (v1) objArr[0];
            int i15 = f61449c;
            int i16 = i15 ^ 89;
            int i17 = ((((i15 & 89) | i16) << 1) - (~(-i16))) - 1;
            f61448b = i17 % 128;
            int i18 = i17 % 2;
            int[] iArr = v1Var.f61450a;
            if (i18 != 0) {
                throw null;
            }
            objValueOf = (int[]) bek.setOnFocusChangeListener(new Object[]{iArr}, -1653586244, 1653586266, (int) System.currentTimeMillis());
            int i19 = f61448b;
            int i20 = ((i19 | 69) << 1) - (i19 ^ 69);
            f61449c = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 83 / 0;
            }
        } else if (i14 == 2) {
            v1 v1Var2 = (v1) objArr[0];
            int i22 = f61448b;
            int i23 = i22 & 47;
            int i24 = (((i22 | 47) & (~i23)) - (~(-(-(i23 << 1))))) - 1;
            f61449c = i24 % 128;
            int i25 = i24 % 2;
            int[] iArr2 = v1Var2.f61450a;
            int length = iArr2.length;
            int iIdentityHashCode = System.identityHashCode(v1Var2);
            int i26 = -(-(length * 185));
            int i27 = 183 & i26;
            int i28 = (i27 - (~((i26 ^ 183) | i27))) - 1;
            int i29 = -(-(length * (-368)));
            int i30 = i28 & i29;
            int i31 = i29 | i28;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i33 = ~length;
            int i34 = ~i33;
            int i35 = (i33 & i34) | (i34 ^ i33);
            int i36 = ~iIdentityHashCode;
            int i37 = -(~(-(-(((i35 & i36) | (i35 ^ i36)) * 184))));
            int i38 = ((i32 ^ i37) + ((i37 & i32) << 1)) - 1;
            int i39 = (iIdentityHashCode | i36) & i36;
            int i40 = ~i39;
            int i41 = ~((i39 & i40) | (i40 ^ i39));
            int i42 = i34 ^ i41;
            int i43 = i41 & i34;
            int i44 = (i43 & i42) | (i42 ^ i43);
            int i45 = ~(length | ((-1) ^ length));
            int i46 = ((i44 & i45) | (i44 ^ i45)) * 184;
            int i47 = i38 & i46;
            int i48 = iArr2[((((i38 ^ i46) | i47) << 1) - (~(-((i46 | i38) & (~i47))))) - 1];
            int i49 = f61448b;
            int i50 = i49 & 53;
            int i51 = (i49 | 53) & (~i50);
            int i52 = -(-(i50 << 1));
            int i53 = (i51 & i52) + (i51 | i52);
            f61449c = i53 % 128;
            if (i53 % 2 == 0) {
                throw null;
            }
            objValueOf = Integer.valueOf(i48);
        } else if (i14 != 3) {
            v1 v1Var3 = (v1) objArr[0];
            Object obj = objArr[1];
            int i54 = f61448b;
            int i55 = i54 ^ 69;
            int i56 = (((i54 & 69) | i55) << 1) - i55;
            int i57 = i56 % 128;
            f61449c = i57;
            int i58 = i56 % 2;
            if (v1Var3 == obj) {
                int i59 = i54 + 75;
                int i60 = i59 % 128;
                f61449c = i60;
                int i61 = i59 % 2;
                int i62 = (i60 & (-68)) | ((~i60) & 67);
                int i63 = -(-((i60 & 67) << 1));
                int i64 = (i62 & i63) + (i63 | i62);
                f61448b = i64 % 128;
                if (i64 % 2 != 0) {
                    int i65 = 6 / 0;
                }
                objValueOf = Boolean.TRUE;
            } else {
                if (!(obj instanceof v1)) {
                    int i66 = i57 & 89;
                    int i67 = i66 + ((i57 ^ 89) | i66);
                    f61448b = i67 % 128;
                    zBooleanValue = !(i67 % 2 == 0);
                } else {
                    zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{v1Var3.f61450a, ((v1) obj).f61450a}, -1688418299, 1688418315, (int) System.currentTimeMillis())).booleanValue();
                    int i68 = f61448b;
                    int i69 = i68 & 41;
                    int i70 = i69 + ((i68 ^ 41) | i69);
                    f61449c = i70 % 128;
                    int i71 = i70 % 2;
                }
                objValueOf = Boolean.valueOf(zBooleanValue);
            }
        } else {
            v1 v1Var4 = (v1) objArr[0];
            int i72 = f61449c;
            int i73 = i72 ^ 97;
            int i74 = (i72 & 97) << 1;
            int i75 = (i73 & i74) + (i74 | i73);
            f61448b = i75 % 128;
            int i76 = i75 % 2;
            int[] iArr3 = v1Var4.f61450a;
            if (i76 != 0) {
                ((Integer) bek.setOnFocusChangeListener(new Object[]{iArr3}, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue();
                throw null;
            }
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{iArr3}, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue();
            int i77 = f61449c;
            int i78 = (i77 & 61) + (i77 | 61);
            f61448b = i78 % 128;
            int i79 = i78 % 2;
            objValueOf = Integer.valueOf(iIntValue);
        }
        return (Serializable) objValueOf;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, 929099116, -929099116, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, -671441778, 671441781, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aur
    public final int[] setOnFocusChangeListener() {
        return (int[]) a(new Object[]{this}, -1665518458, 1665518459, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aur
    public final int setX() {
        return ((Integer) a(new Object[]{this}, -13089826, 13089828, System.identityHashCode(this))).intValue();
    }
}
