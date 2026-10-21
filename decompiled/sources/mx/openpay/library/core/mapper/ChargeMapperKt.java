package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCard;
import mx.openpay.library.core.model.OpenPayCardPoints;
import mx.openpay.library.core.model.OpenPayCharge;
import mx.openpay.library.core.model.OpenPayEmvTerminalData;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CardPoints;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import mx.openpay.library.domain.model.eglobal.Fee;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"mapToLibraryChargeTransactionModel", "Lmx/openpay/library/core/model/extra/ChargeTransaction;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "mapToLibraryModel", "Lmx/openpay/library/core/model/OpenPayCharge;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ChargeMapperKt {
    @NotNull
    public static final ChargeTransaction mapToLibraryChargeTransactionModel(@NotNull Charge charge) {
        OpenPayCard openPayCardMapToLibraryModel;
        OpenPayCard openPayCardMapToLibraryModel2;
        Intrinsics.checkNotNullParameter(charge, "<this>");
        String authorization = charge.getAuthorization();
        Card card = charge.getCard();
        String bankCode = card != null ? card.getBankCode() : null;
        String creationDate = charge.getCreationDate();
        Card card2 = charge.getCard();
        String bin = (card2 == null || (openPayCardMapToLibraryModel2 = CardMapperKt.mapToLibraryModel(card2)) == null) ? null : openPayCardMapToLibraryModel2.getBin();
        Card card3 = charge.getCard();
        String span = (card3 == null || (openPayCardMapToLibraryModel = CardMapperKt.mapToLibraryModel(card3)) == null) ? null : openPayCardMapToLibraryModel.getSpan();
        Card card4 = charge.getCard();
        String bankName = card4 != null ? card4.getBankName() : null;
        Card card5 = charge.getCard();
        String type = card5 != null ? card5.getType() : null;
        Card card6 = charge.getCard();
        String brand = card6 != null ? card6.getBrand() : null;
        Card card7 = charge.getCard();
        String cardNumber = card7 != null ? card7.getCardNumber() : null;
        String id = charge.getId();
        String gatewayCardPresent = charge.getGatewayCardPresent();
        String readMode = charge.getReadMode();
        PaymentPlan paymentPlan = charge.getPaymentPlan();
        return new ChargeTransaction(authorization, bankCode, creationDate, bin, span, bankName, type, brand, cardNumber, id, gatewayCardPresent, readMode, paymentPlan != null ? PaymentPlanMapperKt.mapToLibraryModel(paymentPlan) : null);
    }

    @NotNull
    public static final OpenPayCharge mapToLibraryModel(@NotNull Charge charge) {
        Intrinsics.checkNotNullParameter(charge, "<this>");
        double amount = charge.getAmount();
        String authorization = charge.getAuthorization();
        Card card = charge.getCard();
        OpenPayCard openPayCardMapToLibraryModel = card != null ? CardMapperKt.mapToLibraryModel(card) : null;
        CardPoints cardPoints = charge.getCardPoints();
        OpenPayCardPoints openPayCardPointsMapToLibraryModel = cardPoints != null ? CardPointsMapperKt.mapToLibraryModel(cardPoints) : null;
        boolean conciliated = charge.getConciliated();
        String creationDate = charge.getCreationDate();
        String currency = charge.getCurrency();
        String description = charge.getDescription();
        if (description == null) {
            description = "";
        }
        String str = description;
        EmvTerminalData emvTerminalData = charge.getEmvTerminalData();
        OpenPayEmvTerminalData openPayEmvTerminalDataMapToLibraryModel = emvTerminalData != null ? EmvTerminalDataMapperKt.mapToLibraryModel(emvTerminalData) : null;
        String errorMessage = charge.getErrorMessage();
        Fee fee = charge.getFee();
        return new OpenPayCharge(amount, authorization, openPayCardMapToLibraryModel, openPayCardPointsMapToLibraryModel, conciliated, creationDate, currency, str, openPayEmvTerminalDataMapToLibraryModel, errorMessage, fee != null ? FeeMapperKt.mapToLibraryModel(fee) : null, charge.getId(), charge.getMethod(), charge.getOperationDate(), charge.getOperationType(), charge.getOrderId(), charge.getStatus(), charge.getTransactionType(), charge.getGatewayCardPresent(), charge.getReadMode());
    }
}
