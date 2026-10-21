package mx.openpay.library.domain.usecase.eglobal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InsertConnectedDeviceInfoUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/InsertConnectedDeviceInfoUseCase;", "", "invoke", "", "connectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InsertConnectedDeviceInfoUseCase {
    @Nullable
    Object invoke(@NotNull ConnectedDeviceQ8 connectedDeviceQ8, @NotNull Continuation<? super Unit> continuation);
}
