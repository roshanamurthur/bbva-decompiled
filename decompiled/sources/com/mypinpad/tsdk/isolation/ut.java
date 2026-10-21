package com.mypinpad.tsdk.isolation;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberFormat f61416a;

    public ut(@NotNull Currency currency, @NotNull Locale locale, int i10, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(locale, "");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setCurrency(currency);
        numberFormat.setMinimumFractionDigits(i10);
        numberFormat.setMaximumFractionDigits(i10);
        if ((str2 != null || str != null) && (numberFormat instanceof DecimalFormat)) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
            if (str != null) {
                decimalFormatSymbols.setGroupingSeparator(StringsKt___StringsKt.first(str));
            }
            if (str2 != null) {
                decimalFormatSymbols.setDecimalSeparator(StringsKt___StringsKt.first(str2));
                decimalFormatSymbols.setMonetaryDecimalSeparator(StringsKt___StringsKt.first(str2));
            }
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
        this.f61416a = numberFormat;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        ut utVar = (ut) objArr[0];
        String str = utVar.f61416a.format(((Number) objArr[1]).doubleValue());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @NotNull
    public final String setX(double d2) {
        return (String) setX(new Object[]{this, Double.valueOf(d2)}, -520472434, 520472434, System.identityHashCode(this));
    }
}
