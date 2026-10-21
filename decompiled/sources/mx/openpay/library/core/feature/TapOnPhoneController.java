package mx.openpay.library.core.feature;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import c.i;
import c.j;
import c.k;
import com.bbva.nativesettings.common.Constants;
import ek.a;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import mx.openpay.library.R;
import mx.openpay.library.core.mapper.DeviceNFCStatusMapperKt;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.mapper.TapOnPhoneChargeCreationMapperKt;
import mx.openpay.library.core.mapper.TransactionMapperKt;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayDeviceNFCStatus;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.core.model.extra.OrderTerminal;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.taponphone.OpenPayTapOnPhoneRefundChargeState;
import mx.openpay.library.core.util.NFCUtils;
import mx.openpay.library.core.util.TapOnPhoneHelper;
import mx.openpay.library.core.util.VersionUtils;
import mx.openpay.library.di.DependenciesProvider;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.taponphone.InitResult;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.usecase.taponphone.CancelTapOnPhoneProcessUseCase;
import mx.openpay.library.domain.usecase.taponphone.CreatedTsdkManualInitializerUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePlansStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePointsStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeSignStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneRefundChargeUseCase;
import mx.openpay.library.domain.usecase.taponphone.InitTapOnPhoneUseCase;
import mx.openpay.library.domain.usecase.taponphone.InitTsdkManualInitializerUseCase;
import mx.openpay.library.domain.util.Result;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0013\u00109\u001a\u00020:H\u0080@ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u00020 0'2\u0006\u0010>\u001a\u00020?H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0016\u0010A\u001a\u00020:2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u00020CJ\u0016\u0010D\u001a\u00020:2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010E\u001a\u000200J\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0'H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010<J\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020 0'H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010<J1\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0080@ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ1\u0010R\u001a\b\u0012\u0004\u0012\u00020S0J2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\u0006\u0010N\u001a\u00020OH\u0080@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ1\u0010X\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010N\u001a\u00020O2\u0006\u0010[\u001a\u00020\\H\u0080@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J1\u0010_\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010N\u001a\u00020O2\u0006\u0010`\u001a\u00020 H\u0080@ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ)\u0010c\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010d\u001a\u00020eH\u0080@ø\u0001\u0000¢\u0006\u0004\bf\u0010gR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R,\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'0&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R,\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0'0&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010+\"\u0004\b2\u0010-R#\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'04¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R#\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0'04¢\u0006\b\n\u0000\u001a\u0004\b8\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, d2 = {"Lmx/openpay/library/core/feature/TapOnPhoneController;", "", "context", "Landroid/content/Context;", "initTsdkManualInitializerUseCase", "Lmx/openpay/library/domain/usecase/taponphone/InitTsdkManualInitializerUseCase;", "createdTsdkManualInitializerUseCase", "Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCase;", "initTapOnPhoneUseCase", "Lmx/openpay/library/domain/usecase/taponphone/InitTapOnPhoneUseCase;", "executeTapOnPhoneChargeUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeUseCase;", "executeTapOnPhoneChargePointsStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePointsStepUseCase;", "executeTapOnPhoneChargePlansStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePlansStepUseCase;", "executeTapOnPhoneChargeSignStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeSignStepUseCase;", "executeTapOnPhoneRefundChargeUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneRefundChargeUseCase;", "cancelTapOnPhoneProcessUseCase", "Lmx/openpay/library/domain/usecase/taponphone/CancelTapOnPhoneProcessUseCase;", "(Landroid/content/Context;Lmx/openpay/library/domain/usecase/taponphone/InitTsdkManualInitializerUseCase;Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCase;Lmx/openpay/library/domain/usecase/taponphone/InitTapOnPhoneUseCase;Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeUseCase;Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePointsStepUseCase;Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePlansStepUseCase;Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeSignStepUseCase;Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneRefundChargeUseCase;Lmx/openpay/library/domain/usecase/taponphone/CancelTapOnPhoneProcessUseCase;)V", "activeMerchantInfo", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "getActiveMerchantInfo$library_release", "()Lmx/openpay/library/domain/model/eglobal/Merchant;", "setActiveMerchantInfo$library_release", "(Lmx/openpay/library/domain/model/eglobal/Merchant;)V", "domainTapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "isToPInitialized", "", "isToPInitialized$library_release", "()Z", "setToPInitialized$library_release", "(Z)V", "mutableTapOnPhoneChargeResultState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "getMutableTapOnPhoneChargeResultState$library_release", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setMutableTapOnPhoneChargeResultState$library_release", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "mutableTapOnPhoneRefundChargeResultState", "Lmx/openpay/library/core/model/taponphone/OpenPayTapOnPhoneRefundChargeState;", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "getMutableTapOnPhoneRefundChargeResultState$library_release", "setMutableTapOnPhoneRefundChargeResultState$library_release", "tapOnPhoneChargeResultState", "Lkotlinx/coroutines/flow/SharedFlow;", "getTapOnPhoneChargeResultState", "()Lkotlinx/coroutines/flow/SharedFlow;", "tapOnPhoneRefundChargeResultState", "getTapOnPhoneRefundChargeResultState", "cancelProcess", "", "cancelProcess$library_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createdTsdkManualInitializer", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", "orderTerminal", "Lmx/openpay/library/core/model/extra/OrderTerminal;", "executeRefundCharge", "transactionDTO", "initTapOnPhone", "Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", "initTsdkManualInitializer", "internalExecuteCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "chargeData", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "internalExecuteCharge$library_release", "(Landroid/content/Context;Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internalExecuteRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transaction", "Lmx/openpay/library/core/model/OpenPayTransaction;", "internalExecuteRefundCharge$library_release", "(Landroid/content/Context;Lmx/openpay/library/core/model/OpenPayTransaction;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPlansModalResponse", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "selectedPlan", "", "onPlansModalResponse$library_release", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPointsModalResponse", "withPoints", "onPointsModalResponse$library_release", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSignatureRecorded", "encodedImage", "", "onSignatureRecorded$library_release", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhoneController {
    public static final int $stable = 8;

    @Nullable
    private Merchant activeMerchantInfo;

    @NotNull
    private final CancelTapOnPhoneProcessUseCase cancelTapOnPhoneProcessUseCase;

    @NotNull
    private final CreatedTsdkManualInitializerUseCase createdTsdkManualInitializerUseCase;

    @NotNull
    private final mx.openpay.library.domain.taponphone.TapOnPhoneController domainTapOnPhoneController;

    @NotNull
    private final ExecuteTapOnPhoneChargePlansStepUseCase executeTapOnPhoneChargePlansStepUseCase;

    @NotNull
    private final ExecuteTapOnPhoneChargePointsStepUseCase executeTapOnPhoneChargePointsStepUseCase;

    @NotNull
    private final ExecuteTapOnPhoneChargeSignStepUseCase executeTapOnPhoneChargeSignStepUseCase;

    @NotNull
    private final ExecuteTapOnPhoneChargeUseCase executeTapOnPhoneChargeUseCase;

    @NotNull
    private final ExecuteTapOnPhoneRefundChargeUseCase executeTapOnPhoneRefundChargeUseCase;

    @NotNull
    private final InitTapOnPhoneUseCase initTapOnPhoneUseCase;

    @NotNull
    private final InitTsdkManualInitializerUseCase initTsdkManualInitializerUseCase;
    private boolean isToPInitialized;

    @NotNull
    private MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableTapOnPhoneChargeResultState;

    @NotNull
    private MutableSharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> mutableTapOnPhoneRefundChargeResultState;

    @NotNull
    private final SharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> tapOnPhoneChargeResultState;

    @NotNull
    private final SharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> tapOnPhoneRefundChargeResultState;

    public TapOnPhoneController(@NotNull Context context, @NotNull InitTsdkManualInitializerUseCase initTsdkManualInitializerUseCase, @NotNull CreatedTsdkManualInitializerUseCase createdTsdkManualInitializerUseCase, @NotNull InitTapOnPhoneUseCase initTapOnPhoneUseCase, @NotNull ExecuteTapOnPhoneChargeUseCase executeTapOnPhoneChargeUseCase, @NotNull ExecuteTapOnPhoneChargePointsStepUseCase executeTapOnPhoneChargePointsStepUseCase, @NotNull ExecuteTapOnPhoneChargePlansStepUseCase executeTapOnPhoneChargePlansStepUseCase, @NotNull ExecuteTapOnPhoneChargeSignStepUseCase executeTapOnPhoneChargeSignStepUseCase, @NotNull ExecuteTapOnPhoneRefundChargeUseCase executeTapOnPhoneRefundChargeUseCase, @NotNull CancelTapOnPhoneProcessUseCase cancelTapOnPhoneProcessUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initTsdkManualInitializerUseCase, "initTsdkManualInitializerUseCase");
        Intrinsics.checkNotNullParameter(createdTsdkManualInitializerUseCase, "createdTsdkManualInitializerUseCase");
        Intrinsics.checkNotNullParameter(initTapOnPhoneUseCase, "initTapOnPhoneUseCase");
        Intrinsics.checkNotNullParameter(executeTapOnPhoneChargeUseCase, "executeTapOnPhoneChargeUseCase");
        Intrinsics.checkNotNullParameter(executeTapOnPhoneChargePointsStepUseCase, "executeTapOnPhoneChargePointsStepUseCase");
        Intrinsics.checkNotNullParameter(executeTapOnPhoneChargePlansStepUseCase, "executeTapOnPhoneChargePlansStepUseCase");
        Intrinsics.checkNotNullParameter(executeTapOnPhoneChargeSignStepUseCase, "executeTapOnPhoneChargeSignStepUseCase");
        Intrinsics.checkNotNullParameter(executeTapOnPhoneRefundChargeUseCase, "executeTapOnPhoneRefundChargeUseCase");
        Intrinsics.checkNotNullParameter(cancelTapOnPhoneProcessUseCase, "cancelTapOnPhoneProcessUseCase");
        this.initTsdkManualInitializerUseCase = initTsdkManualInitializerUseCase;
        this.createdTsdkManualInitializerUseCase = createdTsdkManualInitializerUseCase;
        this.initTapOnPhoneUseCase = initTapOnPhoneUseCase;
        this.executeTapOnPhoneChargeUseCase = executeTapOnPhoneChargeUseCase;
        this.executeTapOnPhoneChargePointsStepUseCase = executeTapOnPhoneChargePointsStepUseCase;
        this.executeTapOnPhoneChargePlansStepUseCase = executeTapOnPhoneChargePlansStepUseCase;
        this.executeTapOnPhoneChargeSignStepUseCase = executeTapOnPhoneChargeSignStepUseCase;
        this.executeTapOnPhoneRefundChargeUseCase = executeTapOnPhoneRefundChargeUseCase;
        this.cancelTapOnPhoneProcessUseCase = cancelTapOnPhoneProcessUseCase;
        this.domainTapOnPhoneController = DependenciesProvider.TapOnPhoneModule.INSTANCE.provideTapOnPhoneController(context);
        MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.mutableTapOnPhoneChargeResultState = mutableSharedFlowMutableSharedFlow$default;
        this.tapOnPhoneChargeResultState = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.mutableTapOnPhoneRefundChargeResultState = mutableSharedFlowMutableSharedFlow$default2;
        this.tapOnPhoneRefundChargeResultState = mutableSharedFlowMutableSharedFlow$default2;
    }

    @Nullable
    public final Object cancelProcess$library_release(@NotNull Continuation<? super Unit> continuation) {
        Object objInvoke = this.cancelTapOnPhoneProcessUseCase.invoke(this.domainTapOnPhoneController, continuation);
        return objInvoke == a.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object createdTsdkManualInitializer(@NotNull Application application, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        i iVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f25305c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f25305c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, continuation);
            }
        } else {
            iVar = new i(this, continuation);
        }
        Object objInvoke = iVar.f25303a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = iVar.f25305c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (!TapOnPhoneHelper.INSTANCE.isTapOnPhoneEnabled()) {
                return new OpenPayResult.Failure(OpenPayError.NotImplemented.INSTANCE);
            }
            if (VersionUtils.INSTANCE.getAndroidVersion() < 30) {
                return new OpenPayResult.Failure(OpenPayError.UnsupportedVersion.INSTANCE);
            }
            CreatedTsdkManualInitializerUseCase createdTsdkManualInitializerUseCase = this.createdTsdkManualInitializerUseCase;
            mx.openpay.library.domain.taponphone.TapOnPhoneController tapOnPhoneController = this.domainTapOnPhoneController;
            iVar.f25305c = 1;
            objInvoke = createdTsdkManualInitializerUseCase.invoke(application, tapOnPhoneController, iVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (result instanceof Result.Success) {
            return new OpenPayResult.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
        }
        if (result instanceof Result.Failure) {
            return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void executeCharge(@NotNull Context context, @NotNull OrderTerminal orderTerminal) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orderTerminal, "orderTerminal");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(orderTerminal.getAmount()));
        String orderId = orderTerminal.getOrderId();
        Integer numValueOf = Integer.valueOf(orderTerminal.getMonths());
        String description = orderTerminal.getDescription();
        if (description == null) {
            description = "";
        }
        context.startActivity(TapOnPhoneCreateChargeActivity.INSTANCE.getIntent(context, new OpenPayTerminalChargeCreation(bigDecimal, orderId, numValueOf, description)));
    }

    public final void executeRefundCharge(@NotNull Context context, @NotNull TransactionDTO transactionDTO) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transactionDTO, "transactionDTO");
        context.startActivity(TapOnPhoneCreateRefundChargeActivity.INSTANCE.getIntent(context, TransactionMapperKt.mapTransactionDTOToLibraryModel(transactionDTO)));
    }

    @Nullable
    /* JADX INFO: renamed from: getActiveMerchantInfo$library_release, reason: from getter */
    public final Merchant getActiveMerchantInfo() {
        return this.activeMerchantInfo;
    }

    @NotNull
    public final MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> getMutableTapOnPhoneChargeResultState$library_release() {
        return this.mutableTapOnPhoneChargeResultState;
    }

    @NotNull
    public final MutableSharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> getMutableTapOnPhoneRefundChargeResultState$library_release() {
        return this.mutableTapOnPhoneRefundChargeResultState;
    }

    @NotNull
    public final SharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> getTapOnPhoneChargeResultState() {
        return this.tapOnPhoneChargeResultState;
    }

    @NotNull
    public final SharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> getTapOnPhoneRefundChargeResultState() {
        return this.tapOnPhoneRefundChargeResultState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object initTapOnPhone(@NotNull Continuation<? super OpenPayResult<? extends OpenPayDeviceNFCStatus>> continuation) {
        j jVar;
        TapOnPhoneController tapOnPhoneController;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i10 = jVar.f25309d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f25309d = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, continuation);
            }
        } else {
            jVar = new j(this, continuation);
        }
        Object objInvoke = jVar.f25307b;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = jVar.f25309d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (!TapOnPhoneHelper.INSTANCE.isTapOnPhoneEnabled()) {
                return new OpenPayResult.Failure(OpenPayError.NotImplemented.INSTANCE);
            }
            if (VersionUtils.INSTANCE.getAndroidVersion() < 30) {
                return new OpenPayResult.Failure(OpenPayError.UnsupportedVersion.INSTANCE);
            }
            InitTapOnPhoneUseCase initTapOnPhoneUseCase = this.initTapOnPhoneUseCase;
            mx.openpay.library.domain.taponphone.TapOnPhoneController tapOnPhoneController2 = this.domainTapOnPhoneController;
            jVar.f25306a = this;
            jVar.f25309d = 1;
            objInvoke = initTapOnPhoneUseCase.invoke(tapOnPhoneController2, jVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneController = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapOnPhoneController = jVar.f25306a;
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        OpenPayDeviceNFCStatus openPayDeviceNFCStatusMapToLibraryModel = DeviceNFCStatusMapperKt.mapToLibraryModel(((InitResult) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getDeviceNFCStatus());
        if (openPayDeviceNFCStatusMapToLibraryModel == OpenPayDeviceNFCStatus.NFC_ENABLED) {
            tapOnPhoneController.isToPInitialized = true;
            tapOnPhoneController.activeMerchantInfo = ((InitResult) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getMerchant();
        }
        return new OpenPayResult.Success(openPayDeviceNFCStatusMapToLibraryModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object initTsdkManualInitializer(@NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f25312c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f25312c = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, continuation);
            }
        } else {
            kVar = new k(this, continuation);
        }
        Object objInvoke = kVar.f25310a;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.f25312c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (!TapOnPhoneHelper.INSTANCE.isTapOnPhoneEnabled()) {
                return new OpenPayResult.Failure(OpenPayError.NotImplemented.INSTANCE);
            }
            if (VersionUtils.INSTANCE.getAndroidVersion() < 30) {
                return new OpenPayResult.Failure(OpenPayError.UnsupportedVersion.INSTANCE);
            }
            InitTsdkManualInitializerUseCase initTsdkManualInitializerUseCase = this.initTsdkManualInitializerUseCase;
            mx.openpay.library.domain.taponphone.TapOnPhoneController tapOnPhoneController = this.domainTapOnPhoneController;
            kVar.f25312c = 1;
            objInvoke = initTsdkManualInitializerUseCase.invoke(tapOnPhoneController, kVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (result instanceof Result.Success) {
            return new OpenPayResult.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
        }
        if (result instanceof Result.Failure) {
            return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final Object internalExecuteCharge$library_release(@NotNull Context context, @NotNull OpenPayTerminalChargeCreation openPayTerminalChargeCreation, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Charge>> continuation) {
        Result.Failure failure;
        if (!TapOnPhoneHelper.INSTANCE.isTapOnPhoneEnabled() || !this.isToPInitialized) {
            return new Result.Failure(new Error.UninitializedTapOnPhoneSDK(null, 1, null));
        }
        if (context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                return NFCUtils.INSTANCE.isNFCEnabled(context) ? this.executeTapOnPhoneChargeUseCase.invoke(this.domainTapOnPhoneController, TapOnPhoneChargeCreationMapperKt.mapToTapOnPhoneChargeRequest(openPayTerminalChargeCreation), tapOnPhoneCallback, continuation) : new Result.Failure(new Error.NFCDisabled(null, 1, null));
            }
            String string = context.getString(R.string.error_disabled_location);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri….error_disabled_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string));
        } else {
            String string2 = context.getString(R.string.error_permission_location);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rror_permission_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string2));
        }
        return failure;
    }

    @Nullable
    public final Object internalExecuteRefundCharge$library_release(@NotNull Context context, @NotNull OpenPayTransaction openPayTransaction, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Transaction>> continuation) {
        Result.Failure failure;
        if (!TapOnPhoneHelper.INSTANCE.isTapOnPhoneEnabled() || !this.isToPInitialized) {
            return new Result.Failure(new Error.UninitializedTapOnPhoneSDK(null, 1, null));
        }
        if (context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            Object systemService = context.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                return NFCUtils.INSTANCE.isNFCEnabled(context) ? this.executeTapOnPhoneRefundChargeUseCase.invoke(this.domainTapOnPhoneController, TransactionMapperKt.mapToDomainModel(openPayTransaction), tapOnPhoneCallback, continuation) : new Result.Failure(new Error.NFCDisabled(null, 1, null));
            }
            String string = context.getString(R.string.error_disabled_location);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri….error_disabled_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string));
        } else {
            String string2 = context.getString(R.string.error_permission_location);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rror_permission_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string2));
        }
        return failure;
    }

    /* JADX INFO: renamed from: isToPInitialized$library_release, reason: from getter */
    public final boolean getIsToPInitialized() {
        return this.isToPInitialized;
    }

    @Nullable
    public final Object onPlansModalResponse$library_release(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return this.executeTapOnPhoneChargePlansStepUseCase.invoke(this.domainTapOnPhoneController, createCharge, tapOnPhoneCallback, i10, continuation);
    }

    @Nullable
    public final Object onPointsModalResponse$library_release(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return this.executeTapOnPhoneChargePointsStepUseCase.invoke(this.domainTapOnPhoneController, createCharge, tapOnPhoneCallback, z10, continuation);
    }

    @Nullable
    public final Object onSignatureRecorded$library_release(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Result<Charge>> continuation) {
        return this.executeTapOnPhoneChargeSignStepUseCase.invoke(this.domainTapOnPhoneController, createCharge, str, continuation);
    }

    public final void setActiveMerchantInfo$library_release(@Nullable Merchant merchant) {
        this.activeMerchantInfo = merchant;
    }

    public final void setMutableTapOnPhoneChargeResultState$library_release(@NotNull MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.mutableTapOnPhoneChargeResultState = mutableSharedFlow;
    }

    public final void setMutableTapOnPhoneRefundChargeResultState$library_release(@NotNull MutableSharedFlow<OpenPayResult<OpenPayTapOnPhoneRefundChargeState<TransactionDTO>>> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.mutableTapOnPhoneRefundChargeResultState = mutableSharedFlow;
    }

    public final void setToPInitialized$library_release(boolean z10) {
        this.isToPInitialized = z10;
    }
}
