package com.bbva.glomohybrid.splash.presentation.view;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.os.BundleKt;
import androidx.core.splashscreen.SplashScreen;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.glomo.router.RouterBase;
import com.bbva.glomo.router.RouterSplash;
import com.bbva.glomoconfig.constants.CountryShortcutConstants;
import com.bbva.glomoconfig.constants.ShortcutConstants;
import com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler;
import com.bbva.glomohybrid.base.R;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.deeplink.constants.DynamicLinkConstants;
import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.modules.DynamicLinkModuleKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.shortcuts.ShortcutActions;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import com.bbva.glomohybrid.infoscreen.root.RootFragment;
import com.bbva.glomohybrid.splash.databinding.ActivitySplashBinding;
import com.bbva.glomohybrid.splash.model.constants.ActionConstants;
import com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel;
import com.bbva.glomohybrid.splash.presentation.viewmodel.SplashViewModel;
import com.bbva.networkmonitor.lib.NetworkExtensionsKt;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onStart", "onDestroy", "continueNavigation$Splash_mexicoProdRelease", "()V", "continueNavigation", "<init>", "Companion", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"CustomSplashScreen"})
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/bbva/glomohybrid/splash/presentation/view/SplashActivity\n+ 2 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 3 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n+ 5 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 6 Koin.kt\norg/koin/core/Koin\n*L\n1#1,278:1\n41#2,6:279\n40#3,5:285\n40#3,5:290\n40#3,5:295\n52#3,5:300\n133#4:305\n158#4:311\n68#5,4:306\n120#6:310\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/bbva/glomohybrid/splash/presentation/view/SplashActivity\n*L\n67#1:279,6\n69#1:285,5\n71#1:290,5\n73#1:295,5\n220#1:300,5\n220#1:305\n252#1:311\n252#1:306,4\n252#1:310\n*E\n"})
public final class SplashActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "splash";

    @NotNull
    public static final String LOG_ACTIVITY = "Splash Activity";

    @NotNull
    public static final String VBANK_FLAVOUR = "Vbank";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f34501s0 = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f34502t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f34503u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f34504w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f34505x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f34506y0;

    /* JADX INFO: compiled from: SplashActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashActivity$Companion;", "", "()V", "ID", "", "LOG_ACTIVITY", "VBANK_FLAVOUR", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    public static final class a extends Lambda implements Function0<AndroidActionLauncher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AndroidActionLauncher invoke() {
            Application application = SplashActivity.this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new AndroidActionLauncher(application, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    public static final class b extends Lambda implements Function0<ActivitySplashBinding> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActivitySplashBinding invoke() {
            ActivitySplashBinding activitySplashBindingInflate = ActivitySplashBinding.inflate(SplashActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(activitySplashBindingInflate, "inflate(...)");
            return activitySplashBindingInflate;
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.view.SplashActivity$continueNavigation$1", f = "SplashActivity.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34509p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SplashActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34509p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SplashActivity splashActivity = SplashActivity.this;
                RouterSplash routerSplashAccess$getRouter = SplashActivity.access$getRouter(splashActivity);
                Bundle bundleBundleOf = BundleKt.bundleOf(TuplesKt.to(RouterBase.PARAM_IS_LEGACY_USER, Boxing.boxBoolean(SplashActivity.access$getRouter(splashActivity).getIsUserFromLegacyApp())));
                SplashActivity splashActivity2 = SplashActivity.this;
                this.f34509p0 = 1;
                if (RouterBase.continueNavigation$default(routerSplashAccess$getRouter, splashActivity2, bundleBundleOf, null, true, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: SplashActivity.kt */
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            SplashActivity splashActivity = SplashActivity.this;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(splashActivity), Dispatchers.getMain(), null, new com.bbva.glomohybrid.splash.presentation.view.b(splashActivity, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    public static final class e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34512a;

        public e(fa.b function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34512a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34512a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34512a;
        }

        public final int hashCode() {
            return this.f34512a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34512a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.view.SplashActivity$startSplashFlow$1", f = "SplashActivity.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34513p0;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SplashActivity.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34513p0;
            SplashActivity splashActivity = SplashActivity.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SplashViewModel splashViewModelI = splashActivity.i();
                this.f34513p0 = 1;
                obj = splashViewModelI.installUpdate(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                splashActivity.i().makeAnonymousLogin();
                splashActivity.i().fetchNonRestrictiveScreenShown();
                splashActivity.i().runSplashFlow(SplashActivity.access$getLinkParams(splashActivity), splashActivity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SplashActivity.kt */
    public static final class g extends Lambda implements Function0<ParametersHolder> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(SplashActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SplashActivity() {
        final g gVar = new g();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34502t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SplashViewModel>() { // from class: com.bbva.glomohybrid.splash.presentation.view.SplashActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.splash.presentation.viewmodel.SplashViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SplashViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = gVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SplashViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f34503u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<RouterSplash>() { // from class: com.bbva.glomohybrid.splash.presentation.view.SplashActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomo.router.RouterSplash, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RouterSplash invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(RouterSplash.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<InternalWebView>() { // from class: com.bbva.glomohybrid.splash.presentation.view.SplashActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.cellscore.web.component.InternalWebView, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InternalWebView invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(InternalWebView.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.f34504w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AppLifeCycleCreationJobHandler>() { // from class: com.bbva.glomohybrid.splash.presentation.view.SplashActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.AppLifeCycleCreationJobHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppLifeCycleCreationJobHandler invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AppLifeCycleCreationJobHandler.class), objArr6, objArr7);
            }
        });
        this.f34505x0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final void access$configureCollectors(SplashActivity splashActivity) {
        splashActivity.getClass();
        LifecycleOwnerKt.getLifecycleScope(splashActivity).launchWhenStarted(new com.bbva.glomohybrid.splash.presentation.view.a(splashActivity, null));
    }

    public static final LinkParams access$getLinkParams(SplashActivity splashActivity) {
        Intent intent = splashActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return LinkParamsKt.toLinkParams(intent, (DeeplinkConfig) AndroidKoinScopeExtKt.getKoinScope(splashActivity).get(Reflection.getOrCreateKotlinClass(DeeplinkConfig.class), DynamicLinkModuleKt.getDeeplinkConfig(), null), splashActivity.getCallingPackage());
    }

    public static final RouterSplash access$getRouter(SplashActivity splashActivity) {
        return (RouterSplash) splashActivity.f34503u0.getValue();
    }

    public static final void access$handleEvent(SplashActivity splashActivity, SplashContract.Event event) {
        splashActivity.getClass();
        if (event instanceof SplashContract.Event.Navigate) {
            splashActivity.continueNavigation$Splash_mexicoProdRelease();
        } else if (event instanceof SplashContract.Event.DeepLinkHandled) {
            splashActivity.getIntent().putExtra(DynamicLinkConstants.COMES_FROM_DEEPLINK_KEY, true);
        }
    }

    public static final void access$setFragmentResultListener(SplashActivity splashActivity) {
        FragmentManager supportFragmentManager = splashActivity.getSupportFragmentManager();
        supportFragmentManager.setFragmentResultListener(NetworkErrorFragment.KEY_NETWORK_ERROR_FRAGMENT, splashActivity, new androidx.camera.camera2.internal.compat.workaround.b(splashActivity));
        supportFragmentManager.setFragmentResultListener(RootFragment.KEY_ROOT_FRAGMENT, splashActivity, new fa.a(splashActivity));
    }

    public static final void access$setUpViewModel(SplashActivity splashActivity) {
        splashActivity.i().addViewModelAsComponent(splashActivity.hashCode());
        splashActivity.i().setupActions();
    }

    public static final void access$showRootFragment(SplashActivity splashActivity, Boolean bool) {
        splashActivity.getClass();
        if (bool == null) {
            return;
        }
        String name = InfoScreenType.INSTANCE.getRootScreenType(bool.booleanValue()).getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        RootFragment rootFragment = (RootFragment) ComponentCallbackExtKt.getKoin(splashActivity).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(RootFragment.class), QualifierKt.named(name), null);
        if (rootFragment != null) {
            rootFragment.show(splashActivity.getSupportFragmentManager(), (String) null);
            if (bool.booleanValue()) {
                return;
            }
            splashActivity.i().setNonRestrictiveRootScreenShown(true);
        }
    }

    public final void continueNavigation$Splash_mexicoProdRelease() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new c(null), 3, null);
    }

    public final SplashViewModel i() {
        return (SplashViewModel) this.f34502t0.getValue();
    }

    public final void j() {
        if (isFinishing() || isDestroyed() || getSupportFragmentManager().isStateSaved()) {
            this.f34506y0 = true;
        } else {
            new NetworkErrorFragment().show(getSupportFragmentManager(), (String) null);
        }
    }

    public final void k() {
        if (!i().isNetworkModalEnabled() || NetworkExtensionsKt.isInternetConnected(NetworkExtensionsKt.connectivityManager(this))) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
        } else {
            j();
        }
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        SplashScreen.INSTANCE.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.white_space_unicode));
        Lazy lazy = this.f34501s0;
        setContentView(((ActivitySplashBinding) lazy.getValue()).getRoot());
        LottieAnimationView lottieAnimationView = ((ActivitySplashBinding) lazy.getValue()).splashLottieView;
        lottieAnimationView.enableMergePathsForKitKatAndAbove(true);
        lottieAnimationView.setRenderMode((StringsKt__StringsKt.contains$default((CharSequence) "mexicoProd", (CharSequence) VBANK_FLAVOUR, false, 2, (Object) null) || Build.VERSION.SDK_INT < 26) ? RenderMode.SOFTWARE : RenderMode.HARDWARE);
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.bbva.glomohybrid.splash.presentation.view.SplashActivity$startAnimation$1$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SplashActivity splashActivity = this.f34529a;
                splashActivity.i().logActivityEvent();
                SplashGlobalViewModel.markAsPerformed$default(splashActivity.i(), ActionConstants.ACTION_SCREEN_LOADED, null, 2, null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        lottieAnimationView.playAnimation();
        ((AppLifeCycleCreationJobHandler) this.f34504w0.getValue()).invokeOnCompletion(new d());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Bundle extras = getIntent().getExtras();
        if (Intrinsics.areEqual(extras != null ? extras.getString(ShortcutConstants.EXTRA_SHORTCUT_ID) : null, ShortcutConstants.REJECTED_CARD)) {
            ((ActionLauncher) this.f34505x0.getValue()).launchDialer(CountryShortcutConstants.REJECTED_CARD_NUMBER);
            i().trackShortcutEvent(ShortcutConstants.REJECTED_CARD);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutActions shortcutActionsCreate = ShortcutActions.INSTANCE.create(getIntent().getAction());
            if (!shortcutActionsCreate.isNone()) {
                i().setIntent(new SplashContract.Intent.ShortcutWebMessage(ActionConstants.SHORTCUT_ACTION_TO_WEB, shortcutActionsCreate));
            }
        }
        if (this.f34506y0) {
            j();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        i().setIntent(SplashContract.Intent.Started.INSTANCE);
    }
}
