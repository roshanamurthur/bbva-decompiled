package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.q;
import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewRenderProcessImpl extends WebViewRenderProcess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> f24095c = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewRendererBoundaryInterface f24096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<android.webkit.WebViewRenderProcess> f24097b;

    public class a implements Callable<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WebViewRendererBoundaryInterface f24098p0;

        public a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f24098p0 = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new WebViewRenderProcessImpl(this.f24098p0);
        }
    }

    public WebViewRenderProcessImpl(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f24096a = webViewRendererBoundaryInterface;
    }

    @NonNull
    public static WebViewRenderProcessImpl forFrameworkObject(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> weakHashMap = f24095c;
        WebViewRenderProcessImpl webViewRenderProcessImpl = weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    @NonNull
    public static WebViewRenderProcessImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        ApiFeature.Q q10 = WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (q10.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcessE = q.e(this.f24097b.get());
            return webViewRenderProcessE != null && ApiHelperForQ.terminate(webViewRenderProcessE);
        }
        if (q10.isSupportedByWebView()) {
            return this.f24096a.terminate();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public WebViewRenderProcessImpl(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.f24097b = new WeakReference<>(webViewRenderProcess);
    }
}
