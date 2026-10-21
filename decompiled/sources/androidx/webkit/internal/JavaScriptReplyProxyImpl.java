package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f24057a;

    public class a implements Callable<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ JsReplyProxyBoundaryInterface f24058p0;

        public a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f24058p0 = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return new JavaScriptReplyProxyImpl(this.f24058p0);
        }
    }

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f24057a = jsReplyProxyBoundaryInterface;
    }

    @NonNull
    public static JavaScriptReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.f24057a.postMessage(str);
    }
}
