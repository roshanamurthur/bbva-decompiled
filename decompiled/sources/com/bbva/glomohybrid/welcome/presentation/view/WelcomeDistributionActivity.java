package com.bbva.glomohybrid.welcome.presentation.view;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.activity.ComponentActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.glomo.router.RouterWelcome;
import com.bbva.glomo.router.WelcomeAction;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.welcome.R;
import com.bbva.glomohybrid.welcome.databinding.ActivityWelcomeVideoBinding;
import com.bbva.glomohybrid.welcome.model.domain.WelcomeContract;
import com.bbva.glomohybrid.welcome.presentation.util.TextSwitchHandler;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
import la.f;
import la.h;
import la.i;
import la.j;
import la.k;
import la.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@FlowPreview
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeDistributionActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "navigateTopButton", "<init>", "()V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeDistributionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeDistributionActivity.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeDistributionActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n*L\n1#1,243:1\n71#2,3:244\n41#3,6:247\n40#4,5:253\n40#4,5:258\n*S KotlinDebug\n*F\n+ 1 WelcomeDistributionActivity.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeDistributionActivity\n*L\n50#1:244,3\n54#1:247,6\n56#1:253,5\n58#1:258,5\n*E\n"})
@ExperimentalCoroutinesApi
public final class WelcomeDistributionActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "welcome-video";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f34800s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f34801t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f34802u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f34803w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextSwitchHandler f34804x0;

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeDistributionActivity$Companion;", "", "()V", "ID", "", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WelcomeContract.Event.Navigation.Type.values().length];
            try {
                iArr[WelcomeContract.Event.Navigation.Type.OPEN_EXTERNAL_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WelcomeContract.Event.Navigation.Type.OPEN_WEB_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    public static final class a extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(WelcomeDistributionActivity.this.hashCode(), String.valueOf(R.id.welcomeSpinner));
        }
    }

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    public static final class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34806a;

        public b(l function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34806a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34806a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34806a;
        }

        public final int hashCode() {
            return this.f34806a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34806a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(WelcomeDistributionActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeDistributionActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f34800s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityWelcomeVideoBinding>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityWelcomeVideoBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityWelcomeVideoBinding.inflate(layoutInflater);
            }
        });
        final c cVar = new c();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34801t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WelcomeViewModel>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$special$$inlined$viewModel$default$1
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
        this.f34802u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.component.dm.analytics.AnalyticsManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AnalyticsManager invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(AnalyticsManager.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<RouterWelcome>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomo.router.RouterWelcome, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RouterWelcome invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(RouterWelcome.class), objArr4, objArr5);
            }
        });
        this.f34803w0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final LoaderSpinnerViewModel access$getLoaderSpinnerViewModel(WelcomeDistributionActivity welcomeDistributionActivity) {
        Object value = welcomeDistributionActivity.f34803w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LoaderSpinnerViewModel) value;
    }

    public static final void access$handleEvents(WelcomeDistributionActivity welcomeDistributionActivity, WelcomeContract.Event event) {
        welcomeDistributionActivity.getClass();
        if (!(event instanceof WelcomeContract.Event.Navigation)) {
            if (event instanceof WelcomeContract.Event.DeeplinkReceived) {
                welcomeDistributionActivity.navigateTopButton();
                return;
            }
            return;
        }
        WelcomeContract.Event.Navigation navigation = (WelcomeContract.Event.Navigation) event;
        int i10 = WhenMappings.$EnumSwitchMapping$0[navigation.getType().ordinal()];
        Lazy lazy = welcomeDistributionActivity.v0;
        if (i10 == 1) {
            ((RouterWelcome) lazy.getValue()).navigateToExternalWeb(welcomeDistributionActivity, navigation.getBundle());
        } else {
            if (i10 != 2) {
                return;
            }
            ((RouterWelcome) lazy.getValue()).navigateToWebApp(welcomeDistributionActivity, navigation.getBundle());
        }
    }

    public static final void access$handleState(WelcomeDistributionActivity welcomeDistributionActivity, WelcomeContract.State state) {
        welcomeDistributionActivity.getClass();
        if (state instanceof WelcomeContract.State.Loading) {
            welcomeDistributionActivity.j().showSpinner(true);
            return;
        }
        if (state instanceof WelcomeContract.State.Ready) {
            welcomeDistributionActivity.j().showSpinner(false);
            return;
        }
        if (state instanceof WelcomeContract.State.WebReady) {
            ((RouterWelcome) welcomeDistributionActivity.v0.getValue()).computeNavigation(welcomeDistributionActivity, WelcomeAction.Bottom.INSTANCE);
            return;
        }
        if (state instanceof WelcomeContract.State.PartialFirstStart) {
            welcomeDistributionActivity.i().welcomeBottomButton.setVisibility(8);
            return;
        }
        boolean z10 = state instanceof WelcomeContract.State.FirstStart;
        Lazy lazy = welcomeDistributionActivity.f34802u0;
        if (z10) {
            ((AnalyticsManager) lazy.getValue()).trackEvent(AnalyticsEvent.WELCOME_USER_DISTRIBUTION_NEW);
            return;
        }
        if (!(state instanceof WelcomeContract.State.RememberedUser)) {
            if (state instanceof WelcomeContract.State.RegisterUserEnabled) {
                welcomeDistributionActivity.i().welcomeBottomButton.setVisibility(0);
                return;
            } else {
                if (state instanceof WelcomeContract.State.RegisterUserDisabled) {
                    welcomeDistributionActivity.i().welcomeBottomButton.setVisibility(8);
                    return;
                }
                return;
            }
        }
        ((AnalyticsManager) lazy.getValue()).trackEvent(AnalyticsEvent.WELCOME_USER_DISTRIBUTION_CACHED);
        welcomeDistributionActivity.i().welcomeBottomButton.setVisibility(8);
        String strCapitalizeSentence = StringExtensionsKt.capitalizeSentence(((WelcomeContract.State.RememberedUser) state).getUsername(), " ");
        if (strCapitalizeSentence != null) {
            String[] stringArray = welcomeDistributionActivity.getResources().getStringArray(R.array.welcome_pager_texts);
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            String string = welcomeDistributionActivity.getString(R.string.welcome_pager_cached, strCapitalizeSentence);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            stringArray[0] = string;
            TextSwitchHandler textSwitchHandler = welcomeDistributionActivity.f34804x0;
            if (textSwitchHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textSwitchHandler");
                textSwitchHandler = null;
            }
            textSwitchHandler.setTexts(stringArray);
        }
    }

    public final ActivityWelcomeVideoBinding i() {
        return (ActivityWelcomeVideoBinding) this.f34800s0.getValue();
    }

    public final WelcomeViewModel j() {
        return (WelcomeViewModel) this.f34801t0.getValue();
    }

    public final void navigateTopButton() {
        ((RouterWelcome) this.v0.getValue()).computeNavigation(this, WelcomeAction.Top.INSTANCE);
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.white_space_unicode));
        setContentView(i().getRoot());
        j().logActivityEvent();
        j().addViewModelAsComponent(hashCode());
        j().getRegisterButtonConfigFromFeatureFlag();
        int i10 = 2;
        i().welcomeTopButton.setOnClickListener(new k5.b(this, i10));
        i().welcomeBottomButton.setOnClickListener(new w5.a(this, i10));
        observe(j().getLoader(), new j(this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(this, null), 3, null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new i(this, null));
        i().welcomeTextSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: la.g
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                WelcomeDistributionActivity.Companion companion = WelcomeDistributionActivity.INSTANCE;
                WelcomeDistributionActivity this$0 = this.f83154a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i11 = R.style.Welcome_TextSwitcher;
                TextView textView = new TextView(new ContextThemeWrapper(this$0, i11));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                textView.setLayoutParams(layoutParams);
                TextViewCompat.setTextAppearance(textView, i11);
                return textView;
            }
        });
        String[] stringArray = getResources().getStringArray(R.array.welcome_pager_texts);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        TextSwitchHandler textSwitchHandler = new TextSwitchHandler(stringArray, 0L, 2, null);
        this.f34804x0 = textSwitchHandler;
        textSwitchHandler.getCurrentText().observe(this, new b(new l(this)));
        Object value = this.f34803w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LoaderSpinnerViewModel) value).setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        TextSwitchHandler textSwitchHandler = this.f34804x0;
        if (textSwitchHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textSwitchHandler");
            textSwitchHandler = null;
        }
        textSwitchHandler.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i().backgroundVideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.welcome_video));
        i().backgroundVideo.start();
        i().backgroundVideo.setOnPreparedListener(new f());
        TextSwitchHandler textSwitchHandler = this.f34804x0;
        if (textSwitchHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textSwitchHandler");
            textSwitchHandler = null;
        }
        textSwitchHandler.start();
    }
}
