package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/dz;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p0", "p1", "Lcom/mypinpad/tsdk/i/ew;", "p2", "Lcom/mypinpad/tsdk/i/a;", "p3", "Lcom/mypinpad/tsdk/i/component17;", "p4", "", "p5", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/a;Lcom/mypinpad/tsdk/i/component17;)Lcom/mypinpad/tsdk/i/fk;", "", "setX", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/component17;)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class dz {

    @NotNull
    public static final dz INSTANCE = new dz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55284a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55285b = 1;

    static {
        int i10 = f55285b + 27;
        f55284a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public static <T extends setScrollBarDefaultDelayBeforeFade> fk setDividerPadding(@NotNull setTextKeepState settextkeepstate, @NotNull T t10, @NotNull ew<T> ewVar, @NotNull a aVar, @NotNull component17 component17Var) {
        return (fk) setX(new Object[]{settextkeepstate, t10, ewVar, aVar, component17Var}, -191093209, 191093210, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:25:0x0211  */
    /* JADX WARN: Code duplicated, block: B:27:0x023c  */
    /* JADX WARN: Code duplicated, block: B:47:0x034f  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objA_;
        String str;
        TransactionFailed transactionFailed;
        getBeepOnFailure getbeeponfailure;
        int i13;
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        int i18 = (((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + (i11 * 971) + (i10 * (-1939));
        int i19 = -865402437;
        int i20 = 865402441;
        int i21 = 2;
        if (i18 == 1) {
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[0];
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            ew ewVar = (ew) objArr[2];
            a aVar = (a) objArr[3];
            component17 component17Var = (component17) objArr[4];
            int i22 = f55285b;
            int i23 = (((i22 | 14) << 1) - (i22 ^ 14)) - 1;
            f55284a = i23 % 128;
            if (i23 % 2 != 0) {
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(ewVar, "");
                Intrinsics.checkNotNullParameter(aVar, "");
                Intrinsics.checkNotNullParameter(component17Var, "");
                ((setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))).iterator();
                throw null;
            }
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(ewVar, "");
            Intrinsics.checkNotNullParameter(aVar, "");
            Intrinsics.checkNotNullParameter(component17Var, "");
            Iterator<getBeepOnFailure> it = ((setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))).iterator();
            int i24 = f55285b;
            int i25 = ((i24 ^ 88) + ((i24 & 88) << 1)) - 1;
            f55284a = i25 % 128;
            int i26 = i25 % 2;
            while (!(!it.hasNext())) {
                int i27 = f55285b + 47;
                f55284a = i27 % 128;
                if (i27 % i21 != 0) {
                    getBeepOnFailure next = it.next();
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)));
                    throw null;
                }
                getBeepOnFailure next2 = it.next();
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, i20, i19, System.identityHashCode(next2));
                String str3 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, next2}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    int i28 = f55284a + 51;
                    f55285b = i28 % 128;
                    int i29 = i28 % 2;
                } else if (!((Boolean) setX(new Object[]{next2, Boolean.FALSE}, 1723408278, -1723408275, (int) System.currentTimeMillis())).booleanValue()) {
                    int i30 = f55285b;
                    int i31 = ((i30 | 94) << 1) - (i30 ^ 94);
                    int i32 = (i31 ^ (-1)) + (i31 << 1);
                    f55284a = i32 % 128;
                    if (i32 % 2 != 0) {
                        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{31278, null, 96}, 1336485880, -1336485874, 31278);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20000, null, 6}, 1336485880, -1336485874, 20000);
                    }
                    objA_ = ewVar.a_(setscrollbardefaultdelaybeforefade, settextkeepstate);
                } else if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, next2}, 2094047793, -2094047756, (int) System.currentTimeMillis())).booleanValue()) {
                    int i33 = f55284a;
                    int i34 = (i33 & 3) + (i33 | 3);
                    f55285b = i34 % 128;
                    if (i34 % 2 == 0) {
                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{19179, null, 92}, 1336485880, -1336485874, 19179);
                    } else {
                        SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20001, null, 6}, 1336485880, -1336485874, 20001);
                    }
                    objA_ = ewVar.a_(setscrollbardefaultdelaybeforefade, settextkeepstate);
                }
                int i35 = f55284a + 33;
                f55285b = i35 % 128;
                int i36 = i35 % 2;
                i19 = -865402437;
                i20 = 865402441;
                i21 = 2;
            }
            Object[] objArr2 = new Object[i21];
            objArr2[0] = setscrollbardefaultdelaybeforefade;
            objArr2[1] = component17Var;
            setX(objArr2, 1266288380, -1266288380, (int) System.currentTimeMillis());
            objA_ = fk.setChildDivider;
            int i37 = f55285b;
            int i38 = i37 & 95;
            int i39 = i38 + ((i37 ^ 95) | i38);
            f55284a = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
        } else if (i18 == 2) {
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
            TransactionFailed transactionFailed4 = (TransactionFailed) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i40 = f55285b;
            int i41 = i40 ^ 71;
            int i42 = -(-((i40 & 71) << 1));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            f55284a = i43 % 128;
            int i44 = i43 % 2;
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, transactionFailed4}, -990392770, 990392791, System.identityHashCode(getbeeponfailure2));
            if (getbeeponfailure3 == null) {
                int i45 = f55284a;
                int i46 = ((i45 & 66) + (i45 | 66)) - 1;
                f55285b = i46 % 128;
                if (i46 % 2 == 0) {
                    throw null;
                }
                if (zBooleanValue) {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    objA_ = Boolean.FALSE;
                } else {
                    int i47 = i45 & 105;
                    int i48 = ((i45 ^ 105) | i47) << 1;
                    int i49 = -((i45 | 105) & (~i47));
                    int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                    f55285b = i50 % 128;
                    if (i50 % 2 == 0) {
                        throw null;
                    }
                    objA_ = Boolean.TRUE;
                }
            } else {
                if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -32940825, 32940851, System.identityHashCode(getbeeponfailure3))).booleanValue()) {
                    int i51 = f55285b;
                    int i52 = i51 & 107;
                    int i53 = i52 + ((i51 ^ 107) | i52);
                    f55284a = i53 % 128;
                    if (i53 % 2 != 0) {
                        ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 610902136, -610902111, System.identityHashCode(getbeeponfailure3))).booleanValue();
                        throw null;
                    }
                    if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 610902136, -610902111, System.identityHashCode(getbeeponfailure3))).booleanValue()) {
                        int i54 = f55284a;
                        int i55 = i54 & 55;
                        int i56 = (i55 - (~((i54 ^ 55) | i55))) - 1;
                        f55285b = i56 % 128;
                        int i57 = i56 % 2;
                        objA_ = Boolean.TRUE;
                    }
                }
                int i58 = f55284a;
                int i59 = (i58 ^ 105) + ((i58 & 105) << 1);
                f55285b = i59 % 128;
                int i60 = i59 % 2;
                objA_ = Boolean.FALSE;
            }
        } else {
            if (i18 != 3) {
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                component17 component17Var2 = (component17) objArr[1];
                int i61 = f55285b;
                int i62 = i61 & 11;
                int i63 = ((i61 | 11) & (~i62)) + (i62 << 1);
                f55284a = i63 % 128;
                if (i63 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                    Intrinsics.checkNotNullParameter(component17Var2, "");
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)), (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{component17Var2}, -811017857, 811017857, (int) System.currentTimeMillis()), null, Boolean.FALSE, 119}, -976227287, 976227290, 119)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                    return null;
                }
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                Intrinsics.checkNotNullParameter(component17Var2, "");
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation4 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6)), (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{component17Var2}, -811017857, 811017857, (int) System.currentTimeMillis()), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                return null;
            }
            objA_ = Boolean.FALSE;
            getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) objArr[0];
            ((Boolean) objArr[1]).booleanValue();
            int i64 = f55284a;
            int i65 = (((i64 & (-74)) | ((~i64) & 73)) - (~(-(-((i64 & 73) << 1))))) - 1;
            int i66 = i65 % 128;
            f55285b = i66;
            int i67 = i65 % 2;
            if (getbeeponfailure4 == null) {
                int i68 = ((i66 & 126) + (i66 | 126)) - 1;
                f55284a = i68 % 128;
                int i69 = i68 % 2;
                int i70 = (i66 ^ 85) + ((i66 & 85) << 1);
                f55284a = i70 % 128;
                int i71 = i70 % 2;
            } else {
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 865402441, -865402437, System.identityHashCode(getbeeponfailure4));
                if (setscrollcontainer3 == null) {
                    int i72 = f55284a;
                    int i73 = ((i72 | 125) << 1) - (i72 ^ 125);
                    f55285b = i73 % 128;
                    if (i73 % 2 == 0) {
                        throw null;
                    }
                    int i74 = i72 ^ 35;
                    int i75 = -(-((i72 & 35) << 1));
                    int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                    f55285b = i76 % 128;
                    int i77 = i76 % 2;
                } else {
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                    int i78 = f55285b;
                    int i79 = ((i78 ^ 81) - (~((i78 & 81) << 1))) - 1;
                    f55284a = i79 % 128;
                    int i80 = i79 % 2;
                }
                setAnimation setanimation5 = setAnimation.INSTANCE;
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure4));
                    if (getbeeponfailure != null) {
                        int i81 = f55284a;
                        i13 = ((i81 & 73) - (~(-(-(i81 | 73))))) - 1;
                        f55285b = i13 % 128;
                        if (i13 % 2 == 0 ? !((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue() : !((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                            int i82 = f55284a;
                            int i83 = i82 & 71;
                            int i84 = (i82 ^ 71) | i83;
                            int i85 = (i83 & i84) + (i83 | i84);
                            f55285b = i85 % 128;
                            int i86 = i85 % 2;
                            int i87 = (-2) - ((i82 + 84) ^ (-1));
                            f55285b = i87 % 128;
                            int i88 = i87 % 2;
                        } else {
                            int i89 = f55284a;
                            int i90 = (i89 & 67) + (i89 | 67);
                            f55285b = i90 % 128;
                            int i91 = i90 % 2;
                            int i92 = ((((i89 ^ 65) | (i89 & 65)) << 1) - (~(-(((~i89) & 65) | (i89 & (-66)))))) - 1;
                            f55285b = i92 % 128;
                            int i93 = i92 % 2;
                            if (!((Boolean) setX(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis()), objA_}, 1422263343, -1422263341, (int) System.currentTimeMillis())).booleanValue()) {
                                int i94 = f55285b;
                                int i95 = (i94 & 65) + (i94 | 65);
                                int i96 = i95 % 128;
                                f55284a = i96;
                                int i97 = i95 % 2;
                                int i98 = ((i96 | 115) << 1) - (i96 ^ 115);
                                f55285b = i98 % 128;
                                int i99 = i98 % 2;
                            } else if (!((Boolean) setX(new Object[]{getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis()), objA_}, 1422263343, -1422263341, (int) System.currentTimeMillis())).booleanValue()) {
                                int i100 = f55284a + 84;
                                int i101 = (i100 ^ (-1)) + (i100 << 1);
                                int i102 = i101 % 128;
                                f55285b = i102;
                                boolean z10 = i101 % 2 == 0;
                                int i103 = ((i102 | 73) << 1) - (i102 ^ 73);
                                f55284a = i103 % 128;
                                if (i103 % 2 != 0) {
                                    throw null;
                                }
                                objA_ = Boolean.valueOf(z10);
                            } else {
                                int i104 = f55284a;
                                int i105 = i104 & 103;
                                int i106 = (i104 ^ 103) | i105;
                                int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                                f55285b = i107 % 128;
                                int i108 = i107 % 2;
                                objA_ = Boolean.TRUE;
                            }
                        }
                    } else {
                        int i810 = f55284a;
                        int i811 = i810 & 71;
                        int i812 = (i810 ^ 71) | i811;
                        int i813 = (i811 & i812) + (i811 | i812);
                        f55285b = i813 % 128;
                        int i814 = i813 % 2;
                        int i815 = (-2) - ((i810 + 84) ^ (-1));
                        f55285b = i815 % 128;
                        int i816 = i815 % 2;
                    }
                } else {
                    int i109 = f55285b;
                    int i110 = i109 ^ 13;
                    int i111 = (((i109 & 13) | i110) << 1) - i110;
                    int i112 = i111 % 128;
                    f55284a = i112;
                    int i113 = i111 % 2;
                    int i114 = (i112 & 39) + (i112 | 39);
                    f55285b = i114 % 128;
                    int i115 = i114 % 2;
                }
            }
            str = null;
            setAnimation setanimation6 = setAnimation.INSTANCE;
            transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                int i1010 = f55285b;
                int i116 = i1010 ^ 13;
                int i117 = (((i1010 & 13) | i116) << 1) - i116;
                int i118 = i117 % 128;
                f55284a = i118;
                int i119 = i117 % 2;
                int i1110 = (i118 & 39) + (i118 | 39);
                f55285b = i1110 % 128;
                int i1111 = i1110 % 2;
            } else {
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, -990392770, 990392791, System.identityHashCode(getbeeponfailure4));
                if (getbeeponfailure != null) {
                    int i817 = f55284a;
                    i13 = ((i817 & 73) - (~(-(-(i817 | 73))))) - 1;
                    f55285b = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i818 = f55284a;
                        int i819 = i818 & 71;
                        int i8110 = (i818 ^ 71) | i819;
                        int i8111 = (i819 & i8110) + (i819 | i8110);
                        f55285b = i8111 % 128;
                        int i8112 = i8111 % 2;
                        int i8113 = (-2) - ((i818 + 84) ^ (-1));
                        f55285b = i8113 % 128;
                        int i8114 = i8113 % 2;
                    } else {
                        int i8115 = f55284a;
                        int i8116 = i8115 & 71;
                        int i8117 = (i8115 ^ 71) | i8116;
                        int i8118 = (i8116 & i8117) + (i8116 | i8117);
                        f55285b = i8118 % 128;
                        int i8119 = i8118 % 2;
                        int i81110 = (-2) - ((i8115 + 84) ^ (-1));
                        f55285b = i81110 % 128;
                        int i81111 = i81110 % 2;
                    }
                } else {
                    int i81112 = f55284a;
                    int i81113 = i81112 & 71;
                    int i81114 = (i81112 ^ 71) | i81113;
                    int i81115 = (i81113 & i81114) + (i81113 | i81114);
                    f55285b = i81115 % 128;
                    int i81116 = i81115 % 2;
                    int i81117 = (-2) - ((i81112 + 84) ^ (-1));
                    f55285b = i81117 % 128;
                    int i81118 = i81117 % 2;
                }
            }
        }
        return objA_;
    }

    public static void setX(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull component17 p10) throws Exception {
        setX(new Object[]{p4, p10}, 1266288380, -1266288380, (int) System.currentTimeMillis());
    }
}
