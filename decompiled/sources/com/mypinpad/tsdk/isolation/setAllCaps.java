package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class setAllCaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58247a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58248b = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:13:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:20:0x0162  */
    /* JADX WARN: Code duplicated, block: B:23:0x01df  */
    /* JADX WARN: Code duplicated, block: B:26:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:28:0x021d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0231  */
    /* JADX WARN: Code duplicated, block: B:32:0x023a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0252  */
    /* JADX WARN: Code duplicated, block: B:45:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0311  */
    /* JADX WARN: Code duplicated, block: B:49:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[LOOP:1: B:11:0x00df->B:59:?, LOOP_END, SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Iterator it;
        int i13;
        setFindListener setfindlistener;
        int i14;
        List list;
        Iterator it2;
        int i15;
        int i16 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i17 = ~i10;
        int i18 = ((~(i17 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i16;
        int i19 = ~(i10 | (~i11));
        if (((i19 | (~(i11 | (~i12) | i17))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i19 * (-1042)) + i18 != 1) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            Terminal terminal = (Terminal) objArr[1];
            List list2 = (List) objArr[2];
            int i20 = f58247a;
            int i21 = i20 ^ 111;
            int i22 = (((i20 & 111) | i21) << 1) - i21;
            f58248b = i22 % 128;
            int i23 = i22 % 2;
            boolean zBooleanValue = ((Boolean) setY(new Object[]{getbeeponfailure, terminal, list2}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue();
            int i24 = f58247a;
            int i25 = (i24 & 72) + (i24 | 72);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            f58248b = i26 % 128;
            int i27 = i26 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        Terminal terminal2 = (Terminal) objArr[1];
        List list3 = (List) objArr[2];
        int i28 = f58248b;
        int i29 = i28 ^ 35;
        int i30 = ((i28 & 35) | i29) << 1;
        int i31 = -i29;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        f58247a = i32 % 128;
        int i33 = i32 % 2;
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
        String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
        List list4 = list3;
        if (list4 instanceof Collection) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            if (list4.isEmpty()) {
                int i34 = f58248b;
                int i35 = (i34 ^ 76) + ((i34 & 76) << 1);
                int i36 = (i35 ^ (-1)) + (i35 << 1);
                f58247a = i36 % 128;
                int i37 = i36 % 2;
                setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str, terminal2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue())) {
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                    TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), terminal2}, 1668702711, -1668702709, (int) System.currentTimeMillis());
                    Intrinsics.checkNotNull(transactionFailed);
                    setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed));
                    if (!(!((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue())) {
                        int i38 = f58248b + 39;
                        f58247a = i38 % 128;
                        int i39 = i38 % 2;
                        if (setfindlistener.setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))) {
                            int i40 = f58248b;
                            int i41 = i40 & 81;
                            int i42 = ((i40 ^ 81) | i41) << 1;
                            int i43 = -((i40 | 81) & (~i41));
                            i14 = (i42 ^ i43) + ((i43 & i42) << 1);
                            f58247a = i14 % 128;
                            if (i14 % 2 != 0) {
                                boolean z10 = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2))) instanceof Collection;
                                throw null;
                            }
                            list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                            if (list instanceof Collection) {
                                it2 = list.iterator();
                                int i44 = f58247a;
                                int i45 = ((i44 & 121) - (~(i44 | 121))) - 1;
                                f58248b = i45 % 128;
                                int i46 = i45 % 2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        int i47 = f58247a;
                                        int i48 = i47 & 61;
                                        i15 = (i48 - (~(-(-((i47 ^ 61) | i48))))) - 1;
                                        f58248b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            int i49 = 59 / 0;
                                            if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                int i50 = f58248b;
                                                int i51 = i50 & 83;
                                                int i52 = ((i50 ^ 83) | i51) << 1;
                                                int i53 = -((i50 | 83) & (~i51));
                                                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                                                f58247a = i54 % 128;
                                                int i55 = i54 % 2;
                                            }
                                        } else if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i56 = f58248b;
                                            int i57 = i56 & 83;
                                            int i58 = ((i56 ^ 83) | i57) << 1;
                                            int i59 = -((i56 | 83) & (~i57));
                                            int i510 = ((i58 | i59) << 1) - (i59 ^ i58);
                                            f58247a = i510 % 128;
                                            int i511 = i510 % 2;
                                        }
                                    }
                                }
                            } else {
                                it2 = list.iterator();
                                int i410 = f58247a;
                                int i411 = ((i410 & 121) - (~(i410 | 121))) - 1;
                                f58248b = i411 % 128;
                                int i412 = i411 % 2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        int i413 = f58247a;
                                        int i414 = i413 & 61;
                                        i15 = (i414 - (~(-(-((i413 ^ 61) | i414))))) - 1;
                                        f58248b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            int i415 = 59 / 0;
                                            if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                int i512 = f58248b;
                                                int i513 = i512 & 83;
                                                int i514 = ((i512 ^ 83) | i513) << 1;
                                                int i515 = -((i512 | 83) & (~i513));
                                                int i516 = ((i514 | i515) << 1) - (i515 ^ i514);
                                                f58247a = i516 % 128;
                                                int i517 = i516 % 2;
                                            }
                                        } else if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i518 = f58248b;
                                            int i519 = i518 & 83;
                                            int i5110 = ((i518 ^ 83) | i519) << 1;
                                            int i5111 = -((i518 | 83) & (~i519));
                                            int i5112 = ((i5110 | i5111) << 1) - (i5111 ^ i5110);
                                            f58247a = i5112 % 128;
                                            int i5113 = i5112 % 2;
                                        }
                                    }
                                }
                            }
                            int i60 = f58247a + 81;
                            int i61 = i60 % 128;
                            f58248b = i61;
                            int i62 = i60 % 2;
                            int i63 = i61 & 99;
                            int i64 = (i61 | 99) & (~i63);
                            int i65 = i63 << 1;
                            int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                            int i67 = i66 % 128;
                            f58247a = i67;
                            int i68 = i66 % 2;
                            i13 = (i67 ^ 107) + ((i67 & 107) << 1);
                            f58248b = i13 % 128;
                        }
                    }
                    int i69 = f58247a;
                    int i70 = i69 ^ 23;
                    int i71 = (i69 & 23) << 1;
                    int i72 = (i70 & i71) + (i71 | i70);
                    f58248b = i72 % 128;
                    int i73 = i72 % 2;
                    return Boolean.FALSE;
                }
                int i74 = f58247a;
                int i75 = (i74 & (-6)) | ((~i74) & 5);
                int i76 = -(-((i74 & 5) << 1));
                int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                f58248b = i77 % 128;
                int i78 = i77 % 2;
                int i79 = i74 & 55;
                int i80 = (i74 ^ 55) | i79;
                int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                f58248b = i81 % 128;
                int i82 = i81 % 2;
            } else {
                it = list4.iterator();
                int i83 = f58247a + 75;
                f58248b = i83 % 128;
                int i84 = i83 % 2;
                while (true) {
                    if (!it.hasNext()) {
                        int i85 = f58247a + 71;
                        f58248b = i85 % 128;
                        int i86 = i85 % 2;
                        if (Intrinsics.areEqual(str, (String) it.next())) {
                            int i87 = f58247a;
                            int i88 = (-2) - (((i87 ^ 58) + ((i87 & 58) << 1)) ^ (-1));
                            f58248b = i88 % 128;
                            int i89 = i88 % 2;
                            int i90 = ((i87 ^ 1) | (i87 & 1)) << 1;
                            int i91 = -(((~i87) & 1) | (i87 & (-2)));
                            int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                            int i93 = i92 % 128;
                            f58248b = i93;
                            int i94 = i92 % 2;
                            i13 = (((i93 | 16) << 1) - (i93 ^ 16)) - 1;
                            f58247a = i13 % 128;
                        }
                    } else {
                        int i310 = f58248b;
                        int i311 = (i310 ^ 76) + ((i310 & 76) << 1);
                        int i312 = (i311 ^ (-1)) + (i311 << 1);
                        f58247a = i312 % 128;
                        int i313 = i312 % 2;
                        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str, terminal2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue())) {
                            setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                            TransactionFailed transactionFailed2 = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3)), terminal2}, 1668702711, -1668702709, (int) System.currentTimeMillis());
                            Intrinsics.checkNotNull(transactionFailed2);
                            setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed2}, -570885530, 570885532, System.identityHashCode(transactionFailed2));
                            if (!(!((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue())) {
                                int i314 = f58248b + 39;
                                f58247a = i314 % 128;
                                int i315 = i314 % 2;
                                if (setfindlistener.setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))) {
                                    int i416 = f58248b;
                                    int i417 = i416 & 81;
                                    int i418 = ((i416 ^ 81) | i417) << 1;
                                    int i419 = -((i416 | 81) & (~i417));
                                    i14 = (i418 ^ i419) + ((i419 & i418) << 1);
                                    f58247a = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        boolean z11 = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2))) instanceof Collection;
                                        throw null;
                                    }
                                    list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                                    if (list instanceof Collection) {
                                        it2 = list.iterator();
                                        int i4110 = f58247a;
                                        int i4111 = ((i4110 & 121) - (~(i4110 | 121))) - 1;
                                        f58248b = i4111 % 128;
                                        int i4112 = i4111 % 2;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                int i4113 = f58247a;
                                                int i4114 = i4113 & 61;
                                                i15 = (i4114 - (~(-(-((i4113 ^ 61) | i4114))))) - 1;
                                                f58248b = i15 % 128;
                                                if (i15 % 2 == 0) {
                                                    int i4115 = 59 / 0;
                                                    if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                        int i5114 = f58248b;
                                                        int i5115 = i5114 & 83;
                                                        int i5116 = ((i5114 ^ 83) | i5115) << 1;
                                                        int i5117 = -((i5114 | 83) & (~i5115));
                                                        int i5118 = ((i5116 | i5117) << 1) - (i5117 ^ i5116);
                                                        f58247a = i5118 % 128;
                                                        int i5119 = i5118 % 2;
                                                    }
                                                } else if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                    int i51110 = f58248b;
                                                    int i51111 = i51110 & 83;
                                                    int i51112 = ((i51110 ^ 83) | i51111) << 1;
                                                    int i51113 = -((i51110 | 83) & (~i51111));
                                                    int i51114 = ((i51112 | i51113) << 1) - (i51113 ^ i51112);
                                                    f58247a = i51114 % 128;
                                                    int i51115 = i51114 % 2;
                                                }
                                            }
                                        }
                                    } else {
                                        it2 = list.iterator();
                                        int i4116 = f58247a;
                                        int i4117 = ((i4116 & 121) - (~(i4116 | 121))) - 1;
                                        f58248b = i4117 % 128;
                                        int i4118 = i4117 % 2;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                int i4119 = f58247a;
                                                int i41110 = i4119 & 61;
                                                i15 = (i41110 - (~(-(-((i4119 ^ 61) | i41110))))) - 1;
                                                f58248b = i15 % 128;
                                                if (i15 % 2 == 0) {
                                                    int i41111 = 59 / 0;
                                                    if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                        int i51116 = f58248b;
                                                        int i51117 = i51116 & 83;
                                                        int i51118 = ((i51116 ^ 83) | i51117) << 1;
                                                        int i51119 = -((i51116 | 83) & (~i51117));
                                                        int i511110 = ((i51118 | i51119) << 1) - (i51119 ^ i51118);
                                                        f58247a = i511110 % 128;
                                                        int i511111 = i511110 % 2;
                                                    }
                                                } else if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                    int i511112 = f58248b;
                                                    int i511113 = i511112 & 83;
                                                    int i511114 = ((i511112 ^ 83) | i511113) << 1;
                                                    int i511115 = -((i511112 | 83) & (~i511113));
                                                    int i511116 = ((i511114 | i511115) << 1) - (i511115 ^ i511114);
                                                    f58247a = i511116 % 128;
                                                    int i511117 = i511116 % 2;
                                                }
                                            }
                                        }
                                    }
                                    int i610 = f58247a + 81;
                                    int i611 = i610 % 128;
                                    f58248b = i611;
                                    int i612 = i610 % 2;
                                    int i613 = i611 & 99;
                                    int i614 = (i611 | 99) & (~i613);
                                    int i615 = i613 << 1;
                                    int i616 = (i614 ^ i615) + ((i615 & i614) << 1);
                                    int i617 = i616 % 128;
                                    f58247a = i617;
                                    int i618 = i616 % 2;
                                    i13 = (i617 ^ 107) + ((i617 & 107) << 1);
                                    f58248b = i13 % 128;
                                }
                            }
                            int i619 = f58247a;
                            int i710 = i619 ^ 23;
                            int i711 = (i619 & 23) << 1;
                            int i712 = (i710 & i711) + (i711 | i710);
                            f58248b = i712 % 128;
                            int i713 = i712 % 2;
                            return Boolean.FALSE;
                        }
                        int i714 = f58247a;
                        int i715 = (i714 & (-6)) | ((~i714) & 5);
                        int i716 = -(-((i714 & 5) << 1));
                        int i717 = (i715 ^ i716) + ((i715 & i716) << 1);
                        f58248b = i717 % 128;
                        int i718 = i717 % 2;
                        int i719 = i714 & 55;
                        int i810 = (i714 ^ 55) | i719;
                        int i811 = ((i719 | i810) << 1) - (i810 ^ i719);
                        f58248b = i811 % 128;
                        int i812 = i811 % 2;
                    }
                }
            }
            return Boolean.TRUE;
        }
        it = list4.iterator();
        int i813 = f58247a + 75;
        f58248b = i813 % 128;
        int i814 = i813 % 2;
        while (true) {
            if (!it.hasNext()) {
                int i316 = f58248b;
                int i317 = (i316 ^ 76) + ((i316 & 76) << 1);
                int i318 = (i317 ^ (-1)) + (i317 << 1);
                f58247a = i318 % 128;
                int i319 = i318 % 2;
                setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str, terminal2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue())) {
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                    TransactionFailed transactionFailed3 = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)), terminal2}, 1668702711, -1668702709, (int) System.currentTimeMillis());
                    Intrinsics.checkNotNull(transactionFailed3);
                    setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed3}, -570885530, 570885532, System.identityHashCode(transactionFailed3));
                    if (!(!((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue())) {
                        int i3110 = f58248b + 39;
                        f58247a = i3110 % 128;
                        int i3111 = i3110 % 2;
                        if (setfindlistener.setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))) {
                            int i4120 = f58248b;
                            int i4121 = i4120 & 81;
                            int i4122 = ((i4120 ^ 81) | i4121) << 1;
                            int i4123 = -((i4120 | 81) & (~i4121));
                            i14 = (i4122 ^ i4123) + ((i4123 & i4122) << 1);
                            f58247a = i14 % 128;
                            if (i14 % 2 != 0) {
                                boolean z12 = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2))) instanceof Collection;
                                throw null;
                            }
                            list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it2 = list.iterator();
                                int i41112 = f58247a;
                                int i41113 = ((i41112 & 121) - (~(i41112 | 121))) - 1;
                                f58248b = i41113 % 128;
                                int i41114 = i41113 % 2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        int i41115 = f58247a;
                                        int i41116 = i41115 & 61;
                                        i15 = (i41116 - (~(-(-((i41115 ^ 61) | i41116))))) - 1;
                                        f58248b = i15 % 128;
                                        if (i15 % 2 == 0) {
                                            int i41117 = 59 / 0;
                                            if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                                int i511118 = f58248b;
                                                int i511119 = i511118 & 83;
                                                int i5111110 = ((i511118 ^ 83) | i511119) << 1;
                                                int i5111111 = -((i511118 | 83) & (~i511119));
                                                int i5111112 = ((i5111110 | i5111111) << 1) - (i5111111 ^ i5111110);
                                                f58247a = i5111112 % 128;
                                                int i5111113 = i5111112 % 2;
                                            }
                                        } else if (!((Boolean) setY(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, 503611035, -503611034, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i5111114 = f58248b;
                                            int i5111115 = i5111114 & 83;
                                            int i5111116 = ((i5111114 ^ 83) | i5111115) << 1;
                                            int i5111117 = -((i5111114 | 83) & (~i5111115));
                                            int i5111118 = ((i5111116 | i5111117) << 1) - (i5111117 ^ i5111116);
                                            f58247a = i5111118 % 128;
                                            int i5111119 = i5111118 % 2;
                                        }
                                    }
                                }
                            }
                            int i6110 = f58247a + 81;
                            int i6111 = i6110 % 128;
                            f58248b = i6111;
                            int i6112 = i6110 % 2;
                            int i6113 = i6111 & 99;
                            int i6114 = (i6111 | 99) & (~i6113);
                            int i6115 = i6113 << 1;
                            int i6116 = (i6114 ^ i6115) + ((i6115 & i6114) << 1);
                            int i6117 = i6116 % 128;
                            f58247a = i6117;
                            int i6118 = i6116 % 2;
                            i13 = (i6117 ^ 107) + ((i6117 & 107) << 1);
                            f58248b = i13 % 128;
                        }
                    }
                    int i6119 = f58247a;
                    int i7110 = i6119 ^ 23;
                    int i7111 = (i6119 & 23) << 1;
                    int i7112 = (i7110 & i7111) + (i7111 | i7110);
                    f58248b = i7112 % 128;
                    int i7113 = i7112 % 2;
                    return Boolean.FALSE;
                }
                int i7114 = f58247a;
                int i7115 = (i7114 & (-6)) | ((~i7114) & 5);
                int i7116 = -(-((i7114 & 5) << 1));
                int i7117 = (i7115 ^ i7116) + ((i7115 & i7116) << 1);
                f58248b = i7117 % 128;
                int i7118 = i7117 % 2;
                int i7119 = i7114 & 55;
                int i815 = (i7114 ^ 55) | i7119;
                int i816 = ((i7119 | i815) << 1) - (i815 ^ i7119);
                f58248b = i816 % 128;
                int i817 = i816 % 2;
                return Boolean.TRUE;
            }
            int i818 = f58247a + 71;
            f58248b = i818 % 128;
            int i819 = i818 % 2;
            if (Intrinsics.areEqual(str, (String) it.next())) {
                int i820 = f58247a;
                int i821 = (-2) - (((i820 ^ 58) + ((i820 & 58) << 1)) ^ (-1));
                f58248b = i821 % 128;
                int i822 = i821 % 2;
                int i95 = ((i820 ^ 1) | (i820 & 1)) << 1;
                int i96 = -(((~i820) & 1) | (i820 & (-2)));
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                int i98 = i97 % 128;
                f58248b = i98;
                int i99 = i97 % 2;
                i13 = (((i98 | 16) << 1) - (i98 ^ 16)) - 1;
                f58247a = i13 % 128;
            }
        }
        int i100 = i13 % 2;
        return Boolean.TRUE;
    }
}
