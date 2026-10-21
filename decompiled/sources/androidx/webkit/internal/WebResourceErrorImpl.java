package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.annotation.NonNull;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebResourceError f24077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f24078b;

    public WebResourceErrorImpl(@NonNull InvocationHandler invocationHandler) {
        this.f24078b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    @NonNull
    public CharSequence getDescription() {
        ApiFeature.M m = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
        if (m.isSupportedByFramework()) {
            if (this.f24077a == null) {
                this.f24077a = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.f24078b));
            }
            return ApiHelperForM.getDescription(this.f24077a);
        }
        if (!m.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.f24078b == null) {
            this.f24078b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(this.f24077a));
        }
        return this.f24078b.getDescription();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        ApiFeature.M m = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
        if (m.isSupportedByFramework()) {
            if (this.f24077a == null) {
                this.f24077a = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.f24078b));
            }
            return ApiHelperForM.getErrorCode(this.f24077a);
        }
        if (!m.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.f24078b == null) {
            this.f24078b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(this.f24077a));
        }
        return this.f24078b.getErrorCode();
    }

    public WebResourceErrorImpl(@NonNull WebResourceError webResourceError) {
        this.f24077a = webResourceError;
    }
}
