package mx.openpay.library.domain.usecase.paymentlink;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.repository.PaymentLinkRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAllPaymentLinksUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCaseImpl;", "Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCase;", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "paymentLinkFilter", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/link/PaymentLink;", "invoke", "(Lmx/openpay/library/domain/model/link/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/PaymentLinkRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class GetAllPaymentLinksUseCaseImpl implements GetAllPaymentLinksUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PaymentLinkRepository f84288a;

    public GetAllPaymentLinksUseCaseImpl(@NotNull PaymentLinkRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84288a = repository;
    }

    @Override // mx.openpay.library.domain.usecase.paymentlink.GetAllPaymentLinksUseCase
    @Nullable
    public Object invoke(@NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<PaymentLink>>> continuation) {
        return this.f84288a.getAllPaymentLinks(paymentLinkFilter, continuation);
    }
}
