package com.bbva.cellscore.web;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import com.bbva.cells.bridge.CellsWebViewManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.app.WebViewConfigurator;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.component.EmptyMessage;
import com.bbva.cellscore.component.ErrorMessage;
import com.bbva.cellscore.helper.RxHelper;
import com.bbva.cellscore.logger.CellsLogger;
import com.bbva.cellscore.logger.CellsLoggerKt;
import com.bbva.cellscore.logger.LogModule;
import com.bbva.cellscore.logger.LogParam;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.pubsub.PubSubMessage;
import com.bbva.cellscore.web.bridge.WebSender;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.data.configutation.WebConfiguration;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.cellscore.web.model.to_web.ChannelMessageDTO;
import com.bbva.cellscore.web.model.to_web.NavigationOptions;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.cellscore.web.model.to_web.skip.SkipTransitionDTO;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.notifications.model.constants.BanxicoConstants;
import i4.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebController {
    public static final String ID = "component-id-cells-web-controller";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PubSubController f27054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InternalWebView f27055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellsWebViewManager<CellsMessage> f27056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WebSender<CellsMessage> f27057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebViewConfigurator f27058e;

    @Deprecated
    public static final ActionSpec<CellsMessage> ON_WEB_READY = new ActionSpec<>("on-web-ready");
    public static final ActionSpec<CellsMessage> ON_WEB_MESSAGE = new ActionSpec<>("on-web-message");
    public static final Channel<String> ON_WEB_READY_CHANNEL = new Channel<>("on-web-ready-channel");
    public static final Channel<String> ON_PAGE_LOADED_CHANNEL = new Channel<>("on-page-loaded-channel");
    public static final Channel<String> ON_PAGE_UNLOADED_CHANNEL = new Channel<>("on-page-unloaded-channel");

    static {
        new ActionSpec("on-page-loaded");
        new ActionSpec("on-page_unloaded");
    }

    public WebController(InternalWebView internalWebView, PubSubController pubSubController, WebViewBuilder webViewBuilder, WebConfiguration webConfiguration) {
        this.f27055b = internalWebView;
        this.f27054a = pubSubController;
        WebViewConfigurator webViewConfigurator = new WebViewConfigurator(internalWebView, webViewBuilder, webConfiguration);
        this.f27058e = webViewConfigurator;
        CellsWebViewManager<CellsMessage> cellsWebViewManagerCreateWebManager = webViewConfigurator.createWebManager(new a(this, 0));
        this.f27056c = cellsWebViewManagerCreateWebManager;
        this.f27057d = new WebSender<>(cellsWebViewManagerCreateWebManager);
        pubSubController.createChannelIfNeeded(ON_PAGE_LOADED_CHANNEL);
        pubSubController.createChannelIfNeeded(ON_PAGE_UNLOADED_CHANNEL);
    }

    public static void b(String str, LogParam... logParamArr) {
        CellsLogger.INSTANCE.logMethod(LogModule.WebController, str, logParamArr);
    }

    public static Object c(Channel channel, PubSubMessage pubSubMessage) {
        return pubSubMessage instanceof EmptyMessage ? new Object() : channel.transformContentToWebObject(pubSubMessage.getPayload());
    }

    public final void a(Channel channel, String str) {
        b("firePageLoadEvent", CellsLoggerKt.paramOf("route", str));
        this.f27054a.sendMessageToChannel(new PubSubMessage(channel.getName(), str), false);
    }

    public <T> void fire(ActionSpec<T> actionSpec) {
        b("fire", CellsLoggerKt.paramOf("action", actionSpec.getId()));
        Reactor.in(WebActions.ID).doAction(actionSpec).fire();
    }

    public InternalWebView getWebView() {
        return this.f27055b;
    }

    public void load() {
        this.f27058e.load();
    }

    public void logout() {
        b("logout", new LogParam[0]);
        this.f27057d.logout();
    }

    public void navigateTo(String str, Object obj) {
        b("navigateTo", CellsLoggerKt.paramOf("route", str), CellsLoggerKt.paramOf(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, obj));
        navigateTo(str, obj, null);
    }

    public void openWeb(Activity activity, WebNavigation webNavigation, Object obj) {
        b("openWeb", CellsLoggerKt.paramOf(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, activity.getLocalClassName()), CellsLoggerKt.paramOf("webNavigation", webNavigation), CellsLoggerKt.paramOf("params", obj));
        Route nativeContainer = webNavigation.getNativeContainer() == null ? this.f27058e.getNativeContainer() : webNavigation.getNativeContainer();
        this.f27055b.setLoadingLayoutId(nativeContainer.getLoadingLayout());
        syncChannels();
        navigateTo(webNavigation.getRoute(), obj, webNavigation.getNavOptions());
        Intent intent = new Intent(activity, nativeContainer.getActivity());
        intent.putExtras(webNavigation.getPayload());
        int animationIn = nativeContainer.getAnimationIn();
        int animationOut = nativeContainer.getAnimationOut();
        if (animationIn == 0 && animationOut == 0) {
            activity.startActivity(intent);
        } else {
            activity.startActivity(intent, ActivityOptions.makeCustomAnimation(activity, animationIn, animationOut).toBundle());
        }
    }

    public void reloadConfiguration(WebViewBuilder webViewBuilder, WebConfiguration webConfiguration) {
        b("reloadConfiguration", CellsLoggerKt.paramOf("runtimeOptions", webViewBuilder), CellsLoggerKt.paramOf("webConfiguration", webConfiguration));
        if (webConfiguration == null) {
            webConfiguration = new WebConfiguration("");
        }
        WebViewConfigurator webViewConfigurator = new WebViewConfigurator(this.f27055b, webViewBuilder, webConfiguration);
        this.f27058e = webViewConfigurator;
        webViewConfigurator.replaceWebManagerOrigin(this.f27056c);
    }

    public void reloadWebView() {
        b("reloadWebView", new LogParam[0]);
        this.f27055b.reload();
    }

    public void resetWebView() {
        b("sendMessageToWeb", new LogParam[0]);
        this.f27057d.resetWebView();
    }

    public void sendChannelToWeb(Channel<?> channel, PubSubMessage<?> pubSubMessage) {
        b("sendChannelToWeb", CellsLoggerKt.paramOf("channel", channel.getName()));
        sendMessageToWeb(channel.getName(), c(channel, pubSubMessage));
    }

    public void sendMessageToWeb(String str, Object obj) {
        b("sendMessageToWeb", CellsLoggerKt.paramOf("channel", str), CellsLoggerKt.paramOf(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, obj));
        this.f27057d.channels(Collections.singletonList(new ChannelMessageDTO(str, obj)));
    }

    public void sendOnBack() {
        b("sendOnBack", new LogParam[0]);
        this.f27057d.back();
    }

    public void sendOnResume() {
        b("sendOnResume", new LogParam[0]);
        this.f27057d.resume();
    }

    public void skipNavigations(List<SkipTransitionDTO> list) {
        b("sendMessageToWeb", CellsLoggerKt.paramOf("routes", list));
        this.f27057d.skipNavigations(list);
    }

    public void syncChannels() {
        PubSubMessage pubSubMessage;
        b("syncChannels", new LogParam[0]);
        Map<String, Channel<?>> channels = this.f27054a.getChannels();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Channel<?>>> it = channels.entrySet().iterator();
        while (it.hasNext()) {
            Channel<?> value = it.next().getValue();
            if ((value instanceof WebChannel) && (pubSubMessage = (PubSubMessage) RxHelper.getSubjectBuffer(value.getSubject())) != null && !(pubSubMessage instanceof EmptyMessage) && !(pubSubMessage instanceof ErrorMessage)) {
                arrayList.add(new ChannelMessageDTO(value.getName(), c(value, pubSubMessage)));
            }
        }
        this.f27057d.channels(arrayList);
    }

    public <T> void fire(ActionSpec<T> actionSpec, T t10) {
        b("fire", CellsLoggerKt.paramOf("action", actionSpec.getId()));
        Reactor.in(WebActions.ID).doAction(actionSpec).with(t10).fire();
    }

    public void navigateTo(String str, Object obj, NavigationOptions navigationOptions) {
        b("navigateTo", CellsLoggerKt.paramOf("route", str), CellsLoggerKt.paramOf(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, obj), CellsLoggerKt.paramOf("options", navigationOptions));
        this.f27055b.setRoute(str);
        this.f27057d.navigateTo(str, obj, navigationOptions);
    }

    public void sendMessageToWeb(Channel channel, PubSubMessage pubSubMessage) {
        b("sendMessageToWeb", CellsLoggerKt.paramOf("channel", channel), CellsLoggerKt.paramOf(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, pubSubMessage));
        this.f27057d.channels(Collections.singletonList(new ChannelMessageDTO(channel.getName(), c(channel, pubSubMessage))));
    }
}
