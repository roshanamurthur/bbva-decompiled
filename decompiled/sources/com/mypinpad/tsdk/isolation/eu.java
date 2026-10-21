package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0014J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013Jo\u0010+\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,JL\u00102\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u0010\u0018\u001a\u00020\u0017J\u0016\u00103\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u00104\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u00105\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u00107\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%J\u0016\u00108\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u00109\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010:\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J,\u0010<\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010'J\f\u0010>\u001a\u00020=*\u00020\nH\u0002J\u001c\u0010>\u001a\u00020A*\u00020\b2\u0006\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020)H\u0002J\f\u0010>\u001a\u00020B*\u00020\fH\u0002¨\u0006F"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericOutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/OutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/meta/EmvTagMeta;", "meta", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "createKernel2Tag", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", "databaseBase", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "outcomeParameterSet", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/ErrorIndication;", "errorIndication", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/UserInterfaceRequest;", "userInterfaceRequest", "onlineRequest", "", "createLog", "database", "createPresentCardUIRequest", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQ", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "postApprovedOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level3Error;", "level3Error", "postDeclinedOutcomeWithL3Error", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/DefaultKernelDataBase;", "postErrorOtherCardOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;", "status", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "uiMessage", "messageOnError", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", "uiStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level1Error;", "level1Error", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", "level2Error", "", "sw12", "", "uiRequestOnOutcomePresent", "postErrorOutcome", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level1Error;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level3Error;[BLjava/lang/Boolean;)Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", c.f84805j, "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "cvmStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/PinEntryResults;", "pinEntryResult", "postFinalOutcome", "postOnlineDeclinedOutcome", "postOnlineRequestWithPinOutcome", "postPinRequestOutcome", "postSeePhoneAndRestartOutcome", "postSelectionError", "postStopErrorOutcome", "postStopOutcome", "postTimeoutError", "onlineResponseData", "postTryAgainOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/ERROR_INDICATION_DF8115_KRN2;", "convertToKernel2Format", "discretionaryDataPresent", "dataRecordPresent", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/OUTCOME_PARAMETER_SET_DF8129_KRN2;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/USER_INTERFACE_REQUEST_DATA_DF8116_KRN2;", "<init>", "()V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public final class eu extends ez {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55409k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f55410l = 1;

    @NotNull
    public static final setDividerPadding setOnFocusChangeListener = new setDividerPadding(null);

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            iArr[fd.APPROVED.ordinal()] = 3;
            setX = iArr;
            int i10 = (0 - (-19)) - 2;
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i12 = 57 / 0;
            }
        }
    }

    static {
        int i10 = f55410l;
        int i11 = (i10 & 21) + (i10 | 21);
        f55409k = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ fk b(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        char c10;
        int i10;
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        activateSession activatesession = (activateSession) objArr[3];
        fd fdVar = (fd) objArr[4];
        ((Boolean) objArr[5]).booleanValue();
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[6];
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[7];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[8];
        String str = "";
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(fdVar, "");
        Intrinsics.checkNotNullParameter(settransitionvisibility, "");
        Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
        f fVar = new f((activateSession) ez.setY.setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis()), (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis()), (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis()), setdrawselectorontop, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()));
        l lVar = (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, activatesession, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis());
        getY gety = (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis());
        Boolean bool = Boolean.TRUE;
        j jVar = (j) ez.setOnFocusChangeListener(new Object[]{fdVar, gety, bool, bool, null, settransitionvisibility, null, transactionProcessingResult, 64}, -1608764632, 1608764640, 64);
        int[] iArr = setCompoundDrawableTintBlendMode.setX;
        int i11 = iArr[fdVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            ey eyVar = ey.INSTANCE;
            getbeeponfailure = (getBeepOnFailure) ey.setY(new Object[]{setscrollbardefaultdelaybeforefade}, 1660534021, -1660534020, (int) System.currentTimeMillis());
            int i12 = f55410l;
            int i13 = i12 & 55;
            int i14 = (i12 ^ 55) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            f55409k = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = f55410l + 73;
            f55409k = i17 % 128;
            int i18 = i17 % 2;
            getbeeponfailure = null;
        }
        if (iArr[fdVar.ordinal()] == 3) {
            int i19 = f55410l;
            int i20 = ((i19 & 19) - (~(i19 | 19))) - 1;
            f55409k = i20 % 128;
            if (i20 % 2 != 0) {
                setscrollbardefaultdelaybeforefade.setDividerPadding();
                Terminal.Companion companion = Terminal.INSTANCE;
                throw null;
            }
            if (setscrollbardefaultdelaybeforefade.setDividerPadding() == Terminal.KERNEL_2) {
                int i21 = f55409k;
                int i22 = (i21 & 5) + (i21 | 5);
                f55410l = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            } else {
                int i23 = f55409k;
                int i24 = ((i23 ^ 25) - (~((i23 & 25) << 1))) - 1;
                f55410l = i24 % 128;
                int i25 = i24 % 2;
                str = null;
            }
            i10 = 8;
            c10 = 2;
        } else {
            int i26 = f55409k;
            int i27 = ((i26 & 110) + (i26 | 110)) - 1;
            f55410l = i27 % 128;
            c10 = 2;
            int i28 = i27 % 2;
            str = null;
            i10 = 8;
        }
        Object[] objArr2 = new Object[i10];
        objArr2[0] = euVar;
        objArr2[1] = setscrollbardefaultdelaybeforefade;
        objArr2[c10] = settextkeepstate;
        objArr2[3] = getbeeponfailure;
        objArr2[4] = jVar;
        objArr2[5] = lVar;
        objArr2[6] = fVar;
        objArr2[7] = str;
        fk fkVar = (fk) ez.setOnFocusChangeListener(objArr2, -923790656, 923790670, System.identityHashCode(euVar));
        int i29 = f55410l;
        int i30 = i29 & 41;
        int i31 = (i30 - (~(-(-((i29 ^ 41) | i30))))) - 1;
        f55409k = i31 % 128;
        int i32 = i31 % 2;
        return fkVar;
    }

    public static /* synthetic */ fk c(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[3];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
        f fVar = new f((activateSession) ez.setY.setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis()), (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis()), setcontentcapturesession, (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()));
        fk fkVar = (fk) ez.setOnFocusChangeListener(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, null, (j) ez.setOnFocusChangeListener(new Object[]{fd.SELECT_NEXT, getY.setCompoundDrawableTintBlendMode, null, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), fVar}, -1578681857, 1578681862, (int) System.currentTimeMillis());
        int i10 = f55409k;
        int i11 = (((i10 | 115) << 1) - (~(-(i10 ^ 115)))) - 1;
        f55410l = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 14 / 0;
        }
        return fkVar;
    }

    public static /* synthetic */ fk d(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        activateSession activatesession = (activateSession) objArr[3];
        fd fdVar = (fd) objArr[4];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[6];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i10 = f55409k + 71;
        int i11 = i10 % 128;
        f55410l = i11;
        if (i10 % 2 != 0 ? (iIntValue & 64) != 0 : (iIntValue & 98) != 0) {
            int i12 = i11 & 83;
            int i13 = i12 + ((i11 ^ 83) | i12);
            f55409k = i13 % 128;
            int i14 = i13 % 2;
            transactionProcessingResult = null;
        }
        if ((iIntValue & 128) != 0) {
            int i15 = ((i11 | 67) << 1) - (((~i11) & 67) | (i11 & (-68)));
            f55409k = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 33 / 0;
                setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            } else {
                setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            }
        }
        fk fkVar = (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, activatesession, fdVar, Boolean.TRUE, settransitionvisibility, transactionProcessingResult, setdrawselectorontop}, -2126325123, 2126325141, System.identityHashCode(euVar));
        int i17 = f55410l;
        int i18 = (((i17 & (-112)) | ((~i17) & 111)) - (~(-(-((i17 & 111) << 1))))) - 1;
        f55409k = i18 % 128;
        int i19 = i18 % 2;
        return fkVar;
    }

    public static /* synthetic */ fk e(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        f fVar = new f(activateSession.N_A, (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis()), (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis()), setDrawSelectorOnTop.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()));
        fk fkVar = (fk) ez.setOnFocusChangeListener(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, null, (j) ez.setOnFocusChangeListener(new Object[]{fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), fVar}, -1578681857, 1578681862, (int) System.currentTimeMillis());
        int i10 = f55409k;
        int i11 = ((i10 | 105) << 1) - (i10 ^ 105);
        f55410l = i11 % 128;
        if (i11 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ fk f(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setHighlightColor sethighlightcolor = (setHighlightColor) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        Intrinsics.checkNotNullParameter(sethighlightcolor, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        f fVar = new f((activateSession) ez.setY.setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis()), (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis()), setContentCaptureSession.setAlwaysDrawnWithCacheEnabled, (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()));
        fk fkVar = (fk) ez.setOnFocusChangeListener(new Object[]{euVar, sethighlightcolor, settextkeepstate, null, (j) ez.setOnFocusChangeListener(new Object[]{fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{sethighlightcolor, activateSession.ERROR_OTHER_CARD, ValueQualifier.setDividerPadding, (byte[]) setDividerPadding.setX(new Object[0], -645540002, 645540002, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), fVar}, -1578681857, 1578681862, (int) System.currentTimeMillis());
        int i10 = f55409k;
        int i11 = (((i10 & (-76)) | ((~i10) & 75)) - (~((i10 & 75) << 1))) - 1;
        f55410l = i11 % 128;
        if (i11 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    public static getBeepOnFailure g(TransactionFailed transactionFailed) {
        return (getBeepOnFailure) setY(new Object[]{transactionFailed}, -1838241146, 1838241150, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ fk h(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        setItemChecked setitemchecked = (setItemChecked) objArr[3];
        byte[] bArr = (byte[]) objArr[4];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(setitemchecked, "");
        f fVar = new f(activateSession.N_A, setitemchecked, (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis()), (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()));
        fk fkVar = (fk) ez.setOnFocusChangeListener(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, null, (j) ez.setOnFocusChangeListener(new Object[]{euVar, fd.TRY_AGAIN, getY.setOnFocusChangeListener, Boolean.TRUE, bArr}, 1262280801, -1262280790, System.identityHashCode(euVar)), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, activateSession.PRESENT_CARD_AGAIN, ValueQualifier.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), fVar}, -1578681857, 1578681862, (int) System.currentTimeMillis());
        int i10 = f55410l;
        int i11 = ((i10 | 18) << 1) - (i10 ^ 18);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f55409k = i12 % 128;
        if (i12 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ x i(Object[] objArr) {
        j jVar = (j) objArr[0];
        x xVar = new x(g(setAnimation.getTransactionPortrait()));
        int i10 = f55409k;
        int i11 = ((i10 ^ 23) - (~((i10 & 23) << 1))) - 1;
        f55410l = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 67 / 0;
        }
        return xVar;
    }

    public static /* synthetic */ y j(Object[] objArr) {
        f fVar = (f) objArr[0];
        y yVar = new y(g(setAnimation.onPinPadLaunchRequest()));
        int i10 = f55409k;
        int i11 = i10 & 45;
        int i12 = (i10 | 45) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        f55410l = i14 % 128;
        if (i14 % 2 != 0) {
            return yVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    public static /* synthetic */ void k(Object[] objArr) throws Exception {
        y yVar;
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        j jVar = (j) objArr[2];
        f fVar = (f) objArr[3];
        l lVar = (l) objArr[4];
        int i10 = f55410l;
        int i11 = i10 & 35;
        int i12 = -(-((i10 ^ 35) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55409k = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            int i14 = 63 / 0;
            if (lVar != null) {
                int i15 = f55409k;
                int i16 = i15 & 43;
                int i17 = -(-((i15 ^ 43) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                f55410l = i18 % 128;
                int i19 = i18 % 2;
                int i20 = f55410l;
                int i21 = ((i20 & 126) + (i20 | 126)) - 1;
                f55409k = i21 % 128;
                int i22 = i21 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
            if (lVar != null) {
                int i110 = f55409k;
                int i111 = i110 & 43;
                int i112 = -(-((i110 ^ 43) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                f55410l = i113 % 128;
                int i114 = i113 % 2;
                int i23 = f55410l;
                int i24 = ((i23 & 126) + (i23 | 126)) - 1;
                f55409k = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        if (fVar == null) {
            int i26 = f55410l;
            int i27 = i26 & 41;
            int i28 = ((i26 ^ 41) | i27) << 1;
            int i29 = -((i26 | 41) & (~i27));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            int i31 = i30 % 128;
            f55409k = i31;
            int i32 = i30 % 2;
            int i33 = ((i31 | 70) << 1) - (i31 ^ 70);
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            f55410l = i34 % 128;
            int i35 = i34 % 2;
            yVar = null;
        } else {
            yVar = (y) setY(new Object[]{fVar}, -1506234894, 1506234908, (int) System.currentTimeMillis());
            int i36 = f55410l;
            int i37 = (i36 ^ 107) + ((i36 & 107) << 1);
            f55409k = i37 % 128;
            int i38 = i37 % 2;
        }
        if (jVar != null) {
            int i39 = f55409k;
            int i40 = ((i39 ^ 52) + ((i39 & 52) << 1)) - 1;
            f55410l = i40 % 128;
            int i41 = i40 % 2;
            System.identityHashCode(euVar);
            System.identityHashCode(euVar);
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setY(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], -731579319, 731579502, (int) System.currentTimeMillis())}, -1838241146, 1838241150, (int) System.currentTimeMillis());
        if (yVar != null) {
            int i42 = f55410l;
            int i43 = i42 & 77;
            int i44 = -(-(i42 | 77));
            int i45 = (i43 & i44) + (i44 | i43);
            f55409k = i45 % 128;
            int i46 = i45 % 2;
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, yVar}, 1215253814, -1215253809, System.identityHashCode(getbeeponfailure));
            int i47 = f55409k + 51;
            f55410l = i47 % 128;
            int i48 = i47 % 2;
        }
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.KERNEL_2}, -157457190, 157457205, (int) System.currentTimeMillis());
        setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{Terminal.OTHER}, -157457190, 157457205, (int) System.currentTimeMillis());
        int i49 = f55410l + 69;
        f55409k = i49 % 128;
        if (i49 % 2 != 0) {
            int i50 = 56 / 0;
        }
    }

    public static /* synthetic */ getBeepOnFailure l(Object[] objArr) {
        byte[] bArr;
        TransactionFailed transactionFailed = (TransactionFailed) objArr[0];
        int i10 = f55410l;
        int i11 = ((i10 | 31) << 1) - (i10 ^ 31);
        f55409k = i11 % 128;
        if (i11 % 2 != 0) {
            ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setOnFocusChangeListener();
            throw null;
        }
        int onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setOnFocusChangeListener();
        if (onFocusChangeListener > 0) {
            int i12 = f55410l;
            int i13 = i12 & 69;
            int i14 = -(-((i12 ^ 69) | i13));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            f55409k = i16;
            bArr = i15 % 2 != 0 ? new byte[onFocusChangeListener] : new byte[onFocusChangeListener];
            int i17 = i16 & 3;
            int i18 = ((i16 ^ 3) | i17) << 1;
            int i19 = -((i16 | 3) & (~i17));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f55410l = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < onFocusChangeListener) {
                int i23 = f55409k;
                int i24 = ((i23 & (-24)) | ((~i23) & 23)) + ((i23 & 23) << 1);
                f55410l = i24 % 128;
                if (i24 % 2 == 0) {
                    bArr[i22] = 1;
                    i22 %= 1;
                } else {
                    bArr[i22] = 0;
                    i22 = (i22 & 1) + (i22 | 1);
                }
            }
            int i25 = f55409k;
            int i26 = ((i25 | 105) << 1) - (i25 ^ 105);
            f55410l = i26 % 128;
            int i27 = i26 % 2;
        } else {
            bArr = new byte[0];
            int i28 = f55410l;
            int i29 = ((i28 & 106) + (i28 | 106)) - 1;
            f55409k = i29 % 128;
            int i30 = i29 % 2;
        }
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), bArr, Terminal.KERNEL_2, Boolean.FALSE, 24}, -976227287, 976227290, 24);
        int i31 = f55409k;
        int i32 = (-2) - (((i31 ^ 100) + ((i31 & 100) << 1)) ^ (-1));
        f55410l = i32 % 128;
        int i33 = i32 % 2;
        return getbeeponfailure;
    }

    public static /* synthetic */ fk m(Object[] objArr) throws Exception {
        Object y7;
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = f55410l;
        int i11 = ((((i10 ^ 115) | (i10 & 115)) << 1) - (~(-(((~i10) & 115) | (i10 & (-116)))))) - 1;
        f55409k = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            y7 = setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, activateSession.APPROVED, fd.ONLINE_REQUEST, setTransitionVisibility.setY, null, null, 17387}, 975607783, -975607768, 17387);
        } else {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            y7 = setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, activateSession.APPROVED, fd.ONLINE_REQUEST, setTransitionVisibility.setY, null, null, 192}, 975607783, -975607768, 192);
        }
        fk fkVar = (fk) y7;
        int i12 = f55409k;
        int i13 = ((i12 | 117) << 1) - (i12 ^ 117);
        f55410l = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 62 / 0;
        }
        return fkVar;
    }

    public static /* synthetic */ fk n(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        fd fdVar = (fd) objArr[3];
        activateSession activatesession = (activateSession) objArr[4];
        activateSession activatesession2 = (activateSession) objArr[5];
        ValueQualifier valueQualifier = (ValueQualifier) objArr[6];
        setItemChecked setitemchecked = (setItemChecked) objArr[7];
        setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[8];
        setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[9];
        byte[] bArr = (byte[]) objArr[10];
        Boolean bool = (Boolean) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int i10 = f55409k;
        int i11 = (i10 ^ 27) + ((i10 & 27) << 1);
        f55410l = i11 % 128;
        int i12 = i11 % 2;
        if ((iIntValue & 64) != 0) {
            int i13 = (((i10 | 114) << 1) - (i10 ^ 114)) - 1;
            f55410l = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            setitemchecked = (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis());
            int i14 = f55410l;
            int i15 = ((i14 ^ 69) | (i14 & 69)) << 1;
            int i16 = -(((~i14) & 69) | (i14 & (-70)));
            int i17 = (i15 & i16) + (i16 | i15);
            f55409k = i17 % 128;
            int i18 = i17 % 2;
        }
        if ((iIntValue & 128) != 0) {
            int i19 = f55410l;
            int i20 = (i19 & (-16)) | ((~i19) & 15);
            int i21 = -(-((i19 & 15) << 1));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55409k = i22 % 128;
            int i23 = i22 % 2;
            setcontentcapturesession = (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis());
            int i24 = f55409k;
            int i25 = (i24 & 37) + (i24 | 37);
            f55410l = i25 % 128;
            int i26 = i25 % 2;
        }
        if ((iIntValue & 256) != 0) {
            int i27 = f55410l;
            int i28 = i27 ^ 107;
            int i29 = (((i27 & 107) | i28) << 1) - i28;
            f55409k = i29 % 128;
            int i30 = i29 % 2;
            setdrawselectorontop = (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis());
            int i31 = f55409k;
            int i32 = i31 ^ 15;
            int i33 = ((((i31 & 15) | i32) << 1) - (~(-i32))) - 1;
            f55410l = i33 % 128;
            int i34 = i33 % 2;
        }
        fk fkVar = (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, fdVar, activatesession, activatesession2, valueQualifier, setitemchecked, setcontentcapturesession, setdrawselectorontop, bArr, bool}, 12146416, -12146397, System.identityHashCode(euVar));
        int i35 = f55409k;
        int i36 = (i35 & (-114)) | ((~i35) & 113);
        int i37 = (i35 & 113) << 1;
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        f55410l = i38 % 128;
        if (i38 % 2 == 0) {
            int i39 = 67 / 0;
        }
        return fkVar;
    }

    public static /* synthetic */ ae o(Object[] objArr) {
        l lVar = (l) objArr[0];
        int i10 = f55410l;
        int i11 = i10 & 13;
        int i12 = (i10 | 13) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f55409k = i14 % 128;
        byte[] bArr = null;
        if (i14 % 2 != 0) {
            throw null;
        }
        byte[] bArr2 = (byte[]) l.setX(new Object[]{lVar}, -1465947066, 1465947070, System.identityHashCode(lVar));
        byte[] bArr3 = (byte[]) l.setX(new Object[]{lVar}, 37049979, -37049969, System.identityHashCode(lVar));
        if (bArr3 == null) {
            int i15 = f55409k;
            int i16 = i15 & 49;
            int i17 = (i16 - (~((i15 ^ 49) | i16))) - 1;
            f55410l = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 72 / 0;
            }
        } else {
            byte[] bArr4 = new byte[8];
            int i19 = f55409k;
            int i20 = ((i19 & 66) + (i19 | 66)) - 1;
            f55410l = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 < 8) {
                int i23 = f55410l;
                int i24 = i23 & 115;
                int i25 = -(-((i23 ^ 115) | i24));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f55409k = i26 % 128;
                int i27 = i26 % 2;
                bArr4[i22] = 0;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i28 = -(-(i22 * 246));
                int i29 = ((-244) ^ i28) + ((i28 & (-244)) << 1);
                int i30 = ~i22;
                int i31 = ~iCurrentTimeMillis;
                int i32 = i30 ^ i31;
                int i33 = i31 & i30;
                int i34 = ~((i32 & i33) | (i32 ^ i33));
                int i35 = i30 & 1;
                int i36 = i35 | ((~i35) & (i30 | 1));
                int i37 = ~i36;
                int i38 = (i36 | i37) & i37;
                int i39 = (-2) - ((i29 - (~(((i34 & i38) | (i34 ^ i38)) * (-245)))) ^ (-1));
                int i40 = i30 ^ iCurrentTimeMillis;
                int i41 = i30 & iCurrentTimeMillis;
                int i42 = (~((i40 & i41) | (i40 ^ i41))) * (-245);
                int i43 = i39 & i42;
                int i44 = ((i39 | i42) & (~i43)) + (i43 << 1);
                int i45 = ~(((~i30) & iCurrentTimeMillis) | i33 | i41);
                int i46 = ((i45 & 1) | (i45 ^ 1)) * 245;
                int i47 = ((~i46) & i44) | ((~i44) & i46);
                int i48 = -(-((i46 & i44) << 1));
                i22 = ((i47 | i48) << 1) - (i48 ^ i47);
                int i49 = f55410l;
                int i50 = i49 & 41;
                int i51 = -(-((i49 ^ 41) | i50));
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                f55409k = i52 % 128;
                int i53 = i52 % 2;
            }
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            int i54 = f55410l;
            int i55 = i54 & 23;
            int i56 = (i54 ^ 23) | i55;
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            f55409k = i57 % 128;
            int i58 = i57 % 2;
            bArr = bArr4;
        }
        ae aeVar = new ae(g(setAnimation.setEnabled()));
        int i59 = f55410l;
        int i60 = (i59 ^ 46) + ((i59 & 46) << 1);
        int i61 = (i60 ^ (-1)) + (i60 << 1);
        f55409k = i61 % 128;
        if (i61 % 2 != 0) {
            int i62 = 85 / 0;
        }
        return aeVar;
    }

    public static /* synthetic */ fk p(Object[] objArr) {
        eu euVar = (eu) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        int i10 = f55410l + 47;
        f55409k = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        fk fkVar = (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, setDrawSelectorOnTop.setNavigationOnClickListener}, -234839837, 234839850, System.identityHashCode(euVar));
        int i12 = f55410l;
        int i13 = (i12 & 63) + (i12 | 63);
        f55409k = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 98 / 0;
        }
        return fkVar;
    }

    @NotNull
    public static l setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        return (l) setY(new Object[]{setscrollbardefaultdelaybeforefade}, 2109649987, -2109649975, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ fk setOnFocusChangeListener(eu euVar, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, setItemChecked setitemchecked, byte[] bArr, int i10) {
        return (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, setitemchecked, bArr, Integer.valueOf(i10)}, 1860849156, -1860849136, i10);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object y7;
        Object y10;
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        byte[] bArr = null;
        switch ((((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13) {
            case 1:
                return e(objArr);
            case 2:
                return f(objArr);
            case 3:
                return p(objArr);
            case 4:
                return l(objArr);
            case 5:
                return o(objArr);
            case 6:
                return i(objArr);
            case 7:
                return c(objArr);
            case 8:
                return m(objArr);
            case 9:
                k(objArr);
                return "";
            case 10:
                eu euVar = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                int i15 = f55410l;
                int i16 = i15 & 83;
                int i17 = (i16 - (~(-(-((i15 ^ 83) | i16))))) - 1;
                f55409k = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                fk fkVar = (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, activateSession.APPROVED, fd.APPROVED, setTransitionVisibility.setOnDragListener, null, null, 192}, 975607783, -975607768, 192);
                int i19 = f55410l;
                int i20 = ((i19 | 107) << 1) - (i19 ^ 107);
                f55409k = i20 % 128;
                int i21 = i20 % 2;
                return fkVar;
            case 11:
                eu euVar2 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                int i22 = f55409k;
                int i23 = (i22 & (-30)) | ((~i22) & 29);
                int i24 = (i22 & 29) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                f55410l = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                fd fdVar = fd.END_APPLICATION;
                activateSession activatesession = activateSession.ERROR_OTHER_CARD;
                fk fkVar2 = (fk) setY(new Object[]{euVar2, setscrollbardefaultdelaybeforefade2, settextkeepstate2, fdVar, activatesession, activatesession, ValueQualifier.setY, null, null, setDrawSelectorOnTop.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), Boolean.TRUE, 192}, 254108280, -254108264, 192);
                int i27 = f55409k + 49;
                f55410l = i27 % 128;
                int i28 = i27 % 2;
                return fkVar2;
            case 12:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                int i29 = f55409k;
                int i30 = i29 & 119;
                int i31 = ((i29 | 119) & (~i30)) + (i30 << 1);
                f55410l = i31 % 128;
                int i32 = i31 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade3, "");
                l lVar = (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade3, activateSession.PRESENT_CARD, ValueQualifier.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis());
                System.currentTimeMillis();
                System.currentTimeMillis();
                return lVar;
            case 13:
                eu euVar3 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) objArr[3];
                int i33 = f55410l;
                int i34 = i33 & 111;
                int i35 = i33 | 111;
                int i36 = (i34 & i35) + (i35 | i34);
                f55409k = i36 % 128;
                if (i36 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate3, "");
                    Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
                    y7 = setY(new Object[]{euVar3, setscrollbardefaultdelaybeforefade4, settextkeepstate3, activateSession.NOT_AUTHORISED, fd.END_APPLICATION, setTransitionVisibility.setOnDragListener, null, setdrawselectorontop, 38}, 975607783, -975607768, 38);
                } else {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate3, "");
                    Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
                    y7 = setY(new Object[]{euVar3, setscrollbardefaultdelaybeforefade4, settextkeepstate3, activateSession.NOT_AUTHORISED, fd.END_APPLICATION, setTransitionVisibility.setOnDragListener, null, setdrawselectorontop, 64}, 975607783, -975607768, 64);
                }
                fk fkVar3 = (fk) y7;
                int i37 = f55410l + 17;
                f55409k = i37 % 128;
                int i38 = i37 % 2;
                return fkVar3;
            case 14:
                return j(objArr);
            case 15:
                return d(objArr);
            case 16:
                return n(objArr);
            case 17:
                eu euVar4 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                int i39 = f55409k;
                int i40 = ((i39 ^ 113) | (i39 & 113)) << 1;
                int i41 = -(((~i39) & 113) | (i39 & (-114)));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f55410l = i42 % 128;
                int i43 = i42 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade5, "");
                Intrinsics.checkNotNullParameter(settextkeepstate4, "");
                activateSession activatesession2 = activateSession.SEE_PHONE;
                ValueQualifier valueQualifier = ValueQualifier.setDividerPadding;
                ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade5, settextkeepstate4, activatesession2, valueQualifier, (byte[]) setDividerPadding.setX(new Object[0], -2047747991, 2047747994, (int) System.currentTimeMillis()), null}, 1848792245, -1848792245, (int) System.currentTimeMillis());
                fk fkVar4 = (fk) ez.setOnFocusChangeListener(new Object[]{euVar4, setscrollbardefaultdelaybeforefade5, settextkeepstate4, null, (j) ez.setOnFocusChangeListener(new Object[]{fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade5, activateSession.PRESENT_CARD_AGAIN, valueQualifier, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), null}, -1578681857, 1578681862, (int) System.currentTimeMillis());
                int i44 = f55409k;
                int i45 = (i44 & 71) + (i44 | 71);
                f55410l = i45 % 128;
                int i46 = i45 % 2;
                return fkVar4;
            case 18:
                return b(objArr);
            case 19:
                eu euVar5 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade6 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                fd fdVar2 = (fd) objArr[3];
                activateSession activatesession3 = (activateSession) objArr[4];
                activateSession activatesession4 = (activateSession) objArr[5];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[6];
                setItemChecked setitemchecked = (setItemChecked) objArr[7];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[8];
                setDrawSelectorOnTop setdrawselectorontop2 = (setDrawSelectorOnTop) objArr[9];
                byte[] bArr2 = (byte[]) objArr[10];
                Boolean bool = (Boolean) objArr[11];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade6, "");
                Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                Intrinsics.checkNotNullParameter(fdVar2, "");
                Intrinsics.checkNotNullParameter(activatesession3, "");
                Intrinsics.checkNotNullParameter(activatesession4, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(setitemchecked, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                Intrinsics.checkNotNullParameter(setdrawselectorontop2, "");
                return (fk) ez.setOnFocusChangeListener(new Object[]{euVar5, setscrollbardefaultdelaybeforefade6, settextkeepstate5, null, (j) ez.setOnFocusChangeListener(new Object[]{fdVar2, getY.setNavigationOnClickListener, bool, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade6, activatesession3, valueQualifier2, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), new f(activatesession4, setitemchecked, setcontentcapturesession, setdrawselectorontop2, bArr2 == null ? (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()) : bArr2)}, -1578681857, 1578681862, (int) System.currentTimeMillis());
            case 20:
                eu euVar6 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade7 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                setItemChecked setitemchecked2 = (setItemChecked) objArr[3];
                byte[] bArr3 = (byte[]) objArr[4];
                int iIntValue = ((Number) objArr[5]).intValue();
                int i47 = f55410l;
                int i48 = (i47 & (-26)) | ((~i47) & 25);
                int i49 = -(-((i47 & 25) << 1));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f55409k = i50 % 128;
                if (i50 % 2 == 0 ? (iIntValue & 4) != 0 : (iIntValue & 3) != 0) {
                    setitemchecked2 = (setItemChecked) ez.setY.setX(new Object[0], 1265097775, -1265097767, (int) System.currentTimeMillis());
                    int i51 = f55409k;
                    int i52 = ((i51 ^ 55) | (i51 & 55)) << 1;
                    int i53 = -(((~i51) & 55) | (i51 & (-56)));
                    int i54 = (i52 & i53) + (i53 | i52);
                    f55410l = i54 % 128;
                    int i55 = i54 % 2;
                }
                if ((iIntValue & 8) != 0) {
                    int i56 = f55410l;
                    int i57 = i56 ^ 123;
                    int i58 = (i56 & 123) << 1;
                    int i59 = (i57 & i58) + (i58 | i57);
                    int i60 = i59 % 128;
                    f55409k = i60;
                    int i61 = i59 % 2;
                    int i62 = (i60 ^ 17) + ((i60 & 17) << 1);
                    f55410l = i62 % 128;
                    int i63 = i62 % 2;
                } else {
                    bArr = bArr3;
                }
                return (fk) setY(new Object[]{euVar6, setscrollbardefaultdelaybeforefade7, settextkeepstate6, setitemchecked2, bArr}, -1529164782, 1529164804, System.identityHashCode(euVar6));
            case 21:
                eu euVar7 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade8 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                int i64 = f55409k;
                int i65 = i64 & 71;
                int i66 = (i65 - (~((i64 ^ 71) | i65))) - 1;
                f55410l = i66 % 128;
                if (i66 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade8, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                    y10 = setY(new Object[]{euVar7, setscrollbardefaultdelaybeforefade8, settextkeepstate7, activateSession.APPROVED, fd.ONLINE_REQUEST, setTransitionVisibility.setY, TransactionProcessingResult.setCompoundDrawableTintBlendMode, null, 6320}, 975607783, -975607768, 6320);
                } else {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade8, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                    y10 = setY(new Object[]{euVar7, setscrollbardefaultdelaybeforefade8, settextkeepstate7, activateSession.APPROVED, fd.ONLINE_REQUEST, setTransitionVisibility.setY, TransactionProcessingResult.setCompoundDrawableTintBlendMode, null, 128}, 975607783, -975607768, 128);
                }
                fk fkVar5 = (fk) y10;
                int i67 = f55410l;
                int i68 = ((i67 ^ 110) + ((i67 & 110) << 1)) - 1;
                f55409k = i68 % 128;
                int i69 = i68 % 2;
                return fkVar5;
            case 22:
                return h(objArr);
            default:
                eu euVar8 = (eu) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade9 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                fk fkVar6 = (fk) ez.setOnFocusChangeListener(new Object[]{euVar8, setscrollbardefaultdelaybeforefade9, settextkeepstate8, null, (j) ez.setOnFocusChangeListener(new Object[]{fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192}, -1608764632, 1608764640, 192), (l) ez.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade9, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())}, -1368133254, 1368133258, (int) System.currentTimeMillis()), new f((activateSession) ez.setY.setX(new Object[0], 316386280, -316386274, (int) System.currentTimeMillis()), setItemChecked.setX, (setContentCaptureSession) ez.setY.setX(new Object[0], -1946658622, 1946658624, (int) System.currentTimeMillis()), (setDrawSelectorOnTop) ez.setY.setX(new Object[0], 254417, -254416, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()))}, -1578681857, 1578681862, (int) System.currentTimeMillis());
                int i70 = f55410l;
                int i71 = ((i70 | 43) << 1) - (i70 ^ 43);
                f55409k = i71 % 128;
                int i72 = i71 % 2;
                return fkVar6;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ez
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @Nullable j jVar, @Nullable f fVar, @Nullable l lVar, @Nullable getBeepOnFailure getbeeponfailure) {
        return (String) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure}, 944712318, -944712309, System.identityHashCode(this));
    }

    @NotNull
    public final fk setNavigationOnClickListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1844507036, -1844507019, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnDragListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -506665449, 506665460, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnLongClickListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 346138957, -346138957, System.identityHashCode(this));
    }

    @NotNull
    public final fk setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -670989484, 670989485, System.identityHashCode(this));
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull setContentCaptureSession setcontentcapturesession) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, setcontentcapturesession}, 894925356, -894925349, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1782329452, -1782329449, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1892757089, -1892757079, System.identityHashCode(this));
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1796303729, 1796303750, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull setDrawSelectorOnTop setdrawselectorontop) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, setdrawselectorontop}, -234839837, 234839850, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/eu$setDividerPadding;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55411a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55412b = 1;

        public setDividerPadding() {
        }

        public /* synthetic */ setDividerPadding(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setX(new Object[0], -2047747991, 2047747994, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = ~i11;
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = (((~(i13 | i14)) | (~(i15 | i11)) | (~(i10 | i11))) * 494) + ((i11 | i14 | i15) * 494) + ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
            if (i16 == 1) {
                int i17 = f55411a;
                int i18 = (i17 & 29) + (i17 | 29);
                f55412b = i18 % 128;
                int i19 = i18 % 2;
                bArr = new byte[]{0, 0, 0};
                int i20 = ((i17 | 43) << 1) - (((~i17) & 43) | (i17 & (-44)));
                f55412b = i20 % 128;
                int i21 = i20 % 2;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        int i22 = f55411a + 47;
                        f55412b = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr2 = (byte[]) setX(new Object[0], -1420577419, 1420577420, (int) System.currentTimeMillis());
                        int i24 = f55412b;
                        int i25 = (i24 & 41) + (i24 | 41);
                        f55411a = i25 % 128;
                        int i26 = i25 % 2;
                        return bArr2;
                    }
                    int i27 = f55412b;
                    int i28 = i27 & 107;
                    int i29 = (i27 ^ 107) | i28;
                    int i30 = (i28 & i29) + (i29 | i28);
                    f55411a = i30 % 128;
                    int i31 = i30 % 2;
                    byte[] bArr3 = (byte[]) setX(new Object[0], 1810373489, -1810373487, (int) System.currentTimeMillis());
                    int i32 = f55411a;
                    int i33 = (i32 | 1) << 1;
                    int i34 = -(i32 ^ 1);
                    int i35 = (i33 & i34) + (i34 | i33);
                    f55412b = i35 % 128;
                    int i36 = i35 % 2;
                    return bArr3;
                }
                int i37 = f55411a;
                int i38 = (i37 & 29) + (i37 | 29);
                int i39 = i38 % 128;
                f55412b = i39;
                bArr = i38 % 2 == 0 ? new byte[]{1, 1, 47, 0} : new byte[]{0, 0, 10};
                int i40 = (i39 & 115) + (i39 | 115);
                f55411a = i40 % 128;
                if (i40 % 2 != 0) {
                    int i41 = 31 / 0;
                }
            }
            return bArr;
        }

        public static final /* synthetic */ byte[] setX() {
            return (byte[]) setX(new Object[0], -645540002, 645540002, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ fk setY(eu euVar, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, fd fdVar, activateSession activatesession, activateSession activatesession2, ValueQualifier valueQualifier, setItemChecked setitemchecked, setContentCaptureSession setcontentcapturesession, setDrawSelectorOnTop setdrawselectorontop, byte[] bArr, Boolean bool, int i10) {
        return (fk) setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, fdVar, activatesession, activatesession2, valueQualifier, setitemchecked, setcontentcapturesession, setdrawselectorontop, bArr, bool, Integer.valueOf(i10)}, 254108280, -254108264, i10);
    }

    @NotNull
    public final fk setY(@NotNull setHighlightColor sethighlightcolor, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, sethighlightcolor, settextkeepstate}, 364221937, -364221935, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 192706680, -192706672, System.identityHashCode(this));
    }
}
