package com.mypinpad.tsdk.isolation;

import dk.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setContextClickable implements db, exceptionHandler, setChildIndicator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59604d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59605e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setVerticalScrollbarOverlay f59606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public setId f59607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CancelPinPadLaunchRequest<md, setMax> f59608c;

    public setContextClickable(@NotNull setVerticalScrollbarOverlay setverticalscrollbaroverlay) {
        Intrinsics.checkNotNullParameter(setverticalscrollbaroverlay, "");
        this.f59606a = setverticalscrollbaroverlay;
        this.f59608c = new CancelPinPadLaunchRequest<>();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0101  */
    /* JADX WARN: Code duplicated, block: B:18:0x0107  */
    /* JADX WARN: Code duplicated, block: B:21:0x0144  */
    /* JADX WARN: Code duplicated, block: B:23:0x0159  */
    /* JADX WARN: Code duplicated, block: B:26:0x016c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0182  */
    /* JADX WARN: Code duplicated, block: B:30:0x0192  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0220  */
    /* JADX WARN: Code duplicated, block: B:41:0x0236  */
    /* JADX WARN: Code duplicated, block: B:43:0x0248  */
    /* JADX WARN: Code duplicated, block: B:44:0x0250  */
    /* JADX WARN: Code duplicated, block: B:45:0x0251  */
    /* JADX WARN: Code duplicated, block: B:47:0x0259  */
    /* JADX WARN: Code duplicated, block: B:50:0x0269  */
    /* JADX WARN: Code duplicated, block: B:51:0x026a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0280  */
    /* JADX WARN: Code duplicated, block: B:56:0x0291  */
    /* JADX WARN: Code duplicated, block: B:57:0x0292  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c3  */
    public static /* synthetic */ setMaxWidth a(Object[] objArr) throws Exception {
        setMaxWidth setmaxwidth;
        setMaxWidth setmaxwidth2;
        create createVar;
        setMaxWidth setmaxwidth3;
        setMaxWidth setmaxwidth4;
        int i10;
        int i11;
        int i12;
        Map map;
        setMax setmax;
        setMaxWidth setmaxwidth5;
        setMaxWidth setmaxwidth6;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        setContextClickable setcontextclickable = (setContextClickable) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        md mdVar = (md) objArr[2];
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[3];
        int i18 = f59605e;
        int i19 = i18 & 101;
        int i20 = -(-((i18 ^ 101) | i19));
        int i21 = (i19 & i20) + (i20 | i19);
        int i22 = i21 % 128;
        f59604d = i22;
        int i23 = i21 % 2;
        setId setid = setcontextclickable.f59607b;
        if (setid == null) {
            int i24 = i22 + 107;
            int i25 = i24 % 128;
            f59605e = i25;
            if (i24 % 2 == 0) {
                throw null;
            }
            int i26 = (i25 & 23) + (i25 | 23);
            f59604d = i26 % 128;
            int i27 = i26 % 2;
            setmaxwidth = null;
        } else {
            getCurrency getcurrency = (getCurrency) ((Map) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 1240606079, -1240606069, System.identityHashCode(setid))).get(terminal);
            setMaxWidth setmaxwidth7 = (setMaxWidth) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 1382968989, -1382968983, System.identityHashCode(setid));
            setmaxwidth = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth7}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth7));
            if (getcurrency == null) {
                int i28 = f59604d;
                int i29 = i28 & 1;
                int i30 = (i28 ^ 1) | i29;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                int i32 = i31 % 128;
                f59605e = i32;
                int i33 = i31 % 2;
                int i34 = i32 | 43;
                int i35 = ((i34 << 1) - (~(-((~(i32 & 43)) & i34)))) - 1;
                f59604d = i35 % 128;
                int i36 = i35 % 2;
            } else {
                setMaxWidth setmaxwidth8 = (setMaxWidth) getCurrency.setX(new Object[]{getcurrency}, -614599099, 614599102, System.identityHashCode(getcurrency));
                if (setmaxwidth8 == null) {
                    int i37 = f59605e;
                    int i38 = (-2) - ((((i37 | 66) << 1) - (i37 ^ 66)) ^ (-1));
                    int i39 = i38 % 128;
                    f59604d = i39;
                    int i40 = i38 % 2;
                    int i41 = (i39 ^ 49) + ((i39 & 49) << 1);
                    f59605e = i41 % 128;
                    int i42 = i41 % 2;
                } else {
                    setmaxwidth2 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth8}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth8));
                    int i43 = f59605e;
                    int i44 = (((i43 & (-120)) | ((~i43) & 119)) - (~(-(-((i43 & 119) << 1))))) - 1;
                    f59604d = i44 % 128;
                    int i45 = i44 % 2;
                }
                if (setmaxwidth2 == null) {
                    setmaxwidth2 = new setMaxWidth();
                } else {
                    int i46 = f59604d;
                    int i47 = (((i46 | 110) << 1) - (i46 ^ 110)) - 1;
                    f59605e = i47 % 128;
                    int i48 = i47 % 2;
                }
                CancelPinPadLaunchRequest cancelPinPadLaunchRequest = (CancelPinPadLaunchRequest) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, -285918332, 285918335, System.identityHashCode(setid));
                createVar = (create) CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, terminal, setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(cancelPinPadLaunchRequest));
                if (createVar == null) {
                    int i49 = f59604d;
                    int i50 = i49 ^ 121;
                    int i51 = ((i49 & 121) | i50) << 1;
                    int i52 = -i50;
                    i17 = ((i51 | i52) << 1) - (i52 ^ i51);
                    f59605e = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i53 = 53 / 0;
                    }
                    int i54 = i49 & 91;
                    int i55 = (i49 ^ 91) | i54;
                    i12 = (i54 & i55) + (i55 | i54);
                    f59605e = i12 % 128;
                } else {
                    setmaxwidth3 = (setMaxWidth) create.setDividerPadding(new Object[]{createVar}, 719526861, -719526857, System.identityHashCode(createVar));
                    if (setmaxwidth3 == null) {
                        i10 = f59605e;
                        i11 = (((i10 | 58) << 1) - (i10 ^ 58)) - 1;
                        f59604d = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        int i56 = i10 & 79;
                        int i57 = -(-((i10 ^ 79) | i56));
                        i12 = (i56 & i57) + (i57 | i56);
                        f59604d = i12 % 128;
                    } else {
                        setmaxwidth4 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth3}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth3));
                        int i58 = f59604d;
                        int i59 = i58 & 29;
                        int i60 = (i58 | 29) & (~i59);
                        int i61 = -(-(i59 << 1));
                        int i62 = (i60 & i61) + (i60 | i61);
                        f59605e = i62 % 128;
                        int i63 = i62 % 2;
                    }
                    if (setmaxwidth4 == null) {
                        setmaxwidth4 = new setMaxWidth();
                        int i64 = f59604d;
                        int i65 = i64 & 9;
                        int i66 = (((i64 | 9) & (~i65)) - (~(-(-(i65 << 1))))) - 1;
                        f59605e = i66 % 128;
                        int i67 = i66 % 2;
                    } else {
                        int i68 = f59604d;
                        int i69 = (i68 ^ 91) + ((i68 & 91) << 1);
                        f59605e = i69 % 128;
                        int i70 = i69 % 2;
                    }
                    if (createVar == null) {
                        int i71 = f59605e;
                        int i72 = i71 & 87;
                        int i73 = ((i71 ^ 87) | i72) << 1;
                        int i74 = -((~i72) & (i71 | 87));
                        int i75 = (i73 & i74) + (i73 | i74);
                        f59604d = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = ((i71 ^ 109) | (i71 & 109)) << 1;
                        int i78 = -(((~i71) & 109) | (i71 & (-110)));
                        int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                        f59604d = i79 % 128;
                        int i80 = i79 % 2;
                    } else {
                        map = (Map) create.setDividerPadding(new Object[]{createVar}, 127736117, -127736111, System.identityHashCode(createVar));
                        if (map == null) {
                            i15 = f59605e;
                            int i81 = i15 & 105;
                            int i82 = (i15 ^ 105) | i81;
                            i16 = (i81 & i82) + (i81 | i82);
                            f59604d = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                            int i83 = i15 + 91;
                            f59604d = i83 % 128;
                            int i84 = i83 % 2;
                        } else {
                            setmax = (setMax) map.get(mdVar);
                            if (setmax == null) {
                                int i85 = f59605e;
                                int i86 = i85 & 15;
                                i14 = i86 + ((i85 ^ 15) | i86);
                                f59604d = i14 % 128;
                                if (i14 % 2 != 0) {
                                    throw null;
                                }
                            } else {
                                setmaxwidth5 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                                if (setmaxwidth5 == null) {
                                    int i87 = f59604d;
                                    int i88 = i87 ^ 119;
                                    i13 = (((i87 & 119) | i88) << 1) - i88;
                                    f59605e = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    setmaxwidth6 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth5}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth5));
                                    int i89 = f59604d;
                                    int i90 = i89 & 73;
                                    int i91 = (i89 | 73) & (~i90);
                                    int i92 = i90 << 1;
                                    int i93 = (i91 & i92) + (i91 | i92);
                                    f59605e = i93 % 128;
                                    int i94 = i93 % 2;
                                }
                                if (setmaxwidth6 == null) {
                                    setmaxwidth6 = new setMaxWidth();
                                    int i95 = f59605e + 61;
                                    f59604d = i95 % 128;
                                    int i96 = i95 % 2;
                                } else {
                                    int i97 = f59605e;
                                    int i98 = i97 & 49;
                                    int i99 = i98 + ((i97 ^ 49) | i98);
                                    f59604d = i99 % 128;
                                    int i100 = i99 % 2;
                                }
                                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                                int i101 = f59604d;
                                int i102 = (i101 & 77) + (i101 | 77);
                                f59605e = i102 % 128;
                                int i103 = i102 % 2;
                            }
                        }
                    }
                    setmaxwidth6 = null;
                    if (setmaxwidth6 == null) {
                        setmaxwidth6 = new setMaxWidth();
                        int i910 = f59605e + 61;
                        f59604d = i910 % 128;
                        int i911 = i910 % 2;
                    } else {
                        int i912 = f59605e;
                        int i913 = i912 & 49;
                        int i914 = i913 + ((i912 ^ 49) | i913);
                        f59604d = i914 % 128;
                        int i104 = i914 % 2;
                    }
                    setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                    setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                    setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                    int i105 = f59604d;
                    int i106 = (i105 & 77) + (i105 | 77);
                    f59605e = i106 % 128;
                    int i107 = i106 % 2;
                }
                int i108 = i12 % 2;
                setmaxwidth4 = null;
                if (setmaxwidth4 == null) {
                    setmaxwidth4 = new setMaxWidth();
                    int i610 = f59604d;
                    int i611 = i610 & 9;
                    int i612 = (((i610 | 9) & (~i611)) - (~(-(-(i611 << 1))))) - 1;
                    f59605e = i612 % 128;
                    int i613 = i612 % 2;
                } else {
                    int i614 = f59604d;
                    int i615 = (i614 ^ 91) + ((i614 & 91) << 1);
                    f59605e = i615 % 128;
                    int i710 = i615 % 2;
                }
                if (createVar == null) {
                    int i711 = f59605e;
                    int i712 = i711 & 87;
                    int i713 = ((i711 ^ 87) | i712) << 1;
                    int i714 = -((~i712) & (i711 | 87));
                    int i715 = (i713 & i714) + (i713 | i714);
                    f59604d = i715 % 128;
                    int i716 = i715 % 2;
                    int i717 = ((i711 ^ 109) | (i711 & 109)) << 1;
                    int i718 = -(((~i711) & 109) | (i711 & (-110)));
                    int i719 = (i717 ^ i718) + ((i718 & i717) << 1);
                    f59604d = i719 % 128;
                    int i810 = i719 % 2;
                } else {
                    map = (Map) create.setDividerPadding(new Object[]{createVar}, 127736117, -127736111, System.identityHashCode(createVar));
                    if (map == null) {
                        i15 = f59605e;
                        int i811 = i15 & 105;
                        int i812 = (i15 ^ 105) | i811;
                        i16 = (i811 & i812) + (i811 | i812);
                        f59604d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        int i813 = i15 + 91;
                        f59604d = i813 % 128;
                        int i814 = i813 % 2;
                    } else {
                        setmax = (setMax) map.get(mdVar);
                        if (setmax == null) {
                            int i815 = f59605e;
                            int i816 = i815 & 15;
                            i14 = i816 + ((i815 ^ 15) | i816);
                            f59604d = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            setmaxwidth5 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                            if (setmaxwidth5 == null) {
                                int i817 = f59604d;
                                int i818 = i817 ^ 119;
                                i13 = (((i817 & 119) | i818) << 1) - i818;
                                f59605e = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                setmaxwidth6 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth5}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth5));
                                int i819 = f59604d;
                                int i915 = i819 & 73;
                                int i916 = (i819 | 73) & (~i915);
                                int i917 = i915 << 1;
                                int i918 = (i916 & i917) + (i916 | i917);
                                f59605e = i918 % 128;
                                int i919 = i918 % 2;
                            }
                            if (setmaxwidth6 == null) {
                                setmaxwidth6 = new setMaxWidth();
                                int i9110 = f59605e + 61;
                                f59604d = i9110 % 128;
                                int i9111 = i9110 % 2;
                            } else {
                                int i9112 = f59605e;
                                int i9113 = i9112 & 49;
                                int i9114 = i9113 + ((i9112 ^ 49) | i9113);
                                f59604d = i9114 % 128;
                                int i109 = i9114 % 2;
                            }
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            int i1010 = f59604d;
                            int i1011 = (i1010 & 77) + (i1010 | 77);
                            f59605e = i1011 % 128;
                            int i1012 = i1011 % 2;
                        }
                    }
                }
                setmaxwidth6 = null;
                if (setmaxwidth6 == null) {
                    setmaxwidth6 = new setMaxWidth();
                    int i9115 = f59605e + 61;
                    f59604d = i9115 % 128;
                    int i9116 = i9115 % 2;
                } else {
                    int i9117 = f59605e;
                    int i9118 = i9117 & 49;
                    int i9119 = i9118 + ((i9117 ^ 49) | i9118);
                    f59604d = i9119 % 128;
                    int i1013 = i9119 % 2;
                }
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                int i1014 = f59604d;
                int i1015 = (i1014 & 77) + (i1014 | 77);
                f59605e = i1015 % 128;
                int i1016 = i1015 % 2;
            }
            setmaxwidth2 = null;
            if (setmaxwidth2 == null) {
                setmaxwidth2 = new setMaxWidth();
            } else {
                int i410 = f59604d;
                int i411 = (((i410 | 110) << 1) - (i410 ^ 110)) - 1;
                f59605e = i411 % 128;
                int i412 = i411 % 2;
            }
            CancelPinPadLaunchRequest cancelPinPadLaunchRequest2 = (CancelPinPadLaunchRequest) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, -285918332, 285918335, System.identityHashCode(setid));
            createVar = (create) CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest2, terminal, setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(cancelPinPadLaunchRequest2));
            if (createVar == null) {
                int i413 = f59604d;
                int i510 = i413 ^ 121;
                int i511 = ((i413 & 121) | i510) << 1;
                int i512 = -i510;
                i17 = ((i511 | i512) << 1) - (i512 ^ i511);
                f59605e = i17 % 128;
                if (i17 % 2 == 0) {
                    int i513 = 53 / 0;
                }
                int i514 = i413 & 91;
                int i515 = (i413 ^ 91) | i514;
                i12 = (i514 & i515) + (i515 | i514);
                f59605e = i12 % 128;
            } else {
                setmaxwidth3 = (setMaxWidth) create.setDividerPadding(new Object[]{createVar}, 719526861, -719526857, System.identityHashCode(createVar));
                if (setmaxwidth3 == null) {
                    i10 = f59605e;
                    i11 = (((i10 | 58) << 1) - (i10 ^ 58)) - 1;
                    f59604d = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i516 = i10 & 79;
                    int i517 = -(-((i10 ^ 79) | i516));
                    i12 = (i516 & i517) + (i517 | i516);
                    f59604d = i12 % 128;
                } else {
                    setmaxwidth4 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth3}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth3));
                    int i518 = f59604d;
                    int i519 = i518 & 29;
                    int i616 = (i518 | 29) & (~i519);
                    int i617 = -(-(i519 << 1));
                    int i618 = (i616 & i617) + (i616 | i617);
                    f59605e = i618 % 128;
                    int i619 = i618 % 2;
                }
                if (setmaxwidth4 == null) {
                    setmaxwidth4 = new setMaxWidth();
                    int i6110 = f59604d;
                    int i6111 = i6110 & 9;
                    int i6112 = (((i6110 | 9) & (~i6111)) - (~(-(-(i6111 << 1))))) - 1;
                    f59605e = i6112 % 128;
                    int i6113 = i6112 % 2;
                } else {
                    int i6114 = f59604d;
                    int i6115 = (i6114 ^ 91) + ((i6114 & 91) << 1);
                    f59605e = i6115 % 128;
                    int i7110 = i6115 % 2;
                }
                if (createVar == null) {
                    int i7111 = f59605e;
                    int i7112 = i7111 & 87;
                    int i7113 = ((i7111 ^ 87) | i7112) << 1;
                    int i7114 = -((~i7112) & (i7111 | 87));
                    int i7115 = (i7113 & i7114) + (i7113 | i7114);
                    f59604d = i7115 % 128;
                    int i7116 = i7115 % 2;
                    int i7117 = ((i7111 ^ 109) | (i7111 & 109)) << 1;
                    int i7118 = -(((~i7111) & 109) | (i7111 & (-110)));
                    int i7119 = (i7117 ^ i7118) + ((i7118 & i7117) << 1);
                    f59604d = i7119 % 128;
                    int i8110 = i7119 % 2;
                } else {
                    map = (Map) create.setDividerPadding(new Object[]{createVar}, 127736117, -127736111, System.identityHashCode(createVar));
                    if (map == null) {
                        i15 = f59605e;
                        int i8111 = i15 & 105;
                        int i8112 = (i15 ^ 105) | i8111;
                        i16 = (i8111 & i8112) + (i8111 | i8112);
                        f59604d = i16 % 128;
                        if (i16 % 2 == 0) {
                            throw null;
                        }
                        int i8113 = i15 + 91;
                        f59604d = i8113 % 128;
                        int i8114 = i8113 % 2;
                    } else {
                        setmax = (setMax) map.get(mdVar);
                        if (setmax == null) {
                            int i8115 = f59605e;
                            int i8116 = i8115 & 15;
                            i14 = i8116 + ((i8115 ^ 15) | i8116);
                            f59604d = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            setmaxwidth5 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                            if (setmaxwidth5 == null) {
                                int i8117 = f59604d;
                                int i8118 = i8117 ^ 119;
                                i13 = (((i8117 & 119) | i8118) << 1) - i8118;
                                f59605e = i13 % 128;
                                if (i13 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                setmaxwidth6 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth5}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth5));
                                int i8119 = f59604d;
                                int i9120 = i8119 & 73;
                                int i9121 = (i8119 | 73) & (~i9120);
                                int i9122 = i9120 << 1;
                                int i9123 = (i9121 & i9122) + (i9121 | i9122);
                                f59605e = i9123 % 128;
                                int i9124 = i9123 % 2;
                            }
                            if (setmaxwidth6 == null) {
                                setmaxwidth6 = new setMaxWidth();
                                int i91110 = f59605e + 61;
                                f59604d = i91110 % 128;
                                int i91111 = i91110 % 2;
                            } else {
                                int i91112 = f59605e;
                                int i91113 = i91112 & 49;
                                int i91114 = i91113 + ((i91112 ^ 49) | i91113);
                                f59604d = i91114 % 128;
                                int i1017 = i91114 % 2;
                            }
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                            int i1018 = f59604d;
                            int i1019 = (i1018 & 77) + (i1018 | 77);
                            f59605e = i1019 % 128;
                            int i10110 = i1019 % 2;
                        }
                    }
                }
                setmaxwidth6 = null;
                if (setmaxwidth6 == null) {
                    setmaxwidth6 = new setMaxWidth();
                    int i91115 = f59605e + 61;
                    f59604d = i91115 % 128;
                    int i91116 = i91115 % 2;
                } else {
                    int i91117 = f59605e;
                    int i91118 = i91117 & 49;
                    int i91119 = i91118 + ((i91117 ^ 49) | i91118);
                    f59604d = i91119 % 128;
                    int i10111 = i91119 % 2;
                }
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                int i10112 = f59604d;
                int i10113 = (i10112 & 77) + (i10112 | 77);
                f59605e = i10113 % 128;
                int i10114 = i10113 % 2;
            }
            int i1020 = i12 % 2;
            setmaxwidth4 = null;
            if (setmaxwidth4 == null) {
                setmaxwidth4 = new setMaxWidth();
                int i6116 = f59604d;
                int i6117 = i6116 & 9;
                int i6118 = (((i6116 | 9) & (~i6117)) - (~(-(-(i6117 << 1))))) - 1;
                f59605e = i6118 % 128;
                int i6119 = i6118 % 2;
            } else {
                int i61110 = f59604d;
                int i61111 = (i61110 ^ 91) + ((i61110 & 91) << 1);
                f59605e = i61111 % 128;
                int i71110 = i61111 % 2;
            }
            if (createVar == null) {
                int i71111 = f59605e;
                int i71112 = i71111 & 87;
                int i71113 = ((i71111 ^ 87) | i71112) << 1;
                int i71114 = -((~i71112) & (i71111 | 87));
                int i71115 = (i71113 & i71114) + (i71113 | i71114);
                f59604d = i71115 % 128;
                int i71116 = i71115 % 2;
                int i71117 = ((i71111 ^ 109) | (i71111 & 109)) << 1;
                int i71118 = -(((~i71111) & 109) | (i71111 & (-110)));
                int i71119 = (i71117 ^ i71118) + ((i71118 & i71117) << 1);
                f59604d = i71119 % 128;
                int i81110 = i71119 % 2;
            } else {
                map = (Map) create.setDividerPadding(new Object[]{createVar}, 127736117, -127736111, System.identityHashCode(createVar));
                if (map == null) {
                    i15 = f59605e;
                    int i81111 = i15 & 105;
                    int i81112 = (i15 ^ 105) | i81111;
                    i16 = (i81111 & i81112) + (i81111 | i81112);
                    f59604d = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                    int i81113 = i15 + 91;
                    f59604d = i81113 % 128;
                    int i81114 = i81113 % 2;
                } else {
                    setmax = (setMax) map.get(mdVar);
                    if (setmax == null) {
                        int i81115 = f59605e;
                        int i81116 = i81115 & 15;
                        i14 = i81116 + ((i81115 ^ 15) | i81116);
                        f59604d = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        setmaxwidth5 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
                        if (setmaxwidth5 == null) {
                            int i81117 = f59604d;
                            int i81118 = i81117 ^ 119;
                            i13 = (((i81117 & 119) | i81118) << 1) - i81118;
                            f59605e = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            setmaxwidth6 = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth5}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth5));
                            int i81119 = f59604d;
                            int i9125 = i81119 & 73;
                            int i9126 = (i81119 | 73) & (~i9125);
                            int i9127 = i9125 << 1;
                            int i9128 = (i9126 & i9127) + (i9126 | i9127);
                            f59605e = i9128 % 128;
                            int i9129 = i9128 % 2;
                        }
                        if (setmaxwidth6 == null) {
                            setmaxwidth6 = new setMaxWidth();
                            int i911110 = f59605e + 61;
                            f59604d = i911110 % 128;
                            int i911111 = i911110 % 2;
                        } else {
                            int i911112 = f59605e;
                            int i911113 = i911112 & 49;
                            int i911114 = i911113 + ((i911112 ^ 49) | i911113);
                            f59604d = i911114 % 128;
                            int i10115 = i911114 % 2;
                        }
                        setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                        setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                        setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
                        int i10116 = f59604d;
                        int i10117 = (i10116 & 77) + (i10116 | 77);
                        f59605e = i10117 % 128;
                        int i10118 = i10117 % 2;
                    }
                }
            }
            setmaxwidth6 = null;
            if (setmaxwidth6 == null) {
                setmaxwidth6 = new setMaxWidth();
                int i911115 = f59605e + 61;
                f59604d = i911115 % 128;
                int i911116 = i911115 % 2;
            } else {
                int i911117 = f59605e;
                int i911118 = i911117 & 49;
                int i911119 = i911118 + ((i911117 ^ 49) | i911118);
                f59604d = i911119 % 128;
                int i10119 = i911119 % 2;
            }
            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth2}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth4}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            setMaxWidth.setX(new Object[]{setmaxwidth, setmaxwidth6}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            int i101110 = f59604d;
            int i101111 = (i101110 & 77) + (i101110 | 77);
            f59605e = i101111 % 128;
            int i101112 = i101111 % 2;
        }
        if (setmaxwidth == null) {
            throw new setIndeterminateDrawable(3021, null, null, 6, null);
        }
        int i110 = f59605e;
        int i111 = i110 & 109;
        int i112 = i111 + ((i110 ^ 109) | i111);
        f59604d = i112 % 128;
        if (i112 % 2 == 0) {
            return setmaxwidth;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:21:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0111  */
    public static /* synthetic */ setMaxWidth b(Object[] objArr) {
        setMaxWidth setmaxwidth;
        int i10;
        setContextClickable setcontextclickable = (setContextClickable) objArr[0];
        Terminal terminal = (Terminal) objArr[1];
        md mdVar = (md) objArr[2];
        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[3];
        int i11 = f59604d;
        int i12 = i11 ^ 71;
        int i13 = ((((i11 & 71) | i12) << 1) - (~(-i12))) - 1;
        f59605e = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        CancelPinPadLaunchRequest<md, setMax> cancelPinPadLaunchRequest = setcontextclickable.f59608c;
        setMax setmax = (setMax) CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, mdVar, setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(cancelPinPadLaunchRequest));
        if (setmax != null) {
            setMaxWidth setmaxwidth2 = (setMaxWidth) setMax.setX(new Object[]{setmax}, 466549121, -466549106, System.identityHashCode(setmax));
            if (setmaxwidth2 == null) {
                int i15 = f59604d;
                int i16 = i15 & 119;
                int i17 = -(-((i15 ^ 119) | i16));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                f59605e = i18 % 128;
                if (i18 % 2 == 0) {
                    throw null;
                }
            } else {
                setmaxwidth = (setMaxWidth) setMaxWidth.setX(new Object[]{setmaxwidth2}, 1678006096, -1678006082, System.identityHashCode(setmaxwidth2));
                int i19 = f59604d;
                int i20 = ((i19 ^ 91) | (i19 & 91)) << 1;
                int i21 = -(((~i19) & 91) | (i19 & (-92)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f59605e = i22 % 128;
                int i23 = i22 % 2;
            }
            if (setmaxwidth == null) {
                int i24 = f59604d;
                int i25 = i24 & 51;
                int i26 = (i24 ^ 51) | i25;
                i10 = (i25 & i26) + (i26 | i25);
                f59605e = i10 % 128;
                if (i10 % 2 != 0) {
                    return setmaxwidth;
                }
                throw null;
            }
            int i27 = f59604d;
            int i28 = (i27 & 103) + (i27 | 103);
            f59605e = i28 % 128;
            int i29 = i28 % 2;
            setMaxWidth setmaxwidth3 = (setMaxWidth) setDividerPadding(new Object[]{setcontextclickable, terminal, mdVar, setbackgroundtintlist}, 1802238894, -1802238888, System.identityHashCode(setcontextclickable));
            int i30 = f59604d + 89;
            f59605e = i30 % 128;
            int i31 = i30 % 2;
            return setmaxwidth3;
        }
        int i32 = f59604d;
        int i33 = (((i32 | 42) << 1) - (i32 ^ 42)) - 1;
        f59605e = i33 % 128;
        if (i33 % 2 == 0) {
            int i34 = 64 / 0;
        }
        int i35 = ((i32 & (-34)) | ((~i32) & 33)) + ((i32 & 33) << 1);
        f59605e = i35 % 128;
        int i36 = i35 % 2;
        setmaxwidth = null;
        if (setmaxwidth == null) {
            int i210 = f59604d;
            int i211 = i210 & 51;
            int i212 = (i210 ^ 51) | i211;
            i10 = (i211 & i212) + (i212 | i211);
            f59605e = i10 % 128;
            if (i10 % 2 != 0) {
                return setmaxwidth;
            }
            throw null;
        }
        int i213 = f59604d;
        int i214 = (i213 & 103) + (i213 | 103);
        f59605e = i214 % 128;
        int i215 = i214 % 2;
        setMaxWidth setmaxwidth4 = (setMaxWidth) setDividerPadding(new Object[]{setcontextclickable, terminal, mdVar, setbackgroundtintlist}, 1802238894, -1802238888, System.identityHashCode(setcontextclickable));
        int i37 = f59604d + 89;
        f59605e = i37 % 128;
        int i38 = i37 % 2;
        return setmaxwidth4;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x029b  */
    /* JADX WARN: Code duplicated, block: B:26:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:28:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:30:0x02d5  */
    public static /* synthetic */ List c(Object[] objArr) {
        ArrayList arrayList;
        int i10;
        char c10 = 0;
        setContextClickable setcontextclickable = (setContextClickable) objArr[0];
        int i11 = 1;
        md mdVar = (md) objArr[1];
        int i12 = f59604d;
        int i13 = i12 & 23;
        int i14 = (((i12 | 23) & (~i13)) - (~(-(-(i13 << 1))))) - 1;
        f59605e = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(mdVar, "");
        setId setid = setcontextclickable.f59607b;
        if (setid == null) {
            int i16 = f59604d;
            int i17 = i16 & 91;
            int i18 = ((((i16 ^ 91) | i17) << 1) - (~(-((i16 | 91) & (~i17))))) - 1;
            int i19 = i18 % 128;
            f59605e = i19;
            int i20 = i18 % 2;
            int i21 = i19 & 117;
            int i22 = -(-((i19 ^ 117) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f59604d = i23 % 128;
            int i24 = i23 % 2;
        } else {
            Map map = (Map) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 1633912096, -1633912091, System.identityHashCode(setid));
            if (map != null) {
                List list = (List) map.get(mdVar);
                if (list == null) {
                    int i25 = f59604d;
                    int i26 = i25 & 13;
                    int i27 = i26 + ((i25 ^ 13) | i26);
                    f59605e = i27 % 128;
                    if (i27 % 2 == 0) {
                        throw null;
                    }
                } else {
                    List<setMax> list2 = list;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    int i28 = f59604d;
                    int i29 = i28 & 85;
                    int i30 = ((i28 ^ 85) | i29) << 1;
                    int i31 = -((i28 | 85) & (~i29));
                    int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                    f59605e = i32 % 128;
                    int i33 = i32 % 2;
                    for (setMax setmax : list2) {
                        Object[] objArr2 = new Object[i11];
                        objArr2[c10] = setmax;
                        setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setMax.setX(objArr2, 1901627190, -1901627173, System.identityHashCode(setmax));
                        Object[] objArr3 = new Object[i11];
                        objArr3[c10] = setmax;
                        Terminal terminal = (Terminal) setMax.setX(objArr3, -1116972605, 1116972608, System.identityHashCode(setmax));
                        Object[] objArr4 = new Object[i11];
                        objArr4[c10] = setmax;
                        boolean zBooleanValue = ((Boolean) setMax.setX(objArr4, 1497723990, -1497723985, System.identityHashCode(setmax))).booleanValue();
                        Object[] objArr5 = new Object[i11];
                        objArr5[c10] = setmax;
                        Boolean bool = (Boolean) setMax.setX(objArr5, 1649969822, -1649969809, System.identityHashCode(setmax));
                        Object[] objArr6 = new Object[i11];
                        objArr6[c10] = setmax;
                        boolean zBooleanValue2 = ((Boolean) setMax.setX(objArr6, 605633600, -605633589, System.identityHashCode(setmax))).booleanValue();
                        Object[] objArr7 = new Object[i11];
                        objArr7[c10] = setmax;
                        boolean zBooleanValue3 = ((Boolean) setMax.setX(objArr7, 3314454, -3314438, System.identityHashCode(setmax))).booleanValue();
                        Object[] objArr8 = new Object[i11];
                        objArr8[c10] = setmax;
                        boolean zBooleanValue4 = ((Boolean) setMax.setX(objArr8, 1793045552, -1793045531, System.identityHashCode(setmax))).booleanValue();
                        Object[] objArr9 = new Object[i11];
                        objArr9[c10] = setmax;
                        Long l6 = (Long) setMax.setX(objArr9, 1485288090, -1485288080, System.identityHashCode(setmax));
                        Object[] objArr10 = new Object[i11];
                        objArr10[c10] = setmax;
                        Long l7 = (Long) setMax.setX(objArr10, -830321268, 830321272, System.identityHashCode(setmax));
                        Object[] objArr11 = new Object[i11];
                        objArr11[0] = setmax;
                        ArrayList arrayList3 = arrayList2;
                        setMax setmax2 = new setMax(mdVar, terminal, setbackgroundtintlist, zBooleanValue, bool, zBooleanValue2, zBooleanValue3, zBooleanValue4, l6, l7, (Long) setMax.setX(objArr11, 679016108, -679016106, System.identityHashCode(setmax)), (List) setMax.setX(new Object[]{setmax}, -1485936157, 1485936171, System.identityHashCode(setmax)), (setMaxWidth) setDividerPadding(new Object[]{setcontextclickable, (Terminal) setMax.setX(new Object[]{setmax}, -1116972605, 1116972608, System.identityHashCode(setmax)), mdVar, (setBackgroundTintList) setMax.setX(new Object[]{setmax}, 1901627190, -1901627173, System.identityHashCode(setmax))}, 1802238894, -1802238888, System.identityHashCode(setcontextclickable)), null, 8192, null);
                        setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setMax.setX(new Object[]{setmax}, 1901627190, -1901627173, System.identityHashCode(setmax));
                        CancelPinPadLaunchRequest<md, setMax> cancelPinPadLaunchRequest = setcontextclickable.f59608c;
                        CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, mdVar, setbackgroundtintlist2, setmax2}, -235006928, 235006933, System.identityHashCode(cancelPinPadLaunchRequest));
                        arrayList3.add(setmax2);
                        int i34 = f59605e;
                        int i35 = i34 ^ 1;
                        int i36 = ((i34 & 1) | i35) << 1;
                        int i37 = -i35;
                        int i38 = (i36 & i37) + (i36 | i37);
                        f59604d = i38 % 128;
                        int i39 = i38 % 2;
                        arrayList2 = arrayList3;
                        c10 = 0;
                        i11 = 1;
                    }
                    int i40 = f59604d;
                    int i41 = i40 & 85;
                    int i42 = i41 + ((i40 ^ 85) | i41);
                    f59605e = i42 % 128;
                    int i43 = i42 % 2;
                    arrayList = arrayList2;
                }
                if (arrayList == null) {
                    int i44 = f59604d + 51;
                    f59605e = i44 % 128;
                    int i45 = i44 % 2;
                    return arrayList;
                }
                int i46 = f59605e;
                int i47 = (i46 | 95) << 1;
                int i48 = -(((~i46) & 95) | (i46 & (-96)));
                i10 = (i47 & i48) + (i48 | i47);
                f59604d = i10 % 128;
                if (i10 % 2 == 0) {
                    CollectionsKt__CollectionsKt.emptyList();
                    throw null;
                }
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                int i49 = f59605e;
                int i50 = i49 & 91;
                int i51 = (i49 | 91) & (~i50);
                int i52 = i50 << 1;
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                f59604d = i53 % 128;
                int i54 = i53 % 2;
                return listEmptyList;
            }
            int i55 = f59605e;
            int i56 = (i55 & (-114)) | ((~i55) & 113);
            int i57 = -(-((i55 & 113) << 1));
            int i58 = (i56 & i57) + (i57 | i56);
            f59604d = i58 % 128;
            if (i58 % 2 != 0) {
                throw null;
            }
        }
        arrayList = null;
        if (arrayList == null) {
            int i410 = f59604d + 51;
            f59605e = i410 % 128;
            int i411 = i410 % 2;
            return arrayList;
        }
        int i412 = f59605e;
        int i413 = (i412 | 95) << 1;
        int i414 = -(((~i412) & 95) | (i412 & (-96)));
        i10 = (i413 & i414) + (i414 | i413);
        f59604d = i10 % 128;
        if (i10 % 2 == 0) {
            CollectionsKt__CollectionsKt.emptyList();
            throw null;
        }
        List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        int i415 = f59605e;
        int i59 = i415 & 91;
        int i510 = (i415 | 91) & (~i59);
        int i511 = i59 << 1;
        int i512 = ((i510 | i511) << 1) - (i510 ^ i511);
        f59604d = i512 % 128;
        int i513 = i512 % 2;
        return listEmptyList2;
    }

    public static /* synthetic */ List d(Object[] objArr) {
        List list;
        setContextClickable setcontextclickable = (setContextClickable) objArr[0];
        int i10 = f59605e + 51;
        f59604d = i10 % 128;
        int i11 = i10 % 2;
        setId setid = setcontextclickable.f59607b;
        if (setid == null) {
            int iIdentityHashCode = System.identityHashCode(setcontextclickable);
            int i12 = ~(((-1919517170) & iIdentityHashCode) | ((-1919517170) ^ iIdentityHashCode));
            int i13 = 308379889 & i12;
            int i14 = (i12 | 308379889) & (~i13);
            int i15 = (-2) - ((1803396937 - (~(((i14 & i13) | (i14 ^ i13)) * (-140)))) ^ (-1));
            int i16 = ((-1611137281) & iIdentityHashCode) | ((-1611137281) ^ iIdentityHashCode);
            int i17 = ~i16;
            int i18 = ((i16 | i17) & i17) * 70;
            int i19 = ((~i18) & i15) | ((~i15) & i18);
            int i20 = (i15 & i18) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = 519161081 ^ iIdentityHashCode;
            int i23 = iIdentityHashCode & 519161081;
            int i24 = (i23 & i22) | (i22 ^ i23);
            int i25 = ~i24;
            int i26 = (i24 | i25) & i25;
            int i27 = (-1821918473) & i26;
            int i28 = (i26 | (-1821918473)) & (~i27);
            int i29 = -(~(-(-(((i28 & i27) | (i28 ^ i27)) * 70))));
            int i30 = (i21 & i29) + (i29 | i21);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            int iIdentityHashCode2 = System.identityHashCode(setcontextclickable);
            int i32 = 314507173 & iIdentityHashCode2;
            int i33 = (~i32) & (314507173 | iIdentityHashCode2);
            int i34 = (i32 & i33) | (i33 ^ i32);
            int i35 = (i34 & 1589698998) | ((~i34) & (-1589698999));
            int i36 = i34 & (-1589698999);
            int i37 = ((i36 & i35) | (i35 ^ i36)) * (-627);
            int i38 = ((1840567100 | i37) << 1) - (i37 ^ 1840567100);
            int i39 = ~(((-314507174) & iIdentityHashCode2) | ((-314507174) ^ iIdentityHashCode2));
            int i40 = -(~(-(-(((i39 & 1589698998) | (1589698998 ^ i39)) * (-627)))));
            int i41 = (-2) - (((i38 & i40) + (i40 | i38)) ^ (-1));
            int i42 = ~iIdentityHashCode2;
            int i43 = i42 & 314507173;
            int i44 = ~(((314507173 | i42) & (~i43)) | i43);
            int i45 = ~((iIdentityHashCode2 & 1589698998) | (1589698998 ^ iIdentityHashCode2));
            int i46 = -(-(((i45 & i44) | (i44 ^ i45)) * 627));
            if (i31 > ((i41 | i46) << 1) - (i46 ^ i41)) {
                throw null;
            }
            list = null;
        } else {
            list = (List) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 2058426419, -2058426417, System.identityHashCode(setid));
            int i47 = f59604d;
            int i48 = i47 & 77;
            int i49 = ((((i47 ^ 77) | i48) << 1) - (~(-((i47 | 77) & (~i48))))) - 1;
            f59605e = i49 % 128;
            int i50 = i49 % 2;
        }
        if (list == null) {
            throw new setIndeterminateDrawable(3021, null, null, 6, null);
        }
        int i51 = f59605e + 45;
        f59604d = i51 % 128;
        if (i51 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        setContextClickable setcontextclickable = (setContextClickable) objArr[0];
        int i10 = f59605e + 83;
        f59604d = i10 % 128;
        if (i10 % 2 != 0) {
            setcontextclickable.f59607b = null;
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Terminal config is cleared"}, 818541572, -818541572, (int) System.currentTimeMillis());
            throw null;
        }
        setcontextclickable.f59607b = null;
        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{"Terminal config is cleared"}, 818541572, -818541572, (int) System.currentTimeMillis());
        int i11 = f59604d + 75;
        f59605e = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:123:0x0724 A[PHI: r1
      0x0724: PHI (r1v44 com.mypinpad.tsdk.i.setId) = (r1v24 com.mypinpad.tsdk.i.setId), (r1v61 com.mypinpad.tsdk.i.setId) binds: [B:120:0x06fc, B:117:0x06f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x073b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0752  */
    /* JADX WARN: Code duplicated, block: B:129:0x0753  */
    /* JADX WARN: Code duplicated, block: B:131:0x075b  */
    /* JADX WARN: Code duplicated, block: B:132:0x077a  */
    /* JADX WARN: Code duplicated, block: B:134:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x051e  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setId setid;
        int i13;
        int i14;
        List setmaxwidth;
        int i15;
        Map map;
        getCurrency getcurrency;
        int i16;
        int i17;
        Object next;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = ~(i18 | i19);
        int i21 = ~i10;
        int i22 = ((i20 | (~(i21 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i23 = (~(i12 | i18)) | (~(i21 | i19));
        int i24 = ~(i10 | i11);
        Object obj = null;
        char c10 = 0;
        switch ((i24 * 370) + ((i23 | i24) * (-370)) + i22) {
            case 1:
                e(objArr);
                return null;
            case 2:
                setContextClickable setcontextclickable = (setContextClickable) objArr[0];
                int i25 = f59605e;
                int i26 = ((i25 ^ 104) + ((i25 & 104) << 1)) - 1;
                int i27 = i26 % 128;
                f59604d = i27;
                int i28 = i26 % 2;
                setId setid2 = setcontextclickable.f59607b;
                if (setid2 == null) {
                    int i29 = (i27 & (-10)) | ((~i27) & 9);
                    int i30 = -(-((i27 & 9) << 1));
                    int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
                    f59605e = i31 % 128;
                    int i32 = i31 % 2;
                    int i33 = ((i27 | 103) << 1) - (i27 ^ 103);
                    f59605e = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    obj = (List) setId.setCompoundDrawableTintBlendMode(new Object[]{setid2}, 1593631797, -1593631797, System.identityHashCode(setid2));
                    int i35 = f59604d;
                    int i36 = i35 & 123;
                    int i37 = -(-(i35 | 123));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    f59605e = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (obj == null) {
                    throw new setIndeterminateDrawable(3021, null, null, 6, null);
                }
                int i40 = f59605e;
                int i41 = ((i40 | 73) << 1) - (i40 ^ 73);
                f59604d = i41 % 128;
                int i42 = i41 % 2;
                return obj;
            case 3:
                return b(objArr);
            case 4:
                return d(objArr);
            case 5:
                setContextClickable setcontextclickable2 = (setContextClickable) objArr[0];
                Terminal terminal = (Terminal) objArr[1];
                int i43 = f59605e;
                int i44 = i43 & 11;
                int i45 = (i43 | 11) & (~i44);
                int i46 = -(-(i44 << 1));
                int i47 = (i45 & i46) + (i45 | i46);
                f59604d = i47 % 128;
                if (i47 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(terminal, "");
                    setid = setcontextclickable2.f59607b;
                    int i48 = 75 / 0;
                    if (setid == null) {
                        int i49 = f59604d;
                        int i50 = i49 & 123;
                        int i51 = ((((i49 ^ 123) | i50) << 1) - (~(-((i49 | 123) & (~i50))))) - 1;
                        int i52 = i51 % 128;
                        f59605e = i52;
                        int i53 = i51 % 2;
                        int i54 = i52 ^ 41;
                        i13 = ((((i52 & 41) | i54) << 1) - (~(-i54))) - 1;
                        f59604d = i13 % 128;
                    } else {
                        map = (Map) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 1240606079, -1240606069, System.identityHashCode(setid));
                        if (map == null) {
                            int i55 = f59604d;
                            i16 = (((i55 ^ 87) | (i55 & 87)) << 1) - (((~i55) & 87) | (i55 & (-88)));
                            f59605e = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            getcurrency = (getCurrency) map.get(terminal);
                            if (getcurrency == null) {
                                int i56 = f59605e;
                                int i57 = i56 ^ 115;
                                int i58 = ((i56 & 115) | i57) << 1;
                                int i59 = -i57;
                                int i60 = (i58 & i59) + (i58 | i59);
                                int i61 = i60 % 128;
                                f59604d = i61;
                                int i62 = i60 % 2;
                                int i63 = i61 & 21;
                                i13 = ((i61 | 21) & (~i63)) + (i63 << 1);
                                f59605e = i13 % 128;
                            } else {
                                obj = (setMaxWidth) getCurrency.setX(new Object[]{getcurrency}, -614599099, 614599102, System.identityHashCode(getcurrency));
                                int i64 = f59605e;
                                int i65 = i64 ^ 93;
                                int i66 = ((i64 & 93) | i65) << 1;
                                int i67 = -i65;
                                int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
                                f59604d = i68 % 128;
                                int i69 = i68 % 2;
                            }
                        }
                        if (obj == null) {
                            int i70 = f59605e;
                            int i71 = i70 & 11;
                            i14 = (i71 - (~(-(-((i70 ^ 11) | i71))))) - 1;
                            f59604d = i14 % 128;
                            if (i14 % 2 != 0) {
                                return obj;
                            }
                            int i72 = 57 / 0;
                            return obj;
                        }
                        setmaxwidth = new setMaxWidth();
                        i15 = f59605e + 109;
                        f59604d = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i73 = 16 / 0;
                        }
                    }
                    int i74 = i13 % 2;
                    if (obj == null) {
                        int i75 = f59605e;
                        int i76 = i75 & 11;
                        i14 = (i76 - (~(-(-((i75 ^ 11) | i76))))) - 1;
                        f59604d = i14 % 128;
                        if (i14 % 2 != 0) {
                            return obj;
                        }
                        int i77 = 57 / 0;
                        return obj;
                    }
                    setmaxwidth = new setMaxWidth();
                    i15 = f59605e + 109;
                    f59604d = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i78 = 16 / 0;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(terminal, "");
                    setid = setcontextclickable2.f59607b;
                    if (setid == null) {
                        int i410 = f59604d;
                        int i510 = i410 & 123;
                        int i511 = ((((i410 ^ 123) | i510) << 1) - (~(-((i410 | 123) & (~i510))))) - 1;
                        int i512 = i511 % 128;
                        f59605e = i512;
                        int i513 = i511 % 2;
                        int i514 = i512 ^ 41;
                        i13 = ((((i512 & 41) | i514) << 1) - (~(-i514))) - 1;
                        f59604d = i13 % 128;
                    } else {
                        map = (Map) setId.setCompoundDrawableTintBlendMode(new Object[]{setid}, 1240606079, -1240606069, System.identityHashCode(setid));
                        if (map == null) {
                            int i515 = f59604d;
                            i16 = (((i515 ^ 87) | (i515 & 87)) << 1) - (((~i515) & 87) | (i515 & (-88)));
                            f59605e = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            getcurrency = (getCurrency) map.get(terminal);
                            if (getcurrency == null) {
                                int i516 = f59605e;
                                int i517 = i516 ^ 115;
                                int i518 = ((i516 & 115) | i517) << 1;
                                int i519 = -i517;
                                int i610 = (i518 & i519) + (i518 | i519);
                                int i611 = i610 % 128;
                                f59604d = i611;
                                int i612 = i610 % 2;
                                int i613 = i611 & 21;
                                i13 = ((i611 | 21) & (~i613)) + (i613 << 1);
                                f59605e = i13 % 128;
                            } else {
                                obj = (setMaxWidth) getCurrency.setX(new Object[]{getcurrency}, -614599099, 614599102, System.identityHashCode(getcurrency));
                                int i614 = f59605e;
                                int i615 = i614 ^ 93;
                                int i616 = ((i614 & 93) | i615) << 1;
                                int i617 = -i615;
                                int i618 = (i616 ^ i617) + ((i616 & i617) << 1);
                                f59604d = i618 % 128;
                                int i619 = i618 % 2;
                            }
                        }
                        if (obj == null) {
                            int i79 = f59605e;
                            int i710 = i79 & 11;
                            i14 = (i710 - (~(-(-((i79 ^ 11) | i710))))) - 1;
                            f59604d = i14 % 128;
                            if (i14 % 2 != 0) {
                                return obj;
                            }
                            int i711 = 57 / 0;
                            return obj;
                        }
                        setmaxwidth = new setMaxWidth();
                        i15 = f59605e + 109;
                        f59604d = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i712 = 16 / 0;
                        }
                    }
                    int i713 = i13 % 2;
                    if (obj == null) {
                        int i714 = f59605e;
                        int i715 = i714 & 11;
                        i14 = (i715 - (~(-(-((i714 ^ 11) | i715))))) - 1;
                        f59604d = i14 % 128;
                        if (i14 % 2 != 0) {
                            return obj;
                        }
                        int i716 = 57 / 0;
                        return obj;
                    }
                    setmaxwidth = new setMaxWidth();
                    i15 = f59605e + 109;
                    f59604d = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i717 = 16 / 0;
                    }
                }
                break;
            case 6:
                return a(objArr);
            case 7:
                return c(objArr);
            case 8:
                setContextClickable setcontextclickable3 = (setContextClickable) objArr[0];
                int i80 = f59605e;
                int i81 = ((i80 ^ 37) - (~((i80 & 37) << 1))) - 1;
                int i82 = i81 % 128;
                f59604d = i82;
                int i83 = i81 % 2;
                setId setid3 = setcontextclickable3.f59607b;
                if (setid3 == null) {
                    int i84 = i82 & 117;
                    int i85 = (~i84) & (i82 | 117);
                    int i86 = i84 << 1;
                    int i87 = (i85 & i86) + (i86 | i85);
                    f59605e = i87 % 128;
                    int i88 = i87 % 2;
                    int i89 = i82 & 45;
                    int i90 = (i82 | 45) & (~i89);
                    int i91 = -(-(i89 << 1));
                    int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                    f59605e = i92 % 128;
                    int i93 = i92 % 2;
                    setmaxwidth = null;
                } else {
                    setmaxwidth = (List) setId.setCompoundDrawableTintBlendMode(new Object[]{setid3}, 1695868503, -1695868496, System.identityHashCode(setid3));
                    int i94 = f59605e;
                    int i95 = i94 & 75;
                    int i96 = i94 | 75;
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    f59604d = i97 % 128;
                    int i98 = i97 % 2;
                }
                if (setmaxwidth == null) {
                    throw new setIndeterminateDrawable(3021, null, null, 6, null);
                }
                int i99 = f59605e;
                int i100 = ((i99 ^ 7) | (i99 & 7)) << 1;
                int i101 = -(((~i99) & 7) | (i99 & (-8)));
                int i102 = (i100 & i101) + (i101 | i100);
                f59604d = i102 % 128;
                if (i102 % 2 != 0) {
                    throw null;
                }
                break;
            case 9:
                setContextClickable setcontextclickable4 = (setContextClickable) objArr[0];
                Terminal terminal2 = (Terminal) objArr[1];
                int i103 = f59604d + 77;
                f59605e = i103 % 128;
                if (i103 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(terminal2, "");
                    setId setid4 = setcontextclickable4.f59607b;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(terminal2, "");
                setId setid5 = setcontextclickable4.f59607b;
                if (setid5 == null) {
                    int i104 = f59604d + 91;
                    f59605e = i104 % 128;
                    if (i104 % 2 == 0) {
                        throw null;
                    }
                } else {
                    Map map2 = (Map) setId.setCompoundDrawableTintBlendMode(new Object[]{setid5}, 1240606079, -1240606069, System.identityHashCode(setid5));
                    if (map2 == null) {
                        int i105 = f59604d;
                        int i106 = ((i105 & (-18)) | ((~i105) & 17)) + ((i105 & 17) << 1);
                        int i107 = i106 % 128;
                        f59605e = i107;
                        int i108 = i106 % 2;
                        int i109 = ((i107 | 79) << 1) - (i107 ^ 79);
                        f59604d = i109 % 128;
                        int i110 = i109 % 2;
                    } else {
                        getCurrency getcurrency2 = (getCurrency) map2.get(terminal2);
                        if (getcurrency2 == null) {
                            int i111 = f59604d;
                            int i112 = i111 & 59;
                            int i113 = (i112 - (~((i111 ^ 59) | i112))) - 1;
                            f59605e = i113 % 128;
                            int i114 = i113 % 2;
                            i17 = (i111 ^ 27) + ((i111 & 27) << 1);
                            f59605e = i17 % 128;
                        } else {
                            obj = (getInstallationId) getCurrency.setX(new Object[]{getcurrency2}, 420009329, -420009329, System.identityHashCode(getcurrency2));
                            int i115 = f59605e;
                            i17 = ((i115 ^ 11) - (~((i115 & 11) << 1))) - 1;
                            f59604d = i17 % 128;
                        }
                        int i116 = i17 % 2;
                    }
                }
                if (obj == null) {
                    throw new setIndeterminateDrawable(3027, String.valueOf((int) terminal2.setY()), null, 4, null);
                }
                int i117 = f59605e;
                int i118 = i117 & 7;
                int i119 = i118 + ((i117 ^ 7) | i118);
                f59604d = i119 % 128;
                if (i119 % 2 == 0) {
                    return obj;
                }
                int i120 = 47 / 0;
                return obj;
            case 10:
                setContextClickable setcontextclickable5 = (setContextClickable) objArr[0];
                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[1];
                md mdVar = (md) objArr[2];
                List list = (List) objArr[3];
                int i121 = f59605e;
                int i122 = (i121 ^ 55) + ((i121 & 55) << 1);
                f59604d = i122 % 128;
                int i123 = i122 % 2;
                Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
                Intrinsics.checkNotNullParameter(mdVar, "");
                Intrinsics.checkNotNullParameter(list, "");
                setId setid6 = setcontextclickable5.f59607b;
                if (setid6 == null) {
                    throw new setIndeterminateDrawable(3021, null, null, 6, null);
                }
                CancelPinPadLaunchRequest cancelPinPadLaunchRequest = (CancelPinPadLaunchRequest) setId.setCompoundDrawableTintBlendMode(new Object[]{setid6}, -1452003193, 1452003194, System.identityHashCode(setid6));
                Object onFocusChangeListener = CancelPinPadLaunchRequest.setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest, mdVar, setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(cancelPinPadLaunchRequest));
                setMax setmax = (setMax) onFocusChangeListener;
                if (setmax != null) {
                    int i124 = f59605e;
                    int i125 = ((i124 & (-6)) | ((~i124) & 5)) + ((i124 & 5) << 1);
                    f59604d = i125 % 128;
                    int i126 = i125 % 2;
                    if (!((Boolean) setMax.setX(new Object[]{setmax}, 3314454, -3314438, System.identityHashCode(setmax))).booleanValue()) {
                        int i127 = f59604d;
                        int i128 = i127 & 81;
                        int i129 = -(-(i127 | 81));
                        int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
                        f59605e = i130 % 128;
                        int i131 = i130 % 2;
                        byte[] bArr = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist));
                        setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setMax.setX(new Object[]{setmax}, 1901627190, -1901627173, System.identityHashCode(setmax));
                        if (!Arrays.equals(bArr, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2)))) {
                            int i132 = f59605e;
                            int i133 = i132 & 121;
                            int i134 = (i132 | 121) & (~i133);
                            int i135 = i133 << 1;
                            int i136 = (i134 ^ i135) + ((i134 & i135) << 1);
                            int i137 = i136 % 128;
                            f59604d = i137;
                            int i138 = i136 % 2;
                            int i139 = ((i137 | 11) << 1) - (i137 ^ 11);
                            f59605e = i139 % 128;
                            int i140 = i139 % 2;
                        }
                    }
                    int i141 = f59604d;
                    int i142 = (i141 & 27) + (i141 | 27);
                    int i143 = i142 % 128;
                    f59605e = i143;
                    int i144 = i142 % 2;
                    int i145 = i143 & 99;
                    int i146 = i145 + ((i143 ^ 99) | i145);
                    f59604d = i146 % 128;
                    if (i146 % 2 != 0) {
                        throw null;
                    }
                    obj = onFocusChangeListener;
                } else {
                    int i1310 = f59605e;
                    int i1311 = i1310 & 121;
                    int i1312 = (i1310 | 121) & (~i1311);
                    int i1313 = i1311 << 1;
                    int i1314 = (i1312 ^ i1313) + ((i1312 & i1313) << 1);
                    int i1315 = i1314 % 128;
                    f59604d = i1315;
                    int i1316 = i1314 % 2;
                    int i1317 = ((i1315 | 11) << 1) - (i1315 ^ 11);
                    f59605e = i1317 % 128;
                    int i147 = i1317 % 2;
                }
                setMax setmax2 = (setMax) obj;
                int i148 = f59604d;
                int i149 = i148 & 57;
                int i150 = (i149 - (~((i148 ^ 57) | i149))) - 1;
                f59605e = i150 % 128;
                int i151 = i150 % 2;
                return setmax2;
            case 11:
                setContextClickable setcontextclickable6 = (setContextClickable) objArr[0];
                int i152 = f59605e;
                int i153 = (i152 & 37) + (i152 | 37);
                f59604d = i153 % 128;
                int i154 = i153 % 2;
                byte[] onFocusChangeListener2 = setcontextclickable6.f59606a.setOnFocusChangeListener();
                if (onFocusChangeListener2 == null) {
                    throw new setIndeterminateDrawable(3021, null, null, 6, null);
                }
                getImmersiveMode getimmersivemode = getImmersiveMode.INSTANCE;
                setGroupIndicator setgroupindicator = (setGroupIndicator) getImmersiveMode.setDividerPadding(new Object[]{new String(onFocusChangeListener2, Charsets.UTF_8)}, -822279764, 822279764, (int) System.currentTimeMillis());
                component1 component1Var = component1.INSTANCE;
                setcontextclickable6.f59607b = (setId) component1.setOnFocusChangeListener(new Object[]{setgroupindicator}, -1978374289, 1978374290, (int) System.currentTimeMillis());
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{"Terminal config is set"}, 818541572, -818541572, (int) System.currentTimeMillis());
                int iIdentityHashCode = System.identityHashCode(setcontextclickable6);
                int i155 = ~iIdentityHashCode;
                int i156 = (-565859551) | i155;
                int i157 = ~i156;
                int i158 = (i156 | i157) & i157;
                int i159 = ((i158 & (-966080022)) | ((~i158) & (-966080022)) | (966080021 & i158)) * (-235);
                int i160 = 641710638 & i159;
                int i161 = (i159 | 641710638) & (~i160);
                int i162 = i160 << 1;
                int i163 = ((i161 | i162) << 1) - (i161 ^ i162);
                int i164 = (-565859551) & iIdentityHashCode;
                int i165 = ((-565859551) | iIdentityHashCode) & (~i164);
                int i166 = (i165 & i164) | (i165 ^ i164);
                int i167 = ~i166;
                int i168 = (i166 | i167) & i167;
                int i169 = ((i168 & (-966080022)) | ((-966080022) ^ i168)) * (-470);
                int i170 = i163 & i169;
                int i171 = -(-(i169 | i163));
                int i172 = (i170 & i171) + (i171 | i170);
                int i173 = (i155 & (-563090453)) | (563090452 & iIdentityHashCode);
                int i174 = iIdentityHashCode & (-563090453);
                int i175 = ~((i174 & i173) | (i173 ^ i174));
                int i176 = (-968849120) ^ i175;
                int i177 = i175 & (-968849120);
                int i178 = -(-(((i177 & i176) | (i176 ^ i177)) * 235));
                int i179 = i172 ^ i178;
                int i180 = ((((i178 & i172) | i179) << 1) - (~(-i179))) - 1;
                int iIdentityHashCode2 = System.identityHashCode(setcontextclickable6);
                int i181 = ~iIdentityHashCode2;
                int i182 = (-1150237224) & i181;
                int i183 = ~(i182 | ((~i182) & ((-1150237224) | i181)));
                int i184 = i183 & 731170;
                int i185 = (i183 | 731170) & (~i184);
                int i186 = (-735253294) - (~(((i185 & i184) | (i185 ^ i184)) * 98));
                int i187 = ~((i181 & 188426538) | (188426538 ^ i181));
                int i188 = (-1150237224) ^ i187;
                int i189 = i187 & (-1150237224);
                int i190 = (i189 & i188) | (i188 ^ i189);
                int i191 = ~((-188426539) | iIdentityHashCode2);
                int i192 = i190 & i191;
                int i193 = (i190 | i191) & (~i192);
                int i194 = -(~(-(-(((i193 & i192) | (i193 ^ i192)) * (-49)))));
                int i195 = ((i186 ^ i194) + ((i194 & i186) << 1)) - 1;
                int i196 = (iIdentityHashCode2 & (-1150237224)) | ((-1150237224) ^ iIdentityHashCode2);
                int i197 = ~i196;
                int i198 = (i196 | i197) & i197;
                int i199 = ((i198 & 187695368) | (i198 ^ 187695368)) * 49;
                int i200 = i195 & i199;
                int i201 = i199 | i195;
                if (i180 <= (i200 ^ i201) + ((i201 & i200) << 1)) {
                    return null;
                }
                int i202 = 82 / 0;
                return null;
            default:
                setContextClickable setcontextclickable7 = (setContextClickable) objArr[0];
                Terminal terminal3 = (Terminal) objArr[1];
                int i203 = f59605e;
                int i204 = i203 & 41;
                int i205 = -(-(i203 | 41));
                int i206 = (i204 & i205) + (i205 | i204);
                f59604d = i206 % 128;
                int i207 = i206 % 2;
                Intrinsics.checkNotNullParameter(terminal3, "");
                setId setid7 = setcontextclickable7.f59607b;
                if (setid7 == null) {
                    throw new setIndeterminateDrawable(3021, null, null, 6, null);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                setPopupTheme setpopuptheme = (setPopupTheme) setId.setCompoundDrawableTintBlendMode(new Object[]{setid7}, -1871279024, 1871279028, System.identityHashCode(setid7));
                List list2 = (List) setPopupTheme.setDividerPadding(new Object[]{setpopuptheme}, 1215054017, -1215054014, System.identityHashCode(setpopuptheme));
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                int i208 = f59605e;
                int i209 = (((i208 | 57) << 1) - (~(-((i208 & (-58)) | (57 & (~i208)))))) - 1;
                f59604d = i209 % 128;
                int i210 = i209 % 2;
                while (it.hasNext()) {
                    int i211 = f59605e;
                    int i212 = ((i211 ^ 102) + ((i211 & 102) << 1)) - 1;
                    f59604d = i212 % 128;
                    if (i212 % 2 != 0) {
                        throw null;
                    }
                    String str = (String) it.next();
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    objArr2[1] = str;
                    objArr2[2] = terminal3;
                    TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(objArr2, 1427362050, -1427362043, (int) System.currentTimeMillis());
                    if (transactionFailed != null) {
                        int i213 = f59605e + 27;
                        f59604d = i213 % 128;
                        if (i213 % 2 != 0) {
                            arrayList.add(transactionFailed);
                            throw null;
                        }
                        arrayList.add(transactionFailed);
                    } else {
                        int i214 = f59604d;
                        int i215 = i214 & 99;
                        int i216 = ((i214 | 99) & (~i215)) + (i215 << 1);
                        f59605e = i216 % 128;
                        int i217 = i216 % 2;
                    }
                    c10 = 0;
                }
                char c11 = c10;
                linkedHashSet.addAll(arrayList);
                Object[] objArr3 = new Object[1];
                objArr3[c11] = setid7;
                setPopupTheme setpopuptheme2 = (setPopupTheme) setId.setCompoundDrawableTintBlendMode(objArr3, -1871279024, 1871279028, System.identityHashCode(setid7));
                Object[] objArr4 = new Object[1];
                objArr4[c11] = setpopuptheme2;
                Iterator it2 = ((List) setPopupTheme.setDividerPadding(objArr4, -1681328695, 1681328699, System.identityHashCode(setpopuptheme2))).iterator();
                int i218 = f59605e;
                int i219 = i218 & 99;
                int i220 = -(-((i218 ^ 99) | i219));
                int i221 = (i219 & i220) + (i220 | i219);
                while (true) {
                    f59604d = i221 % 128;
                    int i222 = i221 % 2;
                    if (!(!it2.hasNext())) {
                        int i223 = f59605e + 41;
                        f59604d = i223 % 128;
                        int i224 = i223 % 2;
                        next = it2.next();
                        SouthAmericaEndpoint southAmericaEndpoint = (SouthAmericaEndpoint) next;
                        if (((Terminal) SouthAmericaEndpoint.setY(new Object[]{southAmericaEndpoint}, 1252185174, -1252185173, System.identityHashCode(southAmericaEndpoint))) == terminal3) {
                            int i225 = f59605e;
                            int i226 = i225 & 7;
                            int i227 = (((~i226) & (i225 | 7)) - (~(-(-(i226 << 1))))) - 1;
                            f59604d = i227 % 128;
                            int i228 = i227 % 2;
                            int i229 = i225 & 91;
                            int i230 = (((i225 ^ 91) | i229) << 1) - ((i225 | 91) & (~i229));
                            int i231 = i230 % 128;
                            f59604d = i231;
                            int i232 = i230 % 2;
                            int i233 = (((i231 & (-8)) | ((~i231) & 7)) - (~(-(-((i231 & 7) << 1))))) - 1;
                            f59605e = i233 % 128;
                            int i234 = i233 % 2;
                            int i235 = (((i231 | 26) << 1) - (i231 ^ 26)) - 1;
                            f59605e = i235 % 128;
                            int i236 = i235 % 2;
                        } else {
                            int i237 = f59605e;
                            int i238 = i237 & 43;
                            int i239 = (i237 ^ 43) | i238;
                            i221 = ((i238 | i239) << 1) - (i239 ^ i238);
                        }
                    } else {
                        int i240 = f59605e + 45;
                        f59604d = i240 % 128;
                        int i241 = i240 % 2;
                        next = null;
                    }
                }
                SouthAmericaEndpoint southAmericaEndpoint2 = (SouthAmericaEndpoint) next;
                if (southAmericaEndpoint2 != null) {
                    int i242 = f59604d;
                    int i243 = ((i242 & 94) + (i242 | 94)) - 1;
                    f59605e = i243 % 128;
                    if (i243 % 2 == 0) {
                        throw null;
                    }
                    List list3 = (List) SouthAmericaEndpoint.setY(new Object[]{southAmericaEndpoint2}, 754025851, -754025847, System.identityHashCode(southAmericaEndpoint2));
                    if (list3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list3.iterator();
                        int i244 = f59604d;
                        int i245 = i244 & 117;
                        int i246 = (i244 | 117) & (~i245);
                        int i247 = i245 << 1;
                        int i248 = (i246 & i247) + (i246 | i247);
                        f59605e = i248 % 128;
                        int i249 = i248 % 2;
                        while (it3.hasNext()) {
                            int i250 = f59604d;
                            int i251 = i250 & 61;
                            int i252 = (((i250 ^ 61) | i251) << 1) - ((i250 | 61) & (~i251));
                            f59605e = i252 % 128;
                            int i253 = i252 % 2;
                            TransactionFailed transactionFailed2 = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setOnGenericMotionListener.setCompoundDrawableTintBlendMode, (String) it3.next(), terminal3}, 1427362050, -1427362043, (int) System.currentTimeMillis());
                            if (transactionFailed2 != null) {
                                int i254 = f59605e;
                                int i255 = ((i254 ^ 32) + ((i254 & 32) << 1)) - 1;
                                f59604d = i255 % 128;
                                if (i255 % 2 != 0) {
                                    arrayList2.add(transactionFailed2);
                                    throw null;
                                }
                                arrayList2.add(transactionFailed2);
                                int i256 = f59604d + 19;
                                f59605e = i256 % 128;
                                int i257 = i256 % 2;
                            } else {
                                int i258 = f59604d;
                                int i259 = ((i258 & 32) + (i258 | 32)) - 1;
                                f59605e = i259 % 128;
                                int i260 = i259 % 2;
                            }
                        }
                        linkedHashSet.addAll(arrayList2);
                        int i261 = f59604d;
                        int i262 = ((i261 ^ 52) + ((i261 & 52) << 1)) - 1;
                        f59605e = i262 % 128;
                        int i263 = i262 % 2;
                    }
                }
                List list4 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.sortedWith(linkedHashSet, new Comparator() { // from class: com.mypinpad.tsdk.i.setContextClickable.3

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public static int f59609p0 = 0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public static int f59610q0 = 1;

                    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr5, int i264, int i265, int i266) {
                        Object obj2 = objArr5[1];
                        Object obj3 = objArr5[2];
                        int i267 = f59609p0;
                        int i268 = ((i267 | 91) << 1) - (i267 ^ 91);
                        f59610q0 = i268 % 128;
                        int i269 = i268 % 2;
                        TransactionFailed transactionFailed3 = (TransactionFailed) obj2;
                        TransactionFailed transactionFailed4 = (TransactionFailed) obj3;
                        int iCompareValues = e.compareValues((String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)));
                        int i270 = f59610q0;
                        int i271 = i270 & 27;
                        int i272 = (i270 ^ 27) | i271;
                        int i273 = (i271 ^ i272) + ((i272 & i271) << 1);
                        f59609p0 = i273 % 128;
                        if (i273 % 2 == 0) {
                            return Integer.valueOf(iCompareValues);
                        }
                        throw null;
                    }

                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, t10, t11}, -381365055, 381365055, System.identityHashCode(this))).intValue();
                    }
                }));
                int i264 = f59605e + 97;
                f59604d = i264 % 128;
                int i265 = i264 % 2;
                return list4;
        }
        return setmaxwidth;
    }

    @Override // com.mypinpad.tsdk.isolation.setChildIndicator
    @NotNull
    public final getInstallationId setCompoundDrawableTintBlendMode(@NotNull Terminal terminal) {
        return (getInstallationId) setDividerPadding(new Object[]{this, terminal}, -2145015464, 2145015473, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.exceptionHandler
    @NotNull
    public final List<setMax> setOnFocusChangeListener(@NotNull md mdVar) {
        return (List) setDividerPadding(new Object[]{this, mdVar}, 1574647221, -1574647214, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.db
    @NotNull
    public final List<dg> setX() {
        return (List) setDividerPadding(new Object[]{this}, -1744285612, 1744285614, System.identityHashCode(this));
    }

    @NotNull
    public final List<setDefaultFocusHighlightEnabled> setY() {
        return (List) setDividerPadding(new Object[]{this}, 1227135897, -1227135893, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode() {
        setDividerPadding(new Object[]{this}, -1553894445, 1553894446, System.identityHashCode(this));
    }

    @NotNull
    public final setMaxWidth setOnFocusChangeListener(@NotNull Terminal terminal, @NotNull md mdVar, @NotNull setBackgroundTintList setbackgroundtintlist) {
        return (setMaxWidth) setDividerPadding(new Object[]{this, terminal, mdVar, setbackgroundtintlist}, 506432843, -506432840, System.identityHashCode(this));
    }

    @NotNull
    public final List<TransactionFailed> setX(@NotNull Terminal terminal) {
        return (List) setDividerPadding(new Object[]{this, terminal}, -370743054, 370743054, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.exceptionHandler
    @Nullable
    public final setMax setY(@NotNull setBackgroundTintList setbackgroundtintlist, @NotNull md mdVar, @NotNull List<String> list) {
        return (setMax) setDividerPadding(new Object[]{this, setbackgroundtintlist, mdVar, list}, 1143814914, -1143814904, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() {
        setDividerPadding(new Object[]{this}, -442541688, 442541699, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.db
    @NotNull
    public final List<dn> setDividerPadding() {
        return (List) setDividerPadding(new Object[]{this}, 510232410, -510232402, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.exceptionHandler
    @NotNull
    public final setMaxWidth setDividerPadding(@NotNull Terminal terminal) {
        return (setMaxWidth) setDividerPadding(new Object[]{this, terminal}, -186599039, 186599044, System.identityHashCode(this));
    }
}
