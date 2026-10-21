package com.mypinpad.tsdk.isolation;

import com.adobe.marketing.mobile.EventDataKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J$\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J_\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0004¢\u0006\u0004\b\"\u0010#JQ\u0010$\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0004¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001eH\u0004JL\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\fH\u0004J:\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0004R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/OutcomeProcessor;", "", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", "databaseBase", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "outcomeParameterSet", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/ErrorIndication;", "errorIndication", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/UserInterfaceRequest;", "userInterfaceRequest", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "onlineRequest", "", "createLog", "database", "", "prepareDiscoverCvmInternalTag", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/TlvList;", "prepareDiscretionaryTagList", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;", "status", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "isUIRequestOnOutcomePresent", c.f84805j, "", "fieldOffRequest", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "cvmStatus", "", "onlineResponseData", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/PinEntryResults;", "pinEntryResult", "prepareOutcomeParameter", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;[BLcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/PinEntryResults;)Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "prepareOutcomeParameterWithOnlineResponse", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Byte;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;[B)Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "uiMessage", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", "uiStatus", "holdTime", "prepareUiRequestData", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQ", "transactionLog", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "sendKernelSignal", "sendUiOnlyKernelSignal", "isCardReadOkSent", "Z", "<init>", "()V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public abstract class ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final activateSession f55436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ValueQualifier f55437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final activateSession f55438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final setItemChecked f55439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final setContentCaptureSession f55440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final setDrawSelectorOnTop f55441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final fd f55442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final getY f55443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55444i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55445j = 1;

    @NotNull
    public static final setY setDividerPadding = new setY(null);

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;
        public static final /* synthetic */ int[] setDividerPadding;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[Terminal.valuesCustom().length];
            iArr[Terminal.KERNEL_6.ordinal()] = 1;
            setOnFocusChangeListener = iArr;
            int[] iArr2 = new int[setTransitionVisibility.values().length];
            iArr2[setTransitionVisibility.setOnFocusChangeListener.ordinal()] = 1;
            iArr2[setTransitionVisibility.setY.ordinal()] = 2;
            iArr2[setTransitionVisibility.setX.ordinal()] = 3;
            iArr2[setTransitionVisibility.setDividerPadding.ordinal()] = 4;
            setDividerPadding = iArr2;
            int[] iArr3 = new int[fd.valuesCustom().length];
            iArr3[fd.APPROVED.ordinal()] = 1;
            iArr3[fd.ONLINE_REQUEST.ordinal()] = 2;
            iArr3[fd.DECLINED.ordinal()] = 3;
            iArr3[fd.END_APPLICATION.ordinal()] = 4;
            iArr3[fd.TRY_ANOTHER_INTERFACE.ordinal()] = 5;
            setCompoundDrawableTintBlendMode = iArr3;
            int i10 = 27 % 128;
            int i11 = 27 % 2;
        }
    }

    static {
        activateSession activatesession = activateSession.N_A;
        f55436a = activatesession;
        f55437b = ValueQualifier.setOnDragListener;
        f55438c = activatesession;
        f55439d = setItemChecked.setCompoundDrawableTintBlendMode;
        f55440e = setContentCaptureSession.setDividerPadding;
        f55441f = setDrawSelectorOnTop.setX;
        f55442g = fd.N_A;
        f55443h = getY.setNavigationOnClickListener;
        int i10 = f55444i + 49;
        f55445j = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x011b  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:36:0x015d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0202  */
    /* JADX WARN: Code duplicated, block: B:41:0x0214  */
    /* JADX WARN: Code duplicated, block: B:42:0x024c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        setImportantForAutofill setimportantforautofill;
        fd fdVar;
        int i10;
        setTransitionVisibility settransitionvisibility;
        int i11;
        Object x4;
        getBeepOnFailure getbeeponfailure;
        int i12;
        j jVar = (j) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[2];
        int i13 = f55445j;
        int i14 = (i13 & 88) + (i13 | 88);
        int i15 = -1;
        int i16 = (-2) - (i14 ^ (-1));
        f55444i = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 76 / 0;
            if (setscrollbardefaultdelaybeforefade.setDividerPadding() == Terminal.KERNEL_6) {
                setimportantforautofill = null;
                if (jVar == null) {
                    int i18 = f55445j;
                    int i19 = (i18 ^ 113) + ((i18 & 113) << 1);
                    int i20 = i19 % 128;
                    f55444i = i20;
                    int i21 = i19 % 2;
                    int i22 = i20 + 43;
                    f55445j = i22 % 128;
                    int i23 = i22 % 2;
                    fdVar = null;
                } else {
                    fdVar = (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar));
                    int i24 = f55444i + 61;
                    f55445j = i24 % 128;
                    int i25 = i24 % 2;
                }
                if (fdVar == fd.ONLINE_REQUEST) {
                    int i26 = f55445j;
                    i10 = ((i26 & (-50)) | ((~i26) & 49)) + ((i26 & 49) << 1);
                    f55444i = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                    settransitionvisibility = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
                    if (settransitionvisibility == null) {
                        int i27 = f55445j + 89;
                        f55444i = i27 % 128;
                        int i28 = i27 % 2;
                    } else {
                        i15 = setOnFocusChangeListener.setDividerPadding[settransitionvisibility.ordinal()];
                        int i29 = f55445j;
                        int i30 = (i29 & (-100)) | ((~i29) & 99);
                        int i31 = -(-((i29 & 99) << 1));
                        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                        f55444i = i32 % 128;
                        int i33 = i32 % 2;
                    }
                    if (i15 != 1) {
                        setimportantforautofill = setImportantForAutofill.setDividerPadding;
                        int i34 = f55445j;
                        int i35 = (i34 ^ 95) + ((i34 & 95) << 1);
                        f55444i = i35 % 128;
                        int i36 = i35 % 2;
                    } else if (i15 != 2) {
                        setimportantforautofill = setImportantForAutofill.setOnFocusChangeListener;
                        int i37 = f55445j;
                        int i38 = (((i37 | 16) << 1) - (i37 ^ 16)) - 1;
                        f55444i = i38 % 128;
                        int i39 = i38 % 2;
                    } else if (i15 != 3) {
                        setimportantforautofill = setImportantForAutofill.setX;
                        int i40 = f55445j + 73;
                        f55444i = i40 % 128;
                        int i41 = i40 % 2;
                    } else if (i15 != 4) {
                        int i42 = f55445j;
                        int i43 = (((i42 & (-124)) | ((~i42) & 123)) - (~(-(-((i42 & 123) << 1))))) - 1;
                        f55444i = i43 % 128;
                        int i44 = i43 % 2;
                    } else {
                        setimportantforautofill = setImportantForAutofill.setCompoundDrawableTintBlendMode;
                        int i45 = f55445j + 51;
                        f55444i = i45 % 128;
                        int i46 = i45 % 2;
                    }
                    if (setimportantforautofill != null) {
                        int i47 = f55444i;
                        int i48 = i47 & 31;
                        int i49 = -(-(i47 | 31));
                        i11 = ((i48 | i49) << 1) - (i49 ^ i48);
                        f55445j = i11 % 128;
                        if (i11 % 2 == 0) {
                            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                            setAnimation setanimation = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis());
                            x4 = TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                        } else {
                            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                            setAnimation setanimation2 = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis());
                            x4 = TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
                        }
                        String str = (String) x4;
                        byte[] bArr = new byte[1];
                        int i50 = f55444i;
                        int i51 = (i50 ^ 45) + ((i50 & 45) << 1);
                        f55445j = i51 % 128;
                        int i52 = i51 % 2;
                        bArr[0] = setimportantforautofill.setDividerPadding();
                        int i53 = f55444i;
                        int i54 = i53 & 121;
                        int i55 = ((i53 ^ 121) | i54) << 1;
                        int i56 = -((i53 | 121) & (~i54));
                        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                        f55445j = i57 % 128;
                        int i58 = i57 % 2;
                        getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, Terminal.KERNEL_6, Boolean.FALSE, 24}, -976227287, 976227290, 24);
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                        if (((List) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1161703492, 1161703507, System.identityHashCode(setscrollbardefaultdelaybeforefade))).contains((TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis()))) {
                            int i59 = f55444i;
                            int i60 = i59 & 107;
                            int i61 = i59 | 107;
                            int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                            i12 = i62 % 128;
                            f55445j = i12;
                            int i63 = i62 % 2;
                            if (getbeeponfailure2 != null) {
                                int i64 = ((i12 & 21) - (~(i12 | 21))) - 1;
                                f55444i = i64 % 128;
                                int i65 = i64 % 2;
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, getbeeponfailure}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure2));
                                int i66 = f55444i;
                                int i67 = ((i66 ^ 1) | (i66 & 1)) << 1;
                                int i68 = -(((~i66) & 1) | (i66 & (-2)));
                                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                                f55445j = i69 % 128;
                                int i70 = i69 % 2;
                            }
                        }
                    }
                }
            }
        } else if (setscrollbardefaultdelaybeforefade.setDividerPadding() == Terminal.KERNEL_6) {
            setimportantforautofill = null;
            if (jVar == null) {
                int i110 = f55445j;
                int i111 = (i110 ^ 113) + ((i110 & 113) << 1);
                int i210 = i111 % 128;
                f55444i = i210;
                int i211 = i111 % 2;
                int i212 = i210 + 43;
                f55445j = i212 % 128;
                int i213 = i212 % 2;
                fdVar = null;
            } else {
                fdVar = (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar));
                int i214 = f55444i + 61;
                f55445j = i214 % 128;
                int i215 = i214 % 2;
            }
            if (fdVar == fd.ONLINE_REQUEST) {
                int i216 = f55445j;
                i10 = ((i216 & (-50)) | ((~i216) & 49)) + ((i216 & 49) << 1);
                f55444i = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                settransitionvisibility = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
                if (settransitionvisibility == null) {
                    int i217 = f55445j + 89;
                    f55444i = i217 % 128;
                    int i218 = i217 % 2;
                } else {
                    i15 = setOnFocusChangeListener.setDividerPadding[settransitionvisibility.ordinal()];
                    int i219 = f55445j;
                    int i310 = (i219 & (-100)) | ((~i219) & 99);
                    int i311 = -(-((i219 & 99) << 1));
                    int i312 = (i310 ^ i311) + ((i311 & i310) << 1);
                    f55444i = i312 % 128;
                    int i313 = i312 % 2;
                }
                if (i15 != 1) {
                    setimportantforautofill = setImportantForAutofill.setDividerPadding;
                    int i314 = f55445j;
                    int i315 = (i314 ^ 95) + ((i314 & 95) << 1);
                    f55444i = i315 % 128;
                    int i316 = i315 % 2;
                } else if (i15 != 2) {
                    setimportantforautofill = setImportantForAutofill.setOnFocusChangeListener;
                    int i317 = f55445j;
                    int i318 = (((i317 | 16) << 1) - (i317 ^ 16)) - 1;
                    f55444i = i318 % 128;
                    int i319 = i318 % 2;
                } else if (i15 != 3) {
                    setimportantforautofill = setImportantForAutofill.setX;
                    int i410 = f55445j + 73;
                    f55444i = i410 % 128;
                    int i411 = i410 % 2;
                } else if (i15 != 4) {
                    int i412 = f55445j;
                    int i413 = (((i412 & (-124)) | ((~i412) & 123)) - (~(-(-((i412 & 123) << 1))))) - 1;
                    f55444i = i413 % 128;
                    int i414 = i413 % 2;
                } else {
                    setimportantforautofill = setImportantForAutofill.setCompoundDrawableTintBlendMode;
                    int i415 = f55445j + 51;
                    f55444i = i415 % 128;
                    int i416 = i415 % 2;
                }
                if (setimportantforautofill != null) {
                    int i417 = f55444i;
                    int i418 = i417 & 31;
                    int i419 = -(-(i417 | 31));
                    i11 = ((i418 | i419) << 1) - (i419 ^ i418);
                    f55445j = i11 % 128;
                    if (i11 % 2 == 0) {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
                        setAnimation setanimation3 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis());
                        x4 = TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3));
                    } else {
                        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = getBeepOnFailure.setOnFocusChangeListener;
                        setAnimation setanimation4 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis());
                        x4 = TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
                    }
                    String str2 = (String) x4;
                    byte[] bArr2 = new byte[1];
                    int i510 = f55444i;
                    int i511 = (i510 ^ 45) + ((i510 & 45) << 1);
                    f55445j = i511 % 128;
                    int i512 = i511 % 2;
                    bArr2[0] = setimportantforautofill.setDividerPadding();
                    int i513 = f55444i;
                    int i514 = i513 & 121;
                    int i515 = ((i513 ^ 121) | i514) << 1;
                    int i516 = -((i513 | 121) & (~i514));
                    int i517 = (i515 ^ i516) + ((i516 & i515) << 1);
                    f55445j = i517 % 128;
                    int i518 = i517 % 2;
                    getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str2, bArr2, Terminal.KERNEL_6, Boolean.FALSE, 24}, -976227287, 976227290, 24);
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (((List) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1161703492, 1161703507, System.identityHashCode(setscrollbardefaultdelaybeforefade))).contains((TransactionFailed) setAnimation.setY(new Object[0], 1932574301, -1932574099, (int) System.currentTimeMillis()))) {
                        int i519 = f55444i;
                        int i610 = i519 & 107;
                        int i611 = i519 | 107;
                        int i612 = ((i610 | i611) << 1) - (i611 ^ i610);
                        i12 = i612 % 128;
                        f55445j = i12;
                        int i613 = i612 % 2;
                        if (getbeeponfailure2 != null) {
                            int i614 = ((i12 & 21) - (~(i12 | 21))) - 1;
                            f55444i = i614 % 128;
                            int i615 = i614 % 2;
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, getbeeponfailure}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure2));
                            int i616 = f55444i;
                            int i617 = ((i616 ^ 1) | (i616 & 1)) << 1;
                            int i618 = -(((~i616) & 1) | (i616 & (-2)));
                            int i619 = (i617 ^ i618) + ((i618 & i617) << 1);
                            f55445j = i619 % 128;
                            int i71 = i619 % 2;
                        }
                    }
                }
            }
        }
        int i72 = f55444i;
        int i73 = (i72 ^ 61) + ((i72 & 61) << 1);
        f55445j = i73 % 128;
        int i74 = i73 % 2;
    }

    public static final /* synthetic */ getY getNavBarTitleString() {
        return (getY) setOnFocusChangeListener(new Object[0], 1372261016, -1372261009, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ValueQualifier setDividerPadding() {
        return (ValueQualifier) setOnFocusChangeListener(new Object[0], -372643454, 372643463, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ fd setOnDragListener() {
        return (fd) setOnFocusChangeListener(new Object[0], 1051207347, -1051207335, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:117:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:119:0x06e8  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        fd fdVar;
        int i13;
        byte[] bArr;
        TransactionProcessingResult transactionProcessingResult;
        int i14;
        Object onFocusChangeListener;
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ~((~i10) | i11);
        int i18 = (((~(i10 | (~i11))) | i17 | i16) * 764) + (((~(i15 | i11)) | i17) * (-1528)) + ((i11 | i16) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i19 = 1;
        switch (i18) {
            case 1:
                obj = null;
                a(objArr);
                break;
            case 2:
                obj = null;
                j jVar = (j) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                int i20 = f55445j + 123;
                int i21 = i20 % 128;
                f55444i = i21;
                if (i20 % 2 != 0) {
                    int i22 = 16 / 0;
                    if (jVar == null) {
                        int i23 = i21 & 77;
                        int i24 = (77 ^ i21) | i23;
                        int i25 = (i23 & i24) + (i23 | i24);
                        int i26 = i25 % 128;
                        f55445j = i26;
                        int i27 = i25 % 2;
                        int i28 = i26 + 73;
                        f55444i = i28 % 128;
                        int i29 = i28 % 2;
                        fdVar = null;
                    } else {
                        fdVar = (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar));
                        int i30 = f55444i;
                        int i31 = i30 & 71;
                        int i32 = (i30 | 71) & (~i31);
                        int i33 = -(-(i31 << 1));
                        int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                        f55445j = i34 % 128;
                        int i35 = i34 % 2;
                    }
                } else if (jVar == null) {
                    int i210 = i21 & 77;
                    int i211 = (77 ^ i21) | i210;
                    int i212 = (i210 & i211) + (i210 | i211);
                    int i213 = i212 % 128;
                    f55445j = i213;
                    int i214 = i212 % 2;
                    int i215 = i213 + 73;
                    f55444i = i215 % 128;
                    int i216 = i215 % 2;
                    fdVar = null;
                } else {
                    fdVar = (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar));
                    int i36 = f55444i;
                    int i37 = i36 & 71;
                    int i38 = (i36 | 71) & (~i37);
                    int i39 = -(-(i37 << 1));
                    int i310 = ((i38 | i39) << 1) - (i38 ^ i39);
                    f55445j = i310 % 128;
                    int i311 = i310 % 2;
                }
                if (fdVar == null) {
                    int i40 = f55445j;
                    int i41 = (i40 & 115) + (i40 | 115);
                    int i42 = i41 % 128;
                    f55444i = i42;
                    int i43 = i41 % 2;
                    int i44 = i42 & 117;
                    int i45 = (i44 - (~((i42 ^ 117) | i44))) - 1;
                    f55445j = i45 % 128;
                    int i46 = i45 % 2;
                    i13 = -1;
                } else {
                    i13 = setOnFocusChangeListener.setCompoundDrawableTintBlendMode[fdVar.ordinal()];
                    int i47 = f55444i;
                    int i48 = i47 & 119;
                    int i49 = (i47 ^ 119) | i48;
                    int i50 = (i48 & i49) + (i49 | i48);
                    f55445j = i50 % 128;
                    int i51 = i50 % 2;
                }
                if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
                    ev evVar = ev.INSTANCE;
                    setMaxWidth setmaxwidth = (setMaxWidth) ev.setY(new Object[]{setscrollbardefaultdelaybeforefade}, -508339596, 508339597, (int) System.currentTimeMillis());
                    int i52 = f55445j;
                    int i53 = (i52 | 111) << 1;
                    int i54 = -(i52 ^ 111);
                    int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                    f55444i = i55 % 128;
                    int i56 = i55 % 2;
                    return setmaxwidth;
                }
                int i57 = f55445j + 35;
                f55444i = i57 % 128;
                int i58 = i57 % 2;
                break;
            case 3:
                int i59 = f55445j;
                int i60 = ((i59 | 55) << 1) - (i59 ^ 55);
                f55444i = i60 % 128;
                int i61 = i60 % 2;
                int i62 = i59 | 125;
                int i63 = i62 << 1;
                int i64 = -((~(i59 & 125)) & i62);
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f55444i = i65 % 128;
                if (i65 % 2 == 0) {
                    return f55441f;
                }
                throw null;
            case 4:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                activateSession activatesession = (activateSession) objArr[1];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[2];
                byte[] bArr2 = (byte[]) objArr[3];
                int i66 = f55445j + 7;
                f55444i = i66 % 128;
                if (i66 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                    Intrinsics.checkNotNullParameter(activatesession, "");
                    Intrinsics.checkNotNullParameter(valueQualifier, "");
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    setAnimation setanimation = setAnimation.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                Intrinsics.checkNotNullParameter(activatesession, "");
                Intrinsics.checkNotNullParameter(valueQualifier, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                setAnimation setanimation2 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                if (getbeeponfailure == null) {
                    int i67 = f55444i;
                    int i68 = i67 & 71;
                    int i69 = (i67 ^ 71) | i68;
                    int i70 = (i68 & i69) + (i69 | i68);
                    f55445j = i70 % 128;
                    if (i70 % 2 == 0) {
                        throw null;
                    }
                    bArr = null;
                } else {
                    byte[] bArr3 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                    int i71 = f55444i;
                    int i72 = i71 & 97;
                    int i73 = (((i71 | 97) & (~i72)) - (~(-(-(i72 << 1))))) - 1;
                    f55445j = i73 % 128;
                    int i74 = i73 % 2;
                    bArr = bArr3;
                }
                l lVar = new l(activatesession, valueQualifier, bArr2, (byte[]) setY.setX(new Object[0], 1514668654, -1514668649, (int) System.currentTimeMillis()), setSelector.NONE, (byte[]) setY.setX(new Object[0], 1936104505, -1936104498, (int) System.currentTimeMillis()), bArr);
                int i75 = f55445j;
                int i76 = ((i75 & 4) + (i75 | 4)) - 1;
                f55444i = i76 % 128;
                int i77 = i76 % 2;
                return lVar;
            case 5:
                ez ezVar = (ez) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[3];
                j jVar2 = (j) objArr[4];
                l lVar2 = (l) objArr[5];
                f fVar = (f) objArr[6];
                int i78 = f55444i;
                int i79 = ((i78 ^ 125) | (i78 & 125)) << 1;
                int i80 = -(((~i78) & 125) | (i78 & (-126)));
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                f55445j = i81 % 128;
                int i82 = i81 % 2;
                obj = (fk) setOnFocusChangeListener(new Object[]{ezVar, setscrollbardefaultdelaybeforefade3, settextkeepstate, getbeeponfailure2, jVar2, lVar2, fVar, null}, -923790656, 923790670, System.identityHashCode(ezVar));
                int i83 = f55444i;
                int i84 = i83 & 15;
                int i85 = ((i83 ^ 15) | i84) << 1;
                int i86 = -((i83 | 15) & (~i84));
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                f55445j = i87 % 128;
                if (i87 % 2 == 0) {
                    throw null;
                }
                break;
            case 6:
                int i88 = f55445j;
                int i89 = i88 + 97;
                f55444i = i89 % 128;
                int i90 = i89 % 2;
                int i91 = (i88 & 1) + (i88 | 1);
                f55444i = i91 % 128;
                if (i91 % 2 == 0) {
                    return f55440e;
                }
                throw null;
            case 7:
                int i92 = f55444i;
                int i93 = ((i92 ^ 50) + ((i92 & 50) << 1)) - 1;
                f55445j = i93 % 128;
                if (i93 % 2 == 0) {
                    int i94 = 77 / 0;
                }
                return f55443h;
            case 8:
                fd fdVar2 = (fd) objArr[0];
                getY gety = (getY) objArr[1];
                Boolean bool = (Boolean) objArr[2];
                Boolean bool2 = (Boolean) objArr[3];
                Byte b10 = (Byte) objArr[4];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
                byte[] bArr4 = (byte[]) objArr[6];
                TransactionProcessingResult transactionProcessingResult2 = (TransactionProcessingResult) objArr[7];
                int iIntValue = ((Number) objArr[8]).intValue();
                int i95 = f55444i;
                int i96 = i95 & 97;
                int i97 = -(-((i95 ^ 97) | i96));
                int i98 = (i96 ^ i97) + ((i96 & i97) << 1);
                f55445j = i98 % 128;
                if (i98 % 2 != 0 ? (iIntValue & 64) != 0 : (iIntValue & 89) != 0) {
                    int i99 = i95 & 75;
                    int i100 = (i99 - (~(-(-((i95 ^ 75) | i99))))) - 1;
                    int i101 = i100 % 128;
                    f55445j = i101;
                    int i102 = i100 % 2;
                    int i103 = i101 + 95;
                    f55444i = i103 % 128;
                    int i104 = i103 % 2;
                    bArr4 = null;
                }
                if ((128 & iIntValue) != 0) {
                    int i105 = f55444i;
                    int i106 = ((i105 ^ 13) | (i105 & 13)) << 1;
                    int i107 = -(((~i105) & 13) | (i105 & (-14)));
                    int i108 = (i106 & i107) + (i107 | i106);
                    f55445j = i108 % 128;
                    if (i108 % 2 == 0) {
                        int i109 = 42 / 0;
                    }
                    i14 = 8;
                    transactionProcessingResult = null;
                } else {
                    transactionProcessingResult = transactionProcessingResult2;
                    i14 = 8;
                }
                Object[] objArr2 = new Object[i14];
                objArr2[0] = fdVar2;
                objArr2[1] = gety;
                objArr2[2] = bool;
                objArr2[3] = bool2;
                objArr2[4] = b10;
                objArr2[5] = settransitionvisibility;
                objArr2[6] = bArr4;
                objArr2[7] = transactionProcessingResult;
                j jVar3 = (j) setOnFocusChangeListener(objArr2, -2111922168, 2111922183, (int) System.currentTimeMillis());
                int i110 = f55445j + 35;
                f55444i = i110 % 128;
                int i111 = i110 % 2;
                return jVar3;
            case 9:
                int i112 = f55445j + 119;
                f55444i = i112 % 128;
                if (i112 % 2 == 0) {
                    return f55437b;
                }
                throw null;
            case 10:
                int i113 = f55444i;
                int i114 = (((i113 | 82) << 1) - (i113 ^ 82)) - 1;
                f55445j = i114 % 128;
                int i115 = i114 % 2;
                int i116 = (i113 & 25) + (i113 | 25);
                f55445j = i116 % 128;
                int i117 = i116 % 2;
                return f55438c;
            case 11:
                fd fdVar3 = (fd) objArr[1];
                getY gety2 = (getY) objArr[2];
                Boolean bool3 = (Boolean) objArr[3];
                byte[] bArr5 = (byte[]) objArr[4];
                int i118 = f55445j;
                int i119 = (((i118 ^ 117) | (i118 & 117)) << 1) - (((~i118) & 117) | (i118 & (-118)));
                f55444i = i119 % 128;
                if (i119 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fdVar3, "");
                    Intrinsics.checkNotNullParameter(gety2, "");
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{fdVar3, gety2, bool3, null, null, null, bArr5, null, 25068}, -1608764632, 1608764640, 25068);
                } else {
                    Intrinsics.checkNotNullParameter(fdVar3, "");
                    Intrinsics.checkNotNullParameter(gety2, "");
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{fdVar3, gety2, bool3, null, null, null, bArr5, null, 128}, -1608764632, 1608764640, 128);
                }
                obj = (j) onFocusChangeListener;
                break;
            case 12:
                int i120 = f55445j;
                int i121 = (((i120 ^ 59) | (i120 & 59)) << 1) - (((~i120) & 59) | (i120 & (-60)));
                int i122 = i121 % 128;
                f55444i = i122;
                int i123 = i121 % 2;
                int i124 = i122 & 17;
                int i125 = ((i122 ^ 17) | i124) << 1;
                int i126 = -((i122 | 17) & (~i124));
                int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                f55445j = i127 % 128;
                int i128 = i127 % 2;
                return f55442g;
            case 13:
                int i129 = f55444i;
                int i130 = i129 + 97;
                f55445j = i130 % 128;
                int i131 = i130 % 2;
                int i132 = (i129 ^ 2) + ((i129 & 2) << 1);
                int i133 = (i132 ^ (-1)) + (i132 << 1);
                f55445j = i133 % 128;
                int i134 = i133 % 2;
                return f55436a;
            case 14:
                ez ezVar2 = (ez) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[3];
                j jVar4 = (j) objArr[4];
                l lVar3 = (l) objArr[5];
                f fVar2 = (f) objArr[6];
                String compoundDrawableTintBlendMode = (String) objArr[7];
                int i135 = f55444i;
                int i136 = i135 & 23;
                int i137 = i135 | 23;
                int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                f55445j = i138 % 128;
                if (i138 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                if (compoundDrawableTintBlendMode == null) {
                    int i139 = f55445j;
                    int i140 = (-2) - ((-1) ^ ((i139 & 56) + (i139 | 56)));
                    f55444i = i140 % 128;
                    int i141 = i140 % 2;
                    compoundDrawableTintBlendMode = ezVar2.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade4, jVar4, fVar2, lVar3, getbeeponfailure3);
                    int i142 = f55445j;
                    int i143 = i142 & 1;
                    int i144 = (i142 | 1) & (~i143);
                    int i145 = -(-(i143 << 1));
                    int i146 = (i144 & i145) + (i144 | i145);
                    f55444i = i146 % 128;
                    int i147 = i146 % 2;
                } else {
                    int i148 = f55444i;
                    int i149 = (i148 | 103) << 1;
                    int i150 = -(i148 ^ 103);
                    int i151 = (i149 & i150) + (i150 | i149);
                    f55445j = i151 % 128;
                    int i152 = i151 % 2;
                }
                String str = compoundDrawableTintBlendMode;
                if (setOnFocusChangeListener.setOnFocusChangeListener[setscrollbardefaultdelaybeforefade4.setDividerPadding().ordinal()] == 1) {
                    int i153 = f55445j;
                    int i154 = (i153 & 37) + (i153 | 37);
                    f55444i = i154 % 128;
                    if (i154 % 2 != 0) {
                        setOnFocusChangeListener(new Object[]{jVar4, setscrollbardefaultdelaybeforefade4, getbeeponfailure3}, 1952304975, -1952304974, (int) System.currentTimeMillis());
                        int i155 = 44 / 0;
                        i19 = 1;
                    } else {
                        i19 = 1;
                        setOnFocusChangeListener(new Object[]{jVar4, setscrollbardefaultdelaybeforefade4, getbeeponfailure3}, 1952304975, -1952304974, (int) System.currentTimeMillis());
                    }
                    int i156 = f55445j;
                    int i157 = (((i156 | 89) << i19) - (~(-(((~i156) & 89) | (i156 & (-90)))))) - i19;
                    f55444i = i157 % 128;
                    int i158 = i157 % 2;
                }
                Object[] objArr3 = new Object[2];
                objArr3[0] = jVar4;
                objArr3[i19] = setscrollbardefaultdelaybeforefade4;
                setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate2, new setTextAppearance(jVar4, fVar2, lVar3, getbeeponfailure3, (byte[]) setscrollbardefaultdelaybeforefade4.setCompoundDrawableTintBlendMode().setY().clone(), setscrollbardefaultdelaybeforefade4.setDividerPadding().setOnFocusChangeListener(), (setMaxWidth) setOnFocusChangeListener(objArr3, 742782712, -742782710, (int) System.currentTimeMillis()), str)}, -1386319901, 1386319908, System.identityHashCode(settextkeepstate2));
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{30002, new setAnimationCacheEnabled(setscrollbardefaultdelaybeforefade4), 4}, 1336485880, -1336485874, 30002);
                fk fkVar = fk.setOnFocusChangeListener;
                int i159 = f55445j;
                int i160 = (i159 ^ 3) + ((i159 & 3) << 1);
                f55444i = i160 % 128;
                int i161 = i160 % 2;
                return fkVar;
            case 15:
                fd fdVar4 = (fd) objArr[0];
                getY gety3 = (getY) objArr[1];
                Boolean bool4 = (Boolean) objArr[2];
                Boolean bool5 = (Boolean) objArr[3];
                Byte b11 = (Byte) objArr[4];
                setTransitionVisibility settransitionvisibility2 = (setTransitionVisibility) objArr[5];
                byte[] bArr6 = (byte[]) objArr[6];
                TransactionProcessingResult transactionProcessingResult3 = (TransactionProcessingResult) objArr[7];
                Intrinsics.checkNotNullParameter(fdVar4, "");
                Intrinsics.checkNotNullParameter(gety3, "");
                return new j(fdVar4, gety3, bool4 == null ? false : bool4.booleanValue(), !(bool4 == null ? true : bool4.booleanValue()), bool5 != null ? bool5.booleanValue() : false, b11 == null ? (byte) -1 : b11.byteValue(), settransitionvisibility2, bArr6, transactionProcessingResult3);
            case 16:
                int i162 = f55444i;
                int i163 = i162 + 25;
                f55445j = i163 % 128;
                int i164 = i163 % 2;
                int i165 = i162 ^ 61;
                int i166 = ((i162 & 61) | i165) << 1;
                int i167 = -i165;
                int i168 = (i166 ^ i167) + ((i166 & i167) << 1);
                f55445j = i168 % 128;
                int i169 = i168 % 2;
                return f55439d;
            default:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[1];
                activateSession activatesession2 = (activateSession) objArr[2];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[3];
                byte[] bArr7 = (byte[]) objArr[4];
                String str2 = (String) objArr[5];
                int i170 = f55444i;
                int i171 = ((i170 ^ 117) | (i170 & 117)) << 1;
                int i172 = -((i170 & (-118)) | ((~i170) & 117));
                int i173 = ((i171 | i172) << 1) - (i171 ^ i172);
                f55445j = i173 % 128;
                int i174 = i173 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade5, "");
                Intrinsics.checkNotNullParameter(settextkeepstate3, "");
                Intrinsics.checkNotNullParameter(activatesession2, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(bArr7, "");
                l lVar4 = (l) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade5, activatesession2, valueQualifier2, bArr7}, -1368133254, 1368133258, (int) System.currentTimeMillis());
                if (str2 == null) {
                    int i175 = f55445j + 121;
                    f55444i = i175 % 128;
                    int i176 = i175 % 2;
                    str2 = (String) l.setX(new Object[0], 1622929278, -1622929275, (int) System.currentTimeMillis());
                    int i177 = f55444i;
                    int i178 = i177 & 9;
                    int i179 = ((i177 ^ 9) | i178) << 1;
                    int i180 = -((9 | i177) & (~i178));
                    int i181 = (i179 & i180) + (i180 | i179);
                    f55445j = i181 % 128;
                    int i182 = i181 % 2;
                } else {
                    int i183 = f55444i;
                    int i184 = i183 ^ 123;
                    int i185 = (i183 & 123) << 1;
                    int i186 = ((i184 | i185) << 1) - (i185 ^ i184);
                    f55445j = i186 % 128;
                    int i187 = i186 % 2;
                }
                setTextKeepState.setCompoundDrawableTintBlendMode(new Object[]{settextkeepstate3, new e(lVar4, str2)}, -1386319901, 1386319908, System.identityHashCode(settextkeepstate3));
                int i188 = f55445j;
                int i189 = (-2) - ((-1) ^ ((i188 ^ 50) + ((i188 & 50) << 1)));
                f55444i = i189 % 128;
                if (i189 % 2 == 0) {
                    return null;
                }
                throw null;
        }
        return obj;
    }

    public static final /* synthetic */ setDrawSelectorOnTop setOnLongClickListener() {
        return (setDrawSelectorOnTop) setOnFocusChangeListener(new Object[0], -1697139457, 1697139460, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setItemChecked setX() {
        return (setItemChecked) setOnFocusChangeListener(new Object[0], 706159950, -706159934, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ activateSession setY() {
        return (activateSession) setOnFocusChangeListener(new Object[0], -161101506, 161101516, (int) System.currentTimeMillis());
    }

    @NotNull
    public String setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @Nullable j jVar, @Nullable f fVar, @Nullable l lVar, @Nullable getBeepOnFailure getbeeponfailure) {
        int i10 = f55445j;
        int i11 = i10 & 45;
        int i12 = (i10 | 45) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f55444i = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            return "";
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        throw null;
    }

    @NotNull
    public static l setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier, @NotNull byte[] bArr) {
        return (l) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, activatesession, valueQualifier, bArr}, -1368133254, 1368133258, (int) System.currentTimeMillis());
    }

    @NotNull
    public final j setX(@NotNull fd fdVar, @NotNull getY gety, @Nullable Boolean bool, @Nullable byte[] bArr) {
        return (j) setOnFocusChangeListener(new Object[]{this, fdVar, gety, bool, bArr}, 1262280801, -1262280790, System.identityHashCode(this));
    }

    public static void setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier, @NotNull byte[] bArr, @Nullable String str) throws Exception {
        setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, settextkeepstate, activatesession, valueQualifier, bArr, str}, 1848792245, -1848792245, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ j setY(fd fdVar, getY gety, Boolean bool, Boolean bool2, Byte b10, setTransitionVisibility settransitionvisibility, byte[] bArr, TransactionProcessingResult transactionProcessingResult, int i10) {
        return (j) setOnFocusChangeListener(new Object[]{fdVar, gety, bool, bool2, b10, settransitionvisibility, bArr, transactionProcessingResult, Integer.valueOf(i10)}, -1608764632, 1608764640, i10);
    }

    @NotNull
    public final fk setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @Nullable getBeepOnFailure getbeeponfailure, @Nullable j jVar, @Nullable l lVar, @Nullable f fVar, @Nullable String str) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, getbeeponfailure, jVar, lVar, fVar, str}, -923790656, 923790670, System.identityHashCode(this));
    }

    public static final /* synthetic */ activateSession setCompoundDrawableTintBlendMode() {
        return (activateSession) setOnFocusChangeListener(new Object[0], 2095160267, -2095160254, (int) System.currentTimeMillis());
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0012\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010 \u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b\u001d\u0010$R\u0011\u0010%\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ez$setY;", "", "", "setDividerPadding", "()[B", "setX", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/setItemChecked;", "setY", "Lcom/mypinpad/tsdk/i/setItemChecked;", "setNavigationOnClickListener", "()Lcom/mypinpad/tsdk/i/setItemChecked;", "Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "()Lcom/mypinpad/tsdk/i/setContentCaptureSession;", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop;", "setOnDragListener", "Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop;", "setLayoutAnimation", "()Lcom/mypinpad/tsdk/i/setDrawSelectorOnTop;", "Lcom/mypinpad/tsdk/i/activateSession;", "Lcom/mypinpad/tsdk/i/activateSession;", "()Lcom/mypinpad/tsdk/i/activateSession;", "Lcom/mypinpad/tsdk/i/getY;", "Lcom/mypinpad/tsdk/i/getY;", "setTextAlignment", "()Lcom/mypinpad/tsdk/i/getY;", "getNavBarTitleString", "Lcom/mypinpad/tsdk/i/fd;", "Lcom/mypinpad/tsdk/i/fd;", "UiMessageCallbackKtWhenMappings", "()Lcom/mypinpad/tsdk/i/fd;", "Lcom/mypinpad/tsdk/i/ValueQualifier;", "Lcom/mypinpad/tsdk/i/ValueQualifier;", "()Lcom/mypinpad/tsdk/i/ValueQualifier;", "setAlwaysDrawnWithCacheEnabled", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55446a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55447b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "UiMessageCallbackKtWhenMappings")
        @NotNull
        public static fd UiMessageCallbackKtWhenMappings() {
            return (fd) setX(new Object[0], 871749756, -871749756, (int) System.currentTimeMillis());
        }

        @JvmName(name = "getNavBarTitleString")
        @NotNull
        public static ValueQualifier getNavBarTitleString() {
            return (ValueQualifier) setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public static byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public static byte[] setDividerPadding() {
            return (byte[]) setX(new Object[0], 1936104505, -1936104498, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setLayoutAnimation")
        @NotNull
        public static setDrawSelectorOnTop setLayoutAnimation() {
            return (setDrawSelectorOnTop) setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setNavigationOnClickListener")
        @NotNull
        public static setItemChecked setNavigationOnClickListener() {
            return (setItemChecked) setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnDragListener")
        @NotNull
        public static activateSession setOnDragListener() {
            return (activateSession) setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static byte[] setOnFocusChangeListener() {
            return (byte[]) setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnLongClickListener")
        @NotNull
        public static setContentCaptureSession setOnLongClickListener() {
            return (setContentCaptureSession) setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setTextAlignment")
        @NotNull
        public static getY setTextAlignment() {
            return (getY) setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            switch (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15) {
                case 1:
                    int i18 = f55447b;
                    int i19 = (i18 ^ 49) + ((i18 & 49) << 1);
                    f55446a = i19 % 128;
                    if (i19 % 2 == 0) {
                        return (setDrawSelectorOnTop) ez.setOnFocusChangeListener(new Object[0], -1697139457, 1697139460, (int) System.currentTimeMillis());
                    }
                    throw null;
                case 2:
                    int i20 = f55446a;
                    int i21 = ((i20 | 53) << 1) - (i20 ^ 53);
                    f55447b = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                    setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) ez.setOnFocusChangeListener(new Object[0], 1241915376, -1241915370, (int) System.currentTimeMillis());
                    int i22 = f55446a;
                    int i23 = (i22 & (-66)) | ((~i22) & 65);
                    int i24 = (i22 & 65) << 1;
                    int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                    f55447b = i25 % 128;
                    int i26 = i25 % 2;
                    return setcontentcapturesession;
                case 3:
                    int i27 = f55447b;
                    int i28 = (-2) - ((((i27 | 98) << 1) - (i27 ^ 98)) ^ (-1));
                    f55446a = i28 % 128;
                    if (i28 % 2 == 0) {
                        return (activateSession) ez.setOnFocusChangeListener(new Object[0], 2095160267, -2095160254, (int) System.currentTimeMillis());
                    }
                    throw null;
                case 4:
                    int i29 = ((-1) << 1) - ((f55447b + 84) ^ (-1));
                    f55446a = i29 % 128;
                    int i30 = i29 % 2;
                    getY gety = (getY) ez.setOnFocusChangeListener(new Object[0], 1372261016, -1372261009, (int) System.currentTimeMillis());
                    int i31 = f55446a;
                    int i32 = i31 ^ 19;
                    int i33 = ((i31 & 19) | i32) << 1;
                    int i34 = -i32;
                    int i35 = (i33 & i34) + (i33 | i34);
                    f55447b = i35 % 128;
                    int i36 = i35 % 2;
                    return gety;
                case 5:
                    int i37 = f55446a;
                    int i38 = ((i37 ^ 52) + ((i37 & 52) << 1)) - 1;
                    int i39 = i38 % 128;
                    f55447b = i39;
                    int i40 = i38 % 2;
                    byte[] bArr2 = new byte[6];
                    int i41 = i39 & 101;
                    int i42 = ((((i39 ^ 101) | i41) << 1) - (~(-((i39 | 101) & (~i41))))) - 1;
                    f55446a = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = 0;
                    while (i44 < 6) {
                        int i45 = f55446a;
                        int i46 = ((-1) << 1) - (((i45 ^ 62) + ((i45 & 62) << 1)) ^ (-1));
                        f55447b = i46 % 128;
                        int i47 = i46 % 2;
                        bArr2[i44] = 0;
                        i44 = (((i44 | 2) << 1) - (i44 ^ 2)) - 1;
                        int i48 = i45 & 111;
                        int i49 = i45 | 111;
                        int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                        f55447b = i50 % 128;
                        int i51 = i50 % 2;
                    }
                    int i52 = f55446a;
                    int i53 = i52 & 37;
                    int i54 = ((((i52 ^ 37) | i53) << 1) - (~(-((i52 | 37) & (~i53))))) - 1;
                    f55447b = i54 % 128;
                    int i55 = i54 % 2;
                    return bArr2;
                case 6:
                    int i56 = f55447b + 33;
                    f55446a = i56 % 128;
                    if (i56 % 2 != 0) {
                        throw null;
                    }
                    activateSession activatesession = (activateSession) ez.setOnFocusChangeListener(new Object[0], -161101506, 161101516, (int) System.currentTimeMillis());
                    int i57 = f55446a;
                    int i58 = i57 ^ 13;
                    int i59 = ((i57 & 13) | i58) << 1;
                    int i60 = -i58;
                    int i61 = (i59 & i60) + (i59 | i60);
                    f55447b = i61 % 128;
                    if (i61 % 2 != 0) {
                        return activatesession;
                    }
                    throw null;
                case 7:
                    int i62 = f55446a;
                    int i63 = ((i62 & (-116)) | ((~i62) & 115)) + ((i62 & 115) << 1);
                    int i64 = i63 % 128;
                    f55447b = i64;
                    int i65 = i63 % 2;
                    bArr = new byte[]{0, 0};
                    int i66 = ((i64 ^ 125) | (i64 & 125)) << 1;
                    int i67 = -(((~i64) & 125) | (i64 & (-126)));
                    int i68 = (i66 & i67) + (i67 | i66);
                    f55446a = i68 % 128;
                    if (i68 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 8:
                    int i69 = f55447b;
                    int i70 = i69 & 95;
                    int i71 = (i70 - (~((i69 ^ 95) | i70))) - 1;
                    f55446a = i71 % 128;
                    if (i71 % 2 == 0) {
                        return (setItemChecked) ez.setOnFocusChangeListener(new Object[0], 706159950, -706159934, (int) System.currentTimeMillis());
                    }
                    throw null;
                case 9:
                    int i72 = f55446a;
                    int i73 = i72 + 113;
                    f55447b = i73 % 128;
                    int i74 = i73 % 2;
                    bArr = new byte[]{0, 0, 19};
                    int i75 = i72 & 125;
                    int i76 = (i72 | 125) & (~i75);
                    int i77 = -(-(i75 << 1));
                    int i78 = (i76 & i77) + (i76 | i77);
                    f55447b = i78 % 128;
                    if (i78 % 2 == 0) {
                        throw null;
                    }
                    break;
                case 10:
                    int i79 = f55447b;
                    int i80 = ((i79 & 120) + (i79 | 120)) - 1;
                    f55446a = i80 % 128;
                    int i81 = i80 % 2;
                    ValueQualifier valueQualifier = (ValueQualifier) ez.setOnFocusChangeListener(new Object[0], -372643454, 372643463, (int) System.currentTimeMillis());
                    int i82 = f55446a;
                    int i83 = i82 & 111;
                    int i84 = -(-(i82 | 111));
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    f55447b = i85 % 128;
                    int i86 = i85 % 2;
                    return valueQualifier;
                case 11:
                    int i87 = f55446a;
                    int i88 = (i87 ^ 101) + ((i87 & 101) << 1);
                    f55447b = i88 % 128;
                    byte[] bArr3 = i88 % 2 == 0 ? new byte[]{0, 0, 0, 0} : new byte[]{0, 0};
                    int i89 = (i87 & (-24)) | ((~i87) & 23);
                    int i90 = -(-((i87 & 23) << 1));
                    int i91 = (i89 & i90) + (i90 | i89);
                    f55447b = i91 % 128;
                    int i92 = i91 % 2;
                    return bArr3;
                default:
                    int i93 = f55446a;
                    int i94 = (i93 & 85) + (i93 | 85);
                    f55447b = i94 % 128;
                    if (i94 % 2 == 0) {
                        throw null;
                    }
                    fd fdVar = (fd) ez.setOnFocusChangeListener(new Object[0], 1051207347, -1051207335, (int) System.currentTimeMillis());
                    int i95 = f55447b;
                    int i96 = ((i95 ^ 102) + ((i95 & 102) << 1)) - 1;
                    f55446a = i96 % 128;
                    if (i96 % 2 == 0) {
                        return fdVar;
                    }
                    int i97 = 64 / 0;
                    return fdVar;
            }
            return bArr;
        }

        @JvmName(name = "setY")
        @NotNull
        public static byte[] setY() {
            return (byte[]) setX(new Object[0], 1514668654, -1514668649, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setX")
        @NotNull
        public static activateSession setX() {
            return (activateSession) setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis());
        }
    }

    public static final /* synthetic */ setContentCaptureSession setOnFocusChangeListener() {
        return (setContentCaptureSession) setOnFocusChangeListener(new Object[0], 1241915376, -1241915370, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ fk setOnFocusChangeListener(ez ezVar, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, getBeepOnFailure getbeeponfailure, j jVar, l lVar, f fVar) {
        return (fk) setOnFocusChangeListener(new Object[]{ezVar, setscrollbardefaultdelaybeforefade, settextkeepstate, getbeeponfailure, jVar, lVar, fVar}, -1578681857, 1578681862, (int) System.currentTimeMillis());
    }
}
