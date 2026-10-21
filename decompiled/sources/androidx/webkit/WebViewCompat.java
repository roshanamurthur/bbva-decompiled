package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f24045a = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f24046b = Uri.parse("");

    public interface VisualStateCallback {
        @UiThread
        void onComplete(long j10);
    }

    public interface WebMessageListener {
        @UiThread
        void onPostMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri, boolean z10, @NonNull JavaScriptReplyProxy javaScriptReplyProxy);
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static ScriptHandler addDocumentStartJavaScript(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set) {
        if (WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return b(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addWebMessageListener(@NonNull WebView webView, @NonNull String str, @NonNull Set<String> set, @NonNull WebMessageListener webMessageListener) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        b(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), webMessageListener);
    }

    public static WebViewProviderAdapter b(WebView webView) {
        return new WebViewProviderAdapter(WebViewGlueCommunicator.getFactory().createWebView(webView));
    }

    @NonNull
    public static WebMessagePortCompat[] createWebMessageChannel(@NonNull WebView webView) {
        ApiFeature.M m = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (m.isSupportedByFramework()) {
            return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webView));
        }
        if (m.isSupportedByWebView()) {
            return b(webView).createWebMessageChannel();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static PackageInfo getCurrentWebViewPackage(@NonNull Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return ApiHelperForO.getCurrentWebViewPackage();
        }
        try {
            PackageInfo packageInfoA = a();
            if (packageInfoA != null) {
                return packageInfoA;
            }
            String str = i10 <= 23 ? (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @NonNull
    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return WebViewGlueCommunicator.getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static String getVariationsHeader() {
        if (WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return WebViewGlueCommunicator.getFactory().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView) {
        ApiFeature.O o2 = WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (o2.isSupportedByFramework()) {
            return ApiHelperForO.getWebChromeClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            return b(webView).getWebChromeClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @NonNull
    public static WebViewClient getWebViewClient(@NonNull WebView webView) {
        ApiFeature.O o2 = WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (o2.isSupportedByFramework()) {
            return ApiHelperForO.getWebViewClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            return b(webView).getWebViewClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Nullable
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        ApiFeature.Q q10 = WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (!q10.isSupportedByFramework()) {
            if (q10.isSupportedByWebView()) {
                return b(webView).getWebViewRenderProcess();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        android.webkit.WebViewRenderProcess webViewRenderProcess = ApiHelperForQ.getWebViewRenderProcess(webView);
        if (webViewRenderProcess != null) {
            return WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
        }
        return null;
    }

    @Nullable
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        ApiFeature.Q q10 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (!q10.isSupportedByFramework()) {
            if (q10.isSupportedByWebView()) {
                return b(webView).getWebViewRenderProcessClient();
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = ApiHelperForQ.getWebViewRenderProcessClient(webView);
        if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof WebViewRenderProcessClientFrameworkAdapter)) {
            return null;
        }
        return ((WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
    }

    public static boolean isMultiProcessEnabled() {
        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return WebViewGlueCommunicator.getFactory().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postVisualStateCallback(@NonNull WebView webView, long j10, @NonNull VisualStateCallback visualStateCallback) {
        ApiFeature.M m = WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.postVisualStateCallback(webView, j10, visualStateCallback);
            return;
        }
        if (!m.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = ApiHelperForP.getWebViewLooper(webView);
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
        b(webView).insertVisualStateCallback(j10, visualStateCallback);
    }

    public static void postWebMessage(@NonNull WebView webView, @NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        if (f24045a.equals(uri)) {
            uri = f24046b;
        }
        ApiFeature.M m = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (m.isSupportedByFramework()) {
            ApiHelperForM.postWebMessage(webView, WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (!m.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            b(webView).postWebMessage(webMessageCompat, uri);
        }
    }

    public static void removeWebMessageListener(@NonNull WebView webView, @NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        b(webView).removeWebMessageListener(str);
    }

    public static void setSafeBrowsingAllowlist(@NonNull Set<String> set, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 o_mr2 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            WebViewGlueCommunicator.getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (o_mr2.isSupportedByFramework()) {
            ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!o_mr2.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            WebViewGlueCommunicator.getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(@NonNull List<String> list, @Nullable ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    @SuppressLint({"LambdaLast"})
    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @NonNull WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.Q q10 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q10.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else {
            if (!q10.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            b(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
        }
    }

    public static void startSafeBrowsing(@NonNull Context context, @Nullable ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else {
            if (!o_mr1.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            WebViewGlueCommunicator.getFactory().getStatics().initSafeBrowsing(context, valueCallback);
        }
    }

    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        ApiFeature.Q q10 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q10.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else {
            if (q10.isSupportedByWebView()) {
                b(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
