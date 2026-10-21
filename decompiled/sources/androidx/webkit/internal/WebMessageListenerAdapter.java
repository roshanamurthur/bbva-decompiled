package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewCompat.WebMessageListener f24074a;

    public WebMessageListenerAdapter(@NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.f24074a = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(@NonNull WebView webView, @NonNull InvocationHandler invocationHandler, @NonNull Uri uri, boolean z10, @NonNull InvocationHandler invocationHandler2) {
        this.f24074a.onPostMessage(webView, WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler)), uri, z10, JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler2));
    }
}
