package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceWorkerWebSettings f24067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceWorkerWebSettingsBoundaryInterface f24068b;

    public ServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f24067a = serviceWorkerWebSettings;
    }

    public final ServiceWorkerWebSettingsBoundaryInterface a() {
        if (this.f24068b == null) {
            this.f24068b = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.f24067a));
        }
        return this.f24068b;
    }

    @RequiresApi(24)
    public final ServiceWorkerWebSettings b() {
        if (this.f24067a == null) {
            this.f24067a = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.f24068b));
        }
        return this.f24067a;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.getAllowContentAccess(b());
        }
        if (n7.isSupportedByWebView()) {
            return a().getAllowContentAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.getAllowFileAccess(b());
        }
        if (n7.isSupportedByWebView()) {
            return a().getAllowFileAccess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.getBlockNetworkLoads(b());
        }
        if (n7.isSupportedByWebView()) {
            return a().getBlockNetworkLoads();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.getCacheMode(b());
        }
        if (n7.isSupportedByWebView()) {
            return a().getCacheMode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getRequestedWithHeaderMode() {
        if (WebViewFeatureInternal.REQUESTED_WITH_HEADER_CONTROL.isSupportedByWebView()) {
            return a().getRequestedWithHeaderMode();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z10) {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n7.isSupportedByFramework()) {
            ApiHelperForN.setAllowContentAccess(b(), z10);
        } else {
            if (!n7.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().setAllowContentAccess(z10);
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z10) {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n7.isSupportedByFramework()) {
            ApiHelperForN.setAllowFileAccess(b(), z10);
        } else {
            if (!n7.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().setAllowFileAccess(z10);
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z10) {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n7.isSupportedByFramework()) {
            ApiHelperForN.setBlockNetworkLoads(b(), z10);
        } else {
            if (!n7.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().setBlockNetworkLoads(z10);
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int i10) {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n7.isSupportedByFramework()) {
            ApiHelperForN.setCacheMode(b(), i10);
        } else {
            if (!n7.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().setCacheMode(i10);
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderMode(int i10) {
        if (!WebViewFeatureInternal.REQUESTED_WITH_HEADER_CONTROL.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        a().setRequestedWithHeaderMode(i10);
    }

    public ServiceWorkerWebSettingsImpl(@NonNull InvocationHandler invocationHandler) {
        this.f24068b = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
