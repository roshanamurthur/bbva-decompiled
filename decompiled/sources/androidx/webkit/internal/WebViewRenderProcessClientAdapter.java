package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f24085c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f24086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewRenderProcessClient f24087b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WebViewRenderProcessClient f24088p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WebView f24089q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WebViewRenderProcess f24090r0;

        public a(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl) {
            this.f24088p0 = webViewRenderProcessClient;
            this.f24089q0 = webView;
            this.f24090r0 = webViewRenderProcessImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24088p0.onRenderProcessUnresponsive(this.f24089q0, this.f24090r0);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WebViewRenderProcessClient f24091p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WebView f24092q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WebViewRenderProcess f24093r0;

        public b(WebViewRenderProcessClient webViewRenderProcessClient, WebView webView, WebViewRenderProcessImpl webViewRenderProcessImpl) {
            this.f24091p0 = webViewRenderProcessClient;
            this.f24092q0 = webView;
            this.f24093r0 = webViewRenderProcessImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24091p0.onRenderProcessResponsive(this.f24092q0, this.f24093r0);
        }
    }

    @SuppressLint({"LambdaLast"})
    public WebViewRenderProcessClientAdapter(@Nullable Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        this.f24086a = executor;
        this.f24087b = webViewRenderProcessClient;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return f24085c;
    }

    @Nullable
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.f24087b;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@NonNull WebView webView, @NonNull InvocationHandler invocationHandler) {
        WebViewRenderProcessImpl webViewRenderProcessImplForInvocationHandler = WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        WebViewRenderProcessClient webViewRenderProcessClient = this.f24087b;
        Executor executor = this.f24086a;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessResponsive(webView, webViewRenderProcessImplForInvocationHandler);
        } else {
            executor.execute(new b(webViewRenderProcessClient, webView, webViewRenderProcessImplForInvocationHandler));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@NonNull WebView webView, @NonNull InvocationHandler invocationHandler) {
        WebViewRenderProcessImpl webViewRenderProcessImplForInvocationHandler = WebViewRenderProcessImpl.forInvocationHandler(invocationHandler);
        WebViewRenderProcessClient webViewRenderProcessClient = this.f24087b;
        Executor executor = this.f24086a;
        if (executor == null) {
            webViewRenderProcessClient.onRenderProcessUnresponsive(webView, webViewRenderProcessImplForInvocationHandler);
        } else {
            executor.execute(new a(webViewRenderProcessClient, webView, webViewRenderProcessImplForInvocationHandler));
        }
    }
}
