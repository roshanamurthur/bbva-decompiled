package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kv {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56853d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56854e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ka f56855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component10 f56856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56857c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setY", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56858p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56859q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56860r0 = 1;

        static {
            int i10 = f56859q0;
            int i11 = i10 & 59;
            int i12 = -(-((i10 ^ 59) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f56860r0 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50) != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i15 = (-2) - ((f56859q0 + 16) ^ (-1));
                f56860r0 = i15 % 128;
                dc dcVar = (dc) obj;
                Object[] objArr2 = new Object[2];
                if (i15 % 2 != 0) {
                    objArr2[0] = aVar;
                    objArr2[1] = dcVar;
                    a(objArr2, -367887240, 367887241, System.identityHashCode(aVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = aVar;
                objArr2[1] = dcVar;
                a(objArr2, -367887240, 367887241, System.identityHashCode(aVar));
                int i16 = 64 / 0;
                return Unit.INSTANCE;
            }
            dc dcVar2 = (dc) objArr[1];
            int i17 = f56860r0;
            int i18 = (i17 & (-122)) | ((~i17) & 121);
            int i19 = (i17 & 121) << 1;
            int i20 = (i18 & i19) + (i19 | i18);
            f56859q0 = i20 % 128;
            if (i20 % 2 != 0) {
                Intrinsics.checkNotNullParameter(dcVar2, "");
                dc.setDividerPadding(new Object[]{dcVar2}, 1266704093, -1266704091, System.identityHashCode(dcVar2));
                throw null;
            }
            Intrinsics.checkNotNullParameter(dcVar2, "");
            dc.setDividerPadding(new Object[]{dcVar2}, 1266704093, -1266704091, System.identityHashCode(dcVar2));
            int i21 = f56860r0;
            int i22 = i21 & 41;
            int i23 = -(-((i21 ^ 41) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f56859q0 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 98 / 0;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, -556329471, 556329471, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setX", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56861q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56862r0 = 1;

        public b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x01a4  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            TransactionCompleted transactionCompleted;
            String str;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
            int i16 = i11 | (~(i13 | (~i12)));
            int i17 = ~(i10 | i12);
            if ((i17 * 880) + ((i16 | i17) * (-880)) + i15 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i18 = f56862r0;
                int i19 = i18 & 51;
                int i20 = ((i18 ^ 51) | i19) << 1;
                int i21 = -((i18 | 51) & (~i19));
                int i22 = (i20 & i21) + (i21 | i20);
                f56861q0 = i22 % 128;
                cv cvVar = (cv) obj;
                Object[] objArr2 = new Object[2];
                if (i22 % 2 == 0) {
                    objArr2[0] = bVar;
                    objArr2[1] = cvVar;
                    a(objArr2, 662691146, -662691145, System.identityHashCode(bVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = bVar;
                objArr2[1] = cvVar;
                a(objArr2, 662691146, -662691145, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            b bVar2 = (b) objArr[0];
            cv cvVar2 = (cv) objArr[1];
            int i23 = f56862r0;
            int i24 = i23 & 71;
            int i25 = i24 + ((i23 ^ 71) | i24);
            f56861q0 = i25 % 128;
            if (i25 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar2, "");
                ka kaVar = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kv.this}, -213515080, 213515083, (int) System.currentTimeMillis());
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(kaVar))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(cvVar2, "");
            ka kaVar2 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kv.this}, -213515080, 213515083, (int) System.currentTimeMillis());
            setAnimation setanimation2 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
            boolean zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(kaVar2))).booleanValue();
            kv kvVar = kv.this;
            if (zBooleanValue) {
                ka kaVar3 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                TransactionFailed transactionFailedTerminalSessionDefaultImpls = setAnimation.TerminalSessionDefaultImpls();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3, (String) TransactionFailed.setX(new Object[]{transactionFailedTerminalSessionDefaultImpls}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTerminalSessionDefaultImpls))}, -232375606, 232375652, System.identityHashCode(kaVar3))).booleanValue()) {
                    int i26 = f56861q0;
                    int i27 = i26 & 77;
                    int i28 = (i26 ^ 77) | i27;
                    int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                    f56862r0 = i29 % 128;
                    if (i29 % 2 == 0) {
                        mf mfVar = mf.INSTANCE;
                        ((Boolean) mf.setX(new Object[]{(ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis())}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    mf mfVar2 = mf.INSTANCE;
                    if (!((Boolean) mf.setX(new Object[]{(ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis())}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue()) {
                        cv.setDividerPadding(new Object[]{cvVar2}, 234919463, -234919436, System.identityHashCode(cvVar2));
                        System.identityHashCode(bVar2);
                        System.identityHashCode(bVar2);
                    }
                } else {
                    ka kaVar4 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                    ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar4}, -1284673777, 1284673790, System.identityHashCode(kaVar4));
                    int i30 = f56862r0;
                    int i31 = i30 & 125;
                    int i32 = ((i30 ^ 125) | i31) << 1;
                    int i33 = -((i30 | 125) & (~i31));
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    f56861q0 = i34 % 128;
                    int i35 = i34 % 2;
                }
            } else {
                ka kaVar5 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                ka.setCompoundDrawableTintBlendMode(new Object[]{kaVar5}, -1284673777, 1284673790, System.identityHashCode(kaVar5));
                int i36 = f56862r0;
                int i37 = i36 & 125;
                int i38 = ((i36 ^ 125) | i37) << 1;
                int i39 = -((i36 | 125) & (~i37));
                int i310 = ((i38 | i39) << 1) - (i39 ^ i38);
                f56861q0 = i310 % 128;
                int i311 = i310 % 2;
            }
            ka kaVar6 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1817971805, -1817971762, (int) System.currentTimeMillis());
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar6, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -232375606, 232375652, System.identityHashCode(kaVar6))).booleanValue()) {
                ak akVar = new ak((ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis()));
                aj ajVar = (aj) ((setImageTintList) w.setX(new Object[]{akVar}, 1693919772, -1693919769, System.identityHashCode(akVar)));
                transactionCompleted = (TransactionCompleted) aj.setY(new Object[]{ajVar}, 919185106, -919185106, System.identityHashCode(ajVar));
                int i40 = f56862r0;
                int i41 = (i40 ^ 9) + ((i40 & 9) << 1);
                f56861q0 = i41 % 128;
                int i42 = i41 % 2;
            } else {
                copy copyVar = copy.INSTANCE;
                bu buVar = new bu((ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis()));
                transactionCompleted = (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{copyVar, ((br) ((setImageTintList) w.setX(new Object[]{buVar}, 1693919772, -1693919769, System.identityHashCode(buVar)))).setNavigationOnClickListener()}, 1554010462, -1554010453, System.identityHashCode(copyVar));
                int i43 = f56861q0;
                int i44 = i43 & 53;
                int i45 = i43 | 53;
                int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                f56862r0 = i46 % 128;
                int i47 = i46 % 2;
            }
            if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted, ((setContentDescription) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -1931798190, 1931798192, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode()}, -354590257, 354590260, System.identityHashCode(transactionCompleted))).intValue() < 0) {
                int i48 = f56861q0;
                int i49 = ((~i48) & 109) | (i48 & (-110));
                int i50 = -(-((i48 & 109) << 1));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f56862r0 = i51 % 128;
                if (i51 % 2 == 0) {
                    cv.setDividerPadding(new Object[]{cvVar2, Boolean.FALSE}, -1217412403, 1217412419, System.identityHashCode(cvVar2));
                } else {
                    cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -1217412403, 1217412419, System.identityHashCode(cvVar2));
                }
                int i52 = f56862r0;
                int i53 = i52 & 21;
                int i54 = (i52 ^ 21) | i53;
                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                f56861q0 = i55 % 128;
                int i56 = i55 % 2;
            }
            byte[] imageResource = ((ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis())).setImageResource();
            if (imageResource == null) {
                int i57 = f56862r0;
                int i58 = ((i57 ^ 69) | (i57 & 69)) << 1;
                int i59 = -((i57 & (-70)) | (69 & (~i57)));
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                f56861q0 = i60 % 128;
                int i61 = i60 % 2;
                int i62 = i57 ^ 15;
                int i63 = ((i57 & 15) | i62) << 1;
                int i64 = -i62;
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                f56861q0 = i65 % 128;
                int i66 = i65 % 2;
                str = null;
            } else {
                str = (String) setInputExtras.setDividerPadding(new Object[]{imageResource}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                int i67 = f56861q0;
                int i68 = (((i67 | 100) << 1) - (i67 ^ 100)) - 1;
                f56862r0 = i68 % 128;
                int i69 = i68 % 2;
            }
            if (((Boolean) component10.setDividerPadding.setY(new Object[]{(component10) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -384153574, 384153574, (int) System.currentTimeMillis()), str}, -845226674, 845226674, (int) System.currentTimeMillis())).booleanValue()) {
                int i70 = f56861q0;
                int i71 = (((i70 | 14) << 1) - (i70 ^ 14)) - 1;
                f56862r0 = i71 % 128;
                if (i71 % 2 == 0) {
                    cv.setDividerPadding(new Object[]{cvVar2}, 310720593, -310720570, System.identityHashCode(cvVar2));
                    throw null;
                }
                cv.setDividerPadding(new Object[]{cvVar2}, 310720593, -310720570, System.identityHashCode(cvVar2));
                int i72 = f56862r0;
                int i73 = i72 & 61;
                int i74 = -(-((i72 ^ 61) | i73));
                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                f56861q0 = i75 % 128;
                int i76 = i75 % 2;
            }
            ka kaVar7 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
            TransactionFailed suppressed = setAnimation.getSuppressed();
            if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar7, (String) TransactionFailed.setX(new Object[]{suppressed}, 1914607362, -1914607356, System.identityHashCode(suppressed))}, 2064855914, -2064855856, System.identityHashCode(kaVar7))).booleanValue())) {
                int i77 = f56861q0;
                int i78 = ((i77 | 95) << 1) - ((95 & (~i77)) | (i77 & (-96)));
                f56862r0 = i78 % 128;
                int i79 = i78 % 2;
                ka kaVar8 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis());
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar8, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 2064855914, -2064855856, System.identityHashCode(kaVar8))).booleanValue()) {
                    int i80 = f56861q0;
                    int i81 = (((i80 ^ 47) | (i80 & 47)) << 1) - (((~i80) & 47) | (i80 & (-48)));
                    f56862r0 = i81 % 128;
                    if (i81 % 2 == 0) {
                        ka kaVar9 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar9, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(kaVar9));
                        byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        ka kaVar10 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar10, (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(kaVar10));
                        Arrays.equals(bArr, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)));
                        throw null;
                    }
                    ka kaVar11 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar11, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(kaVar11));
                    byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                    ka kaVar12 = (ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
                    getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar12, (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(kaVar12));
                    if (!Arrays.equals(bArr2, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4)))) {
                        int i82 = f56862r0 + 71;
                        f56861q0 = i82 % 128;
                        if (i82 % 2 != 0) {
                            cv.setDividerPadding(new Object[]{cvVar2}, 199649391, -199649372, System.identityHashCode(cvVar2));
                            throw null;
                        }
                        cv.setDividerPadding(new Object[]{cvVar2}, 199649391, -199649372, System.identityHashCode(cvVar2));
                        int i83 = f56862r0;
                        int i84 = i83 & 73;
                        int i85 = ((i83 | 73) & (~i84)) + (i84 << 1);
                        f56861q0 = i85 % 128;
                        int i86 = i85 % 2;
                    }
                    al alVar = new al((ka) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis()));
                    ai aiVar = (ai) ((setImageTintList) w.setX(new Object[]{alVar}, 1693919772, -1693919769, System.identityHashCode(alVar)));
                    TransactionCompleted transactionCompleted2 = (TransactionCompleted) ai.setDividerPadding(new Object[]{aiVar}, 1408442774, -1408442774, System.identityHashCode(aiVar));
                    if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2, ((setContentDescription) kv.setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -1931798190, 1931798192, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode()}, -354590257, 354590260, System.identityHashCode(transactionCompleted2))).intValue() > 0) {
                        int i87 = f56862r0;
                        int i88 = i87 & 115;
                        int i89 = ((i87 ^ 115) | i88) << 1;
                        int i90 = -((i87 | 115) & (~i88));
                        int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                        f56861q0 = i91 % 128;
                        int i92 = i91 % 2;
                        cv.setDividerPadding(new Object[]{cvVar2}, 411204828, -411204817, System.identityHashCode(cvVar2));
                        int i93 = f56862r0;
                        int i94 = i93 & 119;
                        int i95 = ((((i93 ^ 119) | i94) << 1) - (~(-((i93 | 119) & (~i94))))) - 1;
                        f56861q0 = i95 % 128;
                        int i96 = i95 % 2;
                    }
                }
            }
            int i97 = f56861q0;
            int i98 = (i97 ^ 102) + ((i97 & 102) << 1);
            int i99 = (i98 ^ (-1)) + (i98 << 1);
            f56862r0 = i99 % 128;
            if (i99 % 2 == 0) {
                int i100 = 9 / 0;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 250032499, -250032499, System.identityHashCode(this));
        }
    }

    public kv(@NotNull ka kaVar, @NotNull component10 component10Var, @NotNull setContentDescription setcontentdescription) {
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(component10Var, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56855a = kaVar;
        this.f56856b = component10Var;
        this.f56857c = setcontentdescription;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        if (i15 == 1) {
            kv kvVar = (kv) objArr[0];
            cy cyVar = new cy(kvVar.f56855a);
            cz czVar = new cz(kvVar.f56855a);
            int i16 = f56853d + 27;
            f56854e = i16 % 128;
            if (i16 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 2) {
            kv kvVar2 = (kv) objArr[0];
            int i17 = f56853d;
            int i18 = (i17 & 113) + (i17 | 113);
            int i19 = i18 % 128;
            f56854e = i19;
            int i20 = i18 % 2;
            obj = kvVar2.f56857c;
            int i21 = i19 & 1;
            int i22 = i21 + ((i19 ^ 1) | i21);
            f56853d = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        } else {
            if (i15 == 3) {
                kv kvVar3 = (kv) objArr[0];
                int i23 = f56854e;
                int i24 = (i23 ^ 79) + ((i23 & 79) << 1);
                f56853d = i24 % 128;
                int i25 = i24 % 2;
                ka kaVar = kvVar3.f56855a;
                int i26 = i23 ^ 95;
                int i27 = (i23 & 95) << 1;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                f56853d = i28 % 128;
                if (i28 % 2 == 0) {
                    return kaVar;
                }
                int i29 = 26 / 0;
                return kaVar;
            }
            kv kvVar4 = (kv) objArr[0];
            int i30 = f56854e;
            int i31 = (-2) - (((i30 & 60) + (i30 | 60)) ^ (-1));
            int i32 = i31 % 128;
            f56853d = i32;
            int i33 = i31 % 2;
            obj = kvVar4.f56856b;
            int i34 = i32 + 69;
            f56854e = i34 % 128;
            if (i34 % 2 == 0) {
                int i35 = 46 / 0;
            }
        }
        return obj;
    }

    public static final /* synthetic */ setContentDescription setDividerPadding(kv kvVar) {
        return (setContentDescription) setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -1931798190, 1931798192, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ka setOnFocusChangeListener(kv kvVar) {
        return (ka) setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -213515080, 213515083, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ component10 setCompoundDrawableTintBlendMode(kv kvVar) {
        return (component10) setCompoundDrawableTintBlendMode(new Object[]{kvVar}, -384153574, 384153574, (int) System.currentTimeMillis());
    }

    public final void setCompoundDrawableTintBlendMode() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 62941534, -62941533, System.identityHashCode(this));
    }
}
