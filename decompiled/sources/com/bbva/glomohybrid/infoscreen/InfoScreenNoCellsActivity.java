package com.bbva.glomohybrid.infoscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import androidx.activity.ComponentActivity;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.databinding.ActivityErrorScreenBinding;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import n4.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import w5.f;
import w8.g;
import w8.h;

/* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8eX¤\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0014\u0010-\u001a\u00020*8$X¤\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0016\u00101\u001a\u0004\u0018\u00010 8$X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\"¨\u00064"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenNoCellsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "event", "", "handleEvent", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "trackEvent", "Landroid/view/Menu;", "menu", "", "onPrepareOptionsMenu", "Lcom/bbva/glomohybrid/infoscreen/databinding/ActivityErrorScreenBinding;", "p0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/glomohybrid/infoscreen/databinding/ActivityErrorScreenBinding;", "binding", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenViewModel;", "q0", "getInfoScreenViewModel", "()Lcom/bbva/glomohybrid/infoscreen/InfoScreenViewModel;", "infoScreenViewModel", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "s0", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "getStyle", "()Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Style;", "style", "", "getToolbarTitle", "()Ljava/lang/String;", "toolbarTitle", "", "getHeaderImage", "()I", "headerImage", "getTitleLabel", "titleLabel", "", "getDescriptionLabel", "()Ljava/lang/CharSequence;", "descriptionLabel", "getPositiveButtonText", "positiveButtonText", "getNegativeButtonText", "negativeButtonText", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoScreenNoCellsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoScreenNoCellsActivity.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenNoCellsActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,139:1\n71#2,3:140\n41#3,6:143\n*S KotlinDebug\n*F\n+ 1 InfoScreenNoCellsActivity.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenNoCellsActivity\n*L\n25#1:140,3\n29#1:143,6\n*E\n"})
public abstract class InfoScreenNoCellsActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f32226t0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy infoScreenViewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f32229r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final InfoScreenContract.Style.StyleDefault f32230s0;

    /* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
    public static final class a extends Lambda implements Function0<DefaultActivityRouter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(InfoScreenNoCellsActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(InfoScreenNoCellsActivity.this);
        }
    }

    /* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
    public static final class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f32233a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f32233a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f32233a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f32233a;
        }

        public final int hashCode() {
            return this.f32233a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32233a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoScreenNoCellsActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.binding = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityErrorScreenBinding>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity$special$$inlined$viewBinding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ActivityErrorScreenBinding invoke() {
                LayoutInflater layoutInflater = this.getLayoutInflater();
                Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
                return ActivityErrorScreenBinding.inflate(layoutInflater);
            }
        });
        final b bVar = new b();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.infoScreenViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InfoScreenViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.InfoScreenViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InfoScreenViewModel invoke() {
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
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.f32229r0 = LazyKt__LazyJVMKt.lazy(new a());
        this.f32230s0 = InfoScreenContract.Style.StyleDefault.INSTANCE;
    }

    public static final ActivityRouter access$getActivityRouter(InfoScreenNoCellsActivity infoScreenNoCellsActivity) {
        return (ActivityRouter) infoScreenNoCellsActivity.f32229r0.getValue();
    }

    @NotNull
    public final ActivityErrorScreenBinding getBinding() {
        return (ActivityErrorScreenBinding) this.binding.getValue();
    }

    @NotNull
    public abstract CharSequence getDescriptionLabel();

    @DrawableRes
    public abstract int getHeaderImage();

    @NotNull
    public final InfoScreenViewModel getInfoScreenViewModel() {
        return (InfoScreenViewModel) this.infoScreenViewModel.getValue();
    }

    @Nullable
    public abstract String getNegativeButtonText();

    @Nullable
    public abstract String getPositiveButtonText();

    @NotNull
    public InfoScreenContract.Style getStyle() {
        return this.f32230s0;
    }

    @NotNull
    public abstract String getTitleLabel();

    @NotNull
    public abstract String getToolbarTitle();

    public abstract void handleEvent(@NotNull InfoScreenContract.Event event);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Unit unit;
        super.onCreate(savedInstanceState);
        setContentView(getBinding().getRoot());
        getInfoScreenViewModel().handleExtraData(getIntent().getExtras());
        getBinding().positiveButton.setOnClickListener(new k(this, 2));
        getBinding().negativeButton.setOnClickListener(new f(this, 1));
        getBinding().closeMenuButton.setOnClickListener(new w8.f(this, 0));
        String str = ViewComponentFactory.INSTANCE.loaderSpinner().get("lotie");
        if (str != null) {
            getBinding().infoScreenSpinner.setConfig(str);
        }
        getBinding().toolbarTitleLabel.setText(getToolbarTitle());
        setSupportActionBar(getBinding().errorScreenToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        getBinding().headerImage.setImageResource(getHeaderImage());
        String positiveButtonText = getPositiveButtonText();
        Unit unit2 = null;
        if (positiveButtonText != null) {
            getBinding().positiveButton.setText(positiveButtonText);
            getBinding().positiveButton.setVisibility(0);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            getBinding().positiveButton.setVisibility(8);
        }
        String negativeButtonText = getNegativeButtonText();
        if (negativeButtonText != null) {
            getBinding().negativeButton.setText(negativeButtonText);
            getBinding().negativeButton.setVisibility(0);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            getBinding().negativeButton.setVisibility(8);
        }
        getBinding().headerTitle.setText(getTitleLabel());
        getBinding().headerDescription.setText(getDescriptionLabel());
        getInfoScreenViewModel().getLoaderSpinner().observe(this, new c(new g(this)));
        getInfoScreenViewModel().getScreenNavigation().observe(this, new c(new h(this)));
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        menu.findItem(R.id.action_close);
        ResourcesCompat.getDrawable(getResources(), R.drawable.ic_close_18, getTheme());
        return true;
    }

    public void trackEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getInfoScreenViewModel().trackEvent(event);
    }
}
