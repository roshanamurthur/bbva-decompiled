package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.bluetooth.BluetoothController;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExecuteChargeUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦Bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "bluetoothController", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "chargeRequest", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "chargeCallback", "Lmx/openpay/library/domain/model/common/ChargeCallback;", "(Lmx/openpay/library/domain/bluetooth/BluetoothController;Lmx/openpay/library/domain/model/common/ChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExecuteChargeUseCase {
    @Nullable
    Object invoke(@NotNull BluetoothController bluetoothController, @NotNull ChargeRequest chargeRequest, @NotNull ChargeCallback chargeCallback, @NotNull Continuation<? super Result<Charge>> continuation);
}
