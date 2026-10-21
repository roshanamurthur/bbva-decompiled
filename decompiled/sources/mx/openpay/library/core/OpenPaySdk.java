package mx.openpay.library.core;

import a.b;
import a.c;
import a.d;
import a.e;
import a.f;
import a.g;
import a.h;
import a.i;
import a.j;
import a.k;
import a.l;
import a.m;
import a.n;
import a.o;
import a.p;
import a.q;
import a.r;
import a.s;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import ek.a;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.core.feature.PaymentLinkController;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.core.feature.TransactionController;
import mx.openpay.library.core.mapper.DeviceMapperKt;
import mx.openpay.library.core.mapper.OpenPayConfigurationMapperKt;
import mx.openpay.library.core.mapper.PaymentLinkFilterMapperKt;
import mx.openpay.library.core.mapper.PaymentLinkMapperKt;
import mx.openpay.library.core.mapper.SendVoucherMapperKt;
import mx.openpay.library.core.mapper.TransactionMapperKt;
import mx.openpay.library.core.mapper.extra.TransactionFilterMapperKt;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayConfiguration;
import mx.openpay.library.core.model.OpenPayCreatePaymentLink;
import mx.openpay.library.core.model.OpenPayDevice;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLinkFilter;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayScanState;
import mx.openpay.library.core.model.OpenPaySendVoucher;
import mx.openpay.library.core.model.OpenPayTerminalChargeCreation;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayTransactionFilter;
import mx.openpay.library.core.model.OpenPayUpdatePaymentLink;
import mx.openpay.library.core.model.PaymentLink;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.core.model.extra.DeviceDTO;
import mx.openpay.library.core.model.extra.OrderTerminal;
import mx.openpay.library.core.model.extra.PaymentLinkFilter;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.SendVoucherRequestDTO;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.extra.TransactionFilter;
import mx.openpay.library.core.model.extra.UpdatePaymentLink;
import mx.openpay.library.di.DependenciesProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000201H\u0086@ø\u0001\u0000¢\u0006\u0002\u00106J'\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00122\u0006\u00102\u001a\u0002032\u0006\u00109\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010;J'\u0010<\u001a\b\u0012\u0004\u0012\u0002080\u00122\u0006\u00102\u001a\u0002032\u0006\u00109\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0006\u0010=\u001a\u00020>J'\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010@\u001a\u00020A2\u0006\u00102\u001a\u000203H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010BJ'\u0010C\u001a\b\u0012\u0004\u0012\u0002080\u00122\u0006\u00102\u001a\u0002032\u0006\u0010\u001d\u001a\u00020DH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010F\u001a\u00020>2\u0006\u0010G\u001a\u00020H2\u0006\u00102\u001a\u0002032\u0006\u0010I\u001a\u00020JH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010KJ'\u0010L\u001a\b\u0012\u0004\u0012\u0002080\u00122\u0006\u00102\u001a\u0002032\u0006\u0010M\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010;J\u0018\u0010N\u001a\u00020>2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020QH\u0016J\u0006\u0010R\u001a\u00020\fJ\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0T0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010UJ-\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010T0\u00122\u0006\u00102\u001a\u0002032\u0006\u0010W\u001a\u00020XH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010YJ!\u0010Z\u001a\u00020>2\u0006\u0010G\u001a\u00020H2\u0006\u0010[\u001a\u00020\\H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010]J-\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080T0\u00122\u0006\u00102\u001a\u0002032\u0006\u0010_\u001a\u00020`H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010aJ/\u0010b\u001a\b\u0012\u0004\u0012\u0002010\u00122\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u0010M\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010cJ\u0006\u0010d\u001a\u00020>J\f\u0010e\u001a\b\u0012\u0004\u0012\u00020:0\u0012J'\u0010f\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u00102\u001a\u0002032\u0006\u0010g\u001a\u00020hH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010iJ\u0019\u0010j\u001a\u00020>2\u0006\u0010k\u001a\u00020:H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010lJ\u0019\u0010m\u001a\u00020>2\u0006\u0010k\u001a\u00020:H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010lJ'\u0010n\u001a\b\u0012\u0004\u0012\u0002080\u00122\u0006\u00102\u001a\u0002032\u0006\u0010o\u001a\u00020pH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010qR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0017\u0010\u0019R \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\u0019R\u001b\u0010&\u001a\u00020'8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006r"}, d2 = {"Lmx/openpay/library/core/OpenPaySdk;", "Lmx/openpay/library/core/OpenPaySdkIntegration;", "()V", "appContext", "Landroid/content/Context;", "bluetoothController", "Lmx/openpay/library/core/bluetooth/BluetoothController;", "getBluetoothController", "()Lmx/openpay/library/core/bluetooth/BluetoothController;", "bluetoothController$delegate", "Lkotlin/Lazy;", "bluetoothEnabled", "", "getBluetoothEnabled", "()Z", "bluetoothEnabled$delegate", "chargeTransaction", "Lkotlinx/coroutines/flow/SharedFlow;", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayChargeState;", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "getChargeTransaction", "()Lkotlinx/coroutines/flow/SharedFlow;", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isConnected$delegate", "mutableChargeResultState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "paymentLink", "Lmx/openpay/library/core/feature/PaymentLinkController;", "getPaymentLink", "()Lmx/openpay/library/core/feature/PaymentLinkController;", "paymentLink$delegate", "scannedDevices", "Lmx/openpay/library/core/model/OpenPayScanState;", "getScannedDevices", "scannedDevices$delegate", "tapOnPhoneController", "Lmx/openpay/library/core/feature/TapOnPhoneController;", "getTapOnPhoneController", "()Lmx/openpay/library/core/feature/TapOnPhoneController;", "tapOnPhoneController$delegate", "transaction", "Lmx/openpay/library/core/feature/TransactionController;", "getTransaction", "()Lmx/openpay/library/core/feature/TransactionController;", "transaction$delegate", "applyTransactionRefund", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "secureRefundTerminal", "transactionDTO", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/TransactionDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentLink", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLinkId", "", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPaymentLink", "closeConnection", "", "connectToBluetoothDevice", "deviceDTO", "Lmx/openpay/library/core/model/extra/DeviceDTO;", "(Lmx/openpay/library/core/model/extra/DeviceDTO;Lmx/openpay/library/core/model/extra/SecureTerminal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/core/model/PaymentLink;", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/PaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/appcompat/app/AppCompatActivity;", "orderTerminal", "Lmx/openpay/library/core/model/extra/OrderTerminal;", "(Landroidx/appcompat/app/AppCompatActivity;Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/OrderTerminal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expirePaymentLink", "transactionId", "initOpenPay", "context", "configuration", "Lmx/openpay/library/core/model/OpenPayConfiguration;", "isApplicationInitAllowed", "listDevicesScanned", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listTransactions", "transactionFilter", "Lmx/openpay/library/core/model/extra/TransactionFilter;", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageExecuteCharge", "chargeData", "Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;", "(Landroidx/appcompat/app/AppCompatActivity;Lmx/openpay/library/core/model/OpenPayTerminalChargeCreation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentLinkListing", "paymentLinkFilter", "Lmx/openpay/library/core/model/extra/PaymentLinkFilter;", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SecureTerminal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "scanNewDevices", "sendVoucher", "sendVoucherRequestDTO", "Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAuthRefundToken", "newToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAuthToken", "updatePaymentLink", "updatePaymentLinkData", "Lmx/openpay/library/core/model/extra/UpdatePaymentLink;", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OpenPaySdk implements OpenPaySdkIntegration {
    public static final int $stable;

    @NotNull
    public static final OpenPaySdk INSTANCE = new OpenPaySdk();
    private static Context appContext;

    /* JADX INFO: renamed from: bluetoothController$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy bluetoothController;

    /* JADX INFO: renamed from: bluetoothEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy bluetoothEnabled;

    @NotNull
    private static final SharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> chargeTransaction;

    /* JADX INFO: renamed from: isConnected$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isConnected;

    @NotNull
    private static MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableChargeResultState;

    /* JADX INFO: renamed from: paymentLink$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy paymentLink;

    /* JADX INFO: renamed from: scannedDevices$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy scannedDevices;

    /* JADX INFO: renamed from: tapOnPhoneController$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy tapOnPhoneController;

    /* JADX INFO: renamed from: transaction$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy transaction;

    static {
        MutableSharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        mutableChargeResultState = mutableSharedFlowMutableSharedFlow$default;
        chargeTransaction = mutableSharedFlowMutableSharedFlow$default;
        bluetoothController = LazyKt__LazyJVMKt.lazy(b.f71a);
        scannedDevices = LazyKt__LazyJVMKt.lazy(o.f124a);
        bluetoothEnabled = LazyKt__LazyJVMKt.lazy(c.f72a);
        isConnected = LazyKt__LazyJVMKt.lazy(j.f104a);
        paymentLink = LazyKt__LazyJVMKt.lazy(l.f110a);
        transaction = LazyKt__LazyJVMKt.lazy(r.f131a);
        tapOnPhoneController = LazyKt__LazyJVMKt.lazy(q.f130a);
        $stable = 8;
    }

    private OpenPaySdk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothController getBluetoothController() {
        return (BluetoothController) bluetoothController.getValue();
    }

    private final TransactionController getTransaction() {
        return (TransactionController) transaction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE", MagiskApp.WRITE_EXTERNAL_STORAGE})
    public final Object manageExecuteCharge(AppCompatActivity appCompatActivity, OpenPayTerminalChargeCreation openPayTerminalChargeCreation, Continuation<? super Unit> continuation) {
        Object objExecuteCharge$library_release = getBluetoothController().executeCharge$library_release(mutableChargeResultState, appCompatActivity, openPayTerminalChargeCreation, continuation);
        return objExecuteCharge$library_release == a.getCOROUTINE_SUSPENDED() ? objExecuteCharge$library_release : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object applyTransactionRefund(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureTerminal2, @NotNull TransactionDTO transactionDTO, @NotNull Continuation<? super OpenPayResult<TransactionDTO>> continuation) {
        a.a aVar;
        SecureTerminal secureTerminal3;
        OpenPaySdk openPaySdk;
        TransactionDTO transactionDTO2;
        OpenPayResult openPayResult;
        if (continuation instanceof a.a) {
            aVar = (a.a) continuation;
            int i10 = aVar.f69f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f69f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a.a(this, continuation);
            }
        } else {
            aVar = new a.a(this, continuation);
        }
        Object objExecuteRefundCharge$library_release = aVar.f67d;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f69f;
        if (i11 != 0) {
            if (i11 == 1) {
                transactionDTO = aVar.f66c;
                SecureTerminal secureTerminal4 = (SecureTerminal) aVar.f65b;
                OpenPaySdk openPaySdk2 = aVar.f64a;
                ResultKt.throwOnFailure(objExecuteRefundCharge$library_release);
                openPaySdk = openPaySdk2;
                secureTerminal3 = secureTerminal4;
            } else if (i11 == 2) {
                transactionDTO2 = (TransactionDTO) aVar.f65b;
                openPaySdk = aVar.f64a;
                ResultKt.throwOnFailure(objExecuteRefundCharge$library_release);
                OpenPayTransaction openPayTransactionMapTransactionDTOToLibraryModel = TransactionMapperKt.mapTransactionDTOToLibraryModel(transactionDTO2);
                BluetoothController bluetoothController2 = openPaySdk.getBluetoothController();
                aVar.f64a = null;
                aVar.f65b = null;
                aVar.f69f = 3;
                objExecuteRefundCharge$library_release = bluetoothController2.executeRefundCharge$library_release(openPayTransactionMapTransactionDTOToLibraryModel, aVar);
                if (objExecuteRefundCharge$library_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExecuteRefundCharge$library_release);
            }
            openPayResult = (OpenPayResult) objExecuteRefundCharge$library_release;
            if (openPayResult instanceof OpenPayResult.Failure) {
                return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
            }
            if (openPayResult instanceof OpenPayResult.Success) {
                return new OpenPayResult.Success(TransactionMapperKt.mapToLibraryModel((OpenPayTransaction) ((OpenPayResult.Success) openPayResult).getData()));
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objExecuteRefundCharge$library_release);
        String jws = secureTerminal.getJws();
        aVar.f64a = this;
        aVar.f65b = secureTerminal2;
        aVar.f66c = transactionDTO;
        aVar.f69f = 1;
        if (setAuthToken(jws, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        secureTerminal3 = secureTerminal2;
        openPaySdk = this;
        String jws2 = secureTerminal3.getJws();
        aVar.f64a = openPaySdk;
        aVar.f65b = transactionDTO;
        aVar.f66c = null;
        aVar.f69f = 2;
        if (openPaySdk.setAuthRefundToken(jws2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        transactionDTO2 = transactionDTO;
        OpenPayTransaction openPayTransactionMapTransactionDTOToLibraryModel2 = TransactionMapperKt.mapTransactionDTOToLibraryModel(transactionDTO2);
        BluetoothController bluetoothController3 = openPaySdk.getBluetoothController();
        aVar.f64a = null;
        aVar.f65b = null;
        aVar.f69f = 3;
        objExecuteRefundCharge$library_release = bluetoothController3.executeRefundCharge$library_release(openPayTransactionMapTransactionDTOToLibraryModel2, aVar);
        if (objExecuteRefundCharge$library_release == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPayResult = (OpenPayResult) objExecuteRefundCharge$library_release;
        if (openPayResult instanceof OpenPayResult.Failure) {
            return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
        }
        if (openPayResult instanceof OpenPayResult.Success) {
            return new OpenPayResult.Success(TransactionMapperKt.mapToLibraryModel((OpenPayTransaction) ((OpenPayResult.Success) openPayResult).getData()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object cancelPaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        d dVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f77e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f77e = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object objCancelPaymentLink = dVar.f75c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f77e;
        if (i11 != 0) {
            if (i11 == 1) {
                str = dVar.f74b;
                openPaySdk = dVar.f73a;
                ResultKt.throwOnFailure(objCancelPaymentLink);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCancelPaymentLink);
            }
        }
        ResultKt.throwOnFailure(objCancelPaymentLink);
        String jws = secureTerminal.getJws();
        dVar.f73a = this;
        dVar.f74b = str;
        dVar.f77e = 1;
        if (setAuthToken(jws, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink2 = openPaySdk.getPaymentLink();
        dVar.f73a = null;
        dVar.f74b = null;
        dVar.f77e = 2;
        objCancelPaymentLink = paymentLink2.cancelPaymentLink(str, dVar);
        return objCancelPaymentLink == coroutine_suspended ? coroutine_suspended : objCancelPaymentLink;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkPaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        e eVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f82e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f82e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, continuation);
            }
        } else {
            eVar = new e(this, continuation);
        }
        Object objCheckPaymentLink = eVar.f80c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f82e;
        if (i11 != 0) {
            if (i11 == 1) {
                str = eVar.f79b;
                openPaySdk = eVar.f78a;
                ResultKt.throwOnFailure(objCheckPaymentLink);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckPaymentLink);
            }
        }
        ResultKt.throwOnFailure(objCheckPaymentLink);
        String jws = secureTerminal.getJws();
        eVar.f78a = this;
        eVar.f79b = str;
        eVar.f82e = 1;
        if (setAuthToken(jws, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink2 = openPaySdk.getPaymentLink();
        eVar.f78a = null;
        eVar.f79b = null;
        eVar.f82e = 2;
        objCheckPaymentLink = paymentLink2.checkPaymentLink(str, eVar);
        return objCheckPaymentLink == coroutine_suspended ? coroutine_suspended : objCheckPaymentLink;
    }

    public final void closeConnection() {
        getBluetoothController().closeConnection();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object connectToBluetoothDevice(@NotNull DeviceDTO deviceDTO, @NotNull SecureTerminal secureTerminal, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        f fVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f87e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f87e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object objStartDeviceConnection = fVar.f85c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f87e;
        if (i11 != 0) {
            if (i11 == 1) {
                deviceDTO = fVar.f84b;
                openPaySdk = fVar.f83a;
                ResultKt.throwOnFailure(objStartDeviceConnection);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStartDeviceConnection);
            }
        }
        ResultKt.throwOnFailure(objStartDeviceConnection);
        String jws = secureTerminal.getJws();
        fVar.f83a = this;
        fVar.f84b = deviceDTO;
        fVar.f87e = 1;
        if (setAuthToken(jws, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        BluetoothController bluetoothController2 = openPaySdk.getBluetoothController();
        OpenPayDevice openPayDeviceMapDeviceToLibraryModel = DeviceMapperKt.mapDeviceToLibraryModel(deviceDTO);
        fVar.f83a = null;
        fVar.f84b = null;
        fVar.f87e = 2;
        objStartDeviceConnection = bluetoothController2.startDeviceConnection(openPayDeviceMapDeviceToLibraryModel, fVar);
        return objStartDeviceConnection == coroutine_suspended ? coroutine_suspended : objStartDeviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object createPaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLink paymentLink2, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        g gVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f92e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f92e = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, continuation);
            }
        } else {
            gVar = new g(this, continuation);
        }
        Object objCreatePayLink = gVar.f90c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f92e;
        if (i11 != 0) {
            if (i11 == 1) {
                paymentLink2 = gVar.f89b;
                openPaySdk = gVar.f88a;
                ResultKt.throwOnFailure(objCreatePayLink);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreatePayLink);
            }
        }
        ResultKt.throwOnFailure(objCreatePayLink);
        String jws = secureTerminal.getJws();
        gVar.f88a = this;
        gVar.f89b = paymentLink2;
        gVar.f92e = 1;
        if (setAuthToken(jws, gVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink3 = openPaySdk.getPaymentLink();
        OpenPayCreatePaymentLink openPayCreatePaymentLinkMapToLibraryModel = PaymentLinkMapperKt.mapToLibraryModel(paymentLink2);
        gVar.f88a = null;
        gVar.f89b = null;
        gVar.f92e = 2;
        objCreatePayLink = paymentLink3.createPayLink(openPayCreatePaymentLinkMapToLibraryModel, gVar);
        return objCreatePayLink == coroutine_suspended ? coroutine_suspended : objCreatePayLink;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE", MagiskApp.WRITE_EXTERNAL_STORAGE})
    @Nullable
    public final Object executeCharge(@NotNull AppCompatActivity appCompatActivity, @NotNull SecureTerminal secureTerminal, @NotNull OrderTerminal orderTerminal, @NotNull Continuation<? super Unit> continuation) {
        h hVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f98f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f98f = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object obj = hVar.f96d;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f98f;
        if (i11 != 0) {
            if (i11 == 1) {
                orderTerminal = hVar.f95c;
                appCompatActivity = hVar.f94b;
                openPaySdk = hVar.f93a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String jws = secureTerminal.getJws();
        hVar.f93a = this;
        hVar.f94b = appCompatActivity;
        hVar.f95c = orderTerminal;
        hVar.f98f = 1;
        if (setAuthToken(jws, hVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(orderTerminal.getAmount()));
        String orderId = orderTerminal.getOrderId();
        Integer numBoxInt = Boxing.boxInt(orderTerminal.getMonths());
        String description = orderTerminal.getDescription();
        if (description == null) {
            description = "";
        }
        OpenPayTerminalChargeCreation openPayTerminalChargeCreation = new OpenPayTerminalChargeCreation(bigDecimal, orderId, numBoxInt, description);
        hVar.f93a = null;
        hVar.f94b = null;
        hVar.f95c = null;
        hVar.f98f = 2;
        if (openPaySdk.manageExecuteCharge(appCompatActivity, openPayTerminalChargeCreation, hVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object expirePaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        i iVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f103e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f103e = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, continuation);
            }
        } else {
            iVar = new i(this, continuation);
        }
        Object objExpirePaymentLink = iVar.f101c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = iVar.f103e;
        if (i11 != 0) {
            if (i11 == 1) {
                str = iVar.f100b;
                openPaySdk = iVar.f99a;
                ResultKt.throwOnFailure(objExpirePaymentLink);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExpirePaymentLink);
            }
        }
        ResultKt.throwOnFailure(objExpirePaymentLink);
        String jws = secureTerminal.getJws();
        iVar.f99a = this;
        iVar.f100b = str;
        iVar.f103e = 1;
        if (setAuthToken(jws, iVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink2 = openPaySdk.getPaymentLink();
        iVar.f99a = null;
        iVar.f100b = null;
        iVar.f103e = 2;
        objExpirePaymentLink = paymentLink2.expirePaymentLink(str, iVar);
        return objExpirePaymentLink == coroutine_suspended ? coroutine_suspended : objExpirePaymentLink;
    }

    public final boolean getBluetoothEnabled() {
        return ((Boolean) bluetoothEnabled.getValue()).booleanValue();
    }

    @NotNull
    public final SharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> getChargeTransaction() {
        return chargeTransaction;
    }

    @NotNull
    public final PaymentLinkController getPaymentLink() {
        return (PaymentLinkController) paymentLink.getValue();
    }

    @NotNull
    public final StateFlow<OpenPayScanState> getScannedDevices() {
        return (StateFlow) scannedDevices.getValue();
    }

    @Override // mx.openpay.library.core.OpenPaySdkIntegration
    @NotNull
    public TapOnPhoneController getTapOnPhoneController() {
        return (TapOnPhoneController) tapOnPhoneController.getValue();
    }

    @Override // mx.openpay.library.core.OpenPaySdkIntegration
    public void initOpenPay(@NotNull Context context, @NotNull OpenPayConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        appContext = context;
        DependenciesProvider.INSTANCE.init(context, OpenPayConfigurationMapperKt.mapToDomainModel(configuration));
    }

    public final boolean isApplicationInitAllowed() {
        return DependenciesProvider.TapOnPhoneModule.INSTANCE.provideIsApplicationInitAllowedUseCase().invoke();
    }

    @NotNull
    public final StateFlow<Boolean> isConnected() {
        return (StateFlow) isConnected.getValue();
    }

    @Nullable
    public final Object listDevicesScanned(@NotNull Continuation<? super OpenPayResult<? extends List<DeviceDTO>>> continuation) {
        return getBluetoothController().listDevicesScanned(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object listTransactions(@NotNull SecureTerminal secureTerminal, @NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super OpenPayResult<? extends List<TransactionDTO>>> continuation) {
        k kVar;
        OpenPayTransactionFilter openPayTransactionFilter;
        OpenPaySdk openPaySdk;
        OpenPayResult openPayResult;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f109e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f109e = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, continuation);
            }
        } else {
            kVar = new k(this, continuation);
        }
        Object transactions = kVar.f107c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.f109e;
        if (i11 != 0) {
            if (i11 == 1) {
                openPayTransactionFilter = kVar.f106b;
                openPaySdk = kVar.f105a;
                ResultKt.throwOnFailure(transactions);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(transactions);
            }
            openPayResult = (OpenPayResult) transactions;
            if (openPayResult instanceof OpenPayResult.Failure) {
                return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
            }
            if (openPayResult instanceof OpenPayResult.Success) {
                return new OpenPayResult.Success(TransactionMapperKt.toLibraryTransactionToDTOModelList((List) ((OpenPayResult.Success) openPayResult).getData()));
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(transactions);
        OpenPayTransactionFilter openPayTransactionFilterMapToLibraryModel = TransactionFilterMapperKt.mapToLibraryModel(transactionFilter);
        String jws = secureTerminal.getJws();
        kVar.f105a = this;
        kVar.f106b = openPayTransactionFilterMapToLibraryModel;
        kVar.f109e = 1;
        if (setAuthToken(jws, kVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPayTransactionFilter = openPayTransactionFilterMapToLibraryModel;
        openPaySdk = this;
        TransactionController transaction2 = openPaySdk.getTransaction();
        kVar.f105a = null;
        kVar.f106b = null;
        kVar.f109e = 2;
        transactions = transaction2.getTransactions(openPayTransactionFilter, kVar);
        if (transactions == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPayResult = (OpenPayResult) transactions;
        if (openPayResult instanceof OpenPayResult.Failure) {
            return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
        }
        if (openPayResult instanceof OpenPayResult.Success) {
            return new OpenPayResult.Success(TransactionMapperKt.toLibraryTransactionToDTOModelList((List) ((OpenPayResult.Success) openPayResult).getData()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object paymentLinkListing(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super OpenPayResult<? extends List<OpenPayPaymentLink>>> continuation) {
        m mVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i10 = mVar.f115e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f115e = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, continuation);
            }
        } else {
            mVar = new m(this, continuation);
        }
        Object allPaymentLinks = mVar.f113c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = mVar.f115e;
        if (i11 != 0) {
            if (i11 == 1) {
                paymentLinkFilter = mVar.f112b;
                openPaySdk = mVar.f111a;
                ResultKt.throwOnFailure(allPaymentLinks);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(allPaymentLinks);
            }
        }
        ResultKt.throwOnFailure(allPaymentLinks);
        String jws = secureTerminal.getJws();
        mVar.f111a = this;
        mVar.f112b = paymentLinkFilter;
        mVar.f115e = 1;
        if (setAuthToken(jws, mVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink2 = openPaySdk.getPaymentLink();
        OpenPayPaymentLinkFilter openPayPaymentLinkFilterMapToLibraryModel = PaymentLinkFilterMapperKt.mapToLibraryModel(paymentLinkFilter);
        mVar.f111a = null;
        mVar.f112b = null;
        mVar.f115e = 2;
        allPaymentLinks = paymentLink2.getAllPaymentLinks(openPayPaymentLinkFilterMapToLibraryModel, mVar);
        return allPaymentLinks == coroutine_suspended ? coroutine_suspended : allPaymentLinks;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object refundPaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureTerminal2, @NotNull String str, @NotNull Continuation<? super OpenPayResult<TransactionDTO>> continuation) {
        n nVar;
        SecureTerminal secureTerminal3;
        String str2;
        OpenPaySdk openPaySdk;
        OpenPaySdk openPaySdk2;
        String str3;
        OpenPayResult openPayResult;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i10 = nVar.f123f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f123f = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, continuation);
            }
        } else {
            nVar = new n(this, continuation);
        }
        Object objRefundPaymentLink = nVar.f121d;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = nVar.f123f;
        if (i11 != 0) {
            if (i11 == 1) {
                String str4 = nVar.f120c;
                SecureTerminal secureTerminal4 = (SecureTerminal) nVar.f119b;
                OpenPaySdk openPaySdk3 = nVar.f118a;
                ResultKt.throwOnFailure(objRefundPaymentLink);
                openPaySdk = openPaySdk3;
                str2 = str4;
                secureTerminal3 = secureTerminal4;
            } else if (i11 == 2) {
                str3 = (String) nVar.f119b;
                openPaySdk2 = nVar.f118a;
                ResultKt.throwOnFailure(objRefundPaymentLink);
                PaymentLinkController paymentLink2 = openPaySdk2.getPaymentLink();
                nVar.f118a = null;
                nVar.f119b = null;
                nVar.f123f = 3;
                objRefundPaymentLink = paymentLink2.refundPaymentLink(str3, nVar);
                if (objRefundPaymentLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRefundPaymentLink);
            }
            openPayResult = (OpenPayResult) objRefundPaymentLink;
            if (openPayResult instanceof OpenPayResult.Failure) {
                return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
            }
            if (openPayResult instanceof OpenPayResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            TransactionDTO transactionDTOMapToLibraryModel = TransactionMapperKt.mapToLibraryModel((OpenPayTransaction) ((OpenPayResult.Success) openPayResult).getData());
            String upperCase = transactionDTOMapToLibraryModel.getMethod().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return new OpenPayResult.Success(transactionDTOMapToLibraryModel.copy((58720255 & 1) != 0 ? transactionDTOMapToLibraryModel.id : null, (58720255 & 2) != 0 ? transactionDTOMapToLibraryModel.authorization : null, (58720255 & 4) != 0 ? transactionDTOMapToLibraryModel.operationType : null, (58720255 & 8) != 0 ? transactionDTOMapToLibraryModel.transactionType : null, (58720255 & 16) != 0 ? transactionDTOMapToLibraryModel.status : null, (58720255 & 32) != 0 ? transactionDTOMapToLibraryModel.conciliated : false, (58720255 & 64) != 0 ? transactionDTOMapToLibraryModel.creationDate : null, (58720255 & 128) != 0 ? transactionDTOMapToLibraryModel.operationDate : null, (58720255 & 256) != 0 ? transactionDTOMapToLibraryModel.description : null, (58720255 & 512) != 0 ? transactionDTOMapToLibraryModel.errorMessage : null, (58720255 & 1024) != 0 ? transactionDTOMapToLibraryModel.customerId : null, (58720255 & 2048) != 0 ? transactionDTOMapToLibraryModel.dueDate : null, (58720255 & 4096) != 0 ? transactionDTOMapToLibraryModel.orderId : null, (58720255 & 8192) != 0 ? transactionDTOMapToLibraryModel.amount : 0.0d, (58720255 & 16384) != 0 ? transactionDTOMapToLibraryModel.currency : null, (32768 & 58720255) != 0 ? transactionDTOMapToLibraryModel.method : null, (58720255 & 65536) != 0 ? transactionDTOMapToLibraryModel.refunds : null, (58720255 & 131072) != 0 ? transactionDTOMapToLibraryModel.gatewayCardPresent : null, (58720255 & 262144) != 0 ? transactionDTOMapToLibraryModel.card : null, (58720255 & 524288) != 0 ? transactionDTOMapToLibraryModel.readMode : null, (58720255 & 1048576) != 0 ? transactionDTOMapToLibraryModel.iva : 0.0d, (58720255 & 2097152) != 0 ? transactionDTOMapToLibraryModel.fee : null, (4194304 & 58720255) != 0 ? transactionDTOMapToLibraryModel.originChannelName : null, (58720255 & 8388608) != 0 ? transactionDTOMapToLibraryModel.paymentMethodName : upperCase, (58720255 & 16777216) != 0 ? transactionDTOMapToLibraryModel.paymentPlan : null, (58720255 & 33554432) != 0 ? transactionDTOMapToLibraryModel.productType : null));
        }
        ResultKt.throwOnFailure(objRefundPaymentLink);
        String jws = secureTerminal.getJws();
        nVar.f118a = this;
        secureTerminal3 = secureTerminal2;
        nVar.f119b = secureTerminal3;
        str2 = str;
        nVar.f120c = str2;
        nVar.f123f = 1;
        if (setAuthToken(jws, nVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        String jws2 = secureTerminal3.getJws();
        nVar.f118a = openPaySdk;
        nVar.f119b = str2;
        nVar.f120c = null;
        nVar.f123f = 2;
        if (openPaySdk.setAuthRefundToken(jws2, nVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk2 = openPaySdk;
        str3 = str2;
        PaymentLinkController paymentLink3 = openPaySdk2.getPaymentLink();
        nVar.f118a = null;
        nVar.f119b = null;
        nVar.f123f = 3;
        objRefundPaymentLink = paymentLink3.refundPaymentLink(str3, nVar);
        if (objRefundPaymentLink == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPayResult = (OpenPayResult) objRefundPaymentLink;
        if (openPayResult instanceof OpenPayResult.Failure) {
            return new OpenPayResult.Failure(((OpenPayResult.Failure) openPayResult).getError());
        }
        if (openPayResult instanceof OpenPayResult.Success) {
            throw new NoWhenBranchMatchedException();
        }
        TransactionDTO transactionDTOMapToLibraryModel2 = TransactionMapperKt.mapToLibraryModel((OpenPayTransaction) ((OpenPayResult.Success) openPayResult).getData());
        String upperCase2 = transactionDTOMapToLibraryModel2.getMethod().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return new OpenPayResult.Success(transactionDTOMapToLibraryModel2.copy((58720255 & 1) != 0 ? transactionDTOMapToLibraryModel2.id : null, (58720255 & 2) != 0 ? transactionDTOMapToLibraryModel2.authorization : null, (58720255 & 4) != 0 ? transactionDTOMapToLibraryModel2.operationType : null, (58720255 & 8) != 0 ? transactionDTOMapToLibraryModel2.transactionType : null, (58720255 & 16) != 0 ? transactionDTOMapToLibraryModel2.status : null, (58720255 & 32) != 0 ? transactionDTOMapToLibraryModel2.conciliated : false, (58720255 & 64) != 0 ? transactionDTOMapToLibraryModel2.creationDate : null, (58720255 & 128) != 0 ? transactionDTOMapToLibraryModel2.operationDate : null, (58720255 & 256) != 0 ? transactionDTOMapToLibraryModel2.description : null, (58720255 & 512) != 0 ? transactionDTOMapToLibraryModel2.errorMessage : null, (58720255 & 1024) != 0 ? transactionDTOMapToLibraryModel2.customerId : null, (58720255 & 2048) != 0 ? transactionDTOMapToLibraryModel2.dueDate : null, (58720255 & 4096) != 0 ? transactionDTOMapToLibraryModel2.orderId : null, (58720255 & 8192) != 0 ? transactionDTOMapToLibraryModel2.amount : 0.0d, (58720255 & 16384) != 0 ? transactionDTOMapToLibraryModel2.currency : null, (32768 & 58720255) != 0 ? transactionDTOMapToLibraryModel2.method : null, (58720255 & 65536) != 0 ? transactionDTOMapToLibraryModel2.refunds : null, (58720255 & 131072) != 0 ? transactionDTOMapToLibraryModel2.gatewayCardPresent : null, (58720255 & 262144) != 0 ? transactionDTOMapToLibraryModel2.card : null, (58720255 & 524288) != 0 ? transactionDTOMapToLibraryModel2.readMode : null, (58720255 & 1048576) != 0 ? transactionDTOMapToLibraryModel2.iva : 0.0d, (58720255 & 2097152) != 0 ? transactionDTOMapToLibraryModel2.fee : null, (4194304 & 58720255) != 0 ? transactionDTOMapToLibraryModel2.originChannelName : null, (58720255 & 8388608) != 0 ? transactionDTOMapToLibraryModel2.paymentMethodName : upperCase2, (58720255 & 16777216) != 0 ? transactionDTOMapToLibraryModel2.paymentPlan : null, (58720255 & 33554432) != 0 ? transactionDTOMapToLibraryModel2.productType : null));
    }

    public final void release() {
        getBluetoothController().release();
    }

    @NotNull
    public final OpenPayResult<String> scanNewDevices() {
        return getBluetoothController().startDiscovery();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendVoucher(@NotNull SecureTerminal secureTerminal, @NotNull SendVoucherRequestDTO sendVoucherRequestDTO, @NotNull Continuation<? super OpenPayResult<Boolean>> continuation) {
        p pVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i10 = pVar.f129e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f129e = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, continuation);
            }
        } else {
            pVar = new p(this, continuation);
        }
        Object objSendVoucher = pVar.f127c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = pVar.f129e;
        if (i11 != 0) {
            if (i11 == 1) {
                sendVoucherRequestDTO = pVar.f126b;
                openPaySdk = pVar.f125a;
                ResultKt.throwOnFailure(objSendVoucher);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendVoucher);
            }
        }
        ResultKt.throwOnFailure(objSendVoucher);
        String jws = secureTerminal.getJws();
        pVar.f125a = this;
        pVar.f126b = sendVoucherRequestDTO;
        pVar.f129e = 1;
        if (setAuthToken(jws, pVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        TransactionController transaction2 = openPaySdk.getTransaction();
        OpenPaySendVoucher openPaySendVoucherMapToLibraryModel = SendVoucherMapperKt.mapToLibraryModel(sendVoucherRequestDTO);
        pVar.f125a = null;
        pVar.f126b = null;
        pVar.f129e = 2;
        objSendVoucher = transaction2.sendVoucher(openPaySendVoucherMapToLibraryModel, pVar);
        return objSendVoucher == coroutine_suspended ? coroutine_suspended : objSendVoucher;
    }

    @Override // mx.openpay.library.core.OpenPaySdkIntegration
    @Nullable
    public Object setAuthRefundToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveJwtRefundToken = DependenciesProvider.INSTANCE.getTokenRepository().saveJwtRefundToken(str, continuation);
        return objSaveJwtRefundToken == a.getCOROUTINE_SUSPENDED() ? objSaveJwtRefundToken : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.core.OpenPaySdkIntegration
    @Nullable
    public Object setAuthToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveJwtToken = DependenciesProvider.INSTANCE.getTokenRepository().saveJwtToken(str, continuation);
        return objSaveJwtToken == a.getCOROUTINE_SUSPENDED() ? objSaveJwtToken : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updatePaymentLink(@NotNull SecureTerminal secureTerminal, @NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        s sVar;
        OpenPaySdk openPaySdk;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i10 = sVar.f136e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f136e = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, continuation);
            }
        } else {
            sVar = new s(this, continuation);
        }
        Object objUpdatePaymentLink = sVar.f134c;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = sVar.f136e;
        if (i11 != 0) {
            if (i11 == 1) {
                updatePaymentLink = sVar.f133b;
                openPaySdk = sVar.f132a;
                ResultKt.throwOnFailure(objUpdatePaymentLink);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdatePaymentLink);
            }
        }
        ResultKt.throwOnFailure(objUpdatePaymentLink);
        String jws = secureTerminal.getJws();
        sVar.f132a = this;
        sVar.f133b = updatePaymentLink;
        sVar.f136e = 1;
        if (setAuthToken(jws, sVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        openPaySdk = this;
        PaymentLinkController paymentLink2 = openPaySdk.getPaymentLink();
        OpenPayUpdatePaymentLink openPayUpdatePaymentLinkMapToLibraryModel = PaymentLinkMapperKt.mapToLibraryModel(updatePaymentLink);
        sVar.f132a = null;
        sVar.f133b = null;
        sVar.f136e = 2;
        objUpdatePaymentLink = paymentLink2.updatePaymentLink(openPayUpdatePaymentLinkMapToLibraryModel, sVar);
        return objUpdatePaymentLink == coroutine_suspended ? coroutine_suspended : objUpdatePaymentLink;
    }
}
