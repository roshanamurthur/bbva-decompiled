package com.bbva.cells.bridge.widget;

import android.app.Activity;
import android.webkit.WebView;
import com.bbva.cells.bridge.CellsWebViewManager;
import com.bbva.cells.bridge.JsMessageDeserializer;
import com.bbva.cells.bridge.model.base.PayloadDTO;
import d4.a;
import io.reactivex.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CellsActivity<T> extends Activity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CellsWebViewManager<T> f26670p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CompositeDisposable f26671q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public WebView f26672r0;

    public void attachWebView(WebView webView, JsMessageDeserializer<T> jsMessageDeserializer, boolean z10) {
        this.f26672r0 = webView;
        this.f26670p0 = new CellsWebViewManager<>(webView, jsMessageDeserializer, z10);
    }

    public WebView getWebView() {
        return this.f26672r0;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        CellsWebViewManager<T> cellsWebViewManager = this.f26670p0;
        if (cellsWebViewManager != null) {
            cellsWebViewManager.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CompositeDisposable compositeDisposable = this.f26671q0;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    public abstract void onPostMessage(T t10);

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f26670p0 != null) {
            this.f26671q0 = new CompositeDisposable();
            this.f26671q0.add(this.f26670p0.subscribe(new a(this, 0)));
        }
    }

    public void sendMassage(String str, PayloadDTO payloadDTO) {
        this.f26670p0.postMessage(str, payloadDTO);
    }
}
