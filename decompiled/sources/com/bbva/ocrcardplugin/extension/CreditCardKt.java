package com.bbva.ocrcardplugin.extension;

import com.bbva.ocrcard.utils.ConstantsKt;
import io.card.payment.CreditCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CreditCard.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"parseResponse", "Lorg/json/JSONObject;", "Lio/card/payment/CreditCard;", "ocrcard-plugin_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CreditCardKt {
    @NotNull
    public static final JSONObject parseResponse(@NotNull CreditCard creditCard) throws JSONException {
        Intrinsics.checkNotNullParameter(creditCard, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ConstantsKt.CARD_TYPE, creditCard.getCardType().toString());
        jSONObject.put(ConstantsKt.REDACTED_CARD_NUMBER, creditCard.getRedactedCardNumber());
        jSONObject.put(ConstantsKt.CARD_NUMBER, creditCard.cardNumber);
        jSONObject.put(ConstantsKt.EXPIRY_MONTH, creditCard.expiryMonth);
        jSONObject.put(ConstantsKt.EXPIRY_YEAR, creditCard.expiryYear);
        jSONObject.put(ConstantsKt.CVV, creditCard.cvv);
        jSONObject.put("postalCode", creditCard.postalCode);
        jSONObject.put(ConstantsKt.CARD_HOLDER_NAME, creditCard.cardholderName);
        return jSONObject;
    }
}
