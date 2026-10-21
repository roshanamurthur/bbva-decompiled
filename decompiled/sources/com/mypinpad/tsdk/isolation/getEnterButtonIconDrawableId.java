package com.mypinpad.tsdk.isolation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class getEnterButtonIconDrawableId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55838a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55839b = 1;

    /* JADX WARN: Code duplicated, block: B:13:0x008d  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x0253 A[PHI: r0
      0x0253: PHI (r0v49 java.util.List) = (r0v30 java.util.List), (r0v53 java.util.List) binds: [B:47:0x0250, B:44:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0271  */
    /* JADX WARN: Code duplicated, block: B:62:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00a3 A[SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Iterator it;
        int i13;
        boolean z10;
        List list;
        int i14 = (i11 * (-755)) + (i10 * (-755));
        int i15 = ~((~i10) | (~i11));
        int i16 = i10 | i11;
        boolean z11 = false;
        if (((i16 | (~i12)) * 756) + (((~(i16 | i12)) | i15) * (-756)) + (i15 * 1512) + i14 == 1) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            Terminal terminal = (Terminal) objArr[1];
            List list2 = (List) objArr[2];
            int i17 = f55839b;
            int i18 = i17 & 3;
            int i19 = ((i17 | 3) & (~i18)) + (i18 << 1);
            f55838a = i19 % 128;
            if (i19 % 2 != 0) {
                ((Boolean) setX(new Object[]{getbeeponfailure, terminal, list2}, -130584230, 130584230, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            boolean zBooleanValue = ((Boolean) setX(new Object[]{getbeeponfailure, terminal, list2}, -130584230, 130584230, (int) System.currentTimeMillis())).booleanValue();
            int i20 = f55839b;
            int i21 = (i20 & (-12)) | ((~i20) & 11);
            int i22 = (i20 & 11) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f55838a = i23 % 128;
            int i24 = i23 % 2;
            return Boolean.valueOf(zBooleanValue);
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        Terminal terminal2 = (Terminal) objArr[1];
        List list3 = (List) objArr[2];
        int i25 = f55838a;
        int i26 = i25 & 61;
        int i27 = (((i25 | 61) & (~i26)) - (~(i26 << 1))) - 1;
        f55839b = i27 % 128;
        int i28 = i27 % 2;
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
        String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
        List list4 = list3;
        if (list4 instanceof Collection) {
            int i29 = f55838a + 41;
            f55839b = i29 % 128;
            if (i29 % 2 == 0) {
                list4.isEmpty();
                throw null;
            }
            if (list4.isEmpty()) {
                int i30 = f55839b;
                int i31 = ((i30 ^ 107) | (i30 & 107)) << 1;
                int i32 = -(((~i30) & 107) | (i30 & (-108)));
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                f55838a = i33 % 128;
                int i34 = i33 % 2;
                z10 = false;
            } else {
                it = list4.iterator();
                int i35 = f55839b;
                int i36 = i35 & 13;
                int i37 = (((i35 | 13) & (~i36)) - (~(i36 << 1))) - 1;
                f55838a = i37 % 128;
                int i38 = i37 % 2;
                while (true) {
                    if (it.hasNext()) {
                        int i39 = f55839b;
                        int i40 = i39 & 85;
                        i13 = (i40 - (~((i39 ^ 85) | i40))) - 1;
                        f55838a = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i41 = 17 / 0;
                            if (Intrinsics.areEqual(str, (String) it.next())) {
                                int i42 = f55838a;
                                int i43 = i42 | 113;
                                int i44 = i43 << 1;
                                int i45 = -((~(i42 & 113)) & i43);
                                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                                f55839b = i46 % 128;
                                int i47 = i46 % 2;
                                z10 = true;
                            }
                        } else if (!Intrinsics.areEqual(str, (String) it.next())) {
                            int i48 = f55838a;
                            int i49 = i48 | 113;
                            int i410 = i49 << 1;
                            int i411 = -((~(i48 & 113)) & i49);
                            int i412 = (i410 ^ i411) + ((i411 & i410) << 1);
                            f55839b = i412 % 128;
                            int i413 = i412 % 2;
                            z10 = true;
                        }
                    } else {
                        int i310 = f55839b;
                        int i311 = ((i310 ^ 107) | (i310 & 107)) << 1;
                        int i312 = -(((~i310) & 107) | (i310 & (-108)));
                        int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                        f55838a = i313 % 128;
                        int i314 = i313 % 2;
                        z10 = false;
                    }
                }
            }
        } else {
            it = list4.iterator();
            int i315 = f55839b;
            int i316 = i315 & 13;
            int i317 = (((i315 | 13) & (~i316)) - (~(i316 << 1))) - 1;
            f55838a = i317 % 128;
            int i318 = i317 % 2;
            while (true) {
                if (it.hasNext()) {
                    int i319 = f55839b;
                    int i414 = i319 & 85;
                    i13 = (i414 - (~((i319 ^ 85) | i414))) - 1;
                    f55838a = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i415 = 17 / 0;
                        if (Intrinsics.areEqual(str, (String) it.next())) {
                            int i416 = f55838a;
                            int i417 = i416 | 113;
                            int i418 = i417 << 1;
                            int i419 = -((~(i416 & 113)) & i417);
                            int i4110 = (i418 ^ i419) + ((i419 & i418) << 1);
                            f55839b = i4110 % 128;
                            int i4111 = i4110 % 2;
                            z10 = true;
                        }
                    } else if (!Intrinsics.areEqual(str, (String) it.next())) {
                        int i4112 = f55838a;
                        int i4113 = i4112 | 113;
                        int i4114 = i4113 << 1;
                        int i4115 = -((~(i4112 & 113)) & i4113);
                        int i4116 = (i4114 ^ i4115) + ((i4115 & i4114) << 1);
                        f55839b = i4116 % 128;
                        int i4117 = i4116 % 2;
                        z10 = true;
                    }
                } else {
                    int i3110 = f55839b;
                    int i3111 = ((i3110 ^ 107) | (i3110 & 107)) << 1;
                    int i3112 = -(((~i3110) & 107) | (i3110 & (-108)));
                    int i3113 = (i3111 ^ i3112) + ((i3112 & i3111) << 1);
                    f55838a = i3113 % 128;
                    int i3114 = i3113 % 2;
                    z10 = false;
                }
            }
        }
        if (!z10) {
            setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
            if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str, terminal2}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue()) {
                int i50 = f55839b + 97;
                int i51 = i50 % 128;
                f55838a = i51;
                z11 = i50 % 2 == 0;
                int i52 = ((i51 ^ 112) + ((i51 & 112) << 1)) - 1;
                f55839b = i52 % 128;
                int i53 = i52 % 2;
                return Boolean.valueOf(z11);
            }
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), terminal2}, 1668702711, -1668702709, (int) System.currentTimeMillis());
            Intrinsics.checkNotNull(transactionFailed);
            setFindListener setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed));
            if (!(!((Boolean) setFindListener.setY(new Object[]{setfindlistener, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -2109739487, 2109739489, System.identityHashCode(setfindlistener))).booleanValue())) {
                int i54 = f55838a;
                int i55 = (((i54 | 106) << 1) - (i54 ^ 106)) - 1;
                f55839b = i55 % 128;
                int i56 = i55 % 2;
                if (setfindlistener.setX((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))) {
                    int i57 = f55838a;
                    int i58 = i57 & 17;
                    int i59 = -(-((i57 ^ 17) | i58));
                    int i60 = (i58 & i59) + (i59 | i58);
                    f55839b = i60 % 128;
                    if (i60 % 2 == 0) {
                        list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                        int i61 = 4 / 0;
                        if (!(!(list instanceof Collection))) {
                            if (!(!list.isEmpty())) {
                                int i62 = f55838a;
                                int i63 = i62 & 97;
                                int i64 = (i62 ^ 97) | i63;
                                int i65 = (i63 & i64) + (i64 | i63);
                                f55839b = i65 % 128;
                                int i66 = i65 % 2;
                                z11 = true;
                                break;
                            }
                        }
                        if (!(!z11)) {
                            int i67 = f55839b;
                            int i68 = ((i67 & 36) + (i67 | 36)) - 1;
                            int i69 = i68 % 128;
                            f55838a = i69;
                            int i70 = i68 % 2;
                            int i71 = i69 + 59;
                            f55839b = i71 % 128;
                            int i72 = i71 % 2;
                        }
                    } else {
                        list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure2));
                        if (!(!(list instanceof Collection))) {
                            if (!(!list.isEmpty())) {
                                int i610 = f55838a;
                                int i611 = i610 & 97;
                                int i612 = (i610 ^ 97) | i611;
                                int i613 = (i611 & i612) + (i612 | i611);
                                f55839b = i613 % 128;
                                int i614 = i613 % 2;
                                z11 = true;
                                break;
                            }
                        }
                        if (!(!z11)) {
                            int i615 = f55839b;
                            int i616 = ((i615 & 36) + (i615 | 36)) - 1;
                            int i617 = i616 % 128;
                            f55838a = i617;
                            int i73 = i616 % 2;
                            int i74 = i617 + 59;
                            f55839b = i74 % 128;
                            int i75 = i74 % 2;
                        }
                    }
                    Iterator it2 = list.iterator();
                    int i76 = f55839b + 65;
                    f55838a = i76 % 128;
                    int i77 = i76 % 2;
                    while (true) {
                        if (it2.hasNext()) {
                            int i78 = f55838a;
                            int i79 = (i78 ^ 91) + ((i78 & 91) << 1);
                            f55839b = i79 % 128;
                            int i80 = i79 % 2;
                            if (!((Boolean) setX(new Object[]{(getBeepOnFailure) it2.next(), terminal2, list3}, -130584230, 130584230, (int) System.currentTimeMillis())).booleanValue()) {
                                int i81 = f55838a;
                                int i82 = i81 & 3;
                                int i83 = i81 | 3;
                                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                                f55839b = i84 % 128;
                                int i85 = i84 % 2;
                                break;
                            }
                        } else {
                            int i618 = f55838a;
                            int i619 = i618 & 97;
                            int i6110 = (i618 ^ 97) | i619;
                            int i6111 = (i619 & i6110) + (i6110 | i619);
                            f55839b = i6111 % 128;
                            int i6112 = i6111 % 2;
                            z11 = true;
                            break;
                        }
                    }
                    if (!(!z11)) {
                        int i6113 = f55839b;
                        int i6114 = ((i6113 & 36) + (i6113 | 36)) - 1;
                        int i6115 = i6114 % 128;
                        f55838a = i6115;
                        int i710 = i6114 % 2;
                        int i711 = i6115 + 59;
                        f55839b = i711 % 128;
                        int i712 = i711 % 2;
                    }
                }
            }
            int i86 = f55838a;
            int i87 = (i86 & (-20)) | ((~i86) & 19);
            int i88 = (i86 & 19) << 1;
            int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
            f55839b = i89 % 128;
            if (i89 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i90 = f55838a;
        int i91 = ((i90 & 42) + (i90 | 42)) - 1;
        int i92 = i91 % 128;
        f55839b = i92;
        int i93 = i91 % 2;
        int i94 = i92 ^ 115;
        int i95 = ((i92 & 115) | i94) << 1;
        int i96 = -i94;
        int i97 = (i95 & i96) + (i95 | i96);
        f55838a = i97 % 128;
        int i98 = i97 % 2;
        return Boolean.TRUE;
    }
}
