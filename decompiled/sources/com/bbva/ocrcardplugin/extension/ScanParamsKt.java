package com.bbva.ocrcardplugin.extension;

import com.bbva.ocrcard.command.params.ScanParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"checkUnsetForDefaults", "Lcom/bbva/ocrcard/command/params/ScanParams;", "ocrcard-plugin_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ScanParamsKt {
    @NotNull
    public static final ScanParams checkUnsetForDefaults(@NotNull ScanParams scanParams) {
        Intrinsics.checkNotNullParameter(scanParams, "<this>");
        String scanInstructions = scanParams.getScanInstructions();
        if (scanInstructions == null) {
            scanInstructions = "";
        }
        String str = scanInstructions;
        String languageOrLocale = scanParams.getLanguageOrLocale();
        if (languageOrLocale == null) {
            languageOrLocale = "es-ES";
        }
        String str2 = languageOrLocale;
        String guideColor = scanParams.getGuideColor();
        if (guideColor == null) {
            guideColor = "#1464a5";
        }
        return scanParams.copy((13183 & 1) != 0 ? scanParams.requireExpiry : false, (13183 & 2) != 0 ? scanParams.requireCVV : false, (13183 & 4) != 0 ? scanParams.requirePostalCode : false, (13183 & 8) != 0 ? scanParams.suppressManual : false, (13183 & 16) != 0 ? scanParams.restrictPostalCodeToNumericOnly : false, (13183 & 32) != 0 ? scanParams.keepApplicationTheme : false, (13183 & 64) != 0 ? scanParams.requireCardholderName : false, (13183 & 128) != 0 ? scanParams.scanInstructions : str, (13183 & 256) != 0 ? scanParams.noCamera : false, (13183 & 512) != 0 ? scanParams.scanExpiry : false, (13183 & 1024) != 0 ? scanParams.languageOrLocale : str2, (13183 & 2048) != 0 ? scanParams.guideColor : guideColor, (13183 & 4096) != 0 ? scanParams.suppressConfirmation : false, (13183 & 8192) != 0 ? scanParams.suppressScan : false);
    }
}
