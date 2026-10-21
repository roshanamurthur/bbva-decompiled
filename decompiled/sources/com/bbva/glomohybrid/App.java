package com.bbva.glomohybrid;

import android.app.Application;
import android.content.Context;
import android.webkit.CookieManager;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ProcessLifecycleOwner;
import bk.q;
import com.bbva.bridge.core.AppLifecycleProvider;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.app.WebViewBuilder;
import com.bbva.cellscore.featureflag.FeatureFlagManager;
import com.bbva.cellscore.reactor.PageReactionManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.cellscore.web.plugin.PluginFactory;
import com.bbva.component.dm.analytics.AnalyticsAppLifecycle;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.help.kit.extension.ContextKt;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.file.infrastructure.FileRemovalLifecycle;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.crashHandler.AppExceptionHandler;
import com.bbva.glomohybrid.dynamicmodules.DynamicModules;
import com.bbva.glomohybrid.extensions.ExtensionsKt;
import com.bbva.glomohybrid.logs.LoggerHandlerGroup;
import com.bbva.glomohybrid.process.ProcessScreenTracker;
import com.bbva.glomohybrid.provider.DependenciesProvider;
import com.bbva.glomohybrid.provider.module.LogModuleKt;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.library.darkmode.DarkModeExtensions;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.notifications.interfaces.ChannelCreator;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.qualifier.Qualifier;
import t7.a;
import t7.b;
import t7.c;

