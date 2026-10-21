package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class js {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56688b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56689c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56690a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56691p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56692q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56693r0 = 1;

        static {
            int i10 = f56693r0;
            int i11 = ((i10 | 59) << 1) - (i10 ^ 59);
            f56692q0 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
            int i12 = ~i10;
            if (((i10 | i11) * 624) + ((i12 | i11) * 624) + (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623)) == 1) {
                cv cvVar = (cv) objArr[1];
                int i13 = f56692q0;
                int i14 = i13 & 37;
                int i15 = ((i13 ^ 37) | i14) << 1;
                int i16 = -((i13 | 37) & (~i14));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                f56693r0 = i17 % 128;
                if (i17 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                } else {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                }
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i18 = f56693r0;
            int i19 = i18 & 57;
            int i20 = (i18 ^ 57) | i19;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f56692q0 = i21 % 128;
            int i22 = i21 % 2;
            System.identityHashCode(aVar);
            a(new Object[]{aVar, (cv) obj}, 781172674, -781172673);
            Unit unit = Unit.INSTANCE;
            int i23 = f56693r0;
            int i24 = (i23 & 91) + (i23 | 91);
            f56692q0 = i24 % 128;
            int i25 = i24 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            Object[] objArr = {this, cvVar};
            System.identityHashCode(this);
            return a(objArr, 758681468, -758681468);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f56694p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56695q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56696r0 = 1;

        static {
            int i10 = f56695q0;
            int i11 = (((i10 | 82) << 1) - (i10 ^ 82)) - 1;
            f56696r0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-448)) + (i10 * 450);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            if ((((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13 == 1) {
                cv cvVar = (cv) objArr[1];
                int i16 = f56695q0 + 29;
                f56696r0 = i16 % 128;
                if (i16 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                } else {
                    Intrinsics.checkNotNullParameter(cvVar, "");
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                }
                return null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i17 = f56696r0;
            int i18 = i17 & 49;
            int i19 = -(-(i17 | 49));
            int i20 = (i18 & i19) + (i19 | i18);
            f56695q0 = i20 % 128;
            int i21 = i20 % 2;
            a(new Object[]{bVar, (cv) obj}, 1279354967, -1279354966, System.identityHashCode(bVar));
            Unit unit = Unit.INSTANCE;
            int i22 = f56696r0;
            int i23 = (i22 & (-76)) | ((~i22) & 75);
            int i24 = -(-((i22 & 75) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f56695q0 = i25 % 128;
            int i26 = i25 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 2143419945, -2143419945, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[ds.values().length];
            iArr[ds.setX.ordinal()] = 1;
            iArr[ds.setY.ordinal()] = 2;
            setX = iArr;
            int i10 = ((((1 ^ 113) | (1 & 113)) << 1) - (~(-((1 & (-114)) | ((~1) & 113))))) - 1;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    public js(@NotNull iv ivVar) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        this.f56690a = ivVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:26:0x0119  */
    /* JADX WARN: Code duplicated, block: B:29:0x012e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0139  */
    /* JADX WARN: Code duplicated, block: B:32:0x013e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x034a  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        ds dsVar;
        int i13;
        int i14;
        int i15;
        int i16 = (~i10) | i11;
        int i17 = ~i16;
        int i18 = ~i12;
        int i19 = (((~(i10 | i18)) | (~((~i11) | i10)) | (~(i16 | i12))) * 140) + ((i17 | (~(i18 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i19 == 1) {
            js jsVar = (js) objArr[0];
            cu cuVar = new cu(jsVar.f56690a);
            cq cqVar = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
            iv ivVar = jsVar.f56690a;
            aq aqVar = new aq(ivVar);
            am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            if (((Boolean) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar}, -2077543827, 2077543829, System.identityHashCode(ivVar))).booleanValue()) {
                int i20 = f56688b + 17;
                f56689c = i20 % 128;
                if (i20 % 2 == 0) {
                    ((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue();
                    throw null;
                }
                if (((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue() || ((Boolean) am.setY(new Object[]{amVar}, -1574629909, 1574629909, System.identityHashCode(amVar))).booleanValue()) {
                    iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar, (ds) setOnFocusChangeListener(new Object[]{ivVar, cqVar, amVar}, 1885787442, -1885787442, (int) System.currentTimeMillis())}, -796213226, 796213231, System.identityHashCode(ivVar));
                    int i21 = setX.setX[((ds) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar}, 1118340294, -1118340287, System.identityHashCode(ivVar))).ordinal()];
                    if (i21 == 1) {
                        setOnFocusChangeListener(new Object[]{jsVar}, -1802970888, 1802970891, System.identityHashCode(jsVar));
                        int i22 = f56688b;
                        int i23 = (i22 & (-14)) | ((~i22) & 13);
                        int i24 = -(-((i22 & 13) << 1));
                        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                        f56689c = i25 % 128;
                        if (i25 % 2 == 0) {
                            throw null;
                        }
                    } else if (i21 != 2) {
                        cz czVar = new cz(ivVar);
                        int i26 = f56689c;
                        int i27 = i26 | 105;
                        int i28 = i27 << 1;
                        int i29 = -((~(i26 & 105)) & i27);
                        int i30 = (i28 & i29) + (i29 | i28);
                        f56688b = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        setOnFocusChangeListener(new Object[]{jsVar}, -1543146365, 1543146367, System.identityHashCode(jsVar));
                        int i32 = f56689c;
                        int i33 = ((i32 ^ 5) | (i32 & 5)) << 1;
                        int i34 = -(((~i32) & 5) | (i32 & (-6)));
                        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                        f56688b = i35 % 128;
                        if (i35 % 2 != 0) {
                            throw null;
                        }
                    }
                    dsVar = null;
                } else {
                    dsVar = null;
                    cz czVar2 = new cz(ivVar);
                    int i36 = f56689c;
                    int i37 = ((i36 & (-104)) | ((~i36) & 103)) + ((i36 & 103) << 1);
                    f56688b = i37 % 128;
                    int i38 = i37 % 2;
                }
            } else {
                dsVar = null;
                cz czVar3 = new cz(ivVar);
                int i39 = f56689c;
                int i310 = ((i39 & (-104)) | ((~i39) & 103)) + ((i39 & 103) << 1);
                f56688b = i310 % 128;
                int i311 = i310 % 2;
            }
        } else {
            if (i19 == 2) {
                js jsVar2 = (js) objArr[0];
                int i40 = f56689c;
                int i41 = (i40 & 35) + (i40 | 35);
                f56688b = i41 % 128;
                if (i41 % 2 != 0) {
                    iv ivVar2 = jsVar2.f56690a;
                    throw null;
                }
                iv ivVar3 = jsVar2.f56690a;
                dj djVar = (dj) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar3}, 1462944051, -1462944002, System.identityHashCode(ivVar3));
                iv ivVar4 = jsVar2.f56690a;
                if (djVar != null) {
                    int i42 = f56689c;
                    int i43 = ((((i42 ^ 117) | (i42 & 117)) << 1) - (~(-(((~i42) & 117) | (i42 & (-118)))))) - 1;
                    f56688b = i43 % 128;
                    int i44 = i43 % 2;
                    if (((df) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar4}, -566041279, 566041293, System.identityHashCode(ivVar4))) != null) {
                        int i45 = f56688b;
                        int i46 = (((i45 ^ 29) | (i45 & 29)) << 1) - (((~i45) & 29) | (i45 & (-30)));
                        f56689c = i46 % 128;
                        int i47 = i46 % 2;
                        if (((dg) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar4}, -1099465569, 1099465624, System.identityHashCode(ivVar4))) != null) {
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{"CDA is to be performed"}, 818541572, -818541572, (int) System.currentTimeMillis());
                            int i48 = f56689c;
                            int i49 = i48 & 51;
                            int i50 = -(-(i48 | 51));
                            int i51 = (i49 & i50) + (i50 | i49);
                            f56688b = i51 % 128;
                            int i52 = i51 % 2;
                            return null;
                        }
                    }
                }
                cz czVar4 = new cz(ivVar4);
                int i53 = f56688b + 68;
                int i54 = (i53 ^ (-1)) + (i53 << 1);
                f56689c = i54 % 128;
                if (i54 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (i19 == 3) {
                js jsVar3 = (js) objArr[0];
                cz czVar5 = new cz(jsVar3.f56690a);
                du duVar = du.INSTANCE;
                iv ivVar5 = jsVar3.f56690a;
                du.setOnFocusChangeListener(new Object[]{ivVar5}, 397100190, -397100183, (int) System.currentTimeMillis());
                cy cyVar = new cy(ivVar5);
                int i55 = f56689c;
                int i56 = i55 ^ 63;
                int i57 = ((i55 & 63) | i56) << 1;
                int i58 = -i56;
                int i59 = (i57 ^ i58) + ((i57 & i58) << 1);
                f56688b = i59 % 128;
                if (i59 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            iv ivVar6 = (iv) objArr[0];
            cq cqVar2 = (cq) objArr[1];
            am amVar2 = (am) objArr[2];
            int i60 = f56688b;
            int i61 = ((i60 | 15) << 1) - (i60 ^ 15);
            f56689c = i61 % 128;
            int i62 = i61 % 2;
            if (!((Boolean) iv.setCompoundDrawableTintBlendMode(new Object[]{ivVar6}, -2077543827, 2077543829, System.identityHashCode(ivVar6))).booleanValue()) {
                int i63 = f56689c;
                int i64 = i63 & 15;
                int i65 = (i63 | 15) & (~i64);
                int i66 = -(-(i64 << 1));
                int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                f56688b = i67 % 128;
                if (i67 % 2 != 0) {
                    ds dsVar2 = ds.setCompoundDrawableTintBlendMode;
                    throw null;
                }
                dsVar = ds.setCompoundDrawableTintBlendMode;
            } else if (!(!((Boolean) am.setY(new Object[]{amVar2}, -452511308, 452511311, System.identityHashCode(amVar2))).booleanValue())) {
                int i68 = f56689c;
                int i69 = (i68 & (-64)) | ((~i68) & 63);
                int i70 = -(-((i68 & 63) << 1));
                int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                f56688b = i71 % 128;
                if (i71 % 2 != 0) {
                    ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 368924951, -368924943, System.identityHashCode(cqVar2))).booleanValue();
                    throw null;
                }
                if (((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 368924951, -368924943, System.identityHashCode(cqVar2))).booleanValue()) {
                    dsVar = ds.setY;
                    int i72 = f56689c + 5;
                    f56688b = i72 % 128;
                    if (i72 % 2 != 0) {
                        i15 = 34;
                        int i73 = i15 / 0;
                    }
                } else if (((Boolean) am.setY(new Object[]{amVar2}, -1574629909, 1574629909, System.identityHashCode(amVar2))).booleanValue()) {
                    int i74 = f56689c;
                    int i75 = i74 ^ 67;
                    int i76 = ((i74 & 67) | i75) << 1;
                    int i77 = -i75;
                    i13 = (i76 & i77) + (i76 | i77);
                    f56688b = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i78 = 18 / 0;
                        if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 273606682, -273606681, System.identityHashCode(cqVar2))).booleanValue()) {
                            dsVar = ds.setCompoundDrawableTintBlendMode;
                            int i79 = f56688b + 73;
                            f56689c = i79 % 128;
                            int i80 = i79 % 2;
                        } else {
                            i14 = f56689c + 61;
                            f56688b = i14 % 128;
                            if (i14 % 2 != 0) {
                                dsVar = ds.setX;
                                i15 = 60;
                                int i710 = i15 / 0;
                            } else {
                                dsVar = ds.setX;
                            }
                        }
                    } else if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 273606682, -273606681, System.identityHashCode(cqVar2))).booleanValue()) {
                        dsVar = ds.setCompoundDrawableTintBlendMode;
                        int i711 = f56688b + 73;
                        f56689c = i711 % 128;
                        int i81 = i711 % 2;
                    } else {
                        i14 = f56689c + 61;
                        f56688b = i14 % 128;
                        if (i14 % 2 != 0) {
                            dsVar = ds.setX;
                            i15 = 60;
                            int i712 = i15 / 0;
                        } else {
                            dsVar = ds.setX;
                        }
                    }
                } else {
                    dsVar = ds.setCompoundDrawableTintBlendMode;
                    int i713 = f56688b + 73;
                    f56689c = i713 % 128;
                    int i82 = i713 % 2;
                }
            } else if (((Boolean) am.setY(new Object[]{amVar2}, -1574629909, 1574629909, System.identityHashCode(amVar2))).booleanValue()) {
                int i714 = f56689c;
                int i715 = i714 ^ 67;
                int i716 = ((i714 & 67) | i715) << 1;
                int i717 = -i715;
                i13 = (i716 & i717) + (i716 | i717);
                f56688b = i13 % 128;
                if (i13 % 2 != 0) {
                    int i718 = 18 / 0;
                    if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 273606682, -273606681, System.identityHashCode(cqVar2))).booleanValue()) {
                        dsVar = ds.setCompoundDrawableTintBlendMode;
                        int i719 = f56688b + 73;
                        f56689c = i719 % 128;
                        int i83 = i719 % 2;
                    } else {
                        i14 = f56689c + 61;
                        f56688b = i14 % 128;
                        if (i14 % 2 != 0) {
                            dsVar = ds.setX;
                            i15 = 60;
                            int i7110 = i15 / 0;
                        } else {
                            dsVar = ds.setX;
                        }
                    }
                } else if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar2}, 273606682, -273606681, System.identityHashCode(cqVar2))).booleanValue()) {
                    dsVar = ds.setCompoundDrawableTintBlendMode;
                    int i7111 = f56688b + 73;
                    f56689c = i7111 % 128;
                    int i84 = i7111 % 2;
                } else {
                    i14 = f56689c + 61;
                    f56688b = i14 % 128;
                    if (i14 % 2 != 0) {
                        dsVar = ds.setX;
                        i15 = 60;
                        int i7112 = i15 / 0;
                    } else {
                        dsVar = ds.setX;
                    }
                }
            } else {
                dsVar = ds.setCompoundDrawableTintBlendMode;
                int i7113 = f56688b + 73;
                f56689c = i7113 % 128;
                int i85 = i7113 % 2;
            }
        }
        return dsVar;
    }

    public final void setY() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, 430325155, -430325154, System.identityHashCode(this));
    }
}
