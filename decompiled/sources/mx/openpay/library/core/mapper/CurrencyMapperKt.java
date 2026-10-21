package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCurrency;
import mx.openpay.library.domain.model.Currency;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/Currency;", "Lmx/openpay/library/core/model/OpenPayCurrency;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CurrencyMapperKt {
    @NotNull
    public static final Currency mapToDomainModel(@NotNull OpenPayCurrency openPayCurrency) {
        Intrinsics.checkNotNullParameter(openPayCurrency, "<this>");
        return new Currency(openPayCurrency.getName(), openPayCurrency.getSymbol(), openPayCurrency.getIsoCode(), openPayCurrency.getNumericCode());
    }
}
