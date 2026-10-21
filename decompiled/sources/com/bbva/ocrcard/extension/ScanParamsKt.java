package com.bbva.ocrcard.extension;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.bbva.ocrcard.command.params.ScanParams;
import io.card.payment.CardIOActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"toBundle", "Landroid/os/Bundle;", "Lcom/bbva/ocrcard/command/params/ScanParams;", "toIntent", "Landroid/content/Intent;", "ocrcard_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ScanParamsKt {
    @NotNull
    public static final Bundle toBundle(@NotNull ScanParams scanParams) {
        Intrinsics.checkNotNullParameter(scanParams, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean(CardIOActivity.EXTRA_REQUIRE_EXPIRY, scanParams.getRequireExpiry());
        bundle.putBoolean(CardIOActivity.EXTRA_SCAN_EXPIRY, scanParams.getScanExpiry());
        bundle.putBoolean(CardIOActivity.EXTRA_REQUIRE_CVV, scanParams.getRequireCVV());
        bundle.putBoolean(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, scanParams.getRequirePostalCode());
        bundle.putBoolean(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, scanParams.getSuppressManual());
        bundle.putBoolean(CardIOActivity.EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY, scanParams.getRestrictPostalCodeToNumericOnly());
        bundle.putBoolean(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, scanParams.getKeepApplicationTheme());
        bundle.putBoolean(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, scanParams.getRequireCardholderName());
        bundle.putBoolean(CardIOActivity.EXTRA_USE_CARDIO_LOGO, true);
        bundle.putString(CardIOActivity.EXTRA_SCAN_INSTRUCTIONS, scanParams.getScanInstructions());
        bundle.putBoolean("io.card.payment.noCamera", scanParams.getNoCamera());
        bundle.putString(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE, scanParams.getLanguageOrLocale());
        bundle.putInt(CardIOActivity.EXTRA_GUIDE_COLOR, Color.parseColor(scanParams.getGuideColor()));
        bundle.putBoolean(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, scanParams.getSuppressConfirmation());
        bundle.putBoolean(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        bundle.putBoolean(CardIOActivity.EXTRA_SUPPRESS_SCAN, scanParams.getSuppressScan());
        bundle.putBoolean(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, false);
        return bundle;
    }

    @NotNull
    public static final Intent toIntent(@NotNull ScanParams scanParams) {
        Intrinsics.checkNotNullParameter(scanParams, "<this>");
        Intent intent = new Intent();
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, scanParams.getRequireExpiry());
        intent.putExtra(CardIOActivity.EXTRA_SCAN_EXPIRY, scanParams.getScanExpiry());
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, scanParams.getRequireCVV());
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, scanParams.getRequirePostalCode());
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, scanParams.getSuppressManual());
        intent.putExtra(CardIOActivity.EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY, scanParams.getRestrictPostalCodeToNumericOnly());
        intent.putExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, scanParams.getKeepApplicationTheme());
        intent.putExtra(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, scanParams.getRequireCardholderName());
        intent.putExtra(CardIOActivity.EXTRA_USE_CARDIO_LOGO, false);
        intent.putExtra(CardIOActivity.EXTRA_SCAN_INSTRUCTIONS, scanParams.getScanInstructions());
        intent.putExtra("io.card.payment.noCamera", scanParams.getNoCamera());
        intent.putExtra(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE, scanParams.getLanguageOrLocale());
        intent.putExtra(CardIOActivity.EXTRA_GUIDE_COLOR, Color.parseColor(scanParams.getGuideColor()));
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, scanParams.getSuppressConfirmation());
        intent.putExtra(CardIOActivity.EXTRA_HIDE_CARDIO_LOGO, true);
        intent.putExtra(CardIOActivity.EXTRA_SUPPRESS_SCAN, scanParams.getSuppressScan());
        intent.putExtra(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, false);
        return intent;
    }
}
