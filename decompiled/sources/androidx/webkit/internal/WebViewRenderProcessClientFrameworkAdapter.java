package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.webkit.WebViewRenderProcessClient f24094a;

    public WebViewRenderProcessClientFrameworkAdapter(@NonNull androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.f24094a = webViewRenderProcessClient;
    }

    @Nullable
    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.f24094a;
    }

    public void onRenderProcessResponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f24094a.onRenderProcessResponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(@NonNull WebView webView, @Nullable WebViewRenderProcess webViewRenderProcess) {
        this.f24094a.onRenderProcessUnresponsive(webView, WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }
}
