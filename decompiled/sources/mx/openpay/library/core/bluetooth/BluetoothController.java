package mx.openpay.library.core.bluetooth;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import b.d;
import b.e;
import b.f;
import b.g;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import mx.openpay.library.R;
import mx.openpay.library.core.mapper.ChargeMapperKt;
import mx.openpay.library.core.mapper.DeviceMapperKt;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.mapper.TerminalChargeCreationMapperKt;
import mx.openpay.library.core.mapper.TransactionMapperKt;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayDevice;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayProcessingStep;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayScanState;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.core.model.extra.DeviceDTO;
import mx.openpay.library.domain.bluetooth.Device;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.ProcessingStep;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.model.common.ChargeCallbackStates;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.usecase.eglobal.ExecuteChargeUseCase;
import mx.openpay.library.domain.util.Result;
import mx.openpay.library.domain.util.ResultKt;
import mx.openpay.library.ui.modal.PayWithPointsModal;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;
import mx.openpay.library.util.BluetoothUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J=\u0010!\u001a\u00020\u001c2\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$0#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0080@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\b\u0012\u0004\u0012\u00020,0$2\u0006\u0010-\u001a\u00020,H\u0080@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150$H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001eJ \u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u0002092\u0006\u00106\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u000eH\u0002J\u0006\u0010;\u001a\u00020\u001cJ\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0$2\u0006\u0010=\u001a\u00020>H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010?J\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0$J\u0006\u0010B\u001a\u00020\u001cJ\b\u0010C\u001a\u00020\u000eH\u0002J\f\u0010D\u001a\u00020\u000e*\u00020\u0003H\u0002J\f\u0010E\u001a\u00020\u000e*\u00020\u0003H\u0003R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lmx/openpay/library/core/bluetooth/BluetoothController;", "", "context", "Landroid/content/Context;", "executeChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCase;", "(Landroid/content/Context;Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCase;)V", "bluetoothController", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "getBluetoothController", "()Lmx/openpay/library/domain/bluetooth/BluetoothController;", "bluetoothController$delegate", "Lkotlin/Lazy;", "bluetoothEnabled", "", "getBluetoothEnabled", "()Z", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "pairedDevices", "", "Lmx/openpay/library/core/model/extra/DeviceDTO;", "getPairedDevices", "scannedDevices", "Lmx/openpay/library/core/model/OpenPayScanState;", "getScannedDevices", "closeConnection", "", "eglobalChargeCallback", "Lmx/openpay/library/domain/model/common/ChargeCallback;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/appcompat/app/AppCompatActivity;", "executeCharge", "mutableChargeResultStateFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "chargeData", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "executeCharge$library_release", "(Lkotlinx/coroutines/flow/MutableSharedFlow;Landroidx/appcompat/app/AppCompatActivity;Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/core/model/OpenPayTransaction;", "transaction", "executeRefundCharge$library_release", "(Lmx/openpay/library/core/model/OpenPayTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listDevicesScanned", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPlansModalResponse", "Lkotlinx/coroutines/Job;", "plans", "", "chargeCallback", "onPointsModalResponse", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "withPoints", "release", "startDeviceConnection", Constants.device, "Lmx/openpay/library/core/model/OpenPayDevice;", "(Lmx/openpay/library/core/model/OpenPayDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDiscovery", "", "stopDiscovery", "storagePermissionsGranted", "hasLegacyStoragePermissions", "hasStoragePermissions", "Companion", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBluetoothController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothController.kt\nmx/openpay/library/core/bluetooth/BluetoothController\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,367:1\n47#2:368\n49#2:372\n47#2:373\n49#2:377\n50#3:369\n55#3:371\n50#3:374\n55#3:376\n106#4:370\n106#4:375\n12541#5,2:378\n12541#5,2:380\n*S KotlinDebug\n*F\n+ 1 BluetoothController.kt\nmx/openpay/library/core/bluetooth/BluetoothController\n*L\n72#1:368\n72#1:372\n81#1:373\n81#1:377\n72#1:369\n72#1:371\n81#1:374\n81#1:376\n72#1:370\n81#1:375\n138#1:378,2\n146#1:380,2\n*E\n"})
public final class BluetoothController {
    private static mx.openpay.library.domain.bluetooth.BluetoothController controller;
    private static CreateCharge createCharge;

