package com.bbva.cells.bridge;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.bbva.cells.bridge.model.NativeMessageDTO;
import com.bbva.cells.bridge.model.base.PayloadDTO;
import com.google.gson.Gson;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class CellsWebViewManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSBridge<T> f26660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f26661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f26662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26663d;

    @SuppressLint({"SetJavaScriptEnabled"})
    public CellsWebViewManager(@NonNull WebView webView, @NonNull JsMessageDeserializer<T> jsMessageDeserializer) {
        this(webView, jsMessageDeserializer, false);
    }

    public void destroy() {
        WebView webView = this.f26662c;
        if (webView != null) {
            webView.removeJavascriptInterface("NativeBridge");
        }
    }

    @MainThread
    public void postMessage(@NonNull String str, @NonNull PayloadDTO payloadDTO) {
        this.f26662c.loadUrl(String.format(this.f26663d, this.f26661b.toJson(new NativeMessageDTO(str, payloadDTO))));
    }

    public void setJsInvoke(String str) {
        this.f26663d = str;
    }

    public Disposable subscribe(@NonNull Consumer<T> consumer) {
        return subscribe(consumer, "");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public CellsWebViewManager(@NonNull WebView webView, @NonNull JsMessageDeserializer<T> jsMessageDeserializer, boolean z10) {
        this.f26662c = webView;
        JSBridge<T> jSBridge = new JSBridge<>(jsMessageDeserializer, z10);
        this.f26660a = jSBridge;
        this.f26661b = new Gson();
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setAppCacheEnabled(true);
        webView.addJavascriptInterface(jSBridge, "NativeBridge");
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccessFromFileURLs(true);
        this.f26663d = "javascript:window.postMessage('%s','file:///android_asset/www/cellsNativePlugin')";
    }

    public Disposable subscribe(@NonNull Consumer<T> consumer, @NonNull String str) {
        return this.f26660a.subscribe(consumer);
    }
}
