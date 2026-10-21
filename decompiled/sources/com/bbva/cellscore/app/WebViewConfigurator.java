package com.bbva.cellscore.app;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.camera.core.processing.m;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.bbva.cells.bridge.CellsWebViewManager;
import com.bbva.cellscore.helper.WebHelperKt;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.client.CellsWebChromeClient;
import com.bbva.cellscore.web.client.CellsWebClient;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.data.configutation.WebConfiguration;
import com.bbva.cellscore.web.deserializer.CellsMessageDeserializer;
import com.bbva.cellscore.web.navigation.Route;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebViewConfigurator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005J\u0006\u0010\n\u001a\u00020\bR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/bbva/cellscore/app/WebViewConfigurator;", "", "Lio/reactivex/functions/Consumer;", "Lcom/bbva/cellscore/web/data/CellsMessage;", "consumer", "Lcom/bbva/cells/bridge/CellsWebViewManager;", "createWebManager", "manager", "", "replaceWebManagerOrigin", "load", "Lcom/bbva/cellscore/web/navigation/Route;", "b", "Lcom/bbva/cellscore/web/navigation/Route;", "getNativeContainer", "()Lcom/bbva/cellscore/web/navigation/Route;", "nativeContainer", "Landroid/webkit/WebView;", "webView", "Lcom/bbva/cellscore/app/WebViewBuilder;", "runtimeOptions", "Lcom/bbva/cellscore/web/data/configutation/WebConfiguration;", "options", "<init>", "(Landroid/webkit/WebView;Lcom/bbva/cellscore/app/WebViewBuilder;Lcom/bbva/cellscore/web/data/configutation/WebConfiguration;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class WebViewConfigurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebView f26926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Route nativeContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f26928c;

    public WebViewConfigurator(@NotNull WebView webView, @NotNull WebViewBuilder runtimeOptions, @NotNull WebConfiguration options) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(runtimeOptions, "runtimeOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f26926a = webView;
        Route nativeWebContainerRoute = runtimeOptions.getNativeWebContainerRoute();
        this.nativeContainer = nativeWebContainerRoute == null ? new Route(WebViewActivity.class) : nativeWebContainerRoute;
        String htmlIndex = WebHelperKt.getHtmlIndex(options, runtimeOptions.getIndex());
        this.f26928c = htmlIndex;
        CellsWebChromeClient chromeClient = runtimeOptions.getChromeClient();
        webView.setWebChromeClient(chromeClient == null ? new CellsWebChromeClient() : chromeClient);
        CellsWebClient client = runtimeOptions.getClient();
        if (client == null) {
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "webView.context");
            client = new CellsWebClient(context, runtimeOptions.isWebDebugging());
        }
        webView.setWebViewClient(client);
        if (runtimeOptions.getWebViewLoadDelay() > 0) {
            webView.postDelayed(new m(this, 1), runtimeOptions.getWebViewLoadDelay());
        } else if (runtimeOptions.isAutoLoadEnabled()) {
            webView.loadUrl(htmlIndex);
        }
        if (runtimeOptions.isEnableCookies()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(webView, true);
            CookieManager.setAcceptFileSchemeCookies(true);
            CookieManager.allowFileSchemeCookies();
        }
        if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
            WebSettingsCompat.setForceDark(webView.getSettings(), runtimeOptions.getDarkMode().getMode());
        }
        WebView.setWebContentsDebuggingEnabled(runtimeOptions.isWebDebugging());
    }

    @NotNull
    public final CellsWebViewManager<CellsMessage> createWebManager(@NotNull Consumer<CellsMessage> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        CellsWebViewManager<CellsMessage> cellsWebViewManager = new CellsWebViewManager<>(this.f26926a, new CellsMessageDeserializer(), true);
        cellsWebViewManager.subscribe(consumer);
        cellsWebViewManager.setJsInvoke(WebHelperKt.createPostMessageFunction(this.f26928c));
        return cellsWebViewManager;
    }

    @NotNull
    public final Route getNativeContainer() {
        return this.nativeContainer;
    }

    public final void load() {
        this.f26926a.loadUrl(this.f26928c);
    }

    public final void replaceWebManagerOrigin(@NotNull CellsWebViewManager<CellsMessage> manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.setJsInvoke(WebHelperKt.createPostMessageFunction(this.f26928c));
    }
}
