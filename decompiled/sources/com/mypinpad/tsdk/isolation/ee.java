package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J?\u0010\u000b\u001a\u0004\u0018\u00010\f\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J/\u0010\u001a\u001a\u00020\u001b\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u001dJ'\u0010\u001e\u001a\u00020\u001f\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u0002H\rH\u0002¢\u0006\u0002\u0010 J\"\u0010!\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001bH\u0002JE\u0010#\u001a\u00020\u001f\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010)J=\u0010*\u001a\u0004\u0018\u00010\f\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\u0006\u0010+\u001a\u00020,¢\u0006\u0002\u0010-JG\u0010*\u001a\u0004\u0018\u00010\f\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010.J&\u0010/\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J&\u00106\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\u0016\u00107\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00108\u001a\u000209J\u0016\u0010:\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020'J&\u0010<\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020,JC\u0010B\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0006\u0012\u0004\u0018\u00010\f0C\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013¢\u0006\u0002\u0010EJ?\u0010F\u001a\u00020,\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u0002H\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0002\u0010GJ\"\u0010H\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010I\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010J\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001e\u0010K\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u0010L\u001a\u00020MJ\u001e\u0010N\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u0010L\u001a\u00020MR\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006O"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingState;", "", "()V", "ARC_OFFLINE_DECLINE", "", "getARC_OFFLINE_DECLINE", "()[B", "cvmCodeToKernelCvm", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelCvm;", "cvmCode", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CvmCode;", "cvmProcessing", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;", "database", "kernelQueue", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;", "outcomeProcessor", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;", "processingStateCallback", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;)Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "cvmProcessingFailed", "cvmRule", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CardHolderVerificationRule;", "cvmProcessingPartB", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CvmResult;", "rule", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CardHolderVerificationRule;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;)Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CvmResult;", "cvmProcessingPartT", "", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CardHolderVerificationRule;Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;)V", "cvmProcessingSuccessful", "result", "cvmRulesProcessing", "cvmRules", "", "amountX", "", "amountY", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Ljava/util/List;JJLcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;)V", "doCardholderVerification", "cvmRequired", "", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;Z)Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;ZLcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;)Lcom/mypinpad/softpos/emv/terminal/kernel/common/stateengine/model/KernelSignal;", "doFirstGenAcRequest", "cardProcessor", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/CardProcessor;", "acType", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/AcTypeEnum;", "odaMethodType", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/data/OdaMethodType;", "doGenAcRequest", "doProcessingRestrictions", "dateProvider", "Lcom/mypinpad/softpos/emv/terminal/common/utils/DateProviderInternal;", "doTerminalActionAnalysis", "tacDenial", "doTerminalRiskManagement", "cardExceptionManager", "Lcom/mypinpad/softpos/emv/terminal/card/cardexception/CardExceptionManager;", "processingIndicators", "Lcom/mypinpad/softpos/emv/terminal/entrypoint/state/preprocessing/model/EntryPointPreProcessingIndicators;", "checkAipFlag", "getCvmListTag", "Lkotlin/Pair;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CARDHOLDER_VERIFICATION_METHOD_CVM_LIST_8E_KRN_VALUE;", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/KernelQ;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/outcome/GenericEmvOutcomeProcessor;)Lkotlin/Pair;", "isCvmConditionRulesSatisfied", "(Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/smarttag/tag/cvm/CardHolderVerificationRule;Lcom/mypinpad/softpos/emv/terminal/kernel/common/database/KernelDatabase;Lcom/mypinpad/softpos/emv/terminal/kernel/common/state/ProcessingStateCallback;JJ)Z", "performCvm", "reportMissingCvmList", "reportNoCvmPerformed", "sendFirstGenAcRequest", "genAcReferenceControlParameter", "Lcom/mypinpad/softpos/emv/terminal/card/cardprocessor/model/request/emv/GenAcReferenceControlParameter;", "sendSecondGenAcRequest", "common"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55350a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55351b = 1;

    @NotNull
    public static final ee setDividerPadding = new ee();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/dc;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55352p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55353q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55354r0 = 1;

        static {
            int i10 = f55354r0;
            int i11 = (i10 & (-38)) | ((~i10) & 37);
            int i12 = -(-((i10 & 37) << 1));
            int i13 = (i11 & i12) + (i12 | i11);
            f55353q0 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-929)) + (i10 * (-464));
            int i14 = ~i10;
            int i15 = i11 | i12;
            if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 != 1) {
                dc dcVar = (dc) objArr[1];
                int i16 = f55353q0;
                int i17 = i16 & 31;
                int i18 = -(-((i16 ^ 31) | i17));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f55354r0 = i19 % 128;
                if (i19 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(dcVar, "");
                    dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
                } else {
                    Intrinsics.checkNotNullParameter(dcVar, "");
                    dc.setDividerPadding(new Object[]{dcVar, Boolean.FALSE}, 1763882755, -1763882755, System.identityHashCode(dcVar));
                }
                int i20 = f55353q0;
                int i21 = (i20 ^ 67) + ((i20 & 67) << 1);
                f55354r0 = i21 % 128;
                int i22 = i21 % 2;
                return null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i23 = f55354r0;
            int i24 = ((i23 | 81) << 1) - (i23 ^ 81);
            f55353q0 = i24 % 128;
            dc dcVar2 = (dc) obj;
            Object[] objArr2 = new Object[2];
            if (i24 % 2 == 0) {
                objArr2[0] = aVar;
                objArr2[1] = dcVar2;
                a(objArr2, 1757474402, -1757474402, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            objArr2[0] = aVar;
            objArr2[1] = dcVar2;
            a(objArr2, 1757474402, -1757474402, System.identityHashCode(aVar));
            int i25 = 48 / 0;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, -1351651805, 1351651806, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/dc;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/dc;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function1<dc, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f55355p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55356q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55357r0 = 1;

        static {
            int i10 = f55357r0;
            int i11 = i10 & 107;
            int i12 = (i10 | 107) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            f55356q0 = i14 % 128;
            int i15 = i14 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
            int i16 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15 != 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i17 = f55356q0;
                int i18 = (-2) - ((((i17 | 22) << 1) - (i17 ^ 22)) ^ (-1));
                f55357r0 = i18 % 128;
                dc dcVar = (dc) obj;
                Object[] objArr2 = new Object[2];
                if (i18 % 2 != 0) {
                    objArr2[0] = bVar;
                    objArr2[1] = dcVar;
                    a(objArr2, 978157783, -978157782, System.identityHashCode(bVar));
                    return Unit.INSTANCE;
                }
                objArr2[0] = bVar;
                objArr2[1] = dcVar;
                a(objArr2, 978157783, -978157782, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            dc dcVar2 = (dc) objArr[1];
            int i19 = f55357r0;
            int i20 = i19 & 71;
            int i21 = -(-((i19 ^ 71) | i20));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f55356q0 = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(dcVar2, "");
            dc.setDividerPadding(new Object[]{dcVar2}, 1266704093, -1266704091, System.identityHashCode(dcVar2));
            int i24 = f55357r0;
            int i25 = i24 ^ 111;
            int i26 = ((i24 & 111) | i25) << 1;
            int i27 = -i25;
            int i28 = (i26 & i27) + (i26 | i27);
            f55356q0 = i28 % 128;
            if (i28 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(dc dcVar) {
            return a(new Object[]{this, dcVar}, -1888888358, 1888888358, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f55358p0 = new c();

        static {
            int i10 = (-1) - (~(-(-109)));
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }

        public c() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-755)) + (i10 * (-755));
            int i14 = ~((~i10) | (~i11));
            int i15 = i10 | i11;
            if (((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13 == 1) {
                c cVar = (c) objArr[0];
                a(new Object[]{cVar, (cv) objArr[1]}, 402807963, -402807963, System.identityHashCode(cVar));
                return Unit.INSTANCE;
            }
            cv cvVar = (cv) objArr[1];
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 1905901999, -1905901998, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f55359p0 = new d();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55360q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55361r0 = 1;

        static {
            int i10 = f55361r0 + 107;
            f55360q0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 75 / 0;
            }
        }

        public d() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            if ((((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167)) != 1) {
                cv cvVar = (cv) objArr[1];
                int i15 = f55360q0;
                int i16 = (i15 & 27) + (i15 | 27);
                f55361r0 = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1881163515, 1881163517, System.identityHashCode(cvVar));
                int i18 = (-2) - ((f55360q0 + 72) ^ (-1));
                f55361r0 = i18 % 128;
                int i19 = i18 % 2;
                return null;
            }
            d dVar = (d) objArr[0];
            Object obj = objArr[1];
            int i20 = f55360q0;
            int i21 = i20 & 71;
            int i22 = (i20 | 71) & (~i21);
            int i23 = i21 << 1;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            f55361r0 = i24 % 128;
            int i25 = i24 % 2;
            a(new Object[]{dVar, (cv) obj}, 1184554095, -1184554095, System.identityHashCode(dVar));
            Unit unit = Unit.INSTANCE;
            int i26 = f55361r0;
            int i27 = (((i26 ^ 67) | (i26 & 67)) << 1) - (((~i26) & 67) | (i26 & (-68)));
            f55360q0 = i27 % 128;
            if (i27 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 2129472226, -2129472225, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setY", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class e extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f55362s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f55363t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setFontFeatureSettings f55364p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f55365q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ component10 f55366r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(setFontFeatureSettings setfontfeaturesettings, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, component10 component10Var) {
            super(1);
            this.f55364p0 = setfontfeaturesettings;
            this.f55365q0 = setscrollbardefaultdelaybeforefade;
            this.f55366r0 = component10Var;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Exception {
            String str;
            int i13 = ~i10;
            int i14 = (((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303);
            Unit unit = null;
            if (i14 != 1) {
                e eVar = (e) objArr[0];
                cv cvVar = (cv) objArr[1];
                int i15 = f55362s0;
                int i16 = (-2) - (((i15 & 70) + (i15 | 70)) ^ (-1));
                f55363t0 = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                setFontFeatureSettings setfontfeaturesettings = eVar.f55364p0;
                if (((Boolean) setFontFeatureSettings.setCompoundDrawableTintBlendMode(new Object[]{setfontfeaturesettings}, 1612421959, -1612421951, System.identityHashCode(setfontfeaturesettings))).booleanValue()) {
                    int i18 = f55363t0;
                    int i19 = i18 ^ 15;
                    int i20 = ((i18 & 15) | i19) << 1;
                    int i21 = -i19;
                    int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                    f55362s0 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cv.setDividerPadding(new Object[]{cvVar, Boolean.FALSE}, 1715041445, -1715041445, System.identityHashCode(cvVar));
                    } else {
                        cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, 1715041445, -1715041445, System.identityHashCode(cvVar));
                    }
                    int i23 = f55363t0;
                    int i24 = (i23 & 24) + (24 | i23);
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    f55362s0 = i25 % 128;
                    int i26 = i25 % 2;
                }
                byte[] imageResource = eVar.f55365q0.setImageResource();
                if (imageResource == null) {
                    int i27 = f55363t0;
                    int i28 = (i27 & 51) + (i27 | 51);
                    f55362s0 = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i27 & 59;
                    int i31 = (i30 - (~(-(-((i27 ^ 59) | i30))))) - 1;
                    f55362s0 = i31 % 128;
                    int i32 = i31 % 2;
                    str = null;
                } else {
                    str = (String) setInputExtras.setDividerPadding(new Object[]{imageResource}, 1609250238, -1609250236, (int) System.currentTimeMillis());
                    int i33 = f55362s0;
                    int i34 = i33 & 5;
                    int i35 = ((i33 | 5) & (~i34)) + (i34 << 1);
                    f55363t0 = i35 % 128;
                    int i36 = i35 % 2;
                }
                if (!(!((Boolean) component10.setDividerPadding.setY(new Object[]{eVar.f55366r0, str}, -845226674, 845226674, (int) System.currentTimeMillis())).booleanValue())) {
                    int i37 = f55363t0;
                    int i38 = i37 & 57;
                    int i39 = ((i37 ^ 57) | i38) << 1;
                    int i40 = -((i37 | 57) & (~i38));
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    f55362s0 = i41 % 128;
                    int i42 = i41 % 2;
                    cv.setDividerPadding(new Object[]{cvVar}, 310720593, -310720570, System.identityHashCode(cvVar));
                    int i43 = f55363t0;
                    int i44 = (i43 & 97) + (i43 | 97);
                    f55362s0 = i44 % 128;
                    int i45 = i44 % 2;
                }
                int i46 = f55362s0 + 41;
                f55363t0 = i46 % 128;
                int i47 = i46 % 2;
            } else {
                e eVar2 = (e) objArr[0];
                Object obj = objArr[1];
                int i48 = f55362s0 + 41;
                f55363t0 = i48 % 128;
                cv cvVar2 = (cv) obj;
                if (i48 % 2 == 0) {
                    a(new Object[]{eVar2, cvVar2}, 1254664024, -1254664024, System.identityHashCode(eVar2));
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{eVar2, cvVar2}, 1254664024, -1254664024, System.identityHashCode(eVar2));
                unit = Unit.INSTANCE;
                int i49 = f55362s0;
                int i50 = i49 & 9;
                int i51 = i50 + ((i49 ^ 9) | i50);
                f55363t0 = i51 % 128;
                if (i51 % 2 == 0) {
                    int i52 = 24 / 0;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1384928852, 1384928853, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class f extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55367r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f55368s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ setScrollBarDefaultDelayBeforeFade f55369p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ setContentDescription f55370q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setContentDescription setcontentdescription) {
            super(1);
            this.f55369p0 = setscrollbardefaultdelaybeforefade;
            this.f55370q0 = setcontentdescription;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x01b6  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303) == 1) {
                f fVar = (f) objArr[0];
                Object obj = objArr[1];
                int i14 = f55368s0;
                int i15 = ((i14 & (-10)) | ((~i14) & 9)) + ((i14 & 9) << 1);
                f55367r0 = i15 % 128;
                int i16 = i15 % 2;
                a(new Object[]{fVar, (cv) obj}, -1381976999, 1381976999, System.identityHashCode(fVar));
                Unit unit = Unit.INSTANCE;
                int i17 = f55367r0;
                int i18 = (i17 & 91) + (i17 | 91);
                f55368s0 = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            }
            f fVar2 = (f) objArr[0];
            cv cvVar = (cv) objArr[1];
            int i20 = f55367r0;
            int i21 = i20 & 93;
            int i22 = -(-((i20 ^ 93) | i21));
            int i23 = (i21 & i22) + (i22 | i21);
            f55368s0 = i23 % 128;
            if (i23 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cvVar, "");
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = fVar2.f55369p0;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis());
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(cvVar, "");
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = fVar2.f55369p0;
            setAnimation setanimation2 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis());
            boolean zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade2))).booleanValue();
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = fVar2.f55369p0;
            if (zBooleanValue && (!Arrays.equals((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (TransactionFailed) setAnimation.setY(new Object[0], 840618122, -840618073, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade3)), (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (TransactionFailed) setAnimation.setY(new Object[0], 567755471, -567755289, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(setscrollbardefaultdelaybeforefade3))))) {
                int i24 = f55367r0;
                int i25 = (i24 ^ 29) + ((i24 & 29) << 1);
                f55368s0 = i25 % 128;
                int i26 = i25 % 2;
                cv.setDividerPadding(new Object[]{cvVar}, 199649391, -199649372, System.identityHashCode(cvVar));
                int i27 = f55367r0;
                int i28 = i27 & 101;
                int i29 = ((i27 ^ 101) | i28) << 1;
                int i30 = -((i27 | 101) & (~i28));
                int i31 = (i29 & i30) + (i30 | i29);
                f55368s0 = i31 % 128;
                int i32 = i31 % 2;
            }
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2023104344, -2023104064, (int) System.currentTimeMillis());
            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, -203580470, 203580510, System.identityHashCode(setscrollbardefaultdelaybeforefade3))).booleanValue()) {
                int i33 = f55368s0 + 55;
                f55367r0 = i33 % 128;
                if (i33 % 2 != 0) {
                    TransactionFailed transactionFailedTerminalSessionDefaultImpls = setAnimation.TerminalSessionDefaultImpls();
                    int i34 = 36 / 0;
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{transactionFailedTerminalSessionDefaultImpls}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTerminalSessionDefaultImpls))}, -203580470, 203580510, System.identityHashCode(setscrollbardefaultdelaybeforefade3))).booleanValue()) {
                        mf mfVar = mf.INSTANCE;
                        if (!((Boolean) mf.setX(new Object[]{setscrollbardefaultdelaybeforefade3}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue()) {
                        }
                    }
                } else {
                    TransactionFailed transactionFailedTerminalSessionDefaultImpls2 = setAnimation.TerminalSessionDefaultImpls();
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{transactionFailedTerminalSessionDefaultImpls2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTerminalSessionDefaultImpls2))}, -203580470, 203580510, System.identityHashCode(setscrollbardefaultdelaybeforefade3))).booleanValue()) {
                        mf mfVar2 = mf.INSTANCE;
                        if (!((Boolean) mf.setX(new Object[]{setscrollbardefaultdelaybeforefade3}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue()) {
                        }
                    }
                }
                cv.setDividerPadding(new Object[]{cvVar}, 234919463, -234919436, System.identityHashCode(cvVar));
                int i35 = f55367r0;
                int i36 = i35 & 87;
                int i37 = -(-((i35 ^ 87) | i36));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f55368s0 = i38 % 128;
                int i39 = i38 % 2;
            } else {
                cv.setDividerPadding(new Object[]{cvVar}, 234919463, -234919436, System.identityHashCode(cvVar));
                int i310 = f55367r0;
                int i311 = i310 & 87;
                int i312 = -(-((i310 ^ 87) | i311));
                int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                f55368s0 = i313 % 128;
                int i314 = i313 % 2;
            }
            TransactionCompleted compoundDrawableTintBlendMode = fVar2.f55370q0.setCompoundDrawableTintBlendMode();
            TransactionFailed suppressed = setAnimation.getSuppressed();
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{suppressed}, 1914607362, -1914607356, System.identityHashCode(suppressed))}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade3))).booleanValue()) {
                al alVar = new al(setscrollbardefaultdelaybeforefade3);
                ai aiVar = (ai) ((setImageTintList) w.setX(new Object[]{alVar}, 1693919772, -1693919769, System.identityHashCode(alVar)));
                TransactionCompleted transactionCompleted = (TransactionCompleted) ai.setDividerPadding(new Object[]{aiVar}, 1408442774, -1408442774, System.identityHashCode(aiVar));
                if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted))).intValue() > 0) {
                    int i40 = f55367r0;
                    int i41 = (((i40 | 90) << 1) - (i40 ^ 90)) - 1;
                    f55368s0 = i41 % 128;
                    if (i41 % 2 == 0) {
                        cv.setDividerPadding(new Object[]{cvVar}, 411204828, -411204817, System.identityHashCode(cvVar));
                        throw null;
                    }
                    cv.setDividerPadding(new Object[]{cvVar}, 411204828, -411204817, System.identityHashCode(cvVar));
                }
            }
            ak akVar = new ak(setscrollbardefaultdelaybeforefade3);
            aj ajVar = (aj) ((setImageTintList) w.setX(new Object[]{akVar}, 1693919772, -1693919769, System.identityHashCode(akVar)));
            TransactionCompleted transactionCompleted2 = (TransactionCompleted) aj.setY(new Object[]{ajVar}, 919185106, -919185106, System.identityHashCode(ajVar));
            if (((Integer) TransactionCompleted.setX(new Object[]{transactionCompleted2, compoundDrawableTintBlendMode}, -354590257, 354590260, System.identityHashCode(transactionCompleted2))).intValue() < 0) {
                int i42 = f55367r0;
                int i43 = i42 & 107;
                int i44 = ((((i42 ^ 107) | i43) << 1) - (~(-((i42 | 107) & (~i43))))) - 1;
                f55368s0 = i44 % 128;
                if (i44 % 2 == 0) {
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1217412403, 1217412419, System.identityHashCode(cvVar));
                } else {
                    cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -1217412403, 1217412419, System.identityHashCode(cvVar));
                }
                int i45 = f55368s0;
                int i46 = (((i45 ^ 95) | (i45 & 95)) << 1) - (((~i45) & 95) | (i45 & (-96)));
                f55367r0 = i46 % 128;
                int i47 = i46 % 2;
            }
            int i48 = f55368s0;
            int i49 = ((((i48 ^ 51) | (i48 & 51)) << 1) - (~(-(((~i48) & 51) | (i48 & (-52)))))) - 1;
            f55367r0 = i49 % 128;
            int i50 = i49 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, 180968140, -180968139, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[by.valuesCustom().length];
            iArr[by.ENCIPHERED_PIN_VERIFIED_ONLINE.ordinal()] = 1;
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 2;
            iArr[by.PLAINTEXT_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 3;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC.ordinal()] = 4;
            iArr[by.ENCIPHERED_PIN_VERIFICATION_PERFORMED_BY_ICC_AND_SIGNATURE_PAPER.ordinal()] = 5;
            iArr[by.SIGNATURE_PAPER.ordinal()] = 6;
            iArr[by.NO_CVM_REQUIRED.ordinal()] = 7;
            iArr[by.FAIL_CVM_PROCESSING.ordinal()] = 8;
            iArr[by.RFU.ordinal()] = 9;
            iArr[by.UNRECOGNISED_CVM.ordinal()] = 10;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = 59 % 128;
            if (59 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f55351b + 116;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f55350a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ fk a(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getValue getvalue = (getValue) objArr[1];
        setEms setems = (setEms) objArr[2];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setems, "");
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{20018, setems, 4}, 1336485880, -1336485874, 20018);
        ba baVar = new ba(setscrollbardefaultdelaybeforefade);
        az azVar = (az) ((setImageTintList) w.setX(new Object[]{baVar}, 1693919772, -1693919769, System.identityHashCode(baVar)));
        byte[] bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (List) az.setOnFocusChangeListener(new Object[]{azVar}, 1527997756, -1527997756, System.identityHashCode(azVar)), Boolean.TRUE}, 1486465621, -1486465589, (int) System.currentTimeMillis());
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr}, 740692591, -740692564, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        Unit unit = Unit.INSTANCE;
        getvalue.setOnFocusChangeListener(new initsdk_android_release(bArr, setems));
        fk fkVar = fk.setAlwaysDrawnWithCacheEnabled;
        int i10 = f55350a;
        int i11 = ((i10 | 111) << 1) - (i10 ^ 111);
        f55351b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 54 / 0;
        }
        return fkVar;
    }

    public static /* synthetic */ ce b(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        ca caVar = (ca) objArr[1];
        eg egVar = (eg) objArr[2];
        int i10 = f55351b;
        int i11 = i10 & 1;
        int i12 = i11 + ((i10 ^ 1) | i11);
        f55350a = i12 % 128;
        int i13 = i12 % 2;
        ce ceVar = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, (by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar)), egVar}, -784720262, 784720267, (int) System.currentTimeMillis());
        if (ceVar != ce.setDividerPadding) {
            int i14 = f55351b;
            int i15 = (((i14 & (-6)) | ((~i14) & 5)) - (~((i14 & 5) << 1))) - 1;
            f55350a = i15 % 128;
            int i16 = i15 % 2;
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (setTransitionVisibility) setOnFocusChangeListener(new Object[]{(by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))}, 1809764594, -1809764584, (int) System.currentTimeMillis())}, -1167051031, 1167051073, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i17 = f55351b;
            int i18 = ((i17 ^ 18) + ((i17 & 18) << 1)) - 1;
            f55350a = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = f55350a;
        int i21 = (i20 ^ 21) + ((i20 & 21) << 1);
        f55351b = i21 % 128;
        if (i21 % 2 != 0) {
            return ceVar;
        }
        throw null;
    }

    public static Pair c(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        ew ewVar = (ew) objArr[3];
        int i10 = f55350a;
        int i11 = i10 & 107;
        int i12 = ((((i10 ^ 107) | i11) << 1) - (~(-((i10 | 107) & (~i11))))) - 1;
        f55351b = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ewVar, "");
        TransactionFailed hint = setAnimation.setHint();
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{hint}, 1914607362, -1914607356, System.identityHashCode(hint))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
            Pair pair = new Pair(null, (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, -1897031283, 1897031285, (int) System.currentTimeMillis()));
            int i14 = f55351b;
            int i15 = i14 ^ 107;
            int i16 = (i14 & 107) << 1;
            int i17 = (i15 & i16) + (i16 | i15);
            f55350a = i17 % 128;
            if (i17 % 2 == 0) {
                return pair;
            }
            throw null;
        }
        bt btVar = new bt(setscrollbardefaultdelaybeforefade);
        bq bqVar = (bq) ((setImageTintList) w.setX(new Object[]{btVar}, 1693919772, -1693919769, System.identityHashCode(btVar)));
        if (!bqVar.setAlwaysDrawnWithCacheEnabled()) {
            cz czVar = new cz(setscrollbardefaultdelaybeforefade);
            Pair pair2 = new Pair(null, ewVar.b_(setscrollbardefaultdelaybeforefade, settextkeepstate));
            int i18 = f55351b;
            int i19 = (i18 ^ 11) + ((i18 & 11) << 1);
            f55350a = i19 % 128;
            int i20 = i19 % 2;
            return pair2;
        }
        if (bqVar.setLayoutAnimation().isEmpty()) {
            Pair pair3 = new Pair(null, (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, -1897031283, 1897031285, (int) System.currentTimeMillis()));
            int i21 = f55350a;
            int i22 = i21 & 59;
            int i23 = (i21 ^ 59) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f55351b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 22 / 0;
            }
            return pair3;
        }
        Pair pair4 = new Pair(bqVar, null);
        int i26 = f55351b;
        int i27 = i26 & 55;
        int i28 = (i26 ^ 55) | i27;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        f55350a = i29 % 128;
        if (i29 % 2 == 0) {
            return pair4;
        }
        throw null;
    }

    public static /* synthetic */ setTransitionVisibility d(Object[] objArr) {
        int i10;
        by byVar = (by) objArr[0];
        int i11 = f55350a;
        int i12 = i11 & 111;
        int i13 = i12 + ((i11 ^ 111) | i12);
        f55351b = i13 % 128;
        int i14 = i13 % 2;
        if (byVar == null) {
            int i15 = ((i11 & 117) - (~(i11 | 117))) - 1;
            f55351b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = i11 + 3;
            f55351b = i17 % 128;
            int i18 = i17 % 2;
            i10 = -1;
        } else {
            i10 = setDividerPadding.setCompoundDrawableTintBlendMode[byVar.ordinal()];
            int i19 = f55350a;
            int i20 = i19 & 27;
            int i21 = i20 + ((i19 ^ 27) | i20);
            f55351b = i21 % 128;
            int i22 = i21 % 2;
        }
        if (i10 == 1) {
            setTransitionVisibility settransitionvisibility = setTransitionVisibility.setY;
            int i23 = f55350a;
            int i24 = (i23 ^ 51) + ((i23 & 51) << 1);
            f55351b = i24 % 128;
            int i25 = i24 % 2;
            return settransitionvisibility;
        }
        if (i10 == 3) {
            setTransitionVisibility settransitionvisibility2 = setTransitionVisibility.setLayoutAnimation;
            int i26 = f55350a;
            int i27 = (i26 ^ 13) + ((i26 & 13) << 1);
            f55351b = i27 % 128;
            int i28 = i27 % 2;
            return settransitionvisibility2;
        }
        if (i10 == 4) {
            setTransitionVisibility settransitionvisibility3 = setTransitionVisibility.getNavBarTitleString;
            int i29 = f55350a;
            int i30 = ((i29 ^ 36) + ((i29 & 36) << 1)) - 1;
            f55351b = i30 % 128;
            int i31 = i30 % 2;
            return settransitionvisibility3;
        }
        if (i10 == 5) {
            setTransitionVisibility settransitionvisibility4 = setTransitionVisibility.setLayoutAnimation;
            int i32 = f55350a;
            int i33 = (((i32 | 106) << 1) - (i32 ^ 106)) - 1;
            f55351b = i33 % 128;
            int i34 = i33 % 2;
            return settransitionvisibility4;
        }
        if (i10 == 6) {
            setTransitionVisibility settransitionvisibility5 = setTransitionVisibility.setX;
            int i35 = f55351b;
            int i36 = (i35 ^ 25) + ((i35 & 25) << 1);
            f55350a = i36 % 128;
            int i37 = i36 % 2;
            return settransitionvisibility5;
        }
        if (i10 != 7) {
            setTransitionVisibility settransitionvisibility6 = setTransitionVisibility.setOnDragListener;
            int i38 = f55351b;
            int i39 = (i38 & 81) + (i38 | 81);
            f55350a = i39 % 128;
            if (i39 % 2 != 0) {
                int i40 = 21 / 0;
            }
            return settransitionvisibility6;
        }
        setTransitionVisibility settransitionvisibility7 = setTransitionVisibility.setOnFocusChangeListener;
        int i41 = f55351b;
        int i42 = ((i41 & 42) + (i41 | 42)) - 1;
        f55350a = i42 % 128;
        if (i42 % 2 == 0) {
            return settransitionvisibility7;
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        ca caVar = (ca) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        int i10 = f55351b;
        int i11 = (i10 ^ 123) + ((i10 & 123) << 1);
        f55350a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = setDividerPadding.setCompoundDrawableTintBlendMode[((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))).ordinal()];
            throw null;
        }
        int i13 = setDividerPadding.setCompoundDrawableTintBlendMode[((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))).ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
            cz czVar = new cz(setscrollbardefaultdelaybeforefade);
            int i14 = f55351b + 87;
            f55350a = i14 % 128;
            int i15 = i14 % 2;
        }
        int i16 = f55351b + 5;
        f55350a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 89 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0267  */
    /* JADX WARN: Code duplicated, block: B:26:0x0279  */
    /* JADX WARN: Code duplicated, block: B:38:0x0316  */
    /* JADX WARN: Code duplicated, block: B:40:0x032f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0331  */
    /* JADX WARN: Code duplicated, block: B:44:0x034d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0381  */
    /* JADX WARN: Code duplicated, block: B:48:0x0392  */
    /* JADX WARN: Code duplicated, block: B:49:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0432  */
    /* JADX WARN: Code duplicated, block: B:59:0x045f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0479  */
    /* JADX WARN: Code duplicated, block: B:65:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:74:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x02a5 A[SYNTHETIC] */
    public static /* synthetic */ void f(Object[] objArr) throws Exception {
        int i10;
        char c10;
        ca caVar;
        Object[] objArr2;
        ce ceVar;
        List list;
        int i11;
        Object[] objArr3;
        int i12;
        int i13;
        int i14;
        ce ceVar2;
        int i15;
        int i16;
        int i17;
        Object[] objArr4;
        Object[] objArr5;
        ee eeVar = (ee) objArr[0];
        int i18 = 1;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        List list2 = (List) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        eg egVar = (eg) objArr[5];
        int iIdentityHashCode = System.identityHashCode(eeVar);
        int i19 = ~iIdentityHashCode;
        int i20 = 971410985 & i19;
        int i21 = (~i20) & (971410985 | i19);
        int i22 = (~((i21 ^ i20) | (i20 & i21))) * 979;
        int i23 = (-640468932) & i22;
        int i24 = (~i23) & (i22 | (-640468932));
        int i25 = -(-(i23 << 1));
        int i26 = (((i24 ^ i25) + ((i24 & i25) << 1)) - (~(-(-(((-466080790) | iIdentityHashCode) * (-979)))))) - 1;
        int i27 = 971410985 & iIdentityHashCode;
        int i28 = (~i27) & (971410985 | iIdentityHashCode);
        int i29 = ~((i28 ^ i27) | (i27 & i28));
        int i30 = (i19 | iIdentityHashCode) & i19;
        int i31 = (466080789 & i30) | ((~i30) & (-466080790));
        int i32 = (-466080790) & i30;
        int i33 = ((~((i32 & i31) | (i31 ^ i32))) | i29) * 979;
        int i34 = i26 & i33;
        int i35 = i34 + ((i33 ^ i26) | i34);
        int iIdentityHashCode2 = System.identityHashCode(eeVar);
        int i36 = 1915637152 & iIdentityHashCode2;
        int i37 = ((~i36) & (1915637152 | iIdentityHashCode2)) | i36;
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = (((-1924062701) ^ i39) | (i39 & (-1924062701))) * (-280);
        int i41 = ((-407871217) & i40) + (i40 | (-407871217));
        int i42 = ~iIdentityHashCode2;
        int i43 = (1915637152 & i42) | (iIdentityHashCode2 & (-1915637153)) | i36;
        int i44 = ~i43;
        int i45 = i44 & (i43 | i44);
        int i46 = (-1118739533) ^ iIdentityHashCode2;
        int i47 = (-1118739533) & iIdentityHashCode2;
        int i48 = ~((i46 ^ i47) | (i46 & i47));
        int i49 = ((i45 ^ i48) | (i45 & i48)) * 140;
        int i50 = ((i41 ^ i49) | (i41 & i49)) << 1;
        int i51 = -((i49 & (~i41)) | ((~i49) & i41));
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        int i53 = (-8425549) ^ iIdentityHashCode2;
        int i54 = (-8425549) & iIdentityHashCode2;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = ~i55;
        int i57 = (i55 | i56) & i56;
        int i58 = (iIdentityHashCode2 | i42) & i42;
        int i59 = 1915637152 ^ i58;
        int i60 = i58 & 1915637152;
        int i61 = (i60 & i59) | (i59 ^ i60);
        int i62 = i61 ^ 1118739532;
        int i63 = i61 & 1118739532;
        int i64 = ~((i63 & i62) | (i62 ^ i63));
        int i65 = ((~i64) & i57) | ((~i57) & i64);
        int i66 = i64 & i57;
        int i67 = (i66 & i65) | (i65 ^ i66);
        int i68 = (-1118739533) & i42;
        int i69 = ((-1118739533) | i42) & (~i68);
        int i70 = (i69 & i68) | (i69 ^ i68);
        int i71 = ~((i70 & (-1915637153)) | (i70 ^ (-1915637153)));
        int i72 = -(-(((i67 & i71) | (i67 ^ i71)) * 140));
        int i73 = i52 & i72;
        if (i35 > (i73 - (~(-(-((i72 ^ i52) | i73))))) - 1) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(egVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(egVar, "");
        int i74 = f55351b;
        int i75 = i74 & 35;
        int i76 = -(-((i74 ^ 35) | i75));
        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
        f55350a = i77 % 128;
        int i78 = i77 % 2;
        ca caVar2 = null;
        ce ceVar3 = null;
        while (true) {
            if (list2.isEmpty() == i18) {
                int i79 = f55351b;
                int i80 = ((i79 | 29) << 1) - (i79 ^ 29);
                f55350a = i80 % 128;
                i10 = 2;
                int i81 = i80 % 2;
                break;
            }
            int i82 = f55350a;
            int i83 = i82 & 101;
            int i84 = -(-((i82 ^ 101) | i83));
            int i85 = (i83 ^ i84) + ((i84 & i83) << i18);
            int i86 = i85 % 128;
            f55351b = i86;
            int i87 = i85 % 2;
            int i88 = i86 ^ 43;
            int i89 = -(-((i86 & 43) << i18));
            int i90 = (i88 ^ i89) + ((i89 & i88) << i18);
            int i91 = i90 % 128;
            f55350a = i91;
            int i92 = i90 % 2;
            int i93 = i91 & 27;
            int i94 = -(-(i91 | 27));
            int i95 = (i93 ^ i94) + ((i94 & i93) << i18);
            f55351b = i95 % 128;
            if (i95 % 2 == 0) {
                c10 = 0;
                ca caVar3 = (ca) list2.remove(0);
                Object[] objArr6 = new Object[i18];
                objArr6[0] = caVar3;
                if (((cb) ca.setOnFocusChangeListener(objArr6, 115119597, -115119594, System.identityHashCode(caVar3))) != cb.IF_TERMINAL_SUPPORTS_THE_CVM) {
                    caVar = caVar3;
                    objArr2 = new Object[i18];
                    objArr2[0] = caVar;
                    if (((cb) ca.setOnFocusChangeListener(objArr2, 115119597, -115119594, System.identityHashCode(caVar))) != cb.ALWAYS) {
                        i15 = f55351b + 87;
                        f55350a = i15 % 128;
                        if (i15 % 2 == 0) {
                            ((Boolean) setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, egVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, 1818798715, -1818798703, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        ceVar = ceVar3;
                        list = list2;
                        if (((Boolean) setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, egVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, 1818798715, -1818798703, (int) System.currentTimeMillis())).booleanValue()) {
                            i11 = 1;
                        } else {
                            int i96 = f55351b;
                            i16 = 1;
                            int i97 = (i96 ^ 37) + ((i96 & 37) << 1);
                            f55350a = i97 % 128;
                            int i98 = i97 % 2;
                            list2 = list;
                            ceVar3 = ceVar;
                            i18 = i16;
                        }
                    } else {
                        ceVar = ceVar3;
                        list = list2;
                        i11 = 1;
                    }
                    objArr3 = new Object[i11];
                    objArr3[0] = caVar;
                    if (((by) ca.setOnFocusChangeListener(objArr3, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                        i12 = f55351b;
                        int i99 = i12 & 57;
                        int i100 = (i12 ^ 57) | i99;
                        i13 = (i99 & i100) + (i99 | i100);
                        f55350a = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        int i101 = i12 | 99;
                        int i102 = i101 << 1;
                        int i103 = -((~(i12 & 99)) & i101);
                        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                        f55350a = i104 % 128;
                        int i105 = i104 % 2;
                        caVar2 = caVar;
                    } else {
                        if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar}, 1425072868, -1425072867, System.identityHashCode(caVar))).booleanValue()) {
                            int i106 = f55350a;
                            int i107 = i106 & 41;
                            int i108 = (i106 | 41) & (~i107);
                            int i109 = -(-(i107 << 1));
                            int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                            f55351b = i110 % 128;
                            int i111 = i110 % 2;
                            if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade}, 547054515, -547054507, System.identityHashCode(caVar))).booleanValue()) {
                                int i112 = f55350a;
                                i14 = (((i112 | 52) << 1) - (i112 ^ 52)) - 1;
                                f55351b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    ceVar2 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                                    int i113 = 4 / 0;
                                } else {
                                    ceVar2 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                                }
                                System.identityHashCode(eeVar);
                                System.identityHashCode(eeVar);
                                ceVar3 = ceVar2;
                                caVar2 = caVar;
                            } else {
                                setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade}, 198559755, -198559744, (int) System.currentTimeMillis());
                                System.identityHashCode(eeVar);
                                System.identityHashCode(eeVar);
                            }
                            if (ceVar3 != null) {
                                int i114 = f55351b;
                                i17 = 1;
                                int i115 = ((((i114 ^ 79) | (i114 & 79)) << 1) - (~(-((79 & (~i114)) | (i114 & (-80)))))) - 1;
                                f55350a = i115 % 128;
                                int i116 = i115 % 2;
                                if (ceVar3 != ce.setDividerPadding) {
                                    int i117 = f55351b;
                                    int i118 = ((i117 | 1) << 1) - (i117 ^ 1);
                                    f55350a = i118 % 128;
                                    int i119 = i118 % 2;
                                    return;
                                }
                            } else {
                                i17 = 1;
                            }
                            objArr4 = new Object[i17];
                            objArr4[0] = caVar;
                            if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                                int i120 = f55350a;
                                int i121 = (i120 & 67) + (i120 | 67);
                                f55351b = i121 % 128;
                                int i122 = i121 % 2;
                                if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                                    list2 = list;
                                    i18 = 1;
                                }
                            }
                        } else {
                            cz czVar = new cz(setscrollbardefaultdelaybeforefade);
                            int i123 = f55350a;
                            int i124 = i123 | 107;
                            int i125 = i124 << 1;
                            int i126 = -((~(i123 & 107)) & i124);
                            int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                            f55351b = i127 % 128;
                            int i128 = i127 % 2;
                        }
                        ceVar3 = ceVar;
                        if (ceVar3 != null) {
                            int i1110 = f55351b;
                            i17 = 1;
                            int i1111 = ((((i1110 ^ 79) | (i1110 & 79)) << 1) - (~(-((79 & (~i1110)) | (i1110 & (-80)))))) - 1;
                            f55350a = i1111 % 128;
                            int i1112 = i1111 % 2;
                            if (ceVar3 != ce.setDividerPadding) {
                                int i1113 = f55351b;
                                int i1114 = ((i1113 | 1) << 1) - (i1113 ^ 1);
                                f55350a = i1114 % 128;
                                int i1115 = i1114 % 2;
                                return;
                            }
                        } else {
                            i17 = 1;
                        }
                        objArr4 = new Object[i17];
                        objArr4[0] = caVar;
                        if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                            int i129 = f55350a;
                            int i1210 = (i129 & 67) + (i129 | 67);
                            f55351b = i1210 % 128;
                            int i1211 = i1210 % 2;
                            if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                                list2 = list;
                                i18 = 1;
                            }
                        }
                    }
                    i10 = 2;
                    break;
                }
                caVar = caVar3;
                objArr5 = new Object[2];
                objArr5[c10] = caVar;
                objArr5[1] = setscrollbardefaultdelaybeforefade;
                if (((Boolean) ca.setOnFocusChangeListener(objArr5, 547054515, -547054507, System.identityHashCode(caVar))).booleanValue()) {
                    int i130 = f55351b;
                    int i131 = ((i130 ^ 61) | (i130 & 61)) << 1;
                    int i132 = -(((~i130) & 61) | (i130 & (-62)));
                    int i133 = (i131 & i132) + (i132 | i131);
                    f55350a = i133 % 128;
                    int i134 = i133 % 2;
                    ce ceVar4 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                    int i135 = f55350a;
                    int i136 = i135 & 15;
                    int i137 = ((i135 ^ 15) | i136) << 1;
                    int i138 = -((i135 | 15) & (~i136));
                    int i139 = (i137 & i138) + (i138 | i137);
                    f55351b = i139 % 128;
                    int i140 = i139 % 2;
                    ceVar3 = ceVar4;
                    list = list2;
                    caVar2 = caVar;
                    if (ceVar3 != null) {
                        int i1116 = f55351b;
                        i17 = 1;
                        int i1117 = ((((i1116 ^ 79) | (i1116 & 79)) << 1) - (~(-((79 & (~i1116)) | (i1116 & (-80)))))) - 1;
                        f55350a = i1117 % 128;
                        int i1118 = i1117 % 2;
                        if (ceVar3 != ce.setDividerPadding) {
                            int i1119 = f55351b;
                            int i11110 = ((i1119 | 1) << 1) - (i1119 ^ 1);
                            f55350a = i11110 % 128;
                            int i11111 = i11110 % 2;
                            return;
                        }
                    } else {
                        i17 = 1;
                    }
                    objArr4 = new Object[i17];
                    objArr4[0] = caVar;
                    if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                        int i1212 = f55350a;
                        int i1213 = (i1212 & 67) + (i1212 | 67);
                        f55351b = i1213 % 128;
                        int i1214 = i1213 % 2;
                        if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                            list2 = list;
                            i18 = 1;
                        }
                    }
                    i10 = 2;
                    break;
                }
                int i141 = (-2) - ((f55350a + 88) ^ (-1));
                f55351b = i141 % 128;
                int i142 = i141 % 2;
                ceVar = ceVar3;
                list = list2;
                i16 = 1;
                list2 = list;
                ceVar3 = ceVar;
                i18 = i16;
            } else {
                c10 = 0;
                caVar = (ca) list2.remove(0);
                Object[] objArr7 = new Object[i18];
                objArr7[0] = caVar;
                if (((cb) ca.setOnFocusChangeListener(objArr7, 115119597, -115119594, System.identityHashCode(caVar))) != cb.IF_TERMINAL_SUPPORTS_THE_CVM) {
                    i18 = 1;
                    objArr2 = new Object[i18];
                    objArr2[0] = caVar;
                    if (((cb) ca.setOnFocusChangeListener(objArr2, 115119597, -115119594, System.identityHashCode(caVar))) != cb.ALWAYS) {
                        i15 = f55351b + 87;
                        f55350a = i15 % 128;
                        if (i15 % 2 == 0) {
                            ((Boolean) setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, egVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, 1818798715, -1818798703, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        ceVar = ceVar3;
                        list = list2;
                        if (((Boolean) setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade, egVar, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, 1818798715, -1818798703, (int) System.currentTimeMillis())).booleanValue()) {
                            i11 = 1;
                        } else {
                            int i910 = f55351b;
                            i16 = 1;
                            int i911 = (i910 ^ 37) + ((i910 & 37) << 1);
                            f55350a = i911 % 128;
                            int i912 = i911 % 2;
                            list2 = list;
                            ceVar3 = ceVar;
                            i18 = i16;
                        }
                    } else {
                        ceVar = ceVar3;
                        list = list2;
                        i11 = 1;
                    }
                    objArr3 = new Object[i11];
                    objArr3[0] = caVar;
                    if (((by) ca.setOnFocusChangeListener(objArr3, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                        i12 = f55351b;
                        int i913 = i12 & 57;
                        int i1010 = (i12 ^ 57) | i913;
                        i13 = (i913 & i1010) + (i913 | i1010);
                        f55350a = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        int i1011 = i12 | 99;
                        int i1012 = i1011 << 1;
                        int i1013 = -((~(i12 & 99)) & i1011);
                        int i1014 = (i1012 ^ i1013) + ((i1013 & i1012) << 1);
                        f55350a = i1014 % 128;
                        int i1015 = i1014 % 2;
                        caVar2 = caVar;
                    } else {
                        if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar}, 1425072868, -1425072867, System.identityHashCode(caVar))).booleanValue()) {
                            int i1016 = f55350a;
                            int i1017 = i1016 & 41;
                            int i1018 = (i1016 | 41) & (~i1017);
                            int i1019 = -(-(i1017 << 1));
                            int i1120 = ((i1018 | i1019) << 1) - (i1018 ^ i1019);
                            f55351b = i1120 % 128;
                            int i1121 = i1120 % 2;
                            if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade}, 547054515, -547054507, System.identityHashCode(caVar))).booleanValue()) {
                                int i1122 = f55350a;
                                i14 = (((i1122 | 52) << 1) - (i1122 ^ 52)) - 1;
                                f55351b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    ceVar2 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                                    int i1123 = 4 / 0;
                                } else {
                                    ceVar2 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                                }
                                System.identityHashCode(eeVar);
                                System.identityHashCode(eeVar);
                                ceVar3 = ceVar2;
                                caVar2 = caVar;
                            } else {
                                setOnFocusChangeListener(new Object[]{caVar, setscrollbardefaultdelaybeforefade}, 198559755, -198559744, (int) System.currentTimeMillis());
                                System.identityHashCode(eeVar);
                                System.identityHashCode(eeVar);
                            }
                            if (ceVar3 != null) {
                                int i11112 = f55351b;
                                i17 = 1;
                                int i11113 = ((((i11112 ^ 79) | (i11112 & 79)) << 1) - (~(-((79 & (~i11112)) | (i11112 & (-80)))))) - 1;
                                f55350a = i11113 % 128;
                                int i11114 = i11113 % 2;
                                if (ceVar3 != ce.setDividerPadding) {
                                    int i11115 = f55351b;
                                    int i11116 = ((i11115 | 1) << 1) - (i11115 ^ 1);
                                    f55350a = i11116 % 128;
                                    int i11117 = i11116 % 2;
                                    return;
                                }
                            } else {
                                i17 = 1;
                            }
                            objArr4 = new Object[i17];
                            objArr4[0] = caVar;
                            if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                                int i1215 = f55350a;
                                int i1216 = (i1215 & 67) + (i1215 | 67);
                                f55351b = i1216 % 128;
                                int i1217 = i1216 % 2;
                                if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                                    list2 = list;
                                    i18 = 1;
                                }
                            }
                        } else {
                            cz czVar2 = new cz(setscrollbardefaultdelaybeforefade);
                            int i1218 = f55350a;
                            int i1219 = i1218 | 107;
                            int i1220 = i1219 << 1;
                            int i1221 = -((~(i1218 & 107)) & i1219);
                            int i1222 = ((i1220 | i1221) << 1) - (i1221 ^ i1220);
                            f55351b = i1222 % 128;
                            int i1223 = i1222 % 2;
                        }
                        ceVar3 = ceVar;
                        if (ceVar3 != null) {
                            int i11118 = f55351b;
                            i17 = 1;
                            int i11119 = ((((i11118 ^ 79) | (i11118 & 79)) << 1) - (~(-((79 & (~i11118)) | (i11118 & (-80)))))) - 1;
                            f55350a = i11119 % 128;
                            int i111110 = i11119 % 2;
                            if (ceVar3 != ce.setDividerPadding) {
                                int i111111 = f55351b;
                                int i111112 = ((i111111 | 1) << 1) - (i111111 ^ 1);
                                f55350a = i111112 % 128;
                                int i111113 = i111112 % 2;
                                return;
                            }
                        } else {
                            i17 = 1;
                        }
                        objArr4 = new Object[i17];
                        objArr4[0] = caVar;
                        if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                            int i12110 = f55350a;
                            int i12111 = (i12110 & 67) + (i12110 | 67);
                            f55351b = i12111 % 128;
                            int i12112 = i12111 % 2;
                            if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                                list2 = list;
                                i18 = 1;
                            }
                        }
                    }
                    i10 = 2;
                    break;
                }
                objArr5 = new Object[2];
                objArr5[c10] = caVar;
                objArr5[1] = setscrollbardefaultdelaybeforefade;
                if (((Boolean) ca.setOnFocusChangeListener(objArr5, 547054515, -547054507, System.identityHashCode(caVar))).booleanValue()) {
                    int i1310 = f55351b;
                    int i1311 = ((i1310 ^ 61) | (i1310 & 61)) << 1;
                    int i1312 = -(((~i1310) & 61) | (i1310 & (-62)));
                    int i1313 = (i1311 & i1312) + (i1312 | i1311);
                    f55350a = i1313 % 128;
                    int i1314 = i1313 % 2;
                    ce ceVar5 = (ce) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, caVar, egVar}, 1584896541, -1584896535, (int) System.currentTimeMillis());
                    int i1315 = f55350a;
                    int i1316 = i1315 & 15;
                    int i1317 = ((i1315 ^ 15) | i1316) << 1;
                    int i1318 = -((i1315 | 15) & (~i1316));
                    int i1319 = (i1317 & i1318) + (i1318 | i1317);
                    f55351b = i1319 % 128;
                    int i143 = i1319 % 2;
                    ceVar3 = ceVar5;
                    list = list2;
                    caVar2 = caVar;
                    if (ceVar3 != null) {
                        int i111114 = f55351b;
                        i17 = 1;
                        int i111115 = ((((i111114 ^ 79) | (i111114 & 79)) << 1) - (~(-((79 & (~i111114)) | (i111114 & (-80)))))) - 1;
                        f55350a = i111115 % 128;
                        int i111116 = i111115 % 2;
                        if (ceVar3 != ce.setDividerPadding) {
                            int i111117 = f55351b;
                            int i111118 = ((i111117 | 1) << 1) - (i111117 ^ 1);
                            f55350a = i111118 % 128;
                            int i111119 = i111118 % 2;
                            return;
                        }
                    } else {
                        i17 = 1;
                    }
                    objArr4 = new Object[i17];
                    objArr4[0] = caVar;
                    if (((cf) ca.setOnFocusChangeListener(objArr4, -943319764, 943319766, System.identityHashCode(caVar))) != cf.setDividerPadding) {
                        int i12113 = f55350a;
                        int i12114 = (i12113 & 67) + (i12113 | 67);
                        f55351b = i12114 % 128;
                        int i12115 = i12114 % 2;
                        if (((by) ca.setOnFocusChangeListener(new Object[]{caVar}, 1299031735, -1299031735, System.identityHashCode(caVar))) == by.FAIL_CVM_PROCESSING) {
                            list2 = list;
                            i18 = 1;
                        }
                    }
                    i10 = 2;
                    break;
                }
                int i144 = (-2) - ((f55350a + 88) ^ (-1));
                f55351b = i144 % 128;
                int i145 = i144 % 2;
                ceVar = ceVar3;
                list = list2;
                i16 = 1;
                list2 = list;
                ceVar3 = ceVar;
                i18 = i16;
            }
        }
        Object[] objArr8 = new Object[i10];
        objArr8[0] = setscrollbardefaultdelaybeforefade;
        objArr8[1] = caVar2;
        int i146 = f55350a;
        int i147 = i146 & 21;
        int i148 = ((((i146 ^ 21) | i147) << 1) - (~(-((i146 | 21) & (~i147))))) - 1;
        f55351b = i148 % 128;
        if (i148 % 2 == 0) {
            int i149 = 4 / 0;
        }
    }

    public static /* synthetic */ fk g(Object[] objArr) {
        ee eeVar = (ee) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        ew ewVar = (ew) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ewVar, "");
        fk fkVar = (fk) setOnFocusChangeListener(new Object[]{eeVar, setscrollbardefaultdelaybeforefade, settextkeepstate, ewVar, Boolean.valueOf(zBooleanValue), new ed()}, 241380943, -241380940, System.identityHashCode(eeVar));
        int i10 = f55351b;
        int i11 = ((i10 ^ 56) + ((i10 & 56) << 1)) - 1;
        f55350a = i11 % 128;
        if (i11 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00c6  */
    public static /* synthetic */ fk h(Object[] objArr) {
        boolean z10;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getValue getvalue = (getValue) objArr[1];
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[2];
        ds dsVar = (ds) objArr[3];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
        Intrinsics.checkNotNullParameter(dsVar, "");
        cz czVar = new cz(setscrollbardefaultdelaybeforefade);
        cv cvVar = (cv) ((setImageTintList) w.setX(new Object[]{czVar}, 1693919772, -1693919769, System.identityHashCode(czVar)));
        boolean zBooleanValue = ((Boolean) cv.setDividerPadding(new Object[]{cvVar}, 1554941971, -1554941959, System.identityHashCode(cvVar))).booleanValue();
        if (dsVar == ds.setY) {
            int i10 = f55351b;
            int i11 = ((i10 | 47) << 1) - (i10 ^ 47);
            f55350a = i11 % 128;
            int i12 = i11 % 2;
            if (zBooleanValue) {
                int i13 = f55351b;
                int i14 = (i13 ^ 62) + ((i13 & 62) << 1);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                f55350a = i15 % 128;
                int i16 = i15 % 2;
                z10 = false;
            } else {
                int i17 = ((i10 | 77) << 1) - (((~i10) & 77) | (i10 & (-78)));
                f55350a = i17 % 128;
                if (i17 % 2 != 0) {
                    setFitsSystemWindows.Companion sety = setFitsSystemWindows.INSTANCE;
                    throw null;
                }
                if (setfitssystemwindows == setFitsSystemWindows.setX) {
                    int i18 = f55351b;
                    int i19 = i18 ^ 93;
                    int i20 = ((((i18 & 93) | i19) << 1) - (~(-i19))) - 1;
                    f55350a = i20 % 128;
                    int i21 = i20 % 2;
                    z10 = true;
                } else {
                    cz czVar2 = new cz(setscrollbardefaultdelaybeforefade);
                    int i22 = f55351b;
                    int i23 = i22 & 19;
                    int i24 = -(-((i22 ^ 19) | i23));
                    int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                    f55350a = i25 % 128;
                    int i26 = i25 % 2;
                    int i110 = f55351b;
                    int i111 = (i110 ^ 62) + ((i110 & 62) << 1);
                    int i112 = (i111 ^ (-1)) + (i111 << 1);
                    f55350a = i112 % 128;
                    int i113 = i112 % 2;
                    z10 = false;
                }
            }
        } else {
            int i114 = f55351b;
            int i115 = (i114 ^ 62) + ((i114 & 62) << 1);
            int i116 = (i115 ^ (-1)) + (i115 << 1);
            f55350a = i116 % 128;
            int i117 = i116 % 2;
            z10 = false;
        }
        fk fkVar = (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, getvalue, new setEms(setfitssystemwindows, z10)}, 1044341421, -1044341412, (int) System.currentTimeMillis());
        int i27 = f55350a;
        int i28 = ((((i27 ^ 61) | (i27 & 61)) << 1) - (~(-(((~i27) & 61) | (i27 & (-62)))))) - 1;
        f55351b = i28 % 128;
        if (i28 % 2 != 0) {
            return fkVar;
        }
        throw null;
    }

    public static /* synthetic */ ce i(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        by byVar = (by) objArr[1];
        eg egVar = (eg) objArr[2];
        int i10 = f55350a;
        int i11 = i10 & 73;
        int i12 = -(-(i10 | 73));
        int i13 = (i11 & i12) + (i12 | i11);
        f55351b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = setDividerPadding.setCompoundDrawableTintBlendMode[byVar.ordinal()];
            throw null;
        }
        switch (setDividerPadding.setCompoundDrawableTintBlendMode[byVar.ordinal()]) {
            case 1:
                if (egVar == null) {
                    new ed().setX(setscrollbardefaultdelaybeforefade);
                    int i15 = f55351b + 5;
                    f55350a = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    egVar.setX(setscrollbardefaultdelaybeforefade);
                    int i17 = f55351b;
                    int i18 = (((i17 ^ 111) | (i17 & 111)) << 1) - (((~i17) & 111) | (i17 & (-112)));
                    f55350a = i18 % 128;
                    int i19 = i18 % 2;
                }
                ce ceVar = ce.setOnFocusChangeListener;
                int i20 = f55350a;
                int i21 = i20 & 11;
                int i22 = i21 + ((i20 ^ 11) | i21);
                f55351b = i22 % 128;
                int i23 = i22 % 2;
                return ceVar;
            case 2:
            case 3:
            case 4:
            case 5:
                cz czVar = new cz(setscrollbardefaultdelaybeforefade);
                ce ceVar2 = ce.setDividerPadding;
                int i24 = f55351b;
                int i25 = ((i24 ^ 17) | (i24 & 17)) << 1;
                int i26 = -(((~i24) & 17) | (i24 & (-18)));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f55350a = i27 % 128;
                if (i27 % 2 == 0) {
                    return ceVar2;
                }
                throw null;
            case 6:
                ce ceVar3 = ce.setOnFocusChangeListener;
                int i28 = f55350a + 65;
                f55351b = i28 % 128;
                int i29 = i28 % 2;
                return ceVar3;
            case 7:
                ce ceVar4 = ce.setX;
                int i30 = f55351b;
                int i31 = i30 & 73;
                int i32 = (i30 | 73) & (~i31);
                int i33 = i31 << 1;
                int i34 = (i32 & i33) + (i32 | i33);
                f55350a = i34 % 128;
                int i35 = i34 % 2;
                return ceVar4;
            case 8:
                ce ceVar5 = ce.setDividerPadding;
                int i36 = f55350a;
                int i37 = (i36 & 41) + (i36 | 41);
                f55351b = i37 % 128;
                if (i37 % 2 != 0) {
                    return ceVar5;
                }
                throw null;
            case 9:
            case 10:
                cz czVar2 = new cz(setscrollbardefaultdelaybeforefade);
                ce ceVar6 = ce.setDividerPadding;
                int i38 = f55351b;
                int i39 = (-2) - (((i38 & 80) + (i38 | 80)) ^ (-1));
                f55350a = i39 % 128;
                int i40 = i39 % 2;
                return ceVar6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ fk j(Object[] objArr) {
        ee eeVar = (ee) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
        ew ewVar = (ew) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        eg egVar = (eg) objArr[5];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ewVar, "");
        Intrinsics.checkNotNullParameter(egVar, "");
        cy cyVar = new cy(setscrollbardefaultdelaybeforefade);
        aq aqVar = new aq(setscrollbardefaultdelaybeforefade);
        am amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
        if (!(!zBooleanValue)) {
            int i10 = f55351b + 86;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            f55350a = i11 % 128;
            int i12 = i11 % 2;
            if (((Boolean) am.setY(new Object[]{amVar}, 27011347, -27011346, System.identityHashCode(amVar))).booleanValue()) {
                int i13 = f55350a;
                int i14 = i13 ^ 85;
                int i15 = (i13 & 85) << 1;
                int i16 = (i14 & i15) + (i15 | i14);
                f55351b = i16 % 128;
                int i17 = i16 % 2;
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20015, null, 6}, 1336485880, -1336485874, 20015);
                fk fkVar = (fk) setOnFocusChangeListener(new Object[]{eeVar, setscrollbardefaultdelaybeforefade, settextkeepstate, ewVar, egVar}, -1472059305, 1472059326, System.identityHashCode(eeVar));
                int i18 = f55351b;
                int i19 = i18 ^ 37;
                int i20 = (i18 & 37) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f55350a = i21 % 128;
                int i22 = i21 % 2;
                return fkVar;
            }
        }
        fk fkVar2 = (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 37285869, -37285853, (int) System.currentTimeMillis());
        int i23 = f55351b;
        int i24 = (((i23 | 76) << 1) - (i23 ^ 76)) - 1;
        f55350a = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 96 / 0;
        }
        return fkVar2;
    }

    @NotNull
    public static fk setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull getValue getvalue, @NotNull setEms setems) {
        return (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, getvalue, setems}, 1044341421, -1044341412, (int) System.currentTimeMillis());
    }

    @NotNull
    public static fk setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull getValue getvalue, @NotNull setEms setems) {
        return (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, getvalue, setems}, -1377407442, 1377407459, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:13:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x055c  */
    /* JADX WARN: Code duplicated, block: B:62:0x057f  */
    /* JADX WARN: Code duplicated, block: B:64:0x05db  */
    /* JADX WARN: Code duplicated, block: B:68:0x0647  */
    /* JADX WARN: Code duplicated, block: B:70:0x0649  */
    /* JADX WARN: Code duplicated, block: B:90:0x077a  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object bytes;
        long jLongValue;
        int i13;
        int i14;
        am amVar;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ((~(i15 | i16)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
        int i18 = ~i12;
        switch ((((~(i10 | i16 | i12)) | (~(i11 | i15 | i18))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i16 | i18)) | (~(i15 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i17) {
            case 1:
                bytes = null;
                f(objArr);
                return bytes;
            case 2:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                cz czVar = new cz(setscrollbardefaultdelaybeforefade);
                fk fkVar = (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade}, 37285869, -37285853, (int) System.currentTimeMillis());
                int i19 = f55350a;
                int i20 = (i19 & 103) + (i19 | 103);
                f55351b = i20 % 128;
                int i21 = i20 % 2;
                return fkVar;
            case 3:
                return j(objArr);
            case 4:
                return c(objArr);
            case 5:
                return i(objArr);
            case 6:
                return b(objArr);
            case 7:
                bytes = null;
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                ca caVar = (ca) objArr[1];
                cz czVar2 = new cz(setscrollbardefaultdelaybeforefade2);
                bs bsVar = new bs(setscrollbardefaultdelaybeforefade2);
                int i22 = f55351b;
                int i23 = i22 & 71;
                int i24 = (i23 - (~((i22 ^ 71) | i23))) - 1;
                f55350a = i24 % 128;
                int i25 = i24 % 2;
                return bytes;
            case 8:
                return g(objArr);
            case 9:
                return a(objArr);
            case 10:
                return d(objArr);
            case 11:
                bytes = null;
                e(objArr);
                return bytes;
            case 12:
                ca caVar2 = (ca) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                eg egVar = (eg) objArr[2];
                long jLongValue2 = ((Number) objArr[3]).longValue();
                long jLongValue3 = ((Number) objArr[4]).longValue();
                int i26 = f55351b;
                int i27 = i26 & 5;
                int i28 = -(-(i26 | 5));
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f55350a = i29 % 128;
                int i30 = i29 % 2;
                if (((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2}, -14328844, 14328848, System.identityHashCode(caVar2))).booleanValue()) {
                    int i31 = f55351b;
                    int i32 = (((i31 | 74) << 1) - (i31 ^ 74)) - 1;
                    f55350a = i32 % 128;
                    int i33 = i32 % 2;
                    if (!((Boolean) ca.setOnFocusChangeListener(new Object[]{caVar2, setscrollbardefaultdelaybeforefade3}, 2074548862, -2074548853, System.identityHashCode(caVar2))).booleanValue()) {
                        int i34 = f55350a + 75;
                        f55351b = i34 % 128;
                        int i35 = i34 % 2;
                        bytes = Boolean.FALSE;
                    } else {
                        int i36 = f55350a + 9;
                        f55351b = i36 % 128;
                        if (i36 % 2 == 0) {
                            egVar.setX(setscrollbardefaultdelaybeforefade3, caVar2, jLongValue2, jLongValue3);
                            throw null;
                        }
                        if (!egVar.setX(setscrollbardefaultdelaybeforefade3, caVar2, jLongValue2, jLongValue3)) {
                            int i37 = f55350a + 75;
                            f55351b = i37 % 128;
                            int i38 = i37 % 2;
                            bytes = Boolean.FALSE;
                        } else {
                            int i39 = f55351b;
                            int i40 = i39 & 111;
                            int i41 = -(-((i39 ^ 111) | i40));
                            int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                            f55350a = i42 % 128;
                            int i43 = i42 % 2;
                            int i44 = (i39 & 81) + (i39 | 81);
                            f55350a = i44 % 128;
                            if (i44 % 2 != 0) {
                                throw null;
                            }
                            bytes = Boolean.TRUE;
                        }
                    }
                } else {
                    int i310 = f55350a + 75;
                    f55351b = i310 % 128;
                    int i311 = i310 % 2;
                    bytes = Boolean.FALSE;
                }
                return bytes;
            case 13:
                ee eeVar = (ee) objArr[0];
                setOnFocusChangeListener(new Object[]{eeVar, (setScrollBarDefaultDelayBeforeFade) objArr[1], (List) objArr[2], Long.valueOf(((Number) objArr[3]).longValue()), Long.valueOf(((Number) objArr[4]).longValue()), new ed()}, 79799379, -79799378, System.identityHashCode(eeVar));
                int i45 = f55350a;
                int i46 = ((i45 ^ 12) + ((i45 & 12) << 1)) - 1;
                f55351b = i46 % 128;
                int i47 = i46 % 2;
                return null;
            case 14:
                return h(objArr);
            case 15:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                long jLongValue4 = ((Number) objArr[1]).longValue();
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20017, null, 6}, 1336485880, -1336485874, 20017);
                cz czVar3 = new cz(setscrollbardefaultdelaybeforefade4);
                long jLongValue5 = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{czVar3}, 252497730, -252497710, System.identityHashCode(czVar3))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
                setAnimation setanimation = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (TransactionFailed) setAnimation.setY(new Object[0], 812392256, -812392155, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                if (getbeeponfailure != null) {
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                    if (bArr == null) {
                        int i48 = f55351b;
                        int i49 = (((i48 | 76) << 1) - (i48 ^ 76)) - 1;
                        f55350a = i49 % 128;
                        int i50 = i49 % 2;
                        int i51 = (-2) - ((((i48 | 14) << 1) - (i48 ^ 14)) ^ (-1));
                        f55350a = i51 % 128;
                        int i52 = i51 % 2;
                    } else {
                        jLongValue = ((Long) setInputExtras.setDividerPadding(new Object[]{bArr}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
                        int i53 = f55350a;
                        int i54 = ((i53 ^ 83) | (i53 & 83)) << 1;
                        int i55 = -(((~i53) & 83) | (i53 & (-84)));
                        int i56 = (i54 & i55) + (i55 | i54);
                        f55351b = i56 % 128;
                        int i57 = i56 % 2;
                    }
                    if (((jLongValue | jLongValue4) & jLongValue5) != 0) {
                        i13 = f55351b + 71;
                        f55350a = i13 % 128;
                        if (i13 % 2 != 0) {
                            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (byte[]) setOnFocusChangeListener(new Object[0], -1329012861, 1329012881, (int) System.currentTimeMillis()), null, Boolean.FALSE, 53}, -976227287, 976227290, 53)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                        } else {
                            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), (byte[]) setOnFocusChangeListener(new Object[0], -1329012861, 1329012881, (int) System.currentTimeMillis()), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                        }
                        bytes = setFitsSystemWindows.setOnFocusChangeListener;
                        int i58 = f55351b;
                        i14 = ((i58 & 59) - (~(i58 | 59))) - 1;
                        f55350a = i14 % 128;
                        if (i14 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        bytes = setFitsSystemWindows.setX;
                        int i59 = f55350a;
                        int i60 = i59 & 83;
                        int i61 = (i59 | 83) & (~i60);
                        int i62 = i60 << 1;
                        int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                        f55351b = i63 % 128;
                        int i64 = i63 % 2;
                    }
                    return bytes;
                }
                int i65 = f55351b;
                int i66 = (i65 & 51) + (i65 | 51);
                int i67 = i66 % 128;
                f55350a = i67;
                int i68 = i66 % 2;
                int i69 = i67 + 80;
                int i70 = (i69 ^ (-1)) + (i69 << 1);
                f55351b = i70 % 128;
                int i71 = i70 % 2;
                jLongValue = 0;
                if (((jLongValue | jLongValue4) & jLongValue5) != 0) {
                    i13 = f55351b + 71;
                    f55350a = i13 % 128;
                    if (i13 % 2 != 0) {
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)), (byte[]) setOnFocusChangeListener(new Object[0], -1329012861, 1329012881, (int) System.currentTimeMillis()), null, Boolean.FALSE, 53}, -976227287, 976227290, 53)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                    } else {
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)), (byte[]) setOnFocusChangeListener(new Object[0], -1329012861, 1329012881, (int) System.currentTimeMillis()), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                    }
                    bytes = setFitsSystemWindows.setOnFocusChangeListener;
                    int i510 = f55351b;
                    i14 = ((i510 & 59) - (~(i510 | 59))) - 1;
                    f55350a = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                } else {
                    bytes = setFitsSystemWindows.setX;
                    int i511 = f55350a;
                    int i610 = i511 & 83;
                    int i611 = (i511 | 83) & (~i610);
                    int i612 = i610 << 1;
                    int i613 = (i611 ^ i612) + ((i611 & i612) << 1);
                    f55351b = i613 % 128;
                    int i614 = i613 % 2;
                }
                return bytes;
            case 16:
                bs bsVar2 = new bs((setScrollBarDefaultDelayBeforeFade) objArr[0]);
                int i72 = f55351b;
                int i73 = i72 & 119;
                int i74 = -(-(i72 | 119));
                int i75 = (i73 & i74) + (i74 | i73);
                f55350a = i75 % 128;
                int i76 = i75 % 2;
                return null;
            case 17:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                getValue getvalue = (getValue) objArr[1];
                setEms setems = (setEms) objArr[2];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade5, "");
                Intrinsics.checkNotNullParameter(getvalue, "");
                Intrinsics.checkNotNullParameter(setems, "");
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20019, setems, 4}, 1336485880, -1336485874, 20019);
                ax axVar = new ax(setscrollbardefaultdelaybeforefade5);
                ay ayVar = (ay) ((setImageTintList) w.setX(new Object[]{axVar}, 1693919772, -1693919769, System.identityHashCode(axVar)));
                byte[] bArr2 = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade5, (List) ay.setY(new Object[]{ayVar}, 1065635798, -1065635798, System.identityHashCode(ayVar)), Boolean.TRUE}, 1486465621, -1486465589, (int) System.currentTimeMillis());
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade5, bArr2}, 740692591, -740692564, System.identityHashCode(setscrollbardefaultdelaybeforefade5));
                Unit unit = Unit.INSTANCE;
                getvalue.setOnFocusChangeListener(new initsdk_android_release(bArr2, setems));
                fk fkVar2 = fk.setImageResource;
                int i77 = f55350a;
                int i78 = ((i77 | 115) << 1) - (i77 ^ 115);
                f55351b = i78 % 128;
                int i79 = i78 % 2;
                return fkVar2;
            case 18:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade6 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                setContentDescription setcontentdescription = (setContentDescription) objArr[1];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade6, "");
                Intrinsics.checkNotNullParameter(setcontentdescription, "");
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20014, null, 6}, 1336485880, -1336485874, 20014);
                cz czVar4 = new cz(setscrollbardefaultdelaybeforefade6);
                int i80 = f55351b;
                int i81 = (i80 ^ 79) + ((i80 & 79) << 1);
                f55350a = i81 % 128;
                if (i81 % 2 != 0) {
                    int i82 = 54 / 0;
                }
                return null;
            case 19:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade7 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                getValue getvalue2 = (getValue) objArr[2];
                setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[3];
                ds dsVar = (ds) objArr[4];
                int i83 = f55351b;
                int i84 = (i83 & 87) + (i83 | 87);
                f55350a = i84 % 128;
                int i85 = i84 % 2;
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade7, "");
                Intrinsics.checkNotNullParameter(getvalue2, "");
                Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
                Intrinsics.checkNotNullParameter(dsVar, "");
                fk fkVar3 = fk.setCompoundDrawablePadding;
                int i86 = f55350a;
                int i87 = (i86 ^ 105) + ((i86 & 105) << 1);
                f55351b = i87 % 128;
                int i88 = i87 % 2;
                return fkVar3;
            case 20:
                int i89 = f55350a;
                int i90 = i89 & 43;
                int i91 = (((i89 | 43) & (~i90)) - (~(i90 << 1))) - 1;
                f55351b = i91 % 128;
                if (i91 % 2 == 0) {
                    bytes = "Z1".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    int i92 = 41 / 0;
                } else {
                    bytes = "Z1".getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                }
                int i93 = f55351b + 31;
                f55350a = i93 % 128;
                if (i93 % 2 != 0) {
                    throw null;
                }
                return bytes;
            case 21:
                ee eeVar2 = (ee) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade8 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                ew ewVar = (ew) objArr[3];
                eg egVar2 = (eg) objArr[4];
                int i94 = (-2) - ((f55350a + 100) ^ (-1));
                f55351b = i94 % 128;
                int i95 = i94 % 2;
                Pair pair = (Pair) setOnFocusChangeListener(new Object[]{eeVar2, setscrollbardefaultdelaybeforefade8, settextkeepstate, ewVar}, 1151690682, -1151690678, System.identityHashCode(eeVar2));
                bq bqVar = (bq) pair.component1();
                fk fkVar4 = (fk) pair.component2();
                if (fkVar4 != null) {
                    int i96 = f55351b;
                    int i97 = (((i96 | 46) << 1) - (i96 ^ 46)) - 1;
                    f55350a = i97 % 128;
                    if (i97 % 2 != 0) {
                        throw null;
                    }
                    int i98 = i96 & 67;
                    int i99 = (((i96 ^ 67) | i98) << 1) - ((i96 | 67) & (~i98));
                    f55350a = i99 % 128;
                    int i100 = i99 % 2;
                    return fkVar4;
                }
                if (bqVar == null) {
                    int i101 = f55350a;
                    int i102 = i101 & 39;
                    int i103 = ((~i102) & (i101 | 39)) + (i102 << 1);
                    f55351b = i103 % 128;
                    if (i103 % 2 == 0) {
                        throw null;
                    }
                    int i104 = (i101 & 107) + (i101 | 107);
                    f55351b = i104 % 128;
                    if (i104 % 2 == 0) {
                        throw null;
                    }
                } else {
                    cy cyVar = new cy(setscrollbardefaultdelaybeforefade8);
                    setOnFocusChangeListener(new Object[]{eeVar2, setscrollbardefaultdelaybeforefade8, CollectionsKt___CollectionsKt.toMutableList((Collection) bqVar.setLayoutAnimation()), Long.valueOf(bqVar.setNavigationOnClickListener()), Long.valueOf(bqVar.getNavBarTitleString()), egVar2}, 79799379, -79799378, System.identityHashCode(eeVar2));
                    int i105 = f55351b;
                    int i106 = (i105 & 43) + (i105 | 43);
                    f55350a = i106 % 128;
                    int i107 = i106 % 2;
                }
                return null;
            case 22:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade9 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                ca caVar3 = (ca) objArr[1];
                ce ceVar = (ce) objArr[2];
                bs bsVar3 = new bs(setscrollbardefaultdelaybeforefade9);
                int i108 = f55351b;
                int i109 = i108 & 19;
                int i110 = i108 | 19;
                int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                f55350a = i111 % 128;
                int i112 = i111 % 2;
                return null;
            default:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade10 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                component10 component10Var = (component10) objArr[1];
                setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) objArr[2];
                boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                int i113 = f55351b;
                int i114 = (i113 & (-14)) | (13 & (~i113));
                int i115 = (i113 & 13) << 1;
                int i116 = (i114 ^ i115) + ((i114 & i115) << 1);
                f55350a = i116 % 128;
                if (i116 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade10, "");
                    Intrinsics.checkNotNullParameter(component10Var, "");
                    Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{26327, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 2}, 1336485880, -1336485874, 26327);
                    if (zBooleanValue) {
                        aq aqVar = new aq(setscrollbardefaultdelaybeforefade10);
                        amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar}, 1693919772, -1693919769, System.identityHashCode(aqVar)));
                        if (!((Boolean) am.setY(new Object[]{amVar}, -1201480057, 1201480059, System.identityHashCode(amVar))).booleanValue()) {
                            int i117 = f55351b;
                            int i118 = ((i117 & 22) + (i117 | 22)) - 1;
                            f55350a = i118 % 128;
                            int i119 = i118 % 2;
                        }
                    }
                    return null;
                }
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade10, "");
                Intrinsics.checkNotNullParameter(component10Var, "");
                Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
                SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20016, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(zBooleanValue)}, -772901588, 772901588, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20016);
                if (zBooleanValue) {
                    aq aqVar2 = new aq(setscrollbardefaultdelaybeforefade10);
                    amVar = (am) ((setImageTintList) w.setX(new Object[]{aqVar2}, 1693919772, -1693919769, System.identityHashCode(aqVar2)));
                    if (!((Boolean) am.setY(new Object[]{amVar}, -1201480057, 1201480059, System.identityHashCode(amVar))).booleanValue()) {
                        int i1110 = f55351b;
                        int i1111 = ((i1110 & 22) + (i1110 | 22)) - 1;
                        f55350a = i1111 % 128;
                        int i1112 = i1111 % 2;
                    }
                }
                return null;
                cz czVar5 = new cz(setscrollbardefaultdelaybeforefade10);
                cy cyVar2 = new cy(setscrollbardefaultdelaybeforefade10);
                int i120 = f55351b;
                int i121 = i120 | 3;
                int i122 = i121 << 1;
                int i123 = -((~(i120 & 3)) & i121);
                int i124 = (i122 & i123) + (i123 | i122);
                f55350a = i124 % 128;
                int i125 = i124 % 2;
                return null;
        }
    }

    @NotNull
    public static setFitsSystemWindows setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, long j10) {
        return (setFitsSystemWindows) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, Long.valueOf(j10)}, -1226013544, 1226013559, (int) System.currentTimeMillis());
    }

    @NotNull
    public final <T extends setScrollBarDefaultDelayBeforeFade> Pair<bq, fk> setX(@NotNull T t10, @NotNull setTextKeepState settextkeepstate, @NotNull ew<T> ewVar) {
        return (Pair) setOnFocusChangeListener(new Object[]{this, t10, settextkeepstate, ewVar}, 1151690682, -1151690678, System.identityHashCode(this));
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setContentDescription setcontentdescription) throws Exception {
        setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, setcontentdescription}, -1171320731, 1171320749, (int) System.currentTimeMillis());
    }

    @NotNull
    public static fk setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull getValue getvalue, @NotNull setFitsSystemWindows setfitssystemwindows, @NotNull ds dsVar) {
        return (fk) setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, getvalue, setfitssystemwindows, dsVar}, -1842798873, 1842798887, (int) System.currentTimeMillis());
    }

    @NotNull
    public final fk setX(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull getValue getvalue, @NotNull setFitsSystemWindows setfitssystemwindows, @NotNull ds dsVar) {
        return (fk) setOnFocusChangeListener(new Object[]{this, setscrollbardefaultdelaybeforefade, getvalue, setfitssystemwindows, dsVar}, 432395290, -432395271, System.identityHashCode(this));
    }

    @Nullable
    public final <T extends setScrollBarDefaultDelayBeforeFade> fk setY(@NotNull T t10, @NotNull setTextKeepState settextkeepstate, @NotNull ew<T> ewVar, boolean z10, @NotNull eg egVar) {
        return (fk) setOnFocusChangeListener(new Object[]{this, t10, settextkeepstate, ewVar, Boolean.valueOf(z10), egVar}, 241380943, -241380940, System.identityHashCode(this));
    }

    public static void setDividerPadding(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull component10 component10Var, @NotNull setFontFeatureSettings setfontfeaturesettings, boolean z10) throws Exception {
        setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, component10Var, setfontfeaturesettings, Boolean.valueOf(z10)}, 844101167, -844101167, (int) System.currentTimeMillis());
    }

    @Nullable
    public final <T extends setScrollBarDefaultDelayBeforeFade> fk setOnFocusChangeListener(@NotNull T t10, @NotNull setTextKeepState settextkeepstate, @NotNull ew<T> ewVar, boolean z10) {
        return (fk) setOnFocusChangeListener(new Object[]{this, t10, settextkeepstate, ewVar, Boolean.valueOf(z10)}, 1587825995, -1587825987, System.identityHashCode(this));
    }
}
