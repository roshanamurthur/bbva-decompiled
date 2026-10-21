package com.bbva.ocrcard.extension;

import com.bbva.ethermobile.help.kit.result.Result;
import io.card.payment.CreditCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CreditCard.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCreditCardResult", "Lcom/bbva/ethermobile/help/kit/result/Result$Success;", "Lio/card/payment/CreditCard;", "ocrcard_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CreditCardKt {
    @NotNull
    public static final Result.Success<CreditCard> toCreditCardResult(@NotNull CreditCard creditCard) {
        Intrinsics.checkNotNullParameter(creditCard, "<this>");
        return new Result.Success<>(creditCard);
    }
}
