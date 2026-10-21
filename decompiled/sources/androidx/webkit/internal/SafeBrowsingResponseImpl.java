package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f24061b;

    public SafeBrowsingResponseImpl(@NonNull InvocationHandler invocationHandler) {
        this.f24061b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public final SafeBrowsingResponseBoundaryInterface a() {
        if (this.f24061b == null) {
            this.f24061b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.f24060a));
        }
        return this.f24061b;
    }

    @RequiresApi(27)
    public final SafeBrowsingResponse b() {
        if (this.f24060a == null) {
            this.f24060a = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f24061b));
        }
        return this.f24060a;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean z10) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.backToSafety(b(), z10);
        } else {
            if (!o_mr1.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().backToSafety(z10);
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean z10) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.proceed(b(), z10);
        } else {
            if (!o_mr1.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().proceed(z10);
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean z10) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.showInterstitial(b(), z10);
        } else {
            if (!o_mr1.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            a().showInterstitial(z10);
        }
    }

    public SafeBrowsingResponseImpl(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        this.f24060a = safeBrowsingResponse;
    }
}
