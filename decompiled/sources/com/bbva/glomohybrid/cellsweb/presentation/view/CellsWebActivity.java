package com.bbva.glomohybrid.cellsweb.presentation.view;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.i;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.activity.WebViewActivity;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.HearingDisabilitiesComponent;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.delegates.ComponentProviderDelegate;
import com.bbva.glomohybrid.base.delegates.ComponentProviderDelegateKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.glomohybrid.cellsweb.databinding.ActivityCellswebBinding;
import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.model.ScreenState;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.cellsweb.provider.CellsDependenciesProvider;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate;
import com.bbva.library.darkmode.DarkModeExtensions;
import com.bbva.slidemenuview.cells.channels.MenuWebChannels;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.ui.component.menu.SlideMenuView;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
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
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CellsWebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0014J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001b\u0010\u0018\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/view/CellsWebActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onStart", "onBackPressed", "finish", "closeScreen", "", "value", "setIsCellsModalShown", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lorg/koin/core/scope/Scope;", "s0", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "<init>", "()V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebActivity.kt\ncom/bbva/glomohybrid/cellsweb/presentation/view/CellsWebActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n+ 6 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n71#2,3:234\n41#3,6:237\n40#4,5:243\n40#4,5:248\n40#4,5:259\n116#5,6:253\n55#6,4:264\n1855#7,2:268\n*S KotlinDebug\n*F\n+ 1 CellsWebActivity.kt\ncom/bbva/glomohybrid/cellsweb/presentation/view/CellsWebActivity\n*L\n52#1:234,3\n53#1:237,6\n54#1:243,5\n55#1:248,5\n77#1:259,5\n60#1:253,6\n88#1:264,4\n163#1:268,2\n*E\n"})
public final class CellsWebActivity extends BaseActivity implements AndroidScopeComponent {

    @NotNull
    public static final String ID = "cellsweb";

    @NotNull
    public static final String USERTYPE_ID = "userTypeWebActivityDelegate";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final ComponentProviderDelegate F0;

    @NotNull
    public final ComponentProviderDelegate G0;
    public boolean H0;

    @NotNull
    public final Lazy I0;

    @NotNull
    public final Lazy J0;

    @NotNull
    public final Lazy K0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy scope = ComponentActivityExtKt.activityScope(this);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f31717t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f31718u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f31719w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f31720x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f31721y0;
    public static final /* synthetic */ KProperty<Object>[] L0 = {i.d(CellsWebActivity.class, "messageDispatcher", "getMessageDispatcher()Lcom/bbva/bridge/dispatcher/MessageDispatcher;", 0), i.d(CellsWebActivity.class, "webController", "getWebController()Lcom/bbva/cellscore/web/WebController;", 0)};

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class a extends Lambda implements Function0<DefaultActivityRouter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(CellsWebActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class b extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(CellsWebActivity.this.hashCode(), String.valueOf(R.id.menuLoaderWeb));
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class c extends Lambda implements Function0<Router> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31724p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Router invoke() {
            return (Router) ComponentManager.get(Router.ID);
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f31725a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31725a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31725a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31725a;
        }

        public final int hashCode() {
            return this.f31725a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31725a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class e extends Lambda implements Function0<ParametersHolder> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(CellsWebActivity.this);
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class f extends Lambda implements Function0<ParametersHolder> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            CellsWebActivity cellsWebActivity = CellsWebActivity.this;
            return ParametersHolderKt.parametersOf(cellsWebActivity, cellsWebActivity.i());
        }
    }

