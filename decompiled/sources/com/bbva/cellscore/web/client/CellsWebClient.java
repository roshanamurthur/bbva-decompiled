package com.bbva.cellscore.web.client;

import ai.a;
import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewAssetLoader;
import com.bbva.cellscore.extension.FileKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0017"}, d2 = {"Lcom/bbva/cellscore/web/client/CellsWebClient;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "Landroid/content/Context;", "context", "", "debugEnable", "<init>", "(Landroid/content/Context;Z)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public class CellsWebClient extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WebViewAssetLoader f27062b;

    public CellsWebClient(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27061a = z10;
        WebViewAssetLoader.Builder builder = new WebViewAssetLoader.Builder();
        builder.addPathHandler("/assets/", new WebViewAssetLoader.AssetsPathHandler(context));
        File file = new File(context.getCacheDir(), "cells_plugin");
        file = FileKt.createDir(file) ? file : null;
        if (file != null) {
            builder.addPathHandler("/public/", new WebViewAssetLoader.InternalStoragePathHandler(context, file));
        }
        Unit unit = Unit.INSTANCE;
        WebViewAssetLoader webViewAssetLoaderBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, "Builder().apply {\n      …)\n        }\n    }.build()");
        this.f27062b = webViewAssetLoaderBuild;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        view.evaluateJavascript(a.i(new Object[]{Integer.valueOf(Build.VERSION.SDK_INT)}, 1, "window.document.documentElement.setAttribute('isAndroid', %s);", "java.lang.String.format(format, *args)"), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f27061a) {
            handler.proceed();
        } else {
            super.onReceivedSslError(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        WebResourceResponse webResourceResponseShouldInterceptRequest = this.f27062b.shouldInterceptRequest(request.getUrl());
        if (webResourceResponseShouldInterceptRequest == null) {
            return null;
        }
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
        if (!l.endsWith(string, "js", true)) {
            return webResourceResponseShouldInterceptRequest;
        }
        webResourceResponseShouldInterceptRequest.setMimeType("text/javascript");
        return webResourceResponseShouldInterceptRequest;
    }
}
