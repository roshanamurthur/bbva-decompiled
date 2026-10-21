package com.bbva.glomohybrid.infoscreen.optionlist;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.actionlauncher.AndroidActionLauncher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.base.webApp.WebAppConstants;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.databinding.ActivityOptionListBinding;
import com.bbva.glomohybrid.infoscreen.decorator.DividerItemDecorator;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.HeaderAdapter;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.OptionsAdapter;
import com.bbva.glomohybrid.infoscreen.optionlist.animations.NoFadeItemAnimator;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.bbva.ui.widget.BbvaTextView;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: compiled from: OptionListActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@FlowPreview
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "configureHeaderAdapter", "configureOptionsAdapter", "", "message", "bindToolbarTitle", "onCLoseButtonClicked", "onBackPressed", "finish", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel;", "t0", "Lkotlin/Lazy;", "getViewModel$info_modal_mexicoRelease", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel;", "viewModel", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/HeaderAdapter;", "w0", "getHeaderAdapter", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/HeaderAdapter;", "headerAdapter", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/OptionsAdapter;", "x0", "getOptionsAdapter", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/OptionsAdapter;", "optionsAdapter", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOptionListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionListActivity.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListActivity\n+ 2 ContextExtension.kt\ncom/bbva/glomohybrid/base/extensions/ContextExtensionKt\n+ 3 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 4 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n71#2,3:209\n40#3,5:212\n68#4,4:217\n120#5:221\n158#6:222\n1#7:223\n*S KotlinDebug\n*F\n+ 1 OptionListActivity.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListActivity\n*L\n45#1:209,3\n54#1:212,5\n117#1:217,4\n117#1:221\n117#1:222\n*E\n"})
public abstract class OptionListActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f32371s0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ActivityOptionListBinding>() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$special$$inlined$viewBinding$1
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ActivityOptionListBinding invoke() {
            LayoutInflater layoutInflater = this.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            return ActivityOptionListBinding.inflate(layoutInflater);
        }
    });

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f32373u0 = LazyKt__LazyJVMKt.lazy(c.f32378p0);

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy headerAdapter;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy optionsAdapter;

    /* JADX INFO: compiled from: OptionListActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListActivity$Companion;", "", "()V", "DEBOUNCE_CLICK_TIMEOUT", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class a extends Lambda implements Function0<HeaderAdapter> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32376p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final HeaderAdapter invoke() {
            return new HeaderAdapter();
        }
    }

    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class b extends Lambda implements Function0<OptionsAdapter> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f32377p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final OptionsAdapter invoke() {
            return new OptionsAdapter(null, 1, null);
        }
    }

    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class c extends Lambda implements Function0<Router> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f32378p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Router invoke() {
            return (Router) ComponentManager.get(Router.ID);
        }
    }

    /* JADX INFO: compiled from: OptionListActivity.kt */
    public static final class d extends Lambda implements Function0<OptionListViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OptionListViewModel invoke() {
            return new OptionListViewModel(new ViewModelComponentsProviders(OptionListActivity.this.hashCode()), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionListActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), qualifier, objArr);
            }
        });
        this.headerAdapter = LazyKt__LazyJVMKt.lazy(a.f32376p0);
        this.optionsAdapter = LazyKt__LazyJVMKt.lazy(b.f32377p0);
    }

    public static final void access$configureAccessibilityAtItemClose(OptionListActivity optionListActivity, ActionMenuItemView actionMenuItemView) {
        optionListActivity.getClass();
        ViewCompat.setAccessibilityDelegate(actionMenuItemView, new AccessibilityDelegateCompat() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$configureAccessibilityAtItemClose$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
            }
        });
    }

    public static final NavigateDispatcher access$getNavigateDispatcher(OptionListActivity optionListActivity) {
        return (NavigateDispatcher) optionListActivity.v0.getValue();
    }

    public static final Router access$getRouter(OptionListActivity optionListActivity) {
        Object value = optionListActivity.f32373u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Router) value;
    }

    public static final void access$navigateToAffiliate(OptionListActivity optionListActivity, OptionData optionData) {
        optionListActivity.getClass();
        String route = optionData.getRoute();
        if (route != null) {
            Object value = optionListActivity.f32373u0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            Router.navigate$default((Router) value, optionListActivity, route, null, (Bundle) ComponentCallbackExtKt.getKoin(optionListActivity).getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Bundle.class), QualifierKt.named(WebAppConstants.CUENTA_EN_LINEA_WEB_APP_BUNDLE), null), null, false, 52, null);
        }
    }

    public static final void access$navigateToRoute(OptionListActivity optionListActivity, OptionData optionData) {
        optionListActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(optionListActivity), null, null, new c9.b(optionData, optionListActivity, null), 3, null);
    }

    public static final void access$openDialer(OptionListActivity optionListActivity, String str) {
        optionListActivity.getClass();
        new AndroidActionLauncher(optionListActivity, null, 2, null).launchDialer(str);
    }

    public void bindToolbarTitle(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        i().toolbarTitleLabel.setText(message);
    }

    public abstract void configureHeaderAdapter();

    public abstract void configureOptionsAdapter();

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.slide_down_out);
    }

    @NotNull
    public final HeaderAdapter getHeaderAdapter() {
        return (HeaderAdapter) this.headerAdapter.getValue();
    }

    @NotNull
    public OptionsAdapter getOptionsAdapter() {
        return (OptionsAdapter) this.optionsAdapter.getValue();
    }

    @NotNull
    public final OptionListViewModel getViewModel$info_modal_mexicoRelease() {
        return (OptionListViewModel) this.viewModel.getValue();
    }

    public final ActivityOptionListBinding i() {
        return (ActivityOptionListBinding) this.f32371s0.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        getViewModel$info_modal_mexicoRelease().backPressed();
    }

    public void onCLoseButtonClicked() {
        finish();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        setSupportActionBar(i().errorScreenToolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(false);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
        i().closeMenuButton.setOnClickListener(new c9.a(this, 0));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.infoscreen.optionlist.b(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.infoscreen.optionlist.a(this, null));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.divider);
        DividerItemDecorator dividerItemDecorator = drawable != null ? new DividerItemDecorator(drawable) : null;
        if (dividerItemDecorator != null) {
            i().optionsListRecycler.addItemDecoration(dividerItemDecorator);
        }
        i().constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bbva.glomohybrid.infoscreen.optionlist.OptionListActivity$removeFocusItemCloseStartingView$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int i10 = R.id.action_close;
                OptionListActivity optionListActivity = this.f32380p0;
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) optionListActivity.findViewById(i10);
                if (actionMenuItemView != null) {
                    OptionListActivity.access$configureAccessibilityAtItemClose(optionListActivity, actionMenuItemView);
                    optionListActivity.i().constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                BbvaTextView toolbarTitleLabel = optionListActivity.i().toolbarTitleLabel;
                Intrinsics.checkNotNullExpressionValue(toolbarTitleLabel, "toolbarTitleLabel");
                ViewExtensionsKt.accessibilityFocus(toolbarTitleLabel);
            }
        });
        i().optionsListRecycler.setAdapter(new ConcatAdapter((RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{getHeaderAdapter(), getOptionsAdapter()}));
        i().optionsListRecycler.setItemAnimator(new NoFadeItemAnimator());
        configureHeaderAdapter();
        configureOptionsAdapter();
    }
}
