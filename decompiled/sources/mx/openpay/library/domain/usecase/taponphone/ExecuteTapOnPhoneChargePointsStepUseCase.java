package mx.openpay.library.domain.usecase.taponphone;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExecuteTapOnPhoneChargePointsStepUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH¦Bø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePointsStepUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "withPoints", "", "(Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ExecuteTapOnPhoneChargePointsStepUseCase {
    @Nullable
    Object invoke(@NotNull TapOnPhoneController tapOnPhoneController, @NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation);
}
