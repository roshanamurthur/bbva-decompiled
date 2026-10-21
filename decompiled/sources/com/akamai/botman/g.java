package com.akamai.botman;

import android.app.Application;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26336f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f26337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f26338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Application f26339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26341e;

    public class a implements f.a {
        public a() {
        }

        @Override // com.akamai.botman.f.a
        public final void a() {
            g gVar = g.this;
            int i10 = g.f26336f;
            try {
                new Handler(Looper.getMainLooper()).post(gVar.new d());
                if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 2) {
                    com.cyberfend.cyfsecurity.CYFMonitor.b().a(8);
                } else if (gVar.f26341e == null) {
                    com.cyberfend.cyfsecurity.CYFMonitor.b().a(7);
                } else {
                    com.cyberfend.cyfsecurity.CYFMonitor.b().a(1);
                }
            } catch (Exception e5) {
                b4.f.a(e5);
            }
        }
    }

    public class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    public class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 2) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(4);
            } else if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 3) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(5);
            } else {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(6);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 2) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(4);
            } else if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 3) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(5);
            } else {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(6);
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 2) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(4);
            } else if (com.cyberfend.cyfsecurity.CYFMonitor.b().h() == 3) {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(5);
            } else {
                com.cyberfend.cyfsecurity.CYFMonitor.b().a(6);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            WebView webView = gVar.f26337a;
            if (webView != null) {
                webView.stopLoading();
                gVar.f26337a.removeJavascriptInterface("JSBridge");
                WebView webView2 = gVar.f26337a;
                WebView.setWebContentsDebuggingEnabled(false);
                gVar.f26337a.getSettings().setJavaScriptEnabled(false);
                gVar.f26339c.deleteDatabase("webview.db");
                gVar.f26339c.deleteDatabase("webviewCache.db");
                gVar.f26337a.clearHistory();
                gVar.f26337a.setWebViewClient(null);
                gVar.f26337a.setWebChromeClient(null);
                gVar.f26337a.loadUrl(null);
                gVar.f26337a.clearFormData();
                gVar.f26337a.clearSslPreferences();
                gVar.f26337a.clearFocus();
                gVar.f26337a.addJavascriptInterface(null, "JSBridge");
                gVar.f26337a.removeAllViewsInLayout();
                gVar.f26337a.removeAllViews();
                gVar.f26337a.clearAnimation();
                gVar.f26337a.destroy();
                gVar.f26337a = null;
            }
        }
    }

    static {
        g.class.toString();
    }

    public final void a() {
        try {
            this.f26337a = new WebView(this.f26339c);
            if (this.f26338b == null) {
                this.f26338b = new f(this.f26339c, new a());
            }
            if ((this.f26339c.getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            c();
        } catch (Exception e5) {
            b4.f.a(e5);
        }
    }

    public final String b() {
        if (this.f26338b.f26333c.booleanValue()) {
            return this.f26338b.f26334d;
        }
        return null;
    }

    public final void c() {
        try {
            this.f26337a.getSettings().setJavaScriptEnabled(true);
            this.f26337a.getSettings().setCacheMode(2);
            this.f26337a.addJavascriptInterface(this.f26338b, "JSBridge");
            this.f26337a.setWebChromeClient(new b());
            this.f26337a.setWebViewClient(new c());
            Uri.Builder builderBuildUpon = Uri.parse(this.f26340d).buildUpon();
            builderBuildUpon.appendPath("_sec");
            builderBuildUpon.appendPath("sdk_challenge.js");
            builderBuildUpon.appendQueryParameter("os", "android");
            builderBuildUpon.appendQueryParameter("starttime", this.f26338b.startTime());
            builderBuildUpon.appendQueryParameter("systemVersion", this.f26338b.systemVersion());
            builderBuildUpon.appendQueryParameter("model", this.f26338b.model());
            builderBuildUpon.appendQueryParameter("deviceHardwareType", this.f26338b.hardWareType());
            builderBuildUpon.appendQueryParameter("appIdentifier", this.f26338b.appIdentifier());
            builderBuildUpon.appendQueryParameter("deviceId", this.f26338b.androidId());
            String str = this.f26341e;
            if (str != null) {
                builderBuildUpon.appendQueryParameter("serverSideSignal", str);
            }
            this.f26337a.loadData("<!DOCTYPE html><html><body><script id=\"static\">var s_e=document.createElement(\"script\"); s_e.src=\"[[URL]]\"; document.head.appendChild(s_e);</script></body></html>".replace("[[URL]]", builderBuildUpon.toString()), "text/html; charset=UTF-8", null);
        } catch (Exception e5) {
            b4.f.a(e5);
        }
    }
}
