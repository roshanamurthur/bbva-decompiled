package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56674c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56675d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final iv f56676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56677b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f56678q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f56679r0 = 1;

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            byte[] bArr2;
            int i13 = ~i10;
            int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
            int i15 = ~i11;
            if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i16 = f56678q0;
                int i17 = ((i16 ^ 60) + ((i16 & 60) << 1)) - 1;
                f56679r0 = i17 % 128;
                cv cvVar = (cv) obj;
                Object[] objArr2 = new Object[2];
                if (i17 % 2 != 0) {
                    objArr2[0] = aVar;
                    objArr2[1] = cvVar;
                    a(objArr2, 42995002, -42995001, System.identityHashCode(aVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = aVar;
                objArr2[1] = cvVar;
                a(objArr2, 42995002, -42995001, System.identityHashCode(aVar));
                int i18 = 64 / 0;
                return Unit.INSTANCE;
            }
            a aVar2 = (a) objArr[0];
            cv cvVar2 = (cv) objArr[1];
            int i19 = f56679r0;
            int i20 = (i19 & 73) + (i19 | 73);
            f56678q0 = i20 % 128;
            if (i20 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cvVar2, "");
                iv ivVar = (iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jq.this}, -1301454292, 1301454292, (int) System.currentTimeMillis());
                setAnimation setanimation = setAnimation.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(cvVar2, "");
            iv ivVar2 = (iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jq.this}, -1301454292, 1301454292, (int) System.currentTimeMillis());
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar2, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(ivVar2));
            if (getbeeponfailure == null) {
                int i21 = f56678q0;
                int i22 = (i21 & (-60)) | ((~i21) & 59);
                int i23 = -(-((i21 & 59) << 1));
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f56679r0 = i24 % 128;
                int i25 = i24 % 2;
                bArr = null;
            } else {
                bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i26 = (-2) - ((f56678q0 + 16) ^ (-1));
                f56679r0 = i26 % 128;
                int i27 = i26 % 2;
            }
            jq jqVar = jq.this;
            iv ivVar3 = (iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -1301454292, 1301454292, (int) System.currentTimeMillis());
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar3, (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(ivVar3));
            if (getbeeponfailure2 == null) {
                int i28 = f56679r0;
                int i29 = i28 & 5;
                int i30 = (i28 ^ 5) | i29;
                int i31 = (i29 & i30) + (i29 | i30);
                f56678q0 = i31 % 128;
                if (i31 % 2 != 0) {
                    throw null;
                }
                int i32 = i28 & 105;
                int i33 = (((i28 | 105) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
                f56678q0 = i33 % 128;
                int i34 = i33 % 2;
                bArr2 = null;
            } else {
                bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                int i35 = f56678q0;
                int i36 = (i35 ^ 24) + ((i35 & 24) << 1);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f56679r0 = i37 % 128;
                int i38 = i37 % 2;
            }
            if (bArr != null) {
                int i39 = f56679r0;
                int i40 = ((i39 | 39) << 1) - (i39 ^ 39);
                f56678q0 = i40 % 128;
                int i41 = i40 % 2;
                if (!Arrays.equals(bArr, bArr2)) {
                    int i42 = f56679r0;
                    int i43 = (i42 ^ 121) + ((i42 & 121) << 1);
                    f56678q0 = i43 % 128;
                    int i44 = i43 % 2;
                    cv.setDividerPadding(new Object[]{cvVar2}, 199649391, -199649372, System.identityHashCode(cvVar2));
                    int i45 = f56678q0;
                    int i46 = i45 | 57;
                    int i47 = i46 << 1;
                    int i48 = -((~(i45 & 57)) & i46);
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    f56679r0 = i49 % 128;
                    int i50 = i49 % 2;
                }
            }
            iv ivVar4 = (iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -1301454292, 1301454292, (int) System.currentTimeMillis());
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar4, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(ivVar4))).booleanValue()) {
                System.identityHashCode(aVar2);
                System.identityHashCode(aVar2);
                mf mfVar = mf.INSTANCE;
                if (!((Boolean) mf.setX(new Object[]{(iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -1301454292, 1301454292, (int) System.currentTimeMillis())}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue()) {
                    int i51 = f56678q0;
                    int i52 = (i51 & (-48)) | ((~i51) & 47);
                    int i53 = -(-((i51 & 47) << 1));
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    f56679r0 = i54 % 128;
                    int i55 = i54 % 2;
                    cv.setDividerPadding(new Object[]{cvVar2}, 234919463, -234919436, System.identityHashCode(cvVar2));
                    int i56 = f56679r0;
                    int i57 = i56 & 99;
                    int i58 = -(-((i56 ^ 99) | i57));
                    int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                    f56678q0 = i59 % 128;
                    int i60 = i59 % 2;
                }
            }
            TransactionCompleted compoundDrawableTintBlendMode = ((setContentDescription) jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, 475146098, -475146096, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode();
            iv ivVar5 = (iv) jq.setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -1301454292, 1301454292, (int) System.currentTimeMillis());
            TransactionFailed suppressed = setAnimation.getSuppressed();
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar5, (String) TransactionFailed.setX(new Object[]{suppressed}, 1914607362, -1914607356, System.identityHashCode(suppressed))}, -232375606, 232375652, System.identityHashCode(ivVar5))).booleanValue()) {
                al alVar = new al(jq.setCompoundDrawableTintBlendMode(jqVar));
                ai aiVar = (ai) ((setImageTintList) w.setX(new Object[]{alVar}, 1693919772, -1693919769, System.identityHashCode(alVar)));
                TransactionCompleted transactionCompleted = (TransactionCompleted) ai.setDividerPadding(new Object[]{aiVar}, 1434468776, -1434468775, System.identityHashCode(aiVar));
                if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted))).intValue() > 0) {
                    int i61 = f56679r0;
                    int i62 = i61 ^ 73;
                    int i63 = ((i61 & 73) | i62) << 1;
                    int i64 = -i62;
                    int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                    f56678q0 = i65 % 128;
                    int i66 = i65 % 2;
                    cv.setDividerPadding(new Object[]{cvVar2}, 411204828, -411204817, System.identityHashCode(cvVar2));
                    int i67 = f56678q0 + 110;
                    int i68 = (i67 ^ (-1)) + (i67 << 1);
                    f56679r0 = i68 % 128;
                    int i69 = i68 % 2;
                }
            }
            ak akVar = new ak(jq.setCompoundDrawableTintBlendMode(jqVar));
            aj ajVar = (aj) ((setImageTintList) w.setX(new Object[]{akVar}, 1693919772, -1693919769, System.identityHashCode(akVar)));
            TransactionCompleted transactionCompleted2 = (TransactionCompleted) aj.setY(new Object[]{ajVar}, 1395639146, -1395639144, System.identityHashCode(ajVar));
            if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted2))).intValue() < 0) {
                int i70 = f56679r0;
                int i71 = (i70 & 85) + (i70 | 85);
                f56678q0 = i71 % 128;
                if (i71 % 2 != 0) {
                    cv.setDividerPadding(new Object[]{cvVar2, Boolean.FALSE}, -1217412403, 1217412419, System.identityHashCode(cvVar2));
                } else {
                    cv.setDividerPadding(new Object[]{cvVar2, Boolean.TRUE}, -1217412403, 1217412419, System.identityHashCode(cvVar2));
                }
                int i72 = f56678q0 + 55;
                f56679r0 = i72 % 128;
                int i73 = i72 % 2;
            }
            int i74 = (-2) - ((f56678q0 + 118) ^ (-1));
            f56679r0 = i74 % 128;
            int i75 = i74 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 2106631015, -2106631015, System.identityHashCode(this));
        }
    }

    public jq(@NotNull iv ivVar, @NotNull setContentDescription setcontentdescription) {
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56676a = ivVar;
        this.f56677b = setcontentdescription;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~((~i12) | i13);
        int i15 = (((~(i10 | i11 | i12)) | i14) * 338) + ((~(i13 | i11)) * 338) + (((~((~i11) | i10)) | i14 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337));
        if (i15 == 1) {
            jq jqVar = (jq) objArr[0];
            cz czVar = new cz(jqVar.f56676a);
            int i16 = f56675d;
            int i17 = i16 & 1;
            int i18 = (i17 - (~((i16 ^ 1) | i17))) - 1;
            f56674c = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }
        if (i15 != 2) {
            jq jqVar2 = (jq) objArr[0];
            int i20 = f56675d;
            int i21 = ((i20 ^ 116) + ((i20 & 116) << 1)) - 1;
            int i22 = i21 % 128;
            f56674c = i22;
            int i23 = i21 % 2;
            obj = jqVar2.f56676a;
            int i24 = ((i22 | 109) << 1) - (i22 ^ 109);
            f56675d = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
        } else {
            jq jqVar3 = (jq) objArr[0];
            int i25 = f56674c + 69;
            f56675d = i25 % 128;
            int i26 = i25 % 2;
            obj = jqVar3.f56677b;
            if (i26 == 0) {
                int i27 = 74 / 0;
            }
        }
        return obj;
    }

    public static final /* synthetic */ setContentDescription setX(jq jqVar) {
        return (setContentDescription) setCompoundDrawableTintBlendMode(new Object[]{jqVar}, 475146098, -475146096, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ iv setCompoundDrawableTintBlendMode(jq jqVar) {
        return (iv) setCompoundDrawableTintBlendMode(new Object[]{jqVar}, -1301454292, 1301454292, (int) System.currentTimeMillis());
    }

    public final void setCompoundDrawableTintBlendMode() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -2056512586, 2056512587, System.identityHashCode(this));
    }
}
