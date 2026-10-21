package com.mypinpad.tsdk.isolation;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class hq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56218d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56219e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final gv f56220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final getValue f56222c;

    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f56223t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f56224u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public hq f56225p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f56226q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f56228s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            Object[] objArr = {this, obj};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            Object obj2 = objArr[1];
            int i10 = f56224u0 + 79;
            f56223t0 = i10 % 128;
            int i11 = i10 % 2;
            aVar.f56226q0 = obj2;
            int i12 = aVar.f56228s0;
            if (i11 != 0) {
                int i13 = i12 & Integer.MIN_VALUE;
                int i14 = (i12 | Integer.MIN_VALUE) & (~i13);
                aVar.f56228s0 = (i14 & i13) | (i14 ^ i13);
                hq hqVar = hq.this;
                hq.setDividerPadding(new Object[]{hqVar, aVar}, -1586206821, 1586206822, System.identityHashCode(hqVar));
                throw null;
            }
            int i15 = (Integer.MAX_VALUE & i12) | ((~i12) & Integer.MIN_VALUE);
            int i16 = i12 & Integer.MIN_VALUE;
            aVar.f56228s0 = (i16 & i15) | (i15 ^ i16);
            hq hqVar2 = hq.this;
            Object dividerPadding = hq.setDividerPadding(new Object[]{hqVar2, aVar}, -1586206821, 1586206822, System.identityHashCode(hqVar2));
            int i17 = f56223t0;
            int i18 = i17 & 11;
            int i19 = (i17 ^ 11) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f56224u0 = i20 % 128;
            if (i20 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }
    }

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[setTextLocales.values().length];
            iArr[setTextLocales.setY.ordinal()] = 1;
            iArr[setTextLocales.setCompoundDrawableTintBlendMode.ordinal()] = 2;
            setDividerPadding = iArr;
            int[] iArr2 = new int[setRotationY.values().length];
            iArr2[setRotationY.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr2[setRotationY.setDividerPadding.ordinal()] = 2;
            setOnFocusChangeListener = iArr2;
            int i10 = (0 - (-83)) - 2;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    public hq(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull getValue getvalue) {
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56220a = gvVar;
        this.f56221b = settextkeepstate;
        this.f56222c = getvalue;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x05e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x0603  */
    /* JADX WARN: Code duplicated, block: B:115:0x0609  */
    /* JADX WARN: Code duplicated, block: B:43:0x0257 A[PHI: r0 r1
      0x0257: PHI (r0v93 com.mypinpad.tsdk.i.getBeepOnFailure) = (r0v92 com.mypinpad.tsdk.i.getBeepOnFailure), (r0v101 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:42:0x0255, B:39:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r1v144 byte[]) = (r1v143 byte[]), (r1v148 byte[]) binds: [B:42:0x0255, B:39:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x04d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x050d  */
    /* JADX WARN: Code duplicated, block: B:84:0x052c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0547  */
    /* JADX WARN: Code duplicated, block: B:88:0x0563  */
    /* JADX WARN: Code duplicated, block: B:90:0x056e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0585  */
    /* JADX WARN: Code duplicated, block: B:99:0x059a  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        a aVar;
        hq hqVar;
        com.mypinpad.tsdk.isolation.a aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        setRotationX setrotationx;
        int i18;
        int i19;
        int i20;
        byte[] bArrSliceArray;
        getBeepOnFailure getbeeponfailure;
        int i21 = ~i12;
        int i22 = ~i11;
        int i23 = (((~(i10 | i11 | i12)) | (~(i21 | i22)) | (~((~i10) | i22))) * 757) + ((~(i22 | i10 | i12)) * 1514) + ((i10 | i21) * (-757)) + (i11 * (-756)) + (i10 * 758);
        if (i23 != 1) {
            if (i23 != 2) {
                if (i23 == 3) {
                    int i24 = f56218d;
                    int i25 = ((i24 | 81) << 1) - (i24 ^ 81);
                    f56219e = i25 % 128;
                    int i26 = i25 % 2;
                    fk fkVar = fk.setX;
                    int i27 = f56219e;
                    int i28 = i27 & 103;
                    int i29 = (i28 - (~(-(-((i27 ^ 103) | i28))))) - 1;
                    f56218d = i29 % 128;
                    if (i29 % 2 == 0) {
                        return fkVar;
                    }
                    throw null;
                }
                if (i23 != 4) {
                    hq hqVar2 = (hq) objArr[0];
                    Continuation continuation = (Continuation) objArr[1];
                    int i30 = f56219e;
                    int i31 = ((i30 | 19) << 1) - (i30 ^ 19);
                    f56218d = i31 % 128;
                    if (i31 % 2 == 0) {
                        return setDividerPadding(new Object[]{hqVar2, continuation}, -1586206821, 1586206822, System.identityHashCode(hqVar2));
                    }
                    setDividerPadding(new Object[]{hqVar2, continuation}, -1586206821, 1586206822, System.identityHashCode(hqVar2));
                    throw null;
                }
                hq hqVar3 = (hq) objArr[0];
                Continuation continuation2 = (Continuation) objArr[1];
                int i32 = f56219e;
                int i33 = i32 | 111;
                int i34 = ((i33 << 1) - (~(-((~(i32 & 111)) & i33)))) - 1;
                f56218d = i34 % 128;
                int i35 = i34 % 2;
                Object dividerPadding = setDividerPadding(new Object[]{hqVar3, continuation2}, -1586206821, 1586206822, System.identityHashCode(hqVar3));
                int i36 = f56218d;
                int i37 = (i36 & (-90)) | ((~i36) & 89);
                int i38 = -(-((i36 & 89) << 1));
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                f56219e = i39 % 128;
                int i40 = i39 % 2;
                return dividerPadding;
            }
            hq hqVar4 = (hq) objArr[0];
            setRotationX setrotationx2 = (setRotationX) objArr[1];
            int i41 = f56218d;
            int i42 = i41 | 107;
            int i43 = i42 << 1;
            int i44 = -((~(i41 & 107)) & i42);
            int i45 = (i43 & i44) + (i44 | i43);
            f56219e = i45 % 128;
            if (i45 % 2 == 0) {
                ((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue();
                throw null;
            }
            if (!((Boolean) setRotationX.setX(new Object[]{setrotationx2}, -268504199, 268504206, System.identityHashCode(setrotationx2))).booleanValue()) {
                fk fkVar2 = fk.setX;
                int i46 = f56218d;
                int i47 = (i46 & (-72)) | ((~i46) & 71);
                int i48 = -(-((i46 & 71) << 1));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                f56219e = i49 % 128;
                int i50 = i49 % 2;
                return fkVar2;
            }
            if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2))).length == 9) {
                int i51 = f56219e;
                int i52 = ((i51 | 36) << 1) - (i51 ^ 36);
                int i53 = (i52 ^ (-1)) + (i52 << 1);
                f56218d = i53 % 128;
                int i54 = i53 % 2;
                if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[0] == -97) {
                    int i55 = f56219e;
                    int i56 = (i55 | 41) << 1;
                    int i57 = -(i55 ^ 41);
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f56218d = i58 % 128;
                    if (i58 % 2 == 0 ? ((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[1] == 80 : ((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[0] == 95) {
                        int i59 = f56219e + 113;
                        f56218d = i59 % 128;
                        int i60 = i59 % 2;
                        if (((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)))[2] == 6) {
                            int i61 = f56219e;
                            int i62 = (((i61 & (-62)) | ((~i61) & 61)) - (~((i61 & 61) << 1))) - 1;
                            f56218d = i62 % 128;
                            if (i62 % 2 != 0) {
                                bArrSliceArray = ArraysKt___ArraysKt.sliceArray((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)), c.until(2, 17));
                                gv gvVar = hqVar4.f56220a;
                                setAnimation setanimation = setAnimation.INSTANCE;
                                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
                                if (getbeeponfailure != null) {
                                    int i63 = f56219e;
                                    int i64 = (-2) - ((((i63 | 110) << 1) - (i63 ^ 110)) ^ (-1));
                                    f56218d = i64 % 128;
                                    int i65 = i64 % 2;
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, bArrSliceArray}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                                    int i66 = f56218d + 101;
                                    f56219e = i66 % 128;
                                    int i67 = i66 % 2;
                                }
                            } else {
                                bArrSliceArray = ArraysKt___ArraysKt.sliceArray((byte[]) setRotationX.setX(new Object[]{setrotationx2}, -1008183286, 1008183296, System.identityHashCode(setrotationx2)), c.until(3, 9));
                                gv gvVar2 = hqVar4.f56220a;
                                setAnimation setanimation2 = setAnimation.INSTANCE;
                                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
                                if (getbeeponfailure != null) {
                                    int i68 = f56219e;
                                    int i69 = (-2) - ((((i68 | 110) << 1) - (i68 ^ 110)) ^ (-1));
                                    f56218d = i69 % 128;
                                    int i610 = i69 % 2;
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, bArrSliceArray}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure));
                                    int i611 = f56218d + 101;
                                    f56219e = i611 % 128;
                                    int i612 = i611 % 2;
                                }
                            }
                        }
                    }
                }
            }
            fk fkVar3 = fk.setX;
            int i70 = f56219e;
            int i71 = (-2) - (((i70 & 112) + (i70 | 112)) ^ (-1));
            f56218d = i71 % 128;
            int i72 = i71 % 2;
            return fkVar3;
        }
        hq hqVar5 = (hq) objArr[0];
        Continuation continuation3 = (Continuation) objArr[1];
        int i73 = f56219e;
        int i74 = ((i73 & 18) + (i73 | 18)) - 1;
        f56218d = i74 % 128;
        if (i74 % 2 != 0) {
            boolean z10 = continuation3 instanceof a;
            throw null;
        }
        if (!(continuation3 instanceof a) || (i20 = (i19 = (aVar = (a) continuation3).f56228s0) & Integer.MIN_VALUE) == 0) {
            aVar = hqVar5.new a(continuation3);
            int i75 = f56218d;
            int i76 = (i75 & (-94)) | ((~i75) & 93);
            int i77 = -(-((i75 & 93) << 1));
            int i78 = (i76 & i77) + (i77 | i76);
            f56219e = i78 % 128;
            int i79 = i78 % 2;
        } else {
            int i80 = i73 ^ 17;
            int i81 = (i73 & 17) << 1;
            int i82 = ((i80 | i81) << 1) - (i80 ^ i81);
            f56218d = i82 % 128;
            int i83 = i82 % 2;
            int iIdentityHashCode = System.identityHashCode(hqVar5);
            int i84 = Integer.MAX_VALUE - (~(-(-(i19 * (-1187)))));
            int i85 = ~i19;
            int i86 = (Integer.MAX_VALUE & i85) | i20;
            int i87 = Integer.MAX_VALUE & i19;
            int i88 = ~((i86 ^ i87) | (i86 & i87));
            int i89 = ~iIdentityHashCode;
            int i90 = i89 ^ i19;
            int i91 = i89 & i19;
            int i92 = ~((i90 ^ i91) | (i90 & i91));
            int i93 = (~i92) & i88;
            int i94 = ~i88;
            int i95 = i93 | (i92 & i94);
            int i96 = i92 & i88;
            int i97 = -(-(((i95 ^ i96) | (i96 & i95)) * (-1188)));
            int i98 = i84 & i97;
            int i99 = -(-((i97 ^ i84) | i98));
            int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
            int i101 = i85 & iIdentityHashCode;
            int i102 = (~i101) & (i85 | iIdentityHashCode);
            int i103 = ~((i102 ^ i101) | (i101 & i102));
            int i104 = (i94 & i103) | ((~i103) & i88);
            int i105 = i103 & i88;
            int i106 = (i105 & i104) | (i104 ^ i105);
            int i107 = ~(i89 | Integer.MIN_VALUE);
            int i108 = ((~i107) & i106) | ((~i106) & i107);
            int i109 = i106 & i107;
            int i110 = -(-(((i109 & i108) | (i108 ^ i109)) * 594));
            int i111 = ((i100 ^ i110) | (i100 & i110)) << 1;
            int i112 = -((i110 & (~i100)) | ((~i110) & i100));
            int i113 = (i111 & i112) + (i112 | i111);
            int i114 = (i85 | i19) & i85;
            int i115 = (i89 | iIdentityHashCode) & i89;
            int i116 = i114 & i115;
            int i117 = (i115 | i114) & (~i116);
            int i118 = ~((i117 & i116) | (i117 ^ i116));
            int i119 = (i114 & Integer.MAX_VALUE) | ((~i114) & Integer.MIN_VALUE);
            int i120 = i114 & Integer.MIN_VALUE;
            int i121 = ~((i120 & i119) | (i119 ^ i120));
            int i122 = i118 ^ i121;
            int i123 = i121 & i118;
            int i124 = (i123 & i122) | (i122 ^ i123);
            int i125 = (i89 & Integer.MAX_VALUE) | ((~i89) & Integer.MIN_VALUE);
            int i126 = i89 & Integer.MIN_VALUE;
            int i127 = ~((i125 & i126) | (i125 ^ i126));
            int i128 = i124 & i127;
            int i129 = (i124 | i127) & (~i128);
            int i130 = ((i129 & i128) | (i129 ^ i128)) * 594;
            int i131 = i113 & i130;
            int i132 = -(-((i130 ^ i113) | i131));
            aVar.f56228s0 = (i131 ^ i132) + ((i132 & i131) << 1);
            int i133 = f56219e;
            int i134 = (i133 ^ 28) + ((i133 & 28) << 1);
            int i135 = (i134 ^ (-1)) + (i134 << 1);
            f56218d = i135 % 128;
            int i136 = i135 % 2;
        }
        Object compoundDrawableTintBlendMode = aVar.f56226q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i137 = aVar.f56228s0;
        if (i137 == 0) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            setTextKeepState settextkeepstate = hqVar5.f56221b;
            if (((Boolean) setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate}, 11951396, -11951391, System.identityHashCode(settextkeepstate))).booleanValue()) {
                int i138 = f56218d;
                int i139 = i138 & 17;
                int i140 = (i138 | 17) & (~i139);
                int i141 = i139 << 1;
                int i142 = (i140 & i141) + (i140 | i141);
                f56219e = i142 % 128;
                int i143 = i142 % 2;
                aVar.f56225p0 = hqVar5;
                aVar.f56228s0 = 1;
                setTextKeepState settextkeepstate2 = hqVar5.f56221b;
                compoundDrawableTintBlendMode = setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2, aVar}, -1083100835, 1083100838, System.identityHashCode(settextkeepstate2));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i144 = f56218d;
                    int i145 = (((i144 | 56) << 1) - (i144 ^ 56)) - 1;
                    int i146 = i145 % 128;
                    f56219e = i146;
                    int i147 = i145 % 2;
                    int i148 = (i146 ^ 119) + ((i146 & 119) << 1);
                    f56218d = i148 % 128;
                    int i149 = i148 % 2;
                } else {
                    aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode;
                    i13 = setY.setDividerPadding[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
                    if (i13 != 1) {
                        aVar.f56225p0 = null;
                        aVar.f56228s0 = 2;
                        compoundDrawableTintBlendMode = setDividerPadding(new Object[]{hqVar5, aVar}, -124001354, 124001354, System.identityHashCode(hqVar5));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i150 = f56218d;
                            i14 = i150 + 37;
                            f56219e = i14 % 128;
                            if (i14 % 2 == 0) {
                                int i151 = 65 / 0;
                            }
                            int i152 = (i150 ^ 108) + ((i150 & 108) << 1);
                            i15 = (i152 ^ (-1)) + (i152 << 1);
                            f56219e = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                        }
                        int i153 = f56218d;
                        int i154 = i153 & 123;
                        int i155 = (i153 ^ 123) | i154;
                        i17 = (i154 & i155) + (i155 | i154);
                        f56219e = i17 % 128;
                        if (i17 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        if (i13 == 2) {
                            throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                        }
                        aVar.f56225p0 = null;
                        aVar.f56228s0 = 3;
                        compoundDrawableTintBlendMode = setDividerPadding(new Object[]{hqVar5, aVar}, 2067408989, -2067408985, System.identityHashCode(hqVar5));
                        if (compoundDrawableTintBlendMode == coroutine_suspended) {
                            int i156 = f56218d;
                            int i157 = (i156 & 117) + (i156 | 117);
                            int i158 = i157 % 128;
                            f56219e = i158;
                            int i159 = i157 % 2;
                            int i160 = i158 & 39;
                            i16 = (i160 - (~(-(-((i158 ^ 39) | i160))))) - 1;
                            f56218d = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i161 = 70 / 0;
                            }
                        }
                        int i162 = f56219e;
                        int i163 = (i162 | 67) << 1;
                        int i164 = -(((~i162) & 67) | (i162 & (-68)));
                        int i165 = (i163 ^ i164) + ((i164 & i163) << 1);
                        f56218d = i165 % 128;
                        int i166 = i165 % 2;
                    }
                }
            } else {
                aVar.f56225p0 = hqVar5;
                aVar.f56228s0 = 4;
                compoundDrawableTintBlendMode = hqVar5.f56222c.setCompoundDrawableTintBlendMode(aVar);
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i167 = f56219e;
                    int i168 = i167 & 83;
                    int i169 = -(-((i167 ^ 83) | i168));
                    int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                    f56218d = i170 % 128;
                    if (i170 % 2 != 0) {
                        throw null;
                    }
                } else {
                    hqVar = hqVar5;
                    setrotationx = (setRotationX) compoundDrawableTintBlendMode;
                    i18 = setY.setOnFocusChangeListener[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
                    if (i18 != 1) {
                        fk fkVar4 = (fk) setDividerPadding(new Object[]{hqVar, setrotationx}, 1963668713, -1963668711, System.identityHashCode(hqVar));
                        int i171 = f56219e;
                        int i172 = i171 & 1;
                        int i173 = i172 + ((i171 ^ 1) | i172);
                        f56218d = i173 % 128;
                        int i174 = i173 % 2;
                        return fkVar4;
                    }
                    if (i18 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    compoundDrawableTintBlendMode = (fk) setDividerPadding(new Object[0], 1041662750, -1041662747, (int) System.currentTimeMillis());
                    System.identityHashCode(hqVar5);
                    System.identityHashCode(hqVar5);
                }
            }
            return coroutine_suspended;
        }
        if (i137 == 1) {
            hqVar5 = aVar.f56225p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i175 = f56218d + 99;
            f56219e = i175 % 128;
            int i176 = i175 % 2;
            aVar2 = (com.mypinpad.tsdk.isolation.a) compoundDrawableTintBlendMode;
            i13 = setY.setDividerPadding[((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).ordinal()];
            if (i13 != 1) {
                aVar.f56225p0 = null;
                aVar.f56228s0 = 2;
                compoundDrawableTintBlendMode = setDividerPadding(new Object[]{hqVar5, aVar}, -124001354, 124001354, System.identityHashCode(hqVar5));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i1510 = f56218d;
                    i14 = i1510 + 37;
                    f56219e = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i1511 = 65 / 0;
                    }
                    int i1512 = (i1510 ^ 108) + ((i1510 & 108) << 1);
                    i15 = (i1512 ^ (-1)) + (i1512 << 1);
                    f56219e = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                }
                int i1513 = f56218d;
                int i1514 = i1513 & 123;
                int i1515 = (i1513 ^ 123) | i1514;
                i17 = (i1514 & i1515) + (i1515 | i1514);
                f56219e = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
            } else {
                if (i13 == 2) {
                    throw new fh(32, ((setTextLocales) com.mypinpad.tsdk.isolation.a.setX(new Object[]{aVar2}, -298445589, 298445592, System.identityHashCode(aVar2))).toString());
                }
                aVar.f56225p0 = null;
                aVar.f56228s0 = 3;
                compoundDrawableTintBlendMode = setDividerPadding(new Object[]{hqVar5, aVar}, 2067408989, -2067408985, System.identityHashCode(hqVar5));
                if (compoundDrawableTintBlendMode == coroutine_suspended) {
                    int i1516 = f56218d;
                    int i1517 = (i1516 & 117) + (i1516 | 117);
                    int i1518 = i1517 % 128;
                    f56219e = i1518;
                    int i1519 = i1517 % 2;
                    int i1610 = i1518 & 39;
                    i16 = (i1610 - (~(-(-((i1518 ^ 39) | i1610))))) - 1;
                    f56218d = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i1611 = 70 / 0;
                    }
                }
                int i1612 = f56219e;
                int i1613 = (i1612 | 67) << 1;
                int i1614 = -(((~i1612) & 67) | (i1612 & (-68)));
                int i1615 = (i1613 ^ i1614) + ((i1614 & i1613) << 1);
                f56218d = i1615 % 128;
                int i1616 = i1615 % 2;
            }
            return coroutine_suspended;
        }
        if (i137 == 2) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i177 = f56218d;
            int i178 = i177 & 111;
            int i179 = -(-((i177 ^ 111) | i178));
            int i180 = ((i178 | i179) << 1) - (i179 ^ i178);
            f56219e = i180 % 128;
            int i181 = i180 % 2;
            int i15110 = f56218d;
            int i15111 = i15110 & 123;
            int i15112 = (i15110 ^ 123) | i15111;
            i17 = (i15111 & i15112) + (i15112 | i15111);
            f56219e = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        } else if (i137 == 3) {
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i182 = f56219e;
            int i183 = i182 ^ 117;
            int i184 = ((i182 & 117) | i183) << 1;
            int i185 = -i183;
            int i186 = ((i184 | i185) << 1) - (i184 ^ i185);
            f56218d = i186 % 128;
            int i187 = i186 % 2;
            int i1617 = f56219e;
            int i1618 = (i1617 | 67) << 1;
            int i1619 = -(((~i1617) & 67) | (i1617 & (-68)));
            int i16110 = (i1618 ^ i1619) + ((i1619 & i1618) << 1);
            f56218d = i16110 % 128;
            int i16111 = i16110 % 2;
        } else {
            if (i137 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hqVar = aVar.f56225p0;
            ResultKt.throwOnFailure(compoundDrawableTintBlendMode);
            int i188 = f56218d;
            int i189 = i188 & 29;
            int i190 = ((i188 ^ 29) | i189) << 1;
            int i191 = -((i188 | 29) & (~i189));
            int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
            f56219e = i192 % 128;
            int i193 = i192 % 2;
            setrotationx = (setRotationX) compoundDrawableTintBlendMode;
            i18 = setY.setOnFocusChangeListener[((setRotationY) setRotationX.setX(new Object[]{setrotationx}, 1897018363, -1897018360, System.identityHashCode(setrotationx))).ordinal()];
            if (i18 != 1) {
                fk fkVar5 = (fk) setDividerPadding(new Object[]{hqVar, setrotationx}, 1963668713, -1963668711, System.identityHashCode(hqVar));
                int i1710 = f56219e;
                int i1711 = i1710 & 1;
                int i1712 = i1711 + ((i1710 ^ 1) | i1711);
                f56218d = i1712 % 128;
                int i1713 = i1712 % 2;
                return fkVar5;
            }
            if (i18 == 2) {
                throw new NoWhenBranchMatchedException();
            }
            compoundDrawableTintBlendMode = (fk) setDividerPadding(new Object[0], 1041662750, -1041662747, (int) System.currentTimeMillis());
            System.identityHashCode(hqVar5);
            System.identityHashCode(hqVar5);
        }
        return compoundDrawableTintBlendMode;
    }

    @Nullable
    public final Object setOnFocusChangeListener(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, -1586206821, 1586206822, System.identityHashCode(this));
    }
}
