package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.PaymentPlanLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.PaymentPlanRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.transaction.PaymentPlanResponseDto;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentPlanLink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PaymentPlanMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"mapToLocalPaymentPlan", "Lmx/openpay/library/domain/model/eglobal/PaymentPlan;", "Lmx/openpay/library/data/datasource/remote/model/response/transaction/PaymentPlanResponseDto;", "mapToPaymentPlanRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanRequestDto;", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/PaymentPlanLinkRequestDto;", "Lmx/openpay/library/domain/model/eglobal/PaymentPlanLink;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaymentPlanMapperKt {
    @NotNull
    public static final PaymentPlan mapToLocalPaymentPlan(@NotNull PaymentPlanResponseDto paymentPlanResponseDto) {
        Intrinsics.checkNotNullParameter(paymentPlanResponseDto, "<this>");
        return new PaymentPlan(paymentPlanResponseDto.getPayments(), mx.openpay.library.data.mapper.transaction.TransactionMapperKt.mapToLocalPaymentType(paymentPlanResponseDto.getPaymentsType()));
    }

    @NotNull
    public static final PaymentPlanRequestDto mapToPaymentPlanRequestDto(@NotNull PaymentPlan paymentPlan) {
        Intrinsics.checkNotNullParameter(paymentPlan, "<this>");
        return new PaymentPlanRequestDto(paymentPlan.getPayments(), PaymentTypeMapperKt.mapToPaymentTypeRequestDto(paymentPlan.getPaymentsType()));
    }

    @NotNull
    public static final PaymentPlanLinkRequestDto mapToPaymentPlanRequestDto(@NotNull PaymentPlanLink paymentPlanLink) {
        Intrinsics.checkNotNullParameter(paymentPlanLink, "<this>");
        return new PaymentPlanLinkRequestDto(paymentPlanLink.getPayments(), PaymentTypeMapperKt.mapToPaymentTypeRequestDto(paymentPlanLink.getPaymentsType()));
    }
}