/* JADX INFO: compiled from: App.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/App;", "Landroid/app/Application;", "Lcom/bbva/bridge/core/AppLifecycleProvider;", "", "onCreate", "Landroid/content/Context;", "base", "attachBaseContext", "Lcom/bbva/cellscore/app/AppLifecycle;", "appLifecycle", "Lcom/bbva/cellscore/app/AppLifecycle;", "getAppLifecycle", "()Lcom/bbva/cellscore/app/AppLifecycle;", "setAppLifecycle", "(Lcom/bbva/cellscore/app/AppLifecycle;)V", "<init>", "()V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/bbva/glomohybrid/App\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,209:1\n40#2,5:210\n40#2,5:215\n40#2,5:220\n40#2,5:225\n40#2,5:230\n40#2,5:235\n40#2,5:240\n40#2,5:245\n52#2,5:254\n52#2,5:260\n52#2,5:266\n52#2,5:272\n52#2,5:278\n55#3,4:250\n133#4:259\n133#4:265\n133#4:271\n133#4:277\n133#4:283\n*S KotlinDebug\n*F\n+ 1 App.kt\ncom/bbva/glomohybrid/App\n*L\n61#1:210,5\n62#1:215,5\n63#1:220,5\n64#1:225,5\n65#1:230,5\n66#1:235,5\n67#1:240,5\n68#1:245,5\n108#1:254,5\n112#1:260,5\n181#1:266,5\n182#1:272,5\n184#1:278,5\n69#1:250,4\n108#1:259\n112#1:265\n181#1:271\n182#1:277\n184#1:283\n*E\n"})
public final class App extends Application implements AppLifecycleProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "app";
    public AppLifecycle appLifecycle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f30959p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f30960q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f30961r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f30962s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f30963t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f30964u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f30965w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f30966x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final DynamicModules f30967y0;

    /* JADX INFO: compiled from: App.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/App$Companion;", "", "()V", "ID", "", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public App() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f30959p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AppLifecycle.Builder>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.app.AppLifecycle$Builder, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppLifecycle.Builder invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AppLifecycle.Builder.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f30960q0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InternalWebView>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.web.component.InternalWebView, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InternalWebView invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(InternalWebView.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f30961r0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DependenciesProvider>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.provider.DependenciesProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DependenciesProvider invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(DependenciesProvider.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f30962s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PluginFactory>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.web.plugin.PluginFactory, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PluginFactory invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(PluginFactory.class), objArr6, objArr7);
            }
        });
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.f30963t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WebViewBuilder>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.app.WebViewBuilder, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewBuilder invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(WebViewBuilder.class), objArr8, objArr9);
            }
        });
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        this.f30964u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Crashlytics>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomoutils.mobileservices.craslytics.Crashlytics, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Crashlytics invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(Crashlytics.class), objArr10, objArr11);
            }
        });
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FeatureFlagManager>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.featureflag.FeatureFlagManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FeatureFlagManager invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(FeatureFlagManager.class), objArr12, objArr13);
            }
        });
        final Object[] objArr14 = 0 == true ? 1 : 0;
        final Object[] objArr15 = 0 == true ? 1 : 0;
        this.f30965w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AppLifeCycleCreationJobHandler>() { // from class: com.bbva.glomohybrid.App$special$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppLifeCycleCreationJobHandler invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AppLifeCycleCreationJobHandler.class), objArr14, objArr15);
            }
        });
        final Object[] objArr16 = 0 == true ? 1 : 0;
        final Object[] objArr17 = 0 == true ? 1 : 0;
        this.f30966x0 = LazyKt__LazyJVMKt.lazy(new Function0<ChannelCreator>() { // from class: com.bbva.glomohybrid.App$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.bbva.notifications.interfaces.ChannelCreator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ChannelCreator invoke() {
                return ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(ChannelCreator.class), objArr16, objArr17);
            }
        });
        this.f30967y0 = new DynamicModules();
    }

    public static final void access$configureCookies(App app) {
        app.getClass();
        if (ContextExtensionKt.isAndroidWebViewAvailable(app)) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            CookieManager.setAcceptFileSchemeCookies(true);
            cookieManager.setAcceptThirdPartyCookies(((WebController) ComponentManager.get(WebActions.ID)).getWebView(), true);
            CookieManager.allowFileSchemeCookies();
        }
    }

    public static final void access$configureWebViewDarkMode(App app) {
        InternalWebView internalWebView = (InternalWebView) app.f30960q0.getValue();
        Context applicationContext = app.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        DarkModeExtensions.setMode(internalWebView, applicationContext, ConfigConstantsKt.getDEFAULT_DARK_MODE());
    }

    public static final Map access$createGlobalConfigurations(App app) {
        app.getClass();
        return q.mapOf(TuplesKt.to("@global/api/host", "prod"), TuplesKt.to("@global/version/host", "prod"));
    }

    public static final PageReactionManager access$createReactionManager(App app) {
        app.getClass();
        PageReactionManager pageReactionManager = new PageReactionManager();
        boolean zIsAndroidWebViewAvailable = ContextExtensionKt.isAndroidWebViewAvailable(app);
        Lazy lazy = app.f30961r0;
        if (zIsAndroidWebViewAvailable) {
            ExtensionsKt.addGlobalReactions(pageReactionManager, ((DependenciesProvider) lazy.getValue()).globalReactions());
        }
        ExtensionsKt.addAll(pageReactionManager, ((DependenciesProvider) lazy.getValue()).pageReactions());
        return pageReactionManager;
    }

    public static final AppLifecycle.Builder access$getBuilder(App app) {
        return (AppLifecycle.Builder) app.f30959p0.getValue();
    }

    public static final Crashlytics access$getCrashlytics(App app) {
        return (Crashlytics) app.f30964u0.getValue();
    }

    public static final FeatureFlagManager access$getFeatureFlagManager(App app) {
        return (FeatureFlagManager) app.v0.getValue();
    }

    public static final DependenciesProvider access$getFlavorProvider(App app) {
        return (DependenciesProvider) app.f30961r0.getValue();
    }

    public static final PluginFactory access$getPluginFactory(App app) {
        return (PluginFactory) app.f30962s0.getValue();
    }

    public static final WebViewBuilder access$getWebViewBuilder(App app) {
        return (WebViewBuilder) app.f30963t0.getValue();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context base) {
        super.attachBaseContext(base);
        this.f30967y0.install(this);
    }

    @Override // com.bbva.bridge.core.AppLifecycleProvider
    @NotNull
    public AppLifecycle getAppLifecycle() {
        AppLifecycle appLifecycle = this.appLifecycle;
        if (appLifecycle != null) {
            return appLifecycle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appLifecycle");
        return null;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (ContextKt.isIsolatedProcess(this) || CountryTapOnPhoneKt.isTapOnPhoneProcess()) {
            return;
        }
        EtherLogger etherLogger = EtherLogger.INSTANCE;
        EtherLogger.installDefaultLogger$default(etherLogger, null, 1, null);
        DefaultContextExtKt.startKoin(new b(this));
        LocalStorage.INSTANCE.warmUp((Context) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(Context.class), null, null), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? null : (Storage) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(Storage.class), null, null), (30 & 16) != 0 ? false : false);
        AppExceptionHandler.INSTANCE.setAsDefaultHandler(this, (Crashlytics) this.f30964u0.getValue());
        ExtensionsKt.addComponents((DependenciesProvider) this.f30961r0.getValue());
        ((AppLifeCycleCreationJobHandler) this.f30965w0.getValue()).launchJob(new a(this, null));
        LoggerHandlerGroup loggerHandlerGroup = (LoggerHandlerGroup) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(LoggerHandlerGroup.class), LogModuleKt.getLogHandlers(), null);
        if (true ^ loggerHandlerGroup.getLoggerHandlers().isEmpty()) {
            etherLogger.installCustomLogger(loggerHandlerGroup.getCom.bbva.notifications.NotificationConstants.SALESFORCE_ORIGIN_ID java.lang.String(), loggerHandlerGroup.getLoggerHandlers());
        }
        RxJavaPlugins.setErrorHandler(new com.bbva.cellscore.reactor.a(c.f93471p0, 2));
        registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(ProcessScreenTracker.class), null, null));
        registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(FileRemovalLifecycle.class), null, null));
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver((LifecycleObserver) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnalyticsAppLifecycle.class), null, null));
        ChannelCreator channelCreator = (ChannelCreator) this.f30966x0.getValue();
        if (channelCreator != null) {
            channelCreator.createChannels();
        }
    }

    public void setAppLifecycle(@NotNull AppLifecycle appLifecycle) {
        Intrinsics.checkNotNullParameter(appLifecycle, "<set-?>");
        this.appLifecycle = appLifecycle;
    }
}
