package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56850b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56851c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ka f56852a;

    public ku(@NotNull ka kaVar) {
        Intrinsics.checkNotNullParameter(kaVar, "");
        this.f56852a = kaVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0518  */
    /* JADX WARN: Code duplicated, block: B:102:0x051c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0520  */
    /* JADX WARN: Code duplicated, block: B:106:0x053a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0570  */
    /* JADX WARN: Code duplicated, block: B:113:0x058d  */
    /* JADX WARN: Code duplicated, block: B:116:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:120:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:121:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x040c  */
    /* JADX WARN: Code duplicated, block: B:87:0x045b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0478  */
    /* JADX WARN: Code duplicated, block: B:92:0x049f  */
    /* JADX WARN: Code duplicated, block: B:94:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:97:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0507  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        fd fdVar;
        int i13;
        int i14;
        fd fdVar2;
        int i15;
        fd fdVar3;
        int i16;
        int i17;
        int i18;
        fd fdVar4;
        int i19 = ~i10;
        int i20 = ((i11 | i19) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i21 = ~i12;
        int i22 = ~(i21 | i11);
        int i23 = ~(i10 | i11);
        int i24 = i19 | (~i11);
        int i25 = ((i23 | (~(i24 | i21)) | (~(i11 | i12))) * 717) + ((i22 | i23 | (~(i24 | i12))) * 717) + i20;
        if (i25 == 1) {
            cr crVar = (cr) objArr[0];
            int i26 = f56851c;
            int i27 = i26 & 29;
            int i28 = (i26 ^ 29) | i27;
            int i29 = (i27 & i28) + (i28 | i27);
            f56850b = i29 % 128;
            if (i29 % 2 != 0) {
                ((Boolean) cr.setDividerPadding(new Object[]{crVar}, -590986648, 590986653, System.identityHashCode(crVar))).booleanValue();
                throw null;
            }
            if (!((Boolean) cr.setDividerPadding(new Object[]{crVar}, -590986648, 590986653, System.identityHashCode(crVar))).booleanValue()) {
                fd fdVar5 = fd.ONLINE_REQUEST;
                int i30 = f56850b;
                int i31 = i30 & 61;
                int i32 = ((i30 ^ 61) | i31) << 1;
                int i33 = -((i30 | 61) & (~i31));
                int i34 = (i32 & i33) + (i33 | i32);
                f56851c = i34 % 128;
                int i35 = i34 % 2;
                return fdVar5;
            }
            fd fdVar6 = fd.DECLINED;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i36 = ~iCurrentTimeMillis;
            int i37 = ((~i36) & (-1077936705)) | (1077936704 & i36);
            int i38 = i36 & (-1077936705);
            int i39 = (-399731346) - (~(-(-(((i38 & i37) | (i37 ^ i38)) * (-490)))));
            int i40 = (-1455934069) & iCurrentTimeMillis;
            int i41 = ((iCurrentTimeMillis | (-1455934069)) & (~i40)) | i40;
            int i42 = ~i41;
            int i43 = (i41 | i42) & i42;
            int i44 = ((i43 & 377997364) | (377997364 ^ i43)) * 490;
            int i45 = ((i39 | i44) << 1) - (i44 ^ i39);
            int i46 = i45 & (-1651919780);
            int i47 = (((-1651919780) | i45) & (~i46)) + (i46 << 1);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i48 = (-213180207) & iCurrentTimeMillis2;
            int i49 = (~i48) & ((-213180207) | iCurrentTimeMillis2);
            int i50 = ~iCurrentTimeMillis2;
            int i51 = (i48 & i49) | (i49 ^ i48);
            int i52 = i51 ^ (-1731880229);
            int i53 = i51 & (-1731880229);
            int i54 = ((i53 & i52) | (i52 ^ i53)) * (-676);
            int i55 = (917838537 & i54) + (i54 | 917838537);
            int i56 = i50 ^ (-213180207);
            int i57 = (-213180207) & i50;
            int i58 = ~((i57 & i56) | (i56 ^ i57));
            int i59 = ((i58 & 70272292) | (70272292 ^ i58)) * 676;
            int i60 = i55 ^ i59;
            int i61 = ((i59 & i55) | i60) << 1;
            int i62 = -i60;
            int i63 = (i61 & i62) + (i61 | i62);
            int i64 = ((~i50) & (-1731880229)) | (1731880228 & i50);
            int i65 = (-1731880229) & i50;
            int i66 = ~((i64 & i65) | (i64 ^ i65));
            int i67 = (i66 & 1661607936) | (1661607936 ^ i66);
            int i68 = (-142907915) & iCurrentTimeMillis2;
            int i69 = (iCurrentTimeMillis2 | (-142907915)) & (~i68);
            int i70 = ~((i69 & i68) | (i69 ^ i68));
            int i71 = i67 ^ i70;
            int i72 = i70 & i67;
            int i73 = -(~(-(-(((i72 & i71) | (i71 ^ i72)) * 676))));
            if (i47 <= (-2) - ((((i63 | i73) << 1) - (i73 ^ i63)) ^ (-1))) {
                return fdVar6;
            }
            int i74 = 96 / 0;
            return fdVar6;
        }
        if (i25 != 2) {
            ku kuVar = (ku) objArr[0];
            setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
            cv cvVar = (cv) objArr[2];
            cr crVar2 = (cr) objArr[3];
            int i75 = f56851c + 72;
            int i76 = (i75 ^ (-1)) + (i75 << 1);
            f56850b = i76 % 128;
            int i77 = i76 % 2;
            if (((Boolean) cr.setDividerPadding(new Object[]{crVar2}, -1991636604, 1991636608, System.identityHashCode(crVar2))).booleanValue()) {
                int i78 = f56850b;
                int i79 = (i78 | 35) << 1;
                int i80 = -(((~i78) & 35) | (i78 & (-36)));
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                f56851c = i81 % 128;
                int i82 = i81 % 2;
                if (setfitssystemwindows == setFitsSystemWindows.setDividerPadding) {
                    int i83 = f56850b;
                    int i84 = ((i83 ^ 27) - (~((i83 & 27) << 1))) - 1;
                    f56851c = i84 % 128;
                    if (i84 % 2 != 0) {
                        return fd.DECLINED;
                    }
                    fd.Companion companion = fd.INSTANCE;
                    throw null;
                }
            }
            if (setfitssystemwindows == setFitsSystemWindows.setX) {
                int i85 = f56850b;
                int i86 = ((i85 & 9) - (~(-(-(i85 | 9))))) - 1;
                f56851c = i86 % 128;
                if (i86 % 2 == 0) {
                    fdVar4 = fd.ONLINE_REQUEST;
                    int i87 = 19 / 0;
                } else {
                    fdVar4 = fd.ONLINE_REQUEST;
                }
                int i88 = f56851c + 9;
                f56850b = i88 % 128;
                int i89 = i88 % 2;
                return fdVar4;
            }
            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar}, -1648759119, 1648759141, System.identityHashCode(cvVar))).booleanValue()) {
                int i90 = f56850b;
                int i91 = (i90 & (-104)) | ((~i90) & 103);
                int i92 = (i90 & 103) << 1;
                int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                f56851c = i93 % 128;
                if (i93 % 2 == 0) {
                    ((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 1554941971, -1554941959, System.identityHashCode(cvVar))).booleanValue();
                    throw null;
                }
                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 1554941971, -1554941959, System.identityHashCode(cvVar))).booleanValue()) {
                    int i94 = f56851c + 13;
                    f56850b = i94 % 128;
                    int i95 = i94 % 2;
                    ka kaVar = kuVar.f56852a;
                    if (!((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar}, -316514770, 316514786, System.identityHashCode(kaVar))).booleanValue()) {
                        int i96 = f56851c;
                        int i97 = i96 & 49;
                        int i98 = -(-((i96 ^ 49) | i97));
                        int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                        f56850b = i99 % 128;
                        if (i99 % 2 != 0) {
                            fd.Companion companion2 = fd.INSTANCE;
                            throw null;
                        }
                        fd fdVar7 = fd.ONLINE_REQUEST;
                        int i100 = f56851c;
                        int i101 = ((i100 ^ 84) + ((i100 & 84) << 1)) - 1;
                        f56850b = i101 % 128;
                        int i102 = i101 % 2;
                        return fdVar7;
                    }
                }
            }
            fd fdVar8 = fd.DECLINED;
            int i103 = f56850b;
            int i104 = ((i103 | 121) << 1) - (i103 ^ 121);
            f56851c = i104 % 128;
            if (i104 % 2 != 0) {
                return fdVar8;
            }
            int i105 = 2 / 0;
            return fdVar8;
        }
        ku kuVar2 = (ku) objArr[0];
        ka kaVar2 = kuVar2.f56852a;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis());
        bd bdVar = new bd((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1249644233, -1249644202, System.identityHashCode(kaVar2)));
        bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
        setFitsSystemWindows setfitssystemwindows2 = (setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1923859756, 1923859992, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
        ka kaVar3 = kuVar2.f56852a;
        kd kdVar = new kd((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3, str}, 1249644233, -1249644202, System.identityHashCode(kaVar3)));
        kh khVar = (kh) ((setImageTintList) w.setX(new Object[]{kdVar}, 1693919772, -1693919769, System.identityHashCode(kdVar)));
        cz czVar = new cz(kaVar3);
        cv cvVar2 = (cv) ((setImageTintList) w.setX(new Object[]{czVar}, 1693919772, -1693919769, System.identityHashCode(czVar)));
        cs csVar = new cs(kaVar3);
        cr crVar3 = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
        if (setfitssystemwindows2 == setFitsSystemWindows.setOnFocusChangeListener) {
            int i106 = f56850b;
            int i107 = i106 & 41;
            int i108 = i106 | 41;
            int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
            f56851c = i109 % 128;
            int i110 = i109 % 2;
            if (!(!((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, 1185078793, -1185078786, System.identityHashCode(khVar))).booleanValue())) {
                int i111 = f56850b;
                int i112 = (((i111 | 54) << 1) - (i111 ^ 54)) - 1;
                f56851c = i112 % 128;
                if (i112 % 2 == 0) {
                    ((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1648759119, 1648759141, System.identityHashCode(cvVar2))).booleanValue();
                    throw null;
                }
                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1648759119, 1648759141, System.identityHashCode(cvVar2))).booleanValue()) {
                    int i113 = f56850b;
                    int i114 = ((((i113 ^ 115) | (i113 & 115)) << 1) - (~(-(((~i113) & 115) | (i113 & (-116)))))) - 1;
                    f56851c = i114 % 128;
                    if (i114 % 2 == 0) {
                        ((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 1554941971, -1554941959, System.identityHashCode(cvVar2))).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 1554941971, -1554941959, System.identityHashCode(cvVar2))).booleanValue()) {
                        fd fdVar9 = fd.ONLINE_REQUEST;
                        int i115 = f56850b;
                        int i116 = ((i115 | 21) << 1) - (i115 ^ 21);
                        f56851c = i116 % 128;
                        if (i116 % 2 != 0) {
                            return fdVar9;
                        }
                        throw null;
                    }
                }
            }
            fd fdVar10 = fd.DECLINED;
            int i117 = f56850b + 75;
            f56851c = i117 % 128;
            int i118 = i117 % 2;
            return fdVar10;
        }
        if (setfitssystemwindows2 == setFitsSystemWindows.setDividerPadding) {
            int i119 = f56850b;
            int i120 = ((i119 ^ 79) | (i119 & 79)) << 1;
            int i121 = -(((~i119) & 79) | (i119 & (-80)));
            int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
            f56851c = i122 % 128;
            if (i122 % 2 == 0) {
                ((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1648759119, 1648759141, System.identityHashCode(cvVar2))).booleanValue();
                throw null;
            }
            if (((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1648759119, 1648759141, System.identityHashCode(cvVar2))).booleanValue()) {
                int i123 = f56850b;
                int i124 = ((i123 ^ 34) + ((i123 & 34) << 1)) - 1;
                f56851c = i124 % 128;
                int i125 = i124 % 2;
                if (!(!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 1554941971, -1554941959, System.identityHashCode(cvVar2))).booleanValue())) {
                    if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1774320004, 1774320019, System.identityHashCode(cvVar2))).booleanValue()) {
                        int i126 = f56851c;
                        int i127 = ((i126 | 45) << 1) - (i126 ^ 45);
                        f56850b = i127 % 128;
                        int i128 = i127 % 2;
                        if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1733926405, 1733926412, System.identityHashCode(cvVar2))).booleanValue()) {
                            System.identityHashCode(kuVar2);
                            System.identityHashCode(kuVar2);
                            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 166123252, -166123234, System.identityHashCode(cvVar2))).booleanValue()) {
                                if (((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1184343274, 1184343298, System.identityHashCode(cvVar2))).booleanValue()) {
                                    int i129 = f56851c;
                                    int i130 = i129 ^ 73;
                                    int i131 = (i129 & 73) << 1;
                                    int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                                    f56850b = i132 % 128;
                                    int i133 = i132 % 2;
                                    if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -415067137, 415067143, System.identityHashCode(khVar))).booleanValue()) {
                                        int i134 = f56850b;
                                        int i135 = i134 & 61;
                                        i17 = ((i134 | 61) & (~i135)) + (i135 << 1);
                                        f56851c = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            return fd.DECLINED;
                                        }
                                        fd.Companion companion3 = fd.INSTANCE;
                                        throw null;
                                    }
                                    if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -460704695, 460704699, System.identityHashCode(khVar))).booleanValue()) {
                                        int i136 = f56851c;
                                        int i137 = ((i136 | 67) << 1) - (i136 ^ 67);
                                        f56850b = i137 % 128;
                                        int i138 = i137 % 2;
                                        fdVar3 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                        int i139 = f56851c;
                                        int i140 = (i139 | 99) << 1;
                                        int i141 = -(((~i139) & 99) | (i139 & (-100)));
                                        i16 = (i140 ^ i141) + ((i141 & i140) << 1);
                                        f56850b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            return fdVar3;
                                        }
                                        throw null;
                                    }
                                }
                                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -90764059, 90764062, System.identityHashCode(cvVar2))).booleanValue()) {
                                    int i142 = f56851c;
                                    i14 = ((((i142 ^ 11) | (i142 & 11)) << 1) - (~(-(((~i142) & 11) | (i142 & (-12)))))) - 1;
                                    f56850b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        return (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                    }
                                    Object[] objArr2 = {crVar3};
                                    int i143 = 58 / 0;
                                    return (fd) setCompoundDrawableTintBlendMode(objArr2, 307481926, -307481925, (int) System.currentTimeMillis());
                                }
                                fdVar2 = (fd) setCompoundDrawableTintBlendMode(new Object[]{kuVar2, setfitssystemwindows2, cvVar2, crVar3}, 952819466, -952819466, System.identityHashCode(kuVar2));
                                int i144 = f56850b;
                                int i145 = (i144 | 123) << 1;
                                int i146 = -(((~i144) & 123) | (i144 & (-124)));
                                i15 = ((i145 | i146) << 1) - (i146 ^ i145);
                                f56851c = i15 % 128;
                                if (i15 % 2 != 0) {
                                    return fdVar2;
                                }
                                throw null;
                            }
                        }
                    }
                    fdVar = fd.DECLINED;
                    i13 = f56851c + 47;
                } else if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -102916255, 102916263, System.identityHashCode(khVar))).booleanValue()) {
                    i18 = f56850b + 39;
                    f56851c = i18 % 128;
                    if (i18 % 2 != 0) {
                        fd.Companion companion4 = fd.INSTANCE;
                        throw null;
                    }
                    fdVar = fd.DECLINED;
                    i13 = f56851c + 85;
                } else {
                    if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -1935116275, 1935116275, System.identityHashCode(khVar))).booleanValue()) {
                        int i147 = (-2) - ((f56850b + 38) ^ (-1));
                        f56851c = i147 % 128;
                        int i148 = i147 % 2;
                        fd fdVar11 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                        int i149 = f56850b;
                        int i150 = i149 & 67;
                        int i151 = ((i149 ^ 67) | i150) << 1;
                        int i152 = -((i149 | 67) & (~i150));
                        int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                        f56851c = i153 % 128;
                        int i154 = i153 % 2;
                        return fdVar11;
                    }
                    if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1774320004, 1774320019, System.identityHashCode(cvVar2))).booleanValue()) {
                        int i1210 = f56851c;
                        int i1211 = ((i1210 | 45) << 1) - (i1210 ^ 45);
                        f56850b = i1211 % 128;
                        int i1212 = i1211 % 2;
                        if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1733926405, 1733926412, System.identityHashCode(cvVar2))).booleanValue()) {
                            System.identityHashCode(kuVar2);
                            System.identityHashCode(kuVar2);
                            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 166123252, -166123234, System.identityHashCode(cvVar2))).booleanValue()) {
                                if (((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1184343274, 1184343298, System.identityHashCode(cvVar2))).booleanValue()) {
                                    int i1213 = f56851c;
                                    int i1310 = i1213 ^ 73;
                                    int i1311 = (i1213 & 73) << 1;
                                    int i1312 = ((i1310 | i1311) << 1) - (i1311 ^ i1310);
                                    f56850b = i1312 % 128;
                                    int i1313 = i1312 % 2;
                                    if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -415067137, 415067143, System.identityHashCode(khVar))).booleanValue()) {
                                        int i1314 = f56850b;
                                        int i1315 = i1314 & 61;
                                        i17 = ((i1314 | 61) & (~i1315)) + (i1315 << 1);
                                        f56851c = i17 % 128;
                                        if (i17 % 2 != 0) {
                                            return fd.DECLINED;
                                        }
                                        fd.Companion companion5 = fd.INSTANCE;
                                        throw null;
                                    }
                                    if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -460704695, 460704699, System.identityHashCode(khVar))).booleanValue()) {
                                        int i1316 = f56851c;
                                        int i1317 = ((i1316 | 67) << 1) - (i1316 ^ 67);
                                        f56850b = i1317 % 128;
                                        int i1318 = i1317 % 2;
                                        fdVar3 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                        int i1319 = f56851c;
                                        int i1410 = (i1319 | 99) << 1;
                                        int i1411 = -(((~i1319) & 99) | (i1319 & (-100)));
                                        i16 = (i1410 ^ i1411) + ((i1411 & i1410) << 1);
                                        f56850b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            return fdVar3;
                                        }
                                        throw null;
                                    }
                                }
                                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -90764059, 90764062, System.identityHashCode(cvVar2))).booleanValue()) {
                                    int i1412 = f56851c;
                                    i14 = ((((i1412 ^ 11) | (i1412 & 11)) << 1) - (~(-(((~i1412) & 11) | (i1412 & (-12)))))) - 1;
                                    f56850b = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        return (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                    }
                                    Object[] objArr3 = {crVar3};
                                    int i1413 = 58 / 0;
                                    return (fd) setCompoundDrawableTintBlendMode(objArr3, 307481926, -307481925, (int) System.currentTimeMillis());
                                }
                                fdVar2 = (fd) setCompoundDrawableTintBlendMode(new Object[]{kuVar2, setfitssystemwindows2, cvVar2, crVar3}, 952819466, -952819466, System.identityHashCode(kuVar2));
                                int i1414 = f56850b;
                                int i1415 = (i1414 | 123) << 1;
                                int i1416 = -(((~i1414) & 123) | (i1414 & (-124)));
                                i15 = ((i1415 | i1416) << 1) - (i1416 ^ i1415);
                                f56851c = i15 % 128;
                                if (i15 % 2 != 0) {
                                    return fdVar2;
                                }
                                throw null;
                            }
                        }
                    }
                    fdVar = fd.DECLINED;
                    i13 = f56851c + 47;
                }
            } else if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -102916255, 102916263, System.identityHashCode(khVar))).booleanValue()) {
                i18 = f56850b + 39;
                f56851c = i18 % 128;
                if (i18 % 2 != 0) {
                    fd.Companion companion6 = fd.INSTANCE;
                    throw null;
                }
                fdVar = fd.DECLINED;
                i13 = f56851c + 85;
            } else {
                if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -1935116275, 1935116275, System.identityHashCode(khVar))).booleanValue()) {
                    int i1417 = (-2) - ((f56850b + 38) ^ (-1));
                    f56851c = i1417 % 128;
                    int i1418 = i1417 % 2;
                    fd fdVar12 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                    int i1419 = f56850b;
                    int i155 = i1419 & 67;
                    int i156 = ((i1419 ^ 67) | i155) << 1;
                    int i157 = -((i1419 | 67) & (~i155));
                    int i158 = ((i156 | i157) << 1) - (i157 ^ i156);
                    f56851c = i158 % 128;
                    int i159 = i158 % 2;
                    return fdVar12;
                }
                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1774320004, 1774320019, System.identityHashCode(cvVar2))).booleanValue()) {
                    int i1214 = f56851c;
                    int i1215 = ((i1214 | 45) << 1) - (i1214 ^ 45);
                    f56850b = i1215 % 128;
                    int i1216 = i1215 % 2;
                    if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1733926405, 1733926412, System.identityHashCode(cvVar2))).booleanValue()) {
                        System.identityHashCode(kuVar2);
                        System.identityHashCode(kuVar2);
                        if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 166123252, -166123234, System.identityHashCode(cvVar2))).booleanValue()) {
                            if (((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1184343274, 1184343298, System.identityHashCode(cvVar2))).booleanValue()) {
                                int i1217 = f56851c;
                                int i13110 = i1217 ^ 73;
                                int i13111 = (i1217 & 73) << 1;
                                int i13112 = ((i13110 | i13111) << 1) - (i13111 ^ i13110);
                                f56850b = i13112 % 128;
                                int i13113 = i13112 % 2;
                                if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -415067137, 415067143, System.identityHashCode(khVar))).booleanValue()) {
                                    int i13114 = f56850b;
                                    int i13115 = i13114 & 61;
                                    i17 = ((i13114 | 61) & (~i13115)) + (i13115 << 1);
                                    f56851c = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        return fd.DECLINED;
                                    }
                                    fd.Companion companion7 = fd.INSTANCE;
                                    throw null;
                                }
                                if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -460704695, 460704699, System.identityHashCode(khVar))).booleanValue()) {
                                    int i13116 = f56851c;
                                    int i13117 = ((i13116 | 67) << 1) - (i13116 ^ 67);
                                    f56850b = i13117 % 128;
                                    int i13118 = i13117 % 2;
                                    fdVar3 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                    int i13119 = f56851c;
                                    int i14110 = (i13119 | 99) << 1;
                                    int i14111 = -(((~i13119) & 99) | (i13119 & (-100)));
                                    i16 = (i14110 ^ i14111) + ((i14111 & i14110) << 1);
                                    f56850b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        return fdVar3;
                                    }
                                    throw null;
                                }
                            }
                            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -90764059, 90764062, System.identityHashCode(cvVar2))).booleanValue()) {
                                int i14112 = f56851c;
                                i14 = ((((i14112 ^ 11) | (i14112 & 11)) << 1) - (~(-(((~i14112) & 11) | (i14112 & (-12)))))) - 1;
                                f56850b = i14 % 128;
                                if (i14 % 2 != 0) {
                                    return (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                }
                                Object[] objArr4 = {crVar3};
                                int i14113 = 58 / 0;
                                return (fd) setCompoundDrawableTintBlendMode(objArr4, 307481926, -307481925, (int) System.currentTimeMillis());
                            }
                            fdVar2 = (fd) setCompoundDrawableTintBlendMode(new Object[]{kuVar2, setfitssystemwindows2, cvVar2, crVar3}, 952819466, -952819466, System.identityHashCode(kuVar2));
                            int i14114 = f56850b;
                            int i14115 = (i14114 | 123) << 1;
                            int i14116 = -(((~i14114) & 123) | (i14114 & (-124)));
                            i15 = ((i14115 | i14116) << 1) - (i14116 ^ i14115);
                            f56851c = i15 % 128;
                            if (i15 % 2 != 0) {
                                return fdVar2;
                            }
                            throw null;
                        }
                    }
                }
                fdVar = fd.DECLINED;
                i13 = f56851c + 47;
            }
        } else {
            if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1774320004, 1774320019, System.identityHashCode(cvVar2))).booleanValue()) {
                int i1218 = f56851c;
                int i1219 = ((i1218 | 45) << 1) - (i1218 ^ 45);
                f56850b = i1219 % 128;
                int i12110 = i1219 % 2;
                if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1733926405, 1733926412, System.identityHashCode(cvVar2))).booleanValue()) {
                    System.identityHashCode(kuVar2);
                    System.identityHashCode(kuVar2);
                    if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, 166123252, -166123234, System.identityHashCode(cvVar2))).booleanValue()) {
                        if (((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -1184343274, 1184343298, System.identityHashCode(cvVar2))).booleanValue()) {
                            int i12111 = f56851c;
                            int i131110 = i12111 ^ 73;
                            int i131111 = (i12111 & 73) << 1;
                            int i131112 = ((i131110 | i131111) << 1) - (i131111 ^ i131110);
                            f56850b = i131112 % 128;
                            int i131113 = i131112 % 2;
                            if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -415067137, 415067143, System.identityHashCode(khVar))).booleanValue()) {
                                int i131114 = f56850b;
                                int i131115 = i131114 & 61;
                                i17 = ((i131114 | 61) & (~i131115)) + (i131115 << 1);
                                f56851c = i17 % 128;
                                if (i17 % 2 != 0) {
                                    return fd.DECLINED;
                                }
                                fd.Companion companion8 = fd.INSTANCE;
                                throw null;
                            }
                            if (((Boolean) kh.setOnFocusChangeListener(new Object[]{khVar}, -460704695, 460704699, System.identityHashCode(khVar))).booleanValue()) {
                                int i131116 = f56851c;
                                int i131117 = ((i131116 | 67) << 1) - (i131116 ^ 67);
                                f56850b = i131117 % 128;
                                int i131118 = i131117 % 2;
                                fdVar3 = (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                                int i131119 = f56851c;
                                int i14117 = (i131119 | 99) << 1;
                                int i14118 = -(((~i131119) & 99) | (i131119 & (-100)));
                                i16 = (i14117 ^ i14118) + ((i14118 & i14117) << 1);
                                f56850b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    return fdVar3;
                                }
                                throw null;
                            }
                        }
                        if (!((Boolean) cv.setDividerPadding(new Object[]{cvVar2}, -90764059, 90764062, System.identityHashCode(cvVar2))).booleanValue()) {
                            int i14119 = f56851c;
                            i14 = ((((i14119 ^ 11) | (i14119 & 11)) << 1) - (~(-(((~i14119) & 11) | (i14119 & (-12)))))) - 1;
                            f56850b = i14 % 128;
                            if (i14 % 2 != 0) {
                                return (fd) setCompoundDrawableTintBlendMode(new Object[]{crVar3}, 307481926, -307481925, (int) System.currentTimeMillis());
                            }
                            Object[] objArr5 = {crVar3};
                            int i141110 = 58 / 0;
                            return (fd) setCompoundDrawableTintBlendMode(objArr5, 307481926, -307481925, (int) System.currentTimeMillis());
                        }
                        fdVar2 = (fd) setCompoundDrawableTintBlendMode(new Object[]{kuVar2, setfitssystemwindows2, cvVar2, crVar3}, 952819466, -952819466, System.identityHashCode(kuVar2));
                        int i141111 = f56850b;
                        int i141112 = (i141111 | 123) << 1;
                        int i141113 = -(((~i141111) & 123) | (i141111 & (-124)));
                        i15 = ((i141112 | i141113) << 1) - (i141113 ^ i141112);
                        f56851c = i15 % 128;
                        if (i15 % 2 != 0) {
                            return fdVar2;
                        }
                        throw null;
                    }
                }
            }
            fdVar = fd.DECLINED;
            i13 = f56851c + 47;
        }
        f56850b = i13 % 128;
        int i160 = i13 % 2;
        return fdVar;
    }

    @NotNull
    public final fd setOnFocusChangeListener() {
        return (fd) setCompoundDrawableTintBlendMode(new Object[]{this}, -1607349383, 1607349385, System.identityHashCode(this));
    }
}
