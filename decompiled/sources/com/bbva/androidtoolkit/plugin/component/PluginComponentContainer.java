package com.bbva.androidtoolkit.plugin.component;

import android.app.Application;
import android.os.Handler;
import android.webkit.WebView;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class PluginComponentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Optional<WebView> f26520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f26521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActivityContainer f26522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f26523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExecutorService f26524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PostMessenger f26525f;

    public static class PluginComponentBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PluginComponentContainer f26526a = new PluginComponentContainer();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WebView f26527b;

        public PluginComponentBuilder activityContainer(ActivityContainer activityContainer) {
            this.f26526a.f26522c = activityContainer;
            return this;
        }

        public PluginComponentBuilder application(Application application) {
            this.f26526a.f26521b = application;
            return this;
        }

        public PluginComponentContainer build() {
            Optional<WebView> optionalOfNullable = Optional.ofNullable(this.f26527b);
            PluginComponentContainer pluginComponentContainer = this.f26526a;
            pluginComponentContainer.f26520a = optionalOfNullable;
            return pluginComponentContainer;
        }

        public PluginComponentBuilder postMessenger(PostMessenger postMessenger) {
            this.f26526a.f26525f = postMessenger;
            return this;
        }

        public PluginComponentBuilder threadPool(ExecutorService executorService) {
            this.f26526a.f26524e = executorService;
            return this;
        }

        public PluginComponentBuilder uiHandler(Handler handler) {
            this.f26526a.f26523d = handler;
            return this;
        }

        public PluginComponentBuilder webView(WebView webView) {
            this.f26527b = webView;
            return this;
        }
    }

    public ActivityContainer getActivityContainer() {
        return this.f26522c;
    }

    public Application getApplication() {
        return this.f26521b;
    }

    public PostMessenger getPostMessenger() {
        return this.f26525f;
    }

    public ExecutorService getThreadPool() {
        return this.f26524e;
    }

    public Handler getUIHandler() {
        return this.f26523d;
    }

    public Optional<WebView> getWebView() {
        return this.f26520a;
    }
}
