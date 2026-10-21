package com.bbva.cellscore.web.plugin;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.callback.PluginResult;
import com.bbva.androidtoolkit.plugin.command.callback.PluginTarget;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessageDTO;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.cells.bridge.JSBridge;
import com.bbva.cells.pluginkit.PluginManager;
import com.bbva.cells.pluginkit.provider.XPluginFactory;
import com.bbva.cells.pluginkit.web.WebCommunicator;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.helper.WebHelperKt;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.web.data.configutation.WebConfiguration;
import com.bbva.cellscore.web.plugin.deserializer.PluginRequestDeserializer;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m4.b;

/* JADX INFO: loaded from: classes2.dex */
public class WebPluginManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f27201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f27202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f27203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityContainer f27204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f27205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f27206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f27207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PluginFactory f27208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PluginManager f27209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PluginBridge f27210j;

    public static class a implements PluginTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebView f27211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f27212b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Gson f27213c = new Gson();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f27214d;

        public a(WebView webView, String str) {
            this.f27211a = webView;
            this.f27214d = WebHelperKt.createPostMessageFunction(str);
        }

        @Override // com.bbva.androidtoolkit.plugin.command.callback.PluginTarget
        public final void send(String str, PluginResult pluginResult) {
            WebPluginManager.a("send", CellsLoggerKt.paramOf("id", str), CellsLoggerKt.paramOf("result", pluginResult));
            String str2 = String.format("javascript:window.CellsNativePlugins.pluginManager.pluginResponse('%s', %s)", str, pluginResult.toString());
            WebPluginManager.a("sendMessageToWeb", CellsLoggerKt.paramOf("message", str2));
            this.f27212b.post(new b(this, str2, 0));
        }

        @Override // com.bbva.androidtoolkit.plugin.command.callback.PluginTarget
        public final void sendPostMessage(PostMessageDTO postMessageDTO) {
            WebPluginManager.a("sendPostMessage", CellsLoggerKt.paramOf("postMessageDTO", postMessageDTO));
            String str = String.format(this.f27214d, this.f27213c.toJson(postMessageDTO));
            WebPluginManager.a("sendMessageToWeb", CellsLoggerKt.paramOf("message", str));
            this.f27212b.post(new b(this, str, 0));
        }
    }

    public WebPluginManager(Application application, WebView webView, WebViewBuilder webViewBuilder, WebConfiguration webConfiguration, XPluginFactory xPluginFactory) {
        PluginBridge pluginBridge = new PluginBridge();
        this.f27210j = pluginBridge;
        this.f27202b = webView;
        this.f27203c = application;
        this.f27201a = new HashMap();
        String htmlIndex = WebHelperKt.getHtmlIndex(webConfiguration, webViewBuilder.getIndex());
        this.f27207g = new a(webView, htmlIndex);
        this.f27205e = Executors.newCachedThreadPool();
        this.f27206f = new Handler(Looper.getMainLooper());
        this.f27204d = new ActivityContainer();
        JSBridge jSBridge = new JSBridge(new PluginRequestDeserializer(), false);
        webView.addJavascriptInterface(jSBridge, "PluginBridge");
        jSBridge.subscribe(new m4.a(this, 0));
        PluginManager pluginManagerPluginManagerOf = PluginBridgeKt.pluginManagerOf(new WebCommunicator(webView, pluginBridge), PluginBridgeKt.platformProviderOf(application, webView));
        this.f27209i = pluginManagerPluginManagerOf;
        pluginManagerPluginManagerOf.setUrl(htmlIndex);
        pluginManagerPluginManagerOf.setPluginFactory(xPluginFactory);
    }

    public static void a(String str, LogParam... logParamArr) {
        CellsLogger.INSTANCE.logMethod(LogModule.PluginManager, str, logParamArr);
    }

    public void register(@NonNull List<Plugin> list) {
        a("register", CellsLoggerKt.paramOf("plugins", list));
        Iterator<Plugin> it = list.iterator();
        while (it.hasNext()) {
            register(it.next());
        }
    }

    public void reload(WebViewBuilder webViewBuilder, WebConfiguration webConfiguration) {
        a("reload", CellsLoggerKt.paramOf("runtimeOptions", webViewBuilder), CellsLoggerKt.paramOf("webConfiguration", webConfiguration));
        String htmlIndex = WebHelperKt.getHtmlIndex(webConfiguration, webViewBuilder.getIndex());
        this.f27207g = new a(this.f27202b, htmlIndex);
        this.f27209i.setUrl(htmlIndex);
    }

    public void setActivity(Activity activity) {
        this.f27204d.set(activity);
    }

    public void register(@NonNull PluginFactory pluginFactory) {
        a("register", CellsLoggerKt.paramOf("plugins", pluginFactory.list()));
        this.f27208h = pluginFactory;
    }

    public void register(@NonNull Plugin plugin) {
        a("register", CellsLoggerKt.paramOf("plugin", plugin.getId()));
        plugin.initialize(new PluginComponentContainer.PluginComponentBuilder().webView(this.f27202b).uiHandler(this.f27206f).threadPool(this.f27205e).application(this.f27203c).activityContainer(this.f27204d).postMessenger(new PostMessenger(this.f27207g, plugin.getId(), "cellsNativePlugin")).build());
        this.f27201a.put(plugin.getId(), plugin);
    }
}
