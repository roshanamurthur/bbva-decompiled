package mx.openpay.library.domain.usecase.taponphone;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.taponphone.InitResult;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitTapOnPhoneUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/InitTapOnPhoneUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/InitTapOnPhoneUseCase;", "()V", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/taponphone/InitResult;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "(Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitTapOnPhoneUseCaseImpl implements InitTapOnPhoneUseCase {
    @Override // mx.openpay.library.domain.usecase.taponphone.InitTapOnPhoneUseCase
    @Nullable
    public Object invoke(@NotNull TapOnPhoneController tapOnPhoneController, @NotNull Continuation<? super Result<InitResult>> continuation) {
        return tapOnPhoneController.initTapOnPhone(continuation);
    }
}
