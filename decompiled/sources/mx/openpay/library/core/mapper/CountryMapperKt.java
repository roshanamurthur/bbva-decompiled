package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayCountry;
import mx.openpay.library.domain.model.Country;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/Country;", "Lmx/openpay/library/core/model/OpenPayCountry;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CountryMapperKt {
    @NotNull
    public static final Country mapToDomainModel(@NotNull OpenPayCountry openPayCountry) {
        Intrinsics.checkNotNullParameter(openPayCountry, "<this>");
        return new Country(openPayCountry.getName(), openPayCountry.getCode(), CurrencyMapperKt.mapToDomainModel(openPayCountry.getCurrency()));
    }
}