    /* JADX INFO: renamed from: bluetoothController$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bluetoothController;

    @NotNull
    private final Context context;

    @NotNull
    private final ExecuteChargeUseCase executeChargeUseCase;

    @NotNull
    private final StateFlow<List<DeviceDTO>> pairedDevices;

    @NotNull
    private final StateFlow<OpenPayScanState> scannedDevices;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final CoroutineScope coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));

    @NotNull
    private static MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableChargeResultState = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR4\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lmx/openpay/library/core/bluetooth/BluetoothController$Companion;", "", "", "encodedImage", "", "onSignatureRecorded", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "chargeResult", "evalChargeResult", "(Lmx/openpay/library/domain/util/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "mutableChargeResultState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getMutableChargeResultState", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setMutableChargeResultState", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "controller", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lmx/openpay/library/domain/model/CreateCharge;", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProcessingStep.values().length];
                try {
                    iArr[ProcessingStep.PROCESSED_STEP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProcessingStep.PAY_WITH_POINTS_STEP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProcessingStep.DIGITAL_SIGN_STEP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProcessingStep.PAY_WITH_PLANS_STEP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Object evalChargeResult(@NotNull Result<Charge> result, @NotNull Continuation<? super Unit> continuation) {
            if (result instanceof Result.Success) {
                ProcessingStep processStep = ((Result.Success) result).getProcessStep();
                int i10 = processStep == null ? -1 : WhenMappings.$EnumSwitchMapping$0[processStep.ordinal()];
                if (i10 == -1) {
                    Object objEmit = getMutableChargeResultState().emit(new OpenPayResult.Failure(OpenPayError.Unknown.INSTANCE), continuation);
                    return objEmit == ek.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
                if (i10 == 1) {
                    Object objEmit2 = getMutableChargeResultState().emit(new OpenPayResult.Success(new OpenPayChargeState.Success(ChargeMapperKt.mapToLibraryChargeTransactionModel((Charge) ResultKt.getSuccessData(result)))), continuation);
                    return objEmit2 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
                }
                if (i10 == 2) {
                    Object objEmit3 = getMutableChargeResultState().emit(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.PayWithPoints.INSTANCE)), continuation);
                    return objEmit3 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit3 : Unit.INSTANCE;
                }
                if (i10 == 3) {
                    Object objEmit4 = getMutableChargeResultState().emit(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.RequireDigitalSign.INSTANCE)), continuation);
                    return objEmit4 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit4 : Unit.INSTANCE;
                }
                if (i10 == 4) {
                    Object objEmit5 = getMutableChargeResultState().emit(new OpenPayResult.Success(new OpenPayChargeState.Processing(OpenPayProcessingStep.PayWithPlans.INSTANCE)), continuation);
                    return objEmit5 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit5 : Unit.INSTANCE;
                }
            } else if (result instanceof Result.Failure) {
                Object objEmit6 = getMutableChargeResultState().emit(new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError())), continuation);
                return objEmit6 == ek.a.getCOROUTINE_SUSPENDED() ? objEmit6 : Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        @NotNull
        public final MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> getMutableChargeResultState() {
            return BluetoothController.mutableChargeResultState;
        }

        public final void onSignatureRecorded(@NotNull String encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            BuildersKt__Builders_commonKt.launch$default(BluetoothController.coroutineScope, null, null, new a(encodedImage, null), 3, null);
        }

        public final void setMutableChargeResultState(@NotNull MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableSharedFlow) {
            Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
            BluetoothController.mutableChargeResultState = mutableSharedFlow;
        }
    }

    public BluetoothController(@NotNull Context context, @NotNull ExecuteChargeUseCase executeChargeUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executeChargeUseCase, "executeChargeUseCase");
        this.context = context;
        this.executeChargeUseCase = executeChargeUseCase;
        this.bluetoothController = LazyKt__LazyJVMKt.lazy(new b.a(this));
        final StateFlow<List<Device>> scannedDevices = getBluetoothController().getScannedDevices();
        Flow<OpenPayScanState.Success> flow = new Flow<OpenPayScanState.Success>() { // from class: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$1

            /* JADX INFO: renamed from: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BluetoothController.kt\nmx/openpay/library/core/bluetooth/BluetoothController\n*L\n1#1,222:1\n48#2:223\n73#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f83506a;

                /* JADX INFO: renamed from: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$1$2", f = "BluetoothController.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f83507a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f83508b;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f83507a = obj;
                        this.f83508b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f83506a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f83508b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f83508b = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f83507a;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f83508b;
                    if (i11 == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f83506a;
                        OpenPayScanState.Success success = new OpenPayScanState.Success(DeviceMapperKt.toDeviceToDeviceDTOLibraryModel((List) obj));
                        anonymousClass1.f83508b = 1;
                        if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super OpenPayScanState.Success> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = scannedDevices.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        CoroutineScope coroutineScope2 = coroutineScope;
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        this.scannedDevices = FlowKt.stateIn(flow, coroutineScope2, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), OpenPayScanState.Scanning.INSTANCE);
        final StateFlow<List<Device>> pairedDevices = getBluetoothController().getPairedDevices();
        this.pairedDevices = FlowKt.stateIn(new Flow<List<? extends DeviceDTO>>() { // from class: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$2

            /* JADX INFO: renamed from: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BluetoothController.kt\nmx/openpay/library/core/bluetooth/BluetoothController\n*L\n1#1,222:1\n48#2:223\n82#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f83511a;

                /* JADX INFO: renamed from: mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "mx.openpay.library.core.bluetooth.BluetoothController$special$$inlined$map$2$2", f = "BluetoothController.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f83512a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f83513b;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f83512a = obj;
                        this.f83513b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f83511a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f83513b;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f83513b = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f83512a;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f83513b;
                    if (i11 == 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.f83511a;
                        List<DeviceDTO> deviceToDeviceDTOLibraryModel = DeviceMapperKt.toDeviceToDeviceDTOLibraryModel((List) obj);
                        anonymousClass1.f83513b = 1;
                        if (flowCollector.emit(deviceToDeviceDTOLibraryModel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<? extends DeviceDTO>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = pairedDevices.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope2, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), CollectionsKt__CollectionsKt.emptyList());
    }

    private final ChargeCallback eglobalChargeCallback(final AppCompatActivity activity) {
        return new ChargeCallback() { // from class: mx.openpay.library.core.bluetooth.BluetoothController.eglobalChargeCallback.1
            @Override // mx.openpay.library.domain.model.common.ChargeCallback
            public void execute(@NotNull ChargeCallbackStates type) {
                Intrinsics.checkNotNullParameter(type, "type");
                if (type instanceof ChargeCallbackStates.Eglobal.PayWithPoints) {
                    PayWithPointsModal payWithPointsModal = new PayWithPointsModal(new b.b(this, type, this));
                    AppCompatActivity appCompatActivity = activity;
                    Intrinsics.checkNotNull(appCompatActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    payWithPointsModal.show(appCompatActivity.getSupportFragmentManager(), "payWithPoints");
                    return;
                }
                if (type instanceof ChargeCallbackStates.Eglobal.RequestDigitalSignature) {
                    Companion companion = BluetoothController.INSTANCE;
                    BluetoothController.controller = this.getBluetoothController();
                    BluetoothController.createCharge = ((ChargeCallbackStates.Eglobal.RequestDigitalSignature) type).getCreateCharge();
                    activity.startActivity(new Intent(DigitalSignatureComponentActivity.INSTANCE.getIntent(activity)));
                    return;
                }
                if (type instanceof ChargeCallbackStates.Eglobal.PayWithPlans) {
                    Companion companion2 = BluetoothController.INSTANCE;
                    BluetoothController.controller = this.getBluetoothController();
                    ChargeCallbackStates.Eglobal.PayWithPlans payWithPlans = (ChargeCallbackStates.Eglobal.PayWithPlans) type;
                    BluetoothController.createCharge = payWithPlans.getCreateCharge();
                    DialogFragment dialogFragmentNewInstance = PayWithPlansModal.INSTANCE.newInstance(new ArrayList<>(payWithPlans.getPlans()), new b.c(this, this));
                    AppCompatActivity appCompatActivity2 = activity;
                    Intrinsics.checkNotNull(appCompatActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    dialogFragmentNewInstance.show(appCompatActivity2.getSupportFragmentManager(), PayWithPlansModal.PAY_PLANS_MODAL_TAG);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mx.openpay.library.domain.bluetooth.BluetoothController getBluetoothController() {
        return (mx.openpay.library.domain.bluetooth.BluetoothController) this.bluetoothController.getValue();
    }

    private final boolean hasLegacyStoragePermissions(Context context) {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", MagiskApp.WRITE_EXTERNAL_STORAGE};
        for (int i10 = 0; i10 < 2; i10++) {
            if (context.checkSelfPermission(strArr[i10]) != 0) {
                return false;
            }
        }
        return true;
    }

    @RequiresApi(33)
    private final boolean hasStoragePermissions(Context context) {
        String[] strArr = {"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        for (int i10 = 0; i10 < 3; i10++) {
            if (context.checkSelfPermission(strArr[i10]) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPointsModalResponse(CreateCharge createCharge2, ChargeCallback chargeCallback, boolean withPoints) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(this, createCharge2, chargeCallback, withPoints, null), 3, null);
    }

    private final boolean storagePermissionsGranted() {
        return Build.VERSION.SDK_INT >= 33 ? hasStoragePermissions(this.context) : hasLegacyStoragePermissions(this.context);
    }

    public final void closeConnection() {
        getBluetoothController().closeConnection();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object executeCharge$library_release(@NotNull MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableSharedFlow, @NotNull AppCompatActivity appCompatActivity, @NotNull OpenPayTerminalChargeCreation openPayTerminalChargeCreation, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        Result<Charge> failure;
        Companion companion;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f24734c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f24734c = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object objInvoke = dVar.f24732a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f24734c;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            return Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(objInvoke);
        mutableChargeResultState = mutableSharedFlow;
        ChargeRequest chargeRequestMapToDomainModel = TerminalChargeCreationMapperKt.mapToDomainModel(openPayTerminalChargeCreation);
        Object systemService = this.context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (this.context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            String string = this.context.getString(R.string.error_permission_location);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rror_permission_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string));
        } else if (!locationManager.isProviderEnabled("gps")) {
            String string2 = this.context.getString(R.string.error_disabled_location);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri….error_disabled_location)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string2));
        } else if (!BluetoothUtilsKt.isBluetoothPermissionGranted(this.context)) {
            String string3 = this.context.getString(R.string.error_permission_bluetooth);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ror_permission_bluetooth)");
            failure = new Result.Failure(new Error.PermissionNonGranted(string3));
        } else if (getBluetoothEnabled()) {
            ExecuteChargeUseCase executeChargeUseCase = this.executeChargeUseCase;
            mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = getBluetoothController();
            ChargeCallback chargeCallbackEglobalChargeCallback = eglobalChargeCallback(appCompatActivity);
            dVar.f24734c = 1;
            objInvoke = executeChargeUseCase.invoke(bluetoothController, chargeRequestMapToDomainModel, chargeCallbackEglobalChargeCallback, dVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            String string4 = this.context.getString(R.string.error_disabled_bluetooth);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…error_disabled_bluetooth)");
            failure = new Result.Failure(new Error.OnTerminal(string4));
        }
        companion = INSTANCE;
        dVar.f24734c = 2;
        if (companion.evalChargeResult(failure, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
        failure = (Result) objInvoke;
        companion = INSTANCE;
        dVar.f24734c = 2;
        if (companion.evalChargeResult(failure, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object executeRefundCharge$library_release(@NotNull OpenPayTransaction openPayTransaction, @NotNull Continuation<? super OpenPayResult<OpenPayTransaction>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f24737c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f24737c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, continuation);
            }
        } else {
            eVar = new e(this, continuation);
        }
        Object objExecuteRefundCharge = eVar.f24735a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f24737c;
        if (i11 == 0) {
            kotlin.ResultKt.throwOnFailure(objExecuteRefundCharge);
            mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = getBluetoothController();
            Transaction transactionMapToDomainModel = TransactionMapperKt.mapToDomainModel(openPayTransaction);
            eVar.f24737c = 1;
            objExecuteRefundCharge = bluetoothController.executeRefundCharge(transactionMapToDomainModel, eVar);
            if (objExecuteRefundCharge == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objExecuteRefundCharge);
        }
        Result result = (Result) objExecuteRefundCharge;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(TransactionMapperKt.mapToLibraryModel((Transaction) data));
    }

    public final boolean getBluetoothEnabled() {
        return getBluetoothController().getBluetoothEnabled();
    }

    @NotNull
    public final StateFlow<List<DeviceDTO>> getPairedDevices() {
        return this.pairedDevices;
    }

    @NotNull
    public final StateFlow<OpenPayScanState> getScannedDevices() {
        return this.scannedDevices;
    }

    @NotNull
    public final StateFlow<Boolean> isConnected() {
        return getBluetoothController().isConnected();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object listDevicesScanned(@NotNull Continuation<? super OpenPayResult<? extends List<DeviceDTO>>> continuation) {
        f fVar;
        List<DeviceDTO> listEmptyList;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f24740c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f24740c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object objListDevicesScanned = fVar.f24738a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f24740c;
        if (i11 == 0) {
            kotlin.ResultKt.throwOnFailure(objListDevicesScanned);
            mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = getBluetoothController();
            fVar.f24740c = 1;
            objListDevicesScanned = bluetoothController.listDevicesScanned(fVar);
            if (objListDevicesScanned == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objListDevicesScanned);
        }
        Result result = (Result) objListDevicesScanned;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = (List) ((Result.Success) result).getData();
        if (list == null || (listEmptyList = DeviceMapperKt.toDeviceToDeviceDTOLibraryModel(list)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new OpenPayResult.Success(listEmptyList);
    }

    @NotNull
    public final Job onPlansModalResponse(int plans, @NotNull ChargeCallback chargeCallback) {
        Intrinsics.checkNotNullParameter(chargeCallback, "chargeCallback");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new b(this, chargeCallback, plans, null), 3, null);
    }

    public final void release() {
        getBluetoothController().release();
        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object startDeviceConnection(@NotNull OpenPayDevice openPayDevice, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f24743c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f24743c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, continuation);
            }
        } else {
            gVar = new g(this, continuation);
        }
        Object objConnectDevice = gVar.f24741a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f24743c;
        if (i11 == 0) {
            kotlin.ResultKt.throwOnFailure(objConnectDevice);
            if (!storagePermissionsGranted()) {
                String string = this.context.getString(R.string.error_permission_storage);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…error_permission_storage)");
                return new OpenPayResult.Failure(new OpenPayError.PermissionNonGranted(string));
            }
            mx.openpay.library.domain.bluetooth.BluetoothController bluetoothController = getBluetoothController();
            Device deviceMapToDomainModel = DeviceMapperKt.mapToDomainModel(openPayDevice);
            gVar.f24743c = 1;
            objConnectDevice = bluetoothController.connectDevice(deviceMapToDomainModel, gVar);
            if (objConnectDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objConnectDevice);
        }
        Result result = (Result) objConnectDevice;
        if (result instanceof Result.Success) {
            return new OpenPayResult.Success(ResultKt.getSuccessData(result));
        }
        if (result instanceof Result.Failure) {
            return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final OpenPayResult<String> startDiscovery() {
        Result<String> resultStartDiscovery = getBluetoothController().startDiscovery();
        if (!(resultStartDiscovery instanceof Result.Success)) {
            if (resultStartDiscovery instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) resultStartDiscovery).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = (String) ((Result.Success) resultStartDiscovery).getData();
        if (str == null) {
            str = "";
        }
        return new OpenPayResult.Success(str);
    }

    public final void stopDiscovery() {
        getBluetoothController().stopDiscovery();
    }
}
