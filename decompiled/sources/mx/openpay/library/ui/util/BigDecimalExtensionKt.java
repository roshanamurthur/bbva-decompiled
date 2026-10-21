package mx.openpay.library.ui.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"formatToStringWithDecimals", "", "Ljava/math/BigDecimal;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BigDecimalExtensionKt {
    @NotNull
    public static final String formatToStringWithDecimals(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        String str = new DecimalFormat(EglobalUtils.DECIMAL_FORMAT_PATTERN, new DecimalFormatSymbols(new Locale("es", "MX"))).format(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(str, "decimalFormat.format(this)");
        return str;
    }
}
