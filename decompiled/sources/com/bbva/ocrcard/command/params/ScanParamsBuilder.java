package com.bbva.ocrcard.command.params;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScanParams.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\"\u00107\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\"\u0010;\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\"\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0006\u001a\u0004\bA\u0010\b\"\u0004\bB\u0010\n¨\u0006F"}, d2 = {"Lcom/bbva/ocrcard/command/params/ScanParamsBuilder;", "", "Lcom/bbva/ocrcard/command/params/ScanParams;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Z", "getRequireExpiry", "()Z", "setRequireExpiry", "(Z)V", "requireExpiry", "b", "getRequireCVV", "setRequireCVV", "requireCVV", "c", "getRequirePostalCode", "setRequirePostalCode", "requirePostalCode", "d", "getSuppressManual", "setSuppressManual", "suppressManual", "e", "getRestrictPostalCodeToNumericOnly", "setRestrictPostalCodeToNumericOnly", "restrictPostalCodeToNumericOnly", "f", "getKeepApplicationTheme", "setKeepApplicationTheme", "keepApplicationTheme", "g", "getRequireCardholderName", "setRequireCardholderName", "requireCardholderName", "", "h", "Ljava/lang/String;", "getScanInstructions", "()Ljava/lang/String;", "setScanInstructions", "(Ljava/lang/String;)V", "scanInstructions", "i", "getNoCamera", "setNoCamera", "noCamera", "j", "getScanExpiry", "setScanExpiry", "scanExpiry", "k", "getLanguageOrLocale", "setLanguageOrLocale", "languageOrLocale", "l", "getGuideColor", "setGuideColor", "guideColor", "m", "getSuppressConfirmation", "setSuppressConfirmation", "suppressConfirmation", "n", "getSuppressScan", "setSuppressScan", "suppressScan", "<init>", "()V", "ocrcard_release"}, k = 1, mv = {1, 5, 1})
public final class ScanParamsBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean requireExpiry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean requireCVV;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean requirePostalCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean suppressManual;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean restrictPostalCodeToNumericOnly;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean keepApplicationTheme;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean requireCardholderName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean noCamera;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean scanExpiry;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean suppressConfirmation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean suppressScan;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String scanInstructions = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String languageOrLocale = "es-ES";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String guideColor = "#1464a5";

    @NotNull
    public final ScanParams build() {
        return new ScanParams(this.requireExpiry, this.requireCVV, this.requirePostalCode, this.suppressManual, this.restrictPostalCodeToNumericOnly, this.keepApplicationTheme, this.requireCardholderName, this.scanInstructions, this.noCamera, this.scanExpiry, this.languageOrLocale, this.guideColor, this.suppressConfirmation, this.suppressScan);
    }

    @NotNull
    public final String getGuideColor() {
        return this.guideColor;
    }

    public final boolean getKeepApplicationTheme() {
        return this.keepApplicationTheme;
    }

    @NotNull
    public final String getLanguageOrLocale() {
        return this.languageOrLocale;
    }

    public final boolean getNoCamera() {
        return this.noCamera;
    }

    public final boolean getRequireCVV() {
        return this.requireCVV;
    }

    public final boolean getRequireCardholderName() {
        return this.requireCardholderName;
    }

    public final boolean getRequireExpiry() {
        return this.requireExpiry;
    }

    public final boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    public final boolean getRestrictPostalCodeToNumericOnly() {
        return this.restrictPostalCodeToNumericOnly;
    }

    public final boolean getScanExpiry() {
        return this.scanExpiry;
    }

    @NotNull
    public final String getScanInstructions() {
        return this.scanInstructions;
    }

    public final boolean getSuppressConfirmation() {
        return this.suppressConfirmation;
    }

    public final boolean getSuppressManual() {
        return this.suppressManual;
    }

    public final boolean getSuppressScan() {
        return this.suppressScan;
    }

    public final void setGuideColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.guideColor = str;
    }

    public final void setKeepApplicationTheme(boolean z10) {
        this.keepApplicationTheme = z10;
    }

    public final void setLanguageOrLocale(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageOrLocale = str;
    }

    public final void setNoCamera(boolean z10) {
        this.noCamera = z10;
    }

    public final void setRequireCVV(boolean z10) {
        this.requireCVV = z10;
    }

    public final void setRequireCardholderName(boolean z10) {
        this.requireCardholderName = z10;
    }

    public final void setRequireExpiry(boolean z10) {
        this.requireExpiry = z10;
    }

    public final void setRequirePostalCode(boolean z10) {
        this.requirePostalCode = z10;
    }

    public final void setRestrictPostalCodeToNumericOnly(boolean z10) {
        this.restrictPostalCodeToNumericOnly = z10;
    }

    public final void setScanExpiry(boolean z10) {
        this.scanExpiry = z10;
    }

    public final void setScanInstructions(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scanInstructions = str;
    }

    public final void setSuppressConfirmation(boolean z10) {
        this.suppressConfirmation = z10;
    }

    public final void setSuppressManual(boolean z10) {
        this.suppressManual = z10;
    }

    public final void setSuppressScan(boolean z10) {
        this.suppressScan = z10;
    }
}
