package com.bbva.glomohybrid.welcome.presentation.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.welcome.pager.WelcomePager;
import com.bbva.component.ui.welcome.pager.WelcomePagerViewModel;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.welcome.R;
import com.bbva.glomohybrid.welcome.databinding.ActivityWelcomePagerBinding;
import com.bbva.glomohybrid.welcome.helpers.WelcomeConfigHelper;
import com.bbva.glomohybrid.welcome.model.domain.StartMode;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeViewModel;
import kotlin.Deprecated;
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
import la.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WelcomeActivityPager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated(message = "All countries will use the new `WelcomeDistributionActivity`")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivityPager;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onOptionsItemSelected", "onBackPressed", "<init>", "()V", "Companion", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeActivityPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeActivityPager.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivityPager\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n+ 4 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n71#2,3:143\n41#3,6:146\n40#4,5:152\n1#5:157\n*S KotlinDebug\n*F\n+ 1 WelcomeActivityPager.kt\ncom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivityPager\n*L\n32#1:143,3\n36#1:146,6\n42#1:152,5\n*E\n"})
public final class WelcomeActivityPager extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "welcome-pager";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f34782s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f34783t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f34784u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f34785w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f34786x0;

    /* JADX INFO: compiled from: WelcomeActivityPager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/view/WelcomeActivityPager$Companion;", "", "()V", "ID", "", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeActivityPager.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34787a;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34787a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34787a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34787a;
        }

        public final int hashCode() {
            return this.f34787a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34787a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: WelcomeActivityPager.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(WelcomeActivityPager.this);
        }
    }

    /* JADX INFO: compiled from: WelcomeActivityPager.kt */
    public static final class c extends Lambda implements Function0<WelcomeActivityPager$welcomePagerListener$2$1> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager$welcomePagerListener$2$1] */
        @Override // kotlin.jvm.functions.Function0
        public final WelcomeActivityPager$welcomePagerListener$2$1 invoke() {
            final WelcomeActivityPager welcomeActivityPager = WelcomeActivityPager.this;
            return new WelcomePager.WelcomePagerListener() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager$welcomePagerListener$2$1
                @Override // com.bbva.component.ui.welcome.pager.WelcomePager.WelcomePagerListener
                public void onLastPage() {
                    CellsTextView cellsTextView = welcomeActivityPager.i().nextButton;
                    Intrinsics.checkNotNull(cellsTextView);
                    ViewExtensionsKt.show(cellsTextView, true);
                    cellsTextView.requestFocus();
                    cellsTextView.sendAccessibilityEvent(32768);
                }

                @Override // com.bbva.component.ui.welcome.pager.WelcomePager.WelcomePagerListener
                public void onPageChanged(int page) {
                }
            };
        }
    }

    /* JADX INFO: compiled from: WelcomeActivityPager.kt */
    public static final class d extends Lambda implements Function0<WelcomePagerViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WelcomePagerViewModel invoke() {
            return (WelcomePagerViewModel) ComponentManager.get(WelcomeActivityPager.this.hashCode(), String.valueOf(R.id.welcomePager));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeActivityPager() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f34782s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityWelcomePagerBinding>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityWelcomePagerBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityWelcomePagerBinding.inflate(layoutInflater);
            }
        });
        final b bVar = new b();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f34783t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WelcomeViewModel>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager$special$$inlined$viewModel$default$1
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
                Function0 function0 = bVar;
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
        this.f34784u0 = LazyKt__LazyJVMKt.lazy(new d());
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<AnalyticsManager>() { // from class: com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager$special$$inlined$inject$default$1
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
        this.f34786x0 = LazyKt__LazyJVMKt.lazy(new c());
    }

    public static final void access$loadWelcomeConfiguration(WelcomeActivityPager welcomeActivityPager, StartMode startMode) {
        welcomeActivityPager.getClass();
        String welcomeConfiguration = WelcomeConfigHelper.INSTANCE.getWelcomeConfiguration(startMode);
        if (welcomeConfiguration != null) {
            welcomeActivityPager.i().welcomePager.setMode(welcomeConfiguration);
        }
    }

    public static final void access$setConfigurationForLegacyAppUser(WelcomeActivityPager welcomeActivityPager) {
        ActionBar supportActionBar = welcomeActivityPager.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setHomeActionContentDescription(R.string.accesibility_back);
        }
        welcomeActivityPager.i().nextButton.setVisibility(4);
        welcomeActivityPager.i().welcomePager.setWelcomePagerListener((WelcomePager.WelcomePagerListener) welcomeActivityPager.f34786x0.getValue());
    }

    public final ActivityWelcomePagerBinding i() {
        return (ActivityWelcomePagerBinding) this.f34782s0.getValue();
    }

    public final WelcomeViewModel j() {
        return (WelcomeViewModel) this.f34783t0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f34785w0) {
            return;
        }
        j().onBackButtonClick();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        j().addViewModelAsComponent(hashCode());
        ((AnalyticsManager) this.v0.getValue()).trackEvent(AnalyticsEvent.WELCOME_SCREEN_PAGER);
        j().getWelcomeConfig().observe(this, new a(new la.d(this)));
        j().isUserFromLegacyApp().observe(this, new a(new e(this)));
        setSupportActionBar(i().welcomeToolbar);
        i().welcomeToolbar.inflateMenu(R.menu.slide_menu);
        ActionBar supportActionBar = getSupportActionBar();
        int i10 = 1;
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
            supportActionBar.setHomeActionContentDescription(R.string.accesibility_back);
        }
        i().nextButton.setOnClickListener(new u5.a(this, i10));
        Object value = this.f34784u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        WelcomePagerViewModel welcomePagerViewModel = (WelcomePagerViewModel) value;
        welcomePagerViewModel.setProperties(ViewComponentFactory.INSTANCE.welcomePager());
        welcomePagerViewModel.applyChanges();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return i().welcomeToolbar.onOptionsItemSelected(item);
        }
        j().onBackButtonClick();
        return true;
    }
}
