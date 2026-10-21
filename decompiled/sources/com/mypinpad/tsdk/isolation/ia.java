package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ia extends hh {
    public static int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f56362n = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final io f56363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final gz f56364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final et f56365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final component17 f56366l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f56367w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f56368x0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f56369p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f56370q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f56371r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ia f56372s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f56373t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f56374u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, int i10, int i11, ia iaVar, int i12, int i13, int i14) {
            super(1);
            this.f56369p0 = j10;
            this.f56370q0 = i10;
            this.f56371r0 = i11;
            this.f56372s0 = iaVar;
            this.f56373t0 = i12;
            this.f56374u0 = i13;
            this.v0 = i14;
        }

        /* JADX WARN: Code duplicated, block: B:55:0x040a  */
        /* JADX WARN: Code duplicated, block: B:70:0x0458  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            Object objValueOf;
            boolean z10;
            int i13;
            boolean z11;
            boolean z12;
            int i14 = ~((~i10) | (~i11));
            int i15 = ~i12;
            int i16 = i10 | i11;
            if (((~i16) * 828) + ((i16 | i15) * (-828)) + ((i14 | (~(i15 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829) != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i17 = f56367w0 + 112;
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                f56368x0 = i18 % 128;
                cv cvVar = (cv) obj;
                Object[] objArr2 = new Object[2];
                if (i18 % 2 != 0) {
                    objArr2[0] = aVar;
                    objArr2[1] = cvVar;
                    a(objArr2, 1006892071, -1006892070, System.identityHashCode(aVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = aVar;
                objArr2[1] = cvVar;
                a(objArr2, 1006892071, -1006892070, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a aVar2 = (a) objArr[0];
            cv cvVar2 = (cv) objArr[1];
            int i19 = f56367w0;
            int i20 = i19 & 15;
            int i21 = i19 | 15;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f56368x0 = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(cvVar2, "");
            long j10 = aVar2.f56369p0;
            int iIdentityHashCode = System.identityHashCode(aVar2);
            int i24 = aVar2.f56371r0;
            int i25 = i24 * 398;
            int i26 = aVar2.f56370q0;
            int i27 = i26 * (-396);
            int i28 = ((i25 ^ i27) | (i25 & i27)) << 1;
            int i29 = -(((~i25) & i27) | ((~i27) & i25));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = ~i24;
            int i32 = ~iIdentityHashCode;
            int i33 = i31 & i32;
            int i34 = (~i33) & (i31 | i32);
            int i35 = (i34 ^ i33) | (i33 & i34);
            int i36 = ~i35;
            int i37 = (i35 | i36) & i36;
            int i38 = ~((i31 ^ i26) | (i31 & i26));
            int i39 = i32 ^ i26;
            int i40 = ~i26;
            int i41 = i32 & i26;
            int i42 = (((~((i39 ^ i41) | (i39 & i41))) | (i37 ^ i38) | (i37 & i38)) * (-397)) + i30;
            int i43 = -(-(i38 * (-397)));
            int i44 = ((i42 ^ i43) - (~(-(-((i43 & i42) << 1))))) - 1;
            int i45 = ~(i26 | i31);
            int i46 = iIdentityHashCode & i45;
            int i47 = (iIdentityHashCode | i45) & (~i46);
            int i48 = (i47 & i46) | (i47 ^ i46);
            int i49 = (i31 & i40) | ((~i40) & i24);
            int i50 = i40 & i24;
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = ~i51;
            int i53 = (i51 | i52) & i52;
            if (j10 > (i44 - (~(((i53 & i48) | (((~i53) & i48) | ((~i48) & i53))) * 397))) - 1) {
                int i54 = f56367w0 + 47;
                f56368x0 = i54 % 128;
                if (i54 % 2 == 0) {
                    ia.setDividerPadding(new Object[]{"time limits exceeded"}, 1145363429, -1145363429, (int) System.currentTimeMillis());
                    cv.setDividerPadding(new Object[]{cvVar2}, 446051343, -446051330, System.identityHashCode(cvVar2));
                    int i55 = 54 / 0;
                } else {
                    ia.setDividerPadding(new Object[]{"time limits exceeded"}, 1145363429, -1145363429, (int) System.currentTimeMillis());
                    cv.setDividerPadding(new Object[]{cvVar2}, 446051343, -446051330, System.identityHashCode(cvVar2));
                }
                int i56 = f56368x0;
                int i57 = (i56 & 15) + (i56 | 15);
                f56367w0 = i57 % 128;
                int i58 = i57 % 2;
            }
            ia iaVar = aVar2.f56372s0;
            gv gvVar = (gv) ia.setDividerPadding(new Object[]{iaVar}, 552527183, -552527178, (int) System.currentTimeMillis());
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], 231627235, -231627203, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            Intrinsics.checkNotNull(getbeeponfailure);
            int iIntValue = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
            gv gvVar2 = (gv) ia.setDividerPadding(new Object[]{iaVar}, 552527183, -552527178, (int) System.currentTimeMillis());
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, (TransactionFailed) setAnimation.setY(new Object[0], 177432468, -177432400, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar2));
            Intrinsics.checkNotNull(getbeeponfailure2);
            int iIntValue2 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
            StringBuilder sb2 = new StringBuilder("deviceTimeRapdu: ");
            int i59 = aVar2.f56373t0;
            sb2.append(i59);
            sb2.append(", terminalTimeRapdu: ");
            int i60 = aVar2.f56374u0;
            sb2.append(i60);
            sb2.append(", transmissionTimeMismatch: ");
            sb2.append(iIntValue);
            ia.setDividerPadding(new Object[]{sb2.toString()}, 1145363429, -1145363429, (int) System.currentTimeMillis());
            StringBuilder sb3 = new StringBuilder("measuredRelayResistanceProcessingTime: ");
            long j11 = aVar2.f56369p0;
            sb3.append(j11);
            sb3.append(", minRelayProcessingTime: ");
            int i61 = aVar2.v0;
            sb3.append(i61);
            sb3.append(", accuracy: ");
            sb3.append(iIntValue2);
            ia.setDividerPadding(new Object[]{sb3.toString()}, 1145363429, -1145363429, (int) System.currentTimeMillis());
            Object objValueOf2 = Constant.DASH_STRING;
            if (i60 != 0) {
                int i62 = f56367w0;
                int i63 = (i62 & 5) + (i62 | 5);
                int i64 = i63 % 128;
                f56368x0 = i64;
                if (i63 % 2 != 0 ? (i59 * 100) / i60 >= iIntValue : ((i59 >> 90) >>> i60) >= iIntValue) {
                    int i65 = (i64 ^ 5) + ((i64 & 5) << 1);
                    f56367w0 = i65 % 128;
                    int i66 = i65 % 2;
                    z12 = false;
                } else {
                    int i67 = i64 & 99;
                    int i68 = -(-((i64 ^ 99) | i67));
                    int i69 = (i67 & i68) + (i68 | i67);
                    f56367w0 = i69 % 128;
                    int i70 = i69 % 2;
                    z12 = true;
                }
                objValueOf = Boolean.valueOf(z12);
                int i71 = f56368x0;
                int i72 = i71 & 39;
                int i73 = i71 | 39;
                int i74 = (i72 & i73) + (i73 | i72);
                f56367w0 = i74 % 128;
                int i75 = i74 % 2;
            } else {
                int i76 = f56368x0;
                int i77 = i76 & 79;
                int i78 = -(-((i76 ^ 79) | i77));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                f56367w0 = i79 % 128;
                int i80 = i79 % 2;
                objValueOf = Constant.DASH_STRING;
            }
            ia.setDividerPadding(new Object[]{Intrinsics.stringPlus("deviceTimeRapdu * 100 / terminalTimeRapdu < transmissionTimeMismatch: ", objValueOf)}, 1145363429, -1145363429, (int) System.currentTimeMillis());
            if (i59 != 0) {
                int i81 = f56367w0;
                int i82 = (i81 & 79) + (i81 | 79);
                int i83 = i82 % 128;
                f56368x0 = i83;
                if (i82 % 2 != 0 ? (i60 * 100) / i59 >= iIntValue : (i60 % 117) * i59 >= iIntValue) {
                    int i84 = i81 & 61;
                    int i85 = i81 | 61;
                    int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
                    f56368x0 = i86 % 128;
                    int i87 = i86 % 2;
                    z11 = false;
                } else {
                    int i88 = ((i83 | 99) << 1) - (i83 ^ 99);
                    f56367w0 = i88 % 128;
                    int i89 = i88 % 2;
                    z11 = true;
                }
                objValueOf2 = Boolean.valueOf(z11);
                int i90 = f56367w0;
                int i91 = i90 & 93;
                int i92 = (i90 | 93) & (~i91);
                int i93 = -(-(i91 << 1));
                int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                f56368x0 = i94 % 128;
                int i95 = i94 % 2;
            } else {
                int i96 = f56367w0 + 87;
                f56368x0 = i96 % 128;
                int i97 = i96 % 2;
            }
            ia.setDividerPadding(new Object[]{Intrinsics.stringPlus("terminalTimeRapdu * 100 / deviceTimeRapdu < transmissionTimeMismatch: ", objValueOf2)}, 1145363429, -1145363429, (int) System.currentTimeMillis());
            long j12 = i61;
            long j13 = j11 - j12;
            long j14 = iIntValue2;
            if (Math.max(0L, j13) > j14) {
                int i98 = f56368x0 + 25;
                int i99 = i98 % 128;
                f56367w0 = i99;
                int i100 = i98 % 2;
                int i101 = ((i99 | 93) << 1) - (i99 ^ 93);
                f56368x0 = i101 % 128;
                int i102 = i101 % 2;
                z10 = true;
            } else {
                int i103 = f56367w0;
                int i104 = (((i103 | 74) << 1) - (i103 ^ 74)) - 1;
                f56368x0 = i104 % 128;
                int i105 = i104 % 2;
                z10 = false;
            }
            ia.setDividerPadding(new Object[]{Intrinsics.stringPlus("max(0, measuredRelayResistanceProcessingTime - minRelayProcessingTime) > accuracy: ", Boolean.valueOf(z10))}, 1145363429, -1145363429, (int) System.currentTimeMillis());
            if (i59 != 0) {
                int i106 = f56368x0;
                int i107 = ((i106 ^ 111) - (~((i106 & 111) << 1))) - 1;
                int i108 = i107 % 128;
                f56367w0 = i108;
                int i109 = i107 % 2;
                if (i60 != 0) {
                    int i110 = (i108 & 46) + (i108 | 46);
                    int i111 = (i110 ^ (-1)) + (i110 << 1);
                    int i112 = i111 % 128;
                    f56368x0 = i112;
                    if (i111 % 2 != 0 ? (i59 * 100) / i60 < iIntValue : ((i59 / 56) >>> i60) < iIntValue) {
                        cv.setDividerPadding(new Object[]{cvVar2}, 219845722, -219845708, System.identityHashCode(cvVar2));
                        int i113 = f56367w0;
                        int i114 = ((i113 | 1) << 1) - (i113 ^ 1);
                        f56368x0 = i114 % 128;
                        int i115 = i114 % 2;
                    } else if ((i60 * 100) / i59 >= iIntValue) {
                        int i116 = (i112 ^ 111) + ((i112 & 111) << 1);
                        f56367w0 = i116 % 128;
                        if (i116 % 2 == 0 ? Math.max(0L, j13) > j14 : Math.max(1L, j11 % j12) > j14) {
                            cv.setDividerPadding(new Object[]{cvVar2}, 219845722, -219845708, System.identityHashCode(cvVar2));
                            int i117 = f56367w0;
                            int i118 = ((i117 | 1) << 1) - (i117 ^ 1);
                            f56368x0 = i118 % 128;
                            int i119 = i118 % 2;
                        }
                    } else {
                        cv.setDividerPadding(new Object[]{cvVar2}, 219845722, -219845708, System.identityHashCode(cvVar2));
                        int i1110 = f56367w0;
                        int i1111 = ((i1110 | 1) << 1) - (i1110 ^ 1);
                        f56368x0 = i1111 % 128;
                        int i1112 = i1111 % 2;
                    }
                    i13 = 2;
                } else {
                    cv.setDividerPadding(new Object[]{cvVar2}, 219845722, -219845708, System.identityHashCode(cvVar2));
                    int i120 = f56367w0;
                    int i121 = (i120 & 111) + (i120 | 111);
                    f56368x0 = i121 % 128;
                    i13 = 2;
                    int i122 = i121 % 2;
                }
            } else {
                cv.setDividerPadding(new Object[]{cvVar2}, 219845722, -219845708, System.identityHashCode(cvVar2));
                int i123 = f56367w0;
                int i124 = (i123 & 111) + (i123 | 111);
                f56368x0 = i124 % 128;
                i13 = 2;
                int i125 = i124 % 2;
            }
            cl clVar = cl.RRP_PERFORMED;
            Object[] objArr3 = new Object[i13];
            objArr3[0] = cvVar2;
            objArr3[1] = clVar;
            cv.setDividerPadding(objArr3, 1192679248, -1192679220, System.identityHashCode(cvVar2));
            int i126 = f56367w0;
            int i127 = i126 ^ 115;
            int i128 = ((i126 & 115) | i127) << 1;
            int i129 = -i127;
            int i130 = (i128 & i129) + (i128 | i129);
            f56368x0 = i130 % 128;
            if (i130 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1172175804, 1172175804, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull io ioVar, @NotNull gz gzVar, @NotNull et etVar, @NotNull component17 component17Var) {
        super(gvVar, settextkeepstate, exVar, getvalue);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        Intrinsics.checkNotNullParameter(gzVar, "");
        Intrinsics.checkNotNullParameter(etVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56363i = ioVar;
        this.f56364j = gzVar;
        this.f56365k = etVar;
        this.f56366l = component17Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r2v90, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ fk a(Object[] objArr) throws Exception {
        int i10;
        boolean z10;
        ia iaVar = (ia) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int i11 = f56362n;
        int i12 = ((i11 & 8) + (i11 | 8)) - 1;
        m = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(setrotationx, "");
        iaVar.f56363i.setX();
        if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
            int i14 = f56362n;
            int i15 = (i14 ^ 74) + ((i14 & 74) << 1);
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            m = i16 % 128;
            if (i16 % 2 == 0) {
                return (fk) setDividerPadding(new Object[]{iaVar, (gv) iaVar.setOnFocusChangeListener(), iaVar.setCompoundDrawableTintBlendMode(), setrotationx}, -618522396, 618522397, System.identityHashCode(iaVar));
            }
            throw null;
        }
        if (((byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx))).length > 11) {
            int i17 = m;
            int i18 = (i17 ^ 21) + ((i17 & 21) << 1);
            f56362n = i18 % 128;
            int i19 = i18 % 2;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                int i20 = f56362n;
                int i21 = i20 & 9;
                int i22 = (i20 | 9) & (~i21);
                int i23 = i21 << 1;
                int i24 = (i22 & i23) + (i22 | i23);
                m = i24 % 128;
                int i25 = i24 % 2;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2))).length == 10) {
                    getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx}, -707146526, 707146527, System.identityHashCode(setrotationx));
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1857230607, 1857230841, (int) System.currentTimeMillis());
                    String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
                    Boolean bool = Boolean.FALSE;
                    getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str2, null, null, bool, 30}, -976227287, 976227290, 30);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(0, 3))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure4));
                    gv gvVar = (gv) iaVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, getbeeponfailure4}, 2008358388, -2008358355, System.identityHashCode(gvVar));
                    TransactionFailed textSelectHandle = setAnimation.setTextSelectHandle();
                    getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{textSelectHandle}, 1914607362, -1914607356, System.identityHashCode(textSelectHandle)), null, null, bool, 30}, -976227287, 976227290, 30);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(4, 5))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure5));
                    gv gvVar2 = (gv) iaVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar2, getbeeponfailure5}, 2008358388, -2008358355, System.identityHashCode(gvVar2));
                    TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1812116409, 1812116691, (int) System.currentTimeMillis());
                    getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), null, null, bool, 30}, -976227287, 976227290, 30);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(6, 7))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure6));
                    gv gvVar3 = (gv) iaVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar3, getbeeponfailure6}, 2008358388, -2008358355, System.identityHashCode(gvVar3));
                    TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1573576045, 1573576329, (int) System.currentTimeMillis());
                    getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)), null, null, bool, 30}, -976227287, 976227290, 30);
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7, ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(8, 9))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure7));
                    gv gvVar4 = (gv) iaVar.setOnFocusChangeListener();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar4, getbeeponfailure7}, 2008358388, -2008358355, System.identityHashCode(gvVar4));
                    int i26 = m;
                    int i27 = i26 & 17;
                    int i28 = i27 + ((i26 ^ 17) | i27);
                    f56362n = i28 % 128;
                    int i29 = i28 % 2;
                    gv gvVar5 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar5, (TransactionFailed) setAnimation.setY(new Object[0], -118459840, 118459878, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar5));
                    Intrinsics.checkNotNull(getbeeponfailure8);
                    int iIntValue = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8}, 252497730, -252497710, System.identityHashCode(getbeeponfailure8))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    gv gvVar6 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure9 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar6, (TransactionFailed) setAnimation.setY(new Object[0], -758464039, 758464168, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar6));
                    Intrinsics.checkNotNull(getbeeponfailure9);
                    int iIntValue2 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure9}, 252497730, -252497710, System.identityHashCode(getbeeponfailure9))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    gv gvVar7 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure10 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar7, (TransactionFailed) setAnimation.setY(new Object[0], -1573576045, 1573576329, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar7));
                    Intrinsics.checkNotNull(getbeeponfailure10);
                    int iIntValue3 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure10}, 252497730, -252497710, System.identityHashCode(getbeeponfailure10))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    io ioVar = iaVar.f56363i;
                    long jLongValue = ((Long) ig.setCompoundDrawableTintBlendMode(new Object[]{ioVar}, -817117433, 817117434, System.identityHashCode(ioVar))).longValue();
                    gv gvVar8 = (gv) iaVar.setOnFocusChangeListener();
                    long jLongValue2 = jLongValue - ((Long) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar8}, -784757618, 784757634, System.identityHashCode(gvVar8))).longValue();
                    long jMax = Math.max(0L, ((jLongValue2 / 100) - ((long) iIntValue)) - ((long) Math.min(iIntValue3, iIntValue2)));
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    StringBuilder sb2 = new StringBuilder("Measured RRP request time: ");
                    sb2.append(jLongValue);
                    sb2.append(", compensated: ");
                    sb2.append(jLongValue2);
                    sb2.append(", measuredRelayResistanceProcessingTime: ");
                    sb2.append(jMax);
                    SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[0], 516661945, -516661943, (int) System.currentTimeMillis());
                    gv gvVar9 = (gv) iaVar.setOnFocusChangeListener();
                    TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], -627273136, 627273362, (int) System.currentTimeMillis());
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar9, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5)), (byte[]) setInputExtras.setDividerPadding(new Object[]{Long.valueOf(jMax), 2}, 672373041, -672373041, 2), null, bool, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(gvVar9));
                    gv gvVar10 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure11 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar10, setAnimation.setSupportBackgroundTintList()}, -1593889019, 1593889062, System.identityHashCode(gvVar10));
                    Intrinsics.checkNotNull(getbeeponfailure11);
                    int iIntValue4 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure11}, 252497730, -252497710, System.identityHashCode(getbeeponfailure11))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    gv gvVar11 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure12 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar11, setAnimation.setTextSelectHandle()}, -1593889019, 1593889062, System.identityHashCode(gvVar11));
                    Intrinsics.checkNotNull(getbeeponfailure12);
                    int iIntValue5 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure12}, 252497730, -252497710, System.identityHashCode(getbeeponfailure12))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    int i30 = -(~(-iIntValue4));
                    if (jMax < Math.max(0, (-2) - (((iIntValue5 ^ i30) + ((i30 & iIntValue5) << 1)) ^ (-1)))) {
                        int i31 = f56362n + 111;
                        m = i31 % 128;
                        int i32 = i31 % 2;
                        setDividerPadding(new Object[0], 516661945, -516661943, (int) System.currentTimeMillis());
                        et.setDividerPadding(new Object[]{(gv) iaVar.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                        ex exVar = (ex) iaVar.setX();
                        ?? onFocusChangeListener = iaVar.setOnFocusChangeListener();
                        setTextKeepState compoundDrawableTintBlendMode = iaVar.setCompoundDrawableTintBlendMode();
                        activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                        fk dividerPadding = ex.setDividerPadding(exVar, onFocusChangeListener, compoundDrawableTintBlendMode, activatesession, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession, null, null, setContentCaptureSession.setOnLongClickListener, null, null, null, null, null, null, false, false, 4191824);
                        int iIdentityHashCode = System.identityHashCode(iaVar);
                        int i33 = ~iIdentityHashCode;
                        int i34 = ((~i33) & (-1414667634)) | (1414667633 & i33);
                        int i35 = (-1414667634) & i33;
                        int i36 = (i34 & i35) | (i34 ^ i35);
                        int i37 = ~i36;
                        int i38 = (i36 | i37) & i37;
                        int i39 = 199991624 ^ iIdentityHashCode;
                        int i40 = 199991624 & iIdentityHashCode;
                        int i41 = (i39 & i40) | (i39 ^ i40);
                        int i42 = ~i41;
                        int i43 = (i41 | i42) & i42;
                        int i44 = i38 & i43;
                        int i45 = (i38 | i43) & (~i44);
                        int i46 = (((i45 & i44) | (i45 ^ i44)) * (-370)) - 326767112;
                        int i47 = 199991624 ^ i33;
                        int i48 = i33 & 199991624;
                        int i49 = ~((i48 & i47) | (i47 ^ i48));
                        int i50 = (iIdentityHashCode & (-1414667634)) | ((-1414667634) ^ iIdentityHashCode);
                        int i51 = ~i50;
                        int i52 = (i50 | i51) & i51;
                        int i53 = i49 & i52;
                        int i54 = (i52 | i49) & (~i53);
                        int i55 = (i54 & i53) | (i54 ^ i53);
                        int i56 = ((-195665929) & i55) | ((~i55) & 195665928);
                        int i57 = i55 & 195665928;
                        int i58 = -(-(((i57 & i56) | (i56 ^ i57)) * (-370)));
                        int i59 = i46 & i58;
                        int i60 = -(-(i58 | i46));
                        int i61 = (i59 & i60) + (i60 | i59);
                        int i62 = (i61 ^ (-618050672)) + (((-618050672) & i61) << 1);
                        int iIdentityHashCode2 = System.identityHashCode(iaVar);
                        int i63 = ~iIdentityHashCode2;
                        int i64 = (i63 ^ 995651317) | (i63 & 995651317);
                        int i65 = i64 & (-171875692);
                        int i66 = (i64 | (-171875692)) & (~i65);
                        int i67 = ~((i66 & i65) | (i66 ^ i65));
                        int i68 = 826303124 & i67;
                        int i69 = -(-((((i67 | 826303124) & (~i68)) | i68) * 220));
                        int i70 = (((-18320155) | i69) << 1) - (i69 ^ (-18320155));
                        int i71 = (i63 | iIdentityHashCode2) & i63;
                        int i72 = (171875691 & i71) | ((~i71) & (-171875692));
                        int i73 = i71 & (-171875692);
                        int i74 = (i73 & i72) | (i72 ^ i73);
                        int i75 = ~i74;
                        int i76 = (i74 | i75) & i75;
                        int i77 = 995651317 & i76;
                        int i78 = (995651317 | i76) & (~i77);
                        int i79 = -(-(((i78 & i77) | (i78 ^ i77)) * (-440)));
                        int i80 = i70 & i79;
                        int i81 = -(-((i79 ^ i70) | i80));
                        int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                        int i83 = -(-(((iIdentityHashCode2 & (-2527499)) | (i63 & (-2527499)) | (2527498 & iIdentityHashCode2)) * 220));
                        int i84 = ((i82 ^ i83) | (i82 & i83)) << 1;
                        int i85 = -((i83 & (~i82)) | ((~i83) & i82));
                        if (i62 <= ((i84 | i85) << 1) - (i85 ^ i84)) {
                            int i86 = 50 / 0;
                        }
                        return dividerPadding;
                    }
                    gv gvVar12 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure13 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar12, (TransactionFailed) setAnimation.setY(new Object[0], -1875940328, 1875940526, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar12));
                    Intrinsics.checkNotNull(getbeeponfailure13);
                    int iIntValue6 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure13}, 252497730, -252497710, System.identityHashCode(getbeeponfailure13))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    gv gvVar13 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure14 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar13, (TransactionFailed) setAnimation.setY(new Object[0], -1812116409, 1812116691, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar13));
                    Intrinsics.checkNotNull(getbeeponfailure14);
                    int iIntValue7 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure14}, 252497730, -252497710, System.identityHashCode(getbeeponfailure14))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    gv gvVar14 = (gv) iaVar.setOnFocusChangeListener();
                    getBeepOnFailure getbeeponfailure15 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar14, setAnimation.getPinPadConfiguration()}, -1593889019, 1593889062, System.identityHashCode(gvVar14));
                    Intrinsics.checkNotNull(getbeeponfailure15);
                    int iIntValue8 = ((Integer) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure15}, 252497730, -252497710, System.identityHashCode(getbeeponfailure15))}, -1792313771, 1792313778, (int) System.currentTimeMillis())).intValue();
                    setDividerPadding(new Object[0], 516661945, -516661943, (int) System.currentTimeMillis());
                    int iIdentityHashCode3 = System.identityHashCode(iaVar);
                    int i87 = ((iIntValue6 * (-519)) - (~(iIntValue7 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))) - 1;
                    int i88 = ~iIntValue6;
                    int i89 = ~iIntValue7;
                    int i90 = i88 ^ i89;
                    int i91 = i88 & i89;
                    int i92 = (i90 ^ i91) | (i90 & i91);
                    int i93 = ~iIdentityHashCode3;
                    int i94 = i92 | i93;
                    int i95 = ~i94;
                    int i96 = i95 & (i94 | i95);
                    int i97 = iIntValue7 ^ iIdentityHashCode3;
                    int i98 = iIntValue7 & iIdentityHashCode3;
                    int i99 = ~((i97 ^ i98) | (i97 & i98));
                    int i100 = i96 & i99;
                    int i101 = (i96 | i99) & (~i100);
                    int i102 = (i87 - (~(-(~(-(-(((i101 & i100) | (i101 ^ i100)) * 520))))))) - 1;
                    int i103 = (i102 ^ (-1)) + (i102 << 1);
                    int i104 = i89 ^ i93;
                    int i105 = i89 & i93;
                    int i106 = ~((i104 & i105) | (i104 ^ i105));
                    int i107 = iIntValue6 & iIdentityHashCode3;
                    int i108 = ~(((~i107) & (iIntValue6 | iIdentityHashCode3)) | i107);
                    int i109 = ((~i108) & i106) | ((~i106) & i108);
                    int i110 = i106 & i108;
                    int i111 = -(-(((i109 & i110) | (i109 ^ i110)) * (-1040)));
                    int i112 = i103 & i111;
                    int i113 = (i111 ^ i103) | i112;
                    int i114 = (i112 & i113) + (i113 | i112);
                    int i115 = (i88 ^ i93) | (i88 & i93);
                    int i116 = ~i115;
                    int i117 = (i115 | i116) & i116;
                    int i118 = i89 & iIntValue6;
                    int i119 = (~i118) & (i89 | iIntValue6);
                    int i120 = ~((i118 & i119) | (i119 ^ i118));
                    int i121 = (i117 & i120) | (i117 ^ i120);
                    int i122 = (iIdentityHashCode3 & i88) | (iIntValue6 & i93);
                    int i123 = ~((i122 & i107) | (i122 ^ i107));
                    int i124 = -(-(((i121 & i123) | ((~i123) & i121) | ((~i121) & i123)) * 520));
                    int i125 = i114 ^ i124;
                    int i126 = ((i124 & i114) | i125) << 1;
                    int i127 = -i125;
                    if (jMax > (i126 & i127) + (i126 | i127)) {
                        int i128 = f56362n;
                        int i129 = (i128 ^ 29) + ((i128 & 29) << 1);
                        m = i129 % 128;
                        int i130 = i129 % 2;
                        i10 = 2;
                        z10 = true;
                    } else {
                        int i131 = m;
                        int i132 = i131 & 49;
                        int i133 = i132 + ((i131 ^ 49) | i132);
                        f56362n = i133 % 128;
                        i10 = 2;
                        int i134 = i133 % 2;
                        z10 = false;
                    }
                    Intrinsics.stringPlus("measuredRelayResistanceProcessingTime > (maxRelayProcessingTime + maxGracePeriod): ", Boolean.valueOf(z10));
                    setDividerPadding(new Object[0], 516661945, -516661943, (int) System.currentTimeMillis());
                    if (iIntValue8 < i10) {
                        int i135 = f56362n;
                        int i136 = ((i135 & 30) + (i135 | 30)) - 1;
                        m = i136 % 128;
                        int i137 = i136 % i10;
                        int iIdentityHashCode4 = System.identityHashCode(iaVar);
                        int i138 = (iIntValue7 * (-520)) + (iIntValue6 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
                        int i139 = ~iIdentityHashCode4;
                        int i140 = (i139 | iIdentityHashCode4) & i139;
                        int i141 = i140 ^ iIntValue7;
                        int i142 = i140 & iIntValue7;
                        int i143 = ~((i142 & i141) | (i141 ^ i142));
                        int i144 = iIntValue6 & i143;
                        int i145 = (i143 | iIntValue6) & (~i144);
                        int i146 = -(~(-(-(((i145 & i144) | (i145 ^ i144)) * (-1042)))));
                        int i147 = (((i138 | i146) << 1) - (i138 ^ i146)) - 1;
                        int i148 = iIntValue7 & iIdentityHashCode4;
                        int i149 = (~i148) & (iIntValue7 | iIdentityHashCode4);
                        int i150 = ((i148 & i149) | (i149 ^ i148)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i151 = i147 & i150;
                        int i152 = (i150 | i147) & (~i151);
                        int i153 = -(-(i151 << 1));
                        int i154 = ((i152 | i153) << 1) - (i152 ^ i153);
                        int i155 = ~i92;
                        int i156 = (i92 | i155) & i155;
                        int i157 = i88 & iIdentityHashCode4;
                        int i158 = (iIdentityHashCode4 | i88) & (~i157);
                        int i159 = ~((i158 & i157) | (i158 ^ i157));
                        int i160 = ((~i159) & i156) | ((~i156) & i159);
                        int i161 = i159 & i156;
                        int i162 = (i161 & i160) | (i160 ^ i161);
                        int i163 = (i139 ^ iIntValue6) | (i139 & iIntValue6);
                        int i164 = i163 & iIntValue7;
                        int i165 = (i163 | iIntValue7) & (~i164);
                        int i166 = ~((i165 & i164) | (i165 ^ i164));
                        int i167 = ((~i166) & i162) | ((~i162) & i166);
                        int i168 = i162 & i166;
                        int i169 = -(-(((i168 & i167) | (i167 ^ i168)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                        int i170 = i154 ^ i169;
                        int i171 = ((i169 & i154) | i170) << 1;
                        int i172 = -i170;
                        if (jMax > (i171 ^ i172) + ((i171 & i172) << 1)) {
                            gv gvVar15 = (gv) iaVar.setOnFocusChangeListener();
                            getBeepOnFailure getbeeponfailure16 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar15, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar15));
                            Intrinsics.checkNotNull(getbeeponfailure16);
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure16, (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{iaVar.f56366l}, -811017857, 811017857, (int) System.currentTimeMillis())}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure16));
                            gv gvVar16 = (gv) iaVar.setOnFocusChangeListener();
                            getBeepOnFailure getbeeponfailure17 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar16, (TransactionFailed) setAnimation.setY(new Object[0], -1184491080, 1184491325, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar16));
                            Intrinsics.checkNotNull(getbeeponfailure17);
                            gv gvVar17 = (gv) iaVar.setOnFocusChangeListener();
                            getBeepOnFailure getbeeponfailure18 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar17, (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar17));
                            Intrinsics.checkNotNull(getbeeponfailure18);
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure17, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure18}, 252497730, -252497710, System.identityHashCode(getbeeponfailure18))}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure17));
                            int iIdentityHashCode5 = System.identityHashCode(iaVar);
                            int i173 = -(-(iIntValue8 * 881));
                            int i174 = 881 & i173;
                            int i175 = (i173 | 881) & (~i174);
                            int i176 = i174 << 1;
                            int i177 = ((i175 | i176) << 1) - (i175 ^ i176);
                            int i178 = ~iIntValue8;
                            int i179 = (-2) & i178;
                            int i180 = i179 | ((~i179) & ((-2) | i178));
                            int i181 = ~i180;
                            int i182 = (i180 | i181) & i181;
                            int i183 = ~iIdentityHashCode5;
                            int i184 = (-2) & i183;
                            int i185 = iIdentityHashCode5 & 1;
                            int i186 = (-2) & iIdentityHashCode5;
                            int i187 = ~(i184 | i185 | i186);
                            int i188 = ((~i187) & i182) | ((~i182) & i187);
                            int i189 = i187 & i182;
                            int i190 = (i189 & i188) | (i188 ^ i189);
                            int i191 = i178 & (i178 | iIntValue8);
                            int i192 = i191 & iIdentityHashCode5;
                            int i193 = ~(((iIdentityHashCode5 | i191) & (~i192)) | i192);
                            int i194 = (i177 - (~(((i193 & i190) | (i190 ^ i193)) * (-880)))) - 1;
                            int i195 = ~(((-2) ^ i183) | i184);
                            int i196 = iIntValue8 ^ i195;
                            int i197 = iIntValue8 & i195;
                            int i198 = (i197 & i196) | (i196 ^ i197);
                            int i199 = (i183 & 1) | i186;
                            int i200 = (i199 & i185) | (i199 ^ i185);
                            int i201 = ~i200;
                            int i202 = (i200 | i201) & i201;
                            int i203 = ((i198 & i202) | (i198 ^ i202)) * (-880);
                            int i204 = (i194 & i203) + (i203 | i194);
                            int i205 = -(-(i202 * 880));
                            int i206 = i204 & i205;
                            int i207 = -(-((i205 ^ i204) | i206));
                            int i208 = ((i206 | i207) << 1) - (i207 ^ i206);
                            gv gvVar18 = (gv) iaVar.setOnFocusChangeListener();
                            getBeepOnFailure getbeeponfailure19 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar18, setAnimation.getPinPadConfiguration()}, -1593889019, 1593889062, System.identityHashCode(gvVar18));
                            Intrinsics.checkNotNull(getbeeponfailure19);
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure19, (byte[]) setInputExtras.setDividerPadding(new Object[]{Integer.valueOf(i208)}, -1690212590, 1690212600, i208)}, 1851855986, -1851855964, System.identityHashCode(getbeeponfailure19));
                            getBeepOnFailure dividerPadding2 = ((gv) iaVar.setOnFocusChangeListener()).setDividerPadding(setAnimation.component34());
                            Intrinsics.checkNotNull(dividerPadding2);
                            setHasTransientState sethastransientstate = new setHasTransientState(dividerPadding2.setOnFocusChangeListener());
                            ig.setCompoundDrawableTintBlendMode(new Object[]{ioVar}, -1285585610, 1285585610, System.identityHashCode(ioVar));
                            iaVar.setY().setOnFocusChangeListener(sethastransientstate);
                            fk fkVar = fk.getNavBarTitleString;
                            int i209 = m;
                            int i210 = (i209 & 67) + (i209 | 67);
                            f56362n = i210 % 128;
                            if (i210 % 2 != 0) {
                                return fkVar;
                            }
                            throw null;
                        }
                    }
                    cz czVar = new cz(iaVar.setOnFocusChangeListener());
                    hr hrVar = new hr((ex) iaVar.setX());
                    fk fkVar2 = (fk) hr.setOnFocusChangeListener(new Object[]{hrVar, (gv) iaVar.setOnFocusChangeListener(), iaVar.setCompoundDrawableTintBlendMode(), iaVar.f56364j, iaVar.setY()}, -1673391252, 1673391253, System.identityHashCode(hrVar));
                    int i211 = f56362n + 65;
                    m = i211 % 128;
                    int i212 = i211 % 2;
                    return fkVar2;
                }
            }
        }
        int i213 = f56362n;
        int i214 = (-2) - ((i213 + 84) ^ (-1));
        m = i214 % 128;
        int i215 = i214 % 2;
        int i216 = (i213 & 45) + (i213 | 45);
        m = i216 % 128;
        if (i216 % 2 != 0) {
            throw null;
        }
        fk fkVar3 = (fk) setDividerPadding(new Object[]{iaVar, (gv) iaVar.setOnFocusChangeListener(), iaVar.setCompoundDrawableTintBlendMode()}, -20380088, 20380091, System.identityHashCode(iaVar));
        int i217 = m;
        int i218 = ((i217 | 49) << 1) - (i217 ^ 49);
        f56362n = i218 % 128;
        if (i218 % 2 != 0) {
            return fkVar3;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object compoundDrawableTintBlendMode;
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        switch ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14) {
            case 1:
                ia iaVar = (ia) objArr[0];
                gv gvVar = (gv) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                setRotationX setrotationx = (setRotationX) objArr[3];
                int i18 = f56362n + 61;
                m = i18 % 128;
                int i19 = i18 % 2;
                et etVar = iaVar.f56365k;
                et.setDividerPadding(new Object[]{gvVar}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex exVar = (ex) iaVar.setX();
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                fk dividerPadding = ex.setDividerPadding(exVar, gvVar, settextkeepstate, activatesession, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession, null, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), setContentCaptureSession.setLayoutAnimation, null, null, null, null, null, null, false, false, 4190800);
                int i20 = f56362n + 19;
                m = i20 % 128;
                int i21 = i20 % 2;
                return dividerPadding;
            case 2:
                int i22 = m;
                int i23 = ((((i22 ^ 89) | (i22 & 89)) << 1) - (~(-(((~i22) & 89) | (i22 & (-90)))))) - 1;
                f56362n = i23 % 128;
                int i24 = i23 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i25 = f56362n + 9;
                m = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 3:
                ia iaVar2 = (ia) objArr[0];
                gv gvVar2 = (gv) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                int i27 = (-2) - ((m + 12) ^ (-1));
                f56362n = i27 % 128;
                int i28 = i27 % 2;
                et etVar2 = iaVar2.f56365k;
                et.setDividerPadding(new Object[]{gvVar2}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex exVar2 = (ex) iaVar2.setX();
                activateSession activatesession2 = activateSession.ERROR_OTHER_CARD;
                fk dividerPadding2 = ex.setDividerPadding(exVar2, gvVar2, settextkeepstate2, activatesession2, ValueQualifier.setY, null, fd.END_APPLICATION, null, Boolean.TRUE, activatesession2, null, null, setContentCaptureSession.setNavigationOnClickListener, null, null, null, null, null, null, false, false, 4191824);
                int i29 = m;
                int i30 = ((i29 | 123) << 1) - (i29 ^ 123);
                f56362n = i30 % 128;
                int i31 = i30 % 2;
                return dividerPadding2;
            case 4:
                ia iaVar3 = (ia) objArr[0];
                setRotationX setrotationx2 = (setRotationX) objArr[1];
                int i32 = m;
                int i33 = (i32 & (-18)) | ((~i32) & 17);
                int i34 = -(-((i32 & 17) << 1));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                f56362n = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(setrotationx2, "");
                iaVar3.f56363i.setX();
                et.setDividerPadding(new Object[]{(gv) iaVar3.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                ex exVar3 = (ex) iaVar3.setX();
                gv gvVar3 = (gv) iaVar3.setOnFocusChangeListener();
                setTextKeepState compoundDrawableTintBlendMode2 = iaVar3.setCompoundDrawableTintBlendMode();
                activateSession activatesession3 = activateSession.PRESENT_CARD_AGAIN;
                ValueQualifier valueQualifier = ValueQualifier.setOnFocusChangeListener;
                byte[] bArr = new byte[3];
                int i37 = f56362n;
                int i38 = ((((i37 ^ 17) | (i37 & 17)) << 1) - (~(-(((~i37) & 17) | (i37 & (-18)))))) - 1;
                m = i38 % 128;
                int i39 = i38 % 2;
                while (true) {
                    int i40 = 0;
                    while (true) {
                        if (i40 >= 3) {
                            fk dividerPadding3 = ex.setDividerPadding(exVar3, gvVar3, compoundDrawableTintBlendMode2, activatesession3, valueQualifier, bArr, fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.FALSE, activateSession.PRESENT_CARD_AGAIN, (setItemChecked) setRotationX.setX(new Object[]{setrotationx2}, 2020716727, -2020716721, System.identityHashCode(setrotationx2)), null, null, null, null, null, null, null, null, false, false, 4193280);
                            int i41 = m;
                            int i42 = i41 & 47;
                            int i43 = i41 | 47;
                            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                            f56362n = i44 % 128;
                            int i45 = i44 % 2;
                            return dividerPadding3;
                        }
                        int i46 = m;
                        int i47 = i46 & 67;
                        int i48 = (i46 ^ 67) | i47;
                        int i49 = (i47 & i48) + (i48 | i47);
                        f56362n = i49 % 128;
                        if (i49 % 2 == 0) {
                        }
                        bArr[i40] = 0;
                        i40 = (i40 ^ 1) + ((i40 & 1) << 1);
                        break;
                    }
                    bArr[i40] = 0;
                }
                break;
            case 5:
                ia iaVar4 = (ia) objArr[0];
                int i50 = m;
                int i51 = ((i50 & 12) + (i50 | 12)) - 1;
                f56362n = i51 % 128;
                int i52 = i51 % 2;
                compoundDrawableTintBlendMode = (gv) iaVar4.setOnFocusChangeListener();
                int i53 = m;
                int i54 = (i53 & 116) + (i53 | 116);
                int i55 = (i54 ^ (-1)) + (i54 << 1);
                f56362n = i55 % 128;
                if (i55 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                return a(objArr);
            case 7:
                ia iaVar5 = (ia) objArr[0];
                int i56 = f56362n;
                int i57 = (((i56 | 112) << 1) - (i56 ^ 112)) - 1;
                m = i57 % 128;
                int i58 = i57 % 2;
                iaVar5.f56363i.setX();
                et.setDividerPadding(new Object[]{(gv) iaVar5.setOnFocusChangeListener()}, 338249870, -338249868, (int) System.currentTimeMillis());
                compoundDrawableTintBlendMode = ex.setCompoundDrawableTintBlendMode((ex) iaVar5.setX(), (gv) iaVar5.setOnFocusChangeListener(), iaVar5.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, null, false, 184);
                int i59 = f56362n + 80;
                int i60 = (i59 ^ (-1)) + (i59 << 1);
                m = i60 % 128;
                if (i60 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                int i61 = f56362n;
                int i62 = i61 & 19;
                int i63 = (i61 | 19) & (~i62);
                int i64 = i62 << 1;
                int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                m = i65 % 128;
                int i66 = i65 % 2;
                setDividerPadding(new Object[0], 516661945, -516661943, (int) System.currentTimeMillis());
                int i67 = f56362n + 11;
                m = i67 % 128;
                int i68 = i67 % 2;
                return null;
        }
        return compoundDrawableTintBlendMode;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, 1922176076, -1922176069, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -474955165, 474955171, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setX(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, -1258734669, 1258734673, System.identityHashCode(this));
    }

    public static final /* synthetic */ gv setDividerPadding(ia iaVar) {
        return (gv) setDividerPadding(new Object[]{iaVar}, 552527183, -552527178, (int) System.currentTimeMillis());
    }
}
