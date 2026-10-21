package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewProviderAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderBoundaryInterface f24083a;

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f24083a = webViewProviderBoundaryInterface;
    }

    @NonNull
    public ScriptHandlerImpl addDocumentStartJavaScript(@NonNull String str, @NonNull String[] strArr) {
        return ScriptHandlerImpl.toScriptHandler(this.f24083a.addDocumentStartJavaScript(str, strArr));
    }

    @RequiresApi(19)
    public void addWebMessageListener(@NonNull String str, @NonNull String[] strArr, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.f24083a.addWebMessageListener(str, strArr, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageListenerAdapter(webMessageListener)));
    }

    @NonNull
    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.f24083a.createWebMessageChannel();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i10 = 0; i10 < invocationHandlerArrCreateWebMessageChannel.length; i10++) {
            webMessagePortCompatArr[i10] = new WebMessagePortImpl(invocationHandlerArrCreateWebMessageChannel[i10]);
        }
        return webMessagePortCompatArr;
    }

    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.f24083a.getWebChromeClient();
    }

    @NonNull
    public WebViewClient getWebViewClient() {
        return this.f24083a.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.f24083a.getWebViewRenderer());
    }

    @Nullable
    @RequiresApi(19)
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.f24083a.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((WebViewRenderProcessClientAdapter) BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    @RequiresApi(19)
    public void insertVisualStateCallback(long j10, @NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        this.f24083a.insertVisualStateCallback(j10, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new VisualStateCallbackAdapter(visualStateCallback)));
    }

    @RequiresApi(19)
    public void postWebMessage(@NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        this.f24083a.postMessageToMainFrame(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(webMessageCompat)), uri);
    }

    public void removeWebMessageListener(@NonNull String str) {
        this.f24083a.removeWebMessageListener(str);
    }

    @RequiresApi(19)
    @SuppressLint({"LambdaLast"})
    public void setWebViewRenderProcessClient(@Nullable Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        this.f24083a.setWebViewRendererClient(webViewRenderProcessClient != null ? BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }
}
