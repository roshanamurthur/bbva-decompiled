package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.expandable.ExpandableWidgetHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    public static final int K0 = R.style.Widget_Design_FloatingActionButton;
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;

    @NonNull
    public final AppCompatImageHelper H0;

    @NonNull
    public final ExpandableWidgetHelper I0;
    public n J0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44663q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f44664r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44665s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f44666t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public ColorStateList f44667u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f44668w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f44669x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f44670y0;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Rect f44671p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public OnVisibilityChangedListener f44672q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f44673r0;

        public BaseBehavior() {
            this.f44673r0 = true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.f44673r0 && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f44671p0 == null) {
                this.f44671p0 = new Rect();
            }
            Rect rect = this.f44671p0;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.c(this.f44672q0, false);
            } else {
                floatingActionButton.f(this.f44672q0, false);
            }
            return true;
        }

        public final boolean b(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!(this.f44673r0 && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.c(this.f44672q0, false);
            } else {
                floatingActionButton.f(this.f44672q0, false);
            }
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.f44673r0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f44673r0 = z10;
        }

        @VisibleForTesting
        public void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f44672q0 = onVisibilityChangedListener;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.F0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams) || !(((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior)) {
                return false;
            }
            b(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior) && b(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i10);
            Rect rect = floatingActionButton.F0;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i11);
            }
            if (i13 == 0) {
                return true;
            }
            ViewCompat.offsetLeftAndRight(floatingActionButton, i13);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f44673r0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            super.onAttachedToLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z10) {
            super.setAutoHideEnabled(z10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @VisibleForTesting
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(OnVisibilityChangedListener onVisibilityChangedListener) {
            super.setInternalAutoHideListener(onVisibilityChangedListener);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Size {
    }

    public class a implements ShadowViewDelegate {
        public a() {
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public final float getRadius() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public final boolean isCompatPaddingEnabled() {
            return FloatingActionButton.this.E0;
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public final void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public final void setShadowPadding(int i10, int i11, int i12, int i13) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.F0.set(i10, i11, i12, i13);
            int i14 = floatingActionButton.f44669x0;
            floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
        }
    }

    public class b<T extends FloatingActionButton> implements j.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final TransformationCallback<T> f44675a;

        public b(TransformationCallback<T> transformationCallback) {
            this.f44675a = transformationCallback;
        }

        @Override // com.google.android.material.floatingactionbutton.j.e
        public final void a() {
            this.f44675a.onTranslationChanged(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.j.e
        public final void b() {
            this.f44675a.onScaleChanged(FloatingActionButton.this);
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof b) && ((b) obj).f44675a.equals(this.f44675a);
        }

        public final int hashCode() {
            return this.f44675a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private j getImpl() {
        if (this.J0 == null) {
            this.J0 = new n(this, new a());
        }
        return this.J0;
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        j impl = getImpl();
        if (impl.f44734t == null) {
            impl.f44734t = new ArrayList<>();
        }
        impl.f44734t.add(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        j impl = getImpl();
        if (impl.f44733s == null) {
            impl.f44733s = new ArrayList<>();
        }
        impl.f44733s.add(animatorListener);
    }

    public void addTransformationCallback(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        j impl = getImpl();
        b bVar = new b(transformationCallback);
        if (impl.f44735u == null) {
            impl.f44735u = new ArrayList<>();
        }
        impl.f44735u.add(bVar);
    }

    public final int b(int i10) {
        int i11 = this.f44668w0;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? b(1) : b(0);
    }

    public final void c(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, boolean z10) {
        j impl = getImpl();
        g gVar = onVisibilityChangedListener == null ? null : new g(this, onVisibilityChangedListener);
        if (impl.f44736v.getVisibility() == 0) {
            if (impl.f44732r == 1) {
                return;
            }
        } else if (impl.f44732r != 2) {
            return;
        }
        Animator animator = impl.f44727l;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton = impl.f44736v;
        if (!ViewCompat.isLaidOut(floatingActionButton) || floatingActionButton.isInEditMode()) {
            floatingActionButton.internalSetVisibility(z10 ? 8 : 4, z10);
            if (gVar != null) {
                gVar.f44707a.onHidden(gVar.f44708b);
                return;
            }
            return;
        }
        MotionSpec motionSpec = impl.f44728n;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, j.F, j.G, 0.4f, 0.4f);
        animatorSetB.addListener(new h(impl, z10, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f44734t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    public final void d(@NonNull Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.F0;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f44665s0;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f44666t0;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    public final void f(@Nullable OnVisibilityChangedListener onVisibilityChangedListener, boolean z10) {
        j impl = getImpl();
        g gVar = onVisibilityChangedListener == null ? null : new g(this, onVisibilityChangedListener);
        if (impl.f44736v.getVisibility() != 0) {
            if (impl.f44732r == 2) {
                return;
            }
        } else if (impl.f44732r != 1) {
            return;
        }
        Animator animator = impl.f44727l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.m == null;
        FloatingActionButton floatingActionButton = impl.f44736v;
        boolean z12 = ViewCompat.isLaidOut(floatingActionButton) && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.A;
        if (!z12) {
            floatingActionButton.internalSetVisibility(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f44730p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (gVar != null) {
                gVar.f44707a.onShown(gVar.f44708b);
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f6 = z11 ? 0.4f : 0.0f;
            impl.f44730p = f6;
            impl.a(f6, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        MotionSpec motionSpec = impl.m;
        AnimatorSet animatorSetB = motionSpec != null ? impl.b(motionSpec, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, j.D, j.E, 1.0f, 1.0f);
        animatorSetB.addListener(new i(impl, z10, gVar));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f44733s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f44663q0;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f44664r0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f44724i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f44725j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().f44720e;
    }

    @Deprecated
    public boolean getContentRect(@NonNull Rect rect) {
        if (!ViewCompat.isLaidOut(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        d(rect);
        return true;
    }

    @Px
    public int getCustomSize() {
        return this.f44668w0;
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
        return this.I0.getExpandedComponentIdHint();
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return getImpl().f44728n;
    }

    public void getMeasuredContentRect(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        d(rect);
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f44667u0;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f44667u0;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return (ShapeAppearanceModel) Preconditions.checkNotNull(getImpl().f44716a);
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return getImpl().m;
    }

    public int getSize() {
        return this.v0;
    }

    public int getSizeDimension() {
        return b(this.v0);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f44665s0;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f44666t0;
    }

    public boolean getUseCompatPadding() {
        return this.E0;
    }

    public void hide() {
        hide(null);
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
        return this.I0.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        j impl = getImpl();
        if (impl.f44736v.getVisibility() == 0) {
            if (impl.f44732r != 1) {
                return false;
            }
        } else if (impl.f44732r == 2) {
            return false;
        }
        return true;
    }

    public boolean isOrWillBeShown() {
        j impl = getImpl();
        if (impl.f44736v.getVisibility() != 0) {
            if (impl.f44732r != 2) {
                return false;
            }
        } else if (impl.f44732r == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j impl = getImpl();
        MaterialShapeDrawable materialShapeDrawable = impl.f44717b;
        FloatingActionButton floatingActionButton = impl.f44736v;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(floatingActionButton, materialShapeDrawable);
        }
        if (!(impl instanceof n)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new m(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f44736v.getViewTreeObserver();
        m mVar = impl.B;
        if (mVar != null) {
            viewTreeObserver.removeOnPreDrawListener(mVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f44669x0 = (sizeDimension - this.f44670y0) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.F0;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.I0.onRestoreInstanceState((Bundle) Preconditions.checkNotNull(extendableSavedState.extendableStates.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.extendableStates.put("expandableWidgetHelper", this.I0.onSaveInstanceState());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.G0;
            getMeasuredContentRect(rect);
            n nVar = this.J0;
            int i10 = -(nVar.f44721f ? Math.max((nVar.f44726k - nVar.f44736v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f44734t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f44733s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(@NonNull TransformationCallback<? extends FloatingActionButton> transformationCallback) {
        j impl = getImpl();
        b bVar = new b(transformationCallback);
        ArrayList<j.e> arrayList = impl.f44735u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bVar);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f44663q0 != colorStateList) {
            this.f44663q0 = colorStateList;
            j impl = getImpl();
            MaterialShapeDrawable materialShapeDrawable = impl.f44717b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintList(colorStateList);
            }
            c cVar = impl.f44719d;
            if (cVar != null) {
                if (colorStateList != null) {
                    cVar.m = colorStateList.getColorForState(cVar.getState(), cVar.m);
                }
                cVar.f44699p = colorStateList;
                cVar.f44697n = true;
                cVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f44664r0 != mode) {
            this.f44664r0 = mode;
            MaterialShapeDrawable materialShapeDrawable = getImpl().f44717b;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f6) {
        j impl = getImpl();
        if (impl.f44723h != f6) {
            impl.f44723h = f6;
            impl.k(f6, impl.f44724i, impl.f44725j);
        }
    }

    public void setCompatElevationResource(@DimenRes int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f6) {
        j impl = getImpl();
        if (impl.f44724i != f6) {
            impl.f44724i = f6;
            impl.k(impl.f44723h, f6, impl.f44725j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f6) {
        j impl = getImpl();
        if (impl.f44725j != f6) {
            impl.f44725j = f6;
            impl.k(impl.f44723h, impl.f44724i, f6);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f44668w0) {
            this.f44668w0 = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeDrawable materialShapeDrawable = getImpl().f44717b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f6);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f44721f) {
            getImpl().f44721f = z10;
            requestLayout();
        }
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean z10) {
        return this.I0.setExpanded(z10);
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.I0.setExpandedComponentIdHint(i10);
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().f44728n = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j impl = getImpl();
            float f6 = impl.f44730p;
            impl.f44730p = f6;
            Matrix matrix = impl.A;
            impl.a(f6, matrix);
            impl.f44736v.setImageMatrix(matrix);
            if (this.f44665s0 != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        this.H0.setImageResource(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.f44670y0 = i10;
        j impl = getImpl();
        if (impl.f44731q != i10) {
            impl.f44731q = i10;
            float f6 = impl.f44730p;
            impl.f44730p = f6;
            Matrix matrix = impl.A;
            impl.a(f6, matrix);
            impl.f44736v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@ColorInt int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f6) {
        super.setScaleX(f6);
        ArrayList<j.e> arrayList = getImpl().f44735u;
        if (arrayList != null) {
            Iterator<j.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f6) {
        super.setScaleY(f6);
        ArrayList<j.e> arrayList = getImpl().f44735u;
        if (arrayList != null) {
            Iterator<j.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z10) {
        j impl = getImpl();
        impl.f44722g = z10;
        impl.q();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().n(shapeAppearanceModel);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        getImpl().m = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f44668w0 = 0;
        if (i10 != this.v0) {
            this.v0 = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f44665s0 != colorStateList) {
            this.f44665s0 = colorStateList;
            e();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f44666t0 != mode) {
            this.f44666t0 = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f6) {
        super.setTranslationX(f6);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f6) {
        super.setTranslationY(f6);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f6) {
        super.setTranslationZ(f6);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
            getImpl().i();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().f44721f;
    }

    public void show() {
        show(null);
    }

    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void hide(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        c(onVisibilityChangedListener, true);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f44667u0 != colorStateList) {
            this.f44667u0 = colorStateList;
            getImpl().m(this.f44667u0);
        }
    }

    public void show(@Nullable OnVisibilityChangedListener onVisibilityChangedListener) {
        f(onVisibilityChangedListener, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = K0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.F0 = new Rect();
        this.G0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.FloatingActionButton, i10, i11, new int[0]);
        this.f44663q0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_backgroundTint);
        this.f44664r0 = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.f44667u0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_rippleColor);
        this.v0 = typedArrayObtainStyledAttributes.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.f44668w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_fabCustomSize, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.E0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_maxImageSize, 0));
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.FloatingActionButton_hideMotionSpec);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11, ShapeAppearanceModel.PILL).build();
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.H0 = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i10);
        this.I0 = new ExpandableWidgetHelper(this);
        getImpl().n(shapeAppearanceModelBuild);
        getImpl().g(this.f44663q0, this.f44664r0, this.f44667u0, dimensionPixelSize);
        getImpl().f44726k = dimensionPixelSize2;
        j impl = getImpl();
        if (impl.f44723h != dimension) {
            impl.f44723h = dimension;
            impl.k(dimension, impl.f44724i, impl.f44725j);
        }
        j impl2 = getImpl();
        if (impl2.f44724i != dimension2) {
            impl2.f44724i = dimension2;
            impl2.k(impl2.f44723h, dimension2, impl2.f44725j);
        }
        j impl3 = getImpl();
        if (impl3.f44725j != dimension3) {
            impl3.f44725j = dimension3;
            impl3.k(impl3.f44723h, impl3.f44724i, dimension3);
        }
        getImpl().m = motionSpecCreateFromAttribute;
        getImpl().f44728n = motionSpecCreateFromAttribute2;
        getImpl().f44721f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static abstract class OnVisibilityChangedListener {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
    }
}
