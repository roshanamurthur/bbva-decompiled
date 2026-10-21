package mx.openpay.library.domain.usecase.taponphone;

import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CancelTapOnPhoneProcessUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/CancelTapOnPhoneProcessUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/CancelTapOnPhoneProcessUseCase;", "()V", "invoke", "", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "(Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CancelTapOnPhoneProcessUseCaseImpl implements CancelTapOnPhoneProcessUseCase {
    @Override // mx.openpay.library.domain.usecase.taponphone.CancelTapOnPhoneProcessUseCase
    @Nullable
    public Object invoke(@NotNull TapOnPhoneController tapOnPhoneController, @NotNull Continuation<? super Unit> continuation) {
        Object objCancelProcess = tapOnPhoneController.cancelProcess(continuation);
        return objCancelProcess == a.getCOROUTINE_SUSPENDED() ? objCancelProcess : Unit.INSTANCE;
    }
}
