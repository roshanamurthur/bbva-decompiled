package com.mypinpad.tsdk.isolation;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class gk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56027d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56028e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final gr f56031c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setY", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56032p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56033q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56034r0 = 1;

        static {
            int i10 = f56034r0;
            int i11 = i10 & 119;
            int i12 = ((i10 | 119) & (~i11)) + (i11 << 1);
            f56033q0 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i15 = ~i12;
            int i16 = ~(i15 | i11);
            int i17 = ~(i10 | i11);
            int i18 = i13 | (~i11);
            if (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i19 = f56034r0 + 53;
                f56033q0 = i19 % 128;
                dc dcVar = (dc) obj;
                if (i19 % 2 == 0) {
                    a(new Object[]{aVar, dcVar}, -1009417841, 1009417842, System.identityHashCode(aVar));
                    return Unit.INSTANCE;
                }
                a(new Object[]{aVar, dcVar}, -1009417841, 1009417842, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            dc dcVar2 = (dc) objArr[1];
            int i20 = f56033q0;
            int i21 = i20 & 23;
            int i22 = -(-((i20 ^ 23) | i21));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f56034r0 = i23 % 128;
            int i24 = i23 % 2;
            Intrinsics.checkNotNullParameter(dcVar2, "");
            dc.setDividerPadding(new Object[]{dcVar2, Boolean.TRUE}, 1763882755, -1763882755, System.identityHashCode(dcVar2));
            int i25 = f56034r0;
            int i26 = (-2) - (((i25 & 118) + (i25 | 118)) ^ (-1));
            f56033q0 = i26 % 128;
            int i27 = i26 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, -1432704333, 1432704333, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f56035p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56036q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56037r0 = 1;

        static {
            int i10 = f56036q0;
            int i11 = (i10 ^ 41) + ((i10 & 41) << 1);
            f56037r0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11) {
            int i12 = ~i10;
            if (((i10 | i11) * 624) + ((i12 | i11) * 624) + (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623)) != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i13 = f56036q0;
                int i14 = i13 ^ 79;
                int i15 = (((i13 & 79) | i14) << 1) - i14;
                f56037r0 = i15 % 128;
                int i16 = i15 % 2;
                System.identityHashCode(bVar);
                a(new Object[]{bVar, (dc) obj}, 1504592248, -1504592247);
                Unit unit = Unit.INSTANCE;
                int i17 = f56037r0 + 115;
                f56036q0 = i17 % 128;
                int i18 = i17 % 2;
                return unit;
            }
            dc dcVar = (dc) objArr[1];
            int i19 = f56036q0;
            int i20 = i19 ^ 85;
            int i21 = ((((i19 & 85) | i20) << 1) - (~(-i20))) - 1;
            f56037r0 = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
            } else {
                Intrinsics.checkNotNullParameter(dcVar, "");
                dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
            }
            int i22 = f56037r0;
            int i23 = i22 & 95;
            int i24 = (i23 - (~(-(-((i22 ^ 95) | i23))))) - 1;
            f56036q0 = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            Object[] objArr = {this, dcVar};
            System.identityHashCode(this);
            return a(objArr, 1197647160, -1197647160);
        }
    }

    public gk(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        this.f56029a = fiVar;
        this.f56030b = settextkeepstate;
        this.f56031c = grVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0311  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object objValueOf;
        boolean z10;
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i13 | i10)) | (~(i13 | i15))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        int i17 = 1;
        if (i16 == 1) {
            ca caVar = (ca) objArr[0];
            int i18 = f56028e;
            int i19 = i18 & 83;
            int i20 = ((i18 ^ 83) | i19) << 1;
            int i21 = -((i18 | 83) & (~i19));
            int i22 = (i20 & i21) + (i21 | i20);
            f56027d = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(caVar, "");
            if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.NO_CVM_REQUIRED) {
                int i24 = f56028e + 33;
                f56027d = i24 % 128;
                objValueOf = Boolean.valueOf(i24 % 2 == 0);
            } else {
                int i25 = f56028e;
                int i26 = ((i25 | 111) << 1) - (i25 ^ 111);
                f56027d = i26 % 128;
                if (i26 % 2 != 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
            }
        } else if (i16 != 2) {
            gk gkVar = (gk) objArr[0];
            aq aqVar = new aq(gkVar.f56029a);
            am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            boolean zBooleanValue = ((Boolean) am.setY(new Object[]{amVar}, 27011347, -27011346, System.identityHashCode(amVar))).booleanValue();
            fi fiVar = gkVar.f56029a;
            if (!zBooleanValue) {
                cy cyVar = new cy(fiVar);
                int i27 = f56028e;
                int i28 = ((i27 ^ 26) + ((i27 & 26) << 1)) - 1;
                f56027d = i28 % 128;
                if (i28 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            cy cyVar2 = new cy(fiVar);
            ee eeVar = ee.setDividerPadding;
            Pair pair = (Pair) ee.setOnFocusChangeListener(new Object[]{eeVar, fiVar, gkVar.f56030b, gkVar.f56031c}, 1151690682, -1151690678, System.identityHashCode(eeVar));
            bq bqVar = (bq) pair.component1();
            objValueOf = (fk) pair.component2();
            if (objValueOf == null) {
                if (bqVar == null) {
                    int i29 = f56028e + 53;
                    int i30 = i29 % 128;
                    f56027d = i30;
                    if (i29 % 2 != 0) {
                        int i31 = 21 / 0;
                    }
                    int i32 = ((i30 | 17) << 1) - (i30 ^ 17);
                    f56028e = i32 % 128;
                    int i33 = i32 % 2;
                    return null;
                }
                setAnimation setanimation = setAnimation.INSTANCE;
                long jLongValue = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 481105771, -481105628, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar))}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue();
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar));
                Intrinsics.checkNotNull(getbeeponfailure);
                long jLongValue2 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, -879493274, 879493283, (int) System.currentTimeMillis())).longValue();
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) bqVar.setLayoutAnimation());
                long navigationOnClickListener = bqVar.setNavigationOnClickListener();
                long navBarTitleString = bqVar.getNavBarTitleString();
                if (jLongValue < jLongValue2) {
                    int i34 = f56028e;
                    int i35 = ((i34 | 41) << 1) - (i34 ^ 41);
                    f56027d = i35 % 128;
                    int i36 = i35 % 2;
                    mutableList.removeIf(new q4());
                    int i37 = f56027d;
                    int i38 = i37 & 59;
                    int i39 = ((((i37 ^ 59) | i38) << 1) - (~(-((i37 | 59) & (~i38))))) - 1;
                    f56028e = i39 % 128;
                    int i40 = i39 % 2;
                } else {
                    cu cuVar = new cu(fiVar);
                    cq cqVar = (cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar)));
                    if (((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 1561715712, -1561715706, System.identityHashCode(cqVar))).booleanValue()) {
                        int i41 = f56027d;
                        int i42 = i41 & 39;
                        int i43 = (i42 - (~(-(-((i41 ^ 39) | i42))))) - 1;
                        f56028e = i43 % 128;
                        if (i43 % 2 == 0) {
                            boolean z11 = mutableList instanceof Collection;
                            throw null;
                        }
                        List<ca> list = mutableList;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            int i44 = f56028e;
                            int i45 = i44 & 43;
                            int i46 = -(-((i44 ^ 43) | i45));
                            int i47 = (i45 & i46) + (i46 | i45);
                            f56027d = i47 % 128;
                            int i48 = i47 % 2;
                        } else {
                            int i49 = f56027d + 67;
                            f56028e = i49 % 128;
                            int i50 = i49 % 2;
                            for (ca caVar2 : list) {
                                int i51 = f56027d;
                                int i52 = i51 & 125;
                                int i53 = -(-((i51 ^ 125) | i52));
                                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                                f56028e = i54 % 128;
                                int i55 = i54 % 2;
                                if (((by) ca.setOnFocusChangeListener(new Object[]{caVar2}, 1299031735, -1299031735, System.identityHashCode(caVar2))) == by.NO_CVM_REQUIRED) {
                                    int i56 = f56028e;
                                    int i57 = ((i56 & (-26)) | ((~i56) & 25)) + ((i56 & 25) << 1);
                                    f56027d = i57 % 128;
                                    if (i57 % 2 != 0) {
                                        ((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2, fiVar, Long.valueOf(navigationOnClickListener), Long.valueOf(navBarTitleString)}, -1335075487, 1335075493, System.identityHashCode(caVar2))).booleanValue();
                                        throw null;
                                    }
                                    if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2, fiVar, Long.valueOf(navigationOnClickListener), Long.valueOf(navBarTitleString)}, -1335075487, 1335075493, System.identityHashCode(caVar2))).booleanValue()) {
                                        int i58 = f56027d;
                                        int i59 = i58 & 119;
                                        int i60 = -(-((i58 ^ 119) | i59));
                                        int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                                        int i62 = i61 % 128;
                                        f56028e = i62;
                                        int i63 = i61 % 2;
                                        int i64 = (((i62 ^ 7) | (i62 & 7)) << 1) - (((~i62) & 7) | (i62 & (-8)));
                                        f56027d = i64 % 128;
                                        int i65 = i64 % 2;
                                        z10 = true;
                                    } else {
                                        int i66 = f56028e;
                                        int i67 = i66 & 29;
                                        int i68 = (i67 - (~((i66 ^ 29) | i67))) - 1;
                                        f56027d = i68 % 128;
                                        int i69 = i68 % 2;
                                        z10 = false;
                                    }
                                } else {
                                    int i610 = f56028e;
                                    int i611 = i610 & 29;
                                    int i612 = (i611 - (~((i610 ^ 29) | i611))) - 1;
                                    f56027d = i612 % 128;
                                    int i613 = i612 % 2;
                                    z10 = false;
                                }
                                if (!(!z10)) {
                                    int i70 = f56027d;
                                    int i71 = ((i70 | 57) << 1) - (i70 ^ 57);
                                    f56028e = i71 % 128;
                                    int i72 = i71 % 2;
                                    int i73 = (i70 ^ 83) + ((i70 & 83) << 1);
                                    f56028e = i73 % 128;
                                    int i74 = i73 % 2;
                                    int i75 = (i70 ^ 9) + ((i70 & 9) << 1);
                                    f56028e = i75 % 128;
                                    if (i75 % 2 == 0) {
                                        mutableList.removeIf(new com.esotericsoftware.kryo.util.a(i17));
                                        throw null;
                                    }
                                    mutableList.removeIf(new r4());
                                }
                            }
                            int i410 = f56028e;
                            int i411 = i410 & 43;
                            int i412 = -(-((i410 ^ 43) | i411));
                            int i413 = (i411 & i412) + (i412 | i411);
                            f56027d = i413 % 128;
                            int i414 = i413 % 2;
                        }
                    }
                }
                ee.setOnFocusChangeListener(new Object[]{ee.setDividerPadding, fiVar, mutableList, Long.valueOf(navigationOnClickListener), Long.valueOf(navBarTitleString)}, -509950601, 509950614, (int) System.currentTimeMillis());
                int i76 = f56028e;
                int i77 = (i76 ^ 67) + ((i76 & 67) << 1);
                f56027d = i77 % 128;
                int i78 = i77 % 2;
                return null;
            }
            int i79 = f56027d;
            int i80 = (i79 ^ 59) + ((i79 & 59) << 1);
            f56028e = i80 % 128;
            int i81 = i80 % 2;
            int i82 = ((i79 | 55) << 1) - (i79 ^ 55);
            f56028e = i82 % 128;
            if (i82 % 2 == 0) {
                throw null;
            }
        } else {
            ca caVar3 = (ca) objArr[0];
            int i83 = f56027d;
            int i84 = ((i83 & (-62)) | ((~i83) & 61)) + ((i83 & 61) << 1);
            f56028e = i84 % 128;
            int i85 = i84 % 2;
            Intrinsics.checkNotNullParameter(caVar3, "");
            if (((by) ca.setOnFocusChangeListener(new Object[]{caVar3}, 1299031735, -1299031735, System.identityHashCode(caVar3))) != by.NO_CVM_REQUIRED) {
                int i86 = f56027d;
                int i87 = ((i86 & (-6)) | ((~i86) & 5)) + ((i86 & 5) << 1);
                f56028e = i87 % 128;
                objValueOf = Boolean.valueOf(i87 % 2 != 0);
            } else {
                int i88 = f56028e;
                int i89 = ((i88 & 24) + (i88 | 24)) - 1;
                f56027d = i89 % 128;
                if (i89 % 2 != 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
            }
        }
        return objValueOf;
    }

    @Nullable
    public final fk setOnFocusChangeListener() {
        return (fk) setY(new Object[]{this}, -881258237, 881258237, System.identityHashCode(this));
    }
}
