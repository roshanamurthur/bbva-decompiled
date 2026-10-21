package com.bbva.ui.component.menu.view.recycler.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.databinding.ViewShadowBinding;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShadowView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView;", "Landroid/widget/FrameLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$AttachedBehavior;", "Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView$Behavior;", "getBehavior", "", "reset", "Lcom/bbva/ui/component/menu/databinding/ViewShadowBinding;", "p0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/ui/component/menu/databinding/ViewShadowBinding;", "binding", "", "<set-?>", "triangleHeight", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTriangleHeight", "()I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Behavior", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public final class ShadowView extends FrameLayout implements CoordinatorLayout.AttachedBehavior {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: compiled from: ShadowView.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J8\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016JH\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\"\u0010\u001d\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView$Behavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/bbva/ui/component/menu/view/recycler/item/ShadowView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/View;", "dependency", "", "layoutDependsOn", "coordinatorLayout", "directTargetChild", "target", "", "axes", "type", "onStartNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "", "onNestedScroll", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnconsumedPixels$component_ui_menu_release", "()I", "setUnconsumedPixels$component_ui_menu_release", "(I)V", "unconsumedPixels", "<init>", "()V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    public static final class Behavior extends CoordinatorLayout.Behavior<ShadowView> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int unconsumedPixels;

        /* JADX INFO: renamed from: getUnconsumedPixels$component_ui_menu_release, reason: from getter */
        public final int getUnconsumedPixels() {
            return this.unconsumedPixels;
        }

        public final void setUnconsumedPixels$component_ui_menu_release(int i10) {
            this.unconsumedPixels = i10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull ShadowView child, @NotNull View dependency) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            return super.layoutDependsOn(parent, child, dependency) || (dependency instanceof MenuRecyclerView);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ShadowView child, @NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(target, "target");
            super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
            int i10 = child.getLayoutParams().height - dyConsumed;
            int i11 = this.unconsumedPixels + i10;
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            if (i11 >= 0) {
                this.unconsumedPixels = 0;
            } else {
                this.unconsumedPixels += i10;
                i11 = 0;
            }
            layoutParams.height = i11;
            child.requestLayout();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull ShadowView child, @NotNull View directTargetChild, @NotNull View target, int axes, int type) {
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
            Intrinsics.checkNotNullParameter(target, "target");
            return axes == 2 || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes, type);
        }
    }

    /* JADX INFO: compiled from: ShadowView.kt */
    public static final class a extends Lambda implements Function0<ViewShadowBinding> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f37029p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ShadowView f37030q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ShadowView shadowView) {
            super(0);
            this.f37029p0 = context;
            this.f37030q0 = shadowView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewShadowBinding invoke() {
            return ViewShadowBinding.inflate(LayoutInflater.from(this.f37029p0), this.f37030q0, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShadowView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ViewShadowBinding getBinding() {
        return (ViewShadowBinding) this.binding.getValue();
    }

    public final int getTriangleHeight() {
        return getBinding().triangleView.getHeight();
    }

    public final void reset() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        Behavior behavior = (Behavior) ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior == null) {
            return;
        }
        behavior.setUnconsumedPixels$component_ui_menu_release(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShadowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    public Behavior getBehavior() {
        return new Behavior();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShadowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShadowView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShadowView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a(context, this));
    }
}
