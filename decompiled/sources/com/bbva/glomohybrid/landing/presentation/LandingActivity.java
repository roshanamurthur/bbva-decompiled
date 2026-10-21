package com.bbva.glomohybrid.landing.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.databinding.ActivityLandingBinding;
import com.bbva.glomohybrid.landing.domain.model.LandingBiometricsParams;
import com.bbva.glomohybrid.landing.presentation.adapter.LandingAdapter;
import com.bbva.glomohybrid.landing.presentation.adapter.LandingItemsAnimator;
import com.bbva.glomohybrid.landing.presentation.adapter.LandingItemsMarginDecorator;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import com.bbva.glomohybrid.landing.presentation.router.LandingInAppUpdatesRouter;
import com.bbva.glomohybrid.landing.presentation.router.LandingRouter;
import com.bbva.glomohybrid.landing.presentation.view.LandingChangeUserModalsView;
import com.bbva.glomohybrid.landing.presentation.view.LandingToolbar;
import com.bbva.glomohybrid.landing.presentation.view.handler.SlideMenuIntentHandler;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.ui.component.menu.SlideMenuView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@FlowPreview
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "<init>", "()V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingActivity.kt\ncom/bbva/glomohybrid/landing/presentation/LandingActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,350:1\n71#2,3:351\n41#3,6:354\n52#4,5:360\n52#4,5:366\n52#4,5:372\n40#4,5:378\n52#4,5:383\n133#5:365\n133#5:371\n133#5:377\n133#5:388\n*S KotlinDebug\n*F\n+ 1 LandingActivity.kt\ncom/bbva/glomohybrid/landing/presentation/LandingActivity\n*L\n60#1:351,3\n62#1:354,6\n65#1:360,5\n66#1:366,5\n67#1:372,5\n97#1:378,5\n326#1:383,5\n65#1:365\n66#1:371\n67#1:377\n326#1:388\n*E\n"})
public final class LandingActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "landing";

    @NotNull
    public final Lazy E0;

    @NotNull
    public final Lazy F0;

    @NotNull
    public final Lazy G0;

    @NotNull
    public final Lazy H0;

    @Nullable
    public LandingContract.Intent.MenuItemTap I0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f32935s0 = 200;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32936t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f32937u0;

    @NotNull
    public final LandingRouter v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f32938w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f32939x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f32940y0;

    /* JADX INFO: compiled from: LandingActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingActivity$Companion;", "", "()V", "ID", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class a extends Lambda implements Function0<BiometricsIntentHandler> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BiometricsIntentHandler invoke() {
            return new BiometricsIntentHandler(LandingActivity.this.hashCode());
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    @SourceDebugExtension({"SMAP\nLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingActivity.kt\ncom/bbva/glomohybrid/landing/presentation/LandingActivity$changeUserModals$2\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,350:1\n52#2,5:351\n52#2,5:357\n133#3:356\n133#3:362\n*S KotlinDebug\n*F\n+ 1 LandingActivity.kt\ncom/bbva/glomohybrid/landing/presentation/LandingActivity$changeUserModals$2\n*L\n84#1:351,5\n85#1:357,5\n84#1:356\n85#1:362\n*E\n"})
    public static final class b extends Lambda implements Function0<LandingChangeUserModalsView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LandingChangeUserModalsView invoke() {
            LandingActivity landingActivity = LandingActivity.this;
            return new LandingChangeUserModalsView(landingActivity, (ChangeUserFullScreenModalFactory) AndroidKoinScopeExtKt.getKoinScope(landingActivity).get(Reflection.getOrCreateKotlinClass(ChangeUserFullScreenModalFactory.class), null, null), (HalfModalComponent) AndroidKoinScopeExtKt.getKoinScope(landingActivity).get(Reflection.getOrCreateKotlinClass(HalfModalComponent.class), null, null));
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class c extends Lambda implements Function0<LandingInAppUpdatesRouter> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LandingInAppUpdatesRouter invoke() {
            LandingActivity landingActivity = LandingActivity.this;
            return new LandingInAppUpdatesRouter(landingActivity.getInAppUpdatesHandler(), landingActivity.v0);
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class d extends Lambda implements Function0<LandingAdapter> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f32944p0 = new d(0);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final LandingAdapter invoke() {
            return new LandingAdapter(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class e extends Lambda implements Function0<SlideMenuIntentHandler> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SlideMenuIntentHandler invoke() {
            return new SlideMenuIntentHandler(LandingActivity.this.hashCode(), String.valueOf(R.id.slideMenuView));
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class f extends Lambda implements Function0<ParametersHolder> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(LandingActivity.this);
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class g extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(LandingActivity.this.hashCode(), String.valueOf(R.id.loaderSpinnerComponent));
        }
    }

    /* JADX INFO: compiled from: LandingActivity.kt */
    public static final class h extends Lambda implements Function0<ParametersHolder> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(LandingActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f32936t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityLandingBinding>() { // from class: com.bbva.glomohybrid.landing.presentation.LandingActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityLandingBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityLandingBinding.inflate(layoutInflater);
            }
        });
        final h hVar = new h();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32937u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LandingViewModel>() { // from class: com.bbva.glomohybrid.landing.presentation.LandingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final LandingViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = hVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LandingViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.v0 = new LandingRouter((ActionLauncher) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(ActionLauncher.class), null, null), (List) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(List.class), null, new f()), (MobileServices) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(MobileServices.class), null, null));
        this.f32938w0 = LazyKt__LazyJVMKt.lazy(new c());
        this.f32939x0 = LazyKt__LazyJVMKt.lazy(new g());
        this.f32940y0 = LazyKt__LazyJVMKt.lazy(new b());
        this.E0 = LazyKt__LazyJVMKt.lazy(new e());
        this.F0 = LazyKt__LazyJVMKt.lazy(new a());
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.G0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<SlideMenuViewContract>() { // from class: com.bbva.glomohybrid.landing.presentation.LandingActivity$special$$inlined$inject$default$1
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
        this.H0 = LazyKt__LazyJVMKt.lazy(d.f32944p0);
    }

    public static final BiometricsIntentHandler access$getBiometricsIntentHandler(LandingActivity landingActivity) {
        return (BiometricsIntentHandler) landingActivity.F0.getValue();
    }

    public static final LandingChangeUserModalsView access$getChangeUserModals(LandingActivity landingActivity) {
        return (LandingChangeUserModalsView) landingActivity.f32940y0.getValue();
    }

    public static final LandingAdapter access$getLandingAdapter(LandingActivity landingActivity) {
        return (LandingAdapter) landingActivity.H0.getValue();
    }

    public static final SlideMenuIntentHandler access$getMenuIntentHandler(LandingActivity landingActivity) {
        return (SlideMenuIntentHandler) landingActivity.E0.getValue();
    }

    public static final void access$handleBiometricsIntents(LandingActivity landingActivity, BiometricsIntentHandler.Intent intent) {
        landingActivity.getClass();
        if (Intrinsics.areEqual(intent, BiometricsIntentHandler.Intent.AccessDenied.INSTANCE)) {
            landingActivity.k().setIntent(LandingContract.Intent.CancelPendingNavigation.INSTANCE);
        } else if (Intrinsics.areEqual(intent, BiometricsIntentHandler.Intent.AccessGranted.INSTANCE)) {
            landingActivity.k().setIntent(LandingContract.Intent.ResumePendingNavigation.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$handleChangeUserModalIntents(LandingActivity landingActivity, LandingChangeUserModalsView.Intent intent) {
        landingActivity.getClass();
        if (Intrinsics.areEqual(intent, LandingChangeUserModalsView.Intent.ConfirmChangeUser.INSTANCE)) {
            landingActivity.k().setIntent(new LandingContract.Intent.PerformChangeUser(new LandingBiometricsParams(landingActivity)));
        } else if (intent instanceof LandingChangeUserModalsView.Intent.OpenExternalLink) {
            landingActivity.k().setIntent(new LandingContract.Intent.OpenLink(new LandingLink(((LandingChangeUserModalsView.Intent.OpenExternalLink) intent).getLink(), false, false, 4, null), null, 2, 0 == true ? 1 : 0));
        }
    }

    public static final void access$handleEvent(LandingActivity landingActivity, LandingContract.Event event) {
        landingActivity.getClass();
        boolean z10 = event instanceof LandingContract.Event.CustomNavigation;
        LandingRouter landingRouter = landingActivity.v0;
        if (z10) {
            if (landingRouter.customNavigation(landingActivity, ((LandingContract.Event.CustomNavigation) event).getRoute())) {
                return;
            }
            landingActivity.k().setIntent(LandingContract.Intent.ResumePendingNavigation.INSTANCE);
            return;
        }
        if (event instanceof LandingContract.Event.Navigation) {
            landingRouter.navigate(landingActivity, (LandingContract.Event.Navigation) event);
            return;
        }
        if (event instanceof LandingContract.Event.SnackBar) {
            landingActivity.renderSnackbar(((LandingContract.Event.SnackBar) event).getState());
            return;
        }
        if (event instanceof LandingContract.Event.Modal) {
            ((LandingChangeUserModalsView) landingActivity.f32940y0.getValue()).show(((LandingContract.Event.Modal) event).getValue());
        } else if (event instanceof LandingContract.Event.ImmediateUpdateNavigation) {
            ((LandingInAppUpdatesRouter) landingActivity.f32938w0.getValue()).update(landingActivity, (LandingContract.Event.ImmediateUpdateNavigation) event);
        } else if (event instanceof LandingContract.Event.EnterpriseNavigation) {
            landingActivity.k().setIntent(LandingContract.Intent.EnterpriseLogin.INSTANCE);
        }
    }

    public static final void access$handleMenuIntents(LandingActivity landingActivity, SlideMenuIntentHandler.Intent intent) {
        landingActivity.getClass();
        if (intent instanceof SlideMenuIntentHandler.Intent.ItemTap) {
            SlideMenuIntentHandler.Intent.ItemTap itemTap = (SlideMenuIntentHandler.Intent.ItemTap) intent;
            if (landingActivity.i().slideMenuView.isOpen()) {
                landingActivity.i().slideMenuView.close();
            }
            landingActivity.i().slideMenuView.featureItem(itemTap.getItem().getId(), false);
            landingActivity.I0 = new LandingContract.Intent.MenuItemTap(itemTap.getItem());
            return;
        }
        if (Intrinsics.areEqual(intent, SlideMenuIntentHandler.Intent.MenuClosed.INSTANCE)) {
            LandingContract.Intent.MenuItemTap menuItemTap = landingActivity.I0;
            if (menuItemTap != null) {
                landingActivity.k().setIntent(menuItemTap);
            }
            landingActivity.I0 = null;
        }
    }

    public static final void access$handleState(LandingActivity landingActivity, LandingContract.State state) {
        landingActivity.getClass();
        if (Intrinsics.areEqual(state, LandingContract.State.Loading.INSTANCE)) {
            landingActivity.j().showSpinner(true);
            landingActivity.i().slideMenuView.lock();
            return;
        }
        boolean z10 = state instanceof LandingContract.State.Skeleton;
        Lazy lazy = landingActivity.H0;
        if (z10) {
            LandingContract.State.Skeleton skeleton = (LandingContract.State.Skeleton) state;
            landingActivity.j().showSpinner(false);
            ((LandingAdapter) lazy.getValue()).clear(skeleton.getHeader());
            landingActivity.f(skeleton.getHeader().getMenu());
            return;
        }
        if (state instanceof LandingContract.State.Ready) {
            LandingContract.State.Ready ready = (LandingContract.State.Ready) state;
            landingActivity.j().showSpinner(false);
            ((LandingAdapter) lazy.getValue()).update(ready.getHeader(), ready.getSections());
            landingActivity.f(ready.getHeader().getMenu());
        }
    }

    public final void f(UserMenu userMenu) {
        UserMenu userMenuCopy$default;
        if (userMenu == null || (userMenuCopy$default = UserMenu.copy$default(userMenu, StringExtensionsKt.capitalizeSentence$default(userMenu.getUserName(), null, 1, null), null, false, null, false, 0, 62, null)) == null) {
            i().slideMenuView.lock();
            i().toolbar.configureMenuVisibility(false);
            return;
        }
        List list = (List) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(List.class), QualifierKt.named(userMenuCopy$default.getUserType()), null);
        SlideMenuView slideMenuView = i().slideMenuView;
        Intrinsics.checkNotNullExpressionValue(slideMenuView, "slideMenuView");
        MenuExtensionsKt.updateMenu(slideMenuView, (SlideMenuViewContract) this.G0.getValue(), userMenuCopy$default, list);
        i().slideMenuView.unlock();
        i().toolbar.configureMenuVisibility(true);
        LandingToolbar landingToolbar = i().toolbar;
        SlideMenuView slideMenuView2 = i().slideMenuView;
        Intrinsics.checkNotNullExpressionValue(slideMenuView2, "slideMenuView");
        landingToolbar.configureDotVisibility(MenuExtensionsKt.hasFeatures(slideMenuView2));
    }

    public final ActivityLandingBinding i() {
        return (ActivityLandingBinding) this.f32936t0.getValue();
    }

    public final LoaderSpinnerViewModel j() {
        Object value = this.f32939x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LoaderSpinnerViewModel) value;
    }

    public final LandingViewModel k() {
        return (LandingViewModel) this.f32937u0.getValue();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.label_screen_title_accesibility));
        setContentView(i().getRoot());
        InAppUpdatesHandler inAppUpdatesHandler = getInAppUpdatesHandler();
        if (inAppUpdatesHandler != null) {
            inAppUpdatesHandler.configure(this);
        }
        i().slideMenuView.setCloseAccessibilityLabel(getString(R.string.ui_menu_close_accessibility));
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        ViewCompat.setOnApplyWindowInsetsListener(i().getRoot(), new k9.a(this, 0));
        LandingToolbar landingToolbar = i().toolbar;
        RecyclerView landing = i().landing;
        Intrinsics.checkNotNullExpressionValue(landing, "landing");
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        landingToolbar.attachToRecyclerView(landing, window);
        RecyclerView recyclerView = i().landing;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((LandingAdapter) this.H0.getValue());
        recyclerView.setItemAnimator(new LandingItemsAnimator());
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new LandingItemsMarginDecorator(context));
        j().setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
        k().addViewModelAsComponent(hashCode());
        i().toolbar.setMenuButtonListener(new k9.g(this));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.landing.presentation.c(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new k9.c(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new k9.b(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new k9.d(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.landing.presentation.a(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.landing.presentation.b(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k9.f(this, null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        k().cleanDeeplinkObservers();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        k().setIntent(LandingContract.Intent.LoadProfile.INSTANCE);
    }
}
