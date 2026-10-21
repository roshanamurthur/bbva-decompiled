package com.bbva.component.ui.welcome.pager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.property.UIComponentConfigurator;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.component.ui.welcome.databinding.LayoutWelcomePageBinding;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomePageLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0018\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u001eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomePageLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/bbva/component/ui/welcome/pager/Page;", "page", "", "pageIndex", "", "setPage", "onPageVisible", "onPageHidden", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPageIndex$component_ui_welcome_release", "()I", "setPageIndex$component_ui_welcome_release", "(I)V", "Lcom/bbva/component/ui/welcome/databinding/LayoutWelcomePageBinding;", "r0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/component/ui/welcome/databinding/LayoutWelcomePageBinding;", "binding", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomePageLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Page f28836p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int pageIndex;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final Lazy binding;

    /* JADX INFO: compiled from: WelcomePageLayout.kt */
    public static final class a extends Lambda implements Function0<LayoutWelcomePageBinding> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutWelcomePageBinding invoke() {
            LayoutWelcomePageBinding layoutWelcomePageBindingBind = LayoutWelcomePageBinding.bind(WelcomePageLayout.this);
            Intrinsics.checkNotNullExpressionValue(layoutWelcomePageBindingBind, "LayoutWelcomePageBinding.bind(this)");
            return layoutWelcomePageBindingBind;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePageLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final /* synthetic */ Page access$getPage$p(WelcomePageLayout welcomePageLayout) {
        Page page = welcomePageLayout.f28836p0;
        if (page == null) {
            Intrinsics.throwUninitializedPropertyAccessException("page");
        }
        return page;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutWelcomePageBinding getBinding() {
        return (LayoutWelcomePageBinding) this.binding.getValue();
    }

    /* JADX INFO: renamed from: getPageIndex$component_ui_welcome_release, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final void onPageHidden() {
        if (access$getPage$p(this).getLottie() != null) {
            LottieAnimationView lottieAnimationView = getBinding().lottieView;
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    public final void onPageVisible() {
        if (access$getPage$p(this).getLottie() != null) {
            LottieAnimationView lottieAnimationView = getBinding().lottieView;
            if (lottieAnimationView.isAnimating()) {
                return;
            }
            lottieAnimationView.setProgress(0.0f);
            lottieAnimationView.setSpeed(Math.abs(lottieAnimationView.getSpeed()));
            lottieAnimationView.playAnimation();
        }
    }

    public final void setPage(@NotNull Page page, int pageIndex) {
        Double loopCount;
        Intrinsics.checkNotNullParameter(page, "page");
        this.f28836p0 = page;
        this.pageIndex = pageIndex;
        PropertiesHelper.Property image = access$getPage$p(this).getImage();
        if (image != null) {
            CellsImageView cellsImageView = getBinding().imageView;
            PropertiesHelper.loadImage(cellsImageView, image);
            cellsImageView.setVisibility(0);
            PropertiesHelper.Property accessibility = page.getAccessibility();
            cellsImageView.setContentDescription(accessibility != null ? PropertiesHelper.loadString(cellsImageView.getContext(), accessibility) : null);
        }
        String lottie = access$getPage$p(this).getLottie();
        if (lottie != null) {
            LottieAnimationView lottieAnimationView = getBinding().lottieView;
            lottieAnimationView.setAnimation(lottie);
            PropertiesHelper.Property accessibility2 = page.getAccessibility();
            lottieAnimationView.setContentDescription(accessibility2 != null ? PropertiesHelper.loadString(lottieAnimationView.getContext(), accessibility2) : null);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setProgress(0.0f);
            LottieConfig lottieConfig = page.getLottieConfig();
            if (lottieConfig != null && (loopCount = lottieConfig.getLoopCount()) != null) {
                loopCount.doubleValue();
                Double loopCount2 = page.getLottieConfig().getLoopCount();
                lottieAnimationView.setRepeatCount(loopCount2 != null ? (int) loopCount2.doubleValue() : 0);
            }
        }
        if (page.getFullScreen()) {
            getBinding().guideline.setGuidelinePercent(1);
        } else {
            UIComponentConfigurator.configureView(getContext(), getBinding().titleTextView, page.getTitle());
            UIComponentConfigurator.configureView(getContext(), getBinding().descriptionTextView, page.getDescription());
        }
    }

    public final void setPageIndex$component_ui_welcome_release(int i10) {
        this.pageIndex = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePageLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomePageLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a());
    }
}
