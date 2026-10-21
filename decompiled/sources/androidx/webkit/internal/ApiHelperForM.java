package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public class ApiHelperForM {

    public class a extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f24051a;

        public a(WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
            this.f24051a = webMessageCallbackCompat;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f24051a.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    public class b extends WebMessagePort.WebMessageCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebMessagePortCompat.WebMessageCallbackCompat f24052a;

        public b(WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
            this.f24052a = webMessageCallbackCompat;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f24052a.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    public class c extends WebView.VisualStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebViewCompat.VisualStateCallback f24053a;

        public c(WebViewCompat.VisualStateCallback visualStateCallback) {
            this.f24053a = visualStateCallback;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j10) {
            this.f24053a.onComplete(j10);
        }
    }

    @DoNotInline
    public static void close(@NonNull WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    @NonNull
    @DoNotInline
    public static WebMessage createWebMessage(@NonNull WebMessageCompat webMessageCompat) {
        return new WebMessage(webMessageCompat.getData(), WebMessagePortImpl.compatToPorts(webMessageCompat.getPorts()));
    }

    @NonNull
    @DoNotInline
    public static WebMessagePort[] createWebMessageChannel(@NonNull WebView webView) {
        return webView.createWebMessageChannel();
    }

    @NonNull
    @DoNotInline
    public static WebMessageCompat createWebMessageCompat(@NonNull WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), WebMessagePortImpl.portsToCompat(webMessage.getPorts()));
    }

    @NonNull
    @DoNotInline
    public static CharSequence getDescription(@NonNull WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    @DoNotInline
    public static int getErrorCode(@NonNull WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    @DoNotInline
    public static boolean getOffscreenPreRaster(@NonNull WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    @DoNotInline
    public static void postMessage(@NonNull WebMessagePort webMessagePort, @NonNull WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    @DoNotInline
    public static void postVisualStateCallback(@NonNull WebView webView, long j10, @NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j10, new c(visualStateCallback));
    }

    @DoNotInline
    public static void postWebMessage(@NonNull WebView webView, @NonNull WebMessage webMessage, @NonNull Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    @DoNotInline
    public static void setOffscreenPreRaster(@NonNull WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    @DoNotInline
    public static void setWebMessageCallback(@NonNull WebMessagePort webMessagePort, @NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new a(webMessageCallbackCompat));
    }

    @DoNotInline
    public static void setWebMessageCallback(@NonNull WebMessagePort webMessagePort, @NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, @Nullable Handler handler) {
        webMessagePort.setWebMessageCallback(new b(webMessageCallbackCompat), handler);
    }
}
