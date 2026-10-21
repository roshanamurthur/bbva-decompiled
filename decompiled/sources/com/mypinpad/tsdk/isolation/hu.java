package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.List;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hu extends hm {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56243j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56244k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final component17 f56245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final getValue f56246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final gz f56247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final io f56248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull component17 component17Var, @NotNull getValue getvalue, @NotNull gz gzVar, @NotNull io ioVar) {
        super(gvVar, settextkeepstate, exVar);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        this.f56245f = component17Var;
        this.f56246g = getvalue;
        this.f56247h = gzVar;
        this.f56248i = ioVar;
    }

    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        List list;
        List list2;
        gv gvVar = (gv) objArr[0];
        v vVar = (v) objArr[1];
        int i10 = f56243j;
        int i11 = (i10 ^ 55) + ((i10 & 55) << 1);
        f56244k = i11 % 128;
        if (i11 % 2 == 0) {
            TransactionFailed onReceiveContentListener = setAnimation.setOnReceiveContentListener();
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{onReceiveContentListener}, 1914607362, -1914607356, System.identityHashCode(onReceiveContentListener))}, -1394735893, 1394735910, System.identityHashCode(gvVar));
            throw null;
        }
        TransactionFailed onReceiveContentListener2 = setAnimation.setOnReceiveContentListener();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{onReceiveContentListener2}, 1914607362, -1914607356, System.identityHashCode(onReceiveContentListener2))}, -1394735893, 1394735910, System.identityHashCode(gvVar));
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, setAnimation.setOnReceiveContentListener()}, -1593889019, 1593889062, System.identityHashCode(gvVar));
        if (getbeeponfailure != null) {
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, new byte[]{0}}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
            int i12 = f56243j;
            int i13 = (((i12 | 31) << 1) - (~(-(((~i12) & 31) | (i12 & (-32)))))) - 1;
            f56244k = i13 % 128;
            int i14 = i13 % 2;
        }
        TransactionFailed bottom = setAnimation.setBottom();
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{bottom}, 1914607362, -1914607356, System.identityHashCode(bottom))}, -1394735893, 1394735910, System.identityHashCode(gvVar));
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, setAnimation.setBottom()}, -1593889019, 1593889062, System.identityHashCode(gvVar));
        if (getbeeponfailure2 != null) {
            int i15 = f56244k + 60;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f56243j = i16 % 128;
            int i17 = i16 % 2;
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, new byte[]{0}}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure2));
            int i18 = f56244k;
            int i19 = (i18 ^ 69) + ((i18 & 69) << 1);
            f56243j = i19 % 128;
            int i20 = i19 % 2;
        }
        setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -595845106, 595845122, System.identityHashCode(gvVar));
        setMaxWidth.setX(new Object[]{setmaxwidth}, 1256703722, -1256703714, System.identityHashCode(setmaxwidth));
        setMaxWidth setmaxwidth2 = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -242476784, 242476788, System.identityHashCode(gvVar));
        setMaxWidth.setX(new Object[]{setmaxwidth2}, 1256703722, -1256703714, System.identityHashCode(setmaxwidth2));
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis());
        if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -1557508936, 1557508986, System.identityHashCode(gvVar))).booleanValue())) {
            int i21 = f56243j;
            int i22 = (((i21 ^ 31) | (i21 & 31)) << 1) - ((i21 & (-32)) | ((~i21) & 31));
            f56244k = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            setMaxWidth setmaxwidth3 = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -242476784, 242476788, System.identityHashCode(gvVar));
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 1910770848, -1910770837, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            if (getbeeponfailure3 == null) {
                int i23 = f56243j;
                int i24 = (i23 ^ 43) + ((i23 & 43) << 1);
                f56244k = i24 % 128;
                int i25 = i24 % 2;
                list2 = null;
            } else {
                list2 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3));
                int i26 = f56244k;
                int i27 = (i26 & 119) + (i26 | 119);
                f56243j = i27 % 128;
                int i28 = i27 % 2;
            }
            setMaxWidth.setX(new Object[]{setmaxwidth3, list2}, 1060795376, -1060795356, System.identityHashCode(setmaxwidth3));
            int i29 = f56244k;
            int i30 = i29 & 37;
            int i31 = i30 + ((i29 ^ 37) | i30);
            f56243j = i31 % 128;
            int i32 = i31 % 2;
        }
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 401053082, -401052943, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -1557508936, 1557508986, System.identityHashCode(gvVar))).booleanValue()) {
            int i33 = f56244k;
            int i34 = i33 & 89;
            int i35 = (i33 | 89) & (~i34);
            int i36 = i34 << 1;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            f56243j = i37 % 128;
            if (i37 % 2 != 0) {
                throw null;
            }
            setMaxWidth setmaxwidth4 = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -595845106, 595845122, System.identityHashCode(gvVar));
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 401053082, -401052943, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            if (getbeeponfailure4 == null) {
                int i38 = f56243j;
                int i39 = i38 + 101;
                f56244k = i39 % 128;
                if (i39 % 2 == 0) {
                    int i40 = 20 / 0;
                }
                int i41 = (i38 & (-70)) | ((~i38) & 69);
                int i42 = -(-((i38 & 69) << 1));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f56244k = i43 % 128;
                int i44 = i43 % 2;
                list = null;
            } else {
                list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4));
                int i45 = f56243j;
                int i46 = i45 & 113;
                int i47 = (i45 | 113) & (~i46);
                int i48 = -(-(i46 << 1));
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                f56244k = i49 % 128;
                int i50 = i49 % 2;
            }
            setMaxWidth.setX(new Object[]{setmaxwidth4, list}, 1060795376, -1060795356, System.identityHashCode(setmaxwidth4));
            int i51 = f56244k;
            int i52 = i51 & 109;
            int i53 = -(-((i51 ^ 109) | i52));
            int i54 = (i52 & i53) + (i53 | i52);
            f56243j = i54 % 128;
            int i55 = i54 % 2;
        }
        int i56 = f56244k;
        int i57 = i56 & 1;
        int i58 = (((i56 | 1) & (~i57)) - (~(i57 << 1))) - 1;
        f56243j = i58 % 128;
        int i59 = i58 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x019c  */
    /* JADX WARN: Code duplicated, block: B:22:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0214 A[SYNTHETIC] */
    public static /* synthetic */ Boolean b(Object[] objArr) throws Exception {
        setOnGenericMotionListener setongenericmotionlistener;
        setScrollContainer setscrollcontainer;
        int i10;
        a aVar = (a) objArr[0];
        gv gvVar = (gv) objArr[1];
        int i11 = f56243j;
        int i12 = i11 & 43;
        int i13 = -(-(i11 | 43));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f56244k = i14 % 128;
        if (i14 % 2 == 0) {
            ((setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))).iterator();
            throw null;
        }
        for (getBeepOnFailure getbeeponfailure : (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))) {
            int i15 = f56244k;
            int i16 = i15 & 95;
            int i17 = -(-((i15 ^ 95) | i16));
            int i18 = (i16 & i17) + (i17 | i16);
            f56243j = i18 % 128;
            int i19 = i18 % 2;
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure}, 2094047793, -2094047756, (int) System.currentTimeMillis())).booleanValue()) {
                    int i20 = f56244k;
                    int i21 = (i20 & (-92)) | ((~i20) & 91);
                    int i22 = -(-((i20 & 91) << 1));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    f56243j = i23 % 128;
                    int i24 = i23 % 2;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20001, null, 6}, 1336485880, -1336485874, 20001);
                    int i25 = f56244k;
                    int i26 = i25 ^ 61;
                    int i27 = (((i25 & 61) | i26) << 1) - i26;
                    f56243j = i27 % 128;
                    if (i27 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
            } else {
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, -422205110, 422205136, System.identityHashCode(gvVar))).booleanValue()) {
                    setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setTextSize.setX, Terminal.KERNEL_2}, -1916735797, 1916735800, (int) System.currentTimeMillis())).booleanValue()) {
                        int i28 = f56244k;
                        i10 = ((i28 | 45) << 1) - (i28 ^ 45);
                        f56243j = i10 % 128;
                        if (i10 % 2 == 0) {
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                            throw null;
                        }
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                    } else {
                        continue;
                    }
                } else {
                    int i29 = f56244k;
                    int i30 = i29 ^ 121;
                    int i31 = ((i29 & 121) | i30) << 1;
                    int i32 = -i30;
                    int i33 = (i31 & i32) + (i31 | i32);
                    f56243j = i33 % 128;
                    int i34 = i33 % 2;
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4))}, -232375606, 232375652, System.identityHashCode(gvVar))).booleanValue()) {
                        setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setTextSize.setX, Terminal.KERNEL_2}, -1916735797, 1916735800, (int) System.currentTimeMillis())).booleanValue()) {
                            int i210 = f56244k;
                            i10 = ((i210 | 45) << 1) - (i210 ^ 45);
                            f56243j = i10 % 128;
                            if (i10 % 2 == 0) {
                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                                throw null;
                            }
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i35 = f56243j;
            int i36 = i35 | 113;
            int i37 = i36 << 1;
            int i38 = -((~(i35 & 113)) & i36);
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f56244k = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = f56243j + 57;
        f56244k = i41 % 128;
        if (i41 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00df A[PHI: r2
      0x00df: PHI (r2v29 com.mypinpad.tsdk.i.getBeepOnFailure) = (r2v28 com.mypinpad.tsdk.i.getBeepOnFailure), (r2v39 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:12:0x00dd, B:9:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:16:0x011c  */
    public static /* synthetic */ void c(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        int i10;
        gv gvVar = (gv) objArr[0];
        int i11 = f56243j;
        int i12 = (i11 & 31) + (i11 | 31);
        f56244k = i12 % 128;
        int i13 = i12 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1412794821, 1412794991, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2064855914, -2064855856, System.identityHashCode(gvVar))).booleanValue()) {
            ag agVar = new ag(gvVar);
            if (!(!((ac) ((setImageTintList) w.setX(new Object[]{agVar}, 1693919772, -1693919769, System.identityHashCode(agVar)))).setNavigationOnClickListener())) {
                int i14 = f56244k;
                int i15 = i14 & 27;
                int i16 = (i14 | 27) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                f56243j = i18 % 128;
                if (i18 % 2 != 0) {
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -581523700, 581523791, (int) System.currentTimeMillis())}, 1509579822, -1509579760, System.identityHashCode(gvVar));
                    int i19 = 68 / 0;
                    if (getbeeponfailure != null) {
                        int i20 = f56244k;
                        i10 = ((i20 | 19) << 1) - (i20 ^ 19);
                        f56243j = i10 % 128;
                        if (i10 % 2 != 0) {
                            gv.setOnFocusChangeListener(new Object[]{gvVar, Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[1])}, -1428488013, 1428488028, System.identityHashCode(gvVar));
                        } else {
                            gv.setOnFocusChangeListener(new Object[]{gvVar, Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0])}, -1428488013, 1428488028, System.identityHashCode(gvVar));
                        }
                    }
                } else {
                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -581523700, 581523791, (int) System.currentTimeMillis())}, 1509579822, -1509579760, System.identityHashCode(gvVar));
                    if (getbeeponfailure != null) {
                        int i21 = f56244k;
                        i10 = ((i21 | 19) << 1) - (i21 ^ 19);
                        f56243j = i10 % 128;
                        if (i10 % 2 != 0) {
                            gv.setOnFocusChangeListener(new Object[]{gvVar, Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[1])}, -1428488013, 1428488028, System.identityHashCode(gvVar));
                        } else {
                            gv.setOnFocusChangeListener(new Object[]{gvVar, Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0])}, -1428488013, 1428488028, System.identityHashCode(gvVar));
                        }
                    }
                }
            }
        }
        int i22 = f56244k + 125;
        f56243j = i22 % 128;
        int i23 = i22 % 2;
    }

    public static /* synthetic */ v d(Object[] objArr) throws Exception {
        int i10;
        gv gvVar = (gv) objArr[0];
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis());
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -1394735893, 1394735910, System.identityHashCode(gvVar));
        v vVar = new v(gvVar);
        setMaxWidth setmaxwidth = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -836208544, 836208569, System.identityHashCode(gvVar));
        setMaxWidth.setX(new Object[]{setmaxwidth}, 1256703722, -1256703714, System.identityHashCode(setmaxwidth));
        TransactionFailed navigationIcon = setAnimation.setNavigationIcon();
        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{navigationIcon}, 1914607362, -1914607356, System.identityHashCode(navigationIcon))}, -1557508936, 1557508986, System.identityHashCode(gvVar))).booleanValue()) {
            TransactionFailed navigationIcon2 = setAnimation.setNavigationIcon();
            if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) TransactionFailed.setX(new Object[]{navigationIcon2}, 1914607362, -1914607356, System.identityHashCode(navigationIcon2))}, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue())) {
                int i11 = f56243j;
                int i12 = (i11 & 121) + (i11 | 121);
                f56244k = i12 % 128;
                int i13 = i12 % 2;
                int i14 = f56243j;
                i10 = ((i14 & 47) - (~(-(-(i14 | 47))))) - 1;
            }
            int i15 = f56243j;
            int i16 = ((i15 ^ 119) | (i15 & 119)) << 1;
            int i17 = -(((~i15) & 119) | (i15 & (-120)));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f56244k = i18 % 128;
            int i19 = i18 % 2;
            return vVar;
        }
        int i20 = f56243j;
        int i21 = i20 & 9;
        int i22 = (((i20 | 9) & (~i21)) - (~(i21 << 1))) - 1;
        f56244k = i22 % 128;
        byte[] bArr = null;
        if (i22 % 2 == 0) {
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            throw null;
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, setAnimation.setNavigationIcon()}, -1593889019, 1593889062, System.identityHashCode(gvVar));
        setMaxWidth setmaxwidth2 = (setMaxWidth) gv.setOnFocusChangeListener(new Object[]{gvVar}, -836208544, 836208569, System.identityHashCode(gvVar));
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
        if (getbeeponfailure == null) {
            int i23 = f56244k;
            int i24 = (((i23 | 64) << 1) - (i23 ^ 64)) - 1;
            f56243j = i24 % 128;
            int i25 = i24 % 2;
        } else {
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            int i26 = f56243j + 89;
            f56244k = i26 % 128;
            int i27 = i26 % 2;
        }
        setmaxwidth2.addAll((setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{bArr}, 800639242, -800639236, (int) System.currentTimeMillis()));
        int i28 = f56243j;
        i10 = ((i28 ^ 52) + ((i28 & 52) << 1)) - 1;
        f56244k = i10 % 128;
        int i29 = i10 % 2;
        int i110 = f56243j;
        int i111 = ((i110 ^ 119) | (i110 & 119)) << 1;
        int i112 = -(((~i110) & 119) | (i110 & (-120)));
        int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
        f56244k = i113 % 128;
        int i114 = i113 % 2;
        return vVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0232  */
    /* JADX WARN: Code duplicated, block: B:32:0x026f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0270  */
    /* JADX WARN: Code duplicated, block: B:35:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x033a  */
    /* JADX WARN: Code duplicated, block: B:40:0x039d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0420  */
    /* JADX WARN: Code duplicated, block: B:46:0x047f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0492  */
    /* JADX WARN: Code duplicated, block: B:49:0x049e  */
    /* JADX WARN: Code duplicated, block: B:53:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0505  */
    /* JADX WARN: Code duplicated, block: B:59:0x055e  */
    /* JADX WARN: Code duplicated, block: B:64:0x056e  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk compoundDrawableTintBlendMode;
        setMaxWidth setmaxwidth;
        int i13;
        int i14;
        gv onFocusChangeListener;
        TransactionFailed transactionFailed;
        int i15;
        gv onFocusChangeListener2;
        TransactionFailed transactionFailed2;
        setMaxWidth setmaxwidth2;
        boolean zBooleanValue;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        int i16;
        int i17;
        int i18 = ~i11;
        int i19 = ((i10 | i12 | i18) * (-676)) + (i11 * (-675)) + (i10 * 677);
        int i20 = ~(i18 | i10);
        int i21 = ~i12;
        switch ((((~(i10 | i11 | i12)) | (~((~i10) | i18)) | (~(i18 | i21))) * 676) + ((i20 | (~(i21 | i10))) * 676) + i19) {
            case 1:
                hu huVar = (hu) objArr[0];
                gv gvVar = (gv) objArr[1];
                setAnimation setanimation = setAnimation.INSTANCE;
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis())}, 42652451, -42652407, System.identityHashCode(gvVar));
                gv.setOnFocusChangeListener(new Object[]{gvVar, setFitsSystemWindows.setDividerPadding}, 68662447, -68662445, System.identityHashCode(gvVar));
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, setAnimation.TransactionErrorCause()}, 42652451, -42652407, System.identityHashCode(gvVar));
                gv.setOnFocusChangeListener(new Object[]{gvVar, Byte.valueOf(UByte.m5545constructorimpl((byte) 0))}, -73894317, 73894323, System.identityHashCode(gvVar));
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed pinPadConfiguration = setAnimation.getPinPadConfiguration();
                Boolean bool = Boolean.FALSE;
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{pinPadConfiguration}, 1914607362, -1914607356, System.identityHashCode(pinPadConfiguration)), new byte[]{0}, null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                byte b10 = ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -1664305091, 1664305098, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar)))[0];
                byte b11 = ((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 917752193, -917752105, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(gvVar)))[0];
                cu cuVar = new cu(gvVar);
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, new byte[0]}, 1069122946, -1069122918, System.identityHashCode(gvVar));
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
                byte[] bArr = (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{huVar.f56245f}, -811017857, 811017857, (int) System.currentTimeMillis());
                compoundDrawableTintBlendMode = null;
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                int i22 = f56243j;
                int i23 = (-2) - ((((i22 | 18) << 1) - (i22 ^ 18)) ^ (-1));
                f56244k = i23 % 128;
                int i24 = i23 % 2;
                return compoundDrawableTintBlendMode;
            case 2:
                a(objArr);
                return null;
            case 3:
                gv gvVar2 = (gv) objArr[0];
                v vVar = (v) objArr[1];
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                setAnimation setanimation2 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                if (getbeeponfailure3 != null) {
                    int i25 = f56244k;
                    int i26 = i25 & 109;
                    int i27 = (i25 ^ 109) | i26;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    f56243j = i28 % 128;
                    int i29 = i28 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                    setmaxwidth = (setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3)), 0}, 896036021, -896036014, 0);
                    int i30 = f56243j;
                    i13 = (i30 ^ 25) + ((i30 & 25) << 1);
                } else {
                    setmaxwidth = new setMaxWidth();
                    int i31 = f56243j;
                    i13 = ((i31 & 60) + (i31 | 60)) - 1;
                }
                f56244k = i13 % 128;
                int i32 = i13 % 2;
                Pair pair = new Pair(setmaxwidth, Boolean.valueOf(booleanRef.element));
                int i33 = f56244k;
                int i34 = ((i33 ^ 15) - (~((i33 & 15) << 1))) - 1;
                f56243j = i34 % 128;
                int i35 = i34 % 2;
                return pair;
            case 4:
                return d(objArr);
            case 5:
                c(objArr);
                return null;
            case 6:
                hu huVar2 = (hu) objArr[0];
                int i36 = f56244k;
                int i37 = (((i36 & (-18)) | ((~i36) & 17)) - (~((i36 & 17) << 1))) - 1;
                f56243j = i37 % 128;
                int i38 = i37 % 2;
                compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar2.setX(), huVar2.setOnFocusChangeListener(), huVar2.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 440);
                int i39 = f56243j;
                int i40 = (((i39 ^ 95) | (i39 & 95)) << 1) - (((~i39) & 95) | (i39 & (-96)));
                f56244k = i40 % 128;
                if (i40 % 2 == 0) {
                    throw null;
                }
                return compoundDrawableTintBlendMode;
            case 7:
                return b(objArr);
            case 8:
                hu huVar3 = (hu) objArr[0];
                a aVar = (a) objArr[1];
                int i41 = f56244k;
                int i42 = ((i41 & (-34)) | ((~i41) & 33)) + ((i41 & 33) << 1);
                f56243j = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 22 / 0;
                    if (((Boolean) setOnFocusChangeListener(new Object[]{aVar, huVar3.setOnFocusChangeListener()}, 1875771672, -1875771665, (int) System.currentTimeMillis())).booleanValue()) {
                        setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, 1982564785, -1982564775, (int) System.currentTimeMillis());
                        setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -1864661470, 1864661475, (int) System.currentTimeMillis());
                        onFocusChangeListener = huVar3.setOnFocusChangeListener();
                        setAnimation setanimation3 = setAnimation.INSTANCE;
                        transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                            int i44 = f56244k;
                            int i45 = i44 & 65;
                            int i46 = (i44 | 65) & (~i45);
                            int i47 = -(-(i45 << 1));
                            int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                            f56243j = i48 % 128;
                            int i49 = i48 % 2;
                            onFocusChangeListener2 = huVar3.setOnFocusChangeListener();
                            transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -578266812, 578266824, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                                compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setOnFocusChangeListener, null, null, false, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY);
                                i15 = f56243j + 5;
                            } else {
                                setOnFocusChangeListener(new Object[]{huVar3, huVar3.setOnFocusChangeListener()}, 1351837168, -1351837167, System.identityHashCode(huVar3));
                                v vVar2 = (v) setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -2108331601, 2108331605, (int) System.currentTimeMillis());
                                Pair pair2 = (Pair) setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener(), vVar2}, -271914173, 271914176, (int) System.currentTimeMillis());
                                setmaxwidth2 = (setMaxWidth) pair2.getFirst();
                                zBooleanValue = ((Boolean) pair2.getSecond()).booleanValue();
                                if (!zBooleanValue) {
                                    gv onFocusChangeListener3 = huVar3.setOnFocusChangeListener();
                                    gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener3, (TransactionFailed) setAnimation.setY(new Object[0], -177094674, 177094739, (int) System.currentTimeMillis()), setmaxwidth2}, 579017734, -579017711, System.identityHashCode(onFocusChangeListener3));
                                    huVar3.f56246g.setOnFocusChangeListener(new setTitleTextAppearance(huVar3.setOnFocusChangeListener().setDividerPadding(setAnimation.TransactionParameters())));
                                    int i50 = f56244k + 101;
                                    f56243j = i50 % 128;
                                    int i51 = i50 % 2;
                                }
                                setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -933889149, 933889158, (int) System.currentTimeMillis());
                                setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener(), vVar2}, -916340862, 916340864, (int) System.currentTimeMillis());
                                if (zBooleanValue) {
                                    int i52 = f56243j;
                                    int i53 = (i52 & 7) + (i52 | 7);
                                    f56244k = i53 % 128;
                                    int i54 = i53 % 2;
                                    gz.setCompoundDrawableTintBlendMode(new Object[]{huVar3.f56247h, huVar3.setOnFocusChangeListener()}, -253416445, 253416445, (int) System.currentTimeMillis());
                                    gv onFocusChangeListener4 = huVar3.setOnFocusChangeListener();
                                    getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener4));
                                    if (getbeeponfailure != null) {
                                        int i55 = f56244k;
                                        int i56 = i55 & 117;
                                        int i57 = (i55 ^ 117) | i56;
                                        i17 = (i56 ^ i57) + ((i57 & i56) << 1);
                                        f56243j = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                                            throw null;
                                        }
                                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                                    }
                                    gv onFocusChangeListener5 = huVar3.setOnFocusChangeListener();
                                    getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener5));
                                    if (getbeeponfailure2 != null) {
                                        i16 = f56244k + 89;
                                        f56243j = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                                            throw null;
                                        }
                                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                                        int i58 = f56243j;
                                        int i59 = i58 & 17;
                                        int i60 = -(-((i58 ^ 17) | i59));
                                        int i61 = (i59 & i60) + (i60 | i59);
                                        f56244k = i61 % 128;
                                        int i62 = i61 % 2;
                                    }
                                    gv onFocusChangeListener6 = huVar3.setOnFocusChangeListener();
                                    long jLongValue = ((Long) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener6}, 1910996851, -1910996837, System.identityHashCode(onFocusChangeListener6))).longValue();
                                    io ioVar = huVar3.f56248i;
                                    io.setOnFocusChangeListener(new Object[]{ioVar, Long.valueOf(jLongValue)}, 308640336, -308640335, System.identityHashCode(ioVar));
                                    compoundDrawableTintBlendMode = fk.setY;
                                    int i63 = f56244k;
                                    int i64 = i63 & 121;
                                    int i65 = (i64 - (~(-(-((i63 ^ 121) | i64))))) - 1;
                                    f56243j = i65 % 128;
                                    int i66 = i65 % 2;
                                } else {
                                    compoundDrawableTintBlendMode = fk.setDividerPadding;
                                    i15 = f56243j + 67;
                                }
                            }
                            f56244k = i15 % 128;
                            int i67 = i15 % 2;
                        } else {
                            compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setOnFocusChangeListener, null, null, false, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY);
                            i15 = f56243j + 5;
                            f56244k = i15 % 128;
                            int i68 = i15 % 2;
                        }
                    } else {
                        compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setNavigationOnClickListener, null, null, false, 464);
                        int i69 = f56243j;
                        int i70 = i69 & 19;
                        i14 = (((i69 ^ 19) | i70) << 1) - ((i69 | 19) & (~i70));
                        f56244k = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    }
                } else if (!((Boolean) setOnFocusChangeListener(new Object[]{aVar, huVar3.setOnFocusChangeListener()}, 1875771672, -1875771665, (int) System.currentTimeMillis())).booleanValue()) {
                    compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setNavigationOnClickListener, null, null, false, 464);
                    int i610 = f56243j;
                    int i71 = i610 & 19;
                    i14 = (((i610 ^ 19) | i71) << 1) - ((i610 | 19) & (~i71));
                    f56244k = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                } else {
                    setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, 1982564785, -1982564775, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -1864661470, 1864661475, (int) System.currentTimeMillis());
                    onFocusChangeListener = huVar3.setOnFocusChangeListener();
                    setAnimation setanimation4 = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        int i410 = f56244k;
                        int i411 = i410 & 65;
                        int i412 = (i410 | 65) & (~i411);
                        int i413 = -(-(i411 << 1));
                        int i414 = (i412 ^ i413) + ((i412 & i413) << 1);
                        f56243j = i414 % 128;
                        int i415 = i414 % 2;
                        onFocusChangeListener2 = huVar3.setOnFocusChangeListener();
                        transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
                        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -578266812, 578266824, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                            compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setOnFocusChangeListener, null, null, false, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY);
                            i15 = f56243j + 5;
                        } else {
                            setOnFocusChangeListener(new Object[]{huVar3, huVar3.setOnFocusChangeListener()}, 1351837168, -1351837167, System.identityHashCode(huVar3));
                            v vVar3 = (v) setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -2108331601, 2108331605, (int) System.currentTimeMillis());
                            Pair pair3 = (Pair) setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener(), vVar3}, -271914173, 271914176, (int) System.currentTimeMillis());
                            setmaxwidth2 = (setMaxWidth) pair3.getFirst();
                            zBooleanValue = ((Boolean) pair3.getSecond()).booleanValue();
                            if (!zBooleanValue) {
                                gv onFocusChangeListener7 = huVar3.setOnFocusChangeListener();
                                gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener7, (TransactionFailed) setAnimation.setY(new Object[0], -177094674, 177094739, (int) System.currentTimeMillis()), setmaxwidth2}, 579017734, -579017711, System.identityHashCode(onFocusChangeListener7));
                                huVar3.f56246g.setOnFocusChangeListener(new setTitleTextAppearance(huVar3.setOnFocusChangeListener().setDividerPadding(setAnimation.TransactionParameters())));
                                int i510 = f56244k + 101;
                                f56243j = i510 % 128;
                                int i511 = i510 % 2;
                            }
                            setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener()}, -933889149, 933889158, (int) System.currentTimeMillis());
                            setOnFocusChangeListener(new Object[]{huVar3.setOnFocusChangeListener(), vVar3}, -916340862, 916340864, (int) System.currentTimeMillis());
                            if (zBooleanValue) {
                                int i512 = f56243j;
                                int i513 = (i512 & 7) + (i512 | 7);
                                f56244k = i513 % 128;
                                int i514 = i513 % 2;
                                gz.setCompoundDrawableTintBlendMode(new Object[]{huVar3.f56247h, huVar3.setOnFocusChangeListener()}, -253416445, 253416445, (int) System.currentTimeMillis());
                                gv onFocusChangeListener8 = huVar3.setOnFocusChangeListener();
                                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener8));
                                if (getbeeponfailure != null) {
                                    int i515 = f56244k;
                                    int i516 = i515 & 117;
                                    int i517 = (i515 ^ 117) | i516;
                                    i17 = (i516 ^ i517) + ((i517 & i516) << 1);
                                    f56243j = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                                        throw null;
                                    }
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
                                }
                                gv onFocusChangeListener9 = huVar3.setOnFocusChangeListener();
                                getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, (TransactionFailed) setAnimation.setY(new Object[0], -515635215, 515635437, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener9));
                                if (getbeeponfailure2 != null) {
                                    i16 = f56244k + 89;
                                    f56243j = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                                        throw null;
                                    }
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -838244475, 838244486, System.identityHashCode(getbeeponfailure2));
                                    int i518 = f56243j;
                                    int i519 = i518 & 17;
                                    int i611 = -(-((i518 ^ 17) | i519));
                                    int i612 = (i519 & i611) + (i611 | i519);
                                    f56244k = i612 % 128;
                                    int i613 = i612 % 2;
                                }
                                gv onFocusChangeListener10 = huVar3.setOnFocusChangeListener();
                                long jLongValue2 = ((Long) gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener10}, 1910996851, -1910996837, System.identityHashCode(onFocusChangeListener10))).longValue();
                                io ioVar2 = huVar3.f56248i;
                                io.setOnFocusChangeListener(new Object[]{ioVar2, Long.valueOf(jLongValue2)}, 308640336, -308640335, System.identityHashCode(ioVar2));
                                compoundDrawableTintBlendMode = fk.setY;
                                int i614 = f56244k;
                                int i615 = i614 & 121;
                                int i616 = (i615 - (~(-(-((i614 ^ 121) | i615))))) - 1;
                                f56243j = i616 % 128;
                                int i617 = i616 % 2;
                            } else {
                                compoundDrawableTintBlendMode = fk.setDividerPadding;
                                i15 = f56243j + 67;
                            }
                        }
                        f56244k = i15 % 128;
                        int i618 = i15 % 2;
                    } else {
                        compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode(huVar3.setX(), huVar3.setOnFocusChangeListener(), huVar3.setCompoundDrawableTintBlendMode(), fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, setContentCaptureSession.setOnFocusChangeListener, null, null, false, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY);
                        i15 = f56243j + 5;
                        f56244k = i15 % 128;
                        int i619 = i15 % 2;
                    }
                }
                return compoundDrawableTintBlendMode;
            case 9:
                gv gvVar3 = (gv) objArr[0];
                int i72 = f56243j;
                int i73 = (i72 & 79) + (i72 | 79);
                f56244k = i73 % 128;
                if (i73 % 2 == 0) {
                    setAnimation setanimation5 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis());
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -1394735893, 1394735910, System.identityHashCode(gvVar3));
                    gv.setOnFocusChangeListener(new Object[]{gvVar3}, -1470087264, 1470087294, System.identityHashCode(gvVar3));
                    throw null;
                }
                setAnimation setanimation6 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 1645572272, -1645572135, (int) System.currentTimeMillis());
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -1394735893, 1394735910, System.identityHashCode(gvVar3));
                gv.setOnFocusChangeListener(new Object[]{gvVar3}, -1470087264, 1470087294, System.identityHashCode(gvVar3));
                int i74 = f56244k;
                int i75 = (i74 ^ 123) + ((i74 & 123) << 1);
                f56243j = i75 % 128;
                int i76 = i75 % 2;
                return null;
            case 10:
                gv gvVar4 = (gv) objArr[0];
                int i77 = f56243j + 43;
                f56244k = i77 % 128;
                if (i77 % 2 == 0) {
                    setAnimation setanimation7 = setAnimation.INSTANCE;
                    throw null;
                }
                setAnimation setanimation8 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar4));
                if (getbeeponfailure4 != null) {
                    int i78 = f56243j;
                    int i79 = ((i78 & 84) + (i78 | 84)) - 1;
                    f56244k = i79 % 128;
                    int i80 = i79 % 2;
                    byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4));
                    byte[] bArr3 = new byte[8];
                    int i81 = f56243j + 63;
                    f56244k = i81 % 128;
                    int i82 = i81 % 2;
                    int i83 = 0;
                    while (i83 < 8) {
                        int i84 = f56244k;
                        int i85 = (((i84 | 94) << 1) - (i84 ^ 94)) - 1;
                        f56243j = i85 % 128;
                        int i86 = i85 % 2;
                        bArr3[i83] = 0;
                        i83 = (-2) - ((i83 + 2) ^ (-1));
                        int i87 = i84 & 101;
                        int i88 = (i87 - (~(-(-((i84 ^ 101) | i87))))) - 1;
                        f56243j = i88 % 128;
                        int i89 = i88 % 2;
                    }
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                    gv.setOnFocusChangeListener(new Object[]{gvVar4, bArr3}, 345045286, -345045259, System.identityHashCode(gvVar4));
                    int i90 = f56244k;
                    int i91 = i90 & 29;
                    int i92 = i91 + ((i90 ^ 29) | i91);
                    f56243j = i92 % 128;
                    int i93 = i92 % 2;
                }
                int i94 = f56243j;
                int i95 = ((i94 ^ 126) + ((i94 & 126) << 1)) - 1;
                f56244k = i95 % 128;
                int i96 = i95 % 2;
                return null;
            default:
                throw new fh(32, null);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, -2049516330, 2049516330, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setOnFocusChangeListener(new Object[]{this}, 279501097, -279501091, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setOnFocusChangeListener(new Object[]{this, aVar}, -1020555013, 1020555021, System.identityHashCode(this));
    }
}
