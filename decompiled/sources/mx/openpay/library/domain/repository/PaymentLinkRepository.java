package mx.openpay.library.domain.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u00032\u0006\u0010\r\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0012\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "", "checkPaymentLink", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/link/PaymentLink;", "paymentLinkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/domain/model/link/CreatePaymentLink;", "(Lmx/openpay/library/domain/model/link/CreatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPaymentLinks", "", "paymentLinkFilter", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "(Lmx/openpay/library/domain/model/link/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionId", "updatePaymentLink", "Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "(Lmx/openpay/library/domain/model/link/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLinkStatus", "status", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaymentLinkRepository {
    @Nullable
    Object checkPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<PaymentLink>> continuation);

    @Nullable
    Object createPaymentLink(@NotNull CreatePaymentLink createPaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation);

    @Nullable
    Object getAllPaymentLinks(@NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<PaymentLink>>> continuation);

    @Nullable
    Object refundPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object updatePaymentLink(@NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation);

    @Nullable
    Object updatePaymentLinkStatus(@NotNull String str, @NotNull PaymentLinkStatus paymentLinkStatus, @NotNull Continuation<? super Result<PaymentLink>> continuation);
}
