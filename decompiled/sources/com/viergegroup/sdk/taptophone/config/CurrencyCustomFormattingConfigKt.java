package com.viergegroup.sdk.taptophone.config;

import bk.q;
import com.bbva.notifications.model.CurrencyData;
import com.mypinpad.tsdk.api.models.CurrencyCustomFormatting;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u0016\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u0000¨\u0006\u0005"}, d2 = {"getCurrencyCustomFormattingConfig", "", "Ljava/util/Currency;", "kotlin.jvm.PlatformType", "Lcom/mypinpad/tsdk/api/models/CurrencyCustomFormatting;", "PinPadSdk1032_1.0.32E_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CurrencyCustomFormattingConfigKt {
    @NotNull
    public static final Map<Currency, CurrencyCustomFormatting> getCurrencyCustomFormattingConfig() {
        return q.mapOf(TuplesKt.to(Currency.getInstance("NZD"), new CurrencyCustomFormatting(true, true, 2, " ", null, 16, null)), TuplesKt.to(Currency.getInstance(CurrencyData.EURO_CURRENCY), new CurrencyCustomFormatting(true, true, 2, " ", null, 16, null)), TuplesKt.to(Currency.getInstance("MXN"), new CurrencyCustomFormatting(true, true, 2, " ", null, 16, null)));
    }
}
