package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class cv extends t {
    public static final /* synthetic */ KProperty<Object>[] A = {c.e(cv.class, "offlineDataAuthenticationWasNotPerformed_B1b8", "getOfflineDataAuthenticationWasNotPerformed_B1b8()Z", 0), c.e(cv.class, "sdaFailed_B1b7", "getSdaFailed_B1b7()Z", 0), c.e(cv.class, "iccDataMissing_B1b6", "getIccDataMissing_B1b6()Z", 0), c.e(cv.class, "cardAppearsOnTerminalExceptionFile_B1b5", "getCardAppearsOnTerminalExceptionFile_B1b5()Z", 0), c.e(cv.class, "ddaFailed_B1b4", "getDdaFailed_B1b4()Z", 0), c.e(cv.class, "cdaFailed_B1b3", "getCdaFailed_B1b3()Z", 0), c.e(cv.class, "sdaSelected_B1b2", "getSdaSelected_B1b2()Z", 0), c.e(cv.class, "iccAndTerminalHaveDifferentApplicationVersions_B2b8", "getIccAndTerminalHaveDifferentApplicationVersions_B2b8()Z", 0), c.e(cv.class, "expiredApplication_B2b7", "getExpiredApplication_B2b7()Z", 0), c.e(cv.class, "applicationNotYetEffective_B2b6", "getApplicationNotYetEffective_B2b6()Z", 0), c.e(cv.class, "requestedServiceNotAllowedForCardProduct_B2b5", "getRequestedServiceNotAllowedForCardProduct_B2b5()Z", 0), c.e(cv.class, "newCard_B2b4", "getNewCard_B2b4()Z", 0), c.e(cv.class, "cardholderVerificationWasNotSuccessful_B3b8", "getCardholderVerificationWasNotSuccessful_B3b8()Z", 0), c.e(cv.class, "unrecognisedCvm_B3b7", "getUnrecognisedCvm_B3b7()Z", 0), c.e(cv.class, "pinTryLimitExceeded_B3b6", "getPinTryLimitExceeded_B3b6()Z", 0), c.e(cv.class, "pinEntryRequiredAndPINPadNotPresentOrNotWorking_B3b5", "getPinEntryRequiredAndPINPadNotPresentOrNotWorking_B3b5()Z", 0), c.e(cv.class, "pinEntryRequiredPINPadPresentButPINWasNotEntered_B3b4", "getPinEntryRequiredPINPadPresentButPINWasNotEntered_B3b4()Z", 0), c.e(cv.class, "onlinePinEntered_B3b3", "getOnlinePinEntered_B3b3()Z", 0), c.e(cv.class, "transactionExceedsFloorLimit_B4b8", "getTransactionExceedsFloorLimit_B4b8()Z", 0), c.e(cv.class, "lowerConsecutiveOfflineLimitExceeded_B4b7", "getLowerConsecutiveOfflineLimitExceeded_B4b7()Z", 0), c.e(cv.class, "upperConsecutiveOfflineLimitExceeded_B4b6", "getUpperConsecutiveOfflineLimitExceeded_B4b6()Z", 0), c.e(cv.class, "transactionSelectedRandomlyForOnlineProcessing_B4b5", "getTransactionSelectedRandomlyForOnlineProcessing_B4b5()Z", 0), c.e(cv.class, "merchantForcedTransactionOnline_B4b4", "getMerchantForcedTransactionOnline_B4b4()Z", 0), c.e(cv.class, "defaultTdolUsed_B5b8", "getDefaultTdolUsed_B5b8()Z", 0), c.e(cv.class, "issuerAuthenticationFailed_B5b7", "getIssuerAuthenticationFailed_B5b7()Z", 0), c.e(cv.class, "scriptProcessingFailedBeforeFinalGenerateAc_B5b6", "getScriptProcessingFailedBeforeFinalGenerateAc_B5b6()Z", 0), c.e(cv.class, "scriptProcessingFailedAfterFinalGenerateAc_B5b5", "getScriptProcessingFailedAfterFinalGenerateAc_B5b5()Z", 0), c.e(cv.class, "relayResistanceThresholdExceeded_B5b4", "getRelayResistanceThresholdExceeded_B5b4()Z", 0), c.e(cv.class, "relayResistanceTimeLimitsExceeded_B5b3", "getRelayResistanceTimeLimitsExceeded_B5b3()Z", 0), c.e(cv.class, "relayResistancePerformed_B5b2b1", "getRelayResistancePerformed_B5b2b1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/terminal/RelayResistancePerformedEnum;", 0)};
    public static int B = 0;
    public static int C = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f55046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f55047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f55048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f55049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f55050l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f55051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final h f55052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final h f55053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final h f55054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final h f55055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final h f55056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final h f55057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final h f55058u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final h f55059v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final h f55060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final h f55061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final h f55062y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final n f55063z;

    static {
        int i10 = B + 43;
        C = i10 % 128;
        int i11 = i10 % 2;
    }

    public cv() {
        super(setAnimation.TransactionErrorCause().setDividerPadding());
        this.f55044f = new h(0, 7);
        this.f55045g = new h(0, 6);
        this.f55046h = new h(0, 5);
        this.f55047i = new h(0, 4);
        this.f55048j = new h(0, 3);
        this.f55049k = new h(0, 2);
        this.f55050l = new h(0, 1);
        this.m = new h(1, 7);
        this.f55051n = new h(1, 6);
        this.f55052o = new h(1, 5);
        this.f55053p = new h(1, 4);
        new h(1, 3);
        this.f55054q = new h(2, 7);
        this.f55055r = new h(2, 6);
        this.f55056s = new h(2, 5);
        this.f55057t = new h(2, 4);
        this.f55058u = new h(2, 3);
        this.f55059v = new h(2, 2);
        this.f55060w = new h(3, 7);
        new h(3, 6);
        new h(3, 5);
        new h(3, 4);
        new h(3, 3);
        new h(4, 7);
        new h(4, 6);
        new h(4, 5);
        new h(4, 4);
        this.f55061x = new h(4, 3);
        this.f55062y = new h(4, 2);
        cl.Companion companion = cl.INSTANCE;
        this.f55063z = new n(4, 1, 0, (openContextMenu) cl.Companion.setX(new Object[0], 304782637, -304782637, (int) System.currentTimeMillis()));
    }

    public static /* synthetic */ void b(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = B;
        int i11 = i10 & 19;
        int i12 = (i10 | 19) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        C = i14 % 128;
        int i15 = i14 % 2;
        h hVar = cvVar.f55061x;
        h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[27], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
        int i16 = B;
        int i17 = (i16 & (-38)) | ((~i16) & 37);
        int i18 = -(-((i16 & 37) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        C = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        Object onFocusChangeListener;
        cv cvVar = (cv) objArr[0];
        int i10 = C;
        int i11 = i10 ^ 67;
        int i12 = (((i10 & 67) | i11) << 1) - i11;
        B = i12 % 128;
        int i13 = i12 % 2;
        KProperty<Object>[] kPropertyArr = A;
        if (i13 != 0) {
            h hVar = cvVar.f55047i;
            onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, cvVar, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar));
        } else {
            h hVar2 = cvVar.f55047i;
            onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, cvVar, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar2));
        }
        boolean zBooleanValue = ((Boolean) onFocusChangeListener).booleanValue();
        int i14 = B + 45;
        C = i14 % 128;
        if (i14 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = B;
        int i11 = i10 & 119;
        int i12 = (i11 - (~(-(-((i10 ^ 119) | i11))))) - 1;
        C = i12 % 128;
        int i13 = i12 % 2;
        h hVar = cvVar.f55049k;
        h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[5], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar));
        int i14 = C;
        int i15 = i14 & 95;
        int i16 = ((i14 ^ 95) | i15) << 1;
        int i17 = -((i14 | 95) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        B = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = B;
        int i11 = i10 & 35;
        int i12 = (i10 | 35) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        C = i14 % 128;
        int i15 = i14 % 2;
        KProperty<Object>[] kPropertyArr = A;
        if (i15 == 0) {
            h hVar = cvVar.f55045g;
            h.setOnFocusChangeListener(new Object[]{hVar, cvVar, kPropertyArr[0], Boolean.FALSE}, 951550455, -951550455, System.identityHashCode(hVar));
        } else {
            h hVar2 = cvVar.f55045g;
            h.setOnFocusChangeListener(new Object[]{hVar2, cvVar, kPropertyArr[1], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar2));
        }
        int i16 = C + 73;
        B = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = B;
        int i11 = i10 | 49;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 49)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        C = i14 % 128;
        int i15 = i14 % 2;
        h hVar = cvVar.m;
        h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[7], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
        int i16 = B;
        int i17 = ((i16 & 18) + (i16 | 18)) - 1;
        C = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 11 / 0;
        }
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = B;
        int i11 = i10 & 5;
        int i12 = (i10 | 5) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        C = i14 % 128;
        int i15 = i14 % 2;
        h hVar = cvVar.f55044f;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[0]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
        int i16 = C + 117;
        B = i16 % 128;
        if (i16 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i17 = 6 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ void h(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = C;
        int i11 = i10 & 103;
        int i12 = (i10 | 103) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        B = i14 % 128;
        int i15 = i14 % 2;
        h hVar = cvVar.f55047i;
        h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[3], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
        int i16 = B;
        int i17 = (((i16 | 2) << 1) - (i16 ^ 2)) - 1;
        C = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = B;
        int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
        C = i11 % 128;
        int i12 = i11 % 2;
        KProperty<Object>[] kPropertyArr = A;
        if (i12 == 0) {
            h hVar = cvVar.f55056s;
            h.setOnFocusChangeListener(new Object[]{hVar, cvVar, kPropertyArr[117], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
        } else {
            h hVar2 = cvVar.f55056s;
            h.setOnFocusChangeListener(new Object[]{hVar2, cvVar, kPropertyArr[14], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar2));
        }
        int i13 = C;
        int i14 = i13 ^ 43;
        int i15 = (i13 & 43) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        B = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean j(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = C + 109;
        B = i10 % 128;
        int i11 = i10 % 2;
        h hVar = cvVar.f55051n;
        boolean zBooleanValue = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[8]}, -709183664, 709183665, System.identityHashCode(hVar))).booleanValue();
        int i12 = B;
        int i13 = (i12 ^ 121) + ((i12 & 121) << 1);
        C = i13 % 128;
        if (i13 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ void k(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = C;
        int i11 = (i10 ^ 11) + ((i10 & 11) << 1);
        B = i11 % 128;
        int i12 = i11 % 2;
        h hVar = cvVar.f55044f;
        h.setOnFocusChangeListener(new Object[]{hVar, cvVar, A[0], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar));
        int i13 = B;
        int i14 = (((i13 | 94) << 1) - (i13 ^ 94)) - 1;
        C = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        cv cvVar = (cv) objArr[0];
        int i10 = C;
        int i11 = (((i10 | 24) << 1) - (i10 ^ 24)) - 1;
        B = i11 % 128;
        int i12 = i11 % 2;
        KProperty<Object>[] kPropertyArr = A;
        if (i12 != 0) {
            h hVar = cvVar.f55054q;
            h.setOnFocusChangeListener(new Object[]{hVar, cvVar, kPropertyArr[72], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
        } else {
            h hVar2 = cvVar.f55054q;
            h.setOnFocusChangeListener(new Object[]{hVar2, cvVar, kPropertyArr[12], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar2));
        }
        int i13 = B;
        int i14 = ((i13 & (-44)) | ((~i13) & 43)) + ((i13 & 43) << 1);
        C = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        Object compoundDrawableTintBlendMode;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = (((~(i13 | i12)) | (~(i11 | i14))) * 333) + (((~(i13 | i14)) | (~(i11 | i12))) * 333) + (i13 * (-333)) + (i11 * 334) + (i10 * (-665));
        KProperty<Object>[] kPropertyArr = A;
        switch (i15) {
            case 1:
                cv cvVar = (cv) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i16 = B + 2;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                C = i17 % 128;
                if (i17 % 2 == 0) {
                    h hVar = cvVar.f55059v;
                    h.setOnFocusChangeListener(new Object[]{hVar, cvVar, kPropertyArr[116], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar));
                    return null;
                }
                h hVar2 = cvVar.f55059v;
                h.setOnFocusChangeListener(new Object[]{hVar2, cvVar, kPropertyArr[17], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar2));
                return null;
            case 2:
                k(objArr);
                return null;
            case 3:
                cv cvVar2 = (cv) objArr[0];
                int i18 = (-2) - ((C + 38) ^ (-1));
                B = i18 % 128;
                int i19 = i18 % 2;
                h hVar3 = cvVar2.f55052o;
                boolean zBooleanValue2 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar3, cvVar2, kPropertyArr[9]}, -709183664, 709183665, System.identityHashCode(hVar3))).booleanValue();
                int i20 = B;
                int i21 = (i20 & 22) + (i20 | 22);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                C = i22 % 128;
                int i23 = i22 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 4:
                d(objArr);
                return null;
            case 5:
                i(objArr);
                return null;
            case 6:
                cv cvVar3 = (cv) objArr[0];
                System.identityHashCode(cvVar3);
                System.identityHashCode(cvVar3);
                h hVar4 = cvVar3.f55055r;
                h.setOnFocusChangeListener(new Object[]{hVar4, cvVar3, kPropertyArr[13], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar4));
                int i24 = B;
                int i25 = i24 & 87;
                int i26 = ((i24 | 87) & (~i25)) + (i25 << 1);
                C = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 7:
                return c(objArr);
            case 8:
                cv cvVar4 = (cv) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i28 = B;
                int i29 = i28 & 33;
                int i30 = i29 + ((i28 ^ 33) | i29);
                C = i30 % 128;
                int i31 = i30 % 2;
                h hVar5 = cvVar4.f55046h;
                h.setOnFocusChangeListener(new Object[]{hVar5, cvVar4, kPropertyArr[2], Boolean.valueOf(zBooleanValue3)}, 951550455, -951550455, System.identityHashCode(hVar5));
                int i32 = B;
                int i33 = i32 & 75;
                int i34 = (i32 ^ 75) | i33;
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                C = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 9:
                cv cvVar5 = (cv) objArr[0];
                int i37 = C;
                int i38 = i37 & 65;
                int i39 = i38 + ((i37 ^ 65) | i38);
                B = i39 % 128;
                int i40 = i39 % 2;
                h hVar6 = cvVar5.f55048j;
                h.setOnFocusChangeListener(new Object[]{hVar6, cvVar5, kPropertyArr[4], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar6));
                int i41 = B;
                int i42 = ((((i41 ^ 109) | (i41 & 109)) << 1) - (~(-(((~i41) & 109) | (i41 & (-110)))))) - 1;
                C = i42 % 128;
                int i43 = i42 % 2;
                return null;
            case 10:
                l(objArr);
                return null;
            case 11:
                cv cvVar6 = (cv) objArr[0];
                int i44 = B;
                int i45 = i44 & 53;
                int i46 = (i44 ^ 53) | i45;
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                C = i47 % 128;
                if (i47 % 2 == 0) {
                    h hVar7 = cvVar6.f55052o;
                    h.setOnFocusChangeListener(new Object[]{hVar7, cvVar6, kPropertyArr[23], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar7));
                    return null;
                }
                h hVar8 = cvVar6.f55052o;
                h.setOnFocusChangeListener(new Object[]{hVar8, cvVar6, kPropertyArr[9], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar8));
                return null;
            case 12:
                cv cvVar7 = (cv) objArr[0];
                int i48 = C + 113;
                B = i48 % 128;
                if (i48 % 2 != 0) {
                    h hVar9 = cvVar7.f55049k;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar9, cvVar7, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar9));
                } else {
                    h hVar10 = cvVar7.f55049k;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar10, cvVar7, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar10));
                }
                return Boolean.valueOf(((Boolean) onFocusChangeListener).booleanValue());
            case 13:
                cv cvVar8 = (cv) objArr[0];
                int i49 = C;
                int i50 = i49 & 45;
                int i51 = ((i49 | 45) & (~i50)) + (i50 << 1);
                B = i51 % 128;
                if (i51 % 2 != 0) {
                    h hVar11 = cvVar8.f55062y;
                    h.setOnFocusChangeListener(new Object[]{hVar11, cvVar8, kPropertyArr[116], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar11));
                } else {
                    h hVar12 = cvVar8.f55062y;
                    h.setOnFocusChangeListener(new Object[]{hVar12, cvVar8, kPropertyArr[28], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar12));
                }
                int i52 = C;
                int i53 = (((i52 | 112) << 1) - (i52 ^ 112)) - 1;
                B = i53 % 128;
                int i54 = i53 % 2;
                return null;
            case 14:
                b(objArr);
                return null;
            case 15:
                cv cvVar9 = (cv) objArr[0];
                int i55 = B;
                int i56 = (i55 & 65) + (i55 | 65);
                C = i56 % 128;
                int i57 = i56 % 2;
                h hVar13 = cvVar9.f55053p;
                return Boolean.valueOf(((Boolean) (i57 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar13, cvVar9, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar13)) : h.setOnFocusChangeListener(new Object[]{hVar13, cvVar9, kPropertyArr[10]}, -709183664, 709183665, System.identityHashCode(hVar13)))).booleanValue());
            case 16:
                cv cvVar10 = (cv) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i58 = C;
                int i59 = ((i58 | 23) << 1) - (i58 ^ 23);
                B = i59 % 128;
                int i60 = i59 % 2;
                h hVar14 = cvVar10.f55051n;
                if (i60 != 0) {
                    h.setOnFocusChangeListener(new Object[]{hVar14, cvVar10, kPropertyArr[74], Boolean.valueOf(zBooleanValue4)}, 951550455, -951550455, System.identityHashCode(hVar14));
                    return null;
                }
                h.setOnFocusChangeListener(new Object[]{hVar14, cvVar10, kPropertyArr[8], Boolean.valueOf(zBooleanValue4)}, 951550455, -951550455, System.identityHashCode(hVar14));
                return null;
            case 17:
                cv cvVar11 = (cv) objArr[0];
                int i61 = C;
                int i62 = i61 ^ 49;
                int i63 = (i61 & 49) << 1;
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                B = i64 % 128;
                int i65 = i64 % 2;
                h hVar15 = cvVar11.f55058u;
                h.setOnFocusChangeListener(new Object[]{hVar15, cvVar11, kPropertyArr[16], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar15));
                int i66 = B + 119;
                C = i66 % 128;
                int i67 = i66 % 2;
                return null;
            case 18:
                cv cvVar12 = (cv) objArr[0];
                int i68 = C;
                int i69 = ((i68 ^ 51) | (i68 & 51)) << 1;
                int i70 = -(((~i68) & 51) | (i68 & (-52)));
                int i71 = (i69 & i70) + (i70 | i69);
                B = i71 % 128;
                int i72 = i71 % 2;
                h hVar16 = cvVar12.f55046h;
                return Boolean.valueOf(((Boolean) (i72 != 0 ? h.setOnFocusChangeListener(new Object[]{hVar16, cvVar12, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar16)) : h.setOnFocusChangeListener(new Object[]{hVar16, cvVar12, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar16)))).booleanValue());
            case 19:
                f(objArr);
                return null;
            case 20:
                cv cvVar13 = (cv) objArr[0];
                int i73 = C + 79;
                B = i73 % 128;
                if (i73 % 2 != 0) {
                    n nVar = cvVar13.f55063z;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar, cvVar13, kPropertyArr[61]}, 2052976211, -2052976210, System.identityHashCode(nVar));
                } else {
                    n nVar2 = cvVar13.f55063z;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, cvVar13, kPropertyArr[29]}, 2052976211, -2052976210, System.identityHashCode(nVar2));
                }
                return (cl) ((Enum) compoundDrawableTintBlendMode);
            case 21:
                cv cvVar14 = (cv) objArr[0];
                int i74 = C;
                int i75 = (((i74 ^ 111) | (i74 & 111)) << 1) - (((~i74) & 111) | (i74 & (-112)));
                B = i75 % 128;
                int i76 = i75 % 2;
                h hVar17 = cvVar14.f55057t;
                h.setOnFocusChangeListener(new Object[]{hVar17, cvVar14, kPropertyArr[15], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar17));
                int i77 = C;
                int i78 = (((i77 | 48) << 1) - (i77 ^ 48)) - 1;
                B = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 22:
                return g(objArr);
            case 23:
                h(objArr);
                return null;
            case 24:
                return j(objArr);
            case 25:
                e(objArr);
                return null;
            case 26:
                cv cvVar15 = (cv) objArr[0];
                int i80 = B;
                int i81 = (i80 | 111) << 1;
                int i82 = -(i80 ^ 111);
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                C = i83 % 128;
                int i84 = i83 % 2;
                h hVar18 = cvVar15.f55050l;
                h.setOnFocusChangeListener(new Object[]{hVar18, cvVar15, kPropertyArr[6], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar18));
                int i85 = B;
                int i86 = (i85 & 33) + (i85 | 33);
                C = i86 % 128;
                int i87 = i86 % 2;
                return null;
            case 27:
                cv cvVar16 = (cv) objArr[0];
                int i88 = C;
                int i89 = i88 ^ 93;
                int i90 = (i88 & 93) << 1;
                int i91 = (i89 & i90) + (i90 | i89);
                B = i91 % 128;
                int i92 = i91 % 2;
                h hVar19 = cvVar16.f55053p;
                if (i92 != 0) {
                    h.setOnFocusChangeListener(new Object[]{hVar19, cvVar16, kPropertyArr[50], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar19));
                    return null;
                }
                h.setOnFocusChangeListener(new Object[]{hVar19, cvVar16, kPropertyArr[10], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar19));
                return null;
            case 28:
                cv cvVar17 = (cv) objArr[0];
                cl clVar = (cl) objArr[1];
                int i93 = B;
                int i94 = i93 & 1;
                int i95 = ((i93 ^ 1) | i94) << 1;
                int i96 = -((i93 | 1) & (~i94));
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                C = i97 % 128;
                if (i97 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(clVar, "");
                    n nVar3 = cvVar17.f55063z;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, cvVar17, kPropertyArr[101], clVar}, 697712004, -697712004, System.identityHashCode(nVar3));
                } else {
                    Intrinsics.checkNotNullParameter(clVar, "");
                    n nVar4 = cvVar17.f55063z;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar4, cvVar17, kPropertyArr[29], clVar}, 697712004, -697712004, System.identityHashCode(nVar4));
                }
                int i98 = B;
                int i99 = ((i98 | 48) << 1) - (i98 ^ 48);
                int i100 = (i99 ^ (-1)) + (i99 << 1);
                C = i100 % 128;
                int i101 = i100 % 2;
                return null;
            default:
                cv cvVar18 = (cv) objArr[0];
                boolean zBooleanValue5 = ((Boolean) objArr[1]).booleanValue();
                int i102 = B;
                int i103 = i102 & 99;
                int i104 = ((i102 | 99) & (~i103)) + (i103 << 1);
                C = i104 % 128;
                if (i104 % 2 == 0) {
                    h hVar20 = cvVar18.f55060w;
                    h.setOnFocusChangeListener(new Object[]{hVar20, cvVar18, kPropertyArr[38], Boolean.valueOf(zBooleanValue5)}, 951550455, -951550455, System.identityHashCode(hVar20));
                    return null;
                }
                h hVar21 = cvVar18.f55060w;
                h.setOnFocusChangeListener(new Object[]{hVar21, cvVar18, kPropertyArr[18], Boolean.valueOf(zBooleanValue5)}, 951550455, -951550455, System.identityHashCode(hVar21));
                return null;
        }
    }

    public final void TransactionResult() {
        setDividerPadding(new Object[]{this}, -846501552, 846501569, System.identityHashCode(this));
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1554941971, -1554941959, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getAmountFieldTextColor() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -90764059, 90764062, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 166123252, -166123234, System.identityHashCode(this))).booleanValue();
    }

    public final void getSuppressed() {
        setDividerPadding(new Object[]{this}, -193104396, 193104406, System.identityHashCode(this));
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1733926405, 1733926412, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setChildDivider() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1184343274, 1184343298, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawablePadding() {
        setDividerPadding(new Object[]{this}, 411204828, -411204817, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -2106531481, 2106531485, System.identityHashCode(this));
    }

    public final void setCursorVisible() {
        setDividerPadding(new Object[]{this}, 446051343, -446051330, System.identityHashCode(this));
    }

    public final void setImageResource() {
        setDividerPadding(new Object[]{this}, 1509608714, -1509608708, System.identityHashCode(this));
    }

    public final void setIncludeFontPadding() {
        setDividerPadding(new Object[]{this}, 310720593, -310720570, System.identityHashCode(this));
    }

    public final void setLayoutAnimation() {
        setDividerPadding(new Object[]{this}, -1388264608, 1388264633, System.identityHashCode(this));
    }

    public final void setLayoutDirection() {
        setDividerPadding(new Object[]{this}, -756210758, 756210779, System.identityHashCode(this));
    }

    public final void setMaxEms() {
        setDividerPadding(new Object[]{this}, 234919463, -234919436, System.identityHashCode(this));
    }

    public final void setMinHeight() {
        setDividerPadding(new Object[]{this}, -826471606, 826471611, System.identityHashCode(this));
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1648759119, 1648759141, System.identityHashCode(this))).booleanValue();
    }

    public final void setOnEditorActionListener() {
        setDividerPadding(new Object[]{this}, 199649391, -199649372, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull cl clVar) {
        setDividerPadding(new Object[]{this, clVar}, 1192679248, -1192679220, System.identityHashCode(this));
    }

    public final void setOnLongClickListener(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 1715041445, -1715041445, System.identityHashCode(this));
    }

    public final void setTextAlignment() {
        setDividerPadding(new Object[]{this}, -299997872, 299997898, System.identityHashCode(this));
    }

    public final boolean setTextScaleX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1774320004, 1774320019, System.identityHashCode(this))).booleanValue();
    }

    public final void setTextSelectHandleRight() {
        setDividerPadding(new Object[]{this}, 219845722, -219845708, System.identityHashCode(this));
    }

    @NotNull
    public final cl setViewTranslationCallback() {
        return (cl) setDividerPadding(new Object[]{this}, 508896554, -508896534, System.identityHashCode(this));
    }

    public final void setX(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -243948838, 243948846, System.identityHashCode(this));
    }

    public final void setY(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1881163515, 1881163517, System.identityHashCode(this));
    }

    public final void setZ() {
        setDividerPadding(new Object[]{this}, -86802886, 86802895, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1217412403, 1217412419, System.identityHashCode(this));
    }

    public final void setDividerPadding(boolean z10) {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1728527861, 1728527862, System.identityHashCode(this));
    }
}
