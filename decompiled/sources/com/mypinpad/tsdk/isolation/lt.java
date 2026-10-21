package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56991c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56992d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lq f56993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getValue f56994b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56995p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56996q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56997r0 = 1;

        static {
            int i10 = f56996q0;
            int i11 = ((i10 ^ 109) | (i10 & 109)) << 1;
            int i12 = -(((~i10) & 109) | (i10 & (-110)));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f56997r0 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 12 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            if (((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70) == 1) {
                cv cvVar = (cv) objArr[1];
                int i15 = f56997r0 + 9;
                f56996q0 = i15 % 128;
                int i16 = i15 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                int i17 = f56997r0;
                int i18 = (i17 | 17) << 1;
                int i19 = -(((~i17) & 17) | (i17 & (-18)));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f56996q0 = i20 % 128;
                int i21 = i20 % 2;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i22 = f56997r0;
            int i23 = ((i22 & (-14)) | ((~i22) & 13)) + ((i22 & 13) << 1);
            f56996q0 = i23 % 128;
            int i24 = i23 % 2;
            a(new Object[]{aVar, (cv) obj}, -772823108, 772823109, System.identityHashCode(aVar));
            Unit unit = Unit.INSTANCE;
            int i25 = f56996q0;
            int i26 = i25 & 27;
            int i27 = (i25 ^ 27) | i26;
            int i28 = (i26 & i27) + (i27 | i26);
            f56997r0 = i28 % 128;
            int i29 = i28 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -311578081, 311578081, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f56998p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56999q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57000r0 = 1;

        static {
            int i10 = f57000r0;
            int i11 = i10 & 15;
            int i12 = (((i10 | 15) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
            f56999q0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
            int i17 = ~i11;
            int i18 = i10 | i15;
            if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 == 1) {
                cv cvVar = (cv) objArr[1];
                int i19 = f57000r0 + 15;
                f56999q0 = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                int i21 = f56999q0;
                int i22 = i21 & 41;
                int i23 = -(-((i21 ^ 41) | i22));
                int i24 = (i22 & i23) + (i23 | i22);
                f57000r0 = i24 % 128;
                if (i24 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            b bVar = (b) objArr[0];
            Object obj = objArr[1];
            int i25 = f56999q0;
            int i26 = ((i25 ^ 77) - (~(-(-((i25 & 77) << 1))))) - 1;
            f57000r0 = i26 % 128;
            cv cvVar2 = (cv) obj;
            Object[] objArr2 = new Object[2];
            if (i26 % 2 != 0) {
                objArr2[0] = bVar;
                objArr2[1] = cvVar2;
                a(objArr2, 1710063998, -1710063997, System.identityHashCode(bVar));
                return Unit.INSTANCE;
            }
            objArr2[0] = bVar;
            objArr2[1] = cvVar2;
            a(objArr2, 1710063998, -1710063997, System.identityHashCode(bVar));
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 366363001, -366363001, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[ds.values().length];
            iArr[ds.setY.ordinal()] = 1;
            iArr[ds.setOnFocusChangeListener.ordinal()] = 2;
            iArr[ds.setX.ordinal()] = 3;
            setY = iArr;
            int i10 = 1 & 81;
            int i11 = 1 | 81;
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            int i13 = i12 % 128;
            if (i12 % 2 != 0) {
                int i14 = 2 / 0;
            }
        }
    }

    public lt(@NotNull lq lqVar, @NotNull getValue getvalue) {
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56993a = lqVar;
        this.f56994b = getvalue;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0161  */
    /* JADX WARN: Code duplicated, block: B:45:0x0178  */
    /* JADX WARN: Code duplicated, block: B:46:0x0179  */
    /* JADX WARN: Code duplicated, block: B:48:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0220  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        Object obj;
        int i14;
        int i15;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = ((i10 | i17) * 948) + ((~((~i12) | i16 | i17)) * (-948)) + (((~(i17 | i12)) | i16) * (-948)) + (i11 * 949) + (i10 * (-947));
        fk fkVar = null;
        if (i18 == 1) {
            lt ltVar = (lt) objArr[0];
            aq aqVar = new aq(ltVar.f56993a);
            am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            boolean zBooleanValue = ((Boolean) am.setY(new Object[]{amVar}, -452511308, 452511311, System.identityHashCode(amVar))).booleanValue();
            lq lqVar = ltVar.f56993a;
            if (!zBooleanValue) {
                int i19 = f56992d;
                int i20 = i19 & 45;
                int i21 = -(-((i19 ^ 45) | i20));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f56991c = i22 % 128;
                if (i22 % 2 != 0) {
                    ((Boolean) am.setY(new Object[]{amVar}, -1378668101, 1378668110, System.identityHashCode(amVar))).booleanValue();
                    throw null;
                }
                if (!((Boolean) am.setY(new Object[]{amVar}, -1378668101, 1378668110, System.identityHashCode(amVar))).booleanValue() && !((Boolean) am.setY(new Object[]{amVar}, -1574629909, 1574629909, System.identityHashCode(amVar))).booleanValue()) {
                    cz czVar = new cz(lqVar);
                    int i23 = f56991c;
                    i13 = (((i23 | 76) << 1) - (i23 ^ 76)) - 1;
                    f56992d = i13 % 128;
                }
                int i24 = i13 % 2;
                return fkVar;
            }
            cu cuVar = new cu(lqVar);
            lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar, (ds) setCompoundDrawableTintBlendMode(new Object[]{(cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar))), amVar}, -311057853, 311057853, (int) System.currentTimeMillis())}, -603530123, 603530126, System.identityHashCode(lqVar));
            int i25 = setCompoundDrawableTintBlendMode.setY[((ds) lq.setCompoundDrawableTintBlendMode(new Object[]{lqVar}, 328985409, -328985407, System.identityHashCode(lqVar))).ordinal()];
            if (i25 == 1) {
                fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{ltVar}, 1025119590, -1025119586, System.identityHashCode(ltVar));
                int i26 = f56992d;
                i13 = (i26 & 85) + (i26 | 85);
                f56991c = i13 % 128;
                int i27 = i13 % 2;
                return fkVar;
            }
            if (i25 == 2) {
                obj = (fk) setCompoundDrawableTintBlendMode(new Object[]{ltVar}, 850382123, -850382120, System.identityHashCode(ltVar));
                int i28 = f56992d;
                int i29 = i28 & 17;
                int i30 = (i29 - (~(-(-((i28 ^ 17) | i29))))) - 1;
                f56991c = i30 % 128;
                if (i30 % 2 != 0) {
                    throw null;
                }
            } else {
                if (i25 != 3) {
                    cz czVar2 = new cz(lqVar);
                    int i31 = f56992d;
                    int i32 = ((i31 ^ 67) | (i31 & 67)) << 1;
                    int i33 = -(((~i31) & 67) | (i31 & (-68)));
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    f56991c = i34 % 128;
                    int i35 = i34 % 2;
                    return null;
                }
                obj = (fk) setCompoundDrawableTintBlendMode(new Object[]{ltVar}, -718596785, 718596787, System.identityHashCode(ltVar));
                int i36 = f56992d;
                int i37 = i36 & 105;
                int i38 = ((i36 | 105) & (~i37)) + (i37 << 1);
                f56991c = i38 % 128;
                if (i38 % 2 != 0) {
                    throw null;
                }
            }
        } else {
            if (i18 == 2) {
                lt ltVar2 = (lt) objArr[0];
                cz czVar3 = new cz(ltVar2.f56993a);
                du duVar = du.INSTANCE;
                du.setOnFocusChangeListener(new Object[]{ltVar2.f56993a}, 397100190, -397100183, (int) System.currentTimeMillis());
                cy cyVar = new cy(ltVar2.f56993a);
                int i39 = f56992d;
                int i40 = ((i39 ^ 76) + ((i39 & 76) << 1)) - 1;
                f56991c = i40 % 128;
                int i41 = i40 % 2;
                return null;
            }
            if (i18 == 3) {
                lt ltVar3 = (lt) objArr[0];
                cy cyVar2 = new cy(ltVar3.f56993a);
                du duVar2 = du.INSTANCE;
                obj = (fk) du.setOnFocusChangeListener(new Object[]{duVar2, ltVar3.f56993a, ltVar3.f56994b}, 1872420095, -1872420092, System.identityHashCode(duVar2));
                int i42 = f56991c;
                int i43 = ((i42 & 44) + (i42 | 44)) - 1;
                f56992d = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
            } else {
                if (i18 == 4) {
                    lt ltVar4 = (lt) objArr[0];
                    int i44 = f56991c;
                    int i45 = (((i44 | 113) << 1) - (~(-(((~i44) & 113) | (i44 & (-114)))))) - 1;
                    f56992d = i45 % 128;
                    if (i45 % 2 == 0) {
                        lq lqVar2 = ltVar4.f56993a;
                        dj djVar = (dj) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{lqVar2}, 1462944051, -1462944002, System.identityHashCode(lqVar2));
                        int i46 = 60 / 0;
                        if (djVar == null) {
                            cz czVar4 = new cz(ltVar4.f56993a);
                            int i47 = f56991c;
                            int i48 = i47 & 13;
                            int i49 = ((i47 | 13) & (~i48)) + (i48 << 1);
                            f56992d = i49 % 128;
                            int i50 = i49 % 2;
                        } else {
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{"CDA is to be performed"}, 818541572, -818541572, (int) System.currentTimeMillis());
                            int i51 = f56992d;
                            int i52 = i51 | 117;
                            int i53 = i52 << 1;
                            int i54 = -((~(i51 & 117)) & i52);
                            int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                            f56991c = i55 % 128;
                            int i56 = i55 % 2;
                        }
                    } else {
                        lq lqVar3 = ltVar4.f56993a;
                        if (((dj) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{lqVar3}, 1462944051, -1462944002, System.identityHashCode(lqVar3))) == null) {
                            cz czVar5 = new cz(ltVar4.f56993a);
                            int i410 = f56991c;
                            int i411 = i410 & 13;
                            int i412 = ((i410 | 13) & (~i411)) + (i411 << 1);
                            f56992d = i412 % 128;
                            int i57 = i412 % 2;
                        } else {
                            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{"CDA is to be performed"}, 818541572, -818541572, (int) System.currentTimeMillis());
                            int i58 = f56992d;
                            int i59 = i58 | 117;
                            int i510 = i59 << 1;
                            int i511 = -((~(i58 & 117)) & i59);
                            int i512 = (i510 ^ i511) + ((i511 & i510) << 1);
                            f56991c = i512 % 128;
                            int i513 = i512 % 2;
                        }
                    }
                    int i60 = f56992d + 11;
                    f56991c = i60 % 128;
                    int i61 = i60 % 2;
                    return null;
                }
                cq cqVar = (cq) objArr[0];
                am amVar2 = (am) objArr[1];
                int i62 = f56991c;
                int i63 = (((i62 ^ 55) | (i62 & 55)) << 1) - (((~i62) & 55) | (i62 & (-56)));
                f56992d = i63 % 128;
                if (i63 % 2 == 0) {
                    ((Boolean) am.setY(new Object[]{amVar2}, -452511308, 452511311, System.identityHashCode(amVar2))).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) am.setY(new Object[]{amVar2}, -452511308, 452511311, System.identityHashCode(amVar2))).booleanValue()) && ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 368924951, -368924943, System.identityHashCode(cqVar))).booleanValue()) {
                    int i64 = f56992d + 85;
                    f56991c = i64 % 128;
                    if (i64 % 2 != 0) {
                        ds dsVar = ds.setCompoundDrawableTintBlendMode;
                        throw null;
                    }
                    obj = ds.setY;
                    int i65 = f56992d;
                    int i66 = i65 & 117;
                    int i67 = (i65 ^ 117) | i66;
                    int i68 = (i66 & i67) + (i67 | i66);
                    f56991c = i68 % 128;
                    if (i68 % 2 != 0) {
                        throw null;
                    }
                } else if (((Boolean) am.setY(new Object[]{amVar2}, -1378668101, 1378668110, System.identityHashCode(amVar2))).booleanValue()) {
                    int i69 = f56991c;
                    int i70 = ((i69 | 123) << 1) - (i69 ^ 123);
                    f56992d = i70 % 128;
                    int i71 = i70 % 2;
                    if (((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 191902400, -191902397, System.identityHashCode(cqVar))).booleanValue()) {
                        int i72 = f56991c;
                        int i73 = ((i72 | 15) << 1) - (i72 ^ 15);
                        f56992d = i73 % 128;
                        if (i73 % 2 == 0) {
                            obj = ds.setOnFocusChangeListener;
                            int i74 = 80 / 0;
                        } else {
                            obj = ds.setOnFocusChangeListener;
                        }
                        int i75 = f56992d;
                        int i76 = ((i75 | 63) << 1) - (i75 ^ 63);
                        f56991c = i76 % 128;
                        if (i76 % 2 != 0) {
                            throw null;
                        }
                    } else if (((Boolean) am.setY(new Object[]{amVar2}, -1574629909, 1574629909, System.identityHashCode(amVar2))).booleanValue()) {
                        int i77 = f56991c;
                        int i78 = i77 | 93;
                        i14 = ((i78 << 1) - (~(-((~(i77 & 93)) & i78)))) - 1;
                        f56992d = i14 % 128;
                        if (i14 % 2 != 0) {
                            ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 273606682, -273606681, System.identityHashCode(cqVar))).booleanValue();
                            throw null;
                        }
                        if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 273606682, -273606681, System.identityHashCode(cqVar))).booleanValue()) {
                            obj = ds.setCompoundDrawableTintBlendMode;
                            int i79 = f56992d;
                            int i80 = ((i79 | 109) << 1) - (i79 ^ 109);
                            f56991c = i80 % 128;
                            int i81 = i80 % 2;
                        } else {
                            obj = ds.setX;
                            int i82 = f56992d;
                            int i83 = i82 & 35;
                            int i84 = (i82 ^ 35) | i83;
                            i15 = ((i83 | i84) << 1) - (i84 ^ i83);
                            f56991c = i15 % 128;
                            if (i15 % 2 != 0) {
                                throw null;
                            }
                        }
                    } else {
                        obj = ds.setCompoundDrawableTintBlendMode;
                        int i710 = f56992d;
                        int i85 = ((i710 | 109) << 1) - (i710 ^ 109);
                        f56991c = i85 % 128;
                        int i86 = i85 % 2;
                    }
                } else if (((Boolean) am.setY(new Object[]{amVar2}, -1574629909, 1574629909, System.identityHashCode(amVar2))).booleanValue()) {
                    int i711 = f56991c;
                    int i712 = i711 | 93;
                    i14 = ((i712 << 1) - (~(-((~(i711 & 93)) & i712)))) - 1;
                    f56992d = i14 % 128;
                    if (i14 % 2 != 0) {
                        ((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 273606682, -273606681, System.identityHashCode(cqVar))).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 273606682, -273606681, System.identityHashCode(cqVar))).booleanValue()) {
                        obj = ds.setCompoundDrawableTintBlendMode;
                        int i713 = f56992d;
                        int i87 = ((i713 | 109) << 1) - (i713 ^ 109);
                        f56991c = i87 % 128;
                        int i88 = i87 % 2;
                    } else {
                        obj = ds.setX;
                        int i89 = f56992d;
                        int i810 = i89 & 35;
                        int i811 = (i89 ^ 35) | i810;
                        i15 = ((i810 | i811) << 1) - (i811 ^ i810);
                        f56991c = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    }
                } else {
                    obj = ds.setCompoundDrawableTintBlendMode;
                    int i714 = f56992d;
                    int i812 = ((i714 | 109) << 1) - (i714 ^ 109);
                    f56991c = i812 % 128;
                    int i813 = i812 % 2;
                }
            }
        }
        return obj;
    }

    @Nullable
    public final fk setCompoundDrawableTintBlendMode() {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this}, -1514599774, 1514599775, System.identityHashCode(this));
    }
}
