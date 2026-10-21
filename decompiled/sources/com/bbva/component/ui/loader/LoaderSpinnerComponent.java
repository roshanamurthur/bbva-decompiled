package com.bbva.component.ui.loader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.cellswidgets.ThemeUtilsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l5.a;
import l5.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoaderSpinnerComponent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/ui/loader/LoaderSpinnerComponent;", "Landroid/widget/FrameLayout;", "", "lottie", "", "setConfig", "showSpinner", "hideSpinner", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "component-ui-loader-spinner_release"}, k = 1, mv = {1, 4, 0})
public final class LoaderSpinnerComponent extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LifecycleOwner f28428p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public HashMap f28429q0;

    public /* synthetic */ LoaderSpinnerComponent(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.f28429q0;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i10) {
        if (this.f28429q0 == null) {
            this.f28429q0 = new HashMap();
        }
        View view = (View) this.f28429q0.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f28429q0.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    public final void hideSpinner() {
        ((LottieAnimationView) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.spinner)).cancelAnimation();
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.content);
        frameLayout.setVisibility(8);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
    }

    public final void setConfig(@NotNull String lottie) {
        ((LottieAnimationView) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.spinner)).setAnimation(lottie);
        FrameLayout content = (FrameLayout) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.content);
        Intrinsics.checkExpressionValueIsNotNull(content, "content");
        content.setVisibility(8);
    }

    public final void showSpinner() {
        ((LottieAnimationView) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.spinner)).playAnimation();
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(com.bbva.component.ui.loader.spinner.R.id.content);
        frameLayout.setVisibility(0);
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
    }

    public LoaderSpinnerComponent(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(ThemeUtilsKt.withDefaultStyle(context, com.bbva.component.ui.loader.spinner.R.style.GloMo), attributeSet);
        LifecycleOwner owner = ContextHelper.getOwner(context);
        Intrinsics.checkExpressionValueIsNotNull(owner, "ContextHelper.getOwner(context)");
        this.f28428p0 = owner;
        View.inflate(context, com.bbva.component.ui.loader.spinner.R.layout.view_loading, this);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), context, LoaderSpinnerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModelOf, "CellsViewModelProviders.…nerViewModel::class.java)");
        LoaderSpinnerViewModel loaderSpinnerViewModel = (LoaderSpinnerViewModel) viewModelOf;
        loaderSpinnerViewModel.newProperty("lottie").observe(ContextHelper.getOwner(getContext()), new b(this, 0));
        loaderSpinnerViewModel.getShowSpinner().observe(owner, new a(this));
    }
}
