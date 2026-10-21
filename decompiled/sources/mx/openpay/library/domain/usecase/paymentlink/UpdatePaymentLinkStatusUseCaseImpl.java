package mx.openpay.library.domain.usecase.paymentlink;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.repository.PaymentLinkRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdatePaymentLinkStatusUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096Bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkStatusUseCaseImpl;", "Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkStatusUseCase;", "", "paymentLinkId", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "status", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/link/PaymentLink;", "invoke", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/PaymentLinkRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class UpdatePaymentLinkStatusUseCaseImpl implements UpdatePaymentLinkStatusUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PaymentLinkRepository f84290a;

    public UpdatePaymentLinkStatusUseCaseImpl(@NotNull PaymentLinkRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84290a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.paymentlink.UpdatePaymentLinkStatusUseCase
    @Nullable
    public Object invoke(@NotNull String str, @NotNull PaymentLinkStatus paymentLinkStatus, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        return this.f84290a.updatePaymentLinkStatus(str, paymentLinkStatus, continuation);
    }
}
