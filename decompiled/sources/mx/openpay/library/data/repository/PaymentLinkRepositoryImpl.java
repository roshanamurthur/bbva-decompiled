package mx.openpay.library.data.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.datasource.PaymentLinkRemoteDataSource;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.repository.PaymentLinkRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentLinkRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lmx/openpay/library/data/repository/PaymentLinkRepositoryImpl;", "Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "paymentLinkDataSource", "Lmx/openpay/library/domain/datasource/PaymentLinkRemoteDataSource;", "(Lmx/openpay/library/domain/datasource/PaymentLinkRemoteDataSource;)V", "checkPaymentLink", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/link/PaymentLink;", "paymentLinkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/domain/model/link/CreatePaymentLink;", "(Lmx/openpay/library/domain/model/link/CreatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPaymentLinks", "", "paymentLinkFilter", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "(Lmx/openpay/library/domain/model/link/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transactionId", "updatePaymentLink", "Lmx/openpay/library/domain/model/link/UpdatePaymentLink;", "(Lmx/openpay/library/domain/model/link/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLinkStatus", "status", "Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/link/PaymentLinkStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaymentLinkRepositoryImpl implements PaymentLinkRepository {

    @NotNull
    private final PaymentLinkRemoteDataSource paymentLinkDataSource;

    public PaymentLinkRepositoryImpl(@NotNull PaymentLinkRemoteDataSource paymentLinkDataSource) {
        Intrinsics.checkNotNullParameter(paymentLinkDataSource, "paymentLinkDataSource");
        this.paymentLinkDataSource = paymentLinkDataSource;
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object checkPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        return this.paymentLinkDataSource.checkPaymentLink(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object createPaymentLink(@NotNull CreatePaymentLink createPaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        return this.paymentLinkDataSource.createPaymentLink(createPaymentLink, continuation);
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object getAllPaymentLinks(@NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<PaymentLink>>> continuation) {
        return this.paymentLinkDataSource.getAllPaymentLinks(paymentLinkFilter, continuation);
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object refundPaymentLink(@NotNull String str, @NotNull Continuation<? super Result<Transaction>> continuation) {
        return this.paymentLinkDataSource.refundPaymentLink(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object updatePaymentLink(@NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        return this.paymentLinkDataSource.updatePaymentLink(updatePaymentLink, continuation);
    }

    @Override // mx.openpay.library.domain.repository.PaymentLinkRepository
    @Nullable
    public Object updatePaymentLinkStatus(@NotNull String str, @NotNull PaymentLinkStatus paymentLinkStatus, @NotNull Continuation<? super Result<PaymentLink>> continuation) {
        return this.paymentLinkDataSource.updatePaymentLinkStatus(str, paymentLinkStatus, continuation);
    }
}
