package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

/* JADX INFO: loaded from: classes2.dex */
public class WebResourceRequestCompat {
    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest) {
        ApiFeature.N n7 = WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (n7.isSupportedByFramework()) {
            return ApiHelperForN.isRedirect(webResourceRequest);
        }
        if (n7.isSupportedByWebView()) {
            return WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(webResourceRequest).isRedirect();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
