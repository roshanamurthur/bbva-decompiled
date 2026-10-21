package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class li extends kx {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56943n = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final component10 f56946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final setY f56947l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/bz;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/bz;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<bz, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56948p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56949q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56950r0 = 1;

        static {
            int i10 = f56950r0;
            int i11 = (((i10 | 34) << 1) - (i10 ^ 34)) - 1;
            f56949q0 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 19 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
            int i14 = (~i12) | i10;
            if ((((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i15 = f56949q0;
                int i16 = ((i15 ^ 7) | (i15 & 7)) << 1;
                int i17 = -(((~i15) & 7) | (i15 & (-8)));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f56950r0 = i18 % 128;
                int i19 = i18 % 2;
                a(new Object[]{aVar, (bz) obj}, -313834707, 313834708, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i20 = f56949q0;
                int i21 = ((((i20 ^ 11) | (i20 & 11)) << 1) - (~(-(((~i20) & 11) | (i20 & (-12)))))) - 1;
                f56950r0 = i21 % 128;
                int i22 = i21 % 2;
                return unit;
            }
            bz bzVar = (bz) objArr[1];
            int i23 = f56949q0;
            int i24 = i23 & 91;
            int i25 = (i23 | 91) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            f56950r0 = i27 % 128;
            int i28 = i27 % 2;
            Intrinsics.checkNotNullParameter(bzVar, "");
            bz.setY(new Object[]{bzVar, Byte.valueOf(by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC.setDividerPadding())}, 881254746, -881254746, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, cb.ALWAYS}, -478987183, 478987185, System.identityHashCode(bzVar));
            bz.setY(new Object[]{bzVar, ce.setX}, 2141338749, -2141338746, System.identityHashCode(bzVar));
            int i29 = f56950r0;
            int i30 = (i29 ^ 17) + ((i29 & 17) << 1);
            f56949q0 = i30 % 128;
            if (i30 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bz bzVar) {
            return a(new Object[]{this, bzVar}, -811064858, 811064858, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56951r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f56952s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setRotationX f56954q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(setRotationX setrotationx) {
            super(1);
            this.f56954q0 = setrotationx;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x00ee  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            Unit unit;
            boolean z10;
            int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = (~(i14 | i15)) | (~(i15 | i12));
            int i17 = ~(i11 | (~i12) | i10);
            if ((((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13 == 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i18 = f56952s0;
                int i19 = (i18 & 50) + (i18 | 50);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f56951r0 = i20 % 128;
                int i21 = i20 % 2;
                a(new Object[]{bVar, (cv) obj}, 2134731943, -2134731943, System.identityHashCode(bVar));
                Unit unit2 = Unit.INSTANCE;
                int i22 = f56952s0;
                int i23 = (i22 & (-46)) | ((~i22) & 45);
                int i24 = -(-((i22 & 45) << 1));
                int i25 = (i23 & i24) + (i24 | i23);
                f56951r0 = i25 % 128;
                if (i25 % 2 == 0) {
                    return unit2;
                }
                int i26 = 57 / 0;
                return unit2;
            }
            b bVar2 = (b) objArr[0];
            cv cvVar = (cv) objArr[1];
            int i27 = f56951r0;
            int i28 = i27 ^ 23;
            int i29 = ((i27 & 23) | i28) << 1;
            int i30 = -i28;
            int i31 = (i29 & i30) + (i29 | i30);
            f56952s0 = i31 % 128;
            int i32 = i31 % 2;
            Intrinsics.checkNotNullParameter(cvVar, "");
            if (((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 166123252, -166123234, System.identityHashCode(cvVar))).booleanValue()) {
                unit = null;
                int i33 = f56951r0;
                int i34 = (((i33 & (-90)) | ((~i33) & 89)) - (~((i33 & 89) << 1))) - 1;
                f56952s0 = i34 % 128;
                int i35 = i34 % 2;
                z10 = true;
            } else {
                int i36 = f56952s0 + 103;
                f56951r0 = i36 % 128;
                if (i36 % 2 != 0) {
                    du duVar = du.INSTANCE;
                    ((Boolean) du.setOnFocusChangeListener(new Object[]{(kz) li.setDividerPadding(new Object[]{li.this}, 86710320, -86710315, (int) System.currentTimeMillis()), (byte[]) du.setOnFocusChangeListener(new Object[]{(kz) li.setDividerPadding(new Object[]{li.this}, 86710320, -86710315, (int) System.currentTimeMillis()), bVar2.f56954q0}, 895823171, -895823170, (int) System.currentTimeMillis())}, -597819605, 597819611, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                du duVar2 = du.INSTANCE;
                if (((Boolean) du.setOnFocusChangeListener(new Object[]{(kz) li.setDividerPadding(new Object[]{li.this}, 86710320, -86710315, (int) System.currentTimeMillis()), (byte[]) du.setOnFocusChangeListener(new Object[]{(kz) li.setDividerPadding(new Object[]{li.this}, 86710320, -86710315, (int) System.currentTimeMillis()), bVar2.f56954q0}, 895823171, -895823170, (int) System.currentTimeMillis())}, -597819605, 597819611, (int) System.currentTimeMillis())).booleanValue()) {
                    int i37 = f56951r0;
                    int i38 = ((i37 ^ 23) | (i37 & 23)) << 1;
                    int i39 = -(((~i37) & 23) | (i37 & (-24)));
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    f56952s0 = i40 % 128;
                    int i41 = i40 % 2;
                    z10 = false;
                    unit = null;
                } else {
                    unit = null;
                    int i310 = f56951r0;
                    int i311 = (((i310 & (-90)) | ((~i310) & 89)) - (~((i310 & 89) << 1))) - 1;
                    f56952s0 = i311 % 128;
                    int i312 = i311 % 2;
                    z10 = true;
                }
            }
            cv.setDividerPadding(new Object[]{cvVar, Boolean.valueOf(z10)}, -2106531481, 2106531485, System.identityHashCode(cvVar));
            int i42 = f56951r0;
            int i43 = ((i42 | 53) << 1) - (i42 ^ 53);
            f56952s0 = i43 % 128;
            int i44 = i43 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1059697268, 1059697269, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[cb.valuesCustom().length];
            iArr[cb.IF_MANUAL_CASH.ordinal()] = 1;
            iArr[cb.IF_NOT_UNATTENDED_CASH_AND_NOT_MANUAL_CASH_AND_NOT_PURCHASE_WITH_CASHBACK.ordinal()] = 2;
            setDividerPadding = iArr;
            int[] iArr2 = new int[setFitsSystemWindows.values().length];
            iArr2[setFitsSystemWindows.setOnFocusChangeListener.ordinal()] = 1;
            iArr2[setFitsSystemWindows.setDividerPadding.ordinal()] = 2;
            iArr2[setFitsSystemWindows.setX.ordinal()] = 3;
            iArr2[setFitsSystemWindows.setCompoundDrawableTintBlendMode.ordinal()] = 4;
            setY = iArr2;
            int i10 = (1 - (-95)) - 2;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                int i12 = 2 / 0;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull component10 component10Var) {
        super(kzVar, settextkeepstate, ljVar, getvalue);
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        this.f56944i = setcontentdescription;
        this.f56945j = setfontfeaturesettings;
        this.f56946k = component10Var;
        this.f56947l = new setY();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x075d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0794  */
    /* JADX WARN: Code duplicated, block: B:121:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:137:0x0887  */
    /* JADX WARN: Code duplicated, block: B:139:0x0892  */
    /* JADX WARN: Code duplicated, block: B:140:0x0896  */
    /* JADX WARN: Code duplicated, block: B:157:0x096d  */
    /* JADX WARN: Code duplicated, block: B:159:0x097e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0983  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r6v25, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r6v48, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r6v72, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r6v87, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        Object obj;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = ~(i19 | i20);
        int i22 = ~i12;
        int i23 = (~(i19 | i22)) | i21 | (~(i20 | i22));
        int i24 = i10 | i11;
        int i25 = ((i23 | (~(i24 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i26 = i10 | (~(i12 | i20));
        int i27 = ~(i11 | i22);
        int i28 = ((i27 | (~i24)) * 84) + ((i26 | i27) * (-84)) + i25;
        if (i28 == 1) {
            kz kzVar = (kz) objArr[0];
            TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
            int i29 = m;
            int i30 = i29 & 63;
            int i31 = i29 | 63;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f56943n = i32 % 128;
            int i33 = i32 % 2;
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(kzVar))).booleanValue()) {
                int i34 = m;
                int i35 = (i34 ^ 77) + ((i34 & 77) << 1);
                f56943n = i35 % 128;
                if (i35 % 2 == 0) {
                    ((Boolean) setDividerPadding(new Object[]{(getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar, transactionFailed}, 1431838387, -1431838363, System.identityHashCode(kzVar))}, 1683447174, -1683447172, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!((Boolean) setDividerPadding(new Object[]{(getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar, transactionFailed}, 1431838387, -1431838363, System.identityHashCode(kzVar))}, 1683447174, -1683447172, (int) System.currentTimeMillis())).booleanValue()) {
                    int i36 = m;
                    i13 = (((i36 | 52) << 1) - (i36 ^ 52)) - 1;
                    f56943n = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                } else {
                    int i37 = m;
                    int i38 = i37 ^ 81;
                    int i39 = ((i37 & 81) | i38) << 1;
                    int i40 = -i38;
                    int i41 = (i39 & i40) + (i39 | i40);
                    int i42 = i41 % 128;
                    f56943n = i42;
                    int i43 = i41 % 2;
                    int i44 = (i42 ^ 74) + ((i42 & 74) << 1);
                    int i45 = (i44 ^ (-1)) + (i44 << 1);
                    m = i45 % 128;
                    int i46 = i45 % 2;
                    obj = Boolean.TRUE;
                }
            } else {
                int i310 = m;
                i13 = (((i310 | 52) << 1) - (i310 ^ 52)) - 1;
                f56943n = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                obj = Boolean.FALSE;
            }
        } else if (i28 == 2) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            int i47 = m + 27;
            f56943n = i47 % 128;
            int i48 = i47 % 2;
            if (!(!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 610902136, -610902111, System.identityHashCode(getbeeponfailure))).booleanValue())) {
                int i49 = m;
                int i50 = i49 & 23;
                int i51 = i50 + ((i49 ^ 23) | i50);
                f56943n = i51 % 128;
                if (i51 % 2 == 0) {
                    ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue();
                    throw null;
                }
                if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                    i14 = m + 115;
                    f56943n = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    obj = Boolean.FALSE;
                } else {
                    int i52 = f56943n;
                    int i53 = (-2) - (((i52 & 74) + (i52 | 74)) ^ (-1));
                    m = i53 % 128;
                    if (i53 % 2 != 0) {
                        throw null;
                    }
                    obj = Boolean.TRUE;
                }
            } else {
                i14 = m + 115;
                f56943n = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                obj = Boolean.FALSE;
            }
        } else {
            if (i28 != 3) {
                if (i28 == 4) {
                    kz kzVar2 = (kz) objArr[0];
                    cb cbVar = (cb) objArr[1];
                    int i54 = m;
                    int i55 = i54 & 37;
                    int i56 = ((i54 ^ 37) | i55) << 1;
                    int i57 = -((i54 | 37) & (~i55));
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f56943n = i58 % 128;
                    if (i58 % 2 == 0) {
                        ((Boolean) setDividerPadding(new Object[]{kzVar2, cbVar}, 1168972006, -1168972006, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{kzVar2, cbVar}, 1168972006, -1168972006, (int) System.currentTimeMillis())).booleanValue();
                    int i59 = f56943n;
                    int i60 = ((i59 | 47) << 1) - (i59 ^ 47);
                    m = i60 % 128;
                    if (i60 % 2 == 0) {
                        return Boolean.valueOf(zBooleanValue);
                    }
                    throw null;
                }
                if (i28 == 5) {
                    li liVar = (li) objArr[0];
                    int i61 = m;
                    int i62 = i61 & 43;
                    int i63 = -(-((i61 ^ 43) | i62));
                    int i64 = (i62 & i63) + (i63 | i62);
                    f56943n = i64 % 128;
                    if (i64 % 2 == 0) {
                        throw null;
                    }
                    kz kzVar3 = (kz) liVar.setOnFocusChangeListener();
                    int i65 = m;
                    int i66 = i65 ^ 11;
                    int i67 = (((i65 & 11) | i66) << 1) - i66;
                    f56943n = i67 % 128;
                    int i68 = i67 % 2;
                    return kzVar3;
                }
                kz kzVar4 = (kz) objArr[0];
                Boolean bool = Boolean.TRUE;
                cb cbVar2 = (cb) objArr[1];
                de deVar = new de(kzVar4);
                dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
                md mdVar = (md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar));
                int i69 = setCompoundDrawableTintBlendMode.setDividerPadding[cbVar2.ordinal()];
                if (i69 != 1) {
                    if (i69 != 2) {
                        int i70 = f56943n;
                        int i71 = i70 & 57;
                        int i72 = -(-(i70 | 57));
                        int i73 = (i71 & i72) + (i72 | i71);
                        m = i73 % 128;
                        int i74 = i73 % 2;
                    } else {
                        if (mdVar != md.setDividerPadding) {
                            int i75 = m;
                            int i76 = (i75 ^ 21) + ((i75 & 21) << 1);
                            f56943n = i76 % 128;
                            int i77 = i76 % 2;
                            if (mdVar != md.setY) {
                                int i78 = f56943n;
                                int i79 = i78 | 7;
                                int i80 = ((i79 << 1) - (~(-(i79 & (~(i78 & 7)))))) - 1;
                                m = i80 % 128;
                                int i81 = i80 % 2;
                                int i82 = i78 & 83;
                                int i83 = ((i78 | 83) & (~i82)) + (i82 << 1);
                                m = i83 % 128;
                                if (i83 % 2 == 0) {
                                    return bool;
                                }
                                i18 = 91;
                                int i84 = i18 / 0;
                                return bool;
                            }
                        }
                        int i85 = f56943n;
                        i17 = ((i85 | 41) << 1) - (i85 ^ 41);
                        m = i17 % 128;
                        int i86 = i17 % 2;
                    }
                } else {
                    if (mdVar == md.setDividerPadding) {
                        int i87 = m;
                        int i88 = ((i87 ^ 119) | (i87 & 119)) << 1;
                        int i89 = -((i87 & (-120)) | ((~i87) & 119));
                        int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                        f56943n = i90 % 128;
                        int i91 = i90 % 2;
                        int i92 = i87 & 49;
                        int i93 = (i87 ^ 49) | i92;
                        int i94 = (i92 & i93) + (i93 | i92);
                        f56943n = i94 % 128;
                        if (i94 % 2 != 0) {
                            return bool;
                        }
                        i18 = 76;
                        int i810 = i18 / 0;
                        return bool;
                    }
                    int i95 = m;
                    i17 = ((i95 & 14) + (i95 | 14)) - 1;
                    f56943n = i17 % 128;
                    int i811 = i17 % 2;
                }
                return Boolean.FALSE;
            }
            li liVar2 = (li) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i96 = f56943n + 87;
            m = i96 % 128;
            int i97 = i96 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            kz kzVar5 = (kz) liVar2.setOnFocusChangeListener();
            kz.setOnFocusChangeListener(new Object[]{kzVar5}, -487101006, 487101013, System.identityHashCode(kzVar5));
            dx dxVar = dx.INSTANCE;
            Object onFocusChangeListener = liVar2.setOnFocusChangeListener();
            setTextKeepState compoundDrawableTintBlendMode = liVar2.setCompoundDrawableTintBlendMode();
            ew ewVar = (ew) liVar2.setX();
            kz kzVar6 = (kz) liVar2.setOnFocusChangeListener();
            fk fkVar = (fk) dx.setY(new Object[]{dxVar, onFocusChangeListener, compoundDrawableTintBlendMode, setrotationx, ewVar, (ds) kz.setOnFocusChangeListener(new Object[]{kzVar6}, -1080464866, 1080464872, System.identityHashCode(kzVar6))}, -25863307, 25863307, System.identityHashCode(dxVar));
            if (fkVar != null) {
                int i98 = f56943n;
                int i99 = i98 & 81;
                int i100 = (i98 ^ 81) | i99;
                int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                m = i101 % 128;
                if (i101 % 2 != 0) {
                    int i102 = 41 / 0;
                }
                int i103 = i98 + 49;
                m = i103 % 128;
                if (i103 % 2 == 0) {
                    return fkVar;
                }
                throw null;
            }
            kz kzVar7 = (kz) liVar2.setOnFocusChangeListener();
            setAnimation setanimation = setAnimation.INSTANCE;
            if (!((Boolean) setDividerPadding(new Object[]{kzVar7, (TransactionFailed) setAnimation.setY(new Object[0], 1747217893, -1747217749, (int) System.currentTimeMillis())}, 1839614900, -1839614899, (int) System.currentTimeMillis())).booleanValue()) {
                int i104 = f56943n;
                int i105 = ((i104 ^ 119) - (~(-(-((i104 & 119) << 1))))) - 1;
                m = i105 % 128;
                int i106 = i105 % 2;
                lj ljVar = (lj) liVar2.setX();
                obj = (fk) lj.setY(new Object[]{ljVar, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -217066977, 217066991, System.identityHashCode(ljVar));
                int i107 = f56943n;
                int i108 = i107 & 79;
                i16 = (i108 - (~((i107 ^ 79) | i108))) - 1;
            } else if (((Boolean) kz.setOnFocusChangeListener(new Object[]{(kz) liVar2.setOnFocusChangeListener(), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis()), 2}, 1229051272, -1229051267, 2)).booleanValue()) {
                bd bdVar = new bd((setScrollBarDefaultDelayBeforeFade) liVar2.setOnFocusChangeListener());
                bb bbVar = (bb) ((setImageTintList) w.setX(new Object[]{bdVar}, 1693919772, -1693919769, System.identityHashCode(bdVar)));
                int i109 = setCompoundDrawableTintBlendMode.setY[((setFitsSystemWindows) bb.setOnFocusChangeListener(new Object[]{bbVar}, -1171807076, 1171807076, System.identityHashCode(bbVar))).ordinal()];
                if (i109 != 1) {
                    if (i109 == 2) {
                        int i110 = m;
                        int i111 = i110 & 101;
                        int i112 = ((i110 ^ 101) | i111) << 1;
                        int i113 = -((i110 | 101) & (~i111));
                        int i114 = ((i112 | i113) << 1) - (i113 ^ i112);
                        f56943n = i114 % 128;
                        int i115 = i114 % 2;
                    } else if (i109 == 3) {
                        kz kzVar8 = (kz) liVar2.setOnFocusChangeListener();
                        if (((ds) kz.setOnFocusChangeListener(new Object[]{kzVar8}, -1080464866, 1080464872, System.identityHashCode(kzVar8))) != ds.setY) {
                            int i116 = m;
                            int i117 = i116 & 77;
                            int i118 = (((i116 ^ 77) | i117) << 1) - ((i116 | 77) & (~i117));
                            f56943n = i118 % 128;
                            int i119 = i118 % 2;
                            if (!((Boolean) kz.setOnFocusChangeListener(new Object[]{(kz) liVar2.setOnFocusChangeListener(), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), 8}, 1229051272, -1229051267, 8)).booleanValue()) {
                                int i120 = m;
                                int i121 = (((i120 | 118) << 1) - (i120 ^ 118)) - 1;
                                f56943n = i121 % 128;
                                if (i121 % 2 == 0) {
                                    lj ljVar2 = (lj) liVar2.setX();
                                    throw null;
                                }
                                lj ljVar3 = (lj) liVar2.setX();
                                obj = (fk) lj.setY(new Object[]{ljVar3, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -217066977, 217066991, System.identityHashCode(ljVar3));
                            }
                        }
                        int i122 = m;
                        int i123 = ((i122 ^ 80) + ((i122 & 80) << 1)) - 1;
                        f56943n = i123 % 128;
                        int i124 = i123 % 2;
                    } else {
                        if (i109 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lj ljVar4 = (lj) liVar2.setX();
                        obj = (fk) lj.setY(new Object[]{ljVar4, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, 1034894913, -1034894900, System.identityHashCode(ljVar4));
                        int i125 = f56943n;
                        int i126 = i125 ^ 115;
                        int i127 = ((i125 & 115) | i126) << 1;
                        int i128 = -i126;
                        int i129 = ((i127 | i128) << 1) - (i127 ^ i128);
                        m = i129 % 128;
                        int i130 = i129 % 2;
                    }
                    obj = null;
                } else {
                    de deVar2 = new de(liVar2.setOnFocusChangeListener());
                    dd ddVar2 = (dd) ((setImageTintList) w.setX(new Object[]{deVar2}, 1693919772, -1693919769, System.identityHashCode(deVar2)));
                    if (((md) dd.setDividerPadding(new Object[]{ddVar2}, -2041109093, 2041109093, System.identityHashCode(ddVar2))) == md.setNavigationOnClickListener) {
                        lh lhVar = new lh((kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode(), (lj) liVar2.setX());
                        obj = (fk) lh.setOnFocusChangeListener(new Object[]{lhVar, fd.ONLINE_REQUEST}, 1529335352, -1529335352, System.identityHashCode(lhVar));
                        int i131 = f56943n;
                        int i132 = (i131 ^ 7) + ((i131 & 7) << 1);
                        m = i132 % 128;
                        int i133 = i132 % 2;
                    } else {
                        lj ljVar5 = (lj) liVar2.setX();
                        obj = (fk) lj.setY(new Object[]{ljVar5, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -217066977, 217066991, System.identityHashCode(ljVar5));
                        int i134 = m;
                        int i135 = i134 ^ 43;
                        int i136 = (((i134 & 43) | i135) << 1) - i135;
                        f56943n = i136 % 128;
                        int i137 = i136 % 2;
                    }
                }
                if (obj != null) {
                    int i138 = f56943n;
                    int i139 = i138 & 43;
                    int i140 = (i139 - (~((i138 ^ 43) | i139))) - 1;
                    m = i140 % 128;
                    int i141 = i140 % 2;
                    int i142 = (-2) - (((i138 & 72) + (i138 | 72)) ^ (-1));
                    m = i142 % 128;
                    if (i142 % 2 != 0) {
                        throw null;
                    }
                } else {
                    kz kzVar9 = (kz) liVar2.setOnFocusChangeListener();
                    if (((ds) kz.setOnFocusChangeListener(new Object[]{kzVar9}, -1080464866, 1080464872, System.identityHashCode(kzVar9))) == ds.setY) {
                        cz czVar = new cz(liVar2.setOnFocusChangeListener());
                        int i143 = f56943n;
                        int i144 = i143 & 97;
                        int i145 = (i143 ^ 97) | i144;
                        int i146 = (i144 & i145) + (i145 | i144);
                        m = i146 % 128;
                        int i147 = i146 % 2;
                    }
                    ee eeVar = ee.setDividerPadding;
                    ee.setOnFocusChangeListener(new Object[]{liVar2.setOnFocusChangeListener(), liVar2.f56944i}, -1171320731, 1171320749, (int) System.currentTimeMillis());
                    cs csVar = new cs((setScrollBarDefaultDelayBeforeFade) liVar2.setOnFocusChangeListener());
                    cr crVar = (cr) ((setImageTintList) w.setX(new Object[]{csVar}, 1693919772, -1693919769, System.identityHashCode(csVar)));
                    lb lbVar = new lb((kz) liVar2.setOnFocusChangeListener());
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{lbVar}, 252497730, -252497710, System.identityHashCode(lbVar))).length > 9) {
                        int i148 = m;
                        int i149 = (-2) - (((i148 & 88) + (i148 | 88)) ^ (-1));
                        f56943n = i149 % 128;
                        if (i149 % 2 == 0) {
                            la laVar = (la) ((setImageTintList) w.setX(new Object[]{lbVar}, 1693919772, -1693919769, System.identityHashCode(lbVar)));
                            ((Boolean) la.setOnFocusChangeListener(new Object[]{laVar}, 609695293, -609695293, System.identityHashCode(laVar))).booleanValue();
                            throw null;
                        }
                        la laVar2 = (la) ((setImageTintList) w.setX(new Object[]{lbVar}, 1693919772, -1693919769, System.identityHashCode(lbVar)));
                        if (((Boolean) la.setOnFocusChangeListener(new Object[]{laVar2}, 609695293, -609695293, System.identityHashCode(laVar2))).booleanValue()) {
                            int i150 = f56943n;
                            int i151 = (i150 & 101) + (i150 | 101);
                            m = i151 % 128;
                            int i152 = i151 % 2;
                            z10 = true;
                        } else {
                            int i153 = m;
                            int i154 = i153 & 57;
                            int i155 = -(-((i153 ^ 57) | i154));
                            int i156 = (i154 & i155) + (i155 | i154);
                            f56943n = i156 % 128;
                            int i157 = i156 % 2;
                            z10 = false;
                        }
                    } else {
                        int i158 = m;
                        int i159 = i158 & 57;
                        int i1510 = -(-((i158 ^ 57) | i159));
                        int i1511 = (i159 & i1510) + (i1510 | i159);
                        f56943n = i1511 % 128;
                        int i1512 = i1511 % 2;
                        z10 = false;
                    }
                    if (!(!((Boolean) cr.setDividerPadding(new Object[]{crVar}, 1108158449, -1108158440, System.identityHashCode(crVar))).booleanValue())) {
                        int i160 = m;
                        int i161 = i160 & 49;
                        int i162 = ((i160 ^ 49) | i161) << 1;
                        int i163 = -((i160 | 49) & (~i161));
                        int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                        f56943n = i164 % 128;
                        if (i164 % 2 == 0) {
                            throw null;
                        }
                        if (z10) {
                            kz kzVar10 = (kz) liVar2.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar10, setTransitionVisibility.setDividerPadding}, -1167051031, 1167051073, System.identityHashCode(kzVar10));
                            bs bsVar = new bs(liVar2.setOnFocusChangeListener());
                            int i165 = m;
                            int i166 = i165 & 55;
                            int i167 = (i165 ^ 55) | i166;
                            int i168 = (i166 ^ i167) + ((i167 & i166) << 1);
                            f56943n = i168 % 128;
                            int i169 = i168 % 2;
                        } else {
                            ee eeVar2 = ee.setDividerPadding;
                            obj = (fk) ee.setOnFocusChangeListener(new Object[]{eeVar2, liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode(), (ew) liVar2.setX(), Boolean.TRUE, liVar2.f56947l}, 241380943, -241380940, System.identityHashCode(eeVar2));
                            if (obj != null) {
                                int i170 = m;
                                int i171 = ((i170 & (-124)) | ((~i170) & 123)) + ((i170 & 123) << 1);
                                int i172 = i171 % 128;
                                f56943n = i172;
                                int i173 = i171 % 2;
                                i15 = ((i172 & 104) + (i172 | 104)) - 1;
                                m = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i174 = 69 / 0;
                                }
                            }
                        }
                        ee.setOnFocusChangeListener(new Object[]{liVar2.setOnFocusChangeListener(), liVar2.f56946k, liVar2.f56945j, Boolean.FALSE}, 844101167, -844101167, (int) System.currentTimeMillis());
                        lj ljVar6 = (lj) liVar2.setX();
                        lj.setY(new Object[]{ljVar6, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -824146023, 824146039, System.identityHashCode(ljVar6));
                        obj = fk.setZ;
                        System.identityHashCode(liVar2);
                        System.identityHashCode(liVar2);
                    } else {
                        ee eeVar3 = ee.setDividerPadding;
                        obj = (fk) ee.setOnFocusChangeListener(new Object[]{eeVar3, liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode(), (ew) liVar2.setX(), Boolean.TRUE, liVar2.f56947l}, 241380943, -241380940, System.identityHashCode(eeVar3));
                        if (obj != null) {
                            int i175 = m;
                            int i176 = ((i175 & (-124)) | ((~i175) & 123)) + ((i175 & 123) << 1);
                            int i177 = i176 % 128;
                            f56943n = i177;
                            int i178 = i176 % 2;
                            i15 = ((i177 & 104) + (i177 | 104)) - 1;
                            m = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i179 = 69 / 0;
                            }
                        } else {
                            ee.setOnFocusChangeListener(new Object[]{liVar2.setOnFocusChangeListener(), liVar2.f56946k, liVar2.f56945j, Boolean.FALSE}, 844101167, -844101167, (int) System.currentTimeMillis());
                            lj ljVar7 = (lj) liVar2.setX();
                            lj.setY(new Object[]{ljVar7, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -824146023, 824146039, System.identityHashCode(ljVar7));
                            obj = fk.setZ;
                            System.identityHashCode(liVar2);
                            System.identityHashCode(liVar2);
                        }
                    }
                }
            } else {
                int i180 = f56943n;
                int i181 = i180 & 105;
                int i182 = i181 + ((i180 ^ 105) | i181);
                m = i182 % 128;
                if (i182 % 2 != 0) {
                    lj ljVar8 = (lj) liVar2.setX();
                    throw null;
                }
                lj ljVar9 = (lj) liVar2.setX();
                obj = (fk) lj.setY(new Object[]{ljVar9, (kz) liVar2.setOnFocusChangeListener(), liVar2.setCompoundDrawableTintBlendMode()}, -217066977, 217066991, System.identityHashCode(ljVar9));
                int i183 = f56943n;
                int i184 = i183 & 47;
                i16 = i184 + ((i183 ^ 47) | i184);
            }
            m = i16 % 128;
            int i185 = i16 % 2;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1534547577, 1534547580, System.identityHashCode(this));
    }

    public static final class setY extends ed {

        public /* synthetic */ class setCompoundDrawableTintBlendMode {
            public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

            static {
                int[] iArr = new int[cb.valuesCustom().length];
                iArr[cb.IF_MANUAL_CASH.ordinal()] = 1;
                iArr[cb.IF_NOT_UNATTENDED_CASH_AND_NOT_MANUAL_CASH_AND_NOT_PURCHASE_WITH_CASHBACK.ordinal()] = 2;
                setCompoundDrawableTintBlendMode = iArr;
                int i10 = (1 & 105) + (1 | 105);
                int i11 = i10 % 128;
                int i12 = i10 % 2;
            }
        }

        public setY() {
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            boolean zBooleanValue;
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i15 = ~i12;
            int i16 = ~(i15 | i11);
            int i17 = ~(i10 | i11);
            int i18 = i13 | (~i11);
            if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 == 1) {
                setY sety = (setY) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                ca caVar = (ca) objArr[2];
                long jLongValue = ((Number) objArr[3]).longValue();
                long jLongValue2 = ((Number) objArr[4]).longValue();
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(caVar, "");
                int i19 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[((cb) ca.setOnFocusChangeListener(new Object[]{caVar}, 115119597, -115119594, System.identityHashCode(caVar))).ordinal()];
                if (i19 == 1 || i19 == 2) {
                    li liVar = li.this;
                    zBooleanValue = ((Boolean) li.setDividerPadding(new Object[]{(kz) setscrollbardefaultdelaybeforefade, (cb) ca.setOnFocusChangeListener(new Object[]{caVar}, 115119597, -115119594, System.identityHashCode(caVar))}, -983204695, 983204699, (int) System.currentTimeMillis())).booleanValue();
                } else {
                    zBooleanValue = super.setX(setscrollbardefaultdelaybeforefade, caVar, jLongValue, jLongValue2);
                }
                return Boolean.valueOf(zBooleanValue);
            }
            setY sety2 = (setY) objArr[0];
            Intrinsics.checkNotNullParameter((setScrollBarDefaultDelayBeforeFade) objArr[1], "");
            int iIdentityHashCode = System.identityHashCode(sety2);
            int i20 = 814088977 & iIdentityHashCode;
            int i21 = (814088977 | iIdentityHashCode) & (~i20);
            int i22 = ~((i21 & i20) | (i21 ^ i20));
            int i23 = (-1908910942) ^ i22;
            int i24 = i22 & (-1908910942);
            int i25 = ((i24 & i23) | (i23 ^ i24)) * 104;
            int i26 = (-596459207) ^ i25;
            int i27 = -(-((i25 & (-596459207)) << 1));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = ~iIdentityHashCode;
            int i30 = (i29 | iIdentityHashCode) & i29;
            int i31 = (i30 & 1640344140) | ((~i30) & (-1640344141));
            int i32 = i30 & (-1640344141);
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = (i33 & (-814088978)) | (i33 ^ (-814088978));
            int i35 = ~i34;
            int i36 = (((i34 | i35) & i35) * (-104)) + i28;
            int i37 = ((iIdentityHashCode & (-1640344141)) | (i29 & (-1640344141)) | (iIdentityHashCode & 1640344140)) * 104;
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            int iIdentityHashCode2 = System.identityHashCode(sety2);
            int i39 = ~iIdentityHashCode2;
            int i40 = ((-528320417) & i39) | ((~i39) & 528320416);
            int i41 = i39 & 528320416;
            int i42 = (i40 & i41) | (i40 ^ i41);
            int i43 = ~i42;
            int i44 = (i42 | i43) & i43;
            int i45 = 536881225 & i44;
            int i46 = (i44 | 536881225) & (~i45);
            int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * (-108)));
            int i48 = ((~i47) & (-824894257)) | (824894256 & i47);
            int i49 = -(-((i47 & (-824894257)) << 1));
            int i50 = (i48 & i49) + (i49 | i48);
            int i51 = ((-622373706) & i39) | (iIdentityHashCode2 & 622373705);
            int i52 = (-622373706) & iIdentityHashCode2;
            int i53 = ~((i52 & i51) | (i51 ^ i52));
            int i54 = ((-442827937) & i53) | ((~i53) & 442827936);
            int i55 = i53 & 442827936;
            int i56 = (i55 & i54) | (i54 ^ i55);
            int i57 = (i39 & 622373705) | (i39 ^ 622373705);
            int i58 = ~i57;
            int i59 = (i57 | i58) & i58;
            int i60 = i56 ^ i59;
            int i61 = i59 & i56;
            int i62 = -(-(((i61 & i60) | (i60 ^ i61)) * 54));
            int i63 = i50 & i62;
            int i64 = -(-(i62 | i50));
            int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
            int i66 = iIdentityHashCode2 & 442827936;
            int i67 = (iIdentityHashCode2 | 442827936) & (~i66);
            int i68 = ((i67 & i66) | (i67 ^ i66)) * 54;
            int i69 = ((~i68) & i65) | ((~i65) & i68);
            int i70 = (i68 & i65) << 1;
            if (i38 <= (i69 ^ i70) + ((i70 & i69) << 1)) {
                int i71 = 63 / 0;
            }
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.ed, com.mypinpad.tsdk.isolation.eg
        public final boolean setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull ca caVar, long j10, long j11) {
            return ((Boolean) setX(new Object[]{this, setscrollbardefaultdelaybeforefade, caVar, Long.valueOf(j10), Long.valueOf(j11)}, 1689850354, -1689850353, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.ed, com.mypinpad.tsdk.isolation.eg
        public final void setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
            setX(new Object[]{this, setscrollbardefaultdelaybeforefade}, -1231724549, 1231724549, System.identityHashCode(this));
        }
    }

    public static final /* synthetic */ kz setDividerPadding(li liVar) {
        return (kz) setDividerPadding(new Object[]{liVar}, 86710320, -86710315, (int) System.currentTimeMillis());
    }
}
