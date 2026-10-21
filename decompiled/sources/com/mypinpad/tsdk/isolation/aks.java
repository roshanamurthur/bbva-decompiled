package com.mypinpad.tsdk.isolation;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class aks extends Permission {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f53012q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f53013r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashSet f53014p0;

    public aks(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f53014p0 = hashSet;
        hashSet.add(str);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (~(i13 | i12)) | (~((~i11) | i13));
        int i15 = ((i11 | i12) * 496) + (((~(i10 | (~i12) | i11)) | i14) * (-496)) + (i14 * 992) + (i11 * (-495)) + (i10 * (-495));
        if (i15 == 1) {
            aks aksVar = (aks) objArr[0];
            int i16 = f53013r0;
            int i17 = i16 & 31;
            int i18 = (i16 ^ 31) | i17;
            int i19 = (i17 & i18) + (i18 | i17);
            f53012q0 = i19 % 128;
            int i20 = i19 % 2;
            String string = aksVar.f53014p0.toString();
            int i21 = f53013r0 + 77;
            f53012q0 = i21 % 128;
            if (i21 % 2 == 0) {
                return string;
            }
            int i22 = 98 / 0;
            return string;
        }
        if (i15 != 2) {
            if (i15 != 3) {
                aks aksVar2 = (aks) objArr[0];
                int i23 = f53012q0;
                int i24 = ((i23 & 126) + (i23 | 126)) - 1;
                f53013r0 = i24 % 128;
                int i25 = i24 % 2;
                int iHashCode = aksVar2.f53014p0.hashCode();
                if (i25 == 0) {
                    int i26 = 86 / 0;
                }
                int i27 = f53012q0;
                int i28 = (-2) - (((i27 ^ 38) + ((i27 & 38) << 1)) ^ (-1));
                f53013r0 = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 74 / 0;
                }
                return Integer.valueOf(iHashCode);
            }
            aks aksVar3 = (aks) objArr[0];
            Object obj = objArr[1];
            int i30 = f53013r0;
            int i31 = i30 & 101;
            int i32 = i30 | 101;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            f53012q0 = i33 % 128;
            if (i33 % 2 != 0) {
                boolean z10 = obj instanceof aks;
                throw null;
            }
            if (!(obj instanceof aks) || (!aksVar3.f53014p0.equals(((aks) obj).f53014p0))) {
                int i34 = f53013r0;
                int i35 = (-2) - ((((i34 | 60) << 1) - (i34 ^ 60)) ^ (-1));
                f53012q0 = i35 % 128;
                if (i35 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i36 = f53013r0;
            int i37 = i36 & 19;
            int i38 = (i36 ^ 19) | i37;
            int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
            f53012q0 = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i36 ^ 43;
            int i42 = ((i36 & 43) | i41) << 1;
            int i43 = -i41;
            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
            f53012q0 = i44 % 128;
            int i45 = i44 % 2;
            return Boolean.TRUE;
        }
        aks aksVar4 = (aks) objArr[0];
        Permission permission = (Permission) objArr[1];
        int i46 = f53012q0;
        int i47 = i46 & 17;
        int i48 = ((i46 ^ 17) | i47) << 1;
        int i49 = -((i46 | 17) & (~i47));
        int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
        int i51 = i50 % 128;
        f53013r0 = i51;
        int i52 = i50 % 2;
        if (permission instanceof aks) {
            int i53 = (i51 & (-8)) | ((~i51) & 7);
            int i54 = -(-((i51 & 7) << 1));
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            f53012q0 = i55 % 128;
            int i56 = i55 % 2;
            aks aksVar5 = (aks) permission;
            if (aksVar4.getName().equals(aksVar5.getName())) {
                int i57 = f53012q0;
                int i58 = i57 & 61;
                int i59 = -(-(i57 | 61));
                int i60 = (i58 & i59) + (i59 | i58);
                int i61 = i60 % 128;
                f53013r0 = i61;
                int i62 = i60 % 2;
                int i63 = i61 & 43;
                int i64 = (((i61 | 43) & (~i63)) - (~(i63 << 1))) - 1;
                f53012q0 = i64 % 128;
                int i65 = i64 % 2;
            } else if (aksVar4.f53014p0.containsAll(aksVar5.f53014p0)) {
                int i66 = f53013r0;
                int i67 = ((i66 | 43) << 1) - (i66 ^ 43);
                f53012q0 = i67 % 128;
                int i68 = i67 % 2;
                int i69 = i66 & 53;
                int i70 = i69 + ((i66 ^ 53) | i69);
                f53012q0 = i70 % 128;
                if (i70 % 2 != 0) {
                    throw null;
                }
            }
            return Boolean.TRUE;
        }
        int i71 = f53012q0 + 126;
        int i72 = (i71 ^ (-1)) + (i71 << 1);
        f53013r0 = i72 % 128;
        int i73 = i72 % 2;
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -869961865, 869961868, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Permission
    public final String getActions() {
        return (String) setX(new Object[]{this}, 455203971, -455203970, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -101430507, 101430507, System.identityHashCode(this))).intValue();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        return ((Boolean) setX(new Object[]{this, permission}, -1885084293, 1885084295, System.identityHashCode(this))).booleanValue();
    }
}