    /* JADX INFO: compiled from: CellsWebActivity.kt */
    public static final class g extends Lambda implements Function0<ParametersHolder> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(CellsWebActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CellsWebActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f31717t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityCellswebBinding>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityCellswebBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityCellswebBinding.inflate(layoutInflater);
            }
        });
        final g gVar = new g();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31718u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CellsWebViewModel>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CellsWebViewModel invoke() {
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
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CellsWebViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<SlideMenuViewContract>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.slidemenuview.presentation.SlideMenuViewContract, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SlideMenuViewContract invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(SlideMenuViewContract.class), objArr2, objArr3);
            }
        });
        final StringQualifier stringQualifierNamed = QualifierKt.named(CellsDependenciesProvider.ID);
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.f31719w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ActivityDependenciesProvider>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityDependenciesProvider invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(ActivityDependenciesProvider.class), stringQualifierNamed, objArr4);
            }
        });
        this.f31720x0 = LazyKt__LazyJVMKt.lazy(c.f31724p0);
        final Scope scope = getScope();
        final e eVar = new e();
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f31721y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ModalsView>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final ModalsView invoke() {
                return scope.getOrNull(Reflection.getOrCreateKotlinClass(ModalsView.class), objArr5, eVar);
            }
        });
        this.E0 = LazyKt__LazyJVMKt.lazy(new a());
        this.F0 = ComponentProviderDelegateKt.components$default(this, "web-dispatcher", 0, 2, null);
        this.G0 = ComponentProviderDelegateKt.components$default(this, WebActions.ID, 0, 2, null);
        final StringQualifier stringQualifierNamed2 = QualifierKt.named(USERTYPE_ID);
        final f fVar = new f();
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<UserTypeActivityDelegate>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UserTypeActivityDelegate invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(UserTypeActivityDelegate.class), stringQualifierNamed2, fVar);
            }
        });
        this.J0 = LazyKt__LazyJVMKt.lazy(new b());
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.K0 = LazyKt__LazyJVMKt.lazy(new Function0<HearingDisabilitiesComponent>() { // from class: com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity$special$$inlined$injectOrNull$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.bbva.glomohybrid.base.HearingDisabilitiesComponent, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final HearingDisabilitiesComponent invoke() {
                return ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(HearingDisabilitiesComponent.class), objArr6, objArr7);
            }
        });
    }

    public static final void access$computeFeaturedMenuIcon(CellsWebActivity cellsWebActivity) {
        cellsWebActivity.getClass();
        MessageDispatcher messageDispatcher = (MessageDispatcher) cellsWebActivity.F0.getValue2((Activity) cellsWebActivity, L0[0]);
        if (messageDispatcher != null) {
            String name = MenuWebChannels.INSTANCE.getMenuChannel().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            SlideMenuView slideMenuViewDashboard = ((ActivityCellswebBinding) cellsWebActivity.f31717t0.getValue()).slideMenuViewDashboard;
            Intrinsics.checkNotNullExpressionValue(slideMenuViewDashboard, "slideMenuViewDashboard");
            messageDispatcher.sendMessage(name, p.mapOf(TuplesKt.to("whatsNew", Boolean.valueOf(MenuExtensionsKt.hasFeatures(slideMenuViewDashboard)))));
        }
    }

    public static final ActivityRouter access$getActivityRouter(CellsWebActivity cellsWebActivity) {
        return (ActivityRouter) cellsWebActivity.E0.getValue();
    }

    public static final ActivityCellswebBinding access$getBinding(CellsWebActivity cellsWebActivity) {
        return (ActivityCellswebBinding) cellsWebActivity.f31717t0.getValue();
    }

    public static final SlideMenuViewContract access$getMenuViewContract(CellsWebActivity cellsWebActivity) {
        return (SlideMenuViewContract) cellsWebActivity.v0.getValue();
    }

    public static final Router access$getRouter(CellsWebActivity cellsWebActivity) {
        Object value = cellsWebActivity.f31720x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Router) value;
    }

    public static final ModalsView access$getSingleAppModalsView(CellsWebActivity cellsWebActivity) {
        return (ModalsView) cellsWebActivity.f31721y0.getValue();
    }

    public final void closeScreen() {
        CellsReactor.fire$default("cellsweb", ActionConstants.INSTANCE.getACTION_FINISH(), null, 4, null);
        i().setIntent(CellsWebContract.Intent.CloseScreen.INSTANCE);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        Animation.SlideLeft slideLeft = Animation.SlideLeft.INSTANCE;
        overridePendingTransition(slideLeft.getEnterAnim(), slideLeft.getExitAnim());
        i().sendIsOpenedEvent(false);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    public final CellsWebViewModel i() {
        return (CellsWebViewModel) this.f31718u0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.H0) {
            CellsReactor.fire$default("cellsweb", ActionConstants.INSTANCE.getACTION_NATIVE_BACK(), null, 4, null);
            return;
        }
        ActionSpec<Void> ON_BACK = WebViewActivity.ON_BACK;
        Intrinsics.checkNotNullExpressionValue(ON_BACK, "ON_BACK");
        CellsReactor.fire$default("cellsweb", ON_BACK, null, 4, null);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        WebController webController = (WebController) this.G0.getValue2((Activity) this, L0[1]);
        InternalWebView webView = webController != null ? webController.getWebView() : null;
        if (webView != null) {
            DarkModeExtensions.setMode(webView, this, ConfigConstantsKt.getDEFAULT_DARK_MODE());
        }
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i().addViewModelAsComponent(hashCode());
        Lazy lazy = this.f31717t0;
        setContentView(((ActivityCellswebBinding) lazy.getValue()).getRoot());
        Object value = this.J0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LoaderSpinnerViewModel loaderSpinnerViewModel = (LoaderSpinnerViewModel) value;
        loaderSpinnerViewModel.setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
        loaderSpinnerViewModel.applyChanges();
        ((ActivityCellswebBinding) lazy.getValue()).slideMenuViewDashboard.setCloseAccessibilityLabel(getString(R.string.ui_menu_close_accessibility));
        ((ActivityCellswebBinding) lazy.getValue()).slideMenuViewDashboard.lock();
        Iterator<T> it = ((ActivityDependenciesProvider) this.f31719w0.getValue()).observers().iterator();
        while (it.hasNext()) {
            getLifecycle().addObserver((LifecycleObserver) it.next());
        }
        ((UserTypeActivityDelegate) this.I0.getValue()).registerObservers(this);
        i().snackBarObserver().observe(this, new d(new k8.a(this)));
        i().getUserMenuLiveData().observe(this, new d(new k8.b(this)));
        i().refreshMenuObserver().observe(this, new d(new k8.c(this)));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new k8.d(this, null));
        i().getEvents().observe(this, new d(new k8.e(this)));
        i().sendIsOpenedEvent(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        i().setIntent(new CellsWebContract.Intent.ScreenStateChange(ScreenState.Hidden));
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ActionSpec<Void> ON_RESUME = WebViewActivity.ON_RESUME;
        Intrinsics.checkNotNullExpressionValue(ON_RESUME, "ON_RESUME");
        CellsReactor.fire$default("cellsweb", ON_RESUME, null, 4, null);
        i().setIntent(new CellsWebContract.Intent.ScreenStateChange(ScreenState.Visible));
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        CellsReactor.fire$default("cellsweb", ActionConstants.INSTANCE.getACTION_SCREEN_STARTED(), null, 4, null);
        i().notifyRememberedUser();
        super.onStart();
        i().initView();
        Lazy lazy = this.K0;
        HearingDisabilitiesComponent hearingDisabilitiesComponent = (HearingDisabilitiesComponent) lazy.getValue();
        if (hearingDisabilitiesComponent != null) {
            hearingDisabilitiesComponent.initialize(this);
        }
        HearingDisabilitiesComponent hearingDisabilitiesComponent2 = (HearingDisabilitiesComponent) lazy.getValue();
        if (hearingDisabilitiesComponent2 != null) {
            hearingDisabilitiesComponent2.addViewAsComponent(hashCode());
        }
    }

    public final void setIsCellsModalShown(boolean value) {
        this.H0 = value;
    }
}
