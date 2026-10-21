package mx.openpay.library.domain.bluetooth;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BluetoothController.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H&J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0014\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0016\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J1\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0016\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010#\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J'\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010\u0016\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00132\u0006\u0010+\u001a\u00020*H¦@ø\u0001\u0000¢\u0006\u0002\u0010,J\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0011H&J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u00101\u001a\u000202H\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020'0\u0013H&J\b\u00105\u001a\u00020\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lmx/openpay/library/domain/bluetooth/BluetoothController;", "", "()V", "bluetoothEnabled", "", "getBluetoothEnabled", "()Z", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "pairedDevices", "", "Lmx/openpay/library/domain/bluetooth/Device;", "getPairedDevices", "scannedDevices", "getScannedDevices", "closeConnection", "", "connectDevice", "Lmx/openpay/library/domain/util/Result;", Constants.device, "(Lmx/openpay/library/domain/bluetooth/Device;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCharge", "Lmx/openpay/library/domain/model/eglobal/Charge;", "chargeRequest", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "chargeCallback", "Lmx/openpay/library/domain/model/common/ChargeCallback;", "(Lmx/openpay/library/domain/model/common/ChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalPlansStep", "Lmx/openpay/library/domain/model/CreateCharge;", "plans", "", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/common/ChargeCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalPointsStep", "withPoints", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/common/ChargeCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalSignStep", AuthConstants.IMAGE, "", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transaction", "(Lmx/openpay/library/domain/model/transaction/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listDevicesScanned", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "sendFile", "firmwareResponse", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDiscovery", "stopDiscovery", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BluetoothController {
    public static /* synthetic */ Object createChargeEglobalPlansStep$suspendImpl(BluetoothController bluetoothController, CreateCharge createCharge, ChargeCallback chargeCallback, int i10, Continuation<? super Result<Charge>> continuation) {
        return new Result.Failure(Error.NotImplemented.INSTANCE);
    }

    public static /* synthetic */ Object createChargeEglobalPointsStep$suspendImpl(BluetoothController bluetoothController, CreateCharge createCharge, ChargeCallback chargeCallback, boolean z10, Continuation<? super Result<Charge>> continuation) {
        return new Result.Failure(Error.NotImplemented.INSTANCE);
    }

    public static /* synthetic */ Object createChargeEglobalSignStep$suspendImpl(BluetoothController bluetoothController, CreateCharge createCharge, String str, Continuation<? super Result<Charge>> continuation) {
        return new Result.Failure(Error.NotImplemented.INSTANCE);
    }

    public static /* synthetic */ Object sendFile$suspendImpl(BluetoothController bluetoothController, byte[] bArr, Continuation<? super Result<Boolean>> continuation) {
        return new Result.Failure(Error.NotImplemented.INSTANCE);
    }

    public abstract void closeConnection();

    @Nullable
    public abstract Object connectDevice(@NotNull Device device, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    public abstract Object createCharge(@NotNull ChargeRequest chargeRequest, @Nullable ChargeCallback chargeCallback, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    public Object createChargeEglobalPlansStep(@NotNull CreateCharge createCharge, @Nullable ChargeCallback chargeCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return createChargeEglobalPlansStep$suspendImpl(this, createCharge, chargeCallback, i10, continuation);
    }

    @Nullable
    public Object createChargeEglobalPointsStep(@NotNull CreateCharge createCharge, @Nullable ChargeCallback chargeCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return createChargeEglobalPointsStep$suspendImpl(this, createCharge, chargeCallback, z10, continuation);
    }

    @Nullable
    public Object createChargeEglobalSignStep(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Result<Charge>> continuation) {
        return createChargeEglobalSignStep$suspendImpl(this, createCharge, str, continuation);
    }

    @Nullable
    public abstract Object executeRefundCharge(@NotNull Transaction transaction, @NotNull Continuation<? super Result<Transaction>> continuation);

    public abstract boolean getBluetoothEnabled();

    @NotNull
    public abstract StateFlow<List<Device>> getPairedDevices();

    @NotNull
    public abstract StateFlow<List<Device>> getScannedDevices();

    @NotNull
    public abstract StateFlow<Boolean> isConnected();

    @Nullable
    public abstract Object listDevicesScanned(@NotNull Continuation<? super Result<? extends List<? extends Device>>> continuation);

    public abstract void release();

    @Nullable
    public Object sendFile(@NotNull byte[] bArr, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return sendFile$suspendImpl(this, bArr, continuation);
    }

    @NotNull
    public abstract Result<String> startDiscovery();

    public abstract void stopDiscovery();
}
