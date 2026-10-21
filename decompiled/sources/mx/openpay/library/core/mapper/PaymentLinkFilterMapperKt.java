package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayPaymentLinkFilter;
import mx.openpay.library.core.model.extra.PaymentLinkFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0002*\u00020\u0003¨\u0006\u0004"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/domain/model/link/PaymentLinkFilter;", "Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;", "Lmx/openpay/library/core/model/extra/PaymentLinkFilter;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaymentLinkFilterMapperKt {
    @NotNull
    public static final OpenPayPaymentLinkFilter mapToLibraryModel(@NotNull PaymentLinkFilter paymentLinkFilter) {
        Intrinsics.checkNotNullParameter(paymentLinkFilter, "<this>");
        String startDate = paymentLinkFilter.getStartDate();
        String endDate = paymentLinkFilter.getEndDate();
        String limit = paymentLinkFilter.getLimit();
        Integer numValueOf = limit != null ? Integer.valueOf(Integer.parseInt(limit)) : null;
        String offset = paymentLinkFilter.getOffset();
        return new OpenPayPaymentLinkFilter(startDate, endDate, null, numValueOf, offset != null ? Integer.valueOf(Integer.parseInt(offset)) : null, PaymentLinkStatusMapperKt.mapToStatusFilterToPaymentLinkStatusModelList(paymentLinkFilter.getStatus()), 4, null);
    }

    @NotNull
    public static final mx.openpay.library.domain.model.link.PaymentLinkFilter mapToLibraryModel(@NotNull OpenPayPaymentLinkFilter openPayPaymentLinkFilter) {
        Intrinsics.checkNotNullParameter(openPayPaymentLinkFilter, "<this>");
        return new mx.openpay.library.domain.model.link.PaymentLinkFilter(openPayPaymentLinkFilter.getStartDate(), openPayPaymentLinkFilter.getEndDate(), openPayPaymentLinkFilter.getNameOrLastName(), openPayPaymentLinkFilter.getLimit(), openPayPaymentLinkFilter.getOffset(), PaymentLinkStatusMapperKt.mapToLibraryStatusFilterModelList(openPayPaymentLinkFilter.getStatus()));
    }
}
