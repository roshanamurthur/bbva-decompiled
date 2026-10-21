package com.bbva.glomohybrid.infoscreen.scratchCard;

import android.content.Context;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.a;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardCurrency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScratchcardConfigurationExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"getAmountContentDescription", "", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "context", "Landroid/content/Context;", "formattedAmount", "getFormattedAmount", "info-modal_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScratchcardConfigurationExtensionsKt {
    @NotNull
    public static final String getAmountContentDescription(@NotNull ScratchcardConfiguration scratchcardConfiguration, @NotNull Context context, @NotNull String formattedAmount) {
        Intrinsics.checkNotNullParameter(scratchcardConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        String currency = scratchcardConfiguration.getCurrency();
        if (Intrinsics.areEqual(currency, ScratchcardCurrency.Argentina.getValue())) {
            return a.b(l.replace$default(formattedAmount, Constant.MXN_SYMBOL, "", false, 4, (Object) null), " ", context.getString(R.string.scratchcard_accessibility_pesos));
        }
        return Intrinsics.areEqual(currency, ScratchcardCurrency.Peru.getValue()) ? a.b(l.replace$default(formattedAmount, "S/", "", false, 4, (Object) null), " ", context.getString(R.string.scratchcard_accessibility_soles)) : "";
    }

    @NotNull
    public static final String getFormattedAmount(@NotNull ScratchcardConfiguration scratchcardConfiguration) {
        Intrinsics.checkNotNullParameter(scratchcardConfiguration, "<this>");
        if (!scratchcardConfiguration.getStatus() || scratchcardConfiguration.getAmount() == null) {
            return "";
        }
        String currency = scratchcardConfiguration.getCurrency();
        if (Intrinsics.areEqual(currency, ScratchcardCurrency.Argentina.getValue())) {
            return h0.b("$ ", scratchcardConfiguration.getFormattedCurrency(), ",00");
        }
        return Intrinsics.areEqual(currency, ScratchcardCurrency.Peru.getValue()) ? h0.b("S/ ", scratchcardConfiguration.getFormattedCurrency(), ",00") : "";
    }
}
