package com.bbva.library.darkmode;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.webkit.WebView;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DarkModeExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¨\u0006\b"}, d2 = {"Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Lcom/bbva/library/darkmode/DarkMode;", "mode", "setMode", "forceWebThemeStrategy", "forceUserAgentThemeStrategy", "darkmode_release"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "DarkModeExtensions")
public final class DarkModeExtensions {
    @Nullable
    public static final WebView forceUserAgentThemeStrategy(@NotNull WebView webView) {
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            return null;
        }
        WebSettingsCompat.setForceDarkStrategy(webView.getSettings(), 0);
        return webView;
    }

    @Nullable
    public static final WebView forceWebThemeStrategy(@NotNull WebView webView) {
        if (!WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
            return null;
        }
        WebSettingsCompat.setForceDarkStrategy(webView.getSettings(), 1);
        return webView;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Nullable
    public static final WebView setMode(@NotNull WebView webView, @NotNull Context context, @NotNull DarkMode darkMode) {
        DarkMode darkMode2;
        if (!WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
            int i10 = resources.getConfiguration().uiMode & 48;
            if (i10 == 16) {
                darkMode2 = DarkMode.FORCE_OFF;
            } else if (i10 != 32) {
                darkMode2 = darkMode;
            } else {
                darkMode2 = DarkMode.FORCE_ON;
            }
        } else {
            darkMode2 = darkMode;
        }
        DarkMode darkMode3 = darkMode == DarkMode.FORCE_AUTO ? darkMode2 : null;
        if (darkMode3 != null) {
            darkMode = darkMode3;
        }
        WebSettingsCompat.setForceDark(webView.getSettings(), darkMode.getValue());
        return webView;
    }
}
