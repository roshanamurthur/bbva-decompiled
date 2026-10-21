package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceWorkerController f24064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceWorkerControllerBoundaryInterface f24065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServiceWorkerWebSettingsImpl f24066c;

    public ServiceWorkerControllerImpl() {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n7.isSupportedByFramework()) {
            ServiceWorkerController serviceWorkerControllerInstance = ApiHelperForN.getServiceWorkerControllerInstance();
            this.f24064a = serviceWorkerControllerInstance;
            this.f24065b = null;
            if (serviceWorkerControllerInstance == null) {
                this.f24064a = ApiHelperForN.getServiceWorkerControllerInstance();
            }
            this.f24066c = ApiHelperForN.getServiceWorkerWebSettingsImpl(this.f24064a);
            return;
        }
        if (!n7.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.f24064a = null;
        ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        this.f24065b = serviceWorkerController;
        this.f24066c = new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    @NonNull
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.f24066c;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat) {
        ApiFeature.N n7 = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n7.isSupportedByFramework()) {
            if (serviceWorkerClientCompat == null) {
                if (this.f24064a == null) {
                    this.f24064a = ApiHelperForN.getServiceWorkerControllerInstance();
                }
                ApiHelperForN.setServiceWorkerClient(this.f24064a, null);
                return;
            } else {
                if (this.f24064a == null) {
                    this.f24064a = ApiHelperForN.getServiceWorkerControllerInstance();
                }
                ApiHelperForN.setServiceWorkerClientCompat(this.f24064a, serviceWorkerClientCompat);
                return;
            }
        }
        if (!n7.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (serviceWorkerClientCompat == null) {
            if (this.f24065b == null) {
                this.f24065b = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            }
            this.f24065b.setServiceWorkerClient(null);
        } else {
            if (this.f24065b == null) {
                this.f24065b = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            }
            this.f24065b.setServiceWorkerClient(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new ServiceWorkerClientAdapter(serviceWorkerClientCompat)));
        }
    }
}
