package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class zk {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f62389k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f62390l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final zl f62391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xh f62392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final zj f62393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final yd f62394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public zn.setX f62395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public zn f62396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public yp f62400j;

    public zk(@NotNull zl zlVar, @NotNull xh xhVar, @NotNull zj zjVar, @NotNull yd ydVar) {
        Intrinsics.checkNotNullParameter(zlVar, "");
        Intrinsics.checkNotNullParameter(xhVar, "");
        Intrinsics.checkNotNullParameter(zjVar, "");
        Intrinsics.checkNotNullParameter(ydVar, "");
        this.f62391a = zlVar;
        this.f62392b = xhVar;
        this.f62393c = zjVar;
        this.f62394d = ydVar;
    }

    public static /* synthetic */ zi a(Object[] objArr) throws Throwable {
        zk zkVar = (zk) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        char c10 = 4;
        int iIntValue4 = ((Number) objArr[4]).intValue();
        char c11 = 5;
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        int i10 = 6;
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        while (true) {
            Object[] objArr2 = new Object[i10];
            objArr2[0] = zkVar;
            objArr2[1] = Integer.valueOf(iIntValue);
            objArr2[2] = Integer.valueOf(iIntValue2);
            objArr2[3] = Integer.valueOf(iIntValue3);
            objArr2[c10] = Integer.valueOf(iIntValue4);
            objArr2[c11] = Boolean.valueOf(zBooleanValue);
            zi ziVar = (zi) setCompoundDrawableTintBlendMode(objArr2, 55173169, -55173163, iIntValue);
            if (!(!((Boolean) zi.setY(new Object[]{ziVar, Boolean.valueOf(zBooleanValue2)}, -1129274435, 1129274446, System.identityHashCode(ziVar))).booleanValue())) {
                int i11 = f62389k;
                int i12 = i11 | 41;
                int i13 = (i12 << 1) - ((~(i11 & 41)) & i12);
                f62390l = i13 % 128;
                if (i13 % 2 != 0) {
                    return ziVar;
                }
                throw null;
            }
            ziVar.setOnDragListener();
            if (zkVar.f62400j == null) {
                int i14 = f62389k + 3;
                int i15 = i14 % 128;
                f62390l = i15;
                int i16 = i14 % 2;
                zn.setX setx = zkVar.f62395e;
                if (setx == null) {
                    int i17 = i15 & 101;
                    int i18 = i17 + ((i15 ^ 101) | i17);
                    int i19 = i18 % 128;
                    f62389k = i19;
                    int i20 = i18 % 2;
                    int i21 = (((i19 & (-62)) | ((~i19) & 61)) - (~((i19 & 61) << 1))) - 1;
                    f62390l = i21 % 128;
                    int i22 = i21 % 2;
                } else {
                    boolean zBooleanValue3 = ((Boolean) zn.setX.setOnFocusChangeListener(new Object[]{setx}, 1465233870, -1465233868, System.identityHashCode(setx))).booleanValue();
                    int i23 = f62389k;
                    int i24 = ((i23 ^ 12) + ((i23 & 12) << 1)) - 1;
                    int i25 = i24 % 128;
                    f62390l = i25;
                    int i26 = i24 % 2;
                    if (zBooleanValue3) {
                        continue;
                    } else {
                        int i27 = (-2) - ((i25 + 14) ^ (-1));
                        f62389k = i27 % 128;
                        int i28 = i27 % 2;
                        zn znVar = zkVar.f62396f;
                        if (znVar == null) {
                            int i29 = i25 + 11;
                            f62389k = i29 % 128;
                            int i30 = i29 % 2;
                            int i31 = i25 & 125;
                            int i32 = (i25 ^ 125) | i31;
                            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                            f62389k = i33 % 128;
                            int i34 = i33 % 2;
                        } else {
                            boolean zBooleanValue4 = ((Boolean) zn.setOnFocusChangeListener(new Object[]{znVar}, 2116206812, -2116206806, System.identityHashCode(znVar))).booleanValue();
                            int i35 = f62390l;
                            int i36 = i35 ^ 109;
                            int i37 = -(-((i35 & 109) << 1));
                            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                            f62389k = i38 % 128;
                            int i39 = i38 % 2;
                            if (!zBooleanValue4) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                }
            }
            c10 = 4;
            c11 = 5;
            i10 = 6;
        }
    }

    public static /* synthetic */ zu b(Object[] objArr) throws Throwable {
        int i10;
        boolean z10;
        zk zkVar = (zk) objArr[0];
        ym ymVar = (ym) objArr[1];
        zs zsVar = (zs) objArr[2];
        int i11 = f62389k;
        int i12 = (i11 & (-30)) | ((~i11) & 29);
        int i13 = (i11 & 29) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        f62390l = i14 % 128;
        try {
            try {
                if (i14 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ymVar, "");
                    Intrinsics.checkNotNullParameter(zsVar, "");
                    ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -1546537127, 1546537132, System.identityHashCode(zsVar))).intValue();
                    ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -71337801, 71337801, System.identityHashCode(zsVar))).intValue();
                    ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 1387657808, -1387657796, System.identityHashCode(zsVar))).intValue();
                    ((Integer) ym.setY(new Object[]{ymVar}, -1320407555, 1320407563, System.identityHashCode(ymVar))).intValue();
                    ((Boolean) ym.setY(new Object[]{ymVar}, 219894012, -219894007, System.identityHashCode(ymVar))).booleanValue();
                    yk ykVar = (yk) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 541338608, -541338597, System.identityHashCode(zsVar));
                    Intrinsics.areEqual((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar)), "GET");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(ymVar, "");
                Intrinsics.checkNotNullParameter(zsVar, "");
                int iIntValue = ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -1546537127, 1546537132, System.identityHashCode(zsVar))).intValue();
                int iIntValue2 = ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -71337801, 71337801, System.identityHashCode(zsVar))).intValue();
                int iIntValue3 = ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 1387657808, -1387657796, System.identityHashCode(zsVar))).intValue();
                int iIntValue4 = ((Integer) ym.setY(new Object[]{ymVar}, -1320407555, 1320407563, System.identityHashCode(ymVar))).intValue();
                boolean zBooleanValue = ((Boolean) ym.setY(new Object[]{ymVar}, 219894012, -219894007, System.identityHashCode(ymVar))).booleanValue();
                yk ykVar2 = (yk) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 541338608, -541338597, System.identityHashCode(zsVar));
                if (Intrinsics.areEqual((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, -441618648, 441618657, System.identityHashCode(ykVar2)), "GET")) {
                    int i15 = f62390l;
                    int i16 = i15 & 17;
                    int i17 = (i16 - (~((i15 ^ 17) | i16))) - 1;
                    f62389k = i17 % 128;
                    int i18 = i17 % 2;
                    z10 = false;
                } else {
                    int i19 = f62389k;
                    int i20 = (i19 & 37) + (i19 | 37);
                    f62390l = i20 % 128;
                    int i21 = i20 % 2;
                    z10 = true;
                }
                Object[] objArr2 = new Object[7];
                objArr2[0] = zkVar;
                objArr2[1] = Integer.valueOf(iIntValue);
                try {
                    objArr2[2] = Integer.valueOf(iIntValue2);
                    objArr2[3] = Integer.valueOf(iIntValue3);
                    objArr2[4] = Integer.valueOf(iIntValue4);
                    objArr2[5] = Boolean.valueOf(zBooleanValue);
                    objArr2[6] = Boolean.valueOf(z10);
                    zi ziVar = (zi) setCompoundDrawableTintBlendMode(objArr2, 703153690, -703153688, iIntValue);
                    Object[] objArr3 = new Object[3];
                    objArr3[0] = ziVar;
                    objArr3[1] = ymVar;
                    try {
                        objArr3[2] = zsVar;
                        zu zuVar = (zu) zi.setY(objArr3, -439057157, 439057165, System.identityHashCode(ziVar));
                        int i22 = f62390l;
                        int i23 = ((i22 | 125) << 1) - (i22 ^ 125);
                        f62389k = i23 % 128;
                        int i24 = i23 % 2;
                        return zuVar;
                    } catch (IOException e5) {
                        e = e5;
                        i10 = 2;
                        Object[] objArr4 = new Object[i10];
                        objArr4[0] = zkVar;
                        objArr4[1] = e;
                        setCompoundDrawableTintBlendMode(objArr4, -1134943920, 1134943920, System.identityHashCode(zkVar));
                        throw new zp(e);
                    }
                } catch (IOException e7) {
                    e = e7;
                    i10 = 2;
                }
            } catch (IOException e10) {
                e = e10;
                i10 = 2;
            }
        } catch (zp e11) {
            setCompoundDrawableTintBlendMode(new Object[]{zkVar, (IOException) zp.setY(new Object[]{e11}, -1143255038, 1143255039, System.identityHashCode(e11))}, -1134943920, 1134943920, System.identityHashCode(zkVar));
            throw e11;
        }
    }

    public static /* synthetic */ yp c(Object[] objArr) throws Throwable {
        zk zkVar = (zk) objArr[0];
        if (zkVar.f62397g > 1 || zkVar.f62398h > 1 || zkVar.f62399i > 0) {
            return null;
        }
        zj zjVar = zkVar.f62393c;
        zi ziVar = (zi) zj.setDividerPadding(new Object[]{zjVar}, -1111096522, 1111096522, System.identityHashCode(zjVar));
        if (ziVar == null) {
            return null;
        }
        synchronized (ziVar) {
            if (((Integer) zi.setY(new Object[]{ziVar}, -1232914860, 1232914882, System.identityHashCode(ziVar))).intValue() != 0) {
                return null;
            }
            yp ypVar = (yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar));
            xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
            yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
            xh xhVar2 = (xh) setCompoundDrawableTintBlendMode(new Object[]{zkVar}, 1713402499, -1713402496, System.identityHashCode(zkVar));
            if (!yt.setOnFocusChangeListener(ygVar, (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2)))) {
                return null;
            }
            return (yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x076e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0772  */
    /* JADX WARN: Code duplicated, block: B:128:0x079e  */
    /* JADX WARN: Code duplicated, block: B:130:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:132:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x07da  */
    /* JADX WARN: Code duplicated, block: B:139:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:142:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x0803  */
    /* JADX WARN: Code duplicated, block: B:145:0x081d  */
    /* JADX WARN: Code duplicated, block: B:147:0x084d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0869  */
    /* JADX WARN: Code duplicated, block: B:153:0x0878  */
    /* JADX WARN: Code duplicated, block: B:165:0x06a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0257 A[PHI: r0
      0x0257: PHI (r0v106 com.mypinpad.tsdk.i.yg) = (r0v105 com.mypinpad.tsdk.i.yg), (r0v129 com.mypinpad.tsdk.i.yg) binds: [B:26:0x0255, B:23:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0280  */
    /* JADX WARN: Code duplicated, block: B:32:0x029b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0655  */
    /* JADX WARN: Code duplicated, block: B:92:0x06a0  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object objValueOf;
        yp ypVar;
        zn.setX setx;
        boolean zBooleanValue;
        int i13;
        int i14;
        int i15;
        zn znVar;
        int i16;
        int i17;
        int i18;
        List list;
        zi ziVar;
        zl zlVar;
        Socket socket;
        yg ygVar;
        int i19;
        int i20 = ~i12;
        int i21 = ~(i20 | i10);
        int i22 = ((i11 | i21) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i23 = ~((~i10) | i11);
        boolean z10 = true;
        switch ((((~(i10 | (~i11))) | i23 | i21) * 764) + (((~(i20 | i11)) | i23) * (-1528)) + i22) {
            case 1:
                return c(objArr);
            case 2:
                return a(objArr);
            case 3:
                zk zkVar = (zk) objArr[0];
                int i24 = f62390l + 113;
                int i25 = i24 % 128;
                f62389k = i25;
                int i26 = i24 % 2;
                objValueOf = zkVar.f62392b;
                int i27 = (i25 & (-28)) | ((~i25) & 27);
                int i28 = (i25 & 27) << 1;
                int i29 = (i27 & i28) + (i27 | i28);
                f62390l = i29 % 128;
                if (i29 % 2 == 0) {
                    throw null;
                }
                break;
            case 4:
                return b(objArr);
            case 5:
                zk zkVar2 = (zk) objArr[0];
                int i30 = f62389k + 47;
                int i31 = i30 % 128;
                f62390l = i31;
                if (i30 % 2 == 0) {
                    int i32 = zkVar2.f62397g;
                    throw null;
                }
                if (zkVar2.f62397g != 0) {
                    if (zkVar2.f62400j == null) {
                        ypVar = (yp) setCompoundDrawableTintBlendMode(new Object[]{zkVar2}, 351046834, -351046833, System.identityHashCode(zkVar2));
                        if (ypVar == null) {
                            setx = zkVar2.f62395e;
                            if (setx != null) {
                                if (((Boolean) zn.setX.setOnFocusChangeListener(new Object[]{setx}, 1465233870, -1465233868, System.identityHashCode(setx))).booleanValue()) {
                                    int i33 = f62389k;
                                    int i34 = i33 & 5;
                                    int i35 = (~i34) & (i33 | 5);
                                    int i36 = i34 << 1;
                                    int i37 = (i35 & i36) + (i36 | i35);
                                    f62390l = i37 % 128;
                                    int i38 = i37 % 2;
                                    int i39 = i33 & 1;
                                    int i40 = (((i33 | 1) & (~i39)) - (~(-(-(i39 << 1))))) - 1;
                                    int i41 = i40 % 128;
                                    f62390l = i41;
                                    int i42 = i40 % 2;
                                    int i43 = (i41 & 35) + (i41 | 35);
                                    f62389k = i43 % 128;
                                    zBooleanValue = !(i43 % 2 != 0);
                                }
                                objValueOf = Boolean.valueOf(zBooleanValue);
                            } else {
                                int i44 = f62390l;
                                int i45 = ((i44 | 9) << 1) - (i44 ^ 9);
                                int i46 = i45 % 128;
                                f62389k = i46;
                                int i47 = i45 % 2;
                                int i48 = i46 + 45;
                                f62390l = i48 % 128;
                                int i49 = i48 % 2;
                            }
                            i13 = f62389k;
                            i14 = i13 & 35;
                            i15 = i14 << 1;
                            int i50 = (i13 ^ 35) + i15;
                            f62390l = i50 % 128;
                            int i51 = i50 % 2;
                            znVar = zkVar2.f62396f;
                            if (znVar != null) {
                                zBooleanValue = ((Boolean) zn.setOnFocusChangeListener(new Object[]{znVar}, 2116206812, -2116206806, System.identityHashCode(znVar))).booleanValue();
                                int i52 = f62390l;
                                int i53 = i52 ^ 109;
                                int i54 = ((i52 & 109) | i53) << 1;
                                int i55 = -i53;
                                int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                                f62389k = i56 % 128;
                                int i57 = i56 % 2;
                                objValueOf = Boolean.valueOf(zBooleanValue);
                            } else {
                                int i58 = (((~i14) & (i13 | 35)) - (~i15)) - 1;
                                f62390l = i58 % 128;
                                int i59 = i58 % 2;
                            }
                        } else {
                            int i60 = f62390l;
                            i16 = ((i60 & (-78)) | ((~i60) & 77)) + ((i60 & 77) << 1);
                            f62389k = i16 % 128;
                            if (i16 % 2 != 0) {
                                zkVar2.f62400j = ypVar;
                                z10 = false;
                            } else {
                                zkVar2.f62400j = ypVar;
                            }
                            i17 = i60 + 13;
                            f62389k = i17 % 128;
                            if (i17 % 2 == 0) {
                                objValueOf = Boolean.valueOf(z10);
                            } else {
                                int i61 = 15 / 0;
                                objValueOf = Boolean.valueOf(z10);
                            }
                        }
                    } else {
                        int i62 = i31 | 105;
                        int i63 = ((i62 << 1) - (~(-(i62 & (~(i31 & 105)))))) - 1;
                        int i64 = i63 % 128;
                        f62389k = i64;
                        int i65 = i63 % 2;
                        int i66 = i64 & 105;
                        int i67 = (i64 | 105) & (~i66);
                        int i68 = -(-(i66 << 1));
                        i18 = (i67 ^ i68) + ((i67 & i68) << 1);
                        f62390l = i18 % 128;
                        if (i18 % 2 == 0) {
                            throw null;
                        }
                    }
                    objValueOf = Boolean.TRUE;
                } else {
                    int i69 = i31 & 21;
                    int i70 = (~i69) & (i31 | 21);
                    int i71 = -(-(i69 << 1));
                    int i72 = (i70 & i71) + (i71 | i70);
                    f62389k = i72 % 128;
                    int i73 = i72 % 2;
                    if (zkVar2.f62398h != 0) {
                        if (zkVar2.f62400j == null) {
                            ypVar = (yp) setCompoundDrawableTintBlendMode(new Object[]{zkVar2}, 351046834, -351046833, System.identityHashCode(zkVar2));
                            if (ypVar == null) {
                                setx = zkVar2.f62395e;
                                if (setx != null) {
                                    if (((Boolean) zn.setX.setOnFocusChangeListener(new Object[]{setx}, 1465233870, -1465233868, System.identityHashCode(setx))).booleanValue()) {
                                        int i310 = f62389k;
                                        int i311 = i310 & 5;
                                        int i312 = (~i311) & (i310 | 5);
                                        int i313 = i311 << 1;
                                        int i314 = (i312 & i313) + (i313 | i312);
                                        f62390l = i314 % 128;
                                        int i315 = i314 % 2;
                                        int i316 = i310 & 1;
                                        int i410 = (((i310 | 1) & (~i316)) - (~(-(-(i316 << 1))))) - 1;
                                        int i411 = i410 % 128;
                                        f62390l = i411;
                                        int i412 = i410 % 2;
                                        int i413 = (i411 & 35) + (i411 | 35);
                                        f62389k = i413 % 128;
                                        zBooleanValue = !(i413 % 2 != 0);
                                    }
                                    objValueOf = Boolean.valueOf(zBooleanValue);
                                } else {
                                    int i414 = f62390l;
                                    int i415 = ((i414 | 9) << 1) - (i414 ^ 9);
                                    int i416 = i415 % 128;
                                    f62389k = i416;
                                    int i417 = i415 % 2;
                                    int i418 = i416 + 45;
                                    f62390l = i418 % 128;
                                    int i419 = i418 % 2;
                                }
                                i13 = f62389k;
                                i14 = i13 & 35;
                                i15 = i14 << 1;
                                int i510 = (i13 ^ 35) + i15;
                                f62390l = i510 % 128;
                                int i511 = i510 % 2;
                                znVar = zkVar2.f62396f;
                                if (znVar != null) {
                                    zBooleanValue = ((Boolean) zn.setOnFocusChangeListener(new Object[]{znVar}, 2116206812, -2116206806, System.identityHashCode(znVar))).booleanValue();
                                    int i512 = f62390l;
                                    int i513 = i512 ^ 109;
                                    int i514 = ((i512 & 109) | i513) << 1;
                                    int i515 = -i513;
                                    int i516 = ((i514 | i515) << 1) - (i514 ^ i515);
                                    f62389k = i516 % 128;
                                    int i517 = i516 % 2;
                                    objValueOf = Boolean.valueOf(zBooleanValue);
                                } else {
                                    int i518 = (((~i14) & (i13 | 35)) - (~i15)) - 1;
                                    f62390l = i518 % 128;
                                    int i519 = i518 % 2;
                                }
                            } else {
                                int i610 = f62390l;
                                i16 = ((i610 & (-78)) | ((~i610) & 77)) + ((i610 & 77) << 1);
                                f62389k = i16 % 128;
                                if (i16 % 2 != 0) {
                                    zkVar2.f62400j = ypVar;
                                    z10 = false;
                                } else {
                                    zkVar2.f62400j = ypVar;
                                }
                                i17 = i610 + 13;
                                f62389k = i17 % 128;
                                if (i17 % 2 == 0) {
                                    objValueOf = Boolean.valueOf(z10);
                                } else {
                                    int i611 = 15 / 0;
                                    objValueOf = Boolean.valueOf(z10);
                                }
                            }
                        } else {
                            int i612 = i31 | 105;
                            int i613 = ((i612 << 1) - (~(-(i612 & (~(i31 & 105)))))) - 1;
                            int i614 = i613 % 128;
                            f62389k = i614;
                            int i615 = i613 % 2;
                            int i616 = i614 & 105;
                            int i617 = (i614 | 105) & (~i616);
                            int i618 = -(-(i616 << 1));
                            i18 = (i617 ^ i618) + ((i617 & i618) << 1);
                            f62390l = i18 % 128;
                            if (i18 % 2 == 0) {
                                throw null;
                            }
                        }
                        objValueOf = Boolean.TRUE;
                    } else {
                        int i74 = i31 & 57;
                        int i75 = ((i31 ^ 57) | i74) << 1;
                        int i76 = -((~i74) & (i31 | 57));
                        int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                        int i78 = i77 % 128;
                        f62389k = i78;
                        if (i77 % 2 != 0) {
                            throw null;
                        }
                        if (zkVar2.f62399i != 0) {
                            if (zkVar2.f62400j == null) {
                                ypVar = (yp) setCompoundDrawableTintBlendMode(new Object[]{zkVar2}, 351046834, -351046833, System.identityHashCode(zkVar2));
                                if (ypVar == null) {
                                    setx = zkVar2.f62395e;
                                    if (setx != null) {
                                        if (((Boolean) zn.setX.setOnFocusChangeListener(new Object[]{setx}, 1465233870, -1465233868, System.identityHashCode(setx))).booleanValue()) {
                                            int i317 = f62389k;
                                            int i318 = i317 & 5;
                                            int i319 = (~i318) & (i317 | 5);
                                            int i3110 = i318 << 1;
                                            int i3111 = (i319 & i3110) + (i3110 | i319);
                                            f62390l = i3111 % 128;
                                            int i3112 = i3111 % 2;
                                            int i3113 = i317 & 1;
                                            int i4110 = (((i317 | 1) & (~i3113)) - (~(-(-(i3113 << 1))))) - 1;
                                            int i4111 = i4110 % 128;
                                            f62390l = i4111;
                                            int i4112 = i4110 % 2;
                                            int i4113 = (i4111 & 35) + (i4111 | 35);
                                            f62389k = i4113 % 128;
                                            zBooleanValue = !(i4113 % 2 != 0);
                                        }
                                        objValueOf = Boolean.valueOf(zBooleanValue);
                                    } else {
                                        int i4114 = f62390l;
                                        int i4115 = ((i4114 | 9) << 1) - (i4114 ^ 9);
                                        int i4116 = i4115 % 128;
                                        f62389k = i4116;
                                        int i4117 = i4115 % 2;
                                        int i4118 = i4116 + 45;
                                        f62390l = i4118 % 128;
                                        int i4119 = i4118 % 2;
                                    }
                                    i13 = f62389k;
                                    i14 = i13 & 35;
                                    i15 = i14 << 1;
                                    int i5110 = (i13 ^ 35) + i15;
                                    f62390l = i5110 % 128;
                                    int i5111 = i5110 % 2;
                                    znVar = zkVar2.f62396f;
                                    if (znVar != null) {
                                        zBooleanValue = ((Boolean) zn.setOnFocusChangeListener(new Object[]{znVar}, 2116206812, -2116206806, System.identityHashCode(znVar))).booleanValue();
                                        int i5112 = f62390l;
                                        int i5113 = i5112 ^ 109;
                                        int i5114 = ((i5112 & 109) | i5113) << 1;
                                        int i5115 = -i5113;
                                        int i5116 = ((i5114 | i5115) << 1) - (i5114 ^ i5115);
                                        f62389k = i5116 % 128;
                                        int i5117 = i5116 % 2;
                                        objValueOf = Boolean.valueOf(zBooleanValue);
                                    } else {
                                        int i5118 = (((~i14) & (i13 | 35)) - (~i15)) - 1;
                                        f62390l = i5118 % 128;
                                        int i5119 = i5118 % 2;
                                    }
                                } else {
                                    int i619 = f62390l;
                                    i16 = ((i619 & (-78)) | ((~i619) & 77)) + ((i619 & 77) << 1);
                                    f62389k = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        zkVar2.f62400j = ypVar;
                                        z10 = false;
                                    } else {
                                        zkVar2.f62400j = ypVar;
                                    }
                                    i17 = i619 + 13;
                                    f62389k = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        objValueOf = Boolean.valueOf(z10);
                                    } else {
                                        int i6110 = 15 / 0;
                                        objValueOf = Boolean.valueOf(z10);
                                    }
                                }
                            } else {
                                int i6111 = i31 | 105;
                                int i6112 = ((i6111 << 1) - (~(-(i6111 & (~(i31 & 105)))))) - 1;
                                int i6113 = i6112 % 128;
                                f62389k = i6113;
                                int i6114 = i6112 % 2;
                                int i6115 = i6113 & 105;
                                int i6116 = (i6113 | 105) & (~i6115);
                                int i6117 = -(-(i6115 << 1));
                                i18 = (i6116 ^ i6117) + ((i6116 & i6117) << 1);
                                f62390l = i18 % 128;
                                if (i18 % 2 == 0) {
                                    throw null;
                                }
                            }
                            objValueOf = Boolean.TRUE;
                        } else {
                            int i79 = i78 & 59;
                            int i80 = i79 + ((i78 ^ 59) | i79);
                            f62390l = i80 % 128;
                            objValueOf = Boolean.valueOf(i80 % 2 == 0);
                        }
                    }
                }
                break;
                break;
            case 6:
                zk zkVar3 = (zk) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int iIntValue4 = ((Number) objArr[4]).intValue();
                boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
                zj zjVar = zkVar3.f62393c;
                if (((Boolean) zj.setDividerPadding(new Object[]{zjVar}, 1594554260, -1594554259, System.identityHashCode(zjVar))).booleanValue()) {
                    throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                }
                zj zjVar2 = zkVar3.f62393c;
                zi ziVar2 = (zi) zj.setDividerPadding(new Object[]{zjVar2}, -1111096522, 1111096522, System.identityHashCode(zjVar2));
                if (ziVar2 != null) {
                    synchronized (ziVar2) {
                        try {
                            if (((Boolean) zi.setY(new Object[]{ziVar2}, -1952685773, 1952685797, System.identityHashCode(ziVar2))).booleanValue()) {
                                zj zjVar3 = zkVar3.f62393c;
                                socket = (Socket) zj.setDividerPadding(new Object[]{zjVar3}, 1349461769, -1349461758, System.identityHashCode(zjVar3));
                            } else {
                                yp ypVar2 = (yp) zi.setY(new Object[]{ziVar2}, 2102358168, -2102358143, System.identityHashCode(ziVar2));
                                xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
                                if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{zkVar3, (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar))}, 720874772, -720874765, System.identityHashCode(zkVar3))).booleanValue()) {
                                    socket = null;
                                } else {
                                    zj zjVar4 = zkVar3.f62393c;
                                    socket = (Socket) zj.setDividerPadding(new Object[]{zjVar4}, 1349461769, -1349461758, System.identityHashCode(zjVar4));
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    zj zjVar5 = zkVar3.f62393c;
                    if (((zi) zj.setDividerPadding(new Object[]{zjVar5}, -1111096522, 1111096522, System.identityHashCode(zjVar5))) != null) {
                        if (socket == null) {
                            return ziVar2;
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (socket != null) {
                        yt.setX(socket);
                    }
                    yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, ziVar2}, -1070751559, 1070751584, (int) System.currentTimeMillis());
                }
                zkVar3.f62397g = 0;
                zkVar3.f62398h = 0;
                zkVar3.f62399i = 0;
                zl zlVar2 = zkVar3.f62391a;
                xh xhVar2 = zkVar3.f62392b;
                zj zjVar6 = zkVar3.f62393c;
                Boolean bool = Boolean.FALSE;
                if (((Boolean) zl.setOnFocusChangeListener(new Object[]{zlVar2, xhVar2, zjVar6, null, bool}, -1683625768, 1683625770, System.identityHashCode(zlVar2))).booleanValue()) {
                    zj zjVar7 = zkVar3.f62393c;
                    objValueOf = (zi) zj.setDividerPadding(new Object[]{zjVar7}, -1111096522, 1111096522, System.identityHashCode(zjVar7));
                    Intrinsics.checkNotNull(objValueOf);
                    yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, objValueOf}, 412276872, -412276865, (int) System.currentTimeMillis());
                } else {
                    yp ypVar3 = zkVar3.f62400j;
                    try {
                        if (ypVar3 != null) {
                            Intrinsics.checkNotNull(ypVar3);
                            zkVar3.f62400j = null;
                        } else {
                            zn.setX setx2 = zkVar3.f62395e;
                            if (setx2 != null) {
                                Intrinsics.checkNotNull(setx2);
                                if (((Boolean) zn.setX.setOnFocusChangeListener(new Object[]{setx2}, 1465233870, -1465233868, System.identityHashCode(setx2))).booleanValue()) {
                                    zn.setX setx3 = zkVar3.f62395e;
                                    Intrinsics.checkNotNull(setx3);
                                    ypVar3 = (yp) zn.setX.setOnFocusChangeListener(new Object[]{setx3}, -943404049, 943404050, System.identityHashCode(setx3));
                                }
                            }
                            zn znVar2 = zkVar3.f62396f;
                            if (znVar2 == null) {
                                xh xhVar3 = zkVar3.f62392b;
                                zj zjVar8 = zkVar3.f62393c;
                                znVar2 = new zn(xhVar3, ((ym) zj.setDividerPadding(new Object[]{zjVar8}, 274554588, -274554585, System.identityHashCode(zjVar8))).printStackTrace(), zkVar3.f62393c, zkVar3.f62394d);
                                zkVar3.f62396f = znVar2;
                            }
                            zn.setX setx4 = (zn.setX) zn.setOnFocusChangeListener(new Object[]{znVar2}, 1644762222, -1644762220, System.identityHashCode(znVar2));
                            zkVar3.f62395e = setx4;
                            list = (List) zn.setX.setOnFocusChangeListener(new Object[]{setx4}, -53093307, 53093307, System.identityHashCode(setx4));
                            zj zjVar9 = zkVar3.f62393c;
                            if (((Boolean) zj.setDividerPadding(new Object[]{zjVar9}, 1594554260, -1594554259, System.identityHashCode(zjVar9))).booleanValue()) {
                                throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                            }
                            zl zlVar3 = zkVar3.f62391a;
                            if (((Boolean) zl.setOnFocusChangeListener(new Object[]{zlVar3, zkVar3.f62392b, zkVar3.f62393c, list, bool}, -1683625768, 1683625770, System.identityHashCode(zlVar3))).booleanValue()) {
                                zj zjVar10 = zkVar3.f62393c;
                                objValueOf = (zi) zj.setDividerPadding(new Object[]{zjVar10}, -1111096522, 1111096522, System.identityHashCode(zjVar10));
                                Intrinsics.checkNotNull(objValueOf);
                                yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, objValueOf}, 412276872, -412276865, (int) System.currentTimeMillis());
                            } else {
                                ypVar3 = (yp) zn.setX.setOnFocusChangeListener(new Object[]{setx4}, -943404049, 943404050, System.identityHashCode(setx4));
                                ziVar = new zi(zkVar3.f62391a, ypVar3);
                                zj zjVar11 = zkVar3.f62393c;
                                zj.setDividerPadding(new Object[]{zjVar11, ziVar}, -912912497, 912912509, System.identityHashCode(zjVar11));
                                zi.setY(new Object[]{ziVar, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Boolean.valueOf(zBooleanValue2), zkVar3.f62393c, zkVar3.f62394d}, 1447269411, -1447269382, iIntValue);
                                zj zjVar12 = zkVar3.f62393c;
                                zj.setDividerPadding(new Object[]{zjVar12, null}, -912912497, 912912509, System.identityHashCode(zjVar12));
                                zj zjVar13 = zkVar3.f62393c;
                                ym ymVar = (ym) zj.setDividerPadding(new Object[]{zjVar13}, 274554588, -274554585, System.identityHashCode(zjVar13));
                                ((zh) ym.setY(new Object[]{ymVar}, -2038724701, 2038724726, System.identityHashCode(ymVar))).setOnFocusChangeListener((yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar)));
                                zlVar = zkVar3.f62391a;
                                if (((Boolean) zl.setOnFocusChangeListener(new Object[]{zlVar, zkVar3.f62392b, zkVar3.f62393c, list, Boolean.TRUE}, -1683625768, 1683625770, System.identityHashCode(zlVar))).booleanValue()) {
                                    synchronized (ziVar) {
                                        zl zlVar4 = zkVar3.f62391a;
                                        zl.setOnFocusChangeListener(new Object[]{zlVar4, ziVar}, -652676996, 652677000, System.identityHashCode(zlVar4));
                                        zj zjVar14 = zkVar3.f62393c;
                                        zj.setDividerPadding(new Object[]{zjVar14, ziVar}, 529348108, -529348085, System.identityHashCode(zjVar14));
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, ziVar}, 412276872, -412276865, (int) System.currentTimeMillis());
                                    return ziVar;
                                }
                                zj zjVar15 = zkVar3.f62393c;
                                objValueOf = (zi) zj.setDividerPadding(new Object[]{zjVar15}, -1111096522, 1111096522, System.identityHashCode(zjVar15));
                                Intrinsics.checkNotNull(objValueOf);
                                zkVar3.f62400j = ypVar3;
                                yt.setX((Socket) zi.setY(new Object[]{ziVar}, 326996816, -326996798, System.identityHashCode(ziVar)));
                                yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, objValueOf}, 412276872, -412276865, (int) System.currentTimeMillis());
                            }
                        }
                        zi.setY(new Object[]{ziVar, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Boolean.valueOf(zBooleanValue2), zkVar3.f62393c, zkVar3.f62394d}, 1447269411, -1447269382, iIntValue);
                        zj zjVar16 = zkVar3.f62393c;
                        zj.setDividerPadding(new Object[]{zjVar16, null}, -912912497, 912912509, System.identityHashCode(zjVar16));
                        zj zjVar17 = zkVar3.f62393c;
                        ym ymVar2 = (ym) zj.setDividerPadding(new Object[]{zjVar17}, 274554588, -274554585, System.identityHashCode(zjVar17));
                        ((zh) ym.setY(new Object[]{ymVar2}, -2038724701, 2038724726, System.identityHashCode(ymVar2))).setOnFocusChangeListener((yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar)));
                        zlVar = zkVar3.f62391a;
                        if (((Boolean) zl.setOnFocusChangeListener(new Object[]{zlVar, zkVar3.f62392b, zkVar3.f62393c, list, Boolean.TRUE}, -1683625768, 1683625770, System.identityHashCode(zlVar))).booleanValue()) {
                            synchronized (ziVar) {
                                zl zlVar5 = zkVar3.f62391a;
                                zl.setOnFocusChangeListener(new Object[]{zlVar5, ziVar}, -652676996, 652677000, System.identityHashCode(zlVar5));
                                zj zjVar18 = zkVar3.f62393c;
                                zj.setDividerPadding(new Object[]{zjVar18, ziVar}, 529348108, -529348085, System.identityHashCode(zjVar18));
                                Unit unit3 = Unit.INSTANCE;
                                yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, ziVar}, 412276872, -412276865, (int) System.currentTimeMillis());
                                return ziVar;
                            }
                        }
                        zj zjVar19 = zkVar3.f62393c;
                        objValueOf = (zi) zj.setDividerPadding(new Object[]{zjVar19}, -1111096522, 1111096522, System.identityHashCode(zjVar19));
                        Intrinsics.checkNotNull(objValueOf);
                        zkVar3.f62400j = ypVar3;
                        yt.setX((Socket) zi.setY(new Object[]{ziVar}, 326996816, -326996798, System.identityHashCode(ziVar)));
                        yd.setCompoundDrawableTintBlendMode(new Object[]{zkVar3.f62393c, objValueOf}, 412276872, -412276865, (int) System.currentTimeMillis());
                    } catch (Throwable th3) {
                        zj zjVar20 = zkVar3.f62393c;
                        zj.setDividerPadding(new Object[]{zjVar20, null}, -912912497, 912912509, System.identityHashCode(zjVar20));
                        throw th3;
                    }
                    list = null;
                    ziVar = new zi(zkVar3.f62391a, ypVar3);
                    zj zjVar110 = zkVar3.f62393c;
                    zj.setDividerPadding(new Object[]{zjVar110, ziVar}, -912912497, 912912509, System.identityHashCode(zjVar110));
                }
                break;
                break;
            case 7:
                zk zkVar4 = (zk) objArr[0];
                yg ygVar2 = (yg) objArr[1];
                int i81 = f62390l + 10;
                int i82 = (i81 ^ (-1)) + (i81 << 1);
                f62389k = i82 % 128;
                if (i82 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ygVar2, "");
                    xh xhVar4 = zkVar4.f62392b;
                    ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar4}, -66216281, 66216289, System.identityHashCode(xhVar4));
                    if (((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue() == ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue()) {
                        if (!Intrinsics.areEqual((String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2)), (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)))) {
                            int i83 = f62389k;
                            int i84 = i83 ^ 107;
                            int i85 = ((i83 & 107) | i84) << 1;
                            int i86 = -i84;
                            int i87 = (i85 & i86) + (i85 | i86);
                            int i88 = i87 % 128;
                            f62390l = i88;
                            int i89 = i87 % 2;
                            i19 = i88 + 13;
                            f62389k = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i90 = 96 / 0;
                            }
                            objValueOf = Boolean.TRUE;
                            break;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(ygVar2, "");
                    xh xhVar5 = zkVar4.f62392b;
                    ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar5}, -66216281, 66216289, System.identityHashCode(xhVar5));
                    int i91 = 86 / 0;
                    if (((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue() == ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue()) {
                        if (!Intrinsics.areEqual((String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2)), (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)))) {
                            int i810 = f62389k;
                            int i811 = i810 ^ 107;
                            int i812 = ((i810 & 107) | i811) << 1;
                            int i813 = -i811;
                            int i814 = (i812 & i813) + (i812 | i813);
                            int i815 = i814 % 128;
                            f62390l = i815;
                            int i816 = i814 % 2;
                            i19 = i815 + 13;
                            f62389k = i19 % 128;
                            if (i19 % 2 != 0) {
                                int i92 = 96 / 0;
                            }
                            objValueOf = Boolean.TRUE;
                            break;
                        }
                    }
                }
                int i93 = f62389k;
                int i94 = (i93 & 49) + (i93 | 49);
                f62390l = i94 % 128;
                if (i94 % 2 == 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
                break;
                break;
            default:
                zk zkVar5 = (zk) objArr[0];
                IOException iOException = (IOException) objArr[1];
                int i95 = f62390l + 31;
                f62389k = i95 % 128;
                if (i95 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(iOException, "");
                    zkVar5.f62400j = null;
                    boolean z11 = iOException instanceof aap;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(iOException, "");
                zkVar5.f62400j = null;
                if (iOException instanceof aap) {
                    System.identityHashCode(zkVar5);
                    System.identityHashCode(zkVar5);
                    if (((aap) iOException).setY == aac.REFUSED_STREAM) {
                        int i96 = (-2) - ((f62390l + 112) ^ (-1));
                        f62389k = i96 % 128;
                        int i97 = i96 % 2;
                        int i98 = zkVar5.f62397g;
                        int iIdentityHashCode = System.identityHashCode(zkVar5);
                        int i99 = (-376) - (~(i98 * (-375)));
                        int i100 = ~i98;
                        int i101 = (-2) & i100;
                        int i102 = (i100 | (-2)) & (~i101);
                        int i103 = ~((i102 & i101) | (i102 ^ i101));
                        int i104 = (i103 & iIdentityHashCode) | (iIdentityHashCode ^ i103);
                        int i105 = i98 & 1;
                        int i106 = (~i105) & (i98 | 1);
                        int i107 = ~(i106 | i105);
                        int i108 = i104 & i107;
                        int i109 = -(-((((i104 | i107) & (~i108)) | i108) * 376));
                        int i110 = i99 ^ i109;
                        int i111 = -(-((i99 & i109) << 1));
                        int i112 = (i110 & i111) + (i111 | i110);
                        int i113 = ~iIdentityHashCode;
                        int i114 = i113 & (i113 | iIdentityHashCode);
                        int i115 = (i114 & (-2)) | ((~i114) & 1);
                        int i116 = i114 & 1;
                        int i117 = ~((i116 & i115) | (i115 ^ i116));
                        int i118 = ~((i105 & i106) | (i106 ^ i105));
                        int i119 = -(~(-(-(((i117 & i118) | (i117 ^ i118)) * (-376)))));
                        int i120 = ((i112 ^ i119) + ((i119 & i112) << 1)) - 1;
                        int i121 = (iIdentityHashCode & (-2)) | ((-2) ^ iIdentityHashCode);
                        int i122 = ~i121;
                        int i123 = (i121 | i122) & i122;
                        int i124 = i98 & i123;
                        int i125 = -(-((((i98 | i123) & (~i124)) | i124) * 376));
                        int i126 = i120 & i125;
                        zkVar5.f62397g = ((i125 | i120) & (~i126)) + (i126 << 1);
                        int i127 = f62389k;
                        int i128 = i127 & 17;
                        int i129 = (i127 | 17) & (~i128);
                        int i130 = -(-(i128 << 1));
                        int i131 = ((i129 | i130) << 1) - (i129 ^ i130);
                        f62390l = i131 % 128;
                        int i132 = i131 % 2;
                        return null;
                    }
                }
                if (!(iOException instanceof aad)) {
                    int i133 = zkVar5.f62399i;
                    zkVar5.f62399i = ((((i133 ^ 1) | (i133 & 1)) << 1) - (~(-(((~i133) & 1) | (i133 & (-2)))))) - 1;
                    int i134 = f62390l;
                    int i135 = ((i134 ^ 53) - (~((i134 & 53) << 1))) - 1;
                    f62389k = i135 % 128;
                    if (i135 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i136 = f62389k;
                int i137 = (i136 & 103) + (i136 | 103);
                f62390l = i137 % 128;
                int i138 = i137 % 2;
                int i139 = zkVar5.f62398h;
                int iIdentityHashCode2 = System.identityHashCode(zkVar5);
                int i140 = (-52) - (~(-(-(i139 * 53))));
                int i141 = ~iIdentityHashCode2;
                int i142 = i141 & 1;
                int i143 = (~i142) & (i141 | 1);
                int i144 = (i143 & i142) | (i143 ^ i142);
                int i145 = i144 & i139;
                int i146 = (i144 | i139) & (~i145);
                int i147 = ~i139;
                int i148 = ((~(i146 | i145)) * 52) + i140;
                int i149 = (i147 | i139) & i147;
                int i150 = ~((i149 & i141) | ((~i141) & i149) | ((~i149) & i141));
                int i151 = i147 | 1;
                int i152 = ~i151;
                int i153 = (i151 | i152) & i152;
                int i154 = (i150 & i153) | ((~i153) & i150) | ((~i150) & i153);
                int i155 = ~(i142 | (i141 ^ 1));
                int i156 = i154 & i155;
                int i157 = (((i154 | i155) & (~i156)) | i156) * (-52);
                int i158 = (((~i157) & i148) | ((~i148) & i157)) + ((i157 & i148) << 1);
                int i159 = (-2) & i141;
                int i160 = (i141 | (-2)) & (~i159);
                int i161 = (i160 & i159) | (i160 ^ i159);
                int i162 = ~i161;
                int i163 = (i161 | i162) & i162;
                int i164 = (-2) & i139;
                int i165 = (i139 | (-2)) & (~i164);
                int i166 = (i165 & i164) | (i165 ^ i164);
                int i167 = ~i166;
                int i168 = (i166 | i167) & i167;
                int i169 = ((i168 & i163) | (i163 ^ i168)) * 52;
                int i170 = i158 & i169;
                zkVar5.f62398h = i170 + ((i169 ^ i158) | i170);
                int i171 = f62389k;
                int i172 = i171 & 83;
                int i173 = (i171 | 83) & (~i172);
                int i174 = -(-(i172 << 1));
                int i175 = ((i173 | i174) << 1) - (i173 ^ i174);
                f62390l = i175 % 128;
                int i176 = i175 % 2;
                return null;
        }
        return objValueOf;
    }

    @NotNull
    public final zu setDividerPadding(@NotNull ym ymVar, @NotNull zs zsVar) {
        return (zu) setCompoundDrawableTintBlendMode(new Object[]{this, ymVar, zsVar}, -705604490, 705604494, System.identityHashCode(this));
    }

    @NotNull
    public final xh setDividerPadding() {
        return (xh) setCompoundDrawableTintBlendMode(new Object[]{this}, 1713402499, -1713402496, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull yg ygVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, ygVar}, 720874772, -720874765, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1060063757, -1060063752, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull IOException iOException) throws Throwable {
        setCompoundDrawableTintBlendMode(new Object[]{this, iOException}, -1134943920, 1134943920, System.identityHashCode(this));
    }
}
