package com.bbva.glomohybrid.welcome.presentation.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.w1;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bk.p;
import bk.q;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.component.ui.welcome.footer.WelcomeFooter;
import com.bbva.component.ui.welcome.footer.WelcomeFooterViewModel;
import com.bbva.component.ui.welcome.header.WelcomeHeader;
import com.bbva.component.ui.welcome.header.WelcomeHeaderViewModel;
import com.bbva.glomo.router.RouterWelcome;
import com.bbva.glomo.router.WelcomeAction;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.welcome.R;
import com.bbva.glomohybrid.welcome.databinding.ActivityWelcomeBinding;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WelcomeActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@FlowPreview
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@Deprecated(message = "All countries will use the new `WelcomeDistributionActivity`")
@SourceDebugExtension({"SMAP\nWelcomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeActivity.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n*L\n1#1,183:1\n71#2,3:184\n41#3,6:187\n40#4,5:193\n40#4,5:198\n*S KotlinDebug\n*F\n+ 1 WelcomeActivity.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivity\n*L\n42#1:184,3\n44#1:187,6\n46#1:193,5\n58#1:198,5\n*E\n"})
@ExperimentalCoroutinesApi
public final class WelcomeActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "welcome";

    @NotNull
    public static final String LOG_ACTIVITY = "Welcome Activity";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f34760s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f34761t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f34762u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f34763w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f34764x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f34765y0;

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivity$Companion;", "", "()V", "ID", "", "LOG_ACTIVITY", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class a extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(WelcomeActivity.this.hashCode(), String.valueOf(R.id.welcomeSpinner));
        }
    }

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34767a;

        public b(la.c function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34767a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34767a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34767a;
        }

        public final int hashCode() {
            return this.f34767a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34767a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(WelcomeActivity.this);
        }
    }

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class d extends Lambda implements Function0<WelcomeFooterViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WelcomeFooterViewModel invoke() {
            return (WelcomeFooterViewModel) ComponentManager.get(WelcomeActivity.this.hashCode(), String.valueOf(R.id.welcomeFooter));
        }
    }

    /* JADX INFO: compiled from: WelcomeActivity.kt */
    public static final class e extends Lambda implements Function0<WelcomeHeaderViewModel> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WelcomeHeaderViewModel invoke() {
            return (WelcomeHeaderViewModel) ComponentManager.get(WelcomeActivity.this.hashCode(), String.valueOf(R.id.welcomeHeader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f34760s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityWelcomeBinding>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityWelcomeBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityWelcomeBinding.inflate(layoutInflater);
            }
        });
        final c cVar = new c();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34761t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WelcomeViewModel>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WelcomeViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = cVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WelcomeViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f34762u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<RouterWelcome>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomo.router.RouterWelcome, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RouterWelcome invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(RouterWelcome.class), objArr2, objArr3);
            }
        });
        this.v0 = LazyKt__LazyJVMKt.lazy(new d());
        this.f34763w0 = LazyKt__LazyJVMKt.lazy(new e());
        this.f34764x0 = LazyKt__LazyJVMKt.lazy(new a());
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f34765y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), objArr4, objArr5);
            }
        });
    }

    public static final ActivityWelcomeBinding access$getBinding(WelcomeActivity welcomeActivity) {
        return (ActivityWelcomeBinding) welcomeActivity.f34760s0.getValue();
    }

    public static final WelcomeViewModel access$getViewModel(WelcomeActivity welcomeActivity) {
        return (WelcomeViewModel) welcomeActivity.f34761t0.getValue();
    }

    public static final void access$handleEvents(WelcomeActivity welcomeActivity, WelcomeContract.Event event) {
        welcomeActivity.getClass();
        if (Intrinsics.areEqual(event, WelcomeContract.Event.DeeplinkReceived.INSTANCE)) {
            ((WelcomeViewModel) welcomeActivity.f34761t0.getValue()).onEnterButtonClick();
        }
    }

    public static final void access$handleStates(WelcomeActivity welcomeActivity, WelcomeContract.State state) {
        welcomeActivity.getClass();
        if (!(state instanceof WelcomeContract.State.RememberedUser)) {
            if (state instanceof WelcomeContract.State.WebReady) {
                ((RouterWelcome) welcomeActivity.f34762u0.getValue()).computeNavigation(welcomeActivity, WelcomeAction.Bottom.INSTANCE);
                return;
            }
            return;
        }
        String username = ((WelcomeContract.State.RememberedUser) state).getUsername();
        Lazy lazy = welcomeActivity.f34760s0;
        WelcomeHeader welcomeHeader = ((ActivityWelcomeBinding) lazy.getValue()).welcomeHeader;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("type", "literal");
        if (username == null) {
            username = "";
        }
        pairArr[1] = TuplesKt.to("value", "Hola ".concat(username));
        welcomeHeader.setWelcomeHeaderUsername(p.mapOf(TuplesKt.to("text", q.mapOf(pairArr))));
        Map<String, ? extends Map<String, String>> mapMapOf = q.mapOf(TuplesKt.to("title", p.mapOf(TuplesKt.to("value", ""))), TuplesKt.to("visibility", p.mapOf(TuplesKt.to("value", "gone"))));
        WelcomeFooter welcomeFooter = ((ActivityWelcomeBinding) lazy.getValue()).welcomeFooter;
        welcomeFooter.setBottomButtonConfig(mapMapOf);
        welcomeFooter.setTermsAndConditions(mapMapOf);
        Map<String, ? extends Map<String, String>> mapMapOf2 = q.mapOf(TuplesKt.to("title", p.mapOf(TuplesKt.to("text", q.mapOf(TuplesKt.to("type", "literal"), TuplesKt.to("value", "Conocer más"))))), TuplesKt.to("route", WelcomeActivityPager.ID));
        Intrinsics.checkNotNull(mapMapOf2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>");
        welcomeFooter.setTopButtonConfig(mapMapOf2);
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(((ActivityWelcomeBinding) this.f34760s0.getValue()).getRoot());
        Lazy lazy = this.f34761t0;
        ((WelcomeViewModel) lazy.getValue()).logActivityEvent();
        ((WelcomeViewModel) lazy.getValue()).addViewModelAsComponent(hashCode());
        ((AnalyticsManager) this.f34765y0.getValue()).trackEvent(AnalyticsEvent.WELCOME_SCREEN);
        new Handler(Looper.getMainLooper()).postDelayed(new w1(this, 4), 85L);
        Object value = this.v0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WelcomeFooterViewModel welcomeFooterViewModel = (WelcomeFooterViewModel) value;
        ViewComponentFactory viewComponentFactory = ViewComponentFactory.INSTANCE;
        welcomeFooterViewModel.setProperties(viewComponentFactory.welcomeFooter());
        welcomeFooterViewModel.applyChanges();
        Object value2 = this.f34763w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        WelcomeHeaderViewModel welcomeHeaderViewModel = (WelcomeHeaderViewModel) value2;
        welcomeHeaderViewModel.setProperties(viewComponentFactory.welcomeHeader());
        welcomeHeaderViewModel.applyChanges();
        Object value3 = this.f34764x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        LoaderSpinnerViewModel loaderSpinnerViewModel = (LoaderSpinnerViewModel) value3;
        loaderSpinnerViewModel.setProperties(viewComponentFactory.loaderSpinner());
        loaderSpinnerViewModel.applyChanges();
        ((WelcomeViewModel) lazy.getValue()).spinnerState().observe(this, new b(new la.c(this)));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new la.b(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new la.a(this, null), 3, null);
    }
}
