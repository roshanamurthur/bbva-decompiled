package com.bbva.cellscore.web.plugin;

import android.app.Application;
import android.webkit.WebView;
import com.bbva.cells.pluginkit.PluginManager;
import com.bbva.cells.pluginkit.provider.PlatformProvider;
import com.bbva.cells.pluginkit.web.WebCommunicator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0000¨\u0006\u000b"}, d2 = {"platformProviderOf", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "app", "Landroid/app/Application;", "webView", "Landroid/webkit/WebView;", "pluginManagerOf", "Lcom/bbva/cells/pluginkit/PluginManager;", "communicator", "Lcom/bbva/cells/pluginkit/web/WebCommunicator;", "provider", "cells-core_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class PluginBridgeKt {
    @NotNull
    public static final PlatformProvider platformProviderOf(@NotNull Application app, @NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(webView, "webView");
        return new PlatformProvider(app, webView, null, null, null, 28, null);
    }

    @NotNull
    public static final PluginManager pluginManagerOf(@NotNull WebCommunicator communicator, @NotNull PlatformProvider provider) {
        Intrinsics.checkNotNullParameter(communicator, "communicator");
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new PluginManager(communicator, provider, null, 4, null);
    }
}
