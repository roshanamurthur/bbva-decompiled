package mx.openpay.library.data.util;

import android.content.Context;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.model.Card;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.eglobal.RefundRequest;
import mx.openpay.library.domain.model.transaction.Transaction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RefundUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/data/util/RefundUtils;", "", "()V", "completeRefundRequest", "", "context", "Landroid/content/Context;", "connectedDevice", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "transaction", "Lmx/openpay/library/domain/model/transaction/Transaction;", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "cardInfoC51", "Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", "createRefundRequest", "validateIfCardIsCorrect", "", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RefundUtils {

    @NotNull
    public static final RefundUtils INSTANCE = new RefundUtils();

    public final void completeRefundRequest(@NotNull Context context, @NotNull ConnectedDeviceQ8 connectedDevice, @NotNull Transaction transaction, @NotNull RefundRequest refundRequest, @NotNull C51Response cardInfoC51) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(connectedDevice, "connectedDevice");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(refundRequest, "refundRequest");
        Intrinsics.checkNotNullParameter(cardInfoC51, "cardInfoC51");
        CreateCharge createChargeCreateChargeRequest = ChargeUtils.INSTANCE.createChargeRequest(context, connectedDevice.getSerial(), connectedDevice.getSlotKey(), new BigDecimal(String.valueOf(transaction.getAmount())), transaction.getOrderId(), 0, transaction.getDescription(), cardInfoC51);
        refundRequest.setTokenEs(createChargeCreateChargeRequest.getEncryptedCard().getTokenES());
        refundRequest.setTokenEy(createChargeCreateChargeRequest.getEncryptedCard().getTokenEY());
        refundRequest.setTokenEz(createChargeCreateChargeRequest.getEncryptedCard().getTokenEZ());
        refundRequest.setEncryptedCard(createChargeCreateChargeRequest.getEncryptedCard());
        if (Intrinsics.areEqual(createChargeCreateChargeRequest.getEncryptedCard().getReadMode(), EglobalUtils.READ_MODE_CONTACTLESS_EMV)) {
            refundRequest.setTokenCz(createChargeCreateChargeRequest.getEncryptedCard().getTokenCZ());
        }
    }

    @NotNull
    public final RefundRequest createRefundRequest(@NotNull Transaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new RefundRequest(new BigDecimal(String.valueOf(transaction.getAmount())), transaction.getDescription(), transaction.getOrderId(), transaction.getId(), null, null, null, null, null, 496, null);
    }

    public final boolean validateIfCardIsCorrect(@NotNull C51Response cardInfoC51, @NotNull Transaction transaction) {
        Intrinsics.checkNotNullParameter(cardInfoC51, "cardInfoC51");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Card card = transaction.getCard();
        if (card == null) {
            return false;
        }
        String strSubstring = card.getCardNumber().substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = card.getCardNumber().substring(card.getCardNumber().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strSubstring3 = cardInfoC51.getCardBin().substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        if (!Intrinsics.areEqual(strSubstring3, strSubstring)) {
            return false;
        }
        String strSubstring4 = cardInfoC51.getPan().substring(cardInfoC51.getPan().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
        return Intrinsics.areEqual(strSubstring4, strSubstring2) && Intrinsics.areEqual(cardInfoC51.getReadMode(), transaction.getReadMode());
    }
}
