package mx.openpay.library.core.util;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/core/util/CardUtils;", "", "", ConstantsKt.CARD_NUMBER, "Lmx/openpay/library/core/util/CardUtils$CardBrand;", "getCardType", "CardBrand", "library_release"}, k = 1, mv = {1, 8, 0})
public final class CardUtils {
    public static final int $stable = 0;

    @NotNull
    public static final CardUtils INSTANCE = new CardUtils();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/util/CardUtils$CardBrand;", "", "UNDEFINED", ProviderType.PROVIDER_ID_VISA, ProviderType.PROVIDER_ID_MASTERCARD, "library_release"}, k = 1, mv = {1, 8, 0})
    public enum CardBrand {
        UNDEFINED,
        VISA,
        MASTERCARD
    }

    @NotNull
    public final CardBrand getCardType(@Nullable String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 6) {
            return CardBrand.UNDEFINED;
        }
        String strSubstring = cardNumber.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        if (l.startsWith$default(cardNumber, "4", false, 2, null)) {
            return CardBrand.VISA;
        }
        int i10 = Integer.parseInt(strSubstring);
        return ((510000 > i10 || i10 >= 560000) && (222100 > i10 || i10 >= 272100)) ? CardBrand.UNDEFINED : CardBrand.MASTERCARD;
    }
}
