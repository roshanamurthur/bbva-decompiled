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

/* JADX INFO: compiled from: ExecuteTapOnPhoneChargePlansStepUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePlansStepUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePlansStepUseCase;", "()V", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "selectedPlan", "", "(Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExecuteTapOnPhoneChargePlansStepUseCaseImpl implements ExecuteTapOnPhoneChargePlansStepUseCase {
    @Override // mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePlansStepUseCase
    @Nullable
    public Object invoke(@NotNull TapOnPhoneController tapOnPhoneController, @NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return tapOnPhoneController.createChargePlansStep(createCharge, tapOnPhoneCallback, i10, continuation);
    }
}
