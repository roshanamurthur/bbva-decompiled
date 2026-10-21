package com.bbva.cellscore.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.internal.h0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.cellscore.helper.Supplier;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.logger.LoggerSettings;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.cellscore.reactor.JsonPageReaction;
import com.bbva.cellscore.reactor.PageReaction;
import com.bbva.cellscore.reactor.PageReactionManager;
import com.bbva.cellscore.reactor.ReactionContainer;
import com.bbva.cellscore.trace.TrackerController;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.data.configutation.AppConfiguration;
import com.bbva.cellscore.web.data.configutation.WebConfiguration;
import com.bbva.cellscore.web.deserializer.model.RouteReaderConfig;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.cellscore.web.navigation.RouterFactory;
import com.bbva.cellscore.web.plugin.FileCacheCleaner;
import com.bbva.cellscore.web.plugin.WebPluginManager;
import com.bbva.cellscore.web.reader.AppConfigurationReader;
import com.bbva.cellscore.web.reader.RouteReader;
import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.logs.LogKeysKt;
import f4.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class AppLifecycle implements Application.ActivityLifecycleCallbacks, ReactorPublisher {
    public final AppConfiguration E0;
    public final InternalWebView F0;
    public final WebPluginManager G0;
    public final WebController H0;
    public final String I0;
    public final FeatureFlagManager J0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PubSubController f26880p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PageReactionManager f26881q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RouteReader f26882r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Dispatcher f26883s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TrackerController f26884t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ReactionContainer<PageReaction> f26885u0;
    public final ReactionContainer<GlobalReaction> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final HashMap f26886w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f26887x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final FileCacheCleaner f26888y0 = new FileCacheCleaner();

    public static class Builder extends AppLifecycleBuilder {
        @Override // com.bbva.cellscore.app.AppLifecycleBuilder
        public AppLifecycle create() {
            Tracer.init(this.f26894f != LoggerSettings.Nothing.INSTANCE);
            return new AppLifecycle(this);
        }
    }

    public AppLifecycle(Builder builder) {
        CellsLogger.INSTANCE.init(builder.f26894f, builder.f26895g);
        Application application = builder.f26889a;
        RouterFactory routerFactory = builder.f26890b;
        PageReactionManager pageReactionManager = builder.f26896h;
        pageReactionManager = pageReactionManager == null ? new PageReactionManager() : pageReactionManager;
        this.f26881q0 = pageReactionManager;
        PubSubController pubSubController = new PubSubController();
        this.f26880p0 = pubSubController;
        this.f26885u0 = new ReactionContainer<>();
        this.v0 = new ReactionContainer<>();
        this.f26886w0 = new HashMap();
        RouteReaderConfig routeReaderConfig = builder.f26900l;
        RouteReader routeReader = new RouteReader(application, routeReaderConfig);
        this.f26882r0 = routeReader;
        this.f26887x0 = builder.m;
        this.J0 = builder.f26902o;
        this.E0 = new AppConfigurationReader(application).read();
        if (builder.f26901n) {
            InternalWebView internalWebView = new InternalWebView(application);
            this.F0 = internalWebView;
            internalWebView.setEnabled(true);
            this.I0 = routeReaderConfig.getFlavor();
            WebConfiguration webConfigurationA = a(builder.f26899k.getWebId());
            WebPluginManager webPluginManager = new WebPluginManager(application, this.F0, builder.f26899k, webConfigurationA, builder.f26893e);
            this.G0 = webPluginManager;
            webPluginManager.register(builder.f26891c);
            this.G0.register(builder.f26892d);
            WebController webController = new WebController(this.F0, pubSubController, builder.f26899k, webConfigurationA);
            this.H0 = webController;
            ComponentManager.add(WebActions.ID, webController);
        }
        Dispatcher dispatcher = new Dispatcher(pubSubController, routerFactory, routeReader);
        this.f26883s0 = dispatcher;
        ComponentManager.add(Dispatcher.ID, dispatcher);
        pageReactionManager.add(WebViewActivity.ID, new a());
        this.f26884t0 = new TrackerController(!builder.f26897i, builder.f26898j);
        application.registerActivityLifecycleCallbacks(this);
        Reactor.addPublisher(this);
        for (Map.Entry<String, Supplier<GlobalReaction>> entry : pageReactionManager.getGlobals().entrySet()) {
            String key = entry.getKey();
            GlobalReaction globalReaction = entry.getValue().get();
            globalReaction.init(this.f26880p0, this.f26882r0, this.f26884t0, this.J0);
            globalReaction.setPageId(globalReaction.hashCode());
            globalReaction.setTag(key);
            globalReaction.create();
            globalReaction.onStart();
            this.v0.put(key, globalReaction, globalReaction);
        }
        this.f26888y0.clean(application, builder.f26899k.getMaxPluginFileCacheAge());
    }

    public static void c(String str, LogParam... logParamArr) {
        CellsLogger.INSTANCE.logMethod(LogModule.AppLifecycle, str, logParamArr);
    }

    public final WebConfiguration a(String str) {
        String str2 = this.I0;
        return this.E0.findEnvironment((str2 == null || str2.isEmpty()) ? this.E0.getUse() : this.I0).getWeb().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageReaction b(Activity activity, String str) {
        PageReaction jsonPageReaction = this.f26881q0.get(str);
        RouteReader routeReader = this.f26882r0;
        if (jsonPageReaction == null) {
            CellsPage route = routeReader.readRoute(str);
            if (route == CellsPage.EMPTY) {
                CellsLogger.INSTANCE.log(LogModule.AppLifecycle, LoggerLevel.ERROR, h0.b("Not page reaction for tag: [", str, Constant.BRACKET_CLOSE));
                return null;
            }
            jsonPageReaction = new JsonPageReaction(route, this.f26883s0);
        }
        jsonPageReaction.init(this.f26880p0, routeReader, this.f26884t0, this.J0);
        jsonPageReaction.setPageId(activity.hashCode());
        jsonPageReaction.setTag(str);
        jsonPageReaction.setActivity(str, activity);
        jsonPageReaction.create((LifecycleOwner) activity);
        return jsonPageReaction;
    }

    @Override // com.bbva.cellscore.app.ReactorPublisher
    public void clean(String str, String str2) {
        c("clean", CellsLoggerKt.paramOf("componentId", str), CellsLoggerKt.paramOf("action", str2));
        Iterator<PageReaction> it = this.f26885u0.values().iterator();
        while (it.hasNext()) {
            it.next().cleanAction(str, str2);
        }
        Iterator<GlobalReaction> it2 = this.v0.values().iterator();
        while (it2.hasNext()) {
            it2.next().cleanAction(str, str2);
        }
    }

    public void cleanAllChannels() {
        c("cleanAllChannels", new LogParam[0]);
        this.f26880p0.cleanAllChannels(true);
    }

    public void cleanChannel(String str) {
        c("cleanChannel", CellsLoggerKt.paramOf("channel", str));
        this.f26880p0.cleanChannel(str);
    }

    public void cleanExpiredPluginCachedFiles(Context context) {
        c("cleanExpiredPluginCachedFiles", new LogParam[0]);
        this.f26888y0.clean(context);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        String activityMetadata = BundleHelper.getActivityMetadata(activity, "cells-tag");
        c("onActivityCreated", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()), CellsLoggerKt.paramOf(LogKeysKt.TAG, activityMetadata));
        if (activityMetadata != null) {
            PageReaction pageReactionB = b(activity, activityMetadata);
            if (pageReactionB != null) {
                this.f26885u0.put(activityMetadata, activity, pageReactionB);
            }
            if (activity instanceof AppCompatActivity) {
                FragmentManager supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
                ActivityLifecycle activityLifecycle = new ActivityLifecycle(this.f26881q0, this.f26880p0, this.f26882r0, this.f26883s0, this.f26884t0, this.J0, activityMetadata);
                activityLifecycle.setDeactivatePageOnStop(this.f26887x0);
                supportFragmentManager.registerFragmentLifecycleCallbacks(activityLifecycle, false);
                this.f26886w0.put(activityMetadata, activityLifecycle);
            }
        }
        if (bundle != null) {
            this.f26880p0.restoreState(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        ActivityLifecycle activityLifecycle;
        String activityMetadata = BundleHelper.getActivityMetadata(activity, "cells-tag");
        c("onActivityResumed", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()), CellsLoggerKt.paramOf(LogKeysKt.TAG, activityMetadata));
        if (activityMetadata != null) {
            ReactionContainer<PageReaction> reactionContainer = this.f26885u0;
            if (reactionContainer.containsPage(activityMetadata, activity)) {
                reactionContainer.remove(activityMetadata, activity);
                if (!(activity instanceof AppCompatActivity) || (activityLifecycle = (ActivityLifecycle) this.f26886w0.remove(activityMetadata)) == null) {
                    return;
                }
                ActivityLifecycle.a("onUnregister", new LogParam[0]);
                Reactor.removePublisher(activityLifecycle);
                ((AppCompatActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(activityLifecycle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        String activityMetadata = BundleHelper.getActivityMetadata(activity, "cells-tag");
        c("onActivityResumed", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()), CellsLoggerKt.paramOf(LogKeysKt.TAG, activityMetadata));
        PageReaction pageReaction = this.f26885u0.get(activityMetadata, activity);
        if (pageReaction != null && !pageReaction.isStarted()) {
            pageReaction.onStart();
        }
        WebPluginManager webPluginManager = this.G0;
        if (webPluginManager != null) {
            webPluginManager.setActivity(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        c("onActivitySaveInstanceState", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()));
        this.f26880p0.saveState(bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        PageReaction pageReactionB;
        String activityMetadata = BundleHelper.getActivityMetadata(activity, "cells-tag");
        c("onActivityStarted", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()), CellsLoggerKt.paramOf(LogKeysKt.TAG, activityMetadata));
        ReactionContainer<PageReaction> reactionContainer = this.f26885u0;
        Iterator<Map.Entry<String, PageReaction>> it = reactionContainer.entrySet().iterator();
        while (it.hasNext()) {
            PageReaction value = it.next().getValue();
            if (value.isStarted()) {
                value.onStop();
            }
        }
        if (activityMetadata == null) {
            return;
        }
        if (reactionContainer.get(activityMetadata, activity) == null && (pageReactionB = b(activity, activityMetadata)) != null) {
            reactionContainer.put(activityMetadata, activity, pageReactionB);
        }
        Iterator<GlobalReaction> it2 = this.v0.values().iterator();
        while (it2.hasNext()) {
            it2.next().setActivity(activity);
        }
    }

    @Override // com.bbva.cellscore.app.ReactorPublisher
    public void publish(String str, String str2, Object obj) {
        c("publish", CellsLoggerKt.paramOf("componentId", str), CellsLoggerKt.paramOf("action", str2), CellsLoggerKt.paramOf("param", obj));
        for (PageReaction pageReaction : this.f26885u0.values()) {
            if (!this.f26887x0) {
                pageReaction.publishAction(str, str2, obj);
            } else if (pageReaction.isStarted()) {
                pageReaction.publishAction(str, str2, obj);
            }
        }
        Iterator<GlobalReaction> it = this.v0.values().iterator();
        while (it.hasNext()) {
            it.next().publishAction(str, str2, obj);
        }
    }

    public void reloadWebViewConfiguration(WebViewBuilder webViewBuilder) {
        c("reloadWebViewConfiguration", CellsLoggerKt.paramOf("config", webViewBuilder));
        WebConfiguration webConfigurationA = a(webViewBuilder.getWebId());
        this.H0.reloadConfiguration(webViewBuilder, webConfigurationA);
        this.G0.reload(webViewBuilder, webConfigurationA);
    }

    public void setFlavor(String str) {
        c("setFlavor", CellsLoggerKt.paramOf("flavor", str));
        this.f26882r0.setFlavor(str);
    }

    public void cleanChannel(String str, boolean z10) {
        c("cleanChannel", CellsLoggerKt.paramOf("channel", str), CellsLoggerKt.paramOf("syncWithWeb", Boolean.valueOf(z10)));
        this.f26880p0.cleanChannel(str, z10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
    }
}
