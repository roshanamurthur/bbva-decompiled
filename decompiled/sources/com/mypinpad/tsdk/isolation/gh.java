package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56016b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56017c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56018a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f56019p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56020q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56021r0 = 1;

        static {
            int i10 = f56021r0;
            int i11 = (i10 & 11) + (i10 | 11);
            f56020q0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 253) + (i10 * 253);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = i11 | i10;
            int i20 = ~(i12 | i19);
            if ((((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13 != 1) {
                cv cvVar = (cv) objArr[1];
                int i21 = f56021r0;
                int i22 = ((i21 ^ 90) + ((i21 & 90) << 1)) - 1;
                f56020q0 = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                int i24 = f56020q0;
                int i25 = i24 & 33;
                int i26 = (((i24 | 33) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
                f56021r0 = i26 % 128;
                int i27 = i26 % 2;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i28 = f56020q0 + 7;
            f56021r0 = i28 % 128;
            cv cvVar2 = (cv) obj;
            Object[] objArr2 = new Object[2];
            if (i28 % 2 != 0) {
                objArr2[0] = aVar;
                objArr2[1] = cvVar2;
                a(objArr2, 577428650, -577428650, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            objArr2[0] = aVar;
            objArr2[1] = cvVar2;
            a(objArr2, 577428650, -577428650, System.identityHashCode(aVar));
            int i29 = 77 / 0;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1269985090, 1269985091, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[ds.values().length];
            iArr[ds.setY.ordinal()] = 1;
            setX = iArr;
            int i10 = 51 % 128;
            int i11 = 51 % 2;
        }
    }

    public gh(@NotNull fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        this.f56018a = fiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00ac  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        byte[] bArr;
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        if (i15 == 1) {
            gh ghVar = (gh) objArr[0];
            aq aqVar = new aq(ghVar.f56018a);
            am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
            fi fiVar = ghVar.f56018a;
            cu cuVar = new cu(fiVar);
            if (setCompoundDrawableTintBlendMode.setX[((ds) setY(new Object[]{(cq) ((setImageTintList) w.setX(new Object[]{cuVar}, 1693919772, -1693919769, System.identityHashCode(cuVar))), amVar}, 1749489600, -1749489600, (int) System.currentTimeMillis())).ordinal()] == 1) {
                int i16 = f56016b;
                int i17 = i16 & 103;
                int i18 = (i16 ^ 103) | i17;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f56017c = i19 % 128;
                if (i19 % 2 == 0) {
                    ((Boolean) setY(new Object[]{ghVar}, -1309683472, 1309683475, System.identityHashCode(ghVar))).booleanValue();
                    throw null;
                }
                if (!((Boolean) setY(new Object[]{ghVar}, -1309683472, 1309683475, System.identityHashCode(ghVar))).booleanValue()) {
                    setY(new Object[]{ghVar}, -1474460044, 1474460046, System.identityHashCode(ghVar));
                    int i20 = f56017c + 97;
                    f56016b = i20 % 128;
                    int i21 = i20 % 2;
                    return null;
                }
            } else {
                cz czVar = new cz(fiVar);
                int i22 = f56017c;
                int i23 = i22 & 25;
                int i24 = i22 | 25;
                int i25 = (i23 & i24) + (i24 | i23);
                f56016b = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = f56016b;
            int i28 = i27 & 81;
            int i29 = (i27 ^ 81) | i28;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f56017c = i30 % 128;
            int i31 = i30 % 2;
            return null;
        }
        if (i15 == 2) {
            cz czVar2 = new cz(((gh) objArr[0]).f56018a);
            int i32 = f56017c;
            int i33 = (i32 & (-118)) | ((~i32) & 117);
            int i34 = (i32 & 117) << 1;
            int i35 = (i33 & i34) + (i34 | i33);
            f56016b = i35 % 128;
            if (i35 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i15 != 3) {
            cq cqVar = (cq) objArr[0];
            am amVar2 = (am) objArr[1];
            int i36 = f56017c;
            int i37 = i36 & 7;
            int i38 = (i36 | 7) & (~i37);
            int i39 = i37 << 1;
            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
            f56016b = i40 % 128;
            int i41 = i40 % 2;
            if (!(!((Boolean) am.setY(new Object[]{amVar2}, -452511308, 452511311, System.identityHashCode(amVar2))).booleanValue())) {
                int i42 = f56016b;
                int i43 = i42 & 95;
                int i44 = (i42 ^ 95) | i43;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                f56017c = i45 % 128;
                int i46 = i45 % 2;
                if (((Boolean) cq.setOnFocusChangeListener(new Object[]{cqVar}, 368924951, -368924943, System.identityHashCode(cqVar))).booleanValue()) {
                    int i47 = f56017c;
                    int i48 = ((-1) << 1) - ((-1) ^ ((i47 ^ 76) + ((i47 & 76) << 1)));
                    f56016b = i48 % 128;
                    int i49 = i48 % 2;
                    objValueOf = ds.setY;
                    int i50 = f56017c + 121;
                    f56016b = i50 % 128;
                    int i51 = i50 % 2;
                } else {
                    objValueOf = ds.setCompoundDrawableTintBlendMode;
                    int i52 = f56017c;
                    int i53 = (i52 ^ 65) + ((i52 & 65) << 1);
                    f56016b = i53 % 128;
                    int i54 = i53 % 2;
                }
            } else {
                objValueOf = ds.setCompoundDrawableTintBlendMode;
                int i55 = f56017c;
                int i56 = (i55 ^ 65) + ((i55 & 65) << 1);
                f56016b = i56 % 128;
                int i57 = i56 % 2;
            }
        } else {
            gh ghVar2 = (gh) objArr[0];
            int i58 = f56016b;
            int i59 = ((i58 | 31) << 1) - (i58 ^ 31);
            f56017c = i59 % 128;
            int i60 = i59 % 2;
            fi fiVar2 = ghVar2.f56018a;
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar2));
            if (getbeeponfailure == null) {
                int i61 = f56017c;
                int i62 = ((i61 ^ 27) | (i61 & 27)) << 1;
                int i63 = -((i61 & (-28)) | ((~i61) & 27));
                int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                f56016b = i64 % 128;
                if (i64 % 2 != 0) {
                    throw null;
                }
                int i65 = i61 & 75;
                int i66 = ((i61 ^ 75) | i65) << 1;
                int i67 = -((i61 | 75) & (~i65));
                int i68 = (i66 & i67) + (i67 | i66);
                f56016b = i68 % 128;
                int i69 = i68 % 2;
                bArr = null;
            } else {
                bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i70 = f56016b + 113;
                f56017c = i70 % 128;
                int i71 = i70 % 2;
            }
            if (bArr == null) {
                int i72 = f56017c;
                int i73 = i72 + 54;
                int i74 = (i73 ^ (-1)) + (i73 << 1);
                f56016b = i74 % 128;
                int i75 = i74 % 2;
                int i76 = i72 & 17;
                int i77 = i76 + ((i72 ^ 17) | i76);
                f56016b = i77 % 128;
                if (i77 % 2 != 0) {
                    throw null;
                }
            } else {
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
                fi fiVar3 = ghVar2.f56018a;
                byte[] bArr2 = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, transactionFailed}, -1344789201, 1344789222, System.identityHashCode(fiVar3));
                df dfVar = (df) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3}, -566041279, 566041293, System.identityHashCode(fiVar3));
                if (dfVar == null) {
                    int i78 = f56017c + 61;
                    f56016b = i78 % 128;
                    objValueOf = Boolean.valueOf(i78 % 2 != 0);
                } else {
                    du duVar = du.INSTANCE;
                    byte[] bArr3 = (byte[]) du.setOnFocusChangeListener(new Object[]{bArr, dfVar, bArr2}, -723868142, 723868153, (int) System.currentTimeMillis());
                    if (bArr3 == null) {
                        int i79 = f56017c;
                        int i80 = i79 & 109;
                        int i81 = -(-((i79 ^ 109) | i80));
                        int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                        int i83 = i82 % 128;
                        f56016b = i83;
                        int i84 = i82 % 2;
                        int i85 = i83 + 73;
                        f56017c = i85 % 128;
                        int i86 = i85 % 2;
                    } else {
                        fs.Companion companion = fs.INSTANCE;
                        boolean zBooleanValue = ((Boolean) fs.Companion.setX(new Object[]{bArr3}, 13367737, -13367737, (int) System.currentTimeMillis())).booleanValue();
                        dv dvVar = dv.INSTANCE;
                        dv.setOnFocusChangeListener(new Object[]{fiVar3, new fs(bArr3)}, -2054554965, 2054554965, (int) System.currentTimeMillis());
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 609943876, -609943849, (int) System.currentTimeMillis());
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (TransactionFailed) setAnimation.setY(new Object[0], 843474092, -843473889, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar3)), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(fiVar3));
                        int i87 = f56016b;
                        int i88 = i87 & 113;
                        int i89 = ((i87 | 113) & (~i88)) + (i88 << 1);
                        f56017c = i89 % 128;
                        if (i89 % 2 == 0) {
                            throw null;
                        }
                        objValueOf = Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            objValueOf = Boolean.FALSE;
        }
        return objValueOf;
    }

    public final void setDividerPadding() throws Exception {
        setY(new Object[]{this}, -574935641, 574935642, System.identityHashCode(this));
    }
}
