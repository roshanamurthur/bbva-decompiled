package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ServiceWorkerClientCompat;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceWorkerClientAdapter implements ServiceWorkerClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceWorkerClientCompat f24063a;

    public ServiceWorkerClientAdapter(@NonNull ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.f24063a = serviceWorkerClientCompat;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.f24063a.shouldInterceptRequest(webResourceRequest);
    }
}
