package com.bbva.cells.pluginkit.web;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bbva.pluginkit.web.WebMessageReceiver;
import com.bbva.pluginkit.web.WebSender;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebCommunicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\n\u001a\u00020\u00052\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007j\u0002`\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/cells/pluginkit/web/WebCommunicator;", "Lcom/bbva/pluginkit/web/WebMessageReceiver;", "Lcom/bbva/pluginkit/web/WebSender;", "", "message", "", "send", "Lkotlin/Function1;", "Lcom/bbva/pluginkit/web/MessageListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onMessageReceive", "postMessage", "Landroid/webkit/WebView;", "webView", "Lcom/bbva/cells/pluginkit/web/JSBridge;", "jsBridge", "<init>", "(Landroid/webkit/WebView;Lcom/bbva/cells/pluginkit/web/JSBridge;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class WebCommunicator implements WebMessageReceiver, WebSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f26865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1<? super String, Unit> f26866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f26867c;

    /* JADX INFO: compiled from: WebCommunicator.kt */
    public static final class a extends Lambda implements Function1<String, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            WebCommunicator.this.postMessage(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WebCommunicator.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f26870q0;

        public b(String str) {
            this.f26870q0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebCommunicator.this.f26867c.evaluateJavascript(this.f26870q0, null);
        }
    }

    /* JADX INFO: compiled from: WebCommunicator.kt */
    public static final class c extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f26871p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public WebCommunicator(@NotNull WebView webView, @Nullable JSBridge jSBridge) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f26867c = webView;
        this.f26865a = LazyKt__LazyJVMKt.lazy(c.f26871p0);
        if (jSBridge == null) {
            webView.addJavascriptInterface(this, "PluginBridge");
        } else {
            jSBridge.onPostMessage(new a());
        }
    }

    @Override // com.bbva.pluginkit.web.WebMessageReceiver
    public void onMessageReceive(@NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26866b = listener;
    }

    @JavascriptInterface
    public final void postMessage(@Nullable String message) {
        Function1<? super String, Unit> function1;
        if (message == null || (function1 = this.f26866b) == null) {
            return;
        }
        function1.invoke(message);
    }

    @Override // com.bbva.pluginkit.web.WebSender
    public void send(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((Handler) this.f26865a.getValue()).post(new b(message));
    }

    public /* synthetic */ WebCommunicator(WebView webView, JSBridge jSBridge, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(webView, (i10 & 2) != 0 ? null : jSBridge);
    }
}
