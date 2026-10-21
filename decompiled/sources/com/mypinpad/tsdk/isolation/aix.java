package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class aix extends adw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52831w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52832x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ajn f52833r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aiw f52834s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public acz f52835t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f52836u0;
    public int v0;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        ajo ajoVar;
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        int i15 = ((i10 | i11 | i12) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221);
        aix aixVar = null;
        switch (i15) {
            case 1:
                aix aixVar2 = (aix) objArr[0];
                System.identityHashCode(aixVar2);
                System.identityHashCode(aixVar2);
                ajn ajnVar = aixVar2.f52833r0;
                ain ainVar = (ain) ajn.setY(new Object[]{ajnVar}, -604046175, 604046182, System.identityHashCode(ajnVar));
                int i16 = f52832x0 + 6;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                f52831w0 = i17 % 128;
                if (i17 % 2 == 0) {
                    return ainVar;
                }
                throw null;
            case 2:
                aix aixVar3 = (aix) objArr[0];
                int i18 = f52831w0;
                int i19 = i18 & 51;
                int i20 = (i19 - (~(-(-((i18 ^ 51) | i19))))) - 1;
                f52832x0 = i20 % 128;
                int i21 = i20 % 2;
                ajn ajnVar2 = aixVar3.f52833r0;
                if (i21 == 0) {
                    throw null;
                }
                Enumeration enumeration = (Enumeration) ajn.setY(new Object[]{ajnVar2}, 679046201, -679046195, System.identityHashCode(ajnVar2));
                int i22 = f52831w0 + 111;
                f52832x0 = i22 % 128;
                int i23 = i22 % 2;
                return enumeration;
            case 3:
                aix aixVar4 = (aix) objArr[0];
                int i24 = f52832x0;
                int i25 = i24 & 47;
                int i26 = i25 + ((i24 ^ 47) | i25);
                f52831w0 = i26 % 128;
                int i27 = i26 % 2;
                ajn ajnVar3 = aixVar4.f52833r0;
                if (i27 != 0) {
                    throw null;
                }
                ajo ajoVar2 = (ajo) ajn.setY(new Object[]{ajnVar3}, 1323607819, -1323607817, System.identityHashCode(ajnVar3));
                int i28 = f52832x0 + 35;
                f52831w0 = i28 % 128;
                int i29 = i28 % 2;
                return ajoVar2;
            case 4:
                aix aixVar5 = (aix) objArr[0];
                adh adhVar = new adh(3);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aixVar5.f52833r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aixVar5.f52834s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, aixVar5.f52835t0}, 240298319, -240298315, adhVar);
                int i30 = f52832x0;
                int i31 = i30 & 49;
                int i32 = (i31 - (~(-(-((i30 ^ 49) | i31))))) - 1;
                f52831w0 = i32 % 128;
                int i33 = i32 % 2;
                return afvVarA;
            case 5:
                aix aixVar6 = (aix) objArr[0];
                int i34 = f52831w0;
                int i35 = (i34 & 68) + (i34 | 68);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                f52832x0 = i36 % 128;
                int i37 = i36 % 2;
                if (!aixVar6.f52836u0) {
                    int i38 = (i34 & 41) + (i34 | 41);
                    f52832x0 = i38 % 128;
                    int i39 = i38 % 2;
                    aixVar6.v0 = super.hashCode();
                    if (i39 == 0) {
                        aixVar6.f52836u0 = false;
                    } else {
                        aixVar6.f52836u0 = true;
                    }
                }
                int i40 = aixVar6.v0;
                int i41 = f52832x0;
                int i42 = (((i41 & (-4)) | ((~i41) & 3)) - (~(-(-((i41 & 3) << 1))))) - 1;
                f52831w0 = i42 % 128;
                int i43 = i42 % 2;
                return Integer.valueOf(i40);
            case 6:
                aix aixVar7 = (aix) objArr[0];
                int i44 = f52831w0;
                int i45 = i44 & 23;
                int i46 = i45 + ((i44 ^ 23) | i45);
                f52832x0 = i46 % 128;
                int i47 = i46 % 2;
                ajn ajnVar4 = aixVar7.f52833r0;
                int iIntValue = ((Integer) ajn.setY(new Object[]{ajnVar4}, -531092194, 531092202, System.identityHashCode(ajnVar4))).intValue();
                int i48 = f52831w0;
                int i49 = i48 & 17;
                int i50 = -(-((i48 ^ 17) | i49));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f52832x0 = i51 % 128;
                if (i51 % 2 == 0) {
                    int i52 = 45 / 0;
                }
                return Integer.valueOf(iIntValue);
            case 7:
                aix aixVar8 = (aix) objArr[0];
                int i53 = f52831w0 + 42;
                int i54 = (i53 ^ (-1)) + (i53 << 1);
                int i55 = i54 % 128;
                f52832x0 = i55;
                int i56 = i54 % 2;
                ajn ajnVar5 = aixVar8.f52833r0;
                int i57 = ((i55 | 115) << 1) - (i55 ^ 115);
                f52831w0 = i57 % 128;
                int i58 = i57 % 2;
                return ajnVar5;
            case 8:
                Object obj = objArr[0];
                int i59 = f52832x0;
                int i60 = ((i59 & 108) + (i59 | 108)) - 1;
                int i61 = i60 % 128;
                f52831w0 = i61;
                int i62 = i60 % 2;
                if (obj instanceof aix) {
                    int i63 = ((i61 | 19) << 1) - (i61 ^ 19);
                    int i64 = i63 % 128;
                    f52832x0 = i64;
                    int i65 = i63 % 2;
                    aixVar = (aix) obj;
                    int i66 = (i64 & (-114)) | ((~i64) & 113);
                    int i67 = -(-((i64 & 113) << 1));
                    int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                    f52831w0 = i68 % 128;
                    int i69 = i68 % 2;
                } else if (obj != null) {
                    aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    aixVar = new aix();
                    aixVar.f52836u0 = false;
                    if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() != 3) {
                        throw new IllegalArgumentException("sequence wrong size for CertificateList");
                    }
                    aixVar.f52833r0 = (ajn) ajn.setY(new Object[]{compoundDrawableTintBlendMode.setX(0)}, 1825094650, -1825094645, (int) System.currentTimeMillis());
                    aixVar.f52834s0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(1)}, 866360717, -866360713, (int) System.currentTimeMillis());
                    aixVar.f52835t0 = (acz) acz.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(2)}, 1095238957, -1095238954, (int) System.currentTimeMillis());
                    int i70 = f52831w0;
                    int i71 = ((i70 ^ 10) + ((i70 & 10) << 1)) - 1;
                    f52832x0 = i71 % 128;
                    int i72 = i71 % 2;
                } else {
                    int i73 = (((i61 ^ 73) | (i61 & 73)) << 1) - (((~i61) & 73) | (i61 & (-74)));
                    f52832x0 = i73 % 128;
                    int i74 = i73 % 2;
                }
                return aixVar;
            case 9:
                aix aixVar9 = (aix) objArr[0];
                int i75 = f52832x0;
                int i76 = ((i75 & 3) - (~(-(-(i75 | 3))))) - 1;
                f52831w0 = i76 % 128;
                int i77 = i76 % 2;
                aiw aiwVar = aixVar9.f52834s0;
                if (i77 == 0) {
                    return aiwVar;
                }
                int i78 = 39 / 0;
                return aiwVar;
            case 10:
                aix aixVar10 = (aix) objArr[0];
                int i79 = f52831w0 + 95;
                f52832x0 = i79 % 128;
                int i80 = i79 % 2;
                ajn ajnVar6 = aixVar10.f52833r0;
                if (i80 == 0) {
                    ajoVar = (ajo) ajn.setY(new Object[]{ajnVar6}, -1274873801, 1274873804, System.identityHashCode(ajnVar6));
                    int i81 = 52 / 0;
                } else {
                    ajoVar = (ajo) ajn.setY(new Object[]{ajnVar6}, -1274873801, 1274873804, System.identityHashCode(ajnVar6));
                }
                int i82 = f52831w0;
                int i83 = i82 & 105;
                int i84 = ((((i82 ^ 105) | i83) << 1) - (~(-((i82 | 105) & (~i83))))) - 1;
                f52832x0 = i84 % 128;
                if (i84 % 2 != 0) {
                    return ajoVar;
                }
                throw null;
            default:
                aix aixVar11 = (aix) objArr[0];
                int i85 = f52831w0 + 1;
                f52832x0 = i85 % 128;
                int i86 = i85 % 2;
                acz aczVar = aixVar11.f52835t0;
                if (i86 != 0) {
                    return aczVar;
                }
                int i87 = 28 / 0;
                return aczVar;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1749925255, -1749925251, System.identityHashCode(this));
    }

    public final ain getNavBarTitleString() {
        return (ain) setY(new Object[]{this}, 557453545, -557453544, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -1102692997, 1102693002, System.identityHashCode(this))).intValue();
    }

    public final Enumeration setCompoundDrawableTintBlendMode() {
        return (Enumeration) setY(new Object[]{this}, 1884419199, -1884419197, System.identityHashCode(this));
    }

    public final aiw setDividerPadding() {
        return (aiw) setY(new Object[]{this}, 1502867703, -1502867694, System.identityHashCode(this));
    }

    public final ajo setNavigationOnClickListener() {
        return (ajo) setY(new Object[]{this}, 751008890, -751008887, System.identityHashCode(this));
    }

    public final acz setOnFocusChangeListener() {
        return (acz) setY(new Object[]{this}, 293652111, -293652111, System.identityHashCode(this));
    }

    public final ajo setOnLongClickListener() {
        return (ajo) setY(new Object[]{this}, -1737109991, 1737110001, System.identityHashCode(this));
    }

    public final ajn setX() {
        return (ajn) setY(new Object[]{this}, -814226959, 814226966, System.identityHashCode(this));
    }

    public static aix setOnFocusChangeListener(Object obj) {
        return (aix) setY(new Object[]{obj}, -1699624989, 1699624997, (int) System.currentTimeMillis());
    }

    public final int setY() {
        return ((Integer) setY(new Object[]{this}, -475540543, 475540549, System.identityHashCode(this))).intValue();
    }
}
