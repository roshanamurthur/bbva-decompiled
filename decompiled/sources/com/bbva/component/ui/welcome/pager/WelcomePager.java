package com.bbva.component.ui.welcome.pager;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import c6.d;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.cellswidgets.ThemeUtilsKt;
import com.bbva.component.ui.welcome.R;
import com.bbva.component.ui.welcome.databinding.ComponentWelcomePagerBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomePager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u0019B+\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u001bJ\"\u0010\b\u001a\u00020\u00072\u001a\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002J\"\u0010\n\u001a\u00020\u00072\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomePager;", "Landroid/widget/LinearLayout;", "", "", "", "", WelcomePagerViewModel.MODE_LIST, "", "setupModes", "pagesList", "setupPages", "Lcom/bbva/component/ui/welcome/pager/WelcomePager$WelcomePagerListener;", "welcomePagerListener", "setWelcomePagerListener", "mode", "setMode", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "WelcomePagerListener", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomePager extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WelcomePagerViewModel f28840p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final d f28841q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public WelcomePagerListener f28842r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ComponentWelcomePagerBinding f28843s0;

    /* JADX INFO: compiled from: WelcomePager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomePager$WelcomePagerListener;", "", "onLastPage", "", "onPageChanged", "page", "", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
    public interface WelcomePagerListener {
        void onLastPage();

        void onPageChanged(int page);
    }

    /* JADX INFO: compiled from: WelcomePager.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public a(WelcomePager welcomePager) {
            super(1, welcomePager, WelcomePager.class, "onPageSelected", "onPageSelected(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ((WelcomePager) this.receiver).b(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: WelcomePager.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(WelcomePager welcomePager) {
            super(0, welcomePager, WelcomePager.class, "moveToNextPage", "moveToNextPage()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WelcomePager.access$moveToNextPage((WelcomePager) this.receiver);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePager(@NotNull Context context) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager));
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28841q0 = new d(new b(this));
        ComponentWelcomePagerBinding componentWelcomePagerBindingInflate = ComponentWelcomePagerBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomePagerBindingInflate, "ComponentWelcomePagerBin…ater.from(context), this)");
        this.f28843s0 = componentWelcomePagerBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomePagerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…gerViewModel::class.java)");
        WelcomePagerViewModel welcomePagerViewModel = (WelcomePagerViewModel) viewModelOf;
        this.f28840p0 = welcomePagerViewModel;
        componentWelcomePagerBindingInflate.pageIndicator.initialize$component_ui_welcome_release(welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.initialize$component_ui_welcome_release(welcomePagerViewModel);
        WelcomePagerDynamicPropertyBinder.a(this, welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.setOnSelectPageListener(new a(this));
    }

    public static final void access$moveToNextPage(WelcomePager welcomePager) {
        WelcomeViewPager welcomeViewPager = welcomePager.f28843s0.viewPager;
        if (welcomeViewPager.getAdapter().getCount() != 0) {
            welcomeViewPager.moveToNextItem$component_ui_welcome_release();
            welcomePager.c();
        }
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WelcomePager, i10, i11);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…    defStyleRes\n        )");
        this.f28840p0.setupGlobalConfig$component_ui_welcome_release(typedArrayObtainStyledAttributes.getBoolean(R.styleable.WelcomePager_welcomePager_autoMovement, false), typedArrayObtainStyledAttributes.getInteger(R.styleable.WelcomePager_welcomePager_movementDelay, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(int i10) {
        WelcomePagerListener welcomePagerListener;
        ComponentWelcomePagerBinding componentWelcomePagerBinding = this.f28843s0;
        componentWelcomePagerBinding.pageIndicator.setSelectedPage(i10);
        removeCallbacks(this.f28841q0);
        c();
        WelcomePagerListener welcomePagerListener2 = this.f28842r0;
        if (welcomePagerListener2 != null) {
            welcomePagerListener2.onPageChanged(i10);
        }
        if (i10 != componentWelcomePagerBinding.pageIndicator.getNumPages() - 1 || (welcomePagerListener = this.f28842r0) == null) {
            return;
        }
        welcomePagerListener.onLastPage();
    }

    public final void c() {
        WelcomePagerViewModel welcomePagerViewModel = this.f28840p0;
        if (welcomePagerViewModel.shouldMove$component_ui_welcome_release()) {
            postDelayed(this.f28841q0, welcomePagerViewModel.delay$component_ui_welcome_release());
        }
    }

    public final void setMode(@NotNull String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        WelcomePagerViewModel welcomePagerViewModel = this.f28840p0;
        if (welcomePagerViewModel.getCurrentMode$component_ui_welcome_release().getValue() != null) {
            return;
        }
        welcomePagerViewModel.setMode$component_ui_welcome_release(mode);
        this.f28843s0.viewPager.setCurrentItem(0, false);
        b(0);
    }

    public final void setWelcomePagerListener(@NotNull WelcomePagerListener welcomePagerListener) {
        Intrinsics.checkNotNullParameter(welcomePagerListener, "welcomePagerListener");
        this.f28842r0 = welcomePagerListener;
    }

    public final void setupModes(@NotNull List<? extends Map<String, ? extends Object>> modeList) {
        Intrinsics.checkNotNullParameter(modeList, "modeList");
        List<? extends Map<String, ? extends Object>> list = modeList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Mode((Map<String, ? extends Object>) it.next()));
        }
        this.f28840p0.setModeList$component_ui_welcome_release(arrayList);
    }

    public final void setupPages(@NotNull List<? extends Map<String, ? extends Object>> pagesList) {
        Intrinsics.checkNotNullParameter(pagesList, "pagesList");
        List<? extends Map<String, ? extends Object>> list = pagesList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Page((Map<String, ? extends Object>) it.next()));
        }
        this.f28840p0.setPageList$component_ui_welcome_release(arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28841q0 = new d(new b(this));
        ComponentWelcomePagerBinding componentWelcomePagerBindingInflate = ComponentWelcomePagerBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomePagerBindingInflate, "ComponentWelcomePagerBin…ater.from(context), this)");
        this.f28843s0 = componentWelcomePagerBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomePagerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…gerViewModel::class.java)");
        WelcomePagerViewModel welcomePagerViewModel = (WelcomePagerViewModel) viewModelOf;
        this.f28840p0 = welcomePagerViewModel;
        componentWelcomePagerBindingInflate.pageIndicator.initialize$component_ui_welcome_release(welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.initialize$component_ui_welcome_release(welcomePagerViewModel);
        WelcomePagerDynamicPropertyBinder.a(this, welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.setOnSelectPageListener(new a(this));
        a(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, 0, 0);
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28841q0 = new d(new b(this));
        ComponentWelcomePagerBinding componentWelcomePagerBindingInflate = ComponentWelcomePagerBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomePagerBindingInflate, "ComponentWelcomePagerBin…ater.from(context), this)");
        this.f28843s0 = componentWelcomePagerBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomePagerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…gerViewModel::class.java)");
        WelcomePagerViewModel welcomePagerViewModel = (WelcomePagerViewModel) viewModelOf;
        this.f28840p0 = welcomePagerViewModel;
        componentWelcomePagerBindingInflate.pageIndicator.initialize$component_ui_welcome_release(welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.initialize$component_ui_welcome_release(welcomePagerViewModel);
        WelcomePagerDynamicPropertyBinder.a(this, welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.setOnSelectPageListener(new a(this));
        a(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, i10, 0);
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public WelcomePager(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28841q0 = new d(new b(this));
        ComponentWelcomePagerBinding componentWelcomePagerBindingInflate = ComponentWelcomePagerBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomePagerBindingInflate, "ComponentWelcomePagerBin…ater.from(context), this)");
        this.f28843s0 = componentWelcomePagerBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomePagerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…gerViewModel::class.java)");
        WelcomePagerViewModel welcomePagerViewModel = (WelcomePagerViewModel) viewModelOf;
        this.f28840p0 = welcomePagerViewModel;
        componentWelcomePagerBindingInflate.pageIndicator.initialize$component_ui_welcome_release(welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.initialize$component_ui_welcome_release(welcomePagerViewModel);
        WelcomePagerDynamicPropertyBinder.a(this, welcomePagerViewModel);
        componentWelcomePagerBindingInflate.viewPager.setOnSelectPageListener(new a(this));
        a(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, i10, i11);
        c();
    }
}
