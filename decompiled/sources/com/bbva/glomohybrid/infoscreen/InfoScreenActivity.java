package com.bbva.glomohybrid.infoscreen;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.glomoconfig.factory.ViewComponentFactory;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.DefaultActivityRouter;
import com.bbva.glomohybrid.base.webview.WebActions;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.databinding.ActivityErrorScreenBinding;
import com.bbva.ui.widget.BbvaButton;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: InfoScreenActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0004R\u001b\u0010\u0017\u001a\u00020\u00128DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onPositiveButtonClicked", "onCloseScreenButtonClicked", "", "isHandledByDeepLink", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "event", "trackEvent", "onBackPressed", "finish", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "data", "setDataInfoScreen", "Lcom/bbva/glomohybrid/infoscreen/databinding/ActivityErrorScreenBinding;", "s0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/glomohybrid/infoscreen/databinding/ActivityErrorScreenBinding;", "binding", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenViewModel;", "v0", "getInfoScreenViewModel", "()Lcom/bbva/glomohybrid/infoscreen/InfoScreenViewModel;", "infoScreenViewModel", "", "getId", "()Ljava/lang/String;", "id", "getShowTitleLabel", "()Z", "showTitleLabel", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoScreenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoScreenActivity.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,186:1\n71#2,3:187\n41#3,6:190\n*S KotlinDebug\n*F\n+ 1 InfoScreenActivity.kt\ncom/bbva/glomohybrid/infoscreen/InfoScreenActivity\n*L\n31#1:187,3\n43#1:190,6\n*E\n"})
public abstract class InfoScreenActivity extends BaseActivity {

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32209t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f32210u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Lazy infoScreenViewModel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f32205w0 = new ActionSpec<>("positive-button");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f32206x0 = new ActionSpec<>("negative-button");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f32207y0 = new ActionSpec<>("close-button");

