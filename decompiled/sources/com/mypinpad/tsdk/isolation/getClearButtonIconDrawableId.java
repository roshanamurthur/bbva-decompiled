package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getClearButtonIconDrawableId {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55729e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55730f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getValue f55731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f55732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final eu f55733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final exceptionHandler f55734d;

    public getClearButtonIconDrawableId(@NotNull getValue getvalue, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull exceptionHandler exceptionhandler) {
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(exceptionhandler, "");
        this.f55731a = getvalue;
        this.f55732b = settextkeepstate;
        this.f55733c = euVar;
        this.f55734d = exceptionhandler;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x02e4  */
    public static /* synthetic */ getBeepOnFailure a(Object[] objArr) throws Exception {
        cn cnVar;
        Object next;
        byte[] bArrPlus;
        getClearButtonIconDrawableId getclearbuttonicondrawableid = (getClearButtonIconDrawableId) objArr[0];
        me meVar = (me) objArr[1];
        int i10 = 2;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[3];
        cn cnVar2 = (cn) objArr[4];
        Terminal terminal = (Terminal) objArr[5];
        int i11 = f55730f;
        int i12 = (-2) - (((i11 ^ 78) + ((i11 & 78) << 1)) ^ (-1));
        f55729e = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArrPlus2 = new byte[0];
        if (getbeeponfailure != null) {
            setMaxWidth setmaxwidth = new setMaxWidth();
            setMaxWidth.setX(new Object[]{setmaxwidth, getclearbuttonicondrawableid.f55734d.setDividerPadding(terminal)}, 1087552335, -1087552333, System.identityHashCode(setmaxwidth));
            setMaxWidth onFocusChangeListener = meVar.setOnFocusChangeListener();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(onFocusChangeListener, 10));
            int i14 = f55730f;
            int i15 = i14 & 43;
            int i16 = (i14 ^ 43) | i15;
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f55729e = i17 % 128;
            int i18 = i17 % 2;
            for (getBeepOnFailure getbeeponfailure3 : onFocusChangeListener) {
                int i19 = f55729e;
                int i20 = (i19 & 97) + (i19 | 97);
                f55730f = i20 % 128;
                int i21 = i20 % i10;
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                arrayList.add((getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3)), terminal, Boolean.FALSE, 24}, -976227287, 976227290, 24));
                int i22 = f55730f;
                int i23 = i22 & 101;
                int i24 = ((i22 ^ 101) | i23) << 1;
                int i25 = -((i22 | 101) & (~i23));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f55729e = i26 % 128;
                i10 = 2;
                int i27 = i26 % 2;
            }
            Object[] objArr2 = new Object[i10];
            objArr2[0] = setmaxwidth;
            objArr2[1] = arrayList;
            setMaxWidth.setX(objArr2, -855777080, 855777092, System.identityHashCode(setmaxwidth));
            bn bnVar = new bn(getbeeponfailure);
            bl blVar = (bl) ((setImageTintList) w.setX(new Object[]{bnVar}, 1693919772, -1693919769, System.identityHashCode(bnVar)));
            setDataDirectorySuffix setdatadirectorysuffix = setDataDirectorySuffix.INSTANCE;
            bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) setDataDirectorySuffix.setCompoundDrawableTintBlendMode(new Object[]{(List) bl.setOnFocusChangeListener(new Object[]{blVar}, 1653401376, -1653401376, System.identityHashCode(blVar)), new k4(setmaxwidth)}, -980462587, 980462587, (int) System.currentTimeMillis()));
            int i28 = f55729e;
            int i29 = i28 & 121;
            int i30 = (((i28 | 121) & (~i29)) - (~(i29 << 1))) - 1;
            f55730f = i30 % 128;
            int i31 = i30 % 2;
        }
        if (getbeeponfailure2 != null) {
            int i32 = f55729e + 41;
            f55730f = i32 % 128;
            int i33 = i32 % 2;
            if (((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure2, cnVar2}, 1430815261, -1430815247, (int) System.currentTimeMillis())).booleanValue()) {
                int i34 = f55730f;
                int i35 = (i34 ^ 73) + ((i34 & 73) << 1);
                int i36 = i35 % 128;
                f55729e = i36;
                int i37 = i35 % 2;
                int i38 = 805717122;
                if (cnVar2 != null) {
                    int i39 = ((i36 & 117) - (~(i36 | 117))) - 1;
                    f55730f = i39 % 128;
                    int i40 = i39 % 2;
                    List list = (List) cn.setDividerPadding(new Object[]{cnVar2}, -2019104287, 2019104287, System.identityHashCode(cnVar2));
                    if (list != null) {
                        int i41 = f55729e;
                        int i42 = i41 ^ 55;
                        int i43 = ((i41 & 55) | i42) << 1;
                        int i44 = -i42;
                        int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                        f55730f = i45 % 128;
                        int i46 = i45 % 2;
                        Iterator it = list.iterator();
                        int i47 = f55729e;
                        int i48 = i47 | 107;
                        int i49 = (i48 << 1) - ((~(i47 & 107)) & i48);
                        f55730f = i49 % 128;
                        int i50 = i49 % 2;
                        while (true) {
                            if (!it.hasNext()) {
                                int i51 = (-2) - ((f55730f + 16) ^ (-1));
                                f55729e = i51 % 128;
                                int i52 = i51 % 2;
                                next = null;
                                cnVar = cnVar2;
                                break;
                            }
                            int i53 = f55729e;
                            int i54 = ((i53 | 71) << 1) - (i53 ^ 71);
                            f55730f = i54 % 128;
                            int i55 = i54 % 2;
                            next = it.next();
                            co coVar = (co) next;
                            cnVar = cnVar2;
                            if (Arrays.equals((byte[]) co.setX(new Object[]{coVar}, -805717122, i38, System.identityHashCode(coVar)), (byte[]) co.Companion.setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis()))) {
                                int i56 = f55729e;
                                int i57 = i56 ^ 21;
                                int i58 = ((((i56 & 21) | i57) << 1) - (~(-i57))) - 1;
                                int i59 = i58 % 128;
                                f55730f = i59;
                                if (i58 % 2 == 0) {
                                    throw null;
                                }
                                int i60 = (i59 | 85) << 1;
                                int i61 = -(((~i59) & 85) | (i59 & (-86)));
                                int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                                f55729e = i62 % 128;
                                int i63 = i62 % 2;
                                break;
                            }
                            cnVar2 = cnVar;
                            i38 = 805717122;
                        }
                        co coVar2 = (co) next;
                        if (coVar2 != null) {
                            int i64 = f55729e;
                            int i65 = (i64 ^ 65) + ((i64 & 65) << 1);
                            f55730f = i65 % 128;
                            if (i65 % 2 == 0) {
                                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) co.setX(new Object[]{coVar2}, 659767438, -659767434, System.identityHashCode(coVar2)));
                                int i66 = 15 / 0;
                            } else {
                                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) co.setX(new Object[]{coVar2}, 659767438, -659767434, System.identityHashCode(coVar2)));
                            }
                            bArrPlus2 = bArrPlus;
                        }
                    } else {
                        cnVar = cnVar2;
                    }
                } else {
                    cnVar = cnVar2;
                }
                if (terminal == Terminal.KERNEL_3) {
                    int i67 = f55730f;
                    int i68 = i67 & 73;
                    int i69 = ((~i68) & (i67 | 73)) + (i68 << 1);
                    f55729e = i69 % 128;
                    int i70 = i69 % 2;
                    if (cnVar != null) {
                        int i71 = i67 + 67;
                        f55729e = i71 % 128;
                        int i72 = i71 % 2;
                        List list2 = (List) cn.setDividerPadding(new Object[]{cnVar}, -2019104287, 2019104287, System.identityHashCode(cnVar));
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = list2.iterator();
                            int i73 = f55729e;
                            int i74 = ((i73 | 41) << 1) - (i73 ^ 41);
                            f55730f = i74 % 128;
                            int i75 = i74 % 2;
                            while (it2.hasNext()) {
                                int i76 = f55729e;
                                int i77 = ((i76 ^ 39) | (i76 & 39)) << 1;
                                int i78 = -(((~i76) & 39) | (i76 & (-40)));
                                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                                f55730f = i79 % 128;
                                if (i79 % 2 == 0) {
                                    co coVar3 = (co) it2.next();
                                    Arrays.equals((byte[]) co.setX(new Object[]{coVar3}, -805717122, 805717122, System.identityHashCode(coVar3)), (byte[]) co.Companion.setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis()));
                                    throw null;
                                }
                                Object next2 = it2.next();
                                co coVar4 = (co) next2;
                                if (!Arrays.equals((byte[]) co.setX(new Object[]{coVar4}, -805717122, 805717122, System.identityHashCode(coVar4)), (byte[]) co.Companion.setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis()))) {
                                    int i80 = f55729e;
                                    int i81 = i80 & 69;
                                    int i82 = i80 | 69;
                                    int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                                    f55730f = i83 % 128;
                                    if (i83 % 2 == 0) {
                                        arrayList2.add(next2);
                                        throw null;
                                    }
                                    arrayList2.add(next2);
                                    int i84 = (-2) - ((f55729e + 74) ^ (-1));
                                    f55730f = i84 % 128;
                                    int i85 = i84 % 2;
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            int i86 = f55730f + 69;
                            f55729e = i86 % 128;
                            int i87 = i86 % 2;
                            while (it3.hasNext()) {
                                int i88 = f55729e;
                                int i89 = ((i88 & 105) - (~(-(-(i88 | 105))))) - 1;
                                f55730f = i89 % 128;
                                if (i89 % 2 == 0) {
                                    co coVar5 = (co) it3.next();
                                    ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) co.setX(new Object[]{coVar5}, 659767438, -659767434, System.identityHashCode(coVar5)));
                                    throw null;
                                }
                                co coVar6 = (co) it3.next();
                                bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus2, (byte[]) co.setX(new Object[]{coVar6}, 659767438, -659767434, System.identityHashCode(coVar6)));
                            }
                        }
                    }
                }
            }
        }
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
        getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), bArrPlus2, null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
        int i90 = f55730f + 79;
        f55729e = i90 % 128;
        if (i90 % 2 == 0) {
            return getbeeponfailure4;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:33:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0205  */
    /* JADX WARN: Code duplicated, block: B:37:0x0216  */
    /* JADX WARN: Code duplicated, block: B:39:0x0225  */
    /* JADX WARN: Code duplicated, block: B:42:0x023e  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x023b, code lost:
    
        if ((!((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r3, r6}, 1430815261, -1430815247, (int) java.lang.System.currentTimeMillis())).booleanValue()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object b(java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getClearButtonIconDrawableId.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0062  */
    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:11:0x0076->B:34:?, LOOP_END, SYNTHETIC] */
    public static /* synthetic */ Boolean c(Object[] objArr) {
        String str;
        TransactionFailed transactionFailed;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = f55729e;
        int i11 = i10 & 11;
        int i12 = (i11 - (~((i10 ^ 11) | i11))) - 1;
        f55730f = i12 % 128;
        if (i12 % 2 == 0) {
            ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).isEmpty();
            throw null;
        }
        if (!(!((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).isEmpty())) {
            int i13 = f55729e;
            int i14 = i13 & 63;
            int i15 = ((i13 ^ 63) | i14) << 1;
            int i16 = -((~i14) & (i13 | 63));
            int i17 = (i15 & i16) + (i15 | i16);
            f55730f = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((i13 & (-50)) | ((~i13) & 49)) + ((i13 & 49) << 1);
            f55730f = i19 % 128;
            if (i19 % 2 != 0) {
                return Boolean.FALSE;
            }
            int i20 = 27 / 0;
            return Boolean.FALSE;
        }
        List<getBeepOnFailure> list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure));
        if (!(!(list instanceof Collection))) {
            int i21 = f55729e;
            int i22 = (i21 & 40) + (i21 | 40);
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            f55730f = i23 % 128;
            int i24 = i23 % 2;
            if (!list.isEmpty()) {
                int i25 = f55730f;
                int i26 = i25 & 69;
                int i27 = ((i25 | 69) & (~i26)) + (i26 << 1);
                f55729e = i27 % 128;
                int i28 = i27 % 2;
                for (getBeepOnFailure getbeeponfailure2 : list) {
                    int i29 = f55730f;
                    int i30 = i29 & 37;
                    int i31 = (i29 ^ 37) | i30;
                    int i32 = (i30 & i31) + (i31 | i30);
                    f55729e = i32 % 128;
                    int i33 = i32 % 2;
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    setAnimation setanimation = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                    if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        int i34 = f55730f;
                        int i35 = i34 + 57;
                        f55729e = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = (((i34 | 12) << 1) - (i34 ^ 12)) - 1;
                        f55729e = i37 % 128;
                        int i38 = i37 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
        } else {
            int i210 = f55730f;
            int i211 = i210 & 69;
            int i212 = ((i210 | 69) & (~i211)) + (i211 << 1);
            f55729e = i212 % 128;
            int i213 = i212 % 2;
            while (r7.hasNext()) {
                int i214 = f55730f;
                int i39 = i214 & 37;
                int i310 = (i214 ^ 37) | i39;
                int i311 = (i39 & i310) + (i310 | i39);
                f55729e = i311 % 128;
                int i312 = i311 % 2;
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                setAnimation setanimation2 = setAnimation.INSTANCE;
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    int i313 = f55730f;
                    int i314 = i313 + 57;
                    f55729e = i314 % 128;
                    int i315 = i314 % 2;
                    int i316 = (((i313 | 12) << 1) - (i313 ^ 12)) - 1;
                    f55729e = i316 % 128;
                    int i317 = i316 % 2;
                    return Boolean.TRUE;
                }
            }
        }
        int i40 = f55730f;
        int i41 = i40 & 57;
        int i42 = -(-((i40 ^ 57) | i41));
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        f55729e = i43 % 128;
        if (i43 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i44 = 96 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ setRotationX d(Object[] objArr) {
        int i10;
        getClearButtonIconDrawableId getclearbuttonicondrawableid = (getClearButtonIconDrawableId) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i11 = f55730f;
        int i12 = (i11 & 43) + (i11 | 43);
        f55729e = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            int i14 = f55729e + 63;
            f55730f = i14 % 128;
            if (i14 % 2 == 0) {
                setItemChecked.Companion companion = setItemChecked.INSTANCE;
                throw null;
            }
            if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
                int i15 = f55730f;
                i10 = ((i15 ^ 2) + ((i15 & 2) << 1)) - 1;
                f55729e = i10 % 128;
            } else {
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 1896133447, -1896133442, System.identityHashCode(getclearbuttonicondrawableid));
                int i16 = f55729e;
                int i17 = i16 & 47;
                i10 = (i17 - (~((i16 ^ 47) | i17))) - 1;
                f55730f = i10 % 128;
            }
            int i18 = i10 % 2;
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{10023, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10023);
            int i19 = f55730f + 12;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            f55729e = i20 % 128;
            int i21 = i20 % 2;
        } else if (((Boolean) setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, setrotationx}, -208487736, 208487745, System.identityHashCode(getclearbuttonicondrawableid))).booleanValue()) {
            int i22 = f55730f;
            int i23 = (-2) - ((((i22 | 14) << 1) - (i22 ^ 14)) ^ (-1));
            int i24 = i23 % 128;
            f55729e = i24;
            if (i23 % 2 != 0) {
                throw null;
            }
            int i25 = i24 & 89;
            int i26 = ((i24 | 89) & (~i25)) + (i25 << 1);
            f55730f = i26 % 128;
            if (i26 % 2 != 0) {
                return setrotationx;
            }
            throw null;
        }
        int i27 = f55730f;
        int i28 = ((i27 ^ 12) + ((i27 & 12) << 1)) - 1;
        f55729e = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 38 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0109, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.setImageTintList.setX(new java.lang.Object[]{r9}, 1174276769, -1174276767, java.lang.System.identityHashCode(r9))).intValue() != 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getClearButtonIconDrawableId.e(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006f  */
    /* JADX WARN: Code duplicated, block: B:12:0x00bf  */
    public static /* synthetic */ Boolean f(Object[] objArr) {
        getClearButtonIconDrawableId getclearbuttonicondrawableid = (getClearButtonIconDrawableId) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i10 = f55729e;
        int i11 = (i10 ^ 113) + ((i10 & 113) << 1);
        f55730f = i11 % 128;
        int i12 = i11 % 2;
        if (((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            if (((Boolean) setOnFocusChangeListener(new Object[]{setrotationx}, 1095278471, -1095278471, (int) System.currentTimeMillis())).booleanValue()) {
                int i13 = f55729e;
                int i14 = (((i13 & (-12)) | ((~i13) & 11)) - (~((i13 & 11) << 1))) - 1;
                f55730f = i14 % 128;
                if (i14 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i15 = 69 / 0;
                return Boolean.TRUE;
            }
            int i16 = f55730f + 115;
            f55729e = i16 % 128;
            if (i16 % 2 != 0) {
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid}, -919310911, 919310914, System.identityHashCode(getclearbuttonicondrawableid));
            } else {
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid}, -919310911, 919310914, System.identityHashCode(getclearbuttonicondrawableid));
            }
            int i17 = f55729e + 99;
            f55730f = i17 % 128;
            int i18 = i17 % 2;
            return Boolean.FALSE;
        }
        int i19 = f55729e;
        int i20 = ((i19 | 77) << 1) - (i19 ^ 77);
        f55730f = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 83 / 0;
            if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
                int i22 = f55729e;
                int i23 = i22 ^ 81;
                int i24 = -(-((i22 & 81) << 1));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f55730f = i25 % 128;
                int i26 = i25 % 2;
            } else {
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 1896133447, -1896133442, System.identityHashCode(getclearbuttonicondrawableid));
                int i27 = f55730f;
                int i28 = (i27 ^ 13) + ((i27 & 13) << 1);
                f55729e = i28 % 128;
                int i29 = i28 % 2;
            }
        } else if (((setItemChecked) setRotationX.setX(new Object[]{setrotationx}, 2020716727, -2020716721, System.identityHashCode(setrotationx))) != setItemChecked.setDividerPadding) {
            int i210 = f55729e;
            int i211 = i210 ^ 81;
            int i212 = -(-((i210 & 81) << 1));
            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
            f55730f = i213 % 128;
            int i214 = i213 % 2;
        } else {
            setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, 1896133447, -1896133442, System.identityHashCode(getclearbuttonicondrawableid));
            int i215 = f55730f;
            int i216 = (i215 ^ 13) + ((i215 & 13) << 1);
            f55729e = i216 % 128;
            int i217 = i216 % 2;
        }
        int i30 = f55729e + 83;
        f55730f = i30 % 128;
        if (i30 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i31 = 91 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:? A[LOOP:0: B:7:0x0067->B:21:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x004c  */
    /* JADX WARN: Code duplicated, block: B:9:0x006e  */
    public static /* synthetic */ Boolean g(Object[] objArr) {
        Iterator it;
        bp bpVar = (bp) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55730f;
        int i11 = i10 & 95;
        int i12 = (i10 ^ 95) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55729e = i13 % 128;
        int i14 = i13 % 2;
        List list = (List) bp.setDividerPadding(new Object[]{bpVar}, -845224615, 845224615, System.identityHashCode(bpVar));
        if (list instanceof Collection) {
            int i15 = f55729e;
            int i16 = (i15 & 29) + (i15 | 29);
            f55730f = i16 % 128;
            int i17 = i16 % 2;
            if (!list.isEmpty()) {
                it = list.iterator();
                int i18 = f55730f;
                int i19 = i18 & 51;
                int i20 = ((i18 ^ 51) | i19) << 1;
                int i21 = -((i18 | 51) & (~i19));
                int i22 = (i20 & i21) + (i21 | i20);
                f55729e = i22 % 128;
                int i23 = i22 % 2;
                while (!(!it.hasNext())) {
                    int i24 = f55730f;
                    int i25 = i24 ^ 11;
                    int i26 = ((i24 & 11) | i25) << 1;
                    int i27 = -i25;
                    int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                    f55729e = i28 % 128;
                    int i29 = i28 % 2;
                    if (Arrays.equals((byte[]) it.next(), bArr)) {
                        int i30 = f55730f;
                        int i31 = i30 & 43;
                        int i32 = (i30 ^ 43) | i31;
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        f55729e = i33 % 128;
                        int i34 = i33 % 2;
                        return Boolean.TRUE;
                    }
                }
            }
        } else {
            it = list.iterator();
            int i110 = f55730f;
            int i111 = i110 & 51;
            int i210 = ((i110 ^ 51) | i111) << 1;
            int i211 = -((i110 | 51) & (~i111));
            int i212 = (i210 & i211) + (i211 | i210);
            f55729e = i212 % 128;
            int i213 = i212 % 2;
            while (!(!it.hasNext())) {
                int i214 = f55730f;
                int i215 = i214 ^ 11;
                int i216 = ((i214 & 11) | i215) << 1;
                int i217 = -i215;
                int i218 = (i216 ^ i217) + ((i216 & i217) << 1);
                f55729e = i218 % 128;
                int i219 = i218 % 2;
                if (Arrays.equals((byte[]) it.next(), bArr)) {
                    int i35 = f55730f;
                    int i36 = i35 & 43;
                    int i37 = (i35 ^ 43) | i36;
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    f55729e = i38 % 128;
                    int i39 = i38 % 2;
                    return Boolean.TRUE;
                }
            }
        }
        int i40 = f55730f;
        int i41 = i40 & 99;
        int i42 = (i40 | 99) & (~i41);
        int i43 = -(-(i41 << 1));
        int i44 = (i42 & i43) + (i42 | i43);
        f55729e = i44 % 128;
        if (i44 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i45 = 58 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x011b  */
    /* JADX WARN: Code duplicated, block: B:20:0x016a  */
    /* JADX WARN: Code duplicated, block: B:22:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:24:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x0223  */
    /* JADX WARN: Code duplicated, block: B:29:0x0284  */
    /* JADX WARN: Code duplicated, block: B:31:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0329  */
    /* JADX WARN: Code duplicated, block: B:35:0x037c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0399  */
    /* JADX WARN: Code duplicated, block: B:40:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0419  */
    /* JADX WARN: Code duplicated, block: B:46:0x042b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0483  */
    /* JADX WARN: Code duplicated, block: B:51:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x05da  */
    /* JADX WARN: Code duplicated, block: B:57:0x062f  */
    /* JADX WARN: Code duplicated, block: B:61:0x068f  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        setContentCaptureSession setcontentcapturesession;
        char c10;
        Object obj;
        Boolean boolValueOf;
        setMaxWidth onDragListener;
        TransactionFailed transactionFailed;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = ~i11;
        int i27 = ((i10 | i26) * 983) + (i11 * 984) + (i10 * (-1965));
        int i28 = ~i10;
        int i29 = ~i12;
        boolean z10 = false;
        switch ((((~(i28 | i11)) | (~(i29 | i28))) * 983) + (((~(i26 | i29)) | i28) * (-983)) + i27) {
            case 1:
                return g(objArr);
            case 2:
                return b(objArr);
            case 3:
                getClearButtonIconDrawableId getclearbuttonicondrawableid = (getClearButtonIconDrawableId) objArr[0];
                int i30 = f55729e;
                int i31 = i30 & 101;
                int i32 = (i30 | 101) & (~i31);
                int i33 = i31 << 1;
                int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                f55730f = i34 % 128;
                if (i34 % 2 != 0) {
                    setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, setContentCaptureSession.setNavigationOnClickListener}, -98214847, 98214858, (int) System.currentTimeMillis());
                    return null;
                }
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid, setContentCaptureSession.setNavigationOnClickListener}, -98214847, 98214858, (int) System.currentTimeMillis());
                throw null;
            case 4:
                return e(objArr);
            case 5:
                getClearButtonIconDrawableId getclearbuttonicondrawableid2 = (getClearButtonIconDrawableId) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i35 = f55729e;
                int i36 = ((i35 ^ 20) + ((i35 & 20) << 1)) - 1;
                int i37 = i36 % 128;
                f55730f = i37;
                if (i36 % 2 == 0) {
                    throw null;
                }
                if (bArr != null) {
                    int i38 = i37 & 83;
                    int i39 = ((i37 ^ 83) | i38) << 1;
                    int i40 = -((i37 | 83) & (~i38));
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    f55729e = i41 % 128;
                    int i42 = i41 % 2;
                    setcontentcapturesession = setContentCaptureSession.setLayoutAnimation;
                    int i43 = f55729e + 67;
                    f55730f = i43 % 128;
                    int i44 = i43 % 2;
                    c10 = 2;
                } else {
                    setcontentcapturesession = setContentCaptureSession.setOnLongClickListener;
                    int i45 = f55730f;
                    int i46 = ((i45 & (-98)) | ((~i45) & 97)) + ((i45 & 97) << 1);
                    f55729e = i46 % 128;
                    c10 = 2;
                    int i47 = i46 % 2;
                }
                Object[] objArr2 = new Object[3];
                objArr2[0] = getclearbuttonicondrawableid2;
                objArr2[1] = setcontentcapturesession;
                objArr2[c10] = bArr;
                setOnFocusChangeListener(objArr2, 1620562991, -1620562981, System.identityHashCode(getclearbuttonicondrawableid2));
                int i48 = f55729e;
                int i49 = ((i48 ^ 32) + ((i48 & 32) << 1)) - 1;
                f55730f = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
                return null;
            case 6:
                getClearButtonIconDrawableId getclearbuttonicondrawableid3 = (getClearButtonIconDrawableId) objArr[0];
                createTerminal createterminal = (createTerminal) objArr[1];
                Continuation<? super setRotationX> continuation = (Continuation) objArr[2];
                int i50 = f55729e;
                int i51 = i50 & 7;
                int i52 = (i50 ^ 7) | i51;
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                f55730f = i53 % 128;
                int i54 = i53 % 2;
                Object onFocusChangeListener = getclearbuttonicondrawableid3.f55731a.setOnFocusChangeListener(createterminal, continuation);
                int i55 = f55730f + 87;
                f55729e = i55 % 128;
                int i56 = i55 % 2;
                return onFocusChangeListener;
            case 7:
                return d(objArr);
            case 8:
                return a(objArr);
            case 9:
                return f(objArr);
            case 10:
                getClearButtonIconDrawableId getclearbuttonicondrawableid4 = (getClearButtonIconDrawableId) objArr[0];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[1];
                byte[] bArr2 = (byte[]) objArr[2];
                eu euVar = getclearbuttonicondrawableid4.f55733c;
                setHighlightColor sethighlightcolor = new setHighlightColor();
                fd fdVar = fd.END_APPLICATION;
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                int i57 = f55729e;
                int i58 = i57 & 67;
                int i59 = i57 | 67;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f55730f = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 11:
                getClearButtonIconDrawableId getclearbuttonicondrawableid5 = (getClearButtonIconDrawableId) objArr[0];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[1];
                int i62 = f55729e;
                int i63 = i62 ^ 33;
                int i64 = -(-((i62 & 33) << 1));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f55730f = i65 % 128;
                if (i65 % 2 != 0) {
                    ez.setY sety = ez.setDividerPadding;
                    setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid5, setcontentcapturesession3, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis())}, 1620562991, -1620562981, System.identityHashCode(getclearbuttonicondrawableid5));
                    return null;
                }
                ez.setY sety2 = ez.setDividerPadding;
                setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid5, setcontentcapturesession3, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis())}, 1620562991, -1620562981, System.identityHashCode(getclearbuttonicondrawableid5));
                throw null;
            case 12:
                return c(objArr);
            case 13:
                getClearButtonIconDrawableId getclearbuttonicondrawableid6 = (getClearButtonIconDrawableId) objArr[0];
                Object onFocusChangeListener2 = setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid6, new createTerminal((getBeepOnFailure) setOnFocusChangeListener(new Object[]{getclearbuttonicondrawableid6, (me) objArr[1], (getBeepOnFailure) objArr[2], (getBeepOnFailure) objArr[3], (cn) objArr[4], (Terminal) objArr[5]}, -802255343, 802255351, System.identityHashCode(getclearbuttonicondrawableid6))), (Continuation) objArr[6]}, 1308947958, -1308947952, System.identityHashCode(getclearbuttonicondrawableid6));
                int i66 = f55730f;
                int i67 = i66 & 81;
                int i68 = ((i66 | 81) & (~i67)) + (i67 << 1);
                f55729e = i68 % 128;
                int i69 = i68 % 2;
                return onFocusChangeListener2;
            case 14:
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[0];
                cn cnVar = (cn) objArr[1];
                bm bmVar = new bm(getbeeponfailure3);
                bp bpVar = (bp) ((setImageTintList) w.setX(new Object[]{bmVar}, 1693919772, -1693919769, System.identityHashCode(bmVar)));
                if (cnVar == null) {
                    int i70 = f55730f;
                    int i71 = ((i70 | 37) << 1) - (i70 ^ 37);
                    f55729e = i71 % 128;
                    int i72 = i71 % 2;
                    int i73 = ((i70 | 21) << 1) - (i70 ^ 21);
                    f55729e = i73 % 128;
                    if (i73 % 2 != 0) {
                        throw null;
                    }
                } else {
                    List list = (List) cn.setDividerPadding(new Object[]{cnVar}, -2019104287, 2019104287, System.identityHashCode(cnVar));
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i74 = f55729e;
                        int i75 = (((i74 & (-92)) | ((~i74) & 91)) - (~(-(-((i74 & 91) << 1))))) - 1;
                        f55730f = i75 % 128;
                        int i76 = i75 % 2;
                        while (true) {
                            if (!(!it.hasNext())) {
                                int i77 = f55730f + 83;
                                f55729e = i77 % 128;
                                if (i77 % 2 != 0) {
                                    co coVar = (co) it.next();
                                    Arrays.equals((byte[]) co.setX(new Object[]{coVar}, -805717122, 805717122, System.identityHashCode(coVar)), (byte[]) co.Companion.setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis()));
                                    throw null;
                                }
                                Object next = it.next();
                                co coVar2 = (co) next;
                                if (Arrays.equals((byte[]) co.setX(new Object[]{coVar2}, -805717122, 805717122, System.identityHashCode(coVar2)), (byte[]) co.Companion.setX(new Object[0], 474977319, -474977319, (int) System.currentTimeMillis()))) {
                                    int i78 = f55729e;
                                    int i79 = (i78 & (-126)) | ((~i78) & 125);
                                    int i80 = (i78 & 125) << 1;
                                    int i81 = (i79 & i80) + (i80 | i79);
                                    f55730f = i81 % 128;
                                    int i82 = i81 % 2;
                                    obj = next;
                                }
                            } else {
                                int i83 = f55730f;
                                int i84 = i83 & 123;
                                int i85 = (i84 - (~(-(-((i83 ^ 123) | i84))))) - 1;
                                f55729e = i85 % 128;
                                int i86 = i85 % 2;
                                obj = null;
                            }
                        }
                        co coVar3 = (co) obj;
                        if (coVar3 == null) {
                            int i87 = f55730f;
                            int i88 = (i87 & (-54)) | ((~i87) & 53);
                            int i89 = -(-((i87 & 53) << 1));
                            int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                            int i91 = i90 % 128;
                            f55729e = i91;
                            int i92 = i90 % 2;
                            int i93 = i91 & 93;
                            int i94 = -(-(i91 | 93));
                            int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
                            f55730f = i95 % 128;
                            if (i95 % 2 == 0) {
                                int i96 = 9 / 0;
                            }
                        } else {
                            boolean zBooleanValue = ((Boolean) setOnFocusChangeListener(new Object[]{bpVar, (byte[]) co.setX(new Object[]{coVar3}, -1106532120, 1106532121, System.identityHashCode(coVar3))}, 389624988, -389624987, (int) System.currentTimeMillis())).booleanValue();
                            int i97 = f55730f;
                            int i98 = i97 & 7;
                            int i99 = -(-(i97 | 7));
                            int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                            f55729e = i100 % 128;
                            if (i100 % 2 != 0) {
                                int i101 = 91 / 0;
                            }
                            boolValueOf = Boolean.valueOf(zBooleanValue);
                        }
                        return boolValueOf;
                    }
                    int i102 = f55730f;
                    int i103 = i102 & 1;
                    int i104 = (~i103) & (i102 | 1);
                    int i105 = -(-(i103 << 1));
                    int i106 = (i104 & i105) + (i105 | i104);
                    f55729e = i106 % 128;
                    int i107 = i106 % 2;
                    int i108 = ((i102 | 118) << 1) - (i102 ^ 118);
                    int i109 = (i108 ^ (-1)) + (i108 << 1);
                    f55729e = i109 % 128;
                    int i110 = i109 % 2;
                }
                boolValueOf = Boolean.FALSE;
                return boolValueOf;
            default:
                boolValueOf = Boolean.FALSE;
                setRotationX setrotationx = (setRotationX) objArr[0];
                int i111 = f55729e;
                int i112 = ((i111 ^ 121) | (i111 & 121)) << 1;
                int i113 = -(((~i111) & 121) | (i111 & (-122)));
                int i114 = (i112 & i113) + (i113 | i112);
                f55730f = i114 % 128;
                if (i114 % 2 == 0) {
                    int length = ((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx))).length;
                    throw null;
                }
                if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx))).length != 0) {
                    int i115 = f55729e;
                    int i116 = i115 ^ 96;
                    int i117 = (((i115 | 96) << 1) - i116) - 1;
                    f55730f = i117 % 128;
                    int i118 = i117 % 2;
                    int i119 = (i116 + ((i115 & 96) << 1)) - 1;
                    f55730f = i119 % 128;
                    if (i119 % 2 != 0) {
                        int i120 = (((i115 & (-66)) | ((~i115) & 65)) - (~((i115 & 65) << 1))) - 1;
                        f55730f = i120 % 128;
                        if (i120 % 2 == 0) {
                            String str = (String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx)))[1])}, 1862949367, -1862949363, (int) System.currentTimeMillis());
                            setAnimation setanimation = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                int i121 = f55729e;
                                int i122 = (i121 & (-112)) | ((~i121) & 111);
                                int i123 = (i121 & 111) << 1;
                                int i124 = (i122 & i123) + (i123 | i122);
                                f55730f = i124 % 128;
                                int i125 = i124 % 2;
                                onDragListener = setrotationx.setOnDragListener();
                                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(onDragListener))) == null) {
                                    i20 = f55730f + 107;
                                    f55729e = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                        SouthPacificEndpoint.setX(new Object[]{5684, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 3}, 1336485880, -1336485874, 5684);
                                        z10 = true;
                                        i21 = 2;
                                    } else {
                                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                                        i21 = 2;
                                        SouthPacificEndpoint.setX(new Object[]{10008, getdetailsfieldtextsizesp, 4}, 1336485880, -1336485874, 10008);
                                    }
                                    int i126 = f55730f + 15;
                                    f55729e = i126 % 128;
                                    int i127 = i126 % i21;
                                } else {
                                    setMaxWidth onDragListener2 = setrotationx.setOnDragListener();
                                    TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                    getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -480651882, 480651889, System.identityHashCode(onDragListener2));
                                    if (getbeeponfailure == null) {
                                        int i128 = f55730f;
                                        i19 = ((i128 & 106) + (i128 | 106)) - 1;
                                        f55729e = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                            SouthPacificEndpoint.setX(new Object[]{12634, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 12634);
                                        } else {
                                            SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                        }
                                    } else {
                                        getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, setAnimation.CardScheme()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
                                        if (getbeeponfailure2 == null) {
                                            int i129 = f55729e;
                                            int i130 = ((i129 | 105) << 1) - (i129 ^ 105);
                                            f55730f = i130 % 128;
                                            int i131 = i130 % 2;
                                            SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
                                            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                            i18 = f55729e + 113;
                                            f55730f = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                throw null;
                                            }
                                        } else if (((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 349236676, -349236664, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i132 = f55729e;
                                            int i133 = i132 & 81;
                                            int i134 = i132 | 81;
                                            int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                                            f55730f = i135 % 128;
                                            int i136 = i135 % 2;
                                            boolValueOf = Boolean.TRUE;
                                        } else {
                                            i13 = f55730f + 105;
                                            f55729e = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                                                TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                                SouthPacificEndpoint.setX(new Object[]{25415, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 25415);
                                                z10 = true;
                                            } else {
                                                SouthPacificEndpoint southPacificEndpoint7 = SouthPacificEndpoint.setX;
                                                TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                                SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                            }
                                            int iCurrentTimeMillis = (int) System.currentTimeMillis();
                                            int i137 = ~iCurrentTimeMillis;
                                            int i138 = ~(((-87494716) & i137) | ((-87494716) ^ i137));
                                            int i139 = (i138 & 1290347264) | (1290347264 ^ i138);
                                            int i140 = 87494715 & iCurrentTimeMillis;
                                            int i141 = (87494715 | iCurrentTimeMillis) & (~i140);
                                            int i142 = ~((i141 & i140) | (i141 ^ i140));
                                            int i143 = i139 & i142;
                                            int i144 = (i139 | i142) & (~i143);
                                            int i145 = -(-(((i144 & i143) | (i144 ^ i143)) * (-564)));
                                            int i146 = (-1489056406) & i145;
                                            int i147 = i146 + ((i145 ^ (-1489056406)) | i146);
                                            int i148 = 1308570427 & iCurrentTimeMillis;
                                            int i149 = (iCurrentTimeMillis | 1308570427) & (~i148);
                                            int i150 = (~((i149 & i148) | (i149 ^ i148))) * 1128;
                                            int i151 = ((~i150) & i147) | ((~i147) & i150);
                                            int i152 = (i150 & i147) << 1;
                                            int i153 = (i151 & i152) + (i152 | i151);
                                            int i154 = ((~i137) & 1290347264) | ((-1290347265) & i137);
                                            int i155 = i137 & 1290347264;
                                            int i156 = -(-(((~((i154 & i155) | (i154 ^ i155))) | 1221075712) * 564));
                                            int i157 = i153 & i156;
                                            int i158 = -(-((i156 ^ i153) | i157));
                                            i14 = ((i157 | i158) << 1) - (i158 ^ i157);
                                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                                            int i159 = (-1822445650) ^ iCurrentTimeMillis2;
                                            int i160 = ~iCurrentTimeMillis2;
                                            int i161 = (-1822445650) & iCurrentTimeMillis2;
                                            int i162 = ~((i159 & i161) | (i159 ^ i161));
                                            int i163 = 1619001345 ^ i162;
                                            int i164 = i162 & 1619001345;
                                            int i165 = (i164 & i163) | (i163 ^ i164);
                                            int i166 = ((i160 | iCurrentTimeMillis2) & i160) | 1670742791;
                                            int i167 = ((-1822445650) & i166) | ((~i166) & 1822445649);
                                            int i168 = i166 & 1822445649;
                                            int i169 = ~((i167 & i168) | (i167 ^ i168));
                                            int i170 = i165 ^ i169;
                                            int i171 = i169 & i165;
                                            i15 = (-80358099) - (~(((i171 & i170) | (i170 ^ i171)) * (-470)));
                                            int i172 = (-203444305) & iCurrentTimeMillis2;
                                            int i173 = (iCurrentTimeMillis2 | (-203444305)) & (~i172);
                                            int i174 = (i173 & i172) | (i173 ^ i172);
                                            int i175 = ~i174;
                                            i16 = (i174 | i175) & i175;
                                            int i176 = i160 & 1670742791;
                                            int i177 = (i160 | 1670742791) & (~i176);
                                            int i178 = (i176 & i177) | (i177 ^ i176);
                                            int i179 = (i178 & 1822445649) | (i178 ^ 1822445649);
                                            int i180 = ~i179;
                                            i17 = (i179 | i180) & i180;
                                            if (i14 > (i15 - (~(-(-(((i16 & i17) | (i16 ^ i17)) * 470))))) - 1) {
                                                throw null;
                                            }
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z10);
                            } else {
                                i22 = 2;
                            }
                        } else {
                            String str2 = (String) getPinPadLandscape.setY(new Object[]{Byte.valueOf(((byte[]) setRotationX.setX(new Object[]{setrotationx}, -918913871, 918913871, System.identityHashCode(setrotationx)))[0])}, 1862949367, -1862949363, (int) System.currentTimeMillis());
                            setAnimation setanimation2 = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                            if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10)))) {
                                int i1210 = f55729e;
                                int i1211 = (i1210 & (-112)) | ((~i1210) & 111);
                                int i1212 = (i1210 & 111) << 1;
                                int i1213 = (i1211 & i1212) + (i1212 | i1211);
                                f55730f = i1213 % 128;
                                int i1214 = i1213 % 2;
                                onDragListener = setrotationx.setOnDragListener();
                                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                if (((getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -480651882, 480651889, System.identityHashCode(onDragListener))) == null) {
                                    i20 = f55730f + 107;
                                    f55729e = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        SouthPacificEndpoint southPacificEndpoint8 = SouthPacificEndpoint.setX;
                                        TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                        SouthPacificEndpoint.setX(new Object[]{5684, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed11}, 1914607362, -1914607356, System.identityHashCode(transactionFailed11))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 3}, 1336485880, -1336485874, 5684);
                                        z10 = true;
                                        i21 = 2;
                                    } else {
                                        SouthPacificEndpoint southPacificEndpoint9 = SouthPacificEndpoint.setX;
                                        TransactionFailed transactionFailed12 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                                        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed12}, 1914607362, -1914607356, System.identityHashCode(transactionFailed12))}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                                        i21 = 2;
                                        SouthPacificEndpoint.setX(new Object[]{10008, getdetailsfieldtextsizesp2, 4}, 1336485880, -1336485874, 10008);
                                    }
                                    int i1215 = f55730f + 15;
                                    f55729e = i1215 % 128;
                                    int i1216 = i1215 % i21;
                                } else {
                                    setMaxWidth onDragListener3 = setrotationx.setOnDragListener();
                                    TransactionFailed transactionFailed13 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                    getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{onDragListener3, (String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13))}, -480651882, 480651889, System.identityHashCode(onDragListener3));
                                    if (getbeeponfailure == null) {
                                        int i1217 = f55730f;
                                        i19 = ((i1217 & 106) + (i1217 | 106)) - 1;
                                        f55729e = i19 % 128;
                                        if (i19 % 2 != 0) {
                                            SouthPacificEndpoint southPacificEndpoint10 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailed14 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                            SouthPacificEndpoint.setX(new Object[]{12634, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed14}, 1914607362, -1914607356, System.identityHashCode(transactionFailed14))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 12634);
                                        } else {
                                            SouthPacificEndpoint southPacificEndpoint11 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailed15 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                                            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed15}, 1914607362, -1914607356, System.identityHashCode(transactionFailed15))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                        }
                                    } else {
                                        getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, setAnimation.CardScheme()}, -990392770, 990392791, System.identityHashCode(getbeeponfailure));
                                        if (getbeeponfailure2 == null) {
                                            int i1218 = f55729e;
                                            int i1310 = ((i1218 | 105) << 1) - (i1218 ^ 105);
                                            f55730f = i1310 % 128;
                                            int i1311 = i1310 % 2;
                                            SouthPacificEndpoint southPacificEndpoint12 = SouthPacificEndpoint.setX;
                                            TransactionFailed transactionFailedCardScheme2 = setAnimation.CardScheme();
                                            SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme2))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                            i18 = f55729e + 113;
                                            f55730f = i18 % 128;
                                            if (i18 % 2 == 0) {
                                                throw null;
                                            }
                                        } else if (((Boolean) setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 349236676, -349236664, (int) System.currentTimeMillis())).booleanValue()) {
                                            i13 = f55730f + 105;
                                            f55729e = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                SouthPacificEndpoint southPacificEndpoint13 = SouthPacificEndpoint.setX;
                                                TransactionFailed transactionFailed16 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                                SouthPacificEndpoint.setX(new Object[]{25415, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed16}, 1914607362, -1914607356, System.identityHashCode(transactionFailed16))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 5}, 1336485880, -1336485874, 25415);
                                                z10 = true;
                                            } else {
                                                SouthPacificEndpoint southPacificEndpoint14 = SouthPacificEndpoint.setX;
                                                TransactionFailed transactionFailed17 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                                SouthPacificEndpoint.setX(new Object[]{10008, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed17}, 1914607362, -1914607356, System.identityHashCode(transactionFailed17))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 10008);
                                            }
                                            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                                            int i1312 = ~iCurrentTimeMillis3;
                                            int i1313 = ~(((-87494716) & i1312) | ((-87494716) ^ i1312));
                                            int i1314 = (i1313 & 1290347264) | (1290347264 ^ i1313);
                                            int i1410 = 87494715 & iCurrentTimeMillis3;
                                            int i1411 = (87494715 | iCurrentTimeMillis3) & (~i1410);
                                            int i1412 = ~((i1411 & i1410) | (i1411 ^ i1410));
                                            int i1413 = i1314 & i1412;
                                            int i1414 = (i1314 | i1412) & (~i1413);
                                            int i1415 = -(-(((i1414 & i1413) | (i1414 ^ i1413)) * (-564)));
                                            int i1416 = (-1489056406) & i1415;
                                            int i1417 = i1416 + ((i1415 ^ (-1489056406)) | i1416);
                                            int i1418 = 1308570427 & iCurrentTimeMillis3;
                                            int i1419 = (iCurrentTimeMillis3 | 1308570427) & (~i1418);
                                            int i1510 = (~((i1419 & i1418) | (i1419 ^ i1418))) * 1128;
                                            int i1511 = ((~i1510) & i1417) | ((~i1417) & i1510);
                                            int i1512 = (i1510 & i1417) << 1;
                                            int i1513 = (i1511 & i1512) + (i1512 | i1511);
                                            int i1514 = ((~i1312) & 1290347264) | ((-1290347265) & i1312);
                                            int i1515 = i1312 & 1290347264;
                                            int i1516 = -(-(((~((i1514 & i1515) | (i1514 ^ i1515))) | 1221075712) * 564));
                                            int i1517 = i1513 & i1516;
                                            int i1518 = -(-((i1516 ^ i1513) | i1517));
                                            i14 = ((i1517 | i1518) << 1) - (i1518 ^ i1517);
                                            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                                            int i1519 = (-1822445650) ^ iCurrentTimeMillis4;
                                            int i1610 = ~iCurrentTimeMillis4;
                                            int i1611 = (-1822445650) & iCurrentTimeMillis4;
                                            int i1612 = ~((i1519 & i1611) | (i1519 ^ i1611));
                                            int i1613 = 1619001345 ^ i1612;
                                            int i1614 = i1612 & 1619001345;
                                            int i1615 = (i1614 & i1613) | (i1613 ^ i1614);
                                            int i1616 = ((i1610 | iCurrentTimeMillis4) & i1610) | 1670742791;
                                            int i1617 = ((-1822445650) & i1616) | ((~i1616) & 1822445649);
                                            int i1618 = i1616 & 1822445649;
                                            int i1619 = ~((i1617 & i1618) | (i1617 ^ i1618));
                                            int i1710 = i1615 ^ i1619;
                                            int i1711 = i1619 & i1615;
                                            i15 = (-80358099) - (~(((i1711 & i1710) | (i1710 ^ i1711)) * (-470)));
                                            int i1712 = (-203444305) & iCurrentTimeMillis4;
                                            int i1713 = (iCurrentTimeMillis4 | (-203444305)) & (~i1712);
                                            int i1714 = (i1713 & i1712) | (i1713 ^ i1712);
                                            int i1715 = ~i1714;
                                            i16 = (i1714 | i1715) & i1715;
                                            int i1716 = i1610 & 1670742791;
                                            int i1717 = (i1610 | 1670742791) & (~i1716);
                                            int i1718 = (i1716 & i1717) | (i1717 ^ i1716);
                                            int i1719 = (i1718 & 1822445649) | (i1718 ^ 1822445649);
                                            int i181 = ~i1719;
                                            i17 = (i1719 | i181) & i181;
                                            if (i14 > (i15 - (~(-(-(((i16 & i17) | (i16 ^ i17)) * 470))))) - 1) {
                                                throw null;
                                            }
                                        } else {
                                            int i1315 = f55729e;
                                            int i1316 = i1315 & 81;
                                            int i1317 = i1315 | 81;
                                            int i1318 = (i1316 ^ i1317) + ((i1317 & i1316) << 1);
                                            f55730f = i1318 % 128;
                                            int i1319 = i1318 % 2;
                                            boolValueOf = Boolean.TRUE;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z10);
                            } else {
                                i22 = 2;
                            }
                        }
                        return boolValueOf;
                    }
                    int i182 = f55729e + 101;
                    int i183 = i182 % 128;
                    f55730f = i183;
                    int i184 = i182 % i22;
                    i23 = i183 + 73;
                    f55729e = i23 % 128;
                    if (i23 % i22 != 0) {
                        SouthPacificEndpoint southPacificEndpoint15 = SouthPacificEndpoint.setX;
                        setAnimation setanimation3 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed18 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                        SouthPacificEndpoint.setX(new Object[]{25387, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed18}, 1914607362, -1914607356, System.identityHashCode(transactionFailed18))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 3}, 1336485880, -1336485874, 25387);
                        i24 = 2;
                    } else {
                        SouthPacificEndpoint southPacificEndpoint16 = SouthPacificEndpoint.setX;
                        setAnimation setanimation4 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed19 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp3 = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed19}, 1914607362, -1914607356, System.identityHashCode(transactionFailed19))}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                        i24 = 2;
                        SouthPacificEndpoint.setX(new Object[]{10008, getdetailsfieldtextsizesp3, 4}, 1336485880, -1336485874, 10008);
                    }
                    i25 = f55730f + 119;
                    f55729e = i25 % 128;
                    if (i25 % i24 != 0) {
                        throw null;
                    }
                    return boolValueOf;
                }
                int i185 = f55729e;
                int i186 = i185 & 83;
                int i187 = (i186 - (~((i185 ^ 83) | i186))) - 1;
                f55730f = i187 % 128;
                int i188 = i187 % 2;
                int i189 = i185 & 67;
                int i190 = i189 + ((i185 ^ 67) | i189);
                f55730f = i190 % 128;
                int i191 = i190 % 2;
                i22 = 2;
                int i1810 = f55729e + 101;
                int i1811 = i1810 % 128;
                f55730f = i1811;
                int i1812 = i1810 % i22;
                i23 = i1811 + 73;
                f55729e = i23 % 128;
                if (i23 % i22 != 0) {
                    SouthPacificEndpoint southPacificEndpoint17 = SouthPacificEndpoint.setX;
                    setAnimation setanimation5 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed110 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    SouthPacificEndpoint.setX(new Object[]{25387, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed110}, 1914607362, -1914607356, System.identityHashCode(transactionFailed110))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 3}, 1336485880, -1336485874, 25387);
                    i24 = 2;
                } else {
                    SouthPacificEndpoint southPacificEndpoint18 = SouthPacificEndpoint.setX;
                    setAnimation setanimation6 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed111 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    getDetailsFieldTextSizeSp getdetailsfieldtextsizesp4 = (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed111}, 1914607362, -1914607356, System.identityHashCode(transactionFailed111))}, 1240364979, -1240364979, (int) System.currentTimeMillis());
                    i24 = 2;
                    SouthPacificEndpoint.setX(new Object[]{10008, getdetailsfieldtextsizesp4, 4}, 1336485880, -1336485874, 10008);
                }
                i25 = f55730f + 119;
                f55729e = i25 % 128;
                if (i25 % i24 != 0) {
                    throw null;
                }
                return boolValueOf;
        }
    }

    @Nullable
    public final setRotationX setCompoundDrawableTintBlendMode(@NotNull setRotationX setrotationx) {
        return (setRotationX) setOnFocusChangeListener(new Object[]{this, setrotationx}, 1969692285, -1969692278, System.identityHashCode(this));
    }

    @Nullable
    public final Object setDividerPadding(@NotNull setRotationX setrotationx, @NotNull me meVar, @NotNull Continuation<? super setRotationX> continuation) {
        return setOnFocusChangeListener(new Object[]{this, setrotationx, meVar, continuation}, 2074512173, -2074512169, System.identityHashCode(this));
    }
}
