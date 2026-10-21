package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.g0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    public static final int Z0 = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final c f44646a1 = new c(Float.class, "width");

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final d f44647b1 = new d(Float.class, "height");

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final e f44648c1 = new e(Float.class, "paddingStart");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final f f44649d1 = new f(Float.class, "paddingEnd");
    public int L0;

    @NonNull
    public final g M0;

    @NonNull
    public final g N0;
    public final i O0;
    public final h P0;
    public final int Q0;
    public int R0;
    public int S0;

    @NonNull
    public final ExtendedFloatingActionButtonBehavior T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public int X0;
    public int Y0;

    @NonNull
    protected ColorStateList originalTextCsl;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Rect f44650p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f44651q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f44652r0;

        public ExtendedFloatingActionButtonBehavior() {
            this.f44651q0 = false;
            this.f44652r0 = true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f44651q0 && !this.f44652r0) || layoutParams.getAnchorId() != appBarLayout.getId()) {
                return false;
            }
            if (this.f44650p0 == null) {
                this.f44650p0 = new Rect();
            }
            Rect rect = this.f44650p0;
            DescendantOffsetUtils.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public final boolean b(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f44651q0 && !this.f44652r0) || layoutParams.getAnchorId() != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                shrinkOrHide(extendedFloatingActionButton);
                return true;
            }
            extendOrShow(extendedFloatingActionButton);
            return true;
        }

        public void extendOrShow(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i10 = this.f44652r0 ? 3 : 0;
            int i11 = ExtendedFloatingActionButton.Z0;
            extendedFloatingActionButton.j(i10, null);
        }

        public boolean isAutoHideEnabled() {
            return this.f44651q0;
        }

        public boolean isAutoShrinkEnabled() {
            return this.f44652r0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f44651q0 = z10;
        }

        public void setAutoShrinkEnabled(boolean z10) {
            this.f44652r0 = z10;
        }

        public void shrinkOrHide(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i10 = this.f44652r0 ? 2 : 1;
            int i11 = ExtendedFloatingActionButton.Z0;
            extendedFloatingActionButton.j(i10, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams) || !(((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior)) {
                return false;
            }
            b(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = dependencies.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior) && b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i10);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f44651q0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f44652r0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class a implements j {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public final int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public final ViewGroup.LayoutParams b() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public final int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.j
        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f44655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OnChangedCallback f44656c;

        public b(com.google.android.material.floatingactionbutton.b bVar, OnChangedCallback onChangedCallback) {
            this.f44655b = bVar;
            this.f44656c = onChangedCallback;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f44654a = true;
            this.f44655b.c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o oVar = this.f44655b;
            oVar.onAnimationEnd();
            if (this.f44654a) {
                return;
            }
            oVar.f(this.f44656c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f44655b.onAnimationStart(animator);
            this.f44654a = false;
        }
    }

    public class c extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f6) {
            View view2 = view;
            view2.getLayoutParams().width = f6.intValue();
            view2.requestLayout();
        }
    }

    public class d extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f6) {
            View view2 = view;
            view2.getLayoutParams().height = f6.intValue();
            view2.requestLayout();
        }
    }

    public class e extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingStart(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f6) {
            View view2 = view;
            ViewCompat.setPaddingRelative(view2, f6.intValue(), view2.getPaddingTop(), ViewCompat.getPaddingEnd(view2), view2.getPaddingBottom());
        }
    }

    public class f extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingEnd(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f6) {
            View view2 = view;
            ViewCompat.setPaddingRelative(view2, ViewCompat.getPaddingStart(view2), view2.getPaddingTop(), f6.intValue(), view2.getPaddingBottom());
        }
    }

    public class g extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j f44657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f44658h;

        public g(com.google.android.material.floatingactionbutton.a aVar, j jVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f44657g = jVar;
            this.f44658h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void a() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z10 = this.f44658h;
            extendedFloatingActionButton.U0 = z10;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z10) {
                extendedFloatingActionButton.X0 = layoutParams.width;
                extendedFloatingActionButton.Y0 = layoutParams.height;
            }
            j jVar = this.f44657g;
            layoutParams.width = jVar.b().width;
            layoutParams.height = jVar.b().height;
            ViewCompat.setPaddingRelative(extendedFloatingActionButton, jVar.c(), extendedFloatingActionButton.getPaddingTop(), jVar.a(), extendedFloatingActionButton.getPaddingBottom());
            extendedFloatingActionButton.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final boolean b() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return this.f44658h == extendedFloatingActionButton.U0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final int d() {
            return this.f44658h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.o
        @NonNull
        public final AnimatorSet e() {
            MotionSpec motionSpec = this.f44683f;
            if (motionSpec == null) {
                if (this.f44682e == null) {
                    this.f44682e = MotionSpec.createFromResource(this.f44678a, d());
                }
                motionSpec = (MotionSpec) Preconditions.checkNotNull(this.f44682e);
            }
            boolean zHasPropertyValues = motionSpec.hasPropertyValues("width");
            j jVar = this.f44657g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (zHasPropertyValues) {
                PropertyValuesHolder[] propertyValues = motionSpec.getPropertyValues("width");
                propertyValues[0].setFloatValues(extendedFloatingActionButton.getWidth(), jVar.getWidth());
                motionSpec.setPropertyValues("width", propertyValues);
            }
            if (motionSpec.hasPropertyValues("height")) {
                PropertyValuesHolder[] propertyValues2 = motionSpec.getPropertyValues("height");
                propertyValues2[0].setFloatValues(extendedFloatingActionButton.getHeight(), jVar.getHeight());
                motionSpec.setPropertyValues("height", propertyValues2);
            }
            if (motionSpec.hasPropertyValues("paddingStart")) {
                PropertyValuesHolder[] propertyValues3 = motionSpec.getPropertyValues("paddingStart");
                propertyValues3[0].setFloatValues(ViewCompat.getPaddingStart(extendedFloatingActionButton), jVar.c());
                motionSpec.setPropertyValues("paddingStart", propertyValues3);
            }
            if (motionSpec.hasPropertyValues("paddingEnd")) {
                PropertyValuesHolder[] propertyValues4 = motionSpec.getPropertyValues("paddingEnd");
                propertyValues4[0].setFloatValues(ViewCompat.getPaddingEnd(extendedFloatingActionButton), jVar.a());
                motionSpec.setPropertyValues("paddingEnd", propertyValues4);
            }
            if (motionSpec.hasPropertyValues("labelOpacity")) {
                PropertyValuesHolder[] propertyValues5 = motionSpec.getPropertyValues("labelOpacity");
                boolean z10 = this.f44658h;
                propertyValues5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                motionSpec.setPropertyValues("labelOpacity", propertyValues5);
            }
            return g(motionSpec);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void f(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback == null) {
                return;
            }
            boolean z10 = this.f44658h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (z10) {
                onChangedCallback.onExtended(extendedFloatingActionButton);
            } else {
                onChangedCallback.onShrunken(extendedFloatingActionButton);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationEnd() {
            this.f44681d.f44677a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.V0 = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            j jVar = this.f44657g;
            layoutParams.width = jVar.b().width;
            layoutParams.height = jVar.b().height;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationStart(Animator animator) {
            com.google.android.material.floatingactionbutton.a aVar = this.f44681d;
            Animator animator2 = aVar.f44677a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f44677a = animator;
            boolean z10 = this.f44658h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.U0 = z10;
            extendedFloatingActionButton.V0 = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    public class h extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f44660g;

        public h(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final boolean b() {
            int i10 = ExtendedFloatingActionButton.Z0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.L0 != 1) {
                    return false;
                }
            } else if (extendedFloatingActionButton.L0 == 2) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.o
        public final void c() {
            super.c();
            this.f44660g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final int d() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void f(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onHidden(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationEnd() {
            this.f44681d.f44677a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.L0 = 0;
            if (this.f44660g) {
                return;
            }
            extendedFloatingActionButton.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationStart(Animator animator) {
            com.google.android.material.floatingactionbutton.a aVar = this.f44681d;
            Animator animator2 = aVar.f44677a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f44677a = animator;
            this.f44660g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.L0 = 1;
        }
    }

    public class i extends com.google.android.material.floatingactionbutton.b {
        public i(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void a() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final boolean b() {
            int i10 = ExtendedFloatingActionButton.Z0;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.L0 != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.L0 == 1) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final int d() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void f(@Nullable OnChangedCallback onChangedCallback) {
            if (onChangedCallback != null) {
                onChangedCallback.onShown(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationEnd() {
            this.f44681d.f44677a = null;
            ExtendedFloatingActionButton.this.L0 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.o
        public final void onAnimationStart(Animator animator) {
            com.google.android.material.floatingactionbutton.a aVar = this.f44681d;
            Animator animator2 = aVar.f44677a;
            if (animator2 != null) {
                animator2.cancel();
            }
            aVar.f44677a = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.L0 = 2;
        }
    }

    public interface j {
        int a();

        ViewGroup.LayoutParams b();

        int c();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    public void addOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.N0.f44680c.add(animatorListener);
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.P0.f44680c.add(animatorListener);
    }

    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.O0.f44680c.add(animatorListener);
    }

    public void addOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.M0.f44680c.add(animatorListener);
    }

    public void extend() {
        j(3, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.T0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        int i10 = this.Q0;
        return i10 < 0 ? (Math.min(ViewCompat.getPaddingStart(this), ViewCompat.getPaddingEnd(this)) * 2) + getIconSize() : i10;
    }

    @Nullable
    public MotionSpec getExtendMotionSpec() {
        return this.N0.f44683f;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.P0.f44683f;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.O0.f44683f;
    }

    @Nullable
    public MotionSpec getShrinkMotionSpec() {
        return this.M0.f44683f;
    }

    public void hide() {
        j(1, null);
    }

    public final boolean isExtended() {
        return this.U0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[LOOP:0: B:37:0x007c->B:39:0x0082, LOOP_END] */
    public final void j(int i10, @Nullable OnChangedCallback onChangedCallback) {
        com.google.android.material.floatingactionbutton.b bVar;
        AnimatorSet animatorSetE;
        Iterator<Animator.AnimatorListener> it;
        ViewGroup.LayoutParams layoutParams;
        if (i10 == 0) {
            bVar = this.O0;
        } else if (i10 == 1) {
            bVar = this.P0;
        } else if (i10 == 2) {
            bVar = this.M0;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException(g0.c("Unknown strategy type: ", i10));
            }
            bVar = this.N0;
        }
        if (bVar.b()) {
            return;
        }
        if (ViewCompat.isLaidOut(this)) {
            if (!isInEditMode()) {
                if (i10 == 2) {
                    layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.X0 = layoutParams.width;
                        this.Y0 = layoutParams.height;
                    } else {
                        this.X0 = getWidth();
                        this.Y0 = getHeight();
                    }
                }
                measure(0, 0);
                animatorSetE = bVar.e();
                animatorSetE.addListener(new b(bVar, onChangedCallback));
                it = bVar.f44680c.iterator();
                while (it.hasNext()) {
                    animatorSetE.addListener(it.next());
                }
                animatorSetE.start();
                return;
            }
        } else if (getVisibility() != 0) {
            if (this.W0) {
                if (!isInEditMode()) {
                    if (i10 == 2) {
                        layoutParams = getLayoutParams();
                        if (layoutParams != null) {
                            this.X0 = layoutParams.width;
                            this.Y0 = layoutParams.height;
                        } else {
                            this.X0 = getWidth();
                            this.Y0 = getHeight();
                        }
                    }
                    measure(0, 0);
                    animatorSetE = bVar.e();
                    animatorSetE.addListener(new b(bVar, onChangedCallback));
                    it = bVar.f44680c.iterator();
                    while (it.hasNext()) {
                        animatorSetE.addListener(it.next());
                    }
                    animatorSetE.start();
                    return;
                }
            }
        } else if (this.W0) {
            if (!isInEditMode()) {
                if (i10 == 2) {
                    layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.X0 = layoutParams.width;
                        this.Y0 = layoutParams.height;
                    } else {
                        this.X0 = getWidth();
                        this.Y0 = getHeight();
                    }
                }
                measure(0, 0);
                animatorSetE = bVar.e();
                animatorSetE.addListener(new b(bVar, onChangedCallback));
                it = bVar.f44680c.iterator();
                while (it.hasNext()) {
                    animatorSetE.addListener(it.next());
                }
                animatorSetE.start();
                return;
            }
        }
        bVar.a();
        bVar.f(onChangedCallback);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.U0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.U0 = false;
            this.M0.a();
        }
    }

    public void removeOnExtendAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.N0.f44680c.remove(animatorListener);
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.P0.f44680c.remove(animatorListener);
    }

    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.O0.f44680c.remove(animatorListener);
    }

    public void removeOnShrinkAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        this.M0.f44680c.remove(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.W0 = z10;
    }

    public void setExtendMotionSpec(@Nullable MotionSpec motionSpec) {
        this.N0.f44683f = motionSpec;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i10) {
        setExtendMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.U0 == z10) {
            return;
        }
        g gVar = z10 ? this.N0 : this.M0;
        if (gVar.b()) {
            return;
        }
        gVar.a();
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.P0.f44683f = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.U0 || this.V0) {
            return;
        }
        this.R0 = ViewCompat.getPaddingStart(this);
        this.S0 = ViewCompat.getPaddingEnd(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.U0 || this.V0) {
            return;
        }
        this.R0 = i10;
        this.S0 = i12;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.O0.f44683f = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    public void setShrinkMotionSpec(@Nullable MotionSpec motionSpec) {
        this.M0.f44683f = motionSpec;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i10) {
        setShrinkMotionSpec(MotionSpec.createFromResource(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.originalTextCsl = getTextColors();
    }

    public void show() {
        j(0, null);
    }

    public void shrink() {
        j(2, null);
    }

    public void silentlyUpdateTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void extend(@NonNull OnChangedCallback onChangedCallback) {
        j(3, onChangedCallback);
    }

    public void hide(@NonNull OnChangedCallback onChangedCallback) {
        j(1, onChangedCallback);
    }

    public void show(@NonNull OnChangedCallback onChangedCallback) {
        j(0, onChangedCallback);
    }

    public void shrink(@NonNull OnChangedCallback onChangedCallback) {
        j(2, onChangedCallback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = Z0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.L0 = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        i iVar = new i(aVar);
        this.O0 = iVar;
        h hVar = new h(aVar);
        this.P0 = hVar;
        this.U0 = true;
        this.V0 = false;
        this.W0 = false;
        Context context2 = getContext();
        this.T0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.ExtendedFloatingActionButton, i10, i11, new int[0]);
        MotionSpec motionSpecCreateFromAttribute = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        MotionSpec motionSpecCreateFromAttribute2 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        MotionSpec motionSpecCreateFromAttribute3 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        MotionSpec motionSpecCreateFromAttribute4 = MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.R0 = ViewCompat.getPaddingStart(this);
        this.S0 = ViewCompat.getPaddingEnd(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        com.google.android.material.floatingactionbutton.d dVar = new com.google.android.material.floatingactionbutton.d(this);
        com.google.android.material.floatingactionbutton.e eVar = new com.google.android.material.floatingactionbutton.e(this, dVar);
        g gVar = new g(aVar2, i12 != 1 ? i12 != 2 ? new com.google.android.material.floatingactionbutton.f(this, eVar, dVar) : eVar : dVar, true);
        this.N0 = gVar;
        g gVar2 = new g(aVar2, new a(), false);
        this.M0 = gVar2;
        iVar.f44683f = motionSpecCreateFromAttribute;
        hVar.f44683f = motionSpecCreateFromAttribute2;
        gVar.f44683f = motionSpecCreateFromAttribute3;
        gVar2.f44683f = motionSpecCreateFromAttribute4;
        typedArrayObtainStyledAttributes.recycle();
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context2, attributeSet, i10, i11, ShapeAppearanceModel.PILL).build());
        this.originalTextCsl = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.originalTextCsl = getTextColors();
    }

    public static abstract class OnChangedCallback {
        public void onExtended(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onHidden(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShown(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void onShrunken(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
}
