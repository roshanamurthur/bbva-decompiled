package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0005:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J8\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013J\u001e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bJ&\u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 JH\u0010+\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 H\u0002JB\u00103\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001b2\n\b\u0002\u00102\u001a\u0004\u0018\u000101J\u0018\u00104\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J \u00105\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0016J \u00106\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0016J\u0018\u00107\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u00108\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¨\u0006<"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/kernel_eftpos/state/outcome/KernelEftposOutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/OutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/OutcomeProcessorBase;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/KernelStateOutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/kernel_eftpos/cache/KernelEftposDatabase;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", "databaseBase", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/OutcomeParameterSet;", "outcomeParameterSet", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/ErrorIndication;", "errorIndication", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/response/outcome/UserInterfaceRequest;", "userInterfaceRequest", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/tlv/basic/Tlv;", "onlineRequest", "", "createLog", "database", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "kernelQueue", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "postCardDataErrorOutcome", "postCardDataMissingOutcome", "kernelQ", "", "postCardReadSuccessfullyOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "cvm", "postDeclinedOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", "uiStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", "l2Enum", "postErrorOtherCardOutcome", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", "messageIdentifier", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelOutcomeStatus;", "kernelOutcomeStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/KernelOutcomeStart;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "sw12", "postErrorOutcome", "uiMessage", "status", "", c.f84805j, "cvmStatus", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/PinEntryResults;", "pinEntryResult", "postFinalOutcome", "postParsingErrorOutcome", "postSelectionErrorOutcome", "postStatusBytesErrorOutcome", "postStopOutcome", "postTimeoutErrorOutcome", "<init>", "()V", "Companion", "kernel-eftpos"}, k = 1, mv = {1, 5, 1})
public final class lj extends ez implements ew<kz>, fb<kz> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56956k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56957l = 1;

    @NotNull
    public static final setCompoundDrawableTintBlendMode setX = new setCompoundDrawableTintBlendMode(null);

    static {
        int i10 = f56957l;
        int i11 = i10 & 77;
        int i12 = (((i10 ^ 77) | i11) << 1) - ((i10 | 77) & (~i11));
        f56956k = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 20 / 0;
        }
    }

    public static /* synthetic */ fk b(Object[] objArr) {
        lj ljVar = (lj) objArr[0];
        kz kzVar = (kz) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        activateSession activatesession = (activateSession) objArr[3];
        fd fdVar = (fd) objArr[4];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[6];
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(fdVar, "");
        Intrinsics.checkNotNullParameter(settransitionvisibility, "");
        f fVar = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
        l y7 = ez.setY(kzVar, activatesession, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()));
        j y10 = ez.setY(fdVar, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, Boolean.FALSE, null, settransitionvisibility, null, transactionProcessingResult, 64);
        ey eyVar = ey.INSTANCE;
        fk onFocusChangeListener = ez.setOnFocusChangeListener(ljVar, kzVar, settextkeepstate, (getBeepOnFailure) ey.setY(new Object[]{kzVar}, 1660534021, -1660534020, (int) System.currentTimeMillis()), y10, y7, fVar);
        int i10 = f56956k;
        int i11 = i10 & 45;
        int i12 = -(-(i10 | 45));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f56957l = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 0 / 0;
        }
        return onFocusChangeListener;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk fkVar;
        fk fkVar2;
        fk fkVar3;
        Pair pair;
        int i13;
        int i14 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~i12;
        int i18 = (((~(i11 | i12)) | (~(i15 | i16 | i17))) * 520) + i14;
        int i19 = ~(i16 | i17);
        int i20 = ~(i12 | i10);
        switch ((((~(i10 | i16)) | (~(i15 | i17)) | i20) * 520) + ((i19 | i20) * (-1040)) + i18) {
            case 1:
                return b(objArr);
            case 2:
                lj ljVar = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                byte[] bArr = (byte[]) objArr[3];
                int i21 = f56956k;
                int i22 = (i21 & (-66)) | ((~i21) & 65);
                int i23 = -(-((i21 & 65) << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f56957l = i24 % 128;
                int i25 = i24 % 2;
                fkVar = (fk) setY(new Object[]{ljVar, (kz) setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, 1232663498, -1232663489, System.identityHashCode(ljVar));
                int i26 = f56957l;
                int i27 = i26 & 69;
                int i28 = (i27 - (~((i26 ^ 69) | i27))) - 1;
                f56956k = i28 % 128;
                if (i28 % 2 != 0) {
                    throw null;
                }
                break;
            case 3:
                lj ljVar2 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                int i29 = f56956k;
                int i30 = ((i29 & 56) + (i29 | 56)) - 1;
                f56957l = i30 % 128;
                int i31 = i30 % 2;
                fk fkVar4 = (fk) setY(new Object[]{ljVar2, (kz) setscrollbardefaultdelaybeforefade2, settextkeepstate2}, 1034894913, -1034894900, System.identityHashCode(ljVar2));
                int i32 = f56956k;
                int i33 = ((i32 | 3) << 1) - (i32 ^ 3);
                f56957l = i33 % 128;
                if (i33 % 2 != 0) {
                    return fkVar4;
                }
                int i34 = 42 / 0;
                return fkVar4;
            case 4:
                lj ljVar3 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                byte[] bArr2 = (byte[]) objArr[3];
                int i35 = f56956k + 1;
                f56957l = i35 % 128;
                kz kzVar = (kz) setscrollbardefaultdelaybeforefade3;
                if (i35 % 2 == 0) {
                    fkVar2 = (fk) setY(new Object[]{ljVar3, kzVar, settextkeepstate3, bArr2}, 852948907, -852948892, System.identityHashCode(ljVar3));
                    int i36 = 76 / 0;
                } else {
                    fkVar2 = (fk) setY(new Object[]{ljVar3, kzVar, settextkeepstate3, bArr2}, 852948907, -852948892, System.identityHashCode(ljVar3));
                }
                fk fkVar5 = fkVar2;
                int i37 = f56956k;
                int i38 = ((i37 ^ 114) + ((i37 & 114) << 1)) - 1;
                f56957l = i38 % 128;
                int i39 = i38 % 2;
                return fkVar5;
            case 5:
                lj ljVar4 = (lj) objArr[0];
                activateSession activatesession = (activateSession) objArr[1];
                fd fdVar = (fd) objArr[2];
                kz kzVar2 = (kz) objArr[3];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[4];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[5];
                fk onFocusChangeListener = ez.setOnFocusChangeListener(ljVar4, kzVar2, settextkeepstate4, null, ez.setY(fdVar, (getY) objArr[6], Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kzVar2, activatesession, valueQualifier, (byte[]) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[0], 966829652, -966829651, (int) System.currentTimeMillis())), new f(activatesession, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[8], ez.setY.setLayoutAnimation(), (byte[]) objArr[7]));
                int i40 = f56956k;
                int i41 = i40 & 103;
                int i42 = (i40 ^ 103) | i41;
                int i43 = (i41 & i42) + (i42 | i41);
                f56957l = i43 % 128;
                int i44 = i43 % 2;
                return onFocusChangeListener;
            case 6:
                lj ljVar5 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                int i45 = f56957l;
                int i46 = i45 & 93;
                int i47 = (i45 | 93) & (~i46);
                int i48 = -(-(i46 << 1));
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                f56956k = i49 % 128;
                kz kzVar3 = (kz) setscrollbardefaultdelaybeforefade4;
                if (i49 % 2 != 0) {
                    fkVar3 = (fk) setY(new Object[]{ljVar5, kzVar3, settextkeepstate5}, 1431504265, -1431504247, System.identityHashCode(ljVar5));
                    int i50 = 52 / 0;
                } else {
                    fkVar3 = (fk) setY(new Object[]{ljVar5, kzVar3, settextkeepstate5}, 1431504265, -1431504247, System.identityHashCode(ljVar5));
                }
                fk fkVar6 = fkVar3;
                int i51 = f56957l;
                int i52 = i51 & 61;
                int i53 = i52 + ((i51 ^ 61) | i52);
                f56956k = i53 % 128;
                if (i53 % 2 == 0) {
                    return fkVar6;
                }
                int i54 = 1 / 0;
                return fkVar6;
            case 7:
                lj ljVar6 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                int i55 = f56957l;
                int i56 = i55 ^ 39;
                int i57 = -(-((i55 & 39) << 1));
                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                f56956k = i58 % 128;
                kz kzVar4 = (kz) setscrollbardefaultdelaybeforefade5;
                if (i58 % 2 == 0) {
                    return (fk) setY(new Object[]{ljVar6, kzVar4, settextkeepstate6}, -370236199, 370236211, System.identityHashCode(ljVar6));
                }
                throw null;
            case 8:
                lj ljVar7 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade6 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                int i59 = f56956k;
                int i60 = ((i59 | 5) << 1) - (i59 ^ 5);
                f56957l = i60 % 128;
                kz kzVar5 = (kz) setscrollbardefaultdelaybeforefade6;
                if (i60 % 2 == 0) {
                    throw null;
                }
                fk fkVar7 = (fk) setY(new Object[]{ljVar7, kzVar5, settextkeepstate7}, -217066977, 217066991, System.identityHashCode(ljVar7));
                int i61 = f56956k;
                int i62 = (i61 & 61) + (i61 | 61);
                f56957l = i62 % 128;
                int i63 = i62 % 2;
                return fkVar7;
            case 9:
                lj ljVar8 = (lj) objArr[0];
                kz kzVar6 = (kz) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                int i64 = f56957l;
                int i65 = (i64 & 125) + (i64 | 125);
                f56956k = i65 % 128;
                int i66 = i65 % 2;
                Intrinsics.checkNotNullParameter(kzVar6, "");
                Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                Intrinsics.checkNotNullParameter(bArr3, "");
                fk fkVar8 = (fk) setY(new Object[]{ljVar8, kzVar6, settextkeepstate8, bArr3}, 852948907, -852948892, System.identityHashCode(ljVar8));
                int i67 = f56957l;
                int i68 = ((i67 ^ 110) + ((i67 & 110) << 1)) - 1;
                f56956k = i68 % 128;
                int i69 = i68 % 2;
                return fkVar8;
            case 10:
                lj ljVar9 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade7 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                j jVar = (j) objArr[2];
                f fVar = (f) objArr[3];
                l lVar = (l) objArr[4];
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[5];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade7, "");
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{setAnimation.TransactionErrorCause(), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis())});
                ArrayList arrayList = new ArrayList();
                Iterator it = listListOf.iterator();
                int i70 = f56956k;
                int i71 = ((i70 | 115) << 1) - (i70 ^ 115);
                f56957l = i71 % 128;
                int i72 = i71 % 2;
                while (!(!it.hasNext())) {
                    int i73 = f56956k;
                    int i74 = i73 ^ 101;
                    int i75 = -(-((i73 & 101) << 1));
                    int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                    f56957l = i76 % 128;
                    int i77 = i76 % 2;
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade7, (TransactionFailed) it.next()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade7));
                    if (getbeeponfailure2 == null) {
                        int i78 = f56956k;
                        int i79 = (i78 ^ 107) + ((i78 & 107) << 1);
                        f56957l = i79 % 128;
                        if (i79 % 2 == 0) {
                            int i80 = 44 / 0;
                        }
                        int i81 = i78 + 122;
                        int i82 = (i81 ^ (-1)) + (i81 << 1);
                        f56957l = i82 % 128;
                        int i83 = i82 % 2;
                        pair = null;
                    } else {
                        pair = (Pair) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, -1674109266, 1674109269, (int) System.currentTimeMillis());
                        int i84 = f56956k;
                        int i85 = (-2) - (((i84 ^ 54) + ((i84 & 54) << 1)) ^ (-1));
                        f56957l = i85 % 128;
                        int i86 = i85 % 2;
                    }
                    if (pair != null) {
                        int i87 = f56957l;
                        int i88 = ((i87 | 43) << 1) - (i87 ^ 43);
                        f56956k = i88 % 128;
                        if (i88 % 2 != 0) {
                            arrayList.add(pair);
                            throw null;
                        }
                        arrayList.add(pair);
                        int i89 = f56957l;
                        int i90 = i89 ^ 27;
                        int i91 = ((i89 & 27) | i90) << 1;
                        int i92 = -i90;
                        i13 = (i91 & i92) + (i91 | i92);
                        f56956k = i13 % 128;
                    } else {
                        int i93 = f56956k;
                        int i94 = (i93 & (-20)) | ((~i93) & 19);
                        int i95 = (i93 & 19) << 1;
                        i13 = (i94 ^ i95) + ((i95 & i94) << 1);
                        f56957l = i13 % 128;
                    }
                    int i96 = i13 % 2;
                }
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, RootService.LINE_BREAK, null, null, 0, null, null, 62, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade7, jVar, fVar, lVar, getbeeponfailure));
                sb2.append("\n\nDiscretionary tags\n");
                sb2.append(strJoinToString$default);
                String string = sb2.toString();
                int i97 = f56956k + 97;
                f56957l = i97 % 128;
                int i98 = i97 % 2;
                return string;
            case 11:
                lj ljVar10 = (lj) objArr[0];
                kz kzVar7 = (kz) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(kzVar7, "");
                Intrinsics.checkNotNullParameter(settextkeepstate9, "");
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(ljVar10, kzVar7, settextkeepstate9, null, ez.setY(fd.TRY_AGAIN, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kzVar7, activateSession.PRESENT_CARD_AGAIN, ValueQualifier.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())), new f(ez.setY.setX(), setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i99 = f56957l;
                int i100 = i99 ^ 59;
                int i101 = ((i99 & 59) | i100) << 1;
                int i102 = -i100;
                int i103 = (i101 & i102) + (i101 | i102);
                f56956k = i103 % 128;
                if (i103 % 2 == 0) {
                    return onFocusChangeListener2;
                }
                int i104 = 96 / 0;
                return onFocusChangeListener2;
            case 12:
                lj ljVar11 = (lj) objArr[0];
                kz kzVar8 = (kz) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                int i105 = f56957l;
                int i106 = i105 & 3;
                int i107 = ((i105 ^ 3) | i106) << 1;
                int i108 = -((i105 | 3) & (~i106));
                int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
                f56956k = i109 % 128;
                int i110 = i109 % 2;
                Intrinsics.checkNotNullParameter(kzVar8, "");
                Intrinsics.checkNotNullParameter(settextkeepstate10, "");
                fk fkVar9 = (fk) setY(new Object[]{ljVar11, kzVar8, settextkeepstate10, ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, -2078230956, 2078230956, System.identityHashCode(ljVar11));
                int i111 = f56957l;
                int i112 = (i111 & 16) + (i111 | 16);
                int i113 = (i112 ^ (-1)) + (i112 << 1);
                f56956k = i113 % 128;
                int i114 = i113 % 2;
                return fkVar9;
            case 13:
                lj ljVar12 = (lj) objArr[0];
                kz kzVar9 = (kz) objArr[1];
                setTextKeepState settextkeepstate11 = (setTextKeepState) objArr[2];
                int i115 = f56956k;
                int i116 = i115 & 57;
                int i117 = (i115 | 57) & (~i116);
                int i118 = -(-(i116 << 1));
                int i119 = ((i117 | i118) << 1) - (i117 ^ i118);
                f56957l = i119 % 128;
                int i120 = i119 % 2;
                Intrinsics.checkNotNullParameter(kzVar9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate11, "");
                fk fkVar10 = (fk) setY(new Object[]{ljVar12, kzVar9, settextkeepstate11, ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, -2078230956, 2078230956, System.identityHashCode(ljVar12));
                int i121 = (-2) - ((f56957l + 80) ^ (-1));
                f56956k = i121 % 128;
                int i122 = i121 % 2;
                return fkVar10;
            case 14:
                lj ljVar13 = (lj) objArr[0];
                kz kzVar10 = (kz) objArr[1];
                setTextKeepState settextkeepstate12 = (setTextKeepState) objArr[2];
                int i123 = f56956k;
                int i124 = (((i123 ^ 105) | (i123 & 105)) << 1) - (((~i123) & 105) | (i123 & (-106)));
                f56957l = i124 % 128;
                if (i124 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(kzVar10, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate12, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(kzVar10, "");
                Intrinsics.checkNotNullParameter(settextkeepstate12, "");
                fk fkVar11 = (fk) setY(new Object[]{ljVar13, kzVar10, settextkeepstate12, ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, -2078230956, 2078230956, System.identityHashCode(ljVar13));
                int i125 = f56956k;
                int i126 = i125 & 69;
                int i127 = ((i125 | 69) & (~i126)) + (i126 << 1);
                f56957l = i127 % 128;
                int i128 = i127 % 2;
                return fkVar11;
            case 15:
                lj ljVar14 = (lj) objArr[0];
                kz kzVar11 = (kz) objArr[1];
                setTextKeepState settextkeepstate13 = (setTextKeepState) objArr[2];
                byte[] bArr4 = (byte[]) objArr[3];
                int i129 = f56956k;
                int i130 = i129 & 73;
                int i131 = (((i129 ^ 73) | i130) << 1) - ((i129 | 73) & (~i130));
                f56957l = i131 % 128;
                int i132 = i131 % 2;
                Intrinsics.checkNotNullParameter(kzVar11, "");
                Intrinsics.checkNotNullParameter(settextkeepstate13, "");
                Intrinsics.checkNotNullParameter(bArr4, "");
                fk fkVar12 = (fk) setY(new Object[]{ljVar14, kzVar11, settextkeepstate13, ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, -2078230956, 2078230956, System.identityHashCode(ljVar14));
                int i133 = f56957l + 67;
                f56956k = i133 % 128;
                int i134 = i133 % 2;
                return fkVar12;
            case 16:
                kz kzVar12 = (kz) objArr[1];
                setTextKeepState settextkeepstate14 = (setTextKeepState) objArr[2];
                int i135 = f56957l;
                int i136 = i135 & 71;
                int i137 = (i135 ^ 71) | i136;
                int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                f56956k = i138 % 128;
                if (i138 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(kzVar12, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate14, "");
                    ez.setX(kzVar12, settextkeepstate14, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[0], -1372316313, 1372316316, (int) System.currentTimeMillis()), null);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(kzVar12, "");
                Intrinsics.checkNotNullParameter(settextkeepstate14, "");
                ez.setX(kzVar12, settextkeepstate14, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) setCompoundDrawableTintBlendMode.setDividerPadding(new Object[0], -1372316313, 1372316316, (int) System.currentTimeMillis()), null);
                int i139 = f56956k;
                int i140 = ((i139 ^ 112) + ((i139 & 112) << 1)) - 1;
                f56957l = i140 % 128;
                int i141 = i140 % 2;
                return null;
            case 17:
                lj ljVar15 = (lj) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade8 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate15 = (setTextKeepState) objArr[2];
                int i142 = f56956k;
                int i143 = (((i142 ^ 105) | (i142 & 105)) << 1) - (((~i142) & 105) | (i142 & (-106)));
                f56957l = i143 % 128;
                if (i143 % 2 == 0) {
                    throw null;
                }
                fkVar = (fk) setY(new Object[]{ljVar15, (kz) setscrollbardefaultdelaybeforefade8, settextkeepstate15}, 2062027089, -2062027078, System.identityHashCode(ljVar15));
                int i144 = f56956k;
                int i145 = i144 & 123;
                int i146 = ((((i144 ^ 123) | i145) << 1) - (~(-((i144 | 123) & (~i145))))) - 1;
                f56957l = i146 % 128;
                if (i146 % 2 == 0) {
                    throw null;
                }
                break;
            case 18:
                lj ljVar16 = (lj) objArr[0];
                kz kzVar13 = (kz) objArr[1];
                setTextKeepState settextkeepstate16 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(kzVar13, "");
                Intrinsics.checkNotNullParameter(settextkeepstate16, "");
                fk onFocusChangeListener3 = ez.setOnFocusChangeListener(ljVar16, kzVar13, settextkeepstate16, null, ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192), null, new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener()));
                int i147 = f56956k;
                int i148 = (-2) - (((i147 ^ 112) + ((i147 & 112) << 1)) ^ (-1));
                f56957l = i148 % 128;
                if (i148 % 2 != 0) {
                    return onFocusChangeListener3;
                }
                int i149 = 11 / 0;
                return onFocusChangeListener3;
            default:
                lj ljVar17 = (lj) objArr[0];
                kz kzVar14 = (kz) objArr[1];
                setTextKeepState settextkeepstate17 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
                int i150 = f56956k;
                int i151 = i150 & 37;
                int i152 = -(-((i150 ^ 37) | i151));
                int i153 = ((i151 | i152) << 1) - (i151 ^ i152);
                f56957l = i153 % 128;
                int i154 = i153 % 2;
                Intrinsics.checkNotNullParameter(kzVar14, "");
                Intrinsics.checkNotNullParameter(settextkeepstate17, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                fkVar = (fk) setY(new Object[]{ljVar17, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, kzVar14, settextkeepstate17, valueQualifier2, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), setcontentcapturesession}, -418414679, 418414684, System.identityHashCode(ljVar17));
                int i155 = f56956k;
                int i156 = i155 & 93;
                int i157 = (((i155 ^ 93) | i156) << 1) - ((i155 | 93) & (~i156));
                f56957l = i157 % 128;
                if (i157 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk a_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1578242790, 1578242797, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk b_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 32434076, -32434068, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1079988604, -1079988587, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 89113508, -89113505, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1010551545, -1010551539, System.identityHashCode(this));
    }

    @NotNull
    public final fk setX(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setTransitionVisibility settransitionvisibility, @Nullable TransactionProcessingResult transactionProcessingResult) {
        return (fk) setY(new Object[]{this, kzVar, settextkeepstate, activatesession, fdVar, settransitionvisibility, transactionProcessingResult}, -288454242, 288454243, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ez
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @Nullable j jVar, @Nullable f fVar, @Nullable l lVar, @Nullable getBeepOnFailure getbeeponfailure) {
        return (String) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure}, 1628850153, -1628850143, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, 418631635, -418631633, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, kzVar, settextkeepstate}, -217066977, 217066991, System.identityHashCode(this));
    }

    @NotNull
    public final fk setX(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, kzVar, settextkeepstate}, -370236199, 370236211, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setY(new Object[]{this, kzVar, settextkeepstate}, 1034894913, -1034894900, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull ValueQualifier valueQualifier, @NotNull setContentCaptureSession setcontentcapturesession) {
        return (fk) setY(new Object[]{this, kzVar, settextkeepstate, valueQualifier, setcontentcapturesession}, -2078230956, 2078230956, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/lj$setCompoundDrawableTintBlendMode;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56958a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56959b = 1;

        public setCompoundDrawableTintBlendMode() {
        }

        public /* synthetic */ setCompoundDrawableTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode() {
            return (byte[]) setDividerPadding(new Object[0], -1372316313, 1372316316, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
            int i17 = ~(i15 | i12);
            int i18 = ~i12;
            int i19 = (((~(i13 | i11)) | (~(i18 | i13)) | (~(i10 | i14 | i12))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16;
            if (i19 == 1) {
                int i20 = f56958a;
                int i21 = i20 ^ 13;
                int i22 = ((((i20 & 13) | i21) << 1) - (~(-i21))) - 1;
                f56959b = i22 % 128;
                int i23 = i22 % 2;
                byte[] bArr2 = (byte[]) setDividerPadding(new Object[0], 1009432144, -1009432144, (int) System.currentTimeMillis());
                int i24 = f56958a;
                int i25 = (i24 & 103) + (i24 | 103);
                f56959b = i25 % 128;
                if (i25 % 2 != 0) {
                    return bArr2;
                }
                throw null;
            }
            if (i19 == 2) {
                int i26 = f56958a;
                int i27 = (i26 | 85) << 1;
                int i28 = -(i26 ^ 85);
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = i29 % 128;
                f56959b = i30;
                if (i29 % 2 == 0) {
                    byte[] bArr3 = new byte[5];
                    bArr3[1] = 1;
                    bArr3[1] = 0;
                    bArr3[2] = 3;
                    bArr = bArr3;
                } else {
                    bArr = new byte[]{0, 0, 3};
                }
                int i31 = (i30 ^ 57) + ((i30 & 57) << 1);
                f56958a = i31 % 128;
                int i32 = i31 % 2;
                return bArr;
            }
            if (i19 == 3) {
                int i33 = f56959b;
                int i34 = i33 & 81;
                int i35 = ((i33 ^ 81) | i34) << 1;
                int i36 = -((i33 | 81) & (~i34));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f56958a = i37 % 128;
                int i38 = i37 % 2;
                byte[] bArr4 = (byte[]) setDividerPadding(new Object[0], -12466394, 12466396, (int) System.currentTimeMillis());
                int i39 = f56959b;
                int i40 = (i39 & (-120)) | ((~i39) & 119);
                int i41 = -(-((i39 & 119) << 1));
                int i42 = (i40 & i41) + (i41 | i40);
                f56958a = i42 % 128;
                int i43 = i42 % 2;
                return bArr4;
            }
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i44 = ~iCurrentTimeMillis;
            int i45 = 1671641527 & i44;
            int i46 = (~i45) & (1671641527 | i44);
            int i47 = ~((i45 & i46) | (i46 ^ i45));
            int i48 = -(-(((i47 & 834032233) | (834032233 ^ i47)) * (-602)));
            int i49 = (((~i48) & (-1914304957)) | (1914304956 & i48)) + ((i48 & (-1914304957)) << 1);
            int i50 = 1671641527 & iCurrentTimeMillis;
            int i51 = (1671641527 | iCurrentTimeMillis) & (~i50);
            int i52 = ~((i51 & i50) | (i51 ^ i50));
            int i53 = (i52 & 269763144) | (269763144 ^ i52);
            int i54 = (i44 & (-1671641528)) | (i44 ^ (-1671641528));
            int i55 = i54 & 834032233;
            int i56 = ~(((i54 | 834032233) & (~i55)) | i55);
            int i57 = i53 & i56;
            int i58 = (i56 | i53) & (~i57);
            int i59 = ((i58 & i57) | (i58 ^ i57)) * (-301);
            int i60 = (i49 & i59) + (i59 | i49);
            int i61 = ~iCurrentTimeMillis;
            int i62 = (i61 & 834032233) | (i61 ^ 834032233);
            int i63 = -(~(((i62 | (~i62)) & (~i62)) * 301));
            int i64 = ((-1) << 1) - ((((i60 | i63) << 1) - (i63 ^ i60)) ^ (-1));
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i65 = (~((758055377 ^ iCurrentTimeMillis2) | (758055377 & iCurrentTimeMillis2))) * TypedValues.CycleType.TYPE_EASING;
            int i66 = (1435077106 ^ i65) + ((i65 & 1435077106) << 1);
            int i67 = ((i66 | (-881973724)) << 1) - (((-881973724) & (~i66)) | (881973723 & i66));
            int i68 = ~iCurrentTimeMillis2;
            int i69 = ((-758055378) & i68) | ((~i68) & 758055377);
            int i70 = i68 & 758055377;
            int i71 = (i70 & i69) | (i69 ^ i70);
            int i72 = (i71 | (~i71)) & (~i71);
            int i73 = 673316929 & i72;
            int i74 = (i72 | 673316929) & (~i73);
            int i75 = ((i74 & i73) | (i74 ^ i73)) * TypedValues.CycleType.TYPE_EASING;
            int i76 = i67 & i75;
            int i77 = -(-((i75 ^ i67) | i76));
            if (i64 <= ((i76 | i77) << 1) - (i77 ^ i76)) {
                return new byte[]{0, 0, 0};
            }
            byte[] bArr5 = {0, 1, 0};
            bArr5[1] = 0;
            bArr5[3] = 0;
            return bArr5;
        }

        public static final /* synthetic */ byte[] setDividerPadding() {
            return (byte[]) setDividerPadding(new Object[0], 966829652, -966829651, (int) System.currentTimeMillis());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setY(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, -1646771437, 1646771441, System.identityHashCode(this));
    }

    public final void setY(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate) throws Exception {
        setY(new Object[]{this, kzVar, settextkeepstate}, -824146023, 824146039, System.identityHashCode(this));
    }
}
