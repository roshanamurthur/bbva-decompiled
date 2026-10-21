package com.bbva.cellscore.app;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.cells.component.kit.tracking.Tracker;
import com.bbva.cells.pluginkit.provider.XPluginFactory;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.logger.LogPrinter;
import com.bbva.cellscore.logger.LoggerSettings;
import com.bbva.cellscore.reactor.PageReactionManager;
import com.bbva.cellscore.web.deserializer.model.RouteReaderConfig;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.cellscore.web.navigation.RouterFactory;
import com.bbva.cellscore.web.plugin.PluginFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AppLifecycleBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f26889a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LogPrinter f26895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PageReactionManager f26896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26897i;
    public boolean m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RouterFactory f26890b = new RouterFactory(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Plugin> f26891c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PluginFactory f26892d = new PluginFactory();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public XPluginFactory f26893e = new XPluginFactory();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LoggerSettings f26894f = LoggerSettings.Nothing.INSTANCE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26901n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FeatureFlagManager f26902o = new FeatureFlagManager();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f26898j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public WebViewBuilder f26899k = new WebViewBuilder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RouteReaderConfig f26900l = new RouteReaderConfig();

    public AppLifecycleBuilder addPlugin(Plugin plugin) {
        this.f26891c.add(plugin);
        return this;
    }

    public AppLifecycleBuilder addTracker(Tracker tracker) {
        this.f26898j.add(tracker);
        return this;
    }

    public AppLifecycleBuilder app(Application application) {
        this.f26889a = application;
        return this;
    }

    public AppLifecycle create() {
        return null;
    }

    public AppLifecycleBuilder deactivatePageOnStop() {
        this.m = true;
        return this;
    }

    public AppLifecycleBuilder debugEnable() {
        this.f26897i = true;
        this.f26894f = LoggerSettings.All.INSTANCE;
        this.f26899k.webDebugging(true);
        return this;
    }

    @Deprecated
    public AppLifecycleBuilder enableLog(boolean z10) {
        this.f26894f = z10 ? LoggerSettings.All.INSTANCE : LoggerSettings.Nothing.INSTANCE;
        return this;
    }

    public AppLifecycleBuilder featureFlagManager(FeatureFlagManager featureFlagManager) {
        this.f26902o = featureFlagManager;
        return this;
    }

    public AppLifecycleBuilder flavor(String str) {
        flavor(str, true);
        return this;
    }

    public AppLifecycleBuilder globalConfiguration(Map<String, String> map) {
        this.f26900l.setGlobalConfiguration(map);
        return this;
    }

    @Deprecated
    public AppLifecycleBuilder htmlIndex(String str) {
        this.f26899k.index(str);
        return this;
    }

    public AppLifecycleBuilder logSettings(LoggerSettings loggerSettings) {
        this.f26894f = loggerSettings;
        return this;
    }

    @Deprecated
    public AppLifecycleBuilder nativeWebContainer(Route route) {
        this.f26899k.nativeWebContainerRoute(route);
        return this;
    }

    public AppLifecycleBuilder pluginFactory(PluginFactory pluginFactory) {
        this.f26892d = pluginFactory;
        return this;
    }

    public AppLifecycleBuilder plugins(List<Plugin> list) {
        this.f26891c = list;
        return this;
    }

    public AppLifecycleBuilder reactionManager(PageReactionManager pageReactionManager) {
        this.f26896h = pageReactionManager;
        return this;
    }

    public AppLifecycleBuilder routerFactory(RouterFactory routerFactory) {
        this.f26890b = routerFactory;
        return this;
    }

    @Deprecated
    public AppLifecycleBuilder webContentsDebuggingEnable(boolean z10) {
        this.f26899k.webDebugging(z10);
        return this;
    }

    public AppLifecycleBuilder webView(WebViewBuilder webViewBuilder) {
        this.f26899k = webViewBuilder;
        return this;
    }

    @Deprecated
    public AppLifecycleBuilder webViewLoadDelay(long j10) {
        this.f26899k.webViewLoadDelay(j10);
        return this;
    }

    public AppLifecycleBuilder willNeedWebView(boolean z10) {
        this.f26901n = z10;
        return this;
    }

    public AppLifecycleBuilder flavor(String str, boolean z10) {
        RouteReaderConfig routeReaderConfig = this.f26900l;
        routeReaderConfig.setFlavor(str);
        routeReaderConfig.setMergeEnable(z10);
        return this;
    }

    public AppLifecycleBuilder logSettings(LoggerSettings loggerSettings, LogPrinter logPrinter) {
        this.f26894f = loggerSettings;
        this.f26895g = logPrinter;
        return this;
    }

    public AppLifecycleBuilder pluginFactory(XPluginFactory xPluginFactory) {
        this.f26893e = xPluginFactory;
        return this;
    }
}
