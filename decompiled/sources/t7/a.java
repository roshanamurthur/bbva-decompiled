package t7;

import bk.q;
import com.bbva.cellscore.app.AppLifecycle;
import com.bbva.cellscore.logger.LoggerSettings;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.cellscore.web.navigation.RouterFactory;
import com.bbva.glomohybrid.App;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: App.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.App$initAppLifecycle$1", f = "App.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93465p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93466q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ App f93467r0;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: App.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.App$initAppLifecycle$1$job$1", f = "App.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0494a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ App f93468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AppLifecycle.Builder f93469q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0494a(App app, AppLifecycle.Builder builder, Continuation<? super C0494a> continuation) {
            super(2, continuation);
            this.f93468p0 = app;
            this.f93469q0 = builder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0494a(this.f93468p0, this.f93469q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0494a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AppLifecycle appLifecycleCreate = this.f93469q0.create();
            Intrinsics.checkNotNullExpressionValue(appLifecycleCreate, "create(...)");
            App app = this.f93468p0;
            app.setAppLifecycle(appLifecycleCreate);
            if (ContextExtensionKt.isAndroidWebViewAvailable(app)) {
                App.access$configureWebViewDarkMode(app);
            }
            App.access$configureCookies(app);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(App app, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f93467r0 = app;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f93467r0, continuation);
        aVar.f93466q0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93465p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f93466q0;
            App app = this.f93467r0;
            AppLifecycle.Builder builderAccess$getBuilder = App.access$getBuilder(app);
            builderAccess$getBuilder.app(app);
            builderAccess$getBuilder.flavor("mexico", true);
            builderAccess$getBuilder.reactionManager(App.access$createReactionManager(app));
            builderAccess$getBuilder.pluginFactory(App.access$getPluginFactory(app));
            builderAccess$getBuilder.plugins(App.access$getFlavorProvider(app).requiredPlugins());
            builderAccess$getBuilder.routerFactory(new RouterFactory(q.hashMapOf(TuplesKt.to("nativeLogin", new Route(LoginActivity.class)))));
            if (ContextExtensionKt.isAndroidWebViewAvailable(app)) {
                builderAccess$getBuilder.webView(App.access$getWebViewBuilder(app));
            } else {
                builderAccess$getBuilder.willNeedWebView(false);
            }
            builderAccess$getBuilder.globalConfiguration(App.access$createGlobalConfigurations(app));
            builderAccess$getBuilder.logSettings(LoggerSettings.Nothing.INSTANCE);
            App.access$getCrashlytics(app).addTracker(builderAccess$getBuilder, true);
            builderAccess$getBuilder.featureFlagManager(App.access$getFeatureFlagManager(app));
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new C0494a(app, builderAccess$getBuilder, null), 2, null);
            this.f93465p0 = 1;
            if (jobLaunch$default.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
