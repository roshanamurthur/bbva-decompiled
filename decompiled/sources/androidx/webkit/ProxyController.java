package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ProxyControllerImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyController {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProxyControllerImpl f24021a = new ProxyControllerImpl();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ProxyController() {
    }

    @NonNull
    public static ProxyController getInstance() {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.PROXY_OVERRIDE)) {
            return a.f24021a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void clearProxyOverride(@NonNull Executor executor, @NonNull Runnable runnable);

    public abstract void setProxyOverride(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable);
}
