package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessagePortImpl extends WebMessagePortCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebMessagePort f24075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f24076b;

    public WebMessagePortImpl(@NonNull WebMessagePort webMessagePort) {
        this.f24075a = webMessagePort;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessage compatToFrameworkMessage(@NonNull WebMessageCompat webMessageCompat) {
        return ApiHelperForM.createWebMessage(webMessageCompat);
    }

    @Nullable
    @RequiresApi(23)
    public static WebMessagePort[] compatToPorts(@Nullable WebMessagePortCompat[] webMessagePortCompatArr) {
        if (webMessagePortCompatArr == null) {
            return null;
        }
        int length = webMessagePortCompatArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = webMessagePortCompatArr[i10].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessageCompat frameworkMessageToCompat(@NonNull WebMessage webMessage) {
        return ApiHelperForM.createWebMessageCompat(webMessage);
    }

    @Nullable
    public static WebMessagePortCompat[] portsToCompat(@Nullable WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            webMessagePortCompatArr[i10] = new WebMessagePortImpl(webMessagePortArr[i10]);
        }
        return webMessagePortCompatArr;
    }

    public final WebMessagePortBoundaryInterface a() {
        if (this.f24076b == null) {
            this.f24076b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.f24075a));
        }
        return this.f24076b;
    }

    @RequiresApi(23)
    public final WebMessagePort b() {
        if (this.f24075a == null) {
            this.f24075a = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.f24076b));
        }
        return this.f24075a;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
        ApiFeature.M m = WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.close(b());
        } else {
            if (!m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().close();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    @NonNull
    @RequiresApi(23)
    public WebMessagePort getFrameworkPort() {
        return b();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    @NonNull
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(a());
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(@NonNull WebMessageCompat webMessageCompat) {
        ApiFeature.M m = WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.postMessage(b(), compatToFrameworkMessage(webMessageCompat));
        } else {
            if (!m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().postMessage(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(webMessageCompat)));
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        ApiFeature.M m = WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.setWebMessageCallback(b(), webMessageCallbackCompat);
        } else {
            if (!m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(webMessageCallbackCompat)));
        }
    }

    public WebMessagePortImpl(@NonNull InvocationHandler invocationHandler) {
        this.f24076b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@Nullable Handler handler, @NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        ApiFeature.M m = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.setWebMessageCallback(b(), webMessageCallbackCompat, handler);
        } else {
            if (m.isSupportedByWebView()) {
                a().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(webMessageCallbackCompat)), handler);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
