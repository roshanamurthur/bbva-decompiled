package mx.openpay.library.data.mapper.eglobal;

import com.salesforce.marketingcloud.storage.db.k;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.CreateChargeRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.EncryptedCardRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.ChargeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.EmvTerminalDataResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.FeeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.transaction.PaymentPlanResponseDto;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import mx.openpay.library.domain.model.eglobal.Fee;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ChargeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, d2 = {"mapToCreateChargeRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/CreateChargeRequestDto;", "Lmx/openpay/library/domain/model/CreateCharge;", k.a.f65040g, "Lmx/openpay/library/domain/model/IntegratorTags;", "isTop", "", "mapToLocalCharge", "Lmx/openpay/library/domain/model/eglobal/Charge;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/ChargeResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ChargeMapperKt {
    @NotNull
    public static final CreateChargeRequestDto mapToCreateChargeRequestDto(@NotNull CreateCharge createCharge, @NotNull IntegratorTags tags, boolean z10) {
        Intrinsics.checkNotNullParameter(createCharge, "<this>");
        Intrinsics.checkNotNullParameter(tags, "tags");
        BigDecimal amount = createCharge.getAmount();
        String currency = createCharge.getCurrency();
        String description = createCharge.getDescription();
        EncryptedCardRequestDto encryptedCardRequestDtoMapToEncryptedCardRequestDto = EncryptedCardMapperKt.mapToEncryptedCardRequestDto(createCharge.getEncryptedCard());
        String method = createCharge.getMethod();
        String orderId = createCharge.getOrderId();
        boolean useCardPoints = createCharge.getUseCardPoints();
        PaymentPlan paymentPlan = createCharge.getPaymentPlan();
        return new CreateChargeRequestDto(amount, currency, description, encryptedCardRequestDtoMapToEncryptedCardRequestDto, method, orderId, useCardPoints, paymentPlan != null ? PaymentPlanMapperKt.mapToPaymentPlanRequestDto(paymentPlan) : null, z10 ? tags.getProductTypeToP() : tags.getProductType(), tags.getOrigin());
    }

    @NotNull
    public static final Charge mapToLocalCharge(@NotNull ChargeResponseDto chargeResponseDto) {
        Intrinsics.checkNotNullParameter(chargeResponseDto, "<this>");
        double amount = chargeResponseDto.getAmount();
        String authorization = chargeResponseDto.getAuthorization();
        if (authorization == null) {
            authorization = "";
        }
        CardResponseDto card = chargeResponseDto.getCard();
        Card cardMapToLocalCard = card != null ? CardMapperKt.mapToLocalCard(card) : null;
        CardPoints cardPointsMapToLocalCardPoints = CardPointsMapperKt.mapToLocalCardPoints(chargeResponseDto.getCardPoints());
        boolean conciliated = chargeResponseDto.getConciliated();
        String creationDate = chargeResponseDto.getCreationDate();
        String currency = chargeResponseDto.getCurrency();
        String description = chargeResponseDto.getDescription();
        EmvTerminalDataResponseDto emvTerminalData = chargeResponseDto.getEmvTerminalData();
        EmvTerminalData emvTerminalDataMapToLocalEmvTerminalData = emvTerminalData != null ? EmvTerminalDataMapperKt.mapToLocalEmvTerminalData(emvTerminalData) : null;
        String errorMessage = chargeResponseDto.getErrorMessage();
        FeeResponseDto fee = chargeResponseDto.getFee();
        Fee feeMapToLocalFee = fee != null ? FeeMapperKt.mapToLocalFee(fee) : null;
        String id = chargeResponseDto.getId();
        String method = chargeResponseDto.getMethod();
        String operationDate = chargeResponseDto.getOperationDate();
        String operationType = chargeResponseDto.getOperationType();
        String orderId = chargeResponseDto.getOrderId();
        String status = chargeResponseDto.getStatus();
        String transactionType = chargeResponseDto.getTransactionType();
        String gatewayCardPresent = chargeResponseDto.getGatewayCardPresent();
        if (gatewayCardPresent == null) {
            gatewayCardPresent = "";
        }
        String readMode = chargeResponseDto.getReadMode();
        if (readMode == null) {
            readMode = "";
        }
        PaymentPlanResponseDto paymentPlan = chargeResponseDto.getPaymentPlan();
        return new Charge(amount, authorization, cardMapToLocalCard, cardPointsMapToLocalCardPoints, conciliated, creationDate, currency, description, emvTerminalDataMapToLocalEmvTerminalData, errorMessage, feeMapToLocalFee, id, method, operationDate, operationType, orderId, status, transactionType, gatewayCardPresent, readMode, paymentPlan != null ? PaymentPlanMapperKt.mapToLocalPaymentPlan(paymentPlan) : null);
    }
}
