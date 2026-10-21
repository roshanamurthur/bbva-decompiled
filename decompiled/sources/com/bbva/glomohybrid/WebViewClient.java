package com.bbva.glomohybrid;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.camera.core.processing.f;
import com.bbva.cellscore.web.client.CellsWebClient;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomohybrid.usecase.GetUrlUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebViewClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/WebViewClient;", "Lcom/bbva/cellscore/web/client/CellsWebClient;", "Landroid/webkit/WebView;", "webView", "", "url", "", "shouldOverrideUrlLoading", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/content/Context;", "context", "debugEnable", "Lcom/bbva/glomohybrid/usecase/GetUrlUseCase;", "getUrlUseCase", "<init>", "(Landroid/content/Context;ZLcom/bbva/glomohybrid/usecase/GetUrlUseCase;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class WebViewClient extends CellsWebClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final GetUrlUseCase f31010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewClient(@NotNull Context context, boolean z10, @NotNull GetUrlUseCase getUrlUseCase) {
        super(context, z10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getUrlUseCase, "getUrlUseCase");
        this.f31010c = getUrlUseCase;
    }

    public final boolean a(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        if (l.startsWith(str, this.f31010c.execute(UserType.PERSONAL), true)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            intent.addFlags(268435456);
            webView.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e5) {
            LoggerKt.logError$default(f.d("Not found app to open ", str), e5, null, 4, null);
            e5.printStackTrace();
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        return a(webView, url);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(webView, string);
    }
}
