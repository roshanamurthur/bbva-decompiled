package com.bbva.bridge.core;

import com.bbva.bridge.webcontroller.WebControllerExtensionsKt;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.web.WebController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebProfileLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/bridge/core/WebProfileLoader;", "", "", "id", "", "isLoaded", "", "loadWeb", "Lcom/bbva/cellscore/app/WebViewBuilder;", "webViewConfiguration", "Lcom/bbva/cellscore/app/AppLifecycle;", "appLifecycle", "<init>", "(Lcom/bbva/cellscore/app/WebViewBuilder;Lcom/bbva/cellscore/app/AppLifecycle;)V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
public final class WebProfileLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebViewBuilder f26605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppLifecycle f26606b;

    public WebProfileLoader(@NotNull WebViewBuilder webViewConfiguration, @NotNull AppLifecycle appLifecycle) {
        Intrinsics.checkNotNullParameter(webViewConfiguration, "webViewConfiguration");
        Intrinsics.checkNotNullParameter(appLifecycle, "appLifecycle");
        this.f26605a = webViewConfiguration;
        this.f26606b = appLifecycle;
    }

    public final boolean isLoaded(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Intrinsics.areEqual(this.f26605a.getWebId(), id);
    }

    public final void loadWeb(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        String name = WebController.ON_WEB_READY_CHANNEL.getName();
        AppLifecycle appLifecycle = this.f26606b;
        appLifecycle.cleanChannel(name);
        WebViewBuilder webViewBuilderWebViewLoadDelay = this.f26605a.webId(id).webViewLoadDelay(0L);
        Intrinsics.checkNotNullExpressionValue(webViewBuilderWebViewLoadDelay, "webViewLoadDelay(...)");
        WebControllerExtensionsKt.switchWebConfiguration(appLifecycle, webViewBuilderWebViewLoadDelay);
    }
}
