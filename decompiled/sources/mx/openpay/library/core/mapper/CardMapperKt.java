package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCard;
import mx.openpay.library.core.model.extra.CardDTO;
import mx.openpay.library.domain.model.Card;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0005"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/Card;", "Lmx/openpay/library/core/model/OpenPayCard;", "mapToLibraryModel", "Lmx/openpay/library/core/model/extra/CardDTO;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardMapperKt {
    @NotNull
    public static final Card mapToDomainModel(@NotNull OpenPayCard openPayCard) {
        Intrinsics.checkNotNullParameter(openPayCard, "<this>");
        return new Card(openPayCard.getAddress(), openPayCard.getAllowsCharges(), openPayCard.getAllowsPayouts(), openPayCard.getBankCode(), openPayCard.getBankName(), openPayCard.getBrand(), openPayCard.getCardNumber(), openPayCard.getExpirationMonth(), openPayCard.getExpirationYear(), openPayCard.getHolderName(), openPayCard.getPointsCard(), openPayCard.getPointsType(), openPayCard.getType());
    }

    @NotNull
    public static final OpenPayCard mapToLibraryModel(@NotNull CardDTO cardDTO) {
        Intrinsics.checkNotNullParameter(cardDTO, "<this>");
        return new OpenPayCard(cardDTO.getAddress(), cardDTO.getAllowsCharges(), cardDTO.getAllowsPayouts(), cardDTO.getBankCode(), cardDTO.getBankName(), cardDTO.getBrand(), cardDTO.getCardNumber(), cardDTO.getExpirationMonth(), cardDTO.getExpirationYear(), cardDTO.getHolderName(), cardDTO.getPointsCard(), cardDTO.getPointsType(), cardDTO.getType());
    }

    @NotNull
    public static final OpenPayCard mapToLibraryModel(@NotNull Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        String address = card.getAddress();
        boolean allowsCharges = card.getAllowsCharges();
        boolean allowsPayouts = card.getAllowsPayouts();
        String bankCode = card.getBankCode();
        String bankName = card.getBankName();
        if (bankName == null) {
            bankName = "";
        }
        return new OpenPayCard(address, allowsCharges, allowsPayouts, bankCode, bankName, card.getBrand(), card.getCardNumber(), card.getExpirationMonth(), card.getExpirationYear(), card.getHolderName(), card.getPointsCard(), card.getPointsType(), card.getType());
    }

    @NotNull
    public static final CardDTO mapToLibraryModel(@NotNull OpenPayCard openPayCard) {
        Intrinsics.checkNotNullParameter(openPayCard, "<this>");
        return new CardDTO(openPayCard.getAddress(), openPayCard.getAllowsCharges(), openPayCard.getAllowsPayouts(), openPayCard.getBankCode(), openPayCard.getBankName(), openPayCard.getBrand(), openPayCard.getCardNumber(), openPayCard.getExpirationMonth(), openPayCard.getExpirationYear(), openPayCard.getHolderName(), openPayCard.getPointsCard(), openPayCard.getPointsType(), openPayCard.getType());
    }
}
