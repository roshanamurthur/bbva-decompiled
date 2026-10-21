package com.bbva.glomohybrid.login.presentation.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.login.LoginView;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.component_devicemanager.DeviceManagerExecutor;
import com.bbva.glomoconfig.DefaultConfigConstantsKt;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.extensions.BundleExtensionsKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.models.LoginConfigurationData;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.deviceactivation.DeviceActivationFragment;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.databinding.ActivityLoginBinding;
import com.bbva.glomohybrid.login.model.enums.LoaderState;
import com.bbva.glomohybrid.login.presentation.LoginAnimationObserver;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import com.bbva.glomoutils.KeyboardExtensionsKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.rateapp.InAppReview;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.androidx.scope.ComponentActivityExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\b\u0010\f\u001a\u00020\u0005H\u0014J\u000f\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0006\u0010\u0017\u001a\u00020\u0005R\u001b\u0010\u001d\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "onStart", "onResume", "onStop", "hideKeyboard$Login_mexicoGoogleRelease", "()V", "hideKeyboard", "", "isAnimating", "setIsLoadingAnimating$Login_mexicoGoogleRelease", "(Z)V", "setIsLoadingAnimating", "onBackPressed", "finish", "rateApp", "Lorg/koin/core/scope/Scope;", "s0", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "<init>", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginActivity.kt\ncom/bbva/glomohybrid/login/presentation/view/LoginActivity\n+ 2 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 3 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 5 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,503:1\n41#2,6:504\n71#3,3:510\n40#4,5:513\n40#4,5:518\n55#5,4:523\n1#6:527\n*S KotlinDebug\n*F\n+ 1 LoginActivity.kt\ncom/bbva/glomohybrid/login/presentation/view/LoginActivity\n*L\n71#1:504,6\n74#1:510,3\n90#1:513,5\n101#1:518,5\n107#1:523,4\n*E\n"})
public final class LoginActivity extends BaseActivity implements AndroidScopeComponent {

    @NotNull
    public static final String ID = "login";

    @NotNull
    public static final String LOG_ACTIVITY = "Login Activity";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final Lazy F0;

    @NotNull
    public final Lazy G0;

    @NotNull
    public final Lazy H0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy scope = ComponentActivityExtKt.activityScope(this);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f33504t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f33505u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f33506w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f33507x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f33508y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<Void> I0 = new ActionSpec<>("screen-started");

    @NotNull
    public static final ActionSpec<Void> J0 = new ActionSpec<>("screen-resume");

    @NotNull
    public static final ActionSpec<Void> K0 = new ActionSpec<>("screen-stopped");

