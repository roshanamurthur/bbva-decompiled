package mx.openpay.library.domain.usecase.paymentlink;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAllPaymentLinksUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦Bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCase;", "", "invoke", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/link/PaymentLink;", "paymentLinkFilter", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "(Lmx/openpay/library/domain/model/link/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetAllPaymentLinksUseCase {
    @Nullable
    Object invoke(@NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<PaymentLink>>> continuation);
}
