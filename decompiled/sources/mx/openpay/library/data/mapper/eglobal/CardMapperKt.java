package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.CardResponseDto;
import mx.openpay.library.domain.model.Card;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CardMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLocalCard", "Lmx/openpay/library/domain/model/Card;", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/CardResponseDto;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardMapperKt {
    @NotNull
    public static final Card mapToLocalCard(@NotNull CardResponseDto cardResponseDto) {
        Intrinsics.checkNotNullParameter(cardResponseDto, "<this>");
        String address = cardResponseDto.getAddress();
        boolean allowsCharges = cardResponseDto.getAllowsCharges();
        boolean allowsPayouts = cardResponseDto.getAllowsPayouts();
        String bankCode = cardResponseDto.getBankCode();
        String bankName = cardResponseDto.getBankName();
        String brand = cardResponseDto.getBrand();
        String cardNumber = cardResponseDto.getCardNumber();
        String expirationMonth = cardResponseDto.getExpirationMonth();
        String expirationYear = cardResponseDto.getExpirationYear();
        String holderName = cardResponseDto.getHolderName();
        boolean pointsCard = cardResponseDto.getPointsCard();
        String pointsType = cardResponseDto.getPointsType();
        if (pointsType == null) {
            pointsType = "";
        }
        return new Card(address, allowsCharges, allowsPayouts, bankCode, bankName, brand, cardNumber, expirationMonth, expirationYear, holderName, pointsCard, pointsType, cardResponseDto.getType());
    }
}
