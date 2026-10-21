package com.mypinpad.tsdk.isolation;

import com.adobe.marketing.mobile.EventDataKeys;
import com.appsflyer.AppsFlyerProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J2\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJH\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002JR\u0010#\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!J\u001e\u0010$\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ*\u0010%\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ \u0010&\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J$\u0010.\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002R\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/kernel3/state/outcome/Kernel3OutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/OutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/KernelStateOutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/kernel3/cache/Kernel3Database;", "database", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQ", "", "postCardReadSuccessfullyOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", "uiStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", "level2Error", "", "sw12", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "postErrorOtherCardOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "messageIdentifier", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;", "kernelOutcomeStatus", "kernelQueue", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;", EventDataKeys.Lifecycle.LIFECYCLE_START, "postErrorOutcome", "uiMessage", "status", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/ValueQualifier;", "valueQualifierEnum", "valueQualifier", AppsFlyerProperties.CURRENCY_CODE, "", c.f84805j, "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "cvmStatus", "postFinalOutcome", "postSeePhoneOutcome", "postSelectNextOutcome", "postStatusBytesErrorOutcome", "postStopOutcome", "postTimeoutErrorOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "outcomeParameterSet", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "onlineRequest", "prepareVisaCvmInternalTag", "isCardReadOkSent", "Z", "<init>", "()V", "Companion", "kernel-visa"}, k = 1, mv = {1, 5, 1})
public final class iu extends ez implements fb<im> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56539l = 0;
    public static int m = 1;

    @NotNull
    public static final setY setOnFocusChangeListener = new setY(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f56540k;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setTransitionVisibility.values().length];
            iArr[setTransitionVisibility.setOnFocusChangeListener.ordinal()] = 1;
            iArr[setTransitionVisibility.setY.ordinal()] = 2;
            iArr[setTransitionVisibility.setX.ordinal()] = 3;
            iArr[setTransitionVisibility.setDividerPadding.ordinal()] = 4;
            setY = iArr;
            int i10 = (1 & 107) + (1 | 107);
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = m;
        int i11 = i10 & 89;
        int i12 = (((i10 ^ 89) | i11) << 1) - ((i10 | 89) & (~i11));
        f56539l = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bb  */
    public static /* synthetic */ void b(Object[] objArr) throws Exception {
        fd fdVar;
        int i10;
        setTransitionVisibility settransitionvisibility;
        int i11;
        setImportantForAutofill setimportantforautofill;
        char c10;
        j jVar = (j) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[2];
        int i12 = f56539l;
        int i13 = i12 ^ 83;
        int i14 = ((((i12 & 83) | i13) << 1) - (~(-i13))) - 1;
        m = i14 % 128;
        if (i14 % 2 == 0) {
            setscrollbardefaultdelaybeforefade.setDividerPadding();
            Terminal.Companion companion = Terminal.INSTANCE;
            throw null;
        }
        if (setscrollbardefaultdelaybeforefade.setDividerPadding() == Terminal.KERNEL_3) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new fd[]{fd.ONLINE_REQUEST, fd.APPROVED, fd.DECLINED});
            if (jVar == null) {
                int i15 = m;
                int i16 = i15 & 29;
                int i17 = i15 | 29;
                int i18 = (i16 & i17) + (i16 | i17);
                f56539l = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((i15 | 109) << 1) - (i15 ^ 109);
                f56539l = i20 % 128;
                int i21 = i20 % 2;
                fdVar = null;
            } else {
                fdVar = (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar));
                int i22 = m;
                int i23 = (((i22 | 49) << 1) - (~(-(i22 ^ 49)))) - 1;
                f56539l = i23 % 128;
                int i24 = i23 % 2;
            }
            if (!(!CollectionsKt___CollectionsKt.contains(listListOf, fdVar))) {
                int i25 = m;
                int i26 = ((i25 ^ 6) + ((i25 & 6) << 1)) - 1;
                f56539l = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 41 / 0;
                    if (jVar == null) {
                        int i28 = i25 & 29;
                        i10 = (i28 - (~((i25 ^ 29) | i28))) - 1;
                        f56539l = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i29 = 96 / 0;
                        }
                        settransitionvisibility = null;
                    } else {
                        settransitionvisibility = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
                        int i30 = m;
                        int i31 = i30 & 47;
                        int i32 = i30 | 47;
                        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                        f56539l = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else if (jVar == null) {
                    int i210 = i25 & 29;
                    i10 = (i210 - (~((i25 ^ 29) | i210))) - 1;
                    f56539l = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i211 = 96 / 0;
                    }
                    settransitionvisibility = null;
                } else {
                    settransitionvisibility = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar}, -453755924, 453755935, System.identityHashCode(jVar));
                    int i35 = m;
                    int i36 = i35 & 47;
                    int i37 = i35 | 47;
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    f56539l = i38 % 128;
                    int i39 = i38 % 2;
                }
                if (settransitionvisibility == null) {
                    int i40 = m;
                    int i41 = i40 & 37;
                    int i42 = (i41 - (~(-(-((i40 ^ 37) | i41))))) - 1;
                    f56539l = i42 % 128;
                    int i43 = i42 % 2;
                    int i44 = i40 ^ 103;
                    int i45 = ((((i40 & 103) | i44) << 1) - (~(-i44))) - 1;
                    f56539l = i45 % 128;
                    int i46 = i45 % 2;
                    i11 = -1;
                } else {
                    i11 = setOnFocusChangeListener.setY[settransitionvisibility.ordinal()];
                    int i47 = m + 112;
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    f56539l = i48 % 128;
                    int i49 = i48 % 2;
                }
                if (i11 == 1) {
                    setimportantforautofill = setImportantForAutofill.setDividerPadding;
                    int i50 = f56539l;
                    int i51 = i50 & 75;
                    int i52 = (i50 ^ 75) | i51;
                    int i53 = (i51 & i52) + (i52 | i51);
                    m = i53 % 128;
                    int i54 = i53 % 2;
                } else if (i11 == 2) {
                    setimportantforautofill = setImportantForAutofill.setOnFocusChangeListener;
                    int i55 = f56539l + 105;
                    m = i55 % 128;
                    int i56 = i55 % 2;
                } else if (i11 == 3) {
                    setimportantforautofill = setImportantForAutofill.setX;
                    int i57 = f56539l + 59;
                    m = i57 % 128;
                    int i58 = i57 % 2;
                } else if (i11 != 4) {
                    int i59 = f56539l + 59;
                    m = i59 % 128;
                    int i60 = i59 % 2;
                    setimportantforautofill = null;
                } else {
                    setimportantforautofill = setImportantForAutofill.setCompoundDrawableTintBlendMode;
                    int i61 = m;
                    int i62 = ((i61 & 92) + (i61 | 92)) - 1;
                    f56539l = i62 % 128;
                    int i63 = i62 % 2;
                }
                if (setimportantforautofill != null) {
                    int i64 = m;
                    int i65 = ((i64 | 124) << 1) - (i64 ^ 124);
                    int i66 = (i65 ^ (-1)) + (i65 << 1);
                    f56539l = i66 % 128;
                    int i67 = i66 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 329514556, -329514499, (int) System.currentTimeMillis());
                    String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                    byte[] bArr = new byte[1];
                    int i68 = m;
                    int i69 = ((i68 | 93) << 1) - (i68 ^ 93);
                    f56539l = i69 % 128;
                    int i70 = i69 % 2;
                    do {
                        int i71 = m;
                        int i72 = ((i71 ^ 9) | (i71 & 9)) << 1;
                        int i73 = -((9 & (~i71)) | (i71 & (-10)));
                        int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                        f56539l = i74 % 128;
                        if (i74 % 2 != 0) {
                            bArr[1] = setimportantforautofill.setDividerPadding();
                            c10 = 0;
                        } else {
                            bArr[0] = setimportantforautofill.setDividerPadding();
                            c10 = 1;
                        }
                        int i75 = m;
                        int i76 = ((i75 | 3) << 1) - (i75 ^ 3);
                        f56539l = i76 % 128;
                        int i77 = i76 % 2;
                    } while (c10 <= 0);
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, Terminal.KERNEL_3, Boolean.FALSE, 24}, -976227287, 976227290, 24);
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure2}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    List list = (List) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -1161703492, 1161703507, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    if (list.contains((TransactionFailed) setAnimation.setY(new Object[0], 329514556, -329514499, (int) System.currentTimeMillis()))) {
                        int i78 = f56539l;
                        int i79 = i78 ^ 65;
                        int i80 = -(-((i78 & 65) << 1));
                        int i81 = (i79 & i80) + (i79 | i80);
                        m = i81 % 128;
                        int i82 = i81 % 2;
                        if (getbeeponfailure != null) {
                            int i83 = i78 | 1;
                            int i84 = ((i83 << 1) - (~(-((~(i78 & 1)) & i83)))) - 1;
                            m = i84 % 128;
                            if (i84 % 2 == 0) {
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, getbeeponfailure2}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure));
                                throw null;
                            }
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, getbeeponfailure2}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure));
                        }
                    }
                }
            }
        }
        int i85 = f56539l;
        int i86 = ((i85 ^ 47) - (~(-(-((i85 & 47) << 1))))) - 1;
        m = i86 % 128;
        if (i86 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ fk c(Object[] objArr) {
        iu iuVar = (iu) objArr[0];
        im imVar = (im) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[3];
        byte[] bArr = (byte[]) objArr[4];
        int i10 = m;
        int i11 = i10 & 51;
        int i12 = ((i10 ^ 51) | i11) << 1;
        int i13 = -((i10 | 51) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f56539l = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(imVar, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
            fd.Companion companion = fd.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
        activateSession activatesession = (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis());
        fd fdVar = fd.SELECT_NEXT;
        ValueQualifier valueQualifier = (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis());
        if (bArr == null) {
            int i15 = f56539l;
            int i16 = i15 & 5;
            int i17 = ((i15 ^ 5) | i16) << 1;
            int i18 = -((i15 | 5) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            m = i19 % 128;
            int i20 = i19 % 2;
            bArr = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
            int i21 = m + 23;
            f56539l = i21 % 128;
            int i22 = i21 % 2;
        } else {
            int i23 = f56539l;
            int i24 = i23 & 55;
            int i25 = (i24 - (~(-(-((i23 ^ 55) | i24))))) - 1;
            m = i25 % 128;
            int i26 = i25 % 2;
        }
        fk fkVar = (fk) setX(new Object[]{iuVar, activatesession, fdVar, imVar, settextkeepstate, valueQualifier, bArr, getY.setCompoundDrawableTintBlendMode, setcontentcapturesession}, 1579248376, -1579248363, System.identityHashCode(iuVar));
        int i27 = f56539l;
        int i28 = ((i27 & (-122)) | ((~i27) & 121)) + ((i27 & 121) << 1);
        m = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 32 / 0;
        }
        return fkVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x02f7 A[PHI: r7 r11
      0x02f7: PHI (r7v10 com.mypinpad.tsdk.i.activateSession) = (r7v9 com.mypinpad.tsdk.i.activateSession), (r7v13 com.mypinpad.tsdk.i.activateSession) binds: [B:43:0x02f5, B:40:0x02e2] A[DONT_GENERATE, DONT_INLINE]
      0x02f7: PHI (r11v19 com.mypinpad.tsdk.i.fd) = (r11v18 com.mypinpad.tsdk.i.fd), (r11v22 com.mypinpad.tsdk.i.fd) binds: [B:43:0x02f5, B:40:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0327 A[PHI: r7 r11
      0x0327: PHI (r7v12 com.mypinpad.tsdk.i.activateSession) = (r7v9 com.mypinpad.tsdk.i.activateSession), (r7v13 com.mypinpad.tsdk.i.activateSession) binds: [B:43:0x02f5, B:40:0x02e2] A[DONT_GENERATE, DONT_INLINE]
      0x0327: PHI (r11v21 com.mypinpad.tsdk.i.fd) = (r11v18 com.mypinpad.tsdk.i.fd), (r11v22 com.mypinpad.tsdk.i.fd) binds: [B:43:0x02f5, B:40:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        activateSession activatesession;
        fd fdVar;
        fk onFocusChangeListener;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        switch ((((~((~i12) | i14)) | i13 | i15) * 398) + ((i10 | i11) * (-1194)) + ((i13 | i15 | (~(i14 | i12))) * 398) + (i11 * 399) + (i10 * 399)) {
            case 1:
                iu iuVar = (iu) objArr[0];
                im imVar = (im) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                byte[] bArr = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(imVar, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(bArr, "");
                f fVar = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), setContentCaptureSession.setLayoutAnimation, ez.setY.setLayoutAnimation(), bArr);
                l y7 = ez.setY(imVar, activateSession.SEE_PHONE, ValueQualifier.setOnFocusChangeListener, (byte[]) setY.setDividerPadding(new Object[0], 2046562985, -2046562983, (int) System.currentTimeMillis()));
                j y10 = ez.setY(fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192);
                setX(new Object[]{y10, imVar, null}, 146069763, -146069753, (int) System.currentTimeMillis());
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(iuVar, imVar, settextkeepstate, null, y10, y7, fVar);
                int i16 = f56539l;
                int i17 = ((i16 ^ 71) - (~(-(-((i16 & 71) << 1))))) - 1;
                m = i17 % 128;
                int i18 = i17 % 2;
                return onFocusChangeListener2;
            case 2:
                return c(objArr);
            case 3:
                iu iuVar2 = (iu) objArr[0];
                im imVar2 = (im) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(imVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                f fVar2 = new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener());
                j y11 = ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192);
                setX(new Object[]{y11, imVar2, null}, 146069763, -146069753, (int) System.currentTimeMillis());
                fk onFocusChangeListener3 = ez.setOnFocusChangeListener(iuVar2, imVar2, settextkeepstate2, null, y11, null, fVar2);
                int i19 = f56539l;
                int i20 = ((i19 ^ 91) | (i19 & 91)) << 1;
                int i21 = -(((~i19) & 91) | (i19 & (-92)));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                m = i22 % 128;
                int i23 = i22 % 2;
                return onFocusChangeListener3;
            case 4:
                iu iuVar3 = (iu) objArr[0];
                im imVar3 = (im) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[3];
                int i24 = f56539l;
                int i25 = i24 ^ 105;
                int i26 = (i24 & 105) << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                m = i27 % 128;
                int i28 = i27 % 2;
                fk fkVar = (fk) setX(new Object[]{iuVar3, imVar3, settextkeepstate3, setcontentcapturesession, null}, 1169253250, -1169253248, System.identityHashCode(iuVar3));
                int i29 = m + 123;
                f56539l = i29 % 128;
                int i30 = i29 % 2;
                return fkVar;
            case 5:
                iu iuVar4 = (iu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                int i31 = m;
                int i32 = i31 & 55;
                int i33 = i32 + ((i31 ^ 55) | i32);
                f56539l = i33 % 128;
                im imVar4 = (im) setscrollbardefaultdelaybeforefade;
                if (i33 % 2 != 0) {
                    throw null;
                }
                fk fkVar2 = (fk) setX(new Object[]{iuVar4, imVar4, settextkeepstate4}, -1379057454, 1379057457, System.identityHashCode(iuVar4));
                int i34 = f56539l;
                int i35 = (i34 & (-16)) | ((~i34) & 15);
                int i36 = (i34 & 15) << 1;
                int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
                m = i37 % 128;
                int i38 = i37 % 2;
                return fkVar2;
            case 6:
                iu iuVar5 = (iu) objArr[0];
                im imVar5 = (im) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                activateSession activatesession2 = (activateSession) objArr[3];
                fd fdVar2 = (fd) objArr[4];
                setSelector setselector = (setSelector) objArr[5];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[6];
                Intrinsics.checkNotNullParameter(imVar5, "");
                Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                Intrinsics.checkNotNullParameter(activatesession2, "");
                Intrinsics.checkNotNullParameter(fdVar2, "");
                Intrinsics.checkNotNullParameter(setselector, "");
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                f fVar3 = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y12 = ez.setY(imVar5, activatesession2, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()));
                getY gety = (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis());
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                j y13 = ez.setY(fdVar2, gety, bool, bool2, null, settransitionvisibility, null, null, 192);
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar5, setAnimation.setSubtitle()}, -1593889019, 1593889062, System.identityHashCode(imVar5));
                if (getbeeponfailure != null) {
                    int i39 = f56539l + 105;
                    m = i39 % 128;
                    if (i39 % 2 == 0) {
                        ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[5] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[2]), 3, 2, (byte) 0}, -883253918, 883253919, 3)).byteValue();
                        setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 4, 26, bool}, -91299280, 91299286, 4);
                    } else {
                        ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[3] = ((Byte) setLogo.setY(new Object[]{Byte.valueOf(((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[3]), 3, 4, (byte) 0}, -883253918, 883253919, 3)).byteValue();
                        setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), 3, 7, bool}, -91299280, 91299286, 3);
                    }
                }
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 341660993, -341660912, (int) System.currentTimeMillis());
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
                setRevealOnFocusHint setrevealonfocushint = (setRevealOnFocusHint) im.setY(new Object[]{imVar5}, -967673671, 967673681, System.identityHashCode(imVar5));
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{imVar5, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, new byte[]{(byte) ((getX) setRevealOnFocusHint.setY(new Object[]{setrevealonfocushint}, -317774199, 317774203, System.identityHashCode(setrevealonfocushint))).setOnFocusChangeListener()}, null, bool2, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(imVar5));
                ey eyVar = ey.INSTANCE;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) ey.setY(new Object[]{imVar5}, 1660534021, -1660534020, (int) System.currentTimeMillis());
                setX(new Object[]{y13, imVar5, getbeeponfailure2}, 146069763, -146069753, (int) System.currentTimeMillis());
                fk onFocusChangeListener4 = ez.setOnFocusChangeListener(iuVar5, imVar5, settextkeepstate5, getbeeponfailure2, y13, y12, fVar3);
                int i40 = f56539l;
                int i41 = (i40 & 31) + (i40 | 31);
                m = i41 % 128;
                int i42 = i41 % 2;
                return onFocusChangeListener4;
            case 7:
                iu iuVar6 = (iu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                int i43 = f56539l;
                int i44 = ((i43 & 106) + (i43 | 106)) - 1;
                m = i44 % 128;
                int i45 = i44 % 2;
                fk fkVar3 = (fk) setX(new Object[]{iuVar6, (im) setscrollbardefaultdelaybeforefade2, settextkeepstate6}, -61530894, 61530906, System.identityHashCode(iuVar6));
                int i46 = m;
                int i47 = i46 & 67;
                int i48 = (i46 | 67) & (~i47);
                int i49 = -(-(i47 << 1));
                int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                f56539l = i50 % 128;
                int i51 = i50 % 2;
                return fkVar3;
            case 8:
                iu iuVar7 = (iu) objArr[0];
                im imVar6 = (im) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[4];
                byte[] bArr2 = (byte[]) objArr[5];
                int i52 = m;
                int i53 = (i52 ^ 123) + ((i52 & 123) << 1);
                f56539l = i53 % 128;
                if (i53 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(imVar6, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                    Intrinsics.checkNotNullParameter(valueQualifier, "");
                    Intrinsics.checkNotNullParameter(setcontentcapturesession2, "");
                    activatesession = activateSession.ERROR_OTHER_CARD;
                    fdVar = fd.END_APPLICATION;
                    int i54 = 38 / 0;
                    if (bArr2 == null) {
                        int i55 = f56539l;
                        int i56 = (i55 & 15) + (i55 | 15);
                        m = i56 % 128;
                        int i57 = i56 % 2;
                        bArr2 = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
                        int i58 = f56539l;
                        int i59 = ((i58 ^ 44) + ((i58 & 44) << 1)) - 1;
                        m = i59 % 128;
                        int i60 = i59 % 2;
                    } else {
                        int i61 = m;
                        int i62 = i61 & 91;
                        int i63 = ((i61 | 91) & (~i62)) + (i62 << 1);
                        f56539l = i63 % 128;
                        int i64 = i63 % 2;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(imVar6, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                    Intrinsics.checkNotNullParameter(valueQualifier, "");
                    Intrinsics.checkNotNullParameter(setcontentcapturesession2, "");
                    activatesession = activateSession.ERROR_OTHER_CARD;
                    fdVar = fd.END_APPLICATION;
                    if (bArr2 == null) {
                        int i510 = f56539l;
                        int i511 = (i510 & 15) + (i510 | 15);
                        m = i511 % 128;
                        int i512 = i511 % 2;
                        bArr2 = (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis());
                        int i513 = f56539l;
                        int i514 = ((i513 ^ 44) + ((i513 & 44) << 1)) - 1;
                        m = i514 % 128;
                        int i65 = i514 % 2;
                    } else {
                        int i66 = m;
                        int i67 = i66 & 91;
                        int i68 = ((i66 | 91) & (~i67)) + (i67 << 1);
                        f56539l = i68 % 128;
                        int i69 = i68 % 2;
                    }
                }
                onFocusChangeListener = (fk) setX(new Object[]{iuVar7, activatesession, fdVar, imVar6, settextkeepstate7, valueQualifier, bArr2, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), setcontentcapturesession2}, 1579248376, -1579248363, System.identityHashCode(iuVar7));
                int i70 = f56539l;
                int i71 = i70 & 113;
                int i72 = (i70 ^ 113) | i71;
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                m = i73 % 128;
                if (i73 % 2 == 0) {
                    throw null;
                }
                break;
            case 9:
                iu iuVar8 = (iu) objArr[0];
                im imVar7 = (im) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                int i74 = m;
                int i75 = ((i74 | 72) << 1) - (i74 ^ 72);
                int i76 = (i75 ^ (-1)) + (i75 << 1);
                f56539l = i76 % 128;
                if (i76 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(imVar7, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                    boolean z10 = iuVar8.f56540k;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(imVar7, "");
                Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                if (iuVar8.f56540k) {
                    int i77 = f56539l;
                    int i78 = (i77 & 117) + (i77 | 117);
                    m = i78 % 128;
                    if (i78 % 2 != 0) {
                        return null;
                    }
                    int i79 = 20 / 0;
                    return null;
                }
                ez.setX(imVar7, settextkeepstate8, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) setY.setDividerPadding(new Object[0], -969980666, 969980666, (int) System.currentTimeMillis()), null);
                if (!iuVar8.f56540k) {
                    int i80 = f56539l;
                    int i81 = (i80 ^ 71) + ((i80 & 71) << 1);
                    m = i81 % 128;
                    if (i81 % 2 == 0) {
                        iuVar8.f56540k = false;
                    } else {
                        iuVar8.f56540k = true;
                    }
                }
                System.identityHashCode(iuVar8);
                System.identityHashCode(iuVar8);
                return null;
            case 10:
                b(objArr);
                return null;
            case 11:
                iu iuVar9 = (iu) objArr[0];
                im imVar8 = (im) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                int i82 = m;
                int i83 = i82 & 109;
                int i84 = (((i82 ^ 109) | i83) << 1) - ((i82 | 109) & (~i83));
                f56539l = i84 % 128;
                int i85 = i84 % 2;
                Intrinsics.checkNotNullParameter(imVar8, "");
                Intrinsics.checkNotNullParameter(settextkeepstate9, "");
                onFocusChangeListener = (fk) setX(new Object[]{iuVar9, imVar8, settextkeepstate9, ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation, bArr3}, 414700148, -414700140, System.identityHashCode(iuVar9));
                int i86 = m;
                int i87 = (i86 & 9) + (i86 | 9);
                f56539l = i87 % 128;
                if (i87 % 2 != 0) {
                    throw null;
                }
                break;
            case 12:
                iu iuVar10 = (iu) objArr[0];
                im imVar9 = (im) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(imVar9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate10, "");
                f fVar4 = new f(activateSession.ERROR_OTHER_CARD, setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y14 = ez.setY(imVar9, activateSession.PRESENT_CARD_AGAIN, ValueQualifier.setY, (byte[]) setY.setDividerPadding(new Object[0], -419224771, 419224774, (int) System.currentTimeMillis()));
                j y15 = ez.setY(fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192);
                setX(new Object[]{y15, imVar9, null}, 146069763, -146069753, (int) System.currentTimeMillis());
                onFocusChangeListener = ez.setOnFocusChangeListener(iuVar10, imVar9, settextkeepstate10, null, y15, y14, fVar4);
                int i88 = m;
                int i89 = (((i88 & (-52)) | ((~i88) & 51)) - (~(-(-((i88 & 51) << 1))))) - 1;
                f56539l = i89 % 128;
                if (i89 % 2 != 0) {
                    throw null;
                }
                break;
            case 13:
                iu iuVar11 = (iu) objArr[0];
                activateSession activatesession3 = (activateSession) objArr[1];
                fd fdVar3 = (fd) objArr[2];
                im imVar10 = (im) objArr[3];
                setTextKeepState settextkeepstate11 = (setTextKeepState) objArr[4];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[5];
                byte[] bArr4 = (byte[]) objArr[6];
                getY gety2 = (getY) objArr[7];
                f fVar5 = new f(activatesession3, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[8], ez.setY.setLayoutAnimation(), bArr4);
                l y16 = ez.setY(imVar10, activatesession3, valueQualifier2, (byte[]) setY.setDividerPadding(new Object[0], -419224771, 419224774, (int) System.currentTimeMillis()));
                j y17 = ez.setY(fdVar3, gety2, Boolean.TRUE, null, null, null, null, null, 192);
                setX(new Object[]{y17, imVar10, null}, 146069763, -146069753, (int) System.currentTimeMillis());
                onFocusChangeListener = ez.setOnFocusChangeListener(iuVar11, imVar10, settextkeepstate11, null, y17, y16, fVar5);
                int i90 = m;
                int i91 = ((i90 ^ 30) + ((i90 & 30) << 1)) - 1;
                f56539l = i91 % 128;
                if (i91 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                iu iuVar12 = (iu) objArr[0];
                im imVar11 = (im) objArr[1];
                setTextKeepState settextkeepstate12 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier3 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession3 = (setContentCaptureSession) objArr[4];
                int i92 = m;
                int i93 = ((i92 & 36) + (i92 | 36)) - 1;
                f56539l = i93 % 128;
                int i94 = i93 % 2;
                onFocusChangeListener = (fk) setX(new Object[]{iuVar12, imVar11, settextkeepstate12, valueQualifier3, setcontentcapturesession3, null}, 414700148, -414700140, System.identityHashCode(iuVar12));
                int i95 = m;
                int i96 = (i95 ^ 19) + ((i95 & 19) << 1);
                f56539l = i96 % 128;
                if (i96 % 2 != 0) {
                    throw null;
                }
                break;
        }
        return onFocusChangeListener;
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setX(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -429719853, 429719860, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @Nullable byte[] bArr) {
        return (fk) setX(new Object[]{this, imVar, settextkeepstate, bArr}, 1792429075, -1792429064, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setX(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1925248590, -1925248585, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setX(new Object[]{this, imVar, settextkeepstate}, -61530894, 61530906, System.identityHashCode(this));
    }

    public static /* synthetic */ fk setDividerPadding(iu iuVar, im imVar, setTextKeepState settextkeepstate, setContentCaptureSession setcontentcapturesession) {
        return (fk) setX(new Object[]{iuVar, imVar, settextkeepstate, setcontentcapturesession}, -1309170137, 1309170141, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ fk setOnFocusChangeListener(iu iuVar, im imVar, setTextKeepState settextkeepstate, ValueQualifier valueQualifier, setContentCaptureSession setcontentcapturesession) {
        return (fk) setX(new Object[]{iuVar, imVar, settextkeepstate, valueQualifier, setcontentcapturesession}, 991028938, -991028938, (int) System.currentTimeMillis());
    }

    @NotNull
    public final fk setY(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull byte[] bArr) {
        return (fk) setX(new Object[]{this, imVar, settextkeepstate, bArr}, -1236108965, 1236108966, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setSelector setselector, @NotNull setTransitionVisibility settransitionvisibility) {
        return (fk) setX(new Object[]{this, imVar, settextkeepstate, activatesession, fdVar, setselector, settransitionvisibility}, 1387632794, -1387632788, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate) throws Exception {
        setX(new Object[]{this, imVar, settextkeepstate}, -1427594487, 1427594496, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull setContentCaptureSession setcontentcapturesession, @Nullable byte[] bArr) {
        return (fk) setX(new Object[]{this, imVar, settextkeepstate, setcontentcapturesession, bArr}, 1169253250, -1169253248, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/iu$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56541a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56542b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setDividerPadding(new Object[0], 2046562985, -2046562983, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-712)) + (i10 * 714);
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = (~(i14 | i11)) | (~(i14 | i15));
            int i17 = ~i11;
            int i18 = ~(i10 | i17 | i12);
            int i19 = ((~(i17 | i15)) * 713) + (i18 * 1426) + ((i16 | i18) * (-713)) + i13;
            if (i19 == 1) {
                int i20 = f56542b;
                int i21 = i20 & 47;
                int i22 = (i20 ^ 47) | i21;
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f56541a = i23 % 128;
                byte[] bArr = {0, 0, 13};
                if (i23 % 2 == 0) {
                    return bArr;
                }
                bArr[1] = 0;
                bArr[0] = 1;
                bArr[4] = 19;
                return bArr;
            }
            if (i19 == 2) {
                int i24 = f56541a;
                int i25 = ((i24 & 10) + (i24 | 10)) - 1;
                f56542b = i25 % 128;
                int i26 = i25 % 2;
                byte[] bArr2 = (byte[]) setDividerPadding(new Object[0], 1750656199, -1750656198, (int) System.currentTimeMillis());
                int i27 = f56541a;
                int i28 = i27 & 5;
                int i29 = i27 | 5;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f56542b = i30 % 128;
                if (i30 % 2 != 0) {
                    return bArr2;
                }
                throw null;
            }
            if (i19 == 3) {
                int i31 = f56541a;
                int i32 = ((i31 | 61) << 1) - (i31 ^ 61);
                f56542b = i32 % 128;
                int i33 = i32 % 2;
                byte[] bArr3 = (byte[]) setDividerPadding(new Object[0], -2131642515, 2131642520, (int) System.currentTimeMillis());
                int i34 = f56542b;
                int i35 = i34 | 37;
                int i36 = ((i35 << 1) - (~(-((~(i34 & 37)) & i35)))) - 1;
                f56541a = i36 % 128;
                if (i36 % 2 == 0) {
                    return bArr3;
                }
                throw null;
            }
            if (i19 == 4) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                byte[] bArr4 = {0, 0, 3};
                int i37 = (-2) - ((f56542b + 52) ^ (-1));
                f56541a = i37 % 128;
                if (i37 % 2 == 0) {
                    return bArr4;
                }
                throw null;
            }
            if (i19 != 5) {
                int i38 = f56542b + 81;
                f56541a = i38 % 128;
                if (i38 % 2 == 0) {
                    return (byte[]) setDividerPadding(new Object[0], 463347253, -463347249, (int) System.currentTimeMillis());
                }
                throw null;
            }
            int i39 = f56541a;
            int i40 = i39 ^ 15;
            int i41 = -(-((i39 & 15) << 1));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int i43 = i42 % 128;
            f56542b = i43;
            int i44 = i42 % 2;
            byte[] bArr5 = {0, 0, 0};
            int i45 = ((i43 | 101) << 1) - (i43 ^ 101);
            f56541a = i45 % 128;
            if (i45 % 2 == 0) {
                return bArr5;
            }
            throw null;
        }

        public static final /* synthetic */ byte[] setX() {
            return (byte[]) setDividerPadding(new Object[0], -969980666, 969980666, (int) System.currentTimeMillis());
        }

        public static final /* synthetic */ byte[] setDividerPadding() {
            return (byte[]) setDividerPadding(new Object[0], -419224771, 419224774, (int) System.currentTimeMillis());
        }
    }
}
