package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/model/OpenPayCountryFactory;", "", "()V", "createMexico", "Lmx/openpay/library/core/model/OpenPayCountry;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OpenPayCountryFactory {
    public static final int $stable = 0;

    @NotNull
    public static final OpenPayCountryFactory INSTANCE = new OpenPayCountryFactory();

    @NotNull
    public final OpenPayCountry createMexico() {
        return new OpenPayCountry("Mexico", "484", OpenPayCurrency.INSTANCE.createMXN());
    }
}