    @NotNull
    public static final ActionSpec<Void> E0 = new ActionSpec<>("back-button");

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity$Companion;", "", "()V", "ACTION_BACK_BUTTON", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "getACTION_BACK_BUTTON", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_CLOSE_BUTTON", "getACTION_CLOSE_BUTTON", "ACTION_NEGATIVE_BUTTON", "getACTION_NEGATIVE_BUTTON", "ACTION_POSITIVE_BUTTON", "", "getACTION_POSITIVE_BUTTON", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Void> getACTION_BACK_BUTTON() {
            return InfoScreenActivity.E0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_CLOSE_BUTTON() {
            return InfoScreenActivity.f32207y0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_NEGATIVE_BUTTON() {
            return InfoScreenActivity.f32206x0;
        }

        @NotNull
        public final ActionSpec<String> getACTION_POSITIVE_BUTTON() {
            return InfoScreenActivity.f32205w0;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public static final class a extends Lambda implements Function0<DefaultActivityRouter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DefaultActivityRouter invoke() {
            Object obj = ComponentManager.get(WebActions.ID);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return new DefaultActivityRouter(InfoScreenActivity.this, null, (WebController) obj);
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(InfoScreenActivity.this);
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public static final class c extends Lambda implements Function0<LoaderSpinnerViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            return (LoaderSpinnerViewModel) ComponentManager.get(InfoScreenActivity.this.hashCode(), String.valueOf(R.id.infoScreenSpinner));
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public d(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setToolbarTitleLabel", "setToolbarTitleLabel(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setToolbarTitleLabel((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public e(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setHeaderImage", "setHeaderImage(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setHeaderImage((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public f(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setTitleLabel", "setTitleLabel(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setTitleLabel((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public g(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setDescriptionLabel", "setDescriptionLabel(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setDescriptionLabel((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public h(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setPositiveButton", "setPositiveButton(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setPositiveButton((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenActivity.kt */
    public /* synthetic */ class i extends FunctionReferenceImpl implements Function1<PropertiesHelper.Property, Unit> {
        public i(Object obj) {
            super(1, obj, InfoScreenActivity.class, "setNegativeButton", "setNegativeButton(Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PropertiesHelper.Property property) {
            PropertiesHelper.Property p4 = property;
            Intrinsics.checkNotNullParameter(p4, "p0");
            InfoScreenActivity.access$setNegativeButton((InfoScreenActivity) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoScreenActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.binding = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ActivityErrorScreenBinding>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenActivity$special$$inlined$viewBinding$1
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
        this.f32209t0 = LazyKt__LazyJVMKt.lazy(new c());
        this.f32210u0 = LazyKt__LazyJVMKt.lazy(new a());
        final b bVar = new b();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.infoScreenViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InfoScreenViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.InfoScreenActivity$special$$inlined$viewModel$default$1
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
    }

    public static final ActivityRouter access$getActivityRouter(InfoScreenActivity infoScreenActivity) {
        return (ActivityRouter) infoScreenActivity.f32210u0.getValue();
    }

    public static final LoaderSpinnerViewModel access$getLoaderSpinnerViewModel(InfoScreenActivity infoScreenActivity) {
        Object value = infoScreenActivity.f32209t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LoaderSpinnerViewModel) value;
    }

    public static final void access$setDescriptionLabel(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        infoScreenActivity.getClass();
        infoScreenActivity.getBinding().headerDescription.setText(PropertiesHelper.loadString(infoScreenActivity, property));
    }

    public static final void access$setHeaderImage(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        PropertiesHelper.loadImage(infoScreenActivity.getBinding().headerImage, property);
    }

    public static final void access$setNegativeButton(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        infoScreenActivity.getClass();
        String strLoadString = PropertiesHelper.loadString(infoScreenActivity, property);
        BbvaButton bbvaButton = infoScreenActivity.getBinding().negativeButton;
        bbvaButton.setText(strLoadString);
        bbvaButton.setVisibility(0);
    }

    public static final void access$setPositiveButton(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        infoScreenActivity.getClass();
        String strLoadString = PropertiesHelper.loadString(infoScreenActivity, property);
        BbvaButton bbvaButton = infoScreenActivity.getBinding().positiveButton;
        bbvaButton.setText(strLoadString);
        bbvaButton.setVisibility(0);
    }

    public static final void access$setTitleLabel(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        infoScreenActivity.getClass();
        infoScreenActivity.getBinding().headerTitle.setText(PropertiesHelper.loadString(infoScreenActivity, property));
        infoScreenActivity.getBinding().headerTitle.setVisibility(infoScreenActivity.getShowTitleLabel() ? 0 : 8);
    }

    public static final void access$setToolbarTitleLabel(InfoScreenActivity infoScreenActivity, PropertiesHelper.Property property) {
        infoScreenActivity.getClass();
        infoScreenActivity.getBinding().toolbarTitleLabel.setText(PropertiesHelper.loadString(infoScreenActivity, property));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.slide_down_out);
    }

    @NotNull
    public final ActivityErrorScreenBinding getBinding() {
        return (ActivityErrorScreenBinding) this.binding.getValue();
    }

    @NotNull
    public abstract String getId();

    @NotNull
    public final InfoScreenViewModel getInfoScreenViewModel() {
        return (InfoScreenViewModel) this.infoScreenViewModel.getValue();
    }

    public boolean getShowTitleLabel() {
        return true;
    }

    public boolean isHandledByDeepLink() {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CellsReactor.fire$default(getId(), E0, null, 4, null);
    }

    public void onCloseScreenButtonClicked() {
        CellsReactor.fire$default(getId(), f32207y0, null, 4, null);
        finish();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String lastPathSegment;
        super.onCreate(savedInstanceState);
        setContentView(getBinding().getRoot());
        getInfoScreenViewModel().addViewModelAsComponent(hashCode());
        getInfoScreenViewModel().handleExtraData(getIntent().getExtras());
        getBinding().positiveButton.setOnClickListener(new w8.a(this, 0));
        getBinding().negativeButton.setOnClickListener(new w8.b(this, 0));
        getBinding().closeMenuButton.setOnClickListener(new s5.a(this, 2));
        if (isHandledByDeepLink()) {
            Uri data = getIntent().getData();
            if (data == null || (lastPathSegment = data.getLastPathSegment()) == null) {
                lastPathSegment = "";
            }
        } else {
            lastPathSegment = InfoScreenComponent.ID;
        }
        Object value = this.f32209t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LoaderSpinnerViewModel) value).setProperties(ViewComponentFactory.INSTANCE.loaderSpinner());
        InfoScreenComponent instance$info_modal_mexicoRelease = InfoScreenComponent.INSTANCE.getInstance$info_modal_mexicoRelease(this, lastPathSegment);
        observe(instance$info_modal_mexicoRelease.getObservableToolbarTitleLabel$info_modal_mexicoRelease(), new d(this));
        observe(instance$info_modal_mexicoRelease.getObservableHeaderImage$info_modal_mexicoRelease(), new e(this));
        observe(instance$info_modal_mexicoRelease.getObservableTitleLabel$info_modal_mexicoRelease(), new f(this));
        observe(instance$info_modal_mexicoRelease.getObservableDescriptionLabel$info_modal_mexicoRelease(), new g(this));
        observe(instance$info_modal_mexicoRelease.getObservablePositiveButton$info_modal_mexicoRelease(), new h(this));
        observe(instance$info_modal_mexicoRelease.getObservableNegativeButton$info_modal_mexicoRelease(), new i(this));
        setSupportActionBar(getBinding().errorScreenToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        observe(getInfoScreenViewModel().getLoaderSpinner(), new w8.c(this));
        observe(getInfoScreenViewModel().getScreenNavigation(), new w8.d(this));
    }

    public void onPositiveButtonClicked() {
        CellsReactor.fire$default(getId(), f32205w0, null, 4, null);
    }

    public final void setDataInfoScreen(@NotNull InfoScreenData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getBinding().errorScreenToolbar.setTitle(data.getToolbarTitle());
        getBinding().headerImage.setImageResource(data.getHeaderImage());
        getBinding().headerDescription.setText(data.getDescription());
        getBinding().positiveButton.setText(data.getPositiveButton());
        getBinding().positiveButton.setVisibility(0);
        getBinding().headerTitle.setText(data.getTitle());
        Integer negativeButton = data.getNegativeButton();
        if (negativeButton != null) {
            int iIntValue = negativeButton.intValue();
            getBinding().negativeButton.setVisibility(0);
            getBinding().negativeButton.setText(iIntValue);
        }
    }

    public void trackEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getInfoScreenViewModel().trackEvent(event);
    }
}
