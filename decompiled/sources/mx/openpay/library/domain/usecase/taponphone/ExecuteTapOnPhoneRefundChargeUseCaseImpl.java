package mx.openpay.library.domain.usecase.taponphone;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExecuteTapOnPhoneRefundChargeUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneRefundChargeUseCaseImpl;", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneRefundChargeUseCase;", "()V", "invoke", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/transaction/Transaction;", "tapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "transaction", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "(Lmx/openpay/library/domain/taponphone/TapOnPhoneController;Lmx/openpay/library/domain/model/transaction/Transaction;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExecuteTapOnPhoneRefundChargeUseCaseImpl implements ExecuteTapOnPhoneRefundChargeUseCase {
    @Override // mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneRefundChargeUseCase
    @Nullable
    public Object invoke(@NotNull TapOnPhoneController tapOnPhoneController, @NotNull Transaction transaction, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Transaction>> continuation) {
        return tapOnPhoneController.executeRefundCharge(transaction, tapOnPhoneCallback, continuation);
    }
}
