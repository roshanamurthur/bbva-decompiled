package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.y;
import j3.h;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebkitToCompatConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f24099a;

    public WebkitToCompatConverter(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f24099a = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public InvocationHandler convertSafeBrowsingResponse(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.f24099a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @NonNull
    public InvocationHandler convertServiceWorkerSettings(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f24099a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @NonNull
    public WebSettingsAdapter convertSettings(@NonNull WebSettings webSettings) {
        return new WebSettingsAdapter((WebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, this.f24099a.convertSettings(webSettings)));
    }

    @NonNull
    public InvocationHandler convertWebMessagePort(@NonNull WebMessagePort webMessagePort) {
        return this.f24099a.convertWebMessagePort(webMessagePort);
    }

    @NonNull
    public InvocationHandler convertWebResourceError(@NonNull WebResourceError webResourceError) {
        return this.f24099a.convertWebResourceError(webResourceError);
    }

    @NonNull
    public WebResourceRequestAdapter convertWebResourceRequest(@NonNull WebResourceRequest webResourceRequest) {
        return new WebResourceRequestAdapter((WebResourceRequestBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, this.f24099a.convertWebResourceRequest(webResourceRequest)));
    }

    @NonNull
    @RequiresApi(27)
    public SafeBrowsingResponse convertSafeBrowsingResponse(@NonNull InvocationHandler invocationHandler) {
        return h.a(this.f24099a.convertSafeBrowsingResponse(invocationHandler));
    }

    @NonNull
    @RequiresApi(24)
    public ServiceWorkerWebSettings convertServiceWorkerSettings(@NonNull InvocationHandler invocationHandler) {
        return y.d(this.f24099a.convertServiceWorkerSettings(invocationHandler));
    }

    @NonNull
    @RequiresApi(23)
    public WebMessagePort convertWebMessagePort(@NonNull InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f24099a.convertWebMessagePort(invocationHandler);
    }

    @NonNull
    @RequiresApi(23)
    public WebResourceError convertWebResourceError(@NonNull InvocationHandler invocationHandler) {
        return (WebResourceError) this.f24099a.convertWebResourceError(invocationHandler);
    }
}
