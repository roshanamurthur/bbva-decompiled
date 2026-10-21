package mx.openpay.library.data.mapper.eglobal;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.RefundChargeRequestDto;
import mx.openpay.library.domain.model.eglobal.EncryptedCard;
import mx.openpay.library.domain.model.eglobal.RefundRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RefundChargeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToRefundChargeRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/RefundChargeRequestDto;", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RefundChargeMapperKt {
    @NotNull
    public static final RefundChargeRequestDto mapToRefundChargeRequestDto(@NotNull RefundRequest refundRequest) {
        Intrinsics.checkNotNullParameter(refundRequest, "<this>");
        BigDecimal amount = refundRequest.getAmount();
        String description = refundRequest.getDescription();
        String orderId = refundRequest.getOrderId();
        EncryptedCard encryptedCard = refundRequest.getEncryptedCard();
        return new RefundChargeRequestDto(amount, description, orderId, encryptedCard != null ? EncryptedCardMapperKt.mapToEncryptedCardRequestDto(encryptedCard) : null, refundRequest.getTokenEy(), refundRequest.getTokenEz(), refundRequest.getTokenEs(), refundRequest.getTokenCz());
    }
}
