package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.callbacks.TransactionApproved;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelReason;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelled;
import com.mypinpad.tsdk.api.callbacks.TransactionCompleted;
import com.mypinpad.tsdk.api.callbacks.TransactionErrorCause;
import com.mypinpad.tsdk.api.callbacks.TransactionFailed;
import com.mypinpad.tsdk.api.callbacks.TransactionNotAuthorised;
import com.mypinpad.tsdk.api.callbacks.TransactionNotAuthorisedReason;
import com.mypinpad.tsdk.api.callbacks.TransactionProcessingResult;
import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.mypinpad.tsdk.api.models.CardScheme;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f58160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f58162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f58163d = null;

    public /* synthetic */ class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58165b;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setX;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[rv.values().length];
            try {
                iArr[rv.setDividerPadding.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rv.setOnFocusChangeListener.ordinal()] = 2;
                int i10 = f58164a;
                int i11 = i10 & 97;
                int i12 = ((((i10 ^ 97) | i11) << 1) - (~(-((i10 | 97) & (~i11))))) - 1;
                f58165b = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rv.setY.ordinal()] = 3;
                int i14 = f58165b;
                int i15 = i14 ^ 95;
                int i16 = -(-((i14 & 95) << 1));
                int i17 = (i15 & i16) + (i16 | i15);
                f58164a = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rv.setCompoundDrawableTintBlendMode.ordinal()] = 4;
                int i19 = f58164a;
                int i20 = (i19 & (-126)) | ((~i19) & 125);
                int i21 = (i19 & 125) << 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f58165b = i22 % 128;
                int i23 = i22 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rv.setX.ordinal()] = 5;
                int i24 = f58164a;
                int i25 = (((i24 & (-92)) | ((~i24) & 91)) - (~((i24 & 91) << 1))) - 1;
                f58165b = i25 % 128;
                int i26 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rv.setOnLongClickListener.ordinal()] = 6;
                int i27 = f58164a;
                int i28 = (i27 & (-72)) | ((~i27) & 71);
                int i29 = -(-((i27 & 71) << 1));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f58165b = i30 % 128;
                int i31 = i30 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rv.getNavBarTitleString.ordinal()] = 7;
                int i32 = f58165b;
                int i33 = (i32 & 5) + (i32 | 5);
                f58164a = i33 % 128;
                int i34 = i33 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            setDividerPadding = iArr;
            int[] iArr2 = new int[rq.values().length];
            try {
                iArr2[rq.setOnFocusChangeListener.ordinal()] = 1;
                int i35 = f58165b + 61;
                f58164a = i35 % 128;
                int i36 = i35 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[rq.setDividerPadding.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[rq.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[rq.setY.ordinal()] = 4;
                int i37 = f58165b;
                int i38 = (((i37 | 24) << 1) - (i37 ^ 24)) - 1;
                f58164a = i38 % 128;
                int i39 = i38 % 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[rq.setX.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[rq.getNavBarTitleString.ordinal()] = 6;
                int i40 = f58164a + 95;
                f58165b = i40 % 128;
                int i41 = i40 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[rq.setNavigationOnClickListener.ordinal()] = 7;
                int i42 = f58165b;
                int i43 = (((i42 ^ 51) | (i42 & 51)) << 1) - (((~i42) & 51) | (i42 & (-52)));
                f58164a = i43 % 128;
                int i44 = i43 % 2;
            } catch (NoSuchFieldError unused14) {
            }
            setX = iArr2;
            int[] iArr3 = new int[ro.values().length];
            try {
                iArr3[ro.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i45 = f58164a;
                int i46 = i45 & 125;
                int i47 = i46 + ((i45 ^ 125) | i46);
                f58165b = i47 % 128;
                int i48 = i47 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ro.setY.ordinal()] = 2;
                int i49 = f58165b;
                int i50 = i49 ^ 75;
                int i51 = (i49 & 75) << 1;
                int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                f58164a = i52 % 128;
                int i53 = i52 % 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ro.setX.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[ro.setOnFocusChangeListener.ordinal()] = 4;
                int i54 = f58164a;
                int i55 = i54 ^ 69;
                int i56 = (((i54 & 69) | i55) << 1) - i55;
                f58165b = i56 % 128;
                int i57 = i56 % 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ro.setDividerPadding.ordinal()] = 5;
                int i58 = f58165b;
                int i59 = (i58 & 53) + (i58 | 53);
                f58164a = i59 % 128;
                int i60 = i59 % 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[ro.setLayoutAnimation.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[ro.getNavBarTitleString.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[ro.setOnLongClickListener.ordinal()] = 8;
                int i61 = f58164a;
                int i62 = i61 ^ 79;
                int i63 = ((((i61 & 79) | i62) << 1) - (~(-i62))) - 1;
                f58165b = i63 % 128;
                int i64 = i63 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[ro.setOnDragListener.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[ro.setNavigationOnClickListener.ordinal()] = 10;
                int i65 = f58164a;
                int i66 = (i65 & (-126)) | ((~i65) & 125);
                int i67 = (i65 & 125) << 1;
                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                f58165b = i68 % 128;
                int i69 = i68 % 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[ro.setZ.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[ro.setIncludeFontPadding.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[ro.setAlwaysDrawnWithCacheEnabled.ordinal()] = 13;
                int i70 = f58165b;
                int i71 = (i70 & (-52)) | ((~i70) & 51);
                int i72 = (i70 & 51) << 1;
                int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                f58164a = i73 % 128;
                int i74 = i73 % 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[ro.UiMessageCallbackKtWhenMappings.ordinal()] = 14;
                System.currentTimeMillis();
                System.currentTimeMillis();
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[ro.setTextAlignment.ordinal()] = 15;
                int i75 = f58164a;
                int i76 = i75 & 75;
                int i77 = (i75 ^ 75) | i76;
                int i78 = (i76 & i77) + (i77 | i76);
                f58165b = i78 % 128;
                int i79 = i78 % 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[ro.getAmountFieldTextColor.ordinal()] = 16;
                int i80 = f58164a;
                int i81 = ((i80 ^ 88) + ((i80 & 88) << 1)) - 1;
                f58165b = i81 % 128;
                int i82 = i81 % 2;
            } catch (NoSuchFieldError unused30) {
            }
            setY = iArr3;
        }
    }

    static {
        b();
        f58161b = 0;
        f58162c = 1;
        f58160a = new int[]{1178370869, 323285568, 1657001206, 2013153369, -1283440339, -965671488, 1616177157, 666899758, -2048188585, -541881050, 315176376, 1039969444, 267723620, 933946435, -367491842, 1024650165, -1106599462, 1863671684};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 * 4
            int r7 = 108 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.rx.f58163d
            r2 = 0
            if (r1 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L38
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            int r9 = r9 + 1
            r4 = r1[r9]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L38:
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.rx.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        f58163d = new byte[]{74, -53, -69, 45};
    }

    @NotNull
    public static final Throwable setCompoundDrawableTintBlendMode(@NotNull qw qwVar) {
        int i10 = f58162c + 89;
        f58161b = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qwVar, "");
            boolean z10 = qwVar instanceof qy;
            throw null;
        }
        Intrinsics.checkNotNullParameter(qwVar, "");
        if (qwVar instanceof qy) {
            return new TimeoutException((String) qw.setDividerPadding(new Object[]{qwVar}, 1687366083, -1687366083, System.identityHashCode(qwVar)));
        }
        if (!(qwVar instanceof rc)) {
            if (qwVar instanceof ra) {
                return new Exception((String) qw.setDividerPadding(new Object[]{qwVar}, 1687366083, -1687366083, System.identityHashCode(qwVar)));
            }
            throw new NoWhenBranchMatchedException();
        }
        rc rcVar = (rc) qwVar;
        TerminalException terminalException = new TerminalException(rcVar.setOnFocusChangeListener(), rcVar.setCompoundDrawableTintBlendMode(), new Throwable((String) qw.setDividerPadding(new Object[]{qwVar}, 1687366083, -1687366083, System.identityHashCode(qwVar))));
        int i11 = f58161b + 13;
        f58162c = i11 % 128;
        if (i11 % 2 != 0) {
            return terminalException;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        if ((r6 % 2) == 0) goto L52;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.mypinpad.tsdk.isolation.ro setDividerPadding(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.qw r6) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.rx.setDividerPadding(com.mypinpad.tsdk.i.qw):com.mypinpad.tsdk.i.ro");
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        TransactionNotAuthorisedReason transactionNotAuthorisedReason;
        int i13;
        ru ruVar = (ru) objArr[0];
        if (ruVar instanceof rp) {
            rp rpVar = (rp) ruVar;
            return new TransactionApproved((CardScheme) sc.setX(new Object[]{(sg) rp.setY(new Object[]{rpVar}, -1859324063, 1859324063, System.identityHashCode(rpVar))}, -951340545, 951340545, (int) System.currentTimeMillis()));
        }
        if (!(ruVar instanceof rt)) {
            throw new NoWhenBranchMatchedException();
        }
        rv compoundDrawableTintBlendMode = ((rt) ruVar).setCompoundDrawableTintBlendMode();
        if (compoundDrawableTintBlendMode != null) {
            switch (setX.setDividerPadding[compoundDrawableTintBlendMode.ordinal()]) {
                case 1:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.ONLINE_DECLINED;
                    break;
                case 2:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.OFFLINE_DECLINED;
                    int i14 = f58161b + 53;
                    f58162c = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = 77 / 0;
                    }
                    break;
                case 3:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.INVALID_AUTHORISATION_DATA;
                    break;
                case 4:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.NO_CARD_APPLICATION;
                    i13 = f58161b + 41;
                    break;
                case 5:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.NO_CARD_APPLICATION_SELECTOR_MISMATCHED;
                    break;
                case 6:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.PROCESSING_ERROR;
                    break;
                case 7:
                    transactionNotAuthorisedReason = TransactionNotAuthorisedReason.CARD_ERROR;
                    i13 = f58161b + 115;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            f58162c = i13 % 128;
            int i16 = i13 % 2;
        } else {
            transactionNotAuthorisedReason = null;
        }
        return new TransactionNotAuthorised(transactionNotAuthorisedReason);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    @NotNull
    public static final TransactionResult setDividerPadding(@NotNull rs rsVar) {
        TransactionErrorCause transactionErrorCause;
        int i10;
        TransactionCancelReason transactionCancelReason;
        Intrinsics.checkNotNullParameter(rsVar, "");
        if (rsVar instanceof rr) {
            rr rrVar = (rr) rsVar;
            return new TransactionCompleted((TransactionProcessingResult) setOnFocusChangeListener(new Object[]{rrVar.setOnFocusChangeListener()}, 1483229436, -1483229436, (int) System.currentTimeMillis()), rrVar.setX(), (UiMessage) ry.setDividerPadding(new Object[]{rrVar.setCompoundDrawableTintBlendMode()}, -2090061952, 2090061955, (int) System.currentTimeMillis()), rrVar.setY(), rrVar.setDividerPadding());
        }
        if (rsVar instanceof rn) {
            rq x4 = ((rn) rsVar).setX();
            int i11 = f58161b + 5;
            f58162c = i11 % 128;
            int i12 = i11 % 2;
            switch (setX.setX[x4.ordinal()]) {
                case 1:
                    transactionCancelReason = TransactionCancelReason.TRANSACTION_WAS_TERMINATED;
                    break;
                case 2:
                    transactionCancelReason = TransactionCancelReason.USER_CANCELLED_PIN_PAD;
                    break;
                case 3:
                    transactionCancelReason = TransactionCancelReason.SESSION_DEACTIVATED;
                    break;
                case 4:
                    transactionCancelReason = TransactionCancelReason.DEVICE_STATE_FAILURE;
                    break;
                case 5:
                    transactionCancelReason = TransactionCancelReason.DEVICE_STATE_FAILURE;
                    break;
                case 6:
                    transactionCancelReason = TransactionCancelReason.TIME_CHECK_ERROR;
                    break;
                case 7:
                    transactionCancelReason = TransactionCancelReason.TERMINAL_DISPOSED;
                    int i13 = f58162c + 11;
                    f58161b = i13 % 128;
                    int i14 = i13 % 2;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new TransactionCancelled(transactionCancelReason);
        }
        if (rsVar instanceof rw) {
            rw rwVar = (rw) rsVar;
            byte[] dividerPadding = rwVar.setDividerPadding();
            ro x6 = rwVar.setX();
            int i15 = f58161b + 45;
            f58162c = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 60 / 0;
                switch (setX.setY[x6.ordinal()]) {
                    case 1:
                        transactionErrorCause = TransactionErrorCause.NETWORK_CONNECTION_ERROR;
                        i10 = f58162c + 71;
                        f58161b = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        break;
                    case 2:
                        transactionErrorCause = TransactionErrorCause.MICROPHONE_USAGE_DETECTED;
                        break;
                    case 3:
                        transactionErrorCause = TransactionErrorCause.CAMERA_USAGE_DETECTED;
                        break;
                    case 4:
                        transactionErrorCause = TransactionErrorCause.EXTERNAL_CAMERA_DETECTED;
                        break;
                    case 5:
                        transactionErrorCause = TransactionErrorCause.TOTAL_ELAPSED_TIMEOUT;
                        break;
                    case 6:
                        transactionErrorCause = TransactionErrorCause.DISCOVERY_TIMEOUT;
                        break;
                    case 7:
                        transactionErrorCause = TransactionErrorCause.PIN_ENTRY_ACCUMULATED_TIMEOUT;
                        break;
                    case 8:
                        transactionErrorCause = TransactionErrorCause.PIN_ENTRY_TIMEOUT;
                        break;
                    case 9:
                        transactionErrorCause = TransactionErrorCause.AUTHORIZATION_IN_PROGRESS_TIMEOUT;
                        break;
                    case 10:
                        transactionErrorCause = TransactionErrorCause.INTERNAL_ERROR;
                        int i17 = f58162c + 49;
                        f58161b = i17 % 128;
                        int i18 = i17 % 2;
                        break;
                    case 11:
                        transactionErrorCause = TransactionErrorCause.HOST_CALLBACK_ERROR;
                        break;
                    case 12:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_OBSCURED_ERROR;
                        break;
                    case 13:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_DETACHED_ERROR;
                        break;
                    case 14:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_LAUNCH_TIMEOUT;
                        break;
                    case 15:
                        transactionErrorCause = TransactionErrorCause.NFC_ERROR;
                        break;
                    case 16:
                        transactionErrorCause = TransactionErrorCause.APP_IN_BACKGROUND;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                switch (setX.setY[x6.ordinal()]) {
                    case 1:
                        transactionErrorCause = TransactionErrorCause.NETWORK_CONNECTION_ERROR;
                        i10 = f58162c + 71;
                        f58161b = i10 % 128;
                        if (i10 % 2 != 0) {
                            throw null;
                        }
                        break;
                    case 2:
                        transactionErrorCause = TransactionErrorCause.MICROPHONE_USAGE_DETECTED;
                        break;
                    case 3:
                        transactionErrorCause = TransactionErrorCause.CAMERA_USAGE_DETECTED;
                        break;
                    case 4:
                        transactionErrorCause = TransactionErrorCause.EXTERNAL_CAMERA_DETECTED;
                        break;
                    case 5:
                        transactionErrorCause = TransactionErrorCause.TOTAL_ELAPSED_TIMEOUT;
                        break;
                    case 6:
                        transactionErrorCause = TransactionErrorCause.DISCOVERY_TIMEOUT;
                        break;
                    case 7:
                        transactionErrorCause = TransactionErrorCause.PIN_ENTRY_ACCUMULATED_TIMEOUT;
                        break;
                    case 8:
                        transactionErrorCause = TransactionErrorCause.PIN_ENTRY_TIMEOUT;
                        break;
                    case 9:
                        transactionErrorCause = TransactionErrorCause.AUTHORIZATION_IN_PROGRESS_TIMEOUT;
                        break;
                    case 10:
                        transactionErrorCause = TransactionErrorCause.INTERNAL_ERROR;
                        int i19 = f58162c + 49;
                        f58161b = i19 % 128;
                        int i110 = i19 % 2;
                        break;
                    case 11:
                        transactionErrorCause = TransactionErrorCause.HOST_CALLBACK_ERROR;
                        break;
                    case 12:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_OBSCURED_ERROR;
                        break;
                    case 13:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_DETACHED_ERROR;
                        break;
                    case 14:
                        transactionErrorCause = TransactionErrorCause.PIN_PAD_LAUNCH_TIMEOUT;
                        break;
                    case 15:
                        transactionErrorCause = TransactionErrorCause.NFC_ERROR;
                        break;
                    case 16:
                        transactionErrorCause = TransactionErrorCause.APP_IN_BACKGROUND;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            qw onFocusChangeListener = rwVar.setOnFocusChangeListener();
            return new TransactionFailed(dividerPadding, transactionErrorCause, onFocusChangeListener != null ? setCompoundDrawableTintBlendMode(onFocusChangeListener) : null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 com.mypinpad.tsdk.i.ra, still in use, count: 2, list:
          (r2v5 com.mypinpad.tsdk.i.ra) from 0x00f6: MOVE (r21v0 com.mypinpad.tsdk.i.ra) = (r2v5 com.mypinpad.tsdk.i.ra)
          (r2v5 com.mypinpad.tsdk.i.ra) from 0x0069: PHI (r2v8 com.mypinpad.tsdk.i.ra) = (r2v5 com.mypinpad.tsdk.i.ra), (r2v15 com.mypinpad.tsdk.i.ra) binds: [B:14:0x0065, B:22:0x00da] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @org.jetbrains.annotations.NotNull
    public static final com.mypinpad.tsdk.isolation.qw setOnFocusChangeListener(@org.jetbrains.annotations.NotNull java.lang.Throwable r28) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.rx.setOnFocusChangeListener(java.lang.Throwable):com.mypinpad.tsdk.i.qw");
    }
}