    /* JADX INFO: compiled from: LoginActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginActivity$Companion;", "", "()V", "ACTION_SCREEN_RESUME", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "getACTION_SCREEN_RESUME", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_SCREEN_STARTED", "getACTION_SCREEN_STARTED", "ACTION_SCREEN_STOPPED", "getACTION_SCREEN_STOPPED", "ID", "", "LOG_ACTIVITY", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Void> getACTION_SCREEN_RESUME() {
            return LoginActivity.J0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_SCREEN_STARTED() {
            return LoginActivity.I0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_SCREEN_STOPPED() {
            return LoginActivity.K0;
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class a extends Lambda implements Function0<AndroidActionLauncher> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AndroidActionLauncher invoke() {
            Application application = LoginActivity.this.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new AndroidActionLauncher(application, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class b extends Lambda implements Function0<DefaultActivityRouter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(LoginActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(LoginActivity.this.j());
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class d extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(LoginActivity.this.hashCode(), String.valueOf(R.id.loaderSpinnerComponent));
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class e extends Lambda implements Function0<LoaderViewModel> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderViewModel invoke() {
            return (LoaderViewModel) ComponentManager.get(LoginActivity.this.hashCode(), String.valueOf(R.id.loaderView));
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class f extends Lambda implements Function0<LoginView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoginView invoke() {
            LoginView loginView = LoginActivity.this.i().loginView;
            Intrinsics.checkNotNullExpressionValue(loginView, "loginView");
            return loginView;
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$rateApp$1", f = "LoginActivity.kt", i = {}, l = {459}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33516p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InAppReview f33517q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f33518r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InAppReview inAppReview, LoginActivity loginActivity, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f33517q0 = inAppReview;
            this.f33518r0 = loginActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.f33517q0, this.f33518r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33516p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f33516p0 = 1;
                if (this.f33517q0.showInAppReview(this.f33518r0, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class h implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f33519a;

        public h(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f33519a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f33519a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f33519a;
        }

        public final int hashCode() {
            return this.f33519a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33519a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class i extends Lambda implements Function0<ParametersHolder> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(LoginActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginActivity() {
        final i iVar = new i();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33504t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoginViewModel>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LoginViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = iVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LoginViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.f33505u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityLoginBinding>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityLoginBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityLoginBinding.inflate(layoutInflater);
            }
        });
        this.v0 = LazyKt__LazyJVMKt.lazy(new f());
        this.f33506w0 = LazyKt__LazyJVMKt.lazy(new b());
        this.f33507x0 = LazyKt__LazyJVMKt.lazy(new e());
        final c cVar = new c();
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.f33508y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<LoginAnimationObserver>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.login.presentation.LoginAnimationObserver, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LoginAnimationObserver invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(LoginAnimationObserver.class), objArr2, cVar);
            }
        });
        this.E0 = LazyKt__LazyJVMKt.lazy(new d());
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.F0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), objArr3, objArr4);
            }
        });
        this.G0 = LazyKt__LazyJVMKt.lazy(new a());
        final Object[] objArr5 = 0 == true ? 1 : 0;
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.H0 = LazyKt__LazyJVMKt.lazy(new Function0<DeviceManagerExecutor>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.bbva.component_devicemanager.DeviceManagerExecutor, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final DeviceManagerExecutor invoke() {
                return ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(DeviceManagerExecutor.class), objArr5, objArr6);
            }
        });
    }

    public static final void access$displayFragmentModal(LoginActivity loginActivity) {
        loginActivity.getClass();
        DeviceActivationFragment deviceActivationFragment = new DeviceActivationFragment();
        deviceActivationFragment.setOnPositiveButtonClickListener(new t9.d(loginActivity));
        deviceActivationFragment.show(loginActivity.getSupportFragmentManager(), (String) null);
    }

    public static final ActivityRouter access$getActivityRouter(LoginActivity loginActivity) {
        return (ActivityRouter) loginActivity.f33506w0.getValue();
    }

    public static final AnalyticsManager access$getAnalyticsManager(LoginActivity loginActivity) {
        return (AnalyticsManager) loginActivity.F0.getValue();
    }

    public static final LoaderSpinnerViewModel access$getLoaderSpinnerViewModel(LoginActivity loginActivity) {
        Object value = loginActivity.E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LoaderSpinnerViewModel) value;
    }

    public static final LoaderViewModel access$getLoaderViewModel(LoginActivity loginActivity) {
        Object value = loginActivity.f33507x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LoaderViewModel) value;
    }

    public static final LoginView access$getLoginView(LoginActivity loginActivity) {
        return (LoginView) loginActivity.v0.getValue();
    }

    public static final void access$handleBiometricsServerError(LoginActivity loginActivity) {
        loginActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(loginActivity), null, null, new com.bbva.glomohybrid.login.presentation.view.e(loginActivity, null), 3, null);
    }

    public static final void access$handleEvents(LoginActivity loginActivity, LoginContract.Event event) {
        loginActivity.getClass();
        if (event instanceof LoginContract.Event.OpenDialer) {
            ((ActionLauncher) loginActivity.G0.getValue()).launchDialer(((LoginContract.Event.OpenDialer) event).getPhoneNumber());
            return;
        }
        if (event instanceof LoginContract.Event.SendMessageToCells) {
            loginActivity.j().sendMessageToWeb$Login_mexicoGoogleRelease(((LoginContract.Event.SendMessageToCells) event).getWebMessage());
            return;
        }
        if (event instanceof LoginContract.Event.OpenAccessKeyRecovery) {
            LoginGlobalViewModel.openWeb$default(loginActivity.j(), "keyRecovery", null, null, 6, null);
            return;
        }
        if (event instanceof LoginContract.Event.OpenKeyBoard) {
            Window window = loginActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            KeyboardExtensionsKt.openKeyboard(window, (LoginView) loginActivity.v0.getValue());
        } else if (!(event instanceof LoginContract.Event.StartDeviceManager)) {
            if (event instanceof LoginContract.Event.CloseLogin) {
                loginActivity.finish();
            }
        } else {
            DeviceManagerExecutor deviceManagerExecutor = (DeviceManagerExecutor) loginActivity.H0.getValue();
            if (deviceManagerExecutor != null) {
                deviceManagerExecutor.execute();
            }
        }
    }

    public final void f(Intent intent) {
        Bundle extras;
        String string;
        Map<String, Object> map;
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("pageAfterLogin")) == null) {
            return;
        }
        Intrinsics.checkNotNull(string);
        Bundle bundle = extras.getBundle("paramsAfterLogin");
        if (bundle != null) {
            Intrinsics.checkNotNull(bundle);
            map = BundleExtensionsKt.toMap(bundle);
        } else {
            map = null;
        }
        j().setIntent(new LoginContract.Intent.NativeLinkPage(string, map));
        j().setIntent(new LoginContract.Intent.UserConfiguration(new LoginConfigurationData(null, null, null, false, null, null, false, false, 255, null)));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        Animation.SlideLeft slideLeft = Animation.SlideLeft.INSTANCE;
        overridePendingTransition(slideLeft.getEnterAnim(), slideLeft.getExitAnim());
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    public final void hideKeyboard$Login_mexicoGoogleRelease() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Constants.INPUT_METHOD);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
            View currentFocus2 = getCurrentFocus();
            EditText editText = currentFocus2 instanceof EditText ? (EditText) currentFocus2 : null;
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    public final ActivityLoginBinding i() {
        return (ActivityLoginBinding) this.f33505u0.getValue();
    }

    public final LoginViewModel j() {
        return (LoginViewModel) this.f33504t0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        j().cleanDeeplink();
        j().cleanShortcut();
        hideKeyboard$Login_mexicoGoogleRelease();
        finish();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle extras;
        LoginConfigurationData loginConfigurationData;
        super.onCreate(savedInstanceState);
        setTitle(getString(com.bbva.glomohybrid.base.R.string.white_space_unicode));
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver((LoginAnimationObserver) this.f33508y0.getValue());
        j().logActivityEvent();
        j().addViewModelAsComponent(hashCode());
        setContentView(i().getRoot());
        Intent intent = getIntent();
        int i10 = 1;
        if (intent != null && (extras = intent.getExtras()) != null && (loginConfigurationData = (LoginConfigurationData) extras.getParcelable(DefaultConfigConstantsKt.INTENT_KEY_LOGIN_CONFIG_DATA)) != null) {
            LoginViewModel loginViewModelJ = j();
            if (!Boolean.valueOf(!l.isBlank(loginConfigurationData.getUserName())).booleanValue()) {
                loginConfigurationData = null;
            }
            loginViewModelJ.setUserConfiguration(loginConfigurationData);
        }
        LoginViewModel loginViewModelJ2 = j();
        loginViewModelJ2.setupActions();
        loginViewModelJ2.checkConnection();
        Toolbar toolbar = i().loginToolbar;
        AppCompatTextView appCompatTextView = i().toolbarTitle;
        int i11 = R.string.toolbar_title;
        appCompatTextView.setText(getString(i11));
        i().toolbarTitle.setContentDescription(getString(i11));
        i().toolbarIcClose.setOnClickListener(new w5.a(this, i10));
        j().getLoginLoaderState().observe(this, new h(new Function1<LoaderState, Unit>() { // from class: com.bbva.glomohybrid.login.presentation.view.LoginActivity$collectLoginLoaderState$1

            /* JADX INFO: compiled from: LoginActivity.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoaderState.values().length];
                    try {
                        iArr[LoaderState.SHOW.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LoaderState.HIDE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[LoaderState.NEXT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(LoaderState loaderState) {
                LoaderState loaderState2 = loaderState;
                int i12 = loaderState2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[loaderState2.ordinal()];
                LoginActivity loginActivity = this.f33512p0;
                if (i12 == 1) {
                    LoginActivity.access$getLoaderViewModel(loginActivity).show();
                    loginActivity.disableInstallUpdateModal();
                } else if (i12 == 2) {
                    LoginActivity.access$getLoaderViewModel(loginActivity).hide();
                    loginActivity.enableInstallUpdateModal();
                } else if (i12 == 3) {
                    LoginActivity.access$getLoaderViewModel(loginActivity).nextStep();
                }
                return Unit.INSTANCE;
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t9.f(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.bbva.glomohybrid.login.presentation.view.a(this, null), 3, null);
        j().snackBarObserver().observe(this, new h(new t9.g(this)));
        j().getModalsLiveData().observe(this, new h(new t9.c(this)));
        j().getLoaderSpinner().observe(this, new h(new t9.h(this)));
        j().getScreenNavigation().observe(this, new h(new t9.i(this)));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.bbva.glomohybrid.login.presentation.view.d(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.bbva.glomohybrid.login.presentation.view.c(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new com.bbva.glomohybrid.login.presentation.view.b(this, null), 3, null);
        final t9.e eVar = new t9.e(this);
        i().container.setOnTouchListener(new View.OnTouchListener() { // from class: t9.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                Function2 tmp0 = eVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
            }
        });
        i().loginToolbar.setOnTouchListener(new View.OnTouchListener() { // from class: t9.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                Function2 tmp0 = eVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(view, motionEvent)).booleanValue();
            }
        });
        Lazy lazy = this.f33507x0;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewComponentFactory viewComponentFactory = ViewComponentFactory.INSTANCE;
        ((LoaderViewModel) value).setProperties(viewComponentFactory.loader());
        Object value2 = this.E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LoaderSpinnerViewModel) value2).setProperties(viewComponentFactory.loaderSpinner());
        Object value3 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((LoaderViewModel) value3).setProperties(viewComponentFactory.lowConnectionMessage());
        j().getNativeFeatureFlag();
        j().onViewCreate();
        f(getIntent());
        j().setIntent(LoginContract.Intent.InitializeView.INSTANCE);
        j().setIntent(new LoginContract.Intent.LoadRememberedUser(this));
        j().setIntent(LoginContract.Intent.LoadLoginViewState.INSTANCE);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        f(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CellsReactor.fire$default("login", J0, null, 4, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        CellsReactor.fire$default("login", I0, null, 4, null);
        j().setIntent(LoginContract.Intent.CredentialsErrorViewState.INSTANCE);
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        CellsReactor.fire$default("login", K0, null, 4, null);
        super.onStop();
    }

    public final void rateApp() {
        ReviewManager reviewManagerCreate = ReviewManagerFactory.create(this);
        Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, "create(...)");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new g(new InAppReview(reviewManagerCreate), this, null), 3, null);
    }

    public final void setIsLoadingAnimating$Login_mexicoGoogleRelease(boolean isAnimating) {
    }
}
