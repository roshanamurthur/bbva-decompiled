package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.TracingConfig;
import androidx.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class TracingControllerImpl extends TracingController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.webkit.TracingController f24069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TracingControllerBoundaryInterface f24070b;

    public TracingControllerImpl() {
        ApiFeature.P p4 = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p4.isSupportedByFramework()) {
            this.f24069a = ApiHelperForP.getTracingControllerInstance();
            this.f24070b = null;
        } else {
            if (!p4.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            this.f24069a = null;
            this.f24070b = WebViewGlueCommunicator.getFactory().getTracingController();
        }
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        ApiFeature.P p4 = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p4.isSupportedByFramework()) {
            if (this.f24069a == null) {
                this.f24069a = ApiHelperForP.getTracingControllerInstance();
            }
            return ApiHelperForP.isTracing(this.f24069a);
        }
        if (!p4.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.f24070b == null) {
            this.f24070b = WebViewGlueCommunicator.getFactory().getTracingController();
        }
        return this.f24070b.isTracing();
    }

    @Override // androidx.webkit.TracingController
    public void start(@NonNull TracingConfig tracingConfig) {
        if (tracingConfig == null) {
            throw new IllegalArgumentException("Tracing config must be non null");
        }
        ApiFeature.P p4 = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p4.isSupportedByFramework()) {
            if (this.f24069a == null) {
                this.f24069a = ApiHelperForP.getTracingControllerInstance();
            }
            ApiHelperForP.start(this.f24069a, tracingConfig);
        } else {
            if (!p4.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            if (this.f24070b == null) {
                this.f24070b = WebViewGlueCommunicator.getFactory().getTracingController();
            }
            this.f24070b.start(tracingConfig.getPredefinedCategories(), tracingConfig.getCustomIncludedCategories(), tracingConfig.getTracingMode());
        }
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(@Nullable OutputStream outputStream, @NonNull Executor executor) {
        ApiFeature.P p4 = WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p4.isSupportedByFramework()) {
            if (this.f24069a == null) {
                this.f24069a = ApiHelperForP.getTracingControllerInstance();
            }
            return ApiHelperForP.stop(this.f24069a, outputStream, executor);
        }
        if (!p4.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.f24070b == null) {
            this.f24070b = WebViewGlueCommunicator.getFactory().getTracingController();
        }
        return this.f24070b.stop(outputStream, executor);
    }
}
